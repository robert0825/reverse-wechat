package com.d.a.a;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

abstract class d
{
  boolean aDI;
  private Collection<WeakReference<m>> aDJ;
  private a aDK;
  boolean isReady;
  private Handler mHandler;
  private Context sN;
  
  private void b(Context paramContext, m... paramVarArgs)
  {
    this.sN = paramContext;
    if (paramVarArgs == null) {
      this.aDJ = null;
    }
    for (;;)
    {
      P(paramContext);
      return;
      this.aDJ = new LinkedList();
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        m localm = paramVarArgs[i];
        this.aDJ.add(new WeakReference(localm));
        i += 1;
      }
    }
  }
  
  abstract void P(Context paramContext);
  
  abstract void Q(Context paramContext);
  
  abstract void a(Context paramContext, Handler paramHandler, a parama);
  
  final void a(Context paramContext, m... paramVarArgs)
  {
    if (paramContext == null) {
      try
      {
        throw new Exception("Module: context cannot be null");
      }
      finally {}
    }
    nF();
    b(paramContext.getApplicationContext(), paramVarArgs);
    this.isReady = true;
  }
  
  void a(Handler paramHandler, a parama)
  {
    try
    {
      stop();
      this.mHandler = paramHandler;
      this.aDK = parama;
      a(this.sN, this.mHandler, this.aDK);
      this.aDI = true;
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  final void c(p paramp)
  {
    if (!this.aDI) {}
    for (;;)
    {
      return;
      if (this.aDJ != null)
      {
        Iterator localIterator = this.aDJ.iterator();
        while (localIterator.hasNext())
        {
          m localm = (m)((WeakReference)localIterator.next()).get();
          if (localm != null) {
            localm.a(paramp);
          }
        }
      }
    }
  }
  
  abstract void nC();
  
  final void nF()
  {
    try
    {
      if (this.isReady)
      {
        stop();
        nC();
        this.isReady = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  void stop()
  {
    try
    {
      if (this.aDI)
      {
        Q(this.sN);
        this.mHandler = null;
        this.aDK = null;
        this.aDI = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  static class a
  {
    final long aDL;
    
    a(long paramLong)
    {
      this.aDL = Math.max(paramLong, 0L);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */