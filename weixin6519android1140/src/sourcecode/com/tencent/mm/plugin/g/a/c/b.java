package com.tencent.mm.plugin.g.a.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.e.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public BluetoothDevice jls;
  public long joh;
  public c.a joi;
  public c.b joj;
  public c.c jok;
  public long mSessionId;
  public int mState;
  
  public b(long paramLong)
  {
    GMTrace.i(4806336839680L, 35810);
    this.joh = paramLong;
    this.mSessionId = paramLong;
    this.joi = null;
    this.joj = null;
    this.jok = null;
    this.mState = 0;
    this.jls = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a.aU(paramLong));
    GMTrace.o(4806336839680L, 35810);
  }
  
  public final void disconnect()
  {
    GMTrace.i(4806471057408L, 35811);
    w.i("MicroMsg.exdevice.BluetoothChatSession", "disconnect");
    this.mState = 0;
    if (this.joi != null)
    {
      this.joi.disconnect();
      this.joi = null;
    }
    if (this.joj != null)
    {
      this.joj.cancel();
      e.L(this.joj);
      this.joj = null;
    }
    if (this.jok != null)
    {
      this.jok.cancel();
      e.L(this.joj);
      this.jok = null;
    }
    GMTrace.o(4806471057408L, 35811);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */