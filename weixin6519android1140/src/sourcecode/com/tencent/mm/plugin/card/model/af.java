package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.age;
import com.tencent.mm.protocal.c.agf;
import com.tencent.mm.sdk.platformtools.w;

public final class af
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String eTK;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public int jzH;
  public String jzI;
  
  public af(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4904449998848L, 36541);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new age();
    ((b.a)localObject).gtG = new agf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/giftcarditem";
    ((b.a)localObject).gtE = 652;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (age)this.fUa.gtC.gtK;
    ((age)localObject).eTJ = paramString1;
    ((age)localObject).uvT = paramString2;
    ((age)localObject).uvU = paramInt;
    GMTrace.o(4904449998848L, 36541);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4904718434304L, 36543);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4904718434304L, 36543);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4904852652032L, 36544);
    w.i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agf)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.eTK = paramq.eTK;
        this.jzI = paramq.jzI;
        this.jzH = paramq.jzH;
      }
    }
    for (;;)
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4904852652032L, 36544);
      return;
      paramq = (agf)this.fUa.gtD.gtK;
      if (paramq != null)
      {
        this.eTK = paramq.eTK;
        this.jzI = paramq.jzI;
        this.jzH = paramq.jzH;
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4904584216576L, 36542);
    GMTrace.o(4904584216576L, 36542);
    return 652;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */