package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.protocal.c.kd;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class f
  implements e
{
  private final String TAG;
  public Map<k, a> fUk;
  
  public f()
  {
    GMTrace.i(18062753398784L, 134578);
    this.TAG = "MicroMsg.F2fGetPayUrlManager";
    this.fUk = new HashMap();
    GMTrace.o(18062753398784L, 134578);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(18062887616512L, 134579);
    a locala;
    if ((paramk instanceof k))
    {
      paramString = (k)paramk;
      locala = (a)this.fUk.get(paramk);
      if (locala == null)
      {
        w.w("MicroMsg.F2fGetPayUrlManager", "no match callback");
        GMTrace.o(18062887616512L, 134579);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label100;
      }
      locala.a(true, paramString.jWr);
    }
    for (;;)
    {
      this.fUk.remove(paramk);
      GMTrace.o(18062887616512L, 134579);
      return;
      label100:
      w.e("MicroMsg.F2fGetPayUrlManager", "net error: %s", new Object[] { paramString });
      locala.a(false, null);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean, kd paramkd);
    
    public abstract void bL(String paramString1, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */