package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n
  extends h
{
  public JSONObject mXK;
  public String rcA;
  
  public n(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, String paramString6, int paramInt1, int paramInt2)
  {
    GMTrace.i(20877030719488L, 155546);
    this.rcA = "";
    this.rcA = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramString1);
    localHashMap.put("award_id", paramString2);
    localHashMap.put("send_record_id", paramString3);
    localHashMap.put("user_record_id", paramString4);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong1));
    localHashMap.put("activity_type", String.valueOf(paramLong2));
    localHashMap.put("bank_type", paramString5);
    localHashMap.put("bank_serial", paramString6);
    localHashMap.put("bindbankscene", String.valueOf(paramInt1));
    localHashMap.put("realname_scene", String.valueOf(paramInt2));
    x(localHashMap);
    GMTrace.o(20877030719488L, 155546);
  }
  
  public final int Bb()
  {
    GMTrace.i(20877433372672L, 155549);
    GMTrace.o(20877433372672L, 155549);
    return 1773;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(20877567590400L, 155550);
    w.i("MicroMsg.NetSceneTenpayQueryBindPayaward", "errcode %s errmsg %s json %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    this.mXK = paramJSONObject;
    GMTrace.o(20877567590400L, 155550);
  }
  
  public final boolean aVo()
  {
    GMTrace.i(20877701808128L, 155551);
    GMTrace.o(20877701808128L, 155551);
    return false;
  }
  
  public final int aoD()
  {
    GMTrace.i(20877164937216L, 155547);
    GMTrace.o(20877164937216L, 155547);
    return 1773;
  }
  
  public final String getUri()
  {
    GMTrace.i(20877299154944L, 155548);
    GMTrace.o(20877299154944L, 155548);
    return "/cgi-bin/mmpay-bin/tenpay/querybindcardaward";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */