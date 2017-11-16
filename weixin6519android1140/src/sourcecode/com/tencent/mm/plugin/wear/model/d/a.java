package com.tencent.mm.plugin.wear.model.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahc;
import com.tencent.mm.protocal.c.ahd;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eEl;
  public String esG;
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gMj;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(9180224159744L, 68398);
    this.esG = paramString1;
    this.eEl = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).gtE = 1091;
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/register";
    ((b.a)localObject).gtF = new ahc();
    ((b.a)localObject).gtG = new ahd();
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gMj = ((b.a)localObject).DA();
    localObject = (ahc)this.gMj.gtC.gtK;
    ((ahc)localObject).tTB = new com.tencent.mm.bm.b(paramString1.getBytes());
    ((ahc)localObject).tTD = new com.tencent.mm.bm.b(paramString2.getBytes());
    ((ahc)localObject).uwC = new com.tencent.mm.bm.b("5".getBytes());
    GMTrace.o(9180224159744L, 68398);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9180492595200L, 68400);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(9180492595200L, 68400);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9180626812928L, 68401);
    w.i("MicroMsg.Wear.NetSceneBizDeviceAuth", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9180626812928L, 68401);
  }
  
  public final int getType()
  {
    GMTrace.i(9180358377472L, 68399);
    GMTrace.o(9180358377472L, 68399);
    return 1091;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */