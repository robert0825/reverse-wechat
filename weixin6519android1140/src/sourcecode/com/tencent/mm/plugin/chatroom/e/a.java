package com.tencent.mm.plugin.chatroom.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bt.a;

public final class a
  implements bt.a
{
  public a()
  {
    GMTrace.i(9059562422272L, 67499);
    GMTrace.o(9059562422272L, 67499);
  }
  
  public final void a(d.a parama)
  {
    int i = 1;
    GMTrace.i(9059696640000L, 67500);
    bu localbu = parama.gtM;
    String str1;
    String str2;
    au localau;
    if (localbu.lQc == 10002)
    {
      str1 = n.a(localbu.tPY);
      if (bg.nm(str1))
      {
        w.w("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "msg content is null");
        GMTrace.o(9059696640000L, 67500);
        return;
      }
      str2 = n.a(localbu.tPW);
      at.AR();
      localau = com.tencent.mm.y.c.yM().B(str2, localbu.tQd);
      if (localau.field_msgId <= 0L) {
        break label254;
      }
    }
    for (;;)
    {
      localau.D(localbu.tQd);
      localau.E(bc.k(str2, localbu.nFd));
      localau.setType(10002);
      localau.setContent(str1);
      localau.dC(0);
      localau.db(str2);
      localau.dh(localbu.tQb);
      localau.dM(localau.fwu & 0xFCFF);
      bc.a(localau, parama);
      if (i == 0)
      {
        bc.i(localau);
        GMTrace.o(9059696640000L, 67500);
        return;
      }
      at.AR();
      com.tencent.mm.y.c.yM().b(localbu.tQd, localau);
      GMTrace.o(9059696640000L, 67500);
      return;
      w.i("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(localbu.lQc) });
      GMTrace.o(9059696640000L, 67500);
      return;
      label254:
      i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */