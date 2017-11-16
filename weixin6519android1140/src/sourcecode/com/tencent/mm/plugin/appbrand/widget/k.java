package com.tencent.mm.plugin.appbrand.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ui.g;

public class k
  extends FrameLayout
  implements q.a
{
  static final boolean iJZ;
  private int iDc;
  private final Paint iKa;
  private boolean iKb;
  private int iKc;
  private final Activity mActivity;
  
  static
  {
    GMTrace.i(18246765903872L, 135949);
    iJZ = q.iKf;
    GMTrace.o(18246765903872L, 135949);
  }
  
  public k(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18246363250688L, 135946);
    if (iJZ)
    {
      this.mActivity = g.bR(paramContext);
      q.j(this.mActivity).a(this);
      this.iKa = new Paint(1);
      this.iKa.setStyle(Paint.Style.FILL);
      setWillNotDraw(false);
      GMTrace.o(18246363250688L, 135946);
      return;
    }
    this.mActivity = null;
    this.iKa = null;
    GMTrace.o(18246363250688L, 135946);
  }
  
  public final void jD(int paramInt)
  {
    GMTrace.i(18246229032960L, 135945);
    this.iDc = Math.max(0, paramInt);
    setPadding(0, this.iDc, 0, 0);
    postInvalidate();
    GMTrace.o(18246229032960L, 135945);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(18246631686144L, 135948);
    if ((this.iDc <= 0) || (!iJZ)) {}
    for (;;)
    {
      super.onDraw(paramCanvas);
      GMTrace.o(18246631686144L, 135948);
      return;
      this.iKa.setColor(this.iKc);
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.iDc, this.iKa);
    }
  }
  
  public final void setStatusBarColor(int paramInt)
  {
    GMTrace.i(19861673607168L, 147981);
    if (!iJZ)
    {
      GMTrace.o(19861673607168L, 147981);
      return;
    }
    u(paramInt, g.c(this.mActivity.getWindow()));
    GMTrace.o(19861673607168L, 147981);
  }
  
  public final void u(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(18246497468416L, 135947);
    this.iKc = paramInt;
    this.iKb = paramBoolean;
    if (!iJZ)
    {
      GMTrace.o(18246497468416L, 135947);
      return;
    }
    Window localWindow = this.mActivity.getWindow();
    g.a(localWindow);
    if ((Build.VERSION.SDK_INT >= 23) && (g.a(localWindow, paramBoolean))) {}
    for (;;)
    {
      this.iKc = paramInt;
      do
      {
        postInvalidate();
        GMTrace.o(18246497468416L, 135947);
        return;
      } while (Build.VERSION.SDK_INT < 21);
      if (paramBoolean) {
        paramInt = g.jE(paramInt);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */