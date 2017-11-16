package com.samsung.android.sdk.look.smartclip;

import android.view.View;
import com.samsung.android.sdk.look.Slook;
import com.samsung.android.smartclip.SmartClipDataExtractionListener;
import com.samsung.android.smartclip.SmartClipMetaUtils;

public final class SlookSmartClip
{
  private static final String TAG = "SmartClip";
  public DataExtractionListener mDataExtractionListener = null;
  private Slook mSlook = new Slook();
  private View mView = null;
  
  public SlookSmartClip(View paramView)
  {
    this.mView = paramView;
  }
  
  private boolean isSupport(int paramInt)
  {
    return this.mSlook.isFeatureEnabled(2);
  }
  
  public final void addMetaTag(SlookSmartClipMetaTag paramSlookSmartClipMetaTag)
  {
    if (!isSupport(1)) {
      return;
    }
    SmartClipMetaUtils.addMetaTag(this.mView, paramSlookSmartClipMetaTag);
  }
  
  public final void clearAllMetaTag()
  {
    if (!isSupport(1)) {
      return;
    }
    SmartClipMetaUtils.clearAllMetaTag(this.mView);
  }
  
  public final int extractDefaultSmartClipData(SlookSmartClipDataElement paramSlookSmartClipDataElement, SlookSmartClipCroppedArea paramSlookSmartClipCroppedArea)
  {
    if (!isSupport(1)) {
      return 0;
    }
    return SmartClipMetaUtils.extractDefaultSmartClipData(this.mView, paramSlookSmartClipDataElement, paramSlookSmartClipCroppedArea);
  }
  
  public final void removeMetaTag(String paramString)
  {
    if (!isSupport(1)) {
      return;
    }
    SmartClipMetaUtils.removeMetaTag(this.mView, paramString);
  }
  
  public final void setDataExtractionListener(DataExtractionListener paramDataExtractionListener)
  {
    if (!isSupport(1)) {
      return;
    }
    this.mDataExtractionListener = paramDataExtractionListener;
    SmartClipMetaUtils.setDataExtractionListener(this.mView, new SmartClipDataExtractionListener()
    {
      public int onExtractSmartClipData(View paramAnonymousView, SlookSmartClipDataElement paramAnonymousSlookSmartClipDataElement, SlookSmartClipCroppedArea paramAnonymousSlookSmartClipCroppedArea)
      {
        return SlookSmartClip.this.mDataExtractionListener.onExtractSmartClipData(paramAnonymousView, paramAnonymousSlookSmartClipDataElement, paramAnonymousSlookSmartClipCroppedArea);
      }
    });
  }
  
  public static abstract interface DataExtractionListener
  {
    public static final int EXTRACTION_DEFAULT = 1;
    public static final int EXTRACTION_DISCARD = 0;
    
    public abstract int onExtractSmartClipData(View paramView, SlookSmartClipDataElement paramSlookSmartClipDataElement, SlookSmartClipCroppedArea paramSlookSmartClipCroppedArea);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\smartclip\SlookSmartClip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */