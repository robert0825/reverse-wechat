package com.tencent.mm.plugin.mmsight.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.c.a.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

final class n
{
  public final Object lock;
  public boolean mZg;
  public c.a.a mZh;
  
  n()
  {
    GMTrace.i(7338891149312L, 54679);
    this.lock = new byte[0];
    this.mZg = false;
    GMTrace.o(7338891149312L, 54679);
  }
  
  public final c.a.a o(final Context paramContext, int paramInt)
  {
    GMTrace.i(20192386088960L, 150445);
    if (paramContext == null)
    {
      GMTrace.o(20192386088960L, 150445);
      return null;
    }
    long l1 = bg.Pv();
    final long l2 = Thread.currentThread().getId();
    synchronized (this.lock)
    {
      this.mZg = false;
      this.mZh = null;
      e.post(new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: ldc2_w 51
          //   3: ldc 53
          //   5: invokestatic 44	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: ldc 55
          //   10: ldc 57
          //   12: iconst_3
          //   13: anewarray 4	java/lang/Object
          //   16: dup
          //   17: iconst_0
          //   18: aload_0
          //   19: getfield 26	com/tencent/mm/plugin/mmsight/model/n$1:mZi	J
          //   22: invokestatic 63	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   25: aastore
          //   26: dup
          //   27: iconst_1
          //   28: invokestatic 69	java/lang/Thread:currentThread	()Ljava/lang/Thread;
          //   31: invokevirtual 73	java/lang/Thread:getId	()J
          //   34: invokestatic 63	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   37: aastore
          //   38: dup
          //   39: iconst_2
          //   40: invokestatic 78	com/tencent/mm/sdk/platformtools/bg:Pv	()J
          //   43: aload_0
          //   44: getfield 28	com/tencent/mm/plugin/mmsight/model/n$1:fJi	J
          //   47: lsub
          //   48: invokestatic 63	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   51: aastore
          //   52: invokestatic 83	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   55: aload_0
          //   56: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   59: getfield 87	com/tencent/mm/plugin/mmsight/model/n:lock	Ljava/lang/Object;
          //   62: astore_1
          //   63: aload_1
          //   64: monitorenter
          //   65: aload_0
          //   66: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   69: aload_0
          //   70: getfield 30	com/tencent/mm/plugin/mmsight/model/n$1:val$context	Landroid/content/Context;
          //   73: aload_0
          //   74: getfield 32	com/tencent/mm/plugin/mmsight/model/n$1:mZj	I
          //   77: invokestatic 90	com/tencent/mm/compatible/d/c:o	(Landroid/content/Context;I)Lcom/tencent/mm/compatible/d/c$a$a;
          //   80: putfield 94	com/tencent/mm/plugin/mmsight/model/n:mZh	Lcom/tencent/mm/compatible/d/c$a$a;
          //   83: aload_0
          //   84: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   87: getfield 98	com/tencent/mm/plugin/mmsight/model/n:mZg	Z
          //   90: ifeq +70 -> 160
          //   93: aload_0
          //   94: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   97: getfield 94	com/tencent/mm/plugin/mmsight/model/n:mZh	Lcom/tencent/mm/compatible/d/c$a$a;
          //   100: ifnull +60 -> 160
          //   103: ldc 55
          //   105: ldc 100
          //   107: iconst_1
          //   108: anewarray 4	java/lang/Object
          //   111: dup
          //   112: iconst_0
          //   113: invokestatic 78	com/tencent/mm/sdk/platformtools/bg:Pv	()J
          //   116: aload_0
          //   117: getfield 28	com/tencent/mm/plugin/mmsight/model/n$1:fJi	J
          //   120: lsub
          //   121: invokestatic 63	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   124: aastore
          //   125: invokestatic 103	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   128: aload_0
          //   129: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   132: getfield 94	com/tencent/mm/plugin/mmsight/model/n:mZh	Lcom/tencent/mm/compatible/d/c$a$a;
          //   135: getfield 109	com/tencent/mm/compatible/d/c$a$a:fPj	Landroid/hardware/Camera;
          //   138: astore_2
          //   139: aload_2
          //   140: aconst_null
          //   141: invokevirtual 115	android/hardware/Camera:setPreviewCallback	(Landroid/hardware/Camera$PreviewCallback;)V
          //   144: aload_2
          //   145: invokevirtual 118	android/hardware/Camera:stopPreview	()V
          //   148: aload_2
          //   149: invokevirtual 121	android/hardware/Camera:release	()V
          //   152: aload_0
          //   153: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   156: aconst_null
          //   157: putfield 94	com/tencent/mm/plugin/mmsight/model/n:mZh	Lcom/tencent/mm/compatible/d/c$a$a;
          //   160: aload_0
          //   161: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   164: getfield 87	com/tencent/mm/plugin/mmsight/model/n:lock	Ljava/lang/Object;
          //   167: invokevirtual 124	java/lang/Object:notify	()V
          //   170: aload_1
          //   171: monitorexit
          //   172: ldc2_w 51
          //   175: ldc 53
          //   177: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   180: return
          //   181: astore_2
          //   182: ldc 55
          //   184: ldc 126
          //   186: iconst_1
          //   187: anewarray 4	java/lang/Object
          //   190: dup
          //   191: iconst_0
          //   192: aload_2
          //   193: invokevirtual 130	java/lang/Exception:getMessage	()Ljava/lang/String;
          //   196: aastore
          //   197: invokestatic 103	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   200: aload_0
          //   201: getfield 24	com/tencent/mm/plugin/mmsight/model/n$1:mZk	Lcom/tencent/mm/plugin/mmsight/model/n;
          //   204: aconst_null
          //   205: putfield 94	com/tencent/mm/plugin/mmsight/model/n:mZh	Lcom/tencent/mm/compatible/d/c$a$a;
          //   208: goto -125 -> 83
          //   211: astore_2
          //   212: aload_1
          //   213: monitorexit
          //   214: aload_2
          //   215: athrow
          //   216: astore_2
          //   217: ldc 55
          //   219: ldc -124
          //   221: iconst_1
          //   222: anewarray 4	java/lang/Object
          //   225: dup
          //   226: iconst_0
          //   227: aload_2
          //   228: invokevirtual 130	java/lang/Exception:getMessage	()Ljava/lang/String;
          //   231: aastore
          //   232: invokestatic 103	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   235: goto -75 -> 160
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	238	0	this	1
          //   62	151	1	localObject1	Object
          //   138	11	2	localCamera	android.hardware.Camera
          //   181	12	2	localException1	Exception
          //   211	4	2	localObject2	Object
          //   216	12	2	localException2	Exception
          // Exception table:
          //   from	to	target	type
          //   65	83	181	java/lang/Exception
          //   65	83	211	finally
          //   83	128	211	finally
          //   128	160	211	finally
          //   160	172	211	finally
          //   182	208	211	finally
          //   212	214	211	finally
          //   217	235	211	finally
          //   128	160	216	java/lang/Exception
        }
      }, "SightCamera_openCamera");
      try
      {
        this.lock.wait(30000L);
        if ((this.mZh != null) && (this.mZh.fPj != null))
        {
          w.i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", new Object[] { Long.valueOf(l2), Long.valueOf(bg.Pv() - l1), this.mZh.fPj });
          paramContext = this.mZh;
          GMTrace.o(20192386088960L, 150445);
          return paramContext;
        }
      }
      catch (InterruptedException paramContext)
      {
        for (;;)
        {
          w.e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", new Object[] { paramContext.getMessage() });
        }
      }
    }
    this.mZg = true;
    w.e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", new Object[] { Long.valueOf(bg.Pv() - l1) });
    GMTrace.o(20192386088960L, 150445);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */