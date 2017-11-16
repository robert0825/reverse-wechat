package com.tencent.mars.smc;

import com.tencent.mm.protocal.a.a.a;
import com.tencent.mm.protocal.a.a.c;
import com.tencent.mm.protocal.a.a.d;
import com.tencent.mm.protocal.a.a.e;
import com.tencent.mm.protocal.a.a.f;
import com.tencent.mm.protocal.a.a.g;
import com.tencent.mm.protocal.a.a.h;
import com.tencent.mm.protocal.a.a.i;
import com.tencent.mm.protocal.a.a.j;
import com.tencent.mm.protocal.a.a.k;
import com.tencent.mm.protocal.a.a.l;
import com.tencent.mm.protocal.a.a.m;
import com.tencent.mm.protocal.a.a.n;
import com.tencent.mm.protocal.a.a.o;
import com.tencent.mm.protocal.c.aif;
import com.tencent.mm.protocal.c.aig;
import com.tencent.mm.protocal.c.ako;
import com.tencent.mm.protocal.c.aqi;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.protocal.c.mz;
import com.tencent.mm.protocal.c.na;
import com.tencent.mm.protocal.c.zb;
import com.tencent.mm.protocal.c.zc;
import java.util.ArrayList;
import java.util.LinkedList;

public class SmcProtoBufUtil
{
  private static o fillStrategyTable(LinkedList<bhp> paramLinkedList)
  {
    o localo = new o();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      bhp localbhp = (bhp)paramLinkedList.get(i);
      m localm = new m();
      localm.tLJ = localbhp.uTz;
      localm.tLK = localbhp.uTA;
      int j = 0;
      while (j < localbhp.uTB.size())
      {
        aqi localaqi = (aqi)localbhp.uTB.get(j);
        n localn = new n();
        localn.tLd = localaqi.uzM;
        localn.tLM = localaqi.uGA;
        localn.tLN = localaqi.uGy;
        localn.tLO = localaqi.uGz;
        localn.tLP = localaqi.uGB;
        localn.tLQ = localaqi.uGC;
        localn.tLR = localaqi.uGD;
        localm.tLL.add(localn);
        j += 1;
      }
      localo.tLS.add(localm);
      i += 1;
    }
    return localo;
  }
  
  public static zb toMMGetStrategyReq()
  {
    zb localzb = new zb();
    ArrayList localArrayList = SmcLogic.getStrategyVersions();
    if (localArrayList.size() != 6) {
      return null;
    }
    localzb.udF = ((Integer)localArrayList.get(0)).intValue();
    localzb.udG = ((Integer)localArrayList.get(1)).intValue();
    localzb.udH = ((Integer)localArrayList.get(2)).intValue();
    localzb.upW = ((Integer)localArrayList.get(3)).intValue();
    localzb.upX = ((Integer)localArrayList.get(4)).intValue();
    localzb.upY = ((Integer)localArrayList.get(5)).intValue();
    return localzb;
  }
  
  public static mz toMMReportIdkeyReq(g paramg)
  {
    mz localmz = new mz();
    localmz.udF = paramg.tLg;
    localmz.udG = paramg.tLw;
    localmz.udH = 0;
    int i = 0;
    while (i < paramg.tLx.size())
    {
      com.tencent.mm.protocal.a.a.b localb = (com.tencent.mm.protocal.a.a.b)paramg.tLx.get(i);
      my localmy = new my();
      localmy.kAW = localb.uin;
      localmy.tTC = localb.tLe;
      localmy.udE = localb.nettype;
      int j = 0;
      while (j < localb.tLf.size())
      {
        a locala = (a)localb.tLf.get(j);
        ako localako = new ako();
        localako.uzM = locala.tLd;
        localako.ufZ = 0;
        localako.uzO = 0;
        localako.jhc = locala.count;
        localako.uzN = com.tencent.mm.bm.b.aX(Integer.toString(locala.value).getBytes());
        localmy.lSa.add(localako);
        j += 1;
      }
      localmz.udI.add(localmy);
      i += 1;
    }
    return localmz;
  }
  
  public static mz toMMReportKvReq(i parami)
  {
    mz localmz = new mz();
    localmz.udF = parami.tLg;
    localmz.udG = parami.tLw;
    localmz.udH = parami.tLu;
    int i = 0;
    while (i < parami.tLx.size())
    {
      e locale = (e)parami.tLx.get(i);
      my localmy = new my();
      localmy.kAW = locale.uin;
      localmy.tTC = locale.tLe;
      localmy.udE = locale.nettype;
      localmy.tWF = locale.tLq;
      localmy.tWD = locale.tLo;
      localmy.tWE = locale.tLp;
      localmy.tWG = locale.tLr;
      localmy.tWH = locale.tLs;
      localmy.jif = locale.tLt;
      int j = 0;
      while (j < locale.tLf.size())
      {
        d locald = (d)locale.tLf.get(j);
        ako localako = new ako();
        localako.uzM = locald.tLd;
        localako.uzN = locald.tLm;
        localako.uzO = locald.tLn;
        localako.ufZ = locald.oNd;
        localako.jhc = locald.count;
        localmy.lSa.add(localako);
        j += 1;
      }
      localmz.udI.add(localmy);
      i += 1;
    }
    return localmz;
  }
  
  public static aif toMMSelfMonitor(k paramk)
  {
    aif localaif = new aif();
    localaif.uxB = paramk.tLA;
    int i = 0;
    while (i < paramk.tLB.size())
    {
      aig localaig = new aig();
      l locall = (l)paramk.tLB.get(i);
      localaig.uxC = locall.tLC;
      localaig.eBs = locall.action;
      localaig.uxD = locall.tLD;
      localaig.uxE = locall.tLE;
      localaig.uxF = locall.tLF;
      localaig.uxG = locall.tLG;
      localaig.uxH = locall.tLH;
      localaig.uxI = locall.tLI;
      localaif.lSa.add(localaig);
      i += 1;
    }
    return localaif;
  }
  
  public static c toSmcIdkeyStrategyResp(zc paramzc)
  {
    c localc = new c();
    localc.ret = paramzc.tST;
    localc.tLg = paramzc.udL;
    localc.tLh = paramzc.udM;
    localc.tLk = paramzc.udR;
    localc.tLl = paramzc.udT;
    localc.tLi = fillStrategyTable(paramzc.udO);
    localc.tLj = fillStrategyTable(paramzc.udP);
    return localc;
  }
  
  public static f toSmcKVStrategyResp(zc paramzc)
  {
    f localf = new f();
    localf.ret = paramzc.tST;
    localf.tLg = paramzc.upW;
    localf.tLh = paramzc.upX;
    localf.tLu = paramzc.upY;
    localf.tLk = paramzc.udR;
    localf.tLl = paramzc.udT;
    localf.tLi = fillStrategyTable(paramzc.upZ);
    localf.tLj = fillStrategyTable(paramzc.uqa);
    localf.tLv = fillStrategyTable(paramzc.uqb);
    return localf;
  }
  
  public static h toSmcReportIdkeyResp(na paramna)
  {
    h localh = new h();
    localh.ret = paramna.tST;
    localh.tLg = paramna.udL;
    localh.tLh = paramna.udM;
    localh.tLk = paramna.udR;
    localh.tLz = paramna.udS;
    localh.tLl = paramna.udT;
    localh.tLi = fillStrategyTable(paramna.udO);
    localh.tLj = fillStrategyTable(paramna.udP);
    return localh;
  }
  
  public static j toSmcReportKvResp(na paramna)
  {
    j localj = new j();
    localj.ret = paramna.tST;
    localj.tLg = paramna.udL;
    localj.tLh = paramna.udM;
    localj.tLu = paramna.udN;
    localj.tLk = paramna.udR;
    localj.tLz = paramna.udS;
    localj.tLl = paramna.udT;
    localj.tLi = fillStrategyTable(paramna.udO);
    localj.tLj = fillStrategyTable(paramna.udP);
    localj.tLv = fillStrategyTable(paramna.udQ);
    return localj;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mars\smc\SmcProtoBufUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */