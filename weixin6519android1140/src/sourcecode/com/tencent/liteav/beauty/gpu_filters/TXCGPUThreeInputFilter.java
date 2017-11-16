package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class TXCGPUThreeInputFilter
  extends TXCGPUFilter
{
  public static final String VERTEX_THREE_INPUT_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}";
  public int mFilterInputTextureUniform2;
  public int mFilterInputTextureUniform3;
  public int mFilterSecondTextureCoordinateAttribute;
  public int mFilterSourceTexture2 = -1;
  public int mFilterSourceTexture3 = -1;
  public int mFilterThirdTextureCoordinateAttribute;
  private ByteBuffer mTexture2CoordinatesBuffer;
  private ByteBuffer mTexture3CoordinatesBuffer;
  
  public TXCGPUThreeInputFilter(String paramString)
  {
    this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", paramString);
    setRotation(TXCRotation.NORMAL, false, true);
  }
  
  public TXCGPUThreeInputFilter(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    setRotation(TXCRotation.NORMAL, false, true);
  }
  
  protected void onDrawArraysPre()
  {
    GLES20.glEnableVertexAttribArray(this.mFilterSecondTextureCoordinateAttribute);
    GLES20.glActiveTexture(33987);
    GLES20.glBindTexture(3553, this.mFilterSourceTexture2);
    GLES20.glUniform1i(this.mFilterInputTextureUniform2, 3);
    this.mTexture2CoordinatesBuffer.position(0);
    GLES20.glVertexAttribPointer(this.mFilterSecondTextureCoordinateAttribute, 2, 5126, false, 0, this.mTexture2CoordinatesBuffer);
    GLES20.glEnableVertexAttribArray(this.mFilterThirdTextureCoordinateAttribute);
    GLES20.glActiveTexture(33988);
    GLES20.glBindTexture(3553, this.mFilterSourceTexture3);
    GLES20.glUniform1i(this.mFilterInputTextureUniform3, 4);
    this.mTexture3CoordinatesBuffer.position(0);
    GLES20.glVertexAttribPointer(this.mFilterThirdTextureCoordinateAttribute, 2, 5126, false, 0, this.mTexture3CoordinatesBuffer);
  }
  
  public int onDrawFrame(int paramInt1, int paramInt2, int paramInt3)
  {
    this.mFilterSourceTexture2 = paramInt2;
    this.mFilterSourceTexture3 = paramInt3;
    return onDrawFrame(paramInt1);
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    return onDrawToTexture(paramInt1, paramInt2, paramInt3, this.mFrameBuffer, this.mFrameBufferTexture);
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.mFilterSourceTexture2 = paramInt2;
    this.mFilterSourceTexture3 = paramInt3;
    return super.onDrawToTexture(paramInt1, paramInt4, paramInt5);
  }
  
  public boolean onInit()
  {
    super.onInit();
    GLES20.glUseProgram(getProgram());
    this.mFilterSecondTextureCoordinateAttribute = GLES20.glGetAttribLocation(getProgram(), "inputTextureCoordinate2");
    this.mFilterThirdTextureCoordinateAttribute = GLES20.glGetAttribLocation(getProgram(), "inputTextureCoordinate3");
    this.mFilterInputTextureUniform2 = GLES20.glGetUniformLocation(getProgram(), "inputImageTexture2");
    this.mFilterInputTextureUniform3 = GLES20.glGetUniformLocation(getProgram(), "inputImageTexture3");
    GLES20.glEnableVertexAttribArray(this.mFilterSecondTextureCoordinateAttribute);
    if (GLES20.glGetError() == 0) {}
    for (int i = 1;; i = 0)
    {
      GLES20.glEnableVertexAttribArray(this.mFilterThirdTextureCoordinateAttribute);
      if ((i == 0) || (GLES20.glGetError() != 0)) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    super.onOutputSizeChanged(paramInt1, paramInt2);
  }
  
  public void setRotation(TXCRotation paramTXCRotation, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramTXCRotation = TXCTextureRotationUtil.getRotation(paramTXCRotation, paramBoolean1, paramBoolean2);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    FloatBuffer localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramTXCRotation);
    localFloatBuffer.flip();
    this.mTexture2CoordinatesBuffer = localByteBuffer;
    localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramTXCRotation);
    localFloatBuffer.flip();
    this.mTexture3CoordinatesBuffer = localByteBuffer;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUThreeInputFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */