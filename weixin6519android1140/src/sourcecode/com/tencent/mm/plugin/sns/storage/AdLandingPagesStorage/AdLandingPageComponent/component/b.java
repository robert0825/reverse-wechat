package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.c;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b
  extends i
{
  public b(Context paramContext, c paramc, ViewGroup paramViewGroup)
  {
    super(paramContext, paramc, paramViewGroup);
    GMTrace.i(8286334091264L, 61738);
    GMTrace.o(8286334091264L, 61738);
  }
  
  protected final void a(LinearLayout paramLinearLayout)
  {
    GMTrace.i(8286468308992L, 61739);
    Object localObject = (c)this.pGS;
    if (paramLinearLayout == null)
    {
      GMTrace.o(8286468308992L, 61739);
      return;
    }
    int i = Double.compare(((c)localObject).pDS, ((c)localObject).pDT);
    int m = (int)((c)localObject).pDS;
    int n = (int)((c)localObject).pDT;
    int k;
    if (i == 0)
    {
      k = n;
      i = m;
      if (m == 0)
      {
        k = 1;
        i = 1;
      }
    }
    for (;;)
    {
      w.i("AdLandingBorderedComp", "border width top %d,bottom %d", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
      LinearLayout localLinearLayout;
      if (i > 0)
      {
        localLinearLayout = new LinearLayout(paramLinearLayout.getContext());
        localLinearLayout.setBackgroundColor(((c)localObject).pDU);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, i);
        localLayoutParams.gravity = 48;
        paramLinearLayout.addView(localLinearLayout, 0, localLayoutParams);
      }
      if (k > 0)
      {
        localLinearLayout = new LinearLayout(paramLinearLayout.getContext());
        localLinearLayout.setBackgroundColor(((c)localObject).pDU);
        localObject = new LinearLayout.LayoutParams(-1, k);
        ((LinearLayout.LayoutParams)localObject).gravity = 80;
        paramLinearLayout.addView(localLinearLayout, (ViewGroup.LayoutParams)localObject);
      }
      GMTrace.o(8286468308992L, 61739);
      return;
      int j = m;
      if (m == 0)
      {
        j = m;
        if (((c)localObject).pDS != 0.0D) {
          j = 1;
        }
      }
      k = n;
      i = j;
      if (n == 0)
      {
        k = n;
        i = j;
        if (((c)localObject).pDT != 0.0D)
        {
          k = 1;
          i = j;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */