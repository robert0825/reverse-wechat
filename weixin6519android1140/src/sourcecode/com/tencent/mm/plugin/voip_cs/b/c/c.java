package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.boo;
import com.tencent.mm.protocal.c.bop;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  
  public c(int paramInt1, String paramString1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString2)
  {
    GMTrace.i(11255498670080L, 83860);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new boo();
    ((b.a)localObject).gtG = new bop();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipinvite";
    ((b.a)localObject).gtE = 823;
    ((b.a)localObject).gtH = 0;
    ((b.a)localObject).gtI = 0;
    this.fUa = ((b.a)localObject).DA();
    localObject = (boo)this.fUa.gtC.gtK;
    ((boo)localObject).uKf = paramInt1;
    ((boo)localObject).uYz = paramString1;
    ((boo)localObject).udE = paramInt2;
    ((boo)localObject).uYA = com.tencent.mm.bm.b.aX(paramArrayOfByte1);
    ((boo)localObject).uYB = com.tencent.mm.bm.b.aX(paramArrayOfByte2);
    ((boo)localObject).uKe = System.currentTimeMillis();
    if ((paramString2 != null) && (!paramString2.equals(""))) {
      ((boo)localObject).uYC = paramString2;
    }
    GMTrace.o(11255498670080L, 83860);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(11255901323264L, 83863);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(11255901323264L, 83863);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(11255632887808L, 83861);
    w.i("MicroMsg.NetSceneVoipCSInvite", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(11255632887808L, 83861);
  }
  
  public final int getType()
  {
    GMTrace.i(11255767105536L, 83862);
    GMTrace.o(11255767105536L, 83862);
    return 823;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */