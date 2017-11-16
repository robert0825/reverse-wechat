package com.tencent.mm.plugin.appbrand.dynamic.jsengine;

import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.f;
import java.util.concurrent.CountDownLatch;

class AppBrandIndV8JsEngine
  implements d
{
  public f hUd;
  private volatile boolean hUe;
  private volatile boolean hUf;
  private volatile CountDownLatch hUg;
  private ae mHandler;
  
  public AppBrandIndV8JsEngine(Object paramObject, String paramString, f paramf)
  {
    GMTrace.i(19916971311104L, 148393);
    this.hUf = false;
    this.hUd = paramf;
    this.hUe = false;
    this.hUd.addJavascriptInterface(paramObject, paramString);
    this.mHandler = new ae(Looper.getMainLooper());
    this.hUd.addJavascriptInterface(this, "WeixinJsThreadCaller");
    GMTrace.o(19916971311104L, 148393);
  }
  
  @JavascriptInterface
  public int callFromJsThread()
  {
    GMTrace.i(19917105528832L, 148394);
    w.d("MicroMsg.AppBrandX5BasedJsEngine", "enter callFromJsThread, pendingPause %b", new Object[] { Boolean.valueOf(this.hUf) });
    if (this.hUf)
    {
      w.i("MicroMsg.AppBrandX5BasedJsEngine", "pause await threadId %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
      this.hUf = false;
      this.hUg = new CountDownLatch(1);
    }
    try
    {
      this.hUg.await();
      GMTrace.o(19917105528832L, 148394);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandX5BasedJsEngine", "pause await e = %s", new Object[] { localInterruptedException });
      }
    }
  }
  
  public void cleanup()
  {
    GMTrace.i(19917373964288L, 148396);
    if (!this.hUe) {
      this.hUd.cleanup();
    }
    this.hUe = true;
    GMTrace.o(19917373964288L, 148396);
  }
  
  public void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19917239746560L, 148395);
    if (this.hUe)
    {
      GMTrace.o(19917239746560L, 148395);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19918045052928L, 148401);
        AppBrandIndV8JsEngine.this.hUd.evaluateJavascript(paramString, paramValueCallback);
        GMTrace.o(19918045052928L, 148401);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19917239746560L, 148395);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(19917239746560L, 148395);
  }
  
  public void pause()
  {
    GMTrace.i(19917508182016L, 148397);
    if (this.hUd.wp())
    {
      this.hUd.pause();
      GMTrace.o(19917508182016L, 148397);
      return;
    }
    this.hUf = true;
    evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new ValueCallback() {});
    GMTrace.o(19917508182016L, 148397);
  }
  
  public void resume()
  {
    GMTrace.i(19917642399744L, 148398);
    if (this.hUd.wp())
    {
      this.hUd.resume();
      GMTrace.o(19917642399744L, 148398);
      return;
    }
    this.hUf = false;
    if (this.hUg != null)
    {
      this.hUg.countDown();
      this.hUg = null;
    }
    GMTrace.o(19917642399744L, 148398);
  }
  
  public boolean wp()
  {
    GMTrace.i(19917776617472L, 148399);
    GMTrace.o(19917776617472L, 148399);
    return true;
  }
  
  public boolean wq()
  {
    GMTrace.i(19916837093376L, 148392);
    boolean bool = this.hUd.wq();
    GMTrace.o(19916837093376L, 148392);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\jsengine\AppBrandIndV8JsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */