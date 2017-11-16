package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.e.n;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends j
{
  public h(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(11197785047040L, 83430);
    n localn = new n();
    localn.kBz = new c();
    localn.kBD = paramInt1;
    localn.kBE = paramInt2;
    this.kwT = localn;
    this.joF = paramLong;
    this.kwR = 30002;
    GMTrace.o(11197785047040L, 83430);
  }
  
  public final byte[] atp()
  {
    GMTrace.i(11197919264768L, 83431);
    Object localObject = null;
    try
    {
      byte[] arrayOfByte = this.kwT.toByteArray();
      localObject = arrayOfByte;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "mResp.toByteArray() Failed!!! %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(11197919264768L, 83431);
    return (byte[])localObject;
  }
  
  public final int atr()
  {
    GMTrace.i(11198053482496L, 83432);
    n localn = (n)this.kwT;
    if (localn == null)
    {
      w.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "null = pushReq");
      GMTrace.o(11198053482496L, 83432);
      return -1;
    }
    int i = localn.kBD;
    GMTrace.o(11198053482496L, 83432);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */