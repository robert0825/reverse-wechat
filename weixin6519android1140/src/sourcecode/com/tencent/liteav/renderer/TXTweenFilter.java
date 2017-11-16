package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class TXTweenFilter
{
  private static final int FLOAT_SIZE_BYTES = 4;
  public static final String FRAGMENT_SHADER_NORMALTEX = "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}";
  private static final String FRAGMENT_SHADER_OESTEX = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
  private static final int INVALID_TEXTURE_ID = -12345;
  public static int PREVIEW_RENDER_MODE_FILL_EDGE = 2;
  public static int PREVIEW_RENDER_MODE_FILL_SCREEN = 1;
  private static final String TAG = "TXTweenFilter";
  private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
  private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
  private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
  private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
  private int mFrameBufferID = 53191;
  private int mFrameBufferTextureID = 53191;
  private int mInputHeight = 0;
  private int mInputWidth = 0;
  private boolean mIsMirror = false;
  private boolean mIsOESTexture = true;
  private float[] mMVPMatrix = new float[16];
  private float[] mModeMatrix = new float[16];
  private boolean mNeedReLoadFrameBuffer = false;
  private float mOrthoX = 1.0F;
  private float mOrthoY = 1.0F;
  private int mOutputHeight = 0;
  private int mOutputWidth = 0;
  private int mProgram;
  private float[] mProjectionMatrix = new float[16];
  private int mRenderMode = PREVIEW_RENDER_MODE_FILL_EDGE;
  private int mRotation = 0;
  private float[] mSTMatrix = new float[16];
  private FloatBuffer mTriangleVertices;
  private final float[] mTriangleVerticesData = { -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F };
  private int maPositionHandle;
  private int maTextureHandle;
  private int muMVPMatrixHandle;
  private int muSTMatrixHandle;
  
  public TXTweenFilter(Boolean paramBoolean)
  {
    this.mIsOESTexture = paramBoolean.booleanValue();
    this.mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mTriangleVertices.put(this.mTriangleVerticesData).position(0);
    Matrix.setIdentityM(this.mSTMatrix, 0);
  }
  
  private void checkGlError(String paramString)
  {
    int i = GLES20.glGetError();
    if (i != 0)
    {
      TXCLog.e("TXTweenFilter", paramString + ": glError " + i);
      throw new RuntimeException(paramString + ": glError " + i);
    }
  }
  
  private int createProgram(String paramString1, String paramString2)
  {
    int i = loadShader(35633, paramString1);
    if (i == 0) {}
    int j;
    do
    {
      return 0;
      j = loadShader(35632, paramString2);
    } while (j == 0);
    int k = GLES20.glCreateProgram();
    checkGlError("glCreateProgram");
    if (k == 0) {
      TXCLog.e("TXTweenFilter", "Could not create program");
    }
    GLES20.glAttachShader(k, i);
    checkGlError("glAttachShader");
    GLES20.glAttachShader(k, j);
    checkGlError("glAttachShader");
    GLES20.glLinkProgram(k);
    paramString1 = new int[1];
    GLES20.glGetProgramiv(k, 35714, paramString1, 0);
    if (paramString1[0] != 1)
    {
      TXCLog.e("TXTweenFilter", "Could not link program: ");
      TXCLog.e("TXTweenFilter", GLES20.glGetProgramInfoLog(k));
      GLES20.glDeleteProgram(k);
      return 0;
    }
    return k;
  }
  
  private void destroyFrameBuffer()
  {
    if (this.mFrameBufferID != 53191)
    {
      GLES20.glDeleteFramebuffers(1, new int[] { this.mFrameBufferID }, 0);
      this.mFrameBufferID = 53191;
    }
    if (this.mFrameBufferTextureID != 53191)
    {
      GLES20.glDeleteTextures(1, new int[] { this.mFrameBufferTextureID }, 0);
      this.mFrameBufferTextureID = 53191;
    }
  }
  
  private void fill(float[] paramArrayOfFloat)
  {
    if ((this.mOutputHeight == 0) || (this.mOutputWidth == 0)) {
      return;
    }
    int j = this.mInputWidth;
    int i = this.mInputHeight;
    if ((this.mRotation == 270) || (this.mRotation == 90))
    {
      j = this.mInputHeight;
      i = this.mInputWidth;
    }
    float f2 = this.mOutputWidth * 1.0F / j;
    float f1 = this.mOutputHeight * 1.0F / i;
    if (this.mRenderMode == PREVIEW_RENDER_MODE_FILL_SCREEN)
    {
      if (i * f2 > this.mOutputHeight) {
        break label226;
      }
      Matrix.setIdentityM(this.mModeMatrix, 0);
      if (this.mIsMirror)
      {
        if (this.mRotation % 180 != 0) {
          break label231;
        }
        Matrix.scaleM(this.mModeMatrix, 0, -1.0F, 1.0F, 1.0F);
      }
    }
    for (;;)
    {
      Matrix.scaleM(this.mModeMatrix, 0, j * f1 / this.mOutputWidth * 1.0F, i * f1 / this.mOutputHeight * 1.0F, 1.0F);
      Matrix.rotateM(this.mModeMatrix, 0, this.mRotation, 0.0F, 0.0F, -1.0F);
      Matrix.multiplyMM(paramArrayOfFloat, 0, this.mProjectionMatrix, 0, this.mModeMatrix, 0);
      return;
      if (i * f2 > this.mOutputHeight) {
        break;
      }
      label226:
      f1 = f2;
      break;
      label231:
      Matrix.scaleM(this.mModeMatrix, 0, 1.0F, -1.0F, 1.0F);
    }
  }
  
  private int loadShader(int paramInt, String paramString)
  {
    int i = GLES20.glCreateShader(paramInt);
    checkGlError("glCreateShader type=" + paramInt);
    GLES20.glShaderSource(i, paramString);
    GLES20.glCompileShader(i);
    paramString = new int[1];
    GLES20.glGetShaderiv(i, 35713, paramString, 0);
    if (paramString[0] == 0)
    {
      TXCLog.e("TXTweenFilter", "Could not compile shader " + paramInt + ":");
      TXCLog.e("TXTweenFilter", " " + GLES20.glGetShaderInfoLog(i));
      GLES20.glDeleteShader(i);
      return 0;
    }
    return i;
  }
  
  private void reloadFrameBuffer()
  {
    if (!this.mNeedReLoadFrameBuffer) {
      return;
    }
    TXCLog.d("TXTweenFilter", "reloadFrameBuffer. size = " + this.mOutputWidth + "*" + this.mOutputHeight);
    destroyFrameBuffer();
    int[] arrayOfInt1 = new int[1];
    int[] arrayOfInt2 = new int[1];
    GLES20.glGenTextures(1, arrayOfInt1, 0);
    GLES20.glGenFramebuffers(1, arrayOfInt2, 0);
    this.mFrameBufferTextureID = arrayOfInt1[0];
    this.mFrameBufferID = arrayOfInt2[0];
    TXCLog.d("TXTweenFilter", "frameBuffer id = " + this.mFrameBufferID + ", texture id = " + this.mFrameBufferTextureID);
    GLES20.glBindTexture(3553, this.mFrameBufferTextureID);
    checkGlError("glBindTexture mFrameBufferTextureID");
    GLES20.glTexImage2D(3553, 0, 6408, this.mOutputWidth, this.mOutputHeight, 0, 6408, 5121, null);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    checkGlError("glTexParameter");
    GLES20.glBindFramebuffer(36160, this.mFrameBufferID);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mFrameBufferTextureID, 0);
    GLES20.glBindTexture(3553, 0);
    GLES20.glBindFramebuffer(36160, 0);
    this.mNeedReLoadFrameBuffer = false;
  }
  
  public void create()
  {
    if (this.mIsOESTexture) {}
    for (this.mProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"); this.mProgram == 0; this.mProgram = createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}")) {
      throw new RuntimeException("failed creating program");
    }
    this.maPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
    checkGlError("glGetAttribLocation aPosition");
    if (this.maPositionHandle == -1) {
      throw new RuntimeException("Could not get attrib location for aPosition");
    }
    this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
    checkGlError("glGetAttribLocation aTextureCoord");
    if (this.maTextureHandle == -1) {
      throw new RuntimeException("Could not get attrib location for aTextureCoord");
    }
    this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
    checkGlError("glGetUniformLocation uMVPMatrix");
    if (this.muMVPMatrixHandle == -1) {
      throw new RuntimeException("Could not get attrib location for uMVPMatrix");
    }
    this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
    checkGlError("glGetUniformLocation uSTMatrix");
    if (this.muSTMatrixHandle == -1) {
      throw new RuntimeException("Could not get attrib location for uSTMatrix");
    }
  }
  
  public void destroy()
  {
    GLES20.glDeleteProgram(this.mProgram);
    destroyFrameBuffer();
  }
  
  public void onDraw(int paramInt)
  {
    GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glClear(16640);
    GLES20.glUseProgram(this.mProgram);
    checkGlError("glUseProgram");
    if (this.mIsOESTexture)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(36197, paramInt);
    }
    for (;;)
    {
      this.mTriangleVertices.position(0);
      GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 20, this.mTriangleVertices);
      checkGlError("glVertexAttribPointer maPosition");
      GLES20.glEnableVertexAttribArray(this.maPositionHandle);
      checkGlError("glEnableVertexAttribArray maPositionHandle");
      this.mTriangleVertices.position(3);
      GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 20, this.mTriangleVertices);
      checkGlError("glVertexAttribPointer maTextureHandle");
      GLES20.glEnableVertexAttribArray(this.maTextureHandle);
      checkGlError("glEnableVertexAttribArray maTextureHandle");
      Matrix.setIdentityM(this.mMVPMatrix, 0);
      fill(this.mMVPMatrix);
      GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
      GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
      checkGlError("glDrawArrays");
      GLES20.glDrawArrays(5, 0, 4);
      checkGlError("glDrawArrays");
      if (!this.mIsOESTexture) {
        break;
      }
      GLES20.glBindTexture(36197, 0);
      return;
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, paramInt);
    }
    GLES20.glBindTexture(3553, 0);
  }
  
  public int onDrawToTexture(int paramInt)
  {
    reloadFrameBuffer();
    if (this.mFrameBufferID == 53191)
    {
      TXCLog.d("TXTweenFilter", "invalid frame buffer id");
      return paramInt;
    }
    GLES20.glBindFramebuffer(36160, this.mFrameBufferID);
    onDraw(paramInt);
    GLES20.glBindFramebuffer(36160, 0);
    return this.mFrameBufferTextureID;
  }
  
  public void setInputResolution(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.mInputWidth) && (paramInt2 == this.mInputHeight)) {
      return;
    }
    TXCLog.d("TXTweenFilter", "Input resolution change: " + this.mInputWidth + "*" + this.mInputHeight + " -> " + paramInt1 + "*" + paramInt2);
    this.mInputWidth = paramInt1;
    this.mInputHeight = paramInt2;
  }
  
  public void setMatrix(float[] paramArrayOfFloat)
  {
    this.mSTMatrix = paramArrayOfFloat;
  }
  
  public void setOutputResolution(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.mOutputWidth) && (paramInt2 == this.mOutputHeight)) {
      return;
    }
    TXCLog.d("TXTweenFilter", "Output resolution change: " + this.mOutputWidth + "*" + this.mOutputHeight + " -> " + paramInt1 + "*" + paramInt2);
    this.mOutputWidth = paramInt1;
    this.mOutputHeight = paramInt2;
    Matrix.orthoM(this.mProjectionMatrix, 0, -1.0F, 1.0F, -1.0F, 1.0F, -1.0F, 1.0F);
    this.mOrthoX = 1.0F;
    this.mOrthoY = 1.0F;
    this.mNeedReLoadFrameBuffer = true;
  }
  
  public void setRenderMode(int paramInt)
  {
    this.mRenderMode = paramInt;
  }
  
  public void setRotation(int paramInt)
  {
    this.mRotation = paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXTweenFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */