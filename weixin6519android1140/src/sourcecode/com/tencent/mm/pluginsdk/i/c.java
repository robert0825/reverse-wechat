package com.tencent.mm.pluginsdk.i;

import android.content.ClipData;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;

public final class c
{
  public static void a(Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    GMTrace.i(698871709696L, 5207);
    if (Build.VERSION.SDK_INT >= 11)
    {
      new d();
      ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(paramCharSequence1, paramCharSequence2));
      GMTrace.o(698871709696L, 5207);
      return;
    }
    new e();
    ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramCharSequence2);
    GMTrace.o(698871709696L, 5207);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\i\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */