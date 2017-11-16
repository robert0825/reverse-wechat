package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends RecyclerView.a<RecyclerView.t>
  implements b.b
{
  int bgColor;
  private Context context;
  private int jsh;
  private int jsi;
  private LinearLayoutManager pGp;
  c pKl;
  LinkedHashMap<String, i> pKm;
  private LayoutInflater pKn;
  
  public a(c paramc, int paramInt, Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    GMTrace.i(17107794264064L, 127463);
    this.pGp = paramLinearLayoutManager;
    this.pKl = paramc;
    this.pKm = new LinkedHashMap();
    this.bgColor = paramInt;
    this.context = paramContext;
    this.pKn = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
    paramc = ab.df(this.context);
    this.jsh = paramc[0];
    this.jsi = paramc[1];
    GMTrace.o(17107794264064L, 127463);
  }
  
  private int a(i parami)
  {
    GMTrace.i(17108465352704L, 127468);
    if (parami != null)
    {
      View localView = parami.getView();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[1];
      int j = localView.getHeight() + i;
      w.v("ContentAdapter", "comp %s , top %d,bottom %d ", new Object[] { parami, Integer.valueOf(i), Integer.valueOf(j) });
      if ((i >= 0) && (j <= this.jsi))
      {
        i = localView.getHeight();
        GMTrace.o(17108465352704L, 127468);
        return i;
      }
      if ((i < 0) && (j > 0) && (j <= this.jsi))
      {
        GMTrace.o(17108465352704L, 127468);
        return j;
      }
      if ((i < 0) && (j > this.jsi))
      {
        i = this.jsi;
        GMTrace.o(17108465352704L, 127468);
        return i;
      }
      if ((i < this.jsi) && (j > this.jsi))
      {
        j = this.jsi;
        GMTrace.o(17108465352704L, 127468);
        return j - i;
      }
    }
    GMTrace.o(17108465352704L, 127468);
    return 0;
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(17107928481792L, 127464);
    paramViewGroup = new a(LayoutInflater.from(paramViewGroup.getContext()).inflate(i.g.peI, paramViewGroup, false));
    GMTrace.o(17107928481792L, 127464);
    return paramViewGroup;
  }
  
  public final void a(int paramInt, b paramb)
  {
    GMTrace.i(17108599570432L, 127469);
    Object localObject1 = (s)this.pKl.pLi.get(paramInt);
    i locali = (i)this.pKm.get(((s)localObject1).pEz);
    if (locali != null)
    {
      locali.bkm();
      Object localObject2 = locali.getView();
      locali.O(a(locali), ((View)localObject2).getHeight(), this.jsi);
      if ((((s)localObject1).type == 61) || (((s)localObject1).type == 62))
      {
        localObject1 = new ArrayList();
        paramb = paramb.pGo.entrySet().iterator();
        while (paramb.hasNext())
        {
          localObject2 = (Map.Entry)paramb.next();
          if (((b.a)((Map.Entry)localObject2).getValue()).pDL) {
            ((List)localObject1).add(((Map.Entry)localObject2).getKey());
          }
        }
        paramb = ((List)localObject1).iterator();
        while (paramb.hasNext())
        {
          int i = ((Integer)paramb.next()).intValue();
          if ((i != paramInt) && (uQ(i)))
          {
            localObject1 = (s)this.pKl.pLi.get(i);
            localObject1 = (i)this.pKm.get(((s)localObject1).pEz);
            if ((localObject1 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a))
            {
              localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1;
              if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).pDJ) && (this.pKl.pLj) && (i == 0)) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)locali).bkk();
              } else if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)locali).pDJ) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).bkk();
              }
            }
          }
        }
      }
    }
    GMTrace.o(17108599570432L, 127469);
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    GMTrace.i(17108062699520L, 127465);
    w.i("ContentAdapter", "display page " + this.pKl.id + ", pos " + paramInt);
    locala = (a)paramt;
    locala.iIY.removeAllViews();
    locals = (s)this.pKl.pLi.get(paramInt);
    paramt = (i)this.pKm.get(locals.pEz);
    int j = this.bgColor;
    i = j;
    if (locals.yvm != null)
    {
      i = j;
      if (locals.yvm.length() > 0) {
        i = j;
      }
    }
    try
    {
      j = Color.parseColor(locals.yvm);
      i = j;
      locala.iIY.setBackgroundColor(j);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("ContentAdapter", "parse cellBackgroundColor error: %s", new Object[] { locals.yvm });
        continue;
        i locali = am.a(locala.iIY.getContext(), locals, locala.iIY, i);
        paramt = locali;
        if (locali != null)
        {
          this.pKm.put(locals.pEz, locali);
          paramt = locali;
        }
      }
    }
    if (paramt != null)
    {
      paramt.a((s)this.pKl.pLi.get(paramInt));
      if (paramt != null)
      {
        if ((paramt.getView().getParent() != null) && ((paramt.getView().getParent() instanceof ViewGroup))) {
          ((ViewGroup)paramt.getView().getParent()).removeView(paramt.getView());
        }
        locala.iIY.addView(paramt.getView());
      }
      GMTrace.o(17108062699520L, 127465);
      return;
    }
  }
  
  public final int getItemCount()
  {
    GMTrace.i(17108196917248L, 127466);
    int i = this.pKl.pLi.size();
    GMTrace.o(17108196917248L, 127466);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(17836193873920L, 132890);
    GMTrace.o(17836193873920L, 132890);
    return paramInt;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17108868005888L, 127471);
    Iterator localIterator = this.pKm.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((i)((Map.Entry)localIterator.next()).getValue()).bkl();
    }
    GMTrace.o(17108868005888L, 127471);
  }
  
  public final void uP(int paramInt)
  {
    GMTrace.i(17108733788160L, 127470);
    Object localObject = (s)this.pKl.pLi.get(paramInt);
    localObject = (i)this.pKm.get(((s)localObject).pEz);
    if (localObject != null) {
      ((i)localObject).bkn();
    }
    GMTrace.o(17108733788160L, 127470);
  }
  
  public final boolean uQ(int paramInt)
  {
    GMTrace.i(17108331134976L, 127467);
    if ((paramInt < this.pGp.eZ()) || (paramInt > this.pGp.fa()))
    {
      w.v("ContentAdapter", "index %d not visible");
      GMTrace.o(17108331134976L, 127467);
      return false;
    }
    Object localObject = (s)this.pKl.pLi.get(paramInt);
    localObject = (i)this.pKm.get(((s)localObject).pEz);
    if (localObject != null)
    {
      paramInt = a((i)localObject);
      w.v("ContentAdapter", "comp %s, inScreenH %d", new Object[] { localObject, Integer.valueOf(paramInt) });
      if (paramInt >= ((i)localObject).getView().getHeight() >>> 1)
      {
        GMTrace.o(17108331134976L, 127467);
        return true;
      }
      GMTrace.o(17108331134976L, 127467);
      return false;
    }
    GMTrace.o(17108331134976L, 127467);
    return false;
  }
  
  public final class a
    extends RecyclerView.t
  {
    public LinearLayout iIY;
    
    public a(View paramView)
    {
      super();
      GMTrace.i(17107660046336L, 127462);
      this.iIY = ((LinearLayout)paramView.findViewById(i.f.bZf));
      GMTrace.o(17107660046336L, 127462);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\verticalviewpager\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */