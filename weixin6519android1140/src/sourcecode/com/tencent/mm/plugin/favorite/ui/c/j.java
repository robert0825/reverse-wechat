package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.plugin.favorite.c.g.2;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class j
  extends a
{
  private final int ljN;
  private final String lkc;
  private final SparseIntArray lkd;
  private HashMap<String, SpannableString> lke;
  
  public j(g paramg)
  {
    super(paramg);
    GMTrace.i(6420170801152L, 47834);
    this.lkd = new SparseIntArray();
    this.lke = new HashMap();
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    this.lkc = " ";
    GMTrace.o(6420170801152L, 47834);
  }
  
  private static void a(TextView paramTextView1, TextView paramTextView2, th paramth)
  {
    GMTrace.i(6420439236608L, 47836);
    if (!paramth.ukq)
    {
      w.d("MicroMsg.FavRecordListItem", "has no datasrcname");
      paramTextView1.setVisibility(8);
      w.d("MicroMsg.FavRecordListItem", "field type %d", new Object[] { Integer.valueOf(paramth.aGU) });
      switch (paramth.aGU)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView1.setVisibility(0);
      paramTextView1.setText(h.b(paramTextView1.getContext(), paramth.ukp, paramTextView1.getTextSize()));
      break;
      paramTextView2.setText(h.b(paramTextView2.getContext(), paramth.desc, paramTextView2.getTextSize()));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duV));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duT) + paramth.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duR) + paramth.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView1 = paramth.ukn.ukH;
      paramth = new StringBuilder().append(y(paramTextView2.getContext(), R.l.duQ));
      if (bg.nm(paramTextView1.eQm)) {}
      for (paramTextView1 = paramTextView1.label;; paramTextView1 = paramTextView1.eQm)
      {
        paramTextView2.setText(paramTextView1);
        GMTrace.o(6420439236608L, 47836);
        return;
      }
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duO) + paramth.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duM));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duU));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duP));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dua) + paramth.ukn.ukL.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dtN));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.duS));
    }
  }
  
  private static String y(Context paramContext, int paramInt)
  {
    GMTrace.i(6420573454336L, 47837);
    paramContext = "[" + paramContext.getResources().getString(paramInt) + "]";
    GMTrace.o(6420573454336L, 47837);
    return paramContext;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.favorite.b.j paramj)
  {
    GMTrace.i(6420305018880L, 47835);
    Object localObject1 = paramViewGroup.getContext();
    int k;
    int m;
    int i;
    boolean bool;
    int j;
    if (paramView == null)
    {
      paramViewGroup = new a();
      localObject1 = a(View.inflate((Context)localObject1, R.i.cwx, null), paramViewGroup, paramj);
      paramViewGroup.iub = ((ImageView)((View)localObject1).findViewById(R.h.byW));
      paramViewGroup.lkh = ((TextView)((View)localObject1).findViewById(R.h.bzx));
      paramViewGroup.lki = ((TextView)((View)localObject1).findViewById(R.h.byJ));
      paramViewGroup.lkj = ((TextView)((View)localObject1).findViewById(R.h.bzy));
      paramViewGroup.lkk = ((TextView)((View)localObject1).findViewById(R.h.byK));
      paramViewGroup.lkf = ((ImageView)((View)localObject1).findViewById(R.h.bza));
      paramViewGroup.lkg = ((ImageView)((View)localObject1).findViewById(R.h.byZ));
      paramViewGroup.lkl = ((FrameLayout)((View)localObject1).findViewById(R.h.byX));
      a(paramViewGroup, paramj);
      paramView = paramj.field_favProto.ulB;
      localObject2 = paramView.iterator();
      k = 0;
      m = 0;
      i = 0;
      bool = false;
      j = 0;
      label200:
      if (!((Iterator)localObject2).hasNext()) {
        break label357;
      }
      switch (((th)((Iterator)localObject2).next()).aGU)
      {
      }
    }
    for (;;)
    {
      i += 1;
      break label200;
      paramViewGroup = (a)paramView.getTag();
      localObject1 = paramView;
      break;
      if (!bool)
      {
        m = i;
        bool = true;
        continue;
        if (j == 0)
        {
          j = 1;
          k = i;
        }
      }
    }
    label357:
    w.d("MicroMsg.FavRecordListItem", "hasThumb %s, firstRemarkIndex %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(k) });
    if (paramView.size() <= 0)
    {
      w.w("MicroMsg.FavRecordListItem", "dataList size is null");
      GMTrace.o(6420305018880L, 47835);
      return (View)localObject1;
    }
    Object localObject2 = (th)paramView.get(k);
    a(paramViewGroup.lkh, paramViewGroup.lki, (th)localObject2);
    th localth;
    label538:
    g localg;
    if (bool)
    {
      paramViewGroup.lkl.setVisibility(0);
      paramViewGroup.iub.setVisibility(0);
      localObject2 = paramViewGroup.iub;
      localth = (th)paramView.get(m);
      switch (localth.aGU)
      {
      default: 
      case 2: 
        String str;
        do
        {
          do
          {
            for (;;)
            {
              paramViewGroup.lkj.setVisibility(8);
              paramViewGroup.lkk.setVisibility(8);
              GMTrace.o(6420305018880L, 47835);
              return (View)localObject1;
              localg = this.laj;
              i = R.k.cOy;
              j = this.ljN;
              k = this.ljN;
              if (localObject2 != null)
              {
                if (f.ty()) {
                  break;
                }
                ((ImageView)localObject2).setImageResource(R.g.aYv);
              }
            }
          } while ((localth == null) || (paramj == null));
          str = localth.lhq;
        } while (str == null);
        paramView = null;
        if (localth.lhq != null)
        {
          paramView = (String[])localg.lde.get(str);
          if (paramView != null) {
            break label883;
          }
          paramView = new String[2];
          paramView[0] = x.g(localth);
          paramView[1] = x.h(localth);
          localg.lde.put(str, paramView);
        }
        break;
      }
    }
    label883:
    for (;;)
    {
      localg.ldd.a((ImageView)localObject2, paramView, null, i, j, k);
      if ((paramView == null) || (paramView.length <= 0)) {
        break;
      }
      paramView = paramView[0];
      at.xB().A(new g.2(localg, paramView, paramj, localth));
      break;
      this.laj.b((ImageView)localObject2, localth, paramj, R.k.cMk, this.ljN, this.ljN);
      break;
      paramViewGroup.lkl.setVisibility(8);
      paramViewGroup.iub.setVisibility(8);
      if (k + 1 < paramView.size())
      {
        paramViewGroup.lkj.setVisibility(0);
        paramViewGroup.lkk.setVisibility(0);
        a(paramViewGroup.lkj, paramViewGroup.lkk, (th)paramView.get(k + 1));
        break label538;
      }
      w.d("MicroMsg.FavRecordListItem", "outofbound %d, size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramView.size()) });
      paramViewGroup.lkj.setVisibility(8);
      paramViewGroup.lkk.setVisibility(8);
      break label538;
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6420707672064L, 47838);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6420707672064L, 47838);
  }
  
  public static final class a
    extends a.b
  {
    ImageView iub;
    ImageView lkf;
    ImageView lkg;
    TextView lkh;
    TextView lki;
    TextView lkj;
    TextView lkk;
    FrameLayout lkl;
    
    public a()
    {
      GMTrace.i(6418828623872L, 47824);
      GMTrace.o(6418828623872L, 47824);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */