package com.tencent.mm.plugin.webwx.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.si;
import com.tencent.mm.protocal.c.sj;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  public final b gMj;
  public boolean rZB;
  
  public d(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(14698586046464L, 109513);
    this.rZB = paramBoolean;
    b.a locala = new b.a();
    si localsi = new si();
    sj localsj = new sj();
    locala.gtF = localsi;
    locala.gtG = localsj;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
    locala.gtE = 972;
    locala.gtH = 0;
    locala.gtI = 0;
    localsi.uih = paramString1;
    localsi.uit = paramString2;
    localsi.uiv = paramBoolean;
    this.gMj = locala.DA();
    GMTrace.o(14698586046464L, 109513);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(7660611043328L, 57076);
    this.fUd = parame1;
    int i = a(parame, this.gMj, this);
    GMTrace.o(7660611043328L, 57076);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(7660745261056L, 57077);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(7660745261056L, 57077);
  }
  
  public final int getType()
  {
    GMTrace.i(7660476825600L, 57075);
    GMTrace.o(7660476825600L, 57075);
    return 972;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webwx\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */