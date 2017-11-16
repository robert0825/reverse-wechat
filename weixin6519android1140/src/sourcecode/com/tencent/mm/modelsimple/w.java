package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awd;
import com.tencent.mm.protocal.c.awe;

public final class w
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private b fUa;
  private com.tencent.mm.ad.e fUd;
  public int gUN;
  
  public w(int paramInt)
  {
    GMTrace.i(13158571835392L, 98039);
    this.gUN = 1;
    b.a locala = new b.a();
    locala.gtF = new awd();
    locala.gtG = new awe();
    locala.uri = "/cgi-bin/micromsg-bin/queryhaspasswd";
    locala.gtE = 255;
    locala.gtH = 132;
    locala.gtI = 1000000132;
    this.fUa = locala.DA();
    ((awd)this.fUa.gtC.gtK).tOG = paramInt;
    GMTrace.o(13158571835392L, 98039);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(13158706053120L, 98040);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(13158706053120L, 98040);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13158974488576L, 98042);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(13158974488576L, 98042);
  }
  
  public final int getType()
  {
    GMTrace.i(13158840270848L, 98041);
    GMTrace.o(13158840270848L, 98041);
    return 255;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */