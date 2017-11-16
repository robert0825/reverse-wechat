package com.tencent.mm.bd.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class b
  implements e
{
  public b()
  {
    GMTrace.i(4400193994752L, 32784);
    GMTrace.o(4400193994752L, 32784);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4400328212480L, 32785);
    h.wS().b(228, this);
    if ((paramk instanceof a)) {
      w.i("MicroMsg.NewVoiceInputReportManager", "onSceneEnd errType = %s, errCode = %s, errMsg = %s ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    }
    GMTrace.o(4400328212480L, 32785);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */