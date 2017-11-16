package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.a.c;
import com.tenpay.android.wechat.MyKeyboardWindow;

public final class u
  extends MyKeyboardWindow
{
  u(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20751671361536L, 154612);
    if (Build.VERSION.SDK_INT >= 14) {
      setAccessibilityDelegate(new c());
    }
    GMTrace.o(20751671361536L, 154612);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(20751805579264L, 154613);
    super.onDetachedFromWindow();
    setInputEditText(null);
    GMTrace.o(20751805579264L, 154613);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */