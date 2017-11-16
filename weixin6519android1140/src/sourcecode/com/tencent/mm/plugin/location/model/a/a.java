package com.tencent.mm.plugin.location.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.rw;
import com.tencent.mm.protocal.c.rx;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  private Runnable gVd;
  
  public a(String paramString)
  {
    GMTrace.i(9639383007232L, 71819);
    b.a locala = new b.a();
    locala.gtF = new rw();
    locala.gtG = new rx();
    locala.uri = "/cgi-bin/micromsg-bin/exittrackroom";
    locala.gtE = 491;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((rw)this.fUa.gtC.gtK).uif = paramString;
    w.d("MicroMsg.NetSceneExitTrackRoom", "trackRoomId:" + paramString);
    GMTrace.o(9639383007232L, 71819);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9639651442688L, 71821);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9639651442688L, 71821);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9639785660416L, 71822);
    w.d("MicroMsg.NetSceneExitTrackRoom", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.gVd != null) {
      this.gVd.run();
    }
    GMTrace.o(9639785660416L, 71822);
  }
  
  public final int getType()
  {
    GMTrace.i(9639517224960L, 71820);
    GMTrace.o(9639517224960L, 71820);
    return 491;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */