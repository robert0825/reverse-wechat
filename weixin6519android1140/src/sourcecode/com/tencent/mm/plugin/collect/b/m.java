package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kl;
import com.tencent.mm.protocal.c.km;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final String TAG;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public km jWI;
  
  public m(int paramInt, com.tencent.mm.bm.b paramb, String paramString)
  {
    GMTrace.i(18063021834240L, 134580);
    this.TAG = "MicroMsg.NetSceneMDRcvVoice";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new kl();
    ((b.a)localObject).gtG = new km();
    ((b.a)localObject).gtE = 1317;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getmdrcvvoice";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (kl)this.fUa.gtC.gtK;
    ((kl)localObject).mFu = paramInt;
    ((kl)localObject).uaU = 1;
    ((kl)localObject).jWU = paramString;
    ((kl)localObject).uaS = null;
    ((kl)localObject).uaT = paramb;
    w.i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(18063021834240L, 134580);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(18063290269696L, 134582);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(18063290269696L, 134582);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(18063424487424L, 134583);
    w.i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.jWI = ((km)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.jWI.jWs), this.jWI.jWt, Integer.valueOf(this.jWI.uaU) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(18063424487424L, 134583);
  }
  
  public final int getType()
  {
    GMTrace.i(18063156051968L, 134581);
    GMTrace.o(18063156051968L, 134581);
    return 1317;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */