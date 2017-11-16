package com.tencent.mm.vending.base;

import com.tencent.gmtrace.GMTrace;

public abstract class a<_Struct>
  extends Vending<_Struct, Class<?>, Void>
{
  public a()
  {
    GMTrace.i(254879465472L, 1899);
    GMTrace.o(254879465472L, 1899);
  }
  
  public abstract _Struct E(Class<?> paramClass);
  
  protected void destroyAsynchronous()
  {
    GMTrace.i(255282118656L, 1902);
    GMTrace.o(255282118656L, 1902);
  }
  
  public void notifyVendingDataChange()
  {
    GMTrace.i(255013683200L, 1900);
    GMTrace.o(255013683200L, 1900);
  }
  
  public void notifyVendingDataChangeSynchronize()
  {
    GMTrace.i(255147900928L, 1901);
    GMTrace.o(255147900928L, 1901);
  }
  
  public static abstract interface a
    extends Vending.e
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\base\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */