package com.tencent.mm.plugin.remittance.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.kz;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private b gUL;
  public la omg;
  
  public i(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5)
  {
    GMTrace.i(20952595300352L, 156109);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new kz();
    ((b.a)localObject).gtG = new la();
    ((b.a)localObject).gtE = 1779;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/transferoldpaycheck";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.gUL = ((b.a)localObject).DA();
    localObject = (kz)this.gUL.gtC.gtK;
    ((kz)localObject).eJQ = paramString1;
    ((kz)localObject).ubC = paramString2;
    ((kz)localObject).omN = paramString3;
    ((kz)localObject).omK = paramString4;
    ((kz)localObject).onQ = paramLong;
    ((kz)localObject).ubn = paramString5;
    w.i("MicroMsg.NetSceneRemittancePayCheck", "reqKey: %s, transfer: %s, fee: %s", new Object[] { paramString1, paramString2, Long.valueOf(paramLong) });
    GMTrace.o(20952595300352L, 156109);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(20952863735808L, 156111);
    this.fUd = parame1;
    int i = a(parame, this.gUL, this);
    GMTrace.o(20952863735808L, 156111);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20952997953536L, 156112);
    w.i("MicroMsg.NetSceneRemittancePayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.omg = ((la)((b)paramq).gtD.gtK);
    w.i("MicroMsg.NetSceneRemittancePayCheck", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.omg.jWs), this.omg.jWt });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(20952997953536L, 156112);
  }
  
  public final int getType()
  {
    GMTrace.i(20952729518080L, 156110);
    GMTrace.o(20952729518080L, 156110);
    return 1779;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */