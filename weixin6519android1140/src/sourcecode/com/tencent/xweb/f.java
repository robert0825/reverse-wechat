package com.tencent.xweb;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.xweb.a.d;
import com.tencent.xweb.a.g;
import com.tencent.xweb.a.g.a;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class f
{
  private static String yna = "";
  private volatile boolean hUe = false;
  private a ymY;
  public d ymZ;
  
  private f(a parama, Context paramContext)
  {
    i.ip(paramContext);
    Object localObject;
    if (i.crW().ynq != a.ync)
    {
      parama = i.crW().ynq;
      XWalkEnvironment.addXWalkInitializeLog("XWeb", "use hardcode jscore type = " + parama);
      localObject = parama;
      if (parama != a.ync)
      {
        localObject = parama;
        if (parama == a.yng)
        {
          localObject = parama;
          if (WebView.getCurWebType() != WebView.c.ynG) {
            localObject = a.ync;
          }
        }
      }
      parama = (a)localObject;
      if (localObject == a.ync)
      {
        if (WebView.getCurWebType() != WebView.c.ynF) {
          break label267;
        }
        parama = a.yni;
      }
      label108:
      switch (1.ynb[parama.ordinal()])
      {
      }
    }
    for (;;)
    {
      if (this.ymZ == null)
      {
        this.ymZ = new com.tencent.xweb.a.f(paramContext, null);
        this.ymZ.init(parama.ordinal());
      }
      this.ymY = parama;
      Log.d("JsRuntime", "xxx IJsRuntime  request=" + parama.toString() + ", create=" + yna);
      return;
      if (a.crQ() == a.ync) {
        break;
      }
      parama = a.crQ();
      XWalkEnvironment.addXWalkInitializeLog("XWeb", "use cmd jscore type = " + parama);
      break;
      label267:
      if (WebView.getCurWebType() == WebView.c.ynG)
      {
        parama = a.yng;
        break label108;
      }
      parama = a.ynd;
      break label108;
      yna = "sys";
      continue;
      yna = "xwalk";
      continue;
      yna = "x5 web";
      continue;
      this.ymZ = g.a(WebView.c.ynG).getJsCore(parama, paramContext);
      if (this.ymZ != null)
      {
        yna = "x5";
      }
      else
      {
        parama = a.ynf;
        yna = "x5 web";
        continue;
        this.ymZ = g.a(WebView.c.ynF).getJsCore(parama, paramContext);
        if (this.ymZ != null)
        {
          if (parama == a.ynh) {}
          for (localObject = "j2v8";; localObject = "nativeScript")
          {
            yna = (String)localObject;
            break;
          }
        }
        parama = a.ynd;
      }
    }
  }
  
  public static f a(a parama, Context paramContext)
  {
    return new f(parama, paramContext);
  }
  
  public static String crV()
  {
    return yna;
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.ymZ.addJavascriptInterface(paramObject, paramString);
  }
  
  public final void cleanup()
  {
    if (!this.hUe) {
      this.ymZ.cleanup();
    }
    this.hUe = true;
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (this.hUe) {
      return;
    }
    this.ymZ.evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final void pause()
  {
    this.ymZ.pause();
  }
  
  public final void resume()
  {
    this.ymZ.resume();
  }
  
  public final boolean wp()
  {
    return this.ymZ.wp();
  }
  
  public final boolean wq()
  {
    if (this.ymZ == null) {}
    while ((this.ymY == a.ynd) || (this.ymY == a.ynf) || (this.ymY == a.yne)) {
      return true;
    }
    return false;
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */