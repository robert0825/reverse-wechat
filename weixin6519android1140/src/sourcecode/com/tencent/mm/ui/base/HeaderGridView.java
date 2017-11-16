package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class HeaderGridView
  extends GridView
{
  public ArrayList<a> vZm;
  
  public HeaderGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3288468553728L, 24501);
    this.vZm = new ArrayList();
    super.setClipChildren(false);
    GMTrace.o(3288468553728L, 24501);
  }
  
  public HeaderGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3288602771456L, 24502);
    this.vZm = new ArrayList();
    super.setClipChildren(false);
    GMTrace.o(3288602771456L, 24502);
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    GMTrace.i(3289005424640L, 24505);
    if (this.vZm.size() > 0)
    {
      paramListAdapter = new c(this.vZm, paramListAdapter);
      if (paramListAdapter.mNumColumns != 5)
      {
        paramListAdapter.mNumColumns = 5;
        paramListAdapter.mDataSetObservable.notifyChanged();
      }
      super.setAdapter(paramListAdapter);
      GMTrace.o(3289005424640L, 24505);
      return;
    }
    super.setAdapter(paramListAdapter);
    GMTrace.o(3289005424640L, 24505);
  }
  
  @TargetApi(11)
  public int getNumColumns()
  {
    GMTrace.i(3288736989184L, 24503);
    int i;
    if (Build.VERSION.SDK_INT >= 11)
    {
      i = super.getNumColumns();
      GMTrace.o(3288736989184L, 24503);
      return i;
    }
    try
    {
      Field localField = getClass().getSuperclass().getDeclaredField("mNumColumns");
      localField.setAccessible(true);
      i = localField.getInt(this);
      GMTrace.o(3288736989184L, 24503);
      return i;
    }
    catch (Exception localException)
    {
      GMTrace.o(3288736989184L, 24503);
    }
    return 1;
  }
  
  public void setClipChildren(boolean paramBoolean)
  {
    GMTrace.i(3288871206912L, 24504);
    GMTrace.o(3288871206912L, 24504);
  }
  
  private static final class a
  {
    public Object data;
    public boolean isSelectable;
    public ViewGroup vZn;
    public View view;
    
    public a()
    {
      GMTrace.i(3344571564032L, 24919);
      GMTrace.o(3344571564032L, 24919);
    }
  }
  
  private final class b
    extends FrameLayout
  {
    public b(Context paramContext)
    {
      super();
      GMTrace.i(3353295716352L, 24984);
      GMTrace.o(3353295716352L, 24984);
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      GMTrace.i(3353429934080L, 24985);
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(HeaderGridView.this.getMeasuredWidth() - HeaderGridView.this.getPaddingLeft() - HeaderGridView.this.getPaddingRight(), 1073741824), paramInt2);
      GMTrace.o(3353429934080L, 24985);
    }
  }
  
  private static final class c
    implements Filterable, WrapperListAdapter
  {
    private final ListAdapter EP;
    public final DataSetObservable mDataSetObservable;
    int mNumColumns;
    ArrayList<HeaderGridView.a> vZm;
    boolean vZp;
    private final boolean vZq;
    
    public c(ArrayList<HeaderGridView.a> paramArrayList, ListAdapter paramListAdapter)
    {
      GMTrace.i(3256793169920L, 24265);
      this.mDataSetObservable = new DataSetObservable();
      this.mNumColumns = 1;
      this.EP = paramListAdapter;
      this.vZq = (paramListAdapter instanceof Filterable);
      if (paramArrayList == null) {
        throw new IllegalArgumentException("headerViewInfos cannot be null");
      }
      this.vZm = paramArrayList;
      this.vZp = ai(this.vZm);
      GMTrace.o(3256793169920L, 24265);
    }
    
    private static boolean ai(ArrayList<HeaderGridView.a> paramArrayList)
    {
      GMTrace.i(3257061605376L, 24267);
      if (paramArrayList != null)
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
          if (!((HeaderGridView.a)paramArrayList.next()).isSelectable)
          {
            GMTrace.o(3257061605376L, 24267);
            return false;
          }
        }
      }
      GMTrace.o(3257061605376L, 24267);
      return true;
    }
    
    public final boolean areAllItemsEnabled()
    {
      GMTrace.i(3257330040832L, 24269);
      if (this.EP != null)
      {
        if ((this.vZp) && (this.EP.areAllItemsEnabled()))
        {
          GMTrace.o(3257330040832L, 24269);
          return true;
        }
        GMTrace.o(3257330040832L, 24269);
        return false;
      }
      GMTrace.o(3257330040832L, 24269);
      return true;
    }
    
    public final int getCount()
    {
      GMTrace.i(3257195823104L, 24268);
      if (this.EP != null)
      {
        i = this.vZm.size();
        j = this.mNumColumns;
        int k = this.EP.getCount();
        GMTrace.o(3257195823104L, 24268);
        return i * j + k;
      }
      int i = this.vZm.size();
      int j = this.mNumColumns;
      GMTrace.o(3257195823104L, 24268);
      return i * j;
    }
    
    public final Filter getFilter()
    {
      GMTrace.i(3258672218112L, 24279);
      if (this.vZq)
      {
        Filter localFilter = ((Filterable)this.EP).getFilter();
        GMTrace.o(3258672218112L, 24279);
        return localFilter;
      }
      GMTrace.o(3258672218112L, 24279);
      return null;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(3257598476288L, 24271);
      int i = this.vZm.size() * this.mNumColumns;
      Object localObject;
      if (paramInt < i)
      {
        if (paramInt % this.mNumColumns == 0)
        {
          localObject = ((HeaderGridView.a)this.vZm.get(paramInt / this.mNumColumns)).data;
          GMTrace.o(3257598476288L, 24271);
          return localObject;
        }
        GMTrace.o(3257598476288L, 24271);
        return null;
      }
      paramInt -= i;
      if ((this.EP != null) && (paramInt < this.EP.getCount()))
      {
        localObject = this.EP.getItem(paramInt);
        GMTrace.o(3257598476288L, 24271);
        return localObject;
      }
      GMTrace.o(3257598476288L, 24271);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(3257732694016L, 24272);
      int i = this.vZm.size() * this.mNumColumns;
      if ((this.EP != null) && (paramInt >= i))
      {
        paramInt -= i;
        if (paramInt < this.EP.getCount())
        {
          long l = this.EP.getItemId(paramInt);
          GMTrace.o(3257732694016L, 24272);
          return l;
        }
      }
      GMTrace.o(3257732694016L, 24272);
      return -1L;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(3258135347200L, 24275);
      int i = this.vZm.size() * this.mNumColumns;
      if ((paramInt < i) && (paramInt % this.mNumColumns != 0))
      {
        if (this.EP != null)
        {
          paramInt = this.EP.getViewTypeCount();
          GMTrace.o(3258135347200L, 24275);
          return paramInt;
        }
        GMTrace.o(3258135347200L, 24275);
        return 1;
      }
      if ((this.EP != null) && (paramInt >= i))
      {
        paramInt -= i;
        if (paramInt < this.EP.getCount())
        {
          paramInt = this.EP.getItemViewType(paramInt);
          GMTrace.o(3258135347200L, 24275);
          return paramInt;
        }
      }
      GMTrace.o(3258135347200L, 24275);
      return -2;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(3258001129472L, 24274);
      int i = this.vZm.size() * this.mNumColumns;
      if (paramInt < i)
      {
        ViewGroup localViewGroup = ((HeaderGridView.a)this.vZm.get(paramInt / this.mNumColumns)).vZn;
        if (paramInt % this.mNumColumns == 0)
        {
          GMTrace.o(3258001129472L, 24274);
          return localViewGroup;
        }
        localView = paramView;
        if (paramView == null) {
          localView = new View(paramViewGroup.getContext());
        }
        localView.setVisibility(4);
        localView.setMinimumHeight(localViewGroup.getHeight());
        GMTrace.o(3258001129472L, 24274);
        return localView;
      }
      paramInt -= i;
      if ((this.EP != null) && (paramInt < this.EP.getCount()))
      {
        paramView = this.EP.getView(paramInt, paramView, paramViewGroup);
        GMTrace.o(3258001129472L, 24274);
        return paramView;
      }
      View localView = paramView;
      if (paramView == null) {
        localView = new View(paramViewGroup.getContext());
      }
      localView.setVisibility(4);
      GMTrace.o(3258001129472L, 24274);
      return localView;
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(3258269564928L, 24276);
      if (this.EP != null)
      {
        int i = this.EP.getViewTypeCount();
        GMTrace.o(3258269564928L, 24276);
        return i + 1;
      }
      GMTrace.o(3258269564928L, 24276);
      return 2;
    }
    
    public final ListAdapter getWrappedAdapter()
    {
      GMTrace.i(3258806435840L, 24280);
      ListAdapter localListAdapter = this.EP;
      GMTrace.o(3258806435840L, 24280);
      return localListAdapter;
    }
    
    public final boolean hasStableIds()
    {
      GMTrace.i(3257866911744L, 24273);
      if (this.EP != null)
      {
        boolean bool = this.EP.hasStableIds();
        GMTrace.o(3257866911744L, 24273);
        return bool;
      }
      GMTrace.o(3257866911744L, 24273);
      return false;
    }
    
    public final boolean isEmpty()
    {
      GMTrace.i(3256927387648L, 24266);
      if (((this.EP == null) || (this.EP.isEmpty())) && (this.vZm.size() == 0))
      {
        GMTrace.o(3256927387648L, 24266);
        return true;
      }
      GMTrace.o(3256927387648L, 24266);
      return false;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(3257464258560L, 24270);
      int i = this.vZm.size() * this.mNumColumns;
      if (paramInt < i)
      {
        if ((paramInt % this.mNumColumns == 0) && (((HeaderGridView.a)this.vZm.get(paramInt / this.mNumColumns)).isSelectable))
        {
          GMTrace.o(3257464258560L, 24270);
          return true;
        }
        GMTrace.o(3257464258560L, 24270);
        return false;
      }
      paramInt -= i;
      if ((this.EP != null) && (paramInt < this.EP.getCount()))
      {
        boolean bool = this.EP.isEnabled(paramInt);
        GMTrace.o(3257464258560L, 24270);
        return bool;
      }
      GMTrace.o(3257464258560L, 24270);
      return false;
    }
    
    public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      GMTrace.i(3258403782656L, 24277);
      this.mDataSetObservable.registerObserver(paramDataSetObserver);
      if (this.EP != null) {
        this.EP.registerDataSetObserver(paramDataSetObserver);
      }
      GMTrace.o(3258403782656L, 24277);
    }
    
    public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      GMTrace.i(3258538000384L, 24278);
      this.mDataSetObservable.unregisterObserver(paramDataSetObserver);
      if (this.EP != null) {
        this.EP.unregisterDataSetObserver(paramDataSetObserver);
      }
      GMTrace.o(3258538000384L, 24278);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\HeaderGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */