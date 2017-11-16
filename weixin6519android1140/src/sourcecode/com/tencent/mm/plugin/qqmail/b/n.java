package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bif;
import com.tencent.mm.protocal.c.big;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final boolean eWB;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private String nSP;
  
  public n(boolean paramBoolean, String paramString)
  {
    GMTrace.i(5459037650944L, 40673);
    this.nSP = "";
    this.eWB = paramBoolean;
    this.nSP = bg.nl(paramString);
    GMTrace.o(5459037650944L, 40673);
  }
  
  public final boolean DE()
  {
    GMTrace.i(5459306086400L, 40675);
    GMTrace.o(5459306086400L, 40675);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5459171868672L, 40674);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bif();
    ((b.a)localObject).gtG = new big();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/switchpushmail";
    ((b.a)localObject).gtE = 129;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bif)this.fUa.gtC.gtK;
    if (this.eWB) {}
    for (int i = 1;; i = 2)
    {
      ((bif)localObject).umZ = i;
      ((bif)localObject).uTK = this.nSP;
      this.fUd = parame1;
      i = a(parame, this.fUa, this);
      GMTrace.o(5459171868672L, 40674);
      return i;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5459574521856L, 40677);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (big)this.fUa.gtD.gtK;
      at.AR();
      c.xh().set(17, Integer.valueOf(paramq.umZ));
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5459574521856L, 40677);
  }
  
  public final int getType()
  {
    GMTrace.i(5459440304128L, 40676);
    GMTrace.o(5459440304128L, 40676);
    return 24;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */