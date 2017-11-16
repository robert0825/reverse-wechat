package com.tencent.mm.ae;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.v;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.gn;
import com.tencent.mm.protocal.c.go;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eKL;
  private String eKN;
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public long gvv;
  
  public a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(4495891234816L, 33497);
    this.gvv = 0L;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new gn();
    ((b.a)localObject).gtG = new go();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindqq";
    ((b.a)localObject).gtE = 144;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.gvv = paramLong;
    localObject = (gn)this.fUa.gtC.gtK;
    ((gn)localObject).tVc = new o(paramLong).intValue();
    ((gn)localObject).tUR = "";
    ((gn)localObject).tVd = "";
    ((gn)localObject).tVe = "";
    ((gn)localObject).tVf = "";
    ((gn)localObject).tVh = new azq().Rq("");
    ((gn)localObject).tVg = 1;
    if (paramBoolean == true) {}
    for (paramString1 = at.AO().c(paramLong, paramString3);; paramString1 = at.AO().a(paramLong, bg.Ss(paramString1), true))
    {
      ((gn)localObject).tTt = new azp().be(paramString1);
      at.AR();
      String str = bg.nl((String)c.xh().get(47, null));
      ((gn)localObject).tVi = new azp().be(bg.St(str));
      w.i("MicroMsg.NetSceneBindQQ", "init opcode:%d qq:%d  wtbuf:%d img[%s,%s,%s] ksid:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(bg.br(paramString1)), paramString3, paramString2, paramString4, str });
      GMTrace.o(4495891234816L, 33497);
      return;
    }
  }
  
  public a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    this(paramLong, paramString1, paramString2, paramString3, paramString4, 1, paramBoolean);
    GMTrace.i(4496025452544L, 33498);
    this.eKL = paramString5;
    this.eKN = paramString6;
    paramString1 = (gn)this.fUa.gtC.gtK;
    paramString1.tUI = paramString5;
    paramString1.tUJ = paramString6;
    GMTrace.o(4496025452544L, 33498);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4496159670272L, 33499);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4496159670272L, 33499);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4496428105728L, 33501);
    paramq = (gn)this.fUa.gtC.gtK;
    paramArrayOfByte = (go)this.fUa.gtD.gtK;
    Object localObject = n.a(paramArrayOfByte.tSd);
    boolean bool1 = false;
    if (!bg.bq((byte[])localObject)) {
      bool1 = at.AO().a(new o(paramq.tVc).longValue(), (byte[])localObject);
    }
    w.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd[%d,%d] wtret:%b wtRespBuf:%d imgsid:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool1), Integer.valueOf(bg.br((byte[])localObject)), paramArrayOfByte.tVe });
    boolean bool2;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      c.xh().set(9, Integer.valueOf(paramq.tVc));
      if (paramq.tVg == 1)
      {
        at.AR();
        c.xh().set(17, Integer.valueOf(paramArrayOfByte.tOB));
      }
      at.AR();
      localObject = c.yS();
      String str = paramArrayOfByte.tVl;
      if (paramArrayOfByte.tVk == 1)
      {
        bool2 = true;
        ((f)localObject).ah(str, bool2);
        paramInt1 = paramq.tVc;
        if (paramInt1 != 0)
        {
          at.AR();
          c.yS().bt(new o(paramInt1) + "@qqim", 3);
        }
        com.tencent.mm.ac.b.c(paramInt1, 3);
        at.AR();
        c.xh().set(32, paramq.tUR);
        at.AR();
        c.xh().set(33, paramq.tVd);
        localObject = bg.bs(at.AO().Z(new o(paramq.tVc).longValue()));
        w.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd wtret:%b newa2key:%s ", new Object[] { Boolean.valueOf(bool1), bg.SJ((String)localObject) });
        at.AR();
        c.xh().set(72, localObject);
        at.AR();
        c.xh().set(46, bg.bs(n.a(paramArrayOfByte.tSj)));
        localObject = bg.bs(n.a(paramq.tVi));
        at.AR();
        c.xh().set(47, localObject);
        at.AP().set(18, localObject);
        at.AR();
        c.xh().set(-1535680990, paramArrayOfByte.tVm);
        if ((!bg.nm(this.eKL)) && (!bg.nm(this.eKN)))
        {
          at.AR();
          c.xh().set(64, Integer.valueOf(paramArrayOfByte.tOy));
          localObject = new rs();
          ((rs)localObject).eWy.eWz = paramArrayOfByte;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          paramArrayOfByte = new rt();
          paramArrayOfByte.eWA.eWB = true;
          paramArrayOfByte.eWA.eWC = true;
          com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
        }
      }
    }
    for (;;)
    {
      paramInt1 = paramInt3;
      if (paramq.tVg == 3)
      {
        paramInt1 = paramInt3;
        if (paramInt3 == -3)
        {
          paramInt1 = 10000;
          w.d("MicroMsg.NetSceneBindQQ", "onGYNetEnd : retCode = 10000");
        }
      }
      this.fUd.a(paramInt2, paramInt1, paramString, this);
      GMTrace.o(4496428105728L, 33501);
      return;
      bool2 = false;
      break;
      if (paramInt2 == 4)
      {
        at.AR();
        c.xh().set(32, "");
        at.AR();
        c.xh().set(33, "");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4496293888000L, 33500);
    GMTrace.o(4496293888000L, 33500);
    return 144;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ae\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */