package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  implements Runnable
{
  public int mMode;
  public ListView nFZ;
  public long xiG;
  public int xiH;
  public int xiI;
  public int xiJ;
  private final int xiK;
  public int xiL;
  
  public o(ListView paramListView)
  {
    GMTrace.i(1912602624000L, 14250);
    this.xiG = System.currentTimeMillis();
    this.nFZ = paramListView;
    this.xiK = ViewConfiguration.get(this.nFZ.getContext()).getScaledFadingEdgeLength();
    w.d("ScrollerRunnable", "mExtraScroll: %d", new Object[] { Integer.valueOf(this.xiK) });
    GMTrace.o(1912602624000L, 14250);
  }
  
  public final void run()
  {
    GMTrace.i(1912736841728L, 14251);
    if (System.currentTimeMillis() - this.xiG > 10000L)
    {
      GMTrace.o(1912736841728L, 14251);
      return;
    }
    int j = this.nFZ.getHeight();
    int k = this.nFZ.getFirstVisiblePosition();
    View localView;
    switch (this.mMode)
    {
    default: 
      GMTrace.o(1912736841728L, 14251);
      return;
    case 1: 
      i = this.nFZ.getChildCount() - 1;
      k += i;
      if (i < 0)
      {
        GMTrace.o(1912736841728L, 14251);
        return;
      }
      int m;
      int n;
      if (k == this.xiI)
      {
        if (this.xiL > 20)
        {
          this.nFZ.setSelection(this.xiH);
          w.d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
        }
      }
      else
      {
        this.xiL = 0;
        localView = this.nFZ.getChildAt(i);
        m = localView.getHeight();
        n = localView.getTop();
        if (k >= this.nFZ.getCount() - 1) {
          break label295;
        }
      }
      label295:
      for (i = this.xiK;; i = this.nFZ.getPaddingBottom())
      {
        this.nFZ.smoothScrollBy(i + (m - (j - n)), this.xiJ);
        this.xiI = k;
        if (k >= this.xiH) {
          break;
        }
        this.nFZ.post(this);
        GMTrace.o(1912736841728L, 14251);
        return;
        this.nFZ.post(this);
        this.xiL += 1;
        w.d("ScrollerRunnable", "dz:try scroll lastpos = %d", new Object[] { Integer.valueOf(k) });
        GMTrace.o(1912736841728L, 14251);
        return;
      }
    }
    if (k == this.xiI)
    {
      if (this.xiL > 20)
      {
        this.nFZ.setSelection(this.xiH);
        w.d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
      }
    }
    else
    {
      this.xiL = 0;
      localView = this.nFZ.getChildAt(0);
      if (localView != null) {
        break label418;
      }
      GMTrace.o(1912736841728L, 14251);
      return;
    }
    this.nFZ.post(this);
    this.xiL += 1;
    w.d("ScrollerRunnable", "dz:try scroll firstPos = %d", new Object[] { Integer.valueOf(k) });
    GMTrace.o(1912736841728L, 14251);
    return;
    label418:
    j = localView.getTop();
    if (k > 0) {}
    for (int i = this.xiK;; i = this.nFZ.getPaddingTop())
    {
      this.nFZ.smoothScrollBy(j - i, this.xiJ);
      this.xiI = k;
      if (k <= this.xiH) {
        break;
      }
      this.nFZ.post(this);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */