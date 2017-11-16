package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amv;
import com.tencent.mm.protocal.c.amw;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public e(String paramString)
  {
    GMTrace.i(10841839632384L, 80778);
    b.a locala = new b.a();
    locala.gtF = new amv();
    locala.gtG = new amw();
    locala.uri = "/cgi-bin/mmbiz-bin/usrmsg/getallrecvtmpmsgoption";
    locala.gtE = 1031;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((amv)this.fUa.gtC.gtK).uxu = paramString;
    GMTrace.o(10841839632384L, 80778);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10842242285568L, 80781);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(10842242285568L, 80781);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10841973850112L, 80779);
    w.d("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10841973850112L, 80779);
  }
  
  public final int getType()
  {
    GMTrace.i(10842108067840L, 80780);
    GMTrace.o(10842108067840L, 80780);
    return 1031;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */