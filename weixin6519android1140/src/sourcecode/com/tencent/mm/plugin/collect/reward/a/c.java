package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kp;
import com.tencent.mm.protocal.c.kq;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends a
{
  private final String TAG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private kq jXb;
  
  public c(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    GMTrace.i(19350706716672L, 144174);
    this.TAG = "MicroMsg.NetSceneQrRewardPayCheck";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new kp();
    ((b.a)localObject).gtG = new kq();
    ((b.a)localObject).gtE = 1960;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/rewardqrcodepaycheck";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (kp)this.fUa.gtC.gtK;
    ((kp)localObject).eJQ = paramString1;
    ((kp)localObject).ubq = paramString2;
    ((kp)localObject).tXd = paramString3;
    ((kp)localObject).mFu = paramInt;
    ((kp)localObject).ubo = paramString4;
    ((kp)localObject).ubn = paramString5;
    w.i("MicroMsg.NetSceneQrRewardPayCheck", "rewardid: %s, amt: %s", new Object[] { paramString2, Integer.valueOf(paramInt) });
    GMTrace.o(19350706716672L, 144174);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19350975152128L, 144176);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19350975152128L, 144176);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(19351109369856L, 144177);
    w.i("MicroMsg.NetSceneQrRewardPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.jXb = ((kq)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQrRewardPayCheck", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.jXb.jWs), this.jXb.jWt });
    if ((!this.jWW) && (this.jXb.jWs != 0)) {
      this.jWX = true;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19351109369856L, 144177);
  }
  
  public final int getType()
  {
    GMTrace.i(19350840934400L, 144175);
    GMTrace.o(19350840934400L, 144175);
    return 1960;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */