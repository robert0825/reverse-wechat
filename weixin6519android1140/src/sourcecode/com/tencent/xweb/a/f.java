package com.tencent.xweb.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.f.a;
import com.tencent.xweb.l;
import com.tencent.xweb.n;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import org.xwalk.core.Log;

public final class f
  implements d
{
  public final LinkedList<Pair<String, ValueCallback<String>>> hUk = new LinkedList();
  public boolean hUl = false;
  private n hUm = new n()
  {
    public final void a(WebView arg1, String paramAnonymousString)
    {
      synchronized (f.this.hUk)
      {
        paramAnonymousString = f.this.hUk.iterator();
        if (paramAnonymousString.hasNext())
        {
          Pair localPair = (Pair)paramAnonymousString.next();
          f.this.ynL.evaluateJavascript((String)localPair.first, (ValueCallback)localPair.second);
        }
      }
      f.this.hUk.clear();
      f.this.hUl = true;
    }
    
    public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
    {
      return true;
    }
  };
  private Handler mHandler;
  Context m_context;
  WebView ynL;
  String ynM;
  
  public f(Context paramContext, String paramString)
  {
    this.m_context = paramContext;
    this.mHandler = new Handler(Looper.getMainLooper());
    this.ynM = null;
  }
  
  public final int Yg()
  {
    return 0;
  }
  
  public final void a(int paramInt, ByteBuffer paramByteBuffer) {}
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.ynL.addJavascriptInterface(paramObject, paramString);
  }
  
  public final void cleanup()
  {
    this.ynL.destroy();
  }
  
  public final void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    synchronized (this.hUk)
    {
      if (!this.hUl)
      {
        this.hUk.add(new Pair(paramString, paramValueCallback));
        return;
      }
      paramString = new Runnable()
      {
        public final void run()
        {
          f.this.ynL.evaluateJavascript(paramString, paramValueCallback);
        }
      };
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
      {
        paramString.run();
        return;
      }
    }
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        paramString.run();
      }
    });
  }
  
  public final ByteBuffer iT(int paramInt)
  {
    return null;
  }
  
  public final void init(int paramInt)
  {
    if (paramInt == f.a.yne.ordinal()) {
      WebView.initWebviewCore(this.m_context, WebView.c.ynF, null);
    }
    for (;;)
    {
      this.ynL = new WebView(this.m_context);
      Log.d("WebViewJsRuntime", "xxx create webview base js core type=%d " + paramInt);
      this.ynL.getSettings().setJavaScriptEnabled(true);
      this.ynL.setWebViewClient(this.hUm);
      this.ynL.setWillNotDraw(true);
      this.ynL.loadDataWithBaseURL(this.ynM, "<html>\n  <head>\n    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none';script-src 'unsafe-eval';\">\n  </head>\n  <body></body>\n</html>", "text/html", "utf-8", null);
      return;
      if (paramInt == f.a.ynd.ordinal()) {
        WebView.initWebviewCore(this.m_context, WebView.c.ynH, null);
      } else if (paramInt == f.a.ynf.ordinal()) {
        WebView.initWebviewCore(this.m_context, WebView.c.ynG, null);
      }
    }
  }
  
  public final void pause() {}
  
  public final void resume() {}
  
  public final boolean wp()
  {
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */