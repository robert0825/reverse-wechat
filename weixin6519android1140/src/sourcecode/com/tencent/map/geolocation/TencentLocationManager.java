package com.tencent.map.geolocation;

import android.content.Context;
import android.os.Looper;
import c.t.m.g.cj;
import c.t.m.g.ck;
import c.t.m.g.cw;

public final class TencentLocationManager
{
  public static final int COORDINATE_TYPE_GCJ02 = 1;
  public static final int COORDINATE_TYPE_WGS84 = 0;
  private static TencentLocationManager d;
  private final byte[] a = new byte[0];
  private final cj b;
  private final cw c;
  
  private TencentLocationManager(Context paramContext)
  {
    this.b = cj.a(paramContext);
    this.c = new cw(this.b);
  }
  
  public static TencentLocationManager getInstance(Context paramContext)
  {
    try
    {
      if (d != null) {
        break label60;
      }
      if (paramContext == null) {
        throw new NullPointerException("context is null");
      }
    }
    finally {}
    if (paramContext.getApplicationContext() == null) {
      throw new NullPointerException("application context is null");
    }
    d = new TencentLocationManager(paramContext.getApplicationContext());
    label60:
    paramContext = d;
    return paramContext;
  }
  
  public final String getBuild()
  {
    ck localck = this.b.i();
    if (localck != null) {
      return localck.e();
    }
    return "None";
  }
  
  public final int getCoordinateType()
  {
    return this.c.f();
  }
  
  public final TencentLocation getLastKnownLocation()
  {
    return this.c.a();
  }
  
  public final String getVersion()
  {
    ck localck = this.b.i();
    if (localck != null) {
      return localck.d();
    }
    return "None";
  }
  
  public final void removeUpdates(TencentLocationListener arg1)
  {
    synchronized (this.a)
    {
      this.c.e();
      return;
    }
  }
  
  public final int requestLocationUpdates(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener)
  {
    return requestLocationUpdates(paramTencentLocationRequest, paramTencentLocationListener, Looper.myLooper());
  }
  
  public final int requestLocationUpdates(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    if (paramTencentLocationRequest == null) {
      throw new NullPointerException("request is null");
    }
    if (paramTencentLocationListener == null) {
      throw new NullPointerException("listener is null");
    }
    if (paramLooper == null) {
      throw new NullPointerException("looper is null");
    }
    synchronized (this.a)
    {
      int i = this.c.a(paramTencentLocationRequest, paramTencentLocationListener, paramLooper);
      return i;
    }
  }
  
  public final int requestSingleFreshLocation(TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    if (paramTencentLocationListener == null) {
      throw new NullPointerException("listener is null");
    }
    if (paramLooper == null) {
      throw new NullPointerException("looper is null");
    }
    synchronized (this.a)
    {
      int i = this.c.a(paramTencentLocationListener, paramLooper);
      return i;
    }
  }
  
  public final void setCoordinateType(int paramInt)
  {
    if ((paramInt == 1) || (paramInt == 0)) {
      synchronized (this.a)
      {
        this.c.a(paramInt);
        return;
      }
    }
    throw new IllegalArgumentException("unknown coordinate type: " + paramInt);
  }
  
  public final int startDistanceCalculate(TencentDistanceListener paramTencentDistanceListener)
  {
    if (paramTencentDistanceListener == null) {
      throw new NullPointerException("listener is null");
    }
    synchronized (this.a)
    {
      int i = this.c.a(paramTencentDistanceListener);
      return i;
    }
  }
  
  public final boolean startIndoorLocation()
  {
    return this.c.c();
  }
  
  public final TencentDistanceAnalysis stopDistanceCalculate(TencentDistanceListener arg1)
  {
    synchronized (this.a)
    {
      TencentDistanceAnalysis localTencentDistanceAnalysis = this.c.b();
      return localTencentDistanceAnalysis;
    }
  }
  
  public final boolean stopIndoorLocation()
  {
    return this.c.d();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\map\geolocation\TencentLocationManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */