package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.AlphabetScrollBar;

public class SelectMemberScrollBar
  extends AlphabetScrollBar
{
  public SelectMemberScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9138348228608L, 68086);
    GMTrace.o(9138348228608L, 68086);
  }
  
  protected final void anP()
  {
    GMTrace.i(9138482446336L, 68087);
    this.mpp = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.mpn = 1.45F;
    this.mpo = 79;
    GMTrace.o(9138482446336L, 68087);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SelectMemberScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */