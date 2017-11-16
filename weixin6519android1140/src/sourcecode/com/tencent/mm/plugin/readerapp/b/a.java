package com.tencent.mm.plugin.readerapp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.atw;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

final class a
  extends com.tencent.mm.sdk.b.c<ag>
{
  a()
  {
    GMTrace.i(11744453853184L, 87503);
    this.vhf = ag.class.getName().hashCode();
    GMTrace.o(11744453853184L, 87503);
  }
  
  private boolean a(ag paramag)
  {
    GMTrace.i(11744588070912L, 87504);
    if (!(paramag instanceof ag))
    {
      w.f("MicroMsg.ReaderAppBindQQ.EventListener", "not bind qq event");
      GMTrace.o(11744588070912L, 87504);
      return false;
    }
    if (paramag.eBe.eBg == 0) {}
    try
    {
      int i = q.zP() | 0x40000;
      at.AR();
      com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
      paramag = new atw();
      paramag.tOv = 262144;
      paramag.uJr = 1;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(39, paramag));
      at.AR();
      com.tencent.mm.y.c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
      g.b(new g.a()
      {
        public final void bae()
        {
          GMTrace.i(11750359433216L, 87547);
          GMTrace.o(11750359433216L, 87547);
        }
      });
      i = q.zK();
      at.AR();
      com.tencent.mm.y.c.xh().set(40, Integer.valueOf(i & 0xFFFFFFDF));
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.g(21, 2));
      w.d("MicroMsg.ReaderAppBindQQ.EventListener", "doClearReaderAppWeiboHelper succ ");
      GMTrace.o(11744588070912L, 87504);
      return false;
    }
    catch (Exception paramag)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ReaderAppBindQQ.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */