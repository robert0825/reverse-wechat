package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.ComponentName;
import android.net.Uri;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.model.aa;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.stub.d.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.e.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.e.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;

public class b
  extends com.tencent.mm.plugin.webview.ui.tools.widget.e
{
  public b(MMWebView paramMMWebView)
  {
    super(paramMMWebView, false);
    GMTrace.i(18076846260224L, 134683);
    this.rVx = new a();
    GMTrace.o(18076846260224L, 134683);
  }
  
  protected boolean Mp(String paramString)
  {
    GMTrace.i(18076980477952L, 134684);
    boolean bool = super.Mp(paramString);
    GMTrace.o(18076980477952L, 134684);
    return bool;
  }
  
  protected final void bFg()
  {
    GMTrace.i(18077114695680L, 134685);
    try
    {
      this.rQv.a(this.rVq, true, null);
      if (MD(this.rVq))
      {
        GMTrace.o(18077114695680L, 134685);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.w("MicroMsg.GameFloatWebViewClient", "postBinded, jumpToActivity, ex = " + localException.getMessage());
      }
      Uri localUri = Uri.parse(this.rVq);
      Object localObject = localUri;
      if (localUri.getScheme() == null)
      {
        this.rVq += "http://";
        localObject = Uri.parse(this.rVq);
      }
      if (((Uri)localObject).getScheme().startsWith("http"))
      {
        w.i("MicroMsg.GameFloatWebViewClient", "uri scheme not startwith http, scheme = " + ((Uri)localObject).getScheme());
        if (this.rVu) {}
        for (localObject = "";; localObject = this.rVq)
        {
          this.rVp = new e.a((String)localObject);
          this.rVu = false;
          if ((!this.lJO) && (!this.rSb.has(this.rVq))) {
            break label314;
          }
          if (aa.Lf(this.rVq)) {
            break;
          }
          w.f("MicroMsg.GameFloatWebViewClient", "loadInitialUrl, canLoadUrl fail, url = " + this.rVq);
          Mq(this.rVq);
          GMTrace.o(18077114695680L, 134685);
          return;
        }
        if (Mg(this.rVq))
        {
          zz(this.rVq);
          GMTrace.o(18077114695680L, 134685);
          return;
        }
        this.inX.loadUrl(this.rVq);
        GMTrace.o(18077114695680L, 134685);
        return;
        label314:
        if (Mg(this.rVq))
        {
          zz(this.rVq);
          this.lJH = this.rVq;
        }
        aI(this.rVq, false);
        GMTrace.o(18077114695680L, 134685);
        return;
      }
      if (!aa.Lf(this.rVq))
      {
        Mq(this.rVq);
        GMTrace.o(18077114695680L, 134685);
        return;
      }
      this.inX.loadUrl(this.rVq);
      GMTrace.o(18077114695680L, 134685);
    }
  }
  
  private final class a
    extends e.c
  {
    public a()
    {
      super();
      GMTrace.i(18090670686208L, 134786);
      GMTrace.o(18090670686208L, 134786);
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      GMTrace.i(18090804903936L, 134787);
      w.i("MicroMsg.GameFloatWebViewClient", "onServiceConnected");
      if (b.this.inX == null)
      {
        w.e("MicroMsg.GameFloatWebViewClient", "onServiceConnected, activity destroyed");
        GMTrace.o(18090804903936L, 134787);
        return;
      }
      try
      {
        b.this.rQv = d.a.X(paramIBinder);
        b.this.rQv.a(b.this.rVy, b.this.inX.hashCode());
        b.this.bFQ();
        b.this.a(b.this.rQv, b.this.rSb);
        b.this.bFg();
        GMTrace.o(18090804903936L, 134787);
        return;
      }
      catch (Exception paramComponentName)
      {
        w.e("MicroMsg.GameFloatWebViewClient", "addCallback fail, ex = %s", new Object[] { paramComponentName.getMessage() });
        GMTrace.o(18090804903936L, 134787);
      }
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      GMTrace.i(18090939121664L, 134788);
      super.onServiceDisconnected(paramComponentName);
      GMTrace.o(18090939121664L, 134788);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */