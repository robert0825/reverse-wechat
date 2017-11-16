package com.tencent.mm.plugin.collect.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.collect.b.d;
import com.tencent.mm.plugin.collect.b.g;
import com.tencent.mm.plugin.collect.b.s;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a
  implements aq
{
  private bt.a jVN;
  private g jVO;
  
  public a()
  {
    GMTrace.i(5437562814464L, 40513);
    this.jVN = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(5437160161280L, 40510);
        a.aos();
        if (a.aot() != null)
        {
          Object localObject = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
          a.aos();
          paramAnonymousa = a.aot();
          w.v("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] content:" + (String)localObject);
          if (bg.nm((String)localObject))
          {
            w.d("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] Msg content empty");
            GMTrace.o(5437160161280L, 40510);
            return;
          }
          localObject = bh.q((String)localObject, "sysmsg");
          int i = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), 0);
          if ((i != 9) && (i != 26))
          {
            w.i("MicroMsg.CollectPayerMsgMgr", "Not ftf collect msg type, ignore; type=" + i);
            GMTrace.o(5437160161280L, 40510);
            return;
          }
          s locals = new s();
          locals.username = bg.nl((String)((Map)localObject).get(".sysmsg.paymsg.username"));
          locals.jWS = (bg.getDouble((String)((Map)localObject).get(".sysmsg.paymsg.fee"), 0.0D) / 100.0D);
          locals.eCU = bg.nl((String)((Map)localObject).get(".sysmsg.paymsg.feetype"));
          locals.jWT = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsgtimestamp"), (int)bg.Pu());
          locals.eRP = bg.nl((String)((Map)localObject).get(".sysmsg.paymsg.transid"));
          locals.fMz = bg.nl((String)((Map)localObject).get(".sysmsg.paymsg.displayname"));
          locals.scene = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.scene"), 1);
          locals.status = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.status"), 0);
          locals.msgType = i;
          locals.jWU = bg.nl((String)((Map)localObject).get(".sysmsg.paymsg.outtradeno"));
          paramAnonymousa.a(locals);
          GMTrace.o(5437160161280L, 40510);
          return;
        }
        w.w("MicroMsg.SubCoreCollect", "func[onRecieveMsg] payerMsgMgr null");
        GMTrace.o(5437160161280L, 40510);
      }
    };
    this.jVO = new g();
    GMTrace.o(5437562814464L, 40513);
  }
  
  public static a aos()
  {
    GMTrace.i(5437697032192L, 40514);
    a locala = (a)p.o(a.class);
    GMTrace.o(5437697032192L, 40514);
    return locala;
  }
  
  public static d aot()
  {
    GMTrace.i(5438502338560L, 40520);
    h.xw().wG();
    d locald = d.jVU;
    GMTrace.o(5438502338560L, 40520);
    return locald;
  }
  
  public static boolean aou()
  {
    GMTrace.i(17787607056384L, 132528);
    String str = (String)h.xy().xh().get(w.a.vwp, "");
    long l = q.zJ();
    if ((!bg.nm(str)) && (!str.equals("in.caf")))
    {
      w.i("MicroMsg.SubCoreCollect", "old version switch is open");
      GMTrace.o(17787607056384L, 132528);
      return true;
    }
    if ((l & 0x8000) != 0L)
    {
      GMTrace.o(17787607056384L, 132528);
      return true;
    }
    GMTrace.o(17787607056384L, 132528);
    return false;
  }
  
  private void vi(String paramString)
  {
    GMTrace.i(17788009709568L, 132531);
    h.xz();
    h.xx().fYr.a(304, new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5437428596736L, 40512);
        h.xz();
        h.xx().fYr.b(304, this);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
          w.i("MicroMsg.SubCoreCollect", "set sound fail!");
        }
        GMTrace.o(5437428596736L, 40512);
      }
    });
    paramString = new com.tencent.mm.plugin.collect.b.n(bg.aq(paramString, ""));
    h.xz();
    h.xx().fYr.a(paramString, 0);
    GMTrace.o(17788009709568L, 132531);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5438233903104L, 40518);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.jVN, true);
    g localg = this.jVO;
    localg.bPu();
    localg.jWa = new ConcurrentLinkedQueue();
    h.xz();
    h.xx().fYr.a(1384, localg);
    h.xz();
    h.xx().fYr.a(1317, localg);
    GMTrace.o(5438233903104L, 40518);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5438099685376L, 40517);
    GMTrace.o(5438099685376L, 40517);
  }
  
  public final void aov()
  {
    GMTrace.i(17787741274112L, 132529);
    vi("cash.caf");
    h.xy().xh().a(w.a.vwp, "cash.caf");
    GMTrace.o(17787741274112L, 132529);
  }
  
  public final void aow()
  {
    GMTrace.i(17787875491840L, 132530);
    vi("in.caf");
    h.xy().xh().a(w.a.vwp, "in.caf");
    GMTrace.o(17787875491840L, 132530);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5437965467648L, 40516);
    GMTrace.o(5437965467648L, 40516);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5438368120832L, 40519);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.jVN, true);
    g localg = this.jVO;
    localg.dead();
    h.xz();
    h.xx().fYr.b(1384, localg);
    h.xz();
    h.xx().fYr.b(1317, localg);
    g.aox();
    GMTrace.o(5438368120832L, 40519);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5437831249920L, 40515);
    GMTrace.o(5437831249920L, 40515);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */