package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.akx;
import com.tencent.mm.protocal.c.auq;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sx;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public LinkedList<akx> kRQ;
  public auq kRR;
  public String kRS;
  
  public l(String paramString1, String paramString2)
  {
    GMTrace.i(5934302625792L, 44214);
    this.kRQ = null;
    this.kRR = null;
    this.kRS = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new sw();
    ((b.a)localObject).gtG = new sx();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/faceidentifyprepage";
    ((b.a)localObject).gtE = 1147;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (sw)this.fUa.gtC.gtK;
    ((sw)localObject).eSd = paramString1;
    ((sw)localObject).uiQ = paramString2;
    GMTrace.o(5934302625792L, 44214);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5934571061248L, 44216);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5934571061248L, 44216);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5934705278976L, 44217);
    w.i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (sx)((b)paramq).gtD.gtK;
    if (paramq != null)
    {
      this.kRQ = paramq.ubh;
      this.kRR = paramq.uiR;
      this.kRS = paramq.uiT;
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
    }
    GMTrace.o(5934705278976L, 44217);
  }
  
  public final int getType()
  {
    GMTrace.i(15372359041024L, 114533);
    GMTrace.o(15372359041024L, 114533);
    return 1147;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */