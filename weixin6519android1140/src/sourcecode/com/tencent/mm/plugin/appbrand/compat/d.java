package com.tencent.mm.plugin.appbrand.compat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds.Builder;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.appbrand.compat.a.b.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.c;
import com.tencent.mm.plugin.appbrand.compat.a.b.e;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.i;
import com.tencent.mm.plugin.appbrand.compat.a.b.j;
import com.tencent.mm.plugin.appbrand.compat.a.b.k;
import com.tencent.mm.plugin.appbrand.compat.a.b.l;
import com.tencent.mm.plugin.appbrand.compat.a.b.m;
import com.tencent.mm.plugin.appbrand.compat.a.b.n;
import com.tencent.mm.plugin.appbrand.compat.a.b.o;
import com.tencent.mm.plugin.appbrand.compat.a.b.p;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.location_soso.SoSoMapView;
import com.tencent.tencentmap.mapsdk.map.g.a;
import com.tencent.tencentmap.mapsdk.map.g.c;
import com.tencent.tencentmap.mapsdk.map.g.d;
import com.tencent.tencentmap.mapsdk.map.g.e;
import com.tencent.tencentmap.mapsdk.map.g.f;
import com.tencent.tencentmap.mapsdk.map.g.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

final class d
  implements com.tencent.mm.plugin.appbrand.compat.a.b
{
  final FrameLayout hOS;
  final SoSoMapView hOT;
  
  d(Context paramContext)
  {
    GMTrace.i(19492977508352L, 145234);
    this.hOS = ((FrameLayout)LayoutInflater.from(paramContext).inflate(R.i.cpd, null));
    this.hOT = ((SoSoMapView)this.hOS.findViewById(R.h.bCr));
    this.hOS.setTag(R.h.bef, this);
    GMTrace.o(19492977508352L, 145234);
  }
  
  public final b.f TZ()
  {
    GMTrace.i(19493514379264L, 145238);
    Object localObject = this.hOT.getMap().getMapCenter();
    localObject = new f(((LatLng)localObject).getLatitude(), ((LatLng)localObject).getLongitude());
    GMTrace.o(19493514379264L, 145238);
    return (b.f)localObject;
  }
  
  public final b.q Ua()
  {
    GMTrace.i(19493782814720L, 145240);
    j localj = new j(this.hOT.getProjection());
    GMTrace.o(19493782814720L, 145240);
    return localj;
  }
  
  public final b.i Ub()
  {
    GMTrace.i(19495527645184L, 145253);
    h localh = new h();
    GMTrace.o(19495527645184L, 145253);
    return localh;
  }
  
  public final b.c Uc()
  {
    GMTrace.i(19495796080640L, 145255);
    c localc = new c();
    GMTrace.o(19495796080640L, 145255);
    return localc;
  }
  
  public final b.p Ud()
  {
    GMTrace.i(19496198733824L, 145258);
    i locali = new i();
    GMTrace.o(19496198733824L, 145258);
    return locali;
  }
  
  public final b.b a(b.c paramc)
  {
    GMTrace.i(19495930298368L, 145256);
    if ((paramc instanceof c)) {
      paramc = this.hOT.getMap().addCircle(((c)paramc).hOR);
    }
    for (;;)
    {
      paramc = new n.a(paramc);
      GMTrace.o(19495930298368L, 145256);
      return paramc;
      paramc = null;
      Assert.assertTrue("Should use IAppBrandMapView.createMarkersOptions to initiate CircleOptions!", true);
    }
  }
  
  public final b.h a(b.i parami)
  {
    GMTrace.i(19495661862912L, 145254);
    if ((parami instanceof h)) {
      parami = this.hOT.getMap().addMarker(((h)parami).hPf);
    }
    for (;;)
    {
      parami = new g(parami);
      GMTrace.o(19495661862912L, 145254);
      return parami;
      parami = null;
      Assert.assertTrue("Should use IAppBrandMapView.createMarkersOptions to initiate MarkerOptions!", true);
    }
  }
  
  public final b.o a(b.p paramp)
  {
    GMTrace.i(19496064516096L, 145257);
    if ((paramp instanceof i)) {
      paramp = this.hOT.getMap().addPolyline(((i)paramp).hPg);
    }
    for (;;)
    {
      paramp = new n.b(paramp);
      GMTrace.o(19496064516096L, 145257);
      return paramp;
      paramp = null;
      Assert.assertTrue("Should use IAppBrandMapView.createPolylineOptions to initiate PolylineOptions!", true);
    }
  }
  
  public final void a(double paramDouble1, double paramDouble2, int paramInt)
  {
    GMTrace.i(20364184780800L, 151725);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    if (localg != null) {
      localg.moveCamera(com.tencent.tencentmap.mapsdk.map.b.a(new LatLng(paramDouble1, paramDouble2), paramInt));
    }
    GMTrace.o(20364184780800L, 151725);
  }
  
  public final void a(final b.e parame)
  {
    GMTrace.i(19495393427456L, 145252);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    if (parame == null) {}
    for (parame = null;; parame = new g.a()
        {
          public final View c(Marker paramAnonymousMarker)
          {
            GMTrace.i(20362842603520L, 151715);
            paramAnonymousMarker = parame.a(new g(paramAnonymousMarker));
            GMTrace.o(20362842603520L, 151715);
            return paramAnonymousMarker;
          }
          
          public final void d(Marker paramAnonymousMarker)
          {
            GMTrace.i(20362976821248L, 151716);
            new g(paramAnonymousMarker);
            GMTrace.o(20362976821248L, 151716);
          }
        })
    {
      localg.mapContext.h().a(parame);
      GMTrace.o(19495393427456L, 145252);
      return;
    }
  }
  
  public final void a(final b.j paramj)
  {
    GMTrace.i(19495124992000L, 145250);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    paramj = new g.c()
    {
      public final void a(Marker paramAnonymousMarker)
      {
        GMTrace.i(20364050563072L, 151724);
        if (paramj != null) {
          paramj.b(new g(paramAnonymousMarker));
        }
        GMTrace.o(20364050563072L, 151724);
      }
    };
    localg.mapContext.h().a(paramj);
    GMTrace.o(19495124992000L, 145250);
  }
  
  public final void a(final b.k paramk)
  {
    GMTrace.i(19494990774272L, 145249);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    paramk = new g.d()
    {
      public final void b(CameraPosition paramAnonymousCameraPosition)
      {
        GMTrace.i(20364587433984L, 151728);
        if (paramk != null)
        {
          b.k localk = paramk;
          k.d(paramAnonymousCameraPosition);
          localk.Um();
        }
        GMTrace.o(20364587433984L, 151728);
      }
      
      public final void c(CameraPosition paramAnonymousCameraPosition)
      {
        GMTrace.i(20364721651712L, 151729);
        if (paramk != null)
        {
          b.k localk = paramk;
          k.d(paramAnonymousCameraPosition);
          localk.Un();
        }
        GMTrace.o(20364721651712L, 151729);
      }
    };
    localg.mapContext.h().a(paramk);
    GMTrace.o(19494990774272L, 145249);
  }
  
  public final void a(final b.l paraml)
  {
    GMTrace.i(19494856556544L, 145248);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    paraml = new g.e()
    {
      public final void c(LatLng paramAnonymousLatLng)
      {
        GMTrace.i(20363245256704L, 151718);
        if (paraml != null)
        {
          b.l locall = paraml;
          k.d(paramAnonymousLatLng);
          locall.Uo();
        }
        GMTrace.o(20363245256704L, 151718);
      }
    };
    localg.mapContext.h().a(paraml);
    GMTrace.o(19494856556544L, 145248);
  }
  
  public final void a(final b.m paramm)
  {
    GMTrace.i(20364318998528L, 151726);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    paramm = new g.f()
    {
      public final void Ue()
      {
        GMTrace.i(20363513692160L, 151720);
        if (paramm != null) {
          paramm.Ue();
        }
        GMTrace.o(20363513692160L, 151720);
      }
    };
    localg.mapContext.c().a(paramm);
    GMTrace.o(20364318998528L, 151726);
  }
  
  public final void a(final b.n paramn)
  {
    GMTrace.i(19495259209728L, 145251);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    paramn = new g.h()
    {
      public final boolean b(Marker paramAnonymousMarker)
      {
        GMTrace.i(20363782127616L, 151722);
        if ((paramn != null) && (paramn.c(new g(paramAnonymousMarker))))
        {
          GMTrace.o(20363782127616L, 151722);
          return true;
        }
        GMTrace.o(20363782127616L, 151722);
        return false;
      }
    };
    localg.mapContext.h().a(paramn);
    GMTrace.o(19495259209728L, 145251);
  }
  
  public final boolean a(View paramView, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19493245943808L, 145236);
    this.hOT.addView(paramView, paramDouble1, paramDouble2);
    GMTrace.o(19493245943808L, 145236);
    return true;
  }
  
  public final void animateTo(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19494319685632L, 145244);
    this.hOT.getIController().animateTo(paramDouble1, paramDouble2);
    GMTrace.o(19494319685632L, 145244);
  }
  
  public final boolean b(View paramView, double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19493380161536L, 145237);
    if (paramView == null)
    {
      GMTrace.o(19493380161536L, 145237);
      return false;
    }
    this.hOT.updateViewLayout(paramView, paramDouble1, paramDouble2);
    GMTrace.o(19493380161536L, 145237);
    return true;
  }
  
  public final void c(List<b.f> paramList, int paramInt)
  {
    GMTrace.i(19494722338816L, 145247);
    LatLngBounds.Builder localBuilder = new LatLngBounds.Builder();
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b.f localf = (b.f)paramList.next();
      if ((localf instanceof f)) {
        localLinkedList.add(((f)localf).hPc);
      } else {
        localLinkedList.add(new LatLng(localf.Uh(), localf.Ui()));
      }
    }
    localBuilder.include(localLinkedList);
    this.hOT.getMap().a(com.tencent.tencentmap.mapsdk.map.b.a(localBuilder.build(), paramInt));
    GMTrace.o(19494722338816L, 145247);
  }
  
  public final void clean()
  {
    GMTrace.i(19494588121088L, 145246);
    this.hOT.clean();
    GMTrace.o(19494588121088L, 145246);
  }
  
  public final b.f e(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19493648596992L, 145239);
    f localf = new f(paramDouble1, paramDouble2);
    GMTrace.o(19493648596992L, 145239);
    return localf;
  }
  
  public final View getView()
  {
    GMTrace.i(19493111726080L, 145235);
    FrameLayout localFrameLayout = this.hOS;
    GMTrace.o(19493111726080L, 145235);
    return localFrameLayout;
  }
  
  public final int getZoomLevel()
  {
    GMTrace.i(19494453903360L, 145245);
    int i = this.hOT.getMap().getZoomLevel();
    GMTrace.o(19494453903360L, 145245);
    return i;
  }
  
  public final void im(int paramInt)
  {
    GMTrace.i(19494185467904L, 145243);
    com.tencent.tencentmap.mapsdk.map.g localg = this.hOT.getMap();
    if (localg != null) {
      localg.a(com.tencent.tencentmap.mapsdk.map.b.aD(paramInt));
    }
    GMTrace.o(19494185467904L, 145243);
  }
  
  public final void setCenter(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(19493917032448L, 145241);
    this.hOT.getIController().setCenter(paramDouble1, paramDouble2);
    GMTrace.o(19493917032448L, 145241);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */