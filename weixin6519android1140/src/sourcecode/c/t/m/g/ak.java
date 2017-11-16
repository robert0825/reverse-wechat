package c.t.m.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ak
{
  AtomicInteger a = new AtomicInteger(0);
  public AtomicInteger b = new AtomicInteger(0);
  public Handler c;
  ap d;
  AtomicInteger e = new AtomicInteger(0);
  List<String> f = new ArrayList();
  volatile boolean g = false;
  volatile boolean h = false;
  AtomicInteger i = new AtomicInteger(0);
  int j;
  ap.a k = new ap.a(this);
  private final String l = a();
  private final Runnable m = new an(this);
  private final Runnable n = new ao(this);
  
  public ak()
  {
    aq.a(l.a());
    HandlerThread localHandlerThread = new HandlerThread(this.l);
    localHandlerThread.start();
    this.c = new Handler(localHandlerThread.getLooper());
    this.d = new al();
    b(true, false);
    this.j = b();
  }
  
  public abstract String a();
  
  final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2)) {}
    for (;;)
    {
      try
      {
        b(false, true);
        if (!this.g) {
          break label49;
        }
        if (paramBoolean1) {
          this.h = true;
        }
        return;
      }
      finally {}
      b(false, false);
      continue;
      label49:
      if (!paramBoolean1) {
        this.e.set(0);
      }
      this.g = true;
      try
      {
        new d(paramBoolean1, paramBoolean2).a(true);
      }
      catch (Throwable localThrowable)
      {
        this.g = false;
      }
    }
  }
  
  public abstract int b();
  
  final void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    aa localaa;
    Runnable localRunnable;
    long l1;
    if (paramBoolean2)
    {
      if (this.a.get() > 3)
      {
        this.a.set(0);
        return;
      }
      localaa = aa.a();
      localRunnable = this.m;
      l1 = u.a("report_real_timer_interval", 1, 60, 5) * 1000;
    }
    for (;;)
    {
      localaa.a(localRunnable, l1);
      return;
      localaa = aa.a();
      localRunnable = this.n;
      if (paramBoolean1) {
        l1 = 10000L;
      } else {
        l1 = u.a("report_timer_interval", 30000, 600000, 60000);
      }
    }
  }
  
  public abstract String c();
  
  class a
    implements Runnable
  {
    public a() {}
    
    public final void a(boolean paramBoolean)
    {
      if (paramBoolean)
      {
        if (!ak.this.c.postAtFrontOfQueue(this)) {
          ak.this.c.post(this);
        }
        return;
      }
      ak.this.c.post(this);
    }
    
    public void run()
    {
      Process.setThreadPriority(10);
    }
  }
  
  final class b
    extends ak.a
  {
    private String a;
    private boolean b;
    
    public b(String paramString)
    {
      super();
      this.a = paramString;
      this.b = true;
    }
    
    public final void run()
    {
      super.run();
      ak.this.i.decrementAndGet();
      if (TextUtils.isEmpty(this.a)) {}
      StringBuilder localStringBuilder;
      int i;
      do
      {
        return;
        localStringBuilder = new StringBuilder(this.a);
        i = u.a("report_new_record_num", 1, 50, 10);
      } while ((as.a(ak.this.c()).b(localStringBuilder.toString()) == -1L) || (ak.this.e.incrementAndGet() < i));
      ak.this.a(false, this.b);
    }
  }
  
  final class c
    extends ak.a
  {
    private ak.d a;
    
    public c(ak.d paramd)
    {
      super();
      this.a = paramd;
    }
    
    public final void run()
    {
      int i = 0;
      super.run();
      ak.this.g = false;
      int j;
      if (this.a.d)
      {
        ak.this.b.addAndGet(this.a.f);
        if (!this.a.b)
        {
          j = this.a.e.size();
          ArrayList localArrayList = new ArrayList();
          i = 0;
          while (i < j)
          {
            localArrayList.add(Long.valueOf(((as.a)this.a.e.get(i)).a));
            i += 1;
          }
          as.a(ak.this.c()).a(localArrayList);
          if (ak.this.h)
          {
            ak.this.h = false;
            ak.this.a(true, this.a.c);
          }
        }
      }
      for (;;)
      {
        return;
        if (!this.a.a)
        {
          SystemClock.sleep(20L);
          ak.this.a(this.a.b, this.a.c);
          return;
          if ((!this.a.c) || (!this.a.b)) {
            break;
          }
          j = this.a.e.size();
          while (i < j)
          {
            as.a(ak.this.c()).b(((as.a)this.a.e.get(i)).b);
            i += 1;
          }
        }
      }
    }
  }
  
  final class d
    extends ak.a
  {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d = false;
    public List<as.a> e;
    int f;
    
    public d(boolean paramBoolean1, boolean paramBoolean2)
    {
      super();
      this.b = paramBoolean1;
      this.c = paramBoolean2;
    }
    
    public final void run()
    {
      Object localObject2 = null;
      Object localObject1 = null;
      int k = 0;
      super.run();
      this.a = false;
      if (this.b)
      {
        int m = ak.this.f.size();
        if (m == 0) {}
        for (;;)
        {
          this.e = ((List)localObject1);
          if ((this.e != null) && (this.e.size() != 0)) {
            break;
          }
          ak.this.g = false;
          return;
          localObject2 = new ArrayList();
          localObject1 = new ArrayList();
          i = 0;
          int j = 0;
          while ((i < m) && (j < 10))
          {
            String str = (String)ak.this.f.get(i);
            ((List)localObject1).add(new as.a(0L, str));
            ((List)localObject2).add(str);
            j += 1;
            i += 1;
          }
          i = 0;
          while (i < ((List)localObject2).size())
          {
            ak.this.f.remove(((List)localObject2).get(i));
            i += 1;
          }
          if (ak.this.f.size() == 0) {
            this.a = true;
          }
        }
      }
      int i = u.a("report_clear_db_num", 1, 10000, 1000);
      if (as.a(ak.this.c()).a(i)) {
        localObject1 = localObject2;
      }
      for (;;)
      {
        this.e = ((List)localObject1);
        break;
        localObject2 = as.a(ak.this.c()).a();
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((List)localObject2).size() < 10)
          {
            this.a = true;
            localObject1 = localObject2;
          }
        }
      }
      localObject2 = new StringBuilder();
      i = k;
      while (i < this.e.size())
      {
        ((StringBuilder)localObject2).append(((as.a)this.e.get(i)).b);
        i += 1;
      }
      localObject1 = ((StringBuilder)localObject2).toString();
      if (((StringBuilder)localObject2).toString().contains("client_report_time")) {
        localObject1 = ((StringBuilder)localObject2).toString().replace("client_report_time", ce.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
      }
      localObject1 = ((String)localObject1).getBytes();
      i = localObject1.length;
      this.f = i;
      localObject1 = u.a((byte[])localObject1);
      ak.this.d.a((byte[])localObject1, i, this.b, this, ak.this.k);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */