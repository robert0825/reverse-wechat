package com.tencent.mm.plugin.soter.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.d.a.a;
import com.tencent.d.a.c.g;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static c bqB()
  {
    GMTrace.i(18500437409792L, 137839);
    Object localObject2 = ab.bPV();
    if (localObject2 == null)
    {
      localObject1 = new c();
      GMTrace.o(18500437409792L, 137839);
      return (c)localObject1;
    }
    Object localObject1 = ((SharedPreferences)localObject2).getString("cpu_id", "");
    localObject2 = ((SharedPreferences)localObject2).getString("uid", "");
    if ((!bg.nm((String)localObject1)) && (!bg.nm((String)localObject2)))
    {
      w.i("MicroMsg.SoterDeviceInfoManager", "hy:device info exists in preference. directly return");
      localObject1 = new c((String)localObject1, (String)localObject2);
      GMTrace.o(18500437409792L, 137839);
      return (c)localObject1;
    }
    w.w("MicroMsg.SoterDeviceInfoManager", "hy: no cpu id and uid retrieved. load again");
    localObject2 = a.cpA();
    if (localObject2 != null)
    {
      localObject1 = ((g)localObject2).qpg;
      localObject2 = String.valueOf(((g)localObject2).uid);
      if ((!bg.nm((String)localObject1)) && (!bg.nm((String)localObject2)))
      {
        dS((String)localObject1, (String)localObject2);
        localObject1 = new c((String)localObject1, (String)localObject2);
        GMTrace.o(18500437409792L, 137839);
        return (c)localObject1;
      }
    }
    localObject1 = new c();
    GMTrace.o(18500437409792L, 137839);
    return (c)localObject1;
  }
  
  public static void dS(String paramString1, String paramString2)
  {
    GMTrace.i(18500571627520L, 137840);
    Object localObject = ab.bPV();
    if (localObject == null)
    {
      GMTrace.o(18500571627520L, 137840);
      return;
    }
    w.i("MicroMsg.SoterDeviceInfoManager", "hy: save device info");
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putString("cpu_id", paramString1);
    ((SharedPreferences.Editor)localObject).putString("uid", paramString2);
    ((SharedPreferences.Editor)localObject).apply();
    GMTrace.o(18500571627520L, 137840);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */