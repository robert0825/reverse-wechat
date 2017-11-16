package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;

public final class ab
{
  static boolean a(Layout paramLayout, int paramInt)
  {
    GMTrace.i(20296270610432L, 151219);
    if ((paramInt > 0) && (paramLayout.getLineForOffset(paramInt) == paramLayout.getLineForOffset(paramInt - 1) + 1))
    {
      GMTrace.o(20296270610432L, 151219);
      return true;
    }
    GMTrace.o(20296270610432L, 151219);
    return false;
  }
  
  public static int getScreenWidth(Context paramContext)
  {
    GMTrace.i(20296136392704L, 151218);
    int i = paramContext.getResources().getDisplayMetrics().widthPixels;
    GMTrace.o(20296136392704L, 151218);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */