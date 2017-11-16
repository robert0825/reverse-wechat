package com.tencent.mm.plugin.voip.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.bm.a;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.voip.model.f;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public abstract class n<REQ, RESP>
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected b fUa;
  public com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.e lqP;
  protected com.tencent.mm.plugin.voip.model.e qFK;
  
  public n()
  {
    GMTrace.i(5290057531392L, 39414);
    this.qFK = f.btX();
    GMTrace.o(5290057531392L, 39414);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5290862837760L, 39420);
    int i = bve();
    if (i != 0)
    {
      GMTrace.o(5290862837760L, 39420);
      return i;
    }
    this.lqP = parame1;
    this.fUd = bvd();
    i = a(parame, this.fUa, this);
    GMTrace.o(5290862837760L, 39420);
    return i;
  }
  
  public final void a(int paramInt1, final int paramInt2, final int paramInt3, final String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5290191749120L, 39415);
    dp(paramInt2, paramInt3);
    if (this.lqP != null) {
      this.lqP.a(paramInt2, paramInt3, paramString, this);
    }
    if (this.fUd != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5292876103680L, 39435);
          if (n.this.fUd != null) {
            n.this.fUd.a(paramInt2, paramInt3, paramString, n.this);
          }
          GMTrace.o(5292876103680L, 39435);
        }
      });
    }
    GMTrace.o(5290191749120L, 39415);
  }
  
  public abstract com.tencent.mm.ad.e bvd();
  
  public int bve()
  {
    GMTrace.i(5290460184576L, 39417);
    GMTrace.o(5290460184576L, 39417);
    return 0;
  }
  
  public final void bvg()
  {
    GMTrace.i(5290728620032L, 39419);
    w.d("MicroMsg.VoipNetSceneBase", "netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    at.wS().a(this, 0);
    GMTrace.o(5290728620032L, 39419);
  }
  
  public final <RESP> RESP bvh()
  {
    GMTrace.i(5290997055488L, 39421);
    a locala = this.fUa.gtD.gtK;
    GMTrace.o(5290997055488L, 39421);
    return locala;
  }
  
  public final <REQ> REQ bvi()
  {
    GMTrace.i(5291131273216L, 39422);
    a locala = this.fUa.gtC.gtK;
    GMTrace.o(5291131273216L, 39422);
    return locala;
  }
  
  public void dp(int paramInt1, int paramInt2)
  {
    GMTrace.i(5290594402304L, 39418);
    GMTrace.o(5290594402304L, 39418);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */