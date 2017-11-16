package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends h
{
  public int jWn;
  private int mJd;
  public List<i> nEV;
  public List<d> nEW;
  public String nEX;
  
  public e(int paramInt, String paramString)
  {
    GMTrace.i(6626731884544L, 49373);
    this.nEV = null;
    this.nEW = null;
    HashMap localHashMap = new HashMap();
    localHashMap.put("Limit", "10");
    localHashMap.put("Offset", String.valueOf(paramInt));
    localHashMap.put("Extbuf", paramString);
    x(localHashMap);
    GMTrace.o(6626731884544L, 49373);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    GMTrace.i(6627000320000L, 49375);
    w.d("MicroMsg.NetScenePatchQueryUserRoll", "errCode " + paramInt + " errMsg: " + paramString);
    this.nEV = new LinkedList();
    try
    {
      this.jWn = paramJSONObject.getInt("TotalNum");
      this.mJd = paramJSONObject.getInt("RecNum");
      this.nEX = paramJSONObject.optString("Extbuf");
      paramString = paramJSONObject.getJSONArray("UserRollList");
      Object localObject;
      if (paramString != null)
      {
        paramInt = 0;
        while (paramInt < paramString.length())
        {
          localObject = new i();
          JSONObject localJSONObject = paramString.getJSONObject(paramInt);
          ((i)localObject).nFi = localJSONObject.optInt("PayType");
          ((i)localObject).nFa = localJSONObject.optString("Transid");
          ((i)localObject).nFb = localJSONObject.optDouble("TotalFee");
          ((i)localObject).nFc = localJSONObject.optString("GoodsName");
          ((i)localObject).nFd = localJSONObject.optInt("CreateTime");
          ((i)localObject).nFf = localJSONObject.optInt("ModifyTime");
          ((i)localObject).nFg = localJSONObject.optString("FeeType");
          ((i)localObject).nFl = localJSONObject.optString("AppThumbUrl");
          ((i)localObject).nFe = localJSONObject.optString("TradeStateName");
          ((i)localObject).nFq = localJSONObject.optString("StatusColor");
          ((i)localObject).nFr = localJSONObject.optString("FeeColor");
          ((i)localObject).nFs = localJSONObject.optDouble("ActualPayFee");
          ((i)localObject).nFt = localJSONObject.optString("BillId");
          this.nEV.add(localObject);
          paramInt += 1;
        }
      }
      this.nEW = new LinkedList();
      paramString = paramJSONObject.optJSONArray("month_info");
      if (paramString != null)
      {
        paramInt = i;
        while (paramInt < paramString.length())
        {
          paramJSONObject = paramString.getJSONObject(paramInt);
          localObject = new d();
          ((d)localObject).year = paramJSONObject.optInt("year");
          ((d)localObject).month = paramJSONObject.optInt("month");
          ((d)localObject).nEU = paramJSONObject.optString("feetext");
          this.nEW.add(localObject);
          paramInt += 1;
        }
      }
      GMTrace.o(6627000320000L, 49375);
      return;
    }
    catch (JSONException paramString)
    {
      w.e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + paramString.getLocalizedMessage());
      GMTrace.o(6627000320000L, 49375);
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(6626866102272L, 49374);
    GMTrace.o(6626866102272L, 49374);
    return 105;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */