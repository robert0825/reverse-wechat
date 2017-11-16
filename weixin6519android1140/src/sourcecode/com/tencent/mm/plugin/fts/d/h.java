package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
{
  private static a lzB;
  
  static
  {
    GMTrace.i(16703127814144L, 124448);
    lzB = new a();
    GMTrace.o(16703127814144L, 124448);
  }
  
  public static i a(int paramInt1, Context paramContext, i.b paramb, int paramInt2)
  {
    GMTrace.i(16702993596416L, 124447);
    b localb = (b)lzB.lzD.get(paramInt1);
    if (localb != null)
    {
      paramContext = localb.a(paramContext, paramb, paramInt2);
      GMTrace.o(16702993596416L, 124447);
      return paramContext;
    }
    GMTrace.o(16702993596416L, 124447);
    return null;
  }
  
  public static LinkedList<i> a(HashSet<Integer> paramHashSet, Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16702859378688L, 124446);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    paramHashSet = paramHashSet.iterator();
    while (paramHashSet.hasNext())
    {
      int i = ((Integer)paramHashSet.next()).intValue();
      b localb = (b)lzB.lzD.get(i);
      if (localb != null) {
        localLinkedList2.add(localb);
      }
    }
    Collections.sort(localLinkedList2);
    paramHashSet = localLinkedList2.iterator();
    while (paramHashSet.hasNext()) {
      localLinkedList1.add(((b)paramHashSet.next()).a(paramContext, paramb, paramInt));
    }
    GMTrace.o(16702859378688L, 124446);
    return localLinkedList1;
  }
  
  public static void a(g paramg)
  {
    GMTrace.i(16702456725504L, 124443);
    a locala = lzB;
    locala.lzC = paramg;
    locala.isReady = true;
    GMTrace.o(16702456725504L, 124443);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(16702188290048L, 124441);
    lzB.a(paramb);
    GMTrace.o(16702188290048L, 124441);
  }
  
  public static void aCE()
  {
    GMTrace.i(16702590943232L, 124444);
    a locala = lzB;
    if (locala.lzC != null)
    {
      locala.lzC.aCD();
      locala.lzC = null;
    }
    locala.isReady = false;
    GMTrace.o(16702590943232L, 124444);
  }
  
  public static g aCF()
  {
    GMTrace.i(16702725160960L, 124445);
    g localg = lzB.lzC;
    GMTrace.o(16702725160960L, 124445);
    return localg;
  }
  
  public static void od(int paramInt)
  {
    GMTrace.i(16702322507776L, 124442);
    lzB.od(paramInt);
    GMTrace.o(16702322507776L, 124442);
  }
  
  public static final class a
  {
    boolean isReady;
    g lzC;
    public SparseArray<h.b> lzD;
    
    public a()
    {
      GMTrace.i(16701382983680L, 124435);
      this.lzD = new SparseArray();
      GMTrace.o(16701382983680L, 124435);
    }
    
    public final void a(h.b paramb)
    {
      try
      {
        GMTrace.i(18564593483776L, 138317);
        this.lzD.put(paramb.getType(), paramb);
        GMTrace.o(18564593483776L, 138317);
        return;
      }
      finally
      {
        paramb = finally;
        throw paramb;
      }
    }
    
    public final void od(int paramInt)
    {
      try
      {
        GMTrace.i(18564727701504L, 138318);
        this.lzD.remove(paramInt);
        GMTrace.o(18564727701504L, 138318);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static abstract interface b
    extends Comparable<b>
  {
    public abstract i a(Context paramContext, i.b paramb, int paramInt);
    
    public abstract int getPriority();
    
    public abstract int getType();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */