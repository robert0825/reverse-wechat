package com.tencent.mm.plugin.brandservice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.protocal.c.amx;
import com.tencent.mm.protocal.c.amy;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public l(String paramString, LinkedList<amu> paramLinkedList)
  {
    GMTrace.i(10846403035136L, 80812);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new amx();
    ((b.a)localObject).gtG = new amy();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/setrecvtmpmsgoption";
    ((b.a)localObject).gtE = 1030;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (amx)this.fUa.gtC.gtK;
    ((amx)localObject).uxu = paramString;
    ((amx)localObject).uBJ = paramLinkedList;
    GMTrace.o(10846403035136L, 80812);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(10846805688320L, 80815);
    this.fUd = parame1;
    w.i("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(10846805688320L, 80815);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(10846537252864L, 80813);
    w.d("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(10846537252864L, 80813);
  }
  
  public final int getType()
  {
    GMTrace.i(10846671470592L, 80814);
    GMTrace.o(10846671470592L, 80814);
    return 1030;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */