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
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.th;

public final class d
  extends a
{
  private static int ljP;
  private static int ljQ;
  
  public d(g paramg)
  {
    super(paramg);
    GMTrace.i(6428760735744L, 47898);
    ljQ = com.tencent.mm.br.a.fromDPToPix(paramg.context, 138);
    ljP = com.tencent.mm.br.a.fromDPToPix(paramg.context, 230);
    GMTrace.o(6428760735744L, 47898);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6428894953472L, 47899);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cww, null), paramViewGroup, paramj);
      paramViewGroup.ljR = ((ImageView)paramView.findViewById(R.h.bzb));
      paramViewGroup.ljS = ((TextView)paramView.findViewById(R.h.bzi));
      paramViewGroup.ljS.setVisibility(8);
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = x.n(paramj);
      g.a(paramViewGroup.ljR, R.k.cMo, (th)localObject, paramj, false, ljP, ljQ);
      GMTrace.o(6428894953472L, 47899);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6429029171200L, 47900);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6429029171200L, 47900);
  }
  
  public static final class a
    extends a.b
  {
    ImageView ljR;
    TextView ljS;
    
    public a()
    {
      GMTrace.i(6422855155712L, 47854);
      GMTrace.o(6422855155712L, 47854);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */