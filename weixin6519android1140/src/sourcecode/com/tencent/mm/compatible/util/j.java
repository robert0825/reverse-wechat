package com.tencent.mm.compatible.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  private static int fSs;
  private static int fSt;
  private static boolean fSu;
  private static int fSv;
  private static int fSw;
  
  static
  {
    GMTrace.i(13783758012416L, 102697);
    fSs = -1;
    fSt = -1;
    fSu = false;
    fSv = -1;
    fSw = -1;
    GMTrace.o(13783758012416L, 102697);
  }
  
  public static final int aI(Context paramContext)
  {
    GMTrace.i(21019972599808L, 156611);
    if (!fSu)
    {
      if (!aM(paramContext))
      {
        i = ab.bPV().getInt("com.tencent.mm.compatible.util.keybord.height", 690);
        GMTrace.o(21019972599808L, 156611);
        return i;
      }
      i = ab.bPV().getInt("com.tencent.mm.compatible.util.keybord.height", com.tencent.mm.br.a.fromDPToPix(paramContext, 230));
      fSs = i;
      GMTrace.o(21019972599808L, 156611);
      return i;
    }
    int i = aK(paramContext);
    GMTrace.o(21019972599808L, 156611);
    return i;
  }
  
  public static final int aJ(Context paramContext)
  {
    GMTrace.i(13782818488320L, 102690);
    if (!fSu)
    {
      if (fSv > 0)
      {
        i = fSv;
        GMTrace.o(13782818488320L, 102690);
        return i;
      }
      if (!aM(paramContext))
      {
        GMTrace.o(13782818488320L, 102690);
        return 1140;
      }
      i = com.tencent.mm.br.a.fromDPToPix(paramContext, 380);
      fSv = i;
      GMTrace.o(13782818488320L, 102690);
      return i;
    }
    int i = aK(paramContext);
    GMTrace.o(13782818488320L, 102690);
    return i;
  }
  
  public static final int aK(Context paramContext)
  {
    GMTrace.i(13782952706048L, 102691);
    if (fSw > 0)
    {
      i = fSw;
      GMTrace.o(13782952706048L, 102691);
      return i;
    }
    if (!aM(paramContext))
    {
      i = fSw;
      GMTrace.o(13782952706048L, 102691);
      return i * 3;
    }
    int i = com.tencent.mm.br.a.fromDPToPix(paramContext, 230);
    fSw = i;
    GMTrace.o(13782952706048L, 102691);
    return i;
  }
  
  public static final int aL(Context paramContext)
  {
    GMTrace.i(13783221141504L, 102693);
    int i = q(paramContext, -1);
    GMTrace.o(13783221141504L, 102693);
    return i;
  }
  
  private static final boolean aM(Context paramContext)
  {
    GMTrace.i(13783355359232L, 102694);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    if (localContext != null)
    {
      GMTrace.o(13783355359232L, 102694);
      return true;
    }
    GMTrace.o(13783355359232L, 102694);
    return false;
  }
  
  public static boolean aN(Context paramContext)
  {
    GMTrace.i(13783489576960L, 102695);
    paramContext = aO(paramContext);
    if (paramContext[0] < paramContext[1]) {}
    for (int i = 1; i == 1; i = 2)
    {
      GMTrace.o(13783489576960L, 102695);
      return true;
    }
    GMTrace.o(13783489576960L, 102695);
    return false;
  }
  
  public static int[] aO(Context paramContext)
  {
    GMTrace.i(13783623794688L, 102696);
    if (paramContext == null) {
      paramContext = ab.getContext();
    }
    for (;;)
    {
      int[] arrayOfInt = new int[2];
      if ((paramContext instanceof Activity))
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        arrayOfInt[0] = localDisplayMetrics.widthPixels;
        arrayOfInt[1] = localDisplayMetrics.heightPixels;
      }
      for (;;)
      {
        GMTrace.o(13783623794688L, 102696);
        return arrayOfInt;
        paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
        arrayOfInt[0] = paramContext.getWidth();
        arrayOfInt[1] = paramContext.getHeight();
      }
    }
  }
  
  public static final int b(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(13782281617408L, 102686);
    if (!fSu)
    {
      if ((fSs > 0) && (paramBoolean))
      {
        i = fSs;
        GMTrace.o(13782281617408L, 102686);
        return i;
      }
      i = aI(paramContext);
      GMTrace.o(13782281617408L, 102686);
      return i;
    }
    int i = aK(paramContext);
    GMTrace.o(13782281617408L, 102686);
    return i;
  }
  
  @TargetApi(11)
  public static final void g(Activity paramActivity)
  {
    GMTrace.i(13782415835136L, 102687);
    if (paramActivity == null)
    {
      GMTrace.o(13782415835136L, 102687);
      return;
    }
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int j = localRect.top;
    int i;
    if ((paramActivity instanceof AppCompatActivity))
    {
      if (((AppCompatActivity)paramActivity).cN().cO() == null) {
        break label123;
      }
      i = ((AppCompatActivity)paramActivity).cN().cO().getHeight();
    }
    for (;;)
    {
      fSt = paramActivity.getResources().getDisplayMetrics().heightPixels - i - j;
      GMTrace.o(13782415835136L, 102687);
      return;
      if (paramActivity.getActionBar() != null) {
        i = paramActivity.getActionBar().getHeight();
      } else {
        label123:
        i = a.f(paramActivity);
      }
    }
  }
  
  public static int h(Activity paramActivity)
  {
    GMTrace.i(15231430426624L, 113483);
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    GMTrace.o(15231430426624L, 113483);
    return i;
  }
  
  public static final boolean p(Context paramContext, int paramInt)
  {
    GMTrace.i(13782684270592L, 102689);
    if (fSs == paramInt)
    {
      GMTrace.o(13782684270592L, 102689);
      return true;
    }
    if (!aM(paramContext))
    {
      GMTrace.o(13782684270592L, 102689);
      return false;
    }
    if (paramInt < 0)
    {
      GMTrace.o(13782684270592L, 102689);
      return false;
    }
    fSs = paramInt;
    w.d("MicroMsg.KeyBordUtil", "save keybord: %d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool = ab.bPV().edit().putInt("com.tencent.mm.compatible.util.keybord.height", paramInt).commit();
    GMTrace.o(13782684270592L, 102689);
    return bool;
  }
  
  public static final int q(Context paramContext, int paramInt)
  {
    GMTrace.i(13783086923776L, 102692);
    int j = aK(paramContext);
    if (!aN(paramContext))
    {
      i = (int)(j / 1.5D);
      j = aO(paramContext)[0];
      paramInt = i;
      if (i > j / 2) {
        paramInt = j / 2;
      }
      GMTrace.o(13783086923776L, 102692);
      return paramInt;
    }
    int i = paramInt;
    if (paramInt <= 0) {
      i = b(paramContext, true);
    }
    paramInt = aJ(paramContext);
    if (i > paramInt)
    {
      GMTrace.o(13783086923776L, 102692);
      return paramInt;
    }
    if (i < j)
    {
      GMTrace.o(13783086923776L, 102692);
      return j;
    }
    GMTrace.o(13783086923776L, 102692);
    return i;
  }
  
  public static void tF()
  {
    GMTrace.i(13782147399680L, 102685);
    fSu = false;
    GMTrace.o(13782147399680L, 102685);
  }
  
  public static final int tG()
  {
    GMTrace.i(13782550052864L, 102688);
    int i = fSt;
    GMTrace.o(13782550052864L, 102688);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */