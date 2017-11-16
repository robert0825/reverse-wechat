package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Parcelable;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;

public abstract interface WxaWidgetContext
  extends Parcelable
{
  public abstract WxaPkgWrappingInfo UQ();
  
  public abstract WxaPkgWrappingInfo UR();
  
  public abstract int US();
  
  public abstract int UT();
  
  public abstract byte[] UU();
  
  public abstract int UV();
  
  public abstract DebuggerInfo UW();
  
  public abstract WidgetSysConfig UX();
  
  public abstract WidgetRuntimeConfig UY();
  
  public abstract String getAppId();
  
  public abstract String getId();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\WxaWidgetContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */