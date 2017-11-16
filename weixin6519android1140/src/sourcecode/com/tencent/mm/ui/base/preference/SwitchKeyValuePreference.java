package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.v.a.h;

public class SwitchKeyValuePreference
  extends Preference
{
  public boolean eDU;
  private TextView nNG;
  
  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3240552824832L, 24144);
    GMTrace.o(3240552824832L, 24144);
  }
  
  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3240687042560L, 24145);
    this.eDU = true;
    setLayoutResource(a.h.cBA);
    GMTrace.o(3240687042560L, 24145);
  }
  
  public final void ar()
  {
    GMTrace.i(3240955478016L, 24147);
    if (this.nNG == null)
    {
      GMTrace.o(3240955478016L, 24147);
      return;
    }
    if (this.eDU)
    {
      this.nNG.setTextColor(r.fF(this.mContext));
      GMTrace.o(3240955478016L, 24147);
      return;
    }
    this.nNG.setTextColor(r.fG(this.mContext));
    GMTrace.o(3240955478016L, 24147);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(3240821260288L, 24146);
    super.onBindView(paramView);
    this.nNG = ((TextView)paramView.findViewById(16908304));
    ar();
    GMTrace.o(3240821260288L, 24146);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\SwitchKeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */