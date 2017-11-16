package com.tencent.mm.plugin.setting.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aef;
import com.tencent.mm.protocal.c.aeg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  
  public c()
  {
    GMTrace.i(4590514733056L, 34202);
    GMTrace.o(4590514733056L, 34202);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4590917386240L, 34205);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new aef();
    parame1.gtG = new aeg();
    parame1.uri = "/cgi-bin/micromsg-bin/gettrustedfriends";
    parame1.gtE = 869;
    parame1.gtH = 0;
    parame1.gtH = 0;
    int i = a(parame, parame1.DA(), this);
    GMTrace.o(4590917386240L, 34205);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4590648950784L, 34203);
    this.gtY = paramInt1;
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      w.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4590648950784L, 34203);
  }
  
  public final int getType()
  {
    GMTrace.i(4590783168512L, 34204);
    GMTrace.o(4590783168512L, 34204);
    return 869;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */