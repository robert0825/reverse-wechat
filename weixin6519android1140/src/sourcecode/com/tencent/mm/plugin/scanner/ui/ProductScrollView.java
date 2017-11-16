package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class ProductScrollView
  extends ScrollView
{
  a owp;
  
  public ProductScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6132676427776L, 45692);
    GMTrace.o(6132676427776L, 45692);
  }
  
  public ProductScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6132810645504L, 45693);
    GMTrace.o(6132810645504L, 45693);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(6132944863232L, 45694);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.owp != null) {
      this.owp.auP();
    }
    GMTrace.o(6132944863232L, 45694);
  }
  
  public static abstract interface a
  {
    public abstract void auP();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ProductScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */