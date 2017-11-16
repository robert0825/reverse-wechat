package com.tencent.mm.ipcinvoker.wx_extension;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public static void a(com.tencent.mm.ad.b paramb, a parama)
  {
    GMTrace.i(18687000051712L, 139229);
    if (ab.bPY())
    {
      u.a(paramb, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(18684986785792L, 139214);
          if (this.fVU != null) {
            this.fVU.a(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, paramAnonymousb);
          }
          GMTrace.o(18684986785792L, 139214);
          return 0;
        }
      }, true);
      GMTrace.o(18687000051712L, 139229);
      return;
    }
    XIPCInvoker.a("com.tencent.mm", paramb, b.class, new h() {});
    GMTrace.o(18687000051712L, 139229);
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.b paramb);
  }
  
  private static final class b
    implements g<com.tencent.mm.ad.b, IPCRunCgiRespWrapper>
  {
    private b()
    {
      GMTrace.i(18684181479424L, 139208);
      GMTrace.o(18684181479424L, 139208);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\wx_extension\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */