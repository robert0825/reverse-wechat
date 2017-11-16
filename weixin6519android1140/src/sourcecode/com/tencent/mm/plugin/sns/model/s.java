package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.qa;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfy;
import com.tencent.mm.protocal.c.bgi;
import com.tencent.mm.protocal.c.bgj;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.ca;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int Ob;
  final int eDi;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private long psC;
  private String psD;
  private long psd;
  public int psf;
  public int psg;
  
  public s()
  {
    GMTrace.i(17150609719296L, 127782);
    this.psd = 0L;
    this.psC = 0L;
    this.psD = "";
    this.psf = 0;
    this.psg = 0;
    this.Ob = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bgi();
    ((b.a)localObject).gtG = new bgj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
    ((b.a)localObject).gtE = 718;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    int i;
    if (com.tencent.mm.sdk.platformtools.am.isWifi(ab.getContext())) {
      i = 1;
    }
    for (;;)
    {
      this.eDi = 2;
      bgi localbgi = (bgi)this.fUa.gtC.gtK;
      localbgi.uRZ = i;
      localbgi.uQA = 0L;
      int j = ae.biT().bjC();
      this.psd = ae.bjd().e(0L, j, true);
      localbgi.uRW = this.psd;
      int k = c.a(this.psd, 0L, "@__weixintimtline");
      localbgi.uRX = k;
      this.psC = ae.bjd().e(0L, 1, true);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + this.psC);
      localbgi.uRY = this.psC;
      com.tencent.mm.plugin.sns.storage.k localk = ae.bjh().Iw("@__weixintimtline");
      if (localk == null)
      {
        localObject = "";
        label266:
        this.psD = ((String)localObject);
        if (this.psD == null) {
          this.psD = "";
        }
        localbgi.uQz = this.psD;
        if ((localk != null) && (localk.field_adsession != null)) {
          break label469;
        }
      }
      for (localbgi.uQg = new azp().be(new byte[0]);; localbgi.uQg = new azp().be(localk.field_adsession))
      {
        w.i("MicroMsg.NetSceneSnsPreTimeLine", " This req nextCount: " + j + " min:" + this.psd + " ReqTime:" + localbgi.uRX + " nettype: " + i);
        w.d("MicroMsg.NetSceneSnsPreTimeLine", "minId: %s lastReqTime: %s", new Object[] { i.dt(this.psd), Integer.valueOf(k) });
        GMTrace.o(17150609719296L, 127782);
        return;
        if (com.tencent.mm.sdk.platformtools.am.is3G(ab.getContext()))
        {
          i = 3;
          break;
        }
        if (com.tencent.mm.sdk.platformtools.am.is4G(ab.getContext()))
        {
          i = 4;
          break;
        }
        if (!com.tencent.mm.sdk.platformtools.am.is2G(ab.getContext())) {
          break label512;
        }
        i = 2;
        break;
        localObject = localk.field_md5;
        break label266;
        label469:
        w.d("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", new Object[] { localk.field_adsession });
      }
      label512:
      i = 0;
    }
  }
  
  private void a(bgj parambgj, String paramString)
  {
    GMTrace.i(17150743937024L, 127783);
    ai.a("@__weixintimtline", this.eDi, parambgj.tTQ, paramString);
    this.psd = ((bfh)parambgj.tTQ.getLast()).tXT;
    c.c("@__weixintimtline", ((bfh)parambgj.tTQ.getFirst()).tXT, this.psd, parambgj.uSa);
    parambgj = parambgj.tTQ.iterator();
    while (parambgj.hasNext())
    {
      paramString = (bfh)parambgj.next();
      if (paramString.uQX == 0)
      {
        Object localObject1 = ae.bjd().dU(paramString.tXT);
        if ((localObject1 != null) && (((m)localObject1).blD() != null))
        {
          ??? = ((m)localObject1).blD().uUc.ueW;
          Object localObject2 = ???.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            anu localanu = (anu)((Iterator)localObject2).next();
            if (???.size() <= 1)
            {
              i = 1;
              label182:
              if (localanu == null) {
                break label323;
              }
              localObject3 = i.e(localanu);
              if (i == 0) {
                break label325;
              }
            }
            label323:
            label325:
            for (int i = 1;; i = 0)
            {
              String str = am.dE(ae.getAccSnsPath(), localanu.mmR);
              if ((!FileOp.aZ(str + (String)localObject3)) && (!FileOp.aZ(str + i.l(localanu))) && (!FileOp.aZ(str + i.m(localanu)))) {
                break label330;
              }
              w.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", new Object[] { localanu.mmR });
              break;
              i = 0;
              break label182;
              break;
            }
            label330:
            w.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", new Object[] { localanu.mmR });
            Object localObject3 = new com.tencent.mm.plugin.sns.data.e(localanu);
            ((com.tencent.mm.plugin.sns.data.e)localObject3).pph = i;
            ((com.tencent.mm.plugin.sns.data.e)localObject3).mDZ = localanu.mmR;
            ae.biY().a(localanu, 1, (com.tencent.mm.plugin.sns.data.e)localObject3, an.vAZ);
          }
          if (((m)localObject1).field_type == 15)
          {
            localObject2 = ae.bjb();
            if (localObject1 != null) {
              w.i("MicroMsg.SnsVideoService", "%d add preload video[%s]", new Object[] { Integer.valueOf(localObject2.hashCode()), ((m)localObject1).blY() });
            }
            synchronized (((aq)localObject2).pvX)
            {
              ((aq)localObject2).pvX.addFirst(localObject1);
              try
              {
                localObject1 = ((anu)((m)localObject1).blD().uUc.ueW.get(0)).lPM;
                g.ork.i(14388, new Object[] { Long.valueOf(paramString.tXT), Integer.valueOf(4), localObject1, Integer.valueOf(0) });
              }
              catch (Exception paramString) {}
            }
          }
        }
      }
    }
    ae.bjb().bjH();
    GMTrace.o(17150743937024L, 127783);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(17151146590208L, 127786);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(17151146590208L, 127786);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(17150878154752L, 127784);
    w.i("MicroMsg.NetSceneSnsPreTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bgj)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramq.AZ().tKs != 207) && (paramq.AZ().tKs != 0))
    {
      x.Hm("@__weixintimtline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(17150878154752L, 127784);
      return;
    }
    if (paramArrayOfByte.uQF != null)
    {
      w.d("MicroMsg.NetSceneSnsPreTimeLine", "serverConfig  " + paramArrayOfByte.uQF.uRS + " " + paramArrayOfByte.uQF.uRR);
      paramInt1 = paramArrayOfByte.uQF.uRS;
      com.tencent.mm.plugin.sns.c.a.poV = paramInt1;
      if (paramInt1 <= 0) {
        com.tencent.mm.plugin.sns.c.a.poV = Integer.MAX_VALUE;
      }
      com.tencent.mm.storage.v.vpA = paramArrayOfByte.uQF.uRR;
    }
    this.psf = paramArrayOfByte.uQD;
    this.psg = paramArrayOfByte.uQE;
    w.i("MicroMsg.NetSceneSnsPreTimeLine", "for same md5 count: " + paramArrayOfByte.uQD + " , objCount:  " + paramArrayOfByte.uEP + " cflag : " + paramArrayOfByte.uQE);
    this.Ob = paramArrayOfByte.uEP;
    String str = i.du(0L);
    if (!paramArrayOfByte.tTQ.isEmpty()) {
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "respone size " + paramArrayOfByte.tTQ.size() + " Max " + ((bfh)paramArrayOfByte.tTQ.getFirst()).tXT + " " + i.dt(((bfh)paramArrayOfByte.tTQ.getFirst()).tXT) + "  respone min  " + ((bfh)paramArrayOfByte.tTQ.getLast()).tXT + " " + i.dt(((bfh)paramArrayOfByte.tTQ.getLast()).tXT));
    }
    for (;;)
    {
      this.Ob = paramArrayOfByte.uEP;
      if (!this.psD.equals(paramArrayOfByte.uQz)) {
        break;
      }
      this.psd = ae.bjd().e(0L, this.psf, true);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.psd) });
      x.Hm("@__weixintimtline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(17150878154752L, 127784);
      return;
      w.i("MicroMsg.NetSceneSnsPreTimeLine", " respone is Empty");
    }
    w.d("MicroMsg.NetSceneSnsPreTimeLine", "fp resp list size " + paramArrayOfByte.tTQ.size() + " adsize : " + paramArrayOfByte.uSb);
    ae.bjh().e("@__weixintimtline", paramArrayOfByte.uQz, com.tencent.mm.platformtools.n.a(paramArrayOfByte.uQg));
    paramInt1 = 0;
    while (paramInt1 < paramArrayOfByte.uSc.size())
    {
      Object localObject3 = (ca)paramArrayOfByte.uSc.get(paramInt1);
      localObject1 = com.tencent.mm.platformtools.n.a(((ca)localObject3).tQo);
      localObject2 = com.tencent.mm.platformtools.n.a(((ca)localObject3).tQn.uQf);
      localObject3 = com.tencent.mm.platformtools.n.b(((ca)localObject3).tQn.uQe.uQM);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "skXml " + (String)localObject1);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "adXml " + (String)localObject2);
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "snsXml " + (String)localObject3 + "\r\n");
      paramInt1 += 1;
    }
    a.e(paramArrayOfByte.uSc, paramArrayOfByte.tTQ);
    a.ah(paramArrayOfByte.uSc);
    if (paramArrayOfByte.uSb == 0)
    {
      w.i("MicroMsg.NetSceneSnsPreTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.uSd) });
      a.d(paramArrayOfByte.uSe, paramArrayOfByte.tTQ);
      a.ag(paramArrayOfByte.uSe);
    }
    Object localObject1 = new LinkedList();
    Object localObject2 = paramArrayOfByte.tTQ.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((LinkedList)localObject1).add(Long.valueOf(((bfh)((Iterator)localObject2).next()).tXT));
    }
    localObject2 = new qa();
    ((qa)localObject2).eUI.eUJ = ((LinkedList)localObject1);
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
    if (paramq.AZ().tKs == 207)
    {
      if (paramArrayOfByte.tTQ.isEmpty()) {
        ae.bjd().bmp();
      }
      for (;;)
      {
        x.Hm("@__weixintimtline");
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(17150878154752L, 127784);
        return;
        ae.bjd().Iy(i.du(((bfh)paramArrayOfByte.tTQ.getFirst()).tXT));
        ae.bjd().Ix(i.du(((bfh)paramArrayOfByte.tTQ.getLast()).tXT));
        a(paramArrayOfByte, str);
        a.ai(paramArrayOfByte.tTQ);
      }
    }
    if (paramArrayOfByte.tTQ.isEmpty()) {
      ae.bjd().bmp();
    }
    for (;;)
    {
      x.Hm("@__weixintimtline");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(17150878154752L, 127784);
      return;
      a(paramArrayOfByte, str);
      a.ai(paramArrayOfByte.tTQ);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(17151012372480L, 127785);
    GMTrace.o(17151012372480L, 127785);
    return 718;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */