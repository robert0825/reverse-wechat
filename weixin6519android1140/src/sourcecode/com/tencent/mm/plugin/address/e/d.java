package com.tencent.mm.plugin.address.e;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;

public final class d
{
  public static void H(Context paramContext, String paramString)
  {
    GMTrace.i(15216666476544L, 113373);
    if (Build.VERSION.SDK_INT >= 11)
    {
      new b();
      ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramString);
      GMTrace.o(15216666476544L, 113373);
      return;
    }
    new c();
    ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramString);
    GMTrace.o(15216666476544L, 113373);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */