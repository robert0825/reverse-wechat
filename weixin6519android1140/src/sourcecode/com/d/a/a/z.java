package com.d.a.a;

import android.os.Handler;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class z
{
  private static z aKa;
  private static final SparseArray<z> aKb = new SparseArray();
  private final ExecutorService aKc;
  private final Handler handler;
  
  private z(Handler paramHandler)
  {
    if (paramHandler != null) {}
    for (this.aKc = null;; this.aKc = Executors.newSingleThreadExecutor())
    {
      this.handler = paramHandler;
      return;
    }
  }
  
  static z b(Handler paramHandler)
  {
    if (paramHandler != null)
    {
      int i = paramHandler.getLooper().hashCode();
      z localz2 = (z)aKb.get(i);
      z localz1 = localz2;
      if (localz2 == null)
      {
        localz1 = new z(paramHandler);
        aKb.put(i, localz1);
      }
      return localz1;
    }
    if (aKa == null) {
      aKa = new z(null);
    }
    return aKa;
  }
  
  final void execute(Runnable paramRunnable)
  {
    if (this.handler != null)
    {
      this.handler.post(paramRunnable);
      return;
    }
    this.aKc.execute(paramRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */