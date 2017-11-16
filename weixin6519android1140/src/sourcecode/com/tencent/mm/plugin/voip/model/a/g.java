package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.voip.b.a;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.p;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bpk;
import com.tencent.mm.protocal.c.bpl;
import com.tencent.mm.protocal.c.bpr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends n<bpk, bpl>
{
  public g(List<String> paramList, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(5293010321408L, 39436);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bpk();
    ((b.a)localObject1).gtG = new bpl();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/voipinvite";
    ((b.a)localObject1).gtE = 170;
    ((b.a)localObject1).gtH = 63;
    ((b.a)localObject1).gtI = 1000000063;
    this.fUa = ((b.a)localObject1).DA();
    localObject1 = (bpk)this.fUa.gtC.gtK;
    Object localObject2 = new LinkedList();
    paramInt2 = 0;
    while (paramInt2 < paramList.size())
    {
      ((LinkedList)localObject2).add(new azq().Rq((String)paramList.get(paramInt2)));
      paramInt2 += 1;
    }
    ((bpk)localObject1).uKB = q.zE();
    ((bpk)localObject1).uZc = ((LinkedList)localObject2);
    ((bpk)localObject1).uZb = ((LinkedList)localObject2).size();
    ((bpk)localObject1).udE = paramInt1;
    ((bpk)localObject1).uSE = 0;
    ((bpk)localObject1).uYQ = paramInt3;
    ((bpk)localObject1).uKf = paramInt4;
    paramList = new bpr();
    paramList.jib = 2;
    localObject2 = new azp();
    ((azp)localObject2).be(paramArrayOfByte1);
    paramList.tTe = ((azp)localObject2);
    ((bpk)localObject1).uXS = paramList;
    paramList = new bpr();
    paramList.jib = 3;
    paramArrayOfByte1 = new azp();
    paramArrayOfByte1.be(paramArrayOfByte2);
    paramList.tTe = paramArrayOfByte1;
    ((bpk)localObject1).uXT = paramList;
    ((bpk)localObject1).uXW = System.currentTimeMillis();
    GMTrace.o(5293010321408L, 39436);
  }
  
  public final com.tencent.mm.ad.e bvd()
  {
    GMTrace.i(5293278756864L, 39438);
    com.tencent.mm.ad.e local1 = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(5293815627776L, 39442);
        a.dV("MicroMsg.NetSceneVoipInvite", "Invite response:" + paramAnonymousInt1 + " errCode:" + paramAnonymousInt2 + " status:" + g.this.qFK.mStatus);
        if (g.this.qFK.mStatus != 2)
        {
          a.dU("MicroMsg.NetSceneVoipInvite", " invite response with error status:" + g.this.qFK.mStatus + " should:2");
          GMTrace.o(5293815627776L, 39442);
          return;
        }
        bpl localbpl = (bpl)g.this.bvh();
        g.this.qFK.qFr.qJU = localbpl.uYj;
        g.this.qFK.qFr.qJV = localbpl.uYk;
        g.this.qFK.qFr.qJW = localbpl.uYl;
        g.this.qFK.qFr.qJX = localbpl.uYm;
        g.this.qFK.qFr.qJZ = localbpl.uYo;
        g.this.qFK.qFr.qJY = localbpl.uYt;
        g.this.qFK.qFr.qKy = localbpl.uZf;
        g.this.qFK.qFr.qJz = localbpl.uYb;
        g.this.qFK.qFr.qKa = localbpl.uYv;
        g.this.qFK.wk(localbpl.uXZ);
        g.this.qFK.qFr.qJA = localbpl.uYc;
        a.dV("MicroMsg.NetSceneVoipInvite", "setSvrConfig onInviteResp: audioTsdfBeyond3G = " + g.this.qFK.qFr.qJU + ",audioTsdEdge = " + g.this.qFK.qFr.qJV + ",passthroughQosAlgorithm = " + g.this.qFK.qFr.qJW + ",fastPlayRepair = " + g.this.qFK.qFr.qJX + ", audioDtx = " + g.this.qFK.qFr.qJZ + ",switchtcpPktCnt = " + g.this.qFK.qFr.qJy + ",SvrCfgListV = " + g.this.qFK.qFr.qJY + ", setMaxBRForRelay=" + g.this.qFK.qFr.qKa + ",EnableDataAccept = " + g.this.qFK.qFr.qKy + ",WifiScanInterval = " + g.this.qFK.qFr.qJA);
        g.this.qFK.qFr.qKb = localbpl.uYs;
        a.dV("MicroMsg.NetSceneVoipInvite", "inviteResp AudioAecMode5 = " + g.this.qFK.qFr.qKb);
        int i = a.getNetType(ab.getContext());
        if (paramAnonymousInt1 != 0)
        {
          if (paramAnonymousInt1 == 4)
          {
            a.dV("MicroMsg.NetSceneVoipInvite", "RoomId in InviteResp: " + localbpl.uhU + "," + localbpl.uhV);
            switch (paramAnonymousInt2)
            {
            default: 
              g.this.qFK.qFr.qKT.qGe = 12;
              g.this.qFK.qFr.qKT.qGq = 99;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(5), Integer.valueOf(i) });
            }
            for (;;)
            {
              g.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
              g.this.qFK.r(1, paramAnonymousInt2, paramAnonymousString);
              GMTrace.o(5293815627776L, 39442);
              return;
              g.this.qFK.qER = true;
              g.this.qFK.qET = false;
              g.this.qFK.qES = false;
              g.this.qFK.qFr.qJT = 0;
              g.this.qFK.qFr.qJS = 0;
              g.this.qFK.dB(3);
              g.this.qFK.qFr.mjF = localbpl.uhU;
              g.this.qFK.qFr.mjG = localbpl.uhV;
              g.this.qFK.qFr.mjN = localbpl.uKq;
              paramAnonymousString = (bpk)((g)paramAnonymousk).bvi();
              g.this.qFK.qFs.wp(paramAnonymousString.uSE);
              GMTrace.o(5293815627776L, 39442);
              return;
              g.this.qFK.qFr.qKT.qGe = 13;
              g.this.qFK.qFr.qKT.qGq = 2;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(2), Integer.valueOf(i) });
              continue;
              g.this.qFK.qFr.qKT.qGe = 13;
              g.this.qFK.qFr.qKT.qGq = 9;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(2), Integer.valueOf(i) });
              continue;
              g.this.qFK.qFr.qKT.qGe = 12;
              g.this.qFK.qFr.qKT.qGq = 12;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(8), Integer.valueOf(i) });
              continue;
              g.this.qFK.qFr.qKT.qGe = 12;
              g.this.qFK.qFr.qKT.qGq = 1;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(3), Integer.valueOf(i) });
              continue;
              g.this.qFK.qFr.qKT.qGe = 12;
              g.this.qFK.qFr.qKT.qGq = 10;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(7), Integer.valueOf(i) });
              continue;
              g.this.qFK.qFr.qKT.qGe = 13;
              g.this.qFK.qFr.qKT.qGq = 11;
              com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(4), Integer.valueOf(i) });
              continue;
              w.i("MicroMsg.NetSceneVoipInvite", "invite fail cuz server unavailable! reInvtieInterval is : " + localbpl.uZg + " seconds!");
              d.btG().qIl = System.currentTimeMillis();
              if (localbpl.uZg != 0) {
                d.btG().qIm = (localbpl.uZg * 1000);
              } else {
                d.btG().qIm = 30000L;
              }
            }
          }
          g.this.qFK.qFr.qKT.qGe = 12;
          g.this.qFK.qFr.qKT.qGf = paramAnonymousInt2;
          g.this.qFK.qFr.qKT.qGq = 99;
          com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(9), Integer.valueOf(i) });
          g.this.qFK.r(1, 56532, "");
          GMTrace.o(5293815627776L, 39442);
          return;
        }
        g.this.qFK.dB(4);
        g.this.qFK.qFr.mjF = localbpl.uhU;
        g.this.qFK.qFr.mjG = localbpl.uhV;
        g.this.qFK.qFr.mjN = localbpl.uKq;
        com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().buK()), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(1), Integer.valueOf(i) });
        if (localbpl.uZe > 0)
        {
          paramAnonymousString = g.this.qFK;
          long l = localbpl.uZe * 1000;
          paramAnonymousString.qFD.z(l, l);
        }
        d.btG().buT();
        a.dV("MicroMsg.NetSceneVoipInvite", "invite ok, roomid =" + g.this.qFK.qFr.mjF + ",memberid = " + g.this.qFK.qFr.mjN + "VoipSyncInterval = " + localbpl.uZe);
        g.this.qFK.qFs.bup();
        GMTrace.o(5293815627776L, 39442);
      }
    };
    GMTrace.o(5293278756864L, 39438);
    return local1;
  }
  
  public final int getType()
  {
    GMTrace.i(5293144539136L, 39437);
    GMTrace.o(5293144539136L, 39437);
    return 170;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */