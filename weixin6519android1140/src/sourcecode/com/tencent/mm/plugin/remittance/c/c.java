package com.tencent.mm.plugin.remittance.c;

import android.net.wifi.WifiInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ig;
import com.tencent.mm.protocal.c.ih;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLDecoder;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  public ih olZ;
  
  public c(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, String paramString5, String paramString6, int paramInt4, int paramInt5)
  {
    GMTrace.i(19338358685696L, 144082);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ig();
    ((b.a)localObject).gtG = new ih();
    ((b.a)localObject).gtE = 1633;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fplaceorder";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gUL = ((b.a)localObject).DA();
    localObject = (ig)this.gUL.gtC.gtK;
    ((ig)localObject).omK = paramString1;
    ((ig)localObject).tXi = URLDecoder.decode(paramString2);
    ((ig)localObject).scene = paramInt1;
    ((ig)localObject).tXj = paramString3;
    ((ig)localObject).omE = paramString4;
    ((ig)localObject).tXe = paramInt2;
    ((ig)localObject).ePH = paramInt3;
    ((ig)localObject).omF = paramString5;
    ((ig)localObject).omL = paramString6;
    ((ig)localObject).omJ = paramInt4;
    if (paramInt5 == 1)
    {
      paramString1 = am.getWifiInfo(ab.getContext());
      if (paramString1 == null) {
        break label253;
      }
      ((ig)localObject).tXk = paramString1.getBSSID();
    }
    for (;;)
    {
      ((ig)localObject).tXl = 0;
      w.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder, scene: %s, channel: %s, total: %s, qrcode: %s, getPayWifi: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2), paramString2, Integer.valueOf(paramInt5) });
      GMTrace.o(19338358685696L, 144082);
      return;
      label253:
      w.w("MicroMsg.NetSceneBusiF2fPlaceOrder", "wifi info is null");
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19338627121152L, 144084);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(19338627121152L, 144084);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19338761338880L, 144085);
    w.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.olZ = ((ih)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.olZ.jzH), this.olZ.jzI });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(19338761338880L, 144085);
  }
  
  public final int getType()
  {
    GMTrace.i(19338492903424L, 144083);
    GMTrace.o(19338492903424L, 144083);
    return 1633;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */