package com.tencent.mm.modelgeo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public abstract class f
  implements TencentLocationListener
{
  private final Map<String, Integer> gFu;
  
  public f()
  {
    GMTrace.i(484257562624L, 3608);
    this.gFu = new HashMap();
    this.gFu.put("gps", Integer.valueOf(0));
    this.gFu.put("network", Integer.valueOf(1));
    GMTrace.o(484257562624L, 3608);
  }
  
  public void b(boolean paramBoolean, double paramDouble1, double paramDouble2, int paramInt, double paramDouble3, double paramDouble4, double paramDouble5)
  {
    GMTrace.i(15680657162240L, 116830);
    GMTrace.o(15680657162240L, 116830);
  }
  
  public void onLocationChanged(TencentLocation paramTencentLocation, int paramInt, String paramString)
  {
    GMTrace.i(484391780352L, 3609);
    w.i("MicroMsg.SLocationListenerWgs84", "lat=%f, lng=%f, accuracy=%f errcode=%d, areastat=%d, speed=%f, bearing=%f, reason=%s, provider=%s", new Object[] { Double.valueOf(paramTencentLocation.getLatitude()), Double.valueOf(paramTencentLocation.getLongitude()), Float.valueOf(paramTencentLocation.getAccuracy()), Integer.valueOf(paramInt), paramTencentLocation.getAreaStat(), Float.valueOf(paramTencentLocation.getSpeed()), Float.valueOf(paramTencentLocation.getBearing()), paramString, paramTencentLocation.getProvider() });
    if (paramInt == 0)
    {
      b(true, paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), ((Integer)this.gFu.get(paramTencentLocation.getProvider())).intValue(), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude());
      GMTrace.o(484391780352L, 3609);
      return;
    }
    b(false, paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), ((Integer)this.gFu.get(paramTencentLocation.getProvider())).intValue(), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude());
    GMTrace.o(484391780352L, 3609);
  }
  
  public void onStatusUpdate(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(484525998080L, 3610);
    w.d("MicroMsg.SLocationListenerWgs84", "onStatusUpdate, name=%s, status=%d, desc=%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    GMTrace.o(484525998080L, 3610);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */