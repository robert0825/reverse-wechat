package com.tencent.mm.plugin.appbrand.jsruntime;

import android.webkit.ValueCallback;

public abstract interface a
{
  public abstract void addJavascriptInterface(Object paramObject, String paramString);
  
  public abstract void cleanup();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract <T extends b> T q(Class<T> paramClass);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsruntime\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */