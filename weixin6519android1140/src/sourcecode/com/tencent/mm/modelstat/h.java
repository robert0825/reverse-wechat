package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.az;
import com.tencent.mm.protocal.c.ba;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fXo;
  
  public h(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(1377476542464L, 10263);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new az();
    ((b.a)localObject).gtG = new ba();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    ((b.a)localObject).gtE = 1295;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (az)this.fUa.gtC.gtK;
    bf localbf = new bf();
    localbf.tPx = paramInt1;
    localbf.tPy = new com.tencent.mm.bm.b(paramString.getBytes());
    localbf.tPz = paramInt2;
    ((az)localObject).tPk.add(localbf);
    w.i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", new Object[] { Integer.valueOf(paramInt1), paramString });
    GMTrace.o(1377476542464L, 10263);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1377879195648L, 10266);
    this.fXo = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1377879195648L, 10266);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1377610760192L, 10264);
    paramq = (ba)this.fUa.gtD.gtK;
    w.i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramq.ret), paramq.eCh });
    this.fXo.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1377610760192L, 10264);
  }
  
  public final int getType()
  {
    GMTrace.i(1377744977920L, 10265);
    GMTrace.o(1377744977920L, 10265);
    return 1295;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelstat\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */