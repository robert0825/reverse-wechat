package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.y.ay.a;
import com.tencent.mm.y.ay.b;

final class b
  extends i
{
  ay.a qBG;
  ay.b qBH;
  
  b()
  {
    GMTrace.i(12493791428608L, 93086);
    this.qBG = new ay.a();
    this.qBH = new ay.b();
    GMTrace.o(12493791428608L, 93086);
  }
  
  protected final k.d AY()
  {
    GMTrace.i(12494328299520L, 93090);
    ay.a locala = this.qBG;
    GMTrace.o(12494328299520L, 93090);
    return locala;
  }
  
  public final k.e AZ()
  {
    GMTrace.i(12494194081792L, 93089);
    ay.b localb = this.qBH;
    GMTrace.o(12494194081792L, 93089);
    return localb;
  }
  
  public final int Dz()
  {
    GMTrace.i(12494462517248L, 93091);
    GMTrace.o(12494462517248L, 93091);
    return 1;
  }
  
  public final int getType()
  {
    GMTrace.i(12493925646336L, 93087);
    GMTrace.o(12493925646336L, 93087);
    return 618;
  }
  
  public final String getUri()
  {
    GMTrace.i(12494059864064L, 93088);
    GMTrace.o(12494059864064L, 93088);
    return "/cgi-bin/micromsg-bin/getvoiceprintticketrsa";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */