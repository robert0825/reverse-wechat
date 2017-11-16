package com.tencent.mm.plugin.api.recordView;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

final class g
  implements View.OnTouchListener
{
  private long hya;
  private float hyb;
  private int hyc;
  a hyd;
  
  g()
  {
    GMTrace.i(20187285815296L, 150407);
    this.hya = -1L;
    this.hyb = -1.0F;
    this.hyc = 0;
    GMTrace.o(20187285815296L, 150407);
  }
  
  private float w(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20187554250752L, 150409);
    try
    {
      if (this.hyc >= 2)
      {
        float f3 = paramMotionEvent.getX(0);
        float f1 = paramMotionEvent.getY(0);
        float f4 = paramMotionEvent.getX(1);
        float f2 = paramMotionEvent.getY(1);
        f3 = Math.abs(f3 - f4);
        f1 = Math.abs(f1 - f2);
        GMTrace.o(20187554250752L, 150409);
        return f3 + f1;
      }
    }
    catch (Exception paramMotionEvent)
    {
      w.e("MicroMsg.MMSightRecordViewTouchListener", "pointerDistance error: %s", new Object[] { paramMotionEvent.getMessage() });
      GMTrace.o(20187554250752L, 150409);
    }
    return 0.0F;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(20187420033024L, 150408);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    float f;
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            GMTrace.o(20187420033024L, 150408);
            return true;
            w.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_DOWN");
            if ((this.hya > 0L) && (SystemClock.elapsedRealtime() - this.hya < 400L)) {
              if (this.hyd == null) {}
            }
            for (;;)
            {
              this.hya = SystemClock.elapsedRealtime();
              this.hyb = -1.0F;
              this.hyc += 1;
              break;
              if (this.hyd != null)
              {
                paramView = this.hyd;
                paramMotionEvent.getX();
                paramMotionEvent.getY();
                paramView.Rw();
              }
            }
            w.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_POINTER_DOWN");
            this.hyc += 1;
            continue;
            w.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_POINTER_UP");
            this.hyc -= 1;
            continue;
            w.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_UP");
            this.hyb = -1.0F;
            this.hyc = 0;
          }
        } while (this.hyc < 2);
        f = w(paramMotionEvent);
        w.v("MicroMsg.MMSightRecordViewTouchListener", "distance: %s", new Object[] { Float.valueOf(f) });
      } while (f <= 0.0F);
      if (this.hyb <= 0.0F) {
        break;
      }
    } while (Math.abs(f - this.hyb) <= 15.0F);
    if (f > this.hyb)
    {
      w.d("MicroMsg.MMSightRecordViewTouchListener", "zoom out");
      if (this.hyd != null) {
        this.hyd.Rx();
      }
    }
    for (;;)
    {
      this.hyb = f;
      break;
      w.d("MicroMsg.MMSightRecordViewTouchListener", "zoom in");
      if (this.hyd != null) {
        this.hyd.Ry();
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void Rw();
    
    public abstract void Rx();
    
    public abstract void Ry();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\api\recordView\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */