package com.d.a.a;

import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import java.util.Iterator;

final class k
  extends c
  implements GpsStatus.Listener, LocationListener
{
  private static k aFz;
  private LocationManager Hi;
  private boolean aFA;
  private GpsStatus aFB;
  private a aFC;
  private final l aFD = new l();
  private Looper mLooper;
  private Context sN;
  
  private void a(long paramLong, float paramFloat)
  {
    this.Hi.requestLocationUpdates("gps", paramLong, paramFloat, this, this.mLooper);
  }
  
  static k nJ()
  {
    if (aFz == null) {
      aFz = new k();
    }
    return aFz;
  }
  
  final void P(Context paramContext)
  {
    this.sN = paramContext;
    this.Hi = ((LocationManager)paramContext.getSystemService("location"));
    if ((this.Hi != null) && (this.Hi.getProvider("gps") != null)) {}
    for (boolean bool = true;; bool = false)
    {
      this.aFA = bool;
      return;
    }
  }
  
  final void Q(Context paramContext)
  {
    if (!this.aFA) {
      return;
    }
    this.Hi.removeUpdates(this);
    this.Hi.removeGpsStatusListener(this);
  }
  
  final void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    if (!this.aFA) {
      return;
    }
    this.aFC = ((a)parama);
    if (paramHandler != null) {}
    for (paramContext = paramHandler.getLooper();; paramContext = null)
    {
      this.mLooper = paramContext;
      a(this.aFC.aDL, this.aFC.aFE);
      this.Hi.addGpsStatusListener(this);
      this.aFD.aFM = Math.max(5000L, Math.min(this.aFC.aDL + 5000L, 65000L));
      return;
    }
  }
  
  final void a(Handler paramHandler, d.a parama)
  {
    if (parama == null) {}
    for (;;)
    {
      try
      {
        parama = new a(30000L);
        super.a(paramHandler, parama);
        return;
      }
      finally {}
      if ((parama instanceof a)) {
        parama = (a)parama;
      } else {
        parama = new a(parama.aDL);
      }
    }
  }
  
  final void nC() {}
  
  final void nD()
  {
    if ((!this.aFA) || (!this.aDI) || (this.aFC.aDL >= 300000L)) {
      return;
    }
    a(300000L, this.aFC.aFE);
  }
  
  final void nE()
  {
    if ((!this.aFA) || (!this.aDI) || (this.aFC.aDL >= 300000L)) {
      return;
    }
    a(this.aFC.aDL, this.aFC.aFE);
  }
  
  public final void onGpsStatusChanged(int paramInt)
  {
    if (paramInt == 4)
    {
      if (this.aFB == null) {
        this.aFB = this.Hi.getGpsStatus(null);
      }
    }
    else {
      return;
    }
    this.Hi.getGpsStatus(this.aFB);
  }
  
  public final void onLocationChanged(Location paramLocation)
  {
    int i;
    if (!y.aJN)
    {
      if (Settings.Secure.getString(this.sN.getContentResolver(), "mock_location").equals("0")) {}
      for (i = 0; i != 0; i = 1) {
        return;
      }
    }
    Iterator localIterator;
    int j;
    if (this.aFB != null)
    {
      localIterator = this.aFB.getSatellites().iterator();
      i = 0;
      j = 0;
      if (localIterator.hasNext()) {}
    }
    for (;;)
    {
      this.aFD.a(paramLocation.getAccuracy(), j, paramLocation.getTime());
      c(new b(paramLocation.getLatitude(), paramLocation.getLongitude(), paramLocation.getAltitude(), paramLocation.getAccuracy(), paramLocation.getSpeed(), i, j, this.aFD.aFI, this.aFD.aFQ / 1000L));
      return;
      GpsSatellite localGpsSatellite = (GpsSatellite)localIterator.next();
      int k = i + 1;
      i = k;
      if (!localGpsSatellite.usedInFix()) {
        break;
      }
      j += 1;
      i = k;
      break;
      j = 0;
      i = 0;
    }
  }
  
  public final void onProviderDisabled(String paramString) {}
  
  public final void onProviderEnabled(String paramString) {}
  
  public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
  
  static final class a
    extends d.a
  {
    final int aFE = 0;
    
    a(long paramLong)
    {
      super();
    }
  }
  
  static final class b
    extends p
  {
    final double aFF;
    final float aFG;
    final float aFH;
    final float aFI;
    final int aFJ;
    final int aFK;
    final long aFL;
    final double lat;
    final double lng;
    
    public b(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3, long paramLong)
    {
      super();
      this.lat = paramDouble1;
      this.lng = paramDouble2;
      this.aFF = paramDouble3;
      this.aFG = paramFloat1;
      this.aFH = paramFloat2;
      this.aFJ = paramInt1;
      this.aFK = paramInt2;
      this.aFI = paramFloat3;
      this.aFL = paramLong;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */