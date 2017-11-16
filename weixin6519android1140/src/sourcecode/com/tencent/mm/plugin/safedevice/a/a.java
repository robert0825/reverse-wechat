package com.tencent.mm.plugin.safedevice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.pe;
import com.tencent.mm.protocal.c.pf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private String esG;
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(String paramString)
  {
    GMTrace.i(12856447729664L, 95788);
    this.esG = paramString;
    b.a locala = new b.a();
    locala.gtF = new pe();
    locala.gtG = new pf();
    locala.uri = "/cgi-bin/micromsg-bin/delsafedevice";
    locala.gtE = 362;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((pe)this.fUa.gtC.gtK).ufG = paramString;
    GMTrace.o(12856447729664L, 95788);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12856850382848L, 95791);
    if (bg.nm(this.esG))
    {
      w.e("MicroMsg.NetSceneDelSafeDevice", "null device id");
      GMTrace.o(12856850382848L, 95791);
      return -1;
    }
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(12856850382848L, 95791);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12856581947392L, 95789);
    w.d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, errType= " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (pf)this.fUa.gtD.gtK;
      at.AR();
      c.xh().set(64, Integer.valueOf(paramq.tOy));
      w.d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, get safedevice state = " + paramq.tOy);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12856581947392L, 95789);
  }
  
  public final int getType()
  {
    GMTrace.i(12856716165120L, 95790);
    GMTrace.o(12856716165120L, 95790);
    return 362;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\safedevice\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */