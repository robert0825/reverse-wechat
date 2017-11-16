package com.tencent.liteav.beauty.gpu_filters;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.beauty.TXCVideoPreprocessor.WaterMakeTag;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

public class TXCGPUWatermarkFilter
  extends TXCGPUFilter
{
  private static final float[] TexCoord = { 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F };
  private static final float[] VertexsCoord;
  private static final short[] drawOrder = { 1, 2, 0, 2, 0, 3 };
  private String TAG = "GPUWatermark";
  private ShortBuffer drawOrderBuffer = null;
  private int mBaseMarkOffset = 1;
  private STDrawWaterMark mBaseWaterMark = null;
  private STDrawWaterMark[] mSzWaterMark = null;
  private List<TXCVideoPreprocessor.WaterMakeTag> mWaterMarkList = null;
  private boolean mbDrawWaterMark = false;
  
  static
  {
    VertexsCoord = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
  }
  
  public TXCGPUWatermarkFilter()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(drawOrder.length * 2);
    localByteBuffer.order(ByteOrder.nativeOrder());
    this.drawOrderBuffer = localByteBuffer.asShortBuffer();
    this.drawOrderBuffer.put(drawOrder);
    this.drawOrderBuffer.position(0);
    this.mHasFrameBuffer = true;
  }
  
  private boolean compareWaterMarkList(List<TXCVideoPreprocessor.WaterMakeTag> paramList1, List<TXCVideoPreprocessor.WaterMakeTag> paramList2)
  {
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramList1.size()) {
        break label118;
      }
      TXCVideoPreprocessor.WaterMakeTag localWaterMakeTag1 = (TXCVideoPreprocessor.WaterMakeTag)paramList1.get(i);
      TXCVideoPreprocessor.WaterMakeTag localWaterMakeTag2 = (TXCVideoPreprocessor.WaterMakeTag)paramList2.get(i);
      if ((!localWaterMakeTag1.bitmap.equals(localWaterMakeTag2.bitmap)) || (localWaterMakeTag1.xOffset != localWaterMakeTag2.xOffset) || (localWaterMakeTag1.yOffset != localWaterMakeTag2.yOffset) || (localWaterMakeTag1.fWidth != localWaterMakeTag2.fWidth)) {
        break;
      }
      i += 1;
    }
    label118:
    return true;
  }
  
  private void releaseWaterMark()
  {
    if (this.mSzWaterMark != null)
    {
      int i = 0;
      while (i < this.mSzWaterMark.length)
      {
        if (this.mSzWaterMark[i] != null)
        {
          if (this.mSzWaterMark[i].mWaterMarkTextureID != null) {
            GLES20.glDeleteTextures(1, this.mSzWaterMark[i].mWaterMarkTextureID, 0);
          }
          this.mSzWaterMark[i].mWaterMarkTextureID = null;
          this.mSzWaterMark[i].mBitmapWaterMark = null;
          this.mSzWaterMark[i] = null;
        }
        i += 1;
      }
    }
    this.mSzWaterMark = null;
  }
  
  public void SetWaterMark(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (this.mSzWaterMark == null) {
      this.mSzWaterMark = new STDrawWaterMark[1];
    }
    if (this.mSzWaterMark[0] == null) {
      this.mSzWaterMark[0] = new STDrawWaterMark();
    }
    SetWaterMark(paramBitmap, paramFloat1, paramFloat2, paramFloat3, 0);
    this.mBaseWaterMark = this.mSzWaterMark[0];
  }
  
  public void SetWaterMark(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    if (paramBitmap == null) {
      if ((this.mSzWaterMark != null) && (this.mSzWaterMark[paramInt] != null))
      {
        new StringBuilder("release ").append(paramInt).append(" water mark!");
        if (this.mSzWaterMark[paramInt].mWaterMarkTextureID != null) {
          GLES20.glDeleteTextures(1, this.mSzWaterMark[paramInt].mWaterMarkTextureID, 0);
        }
        this.mSzWaterMark[paramInt].mWaterMarkTextureID = null;
        this.mSzWaterMark[paramInt].mBitmapWaterMark = null;
        this.mSzWaterMark[paramInt] = null;
      }
    }
    while ((this.mSzWaterMark[paramInt] == null) || (paramInt >= this.mSzWaterMark.length)) {
      return;
    }
    Object localObject = ByteBuffer.allocateDirect(VertexsCoord.length * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.mSzWaterMark[paramInt].waterMarkVertexsCoordBuffer = ((ByteBuffer)localObject).asFloatBuffer();
    localObject = new float[VertexsCoord.length];
    int i = paramBitmap.getWidth();
    float f2 = paramBitmap.getHeight() / i * paramFloat3 * this.mOutputWidth / this.mOutputHeight;
    float f1;
    if (paramFloat1 < 0.0F)
    {
      f1 = 0.0F;
      if (paramFloat2 >= 0.0F) {
        break label338;
      }
      paramFloat1 = 0.0F;
    }
    for (;;)
    {
      localObject[0] = (2.0F * f1 - 1.0F);
      localObject[1] = (1.0F - 2.0F * paramFloat1);
      localObject[2] = localObject[0];
      localObject[3] = (localObject[1] - f2 * 2.0F);
      localObject[4] = (localObject[0] + 2.0F * paramFloat3);
      localObject[5] = localObject[3];
      localObject[6] = localObject[4];
      localObject[7] = localObject[1];
      i = 1;
      while (i <= 7)
      {
        localObject[i] *= -1.0F;
        i += 2;
      }
      f1 = paramFloat1;
      if (paramFloat1 <= 1.0F) {
        break;
      }
      f1 = 1.0F;
      break;
      label338:
      paramFloat1 = paramFloat2;
      if (paramFloat2 > 1.0F) {
        paramFloat1 = 1.0F;
      }
    }
    this.mSzWaterMark[paramInt].waterMarkVertexsCoordBuffer.put((float[])localObject);
    this.mSzWaterMark[paramInt].waterMarkVertexsCoordBuffer.position(0);
    localObject = ByteBuffer.allocateDirect(TexCoord.length * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.mSzWaterMark[paramInt].texCoordBuffer = ((ByteBuffer)localObject).asFloatBuffer();
    this.mSzWaterMark[paramInt].texCoordBuffer.put(TexCoord);
    this.mSzWaterMark[paramInt].texCoordBuffer.position(0);
    if (this.mSzWaterMark[paramInt].mWaterMarkTextureID == null)
    {
      this.mSzWaterMark[paramInt].mWaterMarkTextureID = new int[1];
      GLES20.glGenTextures(1, this.mSzWaterMark[paramInt].mWaterMarkTextureID, 0);
      GLES20.glBindTexture(3553, this.mSzWaterMark[paramInt].mWaterMarkTextureID[0]);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
    }
    if ((this.mSzWaterMark[paramInt].mBitmapWaterMark == null) || (!this.mSzWaterMark[paramInt].mBitmapWaterMark.equals(paramBitmap)))
    {
      GLES20.glBindTexture(3553, this.mSzWaterMark[paramInt].mWaterMarkTextureID[0]);
      GLUtils.texImage2D(3553, 0, paramBitmap, 0);
    }
    this.mSzWaterMark[paramInt].mBitmapWaterMark = paramBitmap;
  }
  
  public void destroy()
  {
    super.destroy();
    this.mbDrawWaterMark = false;
    releaseWaterMark();
  }
  
  public void enableWatermark(boolean paramBoolean)
  {
    this.mbDrawWaterMark = paramBoolean;
  }
  
  public void onDraw(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    GLES20.glUseProgram(this.mGLProgId);
    runPendingOnDrawTasks();
    paramFloatBuffer1.position(0);
    GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 0, paramFloatBuffer1);
    GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
    paramFloatBuffer2.position(0);
    GLES20.glVertexAttribPointer(this.mGLAttribTextureCoordinate, 2, 5126, false, 0, paramFloatBuffer2);
    GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoordinate);
    if (paramInt != -1)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, paramInt);
      GLES20.glUniform1i(this.mGLUniformTexture, 0);
      onDrawArraysPre();
      GLES20.glDrawArrays(5, 0, 4);
    }
    GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
    GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoordinate);
    if (this.mbDrawWaterMark)
    {
      GLES20.glEnable(3042);
      GLES20.glBlendFunc(770, 771);
      GLES20.glActiveTexture(33984);
      paramInt = 0;
      while (paramInt < this.mSzWaterMark.length)
      {
        if (this.mSzWaterMark[paramInt] != null)
        {
          GLES20.glBindTexture(3553, this.mSzWaterMark[paramInt].mWaterMarkTextureID[0]);
          GLES20.glUniform1i(this.mGLUniformTexture, 0);
          GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 8, this.mSzWaterMark[paramInt].waterMarkVertexsCoordBuffer);
          GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
          GLES20.glVertexAttribPointer(this.mGLAttribTextureCoordinate, 4, 5126, false, 16, this.mSzWaterMark[paramInt].texCoordBuffer);
          GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoordinate);
          GLES20.glDrawElements(4, drawOrder.length, 5123, this.drawOrderBuffer);
          GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
          GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoordinate);
        }
        paramInt += 1;
      }
      GLES20.glDisable(3042);
    }
    GLES20.glBindTexture(3553, 0);
  }
  
  public void setWaterMarkList(List<TXCVideoPreprocessor.WaterMakeTag> paramList)
  {
    if ((this.mWaterMarkList != null) && (compareWaterMarkList(this.mWaterMarkList, paramList))) {}
    for (;;)
    {
      return;
      this.mWaterMarkList = paramList;
      this.mSzWaterMark = new STDrawWaterMark[paramList.size() + this.mBaseMarkOffset];
      this.mSzWaterMark[0] = this.mBaseWaterMark;
      int i = 0;
      while (i < paramList.size())
      {
        TXCVideoPreprocessor.WaterMakeTag localWaterMakeTag = (TXCVideoPreprocessor.WaterMakeTag)paramList.get(i);
        if (localWaterMakeTag != null)
        {
          this.mSzWaterMark[(this.mBaseMarkOffset + i)] = new STDrawWaterMark();
          SetWaterMark(localWaterMakeTag.bitmap, localWaterMakeTag.xOffset, localWaterMakeTag.yOffset, localWaterMakeTag.fWidth, i + this.mBaseMarkOffset);
        }
        i += 1;
      }
    }
  }
  
  private class STDrawWaterMark
  {
    public Bitmap mBitmapWaterMark;
    public int[] mWaterMarkTextureID = null;
    public FloatBuffer texCoordBuffer = null;
    public FloatBuffer waterMarkVertexsCoordBuffer = null;
    
    public STDrawWaterMark() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUWatermarkFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */