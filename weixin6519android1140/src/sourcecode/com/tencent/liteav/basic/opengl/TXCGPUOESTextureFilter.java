package com.tencent.liteav.basic.opengl;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class TXCGPUOESTextureFilter
  extends TXCGPUFilter
{
  public static final String CAMERA_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
  public static final String CAMERA_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}";
  public boolean mClearFlag = false;
  private float[] mTextureTransformMatrix = new float[16];
  private int mTextureTransformMatrixLocation;
  
  public TXCGPUOESTextureFilter()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    this.mHasFrameBuffer = true;
  }
  
  public void onDraw(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    GLES20.glUseProgram(this.mGLProgId);
    runPendingOnDrawTasks();
    if ((!isInitialized()) || (this.mTextureTransformMatrix == null)) {
      return;
    }
    paramFloatBuffer1.position(0);
    GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 0, paramFloatBuffer1);
    GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
    paramFloatBuffer2.position(0);
    GLES20.glVertexAttribPointer(this.mGLAttribTextureCoordinate, 2, 5126, false, 0, paramFloatBuffer2);
    GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoordinate);
    GLES20.glUniformMatrix4fv(this.mTextureTransformMatrixLocation, 1, false, this.mTextureTransformMatrix, 0);
    if (paramInt != -1)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(36197, paramInt);
      GLES20.glUniform1i(this.mGLUniformTexture, 0);
    }
    GLES20.glDrawArrays(5, 0, 4);
    GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
    GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoordinate);
    GLES20.glBindTexture(36197, 0);
  }
  
  public boolean onInit()
  {
    boolean bool = super.onInit();
    this.mTextureTransformMatrixLocation = GLES20.glGetUniformLocation(this.mGLProgId, "textureTransform");
    return (bool) && (GLES20.glGetError() == 0);
  }
  
  public void onInputSizeChanged(int paramInt1, int paramInt2)
  {
    super.onInputSizeChanged(paramInt1, paramInt2);
  }
  
  public void setTextureTransformMatrix(float[] paramArrayOfFloat)
  {
    this.mTextureTransformMatrix = paramArrayOfFloat;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\opengl\TXCGPUOESTextureFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */