package com.tencent.mm.plugin.offline;

import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T>
{
  protected List<WeakReference<T>> nzs;
  
  public a()
  {
    GMTrace.i(6188511002624L, 46108);
    this.nzs = new ArrayList();
    GMTrace.o(6188511002624L, 46108);
  }
  
  public final void bm(T paramT)
  {
    GMTrace.i(6188645220352L, 46109);
    if (this.nzs != null) {
      this.nzs = new ArrayList();
    }
    if (paramT != null) {
      this.nzs.add(new WeakReference(paramT));
    }
    GMTrace.o(6188645220352L, 46109);
  }
  
  public final void bn(T paramT)
  {
    GMTrace.i(6188779438080L, 46110);
    if ((this.nzs == null) || (paramT == null))
    {
      GMTrace.o(6188779438080L, 46110);
      return;
    }
    int i = 0;
    while (i < this.nzs.size())
    {
      WeakReference localWeakReference = (WeakReference)this.nzs.get(i);
      if (localWeakReference != null)
      {
        Object localObject = localWeakReference.get();
        if ((localObject != null) && (localObject.equals(paramT)))
        {
          localWeakReference.clear();
          this.nzs.remove(localWeakReference);
        }
      }
      i += 1;
    }
    GMTrace.o(6188779438080L, 46110);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */