package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCSystemUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

public class TXCVideoRender
  implements SurfaceTexture.OnFrameAvailableListener, TextureView.SurfaceTextureListener
{
  private static final String TAG = "TXCVideoRender";
  private final int OUTSIDE_RENDER = 0;
  private final int RGBA_RENDER = 0;
  private final int TEXTURE_RENDER = 0;
  private final int YUV_RENDER = 0;
  private long mLastTS = 0L;
  TXIVideoRenderListener mListener;
  private TXCOesTextureRender mLocalRender;
  private boolean mNeedSaveSurfaceTexture = false;
  WeakReference<TXINotifyListener> mNotifytener;
  private SurfaceTexture mOESSurfaceTexture;
  private boolean mOESTextureAvailable;
  private TXCOesTextureRender mOESTextureRender;
  private boolean mRenderFirstFrame = false;
  private RenderStats mRenderStats = new RenderStats();
  private final Queue<Runnable> mRenderTask = new LinkedList();
  private float[] mSTMatrix = new float[16];
  private SurfaceTexture mSaveSurfaceTexture;
  TXIVideoRenderTextureListener mTextureListener;
  private TextureView mTextureView;
  public TXCTextureViewWrapper mTextureViewWraper;
  private TXCVideoRenderThread mThread;
  public int mVideoHeight = 0;
  public int mVideoWidth = 0;
  public int mViewHeight = 0;
  public int mViewWidth = 0;
  private ArrayList<Long> mYuvBytesList = new ArrayList();
  TXIYuvRenderTextureListener mYuvTextureListener;
  private TXCYuvTextureRender mYuvTextureRender;
  
  private void adjustVideoSize(final int paramInt1, final int paramInt2)
  {
    if ((this.mVideoWidth != paramInt1) || (this.mVideoHeight != paramInt2)) {
      runOnDraw(new Runnable()
      {
        public void run()
        {
          if ((TXCVideoRender.this.mVideoWidth != paramInt1) || (TXCVideoRender.this.mVideoHeight != paramInt2))
          {
            TXCVideoRender.this.mVideoWidth = paramInt1;
            TXCVideoRender.this.mVideoHeight = paramInt2;
            if (TXCVideoRender.this.mTextureViewWraper != null) {
              TXCVideoRender.this.mTextureViewWraper.setVideoSize(TXCVideoRender.this.mVideoWidth, TXCVideoRender.this.mVideoHeight);
            }
          }
        }
      });
    }
  }
  
  private void checkRenderStats()
  {
    if (this.mRenderStats.renderFrameCount == 0L) {
      this.mRenderStats.firstFrameRenderTS = TXCTimeUtil.getTimeTick();
    }
    RenderStats localRenderStats = this.mRenderStats;
    localRenderStats.renderFrameCount += 1L;
    if (this.mLastTS != 0L)
    {
      long l = getTickSpan(this.mLastTS);
      if (l > 500L)
      {
        localRenderStats = this.mRenderStats;
        localRenderStats.blockTime += l;
        TXCLog.w("TXCVideoRender", "render frame count:" + this.mRenderStats.renderFrameCount + " block time:" + l + " > 500");
        localRenderStats = this.mRenderStats;
        localRenderStats.totalBlockCount += 1L;
        if (l > this.mRenderStats.maxBlockDuration) {
          this.mRenderStats.maxBlockDuration = l;
        }
      }
      if (l > 800L) {
        TXCLog.w("TXCVideoRender", "render frame count:" + this.mRenderStats.renderFrameCount + " block time:" + l + " > 800");
      }
      if (l > 1000L)
      {
        localRenderStats = this.mRenderStats;
        localRenderStats.blockCount += 1L;
        TXCLog.w("TXCVideoRender", "render frame count:" + this.mRenderStats.renderFrameCount + " block time:" + l + " > 1000");
      }
    }
    this.mLastTS = TXCTimeUtil.getTimeTick();
    this.mRenderStats.videoHeight = this.mVideoHeight;
    this.mRenderStats.videoWidth = this.mVideoWidth;
  }
  
  private void createTextureRender()
  {
    this.mOESTextureRender = new TXCOesTextureRender(true);
    this.mYuvTextureRender = new TXCYuvTextureRender();
    this.mLocalRender = new TXCOesTextureRender(false);
  }
  
  private long getTickSpan(long paramLong)
  {
    long l = TXCTimeUtil.getTimeTick();
    if (paramLong > l) {
      return 0L;
    }
    return l - paramLong;
  }
  
  private boolean onDrawFrame()
  {
    label191:
    label267:
    for (;;)
    {
      long l;
      try
      {
        boolean bool;
        if (this.mOESTextureAvailable)
        {
          bool = this.mOESTextureAvailable;
          this.mOESTextureAvailable = false;
          l = 0L;
          GLES20.glViewport(0, 0, this.mViewWidth, this.mViewHeight);
          if (!bool) {
            break label191;
          }
          if (this.mOESSurfaceTexture != null)
          {
            this.mOESSurfaceTexture.updateTexImage();
            this.mOESSurfaceTexture.getTransformMatrix(this.mSTMatrix);
          }
          if (this.mTextureListener != null)
          {
            this.mTextureListener.onTextureProcess(this.mOESTextureRender.getTextureId(), this.mSTMatrix);
            return true;
          }
        }
        else
        {
          if (!this.mYuvBytesList.isEmpty())
          {
            l = ((Long)this.mYuvBytesList.get(0)).longValue();
            this.mYuvBytesList.remove(0);
            bool = false;
            continue;
          }
          return false;
        }
      }
      finally {}
      if (this.mOESTextureRender != null)
      {
        this.mOESTextureRender.drawFrame(this.mOESSurfaceTexture);
        if (!this.mRenderFirstFrame)
        {
          TXCSystemUtil.notifyEvent(this.mNotifytener, 2003, "渲染首个视频数据包(IDR)");
          this.mRenderFirstFrame = true;
          continue;
          if ((l != 0L) && (this.mYuvTextureRender != null))
          {
            if (this.mYuvTextureListener != null)
            {
              int i = this.mYuvTextureRender.drawToTexture(l);
              this.mYuvTextureListener.onTextureProcess(i);
            }
            for (;;)
            {
              if (this.mRenderFirstFrame) {
                break label267;
              }
              TXCSystemUtil.notifyEvent(this.mNotifytener, 2003, "渲染首个视频数据包(IDR)");
              this.mRenderFirstFrame = true;
              break;
              this.mYuvTextureRender.drawFrame(l);
            }
          }
        }
      }
    }
  }
  
  private void quitThread()
  {
    if (this.mThread != null)
    {
      this.mThread.quit();
      this.mThread = null;
      TXCLog.w("TXCVideoRender", "play:vrender: quit render thread");
    }
    this.mOESSurfaceTexture = null;
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
  
  private void startThread()
  {
    this.mThread = new TXCVideoRenderThread(new WeakReference(this));
    this.mThread.start();
    TXCLog.w("TXCVideoRender", "play:vrender: start render thread");
  }
  
  void destroyTextureRender()
  {
    try
    {
      if (this.mListener != null) {
        this.mListener.onSurfaceTextureDestroy(this.mOESSurfaceTexture);
      }
      this.mOESTextureRender = null;
      this.mYuvTextureRender = null;
      this.mLocalRender = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  boolean drawFrame()
  {
    while (runAll(this.mRenderTask)) {}
    return onDrawFrame();
  }
  
  protected void finalize()
  {
    super.finalize();
    TXCLog.w("TXCVideoRender", "play:vrender: quit render thread when finalize");
    try
    {
      quitThread();
      return;
    }
    catch (Exception localException) {}
  }
  
  public EGLContext getGLContext()
  {
    if (this.mThread != null) {
      return this.mThread.getGLContext();
    }
    return null;
  }
  
  public SurfaceTexture getOESTexture()
  {
    return this.mOESSurfaceTexture;
  }
  
  public RenderStats getRenderStats()
  {
    return this.mRenderStats;
  }
  
  SurfaceTexture getSurfaceTexture()
  {
    if (this.mTextureView != null) {
      return this.mTextureView.getSurfaceTexture();
    }
    return null;
  }
  
  public TextureView getVideoView()
  {
    return this.mTextureView;
  }
  
  void initTextureRender()
  {
    createTextureRender();
    if (this.mTextureViewWraper != null)
    {
      this.mTextureViewWraper.setViewSize(this.mViewWidth, this.mViewHeight);
      this.mTextureViewWraper.setVideoSize(this.mVideoWidth, this.mVideoHeight);
    }
    if (this.mOESTextureRender != null)
    {
      this.mOESTextureRender.createTexture();
      this.mOESSurfaceTexture = new SurfaceTexture(this.mOESTextureRender.getTextureId());
      this.mOESSurfaceTexture.setOnFrameAvailableListener(this);
    }
    if (this.mYuvTextureRender != null) {
      this.mYuvTextureRender.createTexture();
    }
    if ((this.mYuvTextureListener != null) && (this.mYuvTextureRender != null)) {
      this.mYuvTextureRender.setHasFrameBuffer(this.mVideoWidth, this.mVideoHeight);
    }
    if (this.mLocalRender != null) {
      this.mLocalRender.createTexture();
    }
    if (this.mListener != null) {
      this.mListener.onSurfaceTextureAvailable(this.mOESSurfaceTexture);
    }
  }
  
  public void invalidFrame()
  {
    try
    {
      if ((this.mOESTextureAvailable) && (this.mOESSurfaceTexture != null))
      {
        this.mOESTextureAvailable = false;
        this.mOESSurfaceTexture.updateTexImage();
      }
      return;
    }
    finally {}
  }
  
  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    try
    {
      this.mOESTextureAvailable = true;
      if (this.mTextureListener == null) {
        checkRenderStats();
      }
      return;
    }
    finally {}
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    TXCLog.w("TXCVideoRender", "play:vrender: texture available @" + paramSurfaceTexture);
    this.mViewWidth = paramInt1;
    this.mViewHeight = paramInt2;
    if (this.mSaveSurfaceTexture != null)
    {
      this.mTextureView.setSurfaceTexture(this.mSaveSurfaceTexture);
      this.mSaveSurfaceTexture = null;
      runOnDraw(new Runnable()
      {
        public void run()
        {
          if (TXCVideoRender.this.mTextureViewWraper != null) {
            TXCVideoRender.this.mTextureViewWraper.setViewSize(TXCVideoRender.this.mViewWidth, TXCVideoRender.this.mViewHeight);
          }
        }
      });
      return;
    }
    startThread();
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    try
    {
      TXCLog.w("TXCVideoRender", "play:vrender:  onSurfaceTextureDestroyed when need save texture : " + this.mNeedSaveSurfaceTexture);
      if (this.mNeedSaveSurfaceTexture) {
        this.mSaveSurfaceTexture = paramSurfaceTexture;
      }
      while (this.mSaveSurfaceTexture == null)
      {
        return true;
        this.mLastTS = 0L;
        quitThread();
      }
    }
    catch (Exception paramSurfaceTexture)
    {
      for (;;) {}
    }
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    TXCLog.w("TXCVideoRender", "play:vrender: texture size change new:" + paramInt1 + "," + paramInt2 + " old:" + this.mViewWidth + "," + this.mViewHeight);
    this.mViewWidth = paramInt1;
    this.mViewHeight = paramInt2;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCVideoRender.this.mTextureViewWraper != null) {
          TXCVideoRender.this.mTextureViewWraper.setViewSize(TXCVideoRender.this.mViewWidth, TXCVideoRender.this.mViewHeight);
        }
      }
    });
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public void onTouchFocus(float paramFloat1, float paramFloat2)
  {
    if (this.mTextureViewWraper != null) {
      this.mTextureViewWraper.onTouchFocus((int)paramFloat1, (int)paramFloat2);
    }
  }
  
  public void renderTexture(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    GLES20.glViewport(0, 0, this.mViewWidth, this.mViewHeight);
    if (this.mLocalRender != null) {
      this.mLocalRender.drawFrame(paramInt1, paramBoolean, paramInt4);
    }
    adjustVideoSize(paramInt2, paramInt3);
  }
  
  public void renderYuvFrame(long paramLong, int paramInt1, int paramInt2)
  {
    try
    {
      this.mYuvBytesList.add(Long.valueOf(paramLong));
      adjustVideoSize(paramInt1, paramInt2);
      checkRenderStats();
      return;
    }
    finally {}
  }
  
  public void resetRenderStats()
  {
    this.mRenderStats.firstFrameRenderTS = 0L;
    this.mRenderStats.blockCount = 0L;
    this.mRenderStats.blockTime = 0L;
    this.mRenderStats.totalBlockCount = 0L;
    this.mRenderStats.maxBlockDuration = 0L;
    this.mRenderStats.renderFrameCount = 0L;
    this.mRenderStats.videoWidth = 0;
    this.mRenderStats.videoHeight = 0;
  }
  
  public void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mRenderTask)
    {
      this.mRenderTask.add(paramRunnable);
      return;
    }
  }
  
  public void setListener(TXIVideoRenderListener paramTXIVideoRenderListener)
  {
    this.mListener = paramTXIVideoRenderListener;
  }
  
  public void setNotifyListener(TXINotifyListener paramTXINotifyListener)
  {
    this.mNotifytener = new WeakReference(paramTXINotifyListener);
  }
  
  public void setRenderMode(final int paramInt)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCVideoRender.this.mTextureViewWraper != null) {
          TXCVideoRender.this.mTextureViewWraper.setRenderMode(paramInt);
        }
      }
    });
  }
  
  public void setRenderRotation(final int paramInt)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCVideoRender.this.mTextureViewWraper != null) {
          TXCVideoRender.this.mTextureViewWraper.setRenderRotation(paramInt);
        }
      }
    });
  }
  
  public void setRetainSurfaceTexture(boolean paramBoolean)
  {
    this.mNeedSaveSurfaceTexture = paramBoolean;
  }
  
  public void setTextureListener(TXIVideoRenderTextureListener paramTXIVideoRenderTextureListener)
  {
    this.mTextureListener = paramTXIVideoRenderTextureListener;
  }
  
  public void setVideoSize(int paramInt1, int paramInt2)
  {
    adjustVideoSize(paramInt1, paramInt2);
  }
  
  void setView(TextureView paramTextureView)
  {
    int j = 0;
    int i;
    if ((this.mTextureView != null) || (paramTextureView == null))
    {
      i = j;
      if (this.mTextureView != null)
      {
        i = j;
        if (this.mTextureView.equals(paramTextureView)) {}
      }
    }
    else
    {
      i = 1;
    }
    TXCLog.w("TXCVideoRender", "play:vrender: set video view @old=" + this.mTextureView + ",new=" + paramTextureView);
    if (i != 0)
    {
      this.mTextureView = paramTextureView;
      if (this.mTextureView != null)
      {
        this.mViewWidth = this.mTextureView.getWidth();
        this.mViewHeight = this.mTextureView.getHeight();
        this.mTextureViewWraper = new TXCTextureViewWrapper(this.mTextureView);
        this.mTextureViewWraper.setVideoSize(this.mVideoWidth, this.mVideoHeight);
        this.mTextureViewWraper.setViewSize(this.mViewWidth, this.mViewHeight);
        this.mTextureView.setSurfaceTextureListener(this);
        this.mSaveSurfaceTexture = null;
        quitThread();
        if (this.mTextureView.isAvailable()) {
          startThread();
        }
      }
    }
  }
  
  public void setYuvRenderTextureListener(TXIYuvRenderTextureListener paramTXIYuvRenderTextureListener)
  {
    this.mYuvTextureListener = paramTXIYuvRenderTextureListener;
    if ((paramTXIYuvRenderTextureListener != null) && (this.mYuvTextureRender != null)) {
      this.mYuvTextureRender.setHasFrameBuffer(this.mVideoWidth, this.mVideoHeight);
    }
  }
  
  public void setup(TextureView paramTextureView)
  {
    setView(paramTextureView);
  }
  
  public void start()
  {
    this.mNeedSaveSurfaceTexture = true;
    this.mRenderFirstFrame = false;
    this.mLastTS = 0L;
    resetRenderStats();
  }
  
  public void stop()
  {
    this.mRenderFirstFrame = false;
    this.mNeedSaveSurfaceTexture = false;
  }
  
  public static class RenderStats
  {
    public long blockCount;
    public long blockTime;
    public long firstFrameRenderTS;
    public long maxBlockDuration;
    public long renderFrameCount;
    public long totalBlockCount;
    public int videoHeight;
    public int videoWidth;
  }
  
  public static abstract interface TXIYuvRenderTextureListener
  {
    public abstract void onTextureProcess(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCVideoRender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */