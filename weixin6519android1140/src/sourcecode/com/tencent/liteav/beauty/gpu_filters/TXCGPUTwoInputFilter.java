package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class TXCGPUTwoInputFilter
  extends TXCGPUFilter
{
  private static final String VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}";
  public int mFilterInputTextureUniform2;
  public int mFilterSecondTextureCoordinateAttribute;
  public int mFilterSourceTexture2 = -1;
  private ByteBuffer mTexture2CoordinatesBuffer;
  
  public TXCGPUTwoInputFilter(String paramString)
  {
    this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", paramString);
  }
  
  public TXCGPUTwoInputFilter(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    setRotation(TXCRotation.NORMAL, false, true);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onDrawArraysPre()
  {
    GLES20.glEnableVertexAttribArray(this.mFilterSecondTextureCoordinateAttribute);
    GLES20.glActiveTexture(33987);
    GLES20.glBindTexture(3553, this.mFilterSourceTexture2);
    GLES20.glUniform1i(this.mFilterInputTextureUniform2, 3);
    this.mTexture2CoordinatesBuffer.position(0);
    GLES20.glVertexAttribPointer(this.mFilterSecondTextureCoordinateAttribute, 2, 5126, false, 0, this.mTexture2CoordinatesBuffer);
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2)
  {
    this.mFilterSourceTexture2 = paramInt2;
    return onDrawToTexture(paramInt1, this.mFrameBuffer, this.mFrameBufferTexture);
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mFilterSourceTexture2 = paramInt2;
    return onDrawToTexture(paramInt1, paramInt3, paramInt4);
  }
  
  public boolean onInit()
  {
    boolean bool = super.onInit();
    if (bool)
    {
      this.mFilterSecondTextureCoordinateAttribute = GLES20.glGetAttribLocation(getProgram(), "inputTextureCoordinate2");
      this.mFilterInputTextureUniform2 = GLES20.glGetUniformLocation(getProgram(), "inputImageTexture2");
      GLES20.glEnableVertexAttribArray(this.mFilterSecondTextureCoordinateAttribute);
    }
    return (bool) && (GLES20.glGetError() == 0);
  }
  
  public void setRotation(TXCRotation paramTXCRotation, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramTXCRotation = TXCTextureRotationUtil.getRotation(paramTXCRotation, paramBoolean1, paramBoolean2);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    FloatBuffer localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramTXCRotation);
    localFloatBuffer.flip();
    this.mTexture2CoordinatesBuffer = localByteBuffer;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUTwoInputFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */