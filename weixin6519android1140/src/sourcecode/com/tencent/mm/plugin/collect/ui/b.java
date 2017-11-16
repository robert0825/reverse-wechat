package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.collect.b.e;
import com.tencent.mm.plugin.collect.b.h;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends BaseAdapter
{
  List<h> jYO;
  private Context mContext;
  
  public b(Context paramContext)
  {
    GMTrace.i(5427093831680L, 40435);
    this.jYO = new ArrayList();
    this.mContext = paramContext;
    GMTrace.o(5427093831680L, 40435);
  }
  
  public final void an(List<h> paramList)
  {
    GMTrace.i(5427764920320L, 40440);
    this.jYO.clear();
    this.jYO.addAll(paramList);
    notifyDataSetChanged();
    GMTrace.o(5427764920320L, 40440);
  }
  
  public final void ao(List<h> paramList)
  {
    GMTrace.i(5427899138048L, 40441);
    this.jYO.addAll(paramList);
    notifyDataSetChanged();
    GMTrace.o(5427899138048L, 40441);
  }
  
  public final int getCount()
  {
    GMTrace.i(5427228049408L, 40436);
    int i = this.jYO.size();
    GMTrace.o(5427228049408L, 40436);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5427496484864L, 40438);
    long l = paramInt;
    GMTrace.o(5427496484864L, 40438);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5427630702592L, 40439);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.fb(this.mContext).inflate(a.g.sLW, paramViewGroup, false);
      localView.setTag(new a(localView));
    }
    paramView = (a)localView.getTag();
    paramViewGroup = mo(paramInt);
    paramView.jYP.setText(e.a(this.mContext, paramViewGroup.jWm, paramViewGroup.type));
    paramView.jYQ.setText(e.mn(paramViewGroup.jWo));
    paramView.jXT.setText(this.mContext.getString(a.i.sSB, new Object[] { Integer.valueOf(paramViewGroup.jWn) }));
    GMTrace.o(5427630702592L, 40439);
    return localView;
  }
  
  public final h mo(int paramInt)
  {
    GMTrace.i(5427362267136L, 40437);
    h localh = (h)this.jYO.get(paramInt);
    GMTrace.o(5427362267136L, 40437);
    return localh;
  }
  
  private static final class a
  {
    TextView jXT;
    TextView jYP;
    WalletTextView jYQ;
    TextView jYR;
    
    public a(View paramView)
    {
      GMTrace.i(5428167573504L, 40443);
      this.jYP = ((TextView)paramView.findViewById(a.f.sty));
      this.jYR = ((TextView)paramView.findViewById(a.f.stx));
      this.jYQ = ((WalletTextView)paramView.findViewById(a.f.stD));
      this.jXT = ((TextView)paramView.findViewById(a.f.stz));
      GMTrace.o(5428167573504L, 40443);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */