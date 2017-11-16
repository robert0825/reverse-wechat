package com.samsung.android.sdk.look.smartclip;

import android.graphics.Rect;

public abstract interface SlookSmartClipDataElement
{
  public abstract void addTag(SlookSmartClipMetaTag paramSlookSmartClipMetaTag);
  
  public abstract SlookSmartClipMetaTagArray getAllTag();
  
  public abstract Rect getMetaAreaRect();
  
  public abstract SlookSmartClipMetaTagArray getTag(String paramString);
  
  public abstract void removeTag(String paramString);
  
  public abstract void setMetaAreaRect(Rect paramRect);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\smartclip\SlookSmartClipDataElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */