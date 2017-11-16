package com.tencent.tencentmap.mapsdk.map;

import android.view.View;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.GroundOverlay;
import com.tencent.mapsdk.raster.model.GroundOverlayOptions;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mapsdk.rastercore.d.a.1;
import com.tencent.mapsdk.rastercore.d.b;
import com.tencent.mapsdk.rastercore.d.c;
import com.tencent.mapsdk.rastercore.d.e;

public final class g
{
  public static b ybS;
  public e mapContext;
  com.tencent.mapsdk.rastercore.d.a ybO;
  c ybR;
  
  public g(e parame)
  {
    this.mapContext = parame;
    this.ybO = parame.e();
    this.ybR = parame.b();
  }
  
  public final void a(a parama)
  {
    a(parama, 1000L);
  }
  
  final void a(a parama, long paramLong)
  {
    if ((!this.mapContext.f().k()) || (paramLong < 0L)) {
      parama.ybL.a(false);
    }
    parama.ybL.a(null);
    parama.ybL.a(paramLong);
    this.mapContext.c().a(parama.ybL);
  }
  
  public final Circle addCircle(CircleOptions paramCircleOptions)
  {
    return new Circle(this.ybO.a(paramCircleOptions));
  }
  
  public final GroundOverlay addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
  {
    return new GroundOverlay(this.ybO.a(paramGroundOverlayOptions));
  }
  
  public final Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    return new Marker(this.ybO.a(paramMarkerOptions));
  }
  
  public final Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    return new Polyline(this.ybO.a(paramPolylineOptions));
  }
  
  public final LatLng getMapCenter()
  {
    return this.ybR.d().getTarget();
  }
  
  public final int getZoomLevel()
  {
    return (int)this.ybR.d().getZoom();
  }
  
  public final void moveCamera(a parama)
  {
    if (parama != null)
    {
      parama = parama.ybL;
      if (parama != null)
      {
        parama.a(false);
        this.mapContext.c().a(parama);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract View c(Marker paramMarker);
    
    public abstract void d(Marker paramMarker);
  }
  
  public static abstract interface b
  {
    public abstract void collectErrorInfo(String paramString);
  }
  
  public static abstract interface c
  {
    public abstract void a(Marker paramMarker);
  }
  
  public static abstract interface d
  {
    public abstract void b(CameraPosition paramCameraPosition);
    
    public abstract void c(CameraPosition paramCameraPosition);
  }
  
  public static abstract interface e
  {
    public abstract void c(LatLng paramLatLng);
  }
  
  public static abstract interface f
  {
    public abstract void Ue();
  }
  
  public static abstract interface g {}
  
  public static abstract interface h
  {
    public abstract boolean b(Marker paramMarker);
  }
  
  public static abstract interface i {}
  
  public static abstract interface j {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */