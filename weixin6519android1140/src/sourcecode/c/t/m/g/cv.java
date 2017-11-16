package c.t.m.g;

import android.annotation.SuppressLint;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.format.DateFormat;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import java.util.Arrays;
import java.util.Iterator;

final class cv
  implements GpsStatus.Listener, LocationListener
{
  private long a = 0L;
  public final cj b;
  private int c = 1024;
  private boolean d = false;
  private boolean e = false;
  private int f = 0;
  private int g = 0;
  private volatile boolean h;
  public HandlerThread i;
  private Runnable j;
  private Handler k;
  public cv l;
  private boolean m;
  private cp n;
  private GpsStatus o;
  private long p = -1L;
  private final double[] q = new double[2];
  
  public cv(cj paramcj)
  {
    this.b = paramcj;
    this.n = cp.a();
    this.j = new Runnable()
    {
      public final void run()
      {
        try
        {
          Bundle localBundle = new Bundle();
          cv.this.b.d().sendExtraCommand("gps", "force_xtra_injection", localBundle);
          cv.this.b.d().sendExtraCommand("gps", "force_time_injection", localBundle);
        }
        catch (Throwable localThrowable1)
        {
          for (;;)
          {
            try
            {
              cv.this.b.d().addGpsStatusListener(cv.this.l);
              cv.this.b.d().requestLocationUpdates("gps", 1000L, 0.0F, cv.this.l, cv.this.i.getLooper());
              return;
            }
            catch (Throwable localThrowable2)
            {
              localThrowable2.toString();
            }
            localThrowable1 = localThrowable1;
            localThrowable1.toString();
          }
        }
      }
    };
    this.l = this;
  }
  
  private static void a(Location paramLocation, double paramDouble1, double paramDouble2, int paramInt)
  {
    Bundle localBundle2 = paramLocation.getExtras();
    Bundle localBundle1 = localBundle2;
    if (localBundle2 == null) {
      localBundle1 = new Bundle();
    }
    localBundle1.putDouble("lat", paramDouble1);
    localBundle1.putDouble("lng", paramDouble2);
    localBundle1.putInt("rssi", paramInt);
    paramLocation.setExtras(localBundle1);
  }
  
  private static boolean a(double paramDouble)
  {
    return Math.abs(Double.valueOf(paramDouble).longValue() - paramDouble) < Double.MIN_VALUE;
  }
  
  @SuppressLint({"NewApi"})
  private boolean a(Location paramLocation)
  {
    if (!TencentExtraKeys.MOCK_LOCATION_FILTER) {}
    for (;;)
    {
      return false;
      try
      {
        if (!this.b.d().isProviderEnabled("gps")) {
          return true;
        }
        if (Build.VERSION.SDK_INT >= 18)
        {
          boolean bool = paramLocation.isFromMockProvider();
          if (bool) {
            return true;
          }
        }
      }
      catch (Throwable paramLocation) {}
    }
    return false;
  }
  
  private void c(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 3;; i1 = 4)
    {
      Message localMessage = new Message();
      localMessage.what = 12999;
      localMessage.arg1 = 12004;
      localMessage.arg2 = i1;
      this.b.c(localMessage);
      return;
    }
  }
  
  private void e()
  {
    int i1;
    if (this.c == 4) {
      i1 = 1;
    }
    for (;;)
    {
      Message localMessage = new Message();
      localMessage.what = 12999;
      localMessage.arg1 = 12002;
      localMessage.arg2 = i1;
      this.b.c(localMessage);
      return;
      if (this.c == 0) {
        i1 = 0;
      } else {
        i1 = -1;
      }
    }
  }
  
  private void f()
  {
    Object localObject1 = null;
    try
    {
      this.g = 0;
      this.f = 0;
      localObject2 = this.b.d();
    }
    catch (Exception localException1)
    {
      Object localObject2;
      label28:
      localException1.toString();
      return;
    }
    try
    {
      localObject2 = ((LocationManager)localObject2).getGpsStatus(null);
      localObject1 = localObject2;
    }
    catch (Exception localException2)
    {
      break label28;
    }
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      int i1 = ((GpsStatus)localObject1).getMaxSatellites();
      localObject1 = ((GpsStatus)localObject1).getSatellites().iterator();
      if (localObject1 != null) {
        while ((((Iterator)localObject1).hasNext()) && (this.f <= i1))
        {
          this.f += 1;
          if (((GpsSatellite)((Iterator)localObject1).next()).usedInFix()) {
            this.g += 1;
          }
        }
      }
    }
  }
  
  private int g()
  {
    Object localObject = null;
    int i2 = -1;
    try
    {
      GpsStatus localGpsStatus = this.b.d().getGpsStatus(null);
      localObject = localGpsStatus;
    }
    catch (Exception localException)
    {
      int i3;
      int i1;
      for (;;) {}
    }
    if (localObject == null) {}
    do
    {
      return i2;
      i3 = ((GpsStatus)localObject).getMaxSatellites();
      localObject = ((GpsStatus)localObject).getSatellites().iterator();
    } while (localObject == null);
    i1 = 0;
    for (;;)
    {
      i2 = i1;
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      i2 = i1;
      if (i1 > i3) {
        break;
      }
      ((Iterator)localObject).next();
      i1 += 1;
    }
  }
  
  private int h()
  {
    Object localObject = null;
    int i2 = -1;
    try
    {
      GpsStatus localGpsStatus = this.b.d().getGpsStatus(null);
      localObject = localGpsStatus;
    }
    catch (Exception localException)
    {
      int i3;
      int i1;
      for (;;) {}
    }
    if (localObject == null) {}
    do
    {
      return i2;
      i3 = ((GpsStatus)localObject).getMaxSatellites();
      localObject = ((GpsStatus)localObject).getSatellites().iterator();
    } while (localObject == null);
    i1 = 0;
    for (;;)
    {
      i2 = i1;
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      i2 = i1;
      if (i1 > i3) {
        break;
      }
      if (((GpsSatellite)((Iterator)localObject).next()).usedInFix()) {
        i1 += 1;
      }
    }
  }
  
  public final Location a()
  {
    Object localObject = null;
    try
    {
      Location localLocation = this.b.d().getLastKnownLocation("network");
      localObject = localLocation;
    }
    catch (Throwable localThrowable)
    {
      int i1;
      for (;;) {}
    }
    if (localObject == null) {
      return cs.a;
    }
    if ((this.m) && (du.a(((Location)localObject).getLatitude(), ((Location)localObject).getLongitude()))) {}
    for (i1 = 1; i1 != 0; i1 = 0)
    {
      b.a.a((Location)localObject, this.q);
      a((Location)localObject, this.q[0], this.q[1], 0);
      return (Location)localObject;
    }
    a((Location)localObject, ((Location)localObject).getLatitude(), ((Location)localObject).getLongitude(), 0);
    return (Location)localObject;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.h) {}
    for (;;)
    {
      return;
      this.i = new HandlerThread("gps_provider");
      this.i.start();
      this.k = new Handler(this.i.getLooper());
      this.h = true;
      LocationManager localLocationManager = this.b.d();
      if (!paramBoolean) {}
      try
      {
        this.k.post(this.j);
        while (d())
        {
          this.c = 4;
          e();
          return;
          localLocationManager.requestLocationUpdates("passive", 1000L, 0.0F, this);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          dt.a = true;
        }
      }
    }
  }
  
  public final void b()
  {
    if (!this.h) {
      return;
    }
    if (this.i != null)
    {
      this.i.quit();
      this.i = null;
    }
    this.h = false;
    this.a = 0L;
    this.c = 1024;
    this.d = false;
    this.e = false;
    this.f = 0;
    this.g = 0;
    this.m = false;
    this.p = -1L;
    Arrays.fill(this.q, 0.0D);
    this.b.b(this);
    LocationManager localLocationManager = this.b.d();
    try
    {
      localLocationManager.removeGpsStatusListener(this);
      try
      {
        localLocationManager.removeUpdates(this);
        return;
      }
      catch (Exception localException1) {}
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public final boolean c()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((this.c & 0x2) == 2)
    {
      bool1 = bool2;
      if (System.currentTimeMillis() - this.a < cu.a().b()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean d()
  {
    LocationManager localLocationManager = this.b.d();
    try
    {
      boolean bool = localLocationManager.isProviderEnabled("gps");
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public final void onGpsStatusChanged(int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
      for (;;)
      {
        f();
        paramInt = g();
        int i1 = h();
        if (paramInt > 0) {
          this.e = true;
        }
        if (i1 > 0) {
          this.d = true;
        }
        return;
        this.c |= 0x1;
        continue;
        this.c = 0;
        continue;
        this.c |= 0x2;
      }
    }
    LocationManager localLocationManager = this.b.d();
    for (;;)
    {
      try
      {
        if (this.o == null)
        {
          this.o = localLocationManager.getGpsStatus(null);
          if (this.o == null) {
            break label249;
          }
          bool = this.n.a(this.o);
          if (!bool) {
            break label201;
          }
          if ((this.p == -1L) || (this.p == 0L)) {
            c(bool);
          }
          this.p = System.currentTimeMillis();
          break;
        }
        localLocationManager.getGpsStatus(this.o);
        continue;
      }
      catch (Exception localException)
      {
        continue;
      }
      label201:
      if ((this.p != -1L) && ((System.currentTimeMillis() - this.p <= 40000L) || (this.p == 0L))) {
        break;
      }
      c(bool);
      this.p = 0L;
      break;
      label249:
      boolean bool = true;
    }
  }
  
  public final void onLocationChanged(Location paramLocation)
  {
    if (paramLocation != null) {}
    for (;;)
    {
      double d1;
      double d2;
      int i2;
      try
      {
        if (!"gps".equals(paramLocation.getProvider())) {
          return;
        }
        d1 = paramLocation.getLatitude();
        d2 = paramLocation.getLongitude();
        new StringBuilder("onLocationChanged: ").append(DateFormat.format("yyyy-MM-dd kk:mm:ss", this.a)).append(d1).append(",").append(d2);
        if (paramLocation.getAccuracy() > 10000.0F)
        {
          i1 = 0;
          if (i1 == 0) {
            continue;
          }
          f();
          this.c |= 0x2;
          if (a(paramLocation)) {
            continue;
          }
          this.a = System.currentTimeMillis();
          i1 = 0;
          if (this.g == 3)
          {
            i1 = 1;
            if ((!this.m) || (!du.a(paramLocation.getLatitude(), paramLocation.getLongitude()))) {
              break label444;
            }
            i2 = 1;
            if (i2 == 0) {
              continue;
            }
            b.a.a(paramLocation, this.q);
            a(paramLocation, this.q[0], this.q[1], i1);
            paramLocation = new dg(paramLocation, this.a, this.f, this.g, this.c);
            this.b.c(paramLocation);
            if ((this.p != -1L) && (this.p != 0L)) {
              continue;
            }
            c(true);
            this.p = System.currentTimeMillis();
          }
        }
        else
        {
          if ((a(d1)) && (a(d2)))
          {
            i1 = 0;
            continue;
          }
          if ((Math.abs(d1) < 1.0E-8D) || (Math.abs(d2) < 1.0E-8D)) {
            break label386;
          }
          if (Math.abs(d1 - 1.0D) < 1.0E-8D) {
            break label392;
          }
          if (Math.abs(d2 - 1.0D) >= 1.0E-8D) {
            break label398;
          }
          break label392;
        }
        if ((this.g >= 4) && (this.g <= 6))
        {
          i1 = 2;
          continue;
        }
        if (this.g < 7) {
          continue;
        }
        i1 = 3;
        continue;
        a(paramLocation, paramLocation.getLatitude(), paramLocation.getLongitude(), i1);
        continue;
        return;
      }
      catch (Throwable paramLocation)
      {
        return;
      }
      label386:
      int i1 = 0;
      continue;
      label392:
      i1 = 0;
      continue;
      label398:
      if ((d1 < -90.0D) || (d1 > 90.0D) || (d2 < -180.0D) || (d2 > 180.0D))
      {
        i1 = 0;
      }
      else
      {
        i1 = 1;
        continue;
        label444:
        i2 = 0;
      }
    }
  }
  
  public final void onProviderDisabled(String paramString)
  {
    if ("gps".equals(paramString))
    {
      this.g = 0;
      this.f = 0;
      this.c = 0;
      this.d = false;
      this.a = 0L;
      e();
    }
  }
  
  public final void onProviderEnabled(String paramString)
  {
    if ("gps".equals(paramString))
    {
      this.c = 4;
      e();
    }
  }
  
  public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */