package com.tencent.mm.plugin.report.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.a.a.c;
import com.tencent.mm.protocal.a.a.f;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ahi;
import com.tencent.mm.protocal.c.zb;
import com.tencent.mm.protocal.c.zc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static boolean aDI;
  private static Object lock;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private a oqv;
  private zb oqz;
  
  static
  {
    GMTrace.i(13105018961920L, 97640);
    aDI = false;
    lock = new Object();
    GMTrace.o(13105018961920L, 97640);
  }
  
  public h()
  {
    GMTrace.i(13104482091008L, 97636);
    this.oqz = null;
    this.oqv = new a();
    gV(true);
    this.oqz = SmcProtoBufUtil.toMMGetStrategyReq();
    if (this.oqz != null)
    {
      this.oqz.udK = new ahi();
      this.oqz.udK.uwM = this.oqv.tn(0);
    }
    GMTrace.o(13104482091008L, 97636);
  }
  
  private static void gV(boolean paramBoolean)
  {
    GMTrace.i(13104347873280L, 97635);
    synchronized (lock)
    {
      aDI = paramBoolean;
      GMTrace.o(13104347873280L, 97635);
      return;
    }
  }
  
  public static boolean isRunning()
  {
    GMTrace.i(13104213655552L, 97634);
    synchronized (lock)
    {
      boolean bool = aDI;
      GMTrace.o(13104213655552L, 97634);
      return bool;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13104884744192L, 97639);
    this.fUd = parame1;
    com.tencent.mm.kernel.h.xw();
    boolean bool = com.tencent.mm.kernel.a.wK();
    if (!bool) {
      this.oqz.udJ = com.tencent.mm.bm.b.aX(bg.bQN());
    }
    b.a locala = new b.a();
    locala.gtJ = false;
    locala.gtF = this.oqz;
    locala.gtG = new zc();
    if (bool) {
      parame1 = "/cgi-bin/micromsg-bin/getkvidkeystrategy";
    }
    for (;;)
    {
      locala.uri = parame1;
      locala.gtE = getType();
      this.fUa = locala.DA();
      if (!bool)
      {
        this.fUa.a(ac.bOp());
        this.fUa.eWP = 1;
      }
      int i = a(parame, this.fUa, this);
      if (i < 0) {
        w.i("MicroMsg.NetSceneGetCliKVStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
      }
      try
      {
        SmcLogic.OnStrategyResp(3, -1, null, 1);
        SmcLogic.OnStrategyResp(3, -1, null, 2);
        gV(false);
        GMTrace.o(13104884744192L, 97639);
        return i;
        parame1 = "/cgi-bin/micromsg-bin/getkvidkeystrategyrsa";
      }
      catch (Exception parame)
      {
        for (;;)
        {
          w.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bg.f(parame) });
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13104616308736L, 97637);
    if ((com.tencent.mm.kernel.h.xx().fYr == null) || (com.tencent.mm.kernel.h.xx().fYr.gus == null))
    {
      w.f("MicroMsg.NetSceneGetCliKVStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13104616308736L, 97637);
      return;
    }
    if (paramInt2 != 0)
    {
      w.e("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
      SmcLogic.OnStrategyResp(paramInt2, paramInt3, null, 1);
      SmcLogic.OnStrategyResp(paramInt2, paramInt3, null, 2);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      gV(false);
      GMTrace.o(13104616308736L, 97637);
      return;
    }
    w.d("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy ok");
    paramArrayOfByte = (zc)this.fUa.gtD.gtK;
    this.oqv.a(paramArrayOfByte.udU, 0);
    try
    {
      paramq = SmcProtoBufUtil.toSmcKVStrategyResp(paramArrayOfByte);
      paramArrayOfByte = SmcProtoBufUtil.toSmcIdkeyStrategyResp(paramArrayOfByte);
      SmcLogic.OnStrategyResp(0, 0, paramq.toByteArray(), 1);
      SmcLogic.OnStrategyResp(0, 0, paramArrayOfByte.toByteArray(), 2);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      gV(false);
      GMTrace.o(13104616308736L, 97637);
      return;
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bg.f(paramq) });
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(13104750526464L, 97638);
    com.tencent.mm.kernel.h.xw();
    if (com.tencent.mm.kernel.a.wK())
    {
      GMTrace.o(13104750526464L, 97638);
      return 988;
    }
    GMTrace.o(13104750526464L, 97638);
    return 989;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */