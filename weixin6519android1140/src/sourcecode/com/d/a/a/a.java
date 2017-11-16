package com.d.a.a;

import android.content.Context;
import android.os.Handler;

abstract class a
  extends d
  implements m
{
  private final d[] aDB;
  private final Handler[] aDC;
  private final d.a[] aDD;
  
  a(d... paramVarArgs)
  {
    this.aDB = paramVarArgs;
    this.aDC = new Handler[this.aDB.length];
    this.aDD = new d.a[this.aDC.length];
  }
  
  final void P(Context paramContext)
  {
    int i = 0;
    d[] arrayOfd = this.aDB;
    int j = arrayOfd.length;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      d locald = arrayOfd[i];
      try
      {
        locald.a(paramContext, new m[] { this });
        i += 1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  final void Q(Context paramContext)
  {
    paramContext = this.aDB;
    int j = paramContext.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramContext[i].stop();
      i += 1;
    }
  }
  
  void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    a(paramHandler, this.aDC);
    a(parama, this.aDD);
    int i = 0;
    for (;;)
    {
      if (i >= this.aDB.length) {
        return;
      }
      try
      {
        this.aDB[i].a(this.aDC[i], this.aDD[i]);
        i += 1;
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  abstract void a(Handler paramHandler, Handler[] paramArrayOfHandler);
  
  abstract void a(d.a parama, d.a[] paramArrayOfa);
  
  final void nC()
  {
    d[] arrayOfd = this.aDB;
    int j = arrayOfd.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      arrayOfd[i].nF();
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */