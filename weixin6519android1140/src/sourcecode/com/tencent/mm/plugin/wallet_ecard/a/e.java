package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ark;
import com.tencent.mm.protocal.c.arl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int jWs;
  public String jWt;
  public arl rrC;
  
  public e(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(19589748490240L, 145955);
    this.jWs = 0;
    this.jWt = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ark();
    ((b.a)localObject).gtG = new arl();
    ((b.a)localObject).gtE = 1958;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/openecardauth";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ark)this.fUa.gtC.gtK;
    ((ark)localObject).tUk = paramString1;
    ((ark)localObject).uHE = paramString2;
    ((ark)localObject).ePo = paramInt;
    w.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    GMTrace.o(19589748490240L, 145955);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19590151143424L, 145958);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19590151143424L, 145958);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19589882707968L, 145956);
    w.i("MicroMsg.NetSceneOpenECardAuth", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.rrC = ((arl)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneOpenECardAuth", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.rrC.jzH), this.rrC.jzI });
    if (!bg.nm(this.rrC.uHF)) {
      w.d("MicroMsg.NetSceneOpenECardAuth", "rettext: %s", new Object[] { this.rrC.uHF });
    }
    try
    {
      paramq = new JSONObject(this.rrC.uHF);
      this.jWs = paramq.optInt("retcode", 0);
      this.jWt = paramq.optString("retmsg", "");
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(19589882707968L, 145956);
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneOpenECardAuth", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(19590016925696L, 145957);
    GMTrace.o(19590016925696L, 145957);
    return 1958;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */