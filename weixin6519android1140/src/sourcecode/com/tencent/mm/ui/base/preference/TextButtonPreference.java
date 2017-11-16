package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.h;

public class TextButtonPreference
  extends Preference
{
  public TextButtonPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(18740955578368L, 139631);
    GMTrace.o(18740955578368L, 139631);
  }
  
  public TextButtonPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18741089796096L, 139632);
    GMTrace.o(18741089796096L, 139632);
  }
  
  public final int getLayoutResource()
  {
    GMTrace.i(18741224013824L, 139633);
    int i = a.h.gfo;
    GMTrace.o(18741224013824L, 139633);
    return i;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(18741492449280L, 139635);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(16908310);
    if (paramView != null)
    {
      paramView.setText(getTitle());
      paramView.setEnabled(isEnabled());
    }
    GMTrace.o(18741492449280L, 139635);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(18741358231552L, 139634);
    super.onCreateView(paramViewGroup);
    paramViewGroup = v.fb(this.mContext).inflate(a.h.gfo, paramViewGroup, false);
    GMTrace.o(18741358231552L, 139634);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\TextButtonPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */