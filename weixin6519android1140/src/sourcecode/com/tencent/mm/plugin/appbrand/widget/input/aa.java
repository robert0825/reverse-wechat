package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.j.c;
import com.tencent.mm.plugin.appbrand.jsapi.j.c.f;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Locale;

final class aa<Input extends EditText,  extends y>
{
  public final String TAG;
  final float iLm;
  final Input iNS;
  public c.f iNT;
  public MotionEvent iNU;
  public boolean iNV;
  public final Runnable iNW;
  public final Runnable iNX;
  
  aa(Input paramInput)
  {
    GMTrace.i(18845779623936L, 140412);
    this.iNV = false;
    this.iNW = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18847256018944L, 140423);
        aa.this.iNV = true;
        w.v(aa.this.TAG, "[apptouch] pendingCheckForTap run, pointerDown TRUE");
        aa.this.iNS.postDelayed(aa.this.iNX, ViewConfiguration.getLongPressTimeout());
        GMTrace.o(18847256018944L, 140423);
      }
    };
    this.iNX = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18844840099840L, 140405);
        if (!aa.this.iNV)
        {
          GMTrace.o(18844840099840L, 140405);
          return;
        }
        c.f localf = c.bG(aa.this.iNS);
        if ((aa.this.iNT == null) || (Math.abs(aa.this.iNT.x - localf.x) > 1.0F) || (Math.abs(aa.this.iNT.y - localf.y) > 1.0F))
        {
          w.v(aa.this.TAG, "check long press timeout, but view has moved.");
          GMTrace.o(18844840099840L, 140405);
          return;
        }
        if (aa.this.iNU == null)
        {
          GMTrace.o(18844840099840L, 140405);
          return;
        }
        aa.this.iNV = false;
        aa.this.iNS.removeCallbacks(aa.this.iNW);
        GMTrace.o(18844840099840L, 140405);
      }
    };
    this.iNS = paramInput;
    this.TAG = ("MicroMsg.AppBrand.InputFakeTapEventEmitter" + String.format(Locale.US, "[%s]", new Object[] { paramInput.toString() }));
    this.iLm = ViewConfiguration.get(paramInput.getContext()).getScaledTouchSlop();
    GMTrace.o(18845779623936L, 140412);
  }
  
  final boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    GMTrace.i(18846048059392L, 140414);
    float f1 = paramMotionEvent1.getX(paramMotionEvent1.getActionIndex());
    float f2 = paramMotionEvent1.getY(paramMotionEvent1.getActionIndex());
    float f3 = paramMotionEvent2.getX(paramMotionEvent2.getActionIndex());
    float f4 = paramMotionEvent2.getY(paramMotionEvent2.getActionIndex());
    w.v(this.TAG, "[apptouch] checkTapArea touchSlop %f, X[%f:%f], Y[%f:%f], [%s : %s]", new Object[] { Float.valueOf(this.iLm), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f2), Float.valueOf(f4), b.B(paramMotionEvent1), b.B(paramMotionEvent2) });
    if ((Math.abs(f4 - f2) <= this.iLm) && (Math.abs(f3 - f1) <= this.iLm))
    {
      GMTrace.o(18846048059392L, 140414);
      return true;
    }
    GMTrace.o(18846048059392L, 140414);
    return false;
  }
  
  final void adk()
  {
    GMTrace.i(18845913841664L, 140413);
    this.iNV = false;
    this.iNS.removeCallbacks(this.iNW);
    this.iNS.removeCallbacks(this.iNX);
    this.iNT = null;
    if (this.iNU != null)
    {
      this.iNU.recycle();
      this.iNU = null;
    }
    GMTrace.o(18845913841664L, 140413);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */