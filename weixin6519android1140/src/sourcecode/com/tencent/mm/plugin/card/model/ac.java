package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.yk;
import com.tencent.mm.protocal.c.yl;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class ac
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public LinkedList<String> jwM;
  public int jwO;
  public int jwP;
  public int jwQ;
  
  public ac(String paramString)
  {
    GMTrace.i(4901228773376L, 36517);
    b.a locala = new b.a();
    locala.gtF = new yk();
    locala.gtG = new yl();
    locala.uri = "/cgi-bin/micromsg-bin/getcardserial";
    locala.gtE = 577;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((yk)this.fUa.gtC.gtK).eTJ = paramString;
    GMTrace.o(4901228773376L, 36517);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4901497208832L, 36519);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(4901497208832L, 36519);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4901631426560L, 36520);
    w.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (yl)this.fUa.gtD.gtK;
      this.jwM = paramq.jwM;
      this.jwO = paramq.jwO;
      this.jwP = paramq.jwP;
      this.jwQ = paramq.jwQ;
    }
    w.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", new Object[] { Integer.valueOf(this.jwO), Integer.valueOf(this.jwP), Integer.valueOf(this.jwQ) });
    if (this.jwM != null) {
      w.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.jwM.size());
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(4901631426560L, 36520);
  }
  
  public final int getType()
  {
    GMTrace.i(4901362991104L, 36518);
    GMTrace.o(4901362991104L, 36518);
    return 577;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */