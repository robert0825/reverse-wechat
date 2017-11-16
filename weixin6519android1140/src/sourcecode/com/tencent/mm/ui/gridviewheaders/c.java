package com.tencent.mm.ui.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c
  extends BaseAdapter
{
  private static boolean xdA;
  private DataSetObserver AH;
  private final Context mContext;
  int mCount;
  int mNumColumns;
  final b xdB;
  private GridHeadersGridView xdC;
  private final List<View> xdD;
  private View[] xdE;
  
  public c(Context paramContext, GridHeadersGridView paramGridHeadersGridView, b paramb)
  {
    GMTrace.i(16757620211712L, 124854);
    this.AH = new DataSetObserver()
    {
      public final void onChanged()
      {
        int i = 0;
        GMTrace.i(16762317832192L, 124889);
        c localc = c.this;
        localc.mCount = 0;
        int j = localc.xdB.chK();
        if (j == 0) {
          localc.mCount = localc.xdB.getCount();
        }
        for (;;)
        {
          c.this.notifyDataSetChanged();
          GMTrace.o(16762317832192L, 124889);
          return;
          while (i < j)
          {
            localc.mCount += localc.xdB.DN(i) + localc.mNumColumns;
            i += 1;
          }
        }
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(16762452049920L, 124890);
        c.a(c.this).clear();
        c.this.notifyDataSetInvalidated();
        GMTrace.o(16762452049920L, 124890);
      }
    };
    this.xdD = new ArrayList();
    this.mNumColumns = 1;
    this.mContext = paramContext;
    this.xdB = paramb;
    this.xdC = paramGridHeadersGridView;
    paramb.registerDataSetObserver(this.AH);
    GMTrace.o(16757620211712L, 124854);
  }
  
  private void DO(int paramInt)
  {
    GMTrace.i(16759499259904L, 124868);
    this.xdE = new View[paramInt];
    Arrays.fill(this.xdE, null);
    GMTrace.o(16759499259904L, 124868);
  }
  
  private int DP(int paramInt)
  {
    GMTrace.i(16759633477632L, 124869);
    paramInt = this.xdB.DN(paramInt) % this.mNumColumns;
    if (paramInt == 0)
    {
      GMTrace.o(16759633477632L, 124869);
      return 0;
    }
    int i = this.mNumColumns;
    GMTrace.o(16759633477632L, 124869);
    return i - paramInt;
  }
  
  protected final c DQ(int paramInt)
  {
    int k = 0;
    GMTrace.i(16760036130816L, 124872);
    int m = this.xdB.chK();
    if (m == 0)
    {
      if (paramInt >= this.xdB.getCount())
      {
        localc = new c(-1, 0);
        GMTrace.o(16760036130816L, 124872);
        return localc;
      }
      localc = new c(paramInt, 0);
      GMTrace.o(16760036130816L, 124872);
      return localc;
    }
    int j = paramInt;
    int i = paramInt;
    paramInt = k;
    while (paramInt < m)
    {
      k = this.xdB.DN(paramInt);
      if (j == 0)
      {
        localc = new c(-2, paramInt);
        GMTrace.o(16760036130816L, 124872);
        return localc;
      }
      j -= this.mNumColumns;
      if (j < 0)
      {
        localc = new c(-1, paramInt);
        GMTrace.o(16760036130816L, 124872);
        return localc;
      }
      i -= this.mNumColumns;
      if (j < k)
      {
        localc = new c(i, paramInt);
        GMTrace.o(16760036130816L, 124872);
        return localc;
      }
      int n = DP(paramInt);
      i -= n;
      paramInt += 1;
      j -= k + n;
    }
    c localc = new c(-1, paramInt);
    GMTrace.o(16760036130816L, 124872);
    return localc;
  }
  
  protected final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(16759901913088L, 124871);
    if (this.xdB.chK() == 0)
    {
      GMTrace.o(16759901913088L, 124871);
      return null;
    }
    paramView = this.xdB.a(DQ(paramInt).xdI, paramView, paramViewGroup);
    GMTrace.o(16759901913088L, 124871);
    return paramView;
  }
  
  public final boolean areAllItemsEnabled()
  {
    GMTrace.i(16757754429440L, 124855);
    GMTrace.o(16757754429440L, 124855);
    return false;
  }
  
  public final int getCount()
  {
    int i = 0;
    GMTrace.i(16757888647168L, 124856);
    this.mCount = 0;
    int j = this.xdB.chK();
    if (j == 0)
    {
      i = this.xdB.getCount();
      GMTrace.o(16757888647168L, 124856);
      return i;
    }
    while (i < j)
    {
      this.mCount += this.xdB.DN(i) + DP(i) + this.mNumColumns;
      i += 1;
    }
    i = this.mCount;
    GMTrace.o(16757888647168L, 124856);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(16758022864896L, 124857);
    Object localObject = DQ(paramInt);
    if ((((c)localObject).jP == -1) || (((c)localObject).jP == -2))
    {
      GMTrace.o(16758022864896L, 124857);
      return null;
    }
    localObject = this.xdB.getItem(((c)localObject).jP);
    GMTrace.o(16758022864896L, 124857);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(16758157082624L, 124858);
    c localc = DQ(paramInt);
    if (localc.jP == -2)
    {
      GMTrace.o(16758157082624L, 124858);
      return -1L;
    }
    if (localc.jP == -1)
    {
      GMTrace.o(16758157082624L, 124858);
      return -2L;
    }
    long l = this.xdB.getItemId(localc.jP);
    GMTrace.o(16758157082624L, 124858);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(16758291300352L, 124859);
    c localc = DQ(paramInt);
    if (localc.jP == -2)
    {
      GMTrace.o(16758291300352L, 124859);
      return 1;
    }
    if (localc.jP == -1)
    {
      GMTrace.o(16758291300352L, 124859);
      return 0;
    }
    paramInt = this.xdB.getItemViewType(localc.jP);
    if (paramInt == -1)
    {
      GMTrace.o(16758291300352L, 124859);
      return paramInt;
    }
    GMTrace.o(16758291300352L, 124859);
    return paramInt + 2;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(16758425518080L, 124860);
    Object localObject1;
    if ((paramView instanceof d))
    {
      paramView = (d)paramView;
      localObject1 = paramView.getChildAt(0);
    }
    for (;;)
    {
      Object localObject2 = DQ(paramInt);
      if (((c)localObject2).jP == -2)
      {
        localObject1 = new b(this.mContext);
        ((b)localObject1).xdH = this.xdC.getWidth();
        ((b)localObject1).xdG = ((c)localObject2).xdI;
        View localView = (View)((View)localObject1).getTag();
        ((View)localObject1).setTag(this.xdB.a(((c)localObject2).xdI, localView, paramViewGroup));
      }
      for (;;)
      {
        localObject2 = paramView;
        if (paramView == null) {
          localObject2 = new d(this.mContext);
        }
        ((d)localObject2).removeAllViews();
        ((d)localObject2).addView((View)localObject1);
        ((d)localObject2).jP = paramInt;
        ((d)localObject2).mNumColumns = this.mNumColumns;
        this.xdE[(paramInt % this.mNumColumns)] = localObject2;
        if (paramInt % this.mNumColumns != 0) {
          break label296;
        }
        xdA = true;
        int i = 1;
        while (i < this.xdE.length)
        {
          this.xdE[i] = getView(paramInt + i, null, paramViewGroup);
          i += 1;
        }
        if (((c)localObject2).jP == -1)
        {
          localObject2 = (a)localObject1;
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new a(this.mContext);
          }
        }
        else
        {
          localObject1 = this.xdB.getView(((c)localObject2).jP, (View)localObject1, paramViewGroup);
        }
      }
      xdA = false;
      label296:
      ((d)localObject2).xdE = this.xdE;
      if ((!xdA) && ((paramInt % this.mNumColumns == this.mNumColumns - 1) || (paramInt == getCount() - 1))) {
        DO(this.mNumColumns);
      }
      GMTrace.o(16758425518080L, 124860);
      return (View)localObject2;
      localObject2 = null;
      localObject1 = paramView;
      paramView = (View)localObject2;
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(16758559735808L, 124861);
    int i = this.xdB.getViewTypeCount();
    GMTrace.o(16758559735808L, 124861);
    return i + 2;
  }
  
  public final boolean hasStableIds()
  {
    GMTrace.i(16758693953536L, 124862);
    boolean bool = this.xdB.hasStableIds();
    GMTrace.o(16758693953536L, 124862);
    return bool;
  }
  
  public final boolean isEmpty()
  {
    GMTrace.i(16758828171264L, 124863);
    boolean bool = this.xdB.isEmpty();
    GMTrace.o(16758828171264L, 124863);
    return bool;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    GMTrace.i(16758962388992L, 124864);
    c localc = DQ(paramInt);
    if ((localc.jP == -1) || (localc.jP == -2))
    {
      GMTrace.o(16758962388992L, 124864);
      return false;
    }
    boolean bool = this.xdB.isEnabled(localc.jP);
    GMTrace.o(16758962388992L, 124864);
    return bool;
  }
  
  protected final long mj(int paramInt)
  {
    GMTrace.i(16759767695360L, 124870);
    long l = DQ(paramInt).xdI;
    GMTrace.o(16759767695360L, 124870);
    return l;
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(16759096606720L, 124865);
    this.xdB.registerDataSetObserver(paramDataSetObserver);
    GMTrace.o(16759096606720L, 124865);
  }
  
  public final void setNumColumns(int paramInt)
  {
    GMTrace.i(16759230824448L, 124866);
    this.mNumColumns = paramInt;
    DO(paramInt);
    GMTrace.o(16759230824448L, 124866);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(16759365042176L, 124867);
    this.xdB.unregisterDataSetObserver(paramDataSetObserver);
    GMTrace.o(16759365042176L, 124867);
  }
  
  protected final class a
    extends View
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(16760975654912L, 124879);
      GMTrace.o(16760975654912L, 124879);
    }
  }
  
  protected final class b
    extends FrameLayout
  {
    int xdG;
    int xdH;
    
    public b(Context paramContext)
    {
      super();
      GMTrace.i(16754398986240L, 124830);
      GMTrace.o(16754398986240L, 124830);
    }
    
    protected final FrameLayout.LayoutParams generateDefaultLayoutParams()
    {
      GMTrace.i(16754667421696L, 124832);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      GMTrace.o(16754667421696L, 124832);
      return localLayoutParams;
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      GMTrace.i(16754533203968L, 124831);
      View localView = (View)getTag();
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(generateDefaultLayoutParams());
      }
      if ((localView.getVisibility() != 8) && (localView.getMeasuredHeight() == 0)) {
        localView.measure(View.MeasureSpec.makeMeasureSpec(this.xdH, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      }
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), localView.getMeasuredHeight());
      GMTrace.o(16754533203968L, 124831);
    }
  }
  
  protected final class c
  {
    protected int jP;
    protected int xdI;
    
    protected c(int paramInt1, int paramInt2)
    {
      GMTrace.i(16761512525824L, 124883);
      this.jP = paramInt1;
      this.xdI = paramInt2;
      GMTrace.o(16761512525824L, 124883);
    }
  }
  
  protected final class d
    extends FrameLayout
  {
    int jP;
    int mNumColumns;
    View[] xdE;
    private boolean xdJ;
    
    public d(Context paramContext)
    {
      super();
      GMTrace.i(16753056808960L, 124820);
      GMTrace.o(16753056808960L, 124820);
    }
    
    protected final FrameLayout.LayoutParams generateDefaultLayoutParams()
    {
      GMTrace.i(16753727897600L, 124825);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      GMTrace.o(16753727897600L, 124825);
      return localLayoutParams;
    }
    
    public final Object getTag()
    {
      GMTrace.i(16753191026688L, 124821);
      Object localObject = getChildAt(0).getTag();
      GMTrace.o(16753191026688L, 124821);
      return localObject;
    }
    
    public final Object getTag(int paramInt)
    {
      GMTrace.i(16753325244416L, 124822);
      Object localObject = getChildAt(0).getTag(paramInt);
      GMTrace.o(16753325244416L, 124822);
      return localObject;
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      GMTrace.i(16753862115328L, 124826);
      super.onMeasure(paramInt1, paramInt2);
      if ((this.mNumColumns == 1) || (c.b(c.this) == null))
      {
        GMTrace.o(16753862115328L, 124826);
        return;
      }
      int j;
      if ((this.jP % this.mNumColumns == 0) && (!this.xdJ))
      {
        this.xdJ = true;
        arrayOfView = this.xdE;
        j = arrayOfView.length;
        i = 0;
        while (i < j)
        {
          arrayOfView[i].measure(paramInt1, paramInt2);
          i += 1;
        }
        this.xdJ = false;
      }
      int k = getMeasuredHeight();
      View[] arrayOfView = this.xdE;
      int m = arrayOfView.length;
      paramInt2 = 0;
      for (int i = k; paramInt2 < m; i = j)
      {
        View localView = arrayOfView[paramInt2];
        j = i;
        if (localView != null) {
          j = Math.max(i, localView.getMeasuredHeight());
        }
        paramInt2 += 1;
      }
      if (i == k)
      {
        GMTrace.o(16753862115328L, 124826);
        return;
      }
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
      GMTrace.o(16753862115328L, 124826);
    }
    
    public final void setTag(int paramInt, Object paramObject)
    {
      GMTrace.i(16753459462144L, 124823);
      getChildAt(0).setTag(paramInt, paramObject);
      GMTrace.o(16753459462144L, 124823);
    }
    
    public final void setTag(Object paramObject)
    {
      GMTrace.i(16753593679872L, 124824);
      getChildAt(0).setTag(paramObject);
      GMTrace.o(16753593679872L, 124824);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\gridviewheaders\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */