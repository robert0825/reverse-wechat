package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h
  extends BaseAdapter
  implements Filterable
{
  private Context mContext;
  private List<String> nHU;
  private List<String> nJO;
  Filter nJP;
  
  public h(Context paramContext)
  {
    GMTrace.i(6008525029376L, 44767);
    this.nJO = null;
    this.nHU = null;
    this.nJP = new Filter()
    {
      protected final Filter.FilterResults performFiltering(CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(6018591358976L, 44842);
        Filter.FilterResults localFilterResults = new Filter.FilterResults();
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = h.a(h.this).iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if ((str != null) && (paramAnonymousCharSequence != null) && (str.contains(paramAnonymousCharSequence))) {
            localArrayList.add(str);
          }
        }
        localFilterResults.values = localArrayList;
        localFilterResults.count = localArrayList.size();
        GMTrace.o(6018591358976L, 44842);
        return localFilterResults;
      }
      
      protected final void publishResults(CharSequence paramAnonymousCharSequence, Filter.FilterResults paramAnonymousFilterResults)
      {
        try
        {
          GMTrace.i(6018457141248L, 44841);
          h.a(h.this, (List)paramAnonymousFilterResults.values);
          h.this.notifyDataSetChanged();
          GMTrace.o(6018457141248L, 44841);
          return;
        }
        finally
        {
          paramAnonymousCharSequence = finally;
          throw paramAnonymousCharSequence;
        }
      }
    };
    this.mContext = paramContext;
    this.nJO = a.aWW().aWY().nHU;
    GMTrace.o(6008525029376L, 44767);
  }
  
  private String iH(int paramInt)
  {
    GMTrace.i(6008793464832L, 44769);
    String str = (String)this.nHU.get(paramInt);
    GMTrace.o(6008793464832L, 44769);
    return str;
  }
  
  public final int getCount()
  {
    GMTrace.i(6008659247104L, 44768);
    if (this.nHU != null)
    {
      int i = this.nHU.size();
      GMTrace.o(6008659247104L, 44768);
      return i;
    }
    GMTrace.o(6008659247104L, 44768);
    return 0;
  }
  
  public final Filter getFilter()
  {
    GMTrace.i(6009196118016L, 44772);
    Filter localFilter = this.nJP;
    GMTrace.o(6009196118016L, 44772);
    return localFilter;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6008927682560L, 44770);
    long l = paramInt;
    GMTrace.o(6008927682560L, 44770);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6009061900288L, 44771);
    View localView;
    if (paramView == null)
    {
      paramView = new a();
      localView = LayoutInflater.from(this.mContext).inflate(17367043, null);
      paramView.nJt = ((TextView)localView.findViewById(16908308));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.nJt.setText(iH(paramInt));
      GMTrace.o(6009061900288L, 44771);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  final class a
  {
    TextView nJt;
    
    a()
    {
      GMTrace.i(6028523470848L, 44916);
      GMTrace.o(6028523470848L, 44916);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */