package com.tencent.mm.plugin.soter_mp.a;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public final class a
  extends Enum<a>
{
  static
  {
    GMTrace.i(7079448281088L, 52746);
    qpO = 1;
    qpP = new int[] { qpO };
    GMTrace.o(7079448281088L, 52746);
  }
  
  public static c a(Activity paramActivity, d paramd, e parame)
  {
    GMTrace.i(7079314063360L, 52745);
    if (((paramd.qqg & 0x1) != 0) && (com.tencent.d.a.a.hD(ab.getContext())))
    {
      paramActivity = new b(new WeakReference(paramActivity), paramd, parame);
      GMTrace.o(7079314063360L, 52745);
      return paramActivity;
    }
    w.e("MicroMsg.SoterControllerFactory", "hy: no matching: %d", new Object[] { Byte.valueOf(paramd.qqg) });
    GMTrace.o(7079314063360L, 52745);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */