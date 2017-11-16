package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amg;
import com.tencent.mm.protocal.c.amh;
import com.tencent.mm.sdk.platformtools.w;

public final class ak
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ak(int paramInt)
  {
    GMTrace.i(1348351295488L, 10046);
    b.a locala = new b.a();
    locala.gtF = new amg();
    locala.gtG = new amh();
    locala.uri = "/cgi-bin/micromsg-bin/logoutwebwx";
    locala.gtE = 281;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((amg)this.fUa.gtC.gtK).tMX = paramInt;
    GMTrace.o(1348351295488L, 10046);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1348619730944L, 10048);
    w.d("MicroMsg.NetSceneWebWXLogout", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1348619730944L, 10048);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1348753948672L, 10049);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      w.d("MicroMsg.NetSceneWebWXLogout", "logout Error. ");
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(1348753948672L, 10049);
  }
  
  public final int getType()
  {
    GMTrace.i(1348485513216L, 10047);
    GMTrace.o(1348485513216L, 10047);
    return 281;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */