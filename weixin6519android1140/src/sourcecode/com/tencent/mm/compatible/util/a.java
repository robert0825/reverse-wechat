package com.tencent.mm.compatible.util;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.a.a;

public final class a
{
  public static int f(Activity paramActivity)
  {
    GMTrace.i(13788724068352L, 102734);
    TypedValue localTypedValue = new TypedValue();
    int i;
    if (paramActivity.getTheme().resolveAttribute(a.a.actionBarSize, localTypedValue, true))
    {
      i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
      GMTrace.o(13788724068352L, 102734);
      return i;
    }
    if (paramActivity.getTheme().resolveAttribute(16843499, localTypedValue, true))
    {
      i = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
      GMTrace.o(13788724068352L, 102734);
      return i;
    }
    GMTrace.o(13788724068352L, 102734);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */