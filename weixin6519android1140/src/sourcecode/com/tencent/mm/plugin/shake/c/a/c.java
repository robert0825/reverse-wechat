package com.tencent.mm.plugin.shake.c.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.bdb;
import com.tencent.mm.protocal.c.bdc;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  e oMQ;
  
  public c(float paramFloat1, float paramFloat2, int paramInt, String paramString)
  {
    GMTrace.i(6522847363072L, 48599);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bdb();
    ((b.a)localObject).gtG = new bdc();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/shakecard";
    ((b.a)localObject).gtE = 1250;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bdb)this.fUa.gtC.gtK;
    ((bdb)localObject).eMl = paramFloat2;
    ((bdb)localObject).eNR = paramFloat1;
    ((bdb)localObject).scene = paramInt;
    ((bdb)localObject).uPf = paramString;
    GMTrace.o(6522847363072L, 48599);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6523115798528L, 48601);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6523115798528L, 48601);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6523250016256L, 48602);
    w.i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = 1250" + " errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bdc)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.oMQ = new e();
        this.oMQ.jzr = paramq.jzr;
        this.oMQ.jxF = paramq.jxF;
        this.oMQ.eTK = paramq.eTK;
        this.oMQ.title = paramq.title;
        this.oMQ.jxI = paramq.jxI;
        this.oMQ.jxJ = paramq.jxJ;
        this.oMQ.jyT = paramq.jyT;
        this.oMQ.jxH = paramq.jxH;
        this.oMQ.gjg = paramq.gjg;
        this.oMQ.oMR = paramq.oMR;
        this.oMQ.oMU = paramq.oMU;
        this.oMQ.oMV = paramq.oMV;
        this.oMQ.oMW = paramq.oMW;
        this.oMQ.oMX = paramq.oMX;
        this.oMQ.oMY = paramq.oMY;
        this.oMQ.jxM = paramq.jxM;
        this.oMQ.oMZ = paramq.oMZ;
        this.oMQ.oNa = paramq.oNa;
        m.bfq().oMT = this.oMQ.oMY;
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6523250016256L, 48602);
      return;
      this.oMQ = new e();
      this.oMQ.jzr = 3;
      this.oMQ.oMY = m.bfq().oMT;
      continue;
      this.oMQ = new e();
      this.oMQ.jzr = 3;
      this.oMQ.oMY = m.bfq().oMT;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6522981580800L, 48600);
    GMTrace.o(6522981580800L, 48600);
    return 1250;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */