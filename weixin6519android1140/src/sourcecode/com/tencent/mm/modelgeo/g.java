package com.tencent.mm.modelgeo;

import android.content.Context;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationManagerOptions;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  private static g gFv;
  private static Context mContext;
  
  static
  {
    GMTrace.i(484123344896L, 3607);
    gFv = null;
    GMTrace.o(484123344896L, 3607);
  }
  
  private g()
  {
    GMTrace.i(483586473984L, 3603);
    GMTrace.o(483586473984L, 3603);
  }
  
  public static void Iv()
  {
    GMTrace.i(483854909440L, 3605);
    w.d("MicroMsg.SLocationManager", "removeUpdate");
    TencentLocationManager.getInstance(mContext).removeUpdates(null);
    GMTrace.o(483854909440L, 3605);
  }
  
  public static void a(TencentLocationListener paramTencentLocationListener, int paramInt, Looper paramLooper)
  {
    GMTrace.i(483989127168L, 3606);
    w.d("MicroMsg.SLocationManager", "requestLocationUpdate %s, isLoaded %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(TencentLocationManagerOptions.isLoadLibraryEnabled()) });
    com.tencent.mm.plugin.report.service.g.ork.a(584L, 0L, 1L, true);
    TencentLocationManager.getInstance(mContext).setCoordinateType(paramInt);
    TencentLocationRequest localTencentLocationRequest = TencentLocationRequest.create();
    localTencentLocationRequest.setInterval(2000L);
    w.i("MicroMsg.SLocationManager", "requestCode %d", new Object[] { Integer.valueOf(TencentLocationManager.getInstance(mContext).requestLocationUpdates(localTencentLocationRequest, paramTencentLocationListener, paramLooper)) });
    GMTrace.o(483989127168L, 3606);
  }
  
  public static g be(Context paramContext)
  {
    GMTrace.i(483720691712L, 3604);
    if (gFv == null) {
      gFv = new g();
    }
    mContext = paramContext;
    paramContext = gFv;
    GMTrace.o(483720691712L, 3604);
    return paramContext;
  }
  
  public static final class a
    extends Exception
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */