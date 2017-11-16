package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.y.az.a;
import com.tencent.mm.y.az.b;

final class c
  extends i
{
  az.a qBI;
  az.b qBJ;
  
  c()
  {
    GMTrace.i(12497683742720L, 93115);
    this.qBI = new az.a();
    this.qBJ = new az.b();
    GMTrace.o(12497683742720L, 93115);
  }
  
  protected final k.d AY()
  {
    GMTrace.i(12498220613632L, 93119);
    az.a locala = this.qBI;
    GMTrace.o(12498220613632L, 93119);
    return locala;
  }
  
  public final k.e AZ()
  {
    GMTrace.i(12498086395904L, 93118);
    az.b localb = this.qBJ;
    GMTrace.o(12498086395904L, 93118);
    return localb;
  }
  
  public final int Dz()
  {
    GMTrace.i(12498354831360L, 93120);
    GMTrace.o(12498354831360L, 93120);
    return 1;
  }
  
  public final int getType()
  {
    GMTrace.i(12497817960448L, 93116);
    GMTrace.o(12497817960448L, 93116);
    return 617;
  }
  
  public final String getUri()
  {
    GMTrace.i(12497952178176L, 93117);
    GMTrace.o(12497952178176L, 93117);
    return "/cgi-bin/micromsg-bin/verifyvoiceprintrsa";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */