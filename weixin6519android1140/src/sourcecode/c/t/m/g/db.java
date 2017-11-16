package c.t.m.g;

import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationUtils;
import java.util.LinkedList;
import java.util.ListIterator;

public final class db
{
  private int a = 10;
  private int b = 4;
  private LinkedList<a> c = new LinkedList();
  private cr d = new cr();
  
  private boolean a(a parama, cj paramcj, boolean paramBoolean)
  {
    if (paramcj != null) {}
    for (;;)
    {
      int i;
      int k;
      try
      {
        if (this.c != null)
        {
          i = this.c.size();
          if (i != 0) {}
        }
        else
        {
          paramBoolean = true;
          return paramBoolean;
        }
        if (parama.d == 3)
        {
          paramBoolean = true;
          continue;
        }
        if ((parama.d == 1) && (!dy.a(paramcj)) && (!dy.b(paramcj)) && (!paramBoolean))
        {
          paramBoolean = true;
          continue;
        }
        if (parama.c - ((a)this.c.getLast()).c > 120000L)
        {
          this.c.clear();
          paramBoolean = true;
          continue;
        }
        if (this.c.size() >= this.b)
        {
          i = 1;
          if (i == 0) {
            continue;
          }
          i = 0;
          paramcj = this.c.listIterator(this.c.size());
          int j = 0;
          if (!paramcj.hasPrevious()) {
            break label284;
          }
          a locala = (a)paramcj.previous();
          if (b.a.a(locala.a, locala.b, parama.a, parama.b) / ((Math.abs(locala.c - parama.c) + 1L) / 1000.0D) > 100.0D)
          {
            k = 0;
            break label293;
            j += 1;
            k = this.b;
            if (j <= k) {
              break label287;
            }
            if (i <= 1) {
              continue;
            }
            paramBoolean = false;
          }
        }
        else
        {
          i = 0;
          continue;
        }
        k = 1;
        break label293;
        paramBoolean = true;
        continue;
        continue;
      }
      finally {}
      label284:
      label287:
      continue;
      label293:
      do
      {
        break;
      } while (k != 0);
      i += 1;
    }
  }
  
  public final void a()
  {
    try
    {
      this.c.clear();
      this.d.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(ds paramds)
  {
    label1166:
    for (;;)
    {
      cr localcr;
      double d2;
      double d3;
      double d1;
      long l3;
      try
      {
        if (paramds.getProvider().equalsIgnoreCase("gps"))
        {
          boolean bool = ch.a().d("gps_kalman");
          if (!bool) {
            return;
          }
        }
        if ((this.c == null) || ((this.c != null) && (this.c.size() == 0))) {
          continue;
        }
        localcr = this.d;
        d2 = paramds.getLatitude();
        d3 = paramds.getLongitude();
        d1 = paramds.getAccuracy();
        l3 = paramds.getTime();
        if (d1 >= 1.0D) {
          break label1166;
        }
        d1 = 1.0D;
        new StringBuilder("lat_me:").append(d2).append(",lng_me:").append(d3).append(",accuracy:").append(d1).append(",time:").append(l3).append(",lat:").append(localcr.d).append(",lng:").append(localcr.e);
        if (l3 - localcr.c >= 20000L)
        {
          localcr.a();
          new StringBuilder("Time:").append(l3).append(",last_time:").append(localcr.c);
        }
        localcr.a = ((float)(Math.abs(d2 - localcr.d) * 1000000.0D));
        localcr.b = ((float)(Math.abs(d3 - localcr.e) * 1000000.0D));
        new StringBuilder("Q:").append(localcr.a).append(",QLng:").append(localcr.b);
        if (localcr.f < 0.0D)
        {
          localcr.c = l3;
          localcr.d = d2;
          localcr.e = d3;
          localcr.f = (d1 * d1);
          paramds.a(this.d.d, this.d.e);
          continue;
        }
        l2 = l3 - localcr.c;
      }
      finally {}
      long l2;
      long l1 = l2;
      if (l2 < 1000L) {
        l1 = 1000L;
      }
      if (l1 > 0L)
      {
        localcr.f += l1;
        localcr.g += l1;
      }
      double d4 = localcr.f / (localcr.f + d1 * d1 + localcr.a * 5.0F);
      double d5 = localcr.g / (localcr.g + d1 * d1 + localcr.b * 5.0F);
      new StringBuilder("K:").append(d4).append(",KLng:").append(d5);
      if ((d4 >= 0.4D) && (d5 >= 0.4D))
      {
        double d6 = localcr.d;
        if (((localcr.h > 0.0D) && (d2 - localcr.d > 0.0D)) || ((localcr.h < 0.0D) && (d2 - localcr.d < 0.0D))) {
          localcr.d += localcr.h * (l1 / 1000L);
        }
        localcr.d += (d2 - localcr.d) * d4;
        new StringBuilder("lat:").append(localcr.d).append(",tmp:").append(d6).append(",timeInc:").append(l1);
        localcr.h = ((localcr.d - d6) / (l1 / 1000L));
        d6 = localcr.e;
        if (((localcr.i > 0.0D) && (d3 - localcr.e > 0.0D)) || ((localcr.i < 0.0D) && (d3 - localcr.e < 0.0D))) {
          localcr.e += localcr.i * (l1 / 1000L);
        }
        localcr.e += (d3 - localcr.e) * d5;
        new StringBuilder("lng:").append(localcr.e).append(",tmp:").append(d6).append(",timeInc:").append(l1);
        localcr.i = ((localcr.e - d6) / (l1 / 1000L));
        localcr.f = ((1.0D - d4) * localcr.f);
        localcr.g = ((1.0D - d5) * localcr.g);
        localcr.c = l3;
        new StringBuilder("last_metres_per_second:").append(localcr.h).append(",last_metres_per_second_lng:").append(localcr.i);
      }
      for (;;)
      {
        new StringBuilder("variance:").append(localcr.f).append(",vaLng:").append(localcr.g);
        if ((d1 != 30.0D) || (d4 < 0.5D) || (d5 < 0.5D)) {
          break;
        }
        localcr.d = d2;
        localcr.e = d3;
        localcr.h = 0.0D;
        localcr.i = 0.0D;
        localcr.c = l3;
        localcr.f = (d1 * d1);
        break;
        if (((localcr.h > 0.0D) && (d2 - localcr.d > 0.0D)) || ((localcr.h < 0.0D) && (d2 - localcr.d < 0.0D))) {
          localcr.d += localcr.h * (l1 / 1000L);
        }
        if (((localcr.i > 0.0D) && (d3 - localcr.e > 0.0D)) || ((localcr.i < 0.0D) && (d3 - localcr.e < 0.0D))) {
          localcr.e += localcr.i * (l1 / 1000L);
        }
        localcr.f -= l1;
        localcr.g -= l1;
      }
    }
  }
  
  public final void a(TencentLocation paramTencentLocation)
  {
    try
    {
      this.c.add(a.a(paramTencentLocation));
      if (this.c.size() > this.a) {
        this.c.removeFirst();
      }
      return;
    }
    finally
    {
      paramTencentLocation = finally;
      throw paramTencentLocation;
    }
  }
  
  public final boolean a(TencentLocation paramTencentLocation, cj paramcj, boolean paramBoolean)
  {
    try
    {
      paramBoolean = a(a.a(paramTencentLocation), paramcj, paramBoolean);
      return paramBoolean;
    }
    finally
    {
      paramTencentLocation = finally;
      throw paramTencentLocation;
    }
  }
  
  static final class a
  {
    double a;
    double b;
    long c;
    int d;
    
    static a a(TencentLocation paramTencentLocation)
    {
      int i = 2;
      a locala = new a();
      locala.a = paramTencentLocation.getLatitude();
      locala.b = paramTencentLocation.getLongitude();
      locala.c = paramTencentLocation.getTime();
      paramTencentLocation.getSpeed();
      if (TencentLocationUtils.isFromGps(paramTencentLocation))
      {
        if (paramTencentLocation.getAccuracy() < 100.0F) {
          i = 3;
        }
        locala.d = i;
        return locala;
      }
      if (paramTencentLocation.getAccuracy() < 500.0F) {}
      for (;;)
      {
        locala.d = i;
        return locala;
        i = 1;
      }
    }
    
    public final String toString()
    {
      return "[" + this.a + "," + this.b + "]";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */