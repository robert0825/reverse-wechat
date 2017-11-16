package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.y.a;
import com.tencent.mm.protocal.y.b;

public final class aw
  extends i
{
  private final y.a gnw;
  private final y.b gnx;
  
  public aw()
  {
    GMTrace.i(13472909754368L, 100381);
    this.gnw = new y.a();
    this.gnx = new y.b();
    GMTrace.o(13472909754368L, 100381);
  }
  
  protected final k.d AY()
  {
    GMTrace.i(13473043972096L, 100382);
    y.a locala = this.gnw;
    GMTrace.o(13473043972096L, 100382);
    return locala;
  }
  
  public final k.e AZ()
  {
    GMTrace.i(13473178189824L, 100383);
    y.b localb = this.gnx;
    GMTrace.o(13473178189824L, 100383);
    return localb;
  }
  
  public final int getType()
  {
    GMTrace.i(13473312407552L, 100384);
    GMTrace.o(13473312407552L, 100384);
    return 126;
  }
  
  public final String getUri()
  {
    GMTrace.i(13473446625280L, 100385);
    GMTrace.o(13473446625280L, 100385);
    return "/cgi-bin/micromsg-bin/newreg";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */