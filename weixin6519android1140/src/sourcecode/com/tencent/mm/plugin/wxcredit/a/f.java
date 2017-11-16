package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends h
{
  public f(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8990842945536L, 66987);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bank_type", paramString1);
    localHashMap.put("bind_serial", paramString2);
    localHashMap.put("passwd", paramString3);
    x(localHashMap);
    GMTrace.o(8990842945536L, 66987);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8991111380992L, 66989);
    GMTrace.o(8991111380992L, 66989);
  }
  
  public final int aoD()
  {
    GMTrace.i(8990977163264L, 66988);
    GMTrace.o(8990977163264L, 66988);
    return 62;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */