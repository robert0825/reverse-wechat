package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.widget.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class s
  implements a
{
  private int iMN;
  private final Rect iMO;
  private boolean iMP;
  private View iMQ;
  a iMR;
  
  s()
  {
    GMTrace.i(10076530147328L, 75076);
    this.iMN = 0;
    this.iMO = new Rect();
    this.iMP = false;
    GMTrace.o(10076530147328L, 75076);
  }
  
  private Context getContext()
  {
    GMTrace.i(10076798582784L, 75078);
    if (this.iMQ == null)
    {
      localContext = ab.getContext();
      GMTrace.o(10076798582784L, 75078);
      return localContext;
    }
    Context localContext = this.iMQ.getContext();
    GMTrace.o(10076798582784L, 75078);
    return localContext;
  }
  
  private int getFrameHeight()
  {
    GMTrace.i(10076932800512L, 75079);
    if (this.iMQ == null) {}
    for (Object localObject = null; localObject == null; localObject = this.iMQ.getRootView())
    {
      GMTrace.o(10076932800512L, 75079);
      return 0;
    }
    localObject = this.iMO;
    getWindowVisibleDisplayFrame((Rect)localObject);
    int i = getContext().getResources().getDisplayMetrics().heightPixels;
    int j = ((Rect)localObject).top;
    GMTrace.o(10076932800512L, 75079);
    return i - j;
  }
  
  private void getWindowVisibleDisplayFrame(Rect paramRect)
  {
    GMTrace.i(10076664365056L, 75077);
    if (this.iMQ != null) {
      this.iMQ.getWindowVisibleDisplayFrame(paramRect);
    }
    GMTrace.o(10076664365056L, 75077);
  }
  
  public final void bT(View paramView)
  {
    int i = 1;
    GMTrace.i(10077067018240L, 75080);
    this.iMQ = paramView;
    paramView = this.iMO;
    getWindowVisibleDisplayFrame(paramView);
    int j = paramView.height();
    if (this.iMN == 0) {
      this.iMN = j;
    }
    label53:
    label62:
    label191:
    label196:
    label200:
    for (;;)
    {
      int k;
      if (getFrameHeight() > j)
      {
        bool = true;
        if (this.iMP == bool) {
          break label191;
        }
        if ((i != 0) && (this.iMR != null)) {
          this.iMR.cR(bool);
        }
        this.iMP = bool;
        this.iMN = j;
        this.iMQ = null;
        GMTrace.o(10077067018240L, 75080);
        return;
        k = getFrameHeight() - j;
        if (k <= 0) {
          continue;
        }
        if (j.aL(getContext()) == k) {
          break label196;
        }
      }
      for (boolean bool = j.p(getContext(), k);; bool = false)
      {
        if ((!bool) || (this.iMR == null) || (this.iMR.getHeight() == k)) {
          break label200;
        }
        this.iMR.ka(k);
        break;
        bool = false;
        break label53;
        i = 0;
        break label62;
      }
    }
  }
  
  static abstract interface a
  {
    public abstract void cR(boolean paramBoolean);
    
    public abstract int getHeight();
    
    public abstract void ka(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */