package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.IOverlay;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mm.plugin.appbrand.compat.a.b.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.d;
import com.tencent.mm.plugin.appbrand.compat.a.b.o;

abstract class n<T extends IOverlay>
  implements b.d
{
  final T hPp;
  
  n(T paramT)
  {
    GMTrace.i(19502909620224L, 145308);
    this.hPp = paramT;
    GMTrace.o(19502909620224L, 145308);
  }
  
  public final String getId()
  {
    GMTrace.i(19503178055680L, 145310);
    if (this.hPp == null)
    {
      GMTrace.o(19503178055680L, 145310);
      return "";
    }
    String str = this.hPp.getId();
    GMTrace.o(19503178055680L, 145310);
    return str;
  }
  
  public final void remove()
  {
    GMTrace.i(19503043837952L, 145309);
    if (this.hPp != null) {
      this.hPp.remove();
    }
    GMTrace.o(19503043837952L, 145309);
  }
  
  static final class a
    extends n<Circle>
    implements b.b
  {
    a(Circle paramCircle)
    {
      super();
      GMTrace.i(19497138257920L, 145265);
      GMTrace.o(19497138257920L, 145265);
    }
  }
  
  static final class b
    extends n<Polyline>
    implements b.o
  {
    b(Polyline paramPolyline)
    {
      super();
      GMTrace.i(19482642743296L, 145157);
      GMTrace.o(19482642743296L, 145157);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */