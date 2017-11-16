package c.t.m.g;

import android.os.Handler;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bv
  implements au, ba
{
  private static bv a = new bv();
  private Map<String, av> b = new ConcurrentHashMap();
  public bs c;
  private Runnable d = new bx(this);
  private Runnable e = new by(this);
  
  private bv()
  {
    Object localObject = new az();
    this.b.put(((av)localObject).a(), localObject);
    localObject = new ay();
    this.b.put(((av)localObject).a(), localObject);
    localObject = new aw();
    this.b.put(((av)localObject).a(), localObject);
    localObject = this.d;
    if ((!l.f()) && (l.e))
    {
      aa.a().a((Runnable)localObject);
      aa.a().b((Runnable)localObject, 30000L);
    }
    localObject = this.e;
    if ((!l.f()) && (l.e))
    {
      aa.a().a((Runnable)localObject);
      aa.a().b((Runnable)localObject, 30000L);
    }
  }
  
  public static bv c()
  {
    return a;
  }
  
  public final void a()
  {
    this.c.a();
  }
  
  public final void a(int paramInt)
  {
    l.j().post(new bw(this, paramInt));
  }
  
  public final void a(String paramString)
  {
    this.c.a(paramString);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Object localObject = this.d;
    long l = u.a("app_ipc_timertask_gap", 0, 3600000, 60000);
    if ((!l.f()) && (l.e))
    {
      aa.a().a((Runnable)localObject);
      aa.a().b((Runnable)localObject, l);
    }
    localObject = this.b.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((av)((Iterator)localObject).next()).a(paramString1, paramString2);
    }
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    Object localObject = this.e;
    long l = u.a("app_ipc_timertask_gap", 0, 3600000, 60000);
    if ((!l.f()) && (l.e))
    {
      aa.a().a((Runnable)localObject);
      aa.a().b((Runnable)localObject, l);
    }
    localObject = this.b.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((av)((Iterator)localObject).next()).a(paramString1, paramArrayOfByte, paramString2);
    }
  }
  
  public final void a_()
  {
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext()) {
      ((av)localIterator.next()).a_();
    }
  }
  
  public final void b()
  {
    this.c.b();
  }
  
  public final bt d()
  {
    return (bt)this.b.get("settings");
  }
  
  public final r e()
  {
    return (r)this.b.get("accessscheduler");
  }
  
  public final void f()
  {
    if (l.f()) {
      this.c = bu.c();
    }
    this.c.a(this);
    this.c.e();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */