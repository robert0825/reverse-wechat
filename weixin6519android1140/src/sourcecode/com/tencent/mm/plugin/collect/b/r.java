package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class r
  extends h
{
  public String desc;
  public String eCU;
  public String jWR;
  public double jWS;
  
  public r(double paramDouble, String paramString1, String paramString2)
  {
    GMTrace.i(5400116068352L, 40234);
    this.jWR = null;
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("fee", Math.round(100.0D * paramDouble));
      localHashMap.put("fee_type", paramString1);
      localHashMap.put("desc", URLEncoder.encode(paramString2, "UTF-8"));
      this.jWS = paramDouble;
      this.eCU = paramString1;
      this.desc = paramString2;
      x(localHashMap);
      GMTrace.o(5400116068352L, 40234);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }
  
  public final int Bb()
  {
    GMTrace.i(5400384503808L, 40236);
    GMTrace.o(5400384503808L, 40236);
    return 1623;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(5400652939264L, 40238);
    w.d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(5400652939264L, 40238);
      return;
    }
    this.jWR = paramJSONObject.optString("pay_url");
    GMTrace.o(5400652939264L, 40238);
  }
  
  public final int aoD()
  {
    GMTrace.i(5400250286080L, 40235);
    GMTrace.o(5400250286080L, 40235);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(5400518721536L, 40237);
    GMTrace.o(5400518721536L, 40237);
    return "/cgi-bin/mmpay-bin/transfersetf2ffee";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */