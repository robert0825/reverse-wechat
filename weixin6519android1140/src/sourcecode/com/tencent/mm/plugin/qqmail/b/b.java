package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

final class b
  extends com.tencent.mm.sdk.b.c<ag>
{
  b()
  {
    GMTrace.i(5447360708608L, 40586);
    this.vhf = ag.class.getName().hashCode();
    GMTrace.o(5447360708608L, 40586);
  }
  
  private static boolean a(ag paramag)
  {
    GMTrace.i(5447494926336L, 40587);
    if (!(paramag instanceof ag))
    {
      com.tencent.mm.sdk.platformtools.w.f("MicroMsg.QQMail.EventListener", "not bind qq event");
      GMTrace.o(5447494926336L, 40587);
      return false;
    }
    if (paramag.eBe.eBg == 0) {}
    try
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(17, Integer.valueOf(2));
      int i = q.zP() | 0x1;
      at.AR();
      com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
      at.AR();
      com.tencent.mm.y.c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
      w.aYG();
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.QQMail.EventListener", "doClearQQMailHelper succ ");
      GMTrace.o(5447494926336L, 40587);
      return false;
    }
    catch (Exception paramag)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.QQMail.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */