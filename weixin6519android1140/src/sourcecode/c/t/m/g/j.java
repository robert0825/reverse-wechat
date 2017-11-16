package c.t.m.g;

import android.os.SystemClock;
import android.text.TextUtils;

public abstract class j
{
  protected i a;
  public String b;
  protected ad c;
  private int d;
  private int e = 5000;
  private long f;
  private int g = 0;
  
  public j(i parami)
  {
    this.a = parami;
    this.b = parami.a;
    this.d = parami.e;
  }
  
  public ah a()
  {
    for (;;)
    {
      try
      {
        this.f = SystemClock.elapsedRealtime();
        this.e = u.a("app_http_proxy_timeout", 0, 20000, 5000);
        if (this.d <= 0) {
          this.d = u.a("app_req_timeout", 1000, 1000000, 15000);
        }
        if ((this.a.g > 0) && (this.a.g < this.d)) {
          this.d = this.a.g;
        }
        int i = this.d;
        ah localah = a(i);
        i = ce.a((int)(this.d - (SystemClock.elapsedRealtime() - this.f)), this.d);
        String str;
        if ((localah.a == 0) && (localah.c >= 300) && (localah.c < 400) && (this.a.d) && (i > 200))
        {
          str = localah.a("location");
          if (TextUtils.isEmpty(str)) {
            localah.a = -6;
          }
        }
        else
        {
          if (!this.a.j) {
            break label288;
          }
          this.c.i = true;
          this.c.h = true;
          this.c.j = this.a.g;
          this.c.a(false);
          return localah;
        }
        this.b = str;
        this.g += 1;
        if (this.g > 5)
        {
          localah.a = -5;
          continue;
        }
        this.c.a(true);
      }
      catch (Throwable localThrowable)
      {
        return new ah(-1, ce.a(localThrowable));
      }
      continue;
      label288:
      this.c.j = (SystemClock.elapsedRealtime() - this.f);
    }
  }
  
  protected abstract ah a(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */