package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.VerticalScrollBar;

public class IPCallAddressScrollbar
  extends VerticalScrollBar
{
  public IPCallAddressScrollbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11672915804160L, 86970);
    GMTrace.o(11672915804160L, 86970);
  }
  
  protected final int aJh()
  {
    GMTrace.i(11673050021888L, 86971);
    int i = R.i.cGA;
    GMTrace.o(11673050021888L, 86971);
    return i;
  }
  
  protected final void anP()
  {
    GMTrace.i(11672781586432L, 86969);
    this.mpp = new String[] { "↑", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.mpn = 1.3F;
    this.mpo = 79;
    GMTrace.o(11672781586432L, 86969);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallAddressScrollbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */