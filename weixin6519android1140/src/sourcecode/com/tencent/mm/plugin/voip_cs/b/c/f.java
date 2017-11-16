package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bow;
import com.tencent.mm.protocal.c.box;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public f(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(11254424928256L, 83852);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bow();
    ((b.a)localObject).gtG = new box();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipsync";
    ((b.a)localObject).gtE = 818;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bow)this.fUa.gtC.gtK;
    ((bow)localObject).uYy = paramLong1;
    ((bow)localObject).uhV = paramLong2;
    ((bow)localObject).uYI = paramInt;
    ((bow)localObject).uKe = System.currentTimeMillis();
    GMTrace.o(11254424928256L, 83852);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11254827581440L, 83855);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11254827581440L, 83855);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11254559145984L, 83853);
    w.i("MicroMsg.NetSceneVoipCSSync", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11254559145984L, 83853);
  }
  
  public final int getType()
  {
    GMTrace.i(11254693363712L, 83854);
    GMTrace.o(11254693363712L, 83854);
    return 818;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */