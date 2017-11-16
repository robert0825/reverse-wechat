package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xs;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private Object data;
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  private s(String paramString1, String paramString2)
  {
    GMTrace.i(4527835054080L, 33735);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xs();
    ((b.a)localObject).gtG = new xt();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizjsapiresult";
    ((b.a)localObject).gtE = 1285;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (xs)this.fUa.gtC.gtK;
    ((xs)localObject).ufb = paramString1;
    ((xs)localObject).nJ = 1;
    ((xs)localObject).data = paramString2;
    this.data = null;
    GMTrace.o(4527835054080L, 33735);
  }
  
  public static void a(com.tencent.mm.ad.e parame)
  {
    GMTrace.i(4527566618624L, 33733);
    h.xx().fYr.b(1285, parame);
    GMTrace.o(4527566618624L, 33733);
  }
  
  public static boolean j(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(4527700836352L, 33734);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("brand_user_name", paramString2);
      localJSONObject.put("bizchat_id", paramString3);
      paramString1 = new s(paramString1, localJSONObject.toString());
      boolean bool = h.xx().fYr.a(paramString1, 0);
      GMTrace.o(4527700836352L, 33734);
      return bool;
    }
    catch (Exception paramString1)
    {
      GMTrace.o(4527700836352L, 33734);
    }
    return false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4528237707264L, 33738);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneGetBizJsApiResult", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4528237707264L, 33738);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4527969271808L, 33736);
    w.d("MicroMsg.NetSceneGetBizJsApiResult", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4527969271808L, 33736);
  }
  
  public final int getType()
  {
    GMTrace.i(4528103489536L, 33737);
    GMTrace.o(4528103489536L, 33737);
    return 1285;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */