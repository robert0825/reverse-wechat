package com.tencent.mm.plugin.accountsync.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.j.a.b.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements aq
{
  public static int hbh;
  public static int hsZ;
  private static com.tencent.mm.sdk.platformtools.aj htb;
  private a hsY;
  private com.tencent.mm.plugin.accountsync.model.a hta;
  private m htc;
  private com.tencent.mm.sdk.b.c htd;
  
  static
  {
    GMTrace.i(7851334434816L, 58497);
    hsZ = a.htg;
    hbh = 0;
    htb = null;
    GMTrace.o(7851334434816L, 58497);
  }
  
  public c()
  {
    GMTrace.i(7850126475264L, 58488);
    this.hsY = null;
    this.htc = new m()
    {
      public final void b(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(18472922775552L, 137634);
        if ((bg.nl(paramAnonymousString).equals("ChangeLaunchImage")) && (paramAnonymousMap != null))
        {
          paramAnonymousString = (String)paramAnonymousMap.get(".sysmsg.ChangeLaunchImage.BeginTime");
          String str = (String)paramAnonymousMap.get(".sysmsg.ChangeLaunchImage.EndTime");
          paramAnonymousMap = (String)paramAnonymousMap.get(".sysmsg.ChangeLaunchImage.ResId.SubType");
          w.i("MicroMsg.SubCoreAccountSync", "beginTime:%s,endTime:%s,subtype:%s", new Object[] { paramAnonymousString, str, paramAnonymousMap });
          if (!bg.E(new String[] { paramAnonymousString, str, paramAnonymousMap }))
          {
            g.ork.a(723L, 5L, 1L, false);
            int i = bg.Sy(paramAnonymousMap);
            if (i > 0)
            {
              paramAnonymousMap = ab.getContext().getSharedPreferences("system_config_prefs", 0);
              paramAnonymousMap.edit().putLong("new_launch_image_begin_time", bg.Sz(paramAnonymousString)).apply();
              paramAnonymousMap.edit().putInt("new_launch_image_sub_type", i).apply();
              paramAnonymousMap.edit().putLong("new_launch_image_end_time", bg.Sz(str)).commit();
              paramAnonymousString = b.c.tqk;
              c.nB(com.tencent.mm.pluginsdk.j.a.b.b.dT(43, i));
            }
          }
        }
        GMTrace.o(18472922775552L, 137634);
      }
    };
    this.htd = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7850126475264L, 58488);
  }
  
  public static void hJ(int paramInt)
  {
    GMTrace.i(7850931781632L, 58494);
    hsZ = paramInt;
    switch (4.htf[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(7850931781632L, 58494);
      return;
      hbh = 0;
      if (htb == null) {
        htb = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(7852139741184L, 58503);
            int i = c.hbh + 1;
            c.hbh = i;
            if ((i == 1) || (c.hbh == 16) || (c.hbh % 96 == 0)) {
              at.getNotification().rz();
            }
            GMTrace.o(7852139741184L, 58503);
            return true;
          }
        }, true);
      }
      w.d("MicroMsg.SubCoreAccountSync", "[oneliang][SmsVerifyCodeState]Sent");
      htb.z(900000L, 900000L);
      GMTrace.o(7850931781632L, 58494);
      return;
      if (htb != null) {
        htb.stopTimer();
      }
      w.d("MicroMsg.SubCoreAccountSync", "[oneliang][SmsVerifyCodeState]verified");
      hsZ = a.htg;
      at.getNotification().rA();
      hbh = 0;
      htb = null;
    }
  }
  
  public static void nB(String paramString)
  {
    GMTrace.i(18472654340096L, 137632);
    w.i("MicroMsg.SubCoreAccountSync", "filePath: %s", new Object[] { paramString });
    if (!bg.nm(paramString))
    {
      paramString = new File(paramString);
      if (paramString.exists())
      {
        String str = com.tencent.mm.compatible.util.e.ghv + "splashWelcomeImg";
        if (com.tencent.mm.loader.stub.b.deleteFile(str)) {
          com.tencent.mm.a.e.o(paramString.getAbsolutePath(), str);
        }
      }
    }
    GMTrace.o(18472654340096L, 137632);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7850663346176L, 58492);
    this.hta = new com.tencent.mm.plugin.accountsync.model.a();
    ((n)h.j(n.class)).getSysCmdMsgExtension().a("ChangeLaunchImage", this.htc);
    this.htd.bPu();
    com.tencent.mm.pluginsdk.j.a.b.b localb = b.c.tqk;
    com.tencent.mm.pluginsdk.j.a.b.b.yR(43);
    GMTrace.o(7850663346176L, 58492);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7850797563904L, 58493);
    GMTrace.o(7850797563904L, 58493);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7850529128448L, 58491);
    GMTrace.o(7850529128448L, 58491);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7850260692992L, 58489);
    com.tencent.mm.plugin.accountsync.model.a locala = this.hta;
    com.tencent.mm.sdk.b.a.vgX.c(locala.hto);
    this.hta = null;
    ((n)h.j(n.class)).getSysCmdMsgExtension().b("ChangeLaunchImage", this.htc);
    this.htd.dead();
    GMTrace.o(7850260692992L, 58489);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7850394910720L, 58490);
    GMTrace.o(7850394910720L, 58490);
    return null;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(7853079265280L, 58510);
      htg = 1;
      hth = 2;
      hti = 3;
      htj = new int[] { htg, hth, hti };
      GMTrace.o(7853079265280L, 58510);
    }
    
    public static int[] Qw()
    {
      GMTrace.i(7852945047552L, 58509);
      int[] arrayOfInt = (int[])htj.clone();
      GMTrace.o(7852945047552L, 58509);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\accountsync\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */