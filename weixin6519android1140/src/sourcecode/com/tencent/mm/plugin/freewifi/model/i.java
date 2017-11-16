package com.tencent.mm.plugin.freewifi.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bn;
import com.tencent.mm.protocal.c.bo;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String eSd;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  private i()
  {
    GMTrace.i(7135417073664L, 53163);
    b.a locala = new b.a();
    locala.gtF = new bn();
    locala.gtG = new bo();
    locala.uri = "/cgi-bin/mmo2o-bin/addcontact";
    locala.gtE = 1703;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(7135417073664L, 53163);
  }
  
  public i(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this();
    GMTrace.i(7135551291392L, 53164);
    this.eSd = paramString1;
    bn localbn = (bn)this.fUa.gtC.gtK;
    localbn.lTf = paramString1;
    localbn.lPM = paramString2;
    localbn.tMZ = paramInt;
    localbn.tNa = paramString3;
    w.i("MicroMsg.FreeWifi.NetSceneAddContact", "appid = %s", new Object[] { paramString1 });
    GMTrace.o(7135551291392L, 53164);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7135953944576L, 53167);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7135953944576L, 53167);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7135685509120L, 53165);
    w.i("MicroMsg.FreeWifi.NetSceneAddContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.eSd });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(7135685509120L, 53165);
  }
  
  public final int getType()
  {
    GMTrace.i(7135819726848L, 53166);
    GMTrace.o(7135819726848L, 53166);
    return 1703;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */