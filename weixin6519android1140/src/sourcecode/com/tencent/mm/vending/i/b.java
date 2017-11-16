package com.tencent.mm.vending.i;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;

public final class b
{
  private static b xyS;
  private Handler mHandler;
  public HandlerThread xyR;
  
  static
  {
    GMTrace.i(297292267520L, 2215);
    xyS = new b();
    GMTrace.o(297292267520L, 2215);
  }
  
  private b()
  {
    GMTrace.i(297023832064L, 2213);
    this.xyR = new HandlerThread("Vending-LogicThread");
    this.xyR.start();
    this.mHandler = new Handler(this.xyR.getLooper());
    GMTrace.o(297023832064L, 2213);
  }
  
  public static b cku()
  {
    GMTrace.i(297158049792L, 2214);
    b localb = xyS;
    GMTrace.o(297158049792L, 2214);
    return localb;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */