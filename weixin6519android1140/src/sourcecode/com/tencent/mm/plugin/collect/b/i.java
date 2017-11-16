package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ke;
import com.tencent.mm.protocal.c.kf;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private com.tencent.mm.ad.b gUL;
  public kf jWp;
  
  public i(int paramInt, com.tencent.mm.bm.b paramb, String paramString)
  {
    GMTrace.i(17427098238976L, 129842);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ke();
    ((b.a)localObject).gtG = new kf();
    ((b.a)localObject).gtE = 1384;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getf2frcvvoice";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gUL = ((b.a)localObject).DA();
    localObject = (ke)this.gUL.gtC.gtK;
    ((ke)localObject).mFu = paramInt;
    ((ke)localObject).uaU = 1;
    ((ke)localObject).jWU = paramString;
    ((ke)localObject).uaS = null;
    ((ke)localObject).uaT = paramb;
    w.i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    GMTrace.o(17427098238976L, 129842);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(17427366674432L, 129844);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(17427366674432L, 129844);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(17427500892160L, 129845);
    w.i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.jWp = ((kf)((com.tencent.mm.ad.b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.jWp.jWs), this.jWp.jWt, Integer.valueOf(this.jWp.uaU) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(17427500892160L, 129845);
  }
  
  public final int getType()
  {
    GMTrace.i(17427232456704L, 129843);
    GMTrace.o(17427232456704L, 129843);
    return 1384;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */