package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSortView
  extends LinearLayout
  implements VerticalScrollBar.a
{
  private AdapterView.OnItemSelectedListener Fu;
  public AdapterView.OnItemClickListener WC;
  private ListView jvB;
  public int mMode;
  private VerticalScrollBar wlr;
  private View wls;
  public c wlt;
  public AdapterView.OnItemLongClickListener wlu;
  private List<d> wlv;
  public boolean wlw;
  public boolean wlx;
  public a wly;
  
  public BaseSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(21001450553344L, 156473);
    this.wlv = new ArrayList();
    this.wlt = new c(ais());
    inflate();
    this.wlr = aiq();
    this.jvB = getListView();
    this.wls = air();
    this.wlw = true;
    lQ(true);
    this.jvB.setAdapter(this.wlt);
    if (this.wlr != null) {
      this.wlr.wiZ = this;
    }
    this.wlt.registerDataSetObserver(new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(21005208649728L, 156501);
        if (BaseSortView.a(BaseSortView.this) != null) {
          BaseSortView.a(BaseSortView.this).Y(BaseSortView.b(BaseSortView.this).wlv);
        }
        GMTrace.o(21005208649728L, 156501);
      }
    });
    this.jvB.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(21005477085184L, 156503);
        if (BaseSortView.c(BaseSortView.this) != null) {
          BaseSortView.c(BaseSortView.this).onItemClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(21005477085184L, 156503);
      }
    });
    this.jvB.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(21004269125632L, 156494);
        if (BaseSortView.d(BaseSortView.this) != null)
        {
          boolean bool = BaseSortView.d(BaseSortView.this).onItemLongClick(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
          GMTrace.o(21004269125632L, 156494);
          return bool;
        }
        GMTrace.o(21004269125632L, 156494);
        return false;
      }
    });
    this.jvB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(21001182117888L, 156471);
        if (BaseSortView.e(BaseSortView.this) != null) {
          BaseSortView.e(BaseSortView.this).onItemSelected(paramAnonymousAdapterView, paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
        }
        GMTrace.o(21001182117888L, 156471);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(21001316335616L, 156472);
        if (BaseSortView.e(BaseSortView.this) != null) {
          BaseSortView.e(BaseSortView.this).onNothingSelected(paramAnonymousAdapterView);
        }
        GMTrace.o(21001316335616L, 156472);
      }
    });
    GMTrace.o(21001450553344L, 156473);
  }
  
  public static void o(View paramView, boolean paramBoolean)
  {
    GMTrace.i(21003061166080L, 156485);
    if (paramView != null) {
      if (!paramBoolean) {
        break label32;
      }
    }
    label32:
    for (int i = 0;; i = 8)
    {
      paramView.setVisibility(i);
      GMTrace.o(21003061166080L, 156485);
      return;
    }
  }
  
  public final void VK(String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(21002658512896L, 156482);
    if (this.mMode != 1)
    {
      w.w("MicroMsg.BaseSortView", "Can't doFilter successfully out of the search mode.");
      GMTrace.o(21002658512896L, 156482);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    if (!bg.nm(paramString))
    {
      localArrayList.clear();
      Iterator localIterator = this.wlv.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (a(paramString, locald)) {
          localArrayList.add(locald);
        }
      }
    }
    for (int i = 1;; i = 0)
    {
      paramString = this.jvB;
      if ((i != 0) && (localArrayList.size() > 0))
      {
        bool1 = true;
        o(paramString, bool1);
        paramString = this.wls;
        if ((i == 0) || (localArrayList.size() > 0)) {
          break label189;
        }
      }
      label189:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        o(paramString, bool1);
        cA(localArrayList);
        GMTrace.o(21002658512896L, 156482);
        return;
        bool1 = false;
        break;
      }
    }
  }
  
  public abstract boolean a(String paramString, d paramd);
  
  public abstract VerticalScrollBar aiq();
  
  public abstract View air();
  
  public abstract c.a ais();
  
  public final void cA(List<d> paramList)
  {
    GMTrace.i(21002524295168L, 156481);
    if ((this.mMode == 0) && (this.wlv != paramList))
    {
      this.wlv.clear();
      if (paramList != null) {
        this.wlv.addAll(paramList);
      }
    }
    this.wlt.cA(paramList);
    GMTrace.o(21002524295168L, 156481);
  }
  
  public final void cbb()
  {
    GMTrace.i(21002926948352L, 156484);
    this.mMode = 1;
    VK("");
    GMTrace.o(21002926948352L, 156484);
  }
  
  public final void cbc()
  {
    GMTrace.i(21003329601536L, 156487);
    this.wlw = false;
    af.t(this.wlt.wlC);
    GMTrace.o(21003329601536L, 156487);
  }
  
  public abstract ListView getListView();
  
  public abstract View inflate();
  
  public final void lQ(boolean paramBoolean)
  {
    GMTrace.i(21003195383808L, 156486);
    this.wlx = paramBoolean;
    VerticalScrollBar localVerticalScrollBar;
    if (this.wlr != null)
    {
      localVerticalScrollBar = this.wlr;
      if (!paramBoolean) {
        break label47;
      }
    }
    label47:
    for (int i = 0;; i = 8)
    {
      localVerticalScrollBar.setVisibility(i);
      GMTrace.o(21003195383808L, 156486);
      return;
    }
  }
  
  public void refresh()
  {
    GMTrace.i(21001584771072L, 156474);
    af.t(this.wlt.wlC);
    GMTrace.o(21001584771072L, 156474);
  }
  
  public final void uW(String paramString)
  {
    GMTrace.i(21002792730624L, 156483);
    int i = this.wlt.VL(paramString);
    if (i >= 0) {
      this.jvB.setSelection(i);
    }
    GMTrace.o(21002792730624L, 156483);
  }
  
  public static abstract interface a
  {
    public abstract void Y(List<d> paramList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\sortview\BaseSortView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */