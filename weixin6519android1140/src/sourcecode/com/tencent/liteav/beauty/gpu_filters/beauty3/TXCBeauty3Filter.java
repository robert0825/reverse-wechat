package com.tencent.liteav.beauty.gpu_filters.beauty3;

import com.tencent.liteav.beauty.gpu_filters.TXCBeautyInterFace;
import com.tencent.liteav.beauty.gpu_filters.TXCGPUSharpenFilter;

public class TXCBeauty3Filter
  extends TXCBeautyInterFace
{
  private String TAG = "TXCBeauty3Filter";
  private float mBeautyLevel = 0.0F;
  private TXCGChannelBeautyFilter mGreenBeautyFilter = null;
  private float mRuddyLevel = 0.0F;
  private TXCGPUSharpenFilter mSharpnessFilter = null;
  private float mSharpnessLevel = 0.0F;
  private float mWhiteLevel = 0.0F;
  
  private boolean initFilter(int paramInt1, int paramInt2)
  {
    if (this.mGreenBeautyFilter == null)
    {
      this.mGreenBeautyFilter = new TXCGChannelBeautyFilter();
      this.mGreenBeautyFilter.setHasFrameBuffer(true);
      if (this.mGreenBeautyFilter.init()) {}
    }
    do
    {
      return false;
      this.mGreenBeautyFilter.onOutputSizeChanged(paramInt1, paramInt2);
      if (this.mSharpnessFilter != null) {
        break;
      }
      this.mSharpnessFilter = new TXCGPUSharpenFilter();
      this.mSharpnessFilter.setHasFrameBuffer(true);
    } while (!this.mSharpnessFilter.init());
    this.mSharpnessFilter.onOutputSizeChanged(paramInt1, paramInt2);
    return true;
  }
  
  void UnInitFilter()
  {
    if (this.mGreenBeautyFilter != null)
    {
      this.mGreenBeautyFilter.onDestroy();
      this.mGreenBeautyFilter = null;
    }
    if (this.mSharpnessFilter != null)
    {
      this.mSharpnessFilter.onDestroy();
      this.mSharpnessFilter = null;
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
    int i;
    if ((this.mBeautyLevel <= 0.0F) && (this.mWhiteLevel <= 0.0F))
    {
      i = paramInt;
      if (this.mRuddyLevel <= 0.0F) {}
    }
    else
    {
      i = this.mGreenBeautyFilter.onDrawToTexture(paramInt);
    }
    paramInt = i;
    if (this.mSharpnessLevel > 0.0F) {
      paramInt = this.mSharpnessFilter.onDrawToTexture(i);
    }
    return paramInt;
  }
  
  public void setBeautyLevel(int paramInt)
  {
    this.mBeautyLevel = (paramInt / 10.0F);
    if (this.mGreenBeautyFilter != null) {
      this.mGreenBeautyFilter.setBeautyLevel(this.mBeautyLevel);
    }
  }
  
  public void setRuddyLevel(int paramInt)
  {
    this.mRuddyLevel = (paramInt / 10.0F);
    if (this.mGreenBeautyFilter != null) {
      this.mGreenBeautyFilter.setRuddyLevel(this.mRuddyLevel);
    }
  }
  
  public void setShapenLevel(int paramInt)
  {
    this.mSharpnessLevel = (paramInt / 20.0F);
    if (this.mSharpnessFilter != null) {
      this.mSharpnessFilter.setSharpness(this.mSharpnessLevel);
    }
  }
  
  public void setWhitenessLevel(int paramInt)
  {
    this.mWhiteLevel = (paramInt / 10.0F);
    if (this.mGreenBeautyFilter != null) {
      this.mGreenBeautyFilter.setWhitenessLevel(this.mWhiteLevel);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\beauty3\TXCBeauty3Filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */