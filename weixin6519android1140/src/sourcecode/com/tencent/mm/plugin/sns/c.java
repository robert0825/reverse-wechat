package com.tencent.mm.plugin.sns;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fd;
import com.tencent.mm.g.a.fd.a;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bf.a;

public final class c
  extends com.tencent.mm.sdk.b.c<fd>
{
  public c()
  {
    GMTrace.i(8031991496704L, 59843);
    this.vhf = fd.class.getName().hashCode();
    GMTrace.o(8031991496704L, 59843);
  }
  
  private boolean a(final fd paramfd)
  {
    GMTrace.i(8032125714432L, 59844);
    if (!(paramfd instanceof fd))
    {
      w.f("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "mismatched event");
      GMTrace.o(8032125714432L, 59844);
      return false;
    }
    al.a locala = ae.biT();
    locala.a(paramfd.eHj.type, paramfd.eHj.username, new h.a()
    {
      public final void a(boolean paramAnonymousBoolean1, String paramAnonymousString, boolean paramAnonymousBoolean2, boolean paramAnonymousBoolean3, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(8780792201216L, 65422);
        GMTrace.o(8780792201216L, 65422);
      }
      
      public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString, boolean paramAnonymousBoolean3, boolean paramAnonymousBoolean4, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(8780657983488L, 65421);
        if (paramfd.eHj != null) {
          paramfd.eHj.eHn.a(null);
        }
        GMTrace.o(8780657983488L, 65421);
      }
    });
    locala.a(1, paramfd.eHj.username, paramfd.eHj.eHl, paramfd.eHj.eHm);
    GMTrace.o(8032125714432L, 59844);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */