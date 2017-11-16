package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.m;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i
{
  public Map<String, Object> nSp;
  public String rUS;
  Map<String, Object> rUT;
  public String rUU;
  public String type;
  
  public i()
  {
    GMTrace.i(12140933021696L, 90457);
    this.rUT = new HashMap();
    GMTrace.o(12140933021696L, 90457);
  }
  
  public static Bundle ac(Map<String, Object> paramMap)
  {
    GMTrace.i(12141201457152L, 90459);
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      GMTrace.o(12141201457152L, 90459);
      return null;
    }
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if ((localObject instanceof String[])) {
        localBundle.putStringArray(str, (String[])localObject);
      } else if ((localObject instanceof Bundle)) {
        localBundle.putBundle(str, (Bundle)localObject);
      } else {
        localBundle.putString(str, String.valueOf(localObject));
      }
    }
    GMTrace.o(12141201457152L, 90459);
    return localBundle;
  }
  
  public static Map<String, Object> ac(Bundle paramBundle)
  {
    GMTrace.i(12141335674880L, 90460);
    if (paramBundle == null)
    {
      GMTrace.o(12141335674880L, 90460);
      return null;
    }
    Object localObject = paramBundle.keySet();
    if (localObject == null)
    {
      GMTrace.o(12141335674880L, 90460);
      return null;
    }
    HashMap localHashMap = new HashMap();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localHashMap.put(str, paramBundle.get(str));
    }
    GMTrace.o(12141335674880L, 90460);
    return localHashMap;
  }
  
  public final Map<String, Object> bFO()
  {
    GMTrace.i(12141067239424L, 90458);
    Map localMap = this.rUT;
    GMTrace.o(12141067239424L, 90458);
    return localMap;
  }
  
  public static final class a
  {
    private static i MC(String paramString)
    {
      GMTrace.i(12180124598272L, 90749);
      if ((paramString == null) || (paramString.length() == 0))
      {
        w.e("MicroMsg.MsgWrapper", "fromString fail, src is null");
        GMTrace.o(12180124598272L, 90749);
        return null;
      }
      i locali = new i();
      for (;;)
      {
        try
        {
          paramString = new JSONObject(paramString);
          locali.type = paramString.getString("__msg_type");
          locali.rUS = paramString.getString("__callback_id");
          locali.rUU = paramString.getString("func");
          locali.nSp = new HashMap();
          JSONObject localJSONObject = paramString.getJSONObject("params");
          if (localJSONObject == null) {
            break;
          }
          Iterator localIterator = localJSONObject.keys();
          if (!localIterator.hasNext()) {
            break;
          }
          String str = (String)localIterator.next();
          Object localObject = localJSONObject.getString(str);
          paramString = (String)localObject;
          if (localObject == null) {
            paramString = "";
          }
          if ("urls".equalsIgnoreCase(str))
          {
            w.v("MicroMsg.MsgWrapper", "key is JSONArray, %s", new Object[] { str });
            try
            {
              paramString = new JSONArray(paramString);
              localObject = new String[paramString.length()];
              int i = 0;
              if (i < localObject.length)
              {
                localObject[i] = paramString.getString(i);
                i += 1;
                continue;
              }
              locali.nSp.put(str, localObject);
            }
            catch (Exception paramString)
            {
              w.e("MicroMsg.MsgWrapper", "parse JSONArray fail, ex = %s", new Object[] { paramString.getMessage() });
            }
          }
          else
          {
            locali.nSp.put(str, paramString);
          }
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.MsgWrapper", "fromString fail, exception = " + paramString.getMessage());
          GMTrace.o(12180124598272L, 90749);
          return null;
        }
      }
      GMTrace.o(12180124598272L, 90749);
      return locali;
    }
    
    static String a(String paramString1, String paramString2, Map<String, Object> paramMap, JSONObject paramJSONObject, boolean paramBoolean, String paramString3)
    {
      GMTrace.i(12179721945088L, 90746);
      JSONObject localJSONObject = new JSONObject();
      for (;;)
      {
        try
        {
          localJSONObject.put("__msg_type", paramString1);
          if (paramString1.equals("callback"))
          {
            localJSONObject.put("__callback_id", paramString2);
            if (paramJSONObject == null)
            {
              localJSONObject.put("__params", ad(paramMap));
              if (!paramBoolean) {
                break;
              }
              paramString1 = e(localJSONObject, paramString3);
              GMTrace.o(12179721945088L, 90746);
              return paramString1;
            }
          }
          else
          {
            if (!paramString1.equals("event")) {
              continue;
            }
            localJSONObject.put("__event_id", paramString2);
            continue;
          }
          localJSONObject.put("__params", paramJSONObject);
        }
        catch (Exception paramString1)
        {
          w.e("MicroMsg.MsgWrapper", "build fail, exception = " + paramString1.getMessage());
          GMTrace.o(12179721945088L, 90746);
          return null;
        }
      }
      paramString1 = localJSONObject.toString();
      GMTrace.o(12179721945088L, 90746);
      return paramString1;
    }
    
    public static String a(String paramString1, Map<String, Object> paramMap, boolean paramBoolean, String paramString2)
    {
      GMTrace.i(12179587727360L, 90745);
      paramString1 = a("event", paramString1, paramMap, null, paramBoolean, paramString2);
      GMTrace.o(12179587727360L, 90745);
      return paramString1;
    }
    
    public static String a(String paramString1, JSONObject paramJSONObject, boolean paramBoolean, String paramString2)
    {
      GMTrace.i(12179453509632L, 90744);
      paramString1 = a("event", paramString1, null, paramJSONObject, paramBoolean, paramString2);
      GMTrace.o(12179453509632L, 90744);
      return paramString1;
    }
    
    public static JSONObject ad(Map<String, Object> paramMap)
    {
      GMTrace.i(12179990380544L, 90748);
      if ((paramMap == null) || (paramMap.size() == 0))
      {
        paramMap = new JSONObject();
        GMTrace.o(12179990380544L, 90748);
        return paramMap;
      }
      JSONObject localJSONObject;
      for (;;)
      {
        try
        {
          String str1 = (String)paramMap.get("jsapi_callback_json_special_key");
          localJSONObject = new JSONObject();
          Iterator localIterator = paramMap.keySet().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          String str2 = (String)localIterator.next();
          if ((str2 != null) && (!str2.equals("jsapi_callback_json_special_key"))) {
            if ((str1 != null) && (str2.equals(str1))) {
              localJSONObject.put(str1, new JSONArray((String)paramMap.get(str1)));
            } else {
              localJSONObject.put(str2, paramMap.get(str2));
            }
          }
        }
        catch (Exception paramMap)
        {
          w.e("MicroMsg.MsgWrapper", "convertMapToJSON fail, exception = " + paramMap.getMessage());
          GMTrace.o(12179990380544L, 90748);
          return null;
        }
      }
      GMTrace.o(12179990380544L, 90748);
      return localJSONObject;
    }
    
    static List<i> b(String paramString1, boolean paramBoolean, String paramString2)
    {
      int i = 0;
      GMTrace.i(12180258816000L, 90750);
      if ((paramString1 == null) || (paramString1.length() == 0))
      {
        w.e("MicroMsg.MsgWrapper", "getMsgList fail, src is null");
        GMTrace.o(12180258816000L, 90750);
        return null;
      }
      if (paramBoolean) {}
      try
      {
        Object localObject = new JSONObject(paramString1);
        paramString1 = ((JSONObject)localObject).getJSONArray("__json_message");
        localObject = ((JSONObject)localObject).getString("__sha_key");
        paramString2 = m.bi(paramString1.toString().replaceAll("\\\\/", "/") + paramString2);
        if (!((String)localObject).equals(paramString2))
        {
          w.e("MicroMsg.MsgWrapper", "fromString SHA1 verification failed, sha1Str = %s, calSha1Str = %s, jsonList = %s", new Object[] { localObject, paramString2, paramString1.toString().replaceAll("\\\\/", "/") });
          GMTrace.o(12180258816000L, 90750);
          return null;
        }
        for (;;)
        {
          int j = paramString1.length();
          if (j != 0) {
            break;
          }
          GMTrace.o(12180258816000L, 90750);
          return null;
          paramString1 = new JSONArray(paramString1);
        }
        paramString2 = new LinkedList();
        while (i < paramString1.length())
        {
          paramString2.add(MC(paramString1.getString(i)));
          i += 1;
        }
        GMTrace.o(12180258816000L, 90750);
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.MsgWrapper", "dealMsgQueue fail, exception = " + paramString1.getMessage());
        GMTrace.o(12180258816000L, 90750);
        return null;
      }
      return paramString2;
    }
    
    private static String e(JSONObject paramJSONObject, String paramString)
    {
      GMTrace.i(12179856162816L, 90747);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("__json_message", paramJSONObject);
        paramJSONObject = paramJSONObject.toString().replaceAll("\\\\/", "/");
        w.i("MicroMsg.MsgWrapper", "js digest verification contentStr = ", new Object[] { paramJSONObject });
        paramJSONObject = m.bi(paramJSONObject + paramString);
        w.i("MicroMsg.MsgWrapper", "js digest verification shaStr = ", new Object[] { paramJSONObject });
        localJSONObject.put("__sha_key", paramJSONObject);
        paramJSONObject = localJSONObject.toString();
        GMTrace.o(12179856162816L, 90747);
        return paramJSONObject;
      }
      catch (Exception paramJSONObject)
      {
        w.e("MicroMsg.MsgWrapper", "build fail, exception = " + paramJSONObject.getMessage());
        GMTrace.o(12179856162816L, 90747);
      }
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */