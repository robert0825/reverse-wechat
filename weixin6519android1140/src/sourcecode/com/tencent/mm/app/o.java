package com.tencent.mm.app;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.splash.b;
import com.tencent.mm.splash.j;
import com.tencent.mm.splash.k;
import com.tencent.mm.splash.k.a;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.ArrayList;

public final class o
{
  public static f etc;
  private static a etd;
  private static boolean ete;
  private static boolean etf;
  public static k.a etg;
  
  static
  {
    GMTrace.i(19124012974080L, 142485);
    ete = false;
    etf = false;
    GMTrace.o(19124012974080L, 142485);
  }
  
  public static void a(Application paramApplication, String paramString1, String paramString2)
  {
    GMTrace.i(19123341885440L, 142480);
    c.v(MMApplicationLike.sAppStartTime);
    pn();
    com.tencent.mm.splash.e.a(new k()
    {
      public final void a(k.a paramAnonymousa)
      {
        GMTrace.i(19118644264960L, 142445);
        w.i("WxSplash.WeChatSplash", "do one more thing");
        o.etg = paramAnonymousa;
        o.bF(this.eth);
        o.po();
        GMTrace.o(19118644264960L, 142445);
      }
    });
    com.tencent.mm.splash.e.x(WeChatSplashActivity.class);
    com.tencent.mm.splash.e.y(WeChatFallbackSplashActivity.class);
    com.tencent.mm.splash.e.bRY().mStartTimestamp = System.currentTimeMillis();
    boolean bool1 = false;
    if (!paramApplication.getPackageName().equals(paramString1))
    {
      com.tencent.mm.splash.e.a("WxSplash.WeChatSplash", "not main process(%s), no hack, do fallback.", new Object[] { paramString1 });
      bool1 = true;
    }
    for (;;)
    {
      ete = bool1;
      c.cX(1);
      if ((!bool1) || (com.tencent.mm.splash.a.eK(paramApplication))) {}
      try
      {
        com.tencent.mm.splash.a.eM(paramApplication);
        boolean bool2 = com.tencent.mm.splash.a.eO(paramApplication);
        com.tencent.mm.splash.e.a("WxSplash.WeChatSplash", "block checking dex opt result: %s", new Object[] { Boolean.valueOf(bool2) });
        if (!bool2)
        {
          com.tencent.mm.splash.e.a("WxSplash.WeChatSplash", "dexopt service return failed or timeout. kill self.", new Object[0]);
          com.tencent.mm.splash.e.bRS();
        }
        com.tencent.mm.splash.a.eL(paramApplication);
        if ((com.tencent.mm.f.a.mH) || (bool1)) {
          bF(paramString2);
        }
        GMTrace.o(19123341885440L, 142480);
        return;
      }
      catch (InterruptedException paramApplication)
      {
        w.printErrStackTrace("WxSplash.WeChatSplash", paramApplication, "", new Object[0]);
        throw new RuntimeException(paramApplication);
      }
      if (!com.tencent.mm.splash.e.f(paramApplication))
      {
        com.tencent.mm.splash.e.bRY().e(675L, 5L, 1L);
        com.tencent.mm.splash.e.eP(paramApplication);
        bool1 = true;
        com.tencent.mm.splash.e.a("WxSplash.WeChatSplash", "hack failed, do fallback logic.", new Object[0]);
      }
      else
      {
        com.tencent.mm.splash.e.bRT();
      }
    }
  }
  
  public static void a(f paramf)
  {
    GMTrace.i(19123073449984L, 142478);
    etc = paramf;
    GMTrace.o(19123073449984L, 142478);
  }
  
  public static void bF(String paramString)
  {
    GMTrace.i(19123476103168L, 142481);
    if (etd != null)
    {
      GMTrace.o(19123476103168L, 142481);
      return;
    }
    paramString = bG(paramString);
    paramString.a(etc.gap, etc.fXf, etc.gaq);
    etd = paramString;
    GMTrace.o(19123476103168L, 142481);
  }
  
  private static a bG(String paramString)
  {
    GMTrace.i(19123878756352L, 142484);
    try
    {
      a locala = (a)Class.forName(paramString).newInstance();
      GMTrace.o(19123878756352L, 142484);
      return locala;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("WxSplash.WeChatSplash", localException, "%s has problem!", new Object[] { paramString });
      throw new RuntimeException(localException);
    }
  }
  
  public static f pm()
  {
    GMTrace.i(19122939232256L, 142477);
    f localf = etc;
    GMTrace.o(19122939232256L, 142477);
    return localf;
  }
  
  public static void pn()
  {
    GMTrace.i(19123207667712L, 142479);
    com.tencent.mm.splash.e.a(new b()
    {
      public final void a(String paramAnonymousString1, String paramAnonymousString2, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(19121597054976L, 142467);
        w.i(paramAnonymousString1, String.format(paramAnonymousString2, paramAnonymousVarArgs));
        GMTrace.o(19121597054976L, 142467);
      }
      
      public final void a(Throwable paramAnonymousThrowable, String paramAnonymousString)
      {
        GMTrace.i(19121462837248L, 142466);
        w.printErrStackTrace("WxSplash.WeChatSplash", paramAnonymousThrowable, paramAnonymousString, new Object[0]);
        String str = paramAnonymousString;
        if (paramAnonymousString == null) {
          str = "";
        }
        paramAnonymousThrowable = str + "  " + Log.getStackTraceString(paramAnonymousThrowable);
        com.tencent.mm.splash.e.bRY().vpj.add(paramAnonymousThrowable);
        GMTrace.o(19121462837248L, 142466);
      }
      
      public final void c(Activity paramAnonymousActivity)
      {
        GMTrace.i(20322443067392L, 151414);
        if ((o.etc != null) && (o.etc.eR("")))
        {
          paramAnonymousActivity = paramAnonymousActivity.getSharedPreferences("system_config_prefs", 4);
          if (paramAnonymousActivity.getBoolean("first_launch_weixin", true))
          {
            paramAnonymousActivity.edit().putBoolean("first_launch_weixin", false).commit();
            XLogSetup.realSetupXlog();
          }
        }
        GMTrace.o(20322443067392L, 151414);
      }
    });
    GMTrace.o(19123207667712L, 142479);
  }
  
  public static void po()
  {
    GMTrace.i(19123610320896L, 142482);
    if ((etf) && (etg != null)) {
      etd.b(etg);
    }
    GMTrace.o(19123610320896L, 142482);
  }
  
  public static void pp()
  {
    GMTrace.i(19123744538624L, 142483);
    com.tencent.mm.splash.e.a("WxSplash.WeChatSplash", "applicationOnCreate", new Object[0]);
    com.tencent.mm.splash.e.bRN();
    etf = true;
    if (ete)
    {
      etd.pq();
      GMTrace.o(19123744538624L, 142483);
      return;
    }
    po();
    GMTrace.o(19123744538624L, 142483);
  }
  
  public static abstract interface a
  {
    public abstract void a(Application paramApplication, String paramString, MMApplicationLike paramMMApplicationLike);
    
    public abstract void b(k.a parama);
    
    public abstract void pq();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\app\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */