package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.g;

public class SightRangeWidget
  extends RangeWidget
{
  public SightRangeWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8551279886336L, 63712);
    GMTrace.o(8551279886336L, 63712);
  }
  
  public SightRangeWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8551145668608L, 63711);
    GMTrace.o(8551145668608L, 63711);
  }
  
  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent, AtContactWidget paramAtContactWidget)
  {
    GMTrace.i(8551682539520L, 63715);
    super.a(paramInt1, paramInt2, paramIntent, paramAtContactWidget);
    if (paramAtContactWidget != null)
    {
      if (this.pVZ != 1) {
        break label52;
      }
      paramAtContactWidget.setVisibility(4);
      paramAtContactWidget.bmI();
    }
    for (;;)
    {
      GMTrace.o(8551682539520L, 63715);
      return true;
      label52:
      paramAtContactWidget.setVisibility(0);
    }
  }
  
  protected final int bod()
  {
    GMTrace.i(8551548321792L, 63714);
    GMTrace.o(8551548321792L, 63714);
    return 10;
  }
  
  protected final int getLayoutResource()
  {
    GMTrace.i(8551414104064L, 63713);
    int i = i.g.pfb;
    GMTrace.o(8551414104064L, 63713);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SightRangeWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */