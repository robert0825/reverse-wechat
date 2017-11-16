package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aax;
import com.tencent.mm.protocal.c.aay;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b gYp;
  private com.tencent.mm.ad.e nRl;
  
  public c()
  {
    GMTrace.i(8937826942976L, 66592);
    b.a locala = new b.a();
    locala.gtF = new aax();
    locala.gtG = new aay();
    locala.uri = "/cgi-bin/micromsg-bin/getimunreadmsgcount";
    locala.gtE = 630;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gYp = locala.DA();
    GMTrace.o(8937826942976L, 66592);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8938229596160L, 66595);
    w.d("MicroMsg.NetSceneGetImUnreadMsgCount", "get im unread msg count");
    this.nRl = parame1;
    int i = a(parame, this.gYp, this);
    GMTrace.o(8938229596160L, 66595);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8937961160704L, 66593);
    w.d("MicroMsg.NetSceneGetImUnreadMsgCount", "end get im unread msg count, errType: %d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nRl.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8937961160704L, 66593);
  }
  
  public final int getType()
  {
    GMTrace.i(15403497553920L, 114765);
    GMTrace.o(15403497553920L, 114765);
    return 630;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */