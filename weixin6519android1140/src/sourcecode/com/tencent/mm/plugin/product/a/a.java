package com.tencent.mm.plugin.product.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;

public class a
  implements aq
{
  private com.tencent.mm.plugin.product.b.a nHA;
  private c nHy;
  private d nHz;
  
  public a()
  {
    GMTrace.i(6042884767744L, 45023);
    this.nHy = null;
    this.nHz = null;
    this.nHA = new com.tencent.mm.plugin.product.b.a();
    GMTrace.o(6042884767744L, 45023);
  }
  
  public static a aWW()
  {
    GMTrace.i(6043018985472L, 45024);
    a locala = (a)p.o(a.class);
    GMTrace.o(6043018985472L, 45024);
    return locala;
  }
  
  public static c aWX()
  {
    GMTrace.i(6043824291840L, 45030);
    h.xw().wG();
    if (aWW().nHy == null) {
      aWW().nHy = new c();
    }
    c localc = aWW().nHy;
    GMTrace.o(6043824291840L, 45030);
    return localc;
  }
  
  public final d aWY()
  {
    GMTrace.i(6043958509568L, 45031);
    h.xw().wG();
    if (this.nHz == null) {
      this.nHz = new d();
    }
    d locald = this.nHz;
    GMTrace.o(6043958509568L, 45031);
    return locald;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6043421638656L, 45027);
    this.nHy = null;
    com.tencent.mm.sdk.b.a.vgX.b(this.nHA);
    GMTrace.o(6043421638656L, 45027);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6043555856384L, 45028);
    GMTrace.o(6043555856384L, 45028);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6043287420928L, 45026);
    GMTrace.o(6043287420928L, 45026);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6043690074112L, 45029);
    com.tencent.mm.sdk.b.a.vgX.c(this.nHA);
    GMTrace.o(6043690074112L, 45029);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6043153203200L, 45025);
    GMTrace.o(6043153203200L, 45025);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */