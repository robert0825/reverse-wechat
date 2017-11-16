package com.tencent.mm.plugin.report.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.a.a.g;
import com.tencent.mm.protocal.a.a.i;
import com.tencent.mm.protocal.a.a.j;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ahi;
import com.tencent.mm.protocal.c.mz;
import com.tencent.mm.protocal.c.na;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int ePH;
  private boolean ezT;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private mz oqu;
  private a oqv;
  
  public e(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13106226921472L, 97649);
    this.ezT = false;
    this.oqu = null;
    this.ePH = 0;
    this.oqv = new a();
    if (paramArrayOfByte == null) {
      throw new NullPointerException("data must not be null");
    }
    this.ePH = paramInt;
    com.tencent.mm.kernel.h.xw();
    this.ezT = com.tencent.mm.kernel.a.wK();
    if (paramInt == 1) {}
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new i();
        ((i)localObject).aD(paramArrayOfByte);
        this.oqu = SmcProtoBufUtil.toMMReportKvReq((i)localObject);
        if (this.oqu == null) {
          break;
        }
        this.oqu.udK = new ahi();
        this.oqu.udK.uwM = this.oqv.tn(this.ePH);
        GMTrace.o(13106226921472L, 97649);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        w.e("MicroMsg.NetSceneCliReportKV", "parse data error");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(13108105969664L, 97663);
            SmcLogic.OnReportResp(3, -1, null, e.this.ePH);
            GMTrace.o(13108105969664L, 97663);
          }
        });
        continue;
      }
      if (paramInt == 2) {
        try
        {
          localObject = new g();
          ((g)localObject).aD(paramArrayOfByte);
          this.oqu = SmcProtoBufUtil.toMMReportIdkeyReq((g)localObject);
        }
        catch (Exception paramArrayOfByte)
        {
          w.e("MicroMsg.NetSceneCliReportKV", "parse data error");
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(13106898010112L, 97654);
              SmcLogic.OnReportResp(3, -1, null, e.this.ePH);
              GMTrace.o(13106898010112L, 97654);
            }
          });
        }
      }
    }
    w.i("MicroMsg.NetSceneCliReportKV", "NetSceneCliReportKV parse req is null, stack[%s]", new Object[] { bg.bQW() });
    GMTrace.o(13106226921472L, 97649);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13106629574656L, 97652);
    this.fUd = parame1;
    if (this.oqu == null)
    {
      w.e("MicroMsg.NetSceneCliReportKV", "do scene but req is null!");
      GMTrace.o(13106629574656L, 97652);
      return -2;
    }
    if (!this.ezT) {
      this.oqu.udJ = com.tencent.mm.bm.b.aX(bg.bQN());
    }
    b.a locala = new b.a();
    locala.gtJ = false;
    locala.gtF = this.oqu;
    locala.gtG = new na();
    if (1 == this.ePH) {
      parame1 = "/cgi-bin/micromsg-bin/newreportkvcomm";
    }
    for (;;)
    {
      String str;
      label117:
      int i;
      if (1 == this.ePH)
      {
        str = "/cgi-bin/micromsg-bin/newreportkvcommrsa";
        if (!this.ezT) {
          break label239;
        }
        locala.uri = parame1;
        locala.gtE = getType();
        this.fUa = locala.DA();
        if (!this.ezT)
        {
          this.fUa.a(ac.bOp());
          this.fUa.eWP = 1;
        }
        i = a(parame, this.fUa, this);
        if (i < 0) {
          w.i("MicroMsg.NetSceneCliReportKV", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
        }
      }
      try
      {
        SmcLogic.OnReportResp(3, -1, null, this.ePH);
        GMTrace.o(13106629574656L, 97652);
        return i;
        parame1 = "/cgi-bin/micromsg-bin/newreportidkey";
        continue;
        str = "/cgi-bin/micromsg-bin/newreportidkeyrsa";
        break label117;
        label239:
        parame1 = str;
      }
      catch (Exception parame)
      {
        for (;;)
        {
          w.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bg.f(parame) });
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13106361139200L, 97650);
    if ((com.tencent.mm.kernel.h.xx().fYr == null) || (com.tencent.mm.kernel.h.xx().fYr.gus == null))
    {
      w.f("MicroMsg.NetSceneCliReportKV", "null == MMCore.getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13106361139200L, 97650);
      return;
    }
    if (paramInt2 != 0)
    {
      w.e("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
      SmcLogic.OnReportResp(paramInt2, paramInt3, null, this.ePH);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(13106361139200L, 97650);
      return;
    }
    w.d("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy ok, channel:" + this.ePH);
    paramq = (na)this.fUa.gtD.gtK;
    this.oqv.a(paramq.udU, this.ePH);
    try
    {
      if (this.ePH == 1) {
        SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportKvResp(paramq).toByteArray(), this.ePH);
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(13106361139200L, 97650);
        return;
        if (this.ePH == 2) {
          SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportIdkeyResp(paramq).toByteArray(), this.ePH);
        }
      }
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        w.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bg.f(paramq) });
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(13106495356928L, 97651);
    if (!this.ezT)
    {
      if (1 == this.ePH)
      {
        GMTrace.o(13106495356928L, 97651);
        return 997;
      }
      GMTrace.o(13106495356928L, 97651);
      return 987;
    }
    if (1 == this.ePH)
    {
      GMTrace.o(13106495356928L, 97651);
      return 996;
    }
    GMTrace.o(13106495356928L, 97651);
    return 986;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */