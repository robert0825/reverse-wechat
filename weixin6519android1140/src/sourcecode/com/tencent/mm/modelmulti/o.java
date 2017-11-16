package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bz.a;
import com.tencent.mm.bz.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.k;
import com.tencent.mm.protocal.c.aod;
import com.tencent.mm.storage.au;

public final class o
  implements com.tencent.mm.plugin.messenger.foundation.a.o
{
  private final a gNp;
  private f gNq;
  
  public o()
  {
    GMTrace.i(13187160211456L, 98252);
    this.gNp = new a();
    GMTrace.o(13187160211456L, 98252);
  }
  
  public final k JD()
  {
    GMTrace.i(13187697082368L, 98256);
    a locala = this.gNp;
    GMTrace.o(13187697082368L, 98256);
    return locala;
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(13187562864640L, 98255);
    this.gNq = paramf;
    GMTrace.o(13187562864640L, 98255);
  }
  
  public final void a(k paramk)
  {
    GMTrace.i(13187428646912L, 98254);
    this.gNp.bT(paramk);
    GMTrace.o(13187428646912L, 98254);
  }
  
  public final String s(au paramau)
  {
    GMTrace.i(13187294429184L, 98253);
    if (this.gNq != null)
    {
      paramau = this.gNq.s(paramau);
      GMTrace.o(13187294429184L, 98253);
      return paramau;
    }
    GMTrace.o(13187294429184L, 98253);
    return null;
  }
  
  private static final class a
    extends a<k>
    implements k
  {
    public a()
    {
      GMTrace.i(13187831300096L, 98257);
      GMTrace.o(13187831300096L, 98257);
    }
    
    public final void a(final aod paramaod, final au paramau)
    {
      GMTrace.i(13187965517824L, 98258);
      a(new a.a() {});
      GMTrace.o(13187965517824L, 98258);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelmulti\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */