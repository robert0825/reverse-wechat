package com.tencent.mm.plugin.multitalk.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.ui.a.b;

public final class d
  implements View.OnClickListener
{
  private Context context;
  private View lAk;
  private int noA;
  private int noB;
  public int noC;
  private int noc;
  private int noi;
  private LinearLayout nou;
  public LinearLayout nov;
  public LinearLayout now;
  private int nox;
  private int noy;
  private int noz;
  public int size;
  
  public d(Activity paramActivity)
  {
    GMTrace.i(4780835471360L, 35620);
    this.size = 0;
    this.noc = b.noc;
    this.noz = (b.noc + b.nob);
    this.noA = (b.noc * 2 + b.nob);
    this.noB = (b.noc * 4);
    this.noi = b.noi;
    this.context = paramActivity.getBaseContext();
    int i = a.ef(this.context) - this.noB * 2;
    this.nox = ((i - this.noz * 10) / 5);
    this.noy = ((i - this.noA * 10) / 5);
    i = this.noy;
    int j = this.noc;
    this.lAk = paramActivity.findViewById(R.h.bST);
    this.lAk.getLayoutParams().height = (i * 2 + j * 12);
    this.nou = ((LinearLayout)paramActivity.findViewById(R.h.bfn));
    paramActivity = (RelativeLayout.LayoutParams)this.nou.getLayoutParams();
    paramActivity.topMargin = (this.noc * 2);
    paramActivity.bottomMargin = (this.noc * 2);
    paramActivity.leftMargin = this.noB;
    paramActivity.rightMargin = this.noB;
    this.nou.setLayoutParams(paramActivity);
    this.nov = new LinearLayout(this.context);
    this.now = new LinearLayout(this.context);
    paramActivity = new LinearLayout.LayoutParams(-2, -2);
    this.nov.setLayoutParams(paramActivity);
    paramActivity = new RelativeLayout.LayoutParams(-2, -2);
    paramActivity.addRule(14);
    this.now.setLayoutParams(paramActivity);
    paramActivity = new LinearLayout.LayoutParams(-1, -2);
    RelativeLayout localRelativeLayout = new RelativeLayout(this.context);
    localRelativeLayout.addView(this.now);
    localRelativeLayout.setLayoutParams(paramActivity);
    this.nou.addView(this.nov);
    this.nou.addView(localRelativeLayout);
    GMTrace.o(4780835471360L, 35620);
  }
  
  public final void Dg(String paramString)
  {
    GMTrace.i(4781103906816L, 35622);
    this.size += 1;
    ImageView localImageView = new ImageView(this.context);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    localImageView.setTag(paramString);
    localImageView.setOnClickListener(this);
    a.b.a(localImageView, paramString, 0.1F, false);
    if (this.size <= 5) {
      this.nov.addView(localImageView);
    }
    for (;;)
    {
      rg(this.size);
      rh(this.size);
      GMTrace.o(4781103906816L, 35622);
      return;
      this.now.addView(localImageView);
    }
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(4781506560000L, 35625);
    this.noC += 1;
    GMTrace.o(4781506560000L, 35625);
  }
  
  public final void rg(int paramInt)
  {
    GMTrace.i(4781238124544L, 35623);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.nov.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.now.getLayoutParams();
    if (paramInt <= 5)
    {
      localLayoutParams.height = this.nox;
      this.now.setVisibility(8);
      GMTrace.o(4781238124544L, 35623);
      return;
    }
    localLayoutParams.height = this.noy;
    localLayoutParams.topMargin = (this.noc * 2);
    localLayoutParams.bottomMargin = (this.noc * 2);
    this.now.setVisibility(0);
    localLayoutParams1.height = this.noy;
    localLayoutParams1.topMargin = (this.noc * 2);
    localLayoutParams1.bottomMargin = (this.noc * 2);
    GMTrace.o(4781238124544L, 35623);
  }
  
  public final void rh(int paramInt)
  {
    int k = 0;
    int j = 0;
    GMTrace.i(4781372342272L, 35624);
    int i;
    LinearLayout.LayoutParams localLayoutParams;
    if (paramInt <= 5)
    {
      paramInt = 0;
      for (;;)
      {
        i = j;
        if (paramInt >= this.nov.getChildCount()) {
          break;
        }
        localLayoutParams = (LinearLayout.LayoutParams)this.nov.getChildAt(paramInt).getLayoutParams();
        localLayoutParams.width = this.nox;
        localLayoutParams.height = this.nox;
        localLayoutParams.rightMargin = this.noz;
        localLayoutParams.leftMargin = this.noz;
        paramInt += 1;
      }
      while (i < this.now.getChildCount())
      {
        localLayoutParams = (LinearLayout.LayoutParams)this.now.getChildAt(i).getLayoutParams();
        localLayoutParams.width = this.noy;
        localLayoutParams.height = this.noy;
        localLayoutParams.rightMargin = this.noz;
        localLayoutParams.leftMargin = this.noz;
        i += 1;
      }
      GMTrace.o(4781372342272L, 35624);
      return;
    }
    paramInt = 0;
    for (;;)
    {
      i = k;
      if (paramInt >= this.nov.getChildCount()) {
        break;
      }
      localLayoutParams = (LinearLayout.LayoutParams)this.nov.getChildAt(paramInt).getLayoutParams();
      localLayoutParams.width = this.noy;
      localLayoutParams.height = this.noy;
      localLayoutParams.rightMargin = this.noA;
      localLayoutParams.leftMargin = this.noA;
      paramInt += 1;
    }
    while (i < this.now.getChildCount())
    {
      localLayoutParams = (LinearLayout.LayoutParams)this.now.getChildAt(i).getLayoutParams();
      localLayoutParams.width = this.noy;
      localLayoutParams.height = this.noy;
      localLayoutParams.rightMargin = this.noA;
      localLayoutParams.leftMargin = this.noA;
      i += 1;
    }
    GMTrace.o(4781372342272L, 35624);
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    GMTrace.i(4780969689088L, 35621);
    if (paramBoolean)
    {
      this.lAk.setVisibility(0);
      GMTrace.o(4780969689088L, 35621);
      return;
    }
    this.lAk.setVisibility(8);
    GMTrace.o(4780969689088L, 35621);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\ui\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */