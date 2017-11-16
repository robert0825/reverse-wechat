package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.y.ax.a;
import com.tencent.mm.y.ax.b;

final class a
  extends i
{
  ax.a qBE;
  ax.b qBF;
  
  a()
  {
    GMTrace.i(12489899114496L, 93057);
    this.qBE = new ax.a();
    this.qBF = new ax.b();
    GMTrace.o(12489899114496L, 93057);
  }
  
  protected final k.d AY()
  {
    GMTrace.i(12490435985408L, 93061);
    ax.a locala = this.qBE;
    GMTrace.o(12490435985408L, 93061);
    return locala;
  }
  
  public final k.e AZ()
  {
    GMTrace.i(12490301767680L, 93060);
    ax.b localb = this.qBF;
    GMTrace.o(12490301767680L, 93060);
    return localb;
  }
  
  public final int Dz()
  {
    GMTrace.i(12490570203136L, 93062);
    GMTrace.o(12490570203136L, 93062);
    return 1;
  }
  
  public final int getType()
  {
    GMTrace.i(12490033332224L, 93058);
    GMTrace.o(12490033332224L, 93058);
    return 616;
  }
  
  public final String getUri()
  {
    GMTrace.i(12490167549952L, 93059);
    GMTrace.o(12490167549952L, 93059);
    return "/cgi-bin/micromsg-bin/getvoiceprintresourcersa";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */