package com.tencent.mm.plugin.wallet_index.c.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.protocal.c.ati;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class a
  extends l
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String rsd;
  public String rse;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    GMTrace.i(7566927069184L, 56378);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ath();
    ((b.a)localObject).gtG = new ati();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payugenprepay";
    ((b.a)localObject).gtE = 1521;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ath)this.fUa.gtC.gtK;
    ((ath)localObject).lQa = paramString1;
    ((ath)localObject).udg = paramString4;
    ((ath)localObject).udf = paramString3;
    ((ath)localObject).udh = paramString5;
    ((ath)localObject).udi = paramString2;
    ((ath)localObject).tUz = paramString6;
    ((ath)localObject).ucv = paramString7;
    ((ath)localObject).unC = paramString8;
    ((ath)localObject).tMZ = paramInt;
    w.d("MicroMsg.NetScenePayUGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8 }));
    GMTrace.o(7566927069184L, 56378);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7567329722368L, 56381);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7567329722368L, 56381);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7567061286912L, 56379);
    w.d("MicroMsg.NetScenePayUGenPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (ati)((b)paramq).gtD.gtK;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.d("MicroMsg.NetScenePayUGenPrepay", "rr " + paramString.unE);
      this.rsd = paramString.unE;
      this.rse = paramString.unF;
    }
    paramString = paramString.kBl;
    this.fUd.a(paramInt1, paramInt2, paramString, this);
    GMTrace.o(7567061286912L, 56379);
  }
  
  public final int getType()
  {
    GMTrace.i(7567195504640L, 56380);
    GMTrace.o(7567195504640L, 56380);
    return 1521;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */