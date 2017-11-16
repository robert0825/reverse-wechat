package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class i
  extends e
{
  private static final int CTRL_INDEX = 153;
  private static final String NAME = "onNetworkStatusChange";
  private static i hXN;
  private static HashSet<String> hXO;
  
  static
  {
    GMTrace.i(10362816561152L, 77209);
    hXO = new HashSet();
    GMTrace.o(10362816561152L, 77209);
  }
  
  public i()
  {
    GMTrace.i(10362279690240L, 77205);
    GMTrace.o(10362279690240L, 77205);
  }
  
  public static void onNetworkChange()
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        GMTrace.i(10362682343424L, 77208);
        HashMap localHashMap = new HashMap();
        localObject2 = ab.getContext();
        boolean bool = am.isConnected((Context)localObject2);
        localHashMap.put("isConnected", Boolean.valueOf(bool));
        if (!bool)
        {
          localHashMap.put("networkType", "none");
          localObject2 = hXO.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          String str = (String)((Iterator)localObject2).next();
          if (hXN == null) {
            hXN = new i();
          }
          hXN.ai(str, 0).r(localHashMap).VR();
          continue;
        }
        if (!am.is2G((Context)localObject2)) {
          break label138;
        }
      }
      finally {}
      ((HashMap)localObject1).put("networkType", "2g");
      continue;
      label138:
      if (am.is3G((Context)localObject2)) {
        ((HashMap)localObject1).put("networkType", "3g");
      } else if (am.is4G((Context)localObject2)) {
        ((HashMap)localObject1).put("networkType", "4g");
      } else if (am.isWifi((Context)localObject2)) {
        ((HashMap)localObject1).put("networkType", "wifi");
      } else {
        ((HashMap)localObject1).put("networkType", "unknown");
      }
    }
    GMTrace.o(10362682343424L, 77208);
  }
  
  public static void qh(String paramString)
  {
    try
    {
      GMTrace.i(10362413907968L, 77206);
      hXO.add(paramString);
      GMTrace.o(10362413907968L, 77206);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static void qi(String paramString)
  {
    try
    {
      GMTrace.i(10362548125696L, 77207);
      hXO.remove(paramString);
      GMTrace.o(10362548125696L, 77207);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */