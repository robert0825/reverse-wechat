package com.tencent.mm.vending.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static b xwU;
  Map<c, a> xwV;
  final SparseIntArray xwW;
  final Handler xwX;
  
  static
  {
    GMTrace.i(252597764096L, 1882);
    xwU = null;
    xwU = new b();
    GMTrace.o(252597764096L, 1882);
  }
  
  public b()
  {
    GMTrace.i(252329328640L, 1880);
    this.xwV = new ConcurrentHashMap();
    this.xwW = new SparseIntArray();
    this.xwX = new Handler(com.tencent.mm.vending.i.b.cku().xyR.getLooper())
    {
      public final void handleMessage(Message arg1)
      {
        GMTrace.i(252195110912L, 1879);
        a locala = (a)???.obj;
        switch (???.what)
        {
        }
        for (;;)
        {
          GMTrace.o(252195110912L, 1879);
          return;
          locala.onCreate();
          synchronized (locala.xwK)
          {
            locala.xwN = true;
            locala.xwK.notify();
            GMTrace.o(252195110912L, 1879);
            return;
          }
          GMTrace.o(252195110912L, 1879);
          return;
          GMTrace.o(252195110912L, 1879);
          return;
          ((a)localObject).onDestroy();
        }
      }
    };
    GMTrace.o(252329328640L, 1880);
  }
  
  public static b cjX()
  {
    GMTrace.i(252463546368L, 1881);
    b localb = xwU;
    GMTrace.o(252463546368L, 1881);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\app\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */