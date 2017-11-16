package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.anc;
import com.tencent.mm.protocal.c.and;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eQd;
  private com.tencent.mm.ad.e fUd;
  private b gMj;
  private int gRP;
  public int gRj;
  public and gSe;
  public int scene;
  
  public n(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, long paramLong)
  {
    GMTrace.i(17862768984064L, 133088);
    this.scene = paramInt1;
    this.gRP = paramInt3;
    this.eQd = paramInt4;
    this.gRj = paramInt2;
    w.i("MicroMsg.FTS.NetSceneWebSearchGuide", "scene %d, h5Version=%d type=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).gtE = 1048;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchguide";
    ((b.a)localObject).gtF = new anc();
    ((b.a)localObject).gtG = new and();
    this.gMj = ((b.a)localObject).DA();
    localObject = (anc)this.gMj.gtC.gtK;
    ((anc)localObject).tOG = paramInt1;
    ((anc)localObject).uBR = paramInt3;
    ((anc)localObject).uBS = e.CO();
    ((anc)localObject).uBT = paramInt2;
    ((anc)localObject).kBh = paramString;
    ((anc)localObject).uBU = paramLong;
    GMTrace.o(17862768984064L, 133088);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1308622848000L, 9750);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(1308622848000L, 9750);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1308757065728L, 9751);
    w.i("MicroMsg.FTS.NetSceneWebSearchGuide", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(1308757065728L, 9751);
      return;
    }
    this.gSe = ((and)this.gMj.gtD.gtK);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1308757065728L, 9751);
  }
  
  public final int getType()
  {
    GMTrace.i(1308488630272L, 9749);
    GMTrace.o(1308488630272L, 9749);
    return 1048;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */