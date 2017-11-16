package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class bv
{
  public static long BT()
  {
    long l1 = 0L;
    GMTrace.i(20311705649152L, 151334);
    if (ab.bPY())
    {
      h.xz();
      if (h.xw().wL()) {}
    }
    else
    {
      GMTrace.o(20311705649152L, 151334);
      return 0L;
    }
    long l2 = System.currentTimeMillis();
    try
    {
      h.xz();
      Object localObject = h.xy().xh().get(w.a.vxJ, null);
      if (localObject == null)
      {
        GMTrace.o(20311705649152L, 151334);
        return 0L;
      }
      long l3 = bg.getLong(localObject.toString(), 0L);
      l1 = l2 - l3;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        w.e("MicroMsg.TimeHelper", localThrowable.getMessage());
      }
    }
    GMTrace.o(20311705649152L, 151334);
    return l1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */