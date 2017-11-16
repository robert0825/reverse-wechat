package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends h
{
  public c(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, (byte)0);
    GMTrace.i(6839869636608L, 50961);
    GMTrace.o(6839869636608L, 50961);
  }
  
  private c(String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    GMTrace.i(6840003854336L, 50962);
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    w.i("MicroMsg.NetSceneRealNameReg", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    x(localHashMap);
    GMTrace.o(6840003854336L, 50962);
  }
  
  public final int Bb()
  {
    GMTrace.i(6840540725248L, 50966);
    GMTrace.o(6840540725248L, 50966);
    return 1648;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6840272289792L, 50964);
    w.i("MicroMsg.NetSceneRealNameReg", "errCode=" + paramString + ";errMsg=" + paramString);
    GMTrace.o(6840272289792L, 50964);
  }
  
  public final int aoD()
  {
    GMTrace.i(6840138072064L, 50963);
    GMTrace.o(6840138072064L, 50963);
    return 1648;
  }
  
  public final String getUri()
  {
    GMTrace.i(6840406507520L, 50965);
    GMTrace.o(6840406507520L, 50965);
    return "/cgi-bin/mmpay-bin/tenpay/realnamereg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */