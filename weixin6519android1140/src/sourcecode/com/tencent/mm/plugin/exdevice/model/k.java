package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.af.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.protocal.c.alv;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.c.fn;
import com.tencent.mm.protocal.c.fo;
import com.tencent.mm.protocal.c.fp;
import com.tencent.mm.protocal.c.fq;
import com.tencent.mm.protocal.c.fr;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  private com.tencent.mm.ad.b kzP;
  private String[] kzQ;
  
  public k(String[] paramArrayOfString, String paramString)
  {
    GMTrace.i(10981291851776L, 81817);
    this.kzP = null;
    this.fXo = null;
    this.kzQ = paramArrayOfString;
    w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, %s, list = %d", new Object[] { paramString, Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new fp();
    ((b.a)localObject).gtG = new fq();
    ((b.a)localObject).gtE = 542;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchsearchharddevice";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzP = ((b.a)localObject).DA();
    localObject = (fp)this.kzP.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i <= 0)
    {
      String str = paramArrayOfString[0];
      if (str != null)
      {
        fo localfo = new fo();
        localfo.tTU = str;
        localLinkedList.add(localfo);
        w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, item = %s", new Object[] { str });
      }
      i += 1;
    }
    ((fp)localObject).tTV = localLinkedList;
    if (!bg.nm(paramString))
    {
      paramArrayOfString = new fn();
      paramArrayOfString.tTT = paramString;
      ((fp)localObject).tTW = paramArrayOfString;
    }
    ((fp)localObject).tTX = 3;
    GMTrace.o(10981291851776L, 81817);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10981694504960L, 81820);
    this.fXo = parame1;
    int i = a(parame, this.kzP, this);
    GMTrace.o(10981694504960L, 81820);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10981426069504L, 81818);
    w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "onGYNetEnd, netId = %d, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((this.kzQ != null) && (this.kzQ.length == 1)) {
      w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "device mac is  = %s", new Object[] { this.kzQ[0] });
    }
    if (paramq == null)
    {
      w.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == rr");
      GMTrace.o(10981426069504L, 81818);
      return;
    }
    if (this.kzP.gtE != paramq.getType())
    {
      w.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "mReqResp.getType(%d) != rr.getType(%d)", new Object[] { Integer.valueOf(this.kzP.gtE), Integer.valueOf(paramq.getType()) });
      GMTrace.o(10981426069504L, 81818);
      return;
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = atJ().tTY.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (fr)paramq.next();
        w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "BatchSearchHardDeviceResp, ret = %d, bind ticket = %s, mac = %s, device name = %s", new Object[] { Integer.valueOf(paramArrayOfByte.tST), paramArrayOfByte.tTZ, paramArrayOfByte.tTU, paramArrayOfByte.jhm });
        if (paramArrayOfByte.tUa == null)
        {
          w.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == item.Contact");
        }
        else
        {
          paramArrayOfByte = paramArrayOfByte.tUa;
          if (paramArrayOfByte == null)
          {
            w.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "unable to parse mod contact");
          }
          else
          {
            String str1 = com.tencent.mm.platformtools.n.a(paramArrayOfByte.ufy);
            String str2 = bg.nl(paramArrayOfByte.uEu);
            if ((bg.nm(str1)) && (bg.nm(str2)))
            {
              w.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
            }
            else
            {
              w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact : %s", new Object[] { str1 });
              at.AR();
              com.tencent.mm.storage.x localx1 = com.tencent.mm.y.c.yK().TE(str1);
              if ((localx1 != null) && (str1.equals(localx1.field_encryptUsername)))
              {
                w.w("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "cat's replace user with stranger");
              }
              else
              {
                com.tencent.mm.storage.x localx2 = new com.tencent.mm.storage.x(str1);
                localx2.ci(paramArrayOfByte.gCC);
                localx2.setType(paramArrayOfByte.ueF & paramArrayOfByte.ueG);
                label466:
                long l;
                if (!bg.nm(str2))
                {
                  localx2.cr(str2);
                  if (localx1 != null) {
                    break label1030;
                  }
                  l = 0L;
                  label474:
                  localx2.fTq = l;
                  localx2.cl(com.tencent.mm.platformtools.n.a(paramArrayOfByte.uxT));
                  localx2.cm(com.tencent.mm.platformtools.n.a(paramArrayOfByte.ufo));
                  localx2.cn(com.tencent.mm.platformtools.n.a(paramArrayOfByte.ufp));
                  localx2.jdMethod_do(paramArrayOfByte.gCx);
                  localx2.dr(paramArrayOfByte.ueL);
                  localx2.ck(com.tencent.mm.platformtools.n.a(paramArrayOfByte.uEo));
                  localx2.ds(paramArrayOfByte.ueP);
                  localx2.dt(paramArrayOfByte.gCB);
                  localx2.cE(RegionCodeDecoder.ai(paramArrayOfByte.gCG, paramArrayOfByte.gCy, paramArrayOfByte.gCz));
                  localx2.cy(paramArrayOfByte.gCA);
                  localx2.dk(paramArrayOfByte.uAv);
                  localx2.cD(paramArrayOfByte.uAw);
                  localx2.setSource(paramArrayOfByte.tQP);
                  localx2.dj(paramArrayOfByte.uAz);
                  localx2.co(paramArrayOfByte.uAy);
                  if (s.gs(paramArrayOfByte.uAx)) {
                    localx2.cC(paramArrayOfByte.uAx);
                  }
                  localx2.dv((int)bg.Pu());
                  localx2.cj(com.tencent.mm.platformtools.n.a(paramArrayOfByte.uDR));
                  localx2.cp(com.tencent.mm.platformtools.n.a(paramArrayOfByte.uDT));
                  localx2.cq(com.tencent.mm.platformtools.n.a(paramArrayOfByte.uDS));
                  localx2.cF(paramArrayOfByte.tRP);
                  localx2.cG(paramArrayOfByte.uEE);
                  if ((localx1 != null) && (!bg.nl(localx1.fju).equals(bg.nl(paramArrayOfByte.uEE))))
                  {
                    com.tencent.mm.ay.c.Kn();
                    com.tencent.mm.ay.c.kH(str1);
                  }
                  at.AR();
                  com.tencent.mm.y.c.yK().TJ(str1);
                  if (!bg.nm(localx2.field_username)) {
                    break label1042;
                  }
                  w.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "dkinit dealModContactExtInfo failed invalid contact");
                  label816:
                  localx2.dm(paramArrayOfByte.uED);
                  if ((paramArrayOfByte.uEz != null) && (paramArrayOfByte.uEz.tQk != null))
                  {
                    localx2.cH(paramArrayOfByte.uEz.tQk.tUw);
                    localx2.cI(paramArrayOfByte.uEz.tQk.tUx);
                    localx2.cJ(paramArrayOfByte.uEz.tQk.tUy);
                  }
                  if (s.gm(str1)) {
                    localx2.uJ();
                  }
                  if (localx2.bSA()) {
                    localx2.uM();
                  }
                  if (bg.nm(str2)) {
                    break label1377;
                  }
                  at.AR();
                  com.tencent.mm.y.c.yK().b(str2, localx2);
                }
                for (;;)
                {
                  if ((localx1 == null) || ((localx1.field_type & 0x800) == (localx2.field_type & 0x800))) {
                    break label1393;
                  }
                  if ((localx2.field_type & 0x800) == 0) {
                    break label1395;
                  }
                  at.AR();
                  com.tencent.mm.y.c.yP().TT(localx2.field_username);
                  break;
                  if ((localx1 == null) || ((int)localx1.fTq <= 0)) {
                    break label466;
                  }
                  localx2.cr(localx1.field_encryptUsername);
                  break label466;
                  label1030:
                  l = (int)localx1.fTq;
                  break label474;
                  label1042:
                  Object localObject1 = localx2.field_username;
                  Object localObject2 = com.tencent.mm.ac.b.a((String)localObject1, paramArrayOfByte);
                  com.tencent.mm.ac.n.Di().a((h)localObject2);
                  localObject2 = paramArrayOfByte.uAB;
                  if ((!localx2.field_username.endsWith("@chatroom")) && (localObject2 != null))
                  {
                    w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsFlag modcontact " + ((bgm)localObject2).gCI + " " + paramArrayOfByte.ufy);
                    w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBg modcontact " + ((bgm)localObject2).gCJ);
                    w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + ((bgm)localObject2).gCK);
                    w.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + ((bgm)localObject2).uSi);
                    if (com.tencent.mm.plugin.sns.b.n.poP != null) {
                      com.tencent.mm.plugin.sns.b.n.poP.a(localx2.field_username, (bgm)localObject2);
                    }
                  }
                  localObject2 = com.tencent.mm.y.q.zE();
                  if ((localObject2 == null) || (((String)localObject2).equals(localObject1))) {
                    break label816;
                  }
                  localObject2 = com.tencent.mm.af.x.FG().iC((String)localObject1);
                  ((d)localObject2).field_username = ((String)localObject1);
                  ((d)localObject2).field_brandList = paramArrayOfByte.gCH;
                  localObject1 = paramArrayOfByte.uAC;
                  if (localObject1 != null)
                  {
                    ((d)localObject2).field_brandFlag = ((oo)localObject1).gCL;
                    ((d)localObject2).field_brandInfo = ((oo)localObject1).gCN;
                    ((d)localObject2).field_brandIconURL = ((oo)localObject1).gCO;
                    ((d)localObject2).field_extInfo = ((oo)localObject1).gCM;
                    ((d)localObject2).field_attrSyncVersion = null;
                    ((d)localObject2).field_incrementUpdateTime = 0L;
                  }
                  if (!com.tencent.mm.af.x.FG().e((d)localObject2)) {
                    com.tencent.mm.af.x.FG().d((d)localObject2);
                  }
                  localx2.dw(((d)localObject2).field_type);
                  break label816;
                  label1377:
                  at.AR();
                  com.tencent.mm.y.c.yK().Q(localx2);
                }
                label1393:
                continue;
                label1395:
                at.AR();
                com.tencent.mm.y.c.yP().TU(localx2.field_username);
              }
            }
          }
        }
      }
    }
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10981426069504L, 81818);
  }
  
  public final fq atJ()
  {
    GMTrace.i(10981828722688L, 81821);
    if ((this.kzP != null) && (this.kzP.gtD.gtK != null))
    {
      fq localfq = (fq)this.kzP.gtD.gtK;
      GMTrace.o(10981828722688L, 81821);
      return localfq;
    }
    GMTrace.o(10981828722688L, 81821);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(10981560287232L, 81819);
    GMTrace.o(10981560287232L, 81819);
    return 542;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */