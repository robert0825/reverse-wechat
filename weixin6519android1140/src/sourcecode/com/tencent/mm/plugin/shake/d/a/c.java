package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ard;
import com.tencent.mm.protocal.c.are;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(int paramInt, String paramString)
  {
    GMTrace.i(6593580105728L, 49126);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ard();
    ((b.a)localObject).gtG = new are();
    ((b.a)localObject).uri = "/cgi-bin/mmoctv/optvhist";
    ((b.a)localObject).gtE = 1740;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ard)this.fUa.gtC.gtK;
    ((ard)localObject).lQF = paramInt;
    ((ard)localObject).uHq = paramString;
    GMTrace.o(6593580105728L, 49126);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6593982758912L, 49129);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6593982758912L, 49129);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6593714323456L, 49127);
    w.i("MicroMsg.NetSceneOpTvHist", "onGYNetEnd [%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6593714323456L, 49127);
  }
  
  public final int getType()
  {
    GMTrace.i(6593848541184L, 49128);
    GMTrace.o(6593848541184L, 49128);
    return 1740;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */