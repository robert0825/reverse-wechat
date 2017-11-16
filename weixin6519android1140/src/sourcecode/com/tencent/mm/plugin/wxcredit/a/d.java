package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends h
{
  public k sku;
  
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(8989098115072L, 66974);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serialno", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("query_method", "1");
    x(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("banktype", paramString2);
    ap(paramString1);
    GMTrace.o(8989098115072L, 66974);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    GMTrace.i(8989366550528L, 66976);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(8989366550528L, 66976);
      return;
    }
    for (;;)
    {
      JSONObject localJSONObject;
      String str;
      try
      {
        this.sku = new k();
        this.sku.sky = paramJSONObject.optInt("credit_state");
        this.sku.skt = (paramJSONObject.optInt("credit_amount") / 100.0D);
        this.sku.skz = (paramJSONObject.optInt("credit_usable") / 100.0D);
        this.sku.skA = (paramJSONObject.optInt("bill_amount") / 100.0D);
        this.sku.skB = paramJSONObject.optInt("bill_date");
        this.sku.skC = (paramJSONObject.optInt("repay_amount") / 100.0D);
        this.sku.skD = (paramJSONObject.optInt("repay_minimum") / 100.0D);
        paramString = this.sku;
        if (paramJSONObject.optInt("upgrade_amount") != 1) {
          break label537;
        }
        paramString.skE = bool;
        this.sku.skF = paramJSONObject.optInt("bill_month");
        this.sku.skG = paramJSONObject.optString("repay_url");
        this.sku.skH = paramJSONObject.optString("repay_lasttime");
        this.sku.skL = paramJSONObject.optString("lasttime");
        paramString = paramJSONObject.getJSONArray("jump_url_array");
        if ((paramString == null) || (paramString.length() <= 0)) {
          break label432;
        }
        int i = paramString.length();
        paramInt = 0;
        if (paramInt >= i) {
          break label432;
        }
        localJSONObject = paramString.getJSONObject(paramInt);
        str = localJSONObject.getString("jump_name");
        if ("account_rights_url".equals(str)) {
          this.sku.skJ = localJSONObject.getString("jump_url");
        } else if ("bill_url".equals(str)) {
          this.sku.skK = localJSONObject.getString("jump_url");
        }
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        GMTrace.o(8989366550528L, 66976);
        return;
      }
      if ("card_detail_url".equals(str))
      {
        this.sku.skI = localJSONObject.getString("jump_url");
      }
      else if ("know_more_url".equals(str))
      {
        this.sku.skM = localJSONObject.getString("jump_url");
        break label530;
        label432:
        paramString = paramJSONObject.getJSONObject("appservice");
        if (paramString != null)
        {
          this.sku.skN = new j();
          this.sku.skN.skx = paramString.getString("app_telephone");
          this.sku.skN.eCQ = paramString.getString("nickname");
          this.sku.skN.username = paramString.getString("username");
          this.sku.skN.url = paramString.getString("jump_url");
        }
        GMTrace.o(8989366550528L, 66976);
        return;
      }
      label530:
      paramInt += 1;
      continue;
      label537:
      bool = false;
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(8989232332800L, 66975);
    GMTrace.o(8989232332800L, 66975);
    return 57;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */