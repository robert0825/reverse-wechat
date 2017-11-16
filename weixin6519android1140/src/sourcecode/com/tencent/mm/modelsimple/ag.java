package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bda;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class ag
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public ag(String paramString1, String paramString2, azp paramazp)
  {
    GMTrace.i(13159914012672L, 98049);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bcz();
    ((b.a)localObject).gtG = new bda();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/newsetpasswd";
    ((b.a)localObject).gtE = 383;
    ((b.a)localObject).gtH = 180;
    ((b.a)localObject).gtI = 1000000180;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bcz)this.fUa.gtC.gtK;
    ((bcz)localObject).kAY = bg.Sr(paramString1);
    ((bcz)localObject).ugx = paramString2;
    ((bcz)localObject).tSb = paramazp;
    w.d("MicroMsg.NetSceneSetPwd", "summersetpwd md5:%s ticket:%s, authkey:%s", new Object[] { paramString1, paramString2, bg.bp(n.a(paramazp)) });
    GMTrace.o(13159914012672L, 98049);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13160048230400L, 98050);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(13160048230400L, 98050);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13160316665856L, 98052);
    w.d("MicroMsg.NetSceneSetPwd", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13160316665856L, 98052);
  }
  
  public final int getType()
  {
    GMTrace.i(13160182448128L, 98051);
    GMTrace.o(13160182448128L, 98051);
    return 383;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */