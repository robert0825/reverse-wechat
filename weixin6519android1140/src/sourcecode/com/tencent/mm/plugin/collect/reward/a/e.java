package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kt;
import com.tencent.mm.protocal.c.ku;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends a
{
  private final String TAG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public ku jXd;
  
  public e(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(19347619708928L, 144151);
    this.TAG = "MicroMsg.NetSceneQrRewardScanCode";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new kt();
    ((b.a)localObject).gtG = new ku();
    ((b.a)localObject).gtE = 1516;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanrewardqrcode";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (kt)this.fUa.gtC.gtK;
    ((kt)localObject).jWu = paramString1;
    ((kt)localObject).ePH = paramInt;
    ((kt)localObject).ubv = paramString2;
    GMTrace.o(19347619708928L, 144151);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19347888144384L, 144153);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19347888144384L, 144153);
    return i;
  }
  
  protected final boolean aoE()
  {
    GMTrace.i(19348156579840L, 144155);
    GMTrace.o(19348156579840L, 144155);
    return false;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(19348022362112L, 144154);
    w.i("MicroMsg.NetSceneQrRewardScanCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.jXd = ((ku)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQrRewardScanCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.jXd.jWs), this.jXd.jWt });
    if ((!this.jWW) && (this.jXd.jWs != 0)) {
      this.jWX = true;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19348022362112L, 144154);
  }
  
  public final int getType()
  {
    GMTrace.i(19347753926656L, 144152);
    GMTrace.o(19347753926656L, 144152);
    return 1516;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */