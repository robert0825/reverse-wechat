package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.favorite.c.c;
import com.tencent.mm.plugin.favorite.c.f;
import com.tencent.mm.protocal.c.ln;
import com.tencent.mm.protocal.c.lo;
import com.tencent.mm.protocal.c.lp;
import com.tencent.mm.protocal.c.tg;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class ad
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  private int lcm;
  public j lcn;
  private boolean lco;
  private boolean lcp;
  HashMap<th, Boolean> lcq;
  
  public ad(j paramj)
  {
    GMTrace.i(6305548861440L, 46980);
    this.lcm = 0;
    this.fUd = null;
    this.lco = true;
    this.lcp = false;
    this.lcq = new HashMap();
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new lo();
    ((b.a)localObject).gtG = new lp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcdn";
    ((b.a)localObject).gtE = 404;
    ((b.a)localObject).gtH = 197;
    ((b.a)localObject).gtI = 1000000197;
    this.fUa = ((b.a)localObject).DA();
    this.lcn = paramj;
    paramj = paramj.field_favProto.ulB.iterator();
    while (paramj.hasNext())
    {
      localObject = (th)paramj.next();
      this.lcq.put(localObject, Boolean.valueOf(false));
    }
    GMTrace.o(6305548861440L, 46980);
  }
  
  private boolean ayr()
  {
    GMTrace.i(6306354167808L, 46986);
    if (this.lcn.field_type == 18)
    {
      Object localObject = com.tencent.mm.plugin.favorite.h.axB().cf(this.lcn.field_localId);
      if ((localObject != null) && (((j)localObject).field_id < 0) && (((j)localObject).field_favProto.version >= 2))
      {
        ((j)localObject).field_favProto.zY(1);
        com.tencent.mm.plugin.favorite.h.axB().a((j)localObject, new String[] { "localId" });
        this.lcn = ((j)localObject);
        localObject = new ad(this.lcn);
        at.wS().a((com.tencent.mm.ad.k)localObject, 0);
        GMTrace.o(6306354167808L, 46986);
        return true;
      }
    }
    GMTrace.o(6306354167808L, 46986);
    return false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6305683079168L, 46981);
    this.fUd = parame1;
    parame1 = this.lcq.keySet().iterator();
    int j = 0;
    Object localObject;
    if (parame1.hasNext())
    {
      localObject = (th)parame1.next();
      if (((Boolean)this.lcq.get(localObject)).booleanValue()) {
        break label669;
      }
    }
    label544:
    label565:
    label660:
    label666:
    label669:
    for (int i = j + 1;; i = j)
    {
      j = i;
      break;
      if (j == 0)
      {
        w.e("MicroMsg.NetSceneCheckCDN", "klem doScene data list null");
        this.lcm = -100;
        GMTrace.o(6305683079168L, 46981);
        return -100;
      }
      parame1 = (lo)this.fUa.gtC.gtK;
      parame1.jhd.clear();
      localObject = this.lcn.field_favProto.ulB;
      int m = 0;
      i = 0;
      int k;
      if (m < ((List)localObject).size())
      {
        th localth = (th)((List)localObject).get(m);
        if (((Boolean)this.lcq.get(localth)).booleanValue()) {
          break label666;
        }
        k = i;
        if (!localth.ukf)
        {
          localln = new ln();
          localln.uck = ((int)localth.ujO);
          localln.uci = localth.ujK;
          localln.ucj = localth.ujM;
          localln.uch = String.valueOf(m);
          localln.ucm = localth.ukb;
          localln.ucl = this.lcn.field_sourceType;
          localln.ucn = 0;
          parame1.jhd.add(localln);
          k = i + 1;
          w.i("MicroMsg.NetSceneCheckCDN", "check CDN, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { localln.uch, localln.ucm, Integer.valueOf(localln.ucl), Integer.valueOf(localln.uck), localln.uci, localln.ucj });
        }
        if (localth.ukh) {
          break label660;
        }
        ln localln = new ln();
        localln.uck = ((int)localth.ujZ);
        localln.uci = localth.ujV;
        localln.ucj = localth.ujX;
        localln.ucm = localth.ukb;
        localln.ucl = this.lcn.field_sourceType;
        localln.uch = (m + "t");
        localln.ucn = 1;
        parame1.jhd.add(localln);
        i = k + 1;
        w.i("MicroMsg.NetSceneCheckCDN", "check CDN thumb, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { localln.uch, localln.ucm, Integer.valueOf(localln.ucl), Integer.valueOf(localln.uck), localln.uci, localln.ucj });
        k = i;
        if (i >= 19) {
          break label565;
        }
      }
      for (;;)
      {
        m += 1;
        break;
        k = i;
        w.i("MicroMsg.NetSceneCheckCDN", "doScene:  usedCount %d, dataSize %d, nextBegIndex %d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m + 1) });
        parame1.jhc = k;
        if (k == 0)
        {
          w.w("MicroMsg.NetSceneCheckCDN", "no more data, must not check cdn!");
          this.lcm = -101;
          GMTrace.o(6305683079168L, 46981);
          return -101;
        }
        i = a(parame, this.fUa, this);
        GMTrace.o(6305683079168L, 46981);
        return i;
        i = k;
        break label544;
      }
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6305951514624L, 46983);
    int i = k.b.gum;
    GMTrace.o(6305951514624L, 46983);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6305817296896L, 46982);
    w.i("MicroMsg.NetSceneCheckCDN", "netId %d errType %d errCode %d localErrCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lcm), paramString });
    int i;
    if (paramInt2 == 0)
    {
      i = paramInt3;
      if (paramInt3 == 0) {}
    }
    else
    {
      if ((paramInt2 == 3) && (this.lcm == -100))
      {
        w.d("MicroMsg.NetSceneCheckCDN", "need not check cdn, add fav now");
        com.tencent.mm.plugin.favorite.h.axB().s(9, this.lcn.field_localId);
        com.tencent.mm.plugin.favorite.h.axr().run();
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(6305817296896L, 46982);
        return;
      }
      if ((paramInt2 != 3) || (this.lcm != -101)) {
        break label819;
      }
      i = 0;
    }
    if ((this.lcm != -101) && (paramInt2 == 0) && (i == 0))
    {
      paramq = ((lp)((b)paramq).gtD.gtK).jhd;
      paramArrayOfByte = this.lcn.field_favProto.ulB;
      paramInt1 = 0;
      Object localObject2;
      if (paramInt1 < paramq.size())
      {
        localObject1 = (tg)paramq.get(paramInt1);
        localObject2 = ((tg)localObject1).uch;
        th localth;
        if (!bg.nm((String)localObject2))
        {
          w.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet status:%d, tmpId %s", new Object[] { Integer.valueOf(((tg)localObject1).jhA), localObject2 });
          if (((tg)localObject1).jhA == 1)
          {
            if (((String)localObject2).endsWith("t")) {
              break label843;
            }
            localth = (th)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
            w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn data exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((tg)localObject1).ujj, ((tg)localObject1).tYF, ((tg)localObject1).uch, ((tg)localObject1).uci, Integer.valueOf(((tg)localObject1).uck), ((tg)localObject1).ucj });
            localth.Ql(((tg)localObject1).tYF);
            localth.Qk(((tg)localObject1).ujj);
            if (!bg.nm(((tg)localObject1).ujk)) {
              localth.Qz(((tg)localObject1).ujk);
            }
            if (bg.nm(localth.ujK))
            {
              w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn exist, local not exist");
              localth.Qr(((tg)localObject1).uci);
              localth.ey(((tg)localObject1).uck);
              localth.Qs(((tg)localObject1).ucj);
              x.a(localth, this.lcn, 1, false);
            }
            if ((!bg.nm(((tg)localObject1).uci)) && (!((tg)localObject1).uci.equals(localth.ujK)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "svrFullMd5 %s, localMd5 %s", new Object[] { ((tg)localObject1).uci, localth.ujK });
              localth.Qr(((tg)localObject1).uci);
            }
            if ((!bg.nm(((tg)localObject1).ucj)) && (!((tg)localObject1).ucj.equals(localth.ujM)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "svrHead256md5 %s, localHead256md5 %s", new Object[] { ((tg)localObject1).ucj, localth.ujM });
              localth.Qs(((tg)localObject1).ucj);
            }
            if ((((tg)localObject1).uck > 0) && (((tg)localObject1).uck != localth.ujO))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((tg)localObject1).uck), Long.valueOf(localth.ujO) });
              localth.ey(((tg)localObject1).uck);
            }
          }
          label681:
          if (((String)localObject2).endsWith("t")) {
            break label1113;
          }
          localth = (th)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
          this.lcq.put(localth, Boolean.valueOf(true));
          label724:
          if ((((tg)localObject1).jhA != 3) && (((tg)localObject1).jhA != -2) && (((tg)localObject1).jhA != -1)) {
            break label1195;
          }
          if (((String)localObject2).endsWith("t")) {
            break label1536;
          }
          localth = (th)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
          if (!bg.nm(localth.ujK)) {
            break label1159;
          }
          w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist, local not exist ", new Object[] { localth.ujK });
        }
        for (;;)
        {
          paramInt1 += 1;
          break;
          label819:
          this.fUd.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(6305817296896L, 46982);
          return;
          label843:
          localth = (th)paramArrayOfByte.get(bg.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn thumb exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((tg)localObject1).ujj, ((tg)localObject1).tYF, ((tg)localObject1).uch, ((tg)localObject1).uci, Integer.valueOf(((tg)localObject1).uck), ((tg)localObject1).ucj });
          localth.Qj(((tg)localObject1).tYF);
          localth.Qi(((tg)localObject1).ujj);
          if (((tg)localObject1).uck <= 0) {
            break label681;
          }
          localth.ez(((tg)localObject1).uck);
          if ((!bg.nm(((tg)localObject1).uci)) && (!((tg)localObject1).uci.equals(localth.ujV)))
          {
            w.w("MicroMsg.NetSceneCheckCDN", "svrThumbMd5 %s, localThumbMd5 %s", new Object[] { ((tg)localObject1).uci, localth.ujV });
            localth.Qw(((tg)localObject1).uci);
          }
          if ((bg.nm(((tg)localObject1).ucj)) || (((tg)localObject1).ucj.equals(localth.ujX))) {
            break label681;
          }
          w.w("MicroMsg.NetSceneCheckCDN", "svrThumbHead256md5 %s, localThumbHead256md5 %s", new Object[] { ((tg)localObject1).ucj, localth.ujX });
          localth.Qx(((tg)localObject1).ucj);
          break label681;
          label1113:
          localth = (th)paramArrayOfByte.get(bg.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          this.lcq.put(localth, Boolean.valueOf(true));
          break label724;
          label1159:
          this.lco = false;
          w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert data md5:%s", new Object[] { localth.ujK });
          x.a(localth, this.lcn, 0, false);
          for (;;)
          {
            label1195:
            if (((tg)localObject1).jhA != 2) {
              break label1635;
            }
            this.lcp = true;
            if (((String)localObject2).endsWith("t")) {
              break label1637;
            }
            w.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist svr upload, dataStatus:%d, CdnUrl:%s, CdnKey:%s", new Object[] { Integer.valueOf(((tg)localObject1).ujl), ((tg)localObject1).ujj, ((tg)localObject1).tYF });
            localObject2 = (th)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
            ((th)localObject2).zS(((tg)localObject1).ujl);
            ((th)localObject2).Ql(((tg)localObject1).tYF);
            ((th)localObject2).Qk(((tg)localObject1).ujj);
            if (!bg.nm(((tg)localObject1).ujk)) {
              ((th)localObject2).Qz(((tg)localObject1).ujk);
            }
            if ((!bg.nm(((tg)localObject1).uci)) && (!((tg)localObject1).uci.equals(((th)localObject2).ujK)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullMd5 %s, localMd5 %s", new Object[] { ((tg)localObject1).uci, ((th)localObject2).ujK });
              ((th)localObject2).Qr(((tg)localObject1).uci);
            }
            if ((!bg.nm(((tg)localObject1).ucj)) && (!((tg)localObject1).ucj.equals(((th)localObject2).ujM)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrHead256md5 %s, localHead256md5 %s", new Object[] { ((tg)localObject1).ucj, ((th)localObject2).ujM });
              ((th)localObject2).Qs(((tg)localObject1).ucj);
            }
            if ((((tg)localObject1).uck <= 0) || (((tg)localObject1).uck == ((th)localObject2).ujO)) {
              break;
            }
            w.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((tg)localObject1).uck), Long.valueOf(((th)localObject2).ujO) });
            ((th)localObject2).ey(((tg)localObject1).uck);
            break;
            label1536:
            localth = (th)paramArrayOfByte.get(bg.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
            if (bg.nm(localth.ujV))
            {
              w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet thumb cdn not exist, local not exist ", new Object[] { localth.ujV });
              break;
            }
            this.lco = false;
            w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert thumb md5:%s", new Object[] { localth.ujV });
            x.a(localth, this.lcn, 0);
          }
          label1635:
          continue;
          label1637:
          w.e("MicroMsg.NetSceneCheckCDN", "klem OnGYNet svr uploading thumb?! should not reach here!!");
        }
      }
      Object localObject1 = this.lcq.keySet().iterator();
      paramInt1 = 0;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (th)((Iterator)localObject1).next();
        if (((Boolean)this.lcq.get(localObject2)).booleanValue()) {
          break label2111;
        }
        paramInt1 += 1;
      }
    }
    label2111:
    for (;;)
    {
      break;
      w.i("MicroMsg.NetSceneCheckCDN", "onGYSceneEnd:  resultCount %d, dataSize %d", new Object[] { Integer.valueOf(paramq.size()), Integer.valueOf(paramArrayOfByte.size()) });
      if (paramInt1 > 0)
      {
        w.w("MicroMsg.NetSceneCheckCDN", "check cdn list not end, continues");
        paramInt1 = a(this.gtW, this.fUd);
        if ((paramInt1 != -100) && (paramInt1 != -101))
        {
          GMTrace.o(6305817296896L, 46982);
          return;
        }
      }
      if (this.lcp)
      {
        w.i("MicroMsg.NetSceneCheckCDN", "klem onGYNet waitServerUpload, send item now");
        this.lcn.field_itemStatus = 12;
        com.tencent.mm.plugin.favorite.h.axB().a(this.lcn, new String[] { "localId" });
        com.tencent.mm.plugin.favorite.h.axr().run();
        this.fUd.a(paramInt2, i, paramString, this);
        GMTrace.o(6305817296896L, 46982);
        return;
      }
      if (this.lco)
      {
        w.v("MicroMsg.NetSceneCheckCDN", "klem onGYNet all data exist, start send item");
        if ((this.lcn.field_type == 18) && (this.lcn.field_id > 0))
        {
          this.lcn.field_itemStatus = 17;
          com.tencent.mm.plugin.favorite.h.axB().a(this.lcn, new String[] { "localId" });
          com.tencent.mm.plugin.favorite.h.axt().run();
        }
        for (;;)
        {
          this.fUd.a(paramInt2, i, paramString, this);
          GMTrace.o(6305817296896L, 46982);
          return;
          if (ayr())
          {
            GMTrace.o(6305817296896L, 46982);
            return;
          }
          this.lcn.field_itemStatus = 9;
          com.tencent.mm.plugin.favorite.h.axB().a(this.lcn, new String[] { "localId" });
          com.tencent.mm.plugin.favorite.h.axr().run();
        }
      }
      if ((this.lcn.field_type == 18) && (this.lcn.field_id > 0)) {}
      for (this.lcn.field_itemStatus = 15;; this.lcn.field_itemStatus = 4)
      {
        com.tencent.mm.plugin.favorite.h.axB().a(this.lcn, new String[] { "localId" });
        com.tencent.mm.plugin.favorite.h.axv().run();
        break;
        if (ayr())
        {
          GMTrace.o(6305817296896L, 46982);
          return;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6306219950080L, 46985);
    GMTrace.o(6306219950080L, 46985);
    return 404;
  }
  
  protected final int vB()
  {
    GMTrace.i(6306085732352L, 46984);
    GMTrace.o(6306085732352L, 46984);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */