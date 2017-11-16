package com.tencent.mm.plugin.address.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.o.a.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public com.tencent.mm.plugin.o.a.a hui;
  
  public a()
  {
    GMTrace.i(15199889260544L, 113248);
    this.hui = new com.tencent.mm.plugin.o.a.a();
    GMTrace.o(15199889260544L, 113248);
  }
  
  public final b hL(int paramInt)
  {
    GMTrace.i(15650189737984L, 116603);
    Iterator localIterator = this.hui.mhP.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.mhQ == paramInt)
      {
        GMTrace.o(15650189737984L, 116603);
        return localb;
      }
    }
    GMTrace.o(15650189737984L, 116603);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */