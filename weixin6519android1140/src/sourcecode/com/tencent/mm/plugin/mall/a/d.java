package com.tencent.mm.plugin.mall.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.p;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class d
  implements com.tencent.mm.ad.e, aq
{
  public ae mHandler;
  ConcurrentHashMap<Integer, s> mRl;
  private boolean mRm;
  private bt.a mRn;
  private bt.a mRo;
  
  public d()
  {
    GMTrace.i(7987833864192L, 59514);
    this.mRl = new ConcurrentHashMap();
    this.mHandler = new ae(Looper.getMainLooper());
    this.mRm = false;
    this.mRn = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(7990115565568L, 59531);
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.SubCoreMall", "WalletNotifyConfXml:" + paramAnonymousa);
        d.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7989310259200L, 59525);
            com.tencent.mm.plugin.wallet_core.model.mall.c localc = com.tencent.mm.plugin.wallet_core.model.mall.c.bzi();
            Object localObject = paramAnonymousa;
            MallNews localMallNews = com.tencent.mm.plugin.wallet_core.model.mall.c.Ko((String)localObject);
            if (localMallNews != null)
            {
              if (!"2".equals(localMallNews.type))
              {
                localc.rkd.put(localMallNews.rjT, localMallNews);
                w.i("MicroMsg.MallNewsManager", "onRecieveMsg : " + (String)localObject);
                localc.aXr();
                if (com.tencent.mm.plugin.wallet_core.model.mall.c.a(localMallNews))
                {
                  w.i("MicroMsg.MallNewsManager", "set OutOfDateRedDot");
                  GMTrace.o(7989310259200L, 59525);
                  return;
                }
                if (localMallNews.showType == 0)
                {
                  w.d("MicroMsg.MallNewsManager", "showType New");
                  com.tencent.mm.s.c.vK().k(262156, true);
                  h.xz();
                  h.xy().xh().a(w.a.vyy, Long.valueOf(System.currentTimeMillis()));
                }
                for (;;)
                {
                  com.tencent.mm.plugin.wallet_core.model.mall.c.bzk();
                  GMTrace.o(7989310259200L, 59525);
                  return;
                  if (localMallNews.showType == 1)
                  {
                    w.d("MicroMsg.MallNewsManager", "showType Dot");
                    com.tencent.mm.s.c.vK().l(262156, true);
                    h.xz();
                    h.xy().xh().a(w.a.vyy, Long.valueOf(System.currentTimeMillis()));
                  }
                }
              }
              w.d("MicroMsg.MallNewsManager", "removeNews : " + localMallNews);
              localObject = (MallNews)localc.rkd.get(localMallNews.rjT);
              if ((localObject != null) && (((MallNews)localObject).qrG.equals(localMallNews.qrG)) && (((MallNews)localObject).eEU.equals(localMallNews.eEU)))
              {
                w.i("MicroMsg.MallNewsManager", "onRecieveMsg remove : " + localMallNews.rjT);
                localc.rkd.remove(localMallNews.rjT);
                GMTrace.o(7989310259200L, 59525);
                return;
              }
              w.i("MicroMsg.MallNewsManager", "onRecieveMsg cancel not found!");
            }
            GMTrace.o(7989310259200L, 59525);
          }
        });
        GMTrace.o(7990115565568L, 59531);
      }
    };
    this.mRo = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(18437086642176L, 137367);
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        w.i("MicroMsg.SubCoreMall", "receive pay msg: %s", new Object[] { paramAnonymousa });
        d.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18437355077632L, 137369);
            com.tencent.mm.plugin.wallet_core.model.mall.c.bzi();
            com.tencent.mm.plugin.wallet_core.model.mall.c.Kl(paramAnonymousa);
            GMTrace.o(18437355077632L, 137369);
          }
        });
        GMTrace.o(18437086642176L, 137367);
      }
    };
    GMTrace.o(7987833864192L, 59514);
  }
  
  public static d aMY()
  {
    GMTrace.i(7987968081920L, 59515);
    d locald = (d)p.o(d.class);
    GMTrace.o(7987968081920L, 59515);
    return locald;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7989041823744L, 59523);
    if ((paramInt2 == 0) && (paramInt1 == 0) && (!this.mRm) && (q.zR()))
    {
      this.mRm = true;
      com.tencent.mm.plugin.wallet_core.model.mall.b.wR(com.tencent.mm.plugin.wallet_core.model.mall.b.rjQ);
    }
    GMTrace.o(7989041823744L, 59523);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7988639170560L, 59520);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("mallactivity", this.mRn, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("paymsg", this.mRo, true);
    com.tencent.mm.plugin.wallet_core.model.mall.c.bzi().PY();
    com.tencent.mm.plugin.wallet_core.model.mall.d.bzm().PY();
    if ((q.zR()) && (q.zN())) {
      com.tencent.mm.plugin.wallet_core.model.mall.b.wR(com.tencent.mm.plugin.wallet_core.model.mall.b.rjQ);
    }
    for (;;)
    {
      h.xz();
      h.xx().fYr.a(302, this);
      GMTrace.o(7988639170560L, 59520);
      return;
      com.tencent.mm.plugin.wallet_core.model.mall.b.wR(com.tencent.mm.plugin.wallet_core.model.mall.b.rjP);
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7988773388288L, 59521);
    GMTrace.o(7988773388288L, 59521);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7988504952832L, 59519);
    GMTrace.o(7988504952832L, 59519);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7988907606016L, 59522);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("mallactivity", this.mRn, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("paymsg", this.mRo, true);
    h.xz();
    h.xx().fYr.b(302, this);
    GMTrace.o(7988907606016L, 59522);
  }
  
  public final s qj(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    GMTrace.i(7988102299648L, 59516);
    Object localObject3;
    if (!this.mRl.contains(Integer.valueOf(paramInt)))
    {
      localObject3 = com.tencent.mm.plugin.wallet_core.model.n.byC();
      String str = "select * from WalletFunciontList where wallet_region = " + paramInt;
      localObject3 = ((com.tencent.mm.plugin.wallet_core.d.e)localObject3).fTZ.a(str, null, 2);
      w.i("MicroMsg.WalletFunctionListStg", "getWalletFunciontListInfo " + str);
      if (localObject3 != null) {
        break label146;
      }
    }
    for (;;)
    {
      if (localObject1 != null) {
        this.mRl.put(Integer.valueOf(paramInt), localObject1);
      }
      localObject1 = (s)this.mRl.get(Integer.valueOf(paramInt));
      if (localObject1 != null) {
        break;
      }
      localObject1 = new s();
      GMTrace.o(7988102299648L, 59516);
      return (s)localObject1;
      label146:
      localObject1 = localObject2;
      if (((Cursor)localObject3).moveToNext())
      {
        localObject1 = new s();
        ((s)localObject1).b((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(7988102299648L, 59516);
    return (s)localObject1;
  }
  
  public final ArrayList<MallFunction> qk(int paramInt)
  {
    GMTrace.i(7988236517376L, 59517);
    ArrayList localArrayList = qj(paramInt).mRe;
    GMTrace.o(7988236517376L, 59517);
    return localArrayList;
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7988370735104L, 59518);
    GMTrace.o(7988370735104L, 59518);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mall\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */