package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;

public abstract interface n
{
  public abstract int RP();
  
  public abstract AppBrandRemoteTaskController.c RR();
  
  public abstract void a(e parame);
  
  public abstract void a(e parame, AppBrandInitConfig paramAppBrandInitConfig, AppBrandStatObject paramAppBrandStatObject);
  
  public abstract e b(e parame);
  
  public abstract boolean c(e parame);
  
  public abstract void close();
  
  public abstract void d(e parame);
  
  public abstract void finish();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */