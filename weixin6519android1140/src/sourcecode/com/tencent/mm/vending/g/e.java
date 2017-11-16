package com.tencent.mm.vending.g;

import android.os.Looper;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.h.f.a;
import com.tencent.mm.vending.h.h;
import com.tencent.mm.vending.j.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import junit.framework.Assert;

public class e<_Var>
  implements c<_Var>
{
  public int mRetryCount;
  com.tencent.mm.vending.h.f xxC;
  private volatile boolean xxP;
  public volatile d xxQ;
  public boolean xxR;
  private Queue<a> xxS;
  private volatile com.tencent.mm.vending.h.d xxT;
  private volatile com.tencent.mm.vending.h.d xxU;
  public volatile Object xxV;
  public volatile boolean xxW;
  public volatile Object xxX;
  public a xxY;
  public a xxZ;
  private long xya;
  private boolean xyb;
  private b xyc;
  private com.tencent.mm.vending.h.d xyd;
  private f.a xye;
  public List<Pair<d.a, com.tencent.mm.vending.h.d>> xyf;
  private List<Pair<d.b, com.tencent.mm.vending.h.d>> xyg;
  private boolean xyh;
  public boolean xyi;
  public boolean xyj;
  private Object xyk;
  public Object xyl;
  
  public e()
  {
    GMTrace.i(284407365632L, 2119);
    this.xxP = false;
    this.xxQ = d.xyx;
    this.xxR = false;
    this.xxS = new LinkedList();
    this.mRetryCount = 0;
    this.xya = -1L;
    this.xyb = false;
    this.xyc = new b();
    this.xye = new f.a()
    {
      public final void bX(Object paramAnonymousObject)
      {
        GMTrace.i(281991446528L, 2101);
        ((Stack)f.cko().xyF.get()).pop();
        synchronized (e.this)
        {
          e.this.xxY = e.this.xxZ;
          e.this.xxZ = null;
          if (!e.this.xxR)
          {
            e.this.xxV = paramAnonymousObject;
            if (e.this.xxQ == e.d.xyB)
            {
              com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupted, just return", new Object[0]);
              GMTrace.o(281991446528L, 2101);
            }
          }
          else
          {
            com.tencent.mm.vending.f.a.i("Vending.Pipeline", "gonna retry, do not store functional result.", new Object[0]);
          }
        }
        if (e.this.xxQ == e.d.xyA)
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "pausing, just return.", new Object[0]);
          GMTrace.o(281991446528L, 2101);
          return;
        }
        e.this.xxQ = e.d.xyy;
        e.this.bW(e.this.bV(paramAnonymousObject));
        GMTrace.o(281991446528L, 2101);
      }
      
      public final void ckm()
      {
        GMTrace.i(281857228800L, 2100);
        f localf = f.cko();
        e locale = e.this;
        Stack localStack2 = (Stack)localf.xyF.get();
        Stack localStack1 = localStack2;
        if (localStack2 == null)
        {
          localStack1 = new Stack();
          localf.xyF.set(localStack1);
        }
        localStack1.push(locale);
        GMTrace.o(281857228800L, 2100);
      }
      
      public final void interrupt()
      {
        GMTrace.i(282125664256L, 2102);
        e.this.mO(true);
        GMTrace.o(282125664256L, 2102);
      }
    };
    this.xyh = false;
    this.xyi = false;
    this.xyj = false;
    this.xxU = com.tencent.mm.vending.h.g.ckr();
    this.xxT = this.xxU;
    this.xxC = new com.tencent.mm.vending.h.f(this.xxU, this.xye);
    GMTrace.o(284407365632L, 2119);
  }
  
  /* Error */
  private <_Ret> c<_Ret> a(com.tencent.mm.vending.c.a<_Ret, _Var> parama, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 140
    //   5: sipush 2130
    //   8: invokestatic 81	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: invokespecial 144	com/tencent/mm/vending/g/e:cki	()V
    //   15: aload_0
    //   16: getfield 95	com/tencent/mm/vending/g/e:xxS	Ljava/util/Queue;
    //   19: new 19	com/tencent/mm/vending/g/e$a
    //   22: dup
    //   23: aload_1
    //   24: aload_0
    //   25: getfield 127	com/tencent/mm/vending/g/e:xxT	Lcom/tencent/mm/vending/h/d;
    //   28: aload_0
    //   29: getfield 101	com/tencent/mm/vending/g/e:xya	J
    //   32: iload_2
    //   33: invokespecial 147	com/tencent/mm/vending/g/e$a:<init>	(Lcom/tencent/mm/vending/c/a;Lcom/tencent/mm/vending/h/d;JZ)V
    //   36: invokeinterface 153 2 0
    //   41: pop
    //   42: aload_0
    //   43: ldc2_w 98
    //   46: putfield 101	com/tencent/mm/vending/g/e:xya	J
    //   49: aload_0
    //   50: getfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   53: getstatic 86	com/tencent/mm/vending/g/e$d:xyx	Lcom/tencent/mm/vending/g/e$d;
    //   56: if_acmpne +16 -> 72
    //   59: ldc2_w 140
    //   62: sipush 2130
    //   65: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_0
    //   71: areturn
    //   72: aload_0
    //   73: getfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   76: getstatic 156	com/tencent/mm/vending/g/e$d:xyy	Lcom/tencent/mm/vending/g/e$d;
    //   79: if_acmpeq +15 -> 94
    //   82: ldc2_w 140
    //   85: sipush 2130
    //   88: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: goto -23 -> 68
    //   94: aload_0
    //   95: aload_0
    //   96: getfield 158	com/tencent/mm/vending/g/e:xxV	Ljava/lang/Object;
    //   99: invokevirtual 162	com/tencent/mm/vending/g/e:bW	(Ljava/lang/Object;)V
    //   102: ldc2_w 140
    //   105: sipush 2130
    //   108: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   111: goto -43 -> 68
    //   114: astore_1
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_1
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	e
    //   0	119	1	parama	com.tencent.mm.vending.c.a<_Ret, _Var>
    //   0	119	2	paramBoolean	boolean
    // Exception table:
    //   from	to	target	type
    //   2	68	114	finally
    //   72	91	114	finally
    //   94	111	114	finally
  }
  
  /* Error */
  private void a(d.a parama, com.tencent.mm.vending.h.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 166
    //   5: sipush 2135
    //   8: invokestatic 81	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: invokespecial 171	com/tencent/mm/vending/g/e:ckj	()Lcom/tencent/mm/vending/g/d;
    //   15: pop
    //   16: aload_0
    //   17: getfield 173	com/tencent/mm/vending/g/e:xyf	Ljava/util/List;
    //   20: ifnonnull +14 -> 34
    //   23: aload_0
    //   24: new 92	java/util/LinkedList
    //   27: dup
    //   28: invokespecial 93	java/util/LinkedList:<init>	()V
    //   31: putfield 173	com/tencent/mm/vending/g/e:xyf	Ljava/util/List;
    //   34: new 175	android/util/Pair
    //   37: dup
    //   38: aload_1
    //   39: aload_2
    //   40: invokespecial 178	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   43: astore_1
    //   44: aload_0
    //   45: getfield 115	com/tencent/mm/vending/g/e:xyi	Z
    //   48: ifeq +24 -> 72
    //   51: aload_0
    //   52: aload_1
    //   53: aload_0
    //   54: getfield 180	com/tencent/mm/vending/g/e:xyl	Ljava/lang/Object;
    //   57: invokevirtual 183	com/tencent/mm/vending/g/e:a	(Landroid/util/Pair;Ljava/lang/Object;)V
    //   60: ldc2_w 166
    //   63: sipush 2135
    //   66: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   69: aload_0
    //   70: monitorexit
    //   71: return
    //   72: aload_0
    //   73: getfield 173	com/tencent/mm/vending/g/e:xyf	Ljava/util/List;
    //   76: aload_1
    //   77: invokeinterface 186 2 0
    //   82: pop
    //   83: ldc2_w 166
    //   86: sipush 2135
    //   89: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   92: goto -23 -> 69
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	e
    //   0	100	1	parama	d.a
    //   0	100	2	paramd	com.tencent.mm.vending.h.d
    // Exception table:
    //   from	to	target	type
    //   2	34	95	finally
    //   34	69	95	finally
    //   72	92	95	finally
  }
  
  /* Error */
  private void a(d.b paramb, com.tencent.mm.vending.h.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 188
    //   5: sipush 2136
    //   8: invokestatic 81	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: invokespecial 171	com/tencent/mm/vending/g/e:ckj	()Lcom/tencent/mm/vending/g/d;
    //   15: pop
    //   16: aload_0
    //   17: aload_0
    //   18: getfield 158	com/tencent/mm/vending/g/e:xxV	Ljava/lang/Object;
    //   21: invokevirtual 162	com/tencent/mm/vending/g/e:bW	(Ljava/lang/Object;)V
    //   24: aload_0
    //   25: getfield 191	com/tencent/mm/vending/g/e:xyg	Ljava/util/List;
    //   28: ifnonnull +14 -> 42
    //   31: aload_0
    //   32: new 92	java/util/LinkedList
    //   35: dup
    //   36: invokespecial 93	java/util/LinkedList:<init>	()V
    //   39: putfield 191	com/tencent/mm/vending/g/e:xyg	Ljava/util/List;
    //   42: new 175	android/util/Pair
    //   45: dup
    //   46: aload_1
    //   47: aload_2
    //   48: invokespecial 178	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   51: astore_1
    //   52: aload_0
    //   53: getfield 113	com/tencent/mm/vending/g/e:xyh	Z
    //   56: ifeq +24 -> 80
    //   59: aload_0
    //   60: aload_1
    //   61: aload_0
    //   62: getfield 193	com/tencent/mm/vending/g/e:xyk	Ljava/lang/Object;
    //   65: invokespecial 195	com/tencent/mm/vending/g/e:b	(Landroid/util/Pair;Ljava/lang/Object;)V
    //   68: ldc2_w 188
    //   71: sipush 2136
    //   74: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: aload_0
    //   81: getfield 191	com/tencent/mm/vending/g/e:xyg	Ljava/util/List;
    //   84: aload_1
    //   85: invokeinterface 186 2 0
    //   90: pop
    //   91: ldc2_w 188
    //   94: sipush 2136
    //   97: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   100: goto -23 -> 77
    //   103: astore_1
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_1
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	e
    //   0	108	1	paramb	d.b
    //   0	108	2	paramd	com.tencent.mm.vending.h.d
    // Exception table:
    //   from	to	target	type
    //   2	42	103	finally
    //   42	77	103	finally
    //   80	100	103	finally
  }
  
  private void b(final Pair<d.b, com.tencent.mm.vending.h.d> paramPair, final Object paramObject)
  {
    try
    {
      GMTrace.i(286420631552L, 2134);
      final RuntimeException localRuntimeException = new RuntimeException("object is not right: " + paramObject);
      new com.tencent.mm.vending.h.f((com.tencent.mm.vending.h.d)paramPair.second, null).a(new com.tencent.mm.vending.c.a()
      {
        private Void ckn()
        {
          GMTrace.i(18925639172096L, 141007);
          try
          {
            ((d.b)paramPair.first).av(paramObject);
            Void localVoid = xxJ;
            GMTrace.o(18925639172096L, 141007);
            return localVoid;
          }
          catch (ClassCastException localClassCastException)
          {
            if (localRuntimeException.getCause() == null) {
              localRuntimeException.initCause(localClassCastException);
            }
            throw localRuntimeException;
          }
        }
      }, null, this.xyb);
      GMTrace.o(286420631552L, 2134);
      return;
    }
    finally
    {
      paramPair = finally;
      throw paramPair;
    }
  }
  
  private void cki()
  {
    try
    {
      GMTrace.i(286152196096L, 2132);
      if (this.xxP) {
        throw new c("This Pipeline(%s) has terminate and do not allow any next().", new Object[] { this });
      }
    }
    finally {}
    GMTrace.o(286152196096L, 2132);
  }
  
  private d<_Var> ckj()
  {
    try
    {
      GMTrace.i(286823284736L, 2137);
      this.xxP = true;
      GMTrace.o(286823284736L, 2137);
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public c<_Var> Xl(String paramString)
  {
    GMTrace.i(284541583360L, 2120);
    if (paramString == null)
    {
      Assert.assertNotNull("schedulerTypeString should not be null!", paramString);
      GMTrace.o(284541583360L, 2120);
      return this;
    }
    this.xxT = com.tencent.mm.vending.h.g.Xn(paramString);
    Assert.assertNotNull("mCurrentScheduler should not be null!", this.xxT);
    GMTrace.o(284541583360L, 2120);
    return this;
  }
  
  public <_Ret> c<_Ret> a(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    try
    {
      GMTrace.i(286017978368L, 2131);
      parama = a(parama, this.xyb);
      GMTrace.o(286017978368L, 2131);
      return parama;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public c<_Var> a(final c.a<_Var> parama)
  {
    try
    {
      GMTrace.i(285078454272L, 2124);
      u(new Object[0]);
      a(new com.tencent.mm.vending.c.a()
      {
        public final _Var call(_Var paramAnonymous_Var)
        {
          GMTrace.i(282394099712L, 2104);
          paramAnonymous_Var = parama.call();
          GMTrace.o(282394099712L, 2104);
          return paramAnonymous_Var;
        }
      }, true);
      GMTrace.o(285078454272L, 2124);
      return this;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public c<_Var> a(com.tencent.mm.vending.h.d paramd)
  {
    GMTrace.i(284675801088L, 2121);
    if (paramd == null)
    {
      Assert.assertNotNull("scheduler should not be null!", paramd);
      GMTrace.o(284675801088L, 2121);
      return this;
    }
    this.xxT = paramd;
    GMTrace.o(284675801088L, 2121);
    return this;
  }
  
  public final d<_Var> a(d.a parama)
  {
    try
    {
      GMTrace.i(286957502464L, 2138);
      a(parama, this.xxU);
      GMTrace.o(286957502464L, 2138);
      return this;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final d<_Var> a(d.b<_Var> paramb)
  {
    try
    {
      GMTrace.i(287091720192L, 2139);
      a(paramb, this.xxU);
      GMTrace.o(287091720192L, 2139);
      return this;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final d<_Var> a(com.tencent.mm.vending.h.d paramd, d.b<_Var> paramb)
  {
    try
    {
      GMTrace.i(287225937920L, 2140);
      a(paramb, paramd);
      GMTrace.o(287225937920L, 2140);
      return this;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public final void a(final Pair<d.a, com.tencent.mm.vending.h.d> paramPair, final Object paramObject)
  {
    try
    {
      GMTrace.i(286286413824L, 2133);
      com.tencent.mm.vending.h.d locald = (com.tencent.mm.vending.h.d)paramPair.second;
      paramPair = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(282662535168L, 2106);
          ((d.a)paramPair.first).aH(paramObject);
          GMTrace.o(282662535168L, 2106);
        }
      };
      if (locald == null) {
        com.tencent.mm.vending.f.a.e("Vending.Pipeline", "Default scheduler %s is not available!!!", new Object[] { this.xxU });
      }
      locald.D(paramPair);
      GMTrace.o(286286413824L, 2133);
      return;
    }
    finally {}
  }
  
  public <_Ret> c<_Ret> b(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    GMTrace.i(285749542912L, 2129);
    parama = Xl("Vending.LOGIC").a(parama);
    GMTrace.o(285749542912L, 2129);
    return parama;
  }
  
  public c<_Var> b(com.tencent.mm.vending.e.b paramb)
  {
    GMTrace.i(284810018816L, 2122);
    Assert.assertNotNull("keeper should not be null!", paramb);
    paramb.a(this);
    GMTrace.o(284810018816L, 2122);
    return this;
  }
  
  public final Object bV(Object paramObject)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(287494373376L, 2142);
        if (this.xxR)
        {
          this.mRetryCount += 1;
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "Functional %s, gonna retry %s.", new Object[] { this.xxY.xyv.toString(), Integer.valueOf(this.mRetryCount) });
          ((LinkedList)this.xxS).add(0, this.xxY);
          this.xxR = false;
          paramObject = this.xxV;
          GMTrace.o(287494373376L, 2142);
          return paramObject;
        }
        if (this.xxW)
        {
          this.xxV = this.xxX;
          this.xxX = null;
          this.xxW = false;
          this.mRetryCount = 0;
        }
        else
        {
          this.xxV = paramObject;
        }
      }
      finally {}
    }
  }
  
  public final void bW(final Object paramObject)
  {
    label146:
    label153:
    label165:
    final com.tencent.mm.vending.c.a locala1;
    long l;
    final boolean bool;
    for (;;)
    {
      a locala;
      try
      {
        GMTrace.i(287628591104L, 2143);
        if (this.xxQ != d.xyy)
        {
          GMTrace.o(287628591104L, 2143);
          return;
        }
        this.xxQ = d.xyz;
        locala = (a)this.xxS.peek();
        if (locala != null) {
          break label165;
        }
        if (!this.xxP) {
          break label146;
        }
        this.xxQ = d.xyC;
        this.xyh = true;
        this.xyk = paramObject;
        if (this.xyg == null) {
          break label153;
        }
        paramObject = this.xyg.iterator();
        if (((Iterator)paramObject).hasNext())
        {
          b((Pair)((Iterator)paramObject).next(), this.xyk);
          continue;
        }
        GMTrace.o(287628591104L, 2143);
      }
      finally {}
      continue;
      this.xxQ = d.xyy;
      GMTrace.o(287628591104L, 2143);
      continue;
      locala1 = locala.xyv;
      com.tencent.mm.vending.h.d locald = locala.esx;
      l = locala.mInterval;
      bool = locala.xyw;
      if (this.xxQ == d.xyA)
      {
        com.tencent.mm.vending.f.a.i("Vending.Pipeline", "This pipeline is Pausing. We will stop dequeFunctionAndInvoke and waiting resume() call", new Object[0]);
        GMTrace.o(287628591104L, 2143);
      }
      else
      {
        this.xxZ = ((a)this.xxS.poll());
        this.xxC.b(locald);
        if (l >= 0L) {
          break;
        }
        this.xxC.a(locala1, paramObject, bool);
        GMTrace.o(287628591104L, 2143);
      }
    }
    if (Looper.myLooper() == null) {}
    for (this.xyd = new com.tencent.mm.vending.h.c();; this.xyd = new h(Looper.myLooper(), Looper.myLooper().toString()))
    {
      this.xyd.g(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(283199406080L, 2110);
          e.this.xxC.a(locala1, paramObject, bool);
          GMTrace.o(283199406080L, 2110);
        }
      }, l);
      GMTrace.o(287628591104L, 2143);
      break;
    }
  }
  
  public <_Ret> c<_Ret> c(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    GMTrace.i(17854447484928L, 133026);
    parama = Xl("Vending.HEAVY_WORK").a(parama);
    GMTrace.o(17854447484928L, 133026);
    return parama;
  }
  
  public final b ckh()
  {
    GMTrace.i(285481107456L, 2127);
    b localb = this.xyc;
    GMTrace.o(285481107456L, 2127);
    return localb;
  }
  
  public final boolean ckk()
  {
    GMTrace.i(18926176043008L, 141011);
    if (this.xxZ != null)
    {
      GMTrace.o(18926176043008L, 141011);
      return true;
    }
    GMTrace.o(18926176043008L, 141011);
    return false;
  }
  
  public final boolean ckl()
  {
    GMTrace.i(18926310260736L, 141012);
    if (this.xyc == g.ckh())
    {
      GMTrace.o(18926310260736L, 141012);
      return true;
    }
    GMTrace.o(18926310260736L, 141012);
    return false;
  }
  
  public <_Ret> c<_Ret> d(com.tencent.mm.vending.c.a<_Ret, _Var> parama)
  {
    GMTrace.i(285615325184L, 2128);
    parama = Xl("Vending.UI").a(parama);
    GMTrace.o(285615325184L, 2128);
    return parama;
  }
  
  public void dead()
  {
    GMTrace.i(285346889728L, 2126);
    mO(true);
    GMTrace.o(285346889728L, 2126);
  }
  
  public c<_Var> fo(long paramLong)
  {
    try
    {
      GMTrace.i(19013686001664L, 141663);
      this.xya = paramLong;
      GMTrace.o(19013686001664L, 141663);
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public c<_Var> mN(boolean paramBoolean)
  {
    GMTrace.i(284944236544L, 2123);
    this.xyb = paramBoolean;
    GMTrace.o(284944236544L, 2123);
    return this;
  }
  
  /* Error */
  public final void mO(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 477
    //   5: sipush 2141
    //   8: invokestatic 81	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   15: getstatic 481	com/tencent/mm/vending/g/e$d:xyB	Lcom/tencent/mm/vending/g/e$d;
    //   18: if_acmpeq +13 -> 31
    //   21: aload_0
    //   22: getfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   25: getstatic 374	com/tencent/mm/vending/g/e$d:xyC	Lcom/tencent/mm/vending/g/e$d;
    //   28: if_acmpne +15 -> 43
    //   31: ldc2_w 477
    //   34: sipush 2141
    //   37: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: iload_1
    //   44: ifeq +43 -> 87
    //   47: aload_0
    //   48: getfield 95	com/tencent/mm/vending/g/e:xxS	Ljava/util/Queue;
    //   51: invokeinterface 485 1 0
    //   56: ifle +31 -> 87
    //   59: ldc_w 302
    //   62: ldc_w 487
    //   65: iconst_1
    //   66: anewarray 5	java/lang/Object
    //   69: dup
    //   70: iconst_0
    //   71: aload_0
    //   72: getfield 95	com/tencent/mm/vending/g/e:xxS	Ljava/util/Queue;
    //   75: invokeinterface 485 1 0
    //   80: invokestatic 353	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: aastore
    //   84: invokestatic 490	com/tencent/mm/vending/f/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_0
    //   88: getstatic 481	com/tencent/mm/vending/g/e$d:xyB	Lcom/tencent/mm/vending/g/e$d;
    //   91: putfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   94: aload_0
    //   95: getfield 95	com/tencent/mm/vending/g/e:xxS	Ljava/util/Queue;
    //   98: invokeinterface 493 1 0
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield 158	com/tencent/mm/vending/g/e:xxV	Ljava/lang/Object;
    //   108: aload_0
    //   109: getfield 420	com/tencent/mm/vending/g/e:xyd	Lcom/tencent/mm/vending/h/d;
    //   112: ifnull +10 -> 122
    //   115: aload_0
    //   116: getfield 420	com/tencent/mm/vending/g/e:xyd	Lcom/tencent/mm/vending/h/d;
    //   119: invokevirtual 496	com/tencent/mm/vending/h/d:cancel	()V
    //   122: ldc2_w 477
    //   125: sipush 2141
    //   128: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: goto -91 -> 40
    //   134: astore_2
    //   135: aload_0
    //   136: monitorexit
    //   137: aload_2
    //   138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	e
    //   0	139	1	paramBoolean	boolean
    //   134	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	134	finally
    //   31	40	134	finally
    //   47	87	134	finally
    //   87	122	134	finally
    //   122	131	134	finally
  }
  
  /* Error */
  public c<_Var> u(Object... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 497
    //   5: sipush 2125
    //   8: invokestatic 81	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   15: getstatic 86	com/tencent/mm/vending/g/e$d:xyx	Lcom/tencent/mm/vending/g/e$d;
    //   18: if_acmpeq +16 -> 34
    //   21: ldc2_w 497
    //   24: sipush 2125
    //   27: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: aload_0
    //   35: getstatic 156	com/tencent/mm/vending/g/e$d:xyy	Lcom/tencent/mm/vending/g/e$d;
    //   38: putfield 88	com/tencent/mm/vending/g/e:xxQ	Lcom/tencent/mm/vending/g/e$d;
    //   41: aload_1
    //   42: arraylength
    //   43: ifne +30 -> 73
    //   46: aconst_null
    //   47: astore_1
    //   48: aload_0
    //   49: aload_1
    //   50: putfield 158	com/tencent/mm/vending/g/e:xxV	Ljava/lang/Object;
    //   53: aload_0
    //   54: aload_0
    //   55: getfield 158	com/tencent/mm/vending/g/e:xxV	Ljava/lang/Object;
    //   58: invokevirtual 162	com/tencent/mm/vending/g/e:bW	(Ljava/lang/Object;)V
    //   61: ldc2_w 497
    //   64: sipush 2125
    //   67: invokestatic 137	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   70: goto -40 -> 30
    //   73: aload_1
    //   74: arraylength
    //   75: iconst_1
    //   76: if_icmpne +10 -> 86
    //   79: aload_1
    //   80: iconst_0
    //   81: aaload
    //   82: astore_1
    //   83: goto -35 -> 48
    //   86: aload_1
    //   87: invokestatic 504	com/tencent/mm/vending/j/k:v	([Ljava/lang/Object;)Lcom/tencent/mm/vending/j/k;
    //   90: astore_1
    //   91: goto -43 -> 48
    //   94: astore_1
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_1
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	e
    //   0	99	1	paramVarArgs	Object[]
    // Exception table:
    //   from	to	target	type
    //   2	30	94	finally
    //   34	46	94	finally
    //   48	70	94	finally
    //   73	79	94	finally
    //   86	91	94	finally
  }
  
  private static final class a
  {
    public com.tencent.mm.vending.h.d esx;
    public long mInterval;
    public com.tencent.mm.vending.c.a xyv;
    public boolean xyw;
    
    public a(com.tencent.mm.vending.c.a parama, com.tencent.mm.vending.h.d paramd, long paramLong, boolean paramBoolean)
    {
      GMTrace.i(283333623808L, 2111);
      this.xyv = parama;
      this.esx = paramd;
      this.mInterval = paramLong;
      this.xyw = paramBoolean;
      GMTrace.o(283333623808L, 2111);
    }
  }
  
  final class b
    implements b
  {
    b()
    {
      GMTrace.i(283467841536L, 2112);
      GMTrace.o(283467841536L, 2112);
    }
    
    public final void bU(Object paramObject)
    {
      GMTrace.i(283602059264L, 2113);
      synchronized (e.this)
      {
        if (e.this.xxQ == e.d.xyB)
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupted, skip this interrupt.", new Object[0]);
          GMTrace.o(283602059264L, 2113);
          return;
        }
        if ((!e.this.ckk()) && (e.this.xxQ != e.d.xyA))
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupt not in func scope or pending, skip this retryOrInterrupt.", new Object[0]);
          GMTrace.o(283602059264L, 2113);
          return;
        }
        com.tencent.mm.vending.f.a.i("Vending.Pipeline", "interrupt Pipeline(%s)", new Object[] { e.this });
        e.this.mO(false);
        e.this.xyi = true;
        e.this.xyl = paramObject;
        if (e.this.xyf != null)
        {
          Iterator localIterator = e.this.xyf.iterator();
          if (localIterator.hasNext())
          {
            Pair localPair = (Pair)localIterator.next();
            e.this.a(localPair, paramObject);
          }
        }
      }
      GMTrace.o(283602059264L, 2113);
    }
    
    public final void ckg()
    {
      GMTrace.i(283736276992L, 2114);
      for (;;)
      {
        synchronized (e.this)
        {
          synchronized (e.this)
          {
            if ((e.this.xxQ == e.d.xyB) || (e.this.xxQ == e.d.xyx))
            {
              com.tencent.mm.vending.f.a.w("Vending.Pipeline", "current is state(%s), ignore pause.", new Object[] { e.this.xxQ });
              GMTrace.o(283736276992L, 2114);
              return;
            }
            if (!e.this.ckk()) {
              com.tencent.mm.vending.f.a.e("Vending.Pipeline", "you are using mario().pause() out of a functional scope on %s!", new Object[] { e.this });
            }
          }
        }
        if (!e.this.ckl()) {
          com.tencent.mm.vending.f.a.e("Vending.Pipeline", "you are using mario().pause() out of calling thread on %s!", new Object[] { e.this });
        } else {
          e.this.xxQ = e.d.xyA;
        }
      }
    }
    
    public final void resume()
    {
      GMTrace.i(284004712448L, 2116);
      synchronized (e.this)
      {
        if (e.this.xxQ != e.d.xyA)
        {
          com.tencent.mm.vending.f.a.e("Vending.Pipeline", "this Pipeline(%s) is not pausing! why call resume?", new Object[] { e.this });
          GMTrace.o(284004712448L, 2116);
          return;
        }
        if (!e.this.ckk())
        {
          e.this.xxQ = e.d.xyy;
          if (!e.this.ckl()) {
            e.this.bW(e.this.bV(e.this.xxV));
          }
          GMTrace.o(284004712448L, 2116);
          return;
        }
        e.this.xxQ = e.d.xyz;
      }
    }
    
    public final void t(Object... paramVarArgs)
    {
      GMTrace.i(283870494720L, 2115);
      synchronized (e.this)
      {
        if (e.this.xxQ != e.d.xyA)
        {
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "state is not pausing %s, skip this wormhole", new Object[] { e.this.xxQ });
          GMTrace.o(283870494720L, 2115);
          return;
        }
        e locale2 = e.this;
        if (paramVarArgs.length == 0) {}
        for (paramVarArgs = null;; paramVarArgs = paramVarArgs[0])
        {
          locale2.xxX = paramVarArgs;
          e.this.xxW = true;
          com.tencent.mm.vending.f.a.i("Vending.Pipeline", "pipline(%s) wormhole().", new Object[] { e.this });
          resume();
          GMTrace.o(283870494720L, 2115);
          return;
          if (paramVarArgs.length != 1) {
            break;
          }
        }
        paramVarArgs = k.v(paramVarArgs);
      }
    }
  }
  
  public static final class c
    extends Error
  {
    public c(String paramString, Object... paramVarArgs)
    {
      super();
      GMTrace.i(284138930176L, 2117);
      GMTrace.o(284138930176L, 2117);
    }
  }
  
  private static enum d
  {
    static
    {
      GMTrace.i(284273147904L, 2118);
      xyx = new d("Idle", 0);
      xyy = new d("Resolved", 1);
      xyz = new d("Invoking", 2);
      xyA = new d("Pausing", 3);
      xyB = new d("Interrupted", 4);
      xyC = new d("AllDone", 5);
      xyD = new d[] { xyx, xyy, xyz, xyA, xyB, xyC };
      GMTrace.o(284273147904L, 2118);
    }
    
    private d()
    {
      GMTrace.i(18926041825280L, 141010);
      GMTrace.o(18926041825280L, 141010);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\vending\g\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */