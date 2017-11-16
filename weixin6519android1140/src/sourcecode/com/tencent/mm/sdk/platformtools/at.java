package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class at<K, V>
{
  private final long aga;
  public final aj euU;
  public volatile boolean euX;
  public final y<K, a<V>> mol;
  protected Object tag;
  private final long threshold;
  public final LinkedHashMap<K, b<K, V>> vko;
  private final c<K, V> vkp;
  public final aj vkq;
  private final long vkr;
  private boolean vks;
  
  public at(c<K, V> paramc, Looper paramLooper, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    GMTrace.i(13905896144896L, 103607);
    this.vko = new LinkedHashMap();
    this.vks = true;
    this.euX = false;
    if (paramc == null) {
      throw new IllegalArgumentException("arg appender can not be null!");
    }
    if (paramLooper == null) {
      throw new IllegalArgumentException("arg looper can not be null!");
    }
    if (paramInt1 <= 0) {
      throw new IllegalArgumentException("arg size can not be <= 0!");
    }
    this.vkp = paramc;
    this.mol = new y(paramInt1);
    long l;
    if (paramInt2 > 0)
    {
      l = paramInt2;
      this.threshold = l;
      if (paramLong1 <= 0L) {
        break label207;
      }
      label115:
      this.vkr = paramLong1;
      if (paramLong2 <= 0L) {
        break label215;
      }
    }
    for (;;)
    {
      this.aga = paramLong2;
      this.euU = new aj(paramLooper, new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(13877039333376L, 103392);
          long l = System.currentTimeMillis();
          at.this.kI(false);
          w.i("MicroMsg.RWCache", "summer timer onTimerExpired e appendAll takes: " + (System.currentTimeMillis() - l) + " ms");
          GMTrace.o(13877039333376L, 103392);
          return false;
        }
      }, false);
      this.vkq = new aj(new af("RWCache_timeoutChecker").ngv.getLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(13876636680192L, 103389);
          at.this.euX = true;
          GMTrace.o(13876636680192L, 103389);
          return false;
        }
      }, false);
      GMTrace.o(13905896144896L, 103607);
      return;
      l = 40L;
      break;
      label207:
      paramLong1 = 60000L;
      break label115;
      label215:
      paramLong2 = 60000L;
    }
  }
  
  public final V get(K paramK)
  {
    GMTrace.i(13906298798080L, 103610);
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    a locala = (a)this.mol.get(paramK);
    if (locala != null)
    {
      paramK = locala.vku;
      GMTrace.o(13906298798080L, 103610);
      return paramK;
    }
    this.mol.put(paramK, new a(null));
    GMTrace.o(13906298798080L, 103610);
    return null;
  }
  
  public final Object getTag()
  {
    GMTrace.i(13906030362624L, 103608);
    Object localObject = this.tag;
    GMTrace.o(13906030362624L, 103608);
    return localObject;
  }
  
  public final void kI(boolean paramBoolean)
  {
    GMTrace.i(13906567233536L, 103612);
    w.i("MicroMsg.RWCache", "summer appendAll force: " + paramBoolean + " tid: " + Thread.currentThread().getId() + " holderMap size: " + this.vko.size());
    try
    {
      this.vks = true;
      if (this.vko.isEmpty())
      {
        GMTrace.o(13906567233536L, 103612);
        return;
      }
      if (!this.vkp.Mp())
      {
        GMTrace.o(13906567233536L, 103612);
        return;
      }
      Iterator localIterator = this.vko.entrySet().iterator();
      if (paramBoolean) {
        while (localIterator.hasNext())
        {
          this.vkp.a(this, (b)((Map.Entry)localIterator.next()).getValue());
          localIterator.remove();
        }
      }
      this.euX = false;
    }
    finally {}
    aj localaj = this.vkq;
    long l = this.aga;
    localaj.z(l, l);
    while ((!this.euX) && (((Iterator)localObject).hasNext()))
    {
      this.vkp.a(this, (b)((Map.Entry)((Iterator)localObject).next()).getValue());
      ((Iterator)localObject).remove();
    }
    if (this.euX) {
      w.i("MicroMsg.RWCache", "summer appendAll timeout size[%d] hasNext[%b] end", new Object[] { Integer.valueOf(this.vko.size()), Boolean.valueOf(((Iterator)localObject).hasNext()) });
    }
    this.vkq.stopTimer();
    this.vkp.Mq();
    GMTrace.o(13906567233536L, 103612);
  }
  
  /* Error */
  public final boolean s(K paramK, V paramV)
  {
    // Byte code:
    //   0: ldc2_w 273
    //   3: ldc_w 275
    //   6: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnonnull +13 -> 23
    //   13: new 133	java/lang/NullPointerException
    //   16: dup
    //   17: ldc -121
    //   19: invokespecial 136	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   22: athrow
    //   23: aload_0
    //   24: getfield 82	com/tencent/mm/sdk/platformtools/at:mol	Lcom/tencent/mm/sdk/platformtools/y;
    //   27: aload_1
    //   28: invokevirtual 138	com/tencent/mm/sdk/platformtools/y:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 11	com/tencent/mm/sdk/platformtools/at$a
    //   34: astore 6
    //   36: new 11	com/tencent/mm/sdk/platformtools/at$a
    //   39: dup
    //   40: aload_2
    //   41: invokespecial 144	com/tencent/mm/sdk/platformtools/at$a:<init>	(Ljava/lang/Object;)V
    //   44: astore 7
    //   46: aload 7
    //   48: aload 6
    //   50: invokevirtual 279	com/tencent/mm/sdk/platformtools/at$a:equals	(Ljava/lang/Object;)Z
    //   53: ifeq +14 -> 67
    //   56: ldc2_w 273
    //   59: ldc_w 275
    //   62: invokestatic 119	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: iconst_0
    //   66: ireturn
    //   67: aload_0
    //   68: getfield 82	com/tencent/mm/sdk/platformtools/at:mol	Lcom/tencent/mm/sdk/platformtools/y;
    //   71: aload_1
    //   72: aload 7
    //   74: invokevirtual 148	com/tencent/mm/sdk/platformtools/y:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   77: pop
    //   78: new 14	com/tencent/mm/sdk/platformtools/at$b
    //   81: dup
    //   82: invokespecial 280	com/tencent/mm/sdk/platformtools/at$b:<init>	()V
    //   85: astore 6
    //   87: aload 6
    //   89: aload_1
    //   90: putfield 283	com/tencent/mm/sdk/platformtools/at$b:tGT	Ljava/lang/Object;
    //   93: aload 6
    //   95: aload_2
    //   96: putfield 286	com/tencent/mm/sdk/platformtools/at$b:values	Ljava/lang/Object;
    //   99: aload_2
    //   100: ifnonnull +74 -> 174
    //   103: iconst_2
    //   104: istore_3
    //   105: aload 6
    //   107: iload_3
    //   108: putfield 290	com/tencent/mm/sdk/platformtools/at$b:vkv	I
    //   111: aload_0
    //   112: monitorenter
    //   113: aload_0
    //   114: getfield 58	com/tencent/mm/sdk/platformtools/at:vko	Ljava/util/LinkedHashMap;
    //   117: aload_1
    //   118: aload 6
    //   120: invokevirtual 291	java/util/LinkedHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload_0
    //   125: getfield 60	com/tencent/mm/sdk/platformtools/at:vks	Z
    //   128: ifeq +51 -> 179
    //   131: aload_0
    //   132: getfield 58	com/tencent/mm/sdk/platformtools/at:vko	Ljava/util/LinkedHashMap;
    //   135: invokevirtual 196	java/util/LinkedHashMap:size	()I
    //   138: i2l
    //   139: aload_0
    //   140: getfield 84	com/tencent/mm/sdk/platformtools/at:threshold	J
    //   143: lcmp
    //   144: ifle +35 -> 179
    //   147: aload_0
    //   148: getfield 98	com/tencent/mm/sdk/platformtools/at:euU	Lcom/tencent/mm/sdk/platformtools/aj;
    //   151: lconst_0
    //   152: lconst_0
    //   153: invokevirtual 248	com/tencent/mm/sdk/platformtools/aj:z	(JJ)V
    //   156: aload_0
    //   157: iconst_0
    //   158: putfield 60	com/tencent/mm/sdk/platformtools/at:vks	Z
    //   161: aload_0
    //   162: monitorexit
    //   163: ldc2_w 273
    //   166: ldc_w 275
    //   169: invokestatic 119	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   172: iconst_1
    //   173: ireturn
    //   174: iconst_1
    //   175: istore_3
    //   176: goto -71 -> 105
    //   179: aload_0
    //   180: getfield 98	com/tencent/mm/sdk/platformtools/at:euU	Lcom/tencent/mm/sdk/platformtools/aj;
    //   183: invokevirtual 294	com/tencent/mm/sdk/platformtools/aj:bQn	()Z
    //   186: ifeq -25 -> 161
    //   189: aload_0
    //   190: getfield 98	com/tencent/mm/sdk/platformtools/at:euU	Lcom/tencent/mm/sdk/platformtools/aj;
    //   193: astore_1
    //   194: aload_0
    //   195: getfield 86	com/tencent/mm/sdk/platformtools/at:vkr	J
    //   198: lstore 4
    //   200: aload_1
    //   201: lload 4
    //   203: lload 4
    //   205: invokevirtual 248	com/tencent/mm/sdk/platformtools/aj:z	(JJ)V
    //   208: goto -47 -> 161
    //   211: astore_1
    //   212: aload_0
    //   213: monitorexit
    //   214: aload_1
    //   215: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	this	at
    //   0	216	1	paramK	K
    //   0	216	2	paramV	V
    //   104	72	3	i	int
    //   198	6	4	l	long
    //   34	85	6	localObject	Object
    //   44	29	7	locala	a
    // Exception table:
    //   from	to	target	type
    //   113	161	211	finally
    //   161	163	211	finally
    //   179	208	211	finally
    //   212	214	211	finally
  }
  
  public final void setTag(Object paramObject)
  {
    GMTrace.i(13906164580352L, 103609);
    this.tag = paramObject;
    GMTrace.o(13906164580352L, 103609);
  }
  
  static final class a<V>
  {
    final V vku;
    
    a(V paramV)
    {
      GMTrace.i(13880528994304L, 103418);
      this.vku = paramV;
      GMTrace.o(13880528994304L, 103418);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(13880663212032L, 103419);
      if (paramObject == null)
      {
        GMTrace.o(13880663212032L, 103419);
        return false;
      }
      if (!(paramObject instanceof a))
      {
        GMTrace.o(13880663212032L, 103419);
        return false;
      }
      paramObject = (a)paramObject;
      if (this.vku == null)
      {
        if (((a)paramObject).vku == null)
        {
          GMTrace.o(13880663212032L, 103419);
          return true;
        }
        GMTrace.o(13880663212032L, 103419);
        return false;
      }
      boolean bool = this.vku.equals(((a)paramObject).vku);
      GMTrace.o(13880663212032L, 103419);
      return bool;
    }
  }
  
  public static final class b<K, V>
  {
    public K tGT;
    public V values;
    public int vkv;
    
    public b()
    {
      GMTrace.i(13951395954688L, 103946);
      GMTrace.o(13951395954688L, 103946);
    }
  }
  
  public static abstract interface c<K, V>
  {
    public abstract boolean Mp();
    
    public abstract void Mq();
    
    public abstract void a(at<K, V> paramat, at.b<K, V> paramb);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */