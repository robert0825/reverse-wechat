package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class c
  extends LinearLayout
{
  private View lgF;
  public View lgG;
  public View lgH;
  public a lgI;
  private boolean lgJ;
  private boolean lgK;
  private int lgL;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6454530539520L, 48090);
    this.lgJ = false;
    this.lgK = false;
    setOrientation(1);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    this.lgF = View.inflate(getContext(), R.i.cwD, null);
    View localView = View.inflate(getContext(), R.i.cwr, null);
    localView.findViewById(R.h.bSo).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6445269516288L, 48021);
        if ((c.a(c.this) == 1) || (c.a(c.this) == 3))
        {
          w.i("MicroMsg.FavHeaderView", "click clear fav item");
          if (c.b(c.this) != null) {
            c.b(c.this).ayK();
          }
        }
        GMTrace.o(6445269516288L, 48021);
      }
    });
    this.lgG = localView;
    localView = View.inflate(getContext(), R.i.cwC, null);
    localView.findViewById(R.h.bzC).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6446074822656L, 48027);
        w.i("MicroMsg.FavHeaderView", "click retry item");
        paramAnonymousView = h.axB().axP();
        if ((paramAnonymousView == null) || (paramAnonymousView.isEmpty()))
        {
          GMTrace.o(6446074822656L, 48027);
          return;
        }
        paramAnonymousView = paramAnonymousView.iterator();
        while (paramAnonymousView.hasNext())
        {
          j localj = (j)paramAnonymousView.next();
          if (!localj.axK()) {
            w.w("MicroMsg.FavHeaderView", "item id is %d, status is not upload fail", new Object[] { Integer.valueOf(localj.field_id) });
          } else {
            x.l(localj);
          }
        }
        c.c(c.this).setVisibility(8);
        c.d(c.this).setVisibility(8);
        GMTrace.o(6446074822656L, 48027);
      }
    });
    this.lgH = localView;
    addView(this.lgF, new LinearLayout.LayoutParams(paramContext));
    addView(this.lgG, new LinearLayout.LayoutParams(paramContext));
    addView(this.lgH, new LinearLayout.LayoutParams(paramContext));
    GMTrace.o(6454530539520L, 48090);
  }
  
  private void nF(int paramInt)
  {
    GMTrace.i(6454798974976L, 48092);
    this.lgL = paramInt;
    w.i("MicroMsg.FavHeaderView", "showStatusBar status:" + paramInt);
    if (paramInt == 0)
    {
      this.lgH.setVisibility(8);
      this.lgG.setVisibility(8);
      GMTrace.o(6454798974976L, 48092);
      return;
    }
    if (paramInt == 1)
    {
      if (!this.lgJ) {
        g.ork.i(14109, new Object[] { Integer.valueOf(1) });
      }
      this.lgJ = true;
      this.lgH.setVisibility(8);
      this.lgG.setVisibility(0);
      this.lgG.findViewById(R.h.bSp).setVisibility(0);
      this.lgG.findViewById(R.h.bSq).setVisibility(8);
      GMTrace.o(6454798974976L, 48092);
      return;
    }
    if (paramInt == 2)
    {
      this.lgH.setVisibility(0);
      this.lgG.setVisibility(8);
      GMTrace.o(6454798974976L, 48092);
      return;
    }
    if (paramInt == 3)
    {
      if (!this.lgK) {
        g.ork.i(14109, new Object[] { Integer.valueOf(0) });
      }
      this.lgK = true;
      this.lgH.setVisibility(8);
      this.lgG.setVisibility(0);
      this.lgG.findViewById(R.h.bSp).setVisibility(8);
      this.lgG.findViewById(R.h.bSq).setVisibility(0);
    }
    GMTrace.o(6454798974976L, 48092);
  }
  
  public final void ayW()
  {
    GMTrace.i(6454933192704L, 48093);
    List localList = h.axB().axP();
    long l;
    int i;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      l = 0L;
      for (i = 0; localIterator.hasNext(); i = 1)
      {
        j localj = (j)localIterator.next();
        h.axB();
        l = k.e(localj) + l;
      }
      w.i("MicroMsg.FavHeaderView", "triggerStatusBar uploadFailedItemList size:%d,totalSize:%d", new Object[] { Integer.valueOf(localList.size()), Long.valueOf(l) });
    }
    for (;;)
    {
      if (i != 0)
      {
        if (l > x.aye())
        {
          nF(1);
          GMTrace.o(6454933192704L, 48093);
          return;
        }
        nF(2);
        GMTrace.o(6454933192704L, 48093);
        return;
      }
      if (x.ayi())
      {
        nF(3);
        GMTrace.o(6454933192704L, 48093);
        return;
      }
      nF(0);
      GMTrace.o(6454933192704L, 48093);
      return;
      l = 0L;
      i = 0;
    }
  }
  
  public final void ey(boolean paramBoolean)
  {
    GMTrace.i(6454664757248L, 48091);
    View localView = this.lgF;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      GMTrace.o(6454664757248L, 48091);
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void ayK();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */