package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public final class q
{
  public String uTW;
  public String xDA;
  public String xDB;
  public int xDC;
  public String xDz;
  
  public q()
  {
    GMTrace.i(1442035269632L, 10744);
    this.xDz = "";
    this.xDA = "";
    this.xDB = "";
    this.uTW = "";
    this.xDC = 0;
    GMTrace.o(1442035269632L, 10744);
  }
  
  public q(JSONObject paramJSONObject)
  {
    GMTrace.i(1442169487360L, 10745);
    this.xDz = "";
    this.xDA = "";
    this.xDB = "";
    this.uTW = "";
    this.xDC = 0;
    this.xDz = paramJSONObject.optString("device_id");
    this.xDA = paramJSONObject.optString("device_name");
    this.xDB = paramJSONObject.optString("device_os");
    this.xDC = paramJSONObject.optInt("Is_cur_device");
    this.uTW = paramJSONObject.optString("crt_no");
    GMTrace.o(1442169487360L, 10745);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */