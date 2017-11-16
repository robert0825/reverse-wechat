package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.l;
import java.io.File;
import org.json.JSONObject;

public final class a
  extends FrameLayout
  implements c.c
{
  private String hyD;
  private b inW;
  public MMWebView inX;
  private MMFalseProgressBar inY;
  private AppBrandPageView inZ;
  private final c.b ioa;
  private com.tencent.xweb.m iob;
  private com.tencent.xweb.x5.a.a.a.a.b ioc;
  
  public a(Context paramContext, e parame, AppBrandPageView paramAppBrandPageView)
  {
    super(paramContext);
    GMTrace.i(19751078199296L, 147157);
    this.iob = new com.tencent.xweb.m()
    {
      public final boolean A(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19754970513408L, 147186);
        boolean bool = a.b(a.this).M(paramAnonymousMotionEvent);
        GMTrace.o(19754970513408L, 147186);
        return bool;
      }
      
      public final void XY()
      {
        GMTrace.i(19754433642496L, 147182);
        a.b(a.this).cjn();
        GMTrace.o(19754433642496L, 147182);
      }
      
      public final boolean a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean)
      {
        GMTrace.i(19754299424768L, 147181);
        paramAnonymousBoolean = a.b(a.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(19754299424768L, 147181);
        return paramAnonymousBoolean;
      }
      
      @TargetApi(9)
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(19754567860224L, 147183);
        a.b(a.this).c(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(19754567860224L, 147183);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(19754702077952L, 147184);
        a.b(a.this).w(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        GMTrace.o(19754702077952L, 147184);
      }
      
      public final boolean y(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19754165207040L, 147180);
        boolean bool = a.b(a.this).K(paramAnonymousMotionEvent);
        GMTrace.o(19754165207040L, 147180);
        return bool;
      }
      
      public final boolean z(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19754836295680L, 147185);
        boolean bool = a.b(a.this).L(paramAnonymousMotionEvent);
        GMTrace.o(19754836295680L, 147185);
        return bool;
      }
    };
    this.ioc = new com.tencent.xweb.x5.a.a.a.a.b()
    {
      public final void computeScroll(View paramAnonymousView)
      {
        GMTrace.i(19756446908416L, 147197);
        a.c(a.this).XY();
        GMTrace.o(19756446908416L, 147197);
      }
      
      public final boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(19755910037504L, 147193);
        boolean bool = a.c(a.this).z(paramAnonymousMotionEvent);
        GMTrace.o(19755910037504L, 147193);
        return bool;
      }
      
      public final boolean onInterceptTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(19755775819776L, 147192);
        boolean bool = a.c(a.this).A(paramAnonymousMotionEvent);
        GMTrace.o(19755775819776L, 147192);
        return bool;
      }
      
      public final void onOverScrolled(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, View paramAnonymousView)
      {
        GMTrace.i(19756312690688L, 147196);
        a.c(a.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(19756312690688L, 147196);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(19756178472960L, 147195);
        a.c(a.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        GMTrace.o(19756178472960L, 147195);
      }
      
      public final boolean onTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(19755641602048L, 147191);
        boolean bool = a.c(a.this).y(paramAnonymousMotionEvent);
        GMTrace.o(19755641602048L, 147191);
        return bool;
      }
      
      public final boolean overScrollBy(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean, View paramAnonymousView)
      {
        GMTrace.i(19756044255232L, 147194);
        paramAnonymousBoolean = a.c(a.this).a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(19756044255232L, 147194);
        return paramAnonymousBoolean;
      }
    };
    this.hyD = parame.hyD;
    this.inW = new b();
    this.inW.a(parame.hyI);
    this.inZ = paramAppBrandPageView;
    this.inX = com.tencent.mm.plugin.webview.ui.tools.widget.c.a.rVm.cb(paramContext);
    this.inX.getSettings().cse();
    this.inX.getSettings().setJavaScriptEnabled(true);
    this.inX.getSettings().setMediaPlaybackRequiresUserGesture(false);
    this.inX.getSettings().csg();
    this.inX.getSettings().setUserAgentString(s.aZ(getContext(), this.inX.getSettings().getUserAgentString()));
    this.inX.getView().setHorizontalScrollBarEnabled(false);
    this.inX.getView().setVerticalScrollBarEnabled(false);
    this.inX.getSettings().setBuiltInZoomControls(true);
    this.inX.getSettings().setUseWideViewPort(true);
    this.inX.getSettings().setLoadWithOverviewMode(true);
    this.inX.getSettings().crZ();
    this.inX.getSettings().crY();
    this.inX.getSettings().setGeolocationEnabled(true);
    this.inX.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.inX.getSettings().csc();
    this.inX.getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
    this.inX.getSettings().csb();
    this.inX.getSettings().csd();
    this.inX.getSettings().setDatabasePath(com.tencent.mm.loader.stub.a.ghu + "databases/");
    this.inX.xrW = paramAppBrandPageView.ivk;
    this.inX.cjm();
    this.inX.setWebViewCallbackClient(this.iob);
    if (this.inX.isX5Kernel) {
      this.inX.setWebViewClientExtension(this.ioc);
    }
    addView(this.inX, new ViewGroup.LayoutParams(-1, -1));
    this.inY = new MMFalseProgressBar(paramContext);
    this.inY.setProgressDrawable(com.tencent.mm.br.a.b(paramContext, o.e.hAx));
    addView(this.inY, new ViewGroup.LayoutParams(-1, com.tencent.mm.br.a.fromDPToPix(paramContext, 3)));
    this.ioa = ((c.a)h.h(c.a.class)).a(this);
    this.inZ.a(new AppBrandPageView.c()
    {
      public final void onDestroy()
      {
        GMTrace.i(19753494118400L, 147175);
        a.a(a.this).cleanup();
        GMTrace.o(19753494118400L, 147175);
      }
    });
    GMTrace.o(19751078199296L, 147157);
  }
  
  private void XX()
  {
    GMTrace.i(19752151941120L, 147165);
    this.inX.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
    GMTrace.o(19752151941120L, 147165);
  }
  
  private void qT(String paramString)
  {
    GMTrace.i(19752286158848L, 147166);
    if (!bg.nm(paramString))
    {
      paramString = Uri.parse(paramString).getHost();
      if (!bg.nm(paramString))
      {
        paramString = getContext().getString(o.i.ekk, new Object[] { paramString });
        this.inZ.rP(paramString);
        GMTrace.o(19752286158848L, 147166);
        return;
      }
    }
    this.inZ.rP("");
    GMTrace.o(19752286158848L, 147166);
  }
  
  public final MMWebView XW()
  {
    GMTrace.i(19751346634752L, 147159);
    MMWebView localMMWebView = this.inX;
    GMTrace.o(19751346634752L, 147159);
    return localMMWebView;
  }
  
  public final void bBP()
  {
    GMTrace.i(21058627305472L, 156899);
    this.inZ.hzM.hyJ.Zr();
    GMTrace.o(21058627305472L, 156899);
  }
  
  public final String getAppId()
  {
    GMTrace.i(19751212417024L, 147158);
    String str = this.hyD;
    GMTrace.o(19751212417024L, 147158);
    return str;
  }
  
  public final void n(JSONObject paramJSONObject)
  {
    GMTrace.i(19751615070208L, 147161);
    this.inW.mData = paramJSONObject.toString();
    this.inW.VR();
    GMTrace.o(19751615070208L, 147161);
  }
  
  public final void qQ(String paramString)
  {
    GMTrace.i(19751749287936L, 147162);
    this.inZ.rO(paramString);
    GMTrace.o(19751749287936L, 147162);
  }
  
  public final void qR(String paramString)
  {
    GMTrace.i(19751883505664L, 147163);
    XX();
    this.inY.start();
    qT(paramString);
    GMTrace.o(19751883505664L, 147163);
  }
  
  public final void qS(String paramString)
  {
    GMTrace.i(19752017723392L, 147164);
    XX();
    this.inY.finish();
    qT(paramString);
    GMTrace.o(19752017723392L, 147164);
  }
  
  public final void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(19751480852480L, 147160);
    post(paramRunnable);
    GMTrace.o(19751480852480L, 147160);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\k\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */