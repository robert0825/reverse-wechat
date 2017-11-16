package com.tencent.mm.plugin.ext.voicecontrol;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.db;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.dd;
import com.tencent.mm.protocal.c.dh;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String appId;
  public int eHz;
  com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public int gsL;
  public int gsM;
  public String kOA;
  public dh kOB;
  public db kOC;
  int kOD;
  long kOE;
  public int kOy;
  public com.tencent.mm.bm.b kOz;
  public int ur;
  
  public a(int paramInt1, String paramString1, int paramInt2, String paramString2, dh paramdh)
  {
    GMTrace.i(5706132488192L, 42514);
    this.kOD = 5000;
    this.kOE = 0L;
    this.eHz = 1;
    this.appId = paramString1;
    this.kOy = paramInt1;
    this.ur = 1;
    this.gsL = paramInt2;
    this.kOB = paramdh;
    this.kOC = null;
    this.kOA = paramString2;
    if (paramdh != null) {}
    for (;;)
    {
      w.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, totalLen=%s, controlType=%s, %s, %s", new Object[] { Integer.valueOf(1), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(1), Boolean.valueOf(bool), Boolean.valueOf(false) });
      GMTrace.o(5706132488192L, 42514);
      return;
      bool = false;
    }
  }
  
  public a(int paramInt, String paramString, db paramdb, long paramLong)
  {
    GMTrace.i(5706266705920L, 42515);
    this.kOD = 5000;
    this.kOE = 0L;
    this.eHz = 2;
    this.appId = paramString;
    this.kOy = paramInt;
    this.ur = 1;
    this.kOB = null;
    this.kOC = paramdb;
    this.kOE = paramLong;
    w.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, controlType=%s, %s, %s", new Object[] { Integer.valueOf(2), paramString, Integer.valueOf(paramInt), Integer.valueOf(1), Boolean.valueOf(false), Boolean.valueOf(true) });
    GMTrace.o(5706266705920L, 42515);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5706669359104L, 42518);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtE = 985;
    parame1.uri = "/cgi-bin/micromsg-bin/appvoicecontrol";
    parame1.gtF = new dc();
    parame1.gtG = new dd();
    parame1.gtH = 0;
    parame1.gtI = 0;
    this.fUa = parame1.DA();
    parame1 = (dc)this.fUa.gtC.gtK;
    parame1.tMX = this.eHz;
    parame1.lQa = this.appId;
    parame1.tRo = this.kOy;
    parame1.tRp = this.ur;
    parame1.tRq = this.kOB;
    parame1.tRr = this.kOC;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5706669359104L, 42518);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5706400923648L, 42516);
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramq != null)) {
      w.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    }
    while (this.fUd != null)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5706400923648L, 42516);
      return;
      w.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    }
    w.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] callback null");
    GMTrace.o(5706400923648L, 42516);
  }
  
  public final int getType()
  {
    GMTrace.i(5706535141376L, 42517);
    GMTrace.o(5706535141376L, 42517);
    return 985;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\voicecontrol\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */