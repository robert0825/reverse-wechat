package com.tencent.mm.pluginsdk.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener tsN;
  private ArrayList<WeakReference<a>> tsO;
  
  public d()
  {
    this(null);
    GMTrace.i(1151856541696L, 8582);
    GMTrace.o(1151856541696L, 8582);
  }
  
  public d(AbsListView.OnScrollListener paramOnScrollListener)
  {
    GMTrace.i(1151990759424L, 8583);
    this.tsO = new ArrayList();
    this.tsN = paramOnScrollListener;
    GMTrace.o(1151990759424L, 8583);
  }
  
  private void jX(boolean paramBoolean)
  {
    GMTrace.i(1152527630336L, 8587);
    int i = 0;
    if (i < this.tsO.size())
    {
      Object localObject = (WeakReference)this.tsO.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).onScrollStateChanged(paramBoolean);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        this.tsO.remove(i);
        continue;
        this.tsO.remove(i);
      }
    }
    GMTrace.o(1152527630336L, 8587);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1152393412608L, 8586);
    this.tsO.add(new WeakReference(parama));
    GMTrace.o(1152393412608L, 8586);
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1152124977152L, 8584);
    if (this.tsN != null) {
      this.tsN.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(1152124977152L, 8584);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(1152259194880L, 8585);
    if (paramInt == 2) {
      jX(true);
    }
    for (;;)
    {
      if (this.tsN != null) {
        this.tsN.onScrollStateChanged(paramAbsListView, paramInt);
      }
      GMTrace.o(1152259194880L, 8585);
      return;
      jX(false);
    }
  }
  
  public static abstract interface a
  {
    public abstract void onScrollStateChanged(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */