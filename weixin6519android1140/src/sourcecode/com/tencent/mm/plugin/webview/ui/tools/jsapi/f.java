package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.res.AssetManager;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;

public final class f
{
  public static String rSx;
  private d rBw;
  public WebView rIF;
  private boolean rSc;
  private String rSd;
  a rSs;
  private boolean rSt;
  public boolean rSu;
  public boolean rSv;
  private final aj rSw;
  
  static
  {
    GMTrace.i(12263071154176L, 91367);
    rSx = "window.addEventListener('load', requestInjectJS, false); function requestInjectJS() { console.log('weixin://preInjectJSBridge/start');}";
    GMTrace.o(12263071154176L, 91367);
  }
  
  public f(WebView paramWebView, d paramd, a parama, boolean paramBoolean)
  {
    GMTrace.i(19428821434368L, 144756);
    this.rSt = false;
    this.rSu = true;
    this.rSv = false;
    this.rSc = false;
    this.rSd = "";
    this.rSw = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12147509690368L, 90506);
        f localf = f.this;
        boolean bool = localf.bFv();
        w.i("MicroMsg.JsLoader", "onTimerExpired, js loaded ret = %b", new Object[] { Boolean.valueOf(bool) });
        if ((bool) && (localf.rSs != null)) {
          localf.rSs.bEB();
        }
        g.ork.a(156L, 1L, 1L, false);
        if (!bool) {
          g.ork.a(156L, 0L, 1L, false);
        }
        GMTrace.o(12147509690368L, 90506);
        return false;
      }
    }, true);
    this.rIF = paramWebView;
    this.rBw = paramd;
    this.rSs = parama;
    this.rSt = paramBoolean;
    w.d("MicroMsg.JsLoader", "JsLoader <init>, withoutDelay = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(19428821434368L, 144756);
  }
  
  public final void bFh()
  {
    GMTrace.i(12262668500992L, 91364);
    w.v("MicroMsg.JsLoader", "onPageStarted");
    if (!this.rSw.bQn())
    {
      this.rSw.stopTimer();
      w.i("MicroMsg.JsLoader", "tryStopTimer success");
    }
    GMTrace.o(12262668500992L, 91364);
  }
  
  public final void bFi()
  {
    GMTrace.i(12262802718720L, 91365);
    w.v("MicroMsg.JsLoader", "onPageFinished");
    aj localaj;
    if (this.rSw.bQn())
    {
      localaj = this.rSw;
      if (!this.rSt) {
        break label61;
      }
    }
    label61:
    for (long l = 0L;; l = 1000L)
    {
      localaj.z(l, l);
      w.i("MicroMsg.JsLoader", "tryStartTimer success");
      GMTrace.o(12262802718720L, 91365);
      return;
    }
  }
  
  public final void bFu()
  {
    GMTrace.i(12262400065536L, 91362);
    this.rSc = true;
    this.rSd = bg.bQY();
    w.i("MicroMsg.JsLoader", "js digest verification randomStr = ", new Object[] { this.rSd });
    if (this.rBw != null)
    {
      d locald = this.rBw;
      String str = this.rSd;
      locald.rSc = true;
      locald.rSd = str;
    }
    GMTrace.o(12262400065536L, 91362);
  }
  
  final boolean bFv()
  {
    GMTrace.i(12262936936448L, 91366);
    try
    {
      String str2 = bg.convertStreamToString(this.rIF.getContext().getAssets().open("jsapi/wxjs.js"));
      str1 = str2;
      if (this.rSc) {
        str1 = str2.replace("isUseMd5_check", "yes").replace("xx_yy", this.rSd);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1;
        w.printErrStackTrace("MicroMsg.JsLoader", localException, "", new Object[0]);
        localObject = null;
      }
      if (this.rIF != null) {
        break label117;
      }
      w.e("MicroMsg.JsLoader", "loadJavaScript, viewWV is null");
      GMTrace.o(12262936936448L, 91366);
      return false;
      label117:
      this.rIF.evaluateJavascript("javascript:" + (String)localObject, new ValueCallback() {});
      if (this.rBw != null) {
        break label172;
      }
      w.e("MicroMsg.JsLoader", "loadJavaScript, jspai is null");
      GMTrace.o(12262936936448L, 91366);
      return false;
      label172:
      if (this.rSu) {
        break label189;
      }
      this.rIF.evaluateJavascript("javascript:WeixinJSBridge._isBridgeByIframe = false", null);
      label189:
      Object localObject = this.rBw;
      w.v("MicroMsg.JsApiHandler", "jsapi init, preInit = %b", new Object[] { Boolean.valueOf(false) });
      ((d)localObject).rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.a("sys:init", ((d)localObject).rRY, ((d)localObject).rSc, ((d)localObject).rSd) + ")", null);
      ((d)localObject).rRU.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.a("sys:bridged", null, ((d)localObject).rSc, ((d)localObject).rSd) + ")", null);
      ((d)localObject).rSa = true;
      ((d)localObject).bFn();
      if ((bg.nm(((d)localObject).rSf)) || (((d)localObject).rRU == null)) {
        break label356;
      }
      ((d)localObject).rRU.evaluateJavascript(((d)localObject).ct(((d)localObject).rSf, ((d)localObject).rSg), null);
      ((d)localObject).rSf = null;
      ((d)localObject).rSg = 0;
      label356:
      w.i("MicroMsg.JsLoader", "jsapi init done");
      GMTrace.o(12262936936448L, 91366);
    }
    if (str1 == null)
    {
      w.e("MicroMsg.JsLoader", "loadJavaScript fail, jsContent is null");
      GMTrace.o(12262936936448L, 91366);
      return false;
    }
    return true;
  }
  
  public final void detach()
  {
    GMTrace.i(12262534283264L, 91363);
    w.v("MicroMsg.JsLoader", "detach");
    this.rIF = null;
    this.rBw = null;
    this.rSs = null;
    GMTrace.o(12262534283264L, 91363);
  }
  
  public static abstract interface a
  {
    public abstract void bEB();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */