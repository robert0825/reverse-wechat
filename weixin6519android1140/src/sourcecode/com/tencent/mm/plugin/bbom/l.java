package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.n;
import com.tencent.mm.e.b.i;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.network.n.a;
import com.tencent.mm.pluginsdk.model.app.am.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.f;

public final class l
{
  private static boolean jjT;
  
  static
  {
    GMTrace.i(8025951698944L, 59798);
    jjT = false;
    GMTrace.o(8025951698944L, 59798);
  }
  
  public static void agU()
  {
    GMTrace.i(16040897544192L, 119514);
    if ((!com.tencent.mm.kernel.h.xw().wL()) || (com.tencent.mm.kernel.a.wF()))
    {
      w.w("MicroMsg.OnNetworkAvailableListener", "dealWithNetworkAvailable hasSetuin:" + com.tencent.mm.kernel.h.xw().wL() + " isHold:" + com.tencent.mm.kernel.a.wF());
      GMTrace.o(16040897544192L, 119514);
      return;
    }
    m.NM().run();
    o.Nm().run();
    n.IX().run();
    an.bJK().run();
    if (ak.a.gna != null) {
      ak.a.gna.AD();
    }
    com.tencent.mm.sdk.b.a.vgX.m(new qj());
    GMTrace.o(16040897544192L, 119514);
  }
  
  /* Error */
  public static void ca(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 139
    //   6: ldc -115
    //   8: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 21	com/tencent/mm/plugin/bbom/l:jjT	Z
    //   14: ifeq +15 -> 29
    //   17: ldc2_w 139
    //   20: ldc -115
    //   22: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: ldc 2
    //   27: monitorexit
    //   28: return
    //   29: iconst_1
    //   30: putstatic 21	com/tencent/mm/plugin/bbom/l:jjT	Z
    //   33: invokestatic 145	com/tencent/mm/kernel/h:xx	()Lcom/tencent/mm/kernel/b;
    //   36: new 6	com/tencent/mm/plugin/bbom/l$1
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 147	com/tencent/mm/plugin/bbom/l$1:<init>	(Landroid/content/Context;)V
    //   44: invokevirtual 153	com/tencent/mm/kernel/b:a	(Lcom/tencent/mm/network/n;)V
    //   47: ldc2_w 139
    //   50: ldc -115
    //   52: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   55: goto -30 -> 25
    //   58: astore_0
    //   59: ldc 2
    //   61: monitorexit
    //   62: aload_0
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	25	58	finally
    //   29	55	58	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */