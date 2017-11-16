package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class InstantAutoCompleteTextView
  extends AutoCompleteTextView
{
  public boolean ofX;
  
  public InstantAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7867037908992L, 58614);
    GMTrace.o(7867037908992L, 58614);
  }
  
  public InstantAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7867172126720L, 58615);
    GMTrace.o(7867172126720L, 58615);
  }
  
  public void dismissDropDown()
  {
    GMTrace.i(7867306344448L, 58616);
    super.dismissDropDown();
    w.d("TestAutoCompleteTextView", "dismiss");
    GMTrace.o(7867306344448L, 58616);
  }
  
  public boolean enoughToFilter()
  {
    GMTrace.i(7867440562176L, 58617);
    if ((this.ofX) || (super.enoughToFilter()))
    {
      GMTrace.o(7867440562176L, 58617);
      return true;
    }
    GMTrace.o(7867440562176L, 58617);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\form\InstantAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */