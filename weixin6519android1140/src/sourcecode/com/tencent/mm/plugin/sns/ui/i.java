package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public final class i
  extends LinearLayout
{
  private Context context;
  private int joP;
  public int pOW;
  private LinearLayout pOX;
  
  public i(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8613556912128L, 64176);
    this.joP = 0;
    this.pOW = 6;
    this.context = paramContext;
    setOrientation(1);
    GMTrace.o(8613556912128L, 64176);
  }
  
  public final void addView(View paramView)
  {
    GMTrace.i(8613691129856L, 64177);
    if (this.joP % this.pOW == 0)
    {
      this.pOX = new LinearLayout(this.context);
      this.pOX.setOrientation(0);
      this.pOX.addView(paramView);
      super.addView(this.pOX);
    }
    for (;;)
    {
      this.joP += 1;
      GMTrace.o(8613691129856L, 64177);
      return;
      this.pOX.addView(paramView);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */