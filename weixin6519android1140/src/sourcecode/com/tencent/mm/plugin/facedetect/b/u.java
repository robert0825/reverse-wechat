package com.tencent.mm.plugin.facedetect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xe;
import com.tencent.mm.protocal.c.xf;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, b
{
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private long kSe;
  private byte[] kSf;
  
  public u(int paramInt)
  {
    GMTrace.i(5937523851264L, 44238);
    this.kSe = -1L;
    this.kSf = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xe();
    ((b.a)localObject).gtG = new xf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbioconfig";
    ((b.a)localObject).gtE = 732;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (xe)this.fUa.gtC.gtK;
    ((xe)localObject).jib = 1;
    ((xe)localObject).tOG = paramInt;
    GMTrace.o(5937523851264L, 44238);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5937792286720L, 44240);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5937792286720L, 44240);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5937926504448L, 44241);
    paramq = (xf)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kSe = paramq.uoY;
      this.kSf = paramq.uoZ.tJp;
      l = this.kSe;
      if (this.kSf != null) {
        break label124;
      }
    }
    label124:
    for (paramInt1 = 0;; paramInt1 = this.kSf.length)
    {
      w.i("MicroMsg.NetSceneGetBioConfig", "hy: get bio config: bioId: %s, bioConfigSize: %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1) });
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(5937926504448L, 44241);
      return;
    }
  }
  
  public final long avP()
  {
    GMTrace.i(5937255415808L, 44236);
    long l = this.kSe;
    GMTrace.o(5937255415808L, 44236);
    return l;
  }
  
  public final byte[] avQ()
  {
    GMTrace.i(5937389633536L, 44237);
    byte[] arrayOfByte = this.kSf;
    GMTrace.o(5937389633536L, 44237);
    return arrayOfByte;
  }
  
  public final int getType()
  {
    GMTrace.i(15372895911936L, 114537);
    GMTrace.o(15372895911936L, 114537);
    return 732;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */