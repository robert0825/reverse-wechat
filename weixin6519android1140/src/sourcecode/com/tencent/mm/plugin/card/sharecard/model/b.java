package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ym;
import com.tencent.mm.protocal.c.yn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public String jAY;
  public String jzG;
  
  public b(double paramDouble1, double paramDouble2, String paramString)
  {
    GMTrace.i(5059471474688L, 37696);
    this.jAY = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ym();
    ((b.a)localObject).gtG = new yn();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
    ((b.a)localObject).gtE = 1164;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ym)this.fUa.gtC.gtK;
    ((ym)localObject).latitude = paramDouble1;
    ((ym)localObject).longitude = paramDouble2;
    ((ym)localObject).jAY = paramString;
    at.AR();
    ((ym)localObject).upv = ((String)c.xh().get(w.a.vrc, ""));
    w.d("MicroMsg.NetSceneGetCardsHomePageLayout", "red_buff:" + ((ym)localObject).upv);
    GMTrace.o(5059471474688L, 37696);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5059874127872L, 37699);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5059874127872L, 37699);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5059605692416L, 37697);
    w.i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1164), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (yn)this.fUa.gtD.gtK;
      w.v("MicroMsg.NetSceneGetCardsHomePageLayout", "json:" + paramq.jzG);
      this.jzG = paramq.jzG;
      this.jAY = paramq.jAY;
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5059605692416L, 37697);
  }
  
  public final int getType()
  {
    GMTrace.i(15360816316416L, 114447);
    GMTrace.o(15360816316416L, 114447);
    return 1164;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */