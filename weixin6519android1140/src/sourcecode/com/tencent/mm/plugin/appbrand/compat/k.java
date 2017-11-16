package com.tencent.mm.plugin.appbrand.compat;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.a;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.c;

final class k
  implements c
{
  k()
  {
    GMTrace.i(19488682541056L, 145202);
    GMTrace.o(19488682541056L, 145202);
  }
  
  static b.a d(CameraPosition paramCameraPosition)
  {
    GMTrace.i(19488950976512L, 145204);
    paramCameraPosition = new b.a() {};
    GMTrace.o(19488950976512L, 145204);
    return paramCameraPosition;
  }
  
  static b.f d(LatLng paramLatLng)
  {
    GMTrace.i(19488816758784L, 145203);
    paramLatLng = new b.f()
    {
      public final double Uh()
      {
        GMTrace.i(19498077782016L, 145272);
        double d = this.hPi.getLatitude();
        GMTrace.o(19498077782016L, 145272);
        return d;
      }
      
      public final double Ui()
      {
        GMTrace.i(19498211999744L, 145273);
        double d = this.hPi.getLongitude();
        GMTrace.o(19498211999744L, 145273);
        return d;
      }
      
      public final String toString()
      {
        GMTrace.i(19498346217472L, 145274);
        String str = "lat/lng: (" + this.hPi.getLatitude() + "," + this.hPi.getLongitude() + ")";
        GMTrace.o(19498346217472L, 145274);
        return str;
      }
    };
    GMTrace.o(19488816758784L, 145203);
    return paramLatLng;
  }
  
  public final b bE(View paramView)
  {
    GMTrace.i(19489219411968L, 145206);
    if (paramView == null)
    {
      GMTrace.o(19489219411968L, 145206);
      return null;
    }
    paramView = (b)paramView.getTag(R.h.bef);
    GMTrace.o(19489219411968L, 145206);
    return paramView;
  }
  
  public final b bH(Context paramContext)
  {
    GMTrace.i(19489085194240L, 145205);
    paramContext = new d(paramContext);
    GMTrace.o(19489085194240L, 145205);
    return paramContext;
  }
  
  public final b.f e(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19489353629696L, 145207);
    f localf = new f(paramDouble1, paramDouble2);
    GMTrace.o(19489353629696L, 145207);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */