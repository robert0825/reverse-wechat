package com.tencent.mapsdk.rastercore.d;

import android.graphics.Canvas;
import android.os.Handler;
import android.view.MotionEvent;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.GroundOverlayOptions;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a
{
  private static int e = 0;
  private e a;
  private CopyOnWriteArrayList<com.tencent.mapsdk.rastercore.e.b> b = new CopyOnWriteArrayList();
  private SortedMap<String, com.tencent.mapsdk.rastercore.e.a.c> c = new TreeMap();
  private a d = new a();
  private int f = 0;
  
  public a(e parame)
  {
    this.a = parame;
  }
  
  public static String a(String paramString)
  {
    e += 1;
    return paramString + e;
  }
  
  public final com.tencent.mapsdk.rastercore.e.a.c a(MarkerOptions paramMarkerOptions)
  {
    paramMarkerOptions = new com.tencent.mapsdk.rastercore.e.a.c(this.a, paramMarkerOptions);
    this.c.put(paramMarkerOptions.m(), paramMarkerOptions);
    return paramMarkerOptions;
  }
  
  public final com.tencent.mapsdk.rastercore.e.a a(CircleOptions paramCircleOptions)
  {
    paramCircleOptions = new com.tencent.mapsdk.rastercore.e.a(this.a, paramCircleOptions);
    a(paramCircleOptions);
    return paramCircleOptions;
  }
  
  public final com.tencent.mapsdk.rastercore.e.c a(PolygonOptions paramPolygonOptions)
  {
    paramPolygonOptions = new com.tencent.mapsdk.rastercore.e.c(this.a, paramPolygonOptions);
    a(paramPolygonOptions);
    return paramPolygonOptions;
  }
  
  public final com.tencent.mapsdk.rastercore.e.d a(PolylineOptions paramPolylineOptions)
  {
    paramPolylineOptions = new com.tencent.mapsdk.rastercore.e.a.d(this.a, paramPolylineOptions);
    a(paramPolylineOptions);
    return paramPolylineOptions;
  }
  
  public final com.tencent.mapsdk.rastercore.tile.a.b a(GroundOverlayOptions paramGroundOverlayOptions)
  {
    paramGroundOverlayOptions = new com.tencent.mapsdk.rastercore.tile.a.b(this.a, paramGroundOverlayOptions);
    a(paramGroundOverlayOptions);
    return paramGroundOverlayOptions;
  }
  
  public final void a()
  {
    try
    {
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext()) {
        ((com.tencent.mapsdk.rastercore.e.a.c)((Map.Entry)localIterator.next()).getValue()).c();
      }
      this.c.clear();
      localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        ((com.tencent.mapsdk.rastercore.e.b)localIterator.next()).destroy();
      }
      this.b.clear();
      com.tencent.mapsdk.rastercore.f.a.a(this.a.c(), 2);
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(Canvas paramCanvas)
  {
    int i = this.b.size();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mapsdk.rastercore.e.b localb = (com.tencent.mapsdk.rastercore.e.b)localIterator.next();
      if ((localb.isVisible()) && ((i <= 20) || (localb.checkInBounds()))) {
        localb.draw(paramCanvas);
      }
    }
  }
  
  public final void a(com.tencent.mapsdk.rastercore.e.b paramb)
  {
    b(paramb.getId());
    this.b.add(paramb);
    if (!(paramb instanceof com.tencent.mapsdk.rastercore.e.a))
    {
      int i = this.f + 1;
      this.f = i;
      if (i > 0) {
        com.tencent.mapsdk.rastercore.f.a.a(this.a.c(), 1);
      }
    }
    c();
    this.a.a(false, false);
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = this.b.iterator();
    while (paramMotionEvent.hasNext()) {
      if (((com.tencent.mapsdk.rastercore.e.b)paramMotionEvent.next() instanceof com.tencent.tencentmap.mapsdk.map.e)) {
        this.a.d();
      }
    }
    return false;
  }
  
  public final boolean a(GeoPoint paramGeoPoint)
  {
    paramGeoPoint = this.b.iterator();
    while (paramGeoPoint.hasNext()) {
      if (((com.tencent.mapsdk.rastercore.e.b)paramGeoPoint.next() instanceof com.tencent.tencentmap.mapsdk.map.e)) {
        this.a.d();
      }
    }
    paramGeoPoint = this.b.iterator();
    while (paramGeoPoint.hasNext()) {
      paramGeoPoint.next();
    }
    return false;
  }
  
  public final boolean a(GeoPoint paramGeoPoint, MotionEvent paramMotionEvent)
  {
    paramGeoPoint = this.b.iterator();
    while (paramGeoPoint.hasNext()) {
      if (((com.tencent.mapsdk.rastercore.e.b)paramGeoPoint.next() instanceof com.tencent.tencentmap.mapsdk.map.e)) {
        this.a.d();
      }
    }
    return false;
  }
  
  protected final void b()
  {
    a();
  }
  
  public final boolean b(String paramString)
  {
    Iterator localIterator = this.b.iterator();
    com.tencent.mapsdk.rastercore.e.b localb;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localb = (com.tencent.mapsdk.rastercore.e.b)localIterator.next();
    } while ((localb == null) || (!localb.getId().equals(paramString)));
    for (paramString = localb; paramString != null; paramString = null)
    {
      boolean bool = this.b.remove(paramString);
      if ((bool) && (!(this.b instanceof com.tencent.mapsdk.rastercore.e.a)))
      {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
          com.tencent.mapsdk.rastercore.f.a.a(this.a.c(), 2);
        }
      }
      this.a.a(false, false);
      return bool;
    }
    return false;
  }
  
  public final void c()
  {
    Object[] arrayOfObject = this.b.toArray();
    Arrays.sort(arrayOfObject, this.d);
    this.b.clear();
    int j = arrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = arrayOfObject[i];
      this.b.add((com.tencent.mapsdk.rastercore.e.b)localObject);
      i += 1;
    }
  }
  
  public final boolean c(String paramString)
  {
    paramString = (com.tencent.mapsdk.rastercore.e.a.c)this.c.remove(paramString);
    if (paramString == null) {
      return false;
    }
    paramString.c();
    return true;
  }
  
  final class a
    implements Comparator<Object>
  {
    public a() {}
    
    public final int compare(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (com.tencent.mapsdk.rastercore.e.b)paramObject1;
      paramObject2 = (com.tencent.mapsdk.rastercore.e.b)paramObject2;
      if ((paramObject1 != null) && (paramObject2 != null)) {
        try
        {
          if (((com.tencent.mapsdk.rastercore.e.b)paramObject1).getZIndex() > ((com.tencent.mapsdk.rastercore.e.b)paramObject2).getZIndex()) {
            return 1;
          }
          float f1 = ((com.tencent.mapsdk.rastercore.e.b)paramObject1).getZIndex();
          float f2 = ((com.tencent.mapsdk.rastercore.e.b)paramObject2).getZIndex();
          if (f1 < f2) {
            return -1;
          }
        }
        catch (Exception paramObject1) {}
      }
      return 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */