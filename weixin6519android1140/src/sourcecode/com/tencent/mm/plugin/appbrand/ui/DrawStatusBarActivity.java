package com.tencent.mm.plugin.appbrand.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.widget.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public abstract class DrawStatusBarActivity
  extends MMActivity
{
  private k iAE;
  
  public DrawStatusBarActivity()
  {
    GMTrace.i(19704101994496L, 146807);
    this.iAE = null;
    GMTrace.o(19704101994496L, 146807);
  }
  
  protected final void aay()
  {
    GMTrace.i(19704236212224L, 146808);
    super.aay();
    if ((this.vMl != null) && (this.vMl.getChildCount() > 0))
    {
      View localView = this.vMl.getChildAt(0);
      this.vMl.removeView(localView);
      this.iAE = new k(this);
      this.iAE.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      this.vMl.addView(this.iAE);
      this.vMl.Hw = this.iAE;
    }
    GMTrace.o(19704236212224L, 146808);
  }
  
  protected int getStatusBarColor()
  {
    GMTrace.i(19704370429952L, 146809);
    int i = getResources().getColor(o.c.aPb);
    GMTrace.o(19704370429952L, 146809);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\DrawStatusBarActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */