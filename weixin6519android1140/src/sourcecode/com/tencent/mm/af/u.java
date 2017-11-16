package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akl;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  public String gxy;
  
  public final akl FC()
  {
    GMTrace.i(4538304036864L, 33813);
    if ((this.fUa != null) && (this.fUa.gtD.gtK != null))
    {
      akl localakl = (akl)this.fUa.gtD.gtK;
      GMTrace.o(4538304036864L, 33813);
      return localakl;
    }
    GMTrace.o(4538304036864L, 33813);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4538169819136L, 33812);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneKFGetDefaultList", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4538169819136L, 33812);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4537901383680L, 33810);
    w.i("MicroMsg.NetSceneKFGetDefaultList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4537901383680L, 33810);
  }
  
  public final int getType()
  {
    GMTrace.i(4538035601408L, 33811);
    GMTrace.o(4538035601408L, 33811);
    return 672;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */