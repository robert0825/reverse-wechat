package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.v;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class o
  extends com.tencent.mm.wallet_core.g.a.h
{
  public String eXD;
  public String eXE;
  public String eXF;
  public String eXG;
  public String eXH;
  public String eXI;
  public int eXJ;
  public String eXK;
  public String eXL;
  public String eXM;
  public String eXN;
  public String eXO;
  public LinkedList<String> eXP;
  public ECardInfo eXQ;
  public int scene;
  public String title;
  
  public o(String paramString)
  {
    this(paramString, 0);
    GMTrace.i(7026566496256L, 52352);
    GMTrace.o(7026566496256L, 52352);
  }
  
  public o(String paramString, int paramInt)
  {
    GMTrace.i(7026700713984L, 52353);
    this.eXI = "";
    this.eXJ = 0;
    this.eXK = "";
    this.eXL = "";
    this.eXM = "";
    this.eXN = "";
    this.eXO = "";
    this.title = "";
    this.eXP = new LinkedList();
    this.scene = 0;
    Object localObject = new HashMap();
    this.scene = paramInt;
    ((Map)localObject).put("req_key", paramString);
    ((Map)localObject).put("bind_query_scene", String.valueOf(paramInt));
    paramString = (k)com.tencent.mm.kernel.h.h(k.class);
    ((Map)localObject).put("is_root", "0");
    if (paramString != null)
    {
      ((Map)localObject).put("is_device_open_touch", "1");
      paramString = paramString.azJ();
      if (paramString != null) {
        ((Map)localObject).putAll(paramString);
      }
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
    }
    for (;;)
    {
      x((Map)localObject);
      paramString = new HashMap();
      com.tencent.mm.kernel.h.xz();
      localObject = (String)com.tencent.mm.kernel.h.xy().xh().get(196612, null);
      com.tencent.mm.kernel.h.xz();
      String str = (String)com.tencent.mm.kernel.h.xy().xh().get(196613, null);
      paramString.put("bind_serial", localObject);
      paramString.put("last_bind_serial", str);
      ap(paramString);
      GMTrace.o(7026700713984L, 52353);
      return;
      ((Map)localObject).put("is_device_open_touch", "0");
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(7027103367168L, 52356);
    GMTrace.o(7027103367168L, 52356);
    return 1501;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7026969149440L, 52355);
    if (paramInt != 0)
    {
      GMTrace.o(7026969149440L, 52355);
      return;
    }
    if (paramJSONObject.has("real_name_info"))
    {
      paramString = paramJSONObject.optJSONObject("real_name_info");
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "get real_name_info %s", new Object[] { paramString.toString() });
      this.eXD = paramString.optString("guide_flag");
      this.eXE = paramString.optString("guide_wording");
      this.eXF = paramString.optString("left_button_wording");
      this.eXG = paramString.optString("right_button_wording");
      this.eXH = paramString.optString("upload_credit_url");
      this.eXI = paramString.optString("done_button_wording");
      this.eXJ = paramString.optInt("is_show_protocol", 0);
      this.eXK = paramString.optString("left_protocol_wording");
      this.eXL = paramString.optString("new_upload_credit_url");
      this.eXM = paramString.optString("protocol_url");
      this.eXN = paramString.optString("right_protocol_wording");
      this.eXO = paramString.optString("subtitle");
      this.title = paramString.optString("title");
      JSONArray localJSONArray = paramString.optJSONArray("upload_reasons");
      this.eXP.clear();
      if (localJSONArray != null)
      {
        paramInt = 0;
        while (paramInt < localJSONArray.length())
        {
          this.eXP.add(localJSONArray.optString(paramInt));
          paramInt += 1;
        }
      }
      if (paramString.has("ecard_info"))
      {
        paramString = paramString.optJSONObject("ecard_info");
        this.eXQ = new ECardInfo();
        this.eXQ.title = this.title;
        this.eXQ.rfG = new ArrayList(this.eXP);
        this.eXQ.rfI = this.eXM;
        this.eXQ.rfJ = this.eXK;
        this.eXQ.rfK = this.eXN;
        this.eXQ.rfH = this.eXI;
        this.eXQ.rfz = paramString.optInt("ecard_open_scene", 0);
        this.eXQ.eDL = paramString.optString("ecard_type", "");
        this.eXQ.rfA = paramString.optInt("show_check_box", 0);
        this.eXQ.rfB = paramString.optInt("check_box_selected", 0);
        this.eXQ.rfC = paramString.optString("check_box_left_wording", "");
        this.eXQ.rfD = paramString.optString("check_box_right_wording", "");
        this.eXQ.rfE = paramString.optString("check_box_url", "");
        this.eXQ.rfF = paramString.optInt("is_upload_credid", 0);
        this.eXQ.eXH = paramString.optString("upload_credit_url", "");
      }
    }
    if ((paramJSONObject.has("paymenu_array")) && (this.scene == 1))
    {
      paramString = paramJSONObject.optJSONArray("paymenu_array");
      if (paramString != null) {
        v.Kh(paramString.toString());
      }
    }
    long l = paramJSONObject.optLong("time_stamp");
    if (l > 0L)
    {
      com.tencent.mm.wallet_core.c.n.setTimeStamp(String.valueOf(l));
      aa.a(paramJSONObject, this.scene);
      if ((this.scene == 0) || (this.scene == 1))
      {
        paramString = paramJSONObject.optJSONObject("bind_card_menu");
        if (paramString == null) {
          break label673;
        }
        w.d("MicroMsg.NetSceneTenpayQueryBindBankcard", "bind card menu: %s", new Object[] { paramString.toString() });
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vzf, paramString.toString());
      }
    }
    for (;;)
    {
      paramString = (k)com.tencent.mm.kernel.h.h(k.class);
      if (paramString == null) {
        break label694;
      }
      w.i("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is not null");
      paramString.azC();
      paramString.eD(com.tencent.mm.plugin.wallet_core.model.n.byx().byU());
      GMTrace.o(7026969149440L, 52355);
      return;
      w.w("MicroMsg.NetSceneTenpayQueryBindBankcard", "no time_stamp in bindquerynew.");
      break;
      label673:
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzf, "");
    }
    label694:
    w.e("MicroMsg.NetSceneTenpayQueryBindBankcard", "IFingerPrintMgr is null");
    GMTrace.o(7026969149440L, 52355);
  }
  
  public final int aoD()
  {
    GMTrace.i(7026834931712L, 52354);
    GMTrace.o(7026834931712L, 52354);
    return 72;
  }
  
  public final String getUri()
  {
    GMTrace.i(7027237584896L, 52357);
    GMTrace.o(7027237584896L, 52357);
    return "/cgi-bin/mmpay-bin/tenpay/bindquerynew";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */