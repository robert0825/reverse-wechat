package com.tencent.mm.plugin.recharge.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static String Fp(String paramString)
  {
    GMTrace.i(7858447974400L, 58550);
    if (paramString == null)
    {
      GMTrace.o(7858447974400L, 58550);
      return null;
    }
    String str = paramString.replaceAll("\\D", "");
    paramString = str;
    if (str.startsWith("86")) {
      paramString = str.substring(2);
    }
    GMTrace.o(7858447974400L, 58550);
    return paramString;
  }
  
  public static String Fq(String paramString)
  {
    GMTrace.i(7858582192128L, 58551);
    if (paramString == null)
    {
      GMTrace.o(7858582192128L, 58551);
      return "";
    }
    paramString = new StringBuilder(paramString.replaceAll(" ", ""));
    int i = paramString.length();
    if (i >= 4)
    {
      paramString.insert(3, ' ');
      if (i >= 8) {
        paramString.insert(8, ' ');
      }
      paramString = paramString.toString();
      GMTrace.o(7858582192128L, 58551);
      return paramString;
    }
    paramString = paramString.toString();
    GMTrace.o(7858582192128L, 58551);
    return paramString;
  }
  
  public static ArrayList<MallRechargeProduct> a(String paramString, JSONArray paramJSONArray)
  {
    GMTrace.i(7858179538944L, 58548);
    if (paramJSONArray != null) {}
    try
    {
      ArrayList localArrayList2 = new ArrayList();
      int j = paramJSONArray.length();
      int i = 0;
      for (;;)
      {
        localArrayList1 = localArrayList2;
        if (i >= j) {
          break;
        }
        localArrayList2.add(d(paramString, paramJSONArray.getJSONObject(i)));
        i += 1;
      }
      ArrayList localArrayList1 = null;
      GMTrace.o(7858179538944L, 58548);
      return localArrayList1;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.MallLogic", paramString, "", new Object[0]);
      GMTrace.o(7858179538944L, 58548);
    }
    return null;
  }
  
  public static MallRechargeProduct d(String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7858313756672L, 58549);
    MallRechargeProduct localMallRechargeProduct;
    if (paramJSONObject.optInt("need_getlatestinfo", 1) == 1)
    {
      bool = true;
      localMallRechargeProduct = new MallRechargeProduct(bool);
      localMallRechargeProduct.odH = paramString;
      localMallRechargeProduct.eEa = paramJSONObject.getString("product_id");
      localMallRechargeProduct.kry = paramJSONObject.getString("product_name");
      localMallRechargeProduct.odI = paramJSONObject.optString("product_desc");
      localMallRechargeProduct.odJ = (paramJSONObject.getInt("product_min_price") / 100.0F);
      localMallRechargeProduct.odK = (paramJSONObject.getInt("product_max_price") / 100.0F);
      localMallRechargeProduct.appId = paramJSONObject.optString("app_id");
      if (paramJSONObject.getInt("is_infinite") != 1) {
        break label189;
      }
      bool = true;
      label115:
      localMallRechargeProduct.odL = bool;
      localMallRechargeProduct.odM = paramJSONObject.getInt("left_count");
      localMallRechargeProduct.odN = paramJSONObject.getInt("discount");
      if (paramJSONObject.optInt("is_default_choose", 0) != 1) {
        break label194;
      }
    }
    label189:
    label194:
    for (boolean bool = true;; bool = false)
    {
      localMallRechargeProduct.isDefault = bool;
      localMallRechargeProduct.odQ = true;
      localMallRechargeProduct.odO = paramJSONObject.optInt("product_type", 0);
      GMTrace.o(7858313756672L, 58549);
      return localMallRechargeProduct;
      bool = false;
      break;
      bool = false;
      break label115;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */