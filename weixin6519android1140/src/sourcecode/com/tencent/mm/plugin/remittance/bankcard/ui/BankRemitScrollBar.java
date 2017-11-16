package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.AlphabetScrollBar;

public class BankRemitScrollBar
  extends AlphabetScrollBar
{
  public BankRemitScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20941992099840L, 156030);
    GMTrace.o(20941992099840L, 156030);
  }
  
  protected final void anP()
  {
    GMTrace.i(20942126317568L, 156031);
    super.anP();
    this.mpp = new String[] { "☆", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    GMTrace.o(20942126317568L, 156031);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */