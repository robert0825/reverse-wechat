package com.tencent.mm.ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public class ResizeLayout
  extends LinearLayout
{
  public a vTZ;
  
  public ResizeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2642344411136L, 19687);
    this.vTZ = null;
    GMTrace.o(2642344411136L, 19687);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2642478628864L, 19688);
    if (this.vTZ != null) {
      this.vTZ.bYy();
    }
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(2642478628864L, 19688);
  }
  
  public static abstract interface a
  {
    public abstract void bYy();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\ResizeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */