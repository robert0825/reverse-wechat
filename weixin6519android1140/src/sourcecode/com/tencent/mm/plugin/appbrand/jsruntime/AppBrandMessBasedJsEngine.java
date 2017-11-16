package com.tencent.mm.plugin.appbrand.jsruntime;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.f;
import com.tencent.xweb.f.a;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public class AppBrandMessBasedJsEngine
  implements a, c, d
{
  private volatile boolean hUe;
  private volatile boolean hUf;
  private volatile CountDownLatch hUg;
  public f iph;
  private Handler mHandler;
  
  public AppBrandMessBasedJsEngine(Context paramContext)
  {
    GMTrace.i(20698252705792L, 154214);
    this.hUe = false;
    this.hUf = false;
    this.iph = f.a(f.a.ync, paramContext);
    this.iph.addJavascriptInterface(this, "WeixinJsThreadCaller");
    this.mHandler = new Handler(Looper.getMainLooper());
    GMTrace.o(20698252705792L, 154214);
  }
  
  public final int Yg()
  {
    GMTrace.i(20699192229888L, 154221);
    int i = this.iph.ymZ.Yg();
    GMTrace.o(20699192229888L, 154221);
    return i;
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    GMTrace.i(20699326447616L, 154222);
    this.iph.ymZ.a(paramInt, paramByteBuffer);
    GMTrace.o(20699326447616L, 154222);
  }
  
  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    GMTrace.i(20698386923520L, 154215);
    this.iph.addJavascriptInterface(paramObject, paramString);
    GMTrace.o(20698386923520L, 154215);
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public int callFromJsThread()
  {
    GMTrace.i(20699594883072L, 154224);
    w.d("MicroMsg.AppBrandMessBasedJsEngine", "enter callFromJsThread, pendingPause %b", new Object[] { Boolean.valueOf(this.hUf) });
    if (this.hUf)
    {
      w.i("MicroMsg.AppBrandMessBasedJsEngine", "pause await threadId %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
      this.hUf = false;
      this.hUg = new CountDownLatch(1);
    }
    try
    {
      this.hUg.await();
      GMTrace.o(20699594883072L, 154224);
      return 1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandMessBasedJsEngine", "pause await e = %s", new Object[] { localInterruptedException });
      }
    }
  }
  
  public final void cleanup()
  {
    GMTrace.i(20698655358976L, 154217);
    if (!this.hUe) {
      this.iph.cleanup();
    }
    this.hUe = true;
    GMTrace.o(20698655358976L, 154217);
  }
  
  public void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(20698521141248L, 154216);
    if (this.hUe)
    {
      GMTrace.o(20698521141248L, 154216);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20702547673088L, 154246);
        AppBrandMessBasedJsEngine.this.iph.evaluateJavascript(paramString, paramValueCallback);
        GMTrace.o(20702547673088L, 154246);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(20698521141248L, 154216);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(20698521141248L, 154216);
  }
  
  public final ByteBuffer iT(int paramInt)
  {
    GMTrace.i(20699460665344L, 154223);
    ByteBuffer localByteBuffer = this.iph.ymZ.iT(paramInt);
    GMTrace.o(20699460665344L, 154223);
    return localByteBuffer;
  }
  
  public final void pause()
  {
    GMTrace.i(20698923794432L, 154219);
    if (this.iph.wp())
    {
      this.iph.pause();
      GMTrace.o(20698923794432L, 154219);
      return;
    }
    this.hUf = true;
    evaluateJavascript("var ret = WeixinJsThreadCaller.callFromJsThread();", new ValueCallback() {});
    GMTrace.o(20698923794432L, 154219);
  }
  
  public final <T extends b> T q(Class<T> paramClass)
  {
    GMTrace.i(20698789576704L, 154218);
    if (paramClass.isInstance(this))
    {
      GMTrace.o(20698789576704L, 154218);
      return this;
    }
    GMTrace.o(20698789576704L, 154218);
    return null;
  }
  
  public final void resume()
  {
    GMTrace.i(20699058012160L, 154220);
    if (this.iph.wp())
    {
      this.iph.resume();
      GMTrace.o(20699058012160L, 154220);
      return;
    }
    this.hUf = false;
    if (this.hUg != null)
    {
      this.hUg.countDown();
      this.hUg = null;
    }
    GMTrace.o(20699058012160L, 154220);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsruntime\AppBrandMessBasedJsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */