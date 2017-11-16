package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afa;
import com.tencent.mm.protocal.c.afb;
import com.tencent.mm.protocal.c.awj;
import com.tencent.mm.protocal.c.boa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class b
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final String TAG;
  private com.tencent.mm.ad.b gtx;
  private com.tencent.mm.ad.e nuY;
  private String quP;
  public boa quW;
  public int qva;
  
  public b(String paramString)
  {
    GMTrace.i(5773107134464L, 43013);
    this.TAG = "MicroMsg.NetSceneGetVoiceTransRes";
    this.qva = -1;
    if (!bg.nm(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.quP = paramString;
      paramString = new b.a();
      paramString.gtF = new afa();
      paramString.gtG = new afb();
      paramString.uri = "/cgi-bin/micromsg-bin/getvoicetransres";
      paramString.gtE = 548;
      paramString.gtH = 0;
      paramString.gtI = 0;
      this.gtx = paramString.DA();
      GMTrace.o(5773107134464L, 43013);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5773375569920L, 43015);
    this.nuY = parame1;
    ((afa)this.gtx.gtC.gtK).udw = this.quP;
    int i = a(parame, this.gtx, this);
    GMTrace.o(5773375569920L, 43015);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5773509787648L, 43016);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (afb)this.gtx.gtD.gtK;
      if (paramq.udA != null) {
        this.qva = paramq.udA.uLD;
      }
      this.quW = paramq.udy;
    }
    for (;;)
    {
      this.nuY.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5773509787648L, 43016);
      return;
      w.i("MicroMsg.NetSceneGetVoiceTransRes", "error get: errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
  }
  
  public final boolean brN()
  {
    GMTrace.i(5773778223104L, 43018);
    if ((this.quW != null) && (!bg.nm(this.quW.uXN)))
    {
      GMTrace.o(5773778223104L, 43018);
      return true;
    }
    GMTrace.o(5773778223104L, 43018);
    return false;
  }
  
  public final int getType()
  {
    GMTrace.i(5773241352192L, 43014);
    GMTrace.o(5773241352192L, 43014);
    return 548;
  }
  
  public final boolean isComplete()
  {
    GMTrace.i(5773644005376L, 43017);
    if ((this.quW != null) && (this.quW.tTL == 1))
    {
      GMTrace.o(5773644005376L, 43017);
      return true;
    }
    GMTrace.o(5773644005376L, 43017);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\voicetranstext\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */