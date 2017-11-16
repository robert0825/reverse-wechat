package com.tencent.liteav.beauty;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.listener.TXINotifyListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.CropRect;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCGPUOESTextureFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils.OnDrawTaskHandler;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.egl.gles_EGL10.EglCore;
import com.tencent.liteav.beauty.egl.gles_EGL10.WindowSurface;
import com.tencent.liteav.beauty.gpu_filters.SemaphoreHandle;
import com.tencent.liteav.beauty.gpu_filters.TXCBeautyInterFace;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUBeautyFilter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUGaussianBlurFilter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUGreenScreenFilter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUI4202RGBAFilter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPULoopupFilter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUPituInterface;
import com.tencent.liteav.beauty.gpu_filters.TXCGPURGBA2I420Filter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUWatermarkFilter;
import com.tencent.liteav.beauty.gpu_filters.beauty2.TXCBeauty2Filter;
import com.tencent.liteav.beauty.gpu_filters.beauty3.TXCBeauty3Filter;
import com.tencent.liteav.builds.TXCBuildsUtil;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TXCFilterDrawer
  extends HandlerThread
{
  private static final int ASYNC_CALL_FAIL = -1;
  private static final int ASYNC_CALL_INIT = 0;
  private static final int ASYNC_CALL_SUCCESS = 1;
  private static final String TAG = "TXCFilterDrawer";
  private int FACE_RECOGNISE_FAILED = 0;
  private int FACE_RECOGNISE_SUCCESS = 1;
  private int FACE_RECOGNISE_UNKNOW = -1;
  private final int FRAMES_COUNT_FPS = 100;
  private final float SECOND_TO_MSEC = 1000.0F;
  private TXCBeautyInterFace mBeautyFilter = null;
  private int mBeautyLevel = 0;
  private int mBeautyStyle = 0;
  private Bitmap mBitmapLookupFilter = null;
  private int mBrightnessLevel = 0;
  private int mChinSlimLevel = 0;
  private Context mContext = null;
  private CropRect mCropRect = null;
  private EglCore mEglCore = null;
  boolean mEnableMotionTmpl = false;
  private TXINotifyListener mEventNotifyLister = null;
  private TXCGPUOESTextureFilter mExtFilter = null;
  private int mEyeScaleLevel = 0;
  private int mFaceRecogniseResult = this.FACE_RECOGNISE_UNKNOW;
  private int mFaceShortenLevel = 0;
  private int mFaceSlimLevel = 0;
  private int mFaceVlevel = 0;
  protected int[] mFrameBuffer = null;
  protected int[] mFrameBufferTexture = null;
  private TXCGPUGaussianBlurFilter mGaussianBlurFilter = null;
  private TXCGPUGreenScreenFilter mGreenScreenFilter = null;
  private boolean mGreenScreenLooping = true;
  private String mGreenScreenPath;
  private Handler mHandler;
  private boolean mHasGLContext;
  private TXCGPUI4202RGBAFilter mI4202RGBAFilter = null;
  private int mInputAngle = 0;
  private TXCGPUFilter mInputCropFilter = null;
  private int mInputFormat = 0;
  private int mInputHeight = -1;
  private float[] mInputMatrix;
  private int mInputWidth = -1;
  private WindowSurface mInputWindowSurface = null;
  private boolean mInputXMirror = false;
  private boolean mIsOesTexture;
  private TXCGPULoopupFilter mLookupFilter = null;
  private List<TXCVideoPreprocessor.WaterMakeTag> mMarkList = null;
  private TXCGPUPituInterface mMotionFilter = null;
  private String mMotionTmpl;
  private int mNoseScaleLevel = 0;
  private int mOriginHeight = -1;
  private int mOriginWidth = -1;
  private int mOutPutFormat = 0;
  private int mOutputAngle = 0;
  private byte[] mOutputDataBuf = null;
  private int mOutputHeight = -1;
  private int mOutputWidth = -1;
  private TXCGPUFilter mOutputZoomFilter = null;
  private int mProcessHeight = -1;
  private TXIVideoPreprocessorListener mProcessListener = null;
  private int mProcessWidth = -1;
  private TXCGPURGBA2I420Filter mRGBA2I420Filter = null;
  SemaphoreHandle mReleaseSemaphore = new SemaphoreHandle();
  private Object mResetInputMatrixLock = new Object();
  SemaphoreHandle mResetInputMatrixSemaphore = new SemaphoreHandle();
  private Object mResetOutputMatrixLock = new Object();
  SemaphoreHandle mResetOutputMatrixSemaphore = new SemaphoreHandle();
  private int mRuddyLevel = 0;
  private final Queue<Runnable> mRunOnDraw = new LinkedList();
  private int mSharpNessLevel = 0;
  private float mSpecialRatio = 0.5F;
  private boolean mThreadExit;
  private int mThreadFlag;
  private EGLDrawThreadHandler mThreadHandler;
  private TXCVideoPreprocessor.WaterMakeTag mWaterMarkTag = null;
  private Bitmap mWatermakeBitmap = null;
  private TXCGPUWatermarkFilter mWatermarkFilter = null;
  private byte[] m_AVsdkDataBuf = null;
  private boolean m_bFirstFrame = false;
  private boolean m_bInitEGLDone = false;
  private int m_iRealFps = 0;
  private long m_lStartTime = 0L;
  private int[] m_pbo0 = null;
  private TXCOpenGlUtils.OnDrawTaskHandler onDrawHandler = new TXCOpenGlUtils.OnDrawTaskHandler()
  {
    public void addOnDrawTask(Runnable paramAnonymousRunnable)
    {
      TXCFilterDrawer.this.runOnDraw(paramAnonymousRunnable);
    }
  };
  
  TXCFilterDrawer(Context paramContext, boolean paramBoolean)
  {
    super("TXCFilterDrawer");
    this.mContext = paramContext;
    this.mHandler = new Handler(this.mContext.getMainLooper());
    this.mHasGLContext = paramBoolean;
  }
  
  private void createBeautyFilter(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.mBeautyFilter == null)
    {
      TXCLog.i("TXCFilterDrawer", "create Beauty Filter!");
      if (paramInt3 != 0) {
        break label124;
      }
      this.mBeautyFilter = new TXCBeauty2Filter();
    }
    for (;;)
    {
      this.mBeautyFilter.setHasFrameBuffer(true);
      if (true != this.mBeautyFilter.init(paramInt1, paramInt2)) {
        break;
      }
      if (this.mBeautyLevel > 0) {
        this.mBeautyFilter.setBeautyLevel(this.mBeautyLevel);
      }
      if (this.mBrightnessLevel > 0) {
        this.mBeautyFilter.setWhitenessLevel(this.mBrightnessLevel);
      }
      if (this.mRuddyLevel > 0) {
        this.mBeautyFilter.setRuddyLevel(this.mRuddyLevel);
      }
      if (this.mSharpNessLevel > 0) {
        this.mBeautyFilter.setShapenLevel(this.mSharpNessLevel);
      }
      return;
      label124:
      if (1 == paramInt3) {
        this.mBeautyFilter = new TXCBeauty3Filter();
      } else if (2 == paramInt3) {
        this.mBeautyFilter = new TXCGPUBeautyFilter();
      }
    }
    TXCLog.e("TXCFilterDrawer", "mBeautyFilter init failed!");
  }
  
  private void createDrawFrameBuffer(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2)
  {
    GLES20.glGenFramebuffers(1, paramArrayOfInt1, 0);
    paramArrayOfInt2[0] = TXCOpenGlUtils.createTexture(paramInt1, paramInt2, 6408, 6408, paramArrayOfInt2);
    GLES20.glBindFramebuffer(36160, paramArrayOfInt1[0]);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, paramArrayOfInt2[0], 0);
    GLES20.glBindFramebuffer(36160, 0);
  }
  
  private void createOESFilter(int paramInt1, int paramInt2)
  {
    if (this.mExtFilter == null)
    {
      this.mExtFilter = new TXCGPUOESTextureFilter();
      this.mExtFilter.setHasFrameBuffer(true);
      if (!this.mExtFilter.init())
      {
        TXCLog.e("TXCFilterDrawer", "mExtFilter init failed!");
        this.mExtFilter.destroy();
        this.mExtFilter = null;
      }
    }
    else
    {
      return;
    }
    this.mExtFilter.setAttribPointer(TXCTextureRotationUtil.CUBE, TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, false));
    this.mExtFilter.onOutputSizeChanged(paramInt1, paramInt2);
  }
  
  private boolean excuteInitYUVFilter(TXCVideoPreprocessor.InitConfig paramInitConfig)
  {
    if (((1 == paramInitConfig.inputFormat) || (3 == paramInitConfig.inputFormat) || (2 == paramInitConfig.inputFormat)) && (this.mI4202RGBAFilter == null))
    {
      this.mI4202RGBAFilter = new TXCGPUI4202RGBAFilter(paramInitConfig.inputFormat);
      this.mI4202RGBAFilter.setHasFrameBuffer(true);
      if (!this.mI4202RGBAFilter.init())
      {
        TXCLog.e("TXCFilterDrawer", "mI4202RGBAFilter init failed!!, break init");
        return false;
      }
      this.mI4202RGBAFilter.onOutputSizeChanged(paramInitConfig.mOriginWidth, paramInitConfig.mOriginHeight);
    }
    if (((1 == paramInitConfig.outputFormat) || (3 == paramInitConfig.outputFormat) || (2 == paramInitConfig.outputFormat)) && (this.mRGBA2I420Filter == null))
    {
      this.mRGBA2I420Filter = new TXCGPURGBA2I420Filter(paramInitConfig.outputFormat);
      if (!this.mRGBA2I420Filter.init())
      {
        TXCLog.e("TXCFilterDrawer", "mRGBA2I420Filter init failed!!, break init");
        return false;
      }
      this.mRGBA2I420Filter.onOutputSizeChanged(paramInitConfig.mOutputWidht, paramInitConfig.mOutputHeight);
    }
    return true;
  }
  
  private void excuteResetOutputRotateMatrix(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    Object localObject1 = this.mResetOutputMatrixLock;
    paramInt3 = (paramInt6 - paramInt3 + 360) % 360;
    for (;;)
    {
      try
      {
        TXCLog.i("TXCFilterDrawer", "real outputAngle " + paramInt3);
        if (this.mOutputZoomFilter == null)
        {
          if ((paramInt1 == paramInt4) && (paramInt2 == paramInt5) && (paramInt3 == 0))
          {
            TXCLog.i("TXCFilterDrawer", "Don't need change output Image, don't create out filter!");
            return;
          }
          this.mOutputZoomFilter = new TXCGPUFilter();
          if (true == this.mOutputZoomFilter.init()) {
            this.mOutputZoomFilter.setHasFrameBuffer(true);
          }
        }
        else
        {
          this.mOutputZoomFilter.onOutputSizeChanged(paramInt4, paramInt5);
          this.mOutputZoomFilter.setZoomAndRotate((720 - paramInt3) % 360, null);
          return;
        }
      }
      finally {}
      TXCLog.e("TXCFilterDrawer", "mOutputZoomFilter init failed!");
    }
  }
  
  private int getOutputFormatData(int paramInt)
  {
    if (this.mOutPutFormat == 0)
    {
      if (this.mProcessListener != null) {
        this.mProcessListener.didProcessFrame(paramInt, this.mOutputWidth, this.mOutputHeight, TXCTimeUtil.getTimeTick());
      }
      return paramInt;
    }
    if ((1 == this.mOutPutFormat) || (3 == this.mOutPutFormat) || (2 == this.mOutPutFormat))
    {
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      if (this.mRGBA2I420Filter == null)
      {
        TXCLog.e("TXCFilterDrawer", "mRGBA2I420Filter is null!");
        return paramInt;
      }
      GLES20.glBindFramebuffer(36160, this.mFrameBuffer[0]);
      this.mRGBA2I420Filter.onDrawFrame(paramInt);
      if (2 == this.mOutPutFormat) {
        readGLRawData(this.mOutputWidth, this.mOutputHeight);
      }
      for (;;)
      {
        GLES20.glBindFramebuffer(36160, 0);
        return paramInt;
        readGLRawData(this.mOutputWidth, this.mOutputHeight * 3 / 8);
      }
    }
    TXCLog.e("TXCFilterDrawer", "Don't support format!");
    return -1;
  }
  
  private void initFiltersBasedPitu()
  {
    if ((this.mMotionFilter == null) && (((this.mMotionTmpl != null) && (this.mMotionTmpl.compareTo("") != 0)) || (this.mEyeScaleLevel != 0) || (this.mFaceSlimLevel != 0) || (this.mFaceVlevel != 0) || (this.mFaceShortenLevel != 0) || (this.mChinSlimLevel != 0) || (this.mNoseScaleLevel != 0)))
    {
      this.mMotionFilter = TXCBuildsUtil.createMotionFilter(this.mContext);
      this.mMotionFilter.init();
      this.mMotionFilter.onOutputSizeChanged(this.mProcessWidth, this.mProcessHeight);
      this.mMotionFilter.changeMotionTmpl(this.mMotionTmpl);
      this.mMotionFilter.setEyeScaleLevel(this.mEyeScaleLevel);
      this.mMotionFilter.setFaceSlim(this.mFaceSlimLevel);
      this.mMotionFilter.setFaceVLevel(this.mFaceVlevel);
      this.mMotionFilter.setFaceShortLevel(this.mFaceShortenLevel);
      this.mMotionFilter.setChinLevel(this.mChinSlimLevel);
      this.mMotionFilter.setNoseSlimLevel(this.mNoseScaleLevel);
    }
    if ((this.mMotionTmpl == null) || (this.mMotionTmpl.compareTo("") == 0))
    {
      this.mEnableMotionTmpl = false;
      return;
    }
    this.mEnableMotionTmpl = true;
  }
  
  private boolean initInternal(TXCVideoPreprocessor.InitConfig paramInitConfig)
  {
    TXCLog.i("TXCFilterDrawer", "come into initInternal");
    releaseInternal();
    this.mHasGLContext = paramInitConfig.mHasGLContext;
    this.mOriginWidth = paramInitConfig.mOriginWidth;
    this.mOriginHeight = paramInitConfig.mOriginHeight;
    this.mCropRect = paramInitConfig.mCropRect;
    this.mInputWidth = paramInitConfig.mInputWidth;
    this.mInputHeight = paramInitConfig.mInputHeight;
    this.mInputAngle = paramInitConfig.mInputAngle;
    this.mInputXMirror = paramInitConfig.mInputXMirror;
    this.mOutputWidth = paramInitConfig.mOutputWidht;
    this.mOutputHeight = paramInitConfig.mOutputHeight;
    this.mOutputAngle = paramInitConfig.mOutputAngle;
    this.mProcessWidth = paramInitConfig.mInputWidth;
    this.mProcessHeight = paramInitConfig.mInputHeight;
    if ((this.mInputAngle == 90) || (this.mInputAngle == 270))
    {
      this.mProcessWidth = paramInitConfig.mInputHeight;
      this.mProcessHeight = paramInitConfig.mInputWidth;
    }
    this.mOutPutFormat = paramInitConfig.outputFormat;
    this.mInputFormat = paramInitConfig.inputFormat;
    this.mOutputDataBuf = new byte[this.mOutputWidth * this.mOutputHeight * 4];
    createBeautyFilter(this.mProcessWidth, this.mProcessHeight, this.mBeautyStyle);
    if ((this.mWaterMarkTag != null) && (this.mWaterMarkTag.bitmap != null) && (this.mWatermarkFilter == null))
    {
      TXCLog.i("TXCFilterDrawer", "reset water mark!");
      setWaterMark(this.mWaterMarkTag.bitmap, this.mWaterMarkTag.xOffset, this.mWaterMarkTag.yOffset, this.mWaterMarkTag.fWidth);
    }
    boolean bool;
    if ((this.mBitmapLookupFilter != null) && (this.mLookupFilter == null))
    {
      this.mLookupFilter = new TXCGPULoopupFilter(this.mBitmapLookupFilter);
      bool = this.mLookupFilter.init();
      if (true == bool)
      {
        this.mLookupFilter.setHasFrameBuffer(true);
        this.mLookupFilter.onOutputSizeChanged(this.mProcessWidth, this.mProcessHeight);
      }
    }
    for (;;)
    {
      setCrop(this.mCropRect, this.mInputWidth, this.mInputHeight, this.mProcessWidth, this.mProcessHeight, this.mInputXMirror, this.mInputAngle, this.mInputFormat);
      excuteResetOutputRotateMatrix(this.mProcessWidth, this.mProcessHeight, this.mInputAngle, this.mOutputWidth, this.mOutputHeight, this.mOutputAngle);
      if (!bool)
      {
        TXCLog.e("TXCFilterDrawer", "initInternal failed! releaseInternal!");
        releaseInternal();
      }
      if (this.mFrameBuffer == null)
      {
        this.mFrameBuffer = new int[1];
        label423:
        if (this.mFrameBufferTexture != null) {
          break label535;
        }
        this.mFrameBufferTexture = new int[1];
        label437:
        createDrawFrameBuffer(this.mFrameBuffer, this.mFrameBufferTexture, this.mOutputWidth, this.mOutputHeight);
        if (3 == TXCOpenGlUtils.getOpenGLVersion())
        {
          if (this.m_pbo0 != null) {
            break label547;
          }
          this.m_pbo0 = new int[1];
        }
      }
      for (;;)
      {
        TXCLog.i("TXCFilterDrawer", "opengl es 3.0, use PBO");
        TXCOpenGlUtils.createPBO(this.mInputWidth, this.mInputHeight, this.m_pbo0);
        TXCLog.i("TXCFilterDrawer", "come out initInternal");
        return bool;
        TXCLog.e("TXCFilterDrawer", "mLookupFilter init failed!");
        break;
        GLES20.glDeleteFramebuffers(1, this.mFrameBuffer, 0);
        break label423;
        label535:
        GLES20.glDeleteTextures(1, this.mFrameBufferTexture, 0);
        break label437;
        label547:
        TXCLog.i("TXCFilterDrawer", "m_pbo0 is not null, delete Buffers, and recreate");
        GLES30.glDeleteBuffers(1, this.m_pbo0, 0);
      }
      bool = true;
    }
  }
  
  private void initPituSDK()
  {
    if (!TXCBuildsUtil._PituInit)
    {
      this.mHandler.post(new Runnable()
      {
        public void run()
        {
          if ((!TXCBuildsUtil._PituInit) && (TXCBuildsUtil.initMotionSdk(TXCFilterDrawer.this.mContext))) {
            TXCFilterDrawer.this.runOnDraw(new Runnable()
            {
              public void run()
              {
                TXCFilterDrawer.this.initFiltersBasedPitu();
              }
            });
          }
        }
      });
      return;
    }
    initFiltersBasedPitu();
  }
  
  private int onDraw(int paramInt)
  {
    GLES20.glViewport(0, 0, this.mOriginWidth, this.mOriginHeight);
    return onDrawToTexture(this.mI4202RGBAFilter.onDrawToTexture(), paramInt);
  }
  
  private int readGLRawData(int paramInt1, int paramInt2)
  {
    Object localObject = null;
    if (true == this.mHasGLContext) {
      if (this.mProcessListener != null)
      {
        NativeLoad.getInstance();
        NativeLoad.nativeGlReadPixs(paramInt1, paramInt2, this.mOutputDataBuf);
        this.mProcessListener.didProcessFrame(this.mOutputDataBuf, this.mOutputWidth, this.mOutputHeight, this.mOutPutFormat, TXCTimeUtil.getTimeTick());
      }
    }
    for (;;)
    {
      return 0;
      if (this.m_AVsdkDataBuf != null)
      {
        NativeLoad.getInstance();
        NativeLoad.nativeGlReadPixs(paramInt1, paramInt2, this.m_AVsdkDataBuf);
        continue;
        if (3 == TXCOpenGlUtils.getOpenGLVersion())
        {
          if (0L == this.m_lStartTime) {
            this.m_lStartTime = TXCTimeUtil.getTimeTick();
          }
          int i = this.m_iRealFps + 1;
          this.m_iRealFps = i;
          if (i >= 100)
          {
            float f = 100.0F / ((float)(TXCTimeUtil.getTimeTick() - this.m_lStartTime) / 1000.0F);
            TXCLog.i("TXCFilterDrawer", "Real fps " + f);
            this.m_iRealFps = 0;
            this.m_lStartTime = TXCTimeUtil.getTimeTick();
          }
          GLES30.glPixelStorei(3333, 1);
          if (Build.VERSION.SDK_INT >= 18) {
            GLES30.glReadBuffer(1029);
          }
          GLES30.glBindBuffer(35051, this.m_pbo0[0]);
          NativeLoad.getInstance();
          NativeLoad.nativeGlReadPixs(paramInt1, paramInt2, null);
          if (Build.VERSION.SDK_INT >= 18)
          {
            ByteBuffer localByteBuffer = (ByteBuffer)GLES30.glMapBufferRange(35051, 0, paramInt1 * paramInt2 * 4, 1);
            localObject = localByteBuffer;
            if (localByteBuffer == null)
            {
              TXCLog.e("TXCFilterDrawer", "glMapBufferRange is null");
              return -1;
            }
          }
          NativeLoad.getInstance();
          NativeLoad.nativeGlMapBufferToQueue(paramInt1, paramInt2, (ByteBuffer)localObject);
          if (Build.VERSION.SDK_INT >= 18) {
            GLES30.glUnmapBuffer(35051);
          }
          GLES30.glBindBuffer(35051, 0);
        }
        else
        {
          NativeLoad.getInstance();
          NativeLoad.nativeGlReadPixsToQueue(paramInt1, paramInt2);
        }
      }
    }
  }
  
  private void readPixelFromQueue(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (!paramBoolean) {
      if (this.mProcessListener != null) {
        this.mProcessListener.didProcessFrame(paramArrayOfByte, this.mOutputWidth, this.mOutputHeight, this.mOutPutFormat, TXCTimeUtil.getTimeTick());
      }
    }
    int i;
    do
    {
      return;
      TXCLog.i("TXCFilterDrawer", "First Frame, don't process!");
      return;
      i = this.mOutputHeight * 3 / 8;
      if (2 == this.mOutPutFormat) {
        i = this.mOutputHeight;
      }
      if (this.mProcessListener != null)
      {
        NativeLoad.getInstance();
        if (true == NativeLoad.nativeGlReadPixsFromQueue(this.mOutputWidth, i, this.mOutputDataBuf))
        {
          this.mProcessListener.didProcessFrame(this.mOutputDataBuf, this.mOutputWidth, this.mOutputHeight, this.mOutPutFormat, TXCTimeUtil.getTimeTick());
          return;
        }
        TXCLog.d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
        this.mProcessListener.didProcessFrame(paramArrayOfByte, this.mOutputWidth, this.mOutputHeight, this.mOutPutFormat, TXCTimeUtil.getTimeTick());
        return;
      }
      NativeLoad.getInstance();
    } while (NativeLoad.nativeGlReadPixsFromQueue(this.mOutputWidth, i, this.m_AVsdkDataBuf));
    TXCLog.d("TXCFilterDrawer", "nativeGlReadPixsFromQueue Failed");
  }
  
  private void releaseBeautyFilter()
  {
    if (this.mBeautyFilter != null)
    {
      this.mBeautyFilter.destroy();
      this.mBeautyFilter = null;
    }
  }
  
  private void releaseInternal()
  {
    TXCLog.i("TXCFilterDrawer", "come into releaseInternal");
    this.m_bFirstFrame = false;
    if (this.mI4202RGBAFilter != null)
    {
      this.mI4202RGBAFilter.destroy();
      this.mI4202RGBAFilter = null;
    }
    if (this.mRGBA2I420Filter != null)
    {
      this.mRGBA2I420Filter.destroy();
      this.mRGBA2I420Filter = null;
    }
    releaseBeautyFilter();
    if (this.mLookupFilter != null)
    {
      this.mLookupFilter.destroy();
      this.mLookupFilter = null;
    }
    if (this.mMotionFilter != null)
    {
      this.mMotionFilter.destroy();
      this.mMotionFilter = null;
    }
    if (this.mExtFilter != null)
    {
      this.mExtFilter.destroy();
      this.mExtFilter = null;
    }
    if (this.mInputCropFilter != null)
    {
      this.mInputCropFilter.destroy();
      this.mInputCropFilter = null;
    }
    if (this.mOutputZoomFilter != null)
    {
      this.mOutputZoomFilter.destroy();
      this.mOutputZoomFilter = null;
    }
    if (this.mWatermarkFilter != null)
    {
      this.mWatermarkFilter.destroy();
      this.mWatermarkFilter = null;
    }
    if (this.mGreenScreenFilter != null)
    {
      this.mGreenScreenFilter.destroy();
      this.mGreenScreenFilter = null;
    }
    if (this.mGaussianBlurFilter != null)
    {
      this.mGaussianBlurFilter.destroy();
      this.mGaussianBlurFilter = null;
    }
    if (this.mFrameBuffer != null)
    {
      GLES20.glDeleteFramebuffers(1, this.mFrameBuffer, 0);
      this.mFrameBuffer = null;
    }
    if (this.mFrameBufferTexture != null)
    {
      GLES20.glDeleteTextures(1, this.mFrameBufferTexture, 0);
      this.mFrameBufferTexture = null;
    }
    this.mWaterMarkTag = null;
    TXCLog.i("TXCFilterDrawer", "come out releaseInternal");
  }
  
  private void releaseMotionFilter()
  {
    if ((this.mMotionTmpl == null) && (this.mEyeScaleLevel <= 0) && (this.mFaceSlimLevel <= 0) && (this.mFaceVlevel <= 0) && (this.mFaceShortenLevel <= 0) && (this.mChinSlimLevel <= 0) && (this.mNoseScaleLevel <= 0) && (this.mMotionFilter != null))
    {
      this.mMotionFilter.destroy();
      this.mMotionFilter = null;
    }
  }
  
  private void runAll(Queue<Runnable> paramQueue)
  {
    for (;;)
    {
      Runnable localRunnable = null;
      try
      {
        if (!paramQueue.isEmpty()) {
          localRunnable = (Runnable)paramQueue.poll();
        }
        if (localRunnable != null) {
          localRunnable.run();
        }
      }
      finally {}
    }
  }
  
  private void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mRunOnDraw)
    {
      this.mRunOnDraw.add(paramRunnable);
      return;
    }
  }
  
  private void setCrop(CropRect paramCropRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6)
  {
    if (this.mInputCropFilter == null)
    {
      TXCLog.i("TXCFilterDrawer", "Create CropFilter");
      if (4 == paramInt6)
      {
        this.mInputCropFilter = new TXCGPUFilter("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", true);
        if (true != this.mInputCropFilter.init()) {
          break label176;
        }
        this.mInputCropFilter.setHasFrameBuffer(true);
      }
    }
    else
    {
      label58:
      this.mInputCropFilter.onOutputSizeChanged(paramInt3, paramInt4);
      paramCropRect = this.mInputCropFilter.setCropRect(this.mOriginWidth, this.mOriginHeight, null, paramCropRect, paramInt6);
      paramInt6 = (720 - paramInt5) % 360;
      if ((paramInt6 != 90) && (paramInt6 != 270)) {
        break label187;
      }
    }
    label176:
    label187:
    for (paramInt5 = paramInt4;; paramInt5 = paramInt3)
    {
      if ((paramInt6 == 90) || (paramInt6 == 270)) {
        paramInt4 = paramInt3;
      }
      this.mInputCropFilter.scaleClipAndRotate(paramInt1, paramInt2, paramInt6, paramCropRect, paramInt5 / paramInt4, paramBoolean, false);
      return;
      this.mInputCropFilter = new TXCGPUFilter();
      break;
      TXCLog.e("TXCFilterDrawer", "mInputCropFilter init failed!");
      break label58;
    }
  }
  
  private void setYUVRenderData(byte[] paramArrayOfByte)
  {
    if (this.mI4202RGBAFilter == null)
    {
      TXCLog.e("TXCFilterDrawer", "mI4202RGBAFilter is null!");
      return;
    }
    this.mI4202RGBAFilter.setRenderBuffer(paramArrayOfByte);
  }
  
  /* Error */
  public boolean init(TXCVideoPreprocessor.InitConfig paramInitConfig)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_1
    //   3: istore_2
    //   4: aload_1
    //   5: getfield 672	com/tencent/liteav/beauty/TXCVideoPreprocessor$InitConfig:mHasGLContext	Z
    //   8: ifne +57 -> 65
    //   11: aload_0
    //   12: getfield 889	com/tencent/liteav/beauty/TXCFilterDrawer:mThreadHandler	Lcom/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler;
    //   15: ifnonnull +27 -> 42
    //   18: aload_0
    //   19: invokevirtual 892	com/tencent/liteav/beauty/TXCFilterDrawer:start	()V
    //   22: aload_0
    //   23: new 36	com/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler
    //   26: dup
    //   27: aload_0
    //   28: aload_0
    //   29: invokevirtual 895	com/tencent/liteav/beauty/TXCFilterDrawer:getLooper	()Landroid/os/Looper;
    //   32: aload_0
    //   33: getfield 179	com/tencent/liteav/beauty/TXCFilterDrawer:mContext	Landroid/content/Context;
    //   36: invokespecial 898	com/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler:<init>	(Lcom/tencent/liteav/beauty/TXCFilterDrawer;Landroid/os/Looper;Landroid/content/Context;)V
    //   39: putfield 889	com/tencent/liteav/beauty/TXCFilterDrawer:mThreadHandler	Lcom/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler;
    //   42: aload_0
    //   43: getfield 889	com/tencent/liteav/beauty/TXCFilterDrawer:mThreadHandler	Lcom/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler;
    //   46: iconst_0
    //   47: aload_1
    //   48: invokevirtual 902	com/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   51: invokevirtual 907	android/os/Message:sendToTarget	()V
    //   54: aload_0
    //   55: getfield 889	com/tencent/liteav/beauty/TXCFilterDrawer:mThreadHandler	Lcom/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler;
    //   58: invokevirtual 910	com/tencent/liteav/beauty/TXCFilterDrawer$EGLDrawThreadHandler:waitForHandleMessage	()V
    //   61: aload_0
    //   62: monitorexit
    //   63: iload_2
    //   64: ireturn
    //   65: aload_0
    //   66: aload_1
    //   67: invokespecial 381	com/tencent/liteav/beauty/TXCFilterDrawer:initInternal	(Lcom/tencent/liteav/beauty/TXCVideoPreprocessor$InitConfig;)Z
    //   70: istore_2
    //   71: goto -10 -> 61
    //   74: astore_1
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	TXCFilterDrawer
    //   0	79	1	paramInitConfig	TXCVideoPreprocessor.InitConfig
    //   3	68	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	42	74	finally
    //   42	61	74	finally
    //   65	71	74	finally
  }
  
  public boolean initYUVFilter(TXCVideoPreprocessor.InitConfig paramInitConfig)
  {
    if (!this.mHasGLContext)
    {
      if (this.mThreadHandler == null)
      {
        TXCLog.e("TXCFilterDrawer", "mThreadHandler is null!");
        return false;
      }
      this.mThreadHandler.obtainMessage(5, 0, 0, paramInitConfig).sendToTarget();
    }
    for (;;)
    {
      return true;
      excuteInitYUVFilter(paramInitConfig);
    }
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2)
  {
    runAll(this.mRunOnDraw);
    GLES20.glViewport(0, 0, this.mProcessWidth, this.mProcessHeight);
    int i = paramInt1;
    if (this.mInputCropFilter != null)
    {
      if (4 == paramInt2) {
        this.mInputCropFilter.setTextureTransformMatrix(this.mInputMatrix);
      }
      i = this.mInputCropFilter.onDrawToTexture(paramInt1);
    }
    GLES20.glViewport(0, 0, this.mProcessWidth, this.mProcessHeight);
    paramInt1 = i;
    if (this.mBeautyFilter != null) {
      if ((this.mBeautyLevel <= 0) && (this.mBrightnessLevel <= 0))
      {
        paramInt1 = i;
        if (this.mRuddyLevel <= 0) {}
      }
      else
      {
        paramInt1 = this.mBeautyFilter.onDrawToTexture(i);
      }
    }
    paramInt2 = paramInt1;
    if (this.mLookupFilter != null) {
      paramInt2 = this.mLookupFilter.onDrawToTexture(paramInt1);
    }
    GLES20.glViewport(0, 0, this.mProcessWidth, this.mProcessHeight);
    i = paramInt2;
    if (this.mGreenScreenFilter != null) {
      i = this.mGreenScreenFilter.onDrawToTexture(paramInt2);
    }
    paramInt1 = i;
    if (this.mGaussianBlurFilter != null) {
      paramInt1 = this.mGaussianBlurFilter.onDrawToTexture(i);
    }
    paramInt2 = paramInt1;
    if (this.mProcessListener != null)
    {
      i = this.mProcessListener.willAddWatermark(paramInt1, this.mProcessWidth, this.mProcessHeight);
      paramInt2 = paramInt1;
      if (i > 0) {
        paramInt2 = i;
      }
    }
    GLES20.glViewport(0, 0, this.mProcessWidth, this.mProcessHeight);
    paramInt1 = paramInt2;
    if (this.mWatermarkFilter != null) {
      paramInt1 = this.mWatermarkFilter.onDrawToTexture(paramInt2);
    }
    paramInt2 = paramInt1;
    if (this.mOutputZoomFilter != null)
    {
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      paramInt2 = this.mOutputZoomFilter.onDrawToTexture(paramInt1);
    }
    getOutputFormatData(paramInt2);
    return paramInt2;
  }
  
  public int onDrawToTexture(byte[] paramArrayOfByte, int paramInt)
  {
    setAVsdkDataBuf(paramArrayOfByte);
    if (!this.mHasGLContext)
    {
      paramArrayOfByte = (byte[])paramArrayOfByte.clone();
      this.mThreadHandler.obtainMessage(2, paramArrayOfByte).sendToTarget();
      if (!this.m_bFirstFrame)
      {
        TXCLog.i("TXCFilterDrawer", "First Frame, clear queue");
        NativeLoad.getInstance();
        NativeLoad.nativeClearQueue();
      }
      this.mThreadHandler.obtainMessage(3, paramInt, 0).sendToTarget();
      readPixelFromQueue(paramArrayOfByte, this.m_bFirstFrame);
      this.m_bFirstFrame = true;
      return -1;
    }
    setYUVRenderData(paramArrayOfByte);
    return onDraw(paramInt);
  }
  
  public void release()
  {
    if (!this.mHasGLContext) {
      if (this.mThreadHandler != null) {
        this.mThreadHandler.obtainMessage(1).sendToTarget();
      }
    }
    try
    {
      this.mReleaseSemaphore.release();
      return;
    }
    catch (InterruptedException localInterruptedException) {}
    releaseInternal();
    return;
  }
  
  public void resetFrameIndex()
  {
    this.m_bFirstFrame = false;
  }
  
  public void setAVsdkDataBuf(byte[] paramArrayOfByte)
  {
    this.m_AVsdkDataBuf = paramArrayOfByte;
  }
  
  public void setBeautyLevel(final int paramInt)
  {
    this.mBeautyLevel = paramInt;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (paramInt > 0) {
          ReportDuaManage.getInstance().reportBeautyDua();
        }
        if ((TXCFilterDrawer.this.mBeautyFilter != null) && (paramInt >= 0)) {
          TXCFilterDrawer.this.mBeautyFilter.setBeautyLevel(paramInt);
        }
      }
    });
  }
  
  public void setBeautyStyle(final int paramInt)
  {
    if ((this.mBeautyStyle == paramInt) || (paramInt > 2) || (paramInt < 0)) {
      return;
    }
    this.mBeautyStyle = paramInt;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCFilterDrawer.this.releaseBeautyFilter();
        TXCFilterDrawer.this.createBeautyFilter(TXCFilterDrawer.this.mProcessWidth, TXCFilterDrawer.this.mProcessHeight, paramInt);
      }
    });
  }
  
  public void setChinLevel(int paramInt) {}
  
  public void setEyeScaleLevel(int paramInt) {}
  
  public void setFaceShortLevel(int paramInt) {}
  
  public void setFaceSlimLevel(int paramInt) {}
  
  public void setFaceVLevel(int paramInt) {}
  
  public void setFilterImage(Bitmap paramBitmap)
  {
    if (this.mBitmapLookupFilter == paramBitmap) {
      return;
    }
    this.mBitmapLookupFilter = paramBitmap;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCFilterDrawer.this.mBitmapLookupFilter != null) {
          ReportDuaManage.getInstance().reportFilterImageDua();
        }
        if (TXCFilterDrawer.this.mBitmapLookupFilter == null)
        {
          if (TXCFilterDrawer.this.mLookupFilter != null)
          {
            TXCFilterDrawer.this.mLookupFilter.destroy();
            TXCFilterDrawer.access$002(TXCFilterDrawer.this, null);
          }
          return;
        }
        if (TXCFilterDrawer.this.mLookupFilter == null)
        {
          TXCFilterDrawer.access$002(TXCFilterDrawer.this, new TXCGPULoopupFilter(TXCFilterDrawer.this.mBitmapLookupFilter));
          TXCFilterDrawer.this.mLookupFilter.init();
          TXCFilterDrawer.this.mLookupFilter.setHasFrameBuffer(true);
          TXCFilterDrawer.this.mLookupFilter.onOutputSizeChanged(TXCFilterDrawer.this.mProcessWidth, TXCFilterDrawer.this.mProcessHeight);
          return;
        }
        TXCFilterDrawer.this.mLookupFilter.setBitmap(TXCFilterDrawer.this.mBitmapLookupFilter);
      }
    });
  }
  
  public void setFilterMixLevel(final float paramFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCFilterDrawer.this.mLookupFilter != null) {
          TXCFilterDrawer.this.mLookupFilter.setIntensity(paramFloat);
        }
      }
    });
  }
  
  public void setGausBlurLevel(final float paramFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (paramFloat <= 0.0F)
        {
          if (TXCFilterDrawer.this.mGaussianBlurFilter == null) {
            break label120;
          }
          TXCFilterDrawer.this.mGaussianBlurFilter.destroy();
          TXCFilterDrawer.access$1502(TXCFilterDrawer.this, null);
        }
        label120:
        while (TXCFilterDrawer.this.mGaussianBlurFilter == null)
        {
          return;
          if (TXCFilterDrawer.this.mGaussianBlurFilter == null)
          {
            TXCFilterDrawer.access$1502(TXCFilterDrawer.this, new TXCGPUGaussianBlurFilter());
            TXCFilterDrawer.this.mGaussianBlurFilter.setHasFrameBuffer(true);
            if (!TXCFilterDrawer.this.mGaussianBlurFilter.init())
            {
              TXCLog.e("TXCFilterDrawer", "Gaussian Filter init failed!");
              return;
            }
            TXCFilterDrawer.this.mGaussianBlurFilter.onOutputSizeChanged(TXCFilterDrawer.this.mProcessWidth, TXCFilterDrawer.this.mProcessHeight);
          }
        }
        TXCFilterDrawer.this.mGaussianBlurFilter.setBlurSize(paramFloat / 4.0F);
      }
    });
  }
  
  public void setGreenScreenFile(String paramString, boolean paramBoolean) {}
  
  public void setInputMatrix(final float[] paramArrayOfFloat)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCFilterDrawer.access$102(TXCFilterDrawer.this, paramArrayOfFloat);
      }
    });
  }
  
  void setListener(TXIVideoPreprocessorListener paramTXIVideoPreprocessorListener)
  {
    TXCLog.i("TXCFilterDrawer", "set listener");
    this.mProcessListener = paramTXIVideoPreprocessorListener;
  }
  
  public void setMotionTmpl(String paramString) {}
  
  public void setNoseSlimLevel(int paramInt) {}
  
  void setNotify(TXINotifyListener paramTXINotifyListener)
  {
    TXCLog.i("TXCFilterDrawer", "set notify");
    this.mEventNotifyLister = paramTXINotifyListener;
  }
  
  public void setOutPutFormat(final int paramInt)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCFilterDrawer.access$702(TXCFilterDrawer.this, paramInt);
      }
    });
  }
  
  public void setRuddyLevel(final int paramInt)
  {
    this.mRuddyLevel = paramInt;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (paramInt > 0) {
          ReportDuaManage.getInstance().reportWhiteDua();
        }
        if ((TXCFilterDrawer.this.mBeautyFilter != null) && (paramInt >= 0)) {
          TXCFilterDrawer.this.mBeautyFilter.setRuddyLevel(paramInt);
        }
      }
    });
  }
  
  public void setSharpnessLevel(final int paramInt)
  {
    this.mSharpNessLevel = paramInt;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (paramInt > 0) {
          ReportDuaManage.getInstance().reportWhiteDua();
        }
        if ((TXCFilterDrawer.this.mBeautyFilter != null) && (paramInt >= 0)) {
          TXCFilterDrawer.this.mBeautyFilter.setShapenLevel(paramInt);
        }
      }
    });
  }
  
  public void setSwitchCameraStat()
  {
    resetFrameIndex();
  }
  
  public void setWaterMark(final Bitmap paramBitmap, final float paramFloat1, final float paramFloat2, final float paramFloat3)
  {
    if (this.mWaterMarkTag == null) {
      this.mWaterMarkTag = new TXCVideoPreprocessor.WaterMakeTag();
    }
    if ((this.mWaterMarkTag.bitmap != null) && (paramBitmap != null) && (true == this.mWaterMarkTag.bitmap.equals(paramBitmap)) && (paramFloat1 == this.mWaterMarkTag.xOffset) && (paramFloat2 == this.mWaterMarkTag.yOffset) && (paramFloat3 == this.mWaterMarkTag.fWidth)) {
      return;
    }
    this.mWaterMarkTag.bitmap = paramBitmap;
    this.mWaterMarkTag.xOffset = paramFloat1;
    this.mWaterMarkTag.yOffset = paramFloat2;
    this.mWaterMarkTag.fWidth = paramFloat3;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (paramBitmap != null) {
          ReportDuaManage.getInstance().reportWarterMarkDua();
        }
        if (paramBitmap == null)
        {
          TXCLog.i("TXCFilterDrawer", "Cancel WaterMark");
          if (TXCFilterDrawer.this.mWatermarkFilter != null)
          {
            TXCFilterDrawer.this.mWatermarkFilter.destroy();
            TXCFilterDrawer.access$202(TXCFilterDrawer.this, null);
          }
          return;
        }
        if (TXCFilterDrawer.this.mWatermarkFilter == null)
        {
          if ((TXCFilterDrawer.this.mProcessWidth <= 0) || (TXCFilterDrawer.this.mProcessHeight <= 0))
          {
            TXCLog.e("TXCFilterDrawer", "output Width and Height is error!");
            return;
          }
          TXCFilterDrawer.access$202(TXCFilterDrawer.this, new TXCGPUWatermarkFilter());
          TXCFilterDrawer.this.mWatermarkFilter.setHasFrameBuffer(true);
          if (!TXCFilterDrawer.this.mWatermarkFilter.init())
          {
            TXCLog.e("TXCFilterDrawer", "mWatermarkFilter.init failed!");
            TXCFilterDrawer.this.mWatermarkFilter.destroy();
            TXCFilterDrawer.access$202(TXCFilterDrawer.this, null);
            return;
          }
          TXCFilterDrawer.this.mWatermarkFilter.onOutputSizeChanged(TXCFilterDrawer.this.mProcessWidth, TXCFilterDrawer.this.mProcessHeight);
        }
        TXCFilterDrawer.this.mWatermarkFilter.enableWatermark(true);
        TXCFilterDrawer.this.mWatermarkFilter.SetWaterMark(paramBitmap, paramFloat1, paramFloat2, paramFloat3);
      }
    });
  }
  
  public void setWaterMarkList(final List<TXCVideoPreprocessor.WaterMakeTag> paramList)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        TXCFilterDrawer.access$502(TXCFilterDrawer.this, paramList);
        if (((paramList == null) || (paramList.size() == 0)) && (TXCFilterDrawer.this.mWatermakeBitmap == null) && (TXCFilterDrawer.this.mWatermarkFilter != null)) {
          TXCFilterDrawer.this.mWatermarkFilter.destroy();
        }
        do
        {
          TXCFilterDrawer.access$202(TXCFilterDrawer.this, null);
          do
          {
            return;
          } while ((paramList == null) || (paramList.size() == 0));
          if (TXCFilterDrawer.this.mWatermarkFilter != null) {
            break;
          }
        } while ((TXCFilterDrawer.this.mProcessWidth <= 0) || (TXCFilterDrawer.this.mProcessHeight <= 0));
        TXCFilterDrawer.access$202(TXCFilterDrawer.this, new TXCGPUWatermarkFilter());
        TXCFilterDrawer.this.mWatermarkFilter.setHasFrameBuffer(true);
        if (!TXCFilterDrawer.this.mWatermarkFilter.init())
        {
          TXCFilterDrawer.this.mWatermarkFilter.destroy();
          TXCFilterDrawer.access$202(TXCFilterDrawer.this, null);
          return;
        }
        TXCFilterDrawer.this.mWatermarkFilter.onOutputSizeChanged(TXCFilterDrawer.this.mProcessWidth, TXCFilterDrawer.this.mProcessHeight);
        TXCFilterDrawer.this.mWatermarkFilter.enableWatermark(true);
        TXCFilterDrawer.this.mWatermarkFilter.setWaterMarkList(paramList);
      }
    });
  }
  
  public void setWhitenessLevel(final int paramInt)
  {
    this.mBrightnessLevel = paramInt;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (paramInt > 0) {
          ReportDuaManage.getInstance().reportWhiteDua();
        }
        if ((TXCFilterDrawer.this.mBeautyFilter != null) && (paramInt >= 0)) {
          TXCFilterDrawer.this.mBeautyFilter.setWhitenessLevel(paramInt);
        }
      }
    });
  }
  
  private class EGLDrawThreadHandler
    extends Handler
  {
    static final int MSG_CREATE_EGL = 0;
    static final int MSG_DRAW_FRAME = 3;
    static final int MSG_RELEASE_EGL = 1;
    static final int MSG_SET_INITYUVFILTER = 5;
    static final int MSG_SET_RENDER_BUFFER = 2;
    static final int MSG_SET_SETOUTPUTMATRIX = 7;
    static final int MSG_SET_SPECIAL_RATIO = 4;
    private String TAG = "EGLDrawThreadHandler";
    
    EGLDrawThreadHandler(Looper paramLooper, Context paramContext)
    {
      super();
    }
    
    private void initEGL(Object paramObject)
    {
      TXCLog.i(this.TAG, "come into InitEGL");
      paramObject = (TXCVideoPreprocessor.InitConfig)paramObject;
      releaseEGL();
      TXCFilterDrawer.access$1602(TXCFilterDrawer.this, new EglCore());
      TXCFilterDrawer.access$1702(TXCFilterDrawer.this, new WindowSurface(TXCFilterDrawer.this.mEglCore, ((TXCVideoPreprocessor.InitConfig)paramObject).mInputWidth, ((TXCVideoPreprocessor.InitConfig)paramObject).mInputHeight, false));
      TXCFilterDrawer.this.mInputWindowSurface.makeCurrent();
      if (!TXCFilterDrawer.this.initInternal((TXCVideoPreprocessor.InitConfig)paramObject))
      {
        TXCLog.e(this.TAG, "initInternal failed!");
        return;
      }
      TXCLog.i(this.TAG, "come out InitEGL");
    }
    
    public boolean getInitEGLState()
    {
      return TXCFilterDrawer.this.m_bInitEGLDone;
    }
    
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        int i = 0;
        for (;;)
        {
          if (1 == i) {}
          try
          {
            notify();
            return;
          }
          finally {}
          initEGL(paramMessage.obj);
          TXCFilterDrawer.access$1902(TXCFilterDrawer.this, true);
          i = 1;
          continue;
          releaseEGL();
          TXCFilterDrawer.this.mReleaseSemaphore.take();
          i = 0;
          continue;
          TXCFilterDrawer.this.setYUVRenderData((byte[])paramMessage.obj);
          i = 0;
          continue;
          TXCFilterDrawer.this.onDraw(paramMessage.arg1);
          i = 1;
          continue;
          TXCFilterDrawer.access$2402(TXCFilterDrawer.this, (float)(paramMessage.arg1 / 100.0D));
          if (TXCFilterDrawer.this.mLookupFilter == null) {
            break;
          }
          TXCFilterDrawer.this.mLookupFilter.setIntensity(TXCFilterDrawer.this.mSpecialRatio);
          i = 0;
          continue;
          paramMessage = (TXCVideoPreprocessor.InitConfig)paramMessage.obj;
          TXCFilterDrawer.this.excuteInitYUVFilter(paramMessage);
          i = 0;
        }
        TXCFilterDrawer.this.excuteResetOutputRotateMatrix(TXCFilterDrawer.this.mProcessWidth, TXCFilterDrawer.this.mProcessHeight, TXCFilterDrawer.this.mInputAngle, paramMessage.arg1, paramMessage.arg2, ((Integer)paramMessage.obj).intValue());
        TXCFilterDrawer.this.mResetOutputMatrixSemaphore.take();
      }
    }
    
    public void releaseEGL()
    {
      TXCLog.i(this.TAG, "come into releaseEGL");
      if ((TXCFilterDrawer.this.m_pbo0 != null) && (TXCFilterDrawer.this.m_pbo0[0] > 0))
      {
        GLES20.glDeleteBuffers(1, TXCFilterDrawer.this.m_pbo0, 0);
        TXCFilterDrawer.access$2002(TXCFilterDrawer.this, null);
      }
      TXCFilterDrawer.this.releaseInternal();
      if (TXCFilterDrawer.this.mInputWindowSurface != null)
      {
        TXCFilterDrawer.this.mInputWindowSurface.release();
        TXCFilterDrawer.access$1702(TXCFilterDrawer.this, null);
      }
      if (TXCFilterDrawer.this.mEglCore != null)
      {
        TXCFilterDrawer.this.mEglCore.release();
        TXCFilterDrawer.access$1602(TXCFilterDrawer.this, null);
      }
      TXCFilterDrawer.access$1902(TXCFilterDrawer.this, false);
      NativeLoad.getInstance();
      NativeLoad.nativeDeleteYuv2Yuv();
      TXCLog.i(this.TAG, "come out releaseEGL");
    }
    
    /* Error */
    void waitForHandleMessage()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual 240	java/lang/Object:wait	()V
      //   6: aload_0
      //   7: monitorexit
      //   8: return
      //   9: astore_1
      //   10: aload_0
      //   11: monitorexit
      //   12: aload_1
      //   13: athrow
      //   14: astore_1
      //   15: goto -9 -> 6
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	18	0	this	EGLDrawThreadHandler
      //   9	4	1	localObject	Object
      //   14	1	1	localInterruptedException	InterruptedException
      // Exception table:
      //   from	to	target	type
      //   2	6	9	finally
      //   6	8	9	finally
      //   10	12	9	finally
      //   2	6	14	java/lang/InterruptedException
    }
    
    /* Error */
    void waitForHandleMessage(long paramLong, int paramInt)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: lload_1
      //   4: iload_3
      //   5: invokevirtual 243	java/lang/Object:wait	(JI)V
      //   8: aload_0
      //   9: monitorexit
      //   10: return
      //   11: astore 4
      //   13: aload_0
      //   14: monitorexit
      //   15: aload 4
      //   17: athrow
      //   18: astore 4
      //   20: goto -12 -> 8
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	23	0	this	EGLDrawThreadHandler
      //   0	23	1	paramLong	long
      //   0	23	3	paramInt	int
      //   11	5	4	localObject	Object
      //   18	1	4	localInterruptedException	InterruptedException
      // Exception table:
      //   from	to	target	type
      //   2	8	11	finally
      //   8	10	11	finally
      //   13	15	11	finally
      //   2	8	18	java/lang/InterruptedException
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\TXCFilterDrawer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */