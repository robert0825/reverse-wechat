package com.tencent.mm.plugin.favorite.ui.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;

public final class o
  extends a
{
  private final int ljN;
  
  public o(g paramg)
  {
    super(paramg);
    GMTrace.i(6420841889792L, 47839);
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    GMTrace.o(6420841889792L, 47839);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6420976107520L, 47840);
    paramViewGroup = paramViewGroup.getContext();
    a locala;
    View localView;
    th localth1;
    Object localObject;
    tw localtw;
    TextView localTextView;
    if (paramView == null)
    {
      locala = new a();
      localView = a(View.inflate(paramViewGroup, R.i.cwu, null), locala, paramj);
      locala.iub = ((ImageView)localView.findViewById(R.h.byW));
      locala.hqH = ((TextView)localView.findViewById(R.h.bzw));
      locala.hqH.setSingleLine(false);
      locala.hqH.setMaxLines(2);
      locala.hqI = ((TextView)localView.findViewById(R.h.byI));
      locala.ljO = ((TextView)localView.findViewById(R.h.bzn));
      a(locala, paramj);
      localth1 = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      localObject = paramj.field_favProto.ukJ;
      localtw = paramj.field_favProto.ulz;
      localTextView = locala.hqH;
      th localth2 = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      paramView = "";
      if (localObject != null) {
        paramView = ((uf)localObject).title;
      }
      paramViewGroup = paramView;
      if (bg.nm(paramView))
      {
        paramViewGroup = paramView;
        if (localth2 != null) {
          paramViewGroup = localth2.title;
        }
      }
      if (!bg.nm(paramViewGroup)) {
        break label486;
      }
      localTextView.setVisibility(8);
      label219:
      paramView = locala.hqI;
      paramViewGroup = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      paramView.setVisibility(8);
      if ((paramViewGroup != null) && (!bg.nm(paramViewGroup.canvasPageXml)))
      {
        paramView.setVisibility(0);
        paramViewGroup = paramViewGroup.desc;
        if (!bg.nm(paramViewGroup)) {
          break label501;
        }
        paramView.setVisibility(8);
      }
      label273:
      localTextView = locala.ljO;
      localth2 = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      paramView = "";
      if (localObject != null) {
        paramView = bg.Sv(((uf)localObject).umf);
      }
      localObject = paramView;
      if (localtw != null)
      {
        if (bg.nm(localtw.appId)) {
          break label514;
        }
        paramViewGroup = bg.aq(com.tencent.mm.plugin.favorite.c.getAppName(localTextView.getContext(), localtw.appId), "");
        label341:
        if (!bg.nm(paramViewGroup))
        {
          localObject = paramViewGroup;
          if (!paramViewGroup.equals(localtw.eAr)) {}
        }
        else
        {
          localObject = bg.Sv(localtw.gVf);
        }
      }
      if ((!bg.nm((String)localObject)) && ((localth2 == null) || (bg.nm(localth2.canvasPageXml)))) {
        break label593;
      }
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      int j = com.tencent.mm.pluginsdk.c.NV(localth1.ujI);
      paramView = this.laj;
      paramViewGroup = locala.iub;
      int i = j;
      if (j == com.tencent.mm.pluginsdk.c.bIP()) {
        i = R.k.cJr;
      }
      paramView.a(paramViewGroup, localth1, paramj, i, this.ljN, this.ljN);
      GMTrace.o(6420976107520L, 47840);
      return localView;
      locala = (a)paramView.getTag();
      localView = paramView;
      break;
      label486:
      localTextView.setText(paramViewGroup);
      localTextView.setVisibility(0);
      break label219;
      label501:
      paramView.setText(paramViewGroup);
      paramView.setVisibility(0);
      break label273;
      label514:
      paramViewGroup = paramView;
      if (bg.nm(localtw.eAr)) {
        break label341;
      }
      at.AR();
      paramViewGroup = com.tencent.mm.y.c.yK().TE(localtw.eAr);
      if ((paramViewGroup == null) || (!paramViewGroup.field_username.equals(localtw.eAr)))
      {
        ak.a.gmX.a(localtw.eAr, "", null);
        paramViewGroup = paramView;
        break label341;
      }
      paramViewGroup = paramViewGroup.vk();
      break label341;
      label593:
      localTextView.setText((CharSequence)localObject);
      localTextView.setVisibility(0);
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6421110325248L, 47841);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6421110325248L, 47841);
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
      GMTrace.i(6427150123008L, 47886);
      GMTrace.o(6427150123008L, 47886);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */