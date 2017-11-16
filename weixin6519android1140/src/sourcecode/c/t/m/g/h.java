package c.t.m.g;

import java.util.concurrent.CountDownLatch;

final class h
  implements Runnable
{
  h(j paramj, i parami) {}
  
  public final void run()
  {
    ah localah = this.a.a();
    this.b.a(localah);
    this.b.i.countDown();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */