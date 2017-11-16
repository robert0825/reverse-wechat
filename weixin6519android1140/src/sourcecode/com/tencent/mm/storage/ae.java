package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;

public final class ae
  extends com.tencent.mm.m.a
  implements com.tencent.mm.bu.a.a<String>
{
  public au vAo;
  
  public ae()
  {
    GMTrace.i(13313459093504L, 99193);
    GMTrace.o(13313459093504L, 99193);
  }
  
  public ae(String paramString)
  {
    super(paramString);
    GMTrace.i(13313324875776L, 99192);
    GMTrace.o(13313324875776L, 99192);
  }
  
  public final void Q(int paramInt, long paramLong)
  {
    GMTrace.i(13314264399872L, 99199);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(13314264399872L, 99199);
      return;
      dz((int)paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      dB((int)paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      dC((int)paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      x(paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      y(paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      dE((int)paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      dF((int)paramLong);
      GMTrace.o(13314264399872L, 99199);
      return;
      dI((int)paramLong);
    }
  }
  
  public final void aF(int paramInt, String paramString)
  {
    GMTrace.i(13314398617600L, 99200);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(13314398617600L, 99200);
      return;
      setUsername(paramString);
      GMTrace.o(13314398617600L, 99200);
      return;
      setContent(paramString);
      GMTrace.o(13314398617600L, 99200);
      return;
      cN(paramString);
      GMTrace.o(13314398617600L, 99200);
      return;
      cO(paramString);
      GMTrace.o(13314398617600L, 99200);
      return;
      cP(paramString);
      GMTrace.o(13314398617600L, 99200);
      return;
      cR(paramString);
    }
  }
  
  public final void ab(au paramau)
  {
    GMTrace.i(13313593311232L, 99194);
    dB(paramau.field_status);
    dC(paramau.field_isSend);
    if (paramau.bTH()) {}
    label104:
    for (;;)
    {
      long l = paramau.field_createTime;
      for (ae localae = this;; localae = this)
      {
        localae.x(l);
        if (!paramau.bTB()) {
          break;
        }
        setContent(paramau.bTY());
        GMTrace.o(13313593311232L, 99194);
        return;
        if (paramau.field_status != 1) {
          break label104;
        }
        l = Long.MAX_VALUE;
      }
      setContent(paramau.field_content);
      GMTrace.o(13313593311232L, 99194);
      return;
    }
  }
  
  public final void bSW()
  {
    GMTrace.i(13313727528960L, 99195);
    dB(0);
    dC(0);
    setContent("");
    cN("0");
    dz(0);
    dI(0);
    z(0L);
    dH(0);
    dH(0);
    super.cO("");
    super.cP("");
    GMTrace.o(13313727528960L, 99195);
  }
  
  public final void bSi()
  {
    GMTrace.i(13314532835328L, 99201);
    GMTrace.o(13314532835328L, 99201);
  }
  
  public final void n(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(13313995964416L, 99197);
    GMTrace.o(13313995964416L, 99197);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */