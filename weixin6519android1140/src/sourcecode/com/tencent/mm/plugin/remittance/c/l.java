package com.tencent.mm.plugin.remittance.c;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l
  extends com.tencent.mm.wallet_core.g.a.h
{
  public String eJQ;
  public String eRP;
  public String eRi;
  public a eTV;
  public String jVR;
  public String jXz;
  public int mFu;
  private int nEc;
  public int omi;
  public String omj;
  public String omk;
  public double oml;
  public double omm;
  public String omn;
  public boolean omo;
  public double omp;
  public String omq;
  public double omr;
  public double oms;
  public String omt;
  public String omu;
  public String omv;
  public double omw;
  public String omx;
  public String omy;
  public String omz;
  
  public l(double paramDouble, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, int paramInt3)
  {
    GMTrace.i(14570810769408L, 108561);
    this.eJQ = null;
    this.omi = 0;
    this.omw = 0.0D;
    this.omx = "";
    this.omy = "";
    w.i("Micromsg.NetSceneTenpayRemittanceGen", "payScene: %s, channel: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    this.omw = paramDouble;
    this.nEc = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("transfer_scene", String.valueOf(paramInt2));
    localHashMap.put("fee", Math.round(100.0D * paramDouble));
    localHashMap.put("fee_type", paramString1);
    localHashMap.put("receiver_name", paramString2);
    for (;;)
    {
      try
      {
        if ((this.nEc != 33) && (this.nEc != 32)) {
          continue;
        }
        w.d("Micromsg.NetSceneTenpayRemittanceGen", "f2f desc: %s, recvDesc: %s", new Object[] { paramString3, paramString4 });
        if (!bg.nm(paramString3)) {
          localHashMap.put("f2f_payer_desc", p.encode(paramString3, "UTF-8"));
        }
        if (!bg.nm(paramString4)) {
          localHashMap.put("desc", p.encode(paramString4, "UTF-8"));
        }
      }
      catch (UnsupportedEncodingException paramString1)
      {
        long l;
        w.e("Micromsg.NetSceneTenpayRemittanceGen", paramString1.getMessage(), new Object[] { paramString1 });
        continue;
        if ((l & 0x20) == 0L) {
          continue;
        }
        paramInt1 = 1;
        continue;
      }
      localHashMap.put("transfer_qrcode_id", paramString5);
      if ((paramInt2 == 0) || (paramInt2 == 2))
      {
        com.tencent.mm.kernel.h.xz();
        l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(147457, Long.valueOf(0L))).longValue();
        paramInt1 = 0;
        if ((0x10 & l) == 0L) {
          continue;
        }
        paramInt1 = 2;
        localHashMap.put("delay_confirm_flag", String.valueOf(paramInt1));
        w.d("Micromsg.NetSceneTenpayRemittanceGen", "delay flag: %d", new Object[] { Integer.valueOf(paramInt1) });
      }
      x(localHashMap);
      if ((this.nEc == 32) || (this.nEc == 33))
      {
        paramString1 = new HashMap();
        paramString1.put("channel", String.valueOf(paramInt3));
        ap(paramString1);
      }
      GMTrace.o(14570810769408L, 108561);
      return;
      if (!bg.nm(paramString3)) {
        localHashMap.put("desc", p.encode(paramString3, "UTF-8"));
      }
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(10798487306240L, 80455);
    if ((this.nEc == 32) || (this.nEc == 33))
    {
      GMTrace.o(10798487306240L, 80455);
      return 1582;
    }
    GMTrace.o(10798487306240L, 80455);
    return 1544;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    GMTrace.i(10798889959424L, 80458);
    w.d("Micromsg.NetSceneTenpayRemittanceGen", "errCode " + paramInt + " errMsg: " + paramString);
    if ((paramInt != 0) && (paramInt != 2))
    {
      GMTrace.o(10798889959424L, 80458);
      return;
    }
    if (paramJSONObject.has("used_fee"))
    {
      this.oms = paramJSONObject.optDouble("used_fee");
      this.eJQ = paramJSONObject.optString("req_key");
      this.omi = paramJSONObject.optInt("tansfering_num", 0);
      this.omj = paramJSONObject.optString("transfer_interrupt_desc");
      this.omk = paramJSONObject.optString("appmsgcontent");
      this.omn = paramJSONObject.optString("transfer_interrupt_charge_desc");
      if (paramJSONObject.optInt("is_show_charge") != 1) {
        break label541;
      }
      label144:
      this.omo = bool;
      this.omt = paramJSONObject.optString("receiver_true_name");
      this.omu = paramJSONObject.optString("f2f_id", "");
      this.jVR = paramJSONObject.optString("trans_id", "");
      this.jXz = paramJSONObject.optString("extend_str", "");
      this.omv = paramJSONObject.optString("receiver_open_id", "");
      this.mFu = paramJSONObject.optInt("amount", 0);
      this.eRi = paramJSONObject.optString("transfer_id", "");
      this.eRP = paramJSONObject.optString("transaction_id", "");
      this.omz = paramJSONObject.optString("receiver_openid", "");
      if (bg.nm(this.omt)) {
        w.e("Micromsg.NetSceneTenpayRemittanceGen", "receiver_true_name is null");
      }
      if (!paramJSONObject.has("remain_fee")) {
        break label547;
      }
      this.omp = paramJSONObject.optDouble("remain_fee");
      label303:
      if (!paramJSONObject.has("exceed_fee")) {
        break label558;
      }
      this.omr = paramJSONObject.optDouble("exceed_fee");
      label324:
      if (!paramJSONObject.has("charge_fee")) {
        break label569;
      }
      this.oml = paramJSONObject.optDouble("charge_fee");
      label345:
      if (!paramJSONObject.has("free_limit")) {
        break label580;
      }
      this.omm = paramJSONObject.optDouble("free_limit");
    }
    for (;;)
    {
      if (paramJSONObject.has("showmessage"))
      {
        w.i("Micromsg.NetSceneTenpayRemittanceGen", "has alert item");
        a locala = new a();
        JSONObject localJSONObject = paramJSONObject.optJSONObject("showmessage");
        locala.mJO = localJSONObject.optString("left_button_wording");
        locala.mJP = localJSONObject.optString("right_button_wording");
        locala.jWz = localJSONObject.optString("right_button_url");
        this.eTV = locala;
        this.eTV.eLQ = paramString;
      }
      if (paramJSONObject.has("fee")) {
        this.omx = paramJSONObject.optString("fee");
      }
      if (paramJSONObject.has("double_check_wording"))
      {
        w.i("Micromsg.NetSceneTenpayRemittanceGen", "has fee, show alert");
        this.omy = paramJSONObject.optString("double_check_wording");
      }
      if (TextUtils.isEmpty(this.omk)) {
        w.e("Micromsg.NetSceneTenpayRemittanceGen", "appmsgcontent is null");
      }
      GMTrace.o(10798889959424L, 80458);
      return;
      w.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
      break;
      label541:
      bool = false;
      break label144;
      label547:
      w.e("Micromsg.NetSceneTenpayRemittanceGen", "remain_fee is null");
      break label303;
      label558:
      w.e("Micromsg.NetSceneTenpayRemittanceGen", "exceed_fee is null");
      break label324;
      label569:
      w.e("Micromsg.NetSceneTenpayRemittanceGen", "charge_fee is null");
      break label345;
      label580:
      w.e("Micromsg.NetSceneTenpayRemittanceGen", "free_limit is null");
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(10798621523968L, 80456);
    GMTrace.o(10798621523968L, 80456);
    return 0;
  }
  
  public final boolean bbt()
  {
    GMTrace.i(10799024177152L, 80459);
    GMTrace.o(10799024177152L, 80459);
    return true;
  }
  
  public final String getUri()
  {
    GMTrace.i(10798755741696L, 80457);
    if ((this.nEc == 32) || (this.nEc == 33))
    {
      GMTrace.o(10798755741696L, 80457);
      return "/cgi-bin/mmpay-bin/f2fplaceorder";
    }
    GMTrace.o(10798755741696L, 80457);
    return "/cgi-bin/mmpay-bin/transferplaceorder";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */