package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class bf
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final a gox;
  private final String goy;
  private long goz;
  
  public bf(a parama)
  {
    this(parama, null);
    GMTrace.i(13475191455744L, 100398);
    GMTrace.o(13475191455744L, 100398);
  }
  
  public bf(a parama, String paramString)
  {
    GMTrace.i(13475325673472L, 100399);
    w.i("MicroMsg.NetSceneLocalProxy", "init LocalProxy task:%s [%s] ", new Object[] { paramString, bg.bQW() });
    this.gox = parama;
    this.goy = paramString;
    GMTrace.o(13475325673472L, 100399);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13475594108928L, 100401);
    c(parame);
    this.fUd = parame1;
    this.goz = bg.Pw();
    h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13478412681216L, 100422);
        bf.this.a(0, 0, 0, null, null, null);
        GMTrace.o(13478412681216L, 100422);
      }
      
      public final String toString()
      {
        GMTrace.i(13478546898944L, 100423);
        String str = super.toString() + "|doScene";
        GMTrace.o(13478546898944L, 100423);
        return str;
      }
    });
    GMTrace.o(13475594108928L, 100401);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13475728326656L, 100402);
    if (this.gox != null)
    {
      w.d("MicroMsg.NetSceneLocalProxy", "local proxy [%s] end, cost=%d", new Object[] { this.goy, Long.valueOf(bg.aI(this.goz)) });
      this.gox.a(this.gtW);
    }
    this.fUd.a(0, 0, null, this);
    GMTrace.o(13475728326656L, 100402);
  }
  
  public final int getType()
  {
    GMTrace.i(13475459891200L, 100400);
    GMTrace.o(13475459891200L, 100400);
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void a(com.tencent.mm.network.e parame);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */