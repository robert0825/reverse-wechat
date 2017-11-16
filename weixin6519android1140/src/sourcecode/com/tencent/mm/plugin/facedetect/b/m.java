package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, e
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private boolean kRT;
  public String kRU;
  public boolean kRV;
  private String kRW;
  
  public m(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(5936450109440L, 44230);
    this.kRT = false;
    this.kRU = null;
    this.kRV = false;
    this.kRW = "";
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new sy();
    ((b.a)localObject).gtG = new sz();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/faceidentify";
    ((b.a)localObject).gtE = 1080;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (sy)this.fUa.gtC.gtK;
    ((sy)localObject).eSd = paramString1;
    ((sy)localObject).uiU = paramLong;
    ((sy)localObject).uiQ = paramString2;
    ((sy)localObject).uiW = paramString3;
    ((sy)localObject).uiV = paramString4;
    GMTrace.o(5936450109440L, 44230);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5936718544896L, 44232);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5936718544896L, 44232);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5936852762624L, 44233);
    w.d("MicroMsg.NetSceneFaceVerifyFace", "alvinluo NetSceneFacePicThirdVerifyFace errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (sz)((b)paramq).gtD.gtK;
    w.i("MicroMsg.NetSceneFaceVerifyFace", "identity_id: %s", new Object[] { paramq.uiX });
    this.kRU = paramq.uiX;
    this.kRV = paramq.uiY;
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(5936852762624L, 44233);
  }
  
  public final boolean avR()
  {
    GMTrace.i(14538330079232L, 108319);
    boolean bool = this.kRV;
    GMTrace.o(14538330079232L, 108319);
    return bool;
  }
  
  public final String avS()
  {
    GMTrace.i(14538195861504L, 108318);
    String str = this.kRU;
    GMTrace.o(14538195861504L, 108318);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(15372761694208L, 114536);
    GMTrace.o(15372761694208L, 114536);
    return 1080;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */