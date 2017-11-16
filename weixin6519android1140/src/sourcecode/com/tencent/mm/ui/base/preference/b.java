package com.tencent.mm.ui.base.preference;

import android.widget.RadioButton;
import com.tencent.gmtrace.GMTrace;

final class b
{
  int id;
  CharSequence text;
  
  public b(CharSequence paramCharSequence, int paramInt)
  {
    GMTrace.i(3241089695744L, 24148);
    this.text = paramCharSequence;
    this.id = paramInt;
    GMTrace.o(3241089695744L, 24148);
  }
  
  public final void a(RadioButton paramRadioButton)
  {
    GMTrace.i(3241223913472L, 24149);
    paramRadioButton.setText(this.text);
    paramRadioButton.setId(this.id);
    GMTrace.o(3241223913472L, 24149);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\preference\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */