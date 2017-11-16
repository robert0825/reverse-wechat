package com.tencent.mm.modelgeo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public abstract class e
  implements TencentLocationListener
{
  private final Map<String, Integer> gFu;
  
  public e()
  {
    GMTrace.i(488284094464L, 3638);
    this.gFu = new HashMap();
    this.gFu.put("gps", Integer.valueOf(0));
    this.gFu.put("network", Integer.valueOf(1));
    GMTrace.o(488284094464L, 3638);
  }
  
  public void b(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    GMTrace.i(15681328250880L, 116835);
    GMTrace.o(15681328250880L, 116835);
  }
  
  public void onLocationChanged(TencentLocation paramTencentLocation, int paramInt, String paramString)
  {
    GMTrace.i(488418312192L, 3639);
    w.i("MicroMsg.SLocationListener", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s", new Object[] { Double.valueOf(paramTencentLocation.getLatitude()), Double.valueOf(paramTencentLocation.getLongitude()), Float.valueOf(paramTencentLocation.getAccuracy()), Integer.valueOf(paramInt), paramTencentLocation.getAreaStat(), Float.valueOf(paramTencentLocation.getSpeed()), Float.valueOf(paramTencentLocation.getBearing()), paramString, paramTencentLocation.getProvider() });
    if (paramInt == 0)
    {
      g.ork.a(584L, 1L, 1L, true);
      b(true, paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), ((Integer)this.gFu.get(paramTencentLocation.getProvider())).intValue(), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude());
      GMTrace.o(488418312192L, 3639);
      return;
    }
    g.ork.a(584L, 2L, 1L, true);
    if (paramInt == 1) {
      g.ork.a(584L, 3L, 1L, true);
    }
    for (;;)
    {
      b(false, paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), ((Integer)this.gFu.get(paramTencentLocation.getProvider())).intValue(), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude());
      GMTrace.o(488418312192L, 3639);
      return;
      if (paramInt == 4) {
        g.ork.a(584L, 4L, 1L, true);
      }
    }
  }
  
  public void onStatusUpdate(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(488552529920L, 3640);
    w.d("MicroMsg.SLocationListener", "onStatusUpdate, name=%s, status=%d, desc=%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    GMTrace.o(488552529920L, 3640);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */