package com.tencent.c.e.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import com.tencent.c.e.a.a.f;
import com.tencent.c.e.a.a.g;
import com.tencent.c.e.a.a.g.a;
import com.tencent.c.e.a.a.h;
import com.tencent.c.e.a.a.h.a;
import com.tencent.c.e.a.a.k;
import com.tencent.c.f.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e
{
  private static final j<e> xRM = new j() {};
  public final Handler mHandler;
  public boolean mRunning = false;
  public g xRN;
  public final List<k> xRO = new ArrayList();
  public d xRP;
  public b xRQ;
  public com.tencent.c.e.a.a.d xRR;
  private final Runnable xRS = new com.tencent.c.e.a.a.c()
  {
    public final void cnA()
    {
      synchronized (e.this)
      {
        if (!e.this.mRunning) {
          return;
        }
        if (e.this.xRN == null) {
          return;
        }
      }
      if (e.this.xRN.fq(e.this.xRP.xRL))
      {
        long l = e.this.xRN.xSk.cue();
        e.a locala = e.this.xRT;
        int i = (int)(e.this.xRP.xRL / f.xSd);
        locala.mCount = 1;
        locala.mMaxCount = i;
        locala.xSa = l;
        l = l + f.xSd - System.currentTimeMillis();
        if (l <= 0L) {
          break label164;
        }
        e.this.mHandler.postDelayed(e.this.xRT, l);
      }
      for (;;)
      {
        return;
        label164:
        e.this.mHandler.post(e.this.xRT);
      }
    }
    
    public final void cnB()
    {
      if (e.this.xRR != null) {
        com.tencent.c.e.a.a.d locald = e.this.xRR;
      }
    }
  };
  public final a xRT = new a();
  
  public e()
  {
    HandlerThread localHandlerThread = new HandlerThread("TuringMMCore");
    localHandlerThread.start();
    this.mHandler = new Handler(localHandlerThread.getLooper());
  }
  
  public static boolean a(a parama, com.tencent.c.e.a.b.a parama1)
  {
    if (parama1.requestType == 0)
    {
      parama = parama.cnx();
      if ((parama == null) || (parama.errorCode != 0)) {}
    }
    else
    {
      do
      {
        return true;
        parama = parama.cny();
      } while ((parama != null) && (parama.errCode == 0));
    }
    return false;
  }
  
  public static boolean a(c paramc, com.tencent.c.e.a.b.a parama)
  {
    if (parama.requestType == 0)
    {
      if (paramc.a("userIdentify", "reportWup", parama).errorCode != 0) {}
    }
    else {
      while (paramc.b("sensorReport", "sensorInsightReportWup", parama).errCode == 0) {
        return true;
      }
    }
    return false;
  }
  
  public static e cnz()
  {
    return (e)xRM.get();
  }
  
  public final void a(Context paramContext, final String paramString, final com.tencent.c.e.a.a.e parame)
  {
    try
    {
      h localh = h.cnE();
      if (!localh.mInit) {
        localh.init(paramContext);
      }
      this.mHandler.post(new com.tencent.c.e.a.a.c()
      {
        public final void cnA()
        {
          Object localObject1 = h.cnE().cnF();
          HashMap localHashMap = new HashMap();
          Object localObject2;
          if (((Map)localObject1).size() != 0)
          {
            localObject2 = h.b((Map)localObject1, 0);
            if (localObject2 != null) {
              localHashMap.put(((h.a)localObject2).xSp, ((h.a)localObject2).xSq);
            }
            localObject2 = h.b((Map)localObject1, 1);
            if (localObject2 != null) {
              localHashMap.put(((h.a)localObject2).xSp, ((h.a)localObject2).xSq);
            }
            localObject1 = h.b((Map)localObject1, 2);
            if (localObject1 != null) {
              localHashMap.put(((h.a)localObject1).xSp, ((h.a)localObject1).xSq);
            }
          }
          if (localHashMap.size() == 0)
          {
            parame.Rv();
            return;
          }
          localObject1 = localHashMap.keySet().iterator();
          label292:
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (com.tencent.c.e.a.b.a)((Iterator)localObject1).next();
            ((com.tencent.c.e.a.b.a)localObject2).xSx = System.currentTimeMillis();
            ((com.tencent.c.e.a.b.a)localObject2).xSy = paramString;
            boolean bool;
            if ((parame instanceof a)) {
              bool = e.a((a)parame, (com.tencent.c.e.a.b.a)localObject2);
            }
            for (;;)
            {
              if (!bool) {
                break label292;
              }
              localObject2 = ((List)localHashMap.get(localObject2)).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                String str = (String)((Iterator)localObject2).next();
                try
                {
                  new File(str).delete();
                }
                catch (Throwable localThrowable) {}
              }
              break;
              if ((parame instanceof c)) {
                bool = e.a((c)parame, (com.tencent.c.e.a.b.a)localObject2);
              } else {
                bool = false;
              }
            }
          }
        }
        
        public final void cnB()
        {
          if (e.this.xRR != null) {
            com.tencent.c.e.a.a.d locald = e.this.xRR;
          }
        }
      });
      return;
    }
    finally {}
  }
  
  /* Error */
  public final boolean a(d paramd)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_1
    //   5: getfield 163	com/tencent/c/e/a/d:context	Landroid/content/Context;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull +9 -> 19
    //   13: iconst_0
    //   14: istore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_2
    //   18: ireturn
    //   19: invokestatic 142	com/tencent/c/e/a/a/h:cnE	()Lcom/tencent/c/e/a/a/h;
    //   22: astore 4
    //   24: aload 4
    //   26: getfield 145	com/tencent/c/e/a/a/h:mInit	Z
    //   29: ifne +9 -> 38
    //   32: aload 4
    //   34: aload_3
    //   35: invokevirtual 149	com/tencent/c/e/a/a/h:init	(Landroid/content/Context;)V
    //   38: aload_0
    //   39: getfield 48	com/tencent/c/e/a/e:mRunning	Z
    //   42: ifeq +8 -> 50
    //   45: aload_0
    //   46: invokevirtual 167	com/tencent/c/e/a/e:qt	()Z
    //   49: pop
    //   50: aload_0
    //   51: aload_1
    //   52: putfield 169	com/tencent/c/e/a/e:xRP	Lcom/tencent/c/e/a/d;
    //   55: aload_0
    //   56: iconst_1
    //   57: putfield 48	com/tencent/c/e/a/e:mRunning	Z
    //   60: aload_0
    //   61: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   64: ifnonnull +15 -> 79
    //   67: aload_0
    //   68: new 173	com/tencent/c/e/a/a/g
    //   71: dup
    //   72: aload_3
    //   73: invokespecial 175	com/tencent/c/e/a/a/g:<init>	(Landroid/content/Context;)V
    //   76: putfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   79: aload_0
    //   80: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   83: ifnull +27 -> 110
    //   86: aload_0
    //   87: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   90: astore 4
    //   92: aload 4
    //   94: getfield 179	com/tencent/c/e/a/a/g:xSi	Landroid/util/SparseArray;
    //   97: astore_3
    //   98: aload_3
    //   99: monitorenter
    //   100: aload 4
    //   102: getfield 179	com/tencent/c/e/a/a/g:xSi	Landroid/util/SparseArray;
    //   105: invokevirtual 184	android/util/SparseArray:clear	()V
    //   108: aload_3
    //   109: monitorexit
    //   110: aload_0
    //   111: getfield 53	com/tencent/c/e/a/e:xRO	Ljava/util/List;
    //   114: astore_3
    //   115: aload_3
    //   116: monitorenter
    //   117: aload_0
    //   118: getfield 53	com/tencent/c/e/a/e:xRO	Ljava/util/List;
    //   121: invokeinterface 187 1 0
    //   126: aload_3
    //   127: monitorexit
    //   128: aload_0
    //   129: getfield 82	com/tencent/c/e/a/e:mHandler	Landroid/os/Handler;
    //   132: aload_0
    //   133: getfield 58	com/tencent/c/e/a/e:xRS	Ljava/lang/Runnable;
    //   136: aload_1
    //   137: getfield 191	com/tencent/c/e/a/d:viR	J
    //   140: invokevirtual 195	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   143: pop
    //   144: goto -129 -> 15
    //   147: astore_1
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_1
    //   151: athrow
    //   152: astore_1
    //   153: aload_3
    //   154: monitorexit
    //   155: aload_1
    //   156: athrow
    //   157: astore_1
    //   158: aload_3
    //   159: monitorexit
    //   160: aload_1
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	e
    //   0	162	1	paramd	d
    //   1	17	2	bool	boolean
    //   22	79	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	147	finally
    //   19	38	147	finally
    //   38	50	147	finally
    //   50	79	147	finally
    //   79	100	147	finally
    //   110	117	147	finally
    //   128	144	147	finally
    //   155	157	147	finally
    //   160	162	147	finally
    //   100	110	152	finally
    //   153	155	152	finally
    //   117	128	157	finally
    //   158	160	157	finally
  }
  
  /* Error */
  public final boolean qt()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 48	com/tencent/c/e/a/e:mRunning	Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifne +11 -> 24
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_0
    //   20: monitorexit
    //   21: iload 4
    //   23: ireturn
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield 48	com/tencent/c/e/a/e:mRunning	Z
    //   29: iload 5
    //   31: istore 4
    //   33: aload_0
    //   34: getfield 169	com/tencent/c/e/a/e:xRP	Lcom/tencent/c/e/a/d;
    //   37: ifnull -18 -> 19
    //   40: aload_0
    //   41: getfield 82	com/tencent/c/e/a/e:mHandler	Landroid/os/Handler;
    //   44: aload_0
    //   45: getfield 58	com/tencent/c/e/a/e:xRS	Ljava/lang/Runnable;
    //   48: invokevirtual 199	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   51: aload_0
    //   52: getfield 82	com/tencent/c/e/a/e:mHandler	Landroid/os/Handler;
    //   55: aload_0
    //   56: getfield 61	com/tencent/c/e/a/e:xRT	Lcom/tencent/c/e/a/e$a;
    //   59: invokevirtual 199	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   62: aload_0
    //   63: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   66: ifnull +147 -> 213
    //   69: aload_0
    //   70: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   73: invokevirtual 202	com/tencent/c/e/a/a/g:cnC	()V
    //   76: iload 5
    //   78: istore 4
    //   80: aload_0
    //   81: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   84: getfield 206	com/tencent/c/e/a/a/g:xSk	Lcom/tencent/c/e/a/a/g$a;
    //   87: invokevirtual 212	com/tencent/c/e/a/a/g$a:cuf	()J
    //   90: getstatic 217	com/tencent/c/e/a/a/f:xSd	J
    //   93: ldiv
    //   94: l2i
    //   95: iconst_3
    //   96: if_icmplt -77 -> 19
    //   99: aload_0
    //   100: getfield 171	com/tencent/c/e/a/e:xRN	Lcom/tencent/c/e/a/a/g;
    //   103: invokevirtual 221	com/tencent/c/e/a/a/g:cnD	()Landroid/util/SparseArray;
    //   106: astore 7
    //   108: iload 5
    //   110: istore 4
    //   112: aload 7
    //   114: invokevirtual 225	android/util/SparseArray:size	()I
    //   117: ifeq -98 -> 19
    //   120: aload_0
    //   121: getfield 53	com/tencent/c/e/a/e:xRO	Ljava/util/List;
    //   124: astore 6
    //   126: aload 6
    //   128: monitorenter
    //   129: new 50	java/util/ArrayList
    //   132: dup
    //   133: aload_0
    //   134: getfield 53	com/tencent/c/e/a/e:xRO	Ljava/util/List;
    //   137: invokespecial 228	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   140: astore 8
    //   142: aload 6
    //   144: monitorexit
    //   145: iload 5
    //   147: istore 4
    //   149: aload 8
    //   151: invokeinterface 229 1 0
    //   156: iconst_3
    //   157: if_icmplt -138 -> 19
    //   160: aload_0
    //   161: getfield 169	com/tencent/c/e/a/e:xRP	Lcom/tencent/c/e/a/d;
    //   164: getfield 232	com/tencent/c/e/a/d:xRK	I
    //   167: istore_1
    //   168: aload_0
    //   169: getfield 169	com/tencent/c/e/a/e:xRP	Lcom/tencent/c/e/a/d;
    //   172: getfield 235	com/tencent/c/e/a/d:action	I
    //   175: istore_2
    //   176: aload_0
    //   177: getfield 169	com/tencent/c/e/a/e:xRP	Lcom/tencent/c/e/a/d;
    //   180: getfield 236	com/tencent/c/e/a/d:requestType	I
    //   183: istore_3
    //   184: aload_0
    //   185: getfield 82	com/tencent/c/e/a/e:mHandler	Landroid/os/Handler;
    //   188: new 10	com/tencent/c/e/a/e$3
    //   191: dup
    //   192: aload_0
    //   193: iload_1
    //   194: iload_2
    //   195: iload_3
    //   196: aload 7
    //   198: aload 8
    //   200: invokespecial 239	com/tencent/c/e/a/e$3:<init>	(Lcom/tencent/c/e/a/e;IIILandroid/util/SparseArray;Ljava/util/List;)V
    //   203: invokevirtual 156	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   206: pop
    //   207: iconst_1
    //   208: istore 4
    //   210: goto -191 -> 19
    //   213: iconst_1
    //   214: istore 4
    //   216: goto -197 -> 19
    //   219: astore 7
    //   221: aload 6
    //   223: monitorexit
    //   224: aload 7
    //   226: athrow
    //   227: astore 6
    //   229: aload_0
    //   230: monitorexit
    //   231: aload 6
    //   233: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	e
    //   167	27	1	i	int
    //   175	20	2	j	int
    //   183	13	3	k	int
    //   9	206	4	bool1	boolean
    //   1	145	5	bool2	boolean
    //   227	5	6	localObject1	Object
    //   106	91	7	localSparseArray	SparseArray
    //   219	6	7	localObject2	Object
    //   140	59	8	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   129	145	219	finally
    //   221	224	219	finally
    //   5	11	227	finally
    //   24	29	227	finally
    //   33	76	227	finally
    //   80	108	227	finally
    //   112	129	227	finally
    //   149	207	227	finally
    //   224	227	227	finally
  }
  
  private final class a
    extends com.tencent.c.e.a.a.c
  {
    int mCount = 1;
    int mMaxCount = 3;
    long xSa = 0L;
    
    public a() {}
    
    /* Error */
    public final void cnA()
    {
      // Byte code:
      //   0: new 33	com/tencent/c/e/a/a/k
      //   3: dup
      //   4: invokespecial 34	com/tencent/c/e/a/a/k:<init>	()V
      //   7: astore 7
      //   9: aload_0
      //   10: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   13: astore 8
      //   15: aload 8
      //   17: monitorenter
      //   18: aload_0
      //   19: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   22: getfield 38	com/tencent/c/e/a/e:xRP	Lcom/tencent/c/e/a/d;
      //   25: getfield 44	com/tencent/c/e/a/d:context	Landroid/content/Context;
      //   28: astore 9
      //   30: getstatic 49	android/os/Build$VERSION:SDK_INT	I
      //   33: bipush 20
      //   35: if_icmplt +369 -> 404
      //   38: ldc 51
      //   40: invokestatic 57	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
      //   43: astore 10
      //   45: aload 9
      //   47: invokevirtual 63	java/lang/Object:getClass	()Ljava/lang/Class;
      //   50: ldc 65
      //   52: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   55: astore 11
      //   57: aload 11
      //   59: iconst_1
      //   60: invokevirtual 75	java/lang/reflect/Field:setAccessible	(Z)V
      //   63: aload 9
      //   65: aload 11
      //   67: aload 9
      //   69: invokevirtual 79	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
      //   72: checkcast 81	java/lang/String
      //   75: invokevirtual 87	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
      //   78: astore 11
      //   80: aload 11
      //   82: ifnonnull +170 -> 252
      //   85: iconst_0
      //   86: istore_1
      //   87: aload 7
      //   89: iload_1
      //   90: putfield 90	com/tencent/c/e/a/a/k:xSt	I
      //   93: new 92	java/io/File
      //   96: dup
      //   97: ldc 94
      //   99: invokespecial 97	java/io/File:<init>	(Ljava/lang/String;)V
      //   102: invokestatic 102	com/tencent/c/f/f:J	(Ljava/io/File;)Ljava/lang/String;
      //   105: astore 10
      //   107: aload 10
      //   109: invokestatic 108	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
      //   112: ifne +19 -> 131
      //   115: ldc 110
      //   117: aload 10
      //   119: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   122: ifeq +328 -> 450
      //   125: aload 7
      //   127: iconst_1
      //   128: putfield 117	com/tencent/c/e/a/a/k:xSv	I
      //   131: aload 9
      //   133: aconst_null
      //   134: new 119	android/content/IntentFilter
      //   137: dup
      //   138: ldc 121
      //   140: invokespecial 122	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
      //   143: invokevirtual 126	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      //   146: astore 9
      //   148: aload 9
      //   150: ifnull +35 -> 185
      //   153: aload 9
      //   155: ldc -128
      //   157: iconst_m1
      //   158: invokevirtual 134	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
      //   161: istore_1
      //   162: iload_1
      //   163: iconst_2
      //   164: if_icmpeq +486 -> 650
      //   167: iload_1
      //   168: iconst_5
      //   169: if_icmpne +507 -> 676
      //   172: goto +478 -> 650
      //   175: iload_1
      //   176: ifne +320 -> 496
      //   179: aload 7
      //   181: iconst_1
      //   182: putfield 137	com/tencent/c/e/a/a/k:xSw	I
      //   185: aload 8
      //   187: monitorexit
      //   188: aload_0
      //   189: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   192: getfield 141	com/tencent/c/e/a/e:xRO	Ljava/util/List;
      //   195: astore 8
      //   197: aload 8
      //   199: monitorenter
      //   200: aload_0
      //   201: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   204: getfield 141	com/tencent/c/e/a/e:xRO	Ljava/util/List;
      //   207: aload 7
      //   209: invokeinterface 146 2 0
      //   214: pop
      //   215: aload 8
      //   217: monitorexit
      //   218: aload_0
      //   219: getfield 23	com/tencent/c/e/a/e$a:mCount	I
      //   222: aload_0
      //   223: getfield 25	com/tencent/c/e/a/e$a:mMaxCount	I
      //   226: if_icmplt +344 -> 570
      //   229: aload_0
      //   230: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   233: astore 7
      //   235: aload 7
      //   237: monitorenter
      //   238: aload_0
      //   239: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   242: getfield 150	com/tencent/c/e/a/e:mRunning	Z
      //   245: ifne +305 -> 550
      //   248: aload 7
      //   250: monitorexit
      //   251: return
      //   252: aload 10
      //   254: ldc -104
      //   256: iconst_0
      //   257: anewarray 53	java/lang/Class
      //   260: invokevirtual 156	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   263: astore 10
      //   265: aload 10
      //   267: ifnonnull +8 -> 275
      //   270: iconst_0
      //   271: istore_1
      //   272: goto -185 -> 87
      //   275: aload 10
      //   277: iconst_1
      //   278: invokevirtual 159	java/lang/reflect/Method:setAccessible	(Z)V
      //   281: aload 10
      //   283: aload 11
      //   285: iconst_0
      //   286: anewarray 59	java/lang/Object
      //   289: invokevirtual 163	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   292: checkcast 165	[Landroid/view/Display;
      //   295: checkcast 165	[Landroid/view/Display;
      //   298: astore 10
      //   300: ldc -89
      //   302: ldc -87
      //   304: iconst_0
      //   305: anewarray 53	java/lang/Class
      //   308: invokevirtual 156	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   311: astore 11
      //   313: aload 11
      //   315: iconst_1
      //   316: invokevirtual 159	java/lang/reflect/Method:setAccessible	(Z)V
      //   319: ldc -89
      //   321: ldc -85
      //   323: invokevirtual 69	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   326: astore 12
      //   328: aload 12
      //   330: iconst_1
      //   331: invokevirtual 75	java/lang/reflect/Field:setAccessible	(Z)V
      //   334: aload 10
      //   336: arraylength
      //   337: istore_3
      //   338: iconst_0
      //   339: istore_2
      //   340: iconst_0
      //   341: istore_1
      //   342: iload_2
      //   343: iload_3
      //   344: if_icmpge +318 -> 662
      //   347: aload 10
      //   349: iload_2
      //   350: aaload
      //   351: astore 13
      //   353: aload 12
      //   355: aload 13
      //   357: invokevirtual 175	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
      //   360: istore 4
      //   362: aload 11
      //   364: aload 13
      //   366: iconst_0
      //   367: anewarray 59	java/lang/Object
      //   370: invokevirtual 163	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   373: checkcast 177	java/lang/Integer
      //   376: invokevirtual 181	java/lang/Integer:intValue	()I
      //   379: iload 4
      //   381: if_icmpeq +266 -> 647
      //   384: iconst_1
      //   385: istore_1
      //   386: goto +269 -> 655
      //   389: aload 7
      //   391: iload_1
      //   392: putfield 90	com/tencent/c/e/a/a/k:xSt	I
      //   395: aload 7
      //   397: getfield 90	com/tencent/c/e/a/a/k:xSt	I
      //   400: istore_1
      //   401: goto -314 -> 87
      //   404: aload 9
      //   406: ldc -73
      //   408: invokevirtual 87	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
      //   411: checkcast 185	android/os/PowerManager
      //   414: astore 10
      //   416: aload 10
      //   418: ifnull -325 -> 93
      //   421: aload 10
      //   423: invokevirtual 189	android/os/PowerManager:isScreenOn	()Z
      //   426: ifeq +19 -> 445
      //   429: iconst_1
      //   430: istore_1
      //   431: aload 7
      //   433: iload_1
      //   434: putfield 90	com/tencent/c/e/a/a/k:xSt	I
      //   437: goto -344 -> 93
      //   440: astore 10
      //   442: goto -349 -> 93
      //   445: iconst_2
      //   446: istore_1
      //   447: goto -16 -> 431
      //   450: ldc -65
      //   452: aload 10
      //   454: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   457: ifeq +20 -> 477
      //   460: aload 7
      //   462: iconst_2
      //   463: putfield 117	com/tencent/c/e/a/a/k:xSv	I
      //   466: goto -335 -> 131
      //   469: astore 7
      //   471: aload 8
      //   473: monitorexit
      //   474: aload 7
      //   476: athrow
      //   477: ldc -63
      //   479: aload 10
      //   481: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   484: ifeq -353 -> 131
      //   487: aload 7
      //   489: iconst_3
      //   490: putfield 117	com/tencent/c/e/a/a/k:xSv	I
      //   493: goto -362 -> 131
      //   496: aload 9
      //   498: ldc -61
      //   500: iconst_m1
      //   501: invokevirtual 134	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
      //   504: istore_1
      //   505: iload_1
      //   506: iconst_2
      //   507: if_icmpne +12 -> 519
      //   510: aload 7
      //   512: iconst_3
      //   513: putfield 137	com/tencent/c/e/a/a/k:xSw	I
      //   516: goto -331 -> 185
      //   519: iload_1
      //   520: iconst_1
      //   521: if_icmpne +12 -> 533
      //   524: aload 7
      //   526: iconst_2
      //   527: putfield 137	com/tencent/c/e/a/a/k:xSw	I
      //   530: goto -345 -> 185
      //   533: aload 7
      //   535: iconst_0
      //   536: putfield 137	com/tencent/c/e/a/a/k:xSw	I
      //   539: goto -354 -> 185
      //   542: astore 7
      //   544: aload 8
      //   546: monitorexit
      //   547: aload 7
      //   549: athrow
      //   550: aload_0
      //   551: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   554: invokevirtual 198	com/tencent/c/e/a/e:qt	()Z
      //   557: pop
      //   558: aload 7
      //   560: monitorexit
      //   561: return
      //   562: astore 8
      //   564: aload 7
      //   566: monitorexit
      //   567: aload 8
      //   569: athrow
      //   570: aload_0
      //   571: aload_0
      //   572: getfield 23	com/tencent/c/e/a/e$a:mCount	I
      //   575: iconst_1
      //   576: iadd
      //   577: putfield 23	com/tencent/c/e/a/e$a:mCount	I
      //   580: aload_0
      //   581: getfield 27	com/tencent/c/e/a/e$a:xSa	J
      //   584: getstatic 203	com/tencent/c/e/a/a/f:xSd	J
      //   587: aload_0
      //   588: getfield 23	com/tencent/c/e/a/e$a:mCount	I
      //   591: i2l
      //   592: lmul
      //   593: ladd
      //   594: invokestatic 209	java/lang/System:currentTimeMillis	()J
      //   597: lsub
      //   598: lstore 5
      //   600: lload 5
      //   602: lconst_0
      //   603: lcmp
      //   604: ifle +24 -> 628
      //   607: aload_0
      //   608: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   611: getfield 213	com/tencent/c/e/a/e:mHandler	Landroid/os/Handler;
      //   614: aload_0
      //   615: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   618: getfield 217	com/tencent/c/e/a/e:xRT	Lcom/tencent/c/e/a/e$a;
      //   621: lload 5
      //   623: invokevirtual 223	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
      //   626: pop
      //   627: return
      //   628: aload_0
      //   629: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   632: getfield 213	com/tencent/c/e/a/e:mHandler	Landroid/os/Handler;
      //   635: aload_0
      //   636: getfield 18	com/tencent/c/e/a/e$a:xRU	Lcom/tencent/c/e/a/e;
      //   639: getfield 217	com/tencent/c/e/a/e:xRT	Lcom/tencent/c/e/a/e$a;
      //   642: invokevirtual 227	android/os/Handler:post	(Ljava/lang/Runnable;)Z
      //   645: pop
      //   646: return
      //   647: goto +8 -> 655
      //   650: iconst_1
      //   651: istore_1
      //   652: goto -477 -> 175
      //   655: iload_2
      //   656: iconst_1
      //   657: iadd
      //   658: istore_2
      //   659: goto -317 -> 342
      //   662: iload_1
      //   663: ifeq +8 -> 671
      //   666: iconst_1
      //   667: istore_1
      //   668: goto -279 -> 389
      //   671: iconst_2
      //   672: istore_1
      //   673: goto -284 -> 389
      //   676: iconst_0
      //   677: istore_1
      //   678: goto -503 -> 175
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	681	0	this	a
      //   86	592	1	i	int
      //   339	320	2	j	int
      //   337	8	3	k	int
      //   360	22	4	m	int
      //   598	24	5	l	long
      //   469	65	7	localObject2	Object
      //   542	23	7	localObject3	Object
      //   562	6	8	localObject5	Object
      //   28	469	9	localObject6	Object
      //   43	379	10	localObject7	Object
      //   440	40	10	localThrowable	Throwable
      //   55	308	11	localObject8	Object
      //   326	28	12	localField	java.lang.reflect.Field
      //   351	14	13	localObject9	Object
      // Exception table:
      //   from	to	target	type
      //   30	80	440	java/lang/Throwable
      //   87	93	440	java/lang/Throwable
      //   252	265	440	java/lang/Throwable
      //   275	338	440	java/lang/Throwable
      //   353	384	440	java/lang/Throwable
      //   389	401	440	java/lang/Throwable
      //   404	416	440	java/lang/Throwable
      //   421	429	440	java/lang/Throwable
      //   431	437	440	java/lang/Throwable
      //   18	30	469	finally
      //   30	80	469	finally
      //   87	93	469	finally
      //   93	131	469	finally
      //   131	148	469	finally
      //   153	162	469	finally
      //   179	185	469	finally
      //   185	188	469	finally
      //   252	265	469	finally
      //   275	338	469	finally
      //   353	384	469	finally
      //   389	401	469	finally
      //   404	416	469	finally
      //   421	429	469	finally
      //   431	437	469	finally
      //   450	466	469	finally
      //   471	474	469	finally
      //   477	493	469	finally
      //   496	505	469	finally
      //   510	516	469	finally
      //   524	530	469	finally
      //   533	539	469	finally
      //   200	218	542	finally
      //   544	547	542	finally
      //   238	251	562	finally
      //   550	561	562	finally
      //   564	567	562	finally
    }
    
    public final void cnB()
    {
      if (e.this.xRR != null) {
        com.tencent.c.e.a.a.d locald = e.this.xRR;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */