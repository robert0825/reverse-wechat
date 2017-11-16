package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcn;
import com.tencent.mm.protocal.c.bco;
import com.tencent.mm.protocal.c.hg;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public w(hg paramhg, Object paramObject)
  {
    GMTrace.i(4538840907776L, 33817);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bcn();
    ((b.a)localObject).gtG = new bco();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/setbizenterpriseattr";
    ((b.a)localObject).gtE = 1228;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bcn)this.fUa.gtC.gtK;
    ((bcn)localObject).upg = paramhg;
    ((bcn)localObject).mask = 1;
    ((bcn)localObject).upf = 1;
    this.data = paramObject;
    GMTrace.o(4538840907776L, 33817);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4539243560960L, 33820);
    this.fUd = parame1;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneSetBizEnterpriseAttr", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4539243560960L, 33820);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4538975125504L, 33818);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneSetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4538975125504L, 33818);
  }
  
  public final int getType()
  {
    GMTrace.i(4539109343232L, 33819);
    GMTrace.o(4539109343232L, 33819);
    return 1228;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */