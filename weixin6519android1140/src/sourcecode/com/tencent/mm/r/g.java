package com.tencent.mm.r;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aal;
import com.tencent.mm.protocal.c.aam;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private aal fUb;
  aam fUc;
  public com.tencent.mm.ad.e fUd;
  d fUe;
  private String fUf;
  private ae handler;
  private int retryCount;
  
  public g(d paramd)
  {
    GMTrace.i(4506762870784L, 33578);
    this.fUd = null;
    this.retryCount = 0;
    this.handler = new ae(Looper.getMainLooper());
    this.fUf = null;
    if (paramd == null)
    {
      GMTrace.o(4506762870784L, 33578);
      return;
    }
    this.fUe = paramd;
    w.d("MicroMsg.NetSceneGetFuncMsg", "new NetSceneGetFuncMsg, cgi: %s, cmdId: %s, functionMsgId: %s", new Object[] { paramd.field_cgi, Integer.valueOf(paramd.field_cmdid), paramd.field_functionmsgid });
    b.a locala = new b.a();
    locala.gtF = new aal();
    locala.gtG = new aam();
    locala.gtE = 825;
    locala.uri = paramd.field_cgi;
    locala.gtH = paramd.field_cmdid;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.fUb = ((aal)this.fUa.gtC.gtK);
    this.fUb.urd = paramd.field_functionmsgid;
    if (paramd.field_custombuff != null) {
      this.fUb.ure = paramd.field_custombuff;
    }
    GMTrace.o(4506762870784L, 33578);
  }
  
  private void vC()
  {
    GMTrace.i(4507568177152L, 33584);
    this.handler.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4508105048064L, 33588);
        w.i("MicroMsg.NetSceneGetFuncMsg", "do retry");
        if (g.this.a(g.this.gtW, g.this.fUd) == -1) {
          g.this.fUd.a(3, -1, "doScene failed", g.this);
        }
        GMTrace.o(4508105048064L, 33588);
      }
    }, this.fUe.field_retryinterval * 1000);
    GMTrace.o(4507568177152L, 33584);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4507031306240L, 33580);
    if (this.fUe != null)
    {
      w.i("MicroMsg.NetSceneGetFuncMsg", "doScene, functionMsgId: %s", new Object[] { this.fUe.field_functionmsgid });
      this.fUe.field_status = 1;
    }
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4507031306240L, 33580);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(4507299741696L, 33582);
    int i = k.b.gum;
    GMTrace.o(4507299741696L, 33582);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4507433959424L, 33583);
    this.fUc = ((aam)((b)paramq).gtD.gtK);
    this.fUf = this.fUc.ure;
    w.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s, opCode: %s, responseCustomBuff==null: %s, response.version: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.fUc.tMX), Boolean.valueOf(bg.nm(this.fUf)), Long.valueOf(this.fUc.urf) });
    if (!bg.nm(this.fUf))
    {
      this.fUb = ((aal)this.fUa.gtC.gtK);
      this.fUb.ure = this.fUf;
    }
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      if (paramInt2 == 4)
      {
        w.i("MicroMsg.NetSceneGetFuncMsg", "server error");
        if (this.fUc.tMX != 1)
        {
          vC();
          GMTrace.o(4507433959424L, 33583);
          return;
        }
        w.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, stop retry, directly return");
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(4507433959424L, 33583);
        return;
      }
      w.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, local error");
      com.tencent.mm.plugin.report.service.g.ork.a(this.fUe.field_reportid, this.fUe.field_failkey, 1L, false);
      if (this.retryCount < 2)
      {
        w.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, retry, retryCount: %s", new Object[] { Integer.valueOf(this.retryCount) });
        this.retryCount += 1;
        vC();
        GMTrace.o(4507433959424L, 33583);
        return;
      }
      w.i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, reach retry limit, directly return");
      com.tencent.mm.plugin.report.service.g.ork.a(this.fUe.field_reportid, this.fUe.field_finalfailkey, 1L, false);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4507433959424L, 33583);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(this.fUe.field_reportid, this.fUe.field_successkey, 1L, false);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4507433959424L, 33583);
  }
  
  public final int getType()
  {
    GMTrace.i(4506897088512L, 33579);
    GMTrace.o(4506897088512L, 33579);
    return 825;
  }
  
  protected final int vB()
  {
    GMTrace.i(4507165523968L, 33581);
    GMTrace.o(4507165523968L, 33581);
    return 6;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\r\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */