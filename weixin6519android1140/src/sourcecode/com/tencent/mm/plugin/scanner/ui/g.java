package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class g
  extends Preference
{
  private View mView;
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6115764994048L, 45566);
    this.mView = null;
    setLayoutResource(R.i.cDB);
    GMTrace.o(6115764994048L, 45566);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6115899211776L, 45567);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    super.onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6115899211776L, 45567);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(15373432782848L, 114541);
    super.onBindView(paramView);
    GMTrace.o(15373432782848L, 114541);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */