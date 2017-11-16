package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class q
  extends com.tencent.mm.sdk.b.c<lq>
{
  private static long fJy;
  
  static
  {
    GMTrace.i(12943286599680L, 96435);
    fJy = 86400000L;
    GMTrace.o(12943286599680L, 96435);
  }
  
  public q()
  {
    GMTrace.i(12942749728768L, 96431);
    this.vhf = lq.class.getName().hashCode();
    GMTrace.o(12942749728768L, 96431);
  }
  
  private static boolean Kg()
  {
    GMTrace.i(12942883946496L, 96432);
    w.d("MicroMsg.PostTaskUpdateConfigListListener", "callback expired : " + rv());
    if (rv()) {
      c.Kc().update();
    }
    GMTrace.o(12942883946496L, 96432);
    return false;
  }
  
  private static boolean rv()
  {
    GMTrace.i(12943018164224L, 96433);
    if (bg.aG(Long.valueOf(bg.c((Long)h.xy().xh().get(81938, null))).longValue()) * 1000L > fJy)
    {
      GMTrace.o(12943018164224L, 96433);
      return true;
    }
    GMTrace.o(12943018164224L, 96433);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */