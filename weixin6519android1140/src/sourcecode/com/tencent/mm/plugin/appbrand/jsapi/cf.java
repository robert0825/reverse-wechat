package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.protocal.c.bne;
import com.tencent.mm.protocal.c.bnf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class cf
  extends a
{
  public static final int CTRL_INDEX = 313;
  public static final String NAME = "verifyPlugin";
  
  public cf()
  {
    GMTrace.i(20747644829696L, 154582);
    GMTrace.o(20747644829696L, 154582);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(20747779047424L, 154583);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null or nil", null));
      GMTrace.o(20747779047424L, 154583);
      return;
    }
    String str = paramj.hyD;
    bne localbne = new bne();
    com.tencent.mm.ad.b.a locala = new com.tencent.mm.ad.b.a();
    locala.gtF = localbne;
    locala.gtG = new bnf();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/verifyplugin";
    locala.gtE = 1714;
    locala.gtH = 0;
    locala.gtI = 0;
    localbne.eSd = str;
    localbne.uXf = paramJSONObject.toString();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        boolean bool = true;
        GMTrace.i(20736907411456L, 154502);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
        {
          if (paramAnonymousb.gtD.gtK == null) {}
          for (;;)
          {
            w.e("MicroMsg.JsApiVerifyPlugin", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(bool) });
            paramj.v(paramInt, cf.this.d("fail:cgi fail", null));
            GMTrace.o(20736907411456L, 154502);
            return;
            bool = false;
          }
        }
        paramAnonymousString = (bnf)paramAnonymousb.gtD.gtK;
        paramAnonymousb = new HashMap();
        paramAnonymousb.put("data", paramAnonymousString.uXg);
        paramj.v(paramInt, cf.this.d("ok", paramAnonymousb));
        GMTrace.o(20736907411456L, 154502);
      }
    });
    GMTrace.o(20747779047424L, 154583);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */