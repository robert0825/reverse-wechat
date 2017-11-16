package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.locks.ReentrantLock;

public final class f
{
  private static f qFJ;
  private ReentrantLock epI;
  private e qFK;
  
  static
  {
    GMTrace.i(5277172629504L, 39318);
    qFJ = new f();
    GMTrace.o(5277172629504L, 39318);
  }
  
  private f()
  {
    GMTrace.i(5276904194048L, 39316);
    this.epI = new ReentrantLock();
    GMTrace.o(5276904194048L, 39316);
  }
  
  public static e btX()
  {
    GMTrace.i(5277038411776L, 39317);
    if (qFJ.qFK == null) {
      qFJ.epI.lock();
    }
    try
    {
      if (qFJ.qFK == null) {
        qFJ.qFK = new e();
      }
      qFJ.epI.unlock();
      e locale = qFJ.qFK;
      GMTrace.o(5277038411776L, 39317);
      return locale;
    }
    finally
    {
      qFJ.epI.unlock();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */