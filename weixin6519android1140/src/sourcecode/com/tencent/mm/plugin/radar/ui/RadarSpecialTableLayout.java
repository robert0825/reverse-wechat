package com.tencent.mm.plugin.radar.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import com.tencent.gmtrace.GMTrace;

public class RadarSpecialTableLayout
  extends TableLayout
{
  private boolean oaU;
  
  public RadarSpecialTableLayout(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8914338840576L, 66417);
    this.oaU = false;
    GMTrace.o(8914338840576L, 66417);
  }
  
  public RadarSpecialTableLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8914204622848L, 66416);
    this.oaU = false;
    GMTrace.o(8914204622848L, 66416);
  }
  
  public final void n(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8914473058304L, 66418);
    this.oaU = true;
    super.layout(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8914473058304L, 66418);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8914607276032L, 66419);
    int j;
    int i;
    if ((!this.oaU) && (paramInt2 < 0))
    {
      j = 1;
      paramInt4 -= paramInt2;
      i = 0;
    }
    for (paramInt2 = j;; paramInt2 = j)
    {
      this.oaU = false;
      if (paramInt2 == 0)
      {
        super.onLayout(paramBoolean, paramInt1, i, paramInt3, paramInt4);
        GMTrace.o(8914607276032L, 66419);
        return;
      }
      layout(paramInt1, 0, paramInt3, paramInt4);
      GMTrace.o(8914607276032L, 66419);
      return;
      j = 0;
      i = paramInt2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarSpecialTableLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */