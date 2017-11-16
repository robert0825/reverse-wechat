package com.tencent.mm.plugin.safedevice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkv;
import com.tencent.mm.protocal.c.bkw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String deviceName;
  public String eEl;
  public String esG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12856984600576L, 95792);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bkv();
    ((b.a)localObject).gtG = new bkw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/updatesafedevice";
    ((b.a)localObject).gtE = 361;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    this.esG = paramString1;
    this.deviceName = paramString2;
    this.eEl = paramString3;
    localObject = (bkv)this.fUa.gtC.gtK;
    ((bkv)localObject).ufG = paramString1;
    ((bkv)localObject).lPi = paramString2;
    ((bkv)localObject).tSz = paramString3;
    GMTrace.o(12856984600576L, 95792);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12857387253760L, 95795);
    if ((bg.nm(this.esG)) || (bg.nm(this.deviceName)) || (bg.nm(this.eEl)))
    {
      w.e("MicroMsg.NetscenUpdateSafeDevice", "null device is or device name or device type");
      GMTrace.o(12857387253760L, 95795);
      return -1;
    }
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12857387253760L, 95795);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12857118818304L, 95793);
    w.i("MicroMsg.NetscenUpdateSafeDevice", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12857118818304L, 95793);
  }
  
  public final int getType()
  {
    GMTrace.i(12857253036032L, 95794);
    GMTrace.o(12857253036032L, 95794);
    return 361;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */