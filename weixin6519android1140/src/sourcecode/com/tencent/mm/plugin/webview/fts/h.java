package com.tencent.mm.plugin.webview.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.az.a;
import com.tencent.mm.az.c;
import com.tencent.mm.az.e.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends a
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public h(e.b paramb)
  {
    GMTrace.i(20495852371968L, 152706);
    this.gRa = paramb.eBj;
    this.vq = paramb.offset;
    this.gRb = paramb.scene;
    this.gQZ = paramb.eQd;
    Object localObject = new b.a();
    ((b.a)localObject).gtE = 1943;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/mmwebrecommend";
    ((b.a)localObject).gtF = new bth();
    ((b.a)localObject).gtG = new bti();
    this.fUa = ((b.a)localObject).DA();
    localObject = (bth)this.fUa.gtC.gtK;
    ((bth)localObject).tWu = paramb.offset;
    ((bth)localObject).uBR = c.GL();
    ((bth)localObject).uMX = paramb.gRi;
    ((bth)localObject).unf = paramb.eBj;
    ((bth)localObject).uBS = com.tencent.mm.az.e.CO();
    ((bth)localObject).tOG = paramb.scene;
    ((bth)localObject).tXx = paramb.gRm;
    ((bth)localObject).vca = paramb.gRn;
    ((bth)localObject).vaU = paramb.gRs;
    ((bth)localObject).vcb = paramb.gRw;
    ((bth)localObject).vaX = com.tencent.mm.az.e.gN(paramb.scene);
    GMTrace.o(20495852371968L, 152706);
  }
  
  private bti bBN()
  {
    GMTrace.i(20496389242880L, 152710);
    bti localbti = (bti)this.fUa.gtD.gtK;
    GMTrace.o(20496389242880L, 152710);
    return localbti;
  }
  
  public final String CM()
  {
    GMTrace.i(20496523460608L, 152711);
    if (bBN() != null)
    {
      String str = bBN().tWC;
      GMTrace.o(20496523460608L, 152711);
      return str;
    }
    GMTrace.o(20496523460608L, 152711);
    return "";
  }
  
  public final int CN()
  {
    GMTrace.i(20496657678336L, 152712);
    if (bBN() != null)
    {
      int i = bBN().vbd;
      GMTrace.o(20496657678336L, 152712);
      return i;
    }
    GMTrace.o(20496657678336L, 152712);
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20496120807424L, 152708);
    com.tencent.mm.az.k.aX(this.gRb, 2);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(20496120807424L, 152708);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20496255025152L, 152709);
    w.i("MicroMsg.FTS.NetSceneWebRecommend", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (paramInt3 == -1) {
      com.tencent.mm.az.k.aX(this.gRb, 4);
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(20496255025152L, 152709);
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        com.tencent.mm.az.k.aX(this.gRb, 8);
      } else {
        com.tencent.mm.az.k.aX(this.gRb, 3);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(20495986589696L, 152707);
    GMTrace.o(20495986589696L, 152707);
    return 1943;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */