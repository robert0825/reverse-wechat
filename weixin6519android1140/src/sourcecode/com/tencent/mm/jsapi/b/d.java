package com.tencent.mm.jsapi.b;

import android.webkit.ValueCallback;

public abstract interface d
{
  public abstract void cleanup();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract boolean wp();
  
  public abstract boolean wq();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */