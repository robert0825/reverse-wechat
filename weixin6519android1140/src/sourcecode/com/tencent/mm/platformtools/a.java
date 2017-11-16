package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

@Deprecated
public final class a
{
  public static final class a
  {
    public static int a(Context paramContext, float paramFloat)
    {
      GMTrace.i(474057015296L, 3532);
      new b();
      int i = Math.round(paramContext.getResources().getDisplayMetrics().densityDpi * paramFloat / 160.0F);
      GMTrace.o(474057015296L, 3532);
      return i;
    }
  }
  
  public static final class b
  {
    public static void a(ListView paramListView)
    {
      GMTrace.i(459829936128L, 3426);
      if (Build.VERSION.SDK_INT >= 8)
      {
        new p();
        if (paramListView.getFirstVisiblePosition() > 10) {
          paramListView.setSelection(10);
        }
        if (Build.VERSION.SDK_INT >= 8) {
          paramListView.smoothScrollToPosition(0);
        }
        GMTrace.o(459829936128L, 3426);
        return;
      }
      new o();
      paramListView.setSelection(0);
      GMTrace.o(459829936128L, 3426);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */