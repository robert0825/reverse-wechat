package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.l;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsimple.m;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.aho;
import com.tencent.mm.protocal.c.apx;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.hz;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class p
  extends l
  implements com.tencent.mm.network.k
{
  public static String kRZ;
  protected com.tencent.mm.ad.e fUd;
  
  static
  {
    GMTrace.i(5942087254016L, 44272);
    kRZ = null;
    GMTrace.o(5942087254016L, 44272);
  }
  
  public p()
  {
    GMTrace.i(14540477562880L, 108335);
    this.fUd = null;
    GMTrace.o(14540477562880L, 108335);
  }
  
  protected static String Hx()
  {
    GMTrace.i(5940476641280L, 44260);
    String str = kRZ;
    GMTrace.o(5940476641280L, 44260);
    return str;
  }
  
  public static void xw(String paramString)
  {
    GMTrace.i(5940610859008L, 44261);
    kRZ = paramString;
    GMTrace.o(5940610859008L, 44261);
  }
  
  public final void DK()
  {
    GMTrace.i(14541148651520L, 108340);
    if (this.fUd != null) {
      this.fUd.a(3, -1, "", this);
    }
    GMTrace.o(14541148651520L, 108340);
  }
  
  public final com.tencent.mm.ad.e DL()
  {
    GMTrace.i(14541282869248L, 108341);
    com.tencent.mm.ad.e locale = this.fUd;
    GMTrace.o(14541282869248L, 108341);
    return locale;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5941013512192L, 44264);
    this.fUd = parame1;
    if (!bg.nm(kRZ))
    {
      w.i("MicroMsg.NetSceneFaceRsaBase", "hy: has ticket: %s", new Object[] { kRZ });
      xv(kRZ);
      i = g(parame);
      GMTrace.o(5941013512192L, 44264);
      return i;
    }
    int i = getType();
    GMTrace.o(5941013512192L, 44264);
    return i;
  }
  
  public final void a(final int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(14541417086976L, 108342);
    w.i("MicroMsg.NetSceneFaceRsaBase", "hy: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 4) && (paramInt2 == -102))
    {
      paramInt1 = paramq.DC().tKq.ver;
      w.d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5938194939904L, 44243);
          new m().a(p.a(p.this), new com.tencent.mm.ad.e()
          {
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              GMTrace.i(5945845350400L, 44300);
              w.d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramAnonymous2k.getType()), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2) });
              if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
              {
                w.e("MicroMsg.NetSceneFaceRsaBase", "hy: do scene err in rsa when get cert. clear ticket");
                p.kRZ = null;
                p.this.xv(p.Hx());
                p.this.fUd.a(paramAnonymous2Int1, paramAnonymous2Int2, "", p.this);
                GMTrace.o(5945845350400L, 44300);
                return;
              }
              p.this.g(p.b(p.this));
              GMTrace.o(5945845350400L, 44300);
            }
          });
          GMTrace.o(5938194939904L, 44243);
        }
      });
      GMTrace.o(14541417086976L, 108342);
      return;
    }
    c(paramInt1, paramInt2, paramString, paramq);
    GMTrace.o(14541417086976L, 108342);
  }
  
  public final hz c(q paramq)
  {
    GMTrace.i(14540745998336L, 108337);
    paramq = f(paramq);
    if (paramq != null)
    {
      paramq = paramq.tUT;
      GMTrace.o(14540745998336L, 108337);
      return paramq;
    }
    GMTrace.o(14540745998336L, 108337);
    return null;
  }
  
  abstract void c(int paramInt1, int paramInt2, String paramString, q paramq);
  
  public final apx d(q paramq)
  {
    GMTrace.i(14540880216064L, 108338);
    paramq = f(paramq);
    if (paramq != null)
    {
      paramq = paramq.tUU;
      GMTrace.o(14540880216064L, 108338);
      return paramq;
    }
    GMTrace.o(14540880216064L, 108338);
    return null;
  }
  
  public final aho e(q paramq)
  {
    GMTrace.i(14541014433792L, 108339);
    paramq = f(paramq);
    if (paramq != null)
    {
      paramq = paramq.tUS;
      GMTrace.o(14541014433792L, 108339);
      return paramq;
    }
    GMTrace.o(14541014433792L, 108339);
    return null;
  }
  
  protected abstract apz f(q paramq);
  
  abstract int g(com.tencent.mm.network.e parame);
  
  abstract void xv(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */