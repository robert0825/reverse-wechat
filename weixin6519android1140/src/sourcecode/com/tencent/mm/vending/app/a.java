package com.tencent.mm.vending.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.base.Vending;
import com.tencent.mm.vending.base.Vending.h;
import com.tencent.mm.vending.e.b;
import com.tencent.mm.vending.h.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import junit.framework.Assert;

public abstract class a
  implements b
{
  Context mContext;
  private com.tencent.mm.vending.e.c xwH;
  public com.tencent.mm.vending.e.c<Vending> xwI;
  public Map<Class, a> xwJ;
  byte[] xwK;
  public com.tencent.mm.vending.base.a<Object> xwL;
  private AtomicBoolean xwM;
  boolean xwN;
  public Map<Class, com.tencent.mm.vending.b.c<b>> xwO;
  public com.tencent.mm.vending.d.a xwP;
  
  public a()
  {
    GMTrace.i(250852933632L, 1869);
    this.xwH = new com.tencent.mm.vending.e.c();
    this.xwI = new com.tencent.mm.vending.e.c();
    this.xwJ = new ConcurrentHashMap();
    this.xwK = new byte[0];
    this.xwL = new com.tencent.mm.vending.base.a()
    {
      protected final Object E(Class<?> paramAnonymousClass)
      {
        GMTrace.i(249644974080L, 1860);
        a.a locala = (a.a)a.this.xwJ.get(paramAnonymousClass);
        Object localObject;
        if (locala != null)
        {
          locala.xwS = true;
          localObject = locala.PS();
          locala.xwS = false;
          if (locala.xwR) {
            locala.xwT = defer(paramAnonymousClass);
          }
        }
        else
        {
          GMTrace.o(249644974080L, 1860);
          return null;
        }
        GMTrace.o(249644974080L, 1860);
        return localObject;
      }
    };
    this.xwM = new AtomicBoolean(false);
    this.xwN = false;
    this.xwO = new HashMap();
    this.xwI.a(this.xwL);
    this.xwL.addVendingDataResolvedCallback(new com.tencent.mm.vending.base.a.a() {});
    GMTrace.o(250852933632L, 1869);
  }
  
  private void cjW()
  {
    GMTrace.i(251658240000L, 1875);
    if ((Looper.myLooper() == this.xwL.getLooper()) && (!this.xwM.get())) {
      com.tencent.mm.vending.f.a.e("Vending.Interactor", "This interactor has not call onCreate() yet! Interactor : %s", new Object[] { this });
    }
    GMTrace.o(251658240000L, 1875);
  }
  
  public final <_Struct> _Struct C(Class<_Struct> paramClass)
  {
    GMTrace.i(251255586816L, 1872);
    cjW();
    if ((Looper.myLooper() == Looper.getMainLooper()) && (!this.xwN)) {}
    synchronized (this.xwK)
    {
      boolean bool = this.xwN;
      if (!bool) {}
      try
      {
        this.xwK.wait();
        paramClass = this.xwL.get(paramClass);
        GMTrace.o(251255586816L, 1872);
        return paramClass;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          com.tencent.mm.vending.f.a.printErrStackTrace("Vending.Interactor", localInterruptedException, "", new Object[0]);
        }
      }
    }
  }
  
  public final void D(Class<?> paramClass)
  {
    GMTrace.i(251389804544L, 1873);
    cjW();
    this.xwL.request(paramClass);
    GMTrace.o(251389804544L, 1873);
  }
  
  public final void a(com.tencent.mm.vending.e.a parama)
  {
    GMTrace.i(250987151360L, 1870);
    Assert.assertTrue("target must be a ILifeCycle", parama instanceof com.tencent.mm.vending.e.a);
    this.xwH.a(parama);
    GMTrace.o(250987151360L, 1870);
  }
  
  public final <_Struct> void a(Class<_Struct> paramClass, a<_Struct> parama)
  {
    GMTrace.i(251524022272L, 1874);
    cjW();
    this.xwJ.put(paramClass, parama);
    GMTrace.o(251524022272L, 1874);
  }
  
  public final <_Struct> void a(Class<_Struct> paramClass, b<_Struct> paramb)
  {
    GMTrace.i(251121369088L, 1871);
    com.tencent.mm.vending.b.c localc = (com.tencent.mm.vending.b.c)this.xwO.get(paramClass);
    Object localObject = localc;
    if (localc == null)
    {
      localObject = new com.tencent.mm.vending.b.c(d.xyH) {};
      this.xwO.put(paramClass, localObject);
    }
    ((com.tencent.mm.vending.b.c)localObject).bT(paramb);
    paramClass = this.xwL.peek(paramClass);
    if (paramClass != null) {
      paramb.aI(paramClass);
    }
    GMTrace.o(251121369088L, 1871);
  }
  
  public void onCreate()
  {
    GMTrace.i(251792457728L, 1876);
    this.xwM.set(true);
    GMTrace.o(251792457728L, 1876);
  }
  
  public void onDestroy()
  {
    GMTrace.i(251926675456L, 1877);
    this.xwH.dead();
    this.xwI.dead();
    GMTrace.o(251926675456L, 1877);
  }
  
  public abstract class a<_Struct>
  {
    boolean xwR;
    public boolean xwS;
    Vending.h xwT;
    
    public a()
    {
      GMTrace.i(250450280448L, 1866);
      this.xwR = false;
      this.xwS = false;
      GMTrace.o(250450280448L, 1866);
    }
    
    public abstract _Struct PS();
  }
  
  public static abstract interface b<_Struct>
  {
    public abstract void aI(_Struct param_Struct);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\app\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */