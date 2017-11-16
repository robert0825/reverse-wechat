package com.tencent.mm.plugin.appbrand.jsruntime;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.n;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends WebView
  implements a
{
  private final LinkedList<Pair<String, ValueCallback<String>>> hUk;
  private boolean hUl;
  private n hUm;
  private boolean ipj;
  private Context mContext;
  private ae mHandler;
  private volatile boolean pM;
  
  public e(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20699997536256L, 154227);
    this.ipj = false;
    this.hUk = new LinkedList();
    this.hUl = false;
    this.pM = false;
    this.hUm = new n()
    {
      public final void a(WebView arg1, String paramAnonymousString)
      {
        GMTrace.i(20702145019904L, 154243);
        synchronized (e.a(e.this))
        {
          paramAnonymousString = e.a(e.this).iterator();
          if (paramAnonymousString.hasNext())
          {
            Pair localPair = (Pair)paramAnonymousString.next();
            e.b(e.this, (String)localPair.first, (ValueCallback)localPair.second);
          }
        }
        e.a(e.this).clear();
        e.b(e.this);
        GMTrace.o(20702145019904L, 154243);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(20702279237632L, 154244);
        GMTrace.o(20702279237632L, 154244);
        return true;
      }
    };
    this.mContext = paramContext;
    this.mHandler = new ae(Looper.getMainLooper());
    getSettings().setJavaScriptEnabled(true);
    getSettings().setUserAgentString(s.aZ(this.mContext, getSettings().getUserAgentString()));
    setWebViewClient(this.hUm);
    setWillNotDraw(true);
    GMTrace.o(20699997536256L, 154227);
  }
  
  private void a(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(20700400189440L, 154230);
    if (this.pM)
    {
      GMTrace.o(20700400189440L, 154230);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20697581617152L, 154209);
        e.a(e.this, paramString, paramValueCallback);
        GMTrace.o(20697581617152L, 154209);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(20700400189440L, 154230);
      return;
    }
    this.mHandler.post(paramString);
    GMTrace.o(20700400189440L, 154230);
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    GMTrace.i(20700131753984L, 154228);
    if ((paramObject != null) && (!bg.nm(paramString))) {
      super.addJavascriptInterface(paramObject, paramString);
    }
    GMTrace.o(20700131753984L, 154228);
  }
  
  public final void cleanup()
  {
    GMTrace.i(20700534407168L, 154231);
    this.pM = true;
    destroy();
    GMTrace.o(20700534407168L, 154231);
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(20700265971712L, 154229);
    if (!this.ipj)
    {
      this.ipj = true;
      loadDataWithBaseURL("https://servicewechat.com/js-engine", "<html>\n  <head>\n    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none';script-src 'unsafe-eval';\">\n  </head>\n  <body></body>\n</html>", "text/html", "utf-8", null);
    }
    synchronized (this.hUk)
    {
      if (!this.hUl)
      {
        this.hUk.add(new Pair(paramString, paramValueCallback));
        GMTrace.o(20700265971712L, 154229);
        return;
      }
      a(paramString, paramValueCallback);
      GMTrace.o(20700265971712L, 154229);
      return;
    }
  }
  
  public final <T extends b> T q(Class<T> paramClass)
  {
    GMTrace.i(20700668624896L, 154232);
    GMTrace.o(20700668624896L, 154232);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsruntime\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */