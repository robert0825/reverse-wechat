package com.tencent.mm.ai;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.bv;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class c
  implements Runnable
{
  int gBG;
  private d gBH;
  b gBI;
  private long gBJ;
  private long gBK;
  private long gBL;
  String gBM;
  private String gBN;
  
  c()
  {
    GMTrace.i(20306739593216L, 151297);
    this.gBG = 0;
    this.gBH = null;
    this.gBI = new b();
    this.gBJ = 0L;
    this.gBK = 0L;
    this.gBL = 0L;
    this.gBM = null;
    this.gBN = null;
    if (this.gBM == null)
    {
      this.gBM = (com.tencent.mm.loader.stub.a.ghv + "ProcessDetector");
      File localFile = new File(this.gBM);
      if (!localFile.exists()) {
        localFile.mkdir();
      }
    }
    if (ab.bPY())
    {
      this.gBN = (this.gBM + "/mm");
      GMTrace.o(20306739593216L, 151297);
      return;
    }
    if (ab.bPZ()) {
      this.gBN = (this.gBM + "/push");
    }
    GMTrace.o(20306739593216L, 151297);
  }
  
  private static void a(b paramb)
  {
    GMTrace.i(20307276464128L, 151301);
    if (paramb == null)
    {
      GMTrace.o(20307276464128L, 151301);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject;
    for (;;)
    {
      try
      {
        localIterator = paramb.gBO.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (d)localIterator.next();
        if (localObject == null)
        {
          paramb.gBO.remove(localObject);
          continue;
        }
        if (l - ((d)localObject).endTime < 259200000L) {
          break;
        }
      }
      catch (Exception paramb)
      {
        w.printErrStackTrace("MicroMsg.ActiveDetector.ProcessDetector", paramb, "check data exception.", new Object[0]);
        GMTrace.o(20307276464128L, 151301);
        return;
      }
      paramb.gBO.remove(localObject);
    }
    Iterator localIterator = paramb.gBP.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if (localObject == null)
      {
        paramb.gBP.remove(localObject);
      }
      else
      {
        if (l - ((a)localObject).time < 259200000L) {
          break;
        }
        paramb.gBP.remove(localObject);
      }
    }
    localIterator = paramb.gBQ.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if (localObject == null)
      {
        paramb.gBQ.remove(localObject);
      }
      else
      {
        if (l - ((a)localObject).time < 259200000L) {
          break;
        }
        paramb.gBQ.remove(localObject);
      }
    }
    localIterator = paramb.gBR.iterator();
    while (localIterator.hasNext())
    {
      localObject = (c)localIterator.next();
      if (localObject == null)
      {
        paramb.gBR.remove(localObject);
      }
      else
      {
        if (l - ((c)localObject).gBS < 259200000L) {
          break;
        }
        paramb.gBR.remove(localObject);
      }
    }
    GMTrace.o(20307276464128L, 151301);
  }
  
  /* Error */
  final void GH()
  {
    // Byte code:
    //   0: ldc2_w 174
    //   3: ldc -80
    //   5: invokestatic 44	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 51	com/tencent/mm/ai/c:gBI	Lcom/tencent/mm/ai/c$b;
    //   12: ifnull +28 -> 40
    //   15: aload_0
    //   16: getfield 51	com/tencent/mm/ai/c:gBI	Lcom/tencent/mm/ai/c$b;
    //   19: getfield 123	com/tencent/mm/ai/c$b:gBO	Ljava/util/List;
    //   22: ifnull +18 -> 40
    //   25: aload_0
    //   26: getfield 51	com/tencent/mm/ai/c:gBI	Lcom/tencent/mm/ai/c$b;
    //   29: getfield 123	com/tencent/mm/ai/c$b:gBO	Ljava/util/List;
    //   32: invokeinterface 179 1 0
    //   37: ifeq +12 -> 49
    //   40: ldc2_w 174
    //   43: ldc -80
    //   45: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: return
    //   49: ldc -112
    //   51: ldc -75
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: aload_0
    //   60: getfield 61	com/tencent/mm/ai/c:gBN	Ljava/lang/String;
    //   63: aastore
    //   64: invokestatic 184	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload_0
    //   68: getfield 51	com/tencent/mm/ai/c:gBI	Lcom/tencent/mm/ai/c$b;
    //   71: astore_3
    //   72: new 186	java/io/FileOutputStream
    //   75: dup
    //   76: aload_0
    //   77: getfield 61	com/tencent/mm/ai/c:gBN	Ljava/lang/String;
    //   80: invokespecial 187	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   83: astore_1
    //   84: aload_3
    //   85: ifnull +238 -> 323
    //   88: new 189	java/io/ObjectOutputStream
    //   91: dup
    //   92: aload_1
    //   93: invokespecial 192	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   96: astore_2
    //   97: aload_2
    //   98: astore_1
    //   99: aload_2
    //   100: aload_3
    //   101: invokevirtual 196	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   104: aload_2
    //   105: astore_1
    //   106: aload_2
    //   107: invokevirtual 199	java/io/ObjectOutputStream:flush	()V
    //   110: aload_2
    //   111: invokevirtual 202	java/io/ObjectOutputStream:close	()V
    //   114: ldc2_w 174
    //   117: ldc -80
    //   119: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   122: return
    //   123: astore_1
    //   124: ldc -112
    //   126: new 63	java/lang/StringBuilder
    //   129: dup
    //   130: ldc -52
    //   132: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   135: aload_1
    //   136: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: iconst_1
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload_0
    //   152: getfield 61	com/tencent/mm/ai/c:gBN	Ljava/lang/String;
    //   155: aastore
    //   156: invokestatic 211	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: ldc2_w 174
    //   162: ldc -80
    //   164: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   167: return
    //   168: astore_1
    //   169: ldc -43
    //   171: new 63	java/lang/StringBuilder
    //   174: dup
    //   175: ldc -41
    //   177: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   180: aload_1
    //   181: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   184: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: invokestatic 219	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: ldc2_w 174
    //   196: ldc -80
    //   198: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   201: return
    //   202: astore_3
    //   203: aconst_null
    //   204: astore_2
    //   205: aload_2
    //   206: astore_1
    //   207: ldc -43
    //   209: new 63	java/lang/StringBuilder
    //   212: dup
    //   213: ldc -35
    //   215: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   218: aload_3
    //   219: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   222: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: invokestatic 219	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   231: aload_2
    //   232: ifnull +91 -> 323
    //   235: aload_2
    //   236: invokevirtual 202	java/io/ObjectOutputStream:close	()V
    //   239: ldc2_w 174
    //   242: ldc -80
    //   244: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   247: return
    //   248: astore_1
    //   249: ldc -43
    //   251: new 63	java/lang/StringBuilder
    //   254: dup
    //   255: ldc -41
    //   257: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   260: aload_1
    //   261: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   264: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 219	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: ldc2_w 174
    //   276: ldc -80
    //   278: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   281: return
    //   282: astore_2
    //   283: aconst_null
    //   284: astore_1
    //   285: aload_1
    //   286: ifnull +7 -> 293
    //   289: aload_1
    //   290: invokevirtual 202	java/io/ObjectOutputStream:close	()V
    //   293: aload_2
    //   294: athrow
    //   295: astore_1
    //   296: ldc -43
    //   298: new 63	java/lang/StringBuilder
    //   301: dup
    //   302: ldc -41
    //   304: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   307: aload_1
    //   308: invokevirtual 208	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   311: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: invokestatic 219	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: goto -27 -> 293
    //   323: ldc2_w 174
    //   326: ldc -80
    //   328: invokestatic 101	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   331: return
    //   332: astore_2
    //   333: goto -48 -> 285
    //   336: astore_3
    //   337: goto -132 -> 205
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	340	0	this	c
    //   83	23	1	localObject1	Object
    //   123	13	1	localException1	Exception
    //   168	13	1	localException2	Exception
    //   206	1	1	localObject2	Object
    //   248	13	1	localException3	Exception
    //   284	6	1	localObject3	Object
    //   295	13	1	localException4	Exception
    //   96	140	2	localObjectOutputStream	java.io.ObjectOutputStream
    //   282	12	2	localObject4	Object
    //   332	1	2	localObject5	Object
    //   71	30	3	localb	b
    //   202	17	3	localException5	Exception
    //   336	1	3	localException6	Exception
    // Exception table:
    //   from	to	target	type
    //   67	84	123	java/lang/Exception
    //   114	122	123	java/lang/Exception
    //   169	201	123	java/lang/Exception
    //   239	247	123	java/lang/Exception
    //   249	281	123	java/lang/Exception
    //   293	295	123	java/lang/Exception
    //   296	320	123	java/lang/Exception
    //   110	114	168	java/lang/Exception
    //   88	97	202	java/lang/Exception
    //   235	239	248	java/lang/Exception
    //   88	97	282	finally
    //   289	293	295	java/lang/Exception
    //   99	104	332	finally
    //   106	110	332	finally
    //   207	231	332	finally
    //   99	104	336	java/lang/Exception
    //   106	110	336	java/lang/Exception
  }
  
  final void clear()
  {
    GMTrace.i(20307008028672L, 151299);
    this.gBK = 0L;
    this.gBL = 0L;
    GMTrace.o(20307008028672L, 151299);
  }
  
  public final void run()
  {
    GMTrace.i(20306873810944L, 151298);
    clear();
    this.gBK = System.currentTimeMillis();
    this.gBL = this.gBK;
    this.gBH = new d();
    this.gBH.a(Process.myPid(), this.gBK, this.gBL, this.gBG);
    if (this.gBI.gBO.isEmpty()) {}
    try
    {
      localObject1 = (b)b.g(new FileInputStream(this.gBN));
      if (localObject1 != null)
      {
        ((b)localObject1).gBP.addAll(this.gBI.gBP);
        ((b)localObject1).gBQ.addAll(this.gBI.gBQ);
        ((b)localObject1).gBR.addAll(this.gBI.gBR);
        this.gBI = ((b)localObject1);
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          Object localObject1;
          i = Process.myPid();
          l1 = System.currentTimeMillis();
          locald = this.gBH;
          l2 = this.gBL;
          j = this.gBG;
          long l3 = l1 - l2;
          if ((locald.gBz != j) || (l3 > 10000L))
          {
            localObject1 = d.b(i, l2, l1, j);
            if (locald.gBz != j) {
              ((d)localObject1).gBB = true;
            }
            if (l3 <= 10000L) {
              break;
            }
            ((d)localObject1).gBA = false;
            break;
            if (localObject1 == null) {
              continue;
            }
            w.i("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]create process status:%s", new Object[] { localObject1 });
            this.gBH = ((d)localObject1);
            this.gBI.gBO.add(this.gBH);
            w.d("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]send broadcast:%s,receive broadcast:%s", new Object[] { this.gBI.gBP, this.gBI.gBQ });
            this.gBL = l1;
            if ((this.gBJ <= 0L) || (l1 - this.gBJ > 60000L))
            {
              this.gBJ = l1;
              GH();
              w.i("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]one minute per log, current process status:%s", new Object[] { this.gBH });
              w.i("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]one minute per log, send broadcast size:%s,receive broadcast size:%s", new Object[] { Integer.valueOf(this.gBI.gBP.size()), Integer.valueOf(this.gBI.gBQ.size()) });
            }
            Thread.sleep(5000L);
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          int i;
          long l1;
          d locald;
          long l2;
          int j;
          w.i("MicroMsg.ActiveDetector.ProcessDetector", "process detector thread interrupt.thread id:%s", new Object[] { Integer.valueOf(Process.myTid()) });
          Thread.currentThread().interrupt();
          continue;
          localException1 = localException1;
          w.e("MicroMsg.ActiveDetector.ProcessDetector", "%s,read exception:" + localException1.getMessage(), new Object[] { this.gBN });
          continue;
          locald.a(i, l2, l1, j);
          Object localObject2 = null;
          continue;
          w.d("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]current process status:%s", new Object[] { this.gBH });
        }
        catch (Exception localException2)
        {
          w.e("MicroMsg.ActiveDetector.ProcessDetector", "exception,%s", new Object[] { localException2.getMessage() });
        }
      }
      GMTrace.o(20306873810944L, 151298);
      return;
    }
    a(this.gBI);
    this.gBI.gBO.add(this.gBH);
    w.i("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]exist process status data size:%s,send broadcast size:%s, receive broadcast size:%s", new Object[] { Integer.valueOf(this.gBI.gBO.size()), Integer.valueOf(this.gBI.gBP.size()), Integer.valueOf(this.gBI.gBQ.size()) });
    if (!Thread.currentThread().isInterrupted()) {}
    for (;;) {}
  }
  
  static final class a
    implements Serializable
  {
    long gov;
    long time;
    int type;
    
    a(long paramLong1, long paramLong2, int paramInt)
    {
      GMTrace.i(20307410681856L, 151302);
      this.gov = 0L;
      this.time = 0L;
      this.type = 0;
      this.gov = paramLong1;
      this.time = paramLong2;
      this.type = paramInt;
      GMTrace.o(20307410681856L, 151302);
    }
    
    public final String toString()
    {
      GMTrace.i(20307544899584L, 151303);
      String str = String.format("serverTime:%s,time:%s,type:%s", new Object[] { a.ak(this.gov), a.ak(this.time), Integer.valueOf(this.type) });
      GMTrace.o(20307544899584L, 151303);
      return str;
    }
  }
  
  static final class b
    implements Serializable
  {
    final List<c.d> gBO;
    final List<c.a> gBP;
    final List<c.a> gBQ;
    final List<c.c> gBR;
    
    b()
    {
      GMTrace.i(20310363471872L, 151324);
      this.gBO = new CopyOnWriteArrayList();
      this.gBP = new CopyOnWriteArrayList();
      this.gBQ = new CopyOnWriteArrayList();
      this.gBR = new CopyOnWriteArrayList();
      GMTrace.o(20310363471872L, 151324);
    }
  }
  
  static final class c
    implements Serializable
  {
    long gBD;
    long gBE;
    long gBF;
    long gBS;
    long gov;
    int pid;
    
    c(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
    {
      GMTrace.i(20310095036416L, 151322);
      this.pid = 0;
      this.gov = 0L;
      this.gBS = 0L;
      this.gBD = 0L;
      this.gBE = 0L;
      this.gBF = 0L;
      this.pid = paramInt;
      this.gov = paramLong1;
      this.gBS = paramLong2;
      this.gBD = paramLong3;
      this.gBE = paramLong4;
      this.gBF = paramLong5;
      GMTrace.o(20310095036416L, 151322);
    }
    
    public final String toString()
    {
      GMTrace.i(20310229254144L, 151323);
      String str = String.format("pid:%s, server time:%s, client time:%s, msg server time:%s, intervalTime:%s, msg server id:%s", new Object[] { Integer.valueOf(this.pid), a.ak(this.gov), a.ak(this.gBS), a.ak(this.gBD), Long.valueOf(this.gBE), Long.valueOf(this.gBF) });
      GMTrace.o(20310229254144L, 151323);
      return str;
    }
  }
  
  public static final class d
    implements Serializable
  {
    long endTime;
    boolean gBA;
    boolean gBB;
    long gBT;
    int gBz;
    int pid;
    long startTime;
    
    public d()
    {
      GMTrace.i(20309155512320L, 151315);
      this.pid = 0;
      this.gBT = 0L;
      this.startTime = 0L;
      this.endTime = 0L;
      this.gBz = 0;
      this.gBA = true;
      this.gBB = false;
      GMTrace.o(20309155512320L, 151315);
    }
    
    static d b(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
    {
      GMTrace.i(20309423947776L, 151317);
      d locald = new d();
      locald.pid = paramInt1;
      locald.startTime = paramLong1;
      locald.endTime = paramLong2;
      locald.gBz = paramInt2;
      GMTrace.o(20309423947776L, 151317);
      return locald;
    }
    
    final void a(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
    {
      GMTrace.i(20309289730048L, 151316);
      this.pid = paramInt1;
      if (this.startTime <= 0L)
      {
        this.startTime = paramLong1;
        this.gBT = bv.BT();
      }
      this.endTime = paramLong2;
      this.gBz = paramInt2;
      GMTrace.o(20309289730048L, 151316);
    }
    
    public final String toString()
    {
      GMTrace.i(20309558165504L, 151318);
      String str = String.format("pid:%s,startServerTime:%s,startTime:%s,endTime:%s,normalExecute:%s,changedNetworkStatus:%s,networkStatus:%s", new Object[] { Integer.valueOf(this.pid), a.ak(this.gBT), a.ak(this.startTime), a.ak(this.endTime), Boolean.valueOf(this.gBA), Boolean.valueOf(this.gBB), Integer.valueOf(this.gBz) });
      GMTrace.o(20309558165504L, 151318);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ai\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */