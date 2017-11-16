package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements SensorController.a
{
  public SensorController jrf;
  public ax jrj;
  public long jrk;
  private boolean jrp;
  public a mkL;
  
  public d()
  {
    GMTrace.i(11606478028800L, 86475);
    this.jrk = -1L;
    this.jrp = false;
    this.mkL = null;
    this.jrf = new SensorController(ab.getContext());
    this.jrj = new ax(ab.getContext());
    GMTrace.o(11606478028800L, 86475);
  }
  
  public final void jdMethod_do(final boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(11606612246528L, 86476);
    w.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isON:" + paramBoolean + "  hasSkip:" + this.jrp + " tick:" + bg.aI(this.jrk) + "  lt:" + this.jrk);
    if (this.jrp)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.jrp = paramBoolean;
        GMTrace.o(11606612246528L, 86476);
        return;
      }
    }
    if ((!paramBoolean) && (this.jrk != -1L) && (bg.aI(this.jrk) > 400L))
    {
      this.jrp = true;
      GMTrace.o(11606612246528L, 86476);
      return;
    }
    this.jrp = false;
    w.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isNeedOffScreen: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11605806940160L, 86470);
        if (!paramBoolean)
        {
          w.i("MicroMsg.IPCallSensorManager", "off screen");
          if (d.this.mkL != null) {
            d.this.mkL.fo(true);
          }
        }
        for (;;)
        {
          GMTrace.o(11605806940160L, 86470);
          return false;
          w.i("MicroMsg.IPCallSensorManager", "light screen");
          if (d.this.mkL != null) {
            d.this.mkL.fo(false);
          }
        }
      }
    }, false).z(50L, 50L);
    GMTrace.o(11606612246528L, 86476);
  }
  
  public static abstract interface a
  {
    public abstract void fo(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */