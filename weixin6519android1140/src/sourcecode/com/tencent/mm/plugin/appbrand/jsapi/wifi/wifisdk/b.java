package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public final class b
{
  public String ioL;
  public String ioM;
  public int ioN;
  public boolean ioO;
  public boolean ioP;
  public boolean ioQ;
  
  public b()
  {
    GMTrace.i(19818589716480L, 147660);
    this.ioL = "";
    this.ioM = "";
    this.ioO = false;
    this.ioP = false;
    this.ioQ = false;
    GMTrace.o(19818589716480L, 147660);
  }
  
  public final JSONObject on()
  {
    GMTrace.i(19818858151936L, 147662);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("SSID", this.ioL);
    localJSONObject.put("BSSID", this.ioM);
    localJSONObject.put("secure", this.ioO);
    localJSONObject.put("signalStrength", this.ioN);
    GMTrace.o(19818858151936L, 147662);
    return localJSONObject;
  }
  
  public final String toString()
  {
    GMTrace.i(19818723934208L, 147661);
    String str = "WiFiItem{mSsid='" + this.ioL + '\'' + ", mBssid='" + this.ioM + '\'' + ", mSignalStrength=" + this.ioN + ", mSecurity=" + this.ioO + '}';
    GMTrace.o(19818723934208L, 147661);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */