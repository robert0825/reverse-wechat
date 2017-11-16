package com.tencent.liteav.basic.opengl;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.PointF;
import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Scanner;

public class TXCGPUFilter
{
  public static final boolean DEBUG_MODE = false;
  public static final String NO_FILTER_FRAGMENT_SHADER = "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
  public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}";
  private String TAG = "TXCGPUFilter";
  protected float[] mCurrentTextureMatrix;
  protected float[] mCurrentVertexMatrix;
  private final String mFragmentShader;
  public int mFrameBuffer = -1;
  public int mFrameBufferTexture = -1;
  public int mGLAttribPosition;
  public int mGLAttribTextureCoordinate;
  protected FloatBuffer mGLCubeBuffer;
  public int mGLProgId;
  protected FloatBuffer mGLTextureBuffer;
  public int mGLUniformTexture;
  public boolean mHasFrameBuffer = false;
  private boolean mHasListener = false;
  protected int mIntputHeight;
  protected int mIntputWidth;
  public boolean mIsInitialized;
  protected OnFilterListener mListener;
  public int mOutputHeight;
  public int mOutputWidth;
  private final LinkedList<Runnable> mRunOnDraw = new LinkedList();
  private float[] mTextureTransformMatrix = null;
  private int mTextureTransformMatrixLocation = -1;
  private final String mVertexShader;
  protected boolean mbExtTextureModle = false;
  protected boolean mbNearestMode = false;
  
  public TXCGPUFilter()
  {
    this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
  }
  
  public TXCGPUFilter(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, false);
  }
  
  public TXCGPUFilter(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.mVertexShader = paramString1;
    this.mFragmentShader = paramString2;
    this.mbExtTextureModle = paramBoolean;
    if (true == paramBoolean) {
      TXCLog.i(this.TAG, "set Oes fileter");
    }
    this.mGLCubeBuffer = ByteBuffer.allocateDirect(TXCTextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mCurrentVertexMatrix = TXCTextureRotationUtil.CUBE;
    this.mGLCubeBuffer.put(this.mCurrentVertexMatrix).position(0);
    this.mGLTextureBuffer = ByteBuffer.allocateDirect(TXCTextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mCurrentTextureMatrix = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);
    this.mGLTextureBuffer.put(this.mCurrentTextureMatrix).position(0);
  }
  
  public static String convertStreamToString(InputStream paramInputStream)
  {
    paramInputStream = new Scanner(paramInputStream).useDelimiter("\\A");
    if (paramInputStream.hasNext()) {
      return paramInputStream.next();
    }
    return "";
  }
  
  public static Bitmap drawTextureToBitmap(int paramInt1, int paramInt2, int paramInt3)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt2, paramInt3, Bitmap.Config.ARGB_8888);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramInt2 * paramInt3 * 4).order(ByteOrder.nativeOrder());
    localByteBuffer.position(0);
    TXCGPUFilter localTXCGPUFilter = new TXCGPUFilter();
    localTXCGPUFilter.init();
    GLES20.glViewport(0, 0, paramInt2, paramInt3);
    localTXCGPUFilter.onDrawFrame(paramInt1);
    GLES20.glReadPixels(0, 0, paramInt2, paramInt3, 6408, 5121, localByteBuffer);
    localBitmap.copyPixelsFromBuffer(localByteBuffer);
    localTXCGPUFilter.destroy();
    return localBitmap;
  }
  
  private static float[] floatBuffer2Array(FloatBuffer paramFloatBuffer)
  {
    if (paramFloatBuffer.limit() <= 0) {
      return null;
    }
    float[] arrayOfFloat = new float[paramFloatBuffer.limit()];
    int i = 0;
    while (i < paramFloatBuffer.limit())
    {
      arrayOfFloat[i] = paramFloatBuffer.get(i);
      i += 1;
    }
    return arrayOfFloat;
  }
  
  public static String loadShader(String paramString, Context paramContext)
  {
    try
    {
      paramString = paramContext.getAssets().open(paramString);
      paramContext = convertStreamToString(paramString);
      paramString.close();
      return paramContext;
    }
    catch (Exception paramString) {}
    return "";
  }
  
  public static void rotate(int paramInt, FloatBuffer paramFloatBuffer)
  {
    if (paramFloatBuffer == null) {}
    for (float[] arrayOfFloat = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);; arrayOfFloat = floatBuffer2Array(paramFloatBuffer))
    {
      int i = paramInt / 90;
      paramInt = 0;
      while (paramInt < i)
      {
        float f1 = arrayOfFloat[0];
        float f2 = arrayOfFloat[1];
        arrayOfFloat[0] = arrayOfFloat[2];
        arrayOfFloat[1] = arrayOfFloat[3];
        arrayOfFloat[2] = arrayOfFloat[6];
        arrayOfFloat[3] = arrayOfFloat[7];
        arrayOfFloat[6] = arrayOfFloat[4];
        arrayOfFloat[7] = arrayOfFloat[5];
        arrayOfFloat[4] = f1;
        arrayOfFloat[5] = f2;
        paramInt += 1;
      }
    }
    if (paramFloatBuffer != null) {
      paramFloatBuffer.put(arrayOfFloat);
    }
  }
  
  public void adjustOutputWHRatio(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, boolean paramBoolean)
  {
    double d1 = paramInt2 / paramInt1;
    double d2 = paramInt4 / paramInt3;
    float f2;
    float f1;
    if (d1 < d2)
    {
      paramInt3 = paramInt2 * paramInt3 / paramInt4;
      paramInt4 = paramInt2;
      paramFloatBuffer = floatBuffer2Array(paramFloatBuffer);
      f2 = paramInt3 / paramInt1;
      f1 = paramInt4 / paramInt2;
      f2 = (1.0F - f2) / 2.0F;
      f1 = (1.0F - f1) / 2.0F;
      if (!paramBoolean) {
        break label221;
      }
      paramInt1 = 0;
      label78:
      if (paramInt1 >= paramFloatBuffer.length / 2) {
        break label337;
      }
      if (paramFloatBuffer[(paramInt1 * 2)] >= 0.5F) {
        break label183;
      }
      paramInt2 = paramInt1 * 2;
      paramFloatBuffer[paramInt2] += f1;
      label115:
      if (paramFloatBuffer[(paramInt1 * 2 + 1)] >= 0.5F) {
        break label201;
      }
      paramInt2 = paramInt1 * 2 + 1;
      paramFloatBuffer[paramInt2] += f2;
    }
    for (;;)
    {
      paramInt1 += 1;
      break label78;
      if (d1 > d2)
      {
        paramInt4 = paramInt1 * paramInt4 / paramInt3;
        paramInt3 = paramInt1;
        break;
      }
      paramInt3 = paramInt1;
      paramInt4 = paramInt2;
      break;
      label183:
      paramInt2 = paramInt1 * 2;
      paramFloatBuffer[paramInt2] -= f1;
      break label115;
      label201:
      paramInt2 = paramInt1 * 2 + 1;
      paramFloatBuffer[paramInt2] -= f2;
    }
    label221:
    paramInt1 = 0;
    if (paramInt1 < paramFloatBuffer.length / 2)
    {
      if (paramFloatBuffer[(paramInt1 * 2)] < 0.5F)
      {
        paramInt2 = paramInt1 * 2;
        paramFloatBuffer[paramInt2] += f2;
        label260:
        if (paramFloatBuffer[(paramInt1 * 2 + 1)] >= 0.5F) {
          break label317;
        }
        paramInt2 = paramInt1 * 2 + 1;
        paramFloatBuffer[paramInt2] += f1;
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        paramInt2 = paramInt1 * 2;
        paramFloatBuffer[paramInt2] -= f2;
        break label260;
        label317:
        paramInt2 = paramInt1 * 2 + 1;
        paramFloatBuffer[paramInt2] -= f1;
      }
    }
    label337:
    setAttribPointer((float[])TXCTextureRotationUtil.CUBE.clone(), paramFloatBuffer);
  }
  
  public void adjustOutputWHRatio(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FloatBuffer paramFloatBuffer, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    double d1 = paramInt2 / paramInt1;
    double d2 = paramInt4 / paramInt3;
    float f2;
    float f1;
    if (d1 < d2)
    {
      paramInt3 = paramInt2 * paramInt3 / paramInt4;
      paramInt4 = paramInt2;
      paramFloatBuffer = floatBuffer2Array(paramFloatBuffer);
      f2 = paramInt3 / paramInt1;
      f1 = paramInt4 / paramInt2;
      f2 = (1.0F - f2) / 2.0F;
      f1 = (1.0F - f1) / 2.0F;
      if (!paramBoolean1) {
        break label221;
      }
      paramInt1 = 0;
      label78:
      if (paramInt1 >= paramFloatBuffer.length / 2) {
        break label337;
      }
      if (paramFloatBuffer[(paramInt1 * 2)] >= 0.5F) {
        break label183;
      }
      paramInt2 = paramInt1 * 2;
      paramFloatBuffer[paramInt2] += f1;
      label115:
      if (paramFloatBuffer[(paramInt1 * 2 + 1)] >= 0.5F) {
        break label201;
      }
      paramInt2 = paramInt1 * 2 + 1;
      paramFloatBuffer[paramInt2] += f2;
    }
    for (;;)
    {
      paramInt1 += 1;
      break label78;
      if (d1 > d2)
      {
        paramInt4 = paramInt1 * paramInt4 / paramInt3;
        paramInt3 = paramInt1;
        break;
      }
      paramInt3 = paramInt1;
      paramInt4 = paramInt2;
      break;
      label183:
      paramInt2 = paramInt1 * 2;
      paramFloatBuffer[paramInt2] -= f1;
      break label115;
      label201:
      paramInt2 = paramInt1 * 2 + 1;
      paramFloatBuffer[paramInt2] -= f2;
    }
    label221:
    paramInt1 = 0;
    if (paramInt1 < paramFloatBuffer.length / 2)
    {
      if (paramFloatBuffer[(paramInt1 * 2)] < 0.5F)
      {
        paramInt2 = paramInt1 * 2;
        paramFloatBuffer[paramInt2] += f2;
        label260:
        if (paramFloatBuffer[(paramInt1 * 2 + 1)] >= 0.5F) {
          break label317;
        }
        paramInt2 = paramInt1 * 2 + 1;
        paramFloatBuffer[paramInt2] += f1;
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        paramInt2 = paramInt1 * 2;
        paramFloatBuffer[paramInt2] -= f2;
        break label260;
        label317:
        paramInt2 = paramInt1 * 2 + 1;
        paramFloatBuffer[paramInt2] -= f1;
      }
    }
    label337:
    if (paramBoolean2)
    {
      paramFloatBuffer[0] = (1.0F - paramFloatBuffer[0]);
      paramFloatBuffer[2] = (1.0F - paramFloatBuffer[2]);
      paramFloatBuffer[4] = (1.0F - paramFloatBuffer[4]);
      paramFloatBuffer[6] = (1.0F - paramFloatBuffer[6]);
    }
    if (paramBoolean3)
    {
      paramFloatBuffer[1] = (1.0F - paramFloatBuffer[1]);
      paramFloatBuffer[3] = (1.0F - paramFloatBuffer[3]);
      paramFloatBuffer[5] = (1.0F - paramFloatBuffer[5]);
      paramFloatBuffer[7] = (1.0F - paramFloatBuffer[7]);
    }
    setAttribPointer((float[])TXCTextureRotationUtil.CUBE.clone(), paramFloatBuffer);
  }
  
  public void checkGlError(String paramString)
  {
    int i = GLES20.glGetError();
    if (i != 0) {
      throw new RuntimeException(paramString + ": glError " + i);
    }
  }
  
  public void clearTextureBuffer()
  {
    GLES20.glUseProgram(this.mGLProgId);
    if (this.mFrameBuffer != -1)
    {
      GLES20.glBindFramebuffer(36160, this.mFrameBuffer);
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GLES20.glClear(16640);
      GLES20.glBindFramebuffer(36160, 0);
      return;
    }
    GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glClear(16640);
  }
  
  public void destroy()
  {
    GLES20.glDeleteProgram(this.mGLProgId);
    onDestroy();
    this.mIsInitialized = false;
  }
  
  public void destroyFramebuffers()
  {
    if (this.mFrameBuffer != -1)
    {
      GLES20.glDeleteFramebuffers(1, new int[] { this.mFrameBuffer }, 0);
      this.mFrameBuffer = -1;
    }
    if (this.mFrameBufferTexture != -1)
    {
      GLES20.glDeleteTextures(1, new int[] { this.mFrameBufferTexture }, 0);
      this.mFrameBufferTexture = -1;
    }
  }
  
  public void flipX()
  {
    if (this.mCurrentTextureMatrix != null)
    {
      int i = 0;
      while (i < 8)
      {
        this.mCurrentTextureMatrix[i] = (1.0F - this.mCurrentTextureMatrix[i]);
        i += 2;
      }
      setAttribPointer(this.mCurrentVertexMatrix, this.mCurrentTextureMatrix);
    }
  }
  
  public void flipY()
  {
    if (this.mCurrentTextureMatrix != null)
    {
      int i = 1;
      while (i < 8)
      {
        this.mCurrentTextureMatrix[i] = (1.0F - this.mCurrentTextureMatrix[i]);
        i += 2;
      }
      setAttribPointer(this.mCurrentVertexMatrix, this.mCurrentTextureMatrix);
    }
  }
  
  public int getAttribPosition()
  {
    return this.mGLAttribPosition;
  }
  
  public int getAttribTextureCoordinate()
  {
    return this.mGLAttribTextureCoordinate;
  }
  
  public boolean getHasListener()
  {
    return this.mHasListener;
  }
  
  public int getOutputHeight()
  {
    return this.mOutputHeight;
  }
  
  public int getOutputTexture()
  {
    return this.mFrameBufferTexture;
  }
  
  public int getOutputWidth()
  {
    return this.mOutputWidth;
  }
  
  public int getProgram()
  {
    return this.mGLProgId;
  }
  
  public int getUniformTexture()
  {
    return this.mGLUniformTexture;
  }
  
  public boolean init()
  {
    this.mGLProgId = TXCOpenGlUtils.loadProgram(this.mVertexShader, this.mFragmentShader);
    if ((this.mGLProgId != 0) && (onInit())) {}
    for (this.mIsInitialized = true;; this.mIsInitialized = false)
    {
      onInitialized();
      return this.mIsInitialized;
    }
  }
  
  public boolean isInitialized()
  {
    return this.mIsInitialized;
  }
  
  public void onDestroy()
  {
    destroyFramebuffers();
    this.mOutputHeight = -1;
    this.mOutputWidth = -1;
  }
  
  public void onDisplaySizeChanged(int paramInt1, int paramInt2)
  {
    this.mOutputWidth = paramInt1;
    this.mOutputHeight = paramInt2;
  }
  
  public void onDraw(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    GLES20.glUseProgram(this.mGLProgId);
    runPendingOnDrawTasks();
    if (!this.mIsInitialized) {
      return;
    }
    paramFloatBuffer1.position(0);
    GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 0, paramFloatBuffer1);
    GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
    paramFloatBuffer2.position(0);
    GLES20.glVertexAttribPointer(this.mGLAttribTextureCoordinate, 2, 5126, false, 0, paramFloatBuffer2);
    GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoordinate);
    if ((this.mTextureTransformMatrixLocation >= 0) && (this.mTextureTransformMatrix != null)) {
      GLES20.glUniformMatrix4fv(this.mTextureTransformMatrixLocation, 1, false, this.mTextureTransformMatrix, 0);
    }
    if (paramInt != -1)
    {
      GLES20.glActiveTexture(33984);
      if (true != this.mbExtTextureModle) {
        break label179;
      }
      GLES20.glBindTexture(36197, paramInt);
    }
    for (;;)
    {
      GLES20.glUniform1i(this.mGLUniformTexture, 0);
      onDrawArraysPre();
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
      GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoordinate);
      onDrawArraysAfter();
      if (true != this.mbExtTextureModle) {
        break;
      }
      GLES20.glBindTexture(36197, 0);
      return;
      label179:
      GLES20.glBindTexture(3553, paramInt);
    }
    GLES20.glBindTexture(3553, 0);
  }
  
  public void onDrawArraysAfter() {}
  
  public void onDrawArraysPre() {}
  
  public int onDrawFrame(int paramInt)
  {
    return onDrawFrame(paramInt, this.mGLCubeBuffer, this.mGLTextureBuffer);
  }
  
  public int onDrawFrame(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    if (!this.mIsInitialized) {
      return -1;
    }
    onDraw(paramInt, paramFloatBuffer1, paramFloatBuffer2);
    if ((this.mListener instanceof OnFilterListener)) {
      this.mListener.onFilterListener(paramInt);
    }
    return 1;
  }
  
  public int onDrawToTexture(int paramInt)
  {
    return onDrawToTexture(paramInt, this.mFrameBuffer, this.mFrameBufferTexture);
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.mIsInitialized) {
      return -1;
    }
    GLES20.glBindFramebuffer(36160, paramInt2);
    onDraw(paramInt1, this.mGLCubeBuffer, this.mGLTextureBuffer);
    if ((this.mListener instanceof OnFilterListener)) {
      this.mListener.onFilterListener(paramInt3);
    }
    GLES20.glBindFramebuffer(36160, 0);
    return paramInt3;
  }
  
  public boolean onInit()
  {
    this.mGLAttribPosition = GLES20.glGetAttribLocation(this.mGLProgId, "position");
    this.mGLUniformTexture = GLES20.glGetUniformLocation(this.mGLProgId, "inputImageTexture");
    this.mTextureTransformMatrixLocation = GLES20.glGetUniformLocation(this.mGLProgId, "textureTransform");
    this.mGLAttribTextureCoordinate = GLES20.glGetAttribLocation(this.mGLProgId, "inputTextureCoordinate");
    return true;
  }
  
  public void onInitialized() {}
  
  public void onInputSizeChanged(int paramInt1, int paramInt2)
  {
    this.mIntputWidth = paramInt1;
    this.mIntputHeight = paramInt2;
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    if ((this.mOutputHeight == paramInt2) && (this.mOutputWidth == paramInt1)) {}
    do
    {
      return;
      this.mOutputWidth = paramInt1;
      this.mOutputHeight = paramInt2;
    } while (!this.mHasFrameBuffer);
    if (this.mFrameBuffer != -1) {
      destroyFramebuffers();
    }
    int[] arrayOfInt = new int[1];
    GLES20.glGenFramebuffers(1, arrayOfInt, 0);
    this.mFrameBuffer = arrayOfInt[0];
    this.mFrameBufferTexture = TXCOpenGlUtils.createTexture(paramInt1, paramInt2, 6408, 6408);
    GLES20.glBindFramebuffer(36160, this.mFrameBuffer);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mFrameBufferTexture, 0);
    GLES20.glBindFramebuffer(36160, 0);
  }
  
  public void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mRunOnDraw)
    {
      this.mRunOnDraw.addLast(paramRunnable);
      return;
    }
  }
  
  public void runPendingOnDrawTasks()
  {
    while (!this.mRunOnDraw.isEmpty()) {
      ((Runnable)this.mRunOnDraw.removeFirst()).run();
    }
  }
  
  public void scaleClipAndRotate(int paramInt1, int paramInt2, int paramInt3, FloatBuffer paramFloatBuffer, float paramFloat)
  {
    int j;
    int i;
    if (paramFloatBuffer == null)
    {
      paramFloatBuffer = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);
      if (paramInt1 / paramInt2 <= paramFloat) {
        break label157;
      }
      j = (int)(paramInt2 * paramFloat);
      i = paramInt2;
    }
    for (;;)
    {
      label37:
      float f = j / paramInt1;
      paramFloat = i / paramInt2;
      f = (1.0F - f) / 2.0F;
      paramFloat = (1.0F - paramFloat) / 2.0F;
      paramInt1 = 0;
      label71:
      if (paramInt1 < paramFloatBuffer.length / 2)
      {
        if (paramFloatBuffer[(paramInt1 * 2)] < 0.5F)
        {
          paramInt2 = paramInt1 * 2;
          paramFloatBuffer[paramInt2] += f;
          label108:
          if (paramFloatBuffer[(paramInt1 * 2 + 1)] >= 0.5F) {
            break label200;
          }
          paramInt2 = paramInt1 * 2 + 1;
          paramFloatBuffer[paramInt2] += paramFloat;
        }
        for (;;)
        {
          paramInt1 += 1;
          break label71;
          paramFloatBuffer = floatBuffer2Array(paramFloatBuffer);
          break;
          label157:
          if (paramInt1 / paramInt2 >= paramFloat) {
            break label331;
          }
          i = (int)(paramInt1 / paramFloat);
          j = paramInt1;
          break label37;
          paramInt2 = paramInt1 * 2;
          paramFloatBuffer[paramInt2] -= f;
          break label108;
          label200:
          paramInt2 = paramInt1 * 2 + 1;
          paramFloatBuffer[paramInt2] -= paramFloat;
        }
      }
      paramInt2 = paramInt3 / 90;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        paramFloat = paramFloatBuffer[0];
        f = paramFloatBuffer[1];
        paramFloatBuffer[0] = paramFloatBuffer[2];
        paramFloatBuffer[1] = paramFloatBuffer[3];
        paramFloatBuffer[2] = paramFloatBuffer[6];
        paramFloatBuffer[3] = paramFloatBuffer[7];
        paramFloatBuffer[6] = paramFloatBuffer[4];
        paramFloatBuffer[7] = paramFloatBuffer[5];
        paramFloatBuffer[4] = paramFloat;
        paramFloatBuffer[5] = f;
        paramInt1 += 1;
      }
      setAttribPointer((float[])TXCTextureRotationUtil.CUBE.clone(), paramFloatBuffer);
      return;
      label331:
      i = paramInt2;
      j = paramInt1;
    }
  }
  
  public void scaleClipAndRotate(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    float[] arrayOfFloat = paramArrayOfFloat;
    if (paramArrayOfFloat == null) {
      arrayOfFloat = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);
    }
    int j;
    int i;
    if (paramInt1 / paramInt2 > paramFloat)
    {
      j = (int)(paramInt2 * paramFloat);
      i = paramInt2;
    }
    for (;;)
    {
      float f = j / paramInt1;
      paramFloat = i / paramInt2;
      f = (1.0F - f) / 2.0F;
      paramFloat = (1.0F - paramFloat) / 2.0F;
      paramInt1 = 0;
      label75:
      if (paramInt1 < arrayOfFloat.length / 2)
      {
        if (arrayOfFloat[(paramInt1 * 2)] < 0.5F)
        {
          paramInt2 = paramInt1 * 2;
          arrayOfFloat[paramInt2] += f;
          label112:
          if (arrayOfFloat[(paramInt1 * 2 + 1)] >= 0.5F) {
            break label194;
          }
          paramInt2 = paramInt1 * 2 + 1;
          arrayOfFloat[paramInt2] += paramFloat;
        }
        for (;;)
        {
          paramInt1 += 1;
          break label75;
          if (paramInt1 / paramInt2 >= paramFloat) {
            break label525;
          }
          i = (int)(paramInt1 / paramFloat);
          j = paramInt1;
          break;
          paramInt2 = paramInt1 * 2;
          arrayOfFloat[paramInt2] -= f;
          break label112;
          label194:
          paramInt2 = paramInt1 * 2 + 1;
          arrayOfFloat[paramInt2] -= paramFloat;
        }
      }
      paramInt2 = paramInt3 / 90;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        paramFloat = arrayOfFloat[0];
        f = arrayOfFloat[1];
        arrayOfFloat[0] = arrayOfFloat[2];
        arrayOfFloat[1] = arrayOfFloat[3];
        arrayOfFloat[2] = arrayOfFloat[6];
        arrayOfFloat[3] = arrayOfFloat[7];
        arrayOfFloat[6] = arrayOfFloat[4];
        arrayOfFloat[7] = arrayOfFloat[5];
        arrayOfFloat[4] = paramFloat;
        arrayOfFloat[5] = f;
        paramInt1 += 1;
      }
      if ((paramInt2 == 0) || (paramInt2 == 2))
      {
        if (paramBoolean1)
        {
          arrayOfFloat[0] = (1.0F - arrayOfFloat[0]);
          arrayOfFloat[2] = (1.0F - arrayOfFloat[2]);
          arrayOfFloat[4] = (1.0F - arrayOfFloat[4]);
          arrayOfFloat[6] = (1.0F - arrayOfFloat[6]);
        }
        if (paramBoolean2)
        {
          arrayOfFloat[1] = (1.0F - arrayOfFloat[1]);
          arrayOfFloat[3] = (1.0F - arrayOfFloat[3]);
          arrayOfFloat[5] = (1.0F - arrayOfFloat[5]);
          arrayOfFloat[7] = (1.0F - arrayOfFloat[7]);
        }
      }
      for (;;)
      {
        setAttribPointer((float[])TXCTextureRotationUtil.CUBE.clone(), arrayOfFloat);
        return;
        if (paramBoolean2)
        {
          arrayOfFloat[0] = (1.0F - arrayOfFloat[0]);
          arrayOfFloat[2] = (1.0F - arrayOfFloat[2]);
          arrayOfFloat[4] = (1.0F - arrayOfFloat[4]);
          arrayOfFloat[6] = (1.0F - arrayOfFloat[6]);
        }
        if (paramBoolean1)
        {
          arrayOfFloat[1] = (1.0F - arrayOfFloat[1]);
          arrayOfFloat[3] = (1.0F - arrayOfFloat[3]);
          arrayOfFloat[5] = (1.0F - arrayOfFloat[5]);
          arrayOfFloat[7] = (1.0F - arrayOfFloat[7]);
        }
      }
      label525:
      i = paramInt2;
      j = paramInt1;
    }
  }
  
  public void setAttribPointer(FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    this.mGLCubeBuffer = paramFloatBuffer1;
    this.mGLTextureBuffer = paramFloatBuffer2;
  }
  
  public void setAttribPointer(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    this.mCurrentVertexMatrix = paramArrayOfFloat1;
    this.mGLCubeBuffer = ByteBuffer.allocateDirect(TXCTextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mGLCubeBuffer.put(paramArrayOfFloat1).position(0);
    this.mCurrentTextureMatrix = paramArrayOfFloat2;
    this.mGLTextureBuffer = ByteBuffer.allocateDirect(TXCTextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.mGLTextureBuffer.put(paramArrayOfFloat2).position(0);
  }
  
  public float[] setCropRect(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer, CropRect paramCropRect, int paramInt3)
  {
    int i = 0;
    float f2;
    float f4;
    if (paramFloatBuffer == null) {
      if (4 == paramInt3)
      {
        paramFloatBuffer = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, false);
        if (paramCropRect == null) {
          return paramFloatBuffer;
        }
        float f1 = paramCropRect.xOffset / (paramInt1 * 1.0F);
        f2 = (paramInt1 - paramCropRect.xOffset - paramCropRect.cropWidth) / (paramInt1 * 1.0F);
        float f3 = paramCropRect.yOffset / (paramInt2 * 1.0F);
        f4 = (paramInt2 - paramCropRect.yOffset - paramCropRect.cropHeight) / (paramInt2 * 1.0F);
        paramInt1 = i;
        label98:
        if (paramInt1 >= paramFloatBuffer.length / 2) {
          return paramFloatBuffer;
        }
        if (paramFloatBuffer[(paramInt1 * 2)] >= 0.5F) {
          break label187;
        }
        paramInt2 = paramInt1 * 2;
        paramFloatBuffer[paramInt2] += f1;
        label131:
        if (paramFloatBuffer[(paramInt1 * 2 + 1)] >= 0.5F) {
          break label203;
        }
        paramInt2 = paramInt1 * 2 + 1;
        paramFloatBuffer[paramInt2] += f3;
      }
    }
    for (;;)
    {
      paramInt1 += 1;
      break label98;
      paramFloatBuffer = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);
      break;
      paramFloatBuffer = floatBuffer2Array(paramFloatBuffer);
      break;
      label187:
      paramInt2 = paramInt1 * 2;
      paramFloatBuffer[paramInt2] -= f2;
      break label131;
      label203:
      paramInt2 = paramInt1 * 2 + 1;
      paramFloatBuffer[paramInt2] -= f4;
    }
    return paramFloatBuffer;
  }
  
  public void setFloat(final int paramInt, final float paramFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniform1f(paramInt, paramFloat);
      }
    });
  }
  
  public void setFloatArray(final int paramInt, final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniform1fv(paramInt, paramArrayOfFloat.length, FloatBuffer.wrap(paramArrayOfFloat));
      }
    });
  }
  
  public void setFloatVec2(final int paramInt, final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniform2fv(paramInt, 1, FloatBuffer.wrap(paramArrayOfFloat));
      }
    });
  }
  
  public void setFloatVec3(final int paramInt, final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniform3fv(paramInt, 1, FloatBuffer.wrap(paramArrayOfFloat));
      }
    });
  }
  
  public void setFloatVec4(final int paramInt, final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniform4fv(paramInt, 1, FloatBuffer.wrap(paramArrayOfFloat));
      }
    });
  }
  
  public void setHasFrameBuffer(boolean paramBoolean)
  {
    this.mHasFrameBuffer = paramBoolean;
  }
  
  public void setInteger(final int paramInt1, final int paramInt2)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniform1i(paramInt1, paramInt2);
      }
    });
  }
  
  public void setListener(OnFilterListener paramOnFilterListener)
  {
    if (paramOnFilterListener != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.mHasListener = bool;
      this.mListener = paramOnFilterListener;
      return;
    }
  }
  
  public void setNearestModel(boolean paramBoolean)
  {
    this.mbNearestMode = paramBoolean;
    TXCLog.i(this.TAG, "set Nearest model " + paramBoolean);
  }
  
  public void setPoint(final int paramInt, final PointF paramPointF)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        float f1 = paramPointF.x;
        float f2 = paramPointF.y;
        GLES20.glUniform2fv(paramInt, 1, new float[] { f1, f2 }, 0);
      }
    });
  }
  
  public void setTextureTransformMatrix(float[] paramArrayOfFloat)
  {
    this.mTextureTransformMatrix = paramArrayOfFloat;
  }
  
  public void setUniformMatrix3f(final int paramInt, final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniformMatrix3fv(paramInt, 1, false, paramArrayOfFloat, 0);
      }
    });
  }
  
  public void setUniformMatrix4f(final int paramInt, final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        GLES20.glUniformMatrix4fv(paramInt, 1, false, paramArrayOfFloat, 0);
      }
    });
  }
  
  public void setZoomAndRotate(int paramInt, FloatBuffer paramFloatBuffer)
  {
    if (paramFloatBuffer == null) {}
    for (paramFloatBuffer = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);; paramFloatBuffer = floatBuffer2Array(paramFloatBuffer))
    {
      int i = paramInt / 90;
      paramInt = 0;
      while (paramInt < i)
      {
        float f1 = paramFloatBuffer[0];
        float f2 = paramFloatBuffer[1];
        paramFloatBuffer[0] = paramFloatBuffer[2];
        paramFloatBuffer[1] = paramFloatBuffer[3];
        paramFloatBuffer[2] = paramFloatBuffer[6];
        paramFloatBuffer[3] = paramFloatBuffer[7];
        paramFloatBuffer[6] = paramFloatBuffer[4];
        paramFloatBuffer[7] = paramFloatBuffer[5];
        paramFloatBuffer[4] = f1;
        paramFloatBuffer[5] = f2;
        paramInt += 1;
      }
    }
    setAttribPointer((float[])TXCTextureRotationUtil.CUBE.clone(), paramFloatBuffer);
  }
  
  public static abstract interface OnFilterListener
  {
    public abstract void onFilterListener(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\opengl\TXCGPUFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */