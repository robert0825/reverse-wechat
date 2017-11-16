package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class MMProgressBar
  extends LinearLayout
{
  private int max;
  private aj nAd;
  private TextView oTy;
  private int wdI;
  private int wdJ;
  private TextView wdK;
  public a wdL;
  
  public MMProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3264443580416L, 24322);
    this.max = 100;
    this.wdI = 0;
    this.wdJ = 0;
    this.nAd = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3170893824000L, 23625);
        int j = MMProgressBar.a(MMProgressBar.this) - MMProgressBar.b(MMProgressBar.this);
        int i;
        Object localObject;
        int k;
        if (j > 0)
        {
          i = (int)(j * 0.6D);
          localObject = MMProgressBar.this;
          k = MMProgressBar.b(MMProgressBar.this);
          if (i <= 0) {
            break label130;
          }
        }
        for (;;)
        {
          MMProgressBar.a((MMProgressBar)localObject, i + k);
          MMProgressBar.b(MMProgressBar.this, MMProgressBar.b(MMProgressBar.this));
          localObject = MMProgressBar.d(MMProgressBar.this);
          long l = (MMProgressBar.c(MMProgressBar.this) - j) * 40 / MMProgressBar.c(MMProgressBar.this);
          ((aj)localObject).z(l, l);
          GMTrace.o(3170893824000L, 23625);
          return false;
          label130:
          i = 1;
        }
      }
    }, false);
    inflate(getContext(), a.h.gfG, this);
    this.wdK = ((TextView)findViewById(a.g.gdB));
    this.oTy = ((TextView)findViewById(a.g.gdC));
    GMTrace.o(3264443580416L, 24322);
  }
  
  public final void lC(boolean paramBoolean)
  {
    GMTrace.i(3264712015872L, 24324);
    if (paramBoolean)
    {
      this.nAd.z(40L, 40L);
      GMTrace.o(3264712015872L, 24324);
      return;
    }
    this.nAd.stopTimer();
    GMTrace.o(3264712015872L, 24324);
  }
  
  public final void setProgress(int paramInt)
  {
    GMTrace.i(3264577798144L, 24323);
    int i = paramInt;
    if (paramInt > this.max) {
      i = this.max;
    }
    this.wdJ = i;
    if (this.nAd.bQn()) {
      lC(true);
    }
    GMTrace.o(3264577798144L, 24323);
  }
  
  public static abstract interface a
  {
    public abstract void vZ(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */