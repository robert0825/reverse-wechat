package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.biv;
import com.tencent.mm.protocal.c.biw;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.h;
import com.tencent.mm.wallet_core.c.m;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d
  extends h
{
  public String token;
  
  public d(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6842017120256L, 50977);
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("true_name", paramString1);
    localHashMap.put("identify_card", paramString2);
    localHashMap.put("cre_type", "1");
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    w.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    x(localHashMap);
    GMTrace.o(6842017120256L, 50977);
  }
  
  public final String Kb(String paramString)
  {
    GMTrace.i(6842553991168L, 50981);
    paramString = TenpayUtil.signWith3Des(paramString);
    GMTrace.o(6842553991168L, 50981);
    return paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6843225079808L, 50986);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6843225079808L, 50986);
    return i;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(6842285555712L, 50979);
    if (paramInt == 0) {
      this.token = paramJSONObject.optString("token");
    }
    GMTrace.o(6842285555712L, 50979);
  }
  
  public final void a(b paramb, azp paramazp)
  {
    GMTrace.i(6842688208896L, 50982);
    ((biv)paramb.gtC.gtK).uwW = paramazp;
    GMTrace.o(6842688208896L, 50982);
  }
  
  public final void b(b paramb, azp paramazp)
  {
    GMTrace.i(6842822426624L, 50983);
    ((biv)paramb.gtC.gtK).uJc = paramazp;
    GMTrace.o(6842822426624L, 50983);
  }
  
  public final int bxK()
  {
    GMTrace.i(6842151337984L, 50978);
    GMTrace.o(6842151337984L, 50978);
    return 0;
  }
  
  public final m d(b paramb)
  {
    GMTrace.i(6842956644352L, 50984);
    paramb = (biw)paramb.gtD.gtK;
    m localm = new m();
    localm.uxa = paramb.uxa;
    localm.uwZ = paramb.uwZ;
    localm.uwY = paramb.uwY;
    localm.uwX = paramb.uwX;
    localm.kBl = paramb.uJe;
    localm.xDt = paramb.uJd;
    GMTrace.o(6842956644352L, 50984);
    return localm;
  }
  
  public final int getType()
  {
    GMTrace.i(6843090862080L, 50985);
    GMTrace.o(6843090862080L, 50985);
    return 1616;
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6842419773440L, 50980);
    Object localObject2 = this.fUa;
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new biv();
      ((b.a)localObject1).gtG = new biw();
      ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
      ((b.a)localObject1).gtE = 1616;
      ((b.a)localObject1).gtH = 185;
      ((b.a)localObject1).gtI = 1000000185;
      localObject1 = ((b.a)localObject1).DA();
      ((i)localObject1).gtT = true;
    }
    localObject2 = (biv)((b)localObject1).gtC.gtK;
    if (paramBoolean2) {
      ((biv)localObject2).uwV = 1;
    }
    this.fUa = ((b)localObject1);
    GMTrace.o(6842419773440L, 50980);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\id_verify\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */