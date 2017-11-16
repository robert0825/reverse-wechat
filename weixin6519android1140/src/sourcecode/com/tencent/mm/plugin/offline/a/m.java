package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends h
{
  public String nAO;
  public String nAP;
  public String nAQ;
  public String nAS;
  public int nAT;
  public String nAU;
  public String nAV;
  public String nAW;
  private String nAY;
  private int nAZ;
  public String nBa;
  public int nBb;
  public String token;
  
  public m(String paramString, int paramInt)
  {
    this(paramString, paramInt, paramInt);
    GMTrace.i(6200053727232L, 46194);
    GMTrace.o(6200053727232L, 46194);
  }
  
  public m(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(14311770554368L, 106631);
    this.token = "";
    this.nAO = "";
    this.nAP = "";
    this.nAQ = "";
    this.nAS = "";
    this.nAT = 0;
    this.nAU = "";
    this.nAV = "";
    this.nAW = "";
    this.nBb = 0;
    w.v("MicroMsg.NetSceneTenpayWxOfflineGetToken", "scene %s stack %s ", new Object[] { Integer.valueOf(paramInt1), bg.bQW().toString() });
    String str2 = com.tencent.mm.plugin.offline.c.a.aWg();
    com.tencent.mm.plugin.offline.k.aVi();
    String str1 = com.tencent.mm.plugin.offline.k.sf(196628);
    Object localObject = str1;
    if (TextUtils.isEmpty(str1)) {
      localObject = p.ta();
    }
    if (TextUtils.isEmpty(str2))
    {
      paramString = (String)localObject + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000);
      localObject = new HashMap();
      ((Map)localObject).put("token_src", paramString);
      com.tencent.mm.plugin.offline.k.aVi();
      str1 = com.tencent.mm.plugin.offline.k.sf(196617);
      switch (paramInt2)
      {
      default: 
        paramInt2 = 12;
        label275:
        g.ork.a(135L, paramInt2, 1L, true);
        com.tencent.mm.wallet_core.c.a.clF();
        if (com.tencent.mm.wallet_core.c.a.isCertExist(str1))
        {
          com.tencent.mm.wallet_core.c.a.clF();
          paramString = com.tencent.mm.wallet_core.c.a.genUserSig(str1, paramString);
          w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
          if (!TextUtils.isEmpty(paramString)) {
            break label746;
          }
          w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken sign is empty!");
          g.ork.a(135L, 4L, 1L, true);
          label346:
          ((Map)localObject).put("sign", paramString);
          ((Map)localObject).put("cert_no", str1);
          ((Map)localObject).put("type", k.nAR);
          ((Map)localObject).put("version_number", k.nAR);
          if (com.tencent.mm.plugin.offline.c.a.aWf() != 2) {
            break label757;
          }
          ((Map)localObject).put("last_token", com.tencent.mm.plugin.offline.c.a.aWh());
          label415:
          ((Map)localObject).put("scene", String.valueOf(paramInt1));
          w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "inOfflineUI: %B", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.offline.k.nAn) });
          if (!com.tencent.mm.plugin.offline.k.nAn) {
            break label773;
          }
          ((Map)localObject).put("fetch_tag", "1");
        }
        break;
      }
    }
    for (;;)
    {
      x((Map)localObject);
      GMTrace.o(14311770554368L, 106631);
      return;
      paramString = (String)localObject + "&" + paramString + "&" + ((int)(Math.random() * 1000000.0D) + 1000000) + "&" + str2;
      break;
      paramInt2 = 12;
      break label275;
      paramInt2 = 13;
      break label275;
      paramInt2 = 14;
      break label275;
      paramInt2 = 15;
      break label275;
      paramInt2 = 16;
      break label275;
      paramInt2 = 17;
      break label275;
      paramInt2 = 18;
      break label275;
      paramInt2 = 19;
      break label275;
      paramInt2 = 20;
      break label275;
      paramInt2 = 24;
      break label275;
      paramInt2 = 72;
      break label275;
      paramString = new StringBuilder("NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.clF();
      w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", com.tencent.mm.wallet_core.c.a.getLastError());
      g.ork.a(135L, 6L, 1L, true);
      com.tencent.mm.kernel.h.xz();
      paramString = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vpH, "");
      if ((paramString != null) && (paramString.equals(p.sZ()))) {
        w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
      }
      for (;;)
      {
        w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: " + str1);
        paramString = "";
        break;
        w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
        g.ork.a(135L, 5L, 1L, true);
      }
      label746:
      w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "sign is valid");
      break label346;
      label757:
      ((Map)localObject).put("last_token", com.tencent.mm.plugin.offline.c.a.aWg());
      break label415;
      label773:
      ((Map)localObject).put("fetch_tag", "0");
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(6200590598144L, 46198);
    if (com.tencent.mm.plugin.offline.k.nAn)
    {
      GMTrace.o(6200590598144L, 46198);
      return 571;
    }
    GMTrace.o(6200590598144L, 46198);
    return 1725;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6200322162688L, 46196);
    w.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      this.token = paramJSONObject.optString("token");
      this.nAO = paramJSONObject.optString("valid_end");
      this.nAP = paramJSONObject.optString("encrypt_str");
      this.nAQ = paramJSONObject.optString("deviceid");
      this.nAS = paramJSONObject.optString("token_v2");
      this.nAT = paramJSONObject.optInt("algorithm_type");
      this.nAU = paramJSONObject.optString("card_list");
      this.nAV = paramJSONObject.optString("key_list");
      this.nAW = paramJSONObject.optString("token_pin");
      this.nAY = paramJSONObject.optString("auth_codes");
      this.nAZ = paramJSONObject.optInt("update_interval");
      this.nBa = paramJSONObject.optString("code_ver");
      this.nBb = paramJSONObject.optInt("reget_token_num", 0);
      if (this.nBb <= 0) {
        break label223;
      }
    }
    label223:
    for (com.tencent.mm.plugin.offline.k.nAo = this.nBb;; com.tencent.mm.plugin.offline.k.nAo = 10)
    {
      w.d("MicroMsg.NetSceneTenpayWxOfflineGetToken", "json: %s", new Object[] { paramJSONObject.toString() });
      GMTrace.o(6200322162688L, 46196);
      return;
    }
  }
  
  public final void aVp()
  {
    GMTrace.i(6200456380416L, 46197);
    w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196626, this.nAO);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196627, this.nAP);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196628, this.nAQ);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196632, System.currentTimeMillis() / 1000L);
    com.tencent.mm.plugin.offline.c.a.i(this.token, this.nAS, this.nAU, this.nAV);
    com.tencent.mm.plugin.offline.c.a.sl(this.nAT);
    com.tencent.mm.plugin.offline.k.aVi();
    com.tencent.mm.plugin.offline.k.ai(196647, this.nAW);
    com.tencent.mm.plugin.offline.k.aVi();
    Object localObject = com.tencent.mm.plugin.offline.k.sf(196617);
    com.tencent.mm.wallet_core.c.a.clF();
    com.tencent.mm.wallet_core.c.a.clearToken((String)localObject);
    com.tencent.mm.wallet_core.c.a.clF();
    if (!com.tencent.mm.wallet_core.c.a.setTokens((String)localObject, this.nAY))
    {
      w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
      localObject = new StringBuilder("WalletOfflineEntranceUI CertUtil.getInstance().getLastError():");
      com.tencent.mm.wallet_core.c.a.clF();
      w.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", com.tencent.mm.wallet_core.c.a.getLastError());
    }
    for (;;)
    {
      com.tencent.mm.plugin.offline.k.aVi();
      com.tencent.mm.plugin.offline.k.ai(196649, this.nAZ);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vpI, this.nBa);
      GMTrace.o(6200456380416L, 46197);
      return;
      w.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(6200187944960L, 46195);
    if (com.tencent.mm.plugin.offline.k.nAn)
    {
      GMTrace.o(6200187944960L, 46195);
      return 52;
    }
    GMTrace.o(6200187944960L, 46195);
    return 1725;
  }
  
  public final String getUri()
  {
    GMTrace.i(6200724815872L, 46199);
    if (com.tencent.mm.plugin.offline.k.nAn)
    {
      GMTrace.o(6200724815872L, 46199);
      return "/cgi-bin/mmpay-bin/tenpay/offlinegettoken";
    }
    GMTrace.o(6200724815872L, 46199);
    return "/cgi-bin/mmpay-bin/tenpay/offlinegettokenbackground";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */