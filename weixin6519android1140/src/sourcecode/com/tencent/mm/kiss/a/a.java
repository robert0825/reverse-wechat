package com.tencent.mm.kiss.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  private static a gay;
  public HandlerThread gax;
  private Handler mHandler;
  
  static
  {
    GMTrace.i(449897824256L, 3352);
    gay = new a();
    GMTrace.o(449897824256L, 3352);
  }
  
  private a()
  {
    GMTrace.i(449629388800L, 3350);
    this.gax = new HandlerThread("InflateThread", 5);
    this.gax.start();
    this.mHandler = new Handler(this.gax.getLooper());
    GMTrace.o(449629388800L, 3350);
  }
  
  public static a xJ()
  {
    GMTrace.i(449763606528L, 3351);
    a locala = gay;
    GMTrace.o(449763606528L, 3351);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */