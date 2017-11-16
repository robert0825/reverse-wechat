package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.protocal.c.bej;
import com.tencent.mm.protocal.c.bek;
import com.tencent.mm.protocal.c.bem;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfv;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private String prX;
  private ber prY;
  private int type;
  
  public j(ber paramber, String paramString1, String paramString2)
  {
    GMTrace.i(8078430830592L, 60189);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bej();
    ((b.a)localObject).gtG = new bek();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsadcomment";
    ((b.a)localObject).gtE = 682;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bej)this.fUa.gtC.gtK;
    ((bej)localObject).uQb = paramber;
    this.type = paramber.uQt.jib;
    this.prY = paramber;
    ((bej)localObject).tPP = paramString1;
    this.prX = paramString1;
    long l = paramber.tXT;
    paramString1 = ae.bjg().dN(l);
    if (paramString1 != null)
    {
      paramString1 = paramString1.blD();
      if (paramString1 != null)
      {
        paramString1 = o.lG(paramString1.pTh);
        if (paramString1 != null)
        {
          ((bej)localObject).uQc = n.ni(o.a(paramString1));
          ((bej)localObject).tQP = paramString1.cfz;
        }
        ((bej)localObject).uQa = n.ni(bg.aq(paramString2, ""));
        w.i("MicroMsg.NetSceneSnsAdComment", paramber.uQt.uKB + " " + paramber.uQt.uhT + " type " + paramber.uQt.jib + " aduxinfo " + paramString2 + ", SnsStat=" + ((bej)localObject).uQc + ", source=" + ((bej)localObject).tQP);
        GMTrace.o(8078430830592L, 60189);
        return;
      }
      w.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      paramString1 = null;
      break;
      w.v("SnsAdExtUtil", "parseStatSnsAdInfo snsInfo null, snsId %d", new Object[] { Long.valueOf(l) });
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8078565048320L, 60190);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8078565048320L, 60190);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8078833483776L, 60192);
    w.d("MicroMsg.NetSceneSnsAdComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (paramInt2 == 4) {
        ae.bjc().c(this.prY.tXT, this.type, this.prX);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8078833483776L, 60192);
      return;
    }
    ae.bjc().c(this.prY.tXT, this.type, this.prX);
    paramq = this.prY.uQt;
    if ((paramq.jib == 1) || (paramq.jib == 2) || (paramq.jib == 3) || (paramq.jib == 5) || (paramq.jib == 7) || (paramq.jib == 8))
    {
      paramArrayOfByte = new bew();
      paramArrayOfByte.nFd = paramq.nFd;
      paramArrayOfByte.jib = paramq.jib;
      paramArrayOfByte.tQP = paramq.tQP;
      paramArrayOfByte.tRz = paramq.uKB;
      paramArrayOfByte.uBf = paramq.uQj;
      paramArrayOfByte.nIp = paramq.nIp;
      paramArrayOfByte.uQr = paramq.uQr;
    }
    for (;;)
    {
      try
      {
        paramq = (bej)this.fUa.gtC.gtK;
        paramArrayOfByte = (bek)this.fUa.gtD.gtK;
        if ((paramq.tQP != 1) && (paramq.tQP != 2)) {
          continue;
        }
        paramArrayOfByte = paramArrayOfByte.uMn;
        paramq = paramArrayOfByte.uQe;
        a.a(paramArrayOfByte);
        w.d("MicroMsg.NetSceneSnsAdComment", "snsComment:" + paramq.toString() + " " + paramq.uQQ.size() + " " + paramq.uQT.size());
      }
      catch (Exception paramq)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsAdComment", paramq, "", new Object[0]);
        continue;
      }
      ae.bjc().biE();
      break;
      paramArrayOfByte = paramArrayOfByte.tQn;
      paramq = paramArrayOfByte.uQe;
      a.b(paramArrayOfByte);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8078699266048L, 60191);
    GMTrace.o(8078699266048L, 60191);
    return 682;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */