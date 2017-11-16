package com.tencent.mm.plugin.wallet_core.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.aw.k;
import com.tencent.mm.aw.t;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.http.util.EncodingUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  private static final String jzw;
  private static Map<String, String> rkl;
  
  static
  {
    GMTrace.i(6916105306112L, 51529);
    jzw = com.tencent.mm.compatible.util.e.ghz + "wallet";
    rkl = null;
    GMTrace.o(6916105306112L, 51529);
  }
  
  public static String EH(String paramString)
  {
    GMTrace.i(6915971088384L, 51528);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.WalletBankLogoStorage", "getStoragePath: but url is null");
      GMTrace.o(6915971088384L, 51528);
      return null;
    }
    paramString = String.format("%s/%s", new Object[] { jzw, g.n(paramString.getBytes()) });
    GMTrace.o(6915971088384L, 51528);
    return paramString;
  }
  
  private static boolean Kq(String paramString)
  {
    GMTrace.i(6915165782016L, 51522);
    try
    {
      rkl = new HashMap();
      w.d("MicroMsg.WalletBankLogoStorage", "bank logo:" + paramString);
      SharedPreferences.Editor localEditor = ab.getContext().getSharedPreferences("bank_logo", 0).edit();
      JSONArray localJSONArray = new JSONObject(paramString).getJSONArray("bank_urls_list");
      int j = localJSONArray.length();
      int i = 0;
      if (i < j)
      {
        Object localObject = localJSONArray.getJSONObject(i);
        if (q.zR()) {}
        for (paramString = ((JSONObject)localObject).optString("bank_desc");; paramString = ((JSONObject)localObject).optString("bank_type"))
        {
          localObject = ((JSONObject)localObject).toString();
          if ((bg.nm(paramString)) || (bg.nm((String)localObject))) {
            break label166;
          }
          localEditor.putString(paramString, (String)localObject);
          rkl.put(paramString, localObject);
          i += 1;
          break;
        }
      }
      label166:
      localEditor.commit();
      w.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      GMTrace.o(6915165782016L, 51522);
      return true;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramString.getMessage() });
      w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "", new Object[0]);
      GMTrace.o(6915165782016L, 51522);
    }
    return false;
  }
  
  private static com.tencent.mm.plugin.wallet_core.model.e aE(Context paramContext, String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(6915568435200L, 51525);
    String str;
    int i;
    if (rkl == null)
    {
      str = ab.getContext().getSharedPreferences("bank_logo", 0).getString(paramString, "");
      if (!bg.nm(str)) {
        break label298;
      }
      h.xz();
      if (h.xy().isSDCardAvailable())
      {
        t.Kj().gI(11);
        k localk = new k(11);
        h.xz();
        h.xx().fYr.a(localk, 0);
      }
      Kq(aF(paramContext, "config/bank_logo.xml"));
      if (rkl == null) {
        break label293;
      }
      str = (String)rkl.get(paramString);
      i = 1;
    }
    for (;;)
    {
      if (!bg.nm(str)) {
        paramContext = new com.tencent.mm.plugin.wallet_core.model.e();
      }
      for (;;)
      {
        try
        {
          paramString = new JSONObject(str);
          long l = paramString.optLong("timestamp", 0L);
          paramContext.nvc = paramString.getString("logo2x_url");
          paramContext.reU = paramString.getString("bg2x_url");
          paramContext.reV = paramString.getString("wl2x_url");
          boolean bool1 = bool2;
          if (i == 0)
          {
            if (System.currentTimeMillis() / 1000L - l > 7200L) {
              bool1 = bool2;
            }
          }
          else
          {
            paramContext.reZ = bool1;
            paramContext.timestamp = l;
            GMTrace.o(6915568435200L, 51525);
            return paramContext;
            str = (String)rkl.get(paramString);
            break;
          }
          bool1 = false;
          continue;
          paramContext = null;
        }
        catch (JSONException paramContext)
        {
          w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "", new Object[0]);
          GMTrace.o(6915568435200L, 51525);
          return null;
        }
      }
      label293:
      i = 1;
      continue;
      label298:
      i = 0;
    }
  }
  
  private static String aF(Context paramContext, String paramString)
  {
    GMTrace.i(6915702652928L, 51526);
    String str = "";
    Object localObject2 = null;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        paramContext = paramContext.getAssets().open(paramString);
        localObject1 = paramContext;
        localObject2 = paramContext;
        paramString = new byte[paramContext.available()];
        localObject1 = paramContext;
        localObject2 = paramContext;
        paramContext.read(paramString);
        localObject1 = paramContext;
        localObject2 = paramContext;
        paramString = EncodingUtils.getString(paramString, "UTF-8");
        localObject1 = paramString;
        paramString = (String)localObject1;
      }
      catch (Exception paramContext)
      {
        localObject2 = localObject1;
        w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "getFromAssets", new Object[0]);
        paramString = str;
        if (localObject1 == null) {
          continue;
        }
        try
        {
          ((InputStream)localObject1).close();
          paramString = str;
        }
        catch (Exception paramContext)
        {
          w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
          paramString = str;
        }
        continue;
      }
      finally
      {
        if (localObject2 == null) {
          break label165;
        }
      }
      try
      {
        paramContext.close();
        paramString = (String)localObject1;
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
        paramString = (String)localObject1;
      }
    }
    GMTrace.o(6915702652928L, 51526);
    return paramString;
    try
    {
      ((InputStream)localObject2).close();
      label165:
      throw paramContext;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "close", new Object[0]);
      }
    }
  }
  
  public static boolean an(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(6915299999744L, 51523);
    long l = System.currentTimeMillis() / 1000L;
    try
    {
      rkl = new HashMap();
      SharedPreferences.Editor localEditor = ab.getContext().getSharedPreferences("bank_logo", 0).edit();
      int j = paramLinkedList.size();
      int i = 0;
      if (i < j)
      {
        Object localObject = new JSONObject((String)paramLinkedList.get(i));
        if (q.zR()) {}
        for (String str = ((JSONObject)localObject).optString("bank_desc");; str = ((JSONObject)localObject).optString("bank_type"))
        {
          ((JSONObject)localObject).put("timestamp", l);
          localObject = ((JSONObject)localObject).toString();
          if ((bg.nm(str)) || (bg.nm((String)localObject))) {
            break label164;
          }
          localEditor.putString(str, (String)localObject);
          rkl.put(str, localObject);
          i += 1;
          break;
        }
      }
      label164:
      localEditor.commit();
      w.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      GMTrace.o(6915299999744L, 51523);
      return true;
    }
    catch (Exception paramLinkedList)
    {
      w.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramLinkedList.getMessage() });
      w.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramLinkedList, "", new Object[0]);
      GMTrace.o(6915299999744L, 51523);
    }
    return false;
  }
  
  public static String bzo()
  {
    GMTrace.i(6915836870656L, 51527);
    String str = jzw;
    GMTrace.o(6915836870656L, 51527);
    return str;
  }
  
  public static com.tencent.mm.plugin.wallet_core.model.e h(Context paramContext, String paramString, boolean paramBoolean)
  {
    GMTrace.i(6915434217472L, 51524);
    if (!paramBoolean)
    {
      paramContext = aE(paramContext, paramString);
      GMTrace.o(6915434217472L, 51524);
      return paramContext;
    }
    Object localObject = null;
    if ("CITIC_CREDIT".equals(paramString))
    {
      com.tencent.mm.plugin.wallet_core.model.e locale = new com.tencent.mm.plugin.wallet_core.model.e();
      locale.reX = a.e.spb;
      locale.reY = a.e.spc;
      paramContext = aE(paramContext, paramString);
      localObject = locale;
      if (paramContext != null)
      {
        locale.nvc = paramContext.nvc;
        localObject = locale;
      }
    }
    GMTrace.o(6915434217472L, 51524);
    return (com.tencent.mm.plugin.wallet_core.model.e)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */