package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class c
{
  public String hZP;
  public List<b> ioR;
  
  public c()
  {
    GMTrace.i(19817381756928L, 147651);
    this.hZP = "ok";
    this.ioR = null;
    GMTrace.o(19817381756928L, 147651);
  }
  
  public final JSONArray Yc()
  {
    GMTrace.i(19817650192384L, 147653);
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = this.ioR.iterator();
    while (localIterator.hasNext()) {
      localJSONArray.put(((b)localIterator.next()).on());
    }
    GMTrace.o(19817650192384L, 147653);
    return localJSONArray;
  }
  
  public final String toString()
  {
    GMTrace.i(19817515974656L, 147652);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("mErrorMsg:");
    ((StringBuilder)localObject).append(this.hZP);
    ((StringBuilder)localObject).append(" mWifiList:");
    Iterator localIterator;
    if ((this.ioR != null) && (this.ioR.size() > 0)) {
      localIterator = this.ioR.iterator();
    }
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      ((StringBuilder)localObject).append(" WiFiItem:");
      ((StringBuilder)localObject).append(localb);
      continue;
      ((StringBuilder)localObject).append("null:");
    }
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(19817515974656L, 147652);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\wifi\wifisdk\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */