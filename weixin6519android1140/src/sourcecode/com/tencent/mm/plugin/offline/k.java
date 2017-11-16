package com.tencent.mm.plugin.offline;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.sq;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class k
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private static Map<String, String> hOK;
  public static boolean nAn;
  public static int nAo;
  private com.tencent.mm.vending.b.b hHZ;
  private bt.a jVN;
  public ae mHandler;
  private r nAh;
  private e nAi;
  private i nAj;
  private com.tencent.mm.plugin.offline.b.a nAk;
  private com.tencent.mm.plugin.offline.ui.d nAl;
  public f nAm;
  private com.tencent.mm.sdk.b.c<sq> nAp;
  private m nAq;
  
  static
  {
    GMTrace.i(6239513739264L, 46488);
    nAn = false;
    nAo = 10;
    hOK = new HashMap();
    fIv = new HashMap();
    com.tencent.mm.wallet_core.a.h("OfflineBindCardRegProcess", d.class);
    com.tencent.mm.wallet_core.a.h("OfflineBindCardProcess", c.class);
    fIv.put(Integer.valueOf("OFFLINE_ORDER_STATUS".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(15376117137408L, 114561);
        String[] arrayOfString = com.tencent.mm.plugin.offline.b.a.fTX;
        GMTrace.o(15376117137408L, 114561);
        return arrayOfString;
      }
    });
    GMTrace.o(6239513739264L, 46488);
  }
  
  public k()
  {
    GMTrace.i(6237768908800L, 46475);
    this.nAh = null;
    this.nAi = null;
    this.nAj = null;
    this.nAk = null;
    this.nAl = new com.tencent.mm.plugin.offline.ui.d();
    this.nAm = new f();
    this.nAp = new com.tencent.mm.sdk.b.c() {};
    this.mHandler = new ae(Looper.getMainLooper());
    this.jVN = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(17960747925504L, 133818);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.SubCoreOffline", "OfflinePayMsg:" + str);
        k.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17960479490048L, 133816);
            r localr = k.aVj();
            String str2 = str;
            long l = paramAnonymousa.gtM.tQd;
            w.v("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is :" + l);
            w.v("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg content is :" + str2);
            String str1;
            if (!TextUtils.isEmpty(str2))
            {
              if (localr.dc(l))
              {
                w.e("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is exist in list:" + l);
                GMTrace.o(17960479490048L, 133816);
                return;
              }
              str1 = null;
              Map localMap = bh.q(str2, "sysmsg");
              if (localMap != null) {
                str1 = (String)localMap.get(".sysmsg.paymsg.ack_key");
              }
              if (!com.tencent.mm.plugin.offline.c.a.aWu()) {
                break label247;
              }
              if (g.di(str1, str2))
              {
                com.tencent.mm.plugin.report.service.g.ork.a(135L, 70L, 1L, true);
                localr.Ee(str2);
                localr.ak(str2, false);
              }
            }
            for (;;)
            {
              if (localr.nyu.size() > 10) {
                localr.nyu.remove(localr.nyu.size() - 1);
              }
              localr.nyu.add(0, Long.valueOf(l));
              GMTrace.o(17960479490048L, 133816);
              return;
              label247:
              g.di(str1, str2);
              localr.Ee(str2);
              localr.ak(str2, false);
            }
          }
        });
        GMTrace.o(17960747925504L, 133818);
      }
    };
    GMTrace.o(6237768908800L, 46475);
  }
  
  public static k aVi()
  {
    GMTrace.i(6237903126528L, 46476);
    k localk = (k)p.o(k.class);
    GMTrace.o(6237903126528L, 46476);
    return localk;
  }
  
  public static r aVj()
  {
    GMTrace.i(6238708432896L, 46482);
    h.xw().wG();
    if (aVi().nAh == null) {
      aVi().nAh = new r();
    }
    r localr = aVi().nAh;
    GMTrace.o(6238708432896L, 46482);
    return localr;
  }
  
  public static e aVk()
  {
    GMTrace.i(6238842650624L, 46483);
    h.xw().wG();
    if (aVi().nAi == null) {
      aVi().nAi = new e();
    }
    e locale = aVi().nAi;
    GMTrace.o(6238842650624L, 46483);
    return locale;
  }
  
  public static i aVl()
  {
    GMTrace.i(6238976868352L, 46484);
    h.xw().wG();
    if (aVi().nAj == null) {
      aVi().nAj = new i();
    }
    i locali = aVi().nAj;
    GMTrace.o(6238976868352L, 46484);
    return locali;
  }
  
  public static com.tencent.mm.plugin.offline.b.a aVm()
  {
    GMTrace.i(15384572854272L, 114624);
    if (!h.xw().wL()) {
      throw new com.tencent.mm.y.b();
    }
    if (aVi().nAk == null)
    {
      localObject = aVi();
      h.xz();
      ((k)localObject).nAk = new com.tencent.mm.plugin.offline.b.a(h.xy().fYV);
    }
    Object localObject = aVi().nAk;
    GMTrace.o(15384572854272L, 114624);
    return (com.tencent.mm.plugin.offline.b.a)localObject;
  }
  
  public static void ai(int paramInt, String paramString)
  {
    GMTrace.i(6239111086080L, 46485);
    if (paramString != null)
    {
      h.xz();
      h.xy().xh().set(paramInt, paramString);
      h.xz();
      h.xy().xh().kL(true);
    }
    GMTrace.o(6239111086080L, 46485);
  }
  
  public static String sf(int paramInt)
  {
    GMTrace.i(6239245303808L, 46486);
    h.xz();
    String str = (String)h.xy().xh().get(paramInt, null);
    GMTrace.o(6239245303808L, 46486);
    return str;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6238439997440L, 46480);
    this.hHZ = ((com.tencent.mm.plugin.auth.a.b)h.j(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new com.tencent.mm.plugin.auth.a.a()
    {
      public final void a(i.f paramAnonymousf, i.g paramAnonymousg, boolean paramAnonymousBoolean)
      {
        GMTrace.i(17960882143232L, 133819);
        w.i("MicroMsg.SubCoreOffline", "autoAuth: %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (!paramAnonymousBoolean) {
          k.aVl().cG(7, 7);
        }
        GMTrace.o(17960882143232L, 133819);
      }
      
      public final void a(y.b paramAnonymousb, String paramAnonymousString1, int paramAnonymousInt1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt2)
      {
        GMTrace.i(17961016360960L, 133820);
        GMTrace.o(17961016360960L, 133820);
      }
    });
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.jVN, true);
    com.tencent.mm.sdk.b.a.vgX.b(this.nAl);
    com.tencent.mm.sdk.b.a.vgX.b(this.nAp);
    this.nAh = null;
    this.nAi = null;
    this.nAj = null;
    this.nAq = new m();
    GMTrace.o(6238439997440L, 46480);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6238305779712L, 46479);
    GMTrace.o(6238305779712L, 46479);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6238171561984L, 46478);
    GMTrace.o(6238171561984L, 46478);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6238574215168L, 46481);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.jVN, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.nAl);
    com.tencent.mm.sdk.b.a.vgX.c(this.nAp);
    if (this.nAq != null)
    {
      m localm = this.nAq;
      aVi();
      aVj().b(localm);
      com.tencent.mm.sdk.b.a.vgX.c(localm.mKc);
    }
    this.nAq = null;
    this.hHZ.dead();
    GMTrace.o(6238574215168L, 46481);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6238037344256L, 46477);
    HashMap localHashMap = fIv;
    GMTrace.o(6238037344256L, 46477);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */