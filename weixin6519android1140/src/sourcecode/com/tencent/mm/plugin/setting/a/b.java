package com.tencent.mm.plugin.setting.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.vl;
import com.tencent.mm.protocal.c.vm;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString)
  {
    GMTrace.i(4591588474880L, 34210);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new vl();
    ((b.a)localObject).gtG = new vm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/generalset";
    ((b.a)localObject).gtE = 177;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (vl)this.fUa.gtC.gtK;
    ((vl)localObject).ugX = 1;
    ((vl)localObject).unH = paramString;
    GMTrace.o(4591588474880L, 34210);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4591722692608L, 34211);
    w.d("MicroMsg.NetSceneGeneralSet", "doScene");
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4591722692608L, 34211);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4591991128064L, 34213);
    w.d("MicroMsg.NetSceneGeneralSet", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4591991128064L, 34213);
  }
  
  public final int getType()
  {
    GMTrace.i(4591856910336L, 34212);
    GMTrace.o(4591856910336L, 34212);
    return 177;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */