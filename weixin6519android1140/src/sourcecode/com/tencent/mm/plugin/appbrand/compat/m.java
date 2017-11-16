package com.tencent.mm.plugin.appbrand.compat;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.mm.bv.a;
import com.tencent.mm.plugin.appbrand.compat.a.d;
import com.tencent.mm.plugin.appbrand.compat.a.d.a;
import com.tencent.mm.plugin.appbrand.compat.a.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;

public final class m
  implements d
{
  private final TencentLocationManager hPl;
  private final a hPm;
  public final HashSet<d.a> hPn;
  
  public m()
  {
    GMTrace.i(19483045396480L, 145160);
    this.hPm = new a();
    this.hPn = new HashSet();
    this.hPl = TencentLocationManager.getInstance(ab.getContext());
    GMTrace.o(19483045396480L, 145160);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(19483179614208L, 145161);
    synchronized (this.hPn)
    {
      Iterator localIterator = this.hPn.iterator();
      while (localIterator.hasNext())
      {
        d.a locala = (d.a)localIterator.next();
        if ((locala != null) && (locala.equals(parama)))
        {
          GMTrace.o(19483179614208L, 145161);
          return;
        }
      }
      this.hPn.add(parama);
      w.i("MicroMsg.AppbrandMapLocationMgr", "registerLocationListener %d", new Object[] { Integer.valueOf(this.hPn.size()) });
      if (this.hPn.size() == 1)
      {
        w.i("MicroMsg.AppbrandMapLocationMgr", "registerLocation ");
        parama = TencentLocationRequest.create();
        parama.setInterval(2000L);
        this.hPl.setCoordinateType(1);
        this.hPl.requestLocationUpdates(parama, this.hPm, a.bVB().getLooper());
      }
      GMTrace.o(19483179614208L, 145161);
      return;
    }
  }
  
  public final void b(d.a parama)
  {
    GMTrace.i(19483313831936L, 145162);
    if (parama == null)
    {
      GMTrace.o(19483313831936L, 145162);
      return;
    }
    synchronized (this.hPn)
    {
      Iterator localIterator = this.hPn.iterator();
      while (localIterator.hasNext())
      {
        d.a locala = (d.a)localIterator.next();
        if ((locala != null) && (locala.equals(parama))) {
          this.hPn.remove(locala);
        }
      }
      w.i("MicroMsg.AppbrandMapLocationMgr", "unregisterLocationListener %d", new Object[] { Integer.valueOf(this.hPn.size()) });
      if (this.hPn.size() == 0)
      {
        w.i("MicroMsg.AppbrandMapLocationMgr", "unregisterLocation ");
        this.hPl.removeUpdates(this.hPm);
      }
      GMTrace.o(19483313831936L, 145162);
      return;
    }
  }
  
  private final class a
    implements TencentLocationListener
  {
    public a()
    {
      GMTrace.i(19483716485120L, 145165);
      GMTrace.o(19483716485120L, 145165);
    }
    
    public final void onLocationChanged(TencentLocation paramTencentLocation, int paramInt, String arg3)
    {
      GMTrace.i(19483850702848L, 145166);
      synchronized (m.this.hPn)
      {
        d.a[] arrayOfa = (d.a[])m.this.hPn.toArray(new d.a[0]);
        int i = arrayOfa.length;
        paramInt = 0;
        if (paramInt < i)
        {
          ??? = arrayOfa[paramInt];
          if (??? != null) {
            ???.a(paramTencentLocation.getLatitude(), paramTencentLocation.getLongitude(), d.b.pc(paramTencentLocation.getProvider()), paramTencentLocation.getSpeed(), paramTencentLocation.getAccuracy(), paramTencentLocation.getAltitude());
          }
          paramInt += 1;
        }
      }
      GMTrace.o(19483850702848L, 145166);
    }
    
    public final void onStatusUpdate(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(19483984920576L, 145167);
      GMTrace.o(19483984920576L, 145167);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */