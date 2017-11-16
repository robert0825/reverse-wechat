package com.tencent.mm.plugin.label.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTagPanel;
import java.util.LinkedList;

public class MMLabelPanel
  extends MMTagPanel
{
  public MMLabelPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7283056574464L, 54263);
    GMTrace.o(7283056574464L, 54263);
  }
  
  public MMLabelPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7283190792192L, 54264);
    GMTrace.o(7283190792192L, 54264);
  }
  
  protected final void ayY()
  {
    GMTrace.i(7283325009920L, 54265);
    w.d("MicroMsg.Label.MMLabelPanel", "cpan[onPreDelTag]");
    if (this.ulN.size() > 0)
    {
      GMTrace.o(7283325009920L, 54265);
      return;
    }
    GMTrace.o(7283325009920L, 54265);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\widget\MMLabelPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */