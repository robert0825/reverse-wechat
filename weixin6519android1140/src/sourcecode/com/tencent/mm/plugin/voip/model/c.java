package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.protocal.c.aod;
import com.tencent.mm.protocal.c.aoe;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bbr;
import com.tencent.mm.protocal.c.bbs;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.an;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.be;
import com.tencent.mm.y.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static final List<an> gMA;
  private static final Set<Long> qEH;
  private long eDr;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private final List<au> gMB;
  
  static
  {
    GMTrace.i(5260529631232L, 39194);
    gMA = new ArrayList();
    qEH = new HashSet();
    GMTrace.o(5260529631232L, 39194);
  }
  
  public c()
  {
    GMTrace.i(5259455889408L, 39186);
    this.gMB = new LinkedList();
    w.d("MicroMsg.NetSceneSendMsg", "dktext :" + bg.bQW());
    w.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    GMTrace.o(5259455889408L, 39186);
  }
  
  public c(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(5259321671680L, 39185);
    this.gMB = new LinkedList();
    w.d("MicroMsg.NetSceneSendMsg", "dktext :" + bg.bQW());
    if (!bg.nm(paramString1))
    {
      au localau = new au();
      localau.dB(1);
      localau.db(paramString1);
      localau.E(bc.gR(paramString1));
      localau.dC(1);
      localau.setContent(paramString2);
      localau.setType(paramInt);
      at.AR();
      this.eDr = com.tencent.mm.y.c.yM().P(localau);
      if (this.eDr == -1L) {
        break label171;
      }
    }
    for (;;)
    {
      Assert.assertTrue(bool);
      w.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.eDr);
      GMTrace.o(5259321671680L, 39185);
      return;
      label171:
      bool = false;
    }
  }
  
  private void Jz()
  {
    GMTrace.i(5260261195776L, 39192);
    int i = 0;
    while (i < this.gMB.size())
    {
      gD(i);
      i += 1;
    }
    GMTrace.o(5260261195776L, 39192);
  }
  
  private void gD(int paramInt)
  {
    GMTrace.i(5260395413504L, 39193);
    au localau = (au)this.gMB.get(paramInt);
    localau.dB(5);
    at.AR();
    com.tencent.mm.y.c.yM().a(localau.field_msgId, localau);
    Iterator localIterator = gMA.iterator();
    while (localIterator.hasNext())
    {
      an localan = (an)localIterator.next();
      String str1 = localau.field_talker;
      String str2 = localau.field_content;
      localan.gL(str1);
    }
    GMTrace.o(5260395413504L, 39193);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5259858542592L, 39189);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new bbr();
    parame1.gtG = new bbs();
    parame1.uri = "/cgi-bin/micromsg-bin/newsendmsg";
    parame1.gtE = 522;
    parame1.gtH = 237;
    parame1.gtI = 1000000237;
    this.fUa = parame1.DA();
    parame1 = (bbr)this.fUa.gtC.gtK;
    at.AR();
    List localList = com.tencent.mm.y.c.yM().aOn();
    if (localList.size() == 0)
    {
      w.i("MicroMsg.NetSceneSendMsg", "no sending message");
      GMTrace.o(5259858542592L, 39189);
      return -2;
    }
    this.gMB.clear();
    int i = 0;
    while (i < localList.size())
    {
      au localau = (au)localList.get(i);
      if (localau.field_isSend == 1)
      {
        aod localaod = new aod();
        localaod.tPX = new azq().Rq(localau.field_talker);
        localaod.nFd = ((int)(localau.field_createTime / 1000L));
        localaod.jib = localau.field_type;
        localaod.nIp = localau.field_content;
        localaod.uEe = o.h(com.tencent.mm.y.q.zE(), localau.field_createTime).hashCode();
        localaod.tQb = be.Bs();
        parame1.jhd.add(localaod);
        parame1.jhc = parame1.jhd.size();
        this.gMB.add(localau);
      }
      i += 1;
    }
    i = a(parame, this.fUa, this);
    if (i < 0) {
      Jz();
    }
    GMTrace.o(5259858542592L, 39189);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(5259724324864L, 39188);
    if (this.gMB.size() > 0)
    {
      i = k.b.gum;
      GMTrace.o(5259724324864L, 39188);
      return i;
    }
    int i = k.b.gun;
    GMTrace.o(5259724324864L, 39188);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5260126978048L, 39191);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      Jz();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5260126978048L, 39191);
      return;
    }
    paramq = ((bbs)this.fUa.gtD.gtK).jhd;
    if (this.gMB.size() == paramq.size())
    {
      paramInt1 = 0;
      while (paramInt1 < paramq.size())
      {
        paramArrayOfByte = (aoe)paramq.get(paramInt1);
        if (paramArrayOfByte.tST != 0)
        {
          w.e("MicroMsg.NetSceneSendMsg", "send msg failed: item ret code=" + paramArrayOfByte.tST);
          gD(paramInt1);
          this.fUd.a(4, paramArrayOfByte.tST, paramString, this);
          GMTrace.o(5260126978048L, 39191);
          return;
        }
        long l = ((au)this.gMB.get(paramInt1)).field_msgId;
        w.i("MicroMsg.NetSceneSendMsg", "msg local id = " + l + ", SvrId = " + paramArrayOfByte.tQd + " sent successfully!");
        at.AR();
        au localau = com.tencent.mm.y.c.yM().cM(l);
        localau.D(paramArrayOfByte.tQd);
        localau.dB(2);
        at.AR();
        com.tencent.mm.y.c.yM().a(l, localau);
        paramInt1 += 1;
      }
      w.i("MicroMsg.NetSceneSendMsg", "total " + paramInt1 + " msgs sent successfully");
    }
    paramInt1 = a(this.gtW, this.fUd);
    if (paramInt1 == -2)
    {
      this.fUd.a(0, 0, paramString, this);
      GMTrace.o(5260126978048L, 39191);
      return;
    }
    if (paramInt1 < 0) {
      this.fUd.a(3, -1, paramString, this);
    }
    GMTrace.o(5260126978048L, 39191);
  }
  
  public final int getType()
  {
    GMTrace.i(5259992760320L, 39190);
    GMTrace.o(5259992760320L, 39190);
    return 522;
  }
  
  protected final int vB()
  {
    GMTrace.i(5259590107136L, 39187);
    GMTrace.o(5259590107136L, 39187);
    return 10;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */