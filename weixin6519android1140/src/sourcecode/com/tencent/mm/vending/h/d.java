package com.tencent.mm.vending.h;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.i.a;
import com.tencent.mm.vending.i.b;

public abstract class d
{
  public static final h xyH;
  public static final h xyI;
  public static final h xyJ;
  
  static
  {
    GMTrace.i(292997300224L, 2183);
    xyH = new h(Looper.getMainLooper(), "Vending.UI");
    xyI = new h(b.cku().xyR.getLooper(), "Vending.LOGIC");
    xyJ = new h(a.ckt().xyP.getLooper(), "Vending.HEAVY_WORK");
    g.cks();
    GMTrace.o(292997300224L, 2183);
  }
  
  public d()
  {
    GMTrace.i(292191993856L, 2177);
    GMTrace.o(292191993856L, 2177);
  }
  
  public static d ckr()
  {
    try
    {
      GMTrace.i(292863082496L, 2182);
      d locald = g.ckr();
      GMTrace.o(292863082496L, 2182);
      return locald;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public abstract void D(Runnable paramRunnable);
  
  public abstract void cancel();
  
  public abstract void g(Runnable paramRunnable, long paramLong);
  
  public abstract String getType();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */