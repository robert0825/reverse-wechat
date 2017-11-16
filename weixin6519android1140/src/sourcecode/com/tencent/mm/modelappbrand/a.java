package com.tencent.mm.modelappbrand;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.f.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static void a(qi paramqi, f.a parama)
  {
    GMTrace.i(15217203347456L, 113377);
    paramqi.eUY.appId = parama.gkS;
    paramqi.eUY.userName = parama.gkR;
    paramqi.eUY.eVa = parama.gkQ;
    paramqi.eUY.eVb = parama.gkY;
    paramqi.eUY.eVd = parama.gkU;
    paramqi.eUY.eVc = parama.gkZ;
    paramqi = paramqi.eUY;
    if (parama.gkY != 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramqi.eVe = bool;
      GMTrace.o(15217203347456L, 113377);
      return;
    }
  }
  
  public static void a(String paramString, int paramInt, f.a parama, Bundle paramBundle)
  {
    GMTrace.i(18658680111104L, 139018);
    qi localqi = new qi();
    a(localqi, parama);
    localqi.eUY.scene = paramInt;
    if (paramInt == 1074) {
      localqi.eUY.eAv = paramString;
    }
    localqi.eUY.eDm = paramBundle;
    com.tencent.mm.sdk.b.a.vgX.m(localqi);
    GMTrace.o(18658680111104L, 139018);
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean, f.a parama, Bundle paramBundle)
  {
    GMTrace.i(16173504659456L, 120502);
    qi localqi = new qi();
    a(localqi, parama);
    qi.a locala = localqi.eUY;
    int i;
    StringBuilder localStringBuilder;
    if (paramBoolean)
    {
      i = 1008;
      locala.scene = i;
      locala = localqi.eUY;
      localStringBuilder = new StringBuilder().append(paramString1);
      if (!paramBoolean) {
        break label149;
      }
    }
    label149:
    for (paramString1 = ":" + paramString2;; paramString1 = "")
    {
      locala.eAv = (paramString1 + ":" + parama.gkW);
      localqi.eUY.eDm = paramBundle;
      com.tencent.mm.sdk.b.a.vgX.m(localqi);
      GMTrace.o(16173504659456L, 120502);
      return;
      i = 1007;
      break;
    }
  }
  
  public static void b(String paramString1, String paramString2, boolean paramBoolean, f.a parama, Bundle paramBundle)
  {
    GMTrace.i(16173638877184L, 120503);
    qi localqi = new qi();
    a(localqi, parama);
    localqi.eUY.scene = 1044;
    localqi.eUY.eAv = parama.gkW;
    qi.a locala = localqi.eUY;
    if (paramBoolean) {}
    for (int i = 2;; i = 1)
    {
      locala.eVi = i;
      locala = localqi.eUY;
      if (paramBoolean) {
        paramString2 = paramString1;
      }
      locala.eVj = paramString2;
      localqi.eUY.eVg.gqY = paramString1;
      localqi.eUY.eVg.gqZ = parama.gkX;
      localqi.eUY.eDm = paramBundle;
      com.tencent.mm.sdk.b.a.vgX.m(localqi);
      GMTrace.o(16173638877184L, 120503);
      return;
    }
  }
  
  public static boolean ho(String paramString)
  {
    GMTrace.i(15217069129728L, 113376);
    if (bg.nm(paramString))
    {
      GMTrace.o(15217069129728L, 113376);
      return false;
    }
    try
    {
      paramString = new JSONObject(paramString).optJSONObject("BindWxaInfo");
      if (paramString != null)
      {
        if (paramString.optInt("openWxaByBizQRCode", 0) > 0)
        {
          GMTrace.o(15217069129728L, 113376);
          return true;
        }
        GMTrace.o(15217069129728L, 113376);
        return false;
      }
    }
    catch (JSONException paramString)
    {
      GMTrace.o(15217069129728L, 113376);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */