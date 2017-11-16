package com.tencent.mm.plugin.webwx.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.sg;
import com.tencent.mm.protocal.c.sh;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  final b gMj;
  
  public c(String paramString)
  {
    GMTrace.i(7659268866048L, 57066);
    b.a locala = new b.a();
    sg localsg = new sg();
    sh localsh = new sh();
    locala.gtF = localsg;
    locala.gtG = localsh;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmget";
    locala.gtE = 971;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gMj = locala.DA();
    localsg.uih = paramString;
    w.d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "[oneliang][NetSceneExtDeviceLoginConfirmGet]loginUrl:%s", new Object[] { paramString });
    GMTrace.o(7659268866048L, 57066);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7659537301504L, 57068);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(7659537301504L, 57068);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7659671519232L, 57069);
    w.d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7659671519232L, 57069);
  }
  
  public final int getType()
  {
    GMTrace.i(7659403083776L, 57067);
    GMTrace.o(7659403083776L, 57067);
    return 971;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */