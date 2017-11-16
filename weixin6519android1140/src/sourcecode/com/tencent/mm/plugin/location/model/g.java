package com.tencent.mm.plugin.location.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abl;
import com.tencent.mm.protocal.c.abm;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private byte[] mwU;
  String mwV;
  
  public g(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    GMTrace.i(9642872668160L, 71845);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new abl();
    ((b.a)localObject).gtG = new abm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlocimg";
    ((b.a)localObject).gtE = 648;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (abl)this.fUa.gtC.gtK;
    ((abl)localObject).kBh = paramString2;
    if (bg.Jw()) {}
    for (((abl)localObject).usd = 1;; ((abl)localObject).usd = 0)
    {
      ((abl)localObject).tYz = paramFloat1;
      ((abl)localObject).tYy = paramFloat2;
      ((abl)localObject).use = paramInt1;
      w.i("MicroMsg.NetSceneGetLocImg", "src w %d h %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      while (paramInt2 * paramInt3 > 270000)
      {
        paramInt2 = (int)(paramInt2 / 1.2D);
        paramInt3 = (int)(paramInt3 / 1.2D);
      }
    }
    w.i("MicroMsg.NetSceneGetLocImg", "NetSceneGetLocImg %f %f %d w = %d h = %d lan=%s", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), ((abl)localObject).kBh });
    ((abl)localObject).Height = paramInt3;
    ((abl)localObject).Width = paramInt2;
    this.mwV = paramString1;
    GMTrace.o(9642872668160L, 71845);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9643141103616L, 71847);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9643141103616L, 71847);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9643275321344L, 71848);
    w.d("MicroMsg.NetSceneGetLocImg", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (abm)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    try
    {
      this.mwU = paramq.tQa.uNP.tJp;
      com.tencent.mm.a.e.b(this.mwV, this.mwU, this.mwU.length);
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(9643275321344L, 71848);
      return;
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneGetLocImg", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(9643006885888L, 71846);
    GMTrace.o(9643006885888L, 71846);
    return 648;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */