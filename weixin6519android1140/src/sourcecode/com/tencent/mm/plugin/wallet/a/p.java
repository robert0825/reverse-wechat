package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.u;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class p
  implements aq
{
  public int eXn;
  public int qYa;
  private o qYb;
  private u qYc;
  private i qYd;
  private m.b qYe;
  private com.tencent.mm.plugin.messenger.foundation.a.m qYf;
  private j qYg;
  
  static
  {
    GMTrace.i(7700876361728L, 57376);
    com.tencent.mm.wallet_core.a.h("ForgotPwdProcess", com.tencent.mm.plugin.wallet.pwd.a.class);
    com.tencent.mm.wallet_core.a.h("BindCardProcess", com.tencent.mm.plugin.wallet_core.b.b.class);
    GMTrace.o(7700876361728L, 57376);
  }
  
  public p()
  {
    GMTrace.i(7699534184448L, 57366);
    this.qYa = 0;
    this.eXn = 0;
    this.qYb = new o();
    this.qYc = new u();
    this.qYd = new i();
    this.qYe = new m.b()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.sdk.e.m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(14284255920128L, 106426);
        if (bg.m(paramAnonymousObject, 0) == 339975)
        {
          h.xz();
          paramAnonymousInt = ((Integer)h.xy().xh().get(339975, Integer.valueOf(0))).intValue();
          if (paramAnonymousInt != p.this.qYa)
          {
            ao.bJL().reset();
            p.this.qYa = paramAnonymousInt;
          }
          GMTrace.o(14284255920128L, 106426);
          return;
        }
        if (w.a.vut.equals(paramAnonymousObject))
        {
          h.xz();
          paramAnonymousInt = ((Integer)h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
          if (paramAnonymousInt != p.this.eXn)
          {
            ao.bJL().reset();
            p.this.eXn = paramAnonymousInt;
          }
        }
        GMTrace.o(14284255920128L, 106426);
      }
    };
    this.qYf = new com.tencent.mm.plugin.messenger.foundation.a.m()
    {
      public final void b(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(16563004506112L, 123404);
        String str;
        if (("paymsg".equals(paramAnonymousString)) && ("30".equals(paramAnonymousMap.get(".sysmsg.paymsg.PayMsgType"))))
        {
          int i = bg.getInt((String)paramAnonymousMap.get(".sysmsg.paymsg.WalletRedDot"), 0);
          int j = bg.getInt((String)paramAnonymousMap.get(".sysmsg.paymsg.BankCardRedDot"), 0);
          str = (String)paramAnonymousMap.get(".sysmsg.paymsg.NewTagBankSerial");
          paramAnonymousString = (String)paramAnonymousMap.get(".sysmsg.paymsg.WalletRedDotWording");
          w.i("MicroMsg.SubCoreMMWallet", "moreTabWallet: %s, walletBankCard: %s, bankSerial: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), str });
          if (i != 1) {
            break label268;
          }
          c.vK().b(w.a.vyO, true);
          if (j != 1) {
            break label281;
          }
          c.vK().b(w.a.vyP, true);
        }
        for (;;)
        {
          if (!bg.nm(paramAnonymousString))
          {
            h.xz();
            h.xy().xh().a(w.a.vyR, paramAnonymousString);
          }
          if (!bg.nm(str))
          {
            h.xz();
            paramAnonymousMap = (String)h.xy().xh().get(w.a.vyS, "");
            paramAnonymousString = str;
            if (!bg.nm(paramAnonymousMap)) {
              paramAnonymousString = paramAnonymousMap + "," + str;
            }
            h.xz();
            h.xy().xh().a(w.a.vyS, paramAnonymousString);
          }
          GMTrace.o(16563004506112L, 123404);
          return;
          label268:
          c.vK().b(w.a.vyO, false);
          break;
          label281:
          c.vK().b(w.a.vyP, false);
        }
      }
    };
    this.qYg = new j();
    File localFile = new File(com.tencent.mm.plugin.wallet_core.d.b.bzo());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(7699534184448L, 57366);
  }
  
  public static String Hz()
  {
    GMTrace.i(7700607926272L, 57374);
    h.xz();
    String str1 = (String)h.xy().xh().get(6, null);
    String str2 = an.AL(str1);
    if (bg.nm(str1))
    {
      GMTrace.o(7700607926272L, 57374);
      return "";
    }
    str1 = str1.substring(str2.length() + 1);
    GMTrace.o(7700607926272L, 57374);
    return str1;
  }
  
  public static p bxd()
  {
    GMTrace.i(7699668402176L, 57367);
    p localp = (p)com.tencent.mm.y.p.o(p.class);
    GMTrace.o(7699668402176L, 57367);
    return localp;
  }
  
  public static af bxe()
  {
    GMTrace.i(7700473708544L, 57373);
    af localaf = com.tencent.mm.plugin.wallet_core.model.n.byx();
    GMTrace.o(7700473708544L, 57373);
    return localaf;
  }
  
  public static String bxf()
  {
    GMTrace.i(7700742144000L, 57375);
    h.xz();
    String str1 = (String)h.xy().xh().get(6, null);
    if (bg.nm(str1))
    {
      str1 = "";
      str2 = str1;
      if (bg.nm(str1)) {
        if (!q.zR()) {
          break label81;
        }
      }
    }
    label81:
    for (String str2 = "27";; str2 = "86")
    {
      GMTrace.o(7700742144000L, 57375);
      return str2;
      str1 = an.AL(str1.replace("+", ""));
      break;
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7700205273088L, 57371);
    h.xz();
    this.qYa = ((Integer)h.xy().xh().get(339975, Integer.valueOf(0))).intValue();
    h.xz();
    this.eXn = ((Integer)h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.qYf);
    com.tencent.mm.sdk.b.a.vgX.b(this.qYb);
    com.tencent.mm.sdk.b.a.vgX.b(this.qYc);
    com.tencent.mm.sdk.b.a.vgX.b(this.qYd);
    this.qYg.bPu();
    h.xz();
    h.xy().xh().a(this.qYe);
    GMTrace.o(7700205273088L, 57371);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7700071055360L, 57370);
    GMTrace.o(7700071055360L, 57370);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7699936837632L, 57369);
    GMTrace.o(7699936837632L, 57369);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7700339490816L, 57372);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.qYf);
    com.tencent.mm.sdk.b.a.vgX.c(this.qYb);
    com.tencent.mm.sdk.b.a.vgX.c(this.qYc);
    com.tencent.mm.sdk.b.a.vgX.c(this.qYd);
    this.qYg.dead();
    h.xz();
    h.xy().xh().b(this.qYe);
    GMTrace.o(7700339490816L, 57372);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7699802619904L, 57368);
    GMTrace.o(7699802619904L, 57368);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */