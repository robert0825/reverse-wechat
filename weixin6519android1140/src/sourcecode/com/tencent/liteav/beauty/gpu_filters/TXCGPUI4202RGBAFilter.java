package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.beauty.NativeLoad;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class TXCGPUI4202RGBAFilter
  extends TXCGPUFilter
{
  private static String TAG = "YUV420pToRGBFilter";
  private int[] UVtexture = null;
  private int[] Ytexture = null;
  private int mDataFormat = 1;
  private int[] mGLTextureId = null;
  private byte[] mRenderdByte = null;
  private ByteBuffer mYUVBuffer = null;
  private int uUVTextureMain = 0;
  private int uYTextureMain = 0;
  
  public TXCGPUI4202RGBAFilter(int paramInt)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    this.mDataFormat = paramInt;
    TXCLog.i(TAG, "yuv Type " + paramInt);
  }
  
  private int drawRGBAToTextre()
  {
    GLES20.glBindTexture(3553, this.mGLTextureId[0]);
    if (this.mRenderdByte != null)
    {
      NativeLoad.getInstance();
      NativeLoad.nativeglTexImage2D(3553, 0, 6408, this.mOutputWidth, this.mOutputHeight, 0, 6408, 5121, this.mRenderdByte, 0);
    }
    return this.mGLTextureId[0];
  }
  
  public boolean init()
  {
    int i = 7;
    if (this.mDataFormat == 1)
    {
      NativeLoad.getInstance();
      this.mGLProgId = NativeLoad.nativeLoadGLProgram(i);
      if ((this.mGLProgId == 0) || (!onInit())) {
        break label106;
      }
    }
    label106:
    for (this.mIsInitialized = true;; this.mIsInitialized = false)
    {
      onInitialized();
      return this.mIsInitialized;
      if (this.mDataFormat == 3)
      {
        i = 9;
        break;
      }
      if (this.mDataFormat == 2) {
        return super.init();
      }
      TXCLog.e(TAG, "don't support yuv format " + this.mDataFormat);
      break;
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if ((this.Ytexture != null) && (this.Ytexture[0] > 0))
    {
      GLES20.glDeleteTextures(1, this.Ytexture, 0);
      this.Ytexture = null;
    }
    if ((this.UVtexture != null) && (this.UVtexture[0] > 0))
    {
      GLES20.glDeleteTextures(1, this.UVtexture, 0);
      this.UVtexture = null;
    }
  }
  
  public void onDraw(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    super.onDraw(-1, paramFloatBuffer1, paramFloatBuffer2);
  }
  
  protected void onDrawArraysPre()
  {
    super.onDrawArraysPre();
    if (1 == this.mDataFormat)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.Ytexture[0]);
      GLES20.glUniform1i(this.mGLUniformTexture, 0);
      NativeLoad.getInstance();
      NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.mOutputWidth, this.mOutputHeight * 3 / 2, 0, 6409, 5121, this.mRenderdByte, 0);
    }
    do
    {
      return;
      if (3 == this.mDataFormat)
      {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.Ytexture[0]);
        GLES20.glUniform1i(this.uYTextureMain, 0);
        NativeLoad.getInstance();
        NativeLoad.nativeglTexImage2D(3553, 0, 6409, this.mOutputWidth, this.mOutputHeight, 0, 6409, 5121, this.mRenderdByte, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.UVtexture[0]);
        GLES20.glUniform1i(this.uUVTextureMain, 1);
        NativeLoad.getInstance();
        int i = this.mOutputWidth / 2;
        int j = this.mOutputHeight / 2;
        byte[] arrayOfByte = this.mRenderdByte;
        int k = this.mOutputWidth;
        NativeLoad.nativeglTexImage2D(3553, 0, 6410, i, j, 0, 6410, 5121, arrayOfByte, this.mOutputHeight * k);
        return;
      }
    } while (2 != this.mDataFormat);
    drawRGBAToTextre();
  }
  
  public int onDrawToTexture()
  {
    if (2 == this.mDataFormat)
    {
      int i = drawRGBAToTextre();
      GLES20.glBindTexture(3553, 0);
      return i;
    }
    return super.onDrawToTexture(-1);
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    if ((this.mOutputHeight == paramInt2) && (this.mOutputWidth == paramInt1)) {
      return;
    }
    if (1 == this.mDataFormat)
    {
      this.Ytexture = new int[1];
      this.Ytexture[0] = TXCOpenGlUtils.createTexture(paramInt1, paramInt2 * 3 / 2, 6409, 6409, this.Ytexture);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.Ytexture[0]);
      GLES20.glBindTexture(3553, 0);
      GLES20.glUniform1i(this.mGLUniformTexture, 0);
    }
    for (;;)
    {
      super.onOutputSizeChanged(paramInt1, paramInt2);
      return;
      if (3 == this.mDataFormat)
      {
        GLES20.glActiveTexture(33984);
        GLES20.glActiveTexture(33985);
        this.uYTextureMain = GLES20.glGetUniformLocation(getProgram(), "yTexture");
        this.uUVTextureMain = GLES20.glGetUniformLocation(getProgram(), "uvTexture");
        if (this.Ytexture == null)
        {
          this.Ytexture = new int[1];
          this.Ytexture[0] = TXCOpenGlUtils.createTexture(paramInt1, paramInt2, 6409, 6409, this.Ytexture);
        }
        if (this.UVtexture == null)
        {
          this.UVtexture = new int[1];
          this.UVtexture[0] = TXCOpenGlUtils.createTexture(paramInt1 / 2, paramInt2 / 2, 6410, 6410, this.UVtexture);
        }
        GLES20.glUniform1i(this.uYTextureMain, 0);
        GLES20.glUniform1i(this.uUVTextureMain, 1);
      }
      else if ((2 == this.mDataFormat) && (this.mGLTextureId == null))
      {
        this.mGLTextureId = new int[1];
        this.mGLTextureId[0] = TXCOpenGlUtils.createTexture(paramInt1, paramInt2, 6408, 6408, this.mGLTextureId);
      }
    }
  }
  
  public void setRenderBuffer(byte[] paramArrayOfByte)
  {
    this.mRenderdByte = paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUI4202RGBAFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */