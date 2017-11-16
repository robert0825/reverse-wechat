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
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.LinkedList;

public final class k
  extends a
{
  final int ljP;
  final int ljQ;
  private HashSet<Long> lkm;
  
  public k(g paramg)
  {
    super(paramg);
    GMTrace.i(6422184067072L, 47849);
    this.ljQ = com.tencent.mm.br.a.fromDPToPix(paramg.context, 138);
    this.ljP = com.tencent.mm.br.a.fromDPToPix(paramg.context, 230);
    this.lkm = new HashSet();
    GMTrace.o(6422184067072L, 47849);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, final j paramj)
  {
    GMTrace.i(6422318284800L, 47850);
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
        break label253;
      }
      int i = ((th)localLinkedList.getFirst()).duration;
      paramViewGroup.lkp.setText(u.t((Context)localObject, i));
      if ((paramj != null) && (i <= 1)) {
        break label202;
      }
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = x.n(paramj);
      this.laj.a(paramViewGroup.lko, (th)localObject, paramj, R.k.cMk, this.ljP, this.ljQ);
      GMTrace.o(6422318284800L, 47850);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label202:
      if (!this.lkm.contains(Long.valueOf(paramj.field_localId)))
      {
        this.lkm.add(Long.valueOf(paramj.field_localId));
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6419231277056L, 47827);
            x.t(paramj);
            GMTrace.o(6419231277056L, 47827);
          }
        });
        continue;
        label253:
        paramViewGroup.lkp.setText("");
      }
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6422452502528L, 47851);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6422452502528L, 47851);
  }
  
  public static final class a
    extends a.b
  {
    MMImageView lko;
    TextView lkp;
    
    public a()
    {
      GMTrace.i(6418962841600L, 47825);
      GMTrace.o(6418962841600L, 47825);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */