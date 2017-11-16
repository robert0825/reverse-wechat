package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  View pKN;
  int pKO;
  FrameLayout.LayoutParams pKP;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(16273362649088L, 121246);
    this.pKN = ((FrameLayout)paramActivity.findViewById(16908290)).getChildAt(0);
    this.pKN.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(16273228431360L, 121245);
        a locala = a.this;
        Rect localRect = new Rect();
        locala.pKN.getWindowVisibleDisplayFrame(localRect);
        int i = localRect.bottom - localRect.top;
        int j;
        int k;
        if (i != locala.pKO)
        {
          j = locala.pKN.getRootView().getHeight();
          k = j - i;
          if (k <= j / 4) {
            break label111;
          }
        }
        label111:
        for (locala.pKP.height = (j - k);; locala.pKP.height = j)
        {
          locala.pKN.requestLayout();
          locala.pKO = i;
          GMTrace.o(16273228431360L, 121245);
          return;
        }
      }
    });
    this.pKP = ((FrameLayout.LayoutParams)this.pKN.getLayoutParams());
    GMTrace.o(16273362649088L, 121246);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */