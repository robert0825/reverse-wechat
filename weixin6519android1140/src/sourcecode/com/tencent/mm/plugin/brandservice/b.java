package com.tencent.mm.plugin.brandservice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.or;
import com.tencent.mm.plugin.brandservice.ui.a.d;
import com.tencent.mm.plugin.fts.d.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public final class b
  implements aq
{
  private a jsT;
  
  public b()
  {
    GMTrace.i(10913646116864L, 81313);
    GMTrace.o(10913646116864L, 81313);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(10914182987776L, 81317);
    w.d("MicroMsg.BrandService.SubCoreBrandService", "on sub core brand service reset");
    if (this.jsT == null) {
      this.jsT = new a();
    }
    a.vgX.b(this.jsT);
    h.a(new d());
    h.a(new com.tencent.mm.plugin.brandservice.ui.a.b());
    GMTrace.o(10914182987776L, 81317);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(10914048770048L, 81316);
    GMTrace.o(10914048770048L, 81316);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(10913914552320L, 81315);
    GMTrace.o(10913914552320L, 81315);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(10914317205504L, 81318);
    if (this.jsT != null) {
      a.vgX.c(this.jsT);
    }
    h.od(96);
    h.od(4192);
    GMTrace.o(10914317205504L, 81318);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(10913780334592L, 81314);
    GMTrace.o(10913780334592L, 81314);
    return null;
  }
  
  public static final class a
    extends c<or>
  {
    public a()
    {
      GMTrace.i(10840363237376L, 80767);
      this.vhf = or.class.getName().hashCode();
      GMTrace.o(10840363237376L, 80767);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */