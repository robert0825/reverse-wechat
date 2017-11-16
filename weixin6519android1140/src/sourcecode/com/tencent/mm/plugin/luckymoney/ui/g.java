package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.luckymoney.b.ag;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.applet.l;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;

public final class g
{
  public static void a(Context paramContext, ViewGroup paramViewGroup, ag paramag, c paramc)
  {
    GMTrace.i(9797491490816L, 72997);
    if (paramag == null)
    {
      GMTrace.o(9797491490816L, 72997);
      return;
    }
    a(paramContext, paramViewGroup, paramag, paramc, paramag.type);
    GMTrace.o(9797491490816L, 72997);
  }
  
  public static void a(Context paramContext, ViewGroup paramViewGroup, ag paramag, c paramc, String paramString)
  {
    GMTrace.i(9797625708544L, 72998);
    if ((paramViewGroup == null) || (paramag == null))
    {
      GMTrace.o(9797625708544L, 72998);
      return;
    }
    if (paramag.fPf == 0)
    {
      w.i("MicroMsg.LuckyMoneyOperationViewMgr", "operInfo enable:" + paramag.fPf);
      paramViewGroup.setVisibility(8);
      GMTrace.o(9797625708544L, 72998);
      return;
    }
    if (!paramag.type.equalsIgnoreCase(paramString))
    {
      w.i("MicroMsg.LuckyMoneyOperationViewMgr", "not match type:" + paramag.type + ", " + paramString);
      paramViewGroup.setVisibility(8);
      GMTrace.o(9797625708544L, 72998);
      return;
    }
    if ((paramString.equalsIgnoreCase("Text")) || (paramString.equalsIgnoreCase("Native")))
    {
      paramString = new e();
      paramString.mPO = paramc;
      paramString.a(paramContext, paramViewGroup, paramag);
      GMTrace.o(9797625708544L, 72998);
      return;
    }
    if (paramString.equalsIgnoreCase("Pic"))
    {
      paramString = new a();
      paramString.mPO = paramc;
      paramString.a(paramContext, paramViewGroup, paramag);
      GMTrace.o(9797625708544L, 72998);
      return;
    }
    if (paramString.equalsIgnoreCase("Appid"))
    {
      paramString = new b();
      paramString.mPO = paramc;
      paramString.a(paramContext, paramViewGroup, paramag);
    }
    GMTrace.o(9797625708544L, 72998);
  }
  
  static final class a
    implements g.d
  {
    public g.c mPO;
    
    a()
    {
      GMTrace.i(9807155167232L, 73069);
      GMTrace.o(9807155167232L, 73069);
    }
    
    public final void a(final Context paramContext, ViewGroup paramViewGroup, final ag paramag)
    {
      GMTrace.i(9807289384960L, 73070);
      if (bg.nm(paramag.name))
      {
        w.w("MicroMsg.LuckyMoneyOperationViewMgr", "BannerPicOperationView attach iconUrl null");
        paramViewGroup.setVisibility(8);
        GMTrace.o(9807289384960L, 73070);
        return;
      }
      ImageView localImageView = new ImageView(paramContext);
      localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
      n.g(localImageView, paramag.name);
      if (!bg.nm(paramag.content)) {
        localImageView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(9878693216256L, 73602);
            com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(paramag.mJW) });
            if (g.a.this.mPO != null) {
              com.tencent.mm.protocal.f.dX(g.a.this.mPO.mPU, 1);
            }
            e.m(paramContext, paramag.content, true);
            GMTrace.o(9878693216256L, 73602);
          }
        });
      }
      localImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      paramViewGroup.addView(localImageView);
      paramViewGroup.setVisibility(0);
      com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramag.mJW) });
      if (this.mPO != null) {
        com.tencent.mm.protocal.f.dX(this.mPO.mPU, 0);
      }
      GMTrace.o(9807289384960L, 73070);
    }
  }
  
  static final class b
    implements g.d
  {
    g.c mPO;
    
    b()
    {
      GMTrace.i(9830374834176L, 73242);
      GMTrace.o(9830374834176L, 73242);
    }
    
    public final void a(final Context paramContext, ViewGroup paramViewGroup, final ag paramag)
    {
      GMTrace.i(9830509051904L, 73243);
      if (bg.nm(paramag.name))
      {
        GMTrace.o(9830509051904L, 73243);
        return;
      }
      TextView localTextView = new TextView(paramContext);
      if ((this.mPO != null) && (this.mPO.textColor != Integer.MIN_VALUE))
      {
        localTextView.setTextColor(this.mPO.textColor);
        if ((this.mPO == null) || (this.mPO.textSize == Integer.MIN_VALUE)) {
          break label251;
        }
        localTextView.setTextSize(0, this.mPO.textSize);
      }
      for (;;)
      {
        localTextView.setGravity(17);
        localTextView.setText(paramag.name);
        if (!bg.nm(paramag.content)) {
          localTextView.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9814805577728L, 73126);
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(paramag.mJW) });
              if (paramag.mJX != 1)
              {
                ((com.tencent.mm.pluginsdk.f)h.h(com.tencent.mm.pluginsdk.f.class)).a(paramContext, paramag.content, new l()
                {
                  public final void qg(int paramAnonymous2Int)
                  {
                    GMTrace.i(9794404483072L, 72974);
                    switch (paramAnonymous2Int)
                    {
                    }
                    for (;;)
                    {
                      GMTrace.o(9794404483072L, 72974);
                      return;
                      e.bp(g.b.1.this.val$context, g.b.1.this.mPP.content);
                    }
                  }
                }).show();
                GMTrace.o(9814805577728L, 73126);
                return;
              }
              e.P(paramContext, paramag.content);
              GMTrace.o(9814805577728L, 73126);
            }
          });
        }
        paramViewGroup.addView(localTextView, new ViewGroup.LayoutParams(-2, -2));
        paramViewGroup.setVisibility(0);
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramag.mJW) });
        GMTrace.o(9830509051904L, 73243);
        return;
        localTextView.setTextColor(paramContext.getResources().getColor(a.c.smS));
        break;
        label251:
        localTextView.setTextSize(0, paramContext.getResources().getDimensionPixelSize(a.d.aQo));
      }
    }
  }
  
  public static final class c
  {
    public boolean mPT;
    public int mPU;
    public int resourceId;
    public int textColor;
    public int textSize;
    
    public c()
    {
      GMTrace.i(9820979593216L, 73172);
      this.textColor = Integer.MIN_VALUE;
      this.textSize = Integer.MIN_VALUE;
      this.mPT = false;
      this.mPU = 0;
      this.resourceId = 0;
      GMTrace.o(9820979593216L, 73172);
    }
  }
  
  static abstract interface d
  {
    public abstract void a(Context paramContext, ViewGroup paramViewGroup, ag paramag);
  }
  
  static final class e
    implements g.d
  {
    public g.c mPO;
    
    e()
    {
      GMTrace.i(9839098986496L, 73307);
      GMTrace.o(9839098986496L, 73307);
    }
    
    public final void a(final Context paramContext, ViewGroup paramViewGroup, final ag paramag)
    {
      GMTrace.i(9839233204224L, 73308);
      if (bg.nm(paramag.name))
      {
        GMTrace.o(9839233204224L, 73308);
        return;
      }
      Object localObject = LayoutInflater.from(paramContext).inflate(a.g.sNf, paramViewGroup, true);
      TextView localTextView = (TextView)((View)localObject).findViewById(a.f.sAC);
      localObject = (ImageView)((View)localObject).findViewById(a.f.sAB);
      if (!bg.nm(paramag.iconUrl))
      {
        n.g((ImageView)localObject, paramag.iconUrl);
        ((ImageView)localObject).setVisibility(0);
        if ((this.mPO != null) && (this.mPO.textColor != Integer.MIN_VALUE)) {
          localTextView.setTextColor(this.mPO.textColor);
        }
        if ((this.mPO == null) || (this.mPO.textSize == Integer.MIN_VALUE)) {
          break label299;
        }
        localTextView.setTextSize(0, this.mPO.textSize);
      }
      for (;;)
      {
        localTextView.setGravity(17);
        localTextView.setText(paramag.name);
        if (!bg.nm(paramag.content)) {
          localTextView.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(9837219938304L, 73293);
              com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(paramag.mJW) });
              if (g.e.this.mPO != null) {
                com.tencent.mm.protocal.f.dX(g.e.this.mPO.mPU, 1);
              }
              if ((g.e.this.mPO != null) && (g.e.this.mPO.mPT)) {
                com.tencent.mm.plugin.report.service.g.ork.i(13051, new Object[] { Integer.valueOf(g.e.this.mPO.mPU), Integer.valueOf(2), "", "", "", paramag.content, paramag.type, "", "", Integer.valueOf(g.e.this.mPO.resourceId) });
              }
              if (paramag.type.equals("Native"))
              {
                w.i("MicroMsg.LuckyMoneyOperationViewMgr", "go native:" + paramag.content);
                if ("weixin://festival/gotoshake".equalsIgnoreCase(paramag.content))
                {
                  w.i("MicroMsg.LuckyMoneyOperationViewMgr", " go new year shake");
                  GMTrace.o(9837219938304L, 73293);
                }
              }
              else
              {
                e.m(paramContext, paramag.content, true);
              }
              GMTrace.o(9837219938304L, 73293);
            }
          });
        }
        paramViewGroup.setVisibility(0);
        com.tencent.mm.plugin.report.service.g.ork.i(11701, new Object[] { Integer.valueOf(14), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramag.mJW) });
        if (this.mPO != null) {
          com.tencent.mm.protocal.f.dX(this.mPO.mPU, 0);
        }
        GMTrace.o(9839233204224L, 73308);
        return;
        ((ImageView)localObject).setVisibility(8);
        break;
        label299:
        localTextView.setTextSize(0, paramContext.getResources().getDimensionPixelSize(a.d.aQo));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */