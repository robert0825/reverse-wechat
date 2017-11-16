package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f
  extends BaseAdapter
  implements b
{
  private e xek;
  private List<b> xel;
  
  public f(e parame)
  {
    GMTrace.i(16762586267648L, 124891);
    this.xek = parame;
    parame.registerDataSetObserver(new a((byte)0));
    this.xel = a(parame);
    GMTrace.o(16762586267648L, 124891);
  }
  
  public final int DN(int paramInt)
  {
    GMTrace.i(16762854703104L, 124893);
    try
    {
      paramInt = ((b)this.xel.get(paramInt)).mCount;
      GMTrace.o(16762854703104L, 124893);
      return paramInt;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localIndexOutOfBoundsException.toString();
      GMTrace.o(16762854703104L, 124893);
    }
    return 0;
  }
  
  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(16762988920832L, 124894);
    paramView = this.xek.a(((b)this.xel.get(paramInt)).xen, paramView, paramViewGroup);
    GMTrace.o(16762988920832L, 124894);
    return paramView;
  }
  
  protected final List<b> a(e parame)
  {
    GMTrace.i(16763660009472L, 124899);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < parame.getCount())
    {
      long l = parame.mj(i);
      b localb2 = (b)localHashMap.get(Long.valueOf(l));
      b localb1 = localb2;
      if (localb2 == null)
      {
        localb1 = new b(i);
        localArrayList.add(localb1);
      }
      localb1.mCount += 1;
      localHashMap.put(Long.valueOf(l), localb1);
      i += 1;
    }
    GMTrace.o(16763660009472L, 124899);
    return localArrayList;
  }
  
  public final int chK()
  {
    GMTrace.i(16763391574016L, 124897);
    int i = this.xel.size();
    GMTrace.o(16763391574016L, 124897);
    return i;
  }
  
  public final int getCount()
  {
    GMTrace.i(16762720485376L, 124892);
    int i = this.xek.getCount();
    GMTrace.o(16762720485376L, 124892);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(16763123138560L, 124895);
    Object localObject = this.xek.getItem(paramInt);
    GMTrace.o(16763123138560L, 124895);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(16763257356288L, 124896);
    long l = this.xek.getItemId(paramInt);
    GMTrace.o(16763257356288L, 124896);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(16763525791744L, 124898);
    paramView = this.xek.getView(paramInt, paramView, paramViewGroup);
    GMTrace.o(16763525791744L, 124898);
    return paramView;
  }
  
  private final class a
    extends DataSetObserver
  {
    private a()
    {
      GMTrace.i(16764331098112L, 124904);
      GMTrace.o(16764331098112L, 124904);
    }
    
    public final void onChanged()
    {
      GMTrace.i(16764465315840L, 124905);
      f.a(f.this, f.this.a(f.a(f.this)));
      f.this.notifyDataSetChanged();
      GMTrace.o(16764465315840L, 124905);
    }
    
    public final void onInvalidated()
    {
      GMTrace.i(16764599533568L, 124906);
      f.a(f.this, f.this.a(f.a(f.this)));
      f.this.notifyDataSetInvalidated();
      GMTrace.o(16764599533568L, 124906);
    }
  }
  
  private final class b
  {
    int mCount;
    int xen;
    
    public b(int paramInt)
    {
      GMTrace.i(16746882793472L, 124774);
      this.xen = paramInt;
      this.mCount = 0;
      GMTrace.o(16746882793472L, 124774);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\gridviewheaders\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */