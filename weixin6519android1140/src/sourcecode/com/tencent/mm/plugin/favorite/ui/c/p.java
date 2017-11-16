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
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.ui.MMImageView;
import java.util.LinkedList;

public final class p
  extends a
{
  final int ljP;
  final int ljQ;
  
  public p(g paramg)
  {
    super(paramg);
    GMTrace.i(6434397880320L, 47940);
    this.ljQ = com.tencent.mm.br.a.fromDPToPix(paramg.context, 138);
    this.ljP = com.tencent.mm.br.a.fromDPToPix(paramg.context, 230);
    GMTrace.o(6434397880320L, 47940);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6434532098048L, 47941);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cwy, null), paramViewGroup, paramj);
      paramViewGroup.lko = ((MMImageView)paramView.findViewById(R.h.bzb));
      paramViewGroup.lkp = ((TextView)paramView.findViewById(R.h.bzB));
      paramView.findViewById(R.h.bzm).setVisibility(8);
      paramViewGroup.lkp.setVisibility(0);
      LinkedList localLinkedList = paramj.field_favProto.ulB;
      if (localLinkedList.size() <= 0) {
        break label188;
      }
      paramViewGroup.lkp.setText(u.t((Context)localObject, ((th)localLinkedList.getFirst()).duration));
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = x.n(paramj);
      this.laj.a(paramViewGroup.lko, (th)localObject, paramj, R.k.cMk, this.ljP, this.ljQ);
      GMTrace.o(6434532098048L, 47941);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label188:
      paramViewGroup.lkp.setText("");
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6434666315776L, 47942);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6434666315776L, 47942);
  }
  
  public static final class a
    extends a.b
  {
    MMImageView lko;
    TextView lkp;
    
    public a()
    {
      GMTrace.i(6430908219392L, 47914);
      GMTrace.o(6430908219392L, 47914);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */