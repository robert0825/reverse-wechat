package com.tencent.mm.plugin.wallet.pay.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.pay.a.c;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends com.tencent.mm.wallet_core.g.a.h
{
  private int ePL;
  public String eXD;
  public String eXE;
  public String eXF;
  public String eXG;
  public String eXH;
  public Orders opK;
  private String qYK;
  public c qYL;
  private int scene;
  
  public e(PayInfo paramPayInfo, int paramInt)
  {
    GMTrace.i(7775904071680L, 57935);
    this.opK = null;
    this.qYK = null;
    this.qYL = null;
    this.scene = 0;
    this.ePL = 0;
    HashMap localHashMap1;
    HashMap localHashMap2;
    if (paramPayInfo == null)
    {
      w.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "error payinfo is null %s", new Object[] { bg.bQW().toString() });
      this.qYK = "";
      this.scene = paramInt;
      localHashMap1 = new HashMap();
      localHashMap2 = new HashMap();
      localHashMap1.put("support_cardtag3", "1");
      localHashMap1.put("req_key", this.qYK);
      localHashMap1.put("bind_query_scene", String.valueOf(paramInt));
      localHashMap1.put("is_merge", "1");
      Object localObject = (k)com.tencent.mm.kernel.h.h(k.class);
      localHashMap1.put("is_root", "0");
      if ((localObject == null) || (!((k)localObject).azu())) {
        break label264;
      }
      localHashMap1.put("is_device_open_touch", "1");
      localObject = ((k)localObject).azJ();
      if (localObject != null) {
        localHashMap1.putAll((Map)localObject);
      }
      w.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is true");
    }
    for (;;)
    {
      if (paramPayInfo != null) {
        this.ePL = paramPayInfo.ePL;
      }
      a(paramPayInfo, localHashMap1, localHashMap2);
      x(localHashMap1);
      ap(localHashMap2);
      GMTrace.o(7775904071680L, 57935);
      return;
      this.qYK = paramPayInfo.eHG;
      break;
      label264:
      localHashMap1.put("is_device_open_touch", "0");
      w.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is false");
    }
  }
  
  public int Bb()
  {
    GMTrace.i(7776306724864L, 57938);
    GMTrace.o(7776306724864L, 57938);
    return 1593;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7776172507136L, 57937);
    for (;;)
    {
      try
      {
        this.opK = Orders.Q(paramJSONObject);
        if (this.opK != null) {
          this.opK.eHG = this.qYK;
        }
        long l = paramJSONObject.optJSONObject("bindqueryresp").optLong("time_stamp");
        if (l > 0L)
        {
          com.tencent.mm.wallet_core.c.n.setTimeStamp(String.valueOf(l));
          paramString = paramJSONObject.optJSONObject("query_order_info");
          if (paramString != null)
          {
            w.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "get query_order_info");
            com.tencent.mm.plugin.wallet_core.model.n.byx().rjC = (paramString.optInt("query_order_time", 5) * 1000);
            com.tencent.mm.plugin.wallet_core.model.n.byx().mRetryCount = paramString.optInt("query_order_count", 0);
            com.tencent.mm.plugin.wallet_core.model.n.byx().rjD = paramString.optString("default_query_order_wording", "");
          }
          paramString = paramJSONObject.optString("pay_remind_wording");
          com.tencent.mm.plugin.wallet_core.model.n.byx().rjE = paramString;
          aa.a(paramJSONObject.optJSONObject("bindqueryresp"), this.ePL);
          paramString = (k)com.tencent.mm.kernel.h.h(k.class);
          if (paramString != null)
          {
            w.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is not null");
            paramString.azC();
            if (paramJSONObject.has("real_name_info"))
            {
              paramString = paramJSONObject.optJSONObject("real_name_info");
              this.eXD = paramString.optString("guide_flag");
              this.eXE = paramString.optString("guide_wording");
              this.eXF = paramString.optString("left_button_wording");
              this.eXG = paramString.optString("right_button_wording");
              this.eXH = paramString.optString("upload_credit_url");
            }
            if (paramJSONObject.has("user_notify_info"))
            {
              paramString = paramJSONObject.optJSONObject("user_notify_info");
              if (paramString != null) {
                break label341;
              }
              paramString = null;
              this.qYL = paramString;
            }
            GMTrace.o(7776172507136L, 57937);
          }
        }
        else
        {
          w.w("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "no time_stamp in qrcodeusebindquery.");
          continue;
        }
        w.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is null");
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "hy: " + paramString.toString());
        GMTrace.o(7776172507136L, 57937);
        return;
      }
      continue;
      label341:
      paramInt = paramString.optInt("notify_flag", 0);
      paramJSONObject = paramString.optString("notify_wording", "");
      String str1 = paramString.optString("left_button_wording", "");
      String str2 = paramString.optString("right_button_wording", "");
      String str3 = paramString.optString("confirm_button_wording", "");
      if (paramInt == 0)
      {
        paramString = null;
      }
      else
      {
        paramString = new c();
        paramString.qYw = paramInt;
        paramString.qYx = paramJSONObject;
        paramString.mJO = str1;
        paramString.mJP = str2;
        paramString.qYy = str3;
      }
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(7776038289408L, 57936);
    GMTrace.o(7776038289408L, 57936);
    return 112;
  }
  
  public String getUri()
  {
    GMTrace.i(7776440942592L, 57939);
    GMTrace.o(7776440942592L, 57939);
    return "/cgi-bin/mmpay-bin/tenpay/qrcodeusebindquery";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */