package com.tencent.mm.svg;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;

final class b
{
  private static a<Paint> vEl;
  private static a<float[]> vEm;
  private static a<Matrix> vEn;
  private static a<Path> vEo;
  private static final float[] vEp;
  
  static
  {
    GMTrace.i(3491674193920L, 26015);
    vEl = new a();
    vEm = new a();
    vEn = new a();
    vEo = new a();
    vEp = new float[9];
    GMTrace.o(3491674193920L, 26015);
  }
  
  /* Error */
  protected static Paint a(Looper paramLooper, Paint paramPaint)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 47
    //   6: sipush 26011
    //   9: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 32	com/tencent/mm/svg/b:vEl	Lcom/tencent/mm/svg/a;
    //   15: invokevirtual 52	com/tencent/mm/svg/a:bVp	()Ljava/lang/Object;
    //   18: checkcast 54	android/graphics/Paint
    //   21: astore_2
    //   22: aload_2
    //   23: ifnonnull +42 -> 65
    //   26: new 54	android/graphics/Paint
    //   29: dup
    //   30: invokespecial 55	android/graphics/Paint:<init>	()V
    //   33: astore_2
    //   34: aload_1
    //   35: ifnull +8 -> 43
    //   38: aload_2
    //   39: aload_1
    //   40: invokevirtual 59	android/graphics/Paint:set	(Landroid/graphics/Paint;)V
    //   43: getstatic 32	com/tencent/mm/svg/b:vEl	Lcom/tencent/mm/svg/a;
    //   46: aload_0
    //   47: aload_2
    //   48: invokevirtual 62	com/tencent/mm/svg/a:a	(Landroid/os/Looper;Ljava/lang/Object;)V
    //   51: ldc2_w 47
    //   54: sipush 26011
    //   57: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   60: ldc 2
    //   62: monitorexit
    //   63: aload_2
    //   64: areturn
    //   65: aload_2
    //   66: invokevirtual 65	android/graphics/Paint:reset	()V
    //   69: goto -35 -> 34
    //   72: astore_0
    //   73: ldc 2
    //   75: monitorexit
    //   76: aload_0
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	paramLooper	Looper
    //   0	78	1	paramPaint	Paint
    //   21	45	2	localPaint	Paint
    // Exception table:
    //   from	to	target	type
    //   3	22	72	finally
    //   26	34	72	finally
    //   38	43	72	finally
    //   43	60	72	finally
    //   65	69	72	finally
  }
  
  protected static void c(Looper paramLooper)
  {
    try
    {
      GMTrace.i(3491003105280L, 26010);
      vEl.b(paramLooper);
      vEm.b(paramLooper);
      vEn.b(paramLooper);
      vEo.b(paramLooper);
      GMTrace.o(3491003105280L, 26010);
      return;
    }
    finally
    {
      paramLooper = finally;
      throw paramLooper;
    }
  }
  
  /* Error */
  protected static float[] d(Looper paramLooper)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 75
    //   6: sipush 26012
    //   9: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 34	com/tencent/mm/svg/b:vEm	Lcom/tencent/mm/svg/a;
    //   15: invokevirtual 52	com/tencent/mm/svg/a:bVp	()Ljava/lang/Object;
    //   18: checkcast 77	[F
    //   21: astore_1
    //   22: aload_1
    //   23: ifnonnull +30 -> 53
    //   26: bipush 9
    //   28: newarray <illegal type>
    //   30: astore_1
    //   31: getstatic 34	com/tencent/mm/svg/b:vEm	Lcom/tencent/mm/svg/a;
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 62	com/tencent/mm/svg/a:a	(Landroid/os/Looper;Ljava/lang/Object;)V
    //   39: ldc2_w 75
    //   42: sipush 26012
    //   45: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_1
    //   52: areturn
    //   53: getstatic 40	com/tencent/mm/svg/b:vEp	[F
    //   56: iconst_0
    //   57: aload_1
    //   58: iconst_0
    //   59: bipush 9
    //   61: invokestatic 83	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   64: goto -33 -> 31
    //   67: astore_0
    //   68: ldc 2
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	paramLooper	Looper
    //   21	37	1	arrayOfFloat	float[]
    // Exception table:
    //   from	to	target	type
    //   3	22	67	finally
    //   26	31	67	finally
    //   31	48	67	finally
    //   53	64	67	finally
  }
  
  /* Error */
  protected static Matrix e(Looper paramLooper)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 86
    //   6: sipush 26013
    //   9: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 36	com/tencent/mm/svg/b:vEn	Lcom/tencent/mm/svg/a;
    //   15: invokevirtual 52	com/tencent/mm/svg/a:bVp	()Ljava/lang/Object;
    //   18: checkcast 89	android/graphics/Matrix
    //   21: astore_1
    //   22: aload_1
    //   23: ifnonnull +33 -> 56
    //   26: new 89	android/graphics/Matrix
    //   29: dup
    //   30: invokespecial 90	android/graphics/Matrix:<init>	()V
    //   33: astore_1
    //   34: getstatic 36	com/tencent/mm/svg/b:vEn	Lcom/tencent/mm/svg/a;
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 62	com/tencent/mm/svg/a:a	(Landroid/os/Looper;Ljava/lang/Object;)V
    //   42: ldc2_w 86
    //   45: sipush 26013
    //   48: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_1
    //   55: areturn
    //   56: aload_1
    //   57: invokevirtual 91	android/graphics/Matrix:reset	()V
    //   60: goto -26 -> 34
    //   63: astore_0
    //   64: ldc 2
    //   66: monitorexit
    //   67: aload_0
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	paramLooper	Looper
    //   21	36	1	localMatrix	Matrix
    // Exception table:
    //   from	to	target	type
    //   3	22	63	finally
    //   26	34	63	finally
    //   34	51	63	finally
    //   56	60	63	finally
  }
  
  /* Error */
  protected static Path f(Looper paramLooper)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 94
    //   6: sipush 26014
    //   9: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 38	com/tencent/mm/svg/b:vEo	Lcom/tencent/mm/svg/a;
    //   15: invokevirtual 52	com/tencent/mm/svg/a:bVp	()Ljava/lang/Object;
    //   18: checkcast 97	android/graphics/Path
    //   21: astore_1
    //   22: aload_1
    //   23: ifnonnull +33 -> 56
    //   26: new 97	android/graphics/Path
    //   29: dup
    //   30: invokespecial 98	android/graphics/Path:<init>	()V
    //   33: astore_1
    //   34: getstatic 38	com/tencent/mm/svg/b:vEo	Lcom/tencent/mm/svg/a;
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 62	com/tencent/mm/svg/a:a	(Landroid/os/Looper;Ljava/lang/Object;)V
    //   42: ldc2_w 94
    //   45: sipush 26014
    //   48: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_1
    //   55: areturn
    //   56: aload_1
    //   57: invokevirtual 99	android/graphics/Path:reset	()V
    //   60: goto -26 -> 34
    //   63: astore_0
    //   64: ldc 2
    //   66: monitorexit
    //   67: aload_0
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	paramLooper	Looper
    //   21	36	1	localPath	Path
    // Exception table:
    //   from	to	target	type
    //   3	22	63	finally
    //   26	34	63	finally
    //   34	51	63	finally
    //   56	60	63	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */