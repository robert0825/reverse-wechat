package com.tencent.mm.az;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bat;
import com.tencent.mm.protocal.c.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.q;
import java.io.IOException;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public static bau gRB;
  
  public static String KA()
  {
    GMTrace.i(16178739150848L, 120541);
    bau localbau = Ky();
    int j = localbau.jhd.size();
    Object localObject = new JSONObject();
    try
    {
      JSONArray localJSONArray1 = new JSONArray();
      JSONObject localJSONObject1 = new JSONObject();
      JSONArray localJSONArray2 = new JSONArray();
      int i = 0;
      while ((i < localbau.jhd.size()) && (i < j))
      {
        bat localbat = (bat)localbau.jhd.get(i);
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("word", localbat.uOq);
        localJSONArray2.put(localJSONObject2);
        i += 1;
      }
      localJSONObject1.put("items", localJSONArray2);
      localJSONObject1.put("count", localJSONArray2.length());
      localJSONObject1.put("type", 4);
      localJSONArray1.put(localJSONObject1);
      ((JSONObject)localObject).put("data", localJSONArray1);
      ((JSONObject)localObject).put("ret", 0);
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    localObject = ((JSONObject)localObject).toString();
    GMTrace.o(16178739150848L, 120541);
    return (String)localObject;
  }
  
  public static bau Ky()
  {
    GMTrace.i(15325248618496L, 114182);
    Object localObject;
    if (gRB == null)
    {
      localObject = Kz();
      gRB = new bau();
      localObject = ab.getContext().getSharedPreferences("fts_history_search_sp", 0).getString((String)localObject, "");
      if (!bg.nm((String)localObject)) {
        localObject = Base64.decode(((String)localObject).getBytes(), 0);
      }
    }
    try
    {
      gRB.aD((byte[])localObject);
      localObject = gRB;
      GMTrace.o(15325248618496L, 114182);
      return (bau)localObject;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static String Kz()
  {
    GMTrace.i(15325382836224L, 114183);
    String str = "key_pb_history_list" + q.zE();
    GMTrace.o(15325382836224L, 114183);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */