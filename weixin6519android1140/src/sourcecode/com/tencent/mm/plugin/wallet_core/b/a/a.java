package com.tencent.mm.plugin.wallet_core.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.wallet_core.g.a.h
{
  private Map<String, String> qYA;
  public String qYK;
  private Map<String, String> qYz;
  public String token;
  
  public a(Authen paramAuthen)
  {
    GMTrace.i(6829937524736L, 50887);
    this.qYK = null;
    this.token = null;
    this.qYz = new HashMap();
    this.qYA = new HashMap();
    a(paramAuthen.oek, this.qYz, this.qYA);
    this.qYz.put("flag", paramAuthen.eQl);
    this.qYz.put("bank_type", paramAuthen.nDt);
    if (!bg.nm(paramAuthen.red)) {
      this.qYz.put("passwd", paramAuthen.red);
    }
    if (!bg.nm(paramAuthen.token)) {
      this.qYz.put("token", paramAuthen.token);
    }
    if (!bg.nm(paramAuthen.qWc))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.a.o localo = new com.tencent.mm.a.o(bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(9, null), 0));
      this.qYz.put("import_code", paramAuthen.qWc);
      this.qYz.put("qqid", localo.toString());
      if (paramAuthen.reg > 0) {
        this.qYz.put("cre_type", paramAuthen.reg);
      }
      this.qYz.put("bind_serailno", paramAuthen.nDu);
    }
    if (!bg.nm(paramAuthen.rem))
    {
      this.qYz.put("first_name", paramAuthen.rem);
      this.qYz.put("last_name", paramAuthen.ren);
      this.qYz.put("country", paramAuthen.country);
      this.qYz.put("area", paramAuthen.fjk);
      this.qYz.put("city", paramAuthen.fjl);
      this.qYz.put("address", paramAuthen.gEy);
      this.qYz.put("phone_number", paramAuthen.mhW);
      this.qYz.put("zip_code", paramAuthen.hur);
      this.qYz.put("email", paramAuthen.fjd);
      this.qYz.put("language", v.bPK());
    }
    if (!bg.nm(paramAuthen.ree)) {
      this.qYz.put("true_name", paramAuthen.ree);
    }
    if (!bg.nm(paramAuthen.ref)) {
      this.qYz.put("identify_card", paramAuthen.ref);
    }
    if (paramAuthen.reg > 0) {
      this.qYz.put("cre_type", paramAuthen.reg);
    }
    if (!bg.nm(paramAuthen.rcs)) {
      this.qYz.put("mobile_no", paramAuthen.rcs);
    }
    this.qYz.put("bank_card_id", paramAuthen.reh);
    if (!bg.nm(paramAuthen.rei)) {
      this.qYz.put("cvv2", paramAuthen.rei);
    }
    if (!bg.nm(paramAuthen.rej)) {
      this.qYz.put("valid_thru", paramAuthen.rej);
    }
    if (com.tencent.mm.wallet_core.c.o.clM())
    {
      this.qYA.put("uuid_for_bindcard", com.tencent.mm.wallet_core.c.o.clO());
      this.qYA.put("bindcard_scene", com.tencent.mm.wallet_core.c.o.clN());
    }
    x(this.qYz);
    ap(this.qYA);
    GMTrace.o(6829937524736L, 50887);
  }
  
  public final int Bb()
  {
    GMTrace.i(6830742831104L, 50893);
    GMTrace.o(6830742831104L, 50893);
    return 471;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6830340177920L, 50890);
    if (paramJSONObject != null)
    {
      this.qYK = paramJSONObject.optString("req_key");
      this.token = paramJSONObject.optString("token");
    }
    GMTrace.o(6830340177920L, 50890);
  }
  
  public final boolean aVn()
  {
    GMTrace.i(6830071742464L, 50888);
    super.aVn();
    this.qYz.put("is_repeat_send", "1");
    x(this.qYz);
    GMTrace.o(6830071742464L, 50888);
    return true;
  }
  
  public final String aWg()
  {
    GMTrace.i(6830474395648L, 50891);
    String str = this.token;
    GMTrace.o(6830474395648L, 50891);
    return str;
  }
  
  public final int aoD()
  {
    GMTrace.i(6830205960192L, 50889);
    GMTrace.o(6830205960192L, 50889);
    return 12;
  }
  
  public final String getUri()
  {
    GMTrace.i(6830608613376L, 50892);
    GMTrace.o(6830608613376L, 50892);
    return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */