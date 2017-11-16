package com.tencent.mm.modelappbrand;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bih;
import com.tencent.mm.protocal.c.fs;
import com.tencent.mm.protocal.c.ft;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fXo;
  private final b grb;
  
  public k(LinkedList<bih> paramLinkedList)
  {
    GMTrace.i(12930535915520L, 96340);
    b.a locala = new b.a();
    locala.gtF = new fs();
    locala.gtG = new ft();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/batchswitchservicenotifyoption";
    locala.gtE = 1176;
    locala.gtH = 0;
    locala.gtI = 0;
    this.grb = locala.DA();
    ((fs)this.grb.gtC.gtK).tUc = paramLinkedList;
    GMTrace.o(12930535915520L, 96340);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12930938568704L, 96343);
    w.i("MicroMsg.NetSceneBatchSwitchServiceNotifyOption", "doScene");
    this.fXo = parame1;
    int i = a(parame, this.grb, this);
    GMTrace.o(12930938568704L, 96343);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12930670133248L, 96341);
    w.i("MicroMsg.NetSceneBatchSwitchServiceNotifyOption", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.fXo != null) {
      this.fXo.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(12930670133248L, 96341);
  }
  
  public final int getType()
  {
    GMTrace.i(15658377019392L, 116664);
    GMTrace.o(15658377019392L, 116664);
    return 1176;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */