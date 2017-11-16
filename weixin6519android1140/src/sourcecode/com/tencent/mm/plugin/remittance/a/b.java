package com.tencent.mm.plugin.remittance.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.mh;
import com.tencent.mm.g.a.sx;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.remittance.c.r;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class b
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private j.a gqa;
  private bt.a kAP;
  private r oiQ;
  public com.tencent.mm.plugin.remittance.b.b oiR;
  private com.tencent.mm.plugin.remittance.b.d oiS;
  private com.tencent.mm.sdk.b.c<mh> oiT;
  private com.tencent.mm.sdk.b.c<sx> oiU;
  
  static
  {
    GMTrace.i(10838215753728L, 80751);
    com.tencent.mm.wallet_core.a.h("RemittanceProcess", a.class);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("DelayTransferRecord".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(10839960584192L, 80764);
        String[] arrayOfString = com.tencent.mm.plugin.remittance.b.b.fTX;
        GMTrace.o(10839960584192L, 80764);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("RemittanceRecord".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(18055371423744L, 134523);
        String[] arrayOfString = com.tencent.mm.plugin.remittance.b.d.fTX;
        GMTrace.o(18055371423744L, 134523);
        return arrayOfString;
      }
    });
    GMTrace.o(10838215753728L, 80751);
  }
  
  public b()
  {
    GMTrace.i(10837007794176L, 80742);
    this.oiQ = null;
    this.oiR = null;
    this.oiS = null;
    this.gqa = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(20888573444096L, 155632);
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0) && ("event_updated".equals(paramAnonymousString)))
        {
          paramAnonymousString = com.tencent.mm.y.c.c.Ct().er("100324");
          if ((!paramAnonymousString.isValid()) || (!"1".equals(paramAnonymousString.bSg().get("open")))) {
            break label163;
          }
        }
        label163:
        for (int i = 1;; i = 0)
        {
          paramAnonymousString = com.tencent.mm.kernel.h.xy().xh();
          paramAnonymousString.a(w.a.vzV, Integer.valueOf(i));
          int j = ((Integer)paramAnonymousString.get(w.a.vzW, Integer.valueOf(0))).intValue();
          w.i("MicroMsg.SubCoreRemittance", "receive abtest open bank remit: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (j == 0)
          {
            com.tencent.mm.s.c.vK().b(w.a.vzR, true);
            paramAnonymousString.a(w.a.vzW, Integer.valueOf(1));
          }
          GMTrace.o(20888573444096L, 155632);
          return;
        }
      }
    };
    this.kAP = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(20888976097280L, 155635);
        w.i("MicroMsg.SubCoreRemittance", "hy: received AddMsg");
        paramAnonymousa = paramAnonymousa.gtM;
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreRemittance", "recieve a null msg");
          GMTrace.o(20888976097280L, 155635);
          return;
        }
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.tPY);
        if (bg.nm(paramAnonymousa))
        {
          w.e("MicroMsg.SubCoreRemittance", "msg illegal,content is null");
          GMTrace.o(20888976097280L, 155635);
          return;
        }
        paramAnonymousa = bh.q(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreRemittance", "Resolve msg error");
          GMTrace.o(20888976097280L, 155635);
          return;
        }
        Object localObject1 = (String)paramAnonymousa.get(".sysmsg.paymsg.PayMsgType");
        Object localObject2;
        if ("15".equals(localObject1))
        {
          localObject1 = URLDecoder.decode((String)paramAnonymousa.get(".sysmsg.paymsg.appmsgcontent"));
          if (TextUtils.isEmpty((CharSequence)localObject1))
          {
            w.e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          localObject2 = bh.q((String)localObject1, "msg");
          if (localObject2 == null)
          {
            w.e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.transcationid");
          if (bg.nm((String)localObject2))
          {
            w.e("MicroMsg.SubCoreRemittance", "paymsgid is null");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          if (b.this.bbi().FC((String)localObject2))
          {
            w.e("MicroMsg.SubCoreRemittance", "it is a duplicate msg");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          paramAnonymousa = (String)paramAnonymousa.get(".sysmsg.paymsg.tousername");
          if ((bg.nm((String)localObject1)) || (bg.nm(paramAnonymousa)))
          {
            w.e("MicroMsg.SubCoreRemittance", "onRecieveMsg get a illegal msg,which content or toUserName is null");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          b.this.bbi().O((String)localObject2, (String)localObject1, paramAnonymousa);
          GMTrace.o(20888976097280L, 155635);
          return;
        }
        if ("22".equals(localObject1))
        {
          localObject1 = (String)paramAnonymousa.get(".sysmsg.paymsg.tousername");
          String str1 = (String)paramAnonymousa.get(".sysmsg.paymsg.fromusername");
          try
          {
            localObject2 = URLDecoder.decode((String)paramAnonymousa.get(".sysmsg.paymsg.appmsgcontent"), "UTF-8");
            if (bg.nm((String)localObject2))
            {
              w.e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
              GMTrace.o(20888976097280L, 155635);
              return;
            }
          }
          catch (UnsupportedEncodingException paramAnonymousa)
          {
            w.printErrStackTrace("MicroMsg.SubCoreRemittance", paramAnonymousa, "", new Object[0]);
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          paramAnonymousa = bh.q((String)localObject2, "msg");
          if (paramAnonymousa == null)
          {
            w.e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          String str2 = (String)paramAnonymousa.get(".msg.appmsg.wcpayinfo.transferid");
          w.d("MicroMsg.SubCoreRemittance", "fromusername: %s, tousername: %s, transferId: %s, paysubtype: %d", new Object[] { str1, localObject1, str2, Integer.valueOf(bg.getInt((String)paramAnonymousa.get(".msg.appmsg.wcpayinfo.paysubtype"), -1)) });
          paramAnonymousa = null;
          try
          {
            b.bbf();
            localObject1 = b.bbg().FA(str2);
            paramAnonymousa = (d.a)localObject1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.SubCoreRemittance", localException, "", new Object[0]);
            }
            localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramAnonymousa.field_msgId);
            if (localau.field_msgId > 0L) {
              break label639;
            }
            w.i("MicroMsg.SubCoreRemittance", "has delete msg");
            b.bbf();
            b.bbg().a(paramAnonymousa, new String[0]);
            GMTrace.o(20888976097280L, 155635);
            return;
            w.i("MicroMsg.SubCoreRemittance", "update msg: %s", new Object[] { Long.valueOf(localau.field_msgId) });
            localau.setContent((String)localObject2);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(localau.field_msgId, localau);
            GMTrace.o(20888976097280L, 155635);
            return;
          }
          if (paramAnonymousa == null)
          {
            w.i("MicroMsg.SubCoreRemittance", "empty record");
            GMTrace.o(20888976097280L, 155635);
            return;
          }
        }
        au localau;
        label639:
        if ("33".equals(localau))
        {
          int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.opentransferbankcard"), 0);
          paramAnonymousa = com.tencent.mm.kernel.h.xy().xh();
          paramAnonymousa.a(w.a.vzV, Integer.valueOf(i));
          int j = ((Integer)paramAnonymousa.get(w.a.vzW, Integer.valueOf(0))).intValue();
          w.i("MicroMsg.SubCoreRemittance", "receive open bank remit: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if (j == 0)
          {
            com.tencent.mm.s.c.vK().b(w.a.vzR, true);
            paramAnonymousa.a(w.a.vzW, Integer.valueOf(1));
          }
        }
        GMTrace.o(20888976097280L, 155635);
      }
    };
    this.oiT = new com.tencent.mm.sdk.b.c() {};
    this.oiU = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(10837007794176L, 80742);
  }
  
  public static b bbf()
  {
    GMTrace.i(10837142011904L, 80743);
    b localb = (b)p.o(b.class);
    GMTrace.o(10837142011904L, 80743);
    return localb;
  }
  
  public static com.tencent.mm.plugin.remittance.b.b bbg()
  {
    GMTrace.i(10837276229632L, 80744);
    if (bbf().oiR == null)
    {
      localObject = bbf();
      com.tencent.mm.kernel.h.xz();
      ((b)localObject).oiR = new com.tencent.mm.plugin.remittance.b.b(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bbf().oiR;
    GMTrace.o(10837276229632L, 80744);
    return (com.tencent.mm.plugin.remittance.b.b)localObject;
  }
  
  public static com.tencent.mm.plugin.remittance.b.d bbh()
  {
    GMTrace.i(18055102988288L, 134521);
    if (bbf().oiS == null)
    {
      localObject = bbf();
      com.tencent.mm.kernel.h.xz();
      ((b)localObject).oiS = new com.tencent.mm.plugin.remittance.b.d(com.tencent.mm.kernel.h.xy().fYV);
    }
    Object localObject = bbf().oiS;
    GMTrace.o(18055102988288L, 134521);
    return (com.tencent.mm.plugin.remittance.b.d)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(10837813100544L, 80748);
    r localr;
    if (this.oiQ != null) {
      localr = this.oiQ;
    }
    synchronized (localr.lock)
    {
      localr.ona = new HashSet();
      localr.onb.clear();
      com.tencent.mm.y.c.c.Ct().c(this.gqa);
      ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.kAP, true);
      com.tencent.mm.sdk.b.a.vgX.a(this.oiT);
      com.tencent.mm.sdk.b.a.vgX.a(this.oiU);
      GMTrace.o(10837813100544L, 80748);
      return;
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(10837678882816L, 80747);
    GMTrace.o(10837678882816L, 80747);
  }
  
  public final r bbi()
  {
    GMTrace.i(10838081536000L, 80750);
    if (this.oiQ == null) {
      this.oiQ = new r();
    }
    r localr = this.oiQ;
    GMTrace.o(10838081536000L, 80750);
    return localr;
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(10837544665088L, 80746);
    GMTrace.o(10837544665088L, 80746);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(10837947318272L, 80749);
    com.tencent.mm.y.c.c.Ct().j(this.gqa);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.kAP, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.oiT);
    com.tencent.mm.sdk.b.a.vgX.c(this.oiU);
    GMTrace.o(10837947318272L, 80749);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(10837410447360L, 80745);
    HashMap localHashMap = fIv;
    GMTrace.o(10837410447360L, 80745);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */