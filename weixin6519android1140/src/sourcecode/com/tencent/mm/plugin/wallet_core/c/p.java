package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p
  extends h
{
  public Orders rcB;
  
  public p(String paramString)
  {
    GMTrace.i(7034619559936L, 52412);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    x(localHashMap);
    GMTrace.o(7034619559936L, 52412);
  }
  
  public p(String paramString, int paramInt)
  {
    GMTrace.i(7034753777664L, 52413);
    HashMap localHashMap = new HashMap();
    localHashMap.put("trans_id", paramString);
    localHashMap.put("pay_type", String.valueOf(paramInt));
    x(localHashMap);
    GMTrace.o(7034753777664L, 52413);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7035022213120L, 52415);
    if (paramJSONObject != null) {
      try
      {
        this.rcB = new Orders();
        paramString = new Orders.Commodity();
        paramString.nEd = paramJSONObject.getString("buy_uin");
        paramString.nEe = paramJSONObject.getString("buy_name");
        paramString.nEf = paramJSONObject.optString("sale_uin");
        paramString.nEg = paramJSONObject.optString("sale_name");
        paramString.eRP = paramJSONObject.getString("trans_id");
        paramString.desc = paramJSONObject.optString("goods_name");
        paramString.jWS = (paramJSONObject.optDouble("pay_num") / 100.0D);
        paramString.nEk = paramJSONObject.getString("trade_state");
        paramString.nEl = paramJSONObject.getString("trade_state_name");
        paramString.nEp = paramJSONObject.getString("buy_bank_name");
        paramString.nEw = paramJSONObject.optString("discount", "");
        paramString.nEn = paramJSONObject.optInt("modify_timestamp");
        paramString.nEr = paramJSONObject.optString("fee_type");
        paramString.nEs = paramJSONObject.optString("appusername");
        paramString.nDU = paramJSONObject.optString("app_telephone");
        paramString.rhJ = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
        paramString.nEr = paramJSONObject.optString("fee_type", "");
        paramInt = 1;
        Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
        Object localObject2;
        if (localObject1 != null)
        {
          localObject2 = new Orders.b();
          ((Orders.b)localObject2).type = Orders.rhH;
          ((Orders.b)localObject2).name = ((JSONObject)localObject1).optString("nickname");
          ((Orders.b)localObject2).nEs = ((JSONObject)localObject1).optString("username");
          paramString.rhK = ((Orders.b)localObject2).nEs;
          ((Orders.b)localObject2).nIR = ((JSONObject)localObject1).optString("logo_round_url");
          ((Orders.b)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
          i = ((JSONObject)localObject1).optInt("recommend_level");
          paramString.rhm = i;
          paramInt = i;
          if (!bg.nm(((Orders.b)localObject2).name))
          {
            paramString.rhR.add(localObject2);
            paramInt = i;
          }
        }
        localObject1 = paramJSONObject.getJSONArray("activity_info");
        int j = ((JSONArray)localObject1).length();
        int i = 0;
        Object localObject3;
        while (i < j)
        {
          localObject2 = ((JSONArray)localObject1).getJSONObject(i);
          localObject3 = new Orders.b();
          ((Orders.b)localObject3).type = Orders.rhI;
          ((Orders.b)localObject3).nIR = ((JSONObject)localObject2).optString("icon");
          ((Orders.b)localObject3).name = ((JSONObject)localObject2).optString("wording");
          ((Orders.b)localObject3).url = ((JSONObject)localObject2).optString("url");
          ((Orders.b)localObject3).rgT = ((JSONObject)localObject2).optString("btn_text");
          ((Orders.b)localObject3).rhZ = ((JSONObject)localObject2).optInt("type");
          ((Orders.b)localObject3).title = ((JSONObject)localObject2).optString("title");
          ((Orders.b)localObject3).rgN = ((JSONObject)localObject2).optLong("activity_id");
          ((Orders.b)localObject3).ria = ((JSONObject)localObject2).optInt("activity_type", 0);
          ((Orders.b)localObject3).rib = ((JSONObject)localObject2).optInt("award_id");
          ((Orders.b)localObject3).rgQ = ((JSONObject)localObject2).optInt("send_record_id");
          ((Orders.b)localObject3).rgR = ((JSONObject)localObject2).optInt("user_record_id");
          ((Orders.b)localObject3).rid = ((JSONObject)localObject2).optString("activity_tinyapp_username");
          ((Orders.b)localObject3).rie = ((JSONObject)localObject2).optString("activity_tinyapp_path");
          ((Orders.b)localObject3).rgS = ((JSONObject)localObject2).optLong("activity_mch_id");
          ((Orders.b)localObject3).rif = ((JSONObject)localObject2).optInt("activity_tinyapp_version");
          paramString.rhR.add(localObject3);
          i += 1;
        }
        localObject1 = paramJSONObject.optJSONArray("discount_array");
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        {
          j = ((JSONArray)localObject1).length();
          paramString.rhM = new ArrayList();
          i = 0;
          while (i < j)
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            localObject3 = new Orders.DiscountInfo();
            ((Orders.DiscountInfo)localObject3).rhY = ((JSONObject)localObject2).optDouble("payment_amount");
            ((Orders.DiscountInfo)localObject3).qXr = ((JSONObject)localObject2).optString("favor_desc");
            paramString.rhM.add(localObject3);
            i += 1;
          }
        }
        paramString.rhN = paramJSONObject.optString("rateinfo");
        paramString.rhO = paramJSONObject.optString("discount_rateinfo");
        paramString.rhP = paramJSONObject.optString("original_feeinfo");
        this.rcB.rhv = new ArrayList();
        this.rcB.rhv.add(paramString);
        this.rcB.rho = paramJSONObject.optString("trade_state_name");
        this.rcB.rhm = paramInt;
        GMTrace.o(7035022213120L, 52415);
        return;
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
        GMTrace.o(7035022213120L, 52415);
        return;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", paramString, "", new Object[0]);
      }
    }
    GMTrace.o(7035022213120L, 52415);
  }
  
  public final int aoD()
  {
    GMTrace.i(7034887995392L, 52414);
    GMTrace.o(7034887995392L, 52414);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */