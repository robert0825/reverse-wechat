package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.bhh;
import com.tencent.mm.protocal.c.bhi;
import com.tencent.mm.protocal.c.bhj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.s;

public final class ah
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private final String toUserName;
  
  public ah(String paramString, int paramInt)
  {
    GMTrace.i(1360430891008L, 10136);
    this.toUserName = paramString;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bhi();
    ((b.a)localObject).gtG = new bhj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/statusnotify";
    ((b.a)localObject).gtE = 251;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bhi)this.fUa.gtC.gtK;
    ((bhi)localObject).lSY = com.tencent.mm.y.q.zE();
    ((bhi)localObject).uTi = paramInt;
    ((bhi)localObject).lSX = paramString;
    ((bhi)localObject).tQN = System.currentTimeMillis();
    w.d("MicroMsg.NetSceneStatusNotify", "toUserName = " + paramString);
    GMTrace.o(1360430891008L, 10136);
  }
  
  private ah(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(1360565108736L, 10137);
    this.toUserName = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bhi();
    ((b.a)localObject).gtG = new bhj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/statusnotify";
    ((b.a)localObject).gtE = 251;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bhi)this.fUa.gtC.gtK;
    ((bhi)localObject).lSY = com.tencent.mm.y.q.zE();
    ((bhi)localObject).uTi = paramInt;
    ((bhi)localObject).lSX = paramString1;
    ((bhi)localObject).tQN = System.currentTimeMillis();
    ((bhi)localObject).uTl = new bhh();
    ((bhi)localObject).uTl.lPi = paramString2;
    ((bhi)localObject).uTl.uTh = paramString3;
    GMTrace.o(1360565108736L, 10137);
  }
  
  public static void I(String paramString, int paramInt)
  {
    GMTrace.i(1360162455552L, 10134);
    if (bg.nm(paramString))
    {
      GMTrace.o(1360162455552L, 10134);
      return;
    }
    if ((!h.xw().wL()) || ((s.gm(paramString)) && (!s.fH(paramString))))
    {
      GMTrace.o(1360162455552L, 10134);
      return;
    }
    paramString = new ah(paramString, paramInt);
    h.xx().fYr.a(paramString, 0);
    GMTrace.o(1360162455552L, 10134);
  }
  
  public static void a(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(1360296673280L, 10135);
    if ((bg.nm(paramString1)) || (s.gm(paramString1)))
    {
      GMTrace.o(1360296673280L, 10135);
      return;
    }
    if (!h.xw().wL())
    {
      GMTrace.o(1360296673280L, 10135);
      return;
    }
    paramString1 = new ah(paramString1, paramInt, paramString2, paramString3);
    h.xx().fYr.a(paramString1, 0);
    GMTrace.o(1360296673280L, 10135);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1360833544192L, 10139);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1360833544192L, 10139);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1360967761920L, 10140);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      w.d("MicroMsg.NetSceneStatusNotify", "StatusNotify Error. userName=" + this.toUserName);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1360967761920L, 10140);
  }
  
  public final int getType()
  {
    GMTrace.i(1360699326464L, 10138);
    GMTrace.o(1360699326464L, 10138);
    return 251;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */