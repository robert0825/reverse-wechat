package com.tencent.mm.pointers;

import com.tencent.gmtrace.GMTrace;

public class PInt
{
  public int value;
  
  public PInt()
  {
    GMTrace.i(13852880142336L, 103212);
    GMTrace.o(13852880142336L, 103212);
  }
  
  public PInt(int paramInt)
  {
    GMTrace.i(13853014360064L, 103213);
    this.value = paramInt;
    GMTrace.o(13853014360064L, 103213);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pointers\PInt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */