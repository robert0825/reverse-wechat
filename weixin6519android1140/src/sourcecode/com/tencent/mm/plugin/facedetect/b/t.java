package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.bnc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends p
  implements k, e
{
  private final q guL;
  private boolean kRT;
  private String kRY;
  
  public t(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(14536987901952L, 108309);
    this.kRT = false;
    this.kRY = "";
    this.guL = new g();
    k.a locala = (k.a)this.guL.DC();
    locala.kRO.uoX = p.kRZ;
    locala.kRO.uoY = paramLong;
    locala.kRO.uMz = paramString2;
    locala.kRO.uMy = paramString1;
    GMTrace.o(14536987901952L, 108309);
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(14537390555136L, 108312);
    int i = com.tencent.mm.ad.k.b.gum;
    GMTrace.o(14537390555136L, 108312);
    return i;
  }
  
  protected final void a(com.tencent.mm.ad.k.a parama)
  {
    GMTrace.i(14537524772864L, 108313);
    GMTrace.o(14537524772864L, 108313);
  }
  
  public final boolean avR()
  {
    GMTrace.i(14536719466496L, 108307);
    GMTrace.o(14536719466496L, 108307);
    return true;
  }
  
  public final String avS()
  {
    GMTrace.i(14536853684224L, 108308);
    String str = this.kRY;
    GMTrace.o(14536853684224L, 108308);
    return str;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(14537793208320L, 108315);
    w.d("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    paramq = (k.b)paramq.AZ();
    boolean bool1;
    label118:
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paramq.kRP.uMB == 0)
      {
        bool1 = true;
        this.kRT = bool1;
        this.kRY = paramq.kRP.uMA;
        boolean bool2 = this.kRT;
        paramInt2 = paramq.kRP.uMB;
        if (bg.nm(this.kRY)) {
          break label191;
        }
        bool1 = true;
        w.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: is verify ok: %b, youtuRet: %d, has random pwd: %b", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(paramInt2), Boolean.valueOf(bool1) });
        i = paramq.kRP.uMB;
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt1, i, paramString, this);
      GMTrace.o(14537793208320L, 108315);
      return;
      bool1 = false;
      break;
      label191:
      bool1 = false;
      break label118;
      i = paramInt2;
      if (paramq != null)
      {
        i = paramInt2;
        if (paramq.kRP != null)
        {
          i = paramInt2;
          if (paramq.kRP.uMB != 0)
          {
            w.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: has detail ret. use");
            i = paramq.kRP.uMB;
          }
        }
      }
    }
  }
  
  protected final apz f(q paramq)
  {
    GMTrace.i(14538061643776L, 108317);
    paramq = ((k.b)paramq.AZ()).kRP.upa;
    GMTrace.o(14538061643776L, 108317);
    return paramq;
  }
  
  final int g(com.tencent.mm.network.e parame)
  {
    GMTrace.i(14537122119680L, 108310);
    this.guL.DC();
    int i = a(parame, this.guL, this);
    GMTrace.o(14537122119680L, 108310);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(14537658990592L, 108314);
    GMTrace.o(14537658990592L, 108314);
    return 930;
  }
  
  protected final int vB()
  {
    GMTrace.i(14537256337408L, 108311);
    GMTrace.o(14537256337408L, 108311);
    return 3;
  }
  
  final void xv(String paramString)
  {
    GMTrace.i(14537927426048L, 108316);
    ((k.a)this.guL.DC()).kRO.uoX = paramString;
    GMTrace.o(14537927426048L, 108316);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */