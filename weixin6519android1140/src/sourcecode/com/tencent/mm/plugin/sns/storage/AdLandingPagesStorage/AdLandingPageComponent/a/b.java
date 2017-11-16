package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aan;
import com.tencent.mm.protocal.c.aao;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eOQ;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8218554138624L, 61233);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aan();
    ((b.a)localObject).gtG = new aao();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
    ((b.a)localObject).gtE = 1337;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aan)this.fUa.gtC.gtK;
    ((aan)localObject).lQa = paramString1;
    ((aan)localObject).urh = paramString2;
    ((aan)localObject).urj = paramString3;
    w.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + paramString2 + " sharedAppId :" + paramString1);
    GMTrace.o(8218554138624L, 61233);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8218822574080L, 61235);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8218822574080L, 61235);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8218956791808L, 61236);
    w.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (aao)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramq.AZ().tKs != 0)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8218956791808L, 61236);
      return;
    }
    this.eOQ = paramArrayOfByte.uov;
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8218956791808L, 61236);
  }
  
  public final int getType()
  {
    GMTrace.i(8218688356352L, 61234);
    GMTrace.o(8218688356352L, 61234);
    return 1337;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */