package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.AlphabetScrollBar;

public class SortViewScrollBar
  extends AlphabetScrollBar
{
  public SortViewScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20997155586048L, 156441);
    GMTrace.o(20997155586048L, 156441);
  }
  
  protected final void anP()
  {
    GMTrace.i(20997289803776L, 156442);
    this.mpp = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.mpn = 1.45F;
    this.mpo = 79;
    GMTrace.o(20997289803776L, 156442);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\sortview\SortViewScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */