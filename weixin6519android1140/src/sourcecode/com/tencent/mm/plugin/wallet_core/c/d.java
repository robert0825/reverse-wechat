package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ws;
import com.tencent.mm.protocal.c.wt;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public wt rck;
  
  public d(String paramString)
  {
    GMTrace.i(7026029625344L, 52348);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ws();
    ((b.a)localObject).gtG = new wt();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/tenpay/getbanpaymobileinfo";
    ((b.a)localObject).gtE = 1667;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ws)this.fUa.gtC.gtK;
    w.d("MicroMsg.NetSceneGetBanpayMobileInfo", "req_key: %s", new Object[] { paramString });
    ((ws)localObject).eJQ = paramString;
    GMTrace.o(7026029625344L, 52348);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7026298060800L, 52350);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7026298060800L, 52350);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7026432278528L, 52351);
    w.i("MicroMsg.NetSceneGetBanpayMobileInfo", "NetSceneGetBanpayMobileInfo, netId: %s, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.rck = ((wt)this.fUa.gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(7026432278528L, 52351);
  }
  
  public final int getType()
  {
    GMTrace.i(15395176054784L, 114703);
    GMTrace.o(15395176054784L, 114703);
    return 1667;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */