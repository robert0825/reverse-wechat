package com.tencent.mm.plugin.facedetect.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a;
import java.util.List;

public final class d
{
  private static volatile d kSC;
  public static final Object mLock;
  public List<a> kSD;
  
  static
  {
    GMTrace.i(5875246825472L, 43774);
    kSC = null;
    mLock = new Object();
    GMTrace.o(5875246825472L, 43774);
  }
  
  public d()
  {
    GMTrace.i(5874709954560L, 43770);
    this.kSD = null;
    GMTrace.o(5874709954560L, 43770);
  }
  
  public static final d avZ()
  {
    GMTrace.i(5874844172288L, 43771);
    if (kSC == null) {
      synchronized (mLock)
      {
        if (kSC == null) {
          kSC = new d();
        }
        d locald = kSC;
        GMTrace.o(5874844172288L, 43771);
        return locald;
      }
    }
    ??? = kSC;
    GMTrace.o(5874844172288L, 43771);
    return (d)???;
  }
  
  /* Error */
  public final void a(b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 52
    //   5: ldc 54
    //   7: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: ifnonnull +21 -> 32
    //   14: ldc 56
    //   16: ldc 58
    //   18: invokestatic 64	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: ldc2_w 52
    //   24: ldc 54
    //   26: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: getstatic 35	com/tencent/mm/plugin/facedetect/model/d:mLock	Ljava/lang/Object;
    //   35: astore_2
    //   36: aload_2
    //   37: monitorenter
    //   38: aload_0
    //   39: getfield 44	com/tencent/mm/plugin/facedetect/model/d:kSD	Ljava/util/List;
    //   42: ifnonnull +18 -> 60
    //   45: aload_0
    //   46: new 66	java/util/ArrayList
    //   49: dup
    //   50: iconst_5
    //   51: invokespecial 69	java/util/ArrayList:<init>	(I)V
    //   54: invokestatic 75	java/util/Collections:synchronizedList	(Ljava/util/List;)Ljava/util/List;
    //   57: putfield 44	com/tencent/mm/plugin/facedetect/model/d:kSD	Ljava/util/List;
    //   60: aload_0
    //   61: getfield 44	com/tencent/mm/plugin/facedetect/model/d:kSD	Ljava/util/List;
    //   64: new 6	com/tencent/mm/plugin/facedetect/model/d$a
    //   67: dup
    //   68: aload_0
    //   69: aload_1
    //   70: invokespecial 78	com/tencent/mm/plugin/facedetect/model/d$a:<init>	(Lcom/tencent/mm/plugin/facedetect/model/d;Lcom/tencent/mm/plugin/facedetect/model/d$b;)V
    //   73: invokeinterface 84 2 0
    //   78: pop
    //   79: aload_2
    //   80: monitorexit
    //   81: ldc2_w 52
    //   84: ldc 54
    //   86: invokestatic 38	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   89: goto -60 -> 29
    //   92: astore_1
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_1
    //   96: athrow
    //   97: astore_1
    //   98: aload_2
    //   99: monitorexit
    //   100: aload_1
    //   101: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	d
    //   0	102	1	paramb	b
    // Exception table:
    //   from	to	target	type
    //   2	10	92	finally
    //   14	29	92	finally
    //   32	38	92	finally
    //   81	89	92	finally
    //   100	102	92	finally
    //   38	60	97	finally
    //   60	81	97	finally
    //   98	100	97	finally
  }
  
  public final void b(b paramb)
  {
    GMTrace.i(5875112607744L, 43773);
    synchronized (mLock)
    {
      if (this.kSD != null) {
        this.kSD.remove(paramb);
      }
      GMTrace.o(5875112607744L, 43773);
      return;
    }
  }
  
  private final class a
  {
    public byte[] data;
    public d.b kSE;
    
    a(d.b paramb)
    {
      GMTrace.i(5857932738560L, 43645);
      this.kSE = paramb;
      GMTrace.o(5857932738560L, 43645);
    }
  }
  
  public static abstract interface b
  {
    public abstract void aq(byte[] paramArrayOfByte);
    
    public abstract a<byte[]> awa();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */