package com.tencent.mm.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.VerticalScrollBar;

public class StrokeScrollBar
  extends VerticalScrollBar
{
  public StrokeScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1851399340032L, 13794);
    GMTrace.o(1851399340032L, 13794);
  }
  
  protected final int aJh()
  {
    GMTrace.i(1851533557760L, 13795);
    int i = R.i.cGB;
    GMTrace.o(1851533557760L, 13795);
    return i;
  }
  
  protected final void anP()
  {
    GMTrace.i(1851265122304L, 13793);
    this.mpp = new String[18];
    int i = 0;
    while (i < this.mpp.length)
    {
      this.mpp[i] = (Integer.toString(i + 3) + "劃");
      i += 1;
    }
    this.mpn = 2.0F;
    this.mpo = 79;
    GMTrace.o(1851265122304L, 13793);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\applet\StrokeScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */