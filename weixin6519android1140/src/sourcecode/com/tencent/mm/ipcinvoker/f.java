package com.tencent.mm.ipcinvoker;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.a;
import com.tencent.mm.ipcinvoker.extension.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class f
{
  public static void en(String paramString)
  {
    GMTrace.i(18691563454464L, 139263);
    if (ep(paramString))
    {
      GMTrace.o(18691563454464L, 139263);
      return;
    }
    m.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18683107737600L, 139200);
        b localb = b.vN();
        String str = this.fVh;
        if (d.em(str))
        {
          w.i("IPC.IPCBridgeManager", "the same process(%s), do not need to build IPCBridge.", new Object[] { str });
          GMTrace.o(18683107737600L, 139200);
          return;
        }
        localb.ek(str);
        GMTrace.o(18683107737600L, 139200);
      }
    });
    GMTrace.o(18691563454464L, 139263);
  }
  
  public static void eo(String paramString)
  {
    GMTrace.i(18691697672192L, 139264);
    if (ep(paramString))
    {
      GMTrace.o(18691697672192L, 139264);
      return;
    }
    m.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18689415970816L, 139247);
        b.vN().el(this.fVh);
        GMTrace.o(18689415970816L, 139247);
      }
    });
    GMTrace.o(18691697672192L, 139264);
  }
  
  public static boolean ep(String paramString)
  {
    GMTrace.i(18691831889920L, 139265);
    b localb = b.vN();
    if ((!d.em(paramString)) && (localb.fVe.get(paramString) != null))
    {
      GMTrace.o(18691831889920L, 139265);
      return true;
    }
    GMTrace.o(18691831889920L, 139265);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */