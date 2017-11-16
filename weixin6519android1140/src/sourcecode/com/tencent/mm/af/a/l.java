package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hd;
import com.tencent.mm.protocal.c.he;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private Object data;
  public b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public l(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(4581387927552L, 34134);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new hd();
    ((b.a)localObject).gtG = new he();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/bizchatsearchcontact";
    ((b.a)localObject).gtE = 1364;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (hd)this.fUa.gtC.gtK;
    ((hd)localObject).tVU = paramString1;
    ((hd)localObject).eBj = paramString2;
    ((hd)localObject).offset = paramInt;
    this.data = null;
    GMTrace.o(4581387927552L, 34134);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4581790580736L, 34137);
    this.fUd = parame1;
    w.i("MicroMsg.NetSceneBizChatSearchContact", "do scene");
    int i = a(parame, this.fUa, this);
    GMTrace.o(4581790580736L, 34137);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4581522145280L, 34135);
    w.d("MicroMsg.NetSceneBizChatSearchContact", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(4581522145280L, 34135);
  }
  
  public final int getType()
  {
    GMTrace.i(4581656363008L, 34136);
    GMTrace.o(4581656363008L, 34136);
    return 1364;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */