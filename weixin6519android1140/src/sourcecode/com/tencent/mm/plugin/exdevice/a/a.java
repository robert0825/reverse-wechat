package com.tencent.mm.plugin.exdevice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a<RequestType extends com.tencent.mm.bm.a, ResponseType extends com.tencent.mm.bm.a>
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  protected b kwL;
  
  public a()
  {
    GMTrace.i(11205972328448L, 83491);
    GMTrace.o(11205972328448L, 83491);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11206911852544L, 83498);
    this.fXo = parame1;
    if (this.kwL == null)
    {
      parame1 = new b.a();
      parame1.gtE = getType();
      parame1.uri = getUri();
      parame1.gtF = atj();
      parame1.gtG = atk();
      parame1.gtH = 0;
      parame1.gtI = 0;
      this.kwL = parame1.DA();
      c(this.kwL.gtC.gtK);
    }
    int i = a(parame, this.kwL, this);
    GMTrace.o(11206911852544L, 83498);
    return i;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11206777634816L, 83497);
    w.i("MicroMsg.BaseNetScene", "onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11206777634816L, 83497);
  }
  
  public final ResponseType afr()
  {
    GMTrace.i(11206643417088L, 83496);
    if ((this.kwL != null) && (this.kwL.gtD.gtK != null))
    {
      com.tencent.mm.bm.a locala = this.kwL.gtD.gtK;
      GMTrace.o(11206643417088L, 83496);
      return locala;
    }
    GMTrace.o(11206643417088L, 83496);
    return null;
  }
  
  public abstract RequestType atj();
  
  public abstract ResponseType atk();
  
  public void c(RequestType paramRequestType)
  {
    GMTrace.i(11206509199360L, 83495);
    GMTrace.o(11206509199360L, 83495);
  }
  
  public abstract String getUri();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */