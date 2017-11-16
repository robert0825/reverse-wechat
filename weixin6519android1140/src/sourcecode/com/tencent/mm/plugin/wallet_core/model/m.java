package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public final class m
{
  public long rgN;
  public long rgO;
  public long rgP;
  public int rgQ;
  public int rgR;
  public long rgS;
  
  public m()
  {
    GMTrace.i(20886157524992L, 155614);
    GMTrace.o(20886157524992L, 155614);
  }
  
  public static final class a
  {
    public String nIR;
    public String name;
    public String rgT;
    public String rgU;
    public String title;
    public int type;
    public String url;
    
    public a()
    {
      GMTrace.i(20887768137728L, 155626);
      GMTrace.o(20887768137728L, 155626);
    }
    
    public final void P(JSONObject paramJSONObject)
    {
      GMTrace.i(20887902355456L, 155627);
      this.url = paramJSONObject.optString("url");
      this.name = paramJSONObject.optString("wording");
      this.nIR = paramJSONObject.optString("icon");
      this.rgT = paramJSONObject.optString("btn_text");
      this.type = paramJSONObject.optInt("type");
      this.title = paramJSONObject.optString("title");
      this.rgU = paramJSONObject.optString("small_title");
      GMTrace.o(20887902355456L, 155627);
    }
  }
  
  public static final class b
  {
    public String rgV;
    public String rgW;
    public String rgX;
    public String rgY;
    public String rgZ;
    public String rha;
    public int rhb;
    
    public b()
    {
      GMTrace.i(20888305008640L, 155630);
      GMTrace.o(20888305008640L, 155630);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */