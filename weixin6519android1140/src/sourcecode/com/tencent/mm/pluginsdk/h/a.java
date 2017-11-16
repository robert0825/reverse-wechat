package com.tencent.mm.pluginsdk.h;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;

public final class a
{
  public static boolean a(Activity paramActivity, final String paramString1, final int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(1231850307584L, 9178);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
    {
      GMTrace.o(1231850307584L, 9178);
      return true;
    }
    try
    {
      int i = android.support.v4.content.a.d(paramActivity, paramString1);
      if (i == 0)
      {
        GMTrace.o(1231850307584L, 9178);
        return true;
      }
    }
    catch (Exception paramActivity)
    {
      w.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
      GMTrace.o(1231850307584L, 9178);
      return true;
    }
    if (!bg.nm(paramString3)) {
      h.a(paramActivity, paramString3, paramString2, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1232387178496L, 9182);
          paramAnonymousDialogInterface.dismiss();
          paramAnonymousDialogInterface = this.na;
          String str = paramString1;
          paramAnonymousInt = paramInt;
          android.support.v4.app.a.a(paramAnonymousDialogInterface, new String[] { str }, paramAnonymousInt);
          GMTrace.o(1232387178496L, 9182);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(1231850307584L, 9178);
      return false;
      android.support.v4.app.a.a(paramActivity, new String[] { paramString1 }, paramInt);
    }
  }
  
  public static boolean aS(Context paramContext, String paramString)
  {
    GMTrace.i(1231984525312L, 9179);
    int i;
    try
    {
      i = android.support.v4.content.a.d(paramContext, paramString);
      if (i != 0)
      {
        GMTrace.o(1231984525312L, 9179);
        return false;
      }
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramContext });
      GMTrace.o(1231984525312L, 9179);
      return false;
    }
    String str = null;
    if (paramString.equals("android.permission.READ_CONTACTS"))
    {
      str = "android.permission.WRITE_CONTACTS";
      if (bg.nm(str)) {
        break label152;
      }
    }
    label141:
    label152:
    for (;;)
    {
      try
      {
        i = android.support.v4.content.a.d(paramContext, str);
        if (i != 0) {
          break label141;
        }
        GMTrace.o(1231984525312L, 9179);
        return true;
      }
      catch (Exception paramContext)
      {
        w.e("MicroMsg.MPermissionUtil", "check mpermission otherPermisson exception:%s.", new Object[] { paramContext });
        GMTrace.o(1231984525312L, 9179);
        return false;
      }
      if (!paramString.equals("android.permission.WRITE_CONTACTS")) {
        break;
      }
      str = "android.permission.READ_CONTACTS";
      break;
      GMTrace.o(1231984525312L, 9179);
      return false;
    }
  }
  
  public static void d(Activity paramActivity, String paramString)
  {
    GMTrace.i(1232118743040L, 9180);
    android.support.v4.app.a.a(paramActivity, new String[] { paramString }, 80);
    GMTrace.o(1232118743040L, 9180);
  }
  
  public static boolean f(Activity paramActivity, String paramString)
  {
    GMTrace.i(21068156764160L, 156970);
    if ((Build.VERSION.SDK_INT < 23) && (!"MNC".equals(Build.VERSION.CODENAME)))
    {
      GMTrace.o(21068156764160L, 156970);
      return true;
    }
    try
    {
      int i = android.support.v4.content.a.d(paramActivity, paramString);
      if (i == 0)
      {
        GMTrace.o(21068156764160L, 156970);
        return true;
      }
    }
    catch (Exception paramActivity)
    {
      w.e("MicroMsg.MPermissionUtil", "check mpermission exception:%s.", new Object[] { paramActivity });
      GMTrace.o(21068156764160L, 156970);
      return true;
    }
    GMTrace.o(21068156764160L, 156970);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */