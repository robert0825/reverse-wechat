package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.ayc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  extends p
  implements k, e
{
  private final q guL;
  private boolean kRT;
  private String kRY;
  
  public o(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(14539269603328L, 108326);
    this.kRT = false;
    this.kRY = "";
    this.guL = new f();
    j.a locala = (j.a)this.guL.DC();
    locala.kRM.uoX = p.kRZ;
    locala.kRM.uoY = paramLong;
    locala.kRM.uMy = paramString1;
    locala.kRM.uMz = paramString2;
    GMTrace.o(14539269603328L, 108326);
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(14539672256512L, 108329);
    int i = k.b.gum;
    GMTrace.o(14539672256512L, 108329);
    return i;
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(14539806474240L, 108330);
    GMTrace.o(14539806474240L, 108330);
  }
  
  public final boolean avR()
  {
    GMTrace.i(14539001167872L, 108324);
    GMTrace.o(14539001167872L, 108324);
    return true;
  }
  
  public final String avS()
  {
    GMTrace.i(14539135385600L, 108325);
    String str = this.kRY;
    GMTrace.o(14539135385600L, 108325);
    return str;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    boolean bool2 = true;
    GMTrace.i(14540074909696L, 108332);
    w.d("MicroMsg.NetSceneFaceRegFaceRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    paramq = (j.b)paramq.AZ();
    boolean bool1;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paramq.kRN.uMB == 0)
      {
        bool1 = true;
        this.kRT = bool1;
        this.kRY = paramq.kRN.uMA;
        i = paramq.kRN.uMB;
        boolean bool3 = this.kRT;
        paramInt2 = paramq.kRN.uMB;
        if (bg.nm(this.kRY)) {
          break label195;
        }
        bool1 = bool2;
        label132:
        w.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: is verify ok: %b, youtuRet; %d, has random pwd: %b", new Object[] { Boolean.valueOf(bool3), Integer.valueOf(paramInt2), Boolean.valueOf(bool1) });
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt1, i, paramString, this);
      GMTrace.o(14540074909696L, 108332);
      return;
      bool1 = false;
      break;
      label195:
      bool1 = false;
      break label132;
      i = paramInt2;
      if (paramq != null)
      {
        i = paramInt2;
        if (paramq.kRN != null)
        {
          i = paramInt2;
          if (paramq.kRN.uMB != 0)
          {
            w.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: has detail ret. use");
            i = paramq.kRN.uMB;
          }
        }
      }
    }
  }
  
  protected final apz f(q paramq)
  {
    GMTrace.i(14540343345152L, 108334);
    paramq = ((j.b)paramq.AZ()).kRN.upa;
    GMTrace.o(14540343345152L, 108334);
    return paramq;
  }
  
  final int g(com.tencent.mm.network.e parame)
  {
    GMTrace.i(14539403821056L, 108327);
    this.guL.DC();
    int i = a(parame, this.guL, this);
    GMTrace.o(14539403821056L, 108327);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(14539940691968L, 108331);
    GMTrace.o(14539940691968L, 108331);
    return 930;
  }
  
  protected final int vB()
  {
    GMTrace.i(14539538038784L, 108328);
    GMTrace.o(14539538038784L, 108328);
    return 3;
  }
  
  final void xv(String paramString)
  {
    GMTrace.i(14540209127424L, 108333);
    ((j.a)this.guL.DC()).kRM.uoX = paramString;
    GMTrace.o(14540209127424L, 108333);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */