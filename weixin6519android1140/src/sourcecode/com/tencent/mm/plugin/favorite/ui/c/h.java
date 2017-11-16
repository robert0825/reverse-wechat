package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.at.b;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.u;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class h
  extends a
{
  private final int ljN;
  private Set<ImageView> ljY;
  private View.OnClickListener ljZ;
  
  public h(com.tencent.mm.plugin.favorite.c.g paramg)
  {
    super(paramg);
    GMTrace.i(6429566042112L, 47904);
    this.ljZ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6418694406144L, 47823);
        if (!f.ty())
        {
          u.fo(h.this.laj.context);
          GMTrace.o(6418694406144L, 47823);
          return;
        }
        Object localObject;
        tw localtw;
        th localth;
        if ((paramAnonymousView.getTag() instanceof j))
        {
          localObject = (j)paramAnonymousView.getTag();
          localtw = ((j)localObject).field_favProto.ulz;
          localth = x.n((j)localObject);
          if (localth == null)
          {
            w.w("MicroMsg.FavBaseListItem", "data item is null");
            GMTrace.o(6418694406144L, 47823);
            return;
          }
          if (e.k(localth))
          {
            w.i("MicroMsg.FavBaseListItem", "same song, do release");
            b.JO();
            h.this.c(null);
            GMTrace.o(6418694406144L, 47823);
            return;
          }
          localObject = new File(x.h(localth));
          if (((File)localObject).exists()) {
            break label293;
          }
          if (localth.eDk != null) {
            break label234;
          }
          localObject = "";
        }
        for (;;)
        {
          b.b(((com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class)).a(6, null, localth.title, localth.desc, localth.ujA, localth.ujE, localth.ujC, localth.lhq, x.aya(), (String)localObject, "", localtw.appId));
          h.this.c((ImageView)paramAnonymousView);
          GMTrace.o(6418694406144L, 47823);
          return;
          label234:
          localObject = new File(x.axY() + com.tencent.mm.a.g.n(localth.eDk.getBytes()));
          if (((File)localObject).exists()) {}
          for (localObject = ((File)localObject).getAbsolutePath();; localObject = "") {
            break;
          }
          label293:
          localObject = ((File)localObject).getAbsolutePath();
        }
      }
    };
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    this.ljY = new HashSet();
    GMTrace.o(6429566042112L, 47904);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6429700259840L, 47905);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cwu, null), paramViewGroup, paramj);
      paramViewGroup.lhJ = ((MMImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      paramViewGroup.hqI = ((TextView)paramView.findViewById(R.h.byI));
      paramViewGroup.lkb = ((ImageView)paramView.findViewById(R.h.byY));
      paramViewGroup.ljO = ((TextView)paramView.findViewById(R.h.bzn));
      paramViewGroup.ljO.setVisibility(8);
      paramViewGroup.lkb.setOnClickListener(this.ljZ);
      paramViewGroup.lkb.setVisibility(0);
      this.ljY.add(paramViewGroup.lkb);
      a(paramViewGroup, paramj);
      localObject = paramj.field_favProto.ulz;
      localObject = x.n(paramj);
      paramViewGroup.hqH.setText(((th)localObject).title);
      paramViewGroup.hqI.setText(((th)localObject).desc);
      this.laj.a(paramViewGroup.lhJ, (th)localObject, paramj, R.k.cMe, this.ljN, this.ljN);
      paramViewGroup.lkb.setTag(paramj);
      if (!e.k((th)localObject)) {
        break label271;
      }
      paramViewGroup.lkb.setImageResource(R.g.aYe);
    }
    for (;;)
    {
      GMTrace.o(6429700259840L, 47905);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label271:
      paramViewGroup.lkb.setImageResource(R.g.aYf);
    }
  }
  
  public final void c(ImageView paramImageView)
  {
    GMTrace.i(16031904956416L, 119447);
    w.i("MicroMsg.FavBaseListItem", "mask iv set size is %d", new Object[] { Integer.valueOf(this.ljY.size()) });
    Iterator localIterator = this.ljY.iterator();
    while (localIterator.hasNext())
    {
      ImageView localImageView = (ImageView)localIterator.next();
      if (localImageView == paramImageView) {
        localImageView.setImageResource(R.g.aYe);
      } else {
        localImageView.setImageResource(R.g.aYf);
      }
    }
    GMTrace.o(16031904956416L, 119447);
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6429834477568L, 47906);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6429834477568L, 47906);
  }
  
  public static final class a
    extends a.b
  {
    TextView hqH;
    TextView hqI;
    MMImageView lhJ;
    TextView ljO;
    ImageView lkb;
    
    public a()
    {
      GMTrace.i(6432518832128L, 47926);
      GMTrace.o(6432518832128L, 47926);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */