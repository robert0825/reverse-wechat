package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends h
{
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(7565450674176L, 56367);
    HashMap localHashMap = new HashMap();
    localHashMap.put("toUser", paramString1);
    localHashMap.put("receiverTitle", paramString2);
    localHashMap.put("senderTitle", paramString3);
    localHashMap.put("tempId", paramString4);
    localHashMap.put("receiverdes", paramString6);
    localHashMap.put("senderdes", paramString5);
    localHashMap.put("Url", paramString7);
    localHashMap.put("Scene", paramString8);
    x(localHashMap);
    GMTrace.o(7565450674176L, 56367);
  }
  
  public final int Bb()
  {
    GMTrace.i(7565719109632L, 56369);
    GMTrace.o(7565719109632L, 56369);
    return 1962;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7565853327360L, 56370);
    w.d("Micromsg.NetSceneSendC2CMsg", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(7565853327360L, 56370);
      return;
    }
    GMTrace.o(7565853327360L, 56370);
  }
  
  public final int aoD()
  {
    GMTrace.i(7565584891904L, 56368);
    GMTrace.o(7565584891904L, 56368);
    return 0;
  }
  
  public final String getUri()
  {
    GMTrace.i(7565987545088L, 56371);
    GMTrace.o(7565987545088L, 56371);
    return "/cgi-bin/mmpay-bin/h5sendc2cmsg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */