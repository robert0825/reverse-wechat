package com.tencent.c.e.a.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g
{
  private static final int[] xSj = { 1, 4, 9 };
  private final SensorManager aDS;
  private final HashSet<Sensor> xSh = new HashSet();
  public final SparseArray<i> xSi = new SparseArray();
  public a xSk = new a();
  
  public g(Context paramContext)
  {
    this.aDS = ((SensorManager)paramContext.getSystemService("sensor"));
  }
  
  private static boolean c(SparseArray<i> paramSparseArray)
  {
    if (paramSparseArray.size() == 0) {
      return false;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramSparseArray.size()) {
        break label154;
      }
      Object localObject = (i)paramSparseArray.valueAt(i);
      if (localObject != null)
      {
        Object[] arrayOfObject = ((i)localObject).cnG();
        if ((arrayOfObject != null) && (arrayOfObject.length != 0))
        {
          int j = 0;
          int m;
          for (int k = 0; j < ((i)localObject).vm.length; k = m)
          {
            m = k;
            if ((List)localObject.vm[j] != null) {
              m = k + 1;
            }
            j += 1;
          }
          if (k < 3) {
            break;
          }
          j = 0;
          for (;;)
          {
            if (j >= arrayOfObject.length) {
              break label147;
            }
            localObject = (List)arrayOfObject[j];
            if ((localObject != null) && (((List)localObject).size() < f.xSf / 2)) {
              break;
            }
            j += 1;
          }
        }
      }
      label147:
      i += 1;
    }
    label154:
    return true;
  }
  
  public final void cnC()
  {
    for (;;)
    {
      try
      {
        ??? = this.aDS;
        if (??? == null) {
          return;
        }
        synchronized (this.xSh)
        {
          Iterator localIterator = this.xSh.iterator();
          if (localIterator.hasNext())
          {
            Sensor localSensor = (Sensor)localIterator.next();
            this.aDS.unregisterListener(this.xSk, localSensor);
          }
        }
        this.xSh.clear();
      }
      finally {}
      a locala = this.xSk;
      synchronized (locala.xSl)
      {
        if (locala.xSl.get()) {}
      }
      ((a)localObject4).xSl.set(false);
      ((a)localObject4).xSn = (System.currentTimeMillis() - ((a)localObject4).xSa);
      if (((a)localObject4).xSn < 0L) {
        ((a)localObject4).xSn = 0L;
      }
      ((a)localObject4).xSa = 0L;
    }
  }
  
  public final SparseArray<i> cnD()
  {
    synchronized (this.xSi)
    {
      SparseArray localSparseArray2 = new SparseArray();
      int i = 0;
      while (i < this.xSi.size())
      {
        localSparseArray2.append(this.xSi.keyAt(i), (i)this.xSi.valueAt(i));
        i += 1;
      }
      if (c(localSparseArray2)) {
        return localSparseArray2;
      }
      localSparseArray2 = new SparseArray();
      return localSparseArray2;
    }
  }
  
  /* Error */
  public final boolean fq(long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: iconst_0
    //   4: istore 7
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield 55	com/tencent/c/e/a/a/g:aDS	Landroid/hardware/SensorManager;
    //   12: astore 8
    //   14: aload 8
    //   16: ifnonnull +8 -> 24
    //   19: aload_0
    //   20: monitorexit
    //   21: iload 7
    //   23: ireturn
    //   24: aload_0
    //   25: getfield 43	com/tencent/c/e/a/a/g:xSk	Lcom/tencent/c/e/a/a/g$a;
    //   28: astore 9
    //   30: aload 9
    //   32: getfield 114	com/tencent/c/e/a/a/g$a:xSl	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   35: astore 8
    //   37: aload 8
    //   39: monitorenter
    //   40: aload 9
    //   42: getfield 114	com/tencent/c/e/a/a/g$a:xSl	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   45: invokevirtual 119	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   48: ifeq +123 -> 171
    //   51: aload 8
    //   53: monitorexit
    //   54: aload_0
    //   55: getfield 33	com/tencent/c/e/a/a/g:xSh	Ljava/util/HashSet;
    //   58: astore 8
    //   60: aload 8
    //   62: monitorenter
    //   63: aload_0
    //   64: getfield 33	com/tencent/c/e/a/a/g:xSh	Ljava/util/HashSet;
    //   67: invokevirtual 110	java/util/HashSet:clear	()V
    //   70: aload 8
    //   72: monitorexit
    //   73: aload_0
    //   74: getfield 33	com/tencent/c/e/a/a/g:xSh	Ljava/util/HashSet;
    //   77: astore 8
    //   79: aload 8
    //   81: monitorenter
    //   82: getstatic 23	com/tencent/c/e/a/a/g:xSj	[I
    //   85: astore 9
    //   87: aload 9
    //   89: arraylength
    //   90: istore 4
    //   92: iconst_0
    //   93: istore_3
    //   94: iload_3
    //   95: iload 4
    //   97: if_icmpge +136 -> 233
    //   100: aload 9
    //   102: iload_3
    //   103: iaload
    //   104: istore 5
    //   106: aload_0
    //   107: getfield 55	com/tencent/c/e/a/a/g:aDS	Landroid/hardware/SensorManager;
    //   110: iload 5
    //   112: invokevirtual 155	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   115: astore 10
    //   117: iload 6
    //   119: istore 7
    //   121: aload 10
    //   123: ifnull +37 -> 160
    //   126: iload 6
    //   128: istore 7
    //   130: aload_0
    //   131: getfield 55	com/tencent/c/e/a/a/g:aDS	Landroid/hardware/SensorManager;
    //   134: aload_0
    //   135: getfield 43	com/tencent/c/e/a/a/g:xSk	Lcom/tencent/c/e/a/a/g$a;
    //   138: aload 10
    //   140: iconst_0
    //   141: invokevirtual 159	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //   144: ifeq +16 -> 160
    //   147: aload_0
    //   148: getfield 33	com/tencent/c/e/a/a/g:xSh	Ljava/util/HashSet;
    //   151: aload 10
    //   153: invokevirtual 163	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   156: pop
    //   157: iconst_1
    //   158: istore 7
    //   160: iload_3
    //   161: iconst_1
    //   162: iadd
    //   163: istore_3
    //   164: iload 7
    //   166: istore 6
    //   168: goto -74 -> 94
    //   171: aload 9
    //   173: getfield 114	com/tencent/c/e/a/a/g$a:xSl	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   176: iconst_1
    //   177: invokevirtual 123	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   180: aload 9
    //   182: invokestatic 129	java/lang/System:currentTimeMillis	()J
    //   185: putfield 133	com/tencent/c/e/a/a/g$a:xSa	J
    //   188: aload 9
    //   190: lload_1
    //   191: l2d
    //   192: getstatic 166	com/tencent/c/e/a/a/f:xSe	J
    //   195: l2d
    //   196: ddiv
    //   197: invokestatic 172	java/lang/Math:ceil	(D)D
    //   200: d2i
    //   201: putfield 175	com/tencent/c/e/a/a/g$a:xSm	I
    //   204: aload 8
    //   206: monitorexit
    //   207: goto -153 -> 54
    //   210: astore 9
    //   212: aload 8
    //   214: monitorexit
    //   215: aload 9
    //   217: athrow
    //   218: astore 8
    //   220: aload_0
    //   221: monitorexit
    //   222: aload 8
    //   224: athrow
    //   225: astore 9
    //   227: aload 8
    //   229: monitorexit
    //   230: aload 9
    //   232: athrow
    //   233: aload 8
    //   235: monitorexit
    //   236: iload 6
    //   238: istore 7
    //   240: iload 6
    //   242: ifne -223 -> 19
    //   245: aload_0
    //   246: invokevirtual 177	com/tencent/c/e/a/a/g:cnC	()V
    //   249: iload 6
    //   251: istore 7
    //   253: goto -234 -> 19
    //   256: astore 9
    //   258: aload 8
    //   260: monitorexit
    //   261: aload 9
    //   263: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	this	g
    //   0	264	1	paramLong	long
    //   93	71	3	i	int
    //   90	8	4	j	int
    //   104	7	5	k	int
    //   1	249	6	bool1	boolean
    //   4	248	7	bool2	boolean
    //   218	41	8	localObject2	Object
    //   28	161	9	localObject3	Object
    //   210	6	9	localObject4	Object
    //   225	6	9	localObject5	Object
    //   256	6	9	localObject6	Object
    //   115	37	10	localSensor	Sensor
    // Exception table:
    //   from	to	target	type
    //   40	54	210	finally
    //   171	207	210	finally
    //   212	215	210	finally
    //   8	14	218	finally
    //   24	40	218	finally
    //   54	63	218	finally
    //   73	82	218	finally
    //   215	218	218	finally
    //   230	233	218	finally
    //   245	249	218	finally
    //   261	264	218	finally
    //   63	73	225	finally
    //   227	230	225	finally
    //   82	92	256	finally
    //   106	117	256	finally
    //   130	157	256	finally
    //   233	236	256	finally
    //   258	261	256	finally
  }
  
  private final class a
    implements SensorEventListener
  {
    long xSa = 0L;
    final AtomicBoolean xSl = new AtomicBoolean(false);
    int xSm = 0;
    long xSn = 0L;
    
    a() {}
    
    public final long cue()
    {
      synchronized (this.xSl)
      {
        long l = this.xSa;
        return l;
      }
    }
    
    public final long cuf()
    {
      synchronized (this.xSl)
      {
        long l = this.xSn;
        return l;
      }
    }
    
    public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
    
    public final void onSensorChanged(SensorEvent arg1)
    {
      j localj;
      long l;
      synchronized (this.xSl)
      {
        if (!this.xSl.get()) {
          return;
        }
        if ((??? == null) || (???.sensor == null)) {
          return;
        }
        localj = new j(???, System.currentTimeMillis());
        synchronized (this.xSl)
        {
          l = localj.timestamp - this.xSa;
          if (l < 0L) {
            return;
          }
        }
      }
      int j = localj.xSs;
      int i = (int)(l / f.xSe);
      for (;;)
      {
        synchronized (g.this.xSi)
        {
          ??? = (i)g.this.xSi.get(j);
          if (??? == null)
          {
            ??? = new i(j, f.xSf, this.xSm);
            g.this.xSi.put(j, ???);
            if ((i < ???.gaT) && (i > ???.kZJ))
            {
              j = i / ???.xBL;
              List localList = (List)???.vm[j];
              Object localObject2 = localList;
              if (localList == null)
              {
                localObject2 = new ArrayList();
                ???.vm[j] = localObject2;
              }
              ((List)localObject2).add(localj);
              ???.kZJ = i;
            }
            return;
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */