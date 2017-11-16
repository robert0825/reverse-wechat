package com.tencent.rtmp.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import com.tencent.liteav.renderer.TXCFocusIndicatorView;
import com.tencent.liteav.renderer.TXCGLSurfaceView;

public class TXCloudVideoView
  extends FrameLayout
{
  private static final int FOCUS_AREA_SIZE_DP = 70;
  private static final String TAG = "TXCloudVideoView";
  private int mFocusAreaSize = 0;
  private TXCFocusIndicatorView mFocusIndicatorView;
  private TXCGLSurfaceView mGLSurfaceView;
  private TXLogView mLogView;
  private TextureView mVideoView;
  
  public TXCloudVideoView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TXCloudVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mLogView = new TXLogView(paramContext);
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
    if ((this.mFocusAreaSize == 0) && (this.mGLSurfaceView != null)) {
      this.mFocusAreaSize = ((int)(70.0F * this.mGLSurfaceView.getResources().getDisplayMetrics().density + 0.5F));
    }
    int i = Float.valueOf(this.mFocusAreaSize * paramFloat).intValue();
    paramInt1 = clamp(paramInt1 - i / 2, 0, paramInt3 - i);
    paramInt2 = clamp(paramInt2 - i / 2, 0, paramInt4 - i);
    return new Rect(paramInt1, paramInt2, paramInt1 + i, i + paramInt2);
  }
  
  public void addVideoView(TextureView paramTextureView)
  {
    if (this.mVideoView != null) {
      removeView(this.mVideoView);
    }
    this.mVideoView = paramTextureView;
    addView(this.mVideoView);
    removeView(this.mLogView);
    addView(this.mLogView);
  }
  
  public void addVideoView(TXCGLSurfaceView paramTXCGLSurfaceView)
  {
    if (this.mGLSurfaceView != null) {
      removeView(this.mGLSurfaceView);
    }
    this.mGLSurfaceView = paramTXCGLSurfaceView;
    addView(this.mGLSurfaceView);
    removeView(this.mLogView);
    addView(this.mLogView);
  }
  
  public void adjustVideoSize() {}
  
  public void clearLastFrame(boolean paramBoolean)
  {
    if (paramBoolean) {
      setVisibility(8);
    }
  }
  
  public void clearLog()
  {
    this.mLogView.clearLog();
  }
  
  public void disableLog(boolean paramBoolean)
  {
    this.mLogView.disableLog(paramBoolean);
  }
  
  public void enableHardwareDecode(boolean paramBoolean) {}
  
  public TXCGLSurfaceView getGLSurfaceView()
  {
    return this.mGLSurfaceView;
  }
  
  public TextureView getHWVideoView()
  {
    return this.mVideoView;
  }
  
  public TextureView getVideoView()
  {
    return this.mVideoView;
  }
  
  public void onDestroy() {}
  
  public void onPause() {}
  
  public void onResume() {}
  
  public void onTouchFocus(int paramInt1, int paramInt2)
  {
    if (this.mGLSurfaceView == null) {
      return;
    }
    if (this.mFocusIndicatorView == null)
    {
      this.mFocusIndicatorView = new TXCFocusIndicatorView(getContext());
      this.mFocusIndicatorView.setVisibility(0);
      addView(this.mFocusIndicatorView);
    }
    Rect localRect = getTouchRect(paramInt1, paramInt2, this.mGLSurfaceView.getWidth(), this.mGLSurfaceView.getHeight(), 1.0F);
    this.mFocusIndicatorView.show(localRect.left, localRect.top, localRect.right - localRect.left);
  }
  
  public void refreshLastFrame() {}
  
  public void setGLOnTouchListener(View.OnTouchListener paramOnTouchListener) {}
  
  public void setLogText(Bundle paramBundle1, Bundle paramBundle2, int paramInt)
  {
    this.mLogView.setLogText(paramBundle1, paramBundle2, paramInt);
  }
  
  public void setMirror(boolean paramBoolean) {}
  
  public void setRenderMode(int paramInt) {}
  
  public void setRenderRotation(int paramInt) {}
  
  public void setStreamUrl(String paramString) {}
  
  public void setSurfaceTextureListener(TextureView.SurfaceTextureListener paramSurfaceTextureListener) {}
  
  public void setUseBeautyView(boolean paramBoolean) {}
  
  public void showLog(boolean paramBoolean)
  {
    this.mLogView.show(paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\ui\TXCloudVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */