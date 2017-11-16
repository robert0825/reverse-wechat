package com.tencent.mm.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a.b;
import com.tencent.mm.kernel.b.f.1;
import com.tencent.mm.kernel.b.f.6;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.i;
import com.tencent.mm.kernel.i.1;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.splash.k.a;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.m;
import com.tencent.mm.vending.g.d.b;
import com.tencent.mm.y.as;
import java.io.File;
import junit.framework.Assert;

public class WeChatSplashStartup
  implements o.a
{
  private Application app;
  private MMApplicationLike lifeCycle;
  com.tencent.mm.kernel.b.f profile;
  public String thisProcess;
  
  public WeChatSplashStartup()
  {
    GMTrace.i(19122268143616L, 142472);
    GMTrace.o(19122268143616L, 142472);
  }
  
  private void c(final k.a parama)
  {
    GMTrace.i(19122805014528L, 142476);
    c.cX(2);
    final boolean bool;
    if (parama == null) {
      bool = true;
    }
    for (;;)
    {
      Object localObject1 = this.profile;
      ((com.tencent.mm.kernel.b.f)localObject1).gar.a(new f.1((com.tencent.mm.kernel.b.f)localObject1));
      localObject1 = new g(bool);
      ??? = this.profile.gao;
      Assert.assertNotNull(localObject1);
      i.xD().xv().wZ();
      ((com.tencent.mm.kernel.a.a)???).gaf = ((b)localObject1);
      if (!bool)
      {
        com.tencent.mm.splash.e.cub();
        com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.c()
        {
          public final void onAccountInitialized(e.f paramAnonymousf)
          {
            GMTrace.i(19120657530880L, 142460);
            new Handler(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19121865490432L, 142469);
                WeChatSplashStartup.1.this.eti.bRZ();
                GMTrace.o(19121865490432L, 142469);
              }
            });
            GMTrace.o(19120657530880L, 142460);
          }
          
          public final void onAccountRelease()
          {
            GMTrace.i(19120791748608L, 142461);
            GMTrace.o(19120791748608L, 142461);
          }
        });
      }
      localObject1 = com.tencent.mm.kernel.h.xz().fZy;
      synchronized (((i)localObject1).fZT)
      {
        if (((i)localObject1).fZU)
        {
          com.tencent.mm.kernel.a.a.a("warning, mmskeleton has started up already.", new Object[0]);
          com.tencent.mm.splash.e.a(new com.tencent.mm.splash.c()
          {
            m etl;
            
            public final boolean a(Activity paramAnonymousActivity, int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
            {
              GMTrace.i(19124415627264L, 142488);
              boolean bool = this.etl.a(paramAnonymousActivity, paramAnonymousInt, paramAnonymousArrayOfString, paramAnonymousArrayOfInt);
              GMTrace.o(19124415627264L, 142488);
              return bool;
            }
            
            public final boolean a(Activity paramAnonymousActivity, final Runnable paramAnonymousRunnable)
            {
              GMTrace.i(20322711502848L, 151416);
              com.tencent.mm.kernel.h.xw();
              boolean bool = com.tencent.mm.kernel.a.wK();
              String str = as.gnb.B("login_user_name", "");
              if ((!bool) && (str.equals(""))) {}
              for (int i = 1; i == 0; i = 0)
              {
                GMTrace.o(20322711502848L, 151416);
                return false;
              }
              if (com.tencent.mm.sdk.platformtools.f.vhu)
              {
                bool = MMAppMgr.a(paramAnonymousActivity, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                  {
                    GMTrace.i(20322308849664L, 151413);
                    paramAnonymousRunnable.run();
                    GMTrace.o(20322308849664L, 151413);
                  }
                });
                GMTrace.o(20322711502848L, 151416);
                return bool;
              }
              GMTrace.o(20322711502848L, 151416);
              return false;
            }
            
            public final boolean b(Activity paramAnonymousActivity, Runnable paramAnonymousRunnable)
            {
              GMTrace.i(19124281409536L, 142487);
              boolean bool = this.etl.c(paramAnonymousActivity, paramAnonymousRunnable);
              GMTrace.o(19124281409536L, 142487);
              return bool;
            }
            
            public final boolean j(Intent paramAnonymousIntent)
            {
              GMTrace.i(20322577285120L, 151415);
              if ((paramAnonymousIntent != null) && (s.a(paramAnonymousIntent, "absolutely_exit_pid", 0) == Process.myPid()))
              {
                w.i("MicroMsg.WeChatSplashStartup", "handle exit intent.");
                MMAppMgr.lj(s.a(paramAnonymousIntent, "kill_service", true));
                GMTrace.o(20322577285120L, 151415);
                return true;
              }
              GMTrace.o(20322577285120L, 151415);
              return false;
            }
          });
          com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.h()
          {
            public final void as(boolean paramAnonymousBoolean)
            {
              GMTrace.i(19121194401792L, 142464);
              GMTrace.o(19121194401792L, 142464);
            }
            
            public final void pe()
            {
              GMTrace.i(19121060184064L, 142463);
              com.tencent.mm.kernel.h.xz().b(this);
              if (!bool)
              {
                parama.done();
                GMTrace.o(19121060184064L, 142463);
                return;
              }
              com.tencent.mm.splash.e.a("MicroMsg.FigLeaf", "deleteRequest ", new Object[0]);
              Object localObject = com.tencent.mm.splash.a.bRF();
              if (!new File((String)localObject).exists())
              {
                com.tencent.mm.splash.e.a("MicroMsg.FigLeaf", "deleteRequest dex opt dir not exists.", new Object[0]);
                GMTrace.o(19121060184064L, 142463);
                return;
              }
              localObject = new File((String)localObject + "/main-process-blocking");
              if (((File)localObject).exists()) {
                com.tencent.mm.splash.e.a("MicroMsg.FigLeaf", "deleteRequest result %s.", new Object[] { Boolean.valueOf(((File)localObject).delete()) });
              }
              GMTrace.o(19121060184064L, 142463);
            }
          });
          com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.h()
          {
            public final void as(boolean paramAnonymousBoolean)
            {
              GMTrace.i(19119449571328L, 142451);
              GMTrace.o(19119449571328L, 142451);
            }
            
            public final void pe()
            {
              GMTrace.i(19119315353600L, 142450);
              c.oU();
              com.tencent.mm.kernel.h.xz().b(this);
              WeChatSplashStartup localWeChatSplashStartup = WeChatSplashStartup.this;
              com.tencent.mm.vending.g.g.ckp().fo(500L).b(new WeChatSplashStartup.5(localWeChatSplashStartup));
              if (WeChatSplashStartup.this.profile.eR("")) {
                try
                {
                  ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putInt("launch_last_status", 2).commit();
                  GMTrace.o(19119315353600L, 142450);
                  return;
                }
                catch (Exception localException)
                {
                  w.printErrStackTrace("MicroMsg.WeChatSplashStartup", localException, "%s", new Object[] { localException.getMessage() });
                }
              }
              GMTrace.o(19119315353600L, 142450);
            }
          });
          GMTrace.o(19122805014528L, 142476);
          return;
          bool = false;
          continue;
        }
        ??? = ((i)localObject1).xv().wZ();
        long l1 = com.tencent.mm.kernel.a.a.timestamp();
        com.tencent.mm.kernel.a.a.a("mmskeleton boot startup for process [%s]...", new Object[] { ((com.tencent.mm.kernel.b.e)???).fXf });
        com.tencent.mm.kernel.a.a locala = ((com.tencent.mm.kernel.b.e)???).gao;
        Assert.assertNotNull("You must call whichBootStep(BootStep defaultOne, BootStep ... bootSteps) to specify your BootStep instance first!", locala.gaf);
        com.tencent.mm.kernel.a.a.a("hello WeChat.", new Object[0]);
        locala.gaf.pc();
        long l2 = com.tencent.mm.kernel.a.a.timestamp();
        com.tencent.mm.kernel.a.a.a("boot install plugins...", new Object[0]);
        locala.gaf.pd();
        i.xD();
        com.tencent.mm.kernel.a.a.a("boot all installed plugins : %s...", new Object[] { i.xu().wY() });
        com.tencent.mm.kernel.a.a.a("boot install plugins done in [%s].", new Object[] { com.tencent.mm.kernel.a.a.O(l2) });
        l2 = com.tencent.mm.kernel.a.a.timestamp();
        com.tencent.mm.kernel.a.a.a("boot make dependency of plugins...", new Object[0]);
        locala.gaf.xE();
        com.tencent.mm.kernel.a.a.a("boot make dependency of done in [%s].", new Object[] { com.tencent.mm.kernel.a.a.O(l2) });
        l2 = com.tencent.mm.kernel.a.a.timestamp();
        com.tencent.mm.kernel.a.a.a("boot configure plugins...", new Object[0]);
        locala.gaf.c((com.tencent.mm.kernel.b.e)???);
        com.tencent.mm.kernel.a.a.a("boot configure plugins done in [%s].", new Object[] { com.tencent.mm.kernel.a.a.O(l2) });
        com.tencent.mm.vending.h.h localh = com.tencent.mm.vending.h.d.xyH;
        localObject1 = new i.1((i)localObject1, l1);
        com.tencent.mm.kernel.a.a.a("boot execute tasks...", new Object[0]);
        locala.gaf.a((com.tencent.mm.kernel.b.e)???, localh, (d.b)localObject1);
      }
    }
  }
  
  public final void a(Application paramApplication, String paramString, MMApplicationLike paramMMApplicationLike)
  {
    GMTrace.i(19122402361344L, 142473);
    this.app = paramApplication;
    this.thisProcess = paramString;
    this.lifeCycle = paramMMApplicationLike;
    this.profile = o.pm();
    com.tencent.mm.kernel.h.b(this.profile);
    paramApplication = this.profile;
    paramString = this.app;
    paramApplication.gar.a(new f.6(paramApplication, paramString));
    GMTrace.o(19122402361344L, 142473);
  }
  
  public final void b(k.a parama)
  {
    GMTrace.i(19122536579072L, 142474);
    c(parama);
    GMTrace.o(19122536579072L, 142474);
  }
  
  public final void pq()
  {
    GMTrace.i(19122670796800L, 142475);
    c(null);
    GMTrace.o(19122670796800L, 142475);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\app\WeChatSplashStartup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */