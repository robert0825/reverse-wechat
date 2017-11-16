package com.tencent.mm.ui.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.gmtrace.GMTrace;

public abstract class i
  implements TextWatcher
{
  public i()
  {
    GMTrace.i(1613968179200L, 12025);
    GMTrace.o(1613968179200L, 12025);
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    GMTrace.i(1614370832384L, 12028);
    GMTrace.o(1614370832384L, 12028);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1614102396928L, 12026);
    GMTrace.o(1614102396928L, 12026);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1614236614656L, 12027);
    GMTrace.o(1614236614656L, 12027);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */