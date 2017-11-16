package com.tencent.mm.plugin.collect.b;

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

public final class q
  extends h
{
  private int aCN;
  public boolean gpJ;
  public List<a> jWQ;
  public long jWm;
  public int jWn;
  public int jWo;
  public int type;
  
  public q(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    GMTrace.i(5401055592448L, 40241);
    this.jWQ = new ArrayList();
    this.gpJ = false;
    this.aCN = paramInt2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", String.valueOf(paramInt1));
    localHashMap.put("from_timestamp", String.valueOf(paramLong));
    localHashMap.put("last_bill_id", paramString);
    localHashMap.put("num", String.valueOf(paramInt2));
    x(localHashMap);
    GMTrace.o(5401055592448L, 40241);
  }
  
  public final int Bb()
  {
    GMTrace.i(5401458245632L, 40244);
    GMTrace.o(5401458245632L, 40244);
    return 1963;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(5401592463360L, 40245);
    this.jWn = paramJSONObject.optInt("total_num");
    this.jWo = paramJSONObject.optInt("total_amt");
    this.jWm = paramJSONObject.optLong("from_timestamp", 0L);
    this.type = paramJSONObject.optInt("type", 0);
    paramString = paramJSONObject.optJSONArray("records");
    if ((paramString == null) || (paramString.length() <= 0))
    {
      w.i("MicroMsg.NetSceneTenpayF2fRecordList", "empty records");
      if (this.jWQ.size() < this.aCN)
      {
        w.i("MicroMsg.NetSceneTenpayF2fRecordList", "finish query");
        this.gpJ = true;
      }
      GMTrace.o(5401592463360L, 40245);
      return;
    }
    paramInt = 0;
    while (paramInt < paramString.length()) {
      try
      {
        paramJSONObject = paramString.getJSONObject(paramInt);
        a locala = new a();
        locala.jVQ = paramJSONObject.optString("bill_id");
        locala.jVR = paramJSONObject.optString("trans_id");
        locala.timestamp = paramJSONObject.optLong("timestamp", 0L);
        locala.desc = paramJSONObject.optString("desc");
        locala.eCT = paramJSONObject.optInt("fee", 0);
        this.jWQ.add(locala);
        paramInt += 1;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneTenpayF2fRecordList", paramJSONObject, "", new Object[0]);
        }
      }
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(5401189810176L, 40242);
    GMTrace.o(5401189810176L, 40242);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(5401324027904L, 40243);
    GMTrace.o(5401324027904L, 40243);
    return "/cgi-bin/mmpay-bin/f2frcvdlist";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */