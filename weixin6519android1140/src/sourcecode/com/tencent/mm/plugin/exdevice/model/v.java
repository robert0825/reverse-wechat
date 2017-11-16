package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.bbd;
import com.tencent.mm.protocal.c.bbe;
import com.tencent.mm.sdk.platformtools.w;

public final class v
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public v(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(10976325795840L, 81780);
    this.fUd = null;
    this.fUa = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bbd();
    ((b.a)localObject).gtG = new bbe();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/searchwifiharddevice";
    ((b.a)localObject).gtE = 1270;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bbd)this.fUa.gtC.gtK;
    ((bbd)localObject).tUt = new agx();
    ((bbd)localObject).tUt.tSz = paramString1;
    ((bbd)localObject).tUt.jhl = paramString2;
    ((bbd)localObject).uOx = paramString3;
    GMTrace.o(10976325795840L, 81780);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10976728449024L, 81783);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10976728449024L, 81783);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10976460013568L, 81781);
    w.i("MicroMsg.exdevice.NetSceneSearchWiFiHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10976460013568L, 81781);
  }
  
  public final int getType()
  {
    GMTrace.i(10976594231296L, 81782);
    GMTrace.o(10976594231296L, 81782);
    return 1270;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */