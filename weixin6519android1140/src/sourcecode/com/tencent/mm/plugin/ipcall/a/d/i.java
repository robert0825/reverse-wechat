package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.c.auy;
import com.tencent.mm.protocal.c.auz;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public auy mlN;
  public auz mlO;
  
  public i(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11585137410048L, 86316);
    this.fUa = null;
    this.mlN = null;
    this.mlO = null;
    this.fUd = null;
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new auy();
    ((b.a)localObject).gtG = new auz();
    ((b.a)localObject).gtE = 991;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/pstninvite";
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    long l = System.currentTimeMillis();
    int i = c.aJF();
    localObject = (auy)this.fUa.gtC.gtK;
    ((auy)localObject).lSY = com.tencent.mm.y.q.zE();
    ((auy)localObject).uKg = paramString2;
    ((auy)localObject).lSX = paramString1;
    ((auy)localObject).uKf = paramInt1;
    ((auy)localObject).udE = i;
    ((auy)localObject).uKo = 1;
    ((auy)localObject).uKe = l;
    ((auy)localObject).uKn = paramInt2;
    ((auy)localObject).uKp = paramInt3;
    this.mlN = ((auy)localObject);
    w.i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(11585137410048L, 86316);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11585405845504L, 86318);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11585405845504L, 86318);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11585540063232L, 86319);
    w.i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mlO = ((auz)((b)paramq).gtD.gtK);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      if (this.fUd != null) {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
      }
      GMTrace.o(11585540063232L, 86319);
      return;
    }
    if (this.fUd != null) {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
    }
    GMTrace.o(11585540063232L, 86319);
  }
  
  public final int getType()
  {
    GMTrace.i(11585271627776L, 86317);
    GMTrace.o(11585271627776L, 86317);
    return 991;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */