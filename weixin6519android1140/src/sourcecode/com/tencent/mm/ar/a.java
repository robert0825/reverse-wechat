package com.tencent.mm.ar;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gj;
import com.tencent.mm.protocal.c.gk;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(1337345441792L, 9964);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new gj();
    ((b.a)localObject).gtG = new gk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindlinkedincontact";
    ((b.a)localObject).gtE = 549;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (gj)this.fUa.gtC.gtK;
    ((gj)localObject).tSK = 1;
    ((gj)localObject).tUv = paramInt;
    ((gj)localObject).tUw = paramString1;
    ((gj)localObject).tUx = paramString2;
    ((gj)localObject).tUy = paramString3;
    ((gj)localObject).tUz = paramString4;
    ((gj)localObject).tUA = paramString5;
    ((gj)localObject).tUB = paramString6;
    ((gj)localObject).tUC = paramString7;
    GMTrace.o(1337345441792L, 9964);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1337479659520L, 9965);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1337479659520L, 9965);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1337748094976L, 9967);
    w.d("MicroMsg.NetSceneBindLinkedinContact", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (gj)this.fUa.gtC.gtK;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      at.AR();
      c.xh().set(286722, paramq.tUx);
      at.AR();
      c.xh().set(286721, paramq.tUw);
      at.AR();
      c.xh().set(286723, paramq.tUy);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1337748094976L, 9967);
  }
  
  public final int getType()
  {
    GMTrace.i(15325919707136L, 114187);
    GMTrace.o(15325919707136L, 114187);
    return 549;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ar\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */