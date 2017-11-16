package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import java.util.List;

public final class g
  implements e
{
  h pyT;
  
  public g()
  {
    GMTrace.i(8769786347520L, 65340);
    GMTrace.o(8769786347520L, 65340);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8770189000704L, 65343);
    GMTrace.o(8770189000704L, 65343);
  }
  
  public final boolean bjV()
  {
    GMTrace.i(8769920565248L, 65341);
    if ((this.pyT == null) || (this.pyT.pyI.size() == 0))
    {
      GMTrace.o(8769920565248L, 65341);
      return false;
    }
    GMTrace.o(8769920565248L, 65341);
    return true;
  }
  
  public final h bjW()
  {
    GMTrace.i(8770054782976L, 65342);
    if ((this.pyT == null) || (this.pyT.pyI.size() == 0))
    {
      GMTrace.o(8770054782976L, 65342);
      return null;
    }
    h localh = this.pyT;
    GMTrace.o(8770054782976L, 65342);
    return localh;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */