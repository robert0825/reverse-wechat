package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.TargetApi;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.gmtrace.GMTrace;

@TargetApi(16)
public final class d
  implements Choreographer.FrameCallback
{
  boolean Aa;
  a iwX;
  Choreographer ixm;
  long ixn;
  int ixo;
  long mInterval;
  boolean mPaused;
  
  public d()
  {
    GMTrace.i(15454231855104L, 115143);
    this.ixn = 0L;
    this.ixo = 0;
    this.Aa = true;
    this.mPaused = false;
    this.ixm = Choreographer.getInstance();
    this.mInterval = 200L;
    GMTrace.o(15454231855104L, 115143);
  }
  
  public final void doFrame(long paramLong)
  {
    double d1 = 60.0D;
    GMTrace.i(15454366072832L, 115144);
    double d2;
    if ((this.Aa) && (!this.mPaused))
    {
      paramLong /= 1000000L;
      if (this.ixn <= 0L) {
        break label144;
      }
      long l = paramLong - this.ixn;
      this.ixo += 1;
      if (l > this.mInterval)
      {
        d2 = this.ixo * 1000 / l;
        if (d2 < 60.0D) {
          break label152;
        }
      }
    }
    for (;;)
    {
      this.ixn = paramLong;
      this.ixo = 0;
      if (this.iwX != null) {
        this.iwX.i(d1);
      }
      for (;;)
      {
        if (this.Aa) {
          this.ixm.postFrameCallback(this);
        }
        GMTrace.o(15454366072832L, 115144);
        return;
        label144:
        this.ixn = paramLong;
      }
      label152:
      d1 = d2;
    }
  }
  
  public static abstract interface a
  {
    public abstract void i(double paramDouble);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\performance\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */