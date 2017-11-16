package com.tencent.mm.pluginsdk.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbl;
import com.tencent.mm.protocal.c.bbm;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public m(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, 0);
    GMTrace.i(774167855104L, 5768);
    GMTrace.o(774167855104L, 5768);
  }
  
  public m(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(774302072832L, 5769);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new bbl();
    ((b.a)localObject).gtG = new bbm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendfeedback";
    ((b.a)localObject).gtE = 153;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (bbl)this.fUa.gtC.gtK;
    ((bbl)localObject).uOK = paramString1;
    ((bbl)localObject).nIp = paramString2;
    ((bbl)localObject).uzV = paramInt;
    GMTrace.o(774302072832L, 5769);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(774436290560L, 5770);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(774436290560L, 5770);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(774704726016L, 5772);
    w.d("MicroMsg.NetSendSceneFeedBack", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(774704726016L, 5772);
  }
  
  public final int getType()
  {
    GMTrace.i(774570508288L, 5771);
    GMTrace.o(774570508288L, 5771);
    return 153;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */