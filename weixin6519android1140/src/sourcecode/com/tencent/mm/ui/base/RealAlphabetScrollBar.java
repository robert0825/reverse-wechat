package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.h;

public class RealAlphabetScrollBar
  extends VerticalScrollBar
{
  public RealAlphabetScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18742700408832L, 139644);
    GMTrace.o(18742700408832L, 139644);
  }
  
  protected final int aJh()
  {
    GMTrace.i(18742834626560L, 139645);
    int i = a.h.cGA;
    GMTrace.o(18742834626560L, 139645);
    return i;
  }
  
  protected final void anP()
  {
    GMTrace.i(18742566191104L, 139643);
    this.mpp = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.mpn = 1.3F;
    this.mpo = 79;
    GMTrace.o(18742566191104L, 139643);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\RealAlphabetScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */