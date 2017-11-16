package com.tencent.mm.vending.i;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  private static a xyQ;
  private Handler mHandler;
  public HandlerThread xyP;
  
  static
  {
    GMTrace.i(296889614336L, 2212);
    xyQ = new a();
    GMTrace.o(296889614336L, 2212);
  }
  
  private a()
  {
    GMTrace.i(296621178880L, 2210);
    this.xyP = new HandlerThread("Vending-HeavyWorkThread", 10);
    this.xyP.start();
    this.mHandler = new Handler(this.xyP.getLooper());
    GMTrace.o(296621178880L, 2210);
  }
  
  public static a ckt()
  {
    GMTrace.i(296755396608L, 2211);
    a locala = xyQ;
    GMTrace.o(296755396608L, 2211);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */