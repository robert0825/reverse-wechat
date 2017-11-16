package com.tencent.mm.plugin.exdevice.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;

public class w
  extends k.a
{
  public w()
  {
    GMTrace.i(11176847081472L, 83274);
    GMTrace.o(11176847081472L, 83274);
  }
  
  public void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    GMTrace.i(11176981299200L, 83275);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.exdevice.OnStateChangeCallBack", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d, profileType = %d", new Object[] { b.bS(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong2) });
    GMTrace.o(11176981299200L, 83275);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */