package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.auf;
import com.tencent.mm.sdk.platformtools.w;

public final class ag
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String content;
  public String eRY;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public String hPK;
  public boolean jAa;
  public String jAb;
  public String jAc;
  public String jAd;
  public String jAe;
  public String jzY;
  public String jzZ;
  public int status;
  
  public ag(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(17264694788096L, 128632);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new aue();
    ((b.a)localObject).gtG = new auf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/preacceptgiftcard";
    ((b.a)localObject).gtE = 1171;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (aue)this.fUa.gtC.gtK;
    ((aue)localObject).tNN = paramInt;
    ((aue)localObject).tNO = paramString1;
    ((aue)localObject).tNP = paramString2;
    GMTrace.o(17264694788096L, 128632);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4910355578880L, 36585);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4910355578880L, 36585);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4910087143424L, 36583);
    w.i("MicroMsg.NetScenePreAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (auf)this.fUa.gtD.gtK;
      this.eRY = paramq.tNS;
      this.jzY = paramq.tNT;
      this.status = paramq.status;
      this.content = paramq.content;
      this.jzZ = paramq.jzt;
      this.hPK = paramq.uJx;
      this.jAa = paramq.jAa;
      this.jAb = paramq.uJy;
      this.jAc = paramq.uJz;
      this.jAd = paramq.uJA;
      this.jAe = paramq.uJB;
      w.d("MicroMsg.NetScenePreAcceptGiftCard", "fromUserName:%s, fromUserHeadImgUrl:%s, status:%d, content:%s,buttonWording:%s, backgroundColor:%s, ignore:%b", new Object[] { this.eRY, this.jzY, Integer.valueOf(this.status), this.content, this.jzZ, this.hPK, Boolean.valueOf(this.jAa) });
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4910087143424L, 36583);
  }
  
  public final int getType()
  {
    GMTrace.i(4910221361152L, 36584);
    GMTrace.o(4910221361152L, 36584);
    return 1171;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\card\model\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */