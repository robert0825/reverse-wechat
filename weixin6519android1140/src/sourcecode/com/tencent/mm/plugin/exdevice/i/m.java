package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.service.o;
import com.tencent.mm.plugin.exdevice.service.p.a;
import junit.framework.Assert;

public final class m
  extends p.a
{
  private n kEi;
  l kEj;
  
  public m(com.tencent.mm.plugin.exdevice.b.c paramc, c paramc1)
  {
    GMTrace.i(11120207200256L, 82852);
    this.kEi = null;
    this.kEj = null;
    Assert.assertNotNull(paramc);
    Assert.assertNotNull(paramc1);
    this.kEi = new n(paramc);
    this.kEj = new l(paramc1);
    GMTrace.o(11120207200256L, 82852);
  }
  
  public final o aup()
  {
    GMTrace.i(11120341417984L, 82853);
    Assert.assertNotNull(this.kEi);
    n localn = this.kEi;
    GMTrace.o(11120341417984L, 82853);
    return localn;
  }
  
  public final com.tencent.mm.plugin.exdevice.service.l auq()
  {
    GMTrace.i(11120475635712L, 82854);
    Assert.assertNotNull(this.kEj);
    l locall = this.kEj;
    GMTrace.o(11120475635712L, 82854);
    return locall;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */