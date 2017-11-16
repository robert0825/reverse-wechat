package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class c
  implements Runnable
{
  c(b paramb)
  {
    GMTrace.i(3221225472L, 24);
    GMTrace.o(3221225472L, 24);
  }
  
  public final void run()
  {
    GMTrace.i(3355443200L, 25);
    Object localObject = new ArrayList();
    ((List)localObject).addAll(this.g.f.c);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((OAuthListener)((Iterator)localObject).next()).onQrcodeScanned();
    }
    GMTrace.o(3355443200L, 25);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */