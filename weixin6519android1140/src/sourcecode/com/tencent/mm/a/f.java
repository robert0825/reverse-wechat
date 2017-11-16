package com.tencent.mm.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.y;

public class f<K, O>
  extends y<K, O>
{
  private b<K, O> epP;
  
  public f(int paramInt)
  {
    super(paramInt);
    GMTrace.i(13857175109632L, 103244);
    this.epP = null;
    GMTrace.o(13857175109632L, 103244);
  }
  
  public f(int paramInt, b<K, O> paramb)
  {
    super(paramInt);
    GMTrace.i(13857577762816L, 103247);
    this.epP = null;
    this.epP = paramb;
    GMTrace.o(13857577762816L, 103247);
  }
  
  public void a(a<K, O> parama)
  {
    GMTrace.i(13858248851456L, 103252);
    clear();
    GMTrace.o(13858248851456L, 103252);
  }
  
  public void clear()
  {
    GMTrace.i(13857443545088L, 103246);
    super.trimToSize(-1);
    GMTrace.o(13857443545088L, 103246);
  }
  
  protected final O create(K paramK)
  {
    GMTrace.i(13857846198272L, 103249);
    paramK = super.create(paramK);
    GMTrace.o(13857846198272L, 103249);
    return paramK;
  }
  
  public void entryRemoved(boolean paramBoolean, K paramK, O paramO1, O paramO2)
  {
    GMTrace.i(13857980416000L, 103250);
    super.entryRemoved(paramBoolean, paramK, paramO1, paramO2);
    if ((this.epP != null) && (paramO2 == null)) {
      this.epP.n(paramK, paramO1);
    }
    GMTrace.o(13857980416000L, 103250);
  }
  
  public final void m(K paramK, O paramO)
  {
    GMTrace.i(13857309327360L, 103245);
    if (paramO == null)
    {
      GMTrace.o(13857309327360L, 103245);
      return;
    }
    put(paramK, paramO);
    GMTrace.o(13857309327360L, 103245);
  }
  
  public int sizeOf(K paramK, O paramO)
  {
    GMTrace.i(13858114633728L, 103251);
    int i = super.sizeOf(paramK, paramO);
    GMTrace.o(13858114633728L, 103251);
    return i;
  }
  
  public final void trimToSize(int paramInt)
  {
    GMTrace.i(15696092200960L, 116945);
    super.trimToSize(paramInt);
    GMTrace.o(15696092200960L, 116945);
  }
  
  public static abstract interface a<K, O> {}
  
  public static abstract interface b<K, O>
  {
    public abstract void n(K paramK, O paramO);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */