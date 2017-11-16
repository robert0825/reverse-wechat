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
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;

public final class f
  extends a
{
  public f(g paramg)
  {
    super(paramg);
    GMTrace.i(6433458356224L, 47933);
    GMTrace.o(6433458356224L, 47933);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6433592573952L, 47934);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cwv, null), paramViewGroup, paramj);
      paramViewGroup.iub = ((ImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byL));
      a(paramViewGroup, paramj);
      paramViewGroup.iub.setImageResource(R.k.cMd);
      localObject = paramj.field_favProto.ukH;
      paramj = paramj.field_favProto.hLO;
      if (!bg.nm(paramj)) {
        break label205;
      }
      if (!bg.nm(((to)localObject).eQm)) {
        break label178;
      }
      paramViewGroup.hqH.setText(((to)localObject).label);
      paramViewGroup.hqI.setText(R.l.dtY);
    }
    for (;;)
    {
      GMTrace.o(6433592573952L, 47934);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label178:
      paramViewGroup.hqH.setText(((to)localObject).eQm);
      paramViewGroup.hqI.setText(((to)localObject).label);
      continue;
      label205:
      paramViewGroup.hqH.setText(h.b(paramViewGroup.hqH.getContext(), paramj, paramViewGroup.hqH.getTextSize()));
      if (bg.nm(((to)localObject).eQm)) {
        paramViewGroup.hqI.setText(((to)localObject).label);
      } else {
        paramViewGroup.hqI.setText(((to)localObject).eQm);
      }
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6433726791680L, 47935);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6433726791680L, 47935);
  }
  
  public static final class a
    extends a.b
  {
    TextView hqH;
    TextView hqI;
    ImageView iub;
    
    public a()
    {
      GMTrace.i(6431579308032L, 47919);
      GMTrace.o(6431579308032L, 47919);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */