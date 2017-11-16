package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;

final class g
  extends n<Marker>
  implements b.h
{
  final Marker hPd;
  
  g(Marker paramMarker)
  {
    super(paramMarker);
    GMTrace.i(19500896354304L, 145293);
    this.hPd = paramMarker;
    GMTrace.o(19500896354304L, 145293);
  }
  
  public final b.f Uj()
  {
    GMTrace.i(19501835878400L, 145300);
    if (this.hPd == null)
    {
      localObject = new b.f()
      {
        public final double Uh()
        {
          GMTrace.i(19498614652928L, 145276);
          GMTrace.o(19498614652928L, 145276);
          return 0.0D;
        }
        
        public final double Ui()
        {
          GMTrace.i(19498748870656L, 145277);
          GMTrace.o(19498748870656L, 145277);
          return 0.0D;
        }
      };
      GMTrace.o(19501835878400L, 145300);
      return (b.f)localObject;
    }
    Object localObject = new f(this.hPd.getPosition());
    GMTrace.o(19501835878400L, 145300);
    return (b.f)localObject;
  }
  
  public final void b(b.f paramf)
  {
    GMTrace.i(19501970096128L, 145301);
    if (this.hPd != null)
    {
      if ((paramf instanceof f))
      {
        this.hPd.setPosition(((f)paramf).hPc);
        GMTrace.o(19501970096128L, 145301);
        return;
      }
      this.hPd.setPosition(new LatLng(paramf.Uh(), paramf.Ui()));
    }
    GMTrace.o(19501970096128L, 145301);
  }
  
  public final float getRotation()
  {
    GMTrace.i(19502104313856L, 145302);
    if (this.hPd == null)
    {
      GMTrace.o(19502104313856L, 145302);
      return 0.0F;
    }
    float f = this.hPd.getRotation();
    GMTrace.o(19502104313856L, 145302);
    return f;
  }
  
  public final String getSnippet()
  {
    GMTrace.i(19501299007488L, 145296);
    if (this.hPd == null)
    {
      GMTrace.o(19501299007488L, 145296);
      return "";
    }
    String str = this.hPd.getSnippet();
    GMTrace.o(19501299007488L, 145296);
    return str;
  }
  
  public final String getTitle()
  {
    GMTrace.i(19501164789760L, 145295);
    if (this.hPd == null)
    {
      GMTrace.o(19501164789760L, 145295);
      return "";
    }
    String str = this.hPd.getTitle();
    GMTrace.o(19501164789760L, 145295);
    return str;
  }
  
  public final void hideInfoWindow()
  {
    GMTrace.i(19501701660672L, 145299);
    if (this.hPd != null) {
      this.hPd.hideInfoWindow();
    }
    GMTrace.o(19501701660672L, 145299);
  }
  
  public final boolean isInfoWindowShown()
  {
    GMTrace.i(19501433225216L, 145297);
    if ((this.hPd != null) && (this.hPd.isInfoWindowShown()))
    {
      GMTrace.o(19501433225216L, 145297);
      return true;
    }
    GMTrace.o(19501433225216L, 145297);
    return false;
  }
  
  public final void oZ(String paramString)
  {
    GMTrace.i(19501030572032L, 145294);
    if (this.hPd != null) {
      this.hPd.setTag(paramString);
    }
    GMTrace.o(19501030572032L, 145294);
  }
  
  public final void setRotation(float paramFloat)
  {
    GMTrace.i(19502238531584L, 145303);
    if (this.hPd != null) {
      this.hPd.setRotation(paramFloat);
    }
    GMTrace.o(19502238531584L, 145303);
  }
  
  public final void showInfoWindow()
  {
    GMTrace.i(19501567442944L, 145298);
    if (this.hPd != null) {
      this.hPd.showInfoWindow();
    }
    GMTrace.o(19501567442944L, 145298);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */