package com.tencent.mm.plugin.base.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Process;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.t;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  public static final String jiQ;
  private static String jiR;
  private static char[] jiS;
  
  static
  {
    GMTrace.i(12825174999040L, 95555);
    jiQ = ab.getPackageName();
    jiR = "";
    jiS = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    GMTrace.o(12825174999040L, 95555);
  }
  
  public static boolean J(Context paramContext, String paramString)
  {
    GMTrace.i(20354655322112L, 151654);
    jiR = q.zE();
    paramString = a(paramContext, paramString, true, jiR);
    Intent localIntent = (Intent)paramString.getParcelableExtra("android.intent.extra.shortcut.INTENT");
    if (localIntent == null)
    {
      GMTrace.o(20354655322112L, 151654);
      return false;
    }
    a(paramContext, paramString, localIntent.getStringExtra("app_shortcut_custom_id"), true);
    GMTrace.o(20354655322112L, 151654);
    return true;
  }
  
  public static boolean K(Context paramContext, String paramString)
  {
    GMTrace.i(20355326410752L, 151659);
    jiR = q.zE();
    o(paramContext, a(paramContext, paramString, false, jiR));
    GMTrace.o(20355326410752L, 151659);
    return true;
  }
  
  public static String W(byte[] paramArrayOfByte)
  {
    GMTrace.i(12824906563584L, 95553);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(12824906563584L, 95553);
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      localStringBuilder.append(jiS[((paramArrayOfByte[i] & 0xF0) >>> 4)]);
      localStringBuilder.append(jiS[(paramArrayOfByte[i] & 0xF)]);
      i += 1;
    }
    paramArrayOfByte = localStringBuilder.toString();
    GMTrace.o(12824906563584L, 95553);
    return paramArrayOfByte;
  }
  
  private static Intent a(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    GMTrace.i(12824235474944L, 95548);
    if ((paramString1 == null) || (paramContext == null))
    {
      w.e("MicroMsg.ShortcutManager", "getIntent, wrong parameters");
      GMTrace.o(12824235474944L, 95548);
      return null;
    }
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * 48.0F);
    Object localObject2 = com.tencent.mm.ac.b.a(paramString1, false, -1);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      w.e("MicroMsg.ShortcutManager", "getScaledBitmap fail, bmp is null");
      localObject1 = d.Ag(a.d.aVS);
    }
    if (localObject1 == null) {
      w.e("MicroMsg.ShortcutManager", "use default avatar, bmp is null");
    }
    for (localObject1 = null; localObject1 == null; localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject1, i, i, false))
    {
      w.e("MicroMsg.ShortcutManager", "no bmp");
      GMTrace.o(12824235474944L, 95548);
      return null;
    }
    localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString1);
    if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).fTq <= 0))
    {
      w.e("MicroMsg.ShortcutManager", "no such user");
      GMTrace.o(12824235474944L, 95548);
      return null;
    }
    String str = tt(paramString1);
    w.i("MicroMsg.ShortcutManager", "alvinluo encryptShortcutUser: %s", new Object[] { str });
    if (bg.nm(str))
    {
      GMTrace.o(12824235474944L, 95548);
      return null;
    }
    Intent localIntent = new Intent("com.tencent.mm.action.BIZSHORTCUT");
    localIntent.putExtra("LauncherUI.Shortcut.Username", str);
    localIntent.putExtra("LauncherUI.From.Biz.Shortcut", true);
    localIntent.putExtra("app_shortcut_custom_id", str);
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.addFlags(67108864);
    if (paramBoolean) {}
    for (paramContext = "com.android.launcher.action.INSTALL_SHORTCUT";; paramContext = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      paramContext = new Intent(paramContext);
      paramContext.putExtra("android.intent.extra.shortcut.NAME", s.a((x)localObject2, paramString1));
      paramContext.putExtra("duplicate", false);
      paramContext.putExtra("android.intent.extra.shortcut.INTENT", localIntent);
      paramContext.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)localObject1);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_SOURCE_KEY", jiQ);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_OWNER_ID", tt(paramString2));
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_UNIQUE_ID", str);
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_TYPE", y((x)localObject2));
      paramContext.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_CONTAINER", 0);
      GMTrace.o(12824235474944L, 95548);
      return paramContext;
    }
  }
  
  public static void a(Context paramContext, Intent paramIntent, String paramString, boolean paramBoolean)
  {
    GMTrace.i(20354923757568L, 151656);
    if (paramContext == null)
    {
      w.e("MicroMsg.ShortcutManager", "context is null");
      GMTrace.o(20354923757568L, 151656);
      return;
    }
    if (paramIntent == null)
    {
      w.e("MicroMsg.ShortcutManager", "intent is null");
      GMTrace.o(20354923757568L, 151656);
      return;
    }
    if (Build.VERSION.SDK_INT < 26)
    {
      paramContext.sendBroadcast(paramIntent);
      b(paramContext, true, true);
      i = 1;
    }
    label75:
    ShortcutManager localShortcutManager;
    Intent localIntent;
    for (;;)
    {
      if ((i == 0) && (paramBoolean)) {
        b(paramContext, false, paramBoolean);
      }
      GMTrace.o(20354923757568L, 151656);
      return;
      localShortcutManager = (ShortcutManager)paramContext.getSystemService(ShortcutManager.class);
      if (localShortcutManager == null)
      {
        w.e("MicroMsg.ShortcutManager", "shortcut manager is null");
        i = 0;
      }
      else if (!localShortcutManager.isRequestPinShortcutSupported())
      {
        w.e("MicroMsg.ShortcutManager", "alvinluo not support pin shortcuts");
        i = 0;
      }
      else if (paramIntent.getBooleanExtra("is_main_shortcut", false))
      {
        w.i("MicroMsg.ShortcutManager", "alvinluo main icon, do not create shortcut");
        i = 0;
      }
      else
      {
        localIntent = (Intent)paramIntent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        if (localIntent != null) {
          break;
        }
        w.e("MicroMsg.ShortcutManager", "alvinluo shortcut intent is null");
        i = 0;
      }
    }
    String str1 = paramString;
    if (bg.nm(paramString)) {
      str1 = localIntent.getStringExtra("app_shortcut_custom_id");
    }
    if (bg.nm(str1))
    {
      w.i("MicroMsg.ShortcutManager", "alvinluo shortcutId is null, then use short name as shortcutId");
      str1 = paramIntent.getStringExtra("android.intent.extra.shortcut.NAME");
    }
    for (int i = 1;; i = 0)
    {
      w.i("MicroMsg.ShortcutManager", "alvinluo shortcutId: %s", new Object[] { str1 });
      String str2 = paramIntent.getStringExtra("android.intent.extra.shortcut.NAME");
      paramString = (Intent.ShortcutIconResource)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
      if (paramString != null) {
        w.i("MicroMsg.ShortcutManager", "alvinluo icon resource name: %s, %s", new Object[] { paramString.resourceName, paramString.packageName });
      }
      Object localObject = (Bitmap)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON");
      paramString = (String)localObject;
      if (localObject == null)
      {
        w.i("MicroMsg.ShortcutManager", "extra_shortcut_icon is null, use icon resource id");
        j = paramIntent.getIntExtra("shortcut_icon_resource_id", -1);
        if (j == -1)
        {
          w.e("MicroMsg.ShortcutManager", "icon resource id is null");
          i = 0;
          break label75;
        }
        paramString = BitmapFactory.decodeResource(paramContext.getResources(), j);
      }
      if (paramString == null)
      {
        w.e("MicroMsg.ShortcutManager", "icon bitmap is null");
        i = 0;
        break label75;
      }
      boolean bool = paramIntent.getBooleanExtra("shortcut_is_adaptive_icon", false);
      localObject = new ShortcutInfo.Builder(paramContext, str1).setShortLabel(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME")).setLongLabel(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME")).setIntent(localIntent);
      if (bool) {
        ((ShortcutInfo.Builder)localObject).setIcon(Icon.createWithBitmap(paramString));
      }
      for (;;)
      {
        paramString = ((ShortcutInfo.Builder)localObject).build();
        bool = paramIntent.getBooleanExtra("duplicate", false);
        w.i("MicroMsg.ShortcutManager", "alvinluo add shortcut above android o, duplicate: %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break label535;
        }
        localShortcutManager.requestPinShortcut(paramString, null);
        b(paramContext, true, true);
        break;
        ((ShortcutInfo.Builder)localObject).setIcon(Icon.createWithAdaptiveBitmap(paramString));
      }
      label535:
      paramIntent = localShortcutManager.getPinnedShortcuts();
      int j = 0;
      label544:
      if (j < paramIntent.size())
      {
        localObject = (ShortcutInfo)paramIntent.get(j);
        if (i != 0)
        {
          if ((localObject == null) || (((ShortcutInfo)localObject).getShortLabel() == null) || (!((ShortcutInfo)localObject).getShortLabel().equals(str2))) {
            break label703;
          }
          bool = true;
        }
      }
      for (;;)
      {
        w.i("MicroMsg.ShortcutManager", "alvinluo shortcut exist: %b, shortcutName: %s", new Object[] { Boolean.valueOf(bool), str2 });
        if (bool)
        {
          paramIntent = new ArrayList();
          paramIntent.add(paramString);
          w.i("MicroMsg.ShortcutManager", "alvinluo update shortcuts result: %b", new Object[] { Boolean.valueOf(localShortcutManager.updateShortcuts(paramIntent)) });
          b(paramContext, true, true);
          break;
          if ((localObject != null) && (((ShortcutInfo)localObject).getId().equals(str1)))
          {
            bool = true;
            continue;
          }
          label703:
          j += 1;
          break label544;
        }
        if (paramBoolean)
        {
          paramIntent = localShortcutManager.createShortcutResultIntent(paramString);
          paramIntent.setClass(paramContext, ShortcutBroadCastReceiver.class);
          localShortcutManager.requestPinShortcut(paramString, PendingIntent.getBroadcast(paramContext, 0, paramIntent, 134217728).getIntentSender());
          break;
        }
        localShortcutManager.requestPinShortcut(paramString, null);
        break;
        bool = false;
      }
    }
  }
  
  private static void b(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(20355192193024L, 151658);
    if (paramBoolean2) {
      if (!paramBoolean1) {
        break label41;
      }
    }
    label41:
    for (String str = paramContext.getString(a.h.cRL);; str = paramContext.getString(a.h.kbV))
    {
      com.tencent.mm.ui.base.h.bm(paramContext, str);
      GMTrace.o(20355192193024L, 151658);
      return;
    }
  }
  
  public static String bt(String paramString1, String paramString2)
  {
    GMTrace.i(12824503910400L, 95550);
    int[] arrayOfInt;
    byte[] arrayOfByte;
    int i;
    for (;;)
    {
      try
      {
        arrayOfInt = new int['Ā'];
        arrayOfByte = new byte['Ā'];
        i = 0;
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.ShortcutManager", "Exception in rc4, %s", new Object[] { paramString1.getMessage() });
        w.printErrStackTrace("MicroMsg.ShortcutManager", paramString1, "", new Object[0]);
        GMTrace.o(12824503910400L, 95550);
        return null;
      }
      if (i >= 256) {
        break label258;
      }
      arrayOfByte[i] = ((byte)paramString2.charAt(i % paramString2.length()));
      i = (short)(i + 1);
    }
    for (;;)
    {
      paramString1 = paramString1.toCharArray();
      paramString2 = new char[paramString1.length];
      i = 0;
      int k = 0;
      int j = 0;
      while (i < paramString1.length)
      {
        k = (k + 1) % 256;
        j = (j + arrayOfInt[k]) % 256;
        int m = arrayOfInt[k];
        arrayOfInt[k] = arrayOfInt[j];
        arrayOfInt[j] = m;
        m = arrayOfInt[((arrayOfInt[k] + arrayOfInt[j] % 256) % 256)];
        int n = paramString1[i];
        paramString2[i] = ((char)((char)m ^ n));
        i = (short)(i + 1);
      }
      paramString1 = new String(paramString2);
      GMTrace.o(12824503910400L, 95550);
      return paramString1;
      while (i < 256)
      {
        arrayOfInt[i] = i;
        i += 1;
      }
      i = 0;
      break;
      label258:
      i = 0;
      j = 0;
      while (i < 255)
      {
        j = (j + arrayOfInt[i] + arrayOfByte[i]) % 256;
        k = arrayOfInt[i];
        arrayOfInt[i] = arrayOfInt[j];
        arrayOfInt[j] = k;
        i += 1;
      }
    }
  }
  
  public static void m(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(20354789539840L, 151655);
    a(paramContext, paramIntent, null, true);
    GMTrace.o(20354789539840L, 151655);
  }
  
  public static void n(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(20355057975296L, 151657);
    a(paramContext, paramIntent, null, false);
    GMTrace.o(20355057975296L, 151657);
  }
  
  public static boolean o(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(20355460628480L, 151660);
    if (paramContext == null)
    {
      w.e("MicroMsg.ShortcutManager", "context is null");
      GMTrace.o(20355460628480L, 151660);
      return false;
    }
    if (paramIntent == null)
    {
      w.e("MicroMsg.ShortcutManager", "intent is null");
      GMTrace.o(20355460628480L, 151660);
      return false;
    }
    if (Build.VERSION.SDK_INT < 26)
    {
      paramContext.sendBroadcast(paramIntent);
      GMTrace.o(20355460628480L, 151660);
      return true;
    }
    GMTrace.o(20355460628480L, 151660);
    return true;
  }
  
  public static String ts(String paramString)
  {
    GMTrace.i(12824638128128L, 95551);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(12824638128128L, 95551);
      return null;
    }
    String str1 = bg.r(ab.getContext(), Process.myPid());
    String str2 = ab.getPackageName();
    w.i("MicroMsg.ShortcutManager", "process name: %s", new Object[] { str1 });
    try
    {
      if (str2.equals(str1))
      {
        boolean bool = com.tencent.mm.kernel.h.xw().wL();
        if (!bool)
        {
          GMTrace.o(12824638128128L, 95551);
          return null;
        }
        com.tencent.mm.kernel.h.xw();
      }
      for (int i = com.tencent.mm.kernel.a.ww(); paramString.startsWith("shortcut_"); i = aa.OY().hgw.ww())
      {
        paramString = bt(new String(tu(paramString.substring(9))), String.valueOf(i));
        GMTrace.o(12824638128128L, 95551);
        return paramString;
      }
      GMTrace.o(12824638128128L, 95551);
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.ShortcutManager", null, "exception: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(12824638128128L, 95551);
      return null;
    }
    return paramString;
  }
  
  public static String tt(String paramString)
  {
    GMTrace.i(12824772345856L, 95552);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(12824772345856L, 95552);
      return null;
    }
    Object localObject = bg.r(ab.getContext(), Process.myPid());
    String str = ab.getPackageName();
    if ((str.equals(localObject)) && (!com.tencent.mm.kernel.h.xw().wL()))
    {
      GMTrace.o(12824772345856L, 95552);
      return null;
    }
    w.i("MicroMsg.ShortcutManager", "process name: %s", new Object[] { localObject });
    try
    {
      if (str.equals(localObject))
      {
        localObject = new StringBuilder();
        com.tencent.mm.kernel.h.xw();
      }
      for (paramString = bt(paramString, com.tencent.mm.kernel.a.ww()); bg.nm(paramString); paramString = bt(paramString, aa.OY().hgw.ww()))
      {
        GMTrace.o(12824772345856L, 95552);
        return null;
      }
      paramString = "shortcut_" + W(paramString.getBytes());
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.ShortcutManager", null, "exception: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(12824772345856L, 95552);
      return null;
    }
    GMTrace.o(12824772345856L, 95552);
    return paramString;
  }
  
  public static final byte[] tu(String paramString)
  {
    GMTrace.i(12825040781312L, 95554);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(12825040781312L, 95554);
      return null;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = ((byte)Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16));
      i += 1;
    }
    GMTrace.o(12825040781312L, 95554);
    return arrayOfByte;
  }
  
  public static int y(x paramx)
  {
    GMTrace.i(12824369692672L, 95549);
    if (paramx.bSA())
    {
      GMTrace.o(12824369692672L, 95549);
      return 2;
    }
    if (!s.gn(paramx.field_username))
    {
      GMTrace.o(12824369692672L, 95549);
      return 1;
    }
    GMTrace.o(12824369692672L, 95549);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\base\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */