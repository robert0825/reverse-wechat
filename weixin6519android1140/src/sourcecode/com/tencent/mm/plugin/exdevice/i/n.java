package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.service.o.a;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class n
  extends o.a
{
  private c kDM;
  
  public n(c paramc)
  {
    GMTrace.i(11123025772544L, 82873);
    this.kDM = null;
    Assert.assertNotNull(paramc);
    this.kDM = paramc;
    GMTrace.o(11123025772544L, 82873);
  }
  
  public final long auk()
  {
    GMTrace.i(11123159990272L, 82874);
    w.i("MicroMsg.exdevice.RemoteExDeviceTaskRequest", "getDeviceId : " + this.kDM.joF);
    long l = this.kDM.joF;
    GMTrace.o(11123159990272L, 82874);
    return l;
  }
  
  public final byte[] aul()
  {
    GMTrace.i(11123294208000L, 82875);
    byte[] arrayOfByte = this.kDM.atp();
    GMTrace.o(11123294208000L, 82875);
    return arrayOfByte;
  }
  
  public final int aum()
  {
    GMTrace.i(11123428425728L, 82876);
    int i = this.kDM.atn();
    GMTrace.o(11123428425728L, 82876);
    return i;
  }
  
  public final int aun()
  {
    GMTrace.i(11123562643456L, 82877);
    int i = this.kDM.kwR;
    GMTrace.o(11123562643456L, 82877);
    return i;
  }
  
  public final int auo()
  {
    GMTrace.i(11123696861184L, 82878);
    int i = this.kDM.ato();
    GMTrace.o(11123696861184L, 82878);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */