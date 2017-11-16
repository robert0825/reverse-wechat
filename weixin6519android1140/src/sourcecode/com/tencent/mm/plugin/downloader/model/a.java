package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;

public final class a<E>
  extends HashSet<E>
{
  private p keA;
  
  public a(p paramp)
  {
    GMTrace.i(20092259663872L, 149699);
    this.keA = paramp;
    GMTrace.o(20092259663872L, 149699);
  }
  
  private void apE()
  {
    try
    {
      GMTrace.i(20377203900416L, 151822);
      this.keA.apD();
      GMTrace.o(20377203900416L, 151822);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void apF()
  {
    try
    {
      GMTrace.i(20377338118144L, 151823);
      this.keA.remove();
      GMTrace.o(20377338118144L, 151823);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void apG()
  {
    try
    {
      GMTrace.i(20377472335872L, 151824);
      this.keA.clear();
      GMTrace.o(20377472335872L, 151824);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean add(E paramE)
  {
    try
    {
      GMTrace.i(20092528099328L, 149701);
      boolean bool = super.add(paramE);
      apE();
      GMTrace.o(20092528099328L, 149701);
      return bool;
    }
    finally
    {
      paramE = finally;
      throw paramE;
    }
  }
  
  public final void clear()
  {
    GMTrace.i(20092662317056L, 149702);
    super.clear();
    apG();
    GMTrace.o(20092662317056L, 149702);
  }
  
  public final boolean remove(Object paramObject)
  {
    try
    {
      GMTrace.i(20092796534784L, 149703);
      boolean bool = super.remove(paramObject);
      apF();
      GMTrace.o(20092796534784L, 149703);
      return bool;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */