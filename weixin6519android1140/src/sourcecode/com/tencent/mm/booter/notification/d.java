package com.tencent.mm.booter.notification;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.queue.NotificationQueue;
import com.tencent.mm.booter.notification.queue.NotificationQueue.ParcelNotificationQueue;
import com.tencent.mm.k.f;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.LauncherUI;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  private static boolean fKB;
  private static boolean fKC;
  private static boolean fKD;
  private static int fKE;
  private static int fKF;
  private static boolean fKG;
  private static String fKH;
  public static boolean fKI;
  public static boolean fKJ;
  private static int fKK;
  private static boolean fKL;
  private static Uri fKM;
  
  static
  {
    GMTrace.i(523851792384L, 3903);
    fKB = true;
    fKC = true;
    fKD = false;
    fKE = -1;
    fKF = -1;
    fKG = true;
    fKH = "samsung";
    fKI = true;
    fKJ = false;
    fKK = -1;
    fKL = true;
    fKM = Uri.parse("content://com.android.badge/badge");
    GMTrace.o(523851792384L, 3903);
  }
  
  public static int a(Notification paramNotification, g paramg)
  {
    GMTrace.i(523314921472L, 3899);
    if ((paramNotification == null) || (!fKB))
    {
      GMTrace.o(523314921472L, 3899);
      return 0;
    }
    int i;
    if (paramg == null) {
      i = 0;
    }
    try
    {
      for (;;)
      {
        paramg = Class.forName("android.app.MiuiNotification").newInstance();
        Field localField = paramg.getClass().getDeclaredField("messageCount");
        localField.setAccessible(true);
        localField.set(paramg, Integer.valueOf(i));
        paramNotification.getClass().getField("extraNotification").set(paramNotification, paramg);
        w.i("MicroMsg.BusinessNotification", "miuiNotification: %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(523314921472L, 3899);
        return i;
        int j = paramg.fLA;
        paramg = com.tencent.mm.booter.notification.queue.b.rH().fLb;
        if (paramg.fLa == null) {
          paramg.restore();
        }
        paramg = paramg.fLa.iterator();
        for (i = 0; paramg.hasNext(); i = ((NotificationItem)paramg.next()).fKU + i) {}
        i = j - i;
      }
    }
    catch (NoSuchFieldException paramNotification)
    {
      for (;;)
      {
        fKB = false;
      }
    }
    catch (IllegalArgumentException paramNotification)
    {
      for (;;)
      {
        fKB = false;
      }
    }
    catch (IllegalAccessException paramNotification)
    {
      for (;;)
      {
        fKB = false;
      }
    }
    catch (ClassNotFoundException paramNotification)
    {
      for (;;)
      {
        fKB = false;
      }
    }
    catch (InstantiationException paramNotification)
    {
      for (;;)
      {
        fKB = false;
      }
    }
    catch (Exception paramNotification)
    {
      for (;;)
      {
        fKB = false;
      }
    }
  }
  
  private static boolean a(Context paramContext, String paramString, int paramInt)
  {
    boolean bool = true;
    GMTrace.i(523717574656L, 3902);
    if (!fKL)
    {
      GMTrace.o(523717574656L, 3902);
      return false;
    }
    for (;;)
    {
      try
      {
        Bundle localBundle = new Bundle();
        if (paramString != null)
        {
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(paramString);
          localBundle.putStringArrayList("app_shortcut_custom_id", localArrayList);
          localBundle.putInt("app_badge_count", paramInt);
          localBundle.putString("app_shortcut_class_name", ab.bPT() + ".ui.LauncherUI");
          paramContext = paramContext.getContentResolver();
          if ((paramContext != null) && (paramContext.call(fKM, "setAppBadgeCount", null, localBundle) != null))
          {
            w.i("MicroMsg.BusinessNotification", "shortcutId: %s, normalNotification badge count: %d, result: %b", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
            GMTrace.o(523717574656L, 3902);
            return bool;
          }
        }
        else
        {
          localBundle.putStringArrayList("app_shortcut_custom_id", null);
          continue;
        }
        bool = false;
      }
      catch (Exception paramContext)
      {
        fKL = false;
        w.i("MicroMsg.BusinessNotification", "no support normal badge");
        w.e("MicroMsg.BusinessNotification", "alvin: no support normal badge");
        GMTrace.o(523717574656L, 3902);
        return false;
      }
    }
  }
  
  public static void aG(boolean paramBoolean)
  {
    GMTrace.i(523180703744L, 3898);
    if (!fKL)
    {
      GMTrace.o(523180703744L, 3898);
      return;
    }
    Object localObject = ab.getContext();
    if (localObject == null)
    {
      GMTrace.o(523180703744L, 3898);
      return;
    }
    localObject = ((Context)localObject).getContentResolver();
    if (localObject == null)
    {
      GMTrace.o(523180703744L, 3898);
      return;
    }
    for (;;)
    {
      int i;
      try
      {
        w.i("MicroMsg.BusinessNotification", "sync all user badge");
        localObject = ((ContentResolver)localObject).call(fKM, "getShortcutList", null, null);
        if (localObject == null)
        {
          w.i("MicroMsg.BusinessNotification", "getShortcutList return null");
          GMTrace.o(523180703744L, 3898);
          return;
        }
        localObject = ((Bundle)localObject).getString("shortcut_list");
        if (localObject != null)
        {
          localObject = new JSONArray((String)localObject);
          i = 0;
          if (i < ((JSONArray)localObject).length())
          {
            String str = ((JSONObject)((JSONArray)localObject).get(i)).getString("app_shortcut_custom_id");
            if ((str == null) || (str.equalsIgnoreCase("null"))) {
              break label232;
            }
            str = com.tencent.mm.plugin.base.model.b.ts(str);
            if (paramBoolean)
            {
              j = 0;
              n(str, j);
              break label232;
            }
            int j = f.dZ(str);
            continue;
          }
        }
        GMTrace.o(523180703744L, 3898);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.BusinessNotification", localException, "sync all user badge: no support getShortcutList", new Object[0]);
        GMTrace.o(523180703744L, 3898);
        return;
      }
      label232:
      i += 1;
    }
  }
  
  public static void dX(int paramInt)
  {
    GMTrace.i(522912268288L, 3896);
    Object localObject;
    int i;
    if ((ab.getContext() != null) && (rG()))
    {
      localObject = ab.getContext();
      if (paramInt != -1) {
        break label260;
      }
      i = f.up();
    }
    for (;;)
    {
      if ((localObject != null) && (rG()) && (fKK != i))
      {
        fKK = i;
        Intent localIntent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        localIntent.putExtra("badge_count", i);
        localIntent.putExtra("badge_count_package_name", ab.getPackageName());
        localIntent.putExtra("badge_count_class_name", LauncherUI.class.getName());
        w.i("MicroMsg.BusinessNotification", "samsungNotification: %d, %s", new Object[] { Integer.valueOf(i), Build.BRAND });
        ((Context)localObject).sendBroadcast(localIntent);
      }
      label153:
      boolean bool;
      if (fKG)
      {
        if (Build.VERSION.SDK_INT < 11) {
          fKG = false;
        }
      }
      else
      {
        if (!fKD) {
          break label417;
        }
        bool = fKC;
        label163:
        if ((!bool) || (fKE == paramInt)) {}
      }
      try
      {
        localObject = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        ((Intent)localObject).putExtra("packageName", ab.getPackageName());
        ((Intent)localObject).putExtra("className", LauncherUI.class.getName());
        ((Intent)localObject).putExtra("notificationNum", paramInt);
        ab.getContext().sendBroadcast((Intent)localObject);
        w.i("MicroMsg.BusinessNotification", "vivo badge: %d", new Object[] { Integer.valueOf(paramInt) });
        o(null, paramInt);
        GMTrace.o(522912268288L, 3896);
        return;
        label260:
        i = paramInt;
        continue;
        if (fKF == paramInt) {
          break label153;
        }
        for (;;)
        {
          try
          {
            localObject = new Bundle();
            ((Bundle)localObject).putString("package", ab.getPackageName());
            ((Bundle)localObject).putString("class", LauncherUI.class.getName());
            ((Bundle)localObject).putInt("badgenumber", paramInt);
            if (ab.getContext().getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, (Bundle)localObject) == null) {
              break label412;
            }
            bool = true;
            fKG = bool;
            w.i("MicroMsg.BusinessNotification", "huawei badge: %d, %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(fKG) });
          }
          catch (Exception localException1)
          {
            w.i("MicroMsg.BusinessNotification", "no huawei badge");
            w.e("MicroMsg.BusinessNotification", "alvin: no badge" + localException1.toString());
            fKG = false;
          }
          break;
          label412:
          bool = false;
        }
        label417:
        fKD = true;
        if (!Build.BRAND.equals("vivo"))
        {
          fKC = false;
          bool = false;
          break label163;
        }
        fKC = true;
        bool = true;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          fKC = false;
          w.printErrStackTrace("MicroMsg.BusinessNotification", localException2, "", new Object[0]);
        }
      }
    }
  }
  
  public static void n(String paramString, int paramInt)
  {
    GMTrace.i(523046486016L, 3897);
    if (t.nm(paramString))
    {
      w.printErrStackTrace("MicroMsg.BusinessNotification", null, "syncUserBadge username is null", new Object[0]);
      GMTrace.o(523046486016L, 3897);
      return;
    }
    paramString = com.tencent.mm.plugin.base.model.b.tt(paramString);
    if (t.nm(paramString))
    {
      GMTrace.o(523046486016L, 3897);
      return;
    }
    o(paramString, paramInt);
    GMTrace.o(523046486016L, 3897);
  }
  
  private static void o(String paramString, int paramInt)
  {
    GMTrace.i(523583356928L, 3901);
    if (ab.getContext() == null)
    {
      w.printErrStackTrace("MicroMsg.BusinessNotification", null, "normal badge context is null", new Object[0]);
      GMTrace.o(523583356928L, 3901);
      return;
    }
    Context localContext = ab.getContext();
    int i = paramInt;
    if (paramInt < 0) {
      i = f.up();
    }
    a(localContext, paramString, i);
    GMTrace.o(523583356928L, 3901);
  }
  
  private static boolean rG()
  {
    GMTrace.i(523449139200L, 3900);
    if (fKJ)
    {
      boolean bool = fKI;
      GMTrace.o(523449139200L, 3900);
      return bool;
    }
    fKJ = true;
    if (!Build.BRAND.equals(fKH))
    {
      fKI = false;
      GMTrace.o(523449139200L, 3900);
      return false;
    }
    fKI = true;
    GMTrace.o(523449139200L, 3900);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */