package com.tencent.mm.vending.j;

import com.tencent.gmtrace.GMTrace;

public class a
{
  public Object[] xyT;
  
  public a()
  {
    GMTrace.i(297426485248L, 2216);
    GMTrace.o(297426485248L, 2216);
  }
  
  public static <$1> b<$1> ca($1 param$1)
  {
    GMTrace.i(297829138432L, 2219);
    b localb = new b();
    localb.xyT = new Object[] { param$1 };
    param$1 = (b)localb;
    GMTrace.o(297829138432L, 2219);
    return param$1;
  }
  
  public static <$1, $2> c<$1, $2> w($1 param$1, $2 param$2)
  {
    GMTrace.i(297963356160L, 2220);
    c localc = new c();
    localc.xyT = new Object[] { param$1, param$2 };
    param$1 = (c)localc;
    GMTrace.o(297963356160L, 2220);
    return param$1;
  }
  
  public final <T> T get(int paramInt)
  {
    GMTrace.i(297560702976L, 2217);
    if (this.xyT.length <= paramInt)
    {
      GMTrace.o(297560702976L, 2217);
      return null;
    }
    Object localObject = this.xyT[paramInt];
    GMTrace.o(297560702976L, 2217);
    return (T)localObject;
  }
  
  public final int size()
  {
    GMTrace.i(297694920704L, 2218);
    if (this.xyT == null)
    {
      GMTrace.o(297694920704L, 2218);
      return 0;
    }
    int i = this.xyT.length;
    GMTrace.o(297694920704L, 2218);
    return i;
  }
  
  public String toString()
  {
    GMTrace.i(298097573888L, 2221);
    Object localObject1 = new StringBuilder();
    int j = 1;
    Object[] arrayOfObject = this.xyT;
    int k = arrayOfObject.length;
    int i = 0;
    if (i < k)
    {
      Object localObject2 = arrayOfObject[i];
      if (j != 0) {
        j = 0;
      }
      for (;;)
      {
        ((StringBuilder)localObject1).append(localObject2);
        i += 1;
        break;
        ((StringBuilder)localObject1).append(",");
      }
    }
    localObject1 = ((StringBuilder)localObject1).toString();
    GMTrace.o(298097573888L, 2221);
    return (String)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */