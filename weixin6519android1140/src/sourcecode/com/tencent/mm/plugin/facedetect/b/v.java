package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.jy;
import com.tencent.mm.protocal.c.xf;
import com.tencent.mm.sdk.platformtools.w;

public final class v
  extends p
  implements k, b
{
  private final q guL;
  private long kSe;
  private byte[] kSf;
  
  public v(int paramInt)
  {
    GMTrace.i(14542625046528L, 108351);
    this.kSe = -1L;
    this.kSf = null;
    this.guL = new h();
    i.a locala = (i.a)this.guL.DC();
    locala.kRK.uoX = p.kRZ;
    locala.kRK.jib = 1;
    locala.kRK.tOG = paramInt;
    GMTrace.o(14542625046528L, 108351);
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(5945040044032L, 44294);
    int i = k.b.gum;
    GMTrace.o(5945040044032L, 44294);
    return i;
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(5945174261760L, 44295);
    GMTrace.o(5945174261760L, 44295);
  }
  
  public final long avP()
  {
    GMTrace.i(5944368955392L, 44289);
    long l = this.kSe;
    GMTrace.o(5944368955392L, 44289);
    return l;
  }
  
  public final byte[] avQ()
  {
    GMTrace.i(5944503173120L, 44290);
    byte[] arrayOfByte = this.kSf;
    GMTrace.o(5944503173120L, 44290);
    return arrayOfByte;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(5945442697216L, 44297);
    w.d("MicroMsg.NetSceneGetBioConfigRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    long l;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      i.b localb = (i.b)paramq.AZ();
      this.kSe = localb.kRL.uoY;
      if (localb.kRL.uoZ != null) {
        this.kSf = localb.kRL.uoZ.tJp;
      }
      if (localb.kRL.upb != null)
      {
        Object localObject1 = null;
        paramq = (q)localObject1;
        if (localb.kRL.upb.uaD != null)
        {
          paramq = (q)localObject1;
          if (localb.kRL.upb.uaD.uNN > 0)
          {
            w.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd cdnrule:%d", new Object[] { Integer.valueOf(localb.kRL.upb.uaD.uNN) });
            paramq = n.a(localb.kRL.upb.uaD);
          }
        }
        Object localObject2 = null;
        localObject1 = localObject2;
        if (localb.kRL.upb.uaE != null)
        {
          localObject1 = localObject2;
          if (localb.kRL.upb.uaE.uNN > 0)
          {
            w.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd safecdnrule:%d", new Object[] { Integer.valueOf(localb.kRL.upb.uaE.uNN) });
            localObject1 = n.a(localb.kRL.upb.uaE);
          }
        }
        g.Gl().a(localb.kRL.upb.uaA, localb.kRL.upb.uaB, localb.kRL.upb.uaC, paramq, (byte[])localObject1, localb.kRL.upb.uaF);
      }
      l = this.kSe;
      if (this.kSf != null) {
        break label405;
      }
    }
    label405:
    for (int i = 0;; i = this.kSf.length)
    {
      w.i("MicroMsg.NetSceneGetBioConfigRsa", "hy: get bio config: bioId: %s, bioConfigSize: %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
      this.fUd.a(paramInt1, paramInt2, paramString, this);
      GMTrace.o(5945442697216L, 44297);
      return;
    }
  }
  
  protected final apz f(q paramq)
  {
    GMTrace.i(14542759264256L, 108352);
    paramq = ((i.b)paramq.AZ()).kRL.upa;
    GMTrace.o(14542759264256L, 108352);
    return paramq;
  }
  
  final int g(com.tencent.mm.network.e parame)
  {
    GMTrace.i(5944771608576L, 44292);
    int i = a(parame, this.guL, this);
    GMTrace.o(5944771608576L, 44292);
    return i;
  }
  
  public final int getType()
  {
    GMTrace.i(5945308479488L, 44296);
    GMTrace.o(5945308479488L, 44296);
    return 733;
  }
  
  protected final int vB()
  {
    GMTrace.i(5944905826304L, 44293);
    GMTrace.o(5944905826304L, 44293);
    return 3;
  }
  
  final void xv(String paramString)
  {
    GMTrace.i(5945576914944L, 44298);
    ((i.a)this.guL.DC()).kRK.uoX = paramString;
    GMTrace.o(5945576914944L, 44298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */