package c.t.m.g;

import android.os.SystemClock;

final class am
  implements Runnable
{
  am(al paramal, af paramaf, long paramLong) {}
  
  public final void run()
  {
    boolean bool2 = false;
    try
    {
      ah localah = this.a.a();
      this.a.j = (SystemClock.elapsedRealtime() - this.b);
      this.a.a(false);
      boolean bool1 = bool2;
      if (localah.a == 0)
      {
        int i = localah.c;
        bool1 = bool2;
        if (i == 200) {
          bool1 = true;
        }
      }
      return;
    }
    catch (Throwable localThrowable) {}finally
    {
      al.a(this.c, false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */