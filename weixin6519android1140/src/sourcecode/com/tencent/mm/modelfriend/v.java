package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.l.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abn;
import com.tencent.mm.protocal.c.abo;
import com.tencent.mm.protocal.c.ami;
import com.tencent.mm.protocal.c.amj;
import com.tencent.mm.protocal.c.aoi;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.protocal.c.sl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private List<String> gCU;
  private List<String> gDB;
  
  public v()
  {
    GMTrace.i(4440056659968L, 33081);
    this.fUd = null;
    HN();
    abn localabn = (abn)this.fUa.gtC.gtK;
    localabn.ugH = "";
    localabn.usi = null;
    localabn.ush = 0;
    localabn.usg = null;
    localabn.usf = 0;
    localabn.lQF = 0;
    localabn.tOG = 1;
    GMTrace.o(4440056659968L, 33081);
  }
  
  public v(List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(4440190877696L, 33082);
    this.fUd = null;
    HN();
    if (((paramList1 == null) || (paramList1.size() == 0)) && ((paramList2 == null) || (paramList2.size() == 0)))
    {
      GMTrace.o(4440190877696L, 33082);
      return;
    }
    this.gCU = paramList1;
    this.gDB = paramList2;
    paramList1 = (abn)this.fUa.gtC.gtK;
    paramList1.ugH = "";
    paramList1.lQF = 2;
    paramList1.tOG = 1;
    GMTrace.o(4440190877696L, 33082);
  }
  
  private void HN()
  {
    GMTrace.i(4440325095424L, 33083);
    b.a locala = new b.a();
    locala.gtF = new abn();
    locala.gtG = new abo();
    locala.uri = "/cgi-bin/micromsg-bin/getmfriend";
    locala.gtE = 142;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(4440325095424L, 33083);
  }
  
  private static void a(b paramb, amj paramamj)
  {
    GMTrace.i(4440996184064L, 33088);
    paramb.gCw = paramamj.gCw;
    paramb.gCx = paramamj.gCx;
    paramb.gCy = paramamj.gCy;
    paramb.gCz = paramamj.gCz;
    paramb.gCA = paramamj.gCA;
    paramb.gCB = paramamj.gCB;
    paramb.gCC = paramamj.gCC;
    paramb.gCD = paramamj.gCD;
    paramb.gCF = paramamj.gCF;
    paramb.gCE = paramamj.gCE;
    paramb.gCG = paramamj.gCG;
    paramb.gCH = paramamj.gCH;
    bgm localbgm = paramamj.uAB;
    if (localbgm != null)
    {
      paramb.gCI = localbgm.gCI;
      paramb.gCJ = localbgm.gCJ;
      paramb.gCK = localbgm.gCK;
    }
    paramamj = paramamj.uAC;
    if (paramamj != null)
    {
      paramb.gCL = paramamj.gCL;
      paramb.gCM = paramamj.gCM;
      paramb.gCN = paramamj.gCN;
      paramb.gCO = paramamj.gCO;
    }
    GMTrace.o(4440996184064L, 33088);
  }
  
  public final void HO()
  {
    GMTrace.i(4440459313152L, 33084);
    abn localabn = (abn)this.fUa.gtC.gtK;
    at.AR();
    localabn.ugH = ((String)com.tencent.mm.y.c.xh().get(65828, null));
    localabn.lQF = 1;
    GMTrace.o(4440459313152L, 33084);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4440593530880L, 33085);
    this.fUd = parame1;
    parame1 = (abn)this.fUa.gtC.gtK;
    if (parame1.lQF == 2)
    {
      if (((this.gCU == null) || (this.gCU.size() == 0)) && ((this.gDB == null) || (this.gDB.size() == 0)))
      {
        w.e("MicroMsg.NetSceneGetMFriend", "doScene failed, mobile list and email list empty.");
        GMTrace.o(4440593530880L, 33085);
        return -1;
      }
      LinkedList localLinkedList;
      Iterator localIterator;
      String str;
      Object localObject;
      if ((this.gCU != null) && (this.gCU.size() > 0))
      {
        w.d("MicroMsg.NetSceneGetMFriend", "doScene get mobile list size:%d", new Object[] { Integer.valueOf(this.gCU.size()) });
        localLinkedList = new LinkedList();
        localIterator = this.gCU.iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          localObject = new aoi();
          ((aoi)localObject).v = str;
          localLinkedList.add(localObject);
        }
        parame1.usg = localLinkedList;
        parame1.usf = localLinkedList.size();
      }
      if ((this.gDB != null) && (this.gDB.size() > 0))
      {
        w.d("MicroMsg.NetSceneGetMFriend", "doScene get email list size:%d", new Object[] { Integer.valueOf(this.gDB.size()) });
        localLinkedList = new LinkedList();
        localIterator = this.gDB.iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          localObject = new ami();
          ((ami)localObject).v = str;
          localLinkedList.add(localObject);
        }
        parame1.usi = localLinkedList;
        parame1.ush = localLinkedList.size();
      }
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(4440593530880L, 33085);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4440861966336L, 33087);
    abo localabo = (abo)this.fUa.gtD.gtK;
    abn localabn = (abn)this.fUa.gtC.gtK;
    if ((paramInt2 == 4) && (paramInt3 == -68))
    {
      this.fUd.a(paramInt2, paramInt3, localabo.uND.tTE.uNR, this);
      GMTrace.o(4440861966336L, 33087);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4440861966336L, 33087);
      return;
    }
    w.d("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    at.AR();
    paramq = bg.nl((String)com.tencent.mm.y.c.xh().get(65828, null));
    if ((localabn.lQF == 1) && (!bg.nm(localabo.ugH)) && (!localabo.ugH.equals(paramq)))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(65828, localabo.ugH);
      af.Ig().Hh();
    }
    if (localabo.lPH == null)
    {
      w.e("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  friendlist null");
      GMTrace.o(4440861966336L, 33087);
      return;
    }
    w.i("MicroMsg.NetSceneGetMFriend", "onGYNetEnd friend list size:%d", new Object[] { Integer.valueOf(localabo.lPH.size()) });
    at.AR();
    long l = com.tencent.mm.y.c.yH().cE(Thread.currentThread().getId());
    paramInt1 = 0;
    if (paramInt1 < localabo.lPH.size())
    {
      amj localamj = (amj)localabo.lPH.get(paramInt1);
      if (localamj == null) {
        w.e("MicroMsg.NetSceneGetMFriend", "Err getFriendList null");
      }
      b localb;
      h localh;
      for (;;)
      {
        paramInt1 += 1;
        break;
        localb = af.If().jK(localamj.gCw);
        if ((localb == null) && (localabn.lQF != 1))
        {
          w.e("MicroMsg.NetSceneGetMFriend", "Err MD5 not found is AddrUploadStg, nickName: " + localamj.uBf + " md5: " + localamj.gCw);
        }
        else
        {
          at.AR();
          com.tencent.mm.y.c.zu().fd(localamj.tRz, localamj.uoe);
          localh = new h();
          if (localabn.lQF != 1) {
            break label944;
          }
          if (localamj.uBg != null) {
            break label509;
          }
          w.e("MicroMsg.NetSceneGetMFriend", "ERR: facebook friend return null info");
        }
      }
      label509:
      localh.fjc = localamj.uBg.ory;
      localh.gCR = localamj.uBg.uiD;
      com.tencent.mm.ac.b.hL(localamj.uBg.ory);
      localh.gCQ = localamj.uBg.lPi;
      localh.fsF = localamj.gCC;
      localh.fjl = localamj.gCz;
      localh.fjk = localamj.gCy;
      localh.signature = localamj.gCA;
      localh.fjj = localamj.gCB;
      localh.fja = localamj.gCx;
      localh.aDn = localamj.uBf;
      localh.gCq = com.tencent.mm.platformtools.c.nc(localamj.uBg.lPi);
      localh.gCr = com.tencent.mm.platformtools.c.nb(localamj.uBg.lPi);
      localh.username = localamj.tRz;
      label684:
      k localk = new k();
      localk.username = localamj.tRz;
      localk.fjk = localamj.gCy;
      localk.fjl = localamj.gCz;
      localk.signature = localamj.gCA;
      localk.fja = localamj.gCx;
      localk.fjj = localamj.gCB;
      paramq = null;
      if (!bg.nm(localamj.tRz))
      {
        at.AR();
        paramArrayOfByte = com.tencent.mm.y.c.yK().TE(localamj.tRz);
        if ((paramArrayOfByte == null) || (!localamj.tRz.equals(paramArrayOfByte.field_username))) {
          break label967;
        }
        paramq = paramArrayOfByte;
        if (!bg.nm(localamj.gCC))
        {
          paramq = paramArrayOfByte;
          if (!localamj.gCC.equals(paramArrayOfByte.qQ()))
          {
            paramArrayOfByte.ci(localamj.gCC);
            at.AR();
            com.tencent.mm.y.c.yK().a(paramArrayOfByte.field_username, paramArrayOfByte);
            paramq = paramArrayOfByte;
          }
        }
      }
      label876:
      boolean bool;
      if (bg.nm(localamj.tRz)) {
        if (localabn.lQF == 1)
        {
          bool = true;
          label899:
          Assert.assertTrue("mobile friend never go here", bool);
          localh.status = 102;
        }
      }
      for (;;)
      {
        if (localabn.lQF == 1) {
          af.Ig().a(localh);
        }
        af.Ih().a(localk);
        break;
        label944:
        if (!bg.nm(localamj.tRz)) {
          break label684;
        }
        w.w("MicroMsg.NetSceneGetMFriend", "username null for mobile");
        break;
        label967:
        paramq = null;
        break label876;
        bool = false;
        break label899;
        if ((paramq == null) || (!a.eE(paramq.field_type)))
        {
          localh.status = 100;
          if (localb != null)
          {
            w.v("MicroMsg.NetSceneGetMFriend", "onGYNetEnd update status on, nick:" + localamj.uBf + " realName:" + localb.GU() + "  MFriend:" + localamj.toString());
            localb.status = 1;
            localb.username = localamj.tRz;
            localb.aDn = localamj.uBf;
            localb.gCq = com.tencent.mm.platformtools.c.nc(localamj.uBg.lPi);
            localb.gCr = com.tencent.mm.platformtools.c.nb(localamj.uBg.lPi);
            localb.gCv = localb.ux();
            a(localb, localamj);
            localb.eQl = -1;
            af.If().a(localb.GS(), localb);
            paramq = new com.tencent.mm.ac.h();
            paramq.username = localamj.tRz;
            paramq.gsU = localamj.ubV;
            paramq.gsT = localamj.ubW;
            paramq.bi(true);
            paramq.fiZ = 3;
            n.Di().a(paramq);
          }
        }
        else
        {
          localh.status = 101;
          if (localb != null)
          {
            w.v("MicroMsg.NetSceneGetMFriend", "onGYNetEnd update status friend, nick:" + localamj.uBf + "  md5:" + localamj.gCw);
            localb.status = 2;
            localb.username = localamj.tRz;
            localb.aDn = localamj.uBf;
            localb.gCv = localb.ux();
            a(localb, localamj);
            localb.eQl = -1;
            af.If().a(localb.GS(), localb);
            com.tencent.mm.ac.b.y(localamj.tRz, 3);
          }
        }
      }
    }
    at.AR();
    com.tencent.mm.y.c.yH().aL(l);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4440861966336L, 33087);
  }
  
  public final int getType()
  {
    GMTrace.i(4440727748608L, 33086);
    GMTrace.o(4440727748608L, 33086);
    return 32;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */