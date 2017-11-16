package com.tencent.liteav.screencapture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.opengl.EGL10Helper;
import com.tencent.liteav.basic.opengl.TXCGPUOESTextureFilter;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;

public class TXCScreenCapture
{
  private Object mCallbackObject = null;
  protected int mCaptureOutFPS = 20;
  protected int mCaptureOutHeight = 1280;
  protected int mCaptureOutWidth = 720;
  protected volatile WeakReference<TXIScreenCaptureListener> mCaptureWeakListener = null;
  protected boolean mEnable = false;
  protected volatile TXCScreenCaptureGLThreadHandler mGLHandler = null;
  protected volatile HandlerThread mGLThread = null;
  protected volatile int mGLThreadSessionID = 0;
  protected Handler mMainHandler = null;
  
  public TXCScreenCapture(Context paramContext) {}
  
  protected void callListenerCaptureResult(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong) {}
  
  protected void callListenerStartResult(int paramInt, EGLContext paramEGLContext) {}
  
  public void enable(boolean paramBoolean) {}
  
  protected TXIScreenCaptureListener getListener()
  {
    if (this.mCaptureWeakListener == null) {
      return null;
    }
    return (TXIScreenCaptureListener)this.mCaptureWeakListener.get();
  }
  
  protected void initGLThread() {}
  
  public void post(Runnable paramRunnable) {}
  
  protected void sendMsg(int paramInt) {}
  
  protected void sendMsg(int paramInt1, int paramInt2) {}
  
  protected void sendMsg(int paramInt, Runnable paramRunnable) {}
  
  protected void sendMsgDelayed(int paramInt, long paramLong) {}
  
  public void setFPS(int paramInt) {}
  
  public void setListener(TXIScreenCaptureListener paramTXIScreenCaptureListener) {}
  
  public void setListener(WeakReference<TXIScreenCaptureListener> paramWeakReference) {}
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener) {}
  
  public int start(int paramInt1, int paramInt2, int paramInt3)
  {
    return 0;
  }
  
  public void stop(Object paramObject) {}
  
  protected void unintGLThread() {}
  
  protected class TXCScreenCaptureGLThreadHandler
    extends Handler
  {
    public static final int MSG_END = 101;
    public static final int MSG_INIT = 100;
    public static final int MSG_REND = 102;
    public static final int MSG_RUN_TASK = 104;
    public static final int MSG_SET_FPS = 103;
    public int mCaptureFPS = 25;
    public int mCaptureHeight = 1280;
    public int mCaptureWidth = 720;
    protected EGL10Helper mEGLHelper = null;
    protected long mFirstTick = 0L;
    protected long mFrameID = 0L;
    public Surface mInputSurface = null;
    public SurfaceTexture mInputSurfaceTexture = null;
    public int[] mInputTexture = null;
    protected TXCGPUOESTextureFilter mOESFilter = null;
    public int mSessionID = 0;
    protected boolean mbCaptureAvailable = false;
    float[] mtx = new float[16];
    
    public TXCScreenCaptureGLThreadHandler(Looper paramLooper, TXCScreenCapture paramTXCScreenCapture)
    {
      super();
    }
    
    protected void destroyGL() {}
    
    protected void destroyInputSurfaceTexture() {}
    
    public void handleMessage(Message paramMessage) {}
    
    protected boolean initGL()
    {
      return true;
    }
    
    protected void onMsgEnd(Message paramMessage) {}
    
    protected void onMsgInit(Message paramMessage) {}
    
    protected void onMsgRend(Message paramMessage) {}
    
    protected void onMsgSetFPS(Message paramMessage) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\screencapture\TXCScreenCapture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */