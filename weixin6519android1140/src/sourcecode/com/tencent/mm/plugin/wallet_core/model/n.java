package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.g.a.sw;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.d.g;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class n
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private com.tencent.mm.plugin.wallet_core.id_verify.util.a riA;
  private com.tencent.mm.sdk.b.c riB;
  private com.tencent.mm.sdk.b.c<sw> riC;
  private bt.a riD;
  private p rim;
  private af rin;
  private j rio;
  private com.tencent.mm.plugin.wallet_core.d.c rip;
  private z riq;
  private ac rir;
  private com.tencent.mm.plugin.wallet_core.d.a ris;
  private f rit;
  private com.tencent.mm.plugin.wallet_core.d.d riu;
  private t riv;
  private com.tencent.mm.plugin.wallet_core.d.e riw;
  private i rix;
  private com.tencent.mm.plugin.wallet_core.d.h riy;
  private g riz;
  
  static
  {
    GMTrace.i(6876645294080L, 51235);
    com.tencent.mm.compatible.util.k.b("tenpay_utils", n.class.getClassLoader());
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("WALLET_USER_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(20888036573184L, 155628);
        String[] arrayOfString = j.fTX;
        GMTrace.o(20888036573184L, 155628);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_BANKCARD_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6864163045376L, 51142);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.d.c.fTX;
        GMTrace.o(6864163045376L, 51142);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("LOAN_ENTRY_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6907918024704L, 51468);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.d.a.fTX;
        GMTrace.o(6907918024704L, 51468);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_KIND_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6870337060864L, 51188);
        String[] arrayOfString = f.fTX;
        GMTrace.o(6870337060864L, 51188);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_BULLETIN_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6903354621952L, 51434);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.d.d.fTX;
        GMTrace.o(6903354621952L, 51434);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_PREF_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6904965234688L, 51446);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.d.h.fTX;
        GMTrace.o(6904965234688L, 51446);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_FUNCTIOIN_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6867115835392L, 51164);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.d.e.fTX;
        GMTrace.o(6867115835392L, 51164);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_GREY_ITEM_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6867921141760L, 51170);
        String[] arrayOfString = i.fTX;
        GMTrace.o(6867921141760L, 51170);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WALLET_LUKCY_MONEY".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6877584818176L, 51242);
        String[] arrayOfString = g.fTX;
        GMTrace.o(6877584818176L, 51242);
        return arrayOfString;
      }
    });
    GMTrace.o(6876645294080L, 51235);
  }
  
  public n()
  {
    GMTrace.i(6873558286336L, 51212);
    this.rim = new p();
    this.rin = null;
    this.rio = null;
    this.rip = null;
    this.riq = null;
    this.rir = null;
    this.ris = null;
    this.rit = null;
    this.riu = null;
    this.riv = new t();
    this.riw = null;
    this.rix = null;
    this.riy = null;
    this.riz = null;
    this.riA = new com.tencent.mm.plugin.wallet_core.id_verify.util.a();
    this.riB = new com.tencent.mm.sdk.b.c() {};
    this.riC = new com.tencent.mm.sdk.b.c() {};
    this.riD = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(20888170790912L, 155629);
        paramAnonymousa = bh.q(com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY), "sysmsg");
        if (paramAnonymousa == null)
        {
          GMTrace.o(20888170790912L, 155629);
          return;
        }
        int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.PayMsgType"), -1);
        w.i("MicroMsg.SubCoreNfc", "got a pay msg, type = " + i);
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(20888170790912L, 155629);
          return;
          i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.WalletType"), -1);
          w.i("MicroMsg.SubCoreNfc", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + i);
          if (i >= 0)
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xy().xh().set(339975, Integer.valueOf(i));
            GMTrace.o(20888170790912L, 155629);
            return;
            i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.Flag"), 0);
            w.i("MicroMsg.SubCoreNfc", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + i);
            if (i == 1)
            {
              w.i("MicroMsg.SubCoreNfc", "open wallet");
              q.zO();
              GMTrace.o(20888170790912L, 155629);
              return;
            }
            if (i == 2)
            {
              w.i("MicroMsg.SubCoreNfc", "close wallet");
              i = q.zK();
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xy().xh().set(40, Integer.valueOf(i & 0xFFFF7FFF));
            }
          }
        }
      }
    };
    GMTrace.o(6873558286336L, 51212);
  }
  
  public static boolean a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.b paramb, a.a parama)
  {
    GMTrace.i(6876376858624L, 51233);
    boolean bool = bys().riA.a(paramMMActivity, 2, paramb, parama, false, 1008, true);
    GMTrace.o(6876376858624L, 51233);
    return bool;
  }
  
  public static boolean b(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.b paramb, a.a parama)
  {
    GMTrace.i(6876511076352L, 51234);
    boolean bool = bys().riA.a(paramMMActivity, 4, paramb, parama, false, 1006, false);
    GMTrace.o(6876511076352L, 51234);
    return bool;
  }
  
  public static f byA()
  {
    GMTrace.i(6874900463616L, 51222);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().rit == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).rit = new f(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().rit;
    GMTrace.o(6874900463616L, 51222);
    return (f)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.d.d byB()
  {
    GMTrace.i(6875034681344L, 51223);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().riu == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).riu = new com.tencent.mm.plugin.wallet_core.d.d(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().riu;
    GMTrace.o(6875034681344L, 51223);
    return (com.tencent.mm.plugin.wallet_core.d.d)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.d.e byC()
  {
    GMTrace.i(6875168899072L, 51224);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().riw == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).riw = new com.tencent.mm.plugin.wallet_core.d.e(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().riw;
    GMTrace.o(6875168899072L, 51224);
    return (com.tencent.mm.plugin.wallet_core.d.e)localObject;
  }
  
  public static i byD()
  {
    GMTrace.i(6875303116800L, 51225);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().rix == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).rix = new i(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().rix;
    GMTrace.o(6875303116800L, 51225);
    return (i)localObject;
  }
  
  public static z byE()
  {
    GMTrace.i(6875705769984L, 51228);
    z localz = bys().riq;
    GMTrace.o(6875705769984L, 51228);
    return localz;
  }
  
  public static p byF()
  {
    GMTrace.i(6876242640896L, 51232);
    p localp = bys().rim;
    GMTrace.o(6876242640896L, 51232);
    return localp;
  }
  
  public static n bys()
  {
    GMTrace.i(6873692504064L, 51213);
    n localn = (n)com.tencent.mm.y.p.o(n.class);
    GMTrace.o(6873692504064L, 51213);
    return localn;
  }
  
  public static j byt()
  {
    GMTrace.i(6873960939520L, 51215);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().rio == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).rio = new j(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().rio;
    GMTrace.o(6873960939520L, 51215);
    return (j)localObject;
  }
  
  public static g byu()
  {
    GMTrace.i(6874095157248L, 51216);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().riz == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).riz = new g(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().riz;
    GMTrace.o(6874095157248L, 51216);
    return (g)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.d.c byv()
  {
    GMTrace.i(6874229374976L, 51217);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().rip == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).rip = new com.tencent.mm.plugin.wallet_core.d.c(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().rip;
    GMTrace.o(6874229374976L, 51217);
    return (com.tencent.mm.plugin.wallet_core.d.c)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.d.h byw()
  {
    GMTrace.i(6874363592704L, 51218);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().riy == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).riy = new com.tencent.mm.plugin.wallet_core.d.h(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().riy;
    GMTrace.o(6874363592704L, 51218);
    return (com.tencent.mm.plugin.wallet_core.d.h)localObject;
  }
  
  public static af byx()
  {
    GMTrace.i(6874497810432L, 51219);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().rin == null) {
      bys().rin = new af();
    }
    af localaf = bys().rin;
    GMTrace.o(6874497810432L, 51219);
    return localaf;
  }
  
  public static ac byy()
  {
    GMTrace.i(6874632028160L, 51220);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().rir == null) {
      bys().rir = new ac();
    }
    ac localac = bys().rir;
    GMTrace.o(6874632028160L, 51220);
    return localac;
  }
  
  public static com.tencent.mm.plugin.wallet_core.d.a byz()
  {
    GMTrace.i(6874766245888L, 51221);
    if (!com.tencent.mm.kernel.h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (bys().ris == null)
    {
      localObject = bys();
      com.tencent.mm.kernel.h.xz();
      ((n)localObject).ris = new com.tencent.mm.plugin.wallet_core.d.a(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bys().ris;
    GMTrace.o(6874766245888L, 51221);
    return (com.tencent.mm.plugin.wallet_core.d.a)localObject;
  }
  
  public static void t(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(6876108423168L, 51231);
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    if (q.zS())
    {
      localIntent.setFlags(536870912);
      w.i("MicroMsg.SubCoreNfc", "entryWalletIndexPage wallet type is h5,jump to ibg");
      com.tencent.mm.bj.d.b(paramContext, "wallet_core", ".ui.ibg.WalletIbgAdapterUI", localIntent);
      GMTrace.o(6876108423168L, 51231);
      return;
    }
    if (q.zT())
    {
      localIntent.setFlags(536870912);
      com.tencent.mm.bj.d.b(paramContext, "mall", ".ui.MallIndexOSUI", localIntent);
      GMTrace.o(6876108423168L, 51231);
      return;
    }
    w.i("MicroMsg.SubCoreNfc", "entryWalletIndexPage wallet type is native");
    localIntent.setFlags(536870912);
    com.tencent.mm.bj.d.b(paramContext, "mall", ".ui.MallIndexUI", localIntent);
    com.tencent.mm.kernel.h.xz();
    if (com.tencent.mm.kernel.h.xy().isSDCardAvailable())
    {
      paramContext = new com.tencent.mm.aw.k(11);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(paramContext, 0);
    }
    GMTrace.o(6876108423168L, 51231);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6875839987712L, 51229);
    w.i("MicroMsg.SubCoreNfc", "onAccountPostReset subcore walletCore");
    com.tencent.mm.wallet_core.c.a.clF();
    com.tencent.mm.wallet_core.c.a.init(ab.getContext());
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.riD, true);
    byx().bzb();
    this.riq = z.byH();
    z localz = this.riq;
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", localz.jVN, true);
    com.tencent.mm.sdk.b.a.vgX.b(this.riB);
    com.tencent.mm.sdk.b.a.vgX.b(this.riv);
    com.tencent.mm.sdk.b.a.vgX.a(this.riC);
    com.tencent.mm.pluginsdk.b.b.a(new a(), new String[] { "//cleanpaycn" });
    GMTrace.o(6875839987712L, 51229);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6875571552256L, 51227);
    GMTrace.o(6875571552256L, 51227);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6875437334528L, 51226);
    GMTrace.o(6875437334528L, 51226);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6875974205440L, 51230);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.riD, true);
    byx().ayE();
    Object localObject = byy();
    ((ac)localObject).rjp = null;
    ((ac)localObject).rjo.clear();
    ((ac)localObject).rjo = new ArrayList();
    localObject = this.riq;
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", ((z)localObject).jVN, true);
    if (z.kTV != null) {
      z.kTV.clear();
    }
    this.riq = null;
    com.tencent.mm.sdk.b.a.vgX.c(this.riB);
    com.tencent.mm.sdk.b.a.vgX.c(this.riv);
    com.tencent.mm.sdk.b.a.vgX.c(this.riC);
    GMTrace.o(6875974205440L, 51230);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6873826721792L, 51214);
    HashMap localHashMap = fIv;
    GMTrace.o(6873826721792L, 51214);
    return localHashMap;
  }
  
  static final class a
    implements com.tencent.mm.pluginsdk.b.a
  {
    a()
    {
      GMTrace.i(20885889089536L, 155612);
      GMTrace.o(20885889089536L, 155612);
    }
    
    public final boolean a(Context paramContext, String[] paramArrayOfString)
    {
      GMTrace.i(20886023307264L, 155613);
      paramContext = paramArrayOfString[0];
      int i = -1;
      switch (paramContext.hashCode())
      {
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          GMTrace.o(20886023307264L, 155613);
          return false;
          if (paramContext.equals("//cleanpaycn")) {
            i = 0;
          }
          break;
        }
      }
      com.tencent.mm.wallet_core.c.a.clF();
      com.tencent.mm.wallet_core.c.a.clean();
      GMTrace.o(20886023307264L, 155613);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */