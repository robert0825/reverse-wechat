package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;

public final class p
{
  public static void H(Context paramContext, String paramString)
  {
    GMTrace.i(5044439089152L, 37584);
    if (Build.VERSION.SDK_INT >= 11)
    {
      new n();
      ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramString);
      GMTrace.o(5044439089152L, 37584);
      return;
    }
    new o();
    ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramString);
    GMTrace.o(5044439089152L, 37584);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */