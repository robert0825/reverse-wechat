package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public enum i
{
  private boolean rzf;
  private boolean rzg;
  private Object rzh;
  public HashSet<WeakReference<Activity>> rzi;
  
  static
  {
    GMTrace.i(20246341615616L, 150847);
    rze = new i("INSTANCE");
    rzj = new i[] { rze };
    GMTrace.o(20246341615616L, 150847);
  }
  
  private i()
  {
    GMTrace.i(20245267873792L, 150839);
    this.rzf = false;
    this.rzg = false;
    this.rzh = new Object();
    this.rzi = new HashSet();
    GMTrace.o(20245267873792L, 150839);
  }
  
  public final void a(WeakReference<Activity> paramWeakReference)
  {
    GMTrace.i(20246073180160L, 150845);
    if (this.rzi != null)
    {
      if (paramWeakReference.get() != null) {
        w.v("MicroMsg.WalletLockStatusManager", "alvinluo addProtectActivity %s", new Object[] { ((Activity)paramWeakReference.get()).getClass().getName() });
      }
      this.rzi.add(paramWeakReference);
    }
    GMTrace.o(20246073180160L, 150845);
  }
  
  public final boolean bBg()
  {
    GMTrace.i(20245536309248L, 150841);
    synchronized (this.rzh)
    {
      boolean bool = this.rzf;
      GMTrace.o(20245536309248L, 150841);
      return bool;
    }
  }
  
  public final boolean bBh()
  {
    GMTrace.i(20245804744704L, 150843);
    synchronized (this.rzh)
    {
      boolean bool = this.rzg;
      GMTrace.o(20245804744704L, 150843);
      return bool;
    }
  }
  
  public final void bBi()
  {
    GMTrace.i(20245938962432L, 150844);
    synchronized (this.rzh)
    {
      this.rzg = true;
      GMTrace.o(20245938962432L, 150844);
      return;
    }
  }
  
  public final void bBj()
  {
    GMTrace.i(20246207397888L, 150846);
    Iterator localIterator = this.rzi.iterator();
    while (localIterator.hasNext())
    {
      Activity localActivity = (Activity)((WeakReference)localIterator.next()).get();
      if ((localActivity != null) && (!localActivity.isFinishing()))
      {
        w.v("MicroMsg.WalletLockStatusManager", "alvinluo finish %s", new Object[] { localActivity.getClass().getName() });
        localActivity.finish();
      }
      localIterator.remove();
    }
    GMTrace.o(20246207397888L, 150846);
  }
  
  public final void jl(boolean paramBoolean)
  {
    GMTrace.i(20245402091520L, 150840);
    synchronized (this.rzh)
    {
      this.rzf = paramBoolean;
      GMTrace.o(20245402091520L, 150840);
      return;
    }
  }
  
  public final void jm(boolean paramBoolean)
  {
    GMTrace.i(20245670526976L, 150842);
    synchronized (this.rzh)
    {
      this.rzg = paramBoolean;
      GMTrace.o(20245670526976L, 150842);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */