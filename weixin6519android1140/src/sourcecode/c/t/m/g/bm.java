package c.t.m.g;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bm
  implements bs, Runnable
{
  private static bm a = new bm();
  private ba b;
  public Handler c;
  public Map<String, bi> d = new ConcurrentHashMap();
  private Runnable e = new bp(this);
  public Runnable f = new br(this);
  private Map<String, a> g = new HashMap();
  
  public static bm c()
  {
    return a;
  }
  
  public final void a()
  {
    ((bi)this.d.get("accessscheduler")).a();
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.c.removeCallbacks(this.e);
      this.c.post(this.e);
    }
  }
  
  public final void a(ba paramba)
  {
    this.b = paramba;
    paramba = new bq();
    this.d.put(paramba.c(), paramba);
    paramba = new bk();
    this.d.put(paramba.c(), paramba);
    paramba = new bn();
    this.d.put(paramba.c(), paramba);
  }
  
  public final void a(String paramString) {}
  
  public final void b()
  {
    ((bi)this.d.get("settings")).b();
  }
  
  public final ba d()
  {
    return this.b;
  }
  
  public final void e()
  {
    HandlerThread localHandlerThread = new HandlerThread("HttpPlatformConnection");
    localHandlerThread.start();
    this.c = new Handler(localHandlerThread.getLooper());
    this.c.post(this);
    this.b.a_();
  }
  
  public final void run()
  {
    if (u.a("http_platform_start_update_on", 0, 1, 1) == 1) {
      this.c.post(this.f);
    }
  }
  
  final class a
  {
    public long a;
    public int b;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */