package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.wcdb.support.Log;

public class MMSightCaptureTouchView
  extends RelativeLayout
{
  private long hya;
  private float hyb;
  private int hyc;
  a ngO;
  
  public MMSightCaptureTouchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7389625450496L, 55057);
    this.hya = -1L;
    this.hyb = -1.0F;
    this.hyc = 0;
    GMTrace.o(7389625450496L, 55057);
  }
  
  public MMSightCaptureTouchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7389759668224L, 55058);
    this.hya = -1L;
    this.hyb = -1.0F;
    this.hyc = 0;
    GMTrace.o(7389759668224L, 55058);
  }
  
  private float w(MotionEvent paramMotionEvent)
  {
    GMTrace.i(7390028103680L, 55060);
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
        GMTrace.o(7390028103680L, 55060);
        return f3 + f1;
      }
    }
    catch (Exception paramMotionEvent)
    {
      Log.e("MicroMsg.MMSightCaptureTouchView", "pointerDistance error: %s", new Object[] { paramMotionEvent.getMessage() });
      GMTrace.o(7390028103680L, 55060);
    }
    return 0.0F;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(7389893885952L, 55059);
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
            GMTrace.o(7389893885952L, 55059);
            return true;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_DOWN");
            if ((this.hya > 0L) && (SystemClock.elapsedRealtime() - this.hya < 400L)) {
              if (this.ngO != null) {
                this.ngO.aQo();
              }
            }
            for (;;)
            {
              this.hya = SystemClock.elapsedRealtime();
              this.hyb = -1.0F;
              this.hyc += 1;
              break;
              if (this.ngO != null) {
                this.ngO.B(paramMotionEvent.getX(), paramMotionEvent.getY());
              }
            }
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_POINTER_DOWN");
            this.hyc += 1;
            continue;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_POINTER_UP");
            this.hyc -= 1;
            continue;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_UP");
            this.hyb = -1.0F;
            this.hyc = 0;
          }
        } while (this.hyc < 2);
        f = w(paramMotionEvent);
        Log.v("MicroMsg.MMSightCaptureTouchView", "distance: %s", new Object[] { Float.valueOf(f) });
      } while (f <= 0.0F);
      if (this.hyb <= 0.0F) {
        break;
      }
    } while (Math.abs(f - this.hyb) <= 15.0F);
    if (f > this.hyb)
    {
      Log.d("MicroMsg.MMSightCaptureTouchView", "zoom out");
      if (this.ngO != null) {
        this.ngO.Rx();
      }
    }
    for (;;)
    {
      this.hyb = f;
      break;
      Log.d("MicroMsg.MMSightCaptureTouchView", "zoom in");
      if (this.ngO != null) {
        this.ngO.Ry();
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void B(float paramFloat1, float paramFloat2);
    
    public abstract void Rx();
    
    public abstract void Ry();
    
    public abstract void aQo();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\MMSightCaptureTouchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */