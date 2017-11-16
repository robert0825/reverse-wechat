package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.z.a;
import com.tencent.mm.protocal.z.b;

final class e
  extends i
{
  private final z.a gTF;
  private final z.b gTG;
  
  e()
  {
    GMTrace.i(1343385239552L, 10009);
    this.gTF = new z.a();
    this.gTG = new z.b();
    GMTrace.o(1343385239552L, 10009);
  }
  
  protected final k.d AY()
  {
    GMTrace.i(1343519457280L, 10010);
    z.a locala = this.gTF;
    GMTrace.o(1343519457280L, 10010);
    return locala;
  }
  
  public final k.e AZ()
  {
    GMTrace.i(1343653675008L, 10011);
    z.b localb = this.gTG;
    GMTrace.o(1343653675008L, 10011);
    return localb;
  }
  
  public final int getType()
  {
    GMTrace.i(1343787892736L, 10012);
    GMTrace.o(1343787892736L, 10012);
    return 26;
  }
  
  public final String getUri()
  {
    GMTrace.i(1343922110464L, 10013);
    GMTrace.o(1343922110464L, 10013);
    return "/cgi-bin/micromsg-bin/sendcard";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */