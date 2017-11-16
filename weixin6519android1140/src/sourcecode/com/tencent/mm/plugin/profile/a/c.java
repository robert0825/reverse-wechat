package com.tencent.mm.plugin.profile.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bia;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6719073681408L, 50061);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bhz();
    ((b.a)localObject).gtG = new bia();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/switchbrand";
    ((b.a)localObject).gtE = 1394;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bhz)this.fUa.gtC.gtK;
    ((bhz)localObject).tVU = paramString;
    ((bhz)localObject).uTG = paramBoolean;
    GMTrace.o(6719073681408L, 50061);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6719476334592L, 50064);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneSwitchBrand", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(6719476334592L, 50064);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6719207899136L, 50062);
    w.d("MicroMsg.brandservice.NetSceneSwitchBrand", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(6719207899136L, 50062);
  }
  
  public final bhz aXA()
  {
    GMTrace.i(6719744770048L, 50066);
    if ((this.fUa != null) && (this.fUa.gtC.gtK != null))
    {
      bhz localbhz = (bhz)this.fUa.gtC.gtK;
      GMTrace.o(6719744770048L, 50066);
      return localbhz;
    }
    GMTrace.o(6719744770048L, 50066);
    return null;
  }
  
  public final bia aXz()
  {
    GMTrace.i(6719610552320L, 50065);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      bia localbia = (bia)this.fUa.gtD.gtK;
      GMTrace.o(6719610552320L, 50065);
      return localbia;
    }
    GMTrace.o(6719610552320L, 50065);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(6719342116864L, 50063);
    GMTrace.o(6719342116864L, 50063);
    return 1394;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\profile\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */