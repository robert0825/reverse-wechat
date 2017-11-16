package com.tencent.mm.plugin.collect.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.collect.b.l;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.y.q;

public class CollectHKMainUI
  extends CollectMainUI
{
  private boolean jZK;
  
  public CollectHKMainUI()
  {
    GMTrace.i(17424011231232L, 129819);
    this.jZK = false;
    GMTrace.o(17424011231232L, 129819);
  }
  
  protected final void apb()
  {
    GMTrace.i(17424413884416L, 129822);
    h.xz();
    this.kah = ((String)h.xy().xh().get(w.a.vyd, ""));
    l locall = new l(q.zL());
    if (!bg.nm(this.kah))
    {
      cmu().a(locall, false, 1);
      GMTrace.o(17424413884416L, 129822);
      return;
    }
    w.i("MicroMsg.CollectHKMainUI", "force load payurl");
    this.jZK = true;
    cmu().a(locall, true, 1);
    GMTrace.o(17424413884416L, 129822);
  }
  
  protected final String apc()
  {
    GMTrace.i(17424548102144L, 129823);
    String str = this.kai;
    GMTrace.o(17424548102144L, 129823);
    return str;
  }
  
  protected final String apd()
  {
    GMTrace.i(17424682319872L, 129824);
    if (bg.nm(this.kaj)) {
      this.kaj = com.tencent.mm.wallet_core.c.t.clX();
    }
    String str = this.kaj;
    GMTrace.o(17424682319872L, 129824);
    return str;
  }
  
  protected final void ape()
  {
    GMTrace.i(17425084973056L, 129827);
    ImageView localImageView1 = (ImageView)this.jXX.findViewById(a.f.sud);
    ImageView localImageView2 = (ImageView)this.jXX.findViewById(a.f.stU);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localImageView2.getLayoutParams();
    localLayoutParams.topMargin = 0;
    localLayoutParams.bottomMargin = 0;
    localLayoutParams.addRule(13);
    localImageView2.setLayoutParams(localLayoutParams);
    if (v.bPK().equals("zh_HK"))
    {
      localImageView1.setImageResource(a.h.sQL);
      localImageView2.setImageResource(a.h.sQH);
      GMTrace.o(17425084973056L, 129827);
      return;
    }
    localImageView1.setImageResource(a.h.sQK);
    localImageView2.setImageResource(a.h.sQG);
    GMTrace.o(17425084973056L, 129827);
  }
  
  protected final void apf()
  {
    GMTrace.i(17809752981504L, 132693);
    super.apf();
    if (this.kap)
    {
      findViewById(a.f.stO).setVisibility(8);
      GMTrace.o(17809752981504L, 132693);
      return;
    }
    findViewById(a.f.stO).setVisibility(0);
    GMTrace.o(17809752981504L, 132693);
  }
  
  public final boolean f(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(17424816537600L, 129825);
    if ((paramk instanceof l))
    {
      paramString = (l)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.jWs == 0)
        {
          this.kah = paramString.jWu;
          this.kai = paramString.jWG;
          this.kaj = paramString.jWD;
          anc();
          if (!bg.nm(paramString.jWA))
          {
            this.kaC.setText(paramString.jWA);
            this.kaF.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(19343458959360L, 144120);
                com.tencent.mm.wallet_core.ui.e.m(CollectHKMainUI.this.vKB.vKW, paramString.jWB, false);
                GMTrace.o(19343458959360L, 144120);
              }
            });
            this.kaF.setVisibility(0);
            if (bg.nm(paramString.jWE)) {
              break label177;
            }
            this.kae.setText(paramString.jWE);
            this.kae.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(17423877013504L, 129818);
                if (!bg.nm(paramString.jWF)) {
                  com.tencent.mm.wallet_core.ui.e.m(CollectHKMainUI.this.vKB.vKW, paramString.jWF, true);
                }
                GMTrace.o(17423877013504L, 129818);
              }
            });
            this.kae.setVisibility(0);
          }
          for (;;)
          {
            GMTrace.o(17424816537600L, 129825);
            return true;
            this.kaF.setVisibility(8);
            break;
            label177:
            this.kae.setVisibility(8);
          }
        }
      }
      else {
        w.e("MicroMsg.CollectHKMainUI", "net error: %s", new Object[] { paramk });
      }
      if (!this.jZK)
      {
        GMTrace.o(17424816537600L, 129825);
        return true;
      }
    }
    GMTrace.o(17424816537600L, 129825);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17424145448960L, 129820);
    super.onCreate(paramBundle);
    this.kaF.setVisibility(8);
    findViewById(a.f.stO).setVisibility(0);
    findViewById(a.f.sug).setVisibility(8);
    cmu().hN(1335);
    a(0, a.e.spj, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17415152861184L, 129753);
        com.tencent.mm.wallet_core.ui.e.m(CollectHKMainUI.this.vKB.vKW, "https://hkwallet.moneydata.hk/hybrid/www/weixin/f2f/zh_hk/faq.shtml", true);
        GMTrace.o(17415152861184L, 129753);
        return false;
      }
    });
    GMTrace.o(17424145448960L, 129820);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(17424279666688L, 129821);
    super.onDestroy();
    cmu().hO(1335);
    GMTrace.o(17424279666688L, 129821);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectHKMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */