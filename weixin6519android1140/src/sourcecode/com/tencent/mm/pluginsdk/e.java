package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.v.a.c;
import com.tencent.mm.v.a.e;

public final class e
{
  public static void O(Activity paramActivity)
  {
    GMTrace.i(1235339968512L, 9204);
    if (Build.VERSION.SDK_INT >= 16)
    {
      if ((paramActivity instanceof AppCompatActivity))
      {
        ((AppCompatActivity)paramActivity).aq(109);
        GMTrace.o(1235339968512L, 9204);
        return;
      }
      paramActivity.requestWindowFeature(9);
    }
    GMTrace.o(1235339968512L, 9204);
  }
  
  public static void a(MMFragmentActivity paramMMFragmentActivity, final View paramView)
  {
    GMTrace.i(1235742621696L, 9207);
    if (Build.VERSION.SDK_INT >= 16) {
      paramMMFragmentActivity.getWindow().getDecorView().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1258693853184L, 9378);
          this.tlT.getWindow().getDecorView().setSystemUiVisibility(this.tlT.getWindow().getDecorView().getSystemUiVisibility() | 0x100);
          int i = com.tencent.mm.compatible.util.a.f(this.tlT);
          w.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", new Object[] { Integer.valueOf(i) });
          if (paramView != null) {
            paramView.setPadding(0, i, 0, 0);
          }
          GMTrace.o(1258693853184L, 9378);
        }
      });
    }
    GMTrace.o(1235742621696L, 9207);
  }
  
  public static int bX(Context paramContext)
  {
    GMTrace.i(1235876839424L, 9208);
    int i = 0;
    Object localObject = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(a.c.actionBarSize, (TypedValue)localObject, true)) {
      i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject).data, paramContext.getResources().getDisplayMetrics());
    }
    localObject = paramContext.getResources().getDisplayMetrics();
    int j = i;
    if (i <= 0) {
      if (((DisplayMetrics)localObject).widthPixels <= ((DisplayMetrics)localObject).heightPixels) {
        break label96;
      }
    }
    label96:
    for (j = paramContext.getResources().getDimensionPixelSize(a.e.aPM);; j = paramContext.getResources().getDimensionPixelSize(a.e.aPN))
    {
      GMTrace.o(1235876839424L, 9208);
      return j;
    }
  }
  
  public static int dG(Context paramContext)
  {
    GMTrace.i(1235205750784L, 9203);
    p localp;
    int i;
    if ((paramContext instanceof MMActivity))
    {
      localp = ((MMActivity)paramContext).vKB;
      if (localp.FM == null) {
        i = 0;
      }
    }
    for (;;)
    {
      int j = i;
      if (i <= 0) {
        j = paramContext.getResources().getDimensionPixelSize(a.e.aPN);
      }
      GMTrace.o(1235205750784L, 9203);
      return j;
      i = localp.FM.getHeight();
      continue;
      i = 0;
    }
  }
  
  public static int dH(Context paramContext)
  {
    GMTrace.i(1236011057152L, 9209);
    int i = u.ad(paramContext, -1);
    Rect localRect;
    if (i > 0)
    {
      localRect = new Rect();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      if (localRect.top > i)
      {
        GMTrace.o(1236011057152L, 9209);
        return 0;
      }
      GMTrace.o(1236011057152L, 9209);
      return i;
    }
    if ((paramContext instanceof Activity))
    {
      localRect = new Rect();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      i = ((Activity)paramContext).getWindow().getDecorView().getHeight();
      int[] arrayOfInt = new int[2];
      ((Activity)paramContext).getWindow().getDecorView().getLocationOnScreen(arrayOfInt);
      if ((i - localRect.height() >= 0) && (arrayOfInt[1] > 200))
      {
        int j = localRect.height();
        GMTrace.o(1236011057152L, 9209);
        return i - j;
      }
      i = localRect.top;
      GMTrace.o(1236011057152L, 9209);
      return i;
    }
    i = com.tencent.mm.br.a.fromDPToPix(paramContext, 20);
    GMTrace.o(1236011057152L, 9209);
    return i;
  }
  
  public static void g(MMActivity paramMMActivity)
  {
    GMTrace.i(1235474186240L, 9205);
    if (Build.VERSION.SDK_INT >= 16) {
      paramMMActivity.aq(109);
    }
    GMTrace.o(1235474186240L, 9205);
  }
  
  public static void h(MMActivity paramMMActivity)
  {
    GMTrace.i(1235608403968L, 9206);
    if (Build.VERSION.SDK_INT >= 16) {
      paramMMActivity.getWindow().getDecorView().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(725581037568L, 5406);
          this.jLn.getWindow().getDecorView().setSystemUiVisibility(this.jLn.getWindow().getDecorView().getSystemUiVisibility() | 0x100);
          int i = com.tencent.mm.compatible.util.a.f(this.jLn);
          w.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to bodyView, height: %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.br.a.fromDPToPix(this.jLn, 2)) });
          this.jLn.vKB.vKI.setPadding(0, i - com.tencent.mm.br.a.fromDPToPix(this.jLn, 2), 0, 0);
          GMTrace.o(725581037568L, 5406);
        }
      });
    }
    GMTrace.o(1235608403968L, 9206);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */