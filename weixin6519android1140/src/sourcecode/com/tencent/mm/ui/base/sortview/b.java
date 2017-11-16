package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public abstract class b
  extends BaseAdapter
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener
{
  protected Context mContext;
  public SparseArray<a> wlo;
  public Runnable wlp;
  
  public b(Context paramContext)
  {
    GMTrace.i(20997692456960L, 156445);
    if (paramContext == null) {
      throw new NullPointerException("context is null.");
    }
    this.mContext = paramContext;
    this.wlo = new SparseArray();
    this.wlp = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(21004537561088L, 156496);
        b.this.notifyDataSetChanged();
        GMTrace.o(21004537561088L, 156496);
      }
    };
    GMTrace.o(20997692456960L, 156445);
  }
  
  public int getCount()
  {
    GMTrace.i(20997826674688L, 156446);
    int i = this.wlo.size();
    GMTrace.o(20997826674688L, 156446);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(20998497763328L, 156451);
    long l = paramInt;
    GMTrace.o(20998497763328L, 156451);
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(20997960892416L, 156447);
    if (lv(paramInt) != null)
    {
      if (lv(paramInt) == null)
      {
        GMTrace.o(20997960892416L, 156447);
        return 0;
      }
      paramInt = lv(paramInt).type;
      GMTrace.o(20997960892416L, 156447);
      return paramInt;
    }
    w.d("MicroMsg.BaseMutilDataItemAdapter", "getItemViewType: get data item fail, return unkown Type, totalCount(%d) , position(%d)", new Object[] { Integer.valueOf(getCount()), Integer.valueOf(paramInt) });
    GMTrace.o(20997960892416L, 156447);
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20998363545600L, 156450);
    long l1 = System.currentTimeMillis();
    a locala = lv(paramInt);
    if (locala == null)
    {
      w.e("MicroMsg.BaseMutilDataItemAdapter", "DataItem is null.");
      GMTrace.o(20998363545600L, 156450);
      return paramView;
    }
    long l2 = System.currentTimeMillis();
    a.b localb = locala.aig();
    if (localb == null)
    {
      w.e("MicroMsg.BaseMutilDataItemAdapter", "ViewItem is null.");
      GMTrace.o(20998363545600L, 156450);
      return paramView;
    }
    if (paramView == null)
    {
      paramView = localb.b(this.mContext, paramView);
      paramViewGroup = locala.aih();
      localb.a(paramView, paramViewGroup);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      Object[] arrayOfObject = lt(paramInt);
      Assert.assertNotNull(paramViewGroup);
      if (!locala.wln) {
        locala.a(this.mContext, paramViewGroup, arrayOfObject);
      }
      long l3 = System.currentTimeMillis();
      localb.a(this.mContext, paramViewGroup, locala);
      w.d("MicroMsg.BaseMutilDataItemAdapter", "position %d, getItem %d, inflate %d, filling data %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l2 - l1), Long.valueOf(l3 - l2), Long.valueOf(System.currentTimeMillis() - l3) });
      GMTrace.o(20998363545600L, 156450);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
    }
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(20998095110144L, 156448);
    GMTrace.o(20998095110144L, 156448);
    return 7;
  }
  
  public abstract a ls(int paramInt);
  
  public abstract Object[] lt(int paramInt);
  
  public a lv(int paramInt)
  {
    GMTrace.i(20998229327872L, 156449);
    if ((paramInt < 0) || (paramInt > getCount()))
    {
      w.e("MicroMsg.BaseMutilDataItemAdapter", "The given position(%d) is illegal.", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20998229327872L, 156449);
      return null;
    }
    a locala2 = (a)this.wlo.get(paramInt);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = ls(paramInt);
      this.wlo.put(paramInt, locala1);
    }
    GMTrace.o(20998229327872L, 156449);
    return locala1;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(20998631981056L, 156452);
    paramAdapterView = lv(paramInt);
    if (paramAdapterView == null)
    {
      GMTrace.o(20998631981056L, 156452);
      return;
    }
    paramView = paramAdapterView.aig();
    if (paramView == null)
    {
      GMTrace.o(20998631981056L, 156452);
      return;
    }
    if (paramView.a(this.mContext, paramAdapterView, lt(paramInt)))
    {
      GMTrace.o(20998631981056L, 156452);
      return;
    }
    GMTrace.o(20998631981056L, 156452);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\sortview\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */