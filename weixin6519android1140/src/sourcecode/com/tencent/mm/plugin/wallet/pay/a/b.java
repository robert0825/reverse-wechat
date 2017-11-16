package com.tencent.mm.plugin.wallet.pay.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends h
{
  public String desc;
  public String nEr;
  public double omw;
  
  public b(String paramString)
  {
    GMTrace.i(7773622370304L, 57918);
    HashMap localHashMap = new HashMap();
    localHashMap.put("token", paramString);
    x(localHashMap);
    GMTrace.o(7773622370304L, 57918);
  }
  
  public final int Bb()
  {
    GMTrace.i(7774025023488L, 57921);
    GMTrace.o(7774025023488L, 57921);
    return 1603;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7773890805760L, 57920);
    if (paramInt == 0)
    {
      this.nEr = paramJSONObject.optString("fee_type");
      this.omw = (paramJSONObject.optDouble("total_fee") / 100.0D);
      paramString = paramJSONObject.optJSONArray("Array");
      if ((paramString != null) && (paramString.length() > 0)) {
        this.desc = ((JSONObject)paramString.opt(0)).optString("desc");
      }
      ac localac = n.byy();
      paramJSONObject = paramJSONObject.optJSONObject("bindqueryresp");
      localac.rjo.clear();
      if (paramJSONObject == null)
      {
        w.e("MicroMsg.WalletRepaymentBankcardMgr", "parse from json error,json is null");
        GMTrace.o(7773890805760L, 57920);
        return;
      }
      JSONArray localJSONArray = paramJSONObject.optJSONArray("Array");
      if ((localJSONArray == null) || (localJSONArray.length() <= 0))
      {
        w.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list is null");
        paramString = paramJSONObject.optJSONObject("user_info");
        if (paramString != null)
        {
          localac.rjp = paramString.optString("last_card_bind_serialno");
          GMTrace.o(7773890805760L, 57920);
        }
      }
      else
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          d locald = d.byh();
          try
          {
            paramString = (JSONObject)localJSONArray.get(paramInt);
            if (paramString != null)
            {
              paramString = locald.N(paramString);
              if (paramString.byd())
              {
                paramString.field_desc = paramString.field_bankName;
                localac.rjo.add(paramString);
              }
            }
            else
            {
              paramInt += 1;
            }
          }
          catch (JSONException paramString)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.WalletRepaymentBankcardMgr", paramString, "", new Object[0]);
              paramString = null;
              continue;
              if (paramString.byf()) {
                paramString.field_desc = ab.getContext().getString(a.i.tbh, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
              } else if (paramString.byc()) {
                paramString.field_desc = ab.getContext().getString(a.i.thF, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
              } else {
                paramString.field_desc = ab.getContext().getString(a.i.tbw, new Object[] { paramString.field_bankName, paramString.field_bankcardTail });
              }
            }
          }
        }
      }
      w.e("MicroMsg.WalletRepaymentBankcardMgr", "user_info is null");
    }
    GMTrace.o(7773890805760L, 57920);
  }
  
  public final int aoD()
  {
    GMTrace.i(7773756588032L, 57919);
    GMTrace.o(7773756588032L, 57919);
    return 123;
  }
  
  public final String getUri()
  {
    GMTrace.i(7774159241216L, 57922);
    GMTrace.o(7774159241216L, 57922);
    return "/cgi-bin/mmpay-bin/tenpay/webankloanordershow";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */