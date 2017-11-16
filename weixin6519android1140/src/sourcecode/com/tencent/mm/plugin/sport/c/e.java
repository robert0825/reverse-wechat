package com.tencent.mm.plugin.sport.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bli;
import com.tencent.mm.protocal.c.blj;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Date;
import java.util.TimeZone;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private bli qqF;
  
  public e(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, int paramInt4)
  {
    GMTrace.i(16731447754752L, 124659);
    this.fUd = null;
    this.fUa = null;
    w.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep %s, %s, %s, %s, %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    b.a locala = new b.a();
    locala.gtF = new bli();
    locala.gtG = new blj();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep";
    locala.gtE = 1261;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.qqF = ((bli)this.fUa.gtC.gtK);
    this.qqF.esG = paramString1;
    this.qqF.eEl = paramString2;
    this.qqF.uVq = paramInt1;
    this.qqF.uVr = paramInt2;
    this.qqF.aJb = paramInt3;
    paramString1 = this.qqF;
    paramString2 = TimeZone.getDefault();
    paramInt2 = paramString2.getRawOffset() / 1000;
    if ((paramString2.useDaylightTime()) && (paramString2.inDaylightTime(new Date(System.currentTimeMillis())))) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramString1.uVs = String.valueOf(paramInt1 + paramInt2 / 3600);
      this.qqF.uVu = paramString3;
      this.qqF.uVx = paramInt4;
      GMTrace.o(16731447754752L, 124659);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(16731716190208L, 124661);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(16731716190208L, 124661);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(16731850407936L, 124662);
    w.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(16731850407936L, 124662);
  }
  
  public final int getType()
  {
    GMTrace.i(16731581972480L, 124660);
    GMTrace.o(16731581972480L, 124660);
    return 1261;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */