package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.xo;
import com.tencent.mm.protocal.c.xp;
import com.tencent.mm.sdk.platformtools.w;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public r(String paramString, int paramInt, Object paramObject)
  {
    GMTrace.i(4544209616896L, 33857);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new xo();
    ((b.a)localObject).gtG = new xp();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizenterpriseattr";
    ((b.a)localObject).gtE = 1343;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (xo)this.fUa.gtC.gtK;
    ((xo)localObject).tVU = paramString;
    ((xo)localObject).upf = paramInt;
    this.data = paramObject;
    GMTrace.o(4544209616896L, 33857);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4544612270080L, 33860);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneGetBizEnterpriseAttr", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4544612270080L, 33860);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4544343834624L, 33858);
    w.d("MicroMsg.NetSceneGetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4544343834624L, 33858);
  }
  
  public final int getType()
  {
    GMTrace.i(4544478052352L, 33859);
    GMTrace.o(4544478052352L, 33859);
    return 1343;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */