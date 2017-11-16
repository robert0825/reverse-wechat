package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

final class a
  extends com.tencent.mm.sdk.b.c<ag>
{
  a()
  {
    GMTrace.i(8936887418880L, 66585);
    this.vhf = ag.class.getName().hashCode();
    GMTrace.o(8936887418880L, 66585);
  }
  
  private static boolean a(ag paramag)
  {
    GMTrace.i(8937021636608L, 66586);
    if (!(paramag instanceof ag))
    {
      w.f("MicroMsg.QMsg.EventListener", "not bind qq event");
      GMTrace.o(8937021636608L, 66586);
      return false;
    }
    if (paramag.eBe.eBg == 0) {}
    try
    {
      int i = q.zP() | 0x20;
      at.AR();
      com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
      at.AR();
      com.tencent.mm.y.c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
      g.aYm();
      w.d("MicroMsg.QMsg.EventListener", "doClearQQOffLineMessageHelper succ ");
      GMTrace.o(8937021636608L, 66586);
      return false;
    }
    catch (Exception paramag)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.QMsg.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */