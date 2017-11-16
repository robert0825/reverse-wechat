package com.tencent.mm.plugin.recharge.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static final int[] odC;
  public static final int[] odD;
  public int eDi;
  public String name;
  public String odE;
  public String odF;
  public int[] odG;
  
  static
  {
    GMTrace.i(7855763619840L, 58530);
    odC = new int[] { -1, -1 };
    odD = new int[] { -2, -2 };
    GMTrace.o(7855763619840L, 58530);
  }
  
  public a(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, "", paramInt);
    GMTrace.i(7855226748928L, 58526);
    GMTrace.o(7855226748928L, 58526);
  }
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(7855360966656L, 58527);
    this.odG = odC;
    this.odE = paramString1;
    this.name = paramString2;
    this.odF = paramString3;
    this.eDi = paramInt;
    GMTrace.o(7855360966656L, 58527);
  }
  
  public static a K(JSONObject paramJSONObject)
  {
    GMTrace.i(7855629402112L, 58529);
    String str1 = paramJSONObject.optString("name");
    String str2 = paramJSONObject.optString("record");
    paramJSONObject = paramJSONObject.optString("location");
    if (!bg.nm(str2))
    {
      paramJSONObject = new a(str2, str1, paramJSONObject, 2);
      GMTrace.o(7855629402112L, 58529);
      return paramJSONObject;
    }
    GMTrace.o(7855629402112L, 58529);
    return null;
  }
  
  public final JSONObject bam()
  {
    GMTrace.i(7855495184384L, 58528);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("record", bg.aq(this.odE, ""));
      localJSONObject.put("name", bg.aq(this.name, ""));
      localJSONObject.put("location", bg.aq(this.odF, ""));
      GMTrace.o(7855495184384L, 58528);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.MallInputRecord", localJSONException, "", new Object[0]);
      GMTrace.o(7855495184384L, 58528);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */