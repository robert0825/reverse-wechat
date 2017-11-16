package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.u;
import com.tencent.mm.protocal.c.v;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private u hpr;
  public v hps;
  
  public j(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(15032251318272L, 111999);
    b.a locala = new b.a();
    locala.gtF = new u();
    locala.gtG = new v();
    locala.gtE = 1695;
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerydetail";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.hpr = ((u)this.gUL.gtC.gtK);
    this.hpr.tLZ = paramString1;
    this.hpr.scene = paramInt1;
    this.hpr.tMa = paramString2;
    if (paramInt1 == 5)
    {
      w.i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
      this.hpr.sign = paramString3;
      this.hpr.ver = paramInt2;
    }
    w.i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
    GMTrace.o(15032251318272L, 111999);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5599563612160L, 41720);
    w.i("MicroMsg.NetSceneAAQueryDetail", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5599563612160L, 41720);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5599295176704L, 41718);
    w.i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.hps = ((v)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hps.jWs), this.hps.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5599295176704L, 41718);
  }
  
  public final int getType()
  {
    GMTrace.i(5599429394432L, 41719);
    GMTrace.o(5599429394432L, 41719);
    return 1695;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\aa\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */