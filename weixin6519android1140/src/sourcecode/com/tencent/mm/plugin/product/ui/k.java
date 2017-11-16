package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.b.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.List;

public final class k
  extends BaseAdapter
{
  private Context mContext;
  AdapterView.OnItemClickListener nKn;
  List<n> nKu;
  
  public k(Context paramContext)
  {
    GMTrace.i(6017517617152L, 44834);
    this.mContext = paramContext;
    GMTrace.o(6017517617152L, 44834);
  }
  
  private n sz(int paramInt)
  {
    GMTrace.i(6017786052608L, 44836);
    n localn = (n)this.nKu.get(paramInt);
    GMTrace.o(6017786052608L, 44836);
    return localn;
  }
  
  public final int getCount()
  {
    GMTrace.i(6017651834880L, 44835);
    if (this.nKu != null)
    {
      int i = this.nKu.size();
      GMTrace.o(6017651834880L, 44835);
      return i;
    }
    GMTrace.o(6017651834880L, 44835);
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(6017920270336L, 44837);
    long l = paramInt;
    GMTrace.o(6017920270336L, 44837);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6018054488064L, 44838);
    n localn = sz(paramInt);
    View localView;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = new a();
      localView = View.inflate(this.mContext, a.g.sOd, null);
      paramView.nKo = ((TextView)localView.findViewById(a.f.sBT));
      paramView.nKp = ((MaxGridView)localView.findViewById(a.f.sBS));
      paramView.nKv = new l(this.mContext);
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.nKo.setText(localn.name);
      paramViewGroup.nKp.setOnItemClickListener(this.nKn);
      paramViewGroup.nKv.nKx = localn.nIn;
      paramViewGroup.nKv.notifyDataSetChanged();
      paramViewGroup.nKp.setAdapter(paramViewGroup.nKv);
      GMTrace.o(6018054488064L, 44838);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  final class a
  {
    public TextView nKo;
    public MaxGridView nKp;
    public l nKv;
    
    a()
    {
      GMTrace.i(6013491085312L, 44804);
      this.nKo = null;
      this.nKp = null;
      this.nKv = null;
      GMTrace.o(6013491085312L, 44804);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */