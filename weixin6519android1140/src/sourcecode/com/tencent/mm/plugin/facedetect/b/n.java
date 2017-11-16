package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ayb;
import com.tencent.mm.protocal.c.ayc;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, e
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private boolean kRT;
  private String kRX;
  
  public n(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(14541819740160L, 108345);
    this.kRT = false;
    this.kRX = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ayb();
    ((b.a)localObject).gtG = new ayc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registerface";
    ((b.a)localObject).gtE = 918;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ayb)this.fUa.gtC.gtK;
    ((ayb)localObject).uoY = paramLong;
    ((ayb)localObject).uMy = paramString1;
    ((ayb)localObject).uMz = paramString2;
    GMTrace.o(14541819740160L, 108345);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(14542088175616L, 108347);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(14542088175616L, 108347);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(14542222393344L, 108348);
    paramq = (ayc)((b)paramq).gtD.gtK;
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (paramq.uMB == 0)
      {
        bool = true;
        this.kRT = bool;
        this.kRX = paramq.uMA;
        paramInt1 = paramq.uMB;
        w.i("MicroMsg.NetSceneFaceRegFace", "hy: is Verified: %b", new Object[] { Boolean.valueOf(this.kRT) });
      }
    }
    for (;;)
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt1, paramString, this);
      }
      GMTrace.o(14542222393344L, 108348);
      return;
      bool = false;
      break;
      paramInt1 = paramInt3;
      if (paramq != null)
      {
        paramInt1 = paramInt3;
        if (paramq.uMB != 0)
        {
          w.i("MicroMsg.NetSceneFaceRegFace", "hy: has detail ret. use");
          paramInt1 = paramq.uMB;
        }
      }
    }
  }
  
  public final boolean avR()
  {
    GMTrace.i(14542356611072L, 108349);
    GMTrace.o(14542356611072L, 108349);
    return true;
  }
  
  public final String avS()
  {
    GMTrace.i(14542490828800L, 108350);
    String str = this.kRX;
    GMTrace.o(14542490828800L, 108350);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(15373030129664L, 114538);
    GMTrace.o(15373030129664L, 114538);
    return 918;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */