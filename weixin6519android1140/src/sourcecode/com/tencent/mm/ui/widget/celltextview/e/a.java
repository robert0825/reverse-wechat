package com.tencent.mm.ui.widget.celltextview.e;

import android.os.Handler;
import android.os.Looper;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.celltextview.CellTextView;
import com.tencent.mm.ui.widget.celltextview.b.a.b;
import com.tencent.mm.ui.widget.celltextview.c.b;
import java.util.Iterator;
import java.util.List;

public class a
  implements View.OnTouchListener
{
  private static int tEs;
  private static Handler xue;
  public boolean tEr;
  private b xua;
  public CellTextView xuf;
  private a xug;
  
  static
  {
    GMTrace.i(18743639932928L, 139651);
    xue = new Handler(Looper.getMainLooper());
    tEs = ViewConfiguration.getLongPressTimeout();
    GMTrace.o(18743639932928L, 139651);
  }
  
  public a()
  {
    GMTrace.i(18743237279744L, 139648);
    this.tEr = false;
    this.xug = new a();
    GMTrace.o(18743237279744L, 139648);
  }
  
  private void cjJ()
  {
    GMTrace.i(18743505715200L, 139650);
    this.tEr = false;
    xue.removeCallbacks(this.xug);
    GMTrace.o(18743505715200L, 139650);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(18743371497472L, 139649);
    if (!(paramView instanceof CellTextView))
    {
      GMTrace.o(18743371497472L, 139649);
      return false;
    }
    this.xuf = ((CellTextView)paramView);
    paramView = this.xuf.cjw().cjz();
    if ((paramView == null) || (paramView.size() <= 0))
    {
      GMTrace.o(18743371497472L, 139649);
      return false;
    }
    int i = (int)paramMotionEvent.getX() - this.xuf.getPaddingRight();
    int j = (int)paramMotionEvent.getY() - this.xuf.getPaddingTop();
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      GMTrace.o(18743371497472L, 139649);
      return false;
      this.xua = null;
      paramView = paramView.iterator();
      while (paramView.hasNext())
      {
        paramMotionEvent = (b)paramView.next();
        if (paramMotionEvent.eK(i, j))
        {
          this.xua = paramMotionEvent;
          this.xuf.cjw().a(paramMotionEvent);
          this.xuf.invalidate();
        }
      }
      if (this.xuf != null)
      {
        xue.postDelayed(this.xug, tEs);
        continue;
        if ((this.xua != null) && (!this.xua.eK(i, j)))
        {
          this.xua = null;
          this.xuf.cjw().a(null);
          this.xuf.invalidate();
          continue;
          if ((!this.tEr) && (this.xua != null) && (this.xua.eK(i, j)))
          {
            paramView = this.xua;
            paramMotionEvent = this.xuf;
            paramView.xtu.onClick(paramMotionEvent.getView());
          }
          cjJ();
          if (this.xua != null)
          {
            this.xuf.cjw().a(null);
            this.xuf.invalidate();
          }
          this.xua = null;
          continue;
          cjJ();
          if (this.xua != null)
          {
            this.xuf.cjw().a(null);
            this.xuf.invalidate();
          }
          this.xua = null;
        }
      }
    }
  }
  
  final class a
    implements Runnable
  {
    a()
    {
      GMTrace.i(18742968844288L, 139646);
      GMTrace.o(18742968844288L, 139646);
    }
    
    public final void run()
    {
      GMTrace.i(18743103062016L, 139647);
      if ((a.this.xuf != null) && (a.this.xuf.isPressed()))
      {
        w.d("MicroMsg.CellTouchListener", "long pressed timeout");
        a.this.tEr = true;
        a.this.xuf.cjw().a(null);
        a.this.xuf.invalidate();
      }
      GMTrace.o(18743103062016L, 139647);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */