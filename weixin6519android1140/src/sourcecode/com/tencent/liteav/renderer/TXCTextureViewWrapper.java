package com.tencent.liteav.renderer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.ViewGroup;
import com.tencent.liteav.basic.log.TXCLog;

public class TXCTextureViewWrapper
{
  private static final int FOCUS_AREA_SIZE_DP = 70;
  public static final int RENDER_MODE_ADJUST_RESOLUTION = 1;
  public static final int RENDER_MODE_FULL_FILL_SCREEN = 0;
  public static final int RENDER_ROTATION_LANDSCAPE = 270;
  public static final int RENDER_ROTATION_PORTRAIT = 0;
  private static final String TAG = "TXCTextureViewWrapper";
  public int mCurrentRenderMode = 1;
  public int mCurrentRenderRotation = 0;
  private int mFocusAreaSize = 0;
  private TXCFocusIndicatorView mFocusIndicatorView;
  private Handler mMainHandler;
  public float mScaleRatio = 1.0F;
  public int mVideoHeight = 480;
  private int mVideoShowHeight = 0;
  private int mVideoShowWidth = 0;
  public TextureView mVideoView;
  public int mVideoWidth = 640;
  private int mViewHeight = 0;
  private int mViewWidth = 0;
  
  public TXCTextureViewWrapper(TextureView paramTextureView)
  {
    this.mVideoView = paramTextureView;
    this.mViewWidth = paramTextureView.getWidth();
    this.mViewHeight = paramTextureView.getHeight();
    this.mMainHandler = new Handler(paramTextureView.getContext().getMainLooper());
  }
  
  private void adjustVideoSize()
  {
    try
    {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          TXCTextureViewWrapper.this.adjustVideoSizeInternal(TXCTextureViewWrapper.this.mVideoWidth, TXCTextureViewWrapper.this.mVideoHeight);
          TXCTextureViewWrapper.this.setRenderModeInternal(TXCTextureViewWrapper.this.mCurrentRenderMode);
          TXCTextureViewWrapper.this.setRenderRotationInternal(TXCTextureViewWrapper.this.mCurrentRenderRotation);
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
  
  private int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  private Rect getTouchRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    if (this.mFocusAreaSize == 0) {
      this.mFocusAreaSize = ((int)(70.0F * this.mVideoView.getResources().getDisplayMetrics().density + 0.5F));
    }
    int i = Float.valueOf(this.mFocusAreaSize * paramFloat).intValue();
    paramInt1 = clamp(paramInt1 - i / 2, 0, paramInt3 - i);
    paramInt2 = clamp(paramInt2 - i / 2, 0, paramInt4 - i);
    return new Rect(paramInt1, paramInt2, paramInt1 + i, i + paramInt2);
  }
  
  public void adjustVideoSizeInternal(int paramInt1, int paramInt2)
  {
    if ((this.mVideoView == null) || (paramInt1 == 0) || (paramInt2 == 0)) {}
    while ((this.mViewWidth == 0) || (this.mViewHeight == 0)) {
      return;
    }
    double d = paramInt2 / paramInt1;
    if (this.mViewHeight > (int)(this.mViewWidth * d)) {
      this.mVideoShowWidth = this.mViewWidth;
    }
    for (this.mVideoShowHeight = ((int)(d * this.mViewWidth));; this.mVideoShowHeight = this.mViewHeight)
    {
      float f1 = (this.mViewWidth - this.mVideoShowWidth) / 2.0F;
      float f2 = (this.mViewHeight - this.mVideoShowHeight) / 2.0F;
      float f3 = this.mVideoShowWidth / this.mViewWidth;
      float f4 = this.mVideoShowHeight / this.mViewHeight;
      Matrix localMatrix = new Matrix();
      this.mVideoView.getTransform(localMatrix);
      localMatrix.setScale(f3, f4);
      localMatrix.postTranslate(f1, f2);
      this.mVideoView.setTransform(localMatrix);
      this.mVideoView.requestLayout();
      return;
      this.mVideoShowWidth = ((int)(this.mViewHeight / d));
    }
  }
  
  public void clearLastFrame(final boolean paramBoolean)
  {
    try
    {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          if ((TXCTextureViewWrapper.this.mVideoView != null) && (paramBoolean)) {
            TXCTextureViewWrapper.this.mVideoView.setVisibility(4);
          }
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onTouchFocus(int paramInt1, int paramInt2)
  {
    if (this.mFocusIndicatorView == null)
    {
      this.mFocusIndicatorView = new TXCFocusIndicatorView(this.mVideoView.getContext());
      this.mFocusIndicatorView.setVisibility(0);
      ((ViewGroup)this.mVideoView.getParent()).addView(this.mFocusIndicatorView);
    }
    Rect localRect = getTouchRect(paramInt1, paramInt2, this.mVideoView.getWidth(), this.mVideoView.getHeight(), 1.0F);
    this.mFocusIndicatorView.show(localRect.left, localRect.top, localRect.right - localRect.left);
  }
  
  public void setMirror(final boolean paramBoolean)
  {
    try
    {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCTextureViewWrapper.this.mVideoView != null)
          {
            TXCTextureViewWrapper.this.mScaleRatio = Math.abs(TXCTextureViewWrapper.this.mScaleRatio);
            if (paramBoolean) {
              TXCTextureViewWrapper.this.mScaleRatio = (-TXCTextureViewWrapper.this.mScaleRatio);
            }
            TXCTextureViewWrapper.this.mVideoView.setScaleX(TXCTextureViewWrapper.this.mScaleRatio);
            TXCTextureViewWrapper.this.mVideoView.setScaleY(Math.abs(TXCTextureViewWrapper.this.mScaleRatio));
          }
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
  
  public void setRenderMode(final int paramInt)
  {
    try
    {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          TXCTextureViewWrapper.this.setRenderModeInternal(paramInt);
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
  
  public void setRenderModeInternal(int paramInt)
  {
    float f2 = 1.0F;
    this.mCurrentRenderMode = paramInt;
    float f1;
    if (this.mVideoView != null)
    {
      if (paramInt != 1) {
        break label154;
      }
      f1 = f2;
      if (this.mCurrentRenderRotation != 0)
      {
        if (this.mCurrentRenderRotation != 180) {
          break label79;
        }
        f1 = f2;
      }
    }
    for (;;)
    {
      f2 = f1;
      if (this.mScaleRatio < 0.0F) {
        f2 = -f1;
      }
      this.mVideoView.setScaleX(f2);
      this.mVideoView.setScaleY(Math.abs(f2));
      this.mScaleRatio = f2;
      label79:
      float f3;
      label154:
      do
      {
        do
        {
          return;
          if (this.mCurrentRenderRotation != 270)
          {
            f1 = f2;
            if (this.mCurrentRenderRotation != 90) {
              break;
            }
          }
        } while ((this.mVideoShowWidth == 0) || (this.mVideoShowHeight == 0));
        f2 = this.mViewHeight / this.mVideoShowWidth;
        f3 = this.mViewWidth / this.mVideoShowHeight;
        f1 = f3;
        if (f2 > f3) {
          break;
        }
        f1 = f2;
        break;
        f1 = f2;
        if (paramInt != 0) {
          break;
        }
      } while ((this.mVideoShowWidth == 0) || (this.mVideoShowHeight == 0));
      if ((this.mCurrentRenderRotation == 0) || (this.mCurrentRenderRotation == 180))
      {
        f2 = this.mViewHeight / this.mVideoShowHeight;
        f3 = this.mViewWidth / this.mVideoShowWidth;
        f1 = f3;
        if (f2 >= f3) {
          f1 = f2;
        }
      }
      else if (this.mCurrentRenderRotation != 270)
      {
        f1 = f2;
        if (this.mCurrentRenderRotation != 90) {}
      }
      else
      {
        f2 = this.mViewHeight / this.mVideoShowWidth;
        f3 = this.mViewWidth / this.mVideoShowHeight;
        f1 = f3;
        if (f2 >= f3) {
          f1 = f2;
        }
      }
    }
  }
  
  public void setRenderRotation(final int paramInt)
  {
    try
    {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          TXCTextureViewWrapper.this.setRenderRotationInternal(paramInt);
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
  
  public void setRenderRotationInternal(int paramInt)
  {
    float f4 = 1.0F;
    paramInt %= 360;
    this.mCurrentRenderRotation = paramInt;
    float f1;
    if (this.mVideoView != null)
    {
      if ((paramInt != 0) && (paramInt != 180)) {
        break label156;
      }
      this.mVideoView.setRotation(360 - paramInt);
      if (this.mCurrentRenderMode != 1) {
        break label94;
      }
      f1 = 1.0F;
    }
    for (;;)
    {
      float f2 = f1;
      if (this.mScaleRatio < 0.0F) {
        f2 = -f1;
      }
      this.mVideoView.setScaleX(f2);
      this.mVideoView.setScaleY(Math.abs(f2));
      this.mScaleRatio = f2;
      label94:
      label156:
      do
      {
        do
        {
          return;
          f1 = f4;
          if (this.mCurrentRenderMode != 0) {
            break;
          }
        } while ((this.mVideoShowWidth == 0) || (this.mVideoShowHeight == 0));
        f1 = this.mViewHeight / this.mVideoShowHeight;
        f2 = this.mViewWidth / this.mVideoShowWidth;
        if (f1 < f2) {
          f1 = f2;
        }
        for (;;)
        {
          break;
        }
        if (paramInt != 270)
        {
          f1 = f4;
          if (paramInt != 90) {
            break;
          }
        }
      } while ((this.mVideoShowWidth == 0) || (this.mVideoShowHeight == 0));
      this.mVideoView.setRotation(360 - paramInt);
      f2 = this.mViewHeight / this.mVideoShowWidth;
      float f3 = this.mViewWidth / this.mVideoShowHeight;
      if (this.mCurrentRenderMode == 1)
      {
        if (f2 > f3) {}
        for (f1 = f3;; f1 = f2) {
          break;
        }
      }
      f1 = f4;
      if (this.mCurrentRenderMode == 0)
      {
        f1 = f3;
        if (f2 >= f3) {
          f1 = f2;
        }
      }
    }
  }
  
  public void setVideoSize(int paramInt1, int paramInt2)
  {
    TXCLog.w("TXCTextureViewWrapper", "vrender: set video size:" + paramInt1 + "," + paramInt2);
    this.mVideoWidth = paramInt1;
    this.mVideoHeight = paramInt2;
    adjustVideoSize();
  }
  
  public void setViewSize(int paramInt1, int paramInt2)
  {
    TXCLog.w("TXCTextureViewWrapper", "vrender: set view size:" + paramInt1 + "," + paramInt2);
    this.mViewWidth = paramInt1;
    this.mViewHeight = paramInt2;
    adjustVideoSize();
  }
  
  public void show()
  {
    try
    {
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          if (TXCTextureViewWrapper.this.mVideoView != null) {
            TXCTextureViewWrapper.this.mVideoView.setVisibility(0);
          }
        }
      });
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\renderer\TXCTextureViewWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */