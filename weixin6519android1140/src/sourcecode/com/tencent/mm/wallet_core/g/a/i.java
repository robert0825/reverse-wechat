package com.tencent.mm.wallet_core.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class i
  extends k
{
  private static int xEc;
  public RealnameGuideHelper nAD;
  private String nAE;
  private String nAF;
  private String nAG;
  private String nAH;
  private String nAI;
  protected int nEc;
  public int rhE;
  protected Map<String, String> xEa;
  public int xEb;
  private boolean xEd;
  public int xEe;
  public int xEf;
  public String xEg;
  public JSONObject xEh;
  private int xEi;
  private boolean xEj;
  
  static
  {
    GMTrace.i(1524042301440L, 11355);
    xEc = 0;
    GMTrace.o(1524042301440L, 11355);
  }
  
  public i()
  {
    GMTrace.i(1522968559616L, 11347);
    this.xEa = new HashMap();
    this.xEb = 0;
    this.xEd = false;
    this.xEe = 0;
    this.xEf = 0;
    this.xEg = null;
    this.xEh = null;
    this.xEi = 0;
    this.xEj = false;
    this.rhE = 0;
    GMTrace.o(1522968559616L, 11347);
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int j = 0;
    GMTrace.i(1523371212800L, 11350);
    if (!this.xEd)
    {
      this.xEf = paramInt;
      this.xEg = paramString;
      this.xEh = paramJSONObject;
      this.xEd = true;
      if (paramJSONObject != null) {
        this.xEb = paramJSONObject.optInt("query_order_flag", 0);
      }
    }
    int i = j;
    if (paramJSONObject != null)
    {
      i = j;
      if (paramJSONObject.has("real_name_info"))
      {
        JSONObject localJSONObject = paramJSONObject.optJSONObject("real_name_info");
        this.nAE = localJSONObject.optString("guide_flag");
        this.nAF = localJSONObject.optString("guide_wording");
        this.nAG = localJSONObject.optString("left_button_wording");
        this.nAH = localJSONObject.optString("right_button_wording");
        this.nAI = localJSONObject.optString("upload_credit_url");
        this.xEi = localJSONObject.optInt("send_pwd_msg");
        i = 1;
      }
    }
    if ((i != 0) && (("1".equals(this.nAE)) || ("2".equals(this.nAE)) || (1 == this.xEi)))
    {
      this.nAD = new RealnameGuideHelper();
      this.nAD.a(this.nAE, this.xEi, this.nAF, this.nAG, this.nAH, this.nAI, this.nEc);
    }
    this.xEj = true;
    super.a(paramInt, paramString, paramJSONObject);
    GMTrace.o(1523371212800L, 11350);
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    GMTrace.i(1523639648256L, 11352);
    w.i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", new Object[] { Integer.valueOf(paramc.errCode), paramc.eAR });
    if ((!this.xEj) && (!this.xEd))
    {
      this.xEe = paramc.errType;
      this.xEf = paramc.errCode;
      this.xEg = paramc.eAR;
      if (paramJSONObject != null)
      {
        this.xEb = paramJSONObject.optInt("query_order_flag", 0);
        this.xEh = paramJSONObject;
      }
      this.xEd = true;
    }
    GMTrace.o(1523639648256L, 11352);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    GMTrace.i(1523102777344L, 11348);
    xEc += 1;
    this.xEa.put("req_key", paramString1);
    this.xEa.put("transaction_id", paramString2);
    this.xEa.put("pay_scene", String.valueOf(paramInt1));
    this.xEa.put("bank_type", paramString3);
    this.xEa.put("channel", String.valueOf(paramInt2));
    this.xEa.put("bind_serial", paramString4);
    GMTrace.o(1523102777344L, 11348);
  }
  
  public final boolean bjT()
  {
    GMTrace.i(1523908083712L, 11354);
    GMTrace.o(1523908083712L, 11354);
    return false;
  }
  
  public boolean bxj()
  {
    GMTrace.i(1523773865984L, 11353);
    GMTrace.o(1523773865984L, 11353);
    return false;
  }
  
  public final Map<String, String> cmf()
  {
    GMTrace.i(1523236995072L, 11349);
    Map localMap = this.xEa;
    GMTrace.o(1523236995072L, 11349);
    return localMap;
  }
  
  public final boolean cmg()
  {
    GMTrace.i(1523505430528L, 11351);
    if (this.xEb == 1)
    {
      GMTrace.o(1523505430528L, 11351);
      return true;
    }
    GMTrace.o(1523505430528L, 11351);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\g\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */