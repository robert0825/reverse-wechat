package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class MMLoadMoreListView
  extends ListView
{
  public View koo;
  public a wdv;
  private boolean wdw;
  public TextView wdx;
  public boolean wdy;
  
  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3303366721536L, 24612);
    this.koo = null;
    this.wdv = null;
    this.wdw = false;
    this.wdy = false;
    init();
    GMTrace.o(3303366721536L, 24612);
  }
  
  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3303500939264L, 24613);
    this.koo = null;
    this.wdv = null;
    this.wdw = false;
    this.wdy = false;
    init();
    GMTrace.o(3303500939264L, 24613);
  }
  
  private void init()
  {
    GMTrace.i(3303769374720L, 24615);
    if (this.koo == null)
    {
      bZY();
      addFooterView(this.koo);
      this.koo.setVisibility(8);
    }
    GMTrace.o(3303769374720L, 24615);
  }
  
  public final void bZY()
  {
    GMTrace.i(3303635156992L, 24614);
    this.koo = View.inflate(getContext(), a.h.cBz, null);
    this.wdx = ((TextView)this.koo.findViewById(a.g.gdi));
    this.koo.setVisibility(8);
    GMTrace.o(3303635156992L, 24614);
  }
  
  public final void bZZ()
  {
    GMTrace.i(3303903592448L, 24616);
    this.wdw = true;
    setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3162035453952L, 23559);
        if ((paramAnonymousInt1 == 0) && (MMLoadMoreListView.this.getChildAt(0) != null) && (MMLoadMoreListView.this.getChildAt(0).getTop() == MMLoadMoreListView.this.getPaddingTop())) {
          MMLoadMoreListView.a(MMLoadMoreListView.this, true);
        }
        for (;;)
        {
          w.d("MMLoadMoreListView", "newpoi scroll2Top %s", new Object[] { MMLoadMoreListView.b(MMLoadMoreListView.this) });
          GMTrace.o(3162035453952L, 23559);
          return;
          MMLoadMoreListView.a(MMLoadMoreListView.this, false);
        }
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(3161901236224L, 23558);
        if ((paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (MMLoadMoreListView.a(MMLoadMoreListView.this) != null)) {
          MMLoadMoreListView.a(MMLoadMoreListView.this).anO();
        }
        GMTrace.o(3161901236224L, 23558);
      }
    });
    GMTrace.o(3303903592448L, 24616);
  }
  
  public final void caa()
  {
    GMTrace.i(3304037810176L, 24617);
    if (this.koo != null)
    {
      this.wdx.setVisibility(8);
      this.koo.setVisibility(8);
    }
    GMTrace.o(3304037810176L, 24617);
  }
  
  public final void cab()
  {
    GMTrace.i(3304172027904L, 24618);
    this.wdx.setVisibility(0);
    this.koo.setVisibility(0);
    GMTrace.o(3304172027904L, 24618);
  }
  
  public static abstract interface a
  {
    public abstract void anO();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\MMLoadMoreListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */