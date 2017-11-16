package com.tencent.mm.plugin.luckymoney.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ta;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.luckymoney.b.ah;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import java.io.File;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class a
  implements aq
{
  private bt.a jVN;
  private com.tencent.mm.plugin.luckymoney.b.d mFa;
  private f mFb;
  private com.tencent.mm.plugin.luckymoney.b.b mFc;
  private ah mFd;
  private c<ta> mFe;
  
  public a()
  {
    GMTrace.i(9914529349632L, 73869);
    this.mFc = new com.tencent.mm.plugin.luckymoney.b.b();
    this.jVN = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(9915871526912L, 73879);
        Object localObject1 = bh.q(com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY), "sysmsg");
        w.i("MicroMsg.SubCoreLuckyMoney", "helios::::mPayMsgListener");
        if (localObject1 == null)
        {
          w.e("MicroMsg.SubCoreLuckyMoney", "Resolve msg error");
          GMTrace.o(9915871526912L, 73879);
          return;
        }
        if ("14".equals((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType")))
        {
          paramAnonymousa = URLDecoder.decode((String)((Map)localObject1).get(".sysmsg.paymsg.appmsgcontent"));
          if (TextUtils.isEmpty(paramAnonymousa))
          {
            w.e("MicroMsg.SubCoreLuckyMoney", "msgxml illegal");
            GMTrace.o(9915871526912L, 73879);
            return;
          }
          Object localObject2 = bh.q(paramAnonymousa, "msg");
          if (localObject2 == null)
          {
            w.e("MicroMsg.SubCoreLuckyMoney", "Resolve appmsgxml error");
            GMTrace.o(9915871526912L, 73879);
            return;
          }
          localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
          if (bg.nm((String)localObject2))
          {
            w.e("MicroMsg.SubCoreLuckyMoney", "paymsgid is null");
            GMTrace.o(9915871526912L, 73879);
            return;
          }
          localObject1 = (String)((Map)localObject1).get(".sysmsg.paymsg.tousername");
          if ((bg.nm(paramAnonymousa)) || (bg.nm((String)localObject1)))
          {
            w.e("MicroMsg.SubCoreLuckyMoney", "onRecieveMsg get a illegal msg,which content or toUserName is null");
            GMTrace.o(9915871526912L, 73879);
            return;
          }
          if (a.this.aLS().BA((String)localObject2))
          {
            w.i("MicroMsg.SubCoreLuckyMoney", "insert a local msg for luckymoney");
            if (!com.tencent.mm.plugin.luckymoney.b.n.z(paramAnonymousa, (String)localObject1, 1)) {
              a.this.aLS().BB((String)localObject2);
            }
          }
        }
        GMTrace.o(9915871526912L, 73879);
      }
    };
    this.mFe = new c() {};
    File localFile = new File(aLR());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    localFile = new File(com.tencent.mm.compatible.util.e.fSi);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(9914529349632L, 73869);
  }
  
  public static a aLP()
  {
    GMTrace.i(9914395131904L, 73868);
    a locala = (a)p.o(a.class);
    GMTrace.o(9914395131904L, 73868);
    return locala;
  }
  
  public static com.tencent.mm.plugin.luckymoney.b.d aLQ()
  {
    GMTrace.i(9915334656000L, 73875);
    h.xw().wG();
    if (aLP().mFa == null) {
      aLP().mFa = new com.tencent.mm.plugin.luckymoney.b.d();
    }
    com.tencent.mm.plugin.luckymoney.b.d locald = aLP().mFa;
    GMTrace.o(9915334656000L, 73875);
    return locald;
  }
  
  public static String aLR()
  {
    GMTrace.i(9915468873728L, 73876);
    if (h.xw().wL())
    {
      String str = com.tencent.mm.plugin.n.b.yU() + "luckymoney";
      GMTrace.o(9915468873728L, 73876);
      return str;
    }
    GMTrace.o(9915468873728L, 73876);
    return "";
  }
  
  public final f aLS()
  {
    try
    {
      GMTrace.i(9915603091456L, 73877);
      if (this.mFb == null) {
        this.mFb = new f();
      }
      f localf = this.mFb;
      GMTrace.o(9915603091456L, 73877);
      return localf;
    }
    finally {}
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9915066220544L, 73873);
    ao localao = ao.bJL();
    if (h.xw().wL())
    {
      com.tencent.mm.plugin.x.a.aGk().a(4, localao);
      h.xz();
      h.xx().fYr.a(1060, localao);
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.jVN, true);
    boolean bool = false;
    h.xz();
    long l = h.xy().xh().As(352276);
    if (System.currentTimeMillis() - l >= 43200000L) {
      bool = true;
    }
    w.i("MicroMsg.SubCoreLuckyMoney", "isTime=" + bool + ", isUpdate=" + paramBoolean);
    if ((paramBoolean) || (bool))
    {
      w.i("MicroMsg.SubCoreLuckyMoney", "get service applist");
      ao.bJL().dP(ab.getContext());
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.mFc);
    com.tencent.mm.sdk.b.a.vgX.b(this.mFe);
    this.mFd = new ah();
    GMTrace.o(9915066220544L, 73873);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(9914932002816L, 73872);
    GMTrace.o(9914932002816L, 73872);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9914797785088L, 73871);
    GMTrace.o(9914797785088L, 73871);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9915200438272L, 73874);
    Object localObject1 = ao.bJL();
    if (h.xw().wL())
    {
      com.tencent.mm.plugin.x.a.aGk().b(4, (com.tencent.mm.pluginsdk.model.app.t)localObject1);
      h.xz();
      h.xx().fYr.b(1060, (com.tencent.mm.ad.e)localObject1);
      ((ao)localObject1).toX = false;
      ((ao)localObject1).toY = false;
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.jVN, true);
    try
    {
      this.mFb = null;
      com.tencent.mm.sdk.b.a.vgX.c(this.mFc);
      com.tencent.mm.sdk.b.a.vgX.c(this.mFe);
      if (this.mFd != null)
      {
        localObject1 = this.mFd;
        com.tencent.mm.sdk.b.a.vgX.c(((ah)localObject1).mKc);
        if (((ah)localObject1).mJZ != null)
        {
          h.xz();
          h.xx().fYr.c(((ah)localObject1).mJZ);
          ((ah)localObject1).mJZ = null;
        }
        if (((ah)localObject1).mKa != null)
        {
          h.xz();
          h.xx().fYr.c(((ah)localObject1).mKa);
          ((ah)localObject1).mKa = null;
        }
      }
      GMTrace.o(9915200438272L, 73874);
      return;
    }
    finally {}
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(9914663567360L, 73870);
    GMTrace.o(9914663567360L, 73870);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */