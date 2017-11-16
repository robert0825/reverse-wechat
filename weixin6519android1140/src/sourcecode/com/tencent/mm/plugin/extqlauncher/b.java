package com.tencent.mm.plugin.extqlauncher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.jg.JgMethodChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.es;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.g.a.lu.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.k;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import com.tencent.mm.y.t;
import java.util.HashMap;
import java.util.List;

public final class b
  implements aq
{
  private a kOJ;
  private b kOK;
  public boolean kOL;
  private m.b kOM;
  public boolean kON;
  public long kOO;
  private final long kOP;
  private final long kOQ;
  private final String kOR;
  public int kOS;
  private ae kOT;
  
  public b()
  {
    GMTrace.i(9026142208000L, 67250);
    this.kOL = false;
    this.kOM = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(9030168739840L, 67280);
        w.d("MicroMsg.SubCoreExtQLauncher", "onNotifyChange");
        if (b.this.kOL)
        {
          GMTrace.o(9030168739840L, 67280);
          return;
        }
        at.AR();
        if (paramAnonymousm != com.tencent.mm.y.c.yP())
        {
          GMTrace.o(9030168739840L, 67280);
          return;
        }
        if ((paramAnonymousm == null) || (paramAnonymousObject == null))
        {
          w.e("MicroMsg.SubCoreExtQLauncher", "onConversationChange, wrong args");
          GMTrace.o(9030168739840L, 67280);
          return;
        }
        if ((ab.getContext() == null) || (!at.AU()))
        {
          w.w("MicroMsg.SubCoreExtQLauncher", "wrong account status");
          GMTrace.o(9030168739840L, 67280);
          return;
        }
        b.this.avN();
        GMTrace.o(9030168739840L, 67280);
      }
    };
    this.kON = false;
    this.kOO = 0L;
    this.kOP = 300000L;
    this.kOQ = 4000L;
    this.kOR = "fun1";
    this.kOS = 0;
    this.kOT = new ae(Looper.getMainLooper())
    {
      @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(9030974046208L, 67286);
        if ((ab.getContext() == null) || (!at.AU()))
        {
          w.w("MicroMsg.SubCoreExtQLauncher", "wrong status");
          GMTrace.o(9030974046208L, 67286);
          return;
        }
        if (b.this.avM())
        {
          int i = b.avL();
          if ((i > 0) || (i < b.this.kOS))
          {
            w.d("MicroMsg.SubCoreExtQLauncher", "notify unread");
            paramAnonymousMessage = new Intent("com.tencent.mm.ext.ACTION_EXT_NOTIFY");
            paramAnonymousMessage.putExtra("EXTRA_EXT_NOTIFY_TYPE", "NEW_UNREAD");
            ab.getContext().sendBroadcast(paramAnonymousMessage);
            b.this.kOS = i;
          }
        }
        GMTrace.o(9030974046208L, 67286);
      }
    };
    GMTrace.o(9026142208000L, 67250);
  }
  
  public static b avK()
  {
    GMTrace.i(9026276425728L, 67251);
    b localb2 = (b)at.AK().gZ("plugin.extqlauncher");
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = new b();
      at.AK().a("plugin.extqlauncher", localb1);
    }
    GMTrace.o(9026276425728L, 67251);
    return localb1;
  }
  
  public static int avL()
  {
    GMTrace.i(9026813296640L, 67255);
    if (!at.AU())
    {
      w.w("MicroMsg.SubCoreExtQLauncher", "getMMUnread account not ready");
      GMTrace.o(9026813296640L, 67255);
      return 0;
    }
    int j = t.gu(s.gmw);
    int k = k.zB();
    int i = j;
    if ((q.zI() & 0x8000) == 0) {
      i = j - k;
    }
    GMTrace.o(9026813296640L, 67255);
    return i;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9026544861184L, 67253);
    at.AR();
    com.tencent.mm.y.c.yP().a(this.kOM);
    if (this.kOJ == null) {
      this.kOJ = new a();
    }
    a.vgX.b(this.kOJ);
    if (this.kOK == null) {
      this.kOK = new b((byte)0);
    }
    a.vgX.b(this.kOK);
    GMTrace.o(9026544861184L, 67253);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(9026410643456L, 67252);
    GMTrace.o(9026410643456L, 67252);
  }
  
  public final boolean avM()
  {
    GMTrace.i(16048145301504L, 119568);
    if (ab.getContext() == null)
    {
      w.w("MicroMsg.SubCoreExtQLauncher", "isPluginInstall, ApplicationContext null");
      this.kON = false;
      GMTrace.o(16048145301504L, 119568);
      return false;
    }
    if (System.currentTimeMillis() - this.kOO < 300000L)
    {
      bool = this.kON;
      GMTrace.o(16048145301504L, 119568);
      return bool;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9027618603008L, 67261);
        for (;;)
        {
          int i;
          try
          {
            b.this.kOO = System.currentTimeMillis();
            List localList = ab.getContext().getPackageManager().getInstalledApplications(128);
            if (localList == null)
            {
              w.e("MicroMsg.SubCoreExtQLauncher", "getInstalledApplications return null");
              b.this.kON = false;
              GMTrace.o(9027618603008L, 67261);
              return;
            }
            i = 0;
            if (i < localList.size())
            {
              ApplicationInfo localApplicationInfo = (ApplicationInfo)localList.get(i);
              if ((localApplicationInfo == null) || ((!bg.nl(localApplicationInfo.packageName).startsWith("com.tencent.qlauncher")) && (!bg.nl(localApplicationInfo.packageName).startsWith("com.tencent.qqlauncher")) && (!bg.nl(localApplicationInfo.packageName).startsWith("com.tencent.launcher"))) || (localApplicationInfo.metaData == null)) {
                break label392;
              }
              Object localObject = localApplicationInfo.metaData.getString("qlauncher_wx_coop");
              if ((localObject == null) || (((String)localObject).length() <= 0))
              {
                w.w("MicroMsg.SubCoreExtQLauncher", "qlauncher_wx_coop not found, %s, costTime = %s", new Object[] { localApplicationInfo.packageName, Long.valueOf(System.currentTimeMillis() - b.this.kOO) });
                b.this.kON = false;
              }
              else
              {
                localObject = ((String)localObject).split(",");
                if (localObject != null)
                {
                  int k = localObject.length;
                  int j = 0;
                  if (j < k)
                  {
                    if (bg.nl(localObject[j]).trim().equalsIgnoreCase("fun1"))
                    {
                      w.d("MicroMsg.SubCoreExtQLauncher", "founded qlauncher, %s", new Object[] { localApplicationInfo.packageName });
                      b.this.kON = true;
                      GMTrace.o(9027618603008L, 67261);
                      return;
                    }
                    j += 1;
                    continue;
                  }
                }
                b.this.kON = false;
              }
            }
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.SubCoreExtQLauncher", "exception in getApplicationInfo, %s", new Object[] { localException.getMessage() });
            b.this.kON = false;
            GMTrace.o(9027618603008L, 67261);
            return;
          }
          w.d("MicroMsg.SubCoreExtQLauncher", "qlauncher not founded, costTime = %s", new Object[] { Long.valueOf(System.currentTimeMillis() - b.this.kOO) });
          GMTrace.o(9027618603008L, 67261);
          return;
          label392:
          i += 1;
        }
      }
      
      public final String toString()
      {
        GMTrace.i(9027752820736L, 67262);
        String str = super.toString() + "|isPluginInstall";
        GMTrace.o(9027752820736L, 67262);
        return str;
      }
    });
    boolean bool = this.kON;
    GMTrace.o(16048145301504L, 119568);
    return bool;
  }
  
  public final void avN()
  {
    GMTrace.i(9027215949824L, 67258);
    this.kOT.removeMessages(0);
    this.kOT.sendEmptyMessageDelayed(0, 4000L);
    GMTrace.o(9027215949824L, 67258);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9027081732096L, 67257);
    GMTrace.o(9027081732096L, 67257);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9026679078912L, 67254);
    if (this.kOJ != null) {
      a.vgX.c(this.kOJ);
    }
    if (this.kOK != null) {
      a.vgX.c(this.kOK);
    }
    at.AR();
    com.tencent.mm.y.c.yP().b(this.kOM);
    this.kOT.removeMessages(0);
    GMTrace.o(9026679078912L, 67254);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(9026947514368L, 67256);
    GMTrace.o(9026947514368L, 67256);
    return null;
  }
  
  public static final class a
    extends com.tencent.mm.sdk.b.c<es>
  {
    public a()
    {
      GMTrace.i(9029766086656L, 67277);
      this.vhf = es.class.getName().hashCode();
      GMTrace.o(9029766086656L, 67277);
    }
  }
  
  private final class b
    extends com.tencent.mm.sdk.b.c<lu>
  {
    private b()
    {
      GMTrace.i(9025605337088L, 67246);
      this.vhf = lu.class.getName().hashCode();
      GMTrace.o(9025605337088L, 67246);
    }
    
    private boolean a(lu paramlu)
    {
      GMTrace.i(9025739554816L, 67247);
      if (!b.this.avM())
      {
        w.e("MicroMsg.SubCoreExtQLauncher", "!isPluginInstall");
        GMTrace.o(9025739554816L, 67247);
        return false;
      }
      if (ab.getContext() == null)
      {
        w.e("MicroMsg.SubCoreExtQLauncher", "MMApplicationContext null");
        GMTrace.o(9025739554816L, 67247);
        return false;
      }
      w.d("MicroMsg.SubCoreExtQLauncher", "GetScanCodeEvent callback flag = %s, url = %s", new Object[] { Integer.valueOf(paramlu.eQn.eQl), paramlu.eQn.scanResult });
      do
      {
        try
        {
          int i = paramlu.eQn.eQl;
          switch (i)
          {
          }
        }
        catch (Exception paramlu)
        {
          for (;;)
          {
            Intent localIntent;
            w.e("MicroMsg.SubCoreExtQLauncher", "Exception in ScanCodeResultEvent, %s", new Object[] { paramlu.getMessage() });
          }
        }
        GMTrace.o(9025739554816L, 67247);
        return false;
      } while ((bg.nm(paramlu.eQn.scanResult)) || (!paramlu.eQn.scanResult.startsWith("qlauncher://")));
      localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setComponent(new ComponentName("com.tencent.qlauncher", "com.tencent.qlauncher.thirdpartycoop.DispatchActivity"));
      localIntent.setData(Uri.parse(paramlu.eQn.scanResult));
      localIntent.setFlags(268435456);
      ab.getContext().startActivity(localIntent);
      paramlu.eQo.ret = 1;
      GMTrace.o(9025739554816L, 67247);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\extqlauncher\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */