package com.tencent.mm.network;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class y
{
  private static final byte[] hhr;
  public m hhs;
  
  static
  {
    GMTrace.i(13654640558080L, 101735);
    hhr = n.cS(7);
    GMTrace.o(13654640558080L, 101735);
  }
  
  public y()
  {
    GMTrace.i(13654372122624L, 101733);
    GMTrace.o(13654372122624L, 101733);
  }
  
  public final void onPush(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(13654506340352L, 101734);
    StringBuilder localStringBuilder = new StringBuilder("onNotify, datalen=");
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      w.i("MicroMsg.MMNativeNetNotifyAdapter", i + " cmd= " + paramInt);
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(13654506340352L, 101734);
      return;
      i = paramArrayOfByte.length;
      break;
      w.i("MicroMsg.MMNativeNetNotifyAdapter", "old notify");
      this.hhs.d(138, hhr);
      GMTrace.o(13654506340352L, 101734);
      return;
      w.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush new notify [%s]", new Object[] { bg.bp(paramArrayOfByte) });
      this.hhs.d(138, paramArrayOfByte);
      GMTrace.o(13654506340352L, 101734);
      return;
      w.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush GCM notify [%s]", new Object[] { bg.bp(paramArrayOfByte) });
      this.hhs.d(2147480001, paramArrayOfByte);
      GMTrace.o(13654506340352L, 101734);
      return;
      w.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do synccheck");
      this.hhs.d(39, null);
      GMTrace.o(13654506340352L, 101734);
      return;
      GMTrace.o(13654506340352L, 101734);
      return;
      this.hhs.d(174, paramArrayOfByte);
      GMTrace.o(13654506340352L, 101734);
      return;
      if (paramArrayOfByte.length > 0)
      {
        this.hhs.d(10, paramArrayOfByte);
        GMTrace.o(13654506340352L, 101734);
        return;
        GMTrace.o(13654506340352L, 101734);
        return;
        w.i("MicroMsg.MMNativeNetNotifyAdapter", "MM_PKT_VOIP_REQ");
        if (paramArrayOfByte.length > 0)
        {
          this.hhs.d(120, paramArrayOfByte);
          GMTrace.o(13654506340352L, 101734);
          return;
          w.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush MM_PKT_PUSH_DATA_REQ");
          if (paramArrayOfByte.length > 0)
          {
            this.hhs.d(268369921, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            this.hhs.d(1000000205, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            this.hhs.d(192, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            w.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do oob do notify");
            this.hhs.d(268369923, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            w.i("MicroMsg.MMNativeNetNotifyAdapter", "jacks do voice notify PUSH");
            this.hhs.d(241, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            w.i("MicroMsg.MMNativeNetNotifyAdapter", "pandy do gamesync notify");
            this.hhs.d(244, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            w.i("MicroMsg.MMNativeNetNotifyAdapter", "hy: on notify new year shake");
            this.hhs.d(319, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            w.i("MicroMsg.MMNativeNetNotifyAdapter", "on notify F2F data");
            this.hhs.d(311, paramArrayOfByte);
            GMTrace.o(13654506340352L, 101734);
            return;
            w.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on silence notify");
            this.hhs.d(318, paramArrayOfByte);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */