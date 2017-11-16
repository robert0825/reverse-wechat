package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akg;
import com.tencent.mm.protocal.c.akh;
import com.tencent.mm.sdk.platformtools.w;

public final class z
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private final b gMj;
  public Object tag;
  
  public z(String paramString)
  {
    GMTrace.i(1367678648320L, 10190);
    b.a locala = new b.a();
    locala.gtF = new akg();
    locala.gtG = new akh();
    locala.uri = "/cgi-bin/micromsg-bin/jumpemotiondetail";
    locala.gtE = 666;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gMj = locala.DA();
    ((akg)this.gMj.gtC.gtK).lPM = paramString;
    GMTrace.o(1367678648320L, 10190);
  }
  
  public final akh LI()
  {
    GMTrace.i(1368215519232L, 10194);
    akh localakh = (akh)this.gMj.gtD.gtK;
    GMTrace.o(1368215519232L, 10194);
    return localakh;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1367947083776L, 10192);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(1367947083776L, 10192);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1368081301504L, 10193);
    w.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      w.d("MicroMsg.NetSceneScanEmoji", "[oneliang][NetSceneScanEmoji]:net end ok");
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1368081301504L, 10193);
  }
  
  public final int getType()
  {
    GMTrace.i(1367812866048L, 10191);
    GMTrace.o(1367812866048L, 10191);
    return 666;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelsimple\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */