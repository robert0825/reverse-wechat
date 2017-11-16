package com.tencent.mm.plugin.location.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.protocal.c.akd;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eAR;
  public int errCode;
  public int errType;
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private Runnable gVd;
  public String jWP;
  public String mwF;
  
  public b(String paramString)
  {
    GMTrace.i(9638846136320L, 71815);
    this.mwF = "";
    b.a locala = new b.a();
    locala.gtF = new akc();
    locala.gtG = new akd();
    locala.uri = "/cgi-bin/micromsg-bin/jointrackroom";
    locala.gtE = 490;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((akc)this.fUa.gtC.gtK).uzE = paramString;
    w.d("MicroMsg.NetSceneJoinTrackRoom", "chatNameId:" + paramString);
    GMTrace.o(9638846136320L, 71815);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9639114571776L, 71817);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9639114571776L, 71817);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9639248789504L, 71818);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    this.eAR = paramString;
    if (((com.tencent.mm.ad.b)paramq).gtD.gtK != null) {}
    for (paramq = (akd)((com.tencent.mm.ad.b)paramq).gtD.gtK;; paramq = null)
    {
      w.d("MicroMsg.NetSceneJoinTrackRoom", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      if (((paramInt3 == 0) || (paramInt3 >= 1000)) && (paramq != null))
      {
        this.mwF = paramq.uif;
        w.d("MicroMsg.NetSceneJoinTrackRoom", "get trackRoomid %s", new Object[] { this.mwF });
      }
      if (paramq != null) {
        this.jWP = paramq.tYR;
      }
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      if (this.gVd != null) {
        this.gVd.run();
      }
      GMTrace.o(9639248789504L, 71818);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(9638980354048L, 71816);
    GMTrace.o(9638980354048L, 71816);
    return 490;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */