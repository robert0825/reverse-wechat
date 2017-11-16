package com.tencent.liteav.beauty.gpu_filters.beauty2;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.gpu_filters.TXCBeautyInterFace;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUGammaFilter;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUSharpenAlphaFilter;

public class TXCBeauty2Filter
  extends TXCBeautyInterFace
{
  private final float SHARPNESS_BASE_LEVEL = 0.7F;
  private String TAG = "TXCBeauty2Filter";
  private TXCBeautyBlend mBeautyBlendFilter = null;
  private int mBeautyLevel = 0;
  private float mGammaLevel = 1.0F;
  private int mHeight = 0;
  private int mResampleHeight = 0;
  private float mResampleRatio = 2.0F;
  private int mResampleWidth = 0;
  private int mRuddyLevel = 0;
  private TXCGPUSharpenAlphaFilter mSharpenFilter = null;
  private float mSharpenLevel = 0.8F;
  private int mWhiteLevel = 0;
  private int mWidth = 0;
  private TXCGPUGammaFilter m_gammaFilter = null;
  private TXCTILSmoothHorizontalFilter m_horizontalFilter = null;
  private TXCTILSkinFilter m_skinFilter = null;
  private TXCTILSmoothVerticalFilter m_verticalFilter = null;
  
  private boolean initFilter(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    this.mResampleWidth = paramInt1;
    this.mResampleHeight = paramInt2;
    if (paramInt1 > paramInt2) {
      if (paramInt2 < 540) {
        this.mResampleRatio = 1.0F;
      }
    }
    for (;;)
    {
      if (1.0F != this.mResampleRatio)
      {
        this.mResampleWidth = ((int)(this.mResampleWidth / this.mResampleRatio));
        this.mResampleHeight = ((int)(this.mResampleHeight / this.mResampleRatio));
      }
      TXCLog.i(this.TAG, "mResampleRatio " + this.mResampleRatio + " mResampleWidth " + this.mResampleWidth + " mResampleHeight " + this.mResampleHeight);
      if (this.mBeautyBlendFilter != null) {
        break label213;
      }
      this.mBeautyBlendFilter = new TXCBeautyBlend();
      this.mBeautyBlendFilter.setHasFrameBuffer(true);
      if (this.mBeautyBlendFilter.init()) {
        break;
      }
      TXCLog.e(this.TAG, "mBeautyBlendFilter init failed!!, break init");
      return false;
      this.mResampleRatio = 2.0F;
      continue;
      if (paramInt1 < 540) {
        this.mResampleRatio = 1.0F;
      } else {
        this.mResampleRatio = 2.0F;
      }
    }
    this.mBeautyBlendFilter.onOutputSizeChanged(paramInt1, paramInt2);
    label213:
    if (this.m_horizontalFilter == null)
    {
      this.m_horizontalFilter = new TXCTILSmoothHorizontalFilter();
      this.m_horizontalFilter.setHasFrameBuffer(true);
      if (!this.m_horizontalFilter.init())
      {
        TXCLog.e(this.TAG, "m_horizontalFilter init failed!!, break init");
        return false;
      }
      this.m_horizontalFilter.onOutputSizeChanged(this.mResampleWidth, this.mResampleHeight);
    }
    if (this.m_verticalFilter == null)
    {
      this.m_verticalFilter = new TXCTILSmoothVerticalFilter();
      this.m_verticalFilter.setHasFrameBuffer(true);
      if (1.0F == this.mResampleRatio) {}
      for (boolean bool = false;; bool = true)
      {
        this.m_verticalFilter.setNearestModel(bool);
        if (this.m_verticalFilter.init()) {
          break;
        }
        TXCLog.e(this.TAG, "m_verticalFilter init failed!!, break init");
        return false;
      }
      this.m_verticalFilter.onOutputSizeChanged(this.mResampleWidth, this.mResampleHeight);
    }
    if (this.m_gammaFilter == null)
    {
      this.m_gammaFilter = new TXCGPUGammaFilter(1.0F);
      this.m_gammaFilter.setHasFrameBuffer(true);
      if (!this.m_gammaFilter.init())
      {
        TXCLog.e(this.TAG, "m_gammaFilter init failed!!, break init");
        return false;
      }
      this.m_gammaFilter.onOutputSizeChanged(this.mResampleWidth, this.mResampleHeight);
    }
    if (this.mSharpenFilter == null)
    {
      this.mSharpenFilter = new TXCGPUSharpenAlphaFilter();
      this.mSharpenFilter.setHasFrameBuffer(true);
      if (!this.mSharpenFilter.init())
      {
        TXCLog.e(this.TAG, "mSharpenFilter init failed!!, break init");
        return false;
      }
      this.mSharpenFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
    return true;
  }
  
  private void setGammaLevel(int paramInt)
  {
    this.mGammaLevel = (1.0F - paramInt / 50.0F);
    if (this.m_gammaFilter != null) {
      this.m_gammaFilter.setGamma(this.mGammaLevel);
    }
  }
  
  void UnInitFilter()
  {
    if (this.mBeautyBlendFilter != null)
    {
      this.mBeautyBlendFilter.destroy();
      this.mBeautyBlendFilter = null;
    }
    if (this.m_horizontalFilter != null)
    {
      this.m_horizontalFilter.destroy();
      this.m_horizontalFilter = null;
    }
    if (this.m_verticalFilter != null)
    {
      this.m_verticalFilter.destroy();
      this.m_verticalFilter = null;
    }
    if (this.m_gammaFilter != null)
    {
      this.m_gammaFilter.destroy();
      this.m_gammaFilter = null;
    }
    if (this.mSharpenFilter != null)
    {
      this.mSharpenFilter.destroy();
      this.mSharpenFilter = null;
    }
  }
  
  public boolean init(int paramInt1, int paramInt2)
  {
    return initFilter(paramInt1, paramInt2);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    UnInitFilter();
  }
  
  public int onDrawToTexture(int paramInt)
  {
    if (1.0F != this.mResampleRatio) {
      GLES20.glViewport(0, 0, this.mResampleWidth, this.mResampleHeight);
    }
    int i = this.m_horizontalFilter.onDrawToTexture(paramInt);
    int j = this.m_verticalFilter.onDrawToTexture(i, paramInt);
    if (1.0F != this.mResampleRatio) {
      GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
    }
    i = j;
    if (this.mSharpenLevel > 0.7F) {
      i = this.mSharpenFilter.onDrawToTexture(j);
    }
    return this.mBeautyBlendFilter.onDrawToTexture(i, paramInt);
  }
  
  public void setBeautyLevel(int paramInt)
  {
    if (this.m_verticalFilter != null) {
      this.m_verticalFilter.setBeautyLevel(paramInt / 10.0F);
    }
    this.mBeautyLevel = paramInt;
    setGammaLevel(paramInt);
  }
  
  public void setRuddyLevel(int paramInt)
  {
    if (this.mBeautyBlendFilter != null) {
      this.mBeautyBlendFilter.setRuddyLevel(paramInt / 10.0F);
    }
    this.mRuddyLevel = paramInt;
  }
  
  public void setShapenLevel(int paramInt)
  {
    this.mSharpenLevel = (0.7F + paramInt / 12.0F);
    TXCLog.i(this.TAG, "set mSharpenLevel " + paramInt);
    if (this.mSharpenFilter != null) {
      this.mSharpenFilter.setSharpness(this.mSharpenLevel);
    }
  }
  
  public void setWhitenessLevel(int paramInt)
  {
    if (this.mBeautyBlendFilter != null) {
      this.mBeautyBlendFilter.setBrightLevel(paramInt / 10.0F);
    }
    this.mWhiteLevel = paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty2\TXCBeauty2Filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */