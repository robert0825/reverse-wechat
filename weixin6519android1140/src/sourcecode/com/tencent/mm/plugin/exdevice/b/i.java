package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.bm.b;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.e.h;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import junit.framework.Assert;

public final class i
  extends j
{
  public i(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    GMTrace.i(11199127224320L, 83440);
    h localh = new h();
    localh.kBz = new c();
    localh.jgP = new b(paramArrayOfByte);
    localh.jib = paramInt;
    this.kwT = localh;
    this.joF = paramLong;
    this.kwR = 30001;
    GMTrace.o(11199127224320L, 83440);
  }
  
  public final byte[] atp()
  {
    GMTrace.i(11199261442048L, 83441);
    Assert.assertNotNull(this.kwT);
    try
    {
      byte[] arrayOfByte = this.kwT.toByteArray();
      GMTrace.o(11199261442048L, 83441);
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      w.e("MicroMsg.exdevice.ExDevicePushManufacturerSvrSendData", "mResp.toByteArray() Failed!!! %s", new Object[] { localIOException.getMessage() });
      GMTrace.o(11199261442048L, 83441);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */