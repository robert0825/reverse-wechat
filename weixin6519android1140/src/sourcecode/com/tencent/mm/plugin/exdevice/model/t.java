package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bag;
import com.tencent.mm.protocal.c.bah;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public t(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10943174017024L, 81533);
    this.fUd = null;
    this.fUa = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bag();
    ((b.a)localObject).gtG = new bah();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/searchbleharddevice";
    ((b.a)localObject).gtE = 1706;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bag)this.fUa.gtC.gtK;
    ((bag)localObject).mac = paramString1;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    ((bag)localObject).userName = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null) {
      paramString1 = "";
    }
    ((bag)localObject).category = paramString1;
    GMTrace.o(10943174017024L, 81533);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10943710887936L, 81537);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10943710887936L, 81537);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10943308234752L, 81534);
    w.i("MicroMsg.exdevice.NetSceneSearchBLEHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10943308234752L, 81534);
  }
  
  public final bah atN()
  {
    GMTrace.i(10943576670208L, 81536);
    bah localbah = (bah)this.fUa.gtD.gtK;
    GMTrace.o(10943576670208L, 81536);
    return localbah;
  }
  
  public final int getType()
  {
    GMTrace.i(10943442452480L, 81535);
    GMTrace.o(10943442452480L, 81535);
    return 1706;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */