package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.h;

public class TextPreference
  extends Preference
{
  private Context context;
  protected TextView jU;
  protected CharSequence mText;
  protected int tl;
  
  public TextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3219480641536L, 23987);
    this.context = paramContext;
    setLayoutResource(a.h.cCc);
    GMTrace.o(3219480641536L, 23987);
  }
  
  private void ar()
  {
    GMTrace.i(17513802891264L, 130488);
    if (this.jU == null)
    {
      GMTrace.o(17513802891264L, 130488);
      return;
    }
    this.jU.setText(this.mText);
    this.jU.setGravity(this.tl);
    GMTrace.o(17513802891264L, 130488);
  }
  
  public final void R(CharSequence paramCharSequence)
  {
    GMTrace.i(18740150272000L, 139625);
    this.mText = paramCharSequence;
    this.tl = 17;
    ar();
    GMTrace.o(18740150272000L, 139625);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3219749076992L, 23989);
    super.onBindView(paramView);
    this.jU = ((TextView)paramView.findViewById(16908310));
    ar();
    GMTrace.o(3219749076992L, 23989);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3219614859264L, 23988);
    paramViewGroup = super.onCreateView(paramViewGroup);
    GMTrace.o(3219614859264L, 23988);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\TextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */