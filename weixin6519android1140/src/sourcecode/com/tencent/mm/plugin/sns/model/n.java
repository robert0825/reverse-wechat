package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.aul;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bex;
import com.tencent.mm.protocal.c.bey;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Locale;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  private String prX;
  private ber prY;
  private int type;
  
  public n(ber paramber, String paramString)
  {
    GMTrace.i(8111448391680L, 60435);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bex();
    ((b.a)localObject).gtG = new bey();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnscomment";
    ((b.a)localObject).gtE = 213;
    ((b.a)localObject).gtH = 100;
    ((b.a)localObject).gtI = 1000000100;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bex)this.fUa.gtC.gtK;
    ((bex)localObject).uQb = paramber;
    this.type = paramber.uQt.jib;
    this.prY = paramber;
    ((bex)localObject).tPP = paramString;
    this.prX = paramString;
    w.d("MicroMsg.NetSceneSnsComment", paramber.uQt.uKB + " " + paramber.uQt.uhT);
    GMTrace.o(8111448391680L, 60435);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8111582609408L, 60436);
    Object localObject2 = ae.bjd().dU(this.prY.tXT);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      com.tencent.mm.plugin.sns.storage.e locale = ae.bjg().dN(this.prY.tXT);
      localObject1 = localObject2;
      if (locale != null) {
        localObject1 = locale.blF();
      }
    }
    if (localObject1 != null) {}
    try
    {
      localObject1 = (bfh)new bfh().aD(((m)localObject1).field_attrBuf);
      if ((((bfh)localObject1).uRd != null) && (((bfh)localObject1).uRd.uNQ))
      {
        localObject2 = (bfp)new bfp().aD(((bfh)localObject1).uRd.uNP.tJp);
        localObject1 = (bex)this.fUa.gtC.gtK;
        if (((bfp)localObject2).uRs != null)
        {
          localObject2 = String.format(Locale.US, "preloadLayerId=%d&preloadExpId=%d", new Object[] { Integer.valueOf(((bfp)localObject2).uRs.ufI), Integer.valueOf(((bfp)localObject2).uRs.ufJ) });
          w.i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", new Object[] { localObject2 });
          ((bex)localObject1).uQc = new azq().Rq((String)localObject2);
        }
      }
      this.fUd = parame1;
      int i = a(parame, this.fUa, this);
      GMTrace.o(8111582609408L, 60436);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsComment", localException, "", new Object[0]);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8111851044864L, 60438);
    w.d("MicroMsg.NetSceneSnsComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (paramInt2 == 4) {
        ae.bjc().c(this.prY.tXT, this.type, this.prX);
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8111851044864L, 60438);
      return;
    }
    ae.bjc().c(this.prY.tXT, this.type, this.prX);
    paramq = this.prY.uQt;
    if ((paramq.jib == 1) || (paramq.jib == 2) || (paramq.jib == 3) || (paramq.jib == 5))
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
        paramArrayOfByte = ((bey)this.fUa.gtD.gtK).uQe;
        if ((paramq.jib != 1) && (paramq.jib != 5)) {
          continue;
        }
        w.i("MicroMsg.NetSceneSnsComment", "snsComment:" + paramArrayOfByte.tXT + " " + com.tencent.mm.platformtools.n.b(paramArrayOfByte.uQM) + " " + paramArrayOfByte.uQQ.size() + " " + paramArrayOfByte.uQT.size());
        ai.d(paramArrayOfByte);
      }
      catch (Exception paramq)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsComment", paramq, "", new Object[0]);
        continue;
      }
      ae.bjc().biE();
      break;
      w.i("MicroMsg.NetSceneSnsComment", "snsComment:" + paramArrayOfByte.tXT + " " + paramArrayOfByte.uQQ.size() + " " + paramArrayOfByte.uQT.size());
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8111716827136L, 60437);
    GMTrace.o(8111716827136L, 60437);
    return 213;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */