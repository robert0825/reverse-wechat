package com.tencent.mm.plugin.exdevice.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static void b(SharedPreferences paramSharedPreferences)
  {
    int i = 0;
    GMTrace.i(10996324237312L, 81929);
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "tryToClearDirtyData");
    if (Build.VERSION.SDK_INT < 11)
    {
      GMTrace.o(10996324237312L, 81929);
      return;
    }
    if (paramSharedPreferences == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == aSP");
      GMTrace.o(10996324237312L, 81929);
      return;
    }
    for (;;)
    {
      String str;
      if (i < 2) {
        str = new String[] { "conneted_device", "shut_down_device" }[i];
      }
      try
      {
        if (paramSharedPreferences.getStringSet(str, null) != null)
        {
          w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "find dirty data, remove it, key = %s", new Object[] { str });
          if (!paramSharedPreferences.edit().remove(str).commit()) {
            w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove dirty data failed!!!");
          }
        }
        i += 1;
        continue;
        GMTrace.o(10996324237312L, 81929);
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public static boolean t(String paramString, long paramLong)
  {
    GMTrace.i(10996458455040L, 81930);
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "isItemInSharedPreferences, key = %s, device id = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      GMTrace.o(10996458455040L, 81930);
      return false;
    }
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      GMTrace.o(10996458455040L, 81930);
      return false;
    }
    b(localSharedPreferences);
    if (!b.cd(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String())))
    {
      GMTrace.o(10996458455040L, 81930);
      return false;
    }
    GMTrace.o(10996458455040L, 81930);
    return true;
  }
  
  public static boolean u(String paramString, long paramLong)
  {
    GMTrace.i(10996592672768L, 81931);
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addToSharedPreferences, key = %s, deviceId = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      GMTrace.o(10996592672768L, 81931);
      return false;
    }
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      GMTrace.o(10996592672768L, 81931);
      return false;
    }
    b(localSharedPreferences);
    String str1 = String.valueOf(paramLong);
    String str2 = localSharedPreferences.getString(paramString, new String());
    w.i("MicroMsg.exdevice.Util", "addDeviceToDeviceList, device = %s, device list = %s", new Object[] { str1, str2 });
    if ((bg.nm(str1)) || (str2 == null))
    {
      w.e("MicroMsg.exdevice.Util", "Error parameters!!!");
      str1 = null;
    }
    while (str1 == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addDeviceToDeviceList failed!!!");
      GMTrace.o(10996592672768L, 81931);
      return false;
      String str3 = new String();
      str2 = str3 + str2;
      str1 = str2 + str1;
      str1 = str1 + "|";
      w.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", new Object[] { str1 });
    }
    if (!localSharedPreferences.edit().putString(paramString, str1).commit())
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit() Failed!!!");
      GMTrace.o(10996592672768L, 81931);
      return false;
    }
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "add to sharepreference successful, new device list is %s", new Object[] { str1 });
    GMTrace.o(10996592672768L, 81931);
    return true;
  }
  
  public static boolean v(String paramString, long paramLong)
  {
    GMTrace.i(10996726890496L, 81932);
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "removeFromSharedPreferences, key = %s, deviceId = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      GMTrace.o(10996726890496L, 81932);
      return false;
    }
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      GMTrace.o(10996726890496L, 81932);
      return false;
    }
    b(localSharedPreferences);
    String str = b.ce(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String()));
    if (str == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove device from device list failed!!!");
      GMTrace.o(10996726890496L, 81932);
      return false;
    }
    if (str.length() == 0) {}
    for (boolean bool = localSharedPreferences.edit().remove(paramString).commit(); !bool; bool = localSharedPreferences.edit().putString(paramString, str).commit())
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit()");
      GMTrace.o(10996726890496L, 81932);
      return false;
    }
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove from sharepreference successful, new device list is %s", new Object[] { str });
    GMTrace.o(10996726890496L, 81932);
    return true;
  }
  
  public static long[] wR(String paramString)
  {
    GMTrace.i(10996861108224L, 81933);
    w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "getListFromSharedPreferences, key = %s", new Object[] { paramString });
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      GMTrace.o(10996861108224L, 81933);
      return null;
    }
    Object localObject = ab.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localObject == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
      GMTrace.o(10996861108224L, 81933);
      return null;
    }
    b((SharedPreferences)localObject);
    try
    {
      localObject = ((SharedPreferences)localObject).getString(paramString, new String()).split("\\|");
      if ((localObject == null) || (localObject.length == 0))
      {
        w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == strDeviceList || 0 == strDeviceList.length");
        GMTrace.o(10996861108224L, 81933);
        return null;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "split failed!!!, %s", new Object[] { paramString.getMessage() });
      GMTrace.o(10996861108224L, 81933);
      return null;
    }
    long[] arrayOfLong = new long[localObject.length];
    int m = localObject.length;
    int j = 0;
    i = 0;
    if (j < m)
    {
      paramString = localObject[j];
      for (;;)
      {
        try
        {
          w.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "parse %s to long", new Object[] { paramString });
          k = paramString.length();
          if (k != 0) {
            continue;
          }
        }
        catch (Exception paramString)
        {
          try
          {
            arrayOfLong[i] = bg.getLong(paramString, 0L);
            i = k;
          }
          catch (Exception paramString)
          {
            for (;;)
            {
              int k;
              i = k;
            }
          }
          paramString = paramString;
        }
        j += 1;
        break;
        k = i + 1;
        w.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "try pase string device id to long failed : " + paramString.getMessage());
      }
    }
    if (i == 0)
    {
      GMTrace.o(10996861108224L, 81933);
      return null;
    }
    GMTrace.o(10996861108224L, 81933);
    return arrayOfLong;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */