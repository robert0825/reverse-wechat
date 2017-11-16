package com.tencent.mm.plugin.offline.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.c.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.wallet_core.g.a.h
{
  public static String nAR;
  public String nAM;
  public String nAN;
  public String nAO;
  public String nAP;
  public String nAQ;
  public String nAS;
  public int nAT;
  public String nAU;
  public String nAV;
  public String nAW;
  public int nAX;
  public String token;
  
  static
  {
    GMTrace.i(6197369372672L, 46174);
    nAR = "3";
    GMTrace.o(6197369372672L, 46174);
  }
  
  public k(Bankcard paramBankcard, String paramString, int paramInt)
  {
    GMTrace.i(6196429848576L, 46167);
    this.nAM = "";
    this.nAN = "";
    this.token = "";
    this.nAO = "";
    this.nAP = "";
    this.nAQ = "";
    this.nAS = "";
    this.nAT = 0;
    this.nAU = "";
    this.nAV = "";
    this.nAW = "";
    this.nAX = 20000;
    HashMap localHashMap = new HashMap();
    localHashMap.put("passwd", paramString);
    localHashMap.put("device_id", p.ta());
    localHashMap.put("weixin_ver", "0x" + Integer.toHexString(d.tJC));
    localHashMap.put("bind_serialno", paramBankcard.field_bindSerial);
    localHashMap.put("bank_type", paramBankcard.field_bankcardType);
    localHashMap.put("card_tail", paramBankcard.field_bankcardTail);
    localHashMap.put("open_limitfee", String.valueOf(paramInt));
    this.nAX = paramInt;
    paramBankcard = com.tencent.mm.wallet_core.ui.e.getUsername();
    paramBankcard = aa.RP(aa.RP(paramBankcard) + aa.RP(p.ta()));
    localHashMap.put("user_id", paramBankcard);
    localHashMap.put("crt_csr", com.tencent.mm.wallet_core.c.a.clF().getCertApplyCSR(paramBankcard));
    localHashMap.put("type", nAR);
    localHashMap.put("version_number", nAR);
    x(localHashMap);
    GMTrace.o(6196429848576L, 46167);
  }
  
  public final int Bb()
  {
    GMTrace.i(6197100937216L, 46172);
    GMTrace.o(6197100937216L, 46172);
    return 565;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6196832501760L, 46170);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196630, "0");
    }
    paramString = new ArrayList();
    paramq = new IDKey();
    paramq.SetID(135);
    paramq.SetValue(1L);
    paramq.SetKey(11);
    paramArrayOfByte = new IDKey();
    paramArrayOfByte.SetID(135);
    paramArrayOfByte.SetValue(1L);
    if ((paramInt3 == 0) && (paramInt3 == 0)) {
      paramArrayOfByte.SetKey(9);
    }
    for (;;)
    {
      paramString.add(paramq);
      paramString.add(paramArrayOfByte);
      g.ork.b(paramString, true);
      GMTrace.o(6196832501760L, 46170);
      return;
      paramArrayOfByte.SetKey(10);
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6196698284032L, 46169);
    if (paramJSONObject != null)
    {
      this.nAN = paramJSONObject.optString("crt_crt");
      this.nAM = paramJSONObject.optString("cn");
      this.token = paramJSONObject.optString("token");
      this.nAO = paramJSONObject.optString("valid_end");
      this.nAP = paramJSONObject.optString("encrypt_str");
      this.nAQ = paramJSONObject.optString("deviceid");
      if (!com.tencent.mm.wallet_core.c.a.clF().importCert(this.nAM, this.nAN)) {
        break label509;
      }
      w.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
      this.nAS = paramJSONObject.optString("token_v2");
      this.nAT = paramJSONObject.optInt("algorithm_type");
      this.nAU = paramJSONObject.optString("card_list");
      this.nAV = paramJSONObject.optString("key_list");
      this.nAW = paramJSONObject.optString("token_pin");
      String str = paramJSONObject.optString("notice_url");
      paramString = paramJSONObject.optString("auth_codes");
      paramInt = paramJSONObject.optInt("update_interval");
      paramJSONObject = paramJSONObject.optString("code_ver");
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196617, this.nAM);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196626, this.nAO);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196627, this.nAP);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196628, this.nAQ);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196630, "1");
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196632, System.currentTimeMillis() / 1000L);
      com.tencent.mm.plugin.offline.c.a.i(this.token, this.nAS, this.nAU, this.nAV);
      com.tencent.mm.plugin.offline.c.a.sl(this.nAT);
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196647, this.nAW);
      com.tencent.mm.plugin.offline.c.a.El(str);
      com.tencent.mm.plugin.offline.k.aVi();
      str = com.tencent.mm.plugin.offline.k.sf(196617);
      com.tencent.mm.wallet_core.c.a.clF();
      com.tencent.mm.wallet_core.c.a.clearToken(str);
      com.tencent.mm.wallet_core.c.a.clF();
      boolean bool = com.tencent.mm.wallet_core.c.a.setTokens(this.nAM, paramString);
      w.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", new Object[] { Boolean.valueOf(bool), this.nAM });
      if (bool) {
        break label521;
      }
      w.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
      paramString = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.clF();
      w.e("MicroMsg.NetSceneTenpayWxOfflineCreate", com.tencent.mm.wallet_core.c.a.getLastError());
    }
    for (;;)
    {
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196649, String.valueOf(paramInt));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vpH, p.sZ());
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vpI, paramJSONObject);
      GMTrace.o(6196698284032L, 46169);
      return;
      label509:
      w.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
      break;
      label521:
      w.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
    }
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(6196966719488L, 46171);
    com.tencent.mm.wallet_core.c.a.clF().clG();
    GMTrace.o(6196966719488L, 46171);
  }
  
  public final int aoD()
  {
    GMTrace.i(6196564066304L, 46168);
    GMTrace.o(6196564066304L, 46168);
    return 46;
  }
  
  public final String getUri()
  {
    GMTrace.i(6197235154944L, 46173);
    GMTrace.o(6197235154944L, 46173);
    return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */