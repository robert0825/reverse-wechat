package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aah;
import com.tencent.mm.protocal.c.aai;
import com.tencent.mm.sdk.platformtools.w;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public s(String paramString)
  {
    GMTrace.i(4580448403456L, 34127);
    b.a locala = new b.a();
    locala.gtF = new aah();
    locala.gtG = new aai();
    locala.uri = "/cgi-bin/mmocbiz-bin/getfavbizchatlist";
    locala.gtE = 1367;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((aah)this.fUa.gtC.gtK).tVU = paramString;
    GMTrace.o(4580448403456L, 34127);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4580851056640L, 34130);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneGetFavBizChatList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4580851056640L, 34130);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4580582621184L, 34128);
    w.d("MicroMsg.brandservice.NetSceneGetFavBizChatList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4580582621184L, 34128);
  }
  
  public final int getType()
  {
    GMTrace.i(4580716838912L, 34129);
    GMTrace.o(4580716838912L, 34129);
    return 1367;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */