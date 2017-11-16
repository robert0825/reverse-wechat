package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends a
{
  public c(g paramg)
  {
    super(paramg);
    GMTrace.i(6430505566208L, 47911);
    GMTrace.o(6430505566208L, 47911);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6430639783936L, 47912);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cwv, null), paramViewGroup, paramj);
      paramViewGroup.iub = ((ImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byL));
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      th localth = x.n(paramj);
      localObject = paramj.field_favProto.ulz;
      localObject = paramj.field_favProto.title;
      paramj = (j)localObject;
      if (bg.nm((String)localObject)) {
        paramj = localth.title;
      }
      paramViewGroup.hqH.setText(paramj);
      paramViewGroup.hqI.setText(x.ab((float)localth.ujO));
      if (localth.ukB == 2) {
        paramViewGroup.hqI.setText(">25MB");
      }
      paramViewGroup.iub.setImageResource(com.tencent.mm.pluginsdk.model.c.Oh(localth.ujI));
      GMTrace.o(6430639783936L, 47912);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6430774001664L, 47913);
    j localj = ((a)paramView.getTag()).lcn;
    e.b(paramView.getContext(), localj);
    GMTrace.o(6430774001664L, 47913);
  }
  
  public static final class a
    extends a.b
  {
    TextView hqH;
    TextView hqI;
    ImageView iub;
    
    public a()
    {
      GMTrace.i(6421647196160L, 47845);
      GMTrace.o(6421647196160L, 47845);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */