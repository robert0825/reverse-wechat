package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aoc;
import com.tencent.mm.protocal.c.kc;
import com.tencent.mm.protocal.c.kd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final String TAG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public kd jWr;
  
  public k()
  {
    GMTrace.i(18063558705152L, 134584);
    this.TAG = "MicroMsg.NetSceneF2fQrcode";
    b.a locala = new b.a();
    locala.gtF = new kc();
    locala.gtG = new kd();
    locala.gtE = 1588;
    locala.uri = "/cgi-bin/mmpay-bin/f2fqrcode";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    GMTrace.o(18063558705152L, 134584);
  }
  
  private static JSONObject a(aoc paramaoc)
  {
    GMTrace.i(18064229793792L, 134589);
    if ((paramaoc != null) && (!bg.nm(paramaoc.eLQ))) {}
    for (int i = 1; i == 0; i = 0)
    {
      w.w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
      GMTrace.o(18064229793792L, 134589);
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", paramaoc.type);
      localJSONObject.put("wording", paramaoc.eLQ);
      localJSONObject.put("url", paramaoc.url);
      localJSONObject.put("waapp_username", paramaoc.uEa);
      localJSONObject.put("waapp_path", paramaoc.uEb);
      GMTrace.o(18064229793792L, 134589);
      return localJSONObject;
    }
    catch (JSONException paramaoc)
    {
      w.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramaoc, "", new Object[0]);
      GMTrace.o(18064229793792L, 134589);
    }
    return null;
  }
  
  private JSONArray am(List<aoc> paramList)
  {
    GMTrace.i(18064095576064L, 134588);
    JSONArray localJSONArray = new JSONArray();
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.w("MicroMsg.NetSceneF2fQrcode", "empty menu items");
      GMTrace.o(18064095576064L, 134588);
      return null;
    }
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        JSONObject localJSONObject = a((aoc)paramList.get(i));
        if (localJSONObject != null) {
          localJSONArray.put(i, localJSONObject);
        }
        i += 1;
      }
      GMTrace.o(18064095576064L, 134588);
      return localJSONArray;
    }
    catch (JSONException paramList)
    {
      w.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramList, "", new Object[0]);
      GMTrace.o(18064095576064L, 134588);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18063827140608L, 134586);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18063827140608L, 134586);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18063961358336L, 134587);
    this.jWr = ((kd)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneF2fQrcode", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    w.d("MicroMsg.NetSceneF2fQrcode", "payurl: %s, true_name: %s, bottom_icon_url: %s", new Object[] { this.jWr.url, this.jWr.ree, this.jWr.uaP });
    if (!bg.nm(this.jWr.url))
    {
      h.xz();
      h.xy().xh().a(w.a.vza, this.jWr.url);
    }
    if (!bg.nm(this.jWr.ree))
    {
      h.xz();
      h.xy().xh().a(w.a.vzb, this.jWr.ree);
    }
    h.xz();
    h.xy().xh().a(w.a.vzd, this.jWr.uaP);
    paramq = a(this.jWr.uaO);
    paramArrayOfByte = am(this.jWr.uaN);
    if (paramq != null)
    {
      w.d("MicroMsg.NetSceneF2fQrcode", "bottom: %s", new Object[] { paramq.toString() });
      h.xz();
      h.xy().xh().a(w.a.vzc, paramq.toString());
    }
    if (paramArrayOfByte != null)
    {
      w.d("MicroMsg.NetSceneF2fQrcode", "upright: %s", new Object[] { paramArrayOfByte.toString() });
      h.xz();
      h.xy().xh().a(w.a.vze, paramArrayOfByte.toString());
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18063961358336L, 134587);
  }
  
  public final int getType()
  {
    GMTrace.i(18063692922880L, 134585);
    GMTrace.o(18063692922880L, 134585);
    return 1588;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */