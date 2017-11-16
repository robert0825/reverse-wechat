package com.tencent.liteav.beauty.gpu_filters;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLSurfaceView.Renderer;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class PixelBuffer
{
  static final boolean LIST_CONFIGS = false;
  static final String TAG = "PixelBuffer";
  Bitmap mBitmap;
  EGL10 mEGL;
  EGLConfig mEGLConfig;
  EGLConfig[] mEGLConfigs;
  EGLContext mEGLContext;
  EGLDisplay mEGLDisplay;
  EGLSurface mEGLSurface;
  GL10 mGL;
  int mHeight;
  GLSurfaceView.Renderer mRenderer;
  String mThreadOwner;
  int mWidth;
  
  public PixelBuffer(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    int[] arrayOfInt = new int[2];
    paramInt1 = this.mWidth;
    paramInt2 = this.mHeight;
    this.mEGL = ((EGL10)EGLContext.getEGL());
    this.mEGLDisplay = this.mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    this.mEGL.eglInitialize(this.mEGLDisplay, arrayOfInt);
    this.mEGLConfig = chooseConfig();
    this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
    this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[] { 12375, paramInt1, 12374, paramInt2, 12344 });
    this.mEGL.eglMakeCurrent(this.mEGLDisplay, this.mEGLSurface, this.mEGLSurface, this.mEGLContext);
    this.mGL = ((GL10)this.mEGLContext.getGL());
    this.mThreadOwner = Thread.currentThread().getName();
  }
  
  private EGLConfig chooseConfig()
  {
    int[] arrayOfInt1 = new int[15];
    int[] tmp6_5 = arrayOfInt1;
    tmp6_5[0] = '〥';
    int[] tmp12_6 = tmp6_5;
    tmp12_6[1] = 0;
    int[] tmp16_12 = tmp12_6;
    tmp16_12[2] = '〦';
    int[] tmp22_16 = tmp16_12;
    tmp22_16[3] = 0;
    int[] tmp26_22 = tmp22_16;
    tmp26_22[4] = '〤';
    int[] tmp32_26 = tmp26_22;
    tmp32_26[5] = 8;
    int[] tmp37_32 = tmp32_26;
    tmp37_32[6] = '〣';
    int[] tmp44_37 = tmp37_32;
    tmp44_37[7] = 8;
    int[] tmp50_44 = tmp44_37;
    tmp50_44[8] = '〢';
    int[] tmp57_50 = tmp50_44;
    tmp57_50[9] = 8;
    int[] tmp63_57 = tmp57_50;
    tmp63_57[10] = '〡';
    int[] tmp70_63 = tmp63_57;
    tmp70_63[11] = 8;
    int[] tmp76_70 = tmp70_63;
    tmp76_70[12] = '぀';
    int[] tmp83_76 = tmp76_70;
    tmp83_76[13] = 4;
    int[] tmp88_83 = tmp83_76;
    tmp88_83[14] = '〸';
    tmp88_83;
    int[] arrayOfInt2 = new int[1];
    this.mEGL.eglChooseConfig(this.mEGLDisplay, arrayOfInt1, null, 0, arrayOfInt2);
    int i = arrayOfInt2[0];
    this.mEGLConfigs = new EGLConfig[i];
    this.mEGL.eglChooseConfig(this.mEGLDisplay, arrayOfInt1, this.mEGLConfigs, i, arrayOfInt2);
    return this.mEGLConfigs[0];
  }
  
  private void convertToBitmap()
  {
    int[] arrayOfInt = new int[this.mWidth * this.mHeight];
    Object localObject = IntBuffer.allocate(this.mWidth * this.mHeight);
    this.mGL.glReadPixels(0, 0, this.mWidth, this.mHeight, 6408, 5121, (Buffer)localObject);
    localObject = ((IntBuffer)localObject).array();
    int i = 0;
    while (i < this.mHeight)
    {
      int j = 0;
      while (j < this.mWidth)
      {
        arrayOfInt[((this.mHeight - i - 1) * this.mWidth + j)] = localObject[(this.mWidth * i + j)];
        j += 1;
      }
      i += 1;
    }
    this.mBitmap = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
    this.mBitmap.copyPixelsFromBuffer(IntBuffer.wrap(arrayOfInt));
  }
  
  private int getConfigAttrib(EGLConfig paramEGLConfig, int paramInt)
  {
    int i = 0;
    int[] arrayOfInt = new int[1];
    if (this.mEGL.eglGetConfigAttrib(this.mEGLDisplay, paramEGLConfig, paramInt, arrayOfInt)) {
      i = arrayOfInt[0];
    }
    return i;
  }
  
  private void listConfig()
  {
    TXCLog.i("PixelBuffer", "Config List {");
    EGLConfig[] arrayOfEGLConfig = this.mEGLConfigs;
    int j = arrayOfEGLConfig.length;
    int i = 0;
    while (i < j)
    {
      EGLConfig localEGLConfig = arrayOfEGLConfig[i];
      int k = getConfigAttrib(localEGLConfig, 12325);
      int m = getConfigAttrib(localEGLConfig, 12326);
      int n = getConfigAttrib(localEGLConfig, 12324);
      int i1 = getConfigAttrib(localEGLConfig, 12323);
      int i2 = getConfigAttrib(localEGLConfig, 12322);
      int i3 = getConfigAttrib(localEGLConfig, 12321);
      TXCLog.i("PixelBuffer", "    <d,s,r,g,b,a> = <" + k + "," + m + "," + n + "," + i1 + "," + i2 + "," + i3 + ">");
      i += 1;
    }
    TXCLog.i("PixelBuffer", "}");
  }
  
  public void destroy()
  {
    this.mRenderer.onDrawFrame(this.mGL);
    this.mRenderer.onDrawFrame(this.mGL);
    this.mEGL.eglMakeCurrent(this.mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
    this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
    this.mEGL.eglTerminate(this.mEGLDisplay);
  }
  
  public Bitmap getBitmap()
  {
    if (this.mRenderer == null)
    {
      TXCLog.e("PixelBuffer", "getBitmap: Renderer was not set.");
      return null;
    }
    if (!Thread.currentThread().getName().equals(this.mThreadOwner))
    {
      TXCLog.e("PixelBuffer", "getBitmap: This thread does not own the OpenGL context.");
      return null;
    }
    this.mRenderer.onDrawFrame(this.mGL);
    this.mRenderer.onDrawFrame(this.mGL);
    convertToBitmap();
    return this.mBitmap;
  }
  
  public void setRenderer(GLSurfaceView.Renderer paramRenderer)
  {
    this.mRenderer = paramRenderer;
    if (!Thread.currentThread().getName().equals(this.mThreadOwner))
    {
      TXCLog.e("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
      return;
    }
    this.mRenderer.onSurfaceCreated(this.mGL, this.mEGLConfig);
    this.mRenderer.onSurfaceChanged(this.mGL, this.mWidth, this.mHeight);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\PixelBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */