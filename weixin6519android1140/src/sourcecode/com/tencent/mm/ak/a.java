package com.tencent.mm.ak;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import junit.framework.Assert;

public final class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private au eAH;
  private com.tencent.mm.ad.e fUd;
  private ae handler;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(1368886607872L, 10199);
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1368752390144L, 10198);
        a.this.a(999, 0, 0, "", null, null);
        GMTrace.o(1368752390144L, 10198);
      }
    };
    this.eAH = new au();
    this.eAH.dB(1);
    this.eAH.db(paramString1);
    this.eAH.E(bc.gR(paramString1));
    this.eAH.dC(1);
    this.eAH.setContent(paramString2);
    this.eAH.setType(s.go(paramString1));
    at.AR();
    long l = com.tencent.mm.y.c.yM().P(this.eAH);
    if (l != -1L) {}
    for (;;)
    {
      Assert.assertTrue(bool);
      w.i("MicroMsg.NetSceneSendMsgFake", "new msg inserted to db , local id = " + l);
      GMTrace.o(1368886607872L, 10199);
      return;
      bool = false;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1369020825600L, 10200);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneSendMsgFake", "send local msg, msgId = " + this.eAH.field_msgId);
    this.handler.sendEmptyMessageDelayed(0, 500L);
    GMTrace.o(1369020825600L, 10200);
    return 999;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(1369289261056L, 10202);
    int i = k.b.gum;
    GMTrace.o(1369289261056L, 10202);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1369423478784L, 10203);
    w.i("MicroMsg.NetSceneSendMsgFake", "recv local msg, msgId = " + this.eAH.field_msgId);
    this.eAH.dB(2);
    this.eAH.E(bc.k(this.eAH.field_talker, System.currentTimeMillis() / 1000L));
    at.AR();
    com.tencent.mm.y.c.yM().a(this.eAH.field_msgId, this.eAH);
    this.fUd.a(0, 0, paramString, this);
    GMTrace.o(1369423478784L, 10203);
  }
  
  public final int getType()
  {
    GMTrace.i(1369155043328L, 10201);
    GMTrace.o(1369155043328L, 10201);
    return 522;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ak\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */