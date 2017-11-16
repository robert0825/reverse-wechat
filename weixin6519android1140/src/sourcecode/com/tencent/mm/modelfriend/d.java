package com.tencent.mm.modelfriend;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

final class d
  extends com.tencent.mm.sdk.b.c<ag>
{
  d()
  {
    GMTrace.i(4415763251200L, 32900);
    this.vhf = ag.class.getName().hashCode();
    GMTrace.o(4415763251200L, 32900);
  }
  
  private static boolean a(ag paramag)
  {
    GMTrace.i(4415897468928L, 32901);
    if (paramag.eBe.eBg == 0) {}
    try
    {
      int i = q.zP() | 0x1000;
      at.AR();
      com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i));
      at.AR();
      com.tencent.mm.y.c.yJ().b(new n("", "", "", "", "", "", "", "", i, "", ""));
      w.d("MicroMsg.FriendBindQQ.EventListener", "doClearQQFriendHelper succ ");
      GMTrace.o(4415897468928L, 32901);
      return false;
    }
    catch (Exception paramag)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FriendBindQQ.EventListener", paramag, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */