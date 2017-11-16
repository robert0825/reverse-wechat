package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  private Map<String, String> qYz;
  public String token;
  
  public f(Authen paramAuthen, boolean paramBoolean)
  {
    GMTrace.i(7741275897856L, 57677);
    this.token = null;
    this.qYz = new HashMap();
    this.qYz.put("flag", paramAuthen.eQl);
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
    }
    this.qYz.put("bank_type", paramAuthen.nDt);
    if (paramAuthen.reg > 0) {
      this.qYz.put("cre_type", paramAuthen.reg);
    }
    if (!bg.nm(paramAuthen.ree)) {
      this.qYz.put("true_name", paramAuthen.ree);
    }
    if (!bg.nm(paramAuthen.ref)) {
      this.qYz.put("identify_card", paramAuthen.ref);
    }
    this.qYz.put("mobile_no", paramAuthen.rcs);
    this.qYz.put("bank_card_id", paramAuthen.reh);
    if (!bg.nm(paramAuthen.rei)) {
      this.qYz.put("cvv2", paramAuthen.rei);
    }
    if (!bg.nm(paramAuthen.rej)) {
      this.qYz.put("valid_thru", paramAuthen.rej);
    }
    Map localMap = this.qYz;
    if (paramBoolean) {}
    for (paramAuthen = "1";; paramAuthen = "0")
    {
      localMap.put("new_card_reset_pwd", paramAuthen);
      x(this.qYz);
      GMTrace.o(7741275897856L, 57677);
      return;
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(7742081204224L, 57683);
    GMTrace.o(7742081204224L, 57683);
    return 469;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7741678551040L, 57680);
    if (paramJSONObject != null) {
      this.token = paramJSONObject.optString("token");
    }
    GMTrace.o(7741678551040L, 57680);
  }
  
  public final boolean aVn()
  {
    GMTrace.i(7741410115584L, 57678);
    super.aVn();
    this.qYz.put("is_repeat_send", "1");
    x(this.qYz);
    GMTrace.o(7741410115584L, 57678);
    return true;
  }
  
  public final String aWg()
  {
    GMTrace.i(7741812768768L, 57681);
    String str = this.token;
    GMTrace.o(7741812768768L, 57681);
    return str;
  }
  
  public final int aoD()
  {
    GMTrace.i(7741544333312L, 57679);
    GMTrace.o(7741544333312L, 57679);
    return 10;
  }
  
  public final String getUri()
  {
    GMTrace.i(7741946986496L, 57682);
    GMTrace.o(7741946986496L, 57682);
    return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */