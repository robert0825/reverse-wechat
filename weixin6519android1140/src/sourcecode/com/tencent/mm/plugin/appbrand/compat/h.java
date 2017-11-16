package com.tencent.mm.plugin.appbrand.compat;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;

final class h
  implements b.i
{
  final MarkerOptions hPf;
  
  h()
  {
    GMTrace.i(19489756282880L, 145210);
    this.hPf = new MarkerOptions();
    GMTrace.o(19489756282880L, 145210);
  }
  
  public final void O(float paramFloat)
  {
    GMTrace.i(19490158936064L, 145213);
    this.hPf.rotation(paramFloat);
    GMTrace.o(19490158936064L, 145213);
  }
  
  public final void P(float paramFloat)
  {
    GMTrace.i(19490695806976L, 145217);
    this.hPf.alpha(paramFloat);
    GMTrace.o(19490695806976L, 145217);
  }
  
  public final void bD(View paramView)
  {
    GMTrace.i(19490561589248L, 145216);
    this.hPf.markerView(paramView);
    GMTrace.o(19490561589248L, 145216);
  }
  
  public final void e(Animation paramAnimation)
  {
    GMTrace.i(19490964242432L, 145219);
    this.hPf.infoWindowShowAnimation(paramAnimation);
    GMTrace.o(19490964242432L, 145219);
  }
  
  public final void f(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19489890500608L, 145211);
    this.hPf.position(new LatLng(paramDouble1, paramDouble2));
    GMTrace.o(19489890500608L, 145211);
  }
  
  public final void f(Animation paramAnimation)
  {
    GMTrace.i(19491098460160L, 145220);
    this.hPf.infoWindowHideAnimation(paramAnimation);
    GMTrace.o(19491098460160L, 145220);
  }
  
  public final void o(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(19490830024704L, 145218);
    this.hPf.anchor(paramFloat1, paramFloat2);
    GMTrace.o(19490830024704L, 145218);
  }
  
  public final void p(Bitmap paramBitmap)
  {
    GMTrace.i(19490024718336L, 145212);
    this.hPf.icon(new BitmapDescriptor(paramBitmap));
    GMTrace.o(19490024718336L, 145212);
  }
  
  public final void pa(String paramString)
  {
    GMTrace.i(19490293153792L, 145214);
    this.hPf.title(paramString);
    GMTrace.o(19490293153792L, 145214);
  }
  
  public final void pb(String paramString)
  {
    GMTrace.i(19490427371520L, 145215);
    this.hPf.snippet(paramString);
    GMTrace.o(19490427371520L, 145215);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */