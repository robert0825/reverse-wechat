package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class v
{
  public static String TAG;
  public List<a> ePZ;
  
  static
  {
    GMTrace.i(16596693155840L, 123655);
    TAG = "MicroMsg.WalletIndexPayMenu";
    GMTrace.o(16596693155840L, 123655);
  }
  
  public v()
  {
    GMTrace.i(16596424720384L, 123653);
    this.ePZ = new LinkedList();
    h.xz();
    Object localObject = (String)h.xy().xh().get(w.a.vyz, "");
    this.ePZ.clear();
    if (bg.nm((String)localObject))
    {
      GMTrace.o(16596424720384L, 123653);
      return;
    }
    try
    {
      localObject = new JSONArray((String)localObject);
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        a locala = new a();
        locala.riQ = localJSONObject.optInt("paymenu_jump_type");
        locala.riR = localJSONObject.optString("paymenu_jump_url");
        locala.riS = localJSONObject.optString("paymenu_path");
        locala.riT = localJSONObject.optString("paymenu_title");
        locala.riU = localJSONObject.optString("paymenu_username");
        this.ePZ.add(locala);
        i += 1;
      }
      GMTrace.o(16596424720384L, 123653);
      return;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace(TAG, localJSONException, "", new Object[0]);
      GMTrace.o(16596424720384L, 123653);
    }
  }
  
  public static void Kh(String paramString)
  {
    GMTrace.i(16596558938112L, 123654);
    h.xz();
    h.xy().xh().a(w.a.vyz, paramString);
    GMTrace.o(16596558938112L, 123654);
  }
  
  public static final class a
  {
    public int riQ;
    public String riR;
    public String riS;
    public String riT;
    public String riU;
    
    public a()
    {
      GMTrace.i(16596290502656L, 123652);
      GMTrace.o(16596290502656L, 123652);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */