package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.th;

public final class q
  extends a
{
  public q(g paramg)
  {
    super(paramg);
    GMTrace.i(6421244542976L, 47842);
    GMTrace.o(6421244542976L, 47842);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6421378760704L, 47843);
    Object localObject = paramViewGroup.getContext();
    int i;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cwv, null), paramViewGroup, paramj);
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.lkq = ((TextView)paramView.findViewById(R.h.byL));
      paramViewGroup.iub = ((ImageView)paramView.findViewById(R.h.byW));
      a(paramViewGroup, paramj);
      paramViewGroup.hqH.setText(((Context)localObject).getString(R.l.cUR));
      i = (int)x.aD(x.n(paramj).duration);
      localObject = paramViewGroup.lkq;
      paramj = this.laj.context;
      if (i > 0) {
        break label194;
      }
    }
    label194:
    for (paramj = paramj.getString(R.l.dvg, new Object[] { Integer.valueOf(0) });; paramj = paramj.getString(R.l.dvg, new Object[] { Integer.valueOf(i) }))
    {
      ((TextView)localObject).setText(paramj);
      paramViewGroup.iub.setImageResource(R.k.cMh);
      GMTrace.o(6421378760704L, 47843);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6421512978432L, 47844);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6421512978432L, 47844);
  }
  
  public static final class a
    extends a.b
  {
    TextView hqH;
    ImageView iub;
    TextView lkq;
    
    public a()
    {
      GMTrace.i(6420036583424L, 47833);
      GMTrace.o(6420036583424L, 47833);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */