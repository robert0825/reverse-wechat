package com.tencent.mm.plugin.emoji.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aov;
import com.tencent.mm.protocal.c.aow;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fXo;
  private int klV;
  public String klt;
  
  public q(String paramString, int paramInt)
  {
    GMTrace.i(11299253649408L, 84186);
    this.klt = paramString;
    if ((!bg.nm(paramString)) && (paramString.equals(String.valueOf(EmojiGroupInfo.vCl)))) {
      this.klt = "com.tencent.xin.emoticon.tusiji";
    }
    this.klV = paramInt;
    paramString = new b.a();
    paramString.gtF = new aov();
    paramString.gtG = new aow();
    paramString.uri = "/cgi-bin/micromsg-bin/modemotionpack";
    paramString.gtE = 413;
    paramString.gtH = 212;
    paramString.gtI = 1000000212;
    this.fUa = paramString.DA();
    GMTrace.o(11299253649408L, 84186);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11299522084864L, 84188);
    this.fXo = parame1;
    parame1 = (aov)this.fUa.gtC.gtK;
    parame1.tRS = this.klt;
    parame1.tMX = this.klV;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11299522084864L, 84188);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11299656302592L, 84189);
    w.d("MicroMsg.emoji.NetSceneModEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      if (this.klV == 1)
      {
        g.ork.a(165L, 3L, 1L, false);
        w.i("MicroMsg.emoji.NetSceneModEmotionPack", "del tukiz failed  ");
        GMTrace.o(11299656302592L, 84189);
        return;
      }
      g.ork.a(165L, 5L, 1L, false);
      w.i("MicroMsg.emoji.NetSceneModEmotionPack", "del emoji failed md5:%s", new Object[] { this.klt });
      GMTrace.o(11299656302592L, 84189);
      return;
    }
    if (this.klV == 1) {
      g.ork.a(165L, 2L, 1L, false);
    }
    for (;;)
    {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11299656302592L, 84189);
      return;
      g.ork.a(165L, 4L, 1L, false);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11299387867136L, 84187);
    GMTrace.o(11299387867136L, 84187);
    return 413;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\f\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */