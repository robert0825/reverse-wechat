package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.br.a;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;

public class VcardContactLinkPreference
  extends KeyValuePreference
{
  public VcardContactLinkPreference(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6125026017280L, 45635);
    GMTrace.o(6125026017280L, 45635);
  }
  
  public VcardContactLinkPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6125160235008L, 45636);
    GMTrace.o(6125160235008L, 45636);
  }
  
  public VcardContactLinkPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6125294452736L, 45637);
    GMTrace.o(6125294452736L, 45637);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6125562888192L, 45639);
    super.onBindView(paramView);
    ((TextView)paramView.findViewById(16908304)).setTextColor(a.c(this.mContext, R.e.aNn));
    GMTrace.o(6125562888192L, 45639);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6125428670464L, 45638);
    paramViewGroup = super.onCreateView(paramViewGroup);
    GMTrace.o(6125428670464L, 45638);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\VcardContactLinkPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */