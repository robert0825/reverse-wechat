package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.s;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class k
  extends ae
  implements e
{
  private String kEa;
  private int klq;
  private String kyK;
  private String kyL;
  
  public k(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(11124367949824L, 82883);
    this.kyK = null;
    this.kEa = null;
    this.kyL = null;
    this.klq = -1;
    this.kyK = paramString1;
    this.kEa = paramString2;
    this.kyL = paramString3;
    this.klq = paramInt;
    GMTrace.o(11124367949824L, 82883);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11124502167552L, 82884);
    w.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "onSceneEnd. errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    at.wS().b(1090, this);
    GMTrace.o(11124502167552L, 82884);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    GMTrace.i(11124636385280L, 82885);
    w.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "excute MMWifiStatusSubscribeTaskExcuter. brandName=" + this.kyK + ",deviceType=" + this.kEa + ",deviceId=" + this.kyL + ",reqType=" + this.klq);
    at.wS().a(1090, this);
    paramm = new s(this.kyK, this.kEa, this.kyL, this.klq);
    at.wS().a(paramm, 0);
    GMTrace.o(11124636385280L, 82885);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */