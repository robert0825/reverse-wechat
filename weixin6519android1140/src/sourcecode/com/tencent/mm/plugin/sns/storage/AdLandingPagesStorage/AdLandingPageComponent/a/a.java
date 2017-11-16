package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lc;
import com.tencent.mm.protocal.c.ld;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(8219091009536L, 61237);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new lc();
    ((b.a)localObject).gtG = new ld();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo";
    ((b.a)localObject).gtE = 1210;
    this.fUa = ((b.a)localObject).DA();
    localObject = (lc)this.fUa.gtC.gtK;
    ((lc)localObject).ubN = paramString2;
    ((lc)localObject).ubK = paramString1;
    ((lc)localObject).ubO = bg.bRb();
    GMTrace.o(8219091009536L, 61237);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8219493662720L, 61240);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8219493662720L, 61240);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8219225227264L, 61238);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(8219225227264L, 61238);
  }
  
  public final int getType()
  {
    GMTrace.i(8219359444992L, 61239);
    int i = this.fUa.gtE;
    GMTrace.o(8219359444992L, 61239);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */