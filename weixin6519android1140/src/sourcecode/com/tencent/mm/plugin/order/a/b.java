package com.tencent.mm.plugin.order.a;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.order.model.j;
import com.tencent.mm.protocal.c.asz;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class b
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private bt.a jVN;
  private List<WeakReference<Object>> jwK;
  public ae mHandler;
  com.tencent.mm.plugin.order.model.b nDG;
  private com.tencent.mm.plugin.order.b.b nDH;
  private com.tencent.mm.plugin.order.model.c nDI;
  private bt.a nDJ;
  
  static
  {
    GMTrace.i(6668205162496L, 49682);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("ORDERCOMMONMSGXML_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6668473597952L, 49684);
        String[] arrayOfString = com.tencent.mm.plugin.order.b.b.fTX;
        GMTrace.o(6668473597952L, 49684);
        return arrayOfString;
      }
    });
    com.tencent.mm.wallet_core.a.h("ShowOrdersInfoProcess", a.class);
    GMTrace.o(6668205162496L, 49682);
  }
  
  public b()
  {
    GMTrace.i(6666460332032L, 49669);
    this.mHandler = new ae(Looper.getMainLooper());
    this.nDG = null;
    this.nDI = null;
    this.jwK = new ArrayList();
    this.nDJ = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6668742033408L, 49686);
        paramAnonymousa = n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.SubCoreWalletOrder", "MallOrderNotifyConfXml:" + paramAnonymousa);
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6664849719296L, 49657);
            Object localObject1 = b.this;
            h.xw().wG();
            if (((b)localObject1).nDG == null) {
              ((b)localObject1).nDG = new com.tencent.mm.plugin.order.model.b();
            }
            localObject1 = ((b)localObject1).nDG;
            Object localObject2 = paramAnonymousa;
            if (!bg.nm((String)localObject2))
            {
              localObject2 = bh.q((String)localObject2, "sysmsg");
              if (localObject2 == null)
              {
                GMTrace.o(6664849719296L, 49657);
                return;
              }
              try
              {
                localObject2 = (String)((Map)localObject2).get(".sysmsg.wxpay.transid");
                if (!bg.nm((String)localObject2))
                {
                  w.d("MicroMsg.WalletOrdersManager", "transid " + (String)localObject2);
                  if (!((com.tencent.mm.plugin.order.model.b)localObject1).nEa.contains(localObject2))
                  {
                    ((com.tencent.mm.plugin.order.model.b)localObject1).nEa.add(localObject2);
                    h.xz();
                    h.xy().xh().set(204817, Integer.valueOf(((com.tencent.mm.plugin.order.model.b)localObject1).nEa.size()));
                    w.d("MicroMsg.WalletOrdersManager", "notifyTrans.size() : " + ((com.tencent.mm.plugin.order.model.b)localObject1).nEa.size());
                    ((com.tencent.mm.plugin.order.model.b)localObject1).GH();
                    b.aWE().aic();
                  }
                }
                GMTrace.o(6664849719296L, 49657);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.WalletOrdersManager", "cmdid error");
              }
            }
            GMTrace.o(6664849719296L, 49657);
          }
        });
        GMTrace.o(6668742033408L, 49686);
      }
    };
    this.jVN = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6665118154752L, 49659);
        final String str = n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.SubCoreWalletOrder", "MallPayMsg:" + str);
        b.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6666326114304L, 49668);
            Object localObject1 = b.aWH();
            Object localObject2 = str;
            Object localObject3 = paramAnonymousa.gtM.tPV;
            j localj;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localj = com.tencent.mm.plugin.order.model.c.Ev((String)localObject2);
              if (localj == null)
              {
                w.i("MicroMsg.MallPayMsgManager", "payMsg == null");
                GMTrace.o(6666326114304L, 49668);
                return;
              }
              if ((!TextUtils.isEmpty(localj.nFk)) || (!TextUtils.isEmpty(localj.nFB)) || (!TextUtils.isEmpty(localj.nFA)) || (!TextUtils.isEmpty(localj.eQH)) || (!TextUtils.isEmpty(localj.nFw)) || (!TextUtils.isEmpty(localj.nFx)) || (!TextUtils.isEmpty(localj.nFv)) || (!TextUtils.isEmpty(localj.nFz)) || (!TextUtils.isEmpty(localj.nFy)) || (!TextUtils.isEmpty(localj.nFu))) {
                if ((localj.nFu != null) && (com.tencent.mm.plugin.order.c.c.uE(localj.nFu)))
                {
                  int i = Integer.valueOf(localj.nFu).intValue();
                  if ((i != 2) && (i != 1)) {}
                }
                else
                {
                  if (!TextUtils.isEmpty(localj.nFw)) {
                    break label461;
                  }
                  localj.eQB = ((String)localObject3);
                  w.i("MicroMsg.MallPayMsgManager", "msgid: " + localj.eQB);
                  w.i("MicroMsg.MallPayMsgManager", "msgType: " + localj.nFu);
                  if (((com.tencent.mm.plugin.order.model.c)localObject1).Ex(localj.eQB)) {
                    break label490;
                  }
                  ((com.tencent.mm.plugin.order.model.c)localObject1).jxx.add(localj);
                  ((com.tencent.mm.plugin.order.model.c)localObject1).a(localj, (String)localObject2, "0");
                  label310:
                  ((com.tencent.mm.plugin.order.model.c)localObject1).aWK();
                  localObject1 = b.aWE();
                  if (localj != null)
                  {
                    localObject2 = new asz();
                    if ((TextUtils.isEmpty(localj.nFw)) || (!com.tencent.mm.plugin.order.c.c.uE(localj.nFw))) {
                      break label564;
                    }
                    ((asz)localObject2).nFd = Integer.valueOf(localj.nFw).intValue();
                  }
                }
              }
            }
            for (((asz)localObject2).nFf = Integer.valueOf(localj.nFw).intValue();; ((asz)localObject2).nFf = ((int)(System.currentTimeMillis() / 1000L)))
            {
              ((asz)localObject2).nFi = 100000;
              ((asz)localObject2).nFk = localj.nFk;
              ((asz)localObject2).nFa = localj.eQB;
              ((asz)localObject2).nFe = localj.nFy;
              ((asz)localObject2).uIS = -1;
              ((asz)localObject2).nFl = localj.nFv;
              ((asz)localObject2).nFm = localj.nFy;
              ((asz)localObject2).nFn = localj.eQH;
              ((b)localObject1).aWF();
              GMTrace.o(6666326114304L, 49668);
              return;
              label461:
              localj.eQB = ((String)localObject3 + localj.nFw);
              break;
              label490:
              w.e("MicroMsg.MallPayMsgManager", "msg for id " + localj.eQB + " is exist!!");
              localObject3 = ((com.tencent.mm.plugin.order.model.c)localObject1).Ez(localj.eQB);
              ((com.tencent.mm.plugin.order.model.c)localObject1).Ew(localj.eQB);
              ((com.tencent.mm.plugin.order.model.c)localObject1).jxx.add(localj);
              ((com.tencent.mm.plugin.order.model.c)localObject1).a(localj, (String)localObject2, ((com.tencent.mm.plugin.order.b.a)localObject3).field_isRead);
              break label310;
              label564:
              ((asz)localObject2).nFd = ((int)(System.currentTimeMillis() / 1000L));
            }
          }
        });
        GMTrace.o(6665118154752L, 49659);
      }
    };
    GMTrace.o(6666460332032L, 49669);
  }
  
  public static String aLR()
  {
    GMTrace.i(6667936727040L, 49680);
    if (h.xw().wL())
    {
      String str = com.tencent.mm.plugin.n.b.yU() + "order";
      GMTrace.o(6667936727040L, 49680);
      return str;
    }
    GMTrace.o(6667936727040L, 49680);
    return "";
  }
  
  public static b aWE()
  {
    GMTrace.i(6666594549760L, 49670);
    b localb = (b)p.o(b.class);
    GMTrace.o(6666594549760L, 49670);
    return localb;
  }
  
  public static com.tencent.mm.plugin.order.b.b aWG()
  {
    GMTrace.i(6667668291584L, 49678);
    h.xw().wG();
    if (aWE().nDH == null)
    {
      localObject = aWE();
      h.xz();
      ((b)localObject).nDH = new com.tencent.mm.plugin.order.b.b(h.xy().fYV);
    }
    Object localObject = aWE().nDH;
    GMTrace.o(6667668291584L, 49678);
    return (com.tencent.mm.plugin.order.b.b)localObject;
  }
  
  public static com.tencent.mm.plugin.order.model.c aWH()
  {
    GMTrace.i(6667802509312L, 49679);
    h.xw().wG();
    if (aWE().nDI == null) {
      aWE().nDI = new com.tencent.mm.plugin.order.model.c();
    }
    com.tencent.mm.plugin.order.model.c localc = aWE().nDI;
    GMTrace.o(6667802509312L, 49679);
    return localc;
  }
  
  public final void aWF()
  {
    GMTrace.i(6666728767488L, 49671);
    if (this.jwK == null)
    {
      GMTrace.o(6666728767488L, 49671);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)this.jwK.get(i);
      if (localWeakReference != null) {
        localWeakReference.get();
      }
      i += 1;
    }
    GMTrace.o(6666728767488L, 49671);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6667399856128L, 49676);
    this.nDG = null;
    this.nDI = null;
    GMTrace.o(6667399856128L, 49676);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6667265638400L, 49675);
    GMTrace.o(6667265638400L, 49675);
  }
  
  public final void aic()
  {
    GMTrace.i(6666862985216L, 49672);
    if (this.jwK == null)
    {
      GMTrace.o(6666862985216L, 49672);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)this.jwK.get(i);
      if (localWeakReference != null) {
        localWeakReference.get();
      }
      i += 1;
    }
    GMTrace.o(6666862985216L, 49672);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6667131420672L, 49674);
    GMTrace.o(6667131420672L, 49674);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6667534073856L, 49677);
    GMTrace.o(6667534073856L, 49677);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6666997202944L, 49673);
    HashMap localHashMap = fIv;
    GMTrace.o(6666997202944L, 49673);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */