package com.tencent.mm.ui.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.List;
import org.a.a.a.c.a;
import org.a.d.c;
import org.a.d.j;
import org.a.d.k;

@SuppressLint({"HandlerLeak"})
public final class a
  implements b.a
{
  public Context context;
  public ae pOE;
  public org.a.e.b xmr;
  public org.a.d.i xms;
  public org.a.d.i xmt;
  private boolean xmu;
  boolean xmv;
  public b xmw;
  public a xmx;
  
  public a()
  {
    GMTrace.i(2885010063360L, 21495);
    this.xmr = null;
    this.xms = null;
    this.xmt = null;
    this.xmu = false;
    this.xmv = false;
    this.xmw = null;
    this.xmx = null;
    this.context = null;
    this.pOE = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2886486458368L, 21506);
        Object localObject;
        Context localContext;
        a locala;
        if (paramAnonymousMessage.what == 1000)
        {
          localObject = (String)paramAnonymousMessage.obj;
          if (localObject == null) {
            break label150;
          }
          localContext = a.this.context;
          locala = a.this;
          if (localContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            break label133;
          }
          com.tencent.mm.ui.g.a.e.B(localContext, "Error", "Application requires permission to access the Internet");
        }
        for (;;)
        {
          if (paramAnonymousMessage.what == 1010)
          {
            paramAnonymousMessage = (a.c)paramAnonymousMessage.obj;
            localObject = a.this;
            ((a)localObject).xmv = false;
            if (paramAnonymousMessage == a.c.xmC)
            {
              ((a)localObject).xmt = null;
              a.a(null);
            }
            if (((a)localObject).xmx != null) {
              ((a)localObject).xmx.b(paramAnonymousMessage);
            }
          }
          GMTrace.o(2886486458368L, 21506);
          return;
          label133:
          new b(localContext, (String)localObject, locala).show();
          continue;
          label150:
          a.this.c(a.c.xmC);
        }
      }
    };
    Object localObject = new org.a.a.a();
    ((org.a.a.a)localObject).ytE = org.a.a.a.I(c.a.class);
    org.a.g.d.fP("XMr2y8FEVEqZBcZ1TU3gLA", "Invalid Api key");
    ((org.a.a.a)localObject).ytB = "XMr2y8FEVEqZBcZ1TU3gLA";
    org.a.g.d.fP("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "Invalid Api secret");
    ((org.a.a.a)localObject).ytC = "kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo";
    org.a.g.d.e("wechatapp://sign-in-twitter.wechatapp.com/", "Callback can't be null");
    ((org.a.a.a)localObject).ytD = "wechatapp://sign-in-twitter.wechatapp.com/";
    org.a.g.d.e(((org.a.a.a)localObject).ytE, "You must specify a valid api through the provider() method");
    org.a.g.d.fP(((org.a.a.a)localObject).ytB, "You must provide an api key");
    org.a.g.d.fP(((org.a.a.a)localObject).ytC, "You must provide an api secret");
    this.xmr = ((org.a.a.a)localObject).ytE.a(new org.a.d.a(((org.a.a.a)localObject).ytB, ((org.a.a.a)localObject).ytC, ((org.a.a.a)localObject).ytD, ((org.a.a.a)localObject).ytF, ((org.a.a.a)localObject).scope, ((org.a.a.a)localObject).ytG));
    String str;
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      localObject = (String)com.tencent.mm.kernel.h.xy().xh().get(69377, null);
      str = (String)com.tencent.mm.kernel.h.xy().xh().get(69378, null);
      if ((bg.nm((String)localObject)) || (bg.nm(str))) {
        localObject = null;
      }
    }
    for (;;)
    {
      this.xms = ((org.a.d.i)localObject);
      GMTrace.o(2885010063360L, 21495);
      return;
      localObject = new org.a.d.i((String)localObject, str);
      continue;
      w.e("Twitter", "acchas not ready for restoreTwitterAccessToken");
      localObject = null;
    }
  }
  
  public static void a(org.a.d.i parami)
  {
    GMTrace.i(2885546934272L, 21499);
    ab.getContext().getSharedPreferences(ab.bPU(), 0);
    if (parami == null)
    {
      com.tencent.mm.kernel.h.xy().xh().set(69377, "");
      com.tencent.mm.kernel.h.xy().xh().set(69378, "");
      GMTrace.o(2885546934272L, 21499);
      return;
    }
    com.tencent.mm.kernel.h.xy().xh().set(69377, parami.token);
    com.tencent.mm.kernel.h.xy().xh().set(69378, parami.uDu);
    GMTrace.o(2885546934272L, 21499);
  }
  
  public static void mG(boolean paramBoolean)
  {
    GMTrace.i(2886218022912L, 21504);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean) {}
    for (String str = "1";; str = "2")
    {
      localArrayList.add(new i.a(10251, str));
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new com.tencent.mm.av.i(localArrayList));
      GMTrace.o(2886218022912L, 21504);
      return;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(2885412716544L, 21498);
    if (this.xmv)
    {
      GMTrace.o(2885412716544L, 21498);
      return;
    }
    this.xmx = parama;
    this.xmv = true;
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2887157547008L, 21511);
        Object localObject = a.c.xmB;
        if (a.this.xms == null) {
          localObject = a.c.xmC;
        }
        for (;;)
        {
          localObject = a.this.pOE.obtainMessage(1010, localObject);
          a.this.pOE.sendMessage((Message)localObject);
          GMTrace.o(2887157547008L, 21511);
          return;
          c localc1 = new c(j.ytZ, "https://api.twitter.com/1.1/account/verify_credentials.json");
          a.this.xmr.a(a.this.xms, localc1);
          try
          {
            if (localc1.ctz().code != 200) {
              localObject = a.c.xmC;
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("MicroMsg.Twitter", localException, "request error.", new Object[0]);
            a.c localc = a.c.xmC;
          }
        }
      }
    }, "Twitter_validationAccessToken");
    GMTrace.o(2885412716544L, 21498);
  }
  
  public final void a(b paramb, Context paramContext)
  {
    GMTrace.i(2885144281088L, 21496);
    if (this.xmu)
    {
      GMTrace.o(2885144281088L, 21496);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(583L, 0L, 1L, false);
    this.xmw = paramb;
    this.context = paramContext;
    this.xmu = true;
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2883667886080L, 21485);
        try
        {
          a.this.xmt = a.this.xmr.ctE();
          Object localObject1 = a.this.xmr.b(a.this.xmt);
          localObject1 = a.this.pOE.obtainMessage(1000, localObject1);
          a.this.pOE.sendMessage((Message)localObject1);
          GMTrace.o(2883667886080L, 21485);
          return;
        }
        catch (org.a.b.a locala)
        {
          for (;;)
          {
            Object localObject2 = null;
          }
        }
      }
    }, "Twitter_doOAuth");
    GMTrace.o(2885144281088L, 21496);
  }
  
  public final void c(c paramc)
  {
    GMTrace.i(2885681152000L, 21500);
    this.xmu = false;
    this.xmt = null;
    if (this.xmw != null) {
      this.xmw.a(paramc);
    }
    GMTrace.o(2885681152000L, 21500);
  }
  
  public final boolean ciQ()
  {
    GMTrace.i(2885278498816L, 21497);
    if (this.xms != null)
    {
      GMTrace.o(2885278498816L, 21497);
      return true;
    }
    GMTrace.o(2885278498816L, 21497);
    return false;
  }
  
  public final void ciR()
  {
    GMTrace.i(2885949587456L, 21502);
    mG(false);
    c(c.xmC);
    com.tencent.mm.plugin.report.service.g.ork.a(583L, 2L, 1L, false);
    GMTrace.o(2885949587456L, 21502);
  }
  
  public final void m(final Bundle paramBundle)
  {
    GMTrace.i(2885815369728L, 21501);
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        Object localObject3 = null;
        GMTrace.i(2886754893824L, 21508);
        if (a.this.xmt == null)
        {
          GMTrace.o(2886754893824L, 21508);
          return;
        }
        a.mG(true);
        String str = paramBundle.getString("oauth_verifier");
        Object localObject1 = localObject3;
        if (str != null) {
          localObject1 = new k(str);
        }
        try
        {
          localObject1 = a.this.xmr.a(a.this.xmt, (k)localObject1);
          if (localObject1 != null)
          {
            a.this.xms = ((org.a.d.i)localObject1);
            a.a(a.this.xms);
            new ae(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2882459926528L, 21476);
                a.this.c(a.c.xmB);
                com.tencent.mm.plugin.report.service.g.ork.a(583L, 1L, 1L, false);
                GMTrace.o(2882459926528L, 21476);
              }
            });
            GMTrace.o(2886754893824L, 21508);
            return;
          }
          new ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2880580878336L, 21462);
              a.this.c(a.c.xmC);
              com.tencent.mm.plugin.report.service.g.ork.a(583L, 4L, 1L, false);
              GMTrace.o(2880580878336L, 21462);
            }
          });
          GMTrace.o(2886754893824L, 21508);
          return;
        }
        catch (org.a.b.a locala)
        {
          for (;;)
          {
            Object localObject2 = localObject3;
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(2886889111552L, 21509);
        String str = super.toString() + "|onComplete";
        GMTrace.o(2886889111552L, 21509);
        return str;
      }
    });
    GMTrace.o(2885815369728L, 21501);
  }
  
  public final void onCancel()
  {
    GMTrace.i(2886083805184L, 21503);
    mG(false);
    c(c.xmD);
    com.tencent.mm.plugin.report.service.g.ork.a(583L, 3L, 1L, false);
    GMTrace.o(2886083805184L, 21503);
  }
  
  public static abstract interface a
  {
    public abstract void b(a.c paramc);
  }
  
  public static abstract interface b
  {
    public abstract void a(a.c paramc);
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(2883399450624L, 21483);
      xmB = new c("Finished", 0);
      xmC = new c("Failed", 1);
      xmD = new c("Canceled", 2);
      xmE = new c[] { xmB, xmC, xmD };
      GMTrace.o(2883399450624L, 21483);
    }
    
    private c()
    {
      GMTrace.i(2883265232896L, 21482);
      GMTrace.o(2883265232896L, 21482);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */