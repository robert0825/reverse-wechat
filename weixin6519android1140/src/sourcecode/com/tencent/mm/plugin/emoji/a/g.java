package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.emoji.a.a.a;

public final class g
  extends f
{
  private int kgN;
  private int kgO;
  private int kgP;
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11355088224256L, 84602);
    this.kgN = 0;
    this.kgO = 0;
    this.kgP = 0;
    GMTrace.o(11355088224256L, 84602);
  }
  
  public final int aqj()
  {
    GMTrace.i(11355625095168L, 84606);
    int i = this.kgN;
    GMTrace.o(11355625095168L, 84606);
    return i;
  }
  
  public final int aqk()
  {
    GMTrace.i(11355893530624L, 84608);
    int i = this.kgO;
    GMTrace.o(11355893530624L, 84608);
    return i;
  }
  
  public final int aql()
  {
    GMTrace.i(11356161966080L, 84610);
    int i = this.kgP;
    GMTrace.o(11356161966080L, 84610);
    return i;
  }
  
  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11355356659712L, 84604);
    final f.a locala = (f.a)paramView.getTag();
    if (this.kgN > 0) {
      if (paramInt == 0)
      {
        locala.kgl.setVisibility(0);
        locala.kgl.setText(this.mContext.getString(R.l.doH));
      }
    }
    for (;;)
    {
      if (locala.kgn != null) {
        locala.kgn.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11330526380032L, 84419);
            locala.kgn.setPressed(false);
            GMTrace.o(11330526380032L, 84419);
          }
        }, 100L);
      }
      paramView = super.b(paramInt, paramView, paramViewGroup);
      GMTrace.o(11355356659712L, 84604);
      return paramView;
      if ((this.kgO > 0) && (paramInt == this.kgN))
      {
        locala.kgl.setVisibility(0);
        locala.kgl.setText(this.mContext.getString(R.l.doS));
      }
      else if (paramInt == this.kgN + this.kgO)
      {
        locala.kgl.setVisibility(0);
        locala.kgl.setText(this.mContext.getString(R.l.dow));
      }
      else
      {
        locala.kgl.setVisibility(8);
        continue;
        if (this.kgO > 0) {
          if (paramInt == 0)
          {
            locala.kgl.setVisibility(0);
            locala.kgl.setText(this.mContext.getString(R.l.doS));
          }
          else if (paramInt == this.kgN + this.kgO)
          {
            locala.kgl.setVisibility(0);
            locala.kgl.setText(this.mContext.getString(R.l.dow));
          }
          else
          {
            locala.kgl.setVisibility(8);
          }
        }
      }
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(11355222441984L, 84603);
    int i = super.getCount();
    GMTrace.o(11355222441984L, 84603);
    return i;
  }
  
  public final void mA(int paramInt)
  {
    GMTrace.i(11356027748352L, 84609);
    this.kgO = paramInt;
    GMTrace.o(11356027748352L, 84609);
  }
  
  public final void mB(int paramInt)
  {
    GMTrace.i(11356296183808L, 84611);
    this.kgP = paramInt;
    GMTrace.o(11356296183808L, 84611);
  }
  
  public final com.tencent.mm.plugin.emoji.a.a.f mC(int paramInt)
  {
    GMTrace.i(11355490877440L, 84605);
    com.tencent.mm.plugin.emoji.a.a.f localf = super.mC(paramInt);
    GMTrace.o(11355490877440L, 84605);
    return localf;
  }
  
  public final void mz(int paramInt)
  {
    GMTrace.i(11355759312896L, 84607);
    this.kgN = paramInt;
    GMTrace.o(11355759312896L, 84607);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */