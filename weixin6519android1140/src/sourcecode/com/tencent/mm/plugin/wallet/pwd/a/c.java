package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.model.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.wallet_core.g.a.h
{
  public String raA;
  public String raB;
  public int rax;
  public String ray;
  public int raz;
  
  public c()
  {
    GMTrace.i(7738323107840L, 57655);
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceid", p.getDeviceID(ab.getContext()));
    x(localHashMap);
    GMTrace.o(7738323107840L, 57655);
  }
  
  public static boolean brk()
  {
    GMTrace.i(7738725761024L, 57658);
    com.tencent.mm.kernel.h.xz();
    long l = ((Long)com.tencent.mm.kernel.h.xy().xh().get(w.a.vua, Long.valueOf(0L))).longValue();
    com.tencent.mm.kernel.h.xz();
    int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vub, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.NetSceneTenpayPayManager", "check isExpire %s %s %s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Long.valueOf(i + l) });
    if (l > 0L)
    {
      if (Long.valueOf(new Date().getTime() / 1000L).longValue() > i + l)
      {
        GMTrace.o(7738725761024L, 57658);
        return true;
      }
      GMTrace.o(7738725761024L, 57658);
      return false;
    }
    GMTrace.o(7738725761024L, 57658);
    return true;
  }
  
  private static boolean uE(String paramString)
  {
    GMTrace.i(7738859978752L, 57659);
    if (bg.nm(paramString))
    {
      GMTrace.o(7738859978752L, 57659);
      return false;
    }
    int i = paramString.length();
    int j;
    do
    {
      i -= 1;
      if (i < 0)
      {
        GMTrace.o(7738859978752L, 57659);
        return true;
      }
      j = paramString.charAt(i);
    } while ((j >= 48) && (j <= 57));
    GMTrace.o(7738859978752L, 57659);
    return false;
  }
  
  public final int Bb()
  {
    GMTrace.i(7738994196480L, 57660);
    GMTrace.o(7738994196480L, 57660);
    return 1654;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(7738591543296L, 57657);
    w.i("MicroMsg.NetSceneTenpayPayManager", "errCode:" + paramInt + ";errMsg:" + paramString);
    w.d("MicroMsg.NetSceneTenpayPayManager", "json: %s", new Object[] { paramJSONObject.toString() });
    label115:
    String str1;
    if (paramInt == 0)
    {
      paramString = paramJSONObject.optString("is_show_deduct", "0");
      if (!uE(paramString)) {
        break label517;
      }
      this.rax = Integer.valueOf(paramString).intValue();
      this.ray = paramJSONObject.optString("deduct_show_url", "");
      paramString = paramJSONObject.optString("deduct_cache_time", "");
      if (!uE(paramString)) {
        break label523;
      }
      this.raz = Integer.valueOf(paramString).intValue();
      this.raA = paramJSONObject.optString("deduct_title", "");
      this.raB = paramJSONObject.optString("realname_url", "");
      paramString = paramJSONObject.optString("payway_select_wording", "");
      str1 = paramJSONObject.optString("payway_change_wording", "");
      Object localObject = new y();
      ((y)localObject).field_is_show = this.rax;
      ((y)localObject).field_pref_key = "wallet_open_auto_pay";
      ((y)localObject).field_pref_title = this.raA;
      ((y)localObject).field_pref_url = this.ray;
      com.tencent.mm.plugin.wallet_core.d.h localh = n.byw();
      if (!bg.nm("wallet_open_auto_pay"))
      {
        String str2 = "delete from WalletPrefInfo where pref_key='" + "wallet_open_auto_pay" + "'";
        localh.fTZ.eZ("WalletPrefInfo", str2);
      }
      w.i("MicroMsg.NetSceneTenpayPayManager", "deductCacheTime %s", new Object[] { Integer.valueOf(this.raz) });
      n.byw().b((com.tencent.mm.sdk.e.c)localObject);
      localObject = paramJSONObject.optJSONObject("unreg_info");
      if (localObject == null) {
        break label530;
      }
      paramJSONObject = ((JSONObject)localObject).optString("unreg_title", "");
      localObject = ((JSONObject)localObject).optString("unreg_url", "");
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzt, paramJSONObject);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzu, localObject);
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vua, Long.valueOf(new Date().getTime() / 1000L));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vub, Integer.valueOf(this.raz));
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vuh, this.raB);
      if (!bg.nm(paramString))
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vuo, paramString);
      }
      if (!bg.nm(str1))
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vup, str1);
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().kL(true);
      GMTrace.o(7738591543296L, 57657);
      return;
      label517:
      paramString = "0";
      break;
      label523:
      paramString = "84600";
      break label115;
      label530:
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzt, "");
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzu, "");
    }
  }
  
  public final int aoD()
  {
    GMTrace.i(7738457325568L, 57656);
    GMTrace.o(7738457325568L, 57656);
    return 0;
  }
  
  public final int bxK()
  {
    GMTrace.i(7739128414208L, 57661);
    GMTrace.o(7739128414208L, 57661);
    return 100000;
  }
  
  public final String getUri()
  {
    GMTrace.i(7739262631936L, 57662);
    GMTrace.o(7739262631936L, 57662);
    return "/cgi-bin/mmpay-bin/tenpay/paymanage";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */