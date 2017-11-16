package com.tencent.mm.plugin.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.y.a.d;
import com.tencent.mm.y.a.g;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.p;

public final class a
  extends p
  implements c
{
  private static a hsQ;
  private d hsR;
  private com.tencent.mm.y.a.a hsS;
  
  private a()
  {
    super(g.class);
    GMTrace.i(14603694112768L, 108806);
    this.hsR = new d();
    this.hsS = new com.tencent.mm.y.a.a();
    GMTrace.o(14603694112768L, 108806);
  }
  
  public static a Qs()
  {
    try
    {
      GMTrace.i(14603828330496L, 108807);
      if (hsQ == null) {
        hsQ = new a();
      }
      a locala = hsQ;
      GMTrace.o(14603828330496L, 108807);
      return locala;
    }
    finally {}
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(14603962548224L, 108808);
    super.onAccountInitialized(paramf);
    d.c.a(Integer.valueOf(-1879048184), this.hsR);
    ((n)h.j(n.class)).getSysCmdMsgExtension().a("abtest", this.hsS);
    GMTrace.o(14603962548224L, 108808);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(14604096765952L, 108809);
    d.c.a(Integer.valueOf(-1879048184), this.hsR);
    ((n)h.j(n.class)).getSysCmdMsgExtension().b("abtest", this.hsS);
    GMTrace.o(14604096765952L, 108809);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */