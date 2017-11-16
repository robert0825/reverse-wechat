package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.v.a.j;

public class IconSwitchKeyValuePreference
  extends IconPreference
{
  private TextView nNG;
  private int status;
  
  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3223372955648L, 24016);
    GMTrace.o(3223372955648L, 24016);
  }
  
  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3223507173376L, 24017);
    this.status = 0;
    GMTrace.o(3223507173376L, 24017);
  }
  
  private void ar()
  {
    GMTrace.i(3223909826560L, 24020);
    if (this.nNG == null)
    {
      GMTrace.o(3223909826560L, 24020);
      return;
    }
    int i = BackwardSupportUtil.b.a(this.mContext, 2.0F);
    this.nNG.setTextColor(r.fG(this.mContext));
    if (this.status == 0)
    {
      this.nNG.setCompoundDrawablesWithIntrinsicBounds(a.j.ggf, 0, 0, 0);
      this.nNG.setCompoundDrawablePadding(i);
      GMTrace.o(3223909826560L, 24020);
      return;
    }
    if (this.status == 1)
    {
      this.nNG.setCompoundDrawablesWithIntrinsicBounds(a.j.ggd, 0, 0, 0);
      this.nNG.setCompoundDrawablePadding(i);
      GMTrace.o(3223909826560L, 24020);
      return;
    }
    if (this.status == 2)
    {
      this.nNG.setCompoundDrawablesWithIntrinsicBounds(a.j.gge, 0, 0, 0);
      this.nNG.setCompoundDrawablePadding(i);
      GMTrace.o(3223909826560L, 24020);
      return;
    }
    this.nNG.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    GMTrace.o(3223909826560L, 24020);
  }
  
  public final void Cs(int paramInt)
  {
    GMTrace.i(3223775608832L, 24019);
    this.status = paramInt;
    ar();
    GMTrace.o(3223775608832L, 24019);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(3223641391104L, 24018);
    super.onBindView(paramView);
    this.nNG = ((TextView)paramView.findViewById(16908304));
    ar();
    GMTrace.o(3223641391104L, 24018);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\IconSwitchKeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */