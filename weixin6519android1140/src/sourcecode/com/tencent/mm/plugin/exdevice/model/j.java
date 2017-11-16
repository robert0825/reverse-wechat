package com.tencent.mm.plugin.exdevice.model;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.List;

public final class j
{
  private static j kzN;
  private SparseArray<List<a>> kzO;
  
  private j()
  {
    GMTrace.i(10989479133184L, 81878);
    this.kzO = new SparseArray();
    GMTrace.o(10989479133184L, 81878);
  }
  
  public static j atI()
  {
    GMTrace.i(10989613350912L, 81879);
    if (kzN == null) {
      kzN = new j();
    }
    j localj = kzN;
    GMTrace.o(10989613350912L, 81879);
    return localj;
  }
  
  public final boolean a(int paramInt, a parama)
  {
    GMTrace.i(10989747568640L, 81880);
    if (parama == null)
    {
      GMTrace.o(10989747568640L, 81880);
      return false;
    }
    List localList = (List)this.kzO.get(paramInt);
    Object localObject;
    if (localList == null)
    {
      localObject = new LinkedList();
      this.kzO.put(paramInt, localObject);
    }
    do
    {
      boolean bool = ((List)localObject).add(parama);
      GMTrace.o(10989747568640L, 81880);
      return bool;
      localObject = localList;
    } while (!localList.contains(parama));
    GMTrace.o(10989747568640L, 81880);
    return false;
  }
  
  public final boolean b(int paramInt, a parama)
  {
    GMTrace.i(10989881786368L, 81881);
    List localList = (List)this.kzO.get(paramInt);
    if (localList != null)
    {
      localList.remove(parama);
      if (localList.size() == 0) {
        this.kzO.remove(paramInt);
      }
    }
    GMTrace.o(10989881786368L, 81881);
    return false;
  }
  
  public final void g(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10990016004096L, 81882);
    List localList = (List)this.kzO.get(paramInt);
    if ((localList == null) || (localList.size() == 0))
    {
      GMTrace.o(10990016004096L, 81882);
      return;
    }
    int i = 0;
    while (i < localList.size())
    {
      ((a)localList.get(i)).f(paramInt, paramVarArgs);
      i += 1;
    }
    GMTrace.o(10990016004096L, 81882);
  }
  
  public static abstract interface a
  {
    public abstract void f(int paramInt, Object... paramVarArgs);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */