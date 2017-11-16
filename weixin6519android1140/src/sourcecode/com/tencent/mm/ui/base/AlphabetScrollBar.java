package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.h;

public class AlphabetScrollBar
  extends VerticalScrollBar
{
  public AlphabetScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3369401843712L, 25104);
    GMTrace.o(3369401843712L, 25104);
  }
  
  protected final int aJh()
  {
    GMTrace.i(3369536061440L, 25105);
    int i = a.h.cGA;
    GMTrace.o(3369536061440L, 25105);
    return i;
  }
  
  public void anP()
  {
    GMTrace.i(3369267625984L, 25103);
    this.mpp = new String[] { "↑", "☆", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.mpn = 1.3F;
    this.mpo = 79;
    GMTrace.o(3369267625984L, 25103);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\AlphabetScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */