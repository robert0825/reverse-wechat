package com.tencent.liteav.beauty.gpu_filters;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCGPUOESTextureFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils.OnDrawTaskHandler;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.IOException;
import java.io.InputStream;

public class TXCGPUGreenScreenFilter
{
  private static String TAG = "GPUGreenScreen";
  Bitmap bitmap;
  public boolean firstValidFrame;
  private TXCGPUColorScreenFilter mColorScreenFilter = null;
  private Context mContext;
  public boolean mEnableGreenScreen;
  SurfaceTexture.OnFrameAvailableListener mFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener()
  {
    public void onFrameAvailable(SurfaceTexture paramAnonymousSurfaceTexture)
    {
      TXCGPUGreenScreenFilter.this.mHandler.addOnDrawTask(new Runnable()
      {
        public void run()
        {
          if ((TXCGPUGreenScreenFilter.this.mPlaying) && (!TXCGPUGreenScreenFilter.this.firstValidFrame))
          {
            TXCGPUGreenScreenFilter.this.mEnableGreenScreen = true;
            TXCGPUGreenScreenFilter.this.firstValidFrame = true;
            if (TXCGPUGreenScreenFilter.this.mGreenScreenTexture != TXCGPUGreenScreenFilter.this.mGreenScreenTempTexture)
            {
              GLES20.glDeleteTextures(1, new int[] { TXCGPUGreenScreenFilter.this.mGreenScreenTexture }, 0);
              TXCGPUGreenScreenFilter.this.mGreenScreenTexture = TXCGPUGreenScreenFilter.this.mGreenScreenTempTexture;
              TXCGPUGreenScreenFilter.this.mTextureType = true;
            }
          }
        }
      });
    }
  };
  private String mGreenScreenFile;
  public int mGreenScreenTempTexture = -1;
  public int mGreenScreenTexture = -1;
  public TXCOpenGlUtils.OnDrawTaskHandler mHandler;
  private boolean mIsLoop = true;
  private TXCGPUOESTextureFilter mOESFilter = null;
  TXCGPUVideoPlayerFilter.OnDestroyListener mOnPlayerDestroyListener = new TXCGPUVideoPlayerFilter.OnDestroyListener()
  {
    public void onDestroy(final Object paramAnonymousObject)
    {
      TXCGPUGreenScreenFilter.this.mHandler.addOnDrawTask(new Runnable()
      {
        public void run()
        {
          if (paramAnonymousObject.equals(TXCGPUGreenScreenFilter.this.mVideoPlayer))
          {
            TXCGPUGreenScreenFilter.this.destroyPlayer();
            TXCGPUGreenScreenFilter.this.destoryTexture();
            TXCGPUGreenScreenFilter.this.mEnableGreenScreen = false;
          }
        }
      });
    }
  };
  public boolean mPlaying;
  public boolean mTextureType;
  public TXCGPUVideoPlayerFilter mVideoPlayer;
  private Object mVideoPlayerLock = new Object();
  private float[] mtx = new float[16];
  
  private void loadGreenScreenFile()
  {
    if (true == this.mGreenScreenFile.isEmpty()) {
      TXCLog.e(TAG, "green file is empty!");
    }
    Object localObject;
    int i;
    label47:
    do
    {
      return;
      localObject = TXCCommonUtil.getFileExtension(this.mGreenScreenFile);
      if (localObject != null) {
        break;
      }
      destroyPlayer();
      destoryTexture();
      this.mEnableGreenScreen = false;
      i = 1;
      if (i == 0) {
        break label466;
      }
    } while ((this.mGreenScreenFile == null) || (this.mGreenScreenFile.compareTo("") == 0));
    TXCLog.e(TAG, "Load GreenScreenFile:" + this.mGreenScreenFile + " fail");
    return;
    for (;;)
    {
      boolean bool;
      try
      {
        if ((((String)localObject).compareTo("jpg") == 0) || (((String)localObject).compareTo("png") == 0))
        {
          destroyPlayer();
          if (this.mGreenScreenFile.startsWith("/"))
          {
            localObject = BitmapFactory.decodeFile(this.mGreenScreenFile);
            if (localObject == null) {
              break label507;
            }
            destoryTexture();
            this.mColorScreenFilter.setScreenMirrorY(true);
            this.mGreenScreenTexture = TXCOpenGlUtils.getSimpleTextureID();
            this.mTextureType = false;
            if (this.mGreenScreenTexture == -1) {
              break label502;
            }
            GLES20.glBindTexture(3553, this.mGreenScreenTexture);
            GLUtils.texImage2D(3553, 0, (Bitmap)localObject, 0);
            GLES20.glBindTexture(3553, 0);
            ((Bitmap)localObject).recycle();
            this.mColorScreenFilter.enableScreenMode(true);
            i = 0;
            break label47;
          }
          InputStream localInputStream = this.mContext.getAssets().open(this.mGreenScreenFile);
          localObject = BitmapFactory.decodeStream(localInputStream);
          localInputStream.close();
          continue;
        }
        if (((String)localObject).compareTo("mp4") == 0)
        {
          this.mColorScreenFilter.setScreenMirrorY(true);
          if (this.mVideoPlayer == null) {
            this.mVideoPlayer = new TXCGPUVideoPlayerFilter();
          }
          this.mVideoPlayer.destroy();
          this.firstValidFrame = false;
          if (this.mGreenScreenTexture == -1)
          {
            this.mGreenScreenTexture = TXCOpenGlUtils.getExternalOESTextureID();
            this.mGreenScreenTempTexture = this.mGreenScreenTexture;
            this.mTextureType = true;
            localObject = new TXCGPUVideoPlayerFilter.InitParam();
            ((TXCGPUVideoPlayerFilter.InitParam)localObject).greenScreenFile = this.mGreenScreenFile;
            ((TXCGPUVideoPlayerFilter.InitParam)localObject).greenScreenTexture = this.mGreenScreenTempTexture;
            ((TXCGPUVideoPlayerFilter.InitParam)localObject).frameAvailableListener = this.mFrameAvailableListener;
            ((TXCGPUVideoPlayerFilter.InitParam)localObject).context = this.mContext;
            ((TXCGPUVideoPlayerFilter.InitParam)localObject).destroyListener = this.mOnPlayerDestroyListener;
            ((TXCGPUVideoPlayerFilter.InitParam)localObject).isLoop = this.mIsLoop;
            if (this.mVideoPlayer.init((TXCGPUVideoPlayerFilter.InitParam)localObject)) {
              continue;
            }
            i = 1;
            break label512;
            this.mPlaying = bool;
            break label47;
          }
          if ((this.mGreenScreenTempTexture != -1) && (this.mGreenScreenTempTexture != this.mGreenScreenTexture)) {
            GLES20.glDeleteTextures(1, new int[] { this.mGreenScreenTempTexture }, 0);
          }
          this.mGreenScreenTempTexture = TXCOpenGlUtils.getExternalOESTextureID();
          continue;
          i = 0;
          break label512;
          bool = false;
          continue;
        }
        i = 1;
      }
      catch (IOException localIOException)
      {
        label466:
        i = 1;
      }
      if (this.mVideoPlayer == null)
      {
        this.mEnableGreenScreen = true;
        return;
      }
      if (this.mGreenScreenTexture != this.mGreenScreenTempTexture) {
        break;
      }
      this.mEnableGreenScreen = false;
      return;
      break label47;
      label502:
      i = 1;
      break label47;
      label507:
      i = 1;
      break label47;
      label512:
      if (i == 0) {
        bool = true;
      }
    }
  }
  
  public void destoryTexture()
  {
    if ((this.mGreenScreenTempTexture != -1) && (this.mGreenScreenTempTexture != this.mGreenScreenTexture))
    {
      GLES20.glDeleteTextures(1, new int[] { this.mGreenScreenTempTexture }, 0);
      this.mGreenScreenTempTexture = -1;
    }
    if (this.mGreenScreenTexture != -1)
    {
      GLES20.glDeleteTextures(1, new int[] { this.mGreenScreenTexture }, 0);
      this.mGreenScreenTexture = -1;
    }
  }
  
  public void destroy()
  {
    destroyPlayer();
    destoryTexture();
    if (this.mOESFilter != null)
    {
      this.mOESFilter.destroy();
      this.mOESFilter = null;
    }
    if (this.mColorScreenFilter != null)
    {
      this.mColorScreenFilter.destroy();
      this.mColorScreenFilter = null;
    }
    this.mEnableGreenScreen = false;
  }
  
  public void destroyPlayer()
  {
    if (this.mVideoPlayer != null) {
      this.mVideoPlayer.destroy();
    }
    this.mVideoPlayer = null;
    this.mPlaying = false;
    this.firstValidFrame = false;
  }
  
  public boolean init(int paramInt1, int paramInt2, TXCOpenGlUtils.OnDrawTaskHandler paramOnDrawTaskHandler, Context paramContext)
  {
    this.mHandler = paramOnDrawTaskHandler;
    this.mContext = paramContext;
    if (this.mOESFilter == null)
    {
      this.mOESFilter = new TXCGPUOESTextureFilter();
      this.mOESFilter.setHasFrameBuffer(true);
      if (!this.mOESFilter.init())
      {
        TXCLog.e(TAG, "mOESFilter init failed!");
        return false;
      }
      this.mOESFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
    if (this.mColorScreenFilter == null)
    {
      this.mColorScreenFilter = new TXCGPUColorScreenFilter();
      this.mColorScreenFilter.setHasFrameBuffer(true);
      if (!this.mColorScreenFilter.init())
      {
        TXCLog.e(TAG, "mColorScreenFilter init failed!");
        return false;
      }
      this.mColorScreenFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
    if (this.mGreenScreenFile != null) {
      loadGreenScreenFile();
    }
    return true;
  }
  
  public int onDrawToTexture(int paramInt)
  {
    return paramInt;
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    if (this.mOESFilter != null) {
      this.mOESFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
    if (this.mColorScreenFilter != null) {
      this.mColorScreenFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
  }
  
  public void setGreenScreenFile(String paramString, boolean paramBoolean)
  {
    this.mGreenScreenFile = paramString;
    this.mIsLoop = paramBoolean;
    loadGreenScreenFile();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUGreenScreenFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */