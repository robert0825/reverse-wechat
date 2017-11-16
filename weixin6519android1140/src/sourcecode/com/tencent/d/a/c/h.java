package com.tencent.d.a.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public String signature = "";
  private long yaf = -1L;
  private String yai = null;
  public String yaj = null;
  private String yak = "";
  private String yal = "";
  private String yam = "";
  private String yan = "";
  private String yao = "";
  public int yap = 20;
  public String yaq = "";
  
  public static h Yy(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      h localh = new h();
      localh.yaq = paramString;
      localh.yai = localJSONObject.optString("raw");
      localh.yaj = localJSONObject.optString("fid");
      localh.yaf = localJSONObject.optLong("counter");
      localh.yak = localJSONObject.optString("tee_n");
      localh.yal = localJSONObject.optString("tee_v");
      localh.yam = localJSONObject.optString("fp_n");
      localh.yan = localJSONObject.optString("fp_v");
      localh.yao = localJSONObject.optString("cpu_id");
      localh.yap = localJSONObject.optInt("rsa_pss_saltlen", 20);
      return localh;
    }
    catch (JSONException paramString)
    {
      c.e("Soter.SoterSignatureResult", "soter: convert from json failed." + paramString.toString(), new Object[0]);
    }
    return null;
  }
  
  public final String toString()
  {
    return "SoterSignatureResult{rawValue='" + this.yai + '\'' + ", fid='" + this.yaj + '\'' + ", counter=" + this.yaf + ", TEEName='" + this.yak + '\'' + ", TEEVersion='" + this.yal + '\'' + ", FpName='" + this.yam + '\'' + ", FpVersion='" + this.yan + '\'' + ", cpuId='" + this.yao + '\'' + ", saltLen=" + this.yap + ", jsonValue='" + this.yaq + '\'' + ", signature='" + this.signature + '\'' + '}';
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */