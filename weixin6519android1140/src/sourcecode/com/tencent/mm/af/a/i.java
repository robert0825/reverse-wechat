package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.x;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;

public final class i
{
  public i()
  {
    GMTrace.i(4580985274368L, 34131);
    GMTrace.o(4580985274368L, 34131);
  }
  
  private static void ac(String paramString1, String paramString2)
  {
    GMTrace.i(4581253709824L, 34133);
    long l = e.jl(paramString1);
    if (l == -1L)
    {
      w.i("MicroMsg.BizChatStatusNotifyService", "qy_status_notify bizLocalId == -1,%s", new Object[] { paramString1 });
      GMTrace.o(4581253709824L, 34133);
      return;
    }
    int i = x.FJ().ab(l).field_newUnReadCount;
    x.FJ().ad(l);
    paramString1 = x.FI().t(l);
    ae localae = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramString2);
    if (localae == null)
    {
      w.w("MicroMsg.BizChatStatusNotifyService", "qy_status_notify cvs == null:%s", new Object[] { paramString2 });
      GMTrace.o(4581253709824L, 34133);
      return;
    }
    if (paramString1.fN(1))
    {
      if (localae.field_unReadMuteCount <= i)
      {
        localae.dG(0);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(localae, paramString2);
        ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(paramString2);
        GMTrace.o(4581253709824L, 34133);
        return;
      }
      localae.dG(localae.field_unReadMuteCount - i);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(localae, paramString2);
      GMTrace.o(4581253709824L, 34133);
      return;
    }
    if (localae.field_unReadCount <= i)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TQ(paramString2);
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancelNotification(paramString2);
      GMTrace.o(4581253709824L, 34133);
      return;
    }
    localae.dF(0);
    localae.dz(localae.field_unReadCount - i);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(localae, paramString2);
    GMTrace.o(4581253709824L, 34133);
  }
  
  public static void e(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(4581119492096L, 34132);
    if (!"EnterpriseChatStatus".equals(paramString1))
    {
      GMTrace.o(4581119492096L, 34132);
      return;
    }
    paramString1 = paramString2.split(";");
    paramString2 = paramString1[0];
    String str = paramString1[1];
    bg.getInt(paramString1[2], 0);
    if (paramInt == 7)
    {
      ac(str, paramString2);
      GMTrace.o(4581119492096L, 34132);
      return;
    }
    if (paramInt == 8)
    {
      ac(str, paramString2);
      GMTrace.o(4581119492096L, 34132);
      return;
    }
    if (paramInt == 9) {
      ac(str, paramString2);
    }
    GMTrace.o(4581119492096L, 34132);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */