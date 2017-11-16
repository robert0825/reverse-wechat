package com.tencent.mm.jsapi.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.core.a;

public class b<InputType, CallbackType>
  implements e
{
  public int index;
  public String name;
  
  public b(String paramString, int paramInt)
  {
    GMTrace.i(20827504377856L, 155177);
    this.name = paramString;
    this.index = paramInt;
    GMTrace.o(20827504377856L, 155177);
  }
  
  public String a(a parama, InputType paramInputType, a<CallbackType> parama1)
  {
    GMTrace.i(20827638595584L, 155178);
    GMTrace.o(20827638595584L, 155178);
    return null;
  }
  
  public final int getIndex()
  {
    GMTrace.i(20827907031040L, 155180);
    int i = this.index;
    GMTrace.o(20827907031040L, 155180);
    return i;
  }
  
  public final String getName()
  {
    GMTrace.i(20827772813312L, 155179);
    String str = this.name;
    GMTrace.o(20827772813312L, 155179);
    return str;
  }
  
  public static abstract interface a<T>
  {
    public abstract void ap(T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */