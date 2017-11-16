package com.tencent.mm.ui.snackbar;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  private static boolean xex;
  
  static
  {
    GMTrace.i(2862595702784L, 21328);
    xex = false;
    GMTrace.o(2862595702784L, 21328);
  }
  
  public static void a(int paramInt, Activity paramActivity, String paramString1, String paramString2, b.b paramb, b.c paramc)
  {
    GMTrace.i(2861387743232L, 21319);
    paramActivity = new b.a(paramActivity);
    paramActivity.mMessage = paramString1;
    paramActivity.xey = paramString2;
    paramActivity = paramActivity.a(Short.valueOf((short)2500));
    paramActivity.xeL = paramInt;
    a(paramActivity, paramb, paramc);
    GMTrace.o(2861387743232L, 21319);
  }
  
  public static void a(int paramInt, Fragment paramFragment, String paramString1, String paramString2, b.b paramb, b.c paramc)
  {
    GMTrace.i(2861521960960L, 21320);
    paramFragment = new b.a(paramFragment.getContext(), paramFragment.mView);
    paramFragment.mMessage = paramString1;
    paramFragment.xey = paramString2;
    paramFragment = paramFragment.a(Short.valueOf((short)2500));
    paramFragment.xeL = paramInt;
    a(paramFragment, paramb, paramc);
    GMTrace.o(2861521960960L, 21320);
  }
  
  public static void a(Context paramContext, View paramView, String paramString)
  {
    GMTrace.i(2861656178688L, 21321);
    paramContext = new b.a(paramContext, paramView);
    paramContext.mMessage = paramString;
    paramContext.a(Short.valueOf((short)1500)).chS();
    GMTrace.o(2861656178688L, 21321);
  }
  
  private static void a(b.a parama, b.b paramb, b.c paramc)
  {
    GMTrace.i(2861924614144L, 21323);
    if (paramb != null) {
      parama.xeK.xeE = paramb;
    }
    if (paramc != null) {
      parama.xeK.xeF = paramc;
    }
    parama.chS();
    GMTrace.o(2861924614144L, 21323);
  }
  
  public static boolean awP()
  {
    GMTrace.i(2862058831872L, 21324);
    boolean bool = xex;
    GMTrace.o(2862058831872L, 21324);
    return bool;
  }
  
  public static void c(Activity paramActivity, String paramString1, String paramString2)
  {
    GMTrace.i(2861253525504L, 21318);
    paramActivity = new b.a(paramActivity);
    paramActivity.mMessage = paramString1;
    paramActivity.xey = paramString2;
    paramActivity.xeL = 0;
    a(paramActivity.a(Short.valueOf((short)2500)), null, null);
    GMTrace.o(2861253525504L, 21318);
  }
  
  public static void e(Activity paramActivity, String paramString)
  {
    GMTrace.i(2861790396416L, 21322);
    paramActivity = new b.a(paramActivity);
    paramActivity.mMessage = paramString;
    a(paramActivity.a(Short.valueOf((short)1500)), null, null);
    GMTrace.o(2861790396416L, 21322);
  }
  
  public static void mw(boolean paramBoolean)
  {
    GMTrace.i(2862193049600L, 21325);
    xex = paramBoolean;
    GMTrace.o(2862193049600L, 21325);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\snackbar\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */