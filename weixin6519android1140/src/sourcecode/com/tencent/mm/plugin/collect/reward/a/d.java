package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kr;
import com.tencent.mm.protocal.c.ks;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends a
{
  private final String TAG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public ks jXc;
  
  public d(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(19351243587584L, 144178);
    this.TAG = "MicroMsg.NetSceneQrRewardPlaceOrder";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new kr();
    ((b.a)localObject).gtG = new ks();
    ((b.a)localObject).gtE = 1336;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/rewardqrcodeplaceorder";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (kr)this.fUa.gtC.gtK;
    ((kr)localObject).mFu = paramInt1;
    ((kr)localObject).ubt = paramInt2;
    ((kr)localObject).ubr = paramString1;
    ((kr)localObject).ubs = paramString2;
    ((kr)localObject).omE = paramString3;
    ((kr)localObject).ePH = paramInt3;
    ((kr)localObject).ubu = paramString4;
    ((kr)localObject).ubo = paramString5;
    ((kr)localObject).ubv = paramString6;
    ((kr)localObject).ubw = paramString7;
    ((kr)localObject).ubx = paramString8;
    GMTrace.o(19351243587584L, 144178);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(19351512023040L, 144180);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(19351512023040L, 144180);
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(19351646240768L, 144181);
    w.i("MicroMsg.NetSceneQrRewardPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.jXc = ((ks)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneQrRewardPlaceOrder", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.jXc.jWs), this.jXc.jWt });
    if ((!this.jWW) && (this.jXc.jWs != 0)) {
      this.jWX = true;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt1, paramInt2, paramString, this);
    }
    GMTrace.o(19351646240768L, 144181);
  }
  
  public final int getType()
  {
    GMTrace.i(19351377805312L, 144179);
    GMTrace.o(19351377805312L, 144179);
    return 1336;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */