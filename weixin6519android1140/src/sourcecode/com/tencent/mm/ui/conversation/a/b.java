package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.k.a.a;
import com.tencent.mm.ui.o;
import java.util.ArrayList;

public final class b
  extends o<c>
{
  private ArrayList<c> vTj;
  a wZr;
  
  public b(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(14500614897664L, 108038);
    this.vTj = new ArrayList();
    this.wZr = null;
    QG();
    GMTrace.o(14500614897664L, 108038);
  }
  
  public final c DI(int paramInt)
  {
    GMTrace.i(14501151768576L, 108042);
    c localc = (c)this.vTj.get(paramInt);
    GMTrace.o(14501151768576L, 108042);
    return localc;
  }
  
  public final void QF()
  {
    GMTrace.i(14500883333120L, 108040);
    this.vTj.clear();
    if (this.wZr == null)
    {
      GMTrace.o(14500883333120L, 108040);
      return;
    }
    c localc = new c(this.wZr);
    this.vTj.add(localc);
    notifyDataSetChanged();
    GMTrace.o(14500883333120L, 108040);
  }
  
  protected final void QG()
  {
    GMTrace.i(14500749115392L, 108039);
    QF();
    GMTrace.o(14500749115392L, 108039);
  }
  
  public final int getCount()
  {
    GMTrace.i(14501017550848L, 108041);
    int i = this.vTj.size();
    GMTrace.o(14501017550848L, 108041);
    return i;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(14501285986304L, 108043);
    c localc = (c)this.vTj.get(paramInt);
    View localView;
    if (paramView == null)
    {
      localView = View.inflate(this.context, R.i.coW, null);
      paramView = new d();
      paramView.wZt = localView;
      paramView.wZu = ((Button)localView.findViewById(R.h.bcO));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    while (localc.a(paramViewGroup) != 0)
    {
      GMTrace.o(14501285986304L, 108043);
      return null;
      paramViewGroup = (d)paramView.getTag();
      localView = paramView;
    }
    GMTrace.o(14501285986304L, 108043);
    return localView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */