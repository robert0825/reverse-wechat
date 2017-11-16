package com.tencent.mm.plugin.wallet_core.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import org.json.JSONObject;

public final class b
{
  public static void V(JSONObject paramJSONObject)
  {
    GMTrace.i(6833695621120L, 50915);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData() json is null");
      GMTrace.o(6833695621120L, 50915);
      return;
    }
    w.i("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData()");
    String str2 = "";
    String str1 = "";
    int i = paramJSONObject.optInt("is_open_sns_pay", 0);
    int j = paramJSONObject.optInt("can_open_sns_pay", 0);
    int k = paramJSONObject.optInt("is_white_user", 0);
    if (j == 1)
    {
      str2 = paramJSONObject.optString("open_sns_pay_title");
      str1 = paramJSONObject.optString("open_sns_pay_wording");
      h.xz();
      h.xy().xh().a(w.a.vtL, str2);
      h.xz();
      h.xy().xh().a(w.a.vtM, str1);
    }
    w.i("MicroMsg.WalletNetSceneUtil", "is_open_sns_pay:" + i + ", can_open_sns_pay:" + j + ", is_white_user:" + k);
    w.i("MicroMsg.WalletNetSceneUtil", "open_sns_pay_title:" + str2 + ", open_sns_pay_wording:" + str1);
    h.xz();
    h.xy().xh().a(w.a.vtI, Integer.valueOf(i));
    h.xz();
    h.xy().xh().a(w.a.vtJ, Integer.valueOf(j));
    h.xz();
    h.xy().xh().a(w.a.vtK, Integer.valueOf(k));
    if (k == 1)
    {
      str1 = paramJSONObject.optString("set_sns_pay_title");
      paramJSONObject = paramJSONObject.optString("set_sns_pay_wording");
      h.xz();
      h.xy().xh().a(w.a.vtN, str1);
      h.xz();
      h.xy().xh().a(w.a.vtO, paramJSONObject);
    }
    for (;;)
    {
      w.i("MicroMsg.WalletNetSceneUtil", "set_sns_pay_title:" + str1 + ", set_sns_pay_wording:" + paramJSONObject);
      h.xz();
      h.xy().xh().kL(true);
      GMTrace.o(6833695621120L, 50915);
      return;
      paramJSONObject = "";
      str1 = "";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */