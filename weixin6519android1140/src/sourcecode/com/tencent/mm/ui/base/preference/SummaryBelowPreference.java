package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.h;

public class SummaryBelowPreference
  extends Preference
{
  public SummaryBelowPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3238942212096L, 24132);
    GMTrace.o(3238942212096L, 24132);
  }
  
  public SummaryBelowPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3239076429824L, 24133);
    setLayoutResource(a.h.gfD);
    GMTrace.o(3239076429824L, 24133);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\preference\SummaryBelowPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */