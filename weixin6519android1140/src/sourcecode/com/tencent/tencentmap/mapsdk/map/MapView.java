package com.tencent.tencentmap.mapsdk.map;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.mapsdk.raster.model.BitmapDescriptorFactory;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.GeoPoint;
import com.tencent.mapsdk.raster.model.GroundOverlay;
import com.tencent.mapsdk.raster.model.GroundOverlayOptions;
import com.tencent.mapsdk.raster.model.IOverlay;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mapsdk.raster.model.VisibleRegion;
import com.tencent.mapsdk.rastercore.d.a.1;
import com.tencent.mapsdk.rastercore.d.b;

public class MapView
  extends FrameLayout
{
  @Deprecated
  private d controller;
  private com.tencent.mapsdk.rastercore.d.f eventHandler;
  private com.tencent.mapsdk.rastercore.d.e mapContext;
  private f projection;
  private g tencentMap;
  private h uiSettings;
  
  public MapView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void doLayout(View paramView, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
  {
    int i = paramInt3 & 0x7;
    paramInt3 &= 0x70;
    float f;
    if (i == 5)
    {
      f = paramFloat1 - paramInt1;
      if (paramInt3 != 80) {
        break label94;
      }
      paramFloat1 = paramFloat2 - paramInt2;
    }
    for (;;)
    {
      paramInt3 = Math.round(f);
      i = Math.round(paramFloat1);
      paramView.layout(paramInt3, i, paramInt3 + paramInt1, i + paramInt2);
      return;
      f = paramFloat1;
      if (i != 1) {
        break;
      }
      f = paramFloat1 - paramInt1 / 2;
      break;
      label94:
      paramFloat1 = paramFloat2;
      if (paramInt3 == 16) {
        paramFloat1 = paramFloat2 - paramInt2 / 2;
      }
    }
  }
  
  private void doMeasure(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramView instanceof ListView))
    {
      View localView = (View)paramView.getParent();
      if (localView != null)
      {
        paramArrayOfInt[0] = localView.getWidth();
        paramArrayOfInt[1] = localView.getHeight();
      }
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      paramView.measure(0, 0);
    }
    if (paramInt1 == -2) {
      paramArrayOfInt[0] = paramView.getMeasuredWidth();
    }
    while (paramInt2 == -2)
    {
      paramArrayOfInt[1] = paramView.getMeasuredHeight();
      return;
      if (paramInt1 == -1) {
        paramArrayOfInt[0] = getMeasuredWidth();
      } else {
        paramArrayOfInt[0] = paramInt1;
      }
    }
    if (paramInt2 == -1)
    {
      paramArrayOfInt[1] = getMeasuredHeight();
      return;
    }
    paramArrayOfInt[1] = paramInt2;
  }
  
  private void init()
  {
    initForBugly();
    Context localContext = getContext();
    this.mapContext = new com.tencent.mapsdk.rastercore.d.e(this);
    this.eventHandler = this.mapContext.h();
    setOnKeyListener(this.eventHandler);
    this.projection = new f(this.mapContext);
    this.uiSettings = new h(this.mapContext.f());
    this.tencentMap = new g(this.mapContext);
    this.controller = new d(this);
    if ((localContext instanceof MapActivity)) {
      ((MapActivity)localContext).setMapView(this);
    }
    setBackgroundColor(-657936);
  }
  
  private void initForBugly()
  {
    SharedPreferences.Editor localEditor = getContext().getApplicationContext().getSharedPreferences("BuglySdkInfos", 0).edit();
    localEditor.putString("4e7cb4aa49", "1.2.6");
    localEditor.commit();
  }
  
  private void layout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (localView != null) {
        layout(localView);
      }
      paramInt1 += 1;
    }
  }
  
  private void layoutMap(View paramView, a parama)
  {
    int[] arrayOfInt = new int[2];
    doMeasure(paramView, parama.width, parama.height, arrayOfInt);
    PointF localPointF;
    if (parama.point != null)
    {
      localPointF = this.mapContext.b().a(parama.point);
      if (localPointF != null) {}
    }
    else
    {
      return;
    }
    localPointF.x += a.a(parama);
    localPointF.y += a.b(parama);
    doLayout(paramView, arrayOfInt[0], arrayOfInt[1], localPointF.x, localPointF.y, a.c(parama));
  }
  
  private void layoutView(View paramView, a parama)
  {
    int[] arrayOfInt = new int[2];
    doMeasure(paramView, parama.width, parama.height, arrayOfInt);
    doLayout(paramView, arrayOfInt[0], arrayOfInt[1], a.a(parama), a.b(parama), a.c(parama));
  }
  
  protected static void setIsChinese(boolean paramBoolean)
  {
    com.tencent.mapsdk.rastercore.c.a(paramBoolean);
  }
  
  public Circle addCircle(CircleOptions paramCircleOptions)
  {
    return this.tencentMap.addCircle(paramCircleOptions);
  }
  
  public GroundOverlay addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
  {
    return this.tencentMap.addGroundOverlay(paramGroundOverlayOptions);
  }
  
  public final Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    return this.tencentMap.addMarker(paramMarkerOptions);
  }
  
  public GroundOverlay addOverlay(Bitmap paramBitmap, LatLng paramLatLng1, LatLng paramLatLng2)
  {
    return this.tencentMap.addGroundOverlay(new GroundOverlayOptions().positionFromBounds(new LatLngBounds(paramLatLng1, paramLatLng2)).anchor(0.5F, 0.5F).transparency(0.1F).image(BitmapDescriptorFactory.fromBitmap(paramBitmap)));
  }
  
  public final boolean addOverlay(e parame)
  {
    if (parame == null) {
      return false;
    }
    parame.a(this);
    this.mapContext.e().a(parame);
    return true;
  }
  
  public Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    return new Polygon(this.tencentMap.ybO.a(paramPolygonOptions));
  }
  
  public Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    return this.tencentMap.addPolyline(paramPolylineOptions);
  }
  
  public final void clearAllOverlays()
  {
    g localg = this.tencentMap;
    localg.ybO.a();
    localg.mapContext.a(false, false);
  }
  
  public void computeScroll()
  {
    super.computeScroll();
    this.eventHandler.a();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    setClickable(false);
    this.eventHandler.b(MotionEvent.obtain(paramMotionEvent));
    getParent().requestDisallowInterceptTouchEvent(true);
    if ((super.dispatchTouchEvent(paramMotionEvent)) || (this.eventHandler.a(paramMotionEvent))) {
      bool = true;
    }
    return bool;
  }
  
  public d getController()
  {
    return this.controller;
  }
  
  public int getLatitudeSpan()
  {
    LatLngBounds localLatLngBounds = this.projection.cpY().getLatLngBounds();
    LatLng localLatLng = localLatLngBounds.getSouthwest();
    return (int)(localLatLngBounds.getNortheast().getLatitude() * 1000000.0D - localLatLng.getLatitude() * 1000000.0D);
  }
  
  public int getLongitudeSpan()
  {
    LatLngBounds localLatLngBounds = this.projection.cpY().getLatLngBounds();
    LatLng localLatLng = localLatLngBounds.getSouthwest();
    return (int)(localLatLngBounds.getNortheast().getLongitude() * 1000000.0D - localLatLng.getLongitude() * 1000000.0D);
  }
  
  public g getMap()
  {
    return this.tencentMap;
  }
  
  public LatLng getMapCenter()
  {
    return this.tencentMap.getMapCenter();
  }
  
  protected com.tencent.mapsdk.rastercore.d.e getMapContext()
  {
    return this.mapContext;
  }
  
  public d getMapController()
  {
    return this.controller;
  }
  
  public int getMaxZoomLevel()
  {
    return this.tencentMap.ybR.i().a();
  }
  
  public int getMinZoomLevel()
  {
    return this.tencentMap.ybR.j().a();
  }
  
  public f getProjection()
  {
    return this.projection;
  }
  
  public float getScalePerPixel()
  {
    return this.projection.ybR.f();
  }
  
  public h getUiSettings()
  {
    return this.uiSettings;
  }
  
  public final String getVersion()
  {
    return "1.2.8.29dc259";
  }
  
  public int getZoomLevel()
  {
    return this.tencentMap.getZoomLevel();
  }
  
  public final boolean isAppKeyAvailable()
  {
    return com.tencent.mapsdk.rastercore.d.e.q();
  }
  
  public boolean isSatellite()
  {
    return this.tencentMap.mapContext.l() == 2;
  }
  
  public void layout()
  {
    layout(false, 0, 0, 0, 0);
  }
  
  public void layout(View paramView)
  {
    a locala;
    if (this == paramView.getParent())
    {
      if (!(paramView.getLayoutParams() instanceof a)) {
        break label47;
      }
      locala = (a)paramView.getLayoutParams();
      if (locala.mode == 0) {
        layoutMap(paramView, locala);
      }
    }
    else
    {
      return;
    }
    layoutView(paramView, locala);
    return;
    label47:
    layoutView(paramView, new a(paramView.getLayoutParams()));
  }
  
  public void moveCamera(a parama)
  {
    this.tencentMap.moveCamera(parama);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.mapContext.a(paramBundle);
  }
  
  public void onDestroy()
  {
    this.mapContext.m();
  }
  
  public void onDestroyView() {}
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    layout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onLowMemory() {}
  
  public void onPause() {}
  
  public void onRestart() {}
  
  public void onResume() {}
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    this.mapContext.b(paramBundle);
  }
  
  public void onStop() {}
  
  public void refreshMap()
  {
    postInvalidate();
  }
  
  public final void removeOverlay(IOverlay paramIOverlay)
  {
    if (paramIOverlay != null) {
      paramIOverlay.remove();
    }
  }
  
  protected void setLocation(double paramDouble1, double paramDouble2)
  {
    com.tencent.mapsdk.rastercore.c.b(paramDouble1, paramDouble2);
  }
  
  public void setLogoPosition(int paramInt)
  {
    this.uiSettings.ybT.b(paramInt);
  }
  
  public void setPinchEnabeled(boolean paramBoolean)
  {
    this.uiSettings.ybT.c(paramBoolean);
  }
  
  public void setSatellite(boolean paramBoolean)
  {
    g localg = this.tencentMap;
    if (paramBoolean)
    {
      localg.mapContext.a(2);
      return;
    }
    localg.mapContext.a(1);
  }
  
  public void setScalControlsEnable(boolean paramBoolean)
  {
    this.uiSettings.nd(paramBoolean);
  }
  
  public void setScaleControlsEnable(boolean paramBoolean)
  {
    this.uiSettings.nd(paramBoolean);
  }
  
  public void setScaleViewPosition(int paramInt)
  {
    this.uiSettings.ybT.c(paramInt);
  }
  
  public void setScrollGesturesEnabled(boolean paramBoolean)
  {
    this.uiSettings.ybT.b(paramBoolean);
  }
  
  public void stopAnimation()
  {
    clearAnimation();
    this.mapContext.c().clearAnimation();
    this.eventHandler.b();
  }
  
  public static final class a
    extends FrameLayout.LayoutParams
  {
    private int alignment = 51;
    public int mode = 1;
    public LatLng point = null;
    private int x = 0;
    private int y = 0;
    
    public a(int paramInt1, int paramInt2, GeoPoint paramGeoPoint, int paramInt3)
    {
      this(paramInt1, paramInt2, paramGeoPoint, paramInt3, (byte)0);
    }
    
    private a(int paramInt1, int paramInt2, GeoPoint paramGeoPoint, int paramInt3, byte paramByte)
    {
      this(paramInt1, paramInt2, com.tencent.mapsdk.rastercore.f.a.a(paramGeoPoint), 0, 0, paramInt3);
    }
    
    public a(int paramInt1, int paramInt2, LatLng paramLatLng, int paramInt3, int paramInt4, int paramInt5)
    {
      super(paramInt2);
      this.mode = 0;
      this.point = paramLatLng;
      this.x = paramInt3;
      this.y = paramInt4;
      this.alignment = paramInt5;
    }
    
    protected a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\MapView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */