package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqn;
import com.tencent.mm.protocal.c.aqo;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  private byte[] otf;
  private int otg;
  private String oth;
  private String oti;
  private int otj;
  
  public e(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(6052682661888L, 45096);
    this.otg = 1;
    this.oth = "en";
    this.oti = "zh_CN";
    this.otf = paramArrayOfByte;
    this.otg = 1;
    this.oth = paramString1;
    this.oti = paramString2;
    this.otj = paramInt;
    GMTrace.o(6052682661888L, 45096);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6052816879616L, 45097);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new aqn();
    parame1.gtG = new aqo();
    parame1.uri = "/cgi-bin/micromsg-bin/ocrtranslation";
    parame1.gtE = 392;
    parame1.gtH = 199;
    parame1.gtI = 1000000199;
    this.fUa = parame1.DA();
    parame1 = (aqn)this.fUa.gtC.gtK;
    parame1.tWr = ((int)bg.Pv() & 0x7FFFFFFF);
    parame1.tWs = new azp().be(this.otf);
    parame1.tWv = this.otg;
    parame1.uGL = this.oth;
    parame1.uGM = this.oti;
    parame1.tWw = this.otj;
    int i = a(parame, this.fUa, this);
    GMTrace.o(6052816879616L, 45097);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6052951097344L, 45098);
    paramq = (aqn)((b)paramq).gtC.gtK;
    if ((paramq.tWr <= 0) || (bg.nm(paramq.uGM)) || (bg.nm(paramq.uGL)) || (paramq.tWv < 0) || (paramq.tWs == null) || (paramq.tWs.uNN <= 0))
    {
      w.e("MicroMsg.scanner.NetSceneOCRTranslate", "ERR: Security Check Failed");
      i = k.b.gun;
      GMTrace.o(6052951097344L, 45098);
      return i;
    }
    int i = k.b.gum;
    GMTrace.o(6052951097344L, 45098);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6053085315072L, 45099);
    w.d("MicroMsg.scanner.NetSceneOCRTranslate", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6053085315072L, 45099);
  }
  
  public final int getType()
  {
    GMTrace.i(6053219532800L, 45100);
    GMTrace.o(6053219532800L, 45100);
    return 392;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */