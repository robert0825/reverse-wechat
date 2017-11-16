package com.tencent.mm.plugin.report.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.protocal.c.ahj;
import com.tencent.mm.protocal.c.app;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static String filename;
  private static Object lock;
  private a oql;
  private int oqm;
  private int oqn;
  private int oqo;
  private int oqp;
  
  static
  {
    GMTrace.i(13107703316480L, 97660);
    filename = "heavy_user_id_mapping.dat";
    lock = new Object();
    GMTrace.o(13107703316480L, 97660);
  }
  
  public a()
  {
    GMTrace.i(13107032227840L, 97655);
    this.oql = null;
    this.oqm = 0;
    this.oqn = 1;
    this.oqo = 2;
    this.oqp = 3;
    this.oql = null;
    GMTrace.o(13107032227840L, 97655);
  }
  
  private static void a(ahj paramahj, boolean paramBoolean)
  {
    GMTrace.i(13107166445568L, 97656);
    app localapp;
    if (paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.HeavyUserIDMappingStg", "################################# svr heavy user strategy #############################");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + paramahj.uwM + ", ret:" + paramahj.uwO);
      paramahj = paramahj.uwN.iterator();
      while (paramahj.hasNext())
      {
        localapp = (app)paramahj.next();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.HeavyUserIDMappingStg", "origin:" + localapp.uFm + ", userid:" + localapp.uFn);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.HeavyUserIDMappingStg", "#################################  End ################################################");
      GMTrace.o(13107166445568L, 97656);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.HeavyUserIDMappingStg", "################################# Local heavy user strategy #############################");
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + paramahj.uwM + ", ret:" + paramahj.uwO);
    paramahj = paramahj.uwN.iterator();
    while (paramahj.hasNext())
    {
      localapp = (app)paramahj.next();
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.HeavyUserIDMappingStg", "origin:" + localapp.uFm + ", userid:" + localapp.uFn);
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.HeavyUserIDMappingStg", "#################################  End ################################################");
    GMTrace.o(13107166445568L, 97656);
  }
  
  public static ahj bbN()
  {
    GMTrace.i(13107434881024L, 97658);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingObj");
    synchronized (lock)
    {
      byte[] arrayOfByte1 = e.d(com.tencent.mm.storage.w.ghv + filename, 0, -1);
      if (arrayOfByte1 == null)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.HeavyUserIDMappingStg", "get file content fail, filename" + filename);
        GMTrace.o(13107434881024L, 97658);
        return null;
      }
    }
    ??? = new ahj();
    try
    {
      ((ahj)???).aD(arrayOfByte2);
      a((ahj)???, false);
      GMTrace.o(13107434881024L, 97658);
      return (ahj)???;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", localIOException, "", new Object[0]);
      GMTrace.o(13107434881024L, 97658);
    }
    return null;
  }
  
  /* Error */
  public final void a(ahj paramahj, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 175
    //   3: ldc -79
    //   5: invokestatic 29	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 61
    //   10: new 70	java/lang/StringBuilder
    //   13: dup
    //   14: ldc -77
    //   16: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: iload_2
    //   20: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   23: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: aload_1
    //   30: ifnonnull +19 -> 49
    //   33: ldc 61
    //   35: ldc -75
    //   37: invokestatic 160	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: ldc2_w 175
    //   43: ldc -79
    //   45: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: return
    //   49: aload_0
    //   50: getfield 49	com/tencent/mm/plugin/report/b/a:oqm	I
    //   53: aload_1
    //   54: getfield 92	com/tencent/mm/protocal/c/ahj:uwO	I
    //   57: if_icmpeq +104 -> 161
    //   60: new 70	java/lang/StringBuilder
    //   63: dup
    //   64: ldc -73
    //   66: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: astore 6
    //   71: aload_1
    //   72: getfield 92	com/tencent/mm/protocal/c/ahj:uwO	I
    //   75: istore_2
    //   76: aload_0
    //   77: getfield 51	com/tencent/mm/plugin/report/b/a:oqn	I
    //   80: iload_2
    //   81: if_icmpne +43 -> 124
    //   84: ldc -71
    //   86: astore 5
    //   88: ldc 61
    //   90: aload 6
    //   92: aload 5
    //   94: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc -69
    //   99: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload_1
    //   103: getfield 80	com/tencent/mm/protocal/c/ahj:uwM	I
    //   106: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   109: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   115: ldc2_w 175
    //   118: ldc -79
    //   120: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   123: return
    //   124: aload_0
    //   125: getfield 53	com/tencent/mm/plugin/report/b/a:oqo	I
    //   128: iload_2
    //   129: if_icmpne +10 -> 139
    //   132: ldc -64
    //   134: astore 5
    //   136: goto -48 -> 88
    //   139: aload_0
    //   140: getfield 55	com/tencent/mm/plugin/report/b/a:oqp	I
    //   143: iload_2
    //   144: if_icmpne +10 -> 154
    //   147: ldc -62
    //   149: astore 5
    //   151: goto -63 -> 88
    //   154: ldc -60
    //   156: astore 5
    //   158: goto -70 -> 88
    //   161: aload_0
    //   162: iload_2
    //   163: invokevirtual 200	com/tencent/mm/plugin/report/b/a:tn	(I)I
    //   166: istore_3
    //   167: aload_1
    //   168: getfield 80	com/tencent/mm/protocal/c/ahj:uwM	I
    //   171: istore 4
    //   173: iload_3
    //   174: iload 4
    //   176: if_icmpne +34 -> 210
    //   179: ldc 61
    //   181: new 70	java/lang/StringBuilder
    //   184: dup
    //   185: ldc -54
    //   187: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: iload 4
    //   192: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   195: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokestatic 135	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   201: ldc2_w 175
    //   204: ldc -79
    //   206: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   209: return
    //   210: ldc 61
    //   212: new 70	java/lang/StringBuilder
    //   215: dup
    //   216: ldc -52
    //   218: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: aload_0
    //   222: iload_2
    //   223: invokevirtual 200	com/tencent/mm/plugin/report/b/a:tn	(I)I
    //   226: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   229: ldc -50
    //   231: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: iload 4
    //   236: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   239: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   245: aload_1
    //   246: iconst_1
    //   247: invokestatic 167	com/tencent/mm/plugin/report/b/a:a	(Lcom/tencent/mm/protocal/c/ahj;Z)V
    //   250: aload_1
    //   251: invokevirtual 210	com/tencent/mm/protocal/c/ahj:toByteArray	()[B
    //   254: astore 6
    //   256: getstatic 38	com/tencent/mm/plugin/report/b/a:lock	Ljava/lang/Object;
    //   259: astore 5
    //   261: aload 5
    //   263: monitorenter
    //   264: ldc 61
    //   266: new 70	java/lang/StringBuilder
    //   269: dup
    //   270: ldc -44
    //   272: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   275: aload_1
    //   276: getfield 80	com/tencent/mm/protocal/c/ahj:uwM	I
    //   279: invokevirtual 84	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   282: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: getstatic 150	com/tencent/mm/storage/w:ghv	Ljava/lang/String;
    //   291: getstatic 33	com/tencent/mm/plugin/report/b/a:filename	Ljava/lang/String;
    //   294: aload 6
    //   296: invokestatic 215	com/tencent/mm/a/e:a	(Ljava/lang/String;Ljava/lang/String;[B)I
    //   299: pop
    //   300: aload 5
    //   302: monitorexit
    //   303: ldc2_w 175
    //   306: ldc -79
    //   308: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: return
    //   312: astore_1
    //   313: ldc 61
    //   315: aload_1
    //   316: ldc -87
    //   318: iconst_0
    //   319: anewarray 4	java/lang/Object
    //   322: invokestatic 173	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   325: ldc2_w 175
    //   328: ldc -79
    //   330: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   333: return
    //   334: astore_1
    //   335: aload 5
    //   337: monitorexit
    //   338: aload_1
    //   339: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	340	0	this	a
    //   0	340	1	paramahj	ahj
    //   0	340	2	paramInt	int
    //   166	11	3	i	int
    //   171	64	4	j	int
    //   69	226	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   250	256	312	java/io/IOException
    //   264	303	334	finally
    //   335	338	334	finally
  }
  
  public final int tn(int paramInt)
  {
    GMTrace.i(13107569098752L, 97659);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingVersion,chanel:" + paramInt);
    ahj localahj = bbN();
    if (localahj == null)
    {
      GMTrace.o(13107569098752L, 97659);
      return 0;
    }
    paramInt = localahj.uwM;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.HeavyUserIDMappingStg", "version:" + paramInt);
    GMTrace.o(13107569098752L, 97659);
    return paramInt;
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */