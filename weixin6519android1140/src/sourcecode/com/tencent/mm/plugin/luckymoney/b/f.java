package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Set;

public final class f
{
  private Object lock;
  private Set<String> mIC;
  
  public f()
  {
    GMTrace.i(9732798545920L, 72515);
    this.mIC = new HashSet();
    this.lock = new Object();
    GMTrace.o(9732798545920L, 72515);
  }
  
  public final boolean BA(String paramString)
  {
    GMTrace.i(9732932763648L, 72516);
    synchronized (this.lock)
    {
      if (!this.mIC.contains(paramString))
      {
        boolean bool = this.mIC.add(paramString);
        GMTrace.o(9732932763648L, 72516);
        return bool;
      }
      w.i("MicroMsg.LuckyMoneyMsg", "has contains msg, %s", new Object[] { paramString });
      GMTrace.o(9732932763648L, 72516);
      return false;
    }
  }
  
  public final void BB(String paramString)
  {
    GMTrace.i(9733066981376L, 72517);
    synchronized (this.lock)
    {
      this.mIC.remove(paramString);
      GMTrace.o(9733066981376L, 72517);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */