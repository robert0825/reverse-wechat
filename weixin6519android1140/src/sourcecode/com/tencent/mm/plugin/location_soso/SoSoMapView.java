package com.tencent.mm.plugin.location_soso;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.LatLngBounds.Builder;
import com.tencent.mapsdk.rastercore.d.c;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tencentmap.mapsdk.map.MapView;
import com.tencent.tencentmap.mapsdk.map.MapView.a;
import com.tencent.tencentmap.mapsdk.map.f;
import com.tencent.tencentmap.mapsdk.map.g;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SoSoMapView
  extends MapView
  implements com.tencent.mm.plugin.p.d
{
  public static final String TAG = "MicroMsg.SoSoMapView";
  private boolean firstanim;
  private com.tencent.mm.plugin.p.b iController;
  private HashMap<String, View> tagsView;
  
  public SoSoMapView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5438636556288L, 40521);
    this.tagsView = new HashMap();
    this.firstanim = true;
    init();
    GMTrace.o(5438636556288L, 40521);
  }
  
  public SoSoMapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5438770774016L, 40522);
    this.tagsView = new HashMap();
    this.firstanim = true;
    init();
    GMTrace.o(5438770774016L, 40522);
  }
  
  private void init()
  {
    GMTrace.i(5439173427200L, 40525);
    this.iController = new com.tencent.mm.plugin.p.b()
    {
      public void animateTo(double paramAnonymousDouble1, double paramAnonymousDouble2)
      {
        GMTrace.i(5443871047680L, 40560);
        w.d("MicroMsg.SoSoMapView", "animteTo slat:" + paramAnonymousDouble1 + " slong:" + paramAnonymousDouble2);
        if (SoSoMapView.access$000(SoSoMapView.this)) {
          SoSoMapView.this.getController().c(new GeoPoint((int)(paramAnonymousDouble1 * 1000000.0D), (int)(1000000.0D * paramAnonymousDouble2)));
        }
        for (;;)
        {
          SoSoMapView.access$002(SoSoMapView.this, false);
          GMTrace.o(5443871047680L, 40560);
          return;
          SoSoMapView.this.getController().b(new GeoPoint((int)(paramAnonymousDouble1 * 1000000.0D), (int)(1000000.0D * paramAnonymousDouble2)));
        }
      }
      
      public void animateTo(double paramAnonymousDouble1, double paramAnonymousDouble2, int paramAnonymousInt)
      {
        GMTrace.i(5443736829952L, 40559);
        w.d("MicroMsg.SoSoMapView", "animteTo slat:" + paramAnonymousDouble1 + " slong:" + paramAnonymousDouble2 + " zoom:" + paramAnonymousInt);
        if (SoSoMapView.access$000(SoSoMapView.this)) {
          SoSoMapView.this.getController().c(new GeoPoint((int)(paramAnonymousDouble1 * 1000000.0D), (int)(1000000.0D * paramAnonymousDouble2)));
        }
        for (;;)
        {
          SoSoMapView.access$002(SoSoMapView.this, false);
          SoSoMapView.this.getController().setZoom(paramAnonymousInt);
          GMTrace.o(5443736829952L, 40559);
          return;
          SoSoMapView.this.getController().b(new GeoPoint((int)(paramAnonymousDouble1 * 1000000.0D), (int)(1000000.0D * paramAnonymousDouble2)));
        }
      }
      
      public void offsetCenter(double paramAnonymousDouble1, double paramAnonymousDouble2)
      {
        GMTrace.i(5444139483136L, 40562);
        setCenter(SoSoMapView.this.getMapCenterX() / 1000000.0D + paramAnonymousDouble1, SoSoMapView.this.getMapCenterY() / 1000000.0D + paramAnonymousDouble2);
        GMTrace.o(5444139483136L, 40562);
      }
      
      public void setCenter(double paramAnonymousDouble1, double paramAnonymousDouble2)
      {
        GMTrace.i(5444005265408L, 40561);
        SoSoMapView.this.getController().c(new GeoPoint((int)(paramAnonymousDouble1 * 1000000.0D), (int)(1000000.0D * paramAnonymousDouble2)));
        GMTrace.o(5444005265408L, 40561);
      }
      
      public void setZoom(int paramAnonymousInt)
      {
        GMTrace.i(5443602612224L, 40558);
        w.d("MicroMsg.SoSoMapView", "set Zoom %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        SoSoMapView.this.getController().setZoom(paramAnonymousInt);
        GMTrace.o(5443602612224L, 40558);
      }
    };
    GMTrace.o(5439173427200L, 40525);
  }
  
  private void setEnableForeignMap(boolean paramBoolean)
  {
    GMTrace.i(5439039209472L, 40524);
    try
    {
      Method localMethod = MapView.class.getDeclaredMethod("setForeignEnabled", new Class[] { Boolean.TYPE });
      localMethod.setAccessible(true);
      localMethod.invoke(this, new Object[] { Boolean.valueOf(paramBoolean) });
      GMTrace.o(5439039209472L, 40524);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SoSoMapView", localException, "", new Object[0]);
      GMTrace.o(5439039209472L, 40524);
    }
  }
  
  public void addAnimTrackView(View paramView, double paramDouble1, double paramDouble2, String paramString)
  {
    GMTrace.i(5442260434944L, 40548);
    this.tagsView.put(paramString, paramView);
    addView(paramView, new MapView.a(-2, -2, new GeoPoint((int)(1000000.0D * paramDouble1), (int)(1000000.0D * paramDouble2)), 81));
    GMTrace.o(5442260434944L, 40548);
  }
  
  public void addLocationPin(View paramView)
  {
    GMTrace.i(5441455128576L, 40542);
    addView(paramView);
    GMTrace.o(5441455128576L, 40542);
  }
  
  public void addNullView(View paramView)
  {
    GMTrace.i(5439710298112L, 40529);
    w.d("MicroMsg.SoSoMapView", "addNullView ");
    addView(paramView);
    GMTrace.o(5439710298112L, 40529);
  }
  
  public void addOverlay(Object paramObject)
  {
    GMTrace.i(5440247169024L, 40533);
    GMTrace.o(5440247169024L, 40533);
  }
  
  public void addView(View paramView, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(5439307644928L, 40526);
    addView(paramView, new MapView.a(-2, -2, new GeoPoint((int)(paramDouble1 * 1000000.0D), (int)(paramDouble2 * 1000000.0D)), 17));
    GMTrace.o(5439307644928L, 40526);
  }
  
  public void addView(View paramView, double paramDouble1, double paramDouble2, int paramInt)
  {
    GMTrace.i(5442663088128L, 40551);
    GeoPoint localGeoPoint = new GeoPoint((int)(1000000.0D * paramDouble1), (int)(1000000.0D * paramDouble2));
    if (paramInt == -2)
    {
      addView(paramView, new MapView.a(-2, -2, localGeoPoint, 17));
      GMTrace.o(5442663088128L, 40551);
      return;
    }
    if (paramInt == -1)
    {
      addView(paramView, new MapView.a(-1, -1, localGeoPoint, 17));
      GMTrace.o(5442663088128L, 40551);
      return;
    }
    addView(paramView, new MapView.a(paramInt, paramInt, localGeoPoint, 17));
    GMTrace.o(5442663088128L, 40551);
  }
  
  public void addView(View paramView, double paramDouble1, double paramDouble2, String paramString)
  {
    GMTrace.i(5440515604480L, 40535);
    this.tagsView.put(paramString, paramView);
    addView(paramView, paramDouble1, paramDouble2);
    GMTrace.o(5440515604480L, 40535);
  }
  
  public void clean()
  {
    GMTrace.i(5441320910848L, 40541);
    this.tagsView.clear();
    GMTrace.o(5441320910848L, 40541);
  }
  
  public Collection<View> getChilds()
  {
    GMTrace.i(5440784039936L, 40537);
    Collection localCollection = this.tagsView.values();
    GMTrace.o(5440784039936L, 40537);
    return localCollection;
  }
  
  public com.tencent.tencentmap.mapsdk.map.d getController()
  {
    GMTrace.i(5438904991744L, 40523);
    com.tencent.tencentmap.mapsdk.map.d locald = getMapController();
    GMTrace.o(5438904991744L, 40523);
    return locald;
  }
  
  public com.tencent.mm.plugin.p.b getIController()
  {
    GMTrace.i(5439441862656L, 40527);
    com.tencent.mm.plugin.p.b localb = this.iController;
    GMTrace.o(5439441862656L, 40527);
    return localb;
  }
  
  public int getMapCenterX()
  {
    GMTrace.i(5439844515840L, 40530);
    int i = (int)(getMapCenter().getLatitude() * 1000000.0D);
    GMTrace.o(5439844515840L, 40530);
    return i;
  }
  
  public int getMapCenterY()
  {
    GMTrace.i(5439978733568L, 40531);
    int i = (int)(getMapCenter().getLongitude() * 1000000.0D);
    GMTrace.o(5439978733568L, 40531);
    return i;
  }
  
  public Point getPointByGeoPoint(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(5442126217216L, 40547);
    Point localPoint = new Point();
    Object localObject = getProjection();
    GeoPoint localGeoPoint = new GeoPoint((int)(1000000.0D * paramDouble1), (int)(1000000.0D * paramDouble2));
    localObject = ((f)localObject).ybR.a(com.tencent.mapsdk.rastercore.f.a.a(localGeoPoint));
    localPoint.x = ((int)((PointF)localObject).x);
    localPoint.y = ((int)((PointF)localObject).y);
    GMTrace.o(5442126217216L, 40547);
    return localPoint;
  }
  
  public Set<String> getTags()
  {
    GMTrace.i(5441052475392L, 40539);
    Set localSet = this.tagsView.keySet();
    GMTrace.o(5441052475392L, 40539);
    return localSet;
  }
  
  public View getViewByItag(String paramString)
  {
    GMTrace.i(5440649822208L, 40536);
    if (this.tagsView.containsKey(paramString))
    {
      paramString = (View)this.tagsView.get(paramString);
      GMTrace.o(5440649822208L, 40536);
      return paramString;
    }
    GMTrace.o(5440649822208L, 40536);
    return null;
  }
  
  public int getZoom()
  {
    GMTrace.i(5441857781760L, 40545);
    int i = getZoomLevel();
    GMTrace.o(5441857781760L, 40545);
    return i;
  }
  
  public float metersToEquatorPixels(double paramDouble)
  {
    GMTrace.i(5442528870400L, 40550);
    f localf = getProjection();
    float f = (float)paramDouble;
    f = localf.ybR.a(f);
    GMTrace.o(5442528870400L, 40550);
    return f;
  }
  
  public void removeView(View paramView)
  {
    GMTrace.i(5440918257664L, 40538);
    super.removeView(paramView);
    Iterator localIterator = this.tagsView.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (((View)this.tagsView.get(str)).equals(paramView))
      {
        this.tagsView.remove(str);
        GMTrace.o(5440918257664L, 40538);
        return;
      }
    }
    GMTrace.o(5440918257664L, 40538);
  }
  
  public View removeViewByTag(String paramString)
  {
    GMTrace.i(5441186693120L, 40540);
    paramString = (View)this.tagsView.get(paramString);
    removeView(paramString);
    GMTrace.o(5441186693120L, 40540);
    return paramString;
  }
  
  public void requestMapFocus()
  {
    GMTrace.i(5440381386752L, 40534);
    requestFocus();
    GMTrace.o(5440381386752L, 40534);
  }
  
  public void setBuiltInZoomControls(boolean paramBoolean)
  {
    GMTrace.i(5439576080384L, 40528);
    GMTrace.o(5439576080384L, 40528);
  }
  
  public void setMapViewOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(5441991999488L, 40546);
    setOnTouchListener(paramOnTouchListener);
    GMTrace.o(5441991999488L, 40546);
  }
  
  public void updateAnimViewLayout(View paramView, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(5442394652672L, 40549);
    updateViewLayout(paramView, new MapView.a(-2, -2, new GeoPoint((int)(paramDouble1 * 1000000.0D), (int)(paramDouble2 * 1000000.0D)), 81));
    GMTrace.o(5442394652672L, 40549);
  }
  
  public void updateLocaitonPinLayout(View paramView, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(5441723564032L, 40544);
    w.d("MicroMsg.SoSoMapView", "updateLocationPinLayout");
    updateViewLayout(paramView, new MapView.a(-2, -2, new GeoPoint((int)(paramDouble1 * 1000000.0D), (int)(paramDouble2 * 1000000.0D)), 81));
    GMTrace.o(5441723564032L, 40544);
  }
  
  public void updateViewLayout(View paramView, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(5440112951296L, 40532);
    updateViewLayout(paramView, new MapView.a(-2, -2, new GeoPoint((int)(paramDouble1 * 1000000.0D), (int)(paramDouble2 * 1000000.0D)), 17));
    GMTrace.o(5440112951296L, 40532);
  }
  
  public void updateViewLayout(View paramView, double paramDouble1, double paramDouble2, int paramInt)
  {
    GMTrace.i(5442797305856L, 40552);
    GeoPoint localGeoPoint = new GeoPoint((int)(1000000.0D * paramDouble1), (int)(1000000.0D * paramDouble2));
    if (paramInt == -2)
    {
      updateViewLayout(paramView, new MapView.a(-2, -2, localGeoPoint, 17));
      GMTrace.o(5442797305856L, 40552);
      return;
    }
    if (paramInt == -1)
    {
      updateViewLayout(paramView, new MapView.a(-1, -1, localGeoPoint, 17));
      GMTrace.o(5442797305856L, 40552);
      return;
    }
    updateViewLayout(paramView, new MapView.a(paramInt, paramInt, localGeoPoint, 17));
    GMTrace.o(5442797305856L, 40552);
  }
  
  public void zoomToSpan(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    GMTrace.i(5441589346304L, 40543);
    getController().c(new GeoPoint((int)(1000000.0D * paramDouble1), (int)(1000000.0D * paramDouble2)));
    w.d("MicroMsg.SoSoMapView", "zoomToSpan " + (int)(1000000.0D * paramDouble3) + " " + (int)(1000000.0D * paramDouble4) + "  " + 1000000.0D * paramDouble1 + " " + 1000000.0D * paramDouble2);
    if ((paramDouble3 == 0.0D) || (paramDouble4 == 0.0D))
    {
      GMTrace.o(5441589346304L, 40543);
      return;
    }
    Object localObject1 = getController();
    int i = (int)(1000000.0D * paramDouble3);
    int j = (int)(1000000.0D * paramDouble4);
    localObject1 = ((com.tencent.tencentmap.mapsdk.map.d)localObject1).ybN.getMap();
    paramDouble3 = i / 1000000.0D;
    paramDouble4 = j / 1000000.0D;
    Object localObject2 = new LatLng(((g)localObject1).getMapCenter().getLatitude() - paramDouble3 / 2.0D, ((g)localObject1).getMapCenter().getLongitude() + paramDouble4 / 2.0D);
    double d = ((g)localObject1).getMapCenter().getLatitude();
    LatLng localLatLng = new LatLng(paramDouble3 / 2.0D + d, ((g)localObject1).getMapCenter().getLongitude() - paramDouble4 / 2.0D);
    localObject2 = new LatLngBounds.Builder().include((LatLng)localObject2).include(localLatLng).build();
    ((g)localObject1).mapContext.c().a(com.tencent.tencentmap.mapsdk.map.b.a((LatLngBounds)localObject2, 10).ybL);
    getController().c(new GeoPoint((int)(1000000.0D * paramDouble1), (int)(1000000.0D * paramDouble2)));
    GMTrace.o(5441589346304L, 40543);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location_soso\SoSoMapView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */