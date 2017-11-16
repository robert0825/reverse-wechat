package com.tencent.mm.plugin.appbrand.page;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.o.h.a;
import com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class t
  extends MMWebView
  implements com.tencent.mm.plugin.appbrand.jsruntime.a
{
  boolean hUl;
  private n hUm;
  public String hZo;
  String hyD;
  e hzM;
  private m iob;
  private com.tencent.xweb.x5.a.a.a.a.b ioc;
  c ivt;
  public String iwc;
  public w iwd;
  v iwe;
  com.tencent.mm.plugin.appbrand.h.l iwf;
  private LinkedList<Pair<String, ValueCallback<String>>> iwg;
  private long iwh;
  long iwi;
  private long iwj;
  public boolean iwk;
  private boolean iwl;
  private boolean iwm;
  boolean iwn;
  long iwo;
  private String iwp;
  private String iwq;
  private com.tencent.xweb.h iwr;
  
  public t(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20759724425216L, 154672);
    this.hUl = false;
    this.iwk = false;
    this.iwl = false;
    this.iwm = false;
    this.iwn = true;
    this.iwp = null;
    this.iwq = null;
    this.hUm = new n()
    {
      private k rV(String paramAnonymousString)
      {
        GMTrace.i(19894691168256L, 148227);
        Object localObject;
        if (paramAnonymousString.startsWith(t.e(t.this))) {
          if ((t.f(t.this)) && (paramAnonymousString.equals(t.g(t.this))))
          {
            localObject = com.tencent.mm.plugin.appbrand.appcache.l.on("WAPageFrame.html");
            if (localObject != null) {
              break label305;
            }
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "getAppResourceResponse %s not found", new Object[] { paramAnonymousString });
            localObject = new k("image/*", "utf-8", 404, "Not Found", new HashMap(), new ByteArrayInputStream(new byte[0]));
          }
        }
        label105:
        label305:
        for (;;)
        {
          if ((localObject != null) && (((k)localObject).mStatusCode != 404))
          {
            ((k)localObject).setStatusCodeAndReasonPhrase(200, "Ok");
            ((k)localObject).mResponseHeaders = new HashMap();
          }
          if (localObject == null) {}
          for (boolean bool = true;; bool = false)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "tryInterceptWebViewRequest, reqURL = %s, WebResourceResponse == null ? %b", new Object[] { paramAnonymousString, Boolean.valueOf(bool) });
            GMTrace.o(19894691168256L, 148227);
            return (k)localObject;
            localObject = com.tencent.mm.plugin.appbrand.appcache.w.c(t.b(t.this), paramAnonymousString.replaceFirst(t.e(t.this), ""));
            break;
            if (paramAnonymousString.startsWith("wxfile://"))
            {
              localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(t.a(t.this), paramAnonymousString);
              if (localObject != null) {
                try
                {
                  localObject = new k(((AppBrandLocalMediaObject)localObject).mimeType, "utf-8", new FileInputStream(((AppBrandLocalMediaObject)localObject).gpy));
                }
                catch (Exception localException)
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "tryInterceptWebViewRequest with localId(%s), exp = %s", new Object[] { paramAnonymousString, bg.f(localException) });
                }
              }
              localk = null;
              break label105;
            }
            k localk = com.tencent.mm.plugin.appbrand.appcache.w.c(t.b(t.this), paramAnonymousString);
            break label105;
          }
        }
      }
      
      public final k a(WebView paramAnonymousWebView, j paramAnonymousj)
      {
        GMTrace.i(19894959603712L, 148229);
        if ((paramAnonymousj == null) || (paramAnonymousj.getUrl() == null) || (bg.nm(paramAnonymousj.getUrl().toString())))
        {
          GMTrace.o(19894959603712L, 148229);
          return null;
        }
        paramAnonymousWebView = rV(paramAnonymousj.getUrl().toString());
        GMTrace.o(19894959603712L, 148229);
        return paramAnonymousWebView;
      }
      
      public final k a(WebView paramAnonymousWebView, j paramAnonymousj, Bundle paramAnonymousBundle)
      {
        GMTrace.i(19895093821440L, 148230);
        if ((paramAnonymousj == null) || (paramAnonymousj.getUrl() == null) || (bg.nm(paramAnonymousj.getUrl().toString())))
        {
          GMTrace.o(19895093821440L, 148230);
          return null;
        }
        paramAnonymousWebView = rV(paramAnonymousj.getUrl().toString());
        GMTrace.o(19895093821440L, 148230);
        return paramAnonymousWebView;
      }
      
      public final void a(WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19895228039168L, 148231);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString1, paramAnonymousString2 });
        GMTrace.o(19895228039168L, 148231);
      }
      
      public final void a(WebView paramAnonymousWebView, com.tencent.xweb.g paramAnonymousg, SslError paramAnonymousSslError)
      {
        GMTrace.i(19894556950528L, 148226);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "SSL Error, Page URL: %s, Code %d", new Object[] { t.this.hZo, Integer.valueOf(paramAnonymousSslError.getPrimaryError()) });
        t.a(t.this, paramAnonymousg, paramAnonymousSslError);
        GMTrace.o(19894556950528L, 148226);
      }
      
      public final void a(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19894288515072L, 148224);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onPageFinished, url = %s", new Object[] { paramAnonymousString });
        if (t.c(t.this))
        {
          GMTrace.o(19894288515072L, 148224);
          return;
        }
        t.a(t.this, true);
        t.a(t.this, System.currentTimeMillis());
        t.d(t.this);
        GMTrace.o(19894288515072L, 148224);
      }
      
      public final void a(j paramAnonymousj, k paramAnonymousk)
      {
        GMTrace.i(20759590207488L, 154671);
        paramAnonymousj = paramAnonymousj.getUrl();
        if (paramAnonymousj == null) {}
        for (paramAnonymousj = "null";; paramAnonymousj = paramAnonymousj.toString())
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onReceivedHttpError, WebResourceRequest url = %s, ErrWebResourceResponse mimeType = %s, status = %d", new Object[] { paramAnonymousj, paramAnonymousk.mMimeType, Integer.valueOf(paramAnonymousk.mStatusCode) });
          GMTrace.o(20759590207488L, 154671);
          return;
        }
      }
      
      public final void b(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(19894154297344L, 148223);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onPageStarted, url = %s", new Object[] { paramAnonymousString });
        t.a(t.this, false);
        GMTrace.o(19894154297344L, 148223);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19894422732800L, 148225);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "shouldOverrideUrlLoading, url = %s", new Object[] { paramAnonymousString });
        GMTrace.o(19894422732800L, 148225);
        return true;
      }
      
      public final k e(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19894825385984L, 148228);
        if (bg.nm(paramAnonymousString))
        {
          GMTrace.o(19894825385984L, 148228);
          return null;
        }
        paramAnonymousWebView = rV(paramAnonymousString);
        GMTrace.o(19894825385984L, 148228);
        return paramAnonymousWebView;
      }
    };
    this.iwr = new com.tencent.xweb.h()
    {
      public final void onHideCustomView()
      {
        GMTrace.i(17302275751936L, 128912);
        try
        {
          if (t.h(t.this) != null) {
            t.h(t.this).YZ();
          }
          GMTrace.o(17302275751936L, 128912);
          return;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onHideCustomView error " + localException.getMessage());
          GMTrace.o(17302275751936L, 128912);
        }
      }
      
      public final void onShowCustomView(View paramAnonymousView, WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
      {
        GMTrace.i(19899254571008L, 148261);
        try
        {
          if (t.h(t.this) != null)
          {
            t.h(t.this).r(paramAnonymousView, 90);
            t.h(t.this).itZ = paramAnonymousCustomViewCallback;
          }
          GMTrace.o(19899254571008L, 148261);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "onShowCustomView error " + paramAnonymousView.getMessage());
          GMTrace.o(19899254571008L, 148261);
        }
      }
    };
    this.iob = new m()
    {
      public final boolean A(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17291806769152L, 128834);
        boolean bool = t.this.M(paramAnonymousMotionEvent);
        GMTrace.o(17291806769152L, 128834);
        return bool;
      }
      
      public final void XY()
      {
        GMTrace.i(17291269898240L, 128830);
        t.this.cjn();
        GMTrace.o(17291269898240L, 128830);
      }
      
      public final boolean a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17291135680512L, 128829);
        paramAnonymousBoolean = t.this.b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(17291135680512L, 128829);
        return paramAnonymousBoolean;
      }
      
      @TargetApi(9)
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(17291404115968L, 128831);
        t.this.c(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(17291404115968L, 128831);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(17291538333696L, 128832);
        if (t.i(t.this) != null) {
          t.i(t.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        }
        t.this.w(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        GMTrace.o(17291538333696L, 128832);
      }
      
      public final boolean y(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17291001462784L, 128828);
        boolean bool = t.this.K(paramAnonymousMotionEvent);
        GMTrace.o(17291001462784L, 128828);
        return bool;
      }
      
      public final boolean z(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17291672551424L, 128833);
        boolean bool = t.this.L(paramAnonymousMotionEvent);
        GMTrace.o(17291672551424L, 128833);
        return bool;
      }
    };
    this.ioc = new com.tencent.xweb.x5.a.a.a.a.b()
    {
      public final void computeScroll(View paramAnonymousView)
      {
        GMTrace.i(17292746293248L, 128841);
        t.j(t.this).XY();
        GMTrace.o(17292746293248L, 128841);
      }
      
      public final boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17292343640064L, 128838);
        boolean bool = t.j(t.this).z(paramAnonymousMotionEvent);
        GMTrace.o(17292343640064L, 128838);
        return bool;
      }
      
      public final void hasDiscardCurrentPage(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19899523006464L, 148263);
        t.b(t.this, paramAnonymousBoolean);
        t localt = t.this;
        if (!paramAnonymousBoolean) {}
        for (paramAnonymousBoolean = true;; paramAnonymousBoolean = false)
        {
          t.a(localt, paramAnonymousBoolean);
          GMTrace.o(19899523006464L, 148263);
          return;
        }
      }
      
      public final boolean onInterceptTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17292209422336L, 128837);
        boolean bool = t.j(t.this).A(paramAnonymousMotionEvent);
        GMTrace.o(17292209422336L, 128837);
        return bool;
      }
      
      public final Object onMiscCallBack(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        GMTrace.i(17293148946432L, 128844);
        if ((!bg.nm(paramAnonymousString)) && (paramAnonymousBundle != null))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "method = %s", new Object[] { paramAnonymousString });
          if (paramAnonymousString.equalsIgnoreCase("shouldInterceptMediaUrl"))
          {
            paramAnonymousString = paramAnonymousBundle.getString("url");
            if (!bg.nm(paramAnonymousString))
            {
              paramAnonymousBundle = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(t.a(t.this), paramAnonymousString);
              if (paramAnonymousBundle == null)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "get meidiaobj failed, appid : %s, localid :%s", new Object[] { t.a(t.this), paramAnonymousString });
                GMTrace.o(17293148946432L, 128844);
                return null;
              }
              paramAnonymousBundle = paramAnonymousBundle.gpy;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "filePath" + paramAnonymousBundle + "tempFilePath" + paramAnonymousString);
              GMTrace.o(17293148946432L, 128844);
              return paramAnonymousBundle;
            }
          }
        }
        GMTrace.o(17293148946432L, 128844);
        return null;
      }
      
      public final void onOverScrolled(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, View paramAnonymousView)
      {
        GMTrace.i(17292612075520L, 128840);
        t.j(t.this).b(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean1, paramAnonymousBoolean2);
        GMTrace.o(17292612075520L, 128840);
      }
      
      public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, View paramAnonymousView)
      {
        GMTrace.i(10267387756544L, 76498);
        t.j(t.this).onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousView);
        GMTrace.o(10267387756544L, 76498);
      }
      
      public final boolean onShowLongClickPopupMenu()
      {
        GMTrace.i(17292880510976L, 128842);
        if (WebView.getTbsCoreVersion(t.this.getContext()) >= 43011)
        {
          GMTrace.o(17292880510976L, 128842);
          return false;
        }
        GMTrace.o(17292880510976L, 128842);
        return true;
      }
      
      public final boolean onTouchEvent(MotionEvent paramAnonymousMotionEvent, View paramAnonymousView)
      {
        GMTrace.i(17292075204608L, 128836);
        boolean bool = t.j(t.this).y(paramAnonymousMotionEvent);
        GMTrace.o(17292075204608L, 128836);
        return bool;
      }
      
      public final boolean overScrollBy(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8, boolean paramAnonymousBoolean, View paramAnonymousView)
      {
        GMTrace.i(17292477857792L, 128839);
        paramAnonymousBoolean = t.j(t.this).a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt5, paramAnonymousInt6, paramAnonymousInt7, paramAnonymousInt8, paramAnonymousBoolean);
        GMTrace.o(17292477857792L, 128839);
        return paramAnonymousBoolean;
      }
      
      public final boolean shouldDiscardCurrentPage()
      {
        GMTrace.i(19899388788736L, 148262);
        boolean bool2 = t.k(t.this).Zy();
        if ((bool2) && (!t.l(t.this))) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "shouldTrimCurrentPage: %b", new Object[] { Boolean.valueOf(bool1) });
          if ((!bool2) || (t.l(t.this))) {
            break;
          }
          GMTrace.o(19899388788736L, 148262);
          return true;
        }
        GMTrace.o(19899388788736L, 148262);
        return false;
      }
    };
    this.fRu = true;
    boolean bool;
    if (getX5WebViewExtension() != null) {
      bool = true;
    }
    for (;;)
    {
      this.isX5Kernel = bool;
      this.iwg = new LinkedList();
      this.iwh = System.currentTimeMillis();
      fI(getContext());
      getSettings().cse();
      getSettings().setJavaScriptEnabled(true);
      getSettings().setMediaPlaybackRequiresUserGesture(false);
      getSettings().csg();
      getSettings().setUserAgentString(s.aZ(getContext(), getSettings().getUserAgentString()));
      getView().setHorizontalScrollBarEnabled(false);
      getView().setVerticalScrollBarEnabled(false);
      setWebViewClient(this.hUm);
      setWebChromeClient(this.iwr);
      setWebViewCallbackClient(this.iob);
      if (this.isX5Kernel) {
        setWebViewClientExtension(this.ioc);
      }
      try
      {
        a.a.ch(getX5WebViewExtension()).l("setEnableAutoPageDiscarding", new Object[] { Boolean.valueOf(false) });
        a.a.ch(getX5WebViewExtension()).l("setEnableAutoPageRestoration", new Object[] { Boolean.valueOf(false) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Is the current broswer kernel X5, " + this.isX5Kernel);
        setBackgroundColor(-1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            GMTrace.i(10234370195456L, 76252);
            if (WebView.getTbsCoreVersion(t.this.getContext()) >= 43011)
            {
              GMTrace.o(10234370195456L, 76252);
              return false;
            }
            GMTrace.o(10234370195456L, 76252);
            return true;
          }
        });
        setDownloadListener(new DownloadListener()
        {
          public final void onDownloadStart(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, long paramAnonymousLong)
          {
            GMTrace.i(10232893800448L, 76241);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "onDownloadStart called, url = %s, mimeType = %s, userAgent = %s", new Object[] { paramAnonymousString1, paramAnonymousString4, paramAnonymousString2 });
            GMTrace.o(10232893800448L, 76241);
          }
        });
        GMTrace.o(20759724425216L, 154672);
        return;
        bool = false;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "DisableAutoPageDiscarding error " + paramContext);
        }
      }
    }
  }
  
  private void ZJ()
  {
    GMTrace.i(20759858642944L, 154673);
    Iterator localIterator = this.iwg.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      super.evaluateJavascript((String)localPair.first, (ValueCallback)localPair.second);
    }
    this.iwg.clear();
    GMTrace.o(20759858642944L, 154673);
  }
  
  private String ZL()
  {
    GMTrace.i(10262421700608L, 76461);
    if (this.iwp == null)
    {
      this.iwp = "https://servicewechat.com/";
      if (!this.iwk) {
        break label73;
      }
    }
    label73:
    for (this.iwp += "preload/";; this.iwp = (this.iwp + this.hyD + "/" + this.hzM.hyG.hRg.hKC + "/"))
    {
      String str = this.iwp;
      GMTrace.o(10262421700608L, 76461);
      return str;
    }
  }
  
  private String ZM()
  {
    GMTrace.i(20760261296128L, 154676);
    if (this.iwq == null) {
      this.iwq = (ZL() + "page-frame.html");
    }
    String str = this.iwq;
    GMTrace.o(20760261296128L, 154676);
    return str;
  }
  
  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    GMTrace.i(18357361311744L, 136773);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      GMTrace.o(18357361311744L, 136773);
      return;
    }
    catch (Exception paramJSONObject)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", paramJSONObject.getMessage());
      GMTrace.o(18357361311744L, 136773);
    }
  }
  
  private static String rU(String paramString)
  {
    GMTrace.i(20760395513856L, 154677);
    String str = "";
    int i = 0;
    int j = paramString.indexOf("<script>", i);
    int k = paramString.indexOf("</script>", i);
    if ((j != -1) && (k != -1) && (k > j))
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str);
      if (i > 0) {}
      for (str = ";";; str = "")
      {
        str = str + paramString.substring(j + 8, k);
        i = k + 9;
        break;
      }
    }
    GMTrace.o(20760395513856L, 154677);
    return str;
  }
  
  final void ZK()
  {
    GMTrace.i(20760127078400L, 154675);
    if (!this.iwm)
    {
      this.iwm = true;
      localObject1 = new JSONObject();
      a((JSONObject)localObject1, "clientVersion", Integer.valueOf(d.tJC));
      localObject2 = new JSONObject();
      a((JSONObject)localObject2, "width", Float.valueOf(getResources().getDisplayMetrics().widthPixels / getResources().getDisplayMetrics().density));
      a((JSONObject)localObject2, "pixelRatio", Float.valueOf(getResources().getDisplayMetrics().density));
      evaluateJavascript(String.format("var __wxConfig = %s;\nvar __deviceInfo__ = %s\n", new Object[] { ((JSONObject)localObject1).toString(), ((JSONObject)localObject2).toString() }), null);
    }
    Object localObject1 = "";
    if (!this.iwl)
    {
      this.iwl = true;
      localObject1 = "" + com.tencent.mm.plugin.appbrand.o.a.sx("wxa_library/android.js") + com.tencent.mm.plugin.appbrand.appcache.l.om("WAWebview.js");
    }
    Object localObject2 = localObject1;
    if (this.hzM != null)
    {
      localObject2 = new StringBuilder().append((String)localObject1);
      localObject1 = "";
      if (this.hzM.hyG.hQL) {
        localObject1 = com.tencent.mm.plugin.appbrand.appcache.l.om("WAVConsole.js");
      }
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = "";
      if (AppBrandPerformanceManager.rZ(this.hyD)) {
        localObject1 = com.tencent.mm.plugin.appbrand.appcache.l.om("WAPerf.js");
      }
      localObject2 = (String)localObject1;
    }
    if (bg.nm((String)localObject2)) {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandWebView", "execInitScript, js null");
    }
    while ((this.hzM == null) || (this.hyD == null))
    {
      GMTrace.o(20760127078400L, 154675);
      return;
      com.tencent.mm.plugin.report.service.g.ork.a(370L, 1L, 1L, false);
      com.tencent.mm.plugin.appbrand.o.h.a(this, (String)localObject2, new h.a()
      {
        public final void eu(String paramAnonymousString)
        {
          int j = 0;
          GMTrace.i(17296907042816L, 128872);
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "Inject SDK Page Script Failed: %s", new Object[] { paramAnonymousString });
          com.tencent.mm.plugin.report.service.g.ork.a(370L, 2L, 1L, false);
          com.tencent.mm.plugin.appbrand.report.a.aq(t.a(t.this), 24);
          int i = -1;
          if (t.b(t.this) != null)
          {
            j = t.b(t.this).hyG.hRg.hKC;
            i = t.b(t.this).hyG.hRg.hKB;
          }
          com.tencent.mm.plugin.appbrand.report.a.b(t.a(t.this), j, i, 370, 2);
          GMTrace.o(17296907042816L, 128872);
        }
        
        public final void wk()
        {
          GMTrace.i(17296772825088L, 128871);
          com.tencent.mm.plugin.report.service.g.ork.a(370L, 3L, 1L, false);
          GMTrace.o(17296772825088L, 128871);
        }
      });
    }
    this.hzM.hyT.k(3, this.iwj - this.iwh);
    com.tencent.mm.plugin.appbrand.performance.a.a(this.hyD, "Native", "WebViewInit+PageFrameLoad", this.iwh, this.iwj, "");
    if (this.hZo != null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandWebView", "Inject page on frame load finished");
      rT(this.hZo);
    }
    ZJ();
    GMTrace.o(20760127078400L, 154675);
  }
  
  public final void cleanup()
  {
    GMTrace.i(10262153265152L, 76459);
    GMTrace.o(10262153265152L, 76459);
  }
  
  public final void destroy()
  {
    GMTrace.i(10262287482880L, 76460);
    super.destroy();
    GMTrace.o(10262287482880L, 76460);
  }
  
  public final void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(19895630692352L, 148234);
    if (!this.hUl)
    {
      this.iwg.add(new Pair(paramString, paramValueCallback));
      GMTrace.o(19895630692352L, 148234);
      return;
    }
    paramString = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17299322961920L, 128890);
        t.a(t.this, paramString, paramValueCallback);
        GMTrace.o(17299322961920L, 128890);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      GMTrace.o(19895630692352L, 148234);
      return;
    }
    post(paramString);
    GMTrace.o(19895630692352L, 148234);
  }
  
  public final void init()
  {
    GMTrace.i(19895496474624L, 148233);
    loadUrl(ZM());
    GMTrace.o(19895496474624L, 148233);
  }
  
  public final <T extends com.tencent.mm.plugin.appbrand.jsruntime.b> T q(Class<T> paramClass)
  {
    GMTrace.i(20759992860672L, 154674);
    GMTrace.o(20759992860672L, 154674);
    return null;
  }
  
  public final void rS(String paramString)
  {
    GMTrace.i(10262019047424L, 76458);
    if ((bg.nm(paramString)) || (!com.tencent.mm.sdk.a.b.bPq()))
    {
      GMTrace.o(10262019047424L, 76458);
      return;
    }
    evaluateJavascript("document.title=\"" + paramString + "\"", null);
    GMTrace.o(10262019047424L, 76458);
  }
  
  final void rT(String paramString)
  {
    GMTrace.i(10262555918336L, 76462);
    this.iwi = System.currentTimeMillis();
    String str2 = com.tencent.mm.plugin.appbrand.appcache.w.a(this.hzM, paramString);
    if (bg.nm(str2))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandWebView", "Cache content empty, abort inject");
      GMTrace.o(10262555918336L, 76462);
      return;
    }
    paramString = "";
    if (this.iwk) {
      paramString = rU(com.tencent.mm.plugin.appbrand.appcache.w.a(this.hzM, "/page-frame.html"));
    }
    int i = str2.indexOf("<style>");
    int j = str2.indexOf("</style>");
    String str3;
    if ((i == -1) || (j == -i))
    {
      str1 = "";
      str3 = Base64.encodeToString(str1.getBytes(), 2);
      i = str2.indexOf("<page>");
      j = str2.indexOf("</page>");
      if ((i != -1) && (j != -i)) {
        break label225;
      }
    }
    label225:
    for (String str1 = "";; str1 = str2.substring(i + 6, j))
    {
      evaluateJavascript(String.format("var style = document.createElement('style');style.innerHTML = atob(\"%s\");document.head.appendChild(style);var page = document.createElement('page');page.innerHTML = atob(\"%s\");document.body.appendChild(page);%s;%s", new Object[] { str3, Base64.encodeToString(str1.getBytes(), 2), paramString, rU(str2) }), null);
      GMTrace.o(10262555918336L, 76462);
      return;
      str1 = str2.substring(i + 7, j);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\page\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */