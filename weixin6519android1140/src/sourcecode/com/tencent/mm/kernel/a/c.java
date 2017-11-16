package com.tencent.mm.kernel.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.i;

public abstract class c
  implements d
{
  public c()
  {
    GMTrace.i(13494921461760L, 100545);
    GMTrace.o(13494921461760L, 100545);
  }
  
  public <T extends c> T after(com.tencent.mm.kernel.b.a parama)
  {
    GMTrace.i(18790481920000L, 140000);
    i.xD().xv().wZ().gao.a(this, parama);
    GMTrace.o(18790481920000L, 140000);
    return this;
  }
  
  public void alias(Class<? extends com.tencent.mm.kernel.b.a> paramClass)
  {
    GMTrace.i(13495324114944L, 100548);
    i.xD().xv().wZ().gao.a(paramClass, this);
    GMTrace.o(13495324114944L, 100548);
  }
  
  public <T extends c> T before(com.tencent.mm.kernel.b.a parama)
  {
    GMTrace.i(18790616137728L, 140001);
    i.xD().xv().wZ().gao.a(parama, this);
    GMTrace.o(18790616137728L, 140001);
    return this;
  }
  
  public int hashCode()
  {
    GMTrace.i(13495726768128L, 100551);
    int i = name().hashCode();
    GMTrace.o(13495726768128L, 100551);
    return i;
  }
  
  public String name()
  {
    GMTrace.i(13495458332672L, 100549);
    String str = toString();
    GMTrace.o(13495458332672L, 100549);
    return str;
  }
  
  public String toString()
  {
    GMTrace.i(13495592550400L, 100550);
    String str = getClass().getName() + '@' + Integer.toHexString(super.hashCode());
    GMTrace.o(13495592550400L, 100550);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */