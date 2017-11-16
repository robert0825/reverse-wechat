package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.tb;
import com.tencent.mm.sdk.platformtools.w;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public String mFileName;
  
  public r(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(5935644803072L, 44224);
    this.mFileName = "";
    b.a locala = new b.a();
    locala.gtF = new ta();
    locala.gtG = new tb();
    locala.uri = "/cgi-bin/mmbiz-bin/usrmsg/facevideobindbioid";
    locala.gtE = 1197;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mFileName = paramString1;
    paramString1 = (ta)this.fUa.gtC.gtK;
    paramString1.eSd = paramString2;
    paramString1.uiU = paramLong;
    paramString1.uiV = paramString4;
    paramString1.uiZ = paramString3;
    GMTrace.o(5935644803072L, 44224);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5935913238528L, 44226);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5935913238528L, 44226);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5936047456256L, 44227);
    w.d("MicroMsg.NetSceneFaceThirdBindVideo", "hy:  errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5936047456256L, 44227);
  }
  
  public final int getType()
  {
    GMTrace.i(15372627476480L, 114535);
    GMTrace.o(15372627476480L, 114535);
    return 1197;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */