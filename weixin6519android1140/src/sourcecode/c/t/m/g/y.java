package c.t.m.g;

import java.util.concurrent.CountDownLatch;

final class y
  implements Runnable
{
  y(boolean[] paramArrayOfBoolean, CountDownLatch paramCountDownLatch) {}
  
  public final void run()
  {
    try
    {
      this.a[0] = x.c();
      this.b.countDown();
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.a[0] = x.b();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */