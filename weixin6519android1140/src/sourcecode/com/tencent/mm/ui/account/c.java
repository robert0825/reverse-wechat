package com.tencent.mm.ui.account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c
  extends BaseAdapter
  implements Filterable
{
  private Context mContext;
  private final Object mLock;
  private List<String> nWY;
  private ArrayList<String> nXa;
  private a vPh;
  private String vPi;
  
  public c(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    GMTrace.i(2778172751872L, 20699);
    this.mLock = new Object();
    this.mContext = paramContext;
    this.nWY = Arrays.asList(paramArrayOfString);
    this.vPi = paramString;
    GMTrace.o(2778172751872L, 20699);
  }
  
  private String iH(int paramInt)
  {
    GMTrace.i(2778441187328L, 20701);
    String str = (String)this.nWY.get(paramInt);
    GMTrace.o(2778441187328L, 20701);
    return str;
  }
  
  public final int getCount()
  {
    GMTrace.i(2778306969600L, 20700);
    int i = this.nWY.size();
    GMTrace.o(2778306969600L, 20700);
    return i;
  }
  
  public final Filter getFilter()
  {
    GMTrace.i(2778843840512L, 20704);
    if (this.vPh == null) {
      this.vPh = new a((byte)0);
    }
    a locala = this.vPh;
    GMTrace.o(2778843840512L, 20704);
    return locala;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(2778575405056L, 20702);
    long l = paramInt;
    GMTrace.o(2778575405056L, 20702);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2778709622784L, 20703);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.cpB, null);
      paramViewGroup = new b();
      paramViewGroup.huP = ((TextView)paramView.findViewById(R.h.cgR));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      String str = iH(paramInt);
      paramViewGroup.huP.setText(str);
      paramView.setBackgroundResource(R.g.aVO);
      GMTrace.o(2778709622784L, 20703);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
    }
  }
  
  private final class a
    extends Filter
  {
    private a()
    {
      GMTrace.i(2674556665856L, 19927);
      GMTrace.o(2674556665856L, 19927);
    }
    
    protected final Filter.FilterResults performFiltering(CharSequence arg1)
    {
      int i = 0;
      GMTrace.i(2674690883584L, 19928);
      Filter.FilterResults localFilterResults = new Filter.FilterResults();
      if (c.a(c.this) == null) {}
      synchronized (c.b(c.this))
      {
        c.a(c.this, new ArrayList(c.c(c.this)));
        if (??? != null) {
          if (???.length() != 0) {
            break label150;
          }
        }
      }
      synchronized (c.b(c.this))
      {
        ??? = new ArrayList(c.a(c.this));
        localFilterResults.values = ???;
        localFilterResults.count = ((ArrayList)???).size();
        GMTrace.o(2674690883584L, 19928);
        return localFilterResults;
        ??? = finally;
        throw ???;
      }
      label150:
      ??? = ???.toString().toLowerCase();
      Object localObject3;
      String str1;
      if ((c.d(c.this) != null) && (c.d(c.this).length() > 0))
      {
        localObject3 = ???.split(c.d(c.this));
        if ((localObject3 != null) && (localObject3.length > 1))
        {
          str1 = localObject3[0] + c.d(c.this);
          ??? = localObject3[1];
        }
      }
      for (;;)
      {
        localObject3 = c.a(c.this);
        int j = ((ArrayList)localObject3).size();
        ArrayList localArrayList = new ArrayList(j);
        while (i < j)
        {
          String str2 = (String)((ArrayList)localObject3).get(i);
          if (str2.toString().toLowerCase().startsWith(???)) {
            localArrayList.add(str1 + str2);
          }
          i += 1;
        }
        localFilterResults.values = localArrayList;
        localFilterResults.count = localArrayList.size();
        break;
        str1 = "";
      }
    }
    
    protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
    {
      GMTrace.i(2674825101312L, 19929);
      c.a(c.this, (List)paramFilterResults.values);
      if (paramFilterResults.count > 0)
      {
        c.this.notifyDataSetChanged();
        GMTrace.o(2674825101312L, 19929);
        return;
      }
      c.this.notifyDataSetInvalidated();
      GMTrace.o(2674825101312L, 19929);
    }
  }
  
  static final class b
  {
    public TextView huP;
    
    b()
    {
      GMTrace.i(2578859425792L, 19214);
      GMTrace.o(2578859425792L, 19214);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */