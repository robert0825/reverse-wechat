package com.tencent.mm.plugin.wallet.pay.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.g.a.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b
  extends i
{
  private Map<String, String> qYA;
  public boolean qYB;
  public Orders qYC;
  public Authen qYD;
  public String qYE;
  public String qYF;
  private String qYG;
  private Map<String, String> qYz;
  public String token;
  
  public b(Authen paramAuthen, Orders paramOrders)
  {
    this(paramAuthen, paramOrders, false);
    GMTrace.i(7784762441728L, 58001);
    GMTrace.o(7784762441728L, 58001);
  }
  
  public b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean)
  {
    this(paramAuthen, paramOrders, paramBoolean, (byte)0);
    GMTrace.i(7784896659456L, 58002);
    GMTrace.o(7784896659456L, 58002);
  }
  
  private b(Authen paramAuthen, Orders paramOrders, boolean paramBoolean, byte paramByte)
  {
    GMTrace.i(7785030877184L, 58003);
    this.qYB = false;
    this.qYC = null;
    this.token = null;
    this.qYE = null;
    this.qYF = null;
    this.qYG = null;
    this.qYD = paramAuthen;
    this.qYC = paramOrders;
    if (paramAuthen == null) {
      throw new IllegalArgumentException("authen == null");
    }
    List localList = paramOrders.rhv;
    String str = null;
    if (localList.size() > 0) {
      str = ((Orders.Commodity)localList.get(0)).eRP;
    }
    a(paramOrders.eHG, str, paramAuthen.oek.ePL, paramAuthen.oek.ePH, paramAuthen.nDt, paramAuthen.nDu);
    if (paramAuthen.oek == null) {
      throw new IllegalArgumentException("authen.payInfo == null");
    }
    w.i("MicroMsg.NetSceneTenpayAuthen", "pay channel :" + paramAuthen.oek.ePH);
    this.qYz = new HashMap();
    this.qYA = new HashMap();
    boolean bool;
    if ((!paramBoolean) && (!bg.nm(this.qYD.red)))
    {
      bool = true;
      w.i("MicroMsg.NetSceneTenpayAuthen", "hy: has pwd: %b", new Object[] { Boolean.valueOf(bool) });
      a(paramAuthen.oek, this.qYz, this.qYA, bool);
      if (!paramBoolean) {
        break label614;
      }
      this.qYz.put("brief_reg", "1");
      label274:
      this.rhE = paramOrders.rhE;
      this.qYz.put("default_favorcomposedid", paramAuthen.reo);
      this.qYz.put("favorcomposedid", paramAuthen.rep);
      this.qYz.put("arrive_type", paramAuthen.rel);
      this.qYz.put("sms_flag", paramAuthen.req);
      this.qYz.put("ban_sms_bind_serial", paramAuthen.rer);
      this.qYz.put("ban_sms_bank_type", paramAuthen.res);
      this.qYz.put("busi_sms_flag", paramAuthen.reu);
      this.qYz.put("buttontype", paramAuthen.oek.tIK);
      w.i("MicroMsg.NetSceneTenpayAuthen", "buttontype %s not_support_retry %s", new Object[] { Integer.valueOf(paramAuthen.oek.tIK), Integer.valueOf(this.rhE) });
      switch (paramAuthen.eQl)
      {
      }
    }
    for (;;)
    {
      x(this.qYz);
      paramAuthen = ((k)h.h(k.class)).azL();
      if (paramAuthen != null) {
        this.qYA.putAll(paramAuthen);
      }
      if (o.clM())
      {
        this.qYA.put("uuid_for_bindcard", o.clO());
        this.qYA.put("bindcard_scene", o.clN());
      }
      ap(this.qYA);
      GMTrace.o(7785030877184L, 58003);
      return;
      bool = false;
      break;
      label614:
      this.qYz.put("passwd", paramAuthen.red);
      break label274;
      this.qYz.put("flag", "1");
      this.qYz.put("bank_type", paramAuthen.nDt);
      this.qYz.put("true_name", paramAuthen.ree);
      this.qYz.put("identify_card", paramAuthen.ref);
      if (paramAuthen.reg > 0) {
        this.qYz.put("cre_type", paramAuthen.reg);
      }
      this.qYz.put("mobile_no", paramAuthen.rcs);
      this.qYz.put("bank_card_id", paramAuthen.reh);
      if (!bg.nm(paramAuthen.rei)) {
        this.qYz.put("cvv2", paramAuthen.rei);
      }
      if (!bg.nm(paramAuthen.rej))
      {
        this.qYz.put("valid_thru", paramAuthen.rej);
        continue;
        this.qYz.put("flag", "2");
        this.qYz.put("bank_type", paramAuthen.nDt);
        this.qYz.put("h_bind_serial", paramAuthen.nDu);
        this.qYz.put("card_tail", paramAuthen.rek);
        if (!bg.nm(paramAuthen.ree)) {
          this.qYz.put("true_name", paramAuthen.ree);
        }
        if (!bg.nm(paramAuthen.ref)) {
          this.qYz.put("identify_card", paramAuthen.ref);
        }
        this.qYz.put("cre_type", paramAuthen.reg);
        this.qYz.put("mobile_no", paramAuthen.rcs);
        this.qYz.put("bank_card_id", paramAuthen.reh);
        if (!bg.nm(paramAuthen.rei)) {
          this.qYz.put("cvv2", paramAuthen.rei);
        }
        if (!bg.nm(paramAuthen.rej))
        {
          this.qYz.put("valid_thru", paramAuthen.rej);
          continue;
          if (paramAuthen.rec == 1)
          {
            this.qYz.put("reset_flag", "1");
            if (!bg.nm(paramAuthen.rcs)) {
              this.qYz.put("mobile_no", paramAuthen.rcs);
            }
            if (!bg.nm(paramAuthen.rei)) {
              this.qYz.put("cvv2", paramAuthen.rei);
            }
            if (!bg.nm(paramAuthen.rej)) {
              this.qYz.put("valid_thru", paramAuthen.rej);
            }
          }
          this.qYz.put("flag", "3");
          this.qYz.put("bank_type", paramAuthen.nDt);
          this.qYz.put("bind_serial", paramAuthen.nDu);
          continue;
          this.qYz.put("flag", "4");
          this.qYz.put("bank_type", paramAuthen.nDt);
          this.qYz.put("first_name", paramAuthen.rem);
          this.qYz.put("last_name", paramAuthen.ren);
          this.qYz.put("country", paramAuthen.country);
          this.qYz.put("area", paramAuthen.fjk);
          this.qYz.put("city", paramAuthen.fjl);
          this.qYz.put("address", paramAuthen.gEy);
          this.qYz.put("phone_number", paramAuthen.mhW);
          this.qYz.put("zip_code", paramAuthen.hur);
          this.qYz.put("email", paramAuthen.fjd);
          this.qYz.put("bank_card_id", paramAuthen.reh);
          if (!bg.nm(paramAuthen.rei)) {
            this.qYz.put("cvv2", paramAuthen.rei);
          }
          if (!bg.nm(paramAuthen.rej))
          {
            this.qYz.put("valid_thru", paramAuthen.rej);
            continue;
            this.qYz.put("flag", "5");
            this.qYz.put("bank_type", paramAuthen.nDt);
            this.qYz.put("first_name", paramAuthen.rem);
            this.qYz.put("last_name", paramAuthen.ren);
            this.qYz.put("country", paramAuthen.country);
            this.qYz.put("area", paramAuthen.fjk);
            this.qYz.put("city", paramAuthen.fjl);
            this.qYz.put("address", paramAuthen.gEy);
            this.qYz.put("phone_number", paramAuthen.mhW);
            this.qYz.put("zip_code", paramAuthen.hur);
            this.qYz.put("email", paramAuthen.fjd);
            this.qYz.put("bank_card_id", paramAuthen.reh);
            if (!bg.nm(paramAuthen.rei)) {
              this.qYz.put("cvv2", paramAuthen.rei);
            }
            if (!bg.nm(paramAuthen.rej)) {
              this.qYz.put("valid_thru", paramAuthen.rej);
            }
            this.qYz.put("h_bind_serial", paramAuthen.nDu);
            this.qYz.put("card_tail", paramAuthen.rek);
            continue;
            if (paramAuthen.rec == 1)
            {
              this.qYz.put("reset_flag", "1");
              if (!bg.nm(paramAuthen.rei)) {
                this.qYz.put("cvv2", paramAuthen.rei);
              }
              if (!bg.nm(paramAuthen.rej)) {
                this.qYz.put("valid_thru", paramAuthen.rej);
              }
            }
            this.qYz.put("phone_number", paramAuthen.rcs);
            this.qYz.put("flag", "6");
            this.qYz.put("bank_type", paramAuthen.nDt);
            this.qYz.put("bind_serial", paramAuthen.nDu);
          }
        }
      }
    }
  }
  
  public int Bb()
  {
    GMTrace.i(7785836183552L, 58009);
    if (this.qYD.oek.ePL == 11)
    {
      GMTrace.o(7785836183552L, 58009);
      return 1610;
    }
    if (this.qYD.oek.ePL == 21)
    {
      GMTrace.o(7785836183552L, 58009);
      return 1605;
    }
    GMTrace.o(7785836183552L, 58009);
    return 461;
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7785433530368L, 58006);
    super.a(paramInt, paramString, paramJSONObject);
    w.i("MicroMsg.NetSceneTenpayAuthen", " errCode: " + paramInt + " errMsg :" + paramString);
    w.d("MicroMsg.NetSceneTenpayAuthen", "banlance_mobile: %s", new Object[] { this.qYE });
    this.qYB = "1".equals(paramJSONObject.optString("is_free_sms"));
    this.token = paramJSONObject.optString("token");
    this.qYE = paramJSONObject.optString("balance_mobile");
    this.qYF = paramJSONObject.optString("balance_help_url");
    this.qYG = paramJSONObject.optString("modify_mobile_url");
    paramString = paramJSONObject.optString("bind_serial");
    if (!bg.nm(paramString)) {
      w.i("MicroMsg.NetSceneTenpayAuthen", "Pay Success! saving bind_serial:" + paramString);
    }
    if ("1".equals(paramJSONObject.optString("pay_flag")))
    {
      this.qZD = true;
      this.qYC = Orders.a(paramJSONObject, this.qYC);
    }
    for (;;)
    {
      w.i("MicroMsg.NetSceneTenpayAuthen", "pay_scene:" + this.qYD.oek.ePL);
      if ((paramInt != 0) || (this.qYD.oek.ePL != 39)) {
        break;
      }
      w.i("MicroMsg.NetSceneTenpayAuthen", "it's the sns scene, parse the sns pay data");
      com.tencent.mm.plugin.wallet_core.e.b.V(paramJSONObject);
      GMTrace.o(7785433530368L, 58006);
      return;
      this.qZD = false;
    }
    w.i("MicroMsg.NetSceneTenpayAuthen", "it's not the sns scene or occurs error,  errCode:" + paramInt);
    GMTrace.o(7785433530368L, 58006);
  }
  
  public final boolean aVn()
  {
    GMTrace.i(7785165094912L, 58004);
    super.aVn();
    this.qYz.put("is_repeat_send", "1");
    x(this.qYz);
    GMTrace.o(7785165094912L, 58004);
    return true;
  }
  
  public final String aWg()
  {
    GMTrace.i(7785567748096L, 58007);
    String str = this.token;
    GMTrace.o(7785567748096L, 58007);
    return str;
  }
  
  public int aoD()
  {
    GMTrace.i(7785299312640L, 58005);
    GMTrace.o(7785299312640L, 58005);
    return 0;
  }
  
  public final boolean bxi()
  {
    GMTrace.i(7785970401280L, 58010);
    if (this.qYD.oek.tID == 1)
    {
      GMTrace.o(7785970401280L, 58010);
      return true;
    }
    GMTrace.o(7785970401280L, 58010);
    return false;
  }
  
  public final boolean bxj()
  {
    GMTrace.i(7786104619008L, 58011);
    if ((this.qYD.oek.ePL == 11) || (this.qYD.oek.ePL == 21))
    {
      GMTrace.o(7786104619008L, 58011);
      return true;
    }
    GMTrace.o(7786104619008L, 58011);
    return false;
  }
  
  public String getUri()
  {
    GMTrace.i(7785701965824L, 58008);
    if (this.qYD.oek.ePL == 11)
    {
      GMTrace.o(7785701965824L, 58008);
      return "/cgi-bin/mmpay-bin/tenpay/saveauthen";
    }
    if (this.qYD.oek.ePL == 21)
    {
      GMTrace.o(7785701965824L, 58008);
      return "/cgi-bin/mmpay-bin/tenpay/fetchauthen";
    }
    GMTrace.o(7785701965824L, 58008);
    return "/cgi-bin/mmpay-bin/tenpay/authen";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\pay\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */