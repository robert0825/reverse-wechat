package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

public final class a
{
  public static String g(JSONArray paramJSONArray)
  {
    GMTrace.i(16542066540544L, 123248);
    if (paramJSONArray == null) {}
    for (String str = null;; str = paramJSONArray.toString())
    {
      w.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translating string array: %s", new Object[] { str });
      if ((paramJSONArray != null) && (paramJSONArray.length() != 0)) {
        break;
      }
      GMTrace.o(16542066540544L, 123248);
      return "0x00";
    }
    int i = 0;
    int j = 0;
    for (;;)
    {
      if (i >= paramJSONArray.length()) {
        break label113;
      }
      try
      {
        int k = qq(paramJSONArray.getString(i));
        j = (byte)(j | k);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AppBrandSoterTranslateUtil", localJSONException, "hy: json error in translate", new Object[0]);
        }
      }
      i += 1;
    }
    label113:
    paramJSONArray = "0x" + Integer.toHexString(j);
    w.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translated bitsetStr: %s", new Object[] { paramJSONArray });
    GMTrace.o(16542066540544L, 123248);
    return paramJSONArray;
  }
  
  public static JSONArray iC(int paramInt)
  {
    GMTrace.i(16541932322816L, 123247);
    if (paramInt <= 0)
    {
      localObject = new JSONArray();
      GMTrace.o(16541932322816L, 123247);
      return (JSONArray)localObject;
    }
    Object localObject = new ArrayList(3);
    if ((paramInt & 0x1) == 1) {
      ((ArrayList)localObject).add("fingerPrint");
    }
    if ((paramInt & 0x8) == 8) {
      ((ArrayList)localObject).add("facial");
    }
    if ((paramInt & 0x2) == 2) {
      ((ArrayList)localObject).add("speech");
    }
    w.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: final string is: %s", new Object[] { ((ArrayList)localObject).toString() });
    localObject = new JSONArray((Collection)localObject);
    GMTrace.o(16541932322816L, 123247);
    return (JSONArray)localObject;
  }
  
  public static int qq(String paramString)
  {
    GMTrace.i(19833353666560L, 147770);
    if ("fingerPrint".equals(paramString))
    {
      GMTrace.o(19833353666560L, 147770);
      return 1;
    }
    if ("facial".equals(paramString))
    {
      GMTrace.o(19833353666560L, 147770);
      return 8;
    }
    if ("speech".equals(paramString))
    {
      GMTrace.o(19833353666560L, 147770);
      return 2;
    }
    w.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
    GMTrace.o(19833353666560L, 147770);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bio\soter\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */