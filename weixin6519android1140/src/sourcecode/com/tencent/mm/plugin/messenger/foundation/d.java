package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.av.r;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bc;

public final class d
  implements c, com.tencent.mm.plugin.messenger.foundation.a.h
{
  ad mUC;
  bc mUD;
  av mUE;
  af mUF;
  r mUG;
  az mUH;
  ai mUI;
  
  public d()
  {
    GMTrace.i(13232794238976L, 98592);
    GMTrace.o(13232794238976L, 98592);
  }
  
  public final void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(13232928456704L, 98593);
    GMTrace.o(13232928456704L, 98593);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(13233062674432L, 98594);
    Object localObject;
    if (this.mUC != null)
    {
      localObject = this.mUC;
      ((ad)localObject).vAj.clear();
      ((ad)localObject).vAk.clear();
    }
    if (this.mUG != null)
    {
      localObject = this.mUG;
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.b(681, (e)localObject);
    }
    GMTrace.o(13233062674432L, 98594);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */