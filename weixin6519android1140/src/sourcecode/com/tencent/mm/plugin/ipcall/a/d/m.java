package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bcd;
import com.tencent.mm.protocal.c.bce;
import com.tencent.mm.protocal.c.bqg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  private bcd mlV;
  public bce mlW;
  
  public m(int paramInt1, int paramInt2, LinkedList<bqg> paramLinkedList)
  {
    GMTrace.i(11580842442752L, 86284);
    this.fUa = null;
    this.mlV = null;
    this.mlW = null;
    b.a locala = new b.a();
    locala.gtF = new bcd();
    locala.gtG = new bce();
    locala.gtE = 871;
    locala.uri = "/cgi-bin/micromsg-bin/sendwcofeedback";
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.mlV = ((bcd)this.fUa.gtC.gtK);
    this.mlV.uEq = paramInt2;
    this.mlV.uOU = paramLinkedList;
    this.mlV.uOT = paramLinkedList.size();
    this.mlV.uOV = paramInt1;
    w.i("MicroMsg.NetSceneIPCallSendFeedback", "NetSceneIPCallSendFeedback roomid=%d, level=%d, feedbackCount=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramLinkedList.size()) });
    GMTrace.o(11580842442752L, 86284);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11581110878208L, 86286);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11581110878208L, 86286);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11581245095936L, 86287);
    w.i("MicroMsg.NetSceneIPCallSendFeedback", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlW = ((bce)((b)paramq).gtD.gtK);
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11581245095936L, 86287);
  }
  
  public final int getType()
  {
    GMTrace.i(11580976660480L, 86285);
    GMTrace.o(11580976660480L, 86285);
    return 871;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */