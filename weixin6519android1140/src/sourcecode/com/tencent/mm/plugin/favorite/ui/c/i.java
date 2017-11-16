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
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMImageView;

public final class i
  extends a
{
  private final int ljN;
  private final String ljX;
  
  public i(g paramg)
  {
    super(paramg);
    GMTrace.i(6428358082560L, 47895);
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    this.ljX = paramg.context.getString(R.l.dup);
    GMTrace.o(6428358082560L, 47895);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6428492300288L, 47896);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cwu, null), paramViewGroup, paramj);
      paramViewGroup.lhJ = ((MMImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byI));
      paramViewGroup.hqI.setVisibility(8);
      paramViewGroup.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      paramViewGroup.ljO.setVisibility(0);
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      ts localts = paramj.field_favProto.ukL;
      paramViewGroup.hqH.setText(bg.nl(localts.title));
      paramViewGroup.ljO.setText(bg.aq(c.getAppName(localContext, paramj.field_favProto.ulz.appId), this.ljX));
      this.laj.a(paramViewGroup.lhJ, null, paramj, R.k.cJl, this.ljN, this.ljN);
      GMTrace.o(6428492300288L, 47896);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6428626518016L, 47897);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6428626518016L, 47897);
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
      GMTrace.i(6421781413888L, 47846);
      GMTrace.o(6421781413888L, 47846);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */