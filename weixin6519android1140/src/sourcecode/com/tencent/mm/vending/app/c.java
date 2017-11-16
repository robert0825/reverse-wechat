package com.tencent.mm.vending.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import java.util.Map;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.vending.e.b
{
  private com.tencent.mm.vending.e.c xwH;
  private b xwZ;
  private a xxa;
  private com.tencent.mm.vending.c.b<? extends a> xxb;
  private int xxc;
  
  public c()
  {
    GMTrace.i(252731981824L, 1883);
    this.xwZ = b.cjX();
    this.xxc = 0;
    this.xwH = new com.tencent.mm.vending.e.c();
    GMTrace.o(252731981824L, 1883);
  }
  
  private void A(Intent paramIntent, Context paramContext)
  {
    try
    {
      GMTrace.i(253268852736L, 1887);
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.xxa);
      this.xxa.mContext = paramContext;
      this.xxa.xwP = new com.tencent.mm.vending.d.a(paramIntent);
      GMTrace.o(253268852736L, 1887);
      return;
    }
    finally
    {
      paramIntent = finally;
      throw paramIntent;
    }
  }
  
  private <T extends com.tencent.mm.vending.c.b<? extends a>> T F(Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    try
    {
      GMTrace.i(252866199552L, 1884);
      if (this.xxb == null) {
        break label79;
      }
      if (!paramClass.isInstance(this.xxb)) {
        throw new IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + paramClass.toString());
      }
    }
    finally {}
    paramClass = this.xxb;
    GMTrace.o(252866199552L, 1884);
    for (;;)
    {
      return paramClass;
      try
      {
        label79:
        this.xxb = ((com.tencent.mm.vending.c.b)paramClass.newInstance());
        if (this.xxa == null) {
          this.xxa = ((a)this.xxb.PI());
        }
        cjY();
        com.tencent.mm.vending.c.b localb = this.xxb;
        GMTrace.o(252866199552L, 1884);
        paramClass = localb;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
      catch (InstantiationException localInstantiationException)
      {
        for (;;) {}
      }
    }
    throw new InternalError("Could not create interactor api instance : " + paramClass.toString());
  }
  
  private <T extends a> T G(Class<? extends a> paramClass)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(253000417280L, 1885);
        if (this.xxb != null)
        {
          paramClass = (a)this.xxb.PI();
          GMTrace.o(253000417280L, 1885);
          return paramClass;
        }
        if (this.xxa == null) {
          break label111;
        }
        if (!paramClass.isInstance(this.xxa)) {
          throw new IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + paramClass.toString());
        }
      }
      finally {}
      paramClass = this.xxa;
      GMTrace.o(253000417280L, 1885);
      continue;
      try
      {
        label111:
        this.xxa = ((a)paramClass.newInstance());
        cjY();
        a locala = this.xxa;
        GMTrace.o(253000417280L, 1885);
        paramClass = locala;
      }
      catch (InstantiationException localInstantiationException)
      {
        for (;;) {}
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
    }
    throw new InternalError("Could not create interactor instance : " + paramClass.toString());
  }
  
  private void cjY()
  {
    GMTrace.i(253134635008L, 1886);
    if (this.xwZ != null)
    {
      b localb = this.xwZ;
      a locala = this.xxa;
      if (!localb.xwV.containsKey(this))
      {
        localb.xwV.put(this, locala);
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "presenter %s hash %s interactor %s looper %s", new Object[] { this, Integer.valueOf(hashCode()), locala, Looper.myLooper() });
        int i = localb.xwW.get(hashCode(), 0);
        if ((i > 0) && (i < 4))
        {
          if (i > 0) {
            localb.xwX.sendMessage(localb.xwX.obtainMessage(1, locala));
          }
          if (i >= 2) {
            localb.xwX.sendMessage(localb.xwX.obtainMessage(2, locala));
          }
          if (i >= 3) {
            localb.xwX.sendMessage(localb.xwX.obtainMessage(3, locala));
          }
          if (i >= 4) {
            localb.xwX.sendMessage(localb.xwX.obtainMessage(4, locala));
          }
        }
        GMTrace.o(253134635008L, 1886);
        return;
      }
      com.tencent.mm.vending.f.a.e("Vending.InteractorManager", "duplicate activity and interactor.", new Object[0]);
    }
    GMTrace.o(253134635008L, 1886);
  }
  
  public final void B(Intent paramIntent, Context paramContext)
  {
    GMTrace.i(253805723648L, 1891);
    A(paramIntent, paramContext);
    Ez(1);
    GMTrace.o(253805723648L, 1891);
  }
  
  public final void Ez(int paramInt)
  {
    GMTrace.i(253671505920L, 1890);
    this.xxc = paramInt;
    b localb = this.xwZ;
    a locala = (a)localb.xwV.get(this);
    if (locala != null) {
      switch (paramInt)
      {
      default: 
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "Unknow phase %s, interactor %s activity %s %s %s", new Object[] { Integer.valueOf(paramInt), locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
        GMTrace.o(253671505920L, 1890);
        return;
      case 1: 
        com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onCreate interactor %s presenter %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      }
    }
    for (;;)
    {
      localb.xwX.sendMessage(localb.xwX.obtainMessage(paramInt, locala));
      localb.xwW.put(hashCode(), paramInt);
      GMTrace.o(253671505920L, 1890);
      return;
      com.tencent.mm.vending.f.a.i("Vending.InteractorManager", "onDestroy interactor %s activity %s %s %s", new Object[] { locala, this, Integer.valueOf(hashCode()), Looper.myLooper() });
      localb.xwV.remove(this);
    }
  }
  
  public final <T extends com.tencent.mm.vending.c.b<? extends a>> T a(Activity paramActivity, Class<? extends com.tencent.mm.vending.c.b<? extends a>> paramClass)
  {
    GMTrace.i(253537288192L, 1889);
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      GMTrace.o(253537288192L, 1889);
      return null;
    }
    paramActivity = F(paramClass);
    GMTrace.o(253537288192L, 1889);
    return paramActivity;
  }
  
  public final void a(com.tencent.mm.vending.e.a parama)
  {
    GMTrace.i(253939941376L, 1892);
    Assert.assertTrue("target must be a ILifeCycle", parama instanceof com.tencent.mm.vending.e.a);
    this.xwH.a(parama);
    GMTrace.o(253939941376L, 1892);
  }
  
  public final <T extends a> T b(Activity paramActivity, Class<? extends a> paramClass)
  {
    GMTrace.i(17854179049472L, 133024);
    if ((paramActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())))
    {
      com.tencent.mm.vending.f.a.e("Vending.Presenter", "Activity %s is finished! This is invalid!", new Object[] { paramActivity });
      GMTrace.o(17854179049472L, 133024);
      return null;
    }
    paramActivity = G(paramClass);
    GMTrace.o(17854179049472L, 133024);
    return paramActivity;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(254074159104L, 1893);
    this.xwH.dead();
    Ez(4);
    GMTrace.o(254074159104L, 1893);
  }
  
  public final a xI()
  {
    try
    {
      GMTrace.i(253403070464L, 1888);
      if ((this.xxa == null) && (this.xwZ != null)) {
        this.xxa = ((a)this.xwZ.xwV.get(this));
      }
      Assert.assertNotNull("You must pair this presenter with a interactor!", this.xxa);
      a locala = this.xxa;
      GMTrace.o(253403070464L, 1888);
      return locala;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\app\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */