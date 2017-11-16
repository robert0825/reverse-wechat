package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiGetLocation
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 37;
  public static final String NAME = "getLocation";
  public static final HashSet<a.a> dLS;
  private static final HashSet<String> ieY;
  
  static
  {
    GMTrace.i(19710007574528L, 146851);
    HashSet localHashSet = new HashSet();
    ieY = localHashSet;
    localHashSet.add("gcj02");
    ieY.add("wgs84");
    dLS = new HashSet();
    GMTrace.o(19710007574528L, 146851);
  }
  
  public JsApiGetLocation()
  {
    GMTrace.i(19709739139072L, 146849);
    GMTrace.o(19709739139072L, 146849);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19709873356800L, 146850);
    Object localObject2 = paramJSONObject.optString("type", "wgs84");
    w.v("MicroMsg.JsApiGetLocation", "doGeoLocation, geoType = %s", new Object[] { localObject2 });
    Object localObject1 = localObject2;
    if (bg.nm((String)localObject2)) {
      localObject1 = "wgs84";
    }
    if ((!bg.nm((String)localObject1)) && (!ieY.contains(localObject1)))
    {
      w.e("MicroMsg.JsApiGetLocation", "doGeoLocation fail, unsupported type = %s", new Object[] { localObject1 });
      paramj.v(paramInt, d("fail:unsupported type", null));
      GMTrace.o(19709873356800L, 146850);
      return;
    }
    localObject2 = b(paramj);
    if (localObject2 == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19709873356800L, 146850);
      return;
    }
    LocationTask localLocationTask = new LocationTask();
    localLocationTask.hyI = paramj;
    localLocationTask.hXU = paramInt;
    localLocationTask.ifa = this;
    localLocationTask.ifb = ((String)localObject1);
    localLocationTask.ieZ = new WeakReference(localObject2);
    localLocationTask.ifc = paramJSONObject.optBoolean("altitude", false);
    com.tencent.mm.plugin.appbrand.o.d.aR(localLocationTask);
    if ((localLocationTask.ieZ != null) && (localLocationTask.ieZ.get() != null))
    {
      ((AppBrandPageView)localLocationTask.ieZ.get()).a(localLocationTask);
      af.t(new JsApiGetLocation.LocationTask.1(localLocationTask));
    }
    localLocationTask.ifl = 1;
    AppBrandMainProcessService.a(localLocationTask);
    GMTrace.o(19709873356800L, 146850);
  }
  
  private static final class LocationTask
    extends MainProcessTask
    implements AppBrandPageView.b
  {
    public static final Parcelable.Creator<LocationTask> CREATOR;
    public double aEG;
    public double aEH;
    public double aEJ;
    public int hXU;
    public j hyI;
    int iaA;
    public WeakReference<AppBrandPageView> ieZ;
    public JsApiGetLocation ifa;
    public String ifb;
    public boolean ifc;
    public boolean ifd;
    public float ife;
    public float iff;
    public double ifg;
    public double ifh;
    public int ifi;
    private volatile a.a ifj;
    int ifl;
    long ifm;
    private boolean ipv;
    
    static
    {
      GMTrace.i(19706786349056L, 146827);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19706786349056L, 146827);
    }
    
    LocationTask()
    {
      GMTrace.i(19706115260416L, 146822);
      this.ipv = false;
      this.ifj = null;
      this.ifl = 0;
      this.ifm = 0L;
      this.iaA = 0;
      GMTrace.o(19706115260416L, 146822);
    }
    
    LocationTask(Parcel paramParcel)
    {
      GMTrace.i(19706249478144L, 146823);
      this.ipv = false;
      this.ifj = null;
      this.ifl = 0;
      this.ifm = 0L;
      this.iaA = 0;
      f(paramParcel);
      GMTrace.o(19706249478144L, 146823);
    }
    
    public final void RY()
    {
      GMTrace.i(19705175736320L, 146815);
      com.tencent.mm.plugin.appbrand.o.d.aR(this);
      switch (this.ifl)
      {
      default: 
        this.ifd = false;
        VL();
        GMTrace.o(19705175736320L, 146815);
        return;
      case 2: 
        Iterator localIterator = JsApiGetLocation.dLS.iterator();
        while (localIterator.hasNext())
        {
          a.a locala = (a.a)localIterator.next();
          c.Ir().c(locala);
        }
        JsApiGetLocation.dLS.clear();
        w.i("MicroMsg.JsApiGetLocation", "Stop All Location Callbacks");
        GMTrace.o(19705175736320L, 146815);
        return;
      }
      this.ifj = new a.a()
      {
        public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
        {
          GMTrace.i(19709336485888L, 146846);
          if (!paramAnonymousBoolean)
          {
            GMTrace.o(19709336485888L, 146846);
            return true;
          }
          w.v("MicroMsg.JsApiGetLocation", "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f, altitude : %s", new Object[] { Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble1), Double.valueOf(paramAnonymousDouble2), Double.valueOf(paramAnonymousDouble3) });
          JsApiGetLocation.LocationTask.this.ifd = true;
          JsApiGetLocation.LocationTask.this.ife = paramAnonymousFloat2;
          JsApiGetLocation.LocationTask.this.iff = paramAnonymousFloat1;
          JsApiGetLocation.LocationTask localLocationTask = JsApiGetLocation.LocationTask.this;
          double d = paramAnonymousDouble1;
          if (paramAnonymousDouble1 == 0.0D) {
            d = -1.0D;
          }
          localLocationTask.aEJ = d;
          JsApiGetLocation.LocationTask.this.aEH = paramAnonymousDouble2;
          JsApiGetLocation.LocationTask.this.aEG = paramAnonymousDouble3;
          JsApiGetLocation.LocationTask.this.ifg = 0.0D;
          JsApiGetLocation.LocationTask.this.ifh = paramAnonymousDouble2;
          JsApiGetLocation.LocationTask.this.ifi = paramAnonymousInt;
          if ((paramAnonymousDouble3 != 0.0D) || (!JsApiGetLocation.LocationTask.this.ifc))
          {
            w.i("MicroMsg.JsApiGetLocation", "Stop callback");
            JsApiGetLocation.LocationTask.this.Yj();
            JsApiGetLocation.LocationTask.b(JsApiGetLocation.LocationTask.this);
          }
          for (;;)
          {
            GMTrace.o(19709336485888L, 146846);
            return false;
            h.xB().h(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19710544445440L, 146855);
                JsApiGetLocation.LocationTask.this.Yj();
                JsApiGetLocation.LocationTask.a(JsApiGetLocation.LocationTask.this);
                GMTrace.o(19710544445440L, 146855);
              }
            }, 5000L);
            w.i("MicroMsg.JsApiGetLocation", "post delay 5 sec.");
          }
        }
      };
      new ae(Looper.getMainLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19704907300864L, 146813);
          w.i("MicroMsg.JsApiGetLocation", "Timeout, callback running? %b", new Object[] { Boolean.valueOf(JsApiGetLocation.LocationTask.this.WR()) });
          if (JsApiGetLocation.LocationTask.this.WR())
          {
            JsApiGetLocation.LocationTask.this.Yj();
            JsApiGetLocation.LocationTask.this.ifd = false;
            JsApiGetLocation.LocationTask.c(JsApiGetLocation.LocationTask.this);
          }
          GMTrace.o(19704907300864L, 146813);
        }
      }, 20000L);
      if (this.ifb.equalsIgnoreCase("gcj02")) {
        c.Ir().b(this.ifj, false);
      }
      for (;;)
      {
        JsApiGetLocation.dLS.add(this.ifj);
        GMTrace.o(19705175736320L, 146815);
        return;
        if (this.ifb.equalsIgnoreCase("wgs84")) {
          c.Ir().a(this.ifj, false);
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19705041518592L, 146814);
      super.VK();
      WS();
      com.tencent.mm.plugin.appbrand.o.d.aS(this);
      if (this.hyI != null)
      {
        if (!this.ifd) {
          break label225;
        }
        HashMap localHashMap = new HashMap(4);
        localHashMap.put("latitude", Float.valueOf(this.ife));
        localHashMap.put("longitude", Float.valueOf(this.iff));
        localHashMap.put("speed", Double.valueOf(this.aEJ));
        localHashMap.put("accuracy", Double.valueOf(this.aEH));
        if (this.ifc) {
          localHashMap.put("altitude", Double.valueOf(this.aEG));
        }
        if (b.bPq()) {
          localHashMap.put("provider", Integer.valueOf(this.ifi));
        }
        localHashMap.put("verticalAccuracy", Double.valueOf(this.ifg));
        localHashMap.put("horizontalAccuracy", Double.valueOf(this.ifh));
        this.hyI.v(this.hXU, this.ifa.d("ok", localHashMap));
      }
      for (;;)
      {
        this.ipv = true;
        GMTrace.o(19705041518592L, 146814);
        return;
        label225:
        this.hyI.v(this.hXU, this.ifa.d("fail", null));
      }
    }
    
    public final boolean WR()
    {
      GMTrace.i(21033662808064L, 156713);
      if ((this.ifj != null) && (JsApiGetLocation.dLS.contains(this.ifj)))
      {
        GMTrace.o(21033662808064L, 156713);
        return true;
      }
      GMTrace.o(21033662808064L, 156713);
      return false;
    }
    
    public final void WS()
    {
      GMTrace.i(19705444171776L, 146817);
      AppBrandPageView localAppBrandPageView;
      if (this.ieZ != null)
      {
        localAppBrandPageView = (AppBrandPageView)this.ieZ.get();
        if (localAppBrandPageView != null) {}
      }
      else
      {
        GMTrace.o(19705444171776L, 146817);
        return;
      }
      long l = System.currentTimeMillis() - this.ifm;
      if (l < 3000L)
      {
        localAppBrandPageView.iuf.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19708531179520L, 146840);
            JsApiGetLocation.LocationTask.this.WS();
            GMTrace.o(19708531179520L, 146840);
          }
        }, 3000L - l);
        GMTrace.o(19705444171776L, 146817);
        return;
      }
      com.tencent.mm.plugin.appbrand.page.a.j(localAppBrandPageView.hzM).jf(this.iaA);
      GMTrace.o(19705444171776L, 146817);
    }
    
    public final void Wb()
    {
      GMTrace.i(19705578389504L, 146818);
      if ((this.ieZ != null) && (this.ieZ.get() != null)) {
        ((AppBrandPageView)this.ieZ.get()).b(this);
      }
      if (!this.ipv) {
        this.hyI.v(this.hXU, this.ifa.d("fail", null));
      }
      com.tencent.mm.plugin.appbrand.o.d.aS(this);
      WS();
      this.ifl = 2;
      AppBrandMainProcessService.a(this);
      GMTrace.o(19705578389504L, 146818);
    }
    
    public final void Yj()
    {
      GMTrace.i(21033797025792L, 156714);
      c.Ir().c(this.ifj);
      JsApiGetLocation.dLS.remove(this.ifj);
      this.ifj = null;
      GMTrace.o(21033797025792L, 156714);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19705712607232L, 146819);
      GMTrace.o(19705712607232L, 146819);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19705981042688L, 146821);
      super.f(paramParcel);
      this.ifb = paramParcel.readString();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.ifc = bool1;
        if (paramParcel.readByte() == 0) {
          break label139;
        }
      }
      label139:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.ifd = bool1;
        this.ife = paramParcel.readFloat();
        this.iff = paramParcel.readFloat();
        this.aEJ = paramParcel.readDouble();
        this.aEH = paramParcel.readDouble();
        this.aEG = paramParcel.readDouble();
        this.ifg = paramParcel.readDouble();
        this.ifh = paramParcel.readDouble();
        this.ifl = paramParcel.readInt();
        this.ifi = paramParcel.readInt();
        GMTrace.o(19705981042688L, 146821);
        return;
        bool1 = false;
        break;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19705846824960L, 146820);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.ifb);
      if (this.ifc)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.ifd) {
          break label142;
        }
      }
      label142:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        paramParcel.writeFloat(this.ife);
        paramParcel.writeFloat(this.iff);
        paramParcel.writeDouble(this.aEJ);
        paramParcel.writeDouble(this.aEH);
        paramParcel.writeDouble(this.aEG);
        paramParcel.writeDouble(this.ifg);
        paramParcel.writeDouble(this.ifh);
        paramParcel.writeInt(this.ifl);
        paramParcel.writeInt(this.ifi);
        GMTrace.o(19705846824960L, 146820);
        return;
        b1 = 0;
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\lbs\JsApiGetLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */