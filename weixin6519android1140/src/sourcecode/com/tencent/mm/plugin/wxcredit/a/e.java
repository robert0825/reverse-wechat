package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends h
{
  public List<l> skv;
  public int skw;
  public String token;
  
  public e(String paramString)
  {
    GMTrace.i(8990037639168L, 66981);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serialno", paramString);
    x(localHashMap);
    GMTrace.o(8990037639168L, 66981);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8990306074624L, 66983);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(8990306074624L, 66983);
      return;
    }
    for (;;)
    {
      try
      {
        this.token = paramJSONObject.getString("session_key");
        this.skw = paramJSONObject.optInt("answer_times_left", -1);
        paramString = paramJSONObject.getJSONArray("Array");
        if ((paramString == null) || (paramString.length() <= 0)) {
          break label323;
        }
        paramJSONObject = new HashMap();
        int i = paramString.length();
        paramInt = 0;
        if (paramInt < i)
        {
          JSONObject localJSONObject = paramString.getJSONObject(paramInt);
          l locall = new l();
          locall.id = localJSONObject.getString("qt_id");
          locall.skP = localJSONObject.getString("parent_id");
          locall.type = localJSONObject.getString("qt_type");
          locall.desc = localJSONObject.getString("qt_cont");
          locall.skQ = localJSONObject.getInt("ans_len");
          locall.jBl = localJSONObject.getString("wording");
          locall.level = localJSONObject.getInt("level");
          if ((paramJSONObject.containsKey(locall.skP)) && (!"0".equals(locall.skP))) {
            ((l)paramJSONObject.get(locall.skP)).skR = locall;
          } else {
            paramJSONObject.put(locall.id, locall);
          }
        }
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        GMTrace.o(8990306074624L, 66983);
        return;
      }
      this.skv = new ArrayList(paramJSONObject.values());
      paramJSONObject.clear();
      label323:
      GMTrace.o(8990306074624L, 66983);
      return;
      paramInt += 1;
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(8990171856896L, 66982);
    GMTrace.o(8990171856896L, 66982);
    return 59;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */