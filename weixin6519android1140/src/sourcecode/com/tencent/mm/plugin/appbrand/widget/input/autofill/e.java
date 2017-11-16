package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.a;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.ui.base.q;

public final class e
  extends AutoFillListPopupWindowBase
{
  private final Context mContext;
  
  e(Context paramContext)
  {
    super(paramContext, null, 0);
    GMTrace.i(18257369104384L, 136028);
    this.mContext = paramContext;
    this.hwd.setInputMethodMode(2);
    paramContext = paramContext.getResources().getDrawable(o.e.abc_popup_background_mtrl_mult);
    this.hwd.setBackgroundDrawable(paramContext);
    this.Sg = true;
    this.hwd.setFocusable(false);
    this.RS = false;
    this.RT = true;
    int i = o.a.hzV;
    this.hwd.setAnimationStyle(i);
    GMTrace.o(18257369104384L, 136028);
  }
  
  public final void show()
  {
    GMTrace.i(18257503322112L, 136029);
    super.show();
    GMTrace.o(18257503322112L, 136029);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */