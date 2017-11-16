package com.tencent.mm.plugin.exdevice.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.plugin.exdevice.service.n.a;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends n.a
{
  private static final a kxm;
  
  static
  {
    GMTrace.i(10987331649536L, 81862);
    kxm = new a();
    GMTrace.o(10987331649536L, 81862);
  }
  
  private a()
  {
    GMTrace.i(10986928996352L, 81859);
    GMTrace.o(10986928996352L, 81859);
  }
  
  public static a atw()
  {
    GMTrace.i(10987063214080L, 81860);
    a locala = kxm;
    GMTrace.o(10987063214080L, 81860);
    return locala;
  }
  
  public final Bundle h(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(10987197431808L, 81861);
    w.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "onExdeviceInvoke, action code = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramBundle == null)
    {
      w.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
      GMTrace.o(10987197431808L, 81861);
      return null;
    }
    switch (paramInt)
    {
    default: 
      GMTrace.o(10987197431808L, 81861);
      return null;
    }
    if (paramBundle == null) {
      w.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
    }
    for (;;)
    {
      GMTrace.o(10987197431808L, 81861);
      return null;
      paramInt = paramBundle.getInt("key_state");
      w.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "handleOnBluetoothStateChange, state = %d", new Object[] { Integer.valueOf(paramInt) });
      if (-1 == paramInt)
      {
        w.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "invalid state, just leave!!!");
      }
      else
      {
        paramBundle = new dq();
        paramBundle.eFt.eFu = paramInt;
        if (!com.tencent.mm.sdk.b.a.vgX.m(paramBundle)) {
          w.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "EventCenter.instance.publish failed!!!");
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */