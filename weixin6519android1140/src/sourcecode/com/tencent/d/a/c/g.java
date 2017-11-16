package com.tencent.d.a.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  public String qpg = "";
  public String signature = "";
  public int uid = -1;
  private long yaf = -1L;
  private String yag = "";
  public String yah = "";
  
  public g(String paramString1, String paramString2)
  {
    this.yah = paramString1;
    try
    {
      paramString1 = new JSONObject(paramString1);
      this.yaf = paramString1.optLong("counter");
      this.uid = paramString1.optInt("uid");
      this.qpg = paramString1.optString("cpu_id");
      this.yag = paramString1.optString("pub_key");
      this.signature = paramString2;
      return;
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        c.e("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
      }
    }
  }
  
  public final String toString()
  {
    return "SoterPubKeyModel{counter=" + this.yaf + ", uid=" + this.uid + ", cpu_id='" + this.qpg + '\'' + ", pub_key_in_x509='" + this.yag + '\'' + ", rawJson='" + this.yah + '\'' + ", signature='" + this.signature + '\'' + '}';
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */