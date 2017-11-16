package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class i
{
  JSONObject lMl;
  
  protected i(String paramString)
  {
    GMTrace.i(12602105135104L, 93893);
    this.lMl = new JSONObject();
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.GameServerData", "Null or nil json string");
      GMTrace.o(12602105135104L, 93893);
      return;
    }
    try
    {
      this.lMl = new JSONObject(paramString);
      GMTrace.o(12602105135104L, 93893);
      return;
    }
    catch (JSONException paramString)
    {
      w.e("MicroMsg.GameServerData", "Json parsing error");
      GMTrace.o(12602105135104L, 93893);
    }
  }
  
  private static String d(JSONObject paramJSONObject, String paramString)
  {
    GMTrace.i(12602373570560L, 93895);
    if (paramJSONObject == null)
    {
      GMTrace.o(12602373570560L, 93895);
      return null;
    }
    if (paramJSONObject.isNull(paramString))
    {
      GMTrace.o(12602373570560L, 93895);
      return null;
    }
    paramJSONObject = paramJSONObject.optString(paramString);
    GMTrace.o(12602373570560L, 93895);
    return paramJSONObject;
  }
  
  protected static LinkedList<c> n(JSONArray paramJSONArray)
  {
    GMTrace.i(12602507788288L, 93896);
    LinkedList localLinkedList = new LinkedList();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      w.i("MicroMsg.GameServerData", "Null or empty json array");
      GMTrace.o(12602507788288L, 93896);
      return localLinkedList;
    }
    w.i("MicroMsg.GameServerData", "Parsing json AppInfo, size: %d", new Object[] { Integer.valueOf(paramJSONArray.length()) });
    int i = 0;
    if (i < paramJSONArray.length())
    {
      Object localObject = paramJSONArray.optJSONObject(i);
      if (localObject == null)
      {
        w.e("MicroMsg.GameServerData", "Invalid json object");
        localObject = null;
      }
      for (;;)
      {
        if (localObject != null) {
          localLinkedList.add(localObject);
        }
        i += 1;
        break;
        JSONObject localJSONObject = ((JSONObject)localObject).optJSONObject("YYB");
        String str = d((JSONObject)localObject, "appID");
        if (bg.nm(str))
        {
          w.e("MicroMsg.GameServerData", "No AppID field, abort");
          localObject = null;
        }
        else
        {
          w.i("MicroMsg.GameServerData", "Parsing AppID: %s", new Object[] { str });
          c localc = new c();
          localc.field_appId = str;
          localc.field_appName = d((JSONObject)localObject, "name");
          localc.field_appIconUrl = d((JSONObject)localObject, "iconURL");
          localc.field_appType = ",1,";
          localc.field_packageName = d((JSONObject)localObject, "AndroidPackageName");
          localc.bX(d((JSONObject)localObject, "downloadURL"));
          localc.ca(d((JSONObject)localObject, "AndroidApkMd5"));
          str = d((JSONObject)localObject, "GooglePlayDownloadUrl");
          int j = ((JSONObject)localObject).optInt("GooglePlayDownloadFlag");
          localc.cb(str);
          if (!bg.nm(str))
          {
            w.i("MicroMsg.GameServerData", "GooglePlay URL: %s, Download Flag: %d", new Object[] { str, Integer.valueOf(j) });
            localc.dg(j);
          }
          if (localJSONObject != null) {
            localc.dg(localJSONObject.optInt("AndroidDownloadFlag"));
          }
          if (localJSONObject != null)
          {
            localc.cg(d(localJSONObject, "DownloadUrl"));
            localc.ch(d(localJSONObject, "ApkMd5"));
            localc.ce(d(localJSONObject, "PreemptiveUrl"));
            localc.cf(d(localJSONObject, "ExtInfo"));
            localc.dh(localJSONObject.optInt("SupportedVersionCode"));
          }
          localc.lLw = d((JSONObject)localObject, "desc");
          localc.lLv = d((JSONObject)localObject, "brief");
          localc.type = ((JSONObject)localObject).optInt("type", 0);
          localc.status = ((JSONObject)localObject).optInt("status");
          localc.lLy = d((JSONObject)localObject, "webURL");
          localc.lLz = d((JSONObject)localObject, "adUrl");
          localc.eBv = d((JSONObject)localObject, "noticeid");
          localc.lLA = ((JSONObject)localObject).optBoolean("isSubscribed");
          localc.versionCode = ((JSONObject)localObject).optInt("versionCode");
          localObject = localc;
          if (localJSONObject != null)
          {
            localc.lLB = d(localJSONObject, "DownloadTipsWording");
            localc.lLC = d(localJSONObject, "BackBtnWording");
            localc.lLD = d(localJSONObject, "DownloadBtnWording");
            localObject = localc;
          }
        }
      }
    }
    GMTrace.o(12602507788288L, 93896);
    return localLinkedList;
  }
  
  protected final JSONArray optJSONArray(String paramString)
  {
    GMTrace.i(12602239352832L, 93894);
    paramString = this.lMl.optJSONArray(paramString);
    GMTrace.o(12602239352832L, 93894);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */