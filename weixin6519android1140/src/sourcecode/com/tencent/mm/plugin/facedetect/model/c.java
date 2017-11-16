package com.tencent.mm.plugin.facedetect.model;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends a<byte[]>
{
  public static final c kSA;
  private static int kSB;
  
  static
  {
    GMTrace.i(5861690834944L, 43673);
    kSA = new c();
    kSB = 0;
    GMTrace.o(5861690834944L, 43673);
  }
  
  private c()
  {
    GMTrace.i(5859946004480L, 43660);
    GMTrace.o(5859946004480L, 43660);
  }
  
  public static void bZ(int paramInt1, int paramInt2)
  {
    GMTrace.i(5859811786752L, 43659);
    w.i("MicroMsg.FaceByteArrayPool", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(5) });
    long l = bg.Pw();
    int i = 0;
    while (i < 5)
    {
      kSA.x(new byte[paramInt1 * paramInt2 * 3 / 2]);
      i += 1;
    }
    w.i("MicroMsg.FaceByteArrayPool", "preloadCameraData used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
    GMTrace.o(5859811786752L, 43659);
  }
  
  /* Error */
  public final byte[] h(Integer paramInteger)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 128
    //   5: ldc -126
    //   7: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial 132	com/tencent/mm/memory/a:b	(Ljava/lang/Integer;)Ljava/lang/Object;
    //   15: checkcast 85	[B
    //   18: astore_2
    //   19: aload_2
    //   20: ifnonnull +29 -> 49
    //   23: ldc 42
    //   25: ldc -122
    //   27: invokestatic 138	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual 119	java/lang/Integer:intValue	()I
    //   34: newarray <illegal type>
    //   36: astore_1
    //   37: ldc2_w 128
    //   40: ldc -126
    //   42: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: areturn
    //   49: ldc 42
    //   51: ldc -116
    //   53: invokestatic 138	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_2
    //   57: astore_1
    //   58: goto -21 -> 37
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	c
    //   0	66	1	paramInteger	Integer
    //   18	39	2	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	19	61	finally
    //   23	37	61	finally
    //   37	45	61	finally
    //   49	56	61	finally
  }
  
  public final void x(byte[] paramArrayOfByte)
  {
    try
    {
      GMTrace.i(5860080222208L, 43661);
      super.aw(paramArrayOfByte);
      GMTrace.o(5860080222208L, 43661);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  protected final long yc()
  {
    GMTrace.i(5860348657664L, 43663);
    if (kSB <= 0) {
      kSB = ((ActivityManager)ab.getContext().getSystemService("activity")).getLargeMemoryClass();
    }
    if (kSB >= 512)
    {
      GMTrace.o(5860348657664L, 43663);
      return 20971520L;
    }
    GMTrace.o(5860348657664L, 43663);
    return 10485760L;
  }
  
  protected final long yd()
  {
    GMTrace.i(5860482875392L, 43664);
    GMTrace.o(5860482875392L, 43664);
    return 20971520L;
  }
  
  public final void ye()
  {
    GMTrace.i(5860617093120L, 43665);
    super.ye();
    GMTrace.o(5860617093120L, 43665);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */