package com.tencent.xweb.a;

import android.webkit.ValueCallback;
import java.nio.ByteBuffer;

public abstract interface d
{
  public abstract int Yg();
  
  public abstract void a(int paramInt, ByteBuffer paramByteBuffer);
  
  public abstract void addJavascriptInterface(Object paramObject, String paramString);
  
  public abstract void cleanup();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract ByteBuffer iT(int paramInt);
  
  public abstract void init(int paramInt);
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract boolean wp();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */