package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

final class m
{
  static final a Hh = new a();
  private final LocationManager Hi;
  final Context mContext;
  
  m(Context paramContext)
  {
    this.mContext = paramContext;
    this.Hi = ((LocationManager)paramContext.getSystemService("location"));
  }
  
  static boolean a(a parama)
  {
    return (parama != null) && (parama.Ho > System.currentTimeMillis());
  }
  
  static void b(Location paramLocation)
  {
    a locala = Hh;
    long l1 = System.currentTimeMillis();
    if (l.He == null) {
      l.He = new l();
    }
    l locall = l.He;
    locall.a(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = locall.Hf;
    locall.a(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    if (locall.state == 1) {}
    long l3;
    long l4;
    long l5;
    for (boolean bool = true;; bool = false)
    {
      l3 = locall.Hg;
      l4 = locall.Hf;
      locall.a(86400000L + l1, paramLocation.getLatitude(), paramLocation.getLongitude());
      l5 = locall.Hg;
      if ((l3 != -1L) && (l4 != -1L)) {
        break;
      }
      l1 = 43200000L + l1;
      locala.Hj = bool;
      locala.Hk = l2;
      locala.Hl = l3;
      locala.Hm = l4;
      locala.Hn = l5;
      locala.Ho = l1;
      return;
    }
    if (l1 > l4) {
      l1 = 0L + l5;
    }
    for (;;)
    {
      l1 += 60000L;
      break;
      if (l1 > l3) {
        l1 = 0L + l4;
      } else {
        l1 = 0L + l3;
      }
    }
  }
  
  final Location p(String paramString)
  {
    if (this.Hi != null) {
      try
      {
        if (this.Hi.isProviderEnabled(paramString))
        {
          paramString = this.Hi.getLastKnownLocation(paramString);
          return paramString;
        }
      }
      catch (Exception paramString) {}
    }
    return null;
  }
  
  private static final class a
  {
    boolean Hj;
    long Hk;
    long Hl;
    long Hm;
    long Hn;
    long Ho;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */