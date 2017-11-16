package com.tencent.mm.plugin.wallet.bind.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.wallet_core.g.a.h
{
  public boolean eXv;
  public ArrayList<Bankcard> qTU;
  public boolean qVZ;
  public String qWa;
  public String qWb;
  private String qWc;
  public String token;
  
  public c(String paramString, PayInfo paramPayInfo)
  {
    GMTrace.i(7676582952960L, 57195);
    this.qVZ = true;
    this.qTU = null;
    this.eXv = false;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    com.tencent.mm.kernel.h.xz();
    paramPayInfo = new o(bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(9, null), 0));
    this.qWc = paramString;
    localHashMap1.put("import_code", paramString);
    localHashMap1.put("qqid", paramPayInfo.toString());
    x(localHashMap1);
    ap(localHashMap2);
    GMTrace.o(7676582952960L, 57195);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7676851388416L, 57197);
    if (paramInt != 0)
    {
      GMTrace.o(7676851388416L, 57197);
      return;
    }
    this.qTU = new ArrayList();
    for (;;)
    {
      try
      {
        this.eXv = "1".equals(paramJSONObject.optString("is_reg", "0"));
        this.token = paramJSONObject.optString("token", "");
        paramString = paramJSONObject.getJSONArray("Array");
        int j = paramString.length();
        paramInt = 0;
        if (paramInt >= j) {
          break label433;
        }
        JSONObject localJSONObject = paramString.getJSONObject(paramInt);
        paramJSONObject = d.byh().N(localJSONObject);
        if (paramJSONObject == null) {
          break label484;
        }
        if (2 != localJSONObject.optInt("bank_acc_type", 2)) {
          break label491;
        }
        i = 1;
        if (i != 0) {
          paramJSONObject.field_cardType |= Bankcard.rez;
        }
        paramJSONObject.field_bankcardTail = localJSONObject.optString("bank_tail");
        paramJSONObject.reG = ("************" + paramJSONObject.field_bankcardTail);
        paramJSONObject.field_trueName = localJSONObject.optString("true_name");
        paramJSONObject.reF = localJSONObject.optString("cre_id");
        paramJSONObject.reg = localJSONObject.optInt("cre_type", -1);
        paramJSONObject.reQ = this.qWc;
        if (1 != localJSONObject.optInt("samecardexist", 0)) {
          break label497;
        }
        bool = true;
        paramJSONObject.reR = bool;
        if (paramJSONObject.byd())
        {
          paramJSONObject.field_desc = paramJSONObject.field_bankName;
          localJSONObject = localJSONObject.optJSONObject("bankappservice");
          if (localJSONObject != null)
          {
            this.qWa = localJSONObject.optString("username");
            this.qWb = localJSONObject.optString("app_recommend_desc");
          }
          this.qTU.add(paramJSONObject);
          break label484;
        }
        if (paramJSONObject.byf())
        {
          paramJSONObject.field_desc = ab.getContext().getString(a.i.tbh, new Object[] { paramJSONObject.field_bankName, paramJSONObject.field_bankcardTail });
          continue;
        }
        if (!paramJSONObject.byc()) {
          break label399;
        }
      }
      catch (JSONException paramString)
      {
        w.printErrStackTrace("MicroMsg.NetSceneTenpayQueryBindBankcard", paramString, "", new Object[0]);
        GMTrace.o(7676851388416L, 57197);
        return;
      }
      paramJSONObject.field_desc = ab.getContext().getString(a.i.thF, new Object[] { paramJSONObject.field_bankName, paramJSONObject.field_bankcardTail });
      continue;
      label399:
      paramJSONObject.field_desc = ab.getContext().getString(a.i.tbw, new Object[] { paramJSONObject.field_bankName, paramJSONObject.field_bankcardTail });
      continue;
      label433:
      w.d("MicroMsg.NetSceneTenpayQueryBindBankcard", "got data---isReg:" + this.eXv + ",bankcard.size:" + this.qTU.size());
      GMTrace.o(7676851388416L, 57197);
      return;
      label484:
      paramInt += 1;
      continue;
      label491:
      int i = 0;
      continue;
      label497:
      boolean bool = false;
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(7676717170688L, 57196);
    GMTrace.o(7676717170688L, 57196);
    return 37;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */