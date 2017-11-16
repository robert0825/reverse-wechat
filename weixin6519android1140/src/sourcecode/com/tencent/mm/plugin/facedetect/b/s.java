package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bnb;
import com.tencent.mm.protocal.c.bnc;
import com.tencent.mm.sdk.platformtools.w;

public final class s
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, e
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private boolean kRT;
  
  public s(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(14534706200576L, 108292);
    this.kRT = false;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bnb();
    ((b.a)localObject).gtG = new bnc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyface";
    ((b.a)localObject).gtE = 797;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bnb)this.fUa.gtC.gtK;
    ((bnb)localObject).uoY = paramLong;
    ((bnb)localObject).uMy = paramString1;
    ((bnb)localObject).uMz = paramString2;
    GMTrace.o(14534706200576L, 108292);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5935376367616L, 44222);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5935376367616L, 44222);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5935510585344L, 44223);
    paramq = (bnc)((b)paramq).gtD.gtK;
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (paramq.uMB == 0)
      {
        bool = true;
        this.kRT = bool;
        paramInt1 = paramq.uMB;
        w.i("MicroMsg.NetSceneFaceVerifyFace", "hy: is Verified: %b", new Object[] { Boolean.valueOf(this.kRT) });
      }
    }
    for (;;)
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt1, paramString, this);
      }
      GMTrace.o(5935510585344L, 44223);
      return;
      bool = false;
      break;
      paramInt1 = paramInt3;
      if (paramq != null)
      {
        paramInt1 = paramInt3;
        if (paramq.uMB != 0)
        {
          w.i("MicroMsg.NetSceneFaceVerifyFace", "hy: has DetailRet, use it");
          paramInt1 = paramq.uMB;
        }
      }
    }
  }
  
  public final boolean avR()
  {
    GMTrace.i(14534840418304L, 108293);
    GMTrace.o(14534840418304L, 108293);
    return true;
  }
  
  public final String avS()
  {
    GMTrace.i(14534974636032L, 108294);
    GMTrace.o(14534974636032L, 108294);
    return null;
  }
  
  public final int getType()
  {
    GMTrace.i(15372493258752L, 114534);
    GMTrace.o(15372493258752L, 114534);
    return 797;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */