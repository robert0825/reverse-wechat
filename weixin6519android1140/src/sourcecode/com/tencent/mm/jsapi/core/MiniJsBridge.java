package com.tencent.mm.jsapi.core;

import android.webkit.JavascriptInterface;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.d;
import com.tencent.mm.jsapi.c.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public class MiniJsBridge
{
  public String fXC;
  public c fXD;
  public e fXE;
  public d fXF;
  private volatile boolean fXG;
  public a fXH;
  public volatile boolean mRunning;
  
  public MiniJsBridge()
  {
    GMTrace.i(20022600663040L, 149180);
    GMTrace.o(20022600663040L, 149180);
  }
  
  public final boolean a(com.tencent.mm.jsapi.b.c paramc)
  {
    GMTrace.i(20023003316224L, 149183);
    e locale = this.fXE;
    if (paramc == null)
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "dispatchJsEvent failed, event is null.");
      GMTrace.o(20023003316224L, 149183);
      return false;
    }
    Object localObject = locale.fXI.ew(paramc.name);
    if (localObject == null)
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramc });
      GMTrace.o(20023003316224L, 149183);
      return false;
    }
    if (!locale.fXu.eS(((com.tencent.mm.jsapi.b.e)localObject).getIndex()))
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramc });
      GMTrace.o(20023003316224L, 149183);
      return false;
    }
    localObject = paramc.on().toString();
    w.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramc.name, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
    locale.fXF.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramc.name, localObject, "undefined", e.ws() }), null);
    GMTrace.o(20023003316224L, 149183);
    return true;
  }
  
  public final void b(com.tencent.mm.jsapi.b.c paramc)
  {
    GMTrace.i(20023137533952L, 149184);
    if (this.fXG)
    {
      GMTrace.o(20023137533952L, 149184);
      return;
    }
    w.v("MicroMsg.MiniJsBridge", "onPause(%s)", new Object[] { this.fXC });
    this.fXG = true;
    if (this.fXF.wp()) {
      this.fXF.pause();
    }
    for (;;)
    {
      if (this.fXH != null) {
        this.fXH.r(this.fXC, 3);
      }
      GMTrace.o(20023137533952L, 149184);
      return;
      a(paramc);
    }
  }
  
  public final void c(com.tencent.mm.jsapi.b.c paramc)
  {
    GMTrace.i(20023271751680L, 149185);
    if (!this.fXG)
    {
      GMTrace.o(20023271751680L, 149185);
      return;
    }
    w.v("MicroMsg.MiniJsBridge", "onResume(%s)", new Object[] { this.fXC });
    if (this.fXF.wp()) {
      this.fXF.resume();
    }
    for (;;)
    {
      this.fXG = false;
      if (this.fXH != null) {
        this.fXH.r(this.fXC, 2);
      }
      GMTrace.o(20023271751680L, 149185);
      return;
      a(paramc);
    }
  }
  
  @JavascriptInterface
  public String invokeHandler(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(20022869098496L, 149182);
    if (!this.mRunning)
    {
      paramString1 = this.fXD.fXw.A(paramString1, "fail:JsApi core not started");
      GMTrace.o(20022869098496L, 149182);
      return paramString1;
    }
    paramString1 = this.fXD.b(paramString1, paramString2, paramInt);
    GMTrace.o(20022869098496L, 149182);
    return paramString1;
  }
  
  public final void onStart()
  {
    GMTrace.i(20023405969408L, 149186);
    if (this.mRunning)
    {
      GMTrace.o(20023405969408L, 149186);
      return;
    }
    w.v("MicroMsg.MiniJsBridge", "onStart(%s)", new Object[] { this.fXC });
    this.mRunning = true;
    if (this.fXH != null) {
      this.fXH.r(this.fXC, 1);
    }
    GMTrace.o(20023405969408L, 149186);
  }
  
  @JavascriptInterface
  public void publishHandler(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    GMTrace.i(20022734880768L, 149181);
    if (paramString2 == null) {}
    for (;;)
    {
      w.d("MicroMsg.MiniJsBridge", "publishHandler, event: %s, data size: %d", new Object[] { paramString1, Integer.valueOf(i) });
      GMTrace.o(20022734880768L, 149181);
      return;
      i = paramString2.length();
    }
  }
  
  public static abstract interface a
  {
    public abstract void r(String paramString, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\core\MiniJsBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */