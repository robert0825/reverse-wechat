package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMImageView;

public final class l
  extends a
{
  private final int ljN;
  private final String ljX;
  
  public l(g paramg)
  {
    super(paramg);
    GMTrace.i(6431713525760L, 47920);
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    this.ljX = "";
    GMTrace.o(6431713525760L, 47920);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6431847743488L, 47921);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cwu, null), paramViewGroup, paramj);
      paramViewGroup.lhJ = ((MMImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byI));
      paramViewGroup.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      paramViewGroup.ljO.setVisibility(0);
      a(paramViewGroup, paramj);
      tz localtz = paramj.field_favProto.ukN;
      if (localtz == null) {
        break label230;
      }
      paramViewGroup.hqH.setText(bg.nl(localtz.title));
      paramViewGroup.hqI.setText(bg.nl(localtz.desc));
    }
    for (;;)
    {
      paramViewGroup.ljO.setText(bg.aq(c.getAppName(localContext, paramj.field_favProto.ulz.appId), this.ljX));
      this.laj.a(paramViewGroup.lhJ, null, paramj, R.k.cJl, this.ljN, this.ljN);
      GMTrace.o(6431847743488L, 47921);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label230:
      paramViewGroup.hqH.setText("");
      paramViewGroup.hqI.setText("");
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6431981961216L, 47922);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6431981961216L, 47922);
  }
  
  public static final class a
    extends a.b
  {
    TextView hqH;
    TextView hqI;
    MMImageView lhJ;
    TextView ljO;
    
    public a()
    {
      GMTrace.i(6430102913024L, 47908);
      GMTrace.o(6430102913024L, 47908);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */