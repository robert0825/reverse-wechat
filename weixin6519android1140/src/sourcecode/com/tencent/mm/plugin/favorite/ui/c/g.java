package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMImageView;

public final class g
  extends a
{
  private final int ljN;
  private final String ljX;
  
  public g(com.tencent.mm.plugin.favorite.c.g paramg)
  {
    super(paramg);
    GMTrace.i(6433055703040L, 47930);
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    this.ljX = paramg.context.getString(R.l.dua);
    GMTrace.o(6433055703040L, 47930);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6433189920768L, 47931);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cwu, null), paramViewGroup, paramj);
      paramViewGroup.lhJ = ((MMImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byI));
      paramViewGroup.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      paramViewGroup.ljO.setVisibility(8);
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = paramj.field_favProto.ukL;
      paramViewGroup.hqH.setText(bg.nl(((ts)localObject).title));
      paramViewGroup.hqI.setText(bg.nl(((ts)localObject).desc));
      paramViewGroup.hqH.setSingleLine(false);
      paramViewGroup.hqH.setMaxLines(2);
      this.laj.a(paramViewGroup.lhJ, null, paramj, R.k.cJl, this.ljN, this.ljN);
      GMTrace.o(6433189920768L, 47931);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6433324138496L, 47932);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6433324138496L, 47932);
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
      GMTrace.i(6434934751232L, 47944);
      GMTrace.o(6434934751232L, 47944);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */