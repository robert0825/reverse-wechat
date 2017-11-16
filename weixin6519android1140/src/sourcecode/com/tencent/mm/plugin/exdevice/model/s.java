package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.protocal.c.ahe;
import com.tencent.mm.protocal.c.ahf;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.platformtools.w;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  private String kyK;
  private com.tencent.mm.ad.b kzX;
  
  public s(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(10967601643520L, 81715);
    this.fXo = null;
    this.kzX = null;
    this.kyK = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ahe();
    ((b.a)localObject).gtG = new ahf();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/subscribestatus";
    ((b.a)localObject).gtE = 1090;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.kzX = ((b.a)localObject).DA();
    localObject = (ahe)this.kzX.gtC.gtK;
    ((ahe)localObject).tTD = com.tencent.mm.bm.b.Qb(paramString2);
    ((ahe)localObject).tTB = com.tencent.mm.bm.b.Qb(paramString3);
    ((ahe)localObject).lQF = paramInt;
    this.kyK = paramString1;
    GMTrace.o(10967601643520L, 81715);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10968004296704L, 81718);
    this.fXo = parame1;
    int i = a(parame, this.kzX, this);
    GMTrace.o(10968004296704L, 81718);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10967735861248L, 81716);
    w.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    ad.atR().wT(this.kyK);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = ((ahf)this.kzX.gtD.gtK).uND;
      paramInt1 = paramq.tST;
      if (paramq.tTE.uNS) {
        paramq = paramq.tTE.uNR;
      }
      w.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "HardDeviceStatusSubResponse: ret=" + paramInt1 + ",msg=" + paramString);
    }
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10967735861248L, 81716);
  }
  
  public final int getType()
  {
    GMTrace.i(10967870078976L, 81717);
    GMTrace.o(10967870078976L, 81717);
    return 1090;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */