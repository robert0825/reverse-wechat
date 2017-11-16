package com.samsung.android.sdk.look.smartclip;

import android.graphics.Rect;
import android.view.View;

public abstract interface SlookSmartClipCroppedArea
{
  public abstract Rect getRect();
  
  public abstract boolean intersects(Rect paramRect);
  
  public abstract boolean intersects(View paramView);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\smartclip\SlookSmartClipCroppedArea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */