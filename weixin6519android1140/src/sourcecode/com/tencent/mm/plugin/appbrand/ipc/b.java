package com.tencent.mm.plugin.appbrand.ipc;

import com.tencent.mm.ui.MMActivity;

public abstract interface b
{
  public abstract MMActivity VD();
  
  public abstract boolean VE();
  
  public abstract void a(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult);
  
  public abstract void b(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult);
  
  public abstract void runOnUiThread(Runnable paramRunnable);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */