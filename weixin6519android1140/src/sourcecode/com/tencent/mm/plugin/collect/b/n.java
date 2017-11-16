package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcx;
import com.tencent.mm.protocal.c.bcy;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  private bcx jWJ;
  
  public n(String paramString)
  {
    GMTrace.i(5398773891072L, 40224);
    b.a locala = new b.a();
    locala.gtF = new bcx();
    locala.gtG = new bcy();
    locala.gtE = 304;
    locala.uri = "/cgi-bin/micromsg-bin/setpushsound";
    locala.gtH = 0;
    locala.gtI = 0;
    this.gUL = locala.DA();
    this.jWJ = ((bcx)this.gUL.gtC.gtK);
    this.jWJ.jib = 3;
    this.jWJ.uPe = paramString;
    w.i("MicroMsg.NetSceneSetPushSound", "type: %d, sound: %s", new Object[] { Integer.valueOf(3), paramString });
    GMTrace.o(5398773891072L, 40224);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5399042326528L, 40226);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(5399042326528L, 40226);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5399176544256L, 40227);
    w.i("MicroMsg.NetSceneSetPushSound", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5399176544256L, 40227);
  }
  
  public final int getType()
  {
    GMTrace.i(5398908108800L, 40225);
    GMTrace.o(5398908108800L, 40225);
    return 304;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */