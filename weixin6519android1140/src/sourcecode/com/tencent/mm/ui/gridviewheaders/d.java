package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;

public final class d
  extends BaseAdapter
  implements b
{
  private DataSetObserver AH;
  private ListAdapter xei;
  
  public d(ListAdapter paramListAdapter)
  {
    GMTrace.i(16755741163520L, 124840);
    this.AH = new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(16761244090368L, 124881);
        d.this.notifyDataSetChanged();
        GMTrace.o(16761244090368L, 124881);
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(16761378308096L, 124882);
        d.this.notifyDataSetInvalidated();
        GMTrace.o(16761378308096L, 124882);
      }
    };
    this.xei = paramListAdapter;
    paramListAdapter.registerDataSetObserver(this.AH);
    GMTrace.o(16755741163520L, 124840);
  }
  
  public final int DN(int paramInt)
  {
    GMTrace.i(16756412252160L, 124845);
    GMTrace.o(16756412252160L, 124845);
    return 0;
  }
  
  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(16756680687616L, 124847);
    GMTrace.o(16756680687616L, 124847);
    return null;
  }
  
  public final int chK()
  {
    GMTrace.i(16756546469888L, 124846);
    GMTrace.o(16756546469888L, 124846);
    return 0;
  }
  
  public final int getCount()
  {
    GMTrace.i(16755875381248L, 124841);
    int i = this.xei.getCount();
    GMTrace.o(16755875381248L, 124841);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(16756009598976L, 124842);
    Object localObject = this.xei.getItem(paramInt);
    GMTrace.o(16756009598976L, 124842);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(16756143816704L, 124843);
    long l = this.xei.getItemId(paramInt);
    GMTrace.o(16756143816704L, 124843);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(16756278034432L, 124844);
    paramView = this.xei.getView(paramInt, paramView, paramViewGroup);
    GMTrace.o(16756278034432L, 124844);
    return paramView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\gridviewheaders\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */