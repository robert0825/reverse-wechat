package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.g.a.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends h
{
  public double skt;
  
  public c(List<l> paramList, String paramString)
  {
    GMTrace.i(8990440292352L, 66984);
    this.skt = 0.0D;
    HashMap localHashMap = new HashMap();
    localHashMap.put("session_key", paramString);
    paramList = paramList.iterator();
    int i = 0;
    if (paramList.hasNext())
    {
      paramString = (l)paramList.next();
      localHashMap.put("qt_id_" + i, paramString.id);
      localHashMap.put("ans_cont_" + i, paramString.mIY);
      localHashMap.put("level_" + i, paramString.level);
      localHashMap.put("parent_id_" + i, paramString.skP);
      i += 1;
      if ((paramString.skR == null) || (!"Y".equals(paramString.mIY))) {
        break label386;
      }
      localHashMap.put("qt_id_" + i, paramString.skR.id);
      localHashMap.put("ans_cont_" + i, paramString.skR.mIY);
      localHashMap.put("level_" + i, paramString.skR.level);
      localHashMap.put("parent_id_" + i, paramString.skR.skP);
      i += 1;
    }
    label386:
    for (;;)
    {
      break;
      localHashMap.put("total_num", String.valueOf(i));
      x(localHashMap);
      GMTrace.o(8990440292352L, 66984);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(8990708727808L, 66986);
    w.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
    {
      GMTrace.o(8990708727808L, 66986);
      return;
    }
    try
    {
      this.skt = (paramJSONObject.getInt("credit_amount") / 100.0D);
      GMTrace.o(8990708727808L, 66986);
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
      GMTrace.o(8990708727808L, 66986);
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(8990574510080L, 66985);
    GMTrace.o(8990574510080L, 66985);
    return 60;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wxcredit\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */