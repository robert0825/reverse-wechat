package com.tencent.mm.plugin.exdevice.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.protocal.c.bjr;
import com.tencent.mm.protocal.c.bjs;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String esG;
  b fUa;
  private com.tencent.mm.ad.e fUd;
  public int kzV;
  
  public n(ahr paramahr, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(10975520489472L, 81774);
    this.fUd = null;
    this.fUa = null;
    this.esG = null;
    this.kzV = 0;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bjr();
    ((b.a)localObject).gtG = new bjs();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/transfermsgtodevice";
    ((b.a)localObject).gtE = 1717;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bjr)this.fUa.gtC.gtK;
    ((bjr)localObject).tSz = paramString1;
    ((bjr)localObject).ueB = paramString2;
    ((bjr)localObject).uUD = paramahr;
    ((bjr)localObject).uUE = paramInt;
    this.esG = paramString2;
    this.kzV = paramInt;
    GMTrace.o(10975520489472L, 81774);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10975923142656L, 81777);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(10975923142656L, 81777);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10975654707200L, 81775);
    w.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(10975654707200L, 81775);
  }
  
  public final int getType()
  {
    GMTrace.i(10975788924928L, 81776);
    GMTrace.o(10975788924928L, 81776);
    return 1717;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */