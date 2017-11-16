package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public class TXCGLSurfaceView
  extends TXCGLSurfaceViewBase
  implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer
{
  private static final String TAG = "TXCGLSurfaceView";
  private long firstTick = 0L;
  private int[] mCameraTextureId;
  private int mCurFPS = 20;
  private EGLContext mEGLContext;
  TXIVideoRenderListener mListener;
  private TXCGPUFilter mLocalFilter;
  private boolean mMirror = false;
  private boolean mNeedUpdateTexture = false;
  WeakReference<TXINotifyListener> mNotifytener;
  private int mOrientaion = 0;
  private boolean mRenderFirstFrame = false;
  private final Queue<Runnable> mRenderTask = new LinkedList();
  private float[] mSTMatrix = new float[16];
  private SurfaceTexture mSurfaceTexture;
  private boolean mSurfaceTextureInvalid = true;
  private Object mSurfaceTextureLock = new Object();
  private int mSwapResult = 12288;
  TXIVideoRenderTextureListener mTextureListener;
  private float mVideoRatio = 1.0F;
  private float mViewRatio = 1.0F;
  private long nFrameID = 0L;
  
  public TXCGLSurfaceView(Context paramContext)
  {
    super(paramContext);
    setEGLContextClientVersion(2);
    setEGLConfigChooser(8, 8, 8, 8, 16, 0);
    setRenderer(this);
  }
  
  public TXCGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setEGLContextClientVersion(2);
    setEGLConfigChooser(8, 8, 8, 8, 16, 0);
    setRenderer(this);
  }
  
  private boolean runAll(Queue<Runnable> paramQueue)
  {
    try
    {
      if (paramQueue.isEmpty()) {
        return false;
      }
      Runnable localRunnable = (Runnable)paramQueue.poll();
      if (localRunnable == null) {
        return false;
      }
    }
    finally {}
    ((Runnable)localObject).run();
    return true;
  }
  
  private void threadRelex()
  {
    try
    {
      Thread.sleep(5L);
      return;
    }
    catch (Exception localException) {}
  }
  
  protected int afterSwapBuffer()
  {
    if (this.mSwapResult != 12288) {
      TXCLog.e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.mSwapResult);
    }
    return this.mSwapResult;
  }
  
  public EGLContext getGLContext()
  {
    return this.mEGLContext;
  }
  
  public SurfaceTexture getSurfaceTexture()
  {
    return this.mSurfaceTexture;
  }
  
  public void invalidSurfaceTexture(boolean paramBoolean)
  {
    this.mSurfaceTextureInvalid = true;
    if (paramBoolean)
    {
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GLES20.glClear(16384);
      this.mSwapResult = swapBuffer();
    }
    try
    {
      if (this.mNeedUpdateTexture)
      {
        this.mNeedUpdateTexture = false;
        if (this.mSurfaceTexture != null) {
          this.mSurfaceTexture.updateTexImage();
        }
      }
      return;
    }
    finally {}
  }
  
  public void invalidSurfaceTextureSynced(final boolean paramBoolean)
  {
    synchronized (this.mSurfaceTextureLock)
    {
      runOnDraw(new Runnable()
      {
        public void run()
        {
          synchronized (TXCGLSurfaceView.this.mSurfaceTextureLock)
          {
            TXCGLSurfaceView.this.invalidSurfaceTexture(paramBoolean);
            TXCGLSurfaceView.this.mSurfaceTextureLock.notifyAll();
            return;
          }
        }
      });
    }
    try
    {
      this.mSurfaceTextureLock.wait(1000L);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void onDrawFrame(GL10 paramGL10)
  {
    int i = 0;
    runAll(this.mRenderTask);
    long l;
    for (;;)
    {
      l = System.currentTimeMillis();
      if (this.firstTick == 0L) {
        this.firstTick = l;
      }
      if (l - this.firstTick >= this.nFrameID * 1000L / this.mCurFPS) {
        break;
      }
      threadRelex();
    }
    this.nFrameID += 1L;
    if (l - this.firstTick > 2000L)
    {
      this.nFrameID = 1L;
      this.firstTick = System.currentTimeMillis();
    }
    if (this.mSurfaceTextureInvalid) {}
    for (;;)
    {
      return;
      try
      {
        if (!this.mNeedUpdateTexture) {
          return;
        }
      }
      finally {}
      if (this.mSurfaceTexture != null)
      {
        this.mSurfaceTexture.updateTexImage();
        this.mSurfaceTexture.getTransformMatrix(this.mSTMatrix);
      }
      this.mNeedUpdateTexture = false;
      try
      {
        if (this.mTextureListener != null) {
          this.mTextureListener.onTextureProcess(this.mCameraTextureId[0], this.mSTMatrix);
        }
        try
        {
          if (!this.mRunninInBackground) {
            i = 1;
          }
          if (i == 0) {
            continue;
          }
          this.mSwapResult = swapBuffer();
          return;
        }
        finally {}
      }
      catch (Exception paramGL10)
      {
        for (;;) {}
      }
    }
  }
  
  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    if (!this.mRenderFirstFrame)
    {
      TXCSystemUtil.notifyEvent(this.mNotifytener, 1007, "首帧画面采集完成");
      this.mRenderFirstFrame = true;
    }
    this.mSurfaceTextureInvalid = false;
    try
    {
      this.mNeedUpdateTexture = true;
      return;
    }
    finally {}
  }
  
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2) {}
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    this.mEGLContext = ((EGL10)EGLContext.getEGL()).eglGetCurrentContext();
    this.mCameraTextureId = new int[1];
    this.mCameraTextureId[0] = TXCOpenGlUtils.getExternalOESTextureID();
    if (this.mCameraTextureId[0] <= 0)
    {
      this.mCameraTextureId = null;
      TXCLog.e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
    }
    do
    {
      do
      {
        return;
        this.mSurfaceTexture = new SurfaceTexture(this.mCameraTextureId[0]);
        this.mSurfaceTexture.setOnFrameAvailableListener(this);
        this.mLocalFilter = new TXCGPUFilter();
      } while (!this.mLocalFilter.init());
      this.mLocalFilter.setAttribPointer(TXCTextureRotationUtil.CUBE, TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, false));
    } while (this.mListener == null);
    this.mListener.onSurfaceTextureAvailable(this.mSurfaceTexture);
  }
  
  public void renderTexture(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6)
  {
    if (this.mLocalFilter == null) {
      return;
    }
    try
    {
      if (this.mRunninInBackground) {
        return;
      }
    }
    finally {}
    GLES20.glViewport(0, 0, paramInt2, paramInt3);
    paramInt2 = getWidth();
    paramInt3 = getHeight();
    float f1;
    float f2;
    label71:
    label165:
    int i;
    label173:
    label178:
    label210:
    boolean bool;
    if (paramInt3 != 0)
    {
      f1 = paramInt2 / paramInt3;
      if (paramInt6 == 0) {
        break label268;
      }
      f2 = paramInt5 / paramInt6;
      if ((this.mMirror != paramBoolean) || (this.mOrientaion != paramInt4) || (this.mViewRatio != f1) || (this.mVideoRatio != f2))
      {
        this.mMirror = paramBoolean;
        this.mOrientaion = paramInt4;
        this.mViewRatio = f1;
        this.mVideoRatio = f2;
        int j = (720 - this.mOrientaion) % 360;
        if ((j != 90) && (j != 270)) {
          break label274;
        }
        paramInt4 = 1;
        if (paramInt4 == 0) {
          break label280;
        }
        i = paramInt3;
        if (paramInt4 == 0) {
          break label286;
        }
        TXCGPUFilter localTXCGPUFilter = this.mLocalFilter;
        float[] arrayOfFloat = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);
        f1 = i / paramInt2;
        if (paramInt4 == 0) {
          break label291;
        }
        paramBoolean = false;
        if (paramInt4 == 0) {
          break label300;
        }
        bool = this.mMirror;
        label221:
        localTXCGPUFilter.scaleClipAndRotate(paramInt5, paramInt6, j, arrayOfFloat, f1, paramBoolean, bool);
        if (paramInt4 == 0) {
          break label306;
        }
        this.mLocalFilter.flipX();
      }
    }
    for (;;)
    {
      this.mLocalFilter.onDrawFrame(paramInt1);
      return;
      f1 = 1.0F;
      break;
      label268:
      f2 = 1.0F;
      break label71;
      label274:
      paramInt4 = 0;
      break label165;
      label280:
      i = paramInt2;
      break label173;
      label286:
      paramInt2 = paramInt3;
      break label178;
      label291:
      paramBoolean = this.mMirror;
      break label210;
      label300:
      bool = false;
      break label221;
      label306:
      this.mLocalFilter.flipY();
    }
  }
  
  public SurfaceTexture resetSurfaceTexture()
  {
    if (this.mSurfaceTexture != null)
    {
      this.mSurfaceTexture.setOnFrameAvailableListener(null);
      this.mSurfaceTexture = null;
    }
    this.mCameraTextureId = new int[1];
    this.mCameraTextureId[0] = TXCOpenGlUtils.getExternalOESTextureID();
    if (this.mCameraTextureId[0] <= 0)
    {
      this.mCameraTextureId = null;
      TXCLog.e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
      return null;
    }
    this.mSurfaceTexture = new SurfaceTexture(this.mCameraTextureId[0]);
    this.mSurfaceTexture.setOnFrameAvailableListener(this);
    return this.mSurfaceTexture;
  }
  
  public void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mRenderTask)
    {
      this.mRenderTask.add(paramRunnable);
      return;
    }
  }
  
  public void setFPS(final int paramInt)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCGLSurfaceView.access$002(TXCGLSurfaceView.this, paramInt);
        if (TXCGLSurfaceView.this.mCurFPS <= 0) {
          TXCGLSurfaceView.access$002(TXCGLSurfaceView.this, 1);
        }
        for (;;)
        {
          TXCGLSurfaceView.access$102(TXCGLSurfaceView.this, 0L);
          TXCGLSurfaceView.access$202(TXCGLSurfaceView.this, 0L);
          return;
          if (TXCGLSurfaceView.this.mCurFPS > 60) {
            TXCGLSurfaceView.access$002(TXCGLSurfaceView.this, 60);
          }
        }
      }
    });
  }
  
  public void setListener(TXIVideoRenderListener paramTXIVideoRenderListener)
  {
    this.mListener = paramTXIVideoRenderListener;
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifytener = new WeakReference(paramTXINotifyListener);
  }
  
  protected void setRunInBackground(boolean paramBoolean)
  {
    if (paramBoolean) {
      try
      {
        TXCLog.d("TXCGLSurfaceView", "background capture enter background");
        this.mRunninInBackground = true;
        return;
      }
      finally {}
    }
    runOnDraw(new Runnable()
    {
      public void run()
      {
        try
        {
          TXCLog.d("TXCGLSurfaceView", "background capture exit background");
          TXCGLSurfaceView.this.mRunninInBackground = false;
          return;
        }
        finally {}
      }
    });
  }
  
  public void setTextureListener(TXIVideoRenderTextureListener paramTXIVideoRenderTextureListener)
  {
    this.mTextureListener = paramTXIVideoRenderTextureListener;
  }
  
  public void start()
  {
    this.mRenderFirstFrame = false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCGLSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */