package com.tencent.mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

public class d
{
  private static d reT;
  
  static
  {
    GMTrace.i(6867652706304L, 51168);
    reT = null;
    GMTrace.o(6867652706304L, 51168);
  }
  
  public d()
  {
    GMTrace.i(6867250053120L, 51165);
    GMTrace.o(6867250053120L, 51165);
  }
  
  public static d byh()
  {
    GMTrace.i(6867384270848L, 51166);
    if (reT == null) {
      reT = new d();
    }
    d locald = reT;
    GMTrace.o(6867384270848L, 51166);
    return locald;
  }
  
  public Bankcard N(JSONObject paramJSONObject)
  {
    int j = 1;
    GMTrace.i(6867518488576L, 51167);
    Object localObject;
    if (paramJSONObject == null)
    {
      localObject = "";
      w.i("MicroMsg.BankcardParser", "parseJson jsonBankcard %s", new Object[] { localObject });
      localObject = new Bankcard();
    }
    int i;
    label130:
    label164:
    label377:
    label437:
    String str;
    try
    {
      ((Bankcard)localObject).field_bankName = paramJSONObject.getString("bank_name");
      ((Bankcard)localObject).field_bankcardTypeName = paramJSONObject.optString("bankacc_type_name");
      ((Bankcard)localObject).field_bankcardType = paramJSONObject.getString("bank_type");
      ((Bankcard)localObject).field_bindSerial = paramJSONObject.optString("bind_serial");
      w.d("MicroMsg.BankcardParser", "bind_serial: %s", new Object[] { ((Bankcard)localObject).field_bindSerial });
      ((Bankcard)localObject).reI = paramJSONObject.optString("h_bind_serialno");
      if (2 != paramJSONObject.optInt("bankacc_type", 2)) {
        break label746;
      }
      i = 1;
      if (i != 0) {
        ((Bankcard)localObject).field_cardType |= Bankcard.rez;
      }
      if ("NORMAL".equals(paramJSONObject.optString("extra_bind_flag"))) {
        break label751;
      }
      i = 1;
      if (i != 0) {
        ((Bankcard)localObject).field_cardType |= Bankcard.reA;
      }
      ((Bankcard)localObject).field_mobile = URLDecoder.decode(paramJSONObject.optString("mobile").replaceAll("x", "%"), "utf-8");
      if (bg.nm(((Bankcard)localObject).field_mobile)) {
        ((Bankcard)localObject).field_mobile = paramJSONObject.optString("mobile_mask");
      }
      ((Bankcard)localObject).field_onceQuotaKind = (paramJSONObject.optDouble("once_quota_3") / 100.0D);
      ((Bankcard)localObject).field_onceQuotaVirtual = (paramJSONObject.optDouble("once_quota_1") / 100.0D);
      ((Bankcard)localObject).field_dayQuotaKind = (paramJSONObject.optDouble("day_quota_3") / 100.0D);
      ((Bankcard)localObject).field_dayQuotaVirtual = (paramJSONObject.optDouble("day_quota_1") / 100.0D);
      ((Bankcard)localObject).field_bankcardTail = paramJSONObject.optString("bind_tail");
      if (bg.nm(((Bankcard)localObject).field_bankcardTail)) {
        ((Bankcard)localObject).field_bankcardTail = paramJSONObject.optString("card_tail");
      }
      ((Bankcard)localObject).reG = paramJSONObject.optString("card_mask");
      ((Bankcard)localObject).field_forbidWord = paramJSONObject.optString("forbid_word");
      ((Bankcard)localObject).field_repay_url = paramJSONObject.optString("repay_url");
      ((Bankcard)localObject).field_wxcreditState = 2;
      if (bg.nm(((Bankcard)localObject).field_forbidWord)) {
        break label756;
      }
      ((Bankcard)localObject).field_bankcardState = 8;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        w.i("MicroMsg.BankcardParser", "parseJson() JSONException:" + paramJSONObject.getMessage());
        w.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
        GMTrace.o(6867518488576L, 51167);
        return null;
        if (paramJSONObject.optInt("bank_flag", 1) != 0) {
          break;
        }
        ((Bankcard)localObject).field_bankcardState = 2;
      }
    }
    catch (UnsupportedEncodingException paramJSONObject)
    {
      for (;;)
      {
        w.i("MicroMsg.BankcardParser", "parseJson() UnsupportedEncodingException :" + paramJSONObject.getMessage());
        w.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
        GMTrace.o(6867518488576L, 51167);
        return null;
        ((Bankcard)localObject).field_bankcardState = 0;
      }
    }
    catch (Exception paramJSONObject)
    {
      label746:
      label751:
      label756:
      w.i("MicroMsg.BankcardParser", "parseJson() Exception:" + paramJSONObject.getMessage());
      w.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
      GMTrace.o(6867518488576L, 51167);
      return null;
    }
    ((Bankcard)localObject).field_bankPhone = paramJSONObject.optString("bank_phone");
    ((Bankcard)localObject).field_fetchArriveTime = (paramJSONObject.optLong("fetch_pre_arrive_time") * 1000L);
    ((Bankcard)localObject).field_fetchArriveTimeWording = paramJSONObject.optString("fetch_pre_arrive_time_wording");
    ((Bankcard)localObject).field_bankcardTag = paramJSONObject.optInt("bank_card_tag", 1);
    if (((Bankcard)localObject).field_bankcardTag == 2)
    {
      i = j;
      if (i != 0) {
        ((Bankcard)localObject).field_cardType |= Bankcard.rey;
      }
      str = paramJSONObject.optString("support_micropay");
      if (TextUtils.isEmpty(str)) {
        ((Bankcard)localObject).field_support_micropay = true;
      }
      if (!"1".equals(str)) {
        break label955;
      }
      ((Bankcard)localObject).field_support_micropay = true;
    }
    for (;;)
    {
      ((Bankcard)localObject).field_arrive_type = paramJSONObject.optString("arrive_type");
      ((Bankcard)localObject).field_avail_save_wording = paramJSONObject.optString("avail_save_wording");
      w.i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + paramJSONObject.optString("support_micropay"));
      i = paramJSONObject.optInt("fetch_charge_rate", 0);
      w.i("MicroMsg.BankcardParser", "fetch_charge_rate:" + i);
      ((Bankcard)localObject).field_fetch_charge_rate = (i / 10000.0D);
      w.i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + ((Bankcard)localObject).field_fetch_charge_rate);
      i = paramJSONObject.optInt("full_fetch_charge_fee", 0);
      w.i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + ((Bankcard)localObject).field_full_fetch_charge_fee);
      ((Bankcard)localObject).field_full_fetch_charge_fee = (i / 100.0D);
      ((Bankcard)localObject).field_fetch_charge_info = paramJSONObject.optString("fetch_charge_info");
      ((Bankcard)localObject).field_tips = paramJSONObject.optString("tips");
      ((Bankcard)localObject).field_forbid_title = paramJSONObject.optString("forbid_title");
      ((Bankcard)localObject).field_forbid_url = paramJSONObject.optString("forbid_url");
      ((Bankcard)localObject).field_no_micro_word = paramJSONObject.optString("no_micro_word");
      ((Bankcard)localObject).field_card_bottom_wording = paramJSONObject.optString("card_bottom_wording");
      GMTrace.o(6867518488576L, 51167);
      return (Bankcard)localObject;
      localObject = paramJSONObject;
      break;
      i = 0;
      break label130;
      i = 0;
      break label164;
      if (1 == paramJSONObject.optInt("expired_flag", 0))
      {
        ((Bankcard)localObject).field_bankcardState = 1;
        break label377;
      }
      i = 0;
      break label437;
      label955:
      if ("0".equals(str)) {
        ((Bankcard)localObject).field_support_micropay = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */