package com.samsung.android.sdk;

import android.content.Context;

public abstract interface SsdkInterface
{
  public abstract int getVersionCode();
  
  public abstract String getVersionName();
  
  public abstract void initialize(Context paramContext);
  
  public abstract boolean isFeatureEnabled(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\SsdkInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */