package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bkl;
import com.tencent.mm.protocal.c.bkm;
import com.tencent.mm.protocal.c.gy;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public w(String paramString, gy paramgy, Object paramObject)
  {
    GMTrace.i(4562329010176L, 33992);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bkl();
    ((b.a)localObject).gtG = new bkm();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/updatebizchat";
    ((b.a)localObject).gtE = 1356;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bkl)this.fUa.gtC.gtK;
    ((bkl)localObject).tVU = paramString;
    ((bkl)localObject).umW = paramgy;
    this.data = paramObject;
    GMTrace.o(4562329010176L, 33992);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4562731663360L, 33995);
    this.fUd = parame1;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.brandservice.NetSceneUpdateBizChat", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4562731663360L, 33995);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4562463227904L, 33993);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.brandservice.NetSceneUpdateBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4562463227904L, 33993);
  }
  
  public final int getType()
  {
    GMTrace.i(4562597445632L, 33994);
    GMTrace.o(4562597445632L, 33994);
    return 1356;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */