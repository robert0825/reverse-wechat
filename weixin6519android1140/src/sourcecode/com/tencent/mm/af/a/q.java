package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.protocal.c.xk;
import com.tencent.mm.protocal.c.xl;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public q(String paramString, Object paramObject)
  {
    GMTrace.i(4570247856128L, 34051);
    b.a locala = new b.a();
    locala.gtF = new xk();
    locala.gtG = new xl();
    locala.uri = "/cgi-bin/mmocbiz-bin/getbizchatmyuserinfo";
    locala.gtE = 1354;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((xk)this.fUa.gtC.gtK).tVU = paramString;
    this.data = paramObject;
    GMTrace.o(4570247856128L, 34051);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4570650509312L, 34054);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4570650509312L, 34054);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4570382073856L, 34052);
    w.d("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4570382073856L, 34052);
  }
  
  public final int getType()
  {
    GMTrace.i(4570516291584L, 34053);
    GMTrace.o(4570516291584L, 34053);
    return 1354;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */