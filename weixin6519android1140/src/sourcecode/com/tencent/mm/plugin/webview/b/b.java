package com.tencent.mm.plugin.webview.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ban;
import com.tencent.mm.protocal.c.bao;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  private long kkB;
  private byte[] klB;
  private String klD;
  private int klq;
  int rBk;
  boolean rBl;
  
  public b(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, long paramLong)
  {
    GMTrace.i(12475269382144L, 92948);
    this.klB = null;
    this.rBk = -1;
    this.rBl = true;
    this.kkB = 0L;
    b.a locala = new b.a();
    locala.gtF = new ban();
    locala.gtG = new bao();
    locala.uri = "/cgi-bin/micromsg-bin/mmsearchemotion";
    locala.gtE = 234;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.klq = paramInt1;
    this.klD = paramString;
    this.klB = paramArrayOfByte;
    this.rBk = paramInt2;
    this.kkB = paramLong;
    GMTrace.o(12475269382144L, 92948);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12475537817600L, 92950);
    this.fXo = parame1;
    ban localban = (ban)this.fUa.gtC.gtK;
    if (!bg.bq(this.klB))
    {
      localban.uqp = n.H(this.klB);
      this.rBl = false;
      localban.uqs = this.kkB;
      if (localban.uqp != null) {
        break label140;
      }
    }
    label140:
    for (parame1 = "Buf is NULL";; parame1 = localban.uqp.toString())
    {
      w.d("MicroMsg.emoji.NetSceneSearchEmotion", parame1);
      localban.tTJ = this.klq;
      localban.uqq = this.klD;
      int i = a(parame, this.fUa, this);
      GMTrace.o(12475537817600L, 92950);
      return i;
      localban.uqp = new azp();
      this.rBl = true;
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12475672035328L, 92951);
    w.i("MicroMsg.emoji.NetSceneSearchEmotion", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12475672035328L, 92951);
  }
  
  public final bao bBF()
  {
    GMTrace.i(12475806253056L, 92952);
    if (this.fUa == null)
    {
      GMTrace.o(12475806253056L, 92952);
      return null;
    }
    bao localbao = (bao)this.fUa.gtD.gtK;
    GMTrace.o(12475806253056L, 92952);
    return localbao;
  }
  
  public final int getType()
  {
    GMTrace.i(12475403599872L, 92949);
    GMTrace.o(12475403599872L, 92949);
    return 234;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */