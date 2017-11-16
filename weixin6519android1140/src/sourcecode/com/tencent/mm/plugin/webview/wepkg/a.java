package com.tencent.mm.plugin.webview.wepkg;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.model.BaseWepkgProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgPreloadFile;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgVersionManager;
import com.tencent.mm.plugin.webview.wepkg.model.f;
import com.tencent.mm.plugin.webview.wepkg.model.g;
import com.tencent.mm.plugin.webview.wepkg.utils.b.a;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.n;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class a
{
  private static final Map<String, Boolean> rWN;
  public aj euU;
  MMActivity iPC;
  public MMWebView inX;
  public String lID;
  public boolean rWJ;
  public f rWK;
  public WepkgVersion rWL;
  public long rWM;
  public a rWO;
  private int rWP;
  public c rWQ;
  public b rWR;
  a rWS;
  
  static
  {
    GMTrace.i(16887677190144L, 125823);
    rWN = Collections.synchronizedMap(new HashMap());
    GMTrace.o(16887677190144L, 125823);
  }
  
  public a(MMActivity paramMMActivity, MMWebView paramMMWebView)
  {
    GMTrace.i(16887408754688L, 125821);
    this.rWJ = false;
    this.rWM = 0L;
    this.rWP = 0;
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(18064900882432L, 134594);
        Object localObject = a.this;
        if (((a)localObject).rWO == null)
        {
          localObject = ((a)localObject).rWS;
          if (((a.a)localObject).aEE()) {
            break label70;
          }
          w.i("MicroMsg.Wepkg.WePkgPlugin", "white screen");
          af.t(new Runnable()
          {
            public final void run()
            {
              int i = 0;
              GMTrace.i(18064632446976L, 134592);
              try
              {
                w.i("MicroMsg.Wepkg.WePkgPlugin", "load url from net");
                a.this.rWJ = false;
                a.this.inX.loadUrl(a.this.lID);
                Object localObject = a.this.iPC.getSharedPreferences("we_pkg_sp", 4);
                if (localObject != null) {
                  i = ((SharedPreferences)localObject).getInt("white_screen_times", 0);
                }
                if (i > 1)
                {
                  if (a.this.rWL != null) {
                    com.tencent.mm.plugin.webview.wepkg.utils.a.b("whiteScreen", a.this.lID, a.this.rWL.rYG, a.this.rWL.version, -1L, 0L, null);
                  }
                  localObject = d.Nf(a.this.lID);
                  com.tencent.mm.plugin.webview.wepkg.utils.b.rZo.rZq.remove(localObject);
                  g.MU((String)localObject);
                  localObject = a.this.iPC.getSharedPreferences("we_pkg_sp", 4);
                  if (localObject != null)
                  {
                    w.i("MicroMsg.Wepkg.WePkgPlugin", "disableWePkg");
                    ((SharedPreferences)localObject).edit().putBoolean("disable_we_pkg", true).commit();
                  }
                  GMTrace.o(18064632446976L, 134592);
                  return;
                }
                a.this.ys(i + 1);
                GMTrace.o(18064632446976L, 134592);
                return;
              }
              catch (Exception localException)
              {
                GMTrace.o(18064632446976L, 134592);
              }
            }
          });
        }
        for (;;)
        {
          GMTrace.o(18064900882432L, 134594);
          return false;
          localObject = ((a)localObject).rWO;
          break;
          label70:
          a.this.ys(0);
        }
      }
    }, false);
    this.rWQ = new c();
    this.rWR = new b();
    this.rWS = new a()
    {
      public final boolean aEE()
      {
        GMTrace.i(18065169317888L, 134596);
        GMTrace.o(18065169317888L, 134596);
        return true;
      }
    };
    this.iPC = paramMMActivity;
    this.inX = paramMMWebView;
    GMTrace.o(16887408754688L, 125821);
  }
  
  public a(MMActivity paramMMActivity, MMWebView paramMMWebView, int paramInt)
  {
    this(paramMMActivity, paramMMWebView);
    GMTrace.i(18065571971072L, 134599);
    this.rWP = paramInt;
    if (!WepkgMainProcessService.Xi()) {
      d.a("", null);
    }
    GMTrace.o(18065571971072L, 134599);
  }
  
  public final boolean bGb()
  {
    GMTrace.i(18065974624256L, 134602);
    if ((this.rWL == null) || (!this.rWL.rYW))
    {
      GMTrace.o(18065974624256L, 134602);
      return true;
    }
    GMTrace.o(18065974624256L, 134602);
    return false;
  }
  
  public final void jH(final boolean paramBoolean)
  {
    GMTrace.i(17619834896384L, 131278);
    w.i("MicroMsg.Wepkg.WePkgPlugin", "useWepkg:" + paramBoolean);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18065437753344L, 134598);
        if (a.this.inX != null)
        {
          String str = String.format("javascript:(function() {window.__usewepkg__=%s;})();", new Object[] { Boolean.valueOf(paramBoolean) });
          a.this.inX.evaluateJavascript(str, null);
          GMTrace.o(18065437753344L, 134598);
          return;
        }
        w.i("MicroMsg.Wepkg.WePkgPlugin", "injectWepkgState, webview == null");
        GMTrace.o(18065437753344L, 134598);
      }
    });
    GMTrace.o(17619834896384L, 131278);
  }
  
  public final void onCreate(String paramString)
  {
    GMTrace.i(18065706188800L, 134600);
    if (this.rWP == 0) {
      this.rWP = this.iPC.hashCode();
    }
    com.tencent.mm.plugin.webview.wepkg.utils.b.rZn.add(Integer.valueOf(this.rWP));
    this.lID = paramString;
    if (d.Ni(this.lID)) {
      if (WepkgMainProcessService.Xi())
      {
        w.i("MicroMsg.Wepkg.WePkgPlugin", "WepkgMainProcessService is live");
        this.rWK = g.MT(this.lID);
        if ((this.rWK != null) && (this.rWK.rYm != null))
        {
          this.rWJ = true;
          this.rWL = this.rWK.rYm;
        }
        d.xB().h(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18066108841984L, 134603);
            WepkgVersionManager.cv(d.Nf(a.this.lID), 0);
            GMTrace.o(18066108841984L, 134603);
          }
        }, 2000L);
        w.i("MicroMsg.Wepkg.WePkgPlugin", "wepkgAvailable:%s", new Object[] { Boolean.valueOf(this.rWJ) });
        if ((this.rWJ) && (this.rWL != null)) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", this.lID, this.rWL.rYG, this.rWL.version, 1L, 0L, null);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.Wepkg.WePkgPlugin", "pkgid:%s,  wepkgAvailable:%b", new Object[] { d.Nf(paramString), Boolean.valueOf(this.rWJ) });
      GMTrace.o(18065706188800L, 134600);
      return;
      w.i("MicroMsg.Wepkg.WePkgPlugin", "WepkgMainProcessService is dead");
      d.a(this.lID, new com.tencent.mm.plugin.webview.wepkg.model.a()
      {
        public final void a(final BaseWepkgProcessTask paramAnonymousBaseWepkgProcessTask)
        {
          GMTrace.i(16887274536960L, 125820);
          if ((paramAnonymousBaseWepkgProcessTask instanceof WepkgCrossProcessTask))
          {
            paramAnonymousBaseWepkgProcessTask = ((WepkgCrossProcessTask)paramAnonymousBaseWepkgProcessTask).rYq;
            d.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16887945625600L, 125825);
                g.MT(paramAnonymousBaseWepkgProcessTask);
                WepkgVersionManager.cv(d.Nf(paramAnonymousBaseWepkgProcessTask), 0);
                GMTrace.o(16887945625600L, 125825);
              }
            });
          }
          GMTrace.o(16887274536960L, 125820);
        }
      });
      com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", this.lID, d.Nf(this.lID), null, 0L, 0L, com.tencent.mm.plugin.webview.wepkg.utils.a.yu(10));
      continue;
      com.tencent.mm.plugin.webview.wepkg.utils.a.b("EnterWeb", this.lID, d.Nf(this.lID), null, 2L, 0L, null);
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(18065840406528L, 134601);
    if (com.tencent.mm.plugin.webview.wepkg.utils.b.rZn.contains(Integer.valueOf(this.rWP))) {
      com.tencent.mm.plugin.webview.wepkg.utils.b.rZn.remove(Integer.valueOf(this.rWP));
    }
    if (com.tencent.mm.plugin.webview.wepkg.utils.b.rZn.size() == 0)
    {
      com.tencent.mm.plugin.webview.wepkg.utils.b.rZo.rZq.clear();
      w.i("MicroMsg.Wepkg.WePkgPlugin", "clear wepkg info in memory");
    }
    GMTrace.o(18065840406528L, 134601);
  }
  
  public final void ys(int paramInt)
  {
    GMTrace.i(16887542972416L, 125822);
    SharedPreferences localSharedPreferences = this.iPC.getSharedPreferences("we_pkg_sp", 4);
    if (localSharedPreferences != null) {
      localSharedPreferences.edit().putInt("white_screen_times", paramInt).commit();
    }
    GMTrace.o(16887542972416L, 125822);
  }
  
  public static abstract interface a
  {
    public abstract boolean aEE();
  }
  
  public final class b
    extends com.tencent.xweb.x5.a.a.a.a.b
  {
    public b()
    {
      GMTrace.i(16888079843328L, 125826);
      GMTrace.o(16888079843328L, 125826);
    }
    
    public final Object onMiscCallBack(String paramString, Bundle paramBundle)
    {
      boolean bool = false;
      GMTrace.i(16888214061056L, 125827);
      if (paramBundle == null) {
        bool = true;
      }
      w.i("MicroMsg.Wepkg.WePkgPlugin", "method = %s, bundler == null ? %b", new Object[] { paramString, Boolean.valueOf(bool) });
      if ((bg.nm(paramString)) || (paramBundle == null))
      {
        GMTrace.o(16888214061056L, 125827);
        return null;
      }
      if ((a.this.rWJ) && (a.this.rWK != null) && (paramString.equalsIgnoreCase("shouldInterceptMediaUrl")))
      {
        paramBundle = paramBundle.getString("url");
        w.i("MicroMsg.Wepkg.WePkgPlugin", "onMiscCallBack origin mediaUrl:" + paramBundle);
        if (!bg.nm(paramBundle))
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "onMiscCallBack replace localPath");
          paramString = a.this.rWK;
          paramBundle = d.Nh(paramBundle);
          if ((!bg.nm(paramBundle)) && (paramString.rYx != null) && (paramString.rYx.get(paramBundle) != null))
          {
            paramString = (WepkgPreloadFile)paramString.rYx.get(paramBundle);
            if (!bg.nm(paramString.filePath))
            {
              paramBundle = new File(paramString.filePath);
              if ((!paramBundle.exists()) || (!paramBundle.isFile()) || (paramBundle.length() != paramString.size)) {}
            }
          }
          for (paramString = paramString.filePath; !bg.nm(paramString); paramString = null)
          {
            w.i("MicroMsg.Wepkg.WePkgPlugin", "localFile:" + paramString);
            GMTrace.o(16888214061056L, 125827);
            return paramString;
          }
        }
      }
      GMTrace.o(16888214061056L, 125827);
      return null;
    }
  }
  
  public final class c
    extends n
  {
    public c()
    {
      GMTrace.i(16886469230592L, 125814);
      GMTrace.o(16886469230592L, 125814);
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19383321624576L, 144417);
      if ((paramj == null) || (paramj.getUrl() == null) || (bg.nm(paramj.getUrl().toString())))
      {
        GMTrace.o(19383321624576L, 144417);
        return null;
      }
      if (a.this.rWJ)
      {
        paramWebView = null;
        if (a.this.rWK != null)
        {
          paramWebView = paramj.getUrl().toString();
          paramWebView = a.this.rWK.MS(d.Nh(paramWebView));
        }
        if (paramWebView != null)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramj.getUrl(), paramj.getMethod(), Boolean.valueOf(paramj.isForMainFrame()) });
          if (a.this.rWL != null) {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.rWL.rYG, a.this.rWL.version, 1L, 0L, null);
          }
          GMTrace.o(19383321624576L, 144417);
          return paramWebView;
        }
        if (a.this.rWL != null) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.rWL.rYG, a.this.rWL.version, 0L, 0L, null);
        }
      }
      GMTrace.o(19383321624576L, 144417);
      return null;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19383455842304L, 144418);
      if ((paramj == null) || (paramj.getUrl() == null) || (bg.nm(paramj.getUrl().toString())))
      {
        GMTrace.o(19383455842304L, 144418);
        return null;
      }
      if (a.this.rWJ)
      {
        paramWebView = null;
        if (a.this.rWK != null)
        {
          paramWebView = paramj.getUrl().toString();
          paramWebView = a.this.rWK.MS(d.Nh(paramWebView));
        }
        if (paramWebView != null)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramj.getUrl(), paramj.getMethod(), Boolean.valueOf(paramj.isForMainFrame()) });
          if (a.this.rWL != null) {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.rWL.rYG, a.this.rWL.version, 1L, 0L, null);
          }
          GMTrace.o(19383455842304L, 144418);
          return paramWebView;
        }
        if (a.this.rWL != null) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramj.getUrl().toString(), a.this.rWL.rYG, a.this.rWL.version, 0L, 0L, null);
        }
      }
      GMTrace.o(19383455842304L, 144418);
      return null;
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19383053189120L, 144415);
      w.d("MicroMsg.Wepkg.WePkgPlugin", "onPageFinished, url = %s", new Object[] { paramString });
      long l;
      String str;
      if (a.this.rWM != 0L)
      {
        l = System.currentTimeMillis() - a.this.rWM;
        str = d.Nf(paramString);
        if (bg.nm(str))
        {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("PageLoadTime", paramString, "", null, 2L, l, null);
          a.this.rWM = 0L;
        }
      }
      else if ((a.this.rWJ) && (a.this.rWK != null))
      {
        if (a.this.rWK.MS(d.Nh(a.this.lID)) == null) {
          break label255;
        }
      }
      label255:
      for (int i = 1;; i = 0)
      {
        if (i != 0)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "startTimer");
          a.this.euU.z(1000L, 1000L);
        }
        a.this.jH(a.this.rWJ);
        super.a(paramWebView, paramString);
        GMTrace.o(19383053189120L, 144415);
        return;
        if ((a.this.rWJ) && (a.this.rWL != null))
        {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("PageLoadTime", paramString, a.this.rWL.rYG, a.this.rWL.version, 1L, l, null);
          break;
        }
        com.tencent.mm.plugin.webview.wepkg.utils.a.b("PageLoadTime", paramString, str, null, 0L, l, null);
        break;
      }
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19382918971392L, 144414);
      w.d("MicroMsg.Wepkg.WePkgPlugin", "onPageStarted, url = %s", new Object[] { paramString });
      a.this.rWM = System.currentTimeMillis();
      a.this.jH(a.this.rWJ);
      super.b(paramWebView, paramString, paramBitmap);
      GMTrace.o(19382918971392L, 144414);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19383187406848L, 144416);
      if (a.this.rWJ)
      {
        paramWebView = null;
        if (a.this.rWK != null) {
          paramWebView = a.this.rWK.MS(d.Nh(paramString));
        }
        if (paramWebView != null)
        {
          w.i("MicroMsg.Wepkg.WePkgPlugin", "shouldInterceptRequest, url = %s", new Object[] { paramString });
          if (a.this.rWL != null) {
            com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramString, a.this.rWL.rYG, a.this.rWL.version, 1L, 0L, null);
          }
          GMTrace.o(19383187406848L, 144416);
          return paramWebView;
        }
        if (a.this.rWL != null) {
          com.tencent.mm.plugin.webview.wepkg.utils.a.b("RequestHook", paramString, a.this.rWL.rYG, a.this.rWL.version, 0L, 0L, null);
        }
      }
      GMTrace.o(19383187406848L, 144416);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */