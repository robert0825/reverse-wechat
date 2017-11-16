package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.protocal.c.vi;
import com.tencent.mm.protocal.c.vj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.l;

public final class a
  extends l
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String rsd;
  public String rse;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2)
  {
    GMTrace.i(15052115542016L, 112147);
    Object localObject1 = new b.a();
    ((b.a)localObject1).gtF = new vi();
    ((b.a)localObject1).gtG = new vj();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/genprepay";
    ((b.a)localObject1).gtE = 398;
    ((b.a)localObject1).gtH = 189;
    ((b.a)localObject1).gtI = 1000000189;
    this.fUa = ((b.a)localObject1).DA();
    Object localObject2 = com.tencent.mm.plugin.soter.c.b.bqB();
    localObject1 = ((c)localObject2).qpg;
    localObject2 = ((c)localObject2).qph;
    vi localvi = (vi)this.fUa.gtC.gtK;
    localvi.lQa = paramString1;
    localvi.udg = paramString4;
    localvi.udf = paramString3;
    localvi.udh = paramString5;
    localvi.udi = paramString2;
    localvi.tUz = paramString6;
    localvi.ucv = paramString7;
    localvi.unC = paramString8;
    localvi.tMZ = paramInt1;
    localvi.unD = ((String)localObject1);
    localvi.lTe = ((String)localObject2);
    localvi.tYT = h.byp();
    if (paramInt2 > 0) {
      localvi.tOG = paramInt2;
    }
    w.d("MicroMsg.NetSceneGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    GMTrace.o(15052115542016L, 112147);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7564645367808L, 56361);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(7564645367808L, 56361);
    return i;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    GMTrace.i(7564376932352L, 56359);
    w.d("MicroMsg.NetSceneGenPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (vj)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    w.i("MicroMsg.NetSceneGenPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramString.kBk), paramString.kBl });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.d("MicroMsg.NetSceneGenPrepay", "rr " + paramString.unE);
      this.rsd = paramString.unE;
      this.rse = paramString.unF;
    }
    paramq = paramString.kBl;
    paramInt2 = paramString.kBk;
    this.fUd.a(paramInt1, paramInt2, paramq, this);
    GMTrace.o(7564376932352L, 56359);
  }
  
  public final int getType()
  {
    GMTrace.i(7564511150080L, 56360);
    GMTrace.o(7564511150080L, 56360);
    return 398;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */