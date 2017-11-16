package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.h;

public class PreferenceTitleCategory
  extends PreferenceCategory
{
  public PreferenceTitleCategory(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3233841938432L, 24094);
    GMTrace.o(3233841938432L, 24094);
  }
  
  public PreferenceTitleCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3233976156160L, 24095);
    GMTrace.o(3233976156160L, 24095);
  }
  
  public PreferenceTitleCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3234110373888L, 24096);
    if (getLayoutResource() != a.h.gfC) {
      setLayoutResource(a.h.gfA);
    }
    GMTrace.o(3234110373888L, 24096);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3234244591616L, 24097);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(16908310);
    if (paramView == null)
    {
      GMTrace.o(3234244591616L, 24097);
      return;
    }
    if ((getTitle() == null) || (getTitle().length() <= 0))
    {
      paramView.setVisibility(8);
      GMTrace.o(3234244591616L, 24097);
      return;
    }
    paramView.setVisibility(0);
    paramView.setText(getTitle());
    GMTrace.o(3234244591616L, 24097);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\base\preference\PreferenceTitleCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */