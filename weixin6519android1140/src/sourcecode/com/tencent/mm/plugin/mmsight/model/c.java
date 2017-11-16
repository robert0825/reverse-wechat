package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends OrientationEventListener
{
  public int mXN;
  public int mXO;
  private long mXP;
  private long mXQ;
  public a mXR;
  public int orientation;
  
  public c(Context paramContext)
  {
    super(paramContext, 2);
    GMTrace.i(7330838085632L, 54619);
    this.mXN = -1;
    this.mXO = -1;
    this.orientation = -1;
    this.mXP = 0L;
    this.mXQ = 0L;
    GMTrace.o(7330838085632L, 54619);
  }
  
  public final boolean aOU()
  {
    GMTrace.i(7331374956544L, 54623);
    if (!j.mYZ)
    {
      GMTrace.o(7331374956544L, 54623);
      return false;
    }
    long l = bg.aI(this.mXQ);
    w.i("MicroMsg.DeviceOrientationListener", "isLandscape, tickToNow: %s, orientation: %s", new Object[] { Long.valueOf(l), Integer.valueOf(this.orientation) });
    if (l < 2000L)
    {
      GMTrace.o(7331374956544L, 54623);
      return false;
    }
    if (this.orientation < 0)
    {
      GMTrace.o(7331374956544L, 54623);
      return false;
    }
    if ((this.orientation == 90) || (this.orientation == 270))
    {
      GMTrace.o(7331374956544L, 54623);
      return true;
    }
    GMTrace.o(7331374956544L, 54623);
    return false;
  }
  
  public final void enable()
  {
    GMTrace.i(7331106521088L, 54621);
    w.i("MicroMsg.DeviceOrientationListener", "enable, config isEnableLandscapeMode: %s", new Object[] { Boolean.valueOf(j.mYZ) });
    if (j.mYZ)
    {
      super.enable();
      this.mXQ = bg.Pw();
    }
    GMTrace.o(7331106521088L, 54621);
  }
  
  public final int getOrientation()
  {
    GMTrace.i(7331240738816L, 54622);
    if (!j.mYZ)
    {
      GMTrace.o(7331240738816L, 54622);
      return 0;
    }
    int i = this.orientation;
    GMTrace.o(7331240738816L, 54622);
    return i;
  }
  
  public final void onOrientationChanged(int paramInt)
  {
    GMTrace.i(7330972303360L, 54620);
    if (!j.mYZ)
    {
      GMTrace.o(7330972303360L, 54620);
      return;
    }
    if (bg.aI(this.mXQ) < 2000L)
    {
      w.v("MicroMsg.DeviceOrientationListener", "onOrientationChanged, not reach DETECT_THRESHOLD");
      GMTrace.o(7330972303360L, 54620);
      return;
    }
    if ((Math.abs(this.mXN - paramInt) >= 30) || (bg.aI(this.mXP) >= 300L))
    {
      this.mXN = paramInt;
      this.mXP = bg.Pw();
      if ((paramInt > 60) && (paramInt < 300)) {
        break label153;
      }
      if ((paramInt <= 30) || (paramInt >= 330)) {
        this.orientation = 0;
      }
    }
    for (;;)
    {
      if (this.mXR != null) {
        this.mXR.qH(this.orientation);
      }
      GMTrace.o(7330972303360L, 54620);
      return;
      label153:
      if ((paramInt >= 30) && (paramInt <= 150))
      {
        if ((paramInt >= 60) && (paramInt <= 120)) {
          this.orientation = 90;
        }
      }
      else if ((paramInt >= 120) && (paramInt <= 240))
      {
        if ((paramInt >= 150) && (paramInt <= 210)) {
          this.orientation = 180;
        }
      }
      else if ((paramInt >= 210) && (paramInt <= 330) && (paramInt >= 240) && (paramInt <= 300)) {
        this.orientation = 270;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void qH(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */