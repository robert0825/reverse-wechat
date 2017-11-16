package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;

public final class b
  extends a
{
  private final int ljN;
  
  public b(g paramg)
  {
    super(paramg);
    GMTrace.i(6431042437120L, 47915);
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    GMTrace.o(6431042437120L, 47915);
  }
  
  private static String a(au.a parama)
  {
    int j = 1;
    int k = 0;
    GMTrace.i(6431445090304L, 47918);
    String str2 = parama.fsF;
    int i = k;
    String str1 = str2;
    if (bg.nm(str2))
    {
      str2 = parama.rAP;
      if (!com.tencent.mm.storage.x.Ts(str2))
      {
        i = k;
        str1 = str2;
        if (!s.fB(str2)) {}
      }
      else
      {
        i = 1;
        str1 = str2;
      }
    }
    if (i == 0)
    {
      at.AR();
      if (!com.tencent.mm.y.c.yK().TA(str1)) {
        i = j;
      }
    }
    for (;;)
    {
      boolean bool = s.fp(parama.rCC);
      if ((i != 0) || (bool))
      {
        GMTrace.o(6431445090304L, 47918);
        return "";
      }
      GMTrace.o(6431445090304L, 47918);
      return str1;
    }
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6431176654848L, 47916);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cwu, null), paramViewGroup, paramj);
      paramViewGroup.iub = ((ImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqH.setSingleLine(false);
      paramViewGroup.hqH.setMaxLines(2);
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byI));
      paramViewGroup.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      a(paramViewGroup, paramj);
      paramj = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      at.AR();
      paramj = com.tencent.mm.y.c.yM().Cn(paramj.desc);
      if ((paramj.rAP == null) || (paramj.rAP.length() <= 0)) {
        w.e("MicroMsg.FavCardListItem", "parse possible friend msg failed");
      }
      if (!bg.nm(a(paramj))) {
        break label248;
      }
      paramViewGroup.hqI.setVisibility(8);
      label185:
      paramViewGroup.ljO.setText(R.l.dtN);
      paramViewGroup.ljO.setVisibility(0);
      paramViewGroup = paramViewGroup.iub;
      paramj = paramj.rAP;
      if (!bg.nm(paramj)) {
        break label262;
      }
      paramViewGroup.setImageResource(R.g.aVS);
    }
    for (;;)
    {
      GMTrace.o(6431176654848L, 47916);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label248:
      paramViewGroup.hqI.setText(a(paramj));
      break label185;
      label262:
      com.tencent.mm.pluginsdk.ui.a.b.a(paramViewGroup, paramj);
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6431310872576L, 47917);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6431310872576L, 47917);
  }
  
  public static final class a
    extends a.b
  {
    TextView hqH;
    TextView hqI;
    ImageView iub;
    TextView ljO;
    
    public a()
    {
      GMTrace.i(6426344816640L, 47880);
      GMTrace.o(6426344816640L, 47880);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */