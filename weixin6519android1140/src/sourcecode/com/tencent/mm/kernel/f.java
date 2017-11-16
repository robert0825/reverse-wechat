package com.tencent.mm.kernel;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class f<T>
{
  private final HashMap<T, a<T>> fZq;
  private final Set<T> fZr;
  
  public f()
  {
    GMTrace.i(13532099772416L, 100822);
    this.fZq = new HashMap();
    this.fZr = new HashSet();
    GMTrace.o(13532099772416L, 100822);
  }
  
  public f(f<T> paramf)
  {
    GMTrace.i(13532233990144L, 100823);
    this.fZq = new HashMap();
    this.fZr = new HashSet();
    this.fZq.putAll(paramf.fZq);
    reset();
    GMTrace.o(13532233990144L, 100823);
  }
  
  private void a(ArrayList<a> paramArrayList, ArrayList<T> paramArrayList1)
  {
    GMTrace.i(13533039296512L, 100829);
    if (paramArrayList == null)
    {
      GMTrace.o(13533039296512L, 100829);
      return;
    }
    paramArrayList = paramArrayList.iterator();
    label177:
    for (;;)
    {
      a locala1;
      Object localObject;
      if (paramArrayList.hasNext())
      {
        locala1 = (a)paramArrayList.next();
        boolean bool = locala1.fZv;
        localObject = locala1.fZs;
        if (!locala1.fZv)
        {
          localObject = locala1.fZs.iterator();
          a locala2;
          do
          {
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
            locala2 = (a)((Iterator)localObject).next();
            bool = locala2.fZv;
          } while (locala2.fZv);
        }
      }
      else
      {
        for (int i = 0;; i = 1)
        {
          if (i == 0) {
            break label177;
          }
          locala1.fZv = true;
          paramArrayList1.add(locala1.fZu);
          localObject = locala1.fZu;
          if (locala1.fZt == null) {
            break;
          }
          a(locala1.fZt, paramArrayList1);
          break;
          GMTrace.o(13533039296512L, 100829);
          return;
        }
      }
    }
  }
  
  private a<T> at(T paramT)
  {
    try
    {
      GMTrace.i(13532368207872L, 100824);
      a locala2 = (a)this.fZq.get(paramT);
      a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = new a(paramT);
        this.fZq.put(paramT, locala1);
      }
      GMTrace.o(13532368207872L, 100824);
      return locala1;
    }
    finally {}
  }
  
  private void reset()
  {
    GMTrace.i(13532770861056L, 100827);
    Iterator localIterator = this.fZq.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((a)((Map.Entry)localIterator.next()).getValue()).fZv = false;
    }
    GMTrace.o(13532770861056L, 100827);
  }
  
  /* Error */
  public final boolean au(T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 130
    //   5: ldc -124
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 32	com/tencent/mm/kernel/f:fZq	Ljava/util/HashMap;
    //   14: aload_1
    //   15: invokevirtual 105	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   18: checkcast 7	com/tencent/mm/kernel/f$a
    //   21: astore_3
    //   22: aload_3
    //   23: ifnull +34 -> 57
    //   26: aload_3
    //   27: getfield 82	com/tencent/mm/kernel/f$a:fZs	Ljava/util/ArrayList;
    //   30: ifnull +27 -> 57
    //   33: aload_3
    //   34: getfield 82	com/tencent/mm/kernel/f$a:fZs	Ljava/util/ArrayList;
    //   37: invokevirtual 136	java/util/ArrayList:size	()I
    //   40: ifle +17 -> 57
    //   43: ldc2_w 130
    //   46: ldc -124
    //   48: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: iconst_1
    //   52: istore_2
    //   53: aload_0
    //   54: monitorexit
    //   55: iload_2
    //   56: ireturn
    //   57: aload_0
    //   58: getfield 37	com/tencent/mm/kernel/f:fZr	Ljava/util/Set;
    //   61: aload_1
    //   62: invokeinterface 139 2 0
    //   67: ifeq +16 -> 83
    //   70: ldc2_w 130
    //   73: ldc -124
    //   75: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: iconst_1
    //   79: istore_2
    //   80: goto -27 -> 53
    //   83: iconst_0
    //   84: istore_2
    //   85: ldc2_w 130
    //   88: ldc -124
    //   90: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: goto -40 -> 53
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	f
    //   0	101	1	paramT	T
    //   52	33	2	bool	boolean
    //   21	13	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	22	96	finally
    //   26	51	96	finally
    //   57	78	96	finally
    //   85	93	96	finally
  }
  
  /* Error */
  public final void p(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 143
    //   5: ldc -111
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: invokestatic 150	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   14: aload_2
    //   15: invokestatic 150	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokespecial 152	com/tencent/mm/kernel/f:at	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/f$a;
    //   23: astore_3
    //   24: aload_0
    //   25: aload_2
    //   26: invokespecial 152	com/tencent/mm/kernel/f:at	(Ljava/lang/Object;)Lcom/tencent/mm/kernel/f$a;
    //   29: astore_2
    //   30: aload_3
    //   31: aload_2
    //   32: if_acmpeq +70 -> 102
    //   35: aload_3
    //   36: getfield 82	com/tencent/mm/kernel/f$a:fZs	Ljava/util/ArrayList;
    //   39: ifnonnull +15 -> 54
    //   42: aload_3
    //   43: new 60	java/util/ArrayList
    //   46: dup
    //   47: iconst_2
    //   48: invokespecial 155	java/util/ArrayList:<init>	(I)V
    //   51: putfield 82	com/tencent/mm/kernel/f$a:fZs	Ljava/util/ArrayList;
    //   54: aload_3
    //   55: getfield 82	com/tencent/mm/kernel/f$a:fZs	Ljava/util/ArrayList;
    //   58: aload_2
    //   59: invokevirtual 90	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   62: pop
    //   63: aload_2
    //   64: getfield 93	com/tencent/mm/kernel/f$a:fZt	Ljava/util/ArrayList;
    //   67: ifnonnull +15 -> 82
    //   70: aload_2
    //   71: new 60	java/util/ArrayList
    //   74: dup
    //   75: iconst_2
    //   76: invokespecial 155	java/util/ArrayList:<init>	(I)V
    //   79: putfield 93	com/tencent/mm/kernel/f$a:fZt	Ljava/util/ArrayList;
    //   82: aload_2
    //   83: getfield 93	com/tencent/mm/kernel/f$a:fZt	Ljava/util/ArrayList;
    //   86: aload_3
    //   87: invokevirtual 90	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   90: pop
    //   91: ldc2_w 143
    //   94: ldc -111
    //   96: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: aload_0
    //   100: monitorexit
    //   101: return
    //   102: aload_0
    //   103: getfield 37	com/tencent/mm/kernel/f:fZr	Ljava/util/Set;
    //   106: aload_1
    //   107: invokeinterface 156 2 0
    //   112: pop
    //   113: ldc2_w 143
    //   116: ldc -111
    //   118: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: goto -22 -> 99
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	f
    //   0	129	1	paramT1	T
    //   0	129	2	paramT2	T
    //   23	64	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	30	124	finally
    //   35	54	124	finally
    //   54	82	124	finally
    //   82	99	124	finally
    //   102	121	124	finally
  }
  
  public final ArrayList<T> xs()
  {
    GMTrace.i(13532636643328L, 100826);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.fZq.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!((a)localEntry.getValue()).fZv) {
        localArrayList.add(localEntry.getKey());
      }
    }
    GMTrace.o(13532636643328L, 100826);
    return localArrayList;
  }
  
  public final ArrayList<T> xt()
  {
    GMTrace.i(13532905078784L, 100828);
    ArrayList localArrayList = new ArrayList();
    new HashMap(this.fZq);
    Object localObject1 = new ArrayList();
    Object localObject2 = this.fZq.entrySet().iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      if (((a)((Map.Entry)localObject3).getValue()).fZs == null)
      {
        ((a)((Map.Entry)localObject3).getValue()).fZv = true;
        ((ArrayList)localObject1).add(((Map.Entry)localObject3).getValue());
        localArrayList.add(((Map.Entry)localObject3).getKey());
        ((Map.Entry)localObject3).getKey();
      }
    }
    localObject2 = this.fZq;
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (a)((Iterator)localObject1).next();
      localObject3 = ((a)localObject2).fZt;
      localObject3 = ((a)localObject2).fZs;
      a(((a)localObject2).fZt, localArrayList);
    }
    GMTrace.o(13532905078784L, 100828);
    return localArrayList;
  }
  
  private static final class a<T>
  {
    public ArrayList<a> fZs;
    public ArrayList<a> fZt;
    T fZu;
    boolean fZv;
    
    public a(T paramT)
    {
      GMTrace.i(13506866839552L, 100634);
      this.fZv = false;
      this.fZu = paramT;
      GMTrace.o(13506866839552L, 100634);
    }
    
    public final String toString()
    {
      GMTrace.i(13507001057280L, 100635);
      String str = "Ref-" + this.fZu.toString();
      GMTrace.o(13507001057280L, 100635);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */