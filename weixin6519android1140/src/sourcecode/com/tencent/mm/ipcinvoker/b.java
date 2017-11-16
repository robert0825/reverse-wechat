package com.tencent.mm.ipcinvoker;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.a.c;
import com.tencent.mm.ipcinvoker.b.a;
import com.tencent.mm.ipcinvoker.b.a.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b
  implements c
{
  private static volatile b fVc;
  private Map<String, Class<?>> fVd;
  public Map<String, a> fVe;
  private volatile boolean fVf;
  public ae mHandler;
  
  private b()
  {
    GMTrace.i(18711964549120L, 139415);
    this.fVd = new HashMap();
    this.fVe = new ConcurrentHashMap();
    HandlerThread localHandlerThread = e.SV("IPCBridgeThread#" + hashCode());
    localHandlerThread.start();
    this.mHandler = new ae(localHandlerThread.getLooper());
    GMTrace.o(18711964549120L, 139415);
  }
  
  public static b vN()
  {
    GMTrace.i(18711830331392L, 139414);
    if (fVc == null) {}
    try
    {
      if (fVc == null) {
        fVc = new b();
      }
      b localb = fVc;
      GMTrace.o(18711830331392L, 139414);
      return localb;
    }
    finally {}
  }
  
  public final <T extends BaseIPCService> void b(String paramString, Class<T> paramClass)
  {
    GMTrace.i(18712501420032L, 139419);
    this.fVd.put(paramString, paramClass);
    GMTrace.o(18712501420032L, 139419);
  }
  
  /* Error */
  public final a ek(final String paramString)
  {
    // Byte code:
    //   0: ldc2_w 122
    //   3: ldc 124
    //   5: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   12: aload_1
    //   13: invokeinterface 128 2 0
    //   18: checkcast 14	com/tencent/mm/ipcinvoker/b$a
    //   21: astore 4
    //   23: aload 4
    //   25: ifnonnull +550 -> 575
    //   28: aload_0
    //   29: getfield 130	com/tencent/mm/ipcinvoker/b:fVf	Z
    //   32: ifeq +28 -> 60
    //   35: ldc -124
    //   37: ldc -122
    //   39: iconst_1
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: aload_1
    //   46: aastore
    //   47: invokestatic 139	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: ldc2_w 122
    //   53: ldc 124
    //   55: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: aconst_null
    //   59: areturn
    //   60: invokestatic 144	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   63: invokestatic 147	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   66: if_acmpne +20 -> 86
    //   69: ldc -124
    //   71: ldc -107
    //   73: invokestatic 153	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   76: ldc2_w 122
    //   79: ldc 124
    //   81: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: aconst_null
    //   85: areturn
    //   86: aload_0
    //   87: getfield 44	com/tencent/mm/ipcinvoker/b:fVd	Ljava/util/Map;
    //   90: aload_1
    //   91: invokeinterface 128 2 0
    //   96: checkcast 155	java/lang/Class
    //   99: astore 5
    //   101: aload 5
    //   103: ifnonnull +28 -> 131
    //   106: ldc -124
    //   108: ldc -99
    //   110: iconst_1
    //   111: anewarray 4	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload_1
    //   117: aastore
    //   118: invokestatic 159	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: ldc2_w 122
    //   124: ldc 124
    //   126: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   129: aconst_null
    //   130: areturn
    //   131: new 14	com/tencent/mm/ipcinvoker/b$a
    //   134: dup
    //   135: invokespecial 160	com/tencent/mm/ipcinvoker/b$a:<init>	()V
    //   138: astore 4
    //   140: aload_0
    //   141: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   144: astore 6
    //   146: aload 6
    //   148: monitorenter
    //   149: aload_0
    //   150: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   153: aload_1
    //   154: aload 4
    //   156: invokeinterface 113 3 0
    //   161: pop
    //   162: aload 6
    //   164: monitorexit
    //   165: invokestatic 166	com/tencent/mm/ipcinvoker/d:getContext	()Landroid/content/Context;
    //   168: astore 6
    //   170: new 8	com/tencent/mm/ipcinvoker/b$1
    //   173: dup
    //   174: aload_0
    //   175: aload 4
    //   177: aload 6
    //   179: aload_1
    //   180: invokespecial 169	com/tencent/mm/ipcinvoker/b$1:<init>	(Lcom/tencent/mm/ipcinvoker/b;Lcom/tencent/mm/ipcinvoker/b$a;Landroid/content/Context;Ljava/lang/String;)V
    //   183: astore 7
    //   185: aload 4
    //   187: monitorenter
    //   188: aload 4
    //   190: iconst_1
    //   191: putfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   194: aload 4
    //   196: aload 7
    //   198: putfield 176	com/tencent/mm/ipcinvoker/b$a:fVl	Landroid/content/ServiceConnection;
    //   201: aload 4
    //   203: monitorexit
    //   204: new 178	android/content/Intent
    //   207: dup
    //   208: aload 6
    //   210: aload 5
    //   212: invokespecial 181	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   215: astore 5
    //   217: ldc -124
    //   219: ldc -73
    //   221: iconst_3
    //   222: anewarray 4	java/lang/Object
    //   225: dup
    //   226: iconst_0
    //   227: aload 4
    //   229: invokevirtual 60	java/lang/Object:hashCode	()I
    //   232: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   235: aastore
    //   236: dup
    //   237: iconst_1
    //   238: invokestatic 195	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   241: invokevirtual 199	java/lang/Thread:getId	()J
    //   244: invokestatic 204	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   247: aastore
    //   248: dup
    //   249: iconst_2
    //   250: aload 5
    //   252: aastore
    //   253: invokestatic 139	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: aload 6
    //   258: aload 5
    //   260: aload 7
    //   262: bipush 33
    //   264: invokevirtual 210	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   267: pop
    //   268: aload 4
    //   270: new 10	com/tencent/mm/ipcinvoker/b$2
    //   273: dup
    //   274: aload_0
    //   275: aload 4
    //   277: aload_1
    //   278: invokespecial 213	com/tencent/mm/ipcinvoker/b$2:<init>	(Lcom/tencent/mm/ipcinvoker/b;Lcom/tencent/mm/ipcinvoker/b$a;Ljava/lang/String;)V
    //   281: putfield 217	com/tencent/mm/ipcinvoker/b$a:fVn	Ljava/lang/Runnable;
    //   284: aload_0
    //   285: getfield 90	com/tencent/mm/ipcinvoker/b:mHandler	Lcom/tencent/mm/sdk/platformtools/ae;
    //   288: astore 5
    //   290: aload 4
    //   292: getfield 217	com/tencent/mm/ipcinvoker/b$a:fVn	Ljava/lang/Runnable;
    //   295: astore 6
    //   297: invokestatic 147	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   300: invokestatic 144	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   303: if_acmpne +77 -> 380
    //   306: ldc2_w 218
    //   309: lstore_2
    //   310: aload 5
    //   312: aload 6
    //   314: lload_2
    //   315: invokevirtual 223	com/tencent/mm/sdk/platformtools/ae:postDelayed	(Ljava/lang/Runnable;J)Z
    //   318: pop
    //   319: aload 4
    //   321: monitorenter
    //   322: aload 4
    //   324: getfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   327: ifeq +8 -> 335
    //   330: aload 4
    //   332: invokevirtual 226	java/lang/Object:wait	()V
    //   335: aload 4
    //   337: monitorexit
    //   338: aload 4
    //   340: monitorenter
    //   341: aload 4
    //   343: iconst_0
    //   344: putfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   347: aload 4
    //   349: monitorexit
    //   350: aload 4
    //   352: astore_1
    //   353: aload_1
    //   354: getfield 230	com/tencent/mm/ipcinvoker/b$a:fVk	Lcom/tencent/mm/ipcinvoker/b/a;
    //   357: astore_1
    //   358: ldc2_w 122
    //   361: ldc 124
    //   363: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   366: aload_1
    //   367: areturn
    //   368: astore_1
    //   369: aload 6
    //   371: monitorexit
    //   372: aload_1
    //   373: athrow
    //   374: astore_1
    //   375: aload 4
    //   377: monitorexit
    //   378: aload_1
    //   379: athrow
    //   380: ldc2_w 231
    //   383: lstore_2
    //   384: goto -74 -> 310
    //   387: astore 5
    //   389: aload 4
    //   391: monitorexit
    //   392: aload 5
    //   394: athrow
    //   395: astore 5
    //   397: ldc -124
    //   399: ldc -22
    //   401: iconst_1
    //   402: anewarray 4	java/lang/Object
    //   405: dup
    //   406: iconst_0
    //   407: aload 5
    //   409: aastore
    //   410: invokestatic 237	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   413: aload_0
    //   414: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   417: astore 5
    //   419: aload 5
    //   421: monitorenter
    //   422: aload_0
    //   423: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   426: aload_1
    //   427: invokeinterface 240 2 0
    //   432: pop
    //   433: aload 5
    //   435: monitorexit
    //   436: aload 4
    //   438: monitorenter
    //   439: aload 4
    //   441: iconst_0
    //   442: putfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   445: aload 4
    //   447: monitorexit
    //   448: ldc2_w 122
    //   451: ldc 124
    //   453: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   456: aconst_null
    //   457: areturn
    //   458: astore_1
    //   459: aload 4
    //   461: monitorexit
    //   462: aload_1
    //   463: athrow
    //   464: astore_1
    //   465: aload 5
    //   467: monitorexit
    //   468: aload_1
    //   469: athrow
    //   470: astore_1
    //   471: aload 4
    //   473: monitorenter
    //   474: aload 4
    //   476: iconst_0
    //   477: putfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   480: aload 4
    //   482: monitorexit
    //   483: aload_1
    //   484: athrow
    //   485: astore_1
    //   486: aload 4
    //   488: monitorexit
    //   489: aload_1
    //   490: athrow
    //   491: astore 5
    //   493: ldc -124
    //   495: ldc -14
    //   497: iconst_1
    //   498: anewarray 4	java/lang/Object
    //   501: dup
    //   502: iconst_0
    //   503: aload 5
    //   505: invokestatic 248	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   508: aastore
    //   509: invokestatic 237	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   512: aload_0
    //   513: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   516: astore 5
    //   518: aload 5
    //   520: monitorenter
    //   521: aload_0
    //   522: getfield 49	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
    //   525: aload_1
    //   526: invokeinterface 240 2 0
    //   531: pop
    //   532: aload 5
    //   534: monitorexit
    //   535: aload 4
    //   537: monitorenter
    //   538: aload 4
    //   540: iconst_0
    //   541: putfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   544: aload 4
    //   546: monitorexit
    //   547: ldc2_w 122
    //   550: ldc 124
    //   552: invokestatic 93	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   555: aconst_null
    //   556: areturn
    //   557: astore_1
    //   558: aload 5
    //   560: monitorexit
    //   561: aload_1
    //   562: athrow
    //   563: astore_1
    //   564: aload 4
    //   566: monitorexit
    //   567: aload_1
    //   568: athrow
    //   569: astore_1
    //   570: aload 4
    //   572: monitorexit
    //   573: aload_1
    //   574: athrow
    //   575: aload 4
    //   577: astore_1
    //   578: aload 4
    //   580: getfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   583: ifeq -230 -> 353
    //   586: aload 4
    //   588: monitorenter
    //   589: aload 4
    //   591: getfield 172	com/tencent/mm/ipcinvoker/b$a:fVm	Z
    //   594: ifeq +8 -> 602
    //   597: aload 4
    //   599: invokevirtual 226	java/lang/Object:wait	()V
    //   602: aload 4
    //   604: monitorexit
    //   605: aload 4
    //   607: astore_1
    //   608: goto -255 -> 353
    //   611: astore_1
    //   612: aload 4
    //   614: monitorexit
    //   615: aload_1
    //   616: athrow
    //   617: astore_1
    //   618: ldc -124
    //   620: ldc -22
    //   622: iconst_1
    //   623: anewarray 4	java/lang/Object
    //   626: dup
    //   627: iconst_0
    //   628: aload_1
    //   629: aastore
    //   630: invokestatic 237	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   633: aload 4
    //   635: astore_1
    //   636: goto -283 -> 353
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	639	0	this	b
    //   0	639	1	paramString	String
    //   309	75	2	l	long
    //   21	613	4	locala	a
    //   99	212	5	localObject1	Object
    //   387	6	5	localObject2	Object
    //   395	13	5	localInterruptedException	InterruptedException
    //   417	49	5	localMap1	Map
    //   491	13	5	localSecurityException	SecurityException
    //   144	226	6	localObject3	Object
    //   183	78	7	local1	1
    // Exception table:
    //   from	to	target	type
    //   149	165	368	finally
    //   369	372	368	finally
    //   188	204	374	finally
    //   375	378	374	finally
    //   322	335	387	finally
    //   335	338	387	finally
    //   389	392	387	finally
    //   204	306	395	java/lang/InterruptedException
    //   310	322	395	java/lang/InterruptedException
    //   392	395	395	java/lang/InterruptedException
    //   341	350	458	finally
    //   459	462	458	finally
    //   422	436	464	finally
    //   465	468	464	finally
    //   204	306	470	finally
    //   310	322	470	finally
    //   392	395	470	finally
    //   397	422	470	finally
    //   468	470	470	finally
    //   493	521	470	finally
    //   561	563	470	finally
    //   439	448	485	finally
    //   486	489	485	finally
    //   204	306	491	java/lang/SecurityException
    //   310	322	491	java/lang/SecurityException
    //   392	395	491	java/lang/SecurityException
    //   521	535	557	finally
    //   558	561	557	finally
    //   538	547	563	finally
    //   564	567	563	finally
    //   474	483	569	finally
    //   570	573	569	finally
    //   589	602	611	finally
    //   602	605	611	finally
    //   612	615	611	finally
    //   586	589	617	java/lang/InterruptedException
    //   615	617	617	java/lang/InterruptedException
  }
  
  public final void el(final String paramString)
  {
    GMTrace.i(18712232984576L, 139417);
    if (d.em(paramString))
    {
      w.i("IPC.IPCBridgeManager", "the same process(%s), do not need to release IPCBridge.", new Object[] { paramString });
      GMTrace.o(18712232984576L, 139417);
      return;
    }
    final a locala;
    synchronized (this.fVe)
    {
      locala = (a)this.fVe.get(paramString);
      if (locala == null)
      {
        w.i("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, IPCBridgeWrapper is null.", new Object[] { paramString });
        GMTrace.o(18712232984576L, 139417);
        return;
      }
    }
    if (locala.fVm) {}
    try
    {
      locala.fVm = false;
      locala.notifyAll();
      if (locala.fVl == null)
      {
        w.i("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, ServiceConnection is null.", new Object[] { paramString });
        GMTrace.o(18712232984576L, 139417);
        return;
      }
    }
    finally {}
    this.mHandler.post(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 45
        //   3: ldc 47
        //   5: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: aload_0
        //   9: getfield 23	com/tencent/mm/ipcinvoker/b$3:fVj	Lcom/tencent/mm/ipcinvoker/b$a;
        //   12: astore_1
        //   13: aload_1
        //   14: monitorenter
        //   15: aload_0
        //   16: getfield 23	com/tencent/mm/ipcinvoker/b$3:fVj	Lcom/tencent/mm/ipcinvoker/b$a;
        //   19: getfield 53	com/tencent/mm/ipcinvoker/b$a:fVl	Landroid/content/ServiceConnection;
        //   22: astore_2
        //   23: aload_1
        //   24: monitorexit
        //   25: aload_2
        //   26: ifnonnull +35 -> 61
        //   29: ldc 55
        //   31: ldc 57
        //   33: iconst_1
        //   34: anewarray 4	java/lang/Object
        //   37: dup
        //   38: iconst_0
        //   39: aload_0
        //   40: getfield 25	com/tencent/mm/ipcinvoker/b$3:fVh	Ljava/lang/String;
        //   43: aastore
        //   44: invokestatic 62	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   47: ldc2_w 45
        //   50: ldc 47
        //   52: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   55: return
        //   56: astore_2
        //   57: aload_1
        //   58: monitorexit
        //   59: aload_2
        //   60: athrow
        //   61: invokestatic 68	com/tencent/mm/ipcinvoker/d:getContext	()Landroid/content/Context;
        //   64: aload_2
        //   65: invokevirtual 74	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
        //   68: aload_0
        //   69: getfield 21	com/tencent/mm/ipcinvoker/b$3:fVi	Lcom/tencent/mm/ipcinvoker/b;
        //   72: getfield 78	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
        //   75: astore_1
        //   76: aload_1
        //   77: monitorenter
        //   78: aload_0
        //   79: getfield 21	com/tencent/mm/ipcinvoker/b$3:fVi	Lcom/tencent/mm/ipcinvoker/b;
        //   82: getfield 78	com/tencent/mm/ipcinvoker/b:fVe	Ljava/util/Map;
        //   85: aload_0
        //   86: getfield 25	com/tencent/mm/ipcinvoker/b$3:fVh	Ljava/lang/String;
        //   89: invokeinterface 84 2 0
        //   94: pop
        //   95: aload_1
        //   96: monitorexit
        //   97: aload_0
        //   98: getfield 23	com/tencent/mm/ipcinvoker/b$3:fVj	Lcom/tencent/mm/ipcinvoker/b$a;
        //   101: astore_1
        //   102: aload_1
        //   103: monitorenter
        //   104: aload_0
        //   105: getfield 23	com/tencent/mm/ipcinvoker/b$3:fVj	Lcom/tencent/mm/ipcinvoker/b$a;
        //   108: aconst_null
        //   109: putfield 88	com/tencent/mm/ipcinvoker/b$a:fVk	Lcom/tencent/mm/ipcinvoker/b/a;
        //   112: aload_0
        //   113: getfield 23	com/tencent/mm/ipcinvoker/b$3:fVj	Lcom/tencent/mm/ipcinvoker/b$a;
        //   116: iconst_0
        //   117: putfield 92	com/tencent/mm/ipcinvoker/b$a:fVm	Z
        //   120: aload_0
        //   121: getfield 23	com/tencent/mm/ipcinvoker/b$3:fVj	Lcom/tencent/mm/ipcinvoker/b$a;
        //   124: aconst_null
        //   125: putfield 53	com/tencent/mm/ipcinvoker/b$a:fVl	Landroid/content/ServiceConnection;
        //   128: aload_1
        //   129: monitorexit
        //   130: ldc2_w 45
        //   133: ldc 47
        //   135: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   138: return
        //   139: astore_1
        //   140: ldc 55
        //   142: ldc 94
        //   144: iconst_2
        //   145: anewarray 4	java/lang/Object
        //   148: dup
        //   149: iconst_0
        //   150: aload_0
        //   151: getfield 25	com/tencent/mm/ipcinvoker/b$3:fVh	Ljava/lang/String;
        //   154: aastore
        //   155: dup
        //   156: iconst_1
        //   157: aload_1
        //   158: invokestatic 100	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   161: aastore
        //   162: invokestatic 103	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   165: goto -97 -> 68
        //   168: astore_2
        //   169: aload_1
        //   170: monitorexit
        //   171: aload_2
        //   172: athrow
        //   173: astore_2
        //   174: aload_1
        //   175: monitorexit
        //   176: aload_2
        //   177: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	178	0	this	3
        //   139	36	1	localException	Exception
        //   22	4	2	localServiceConnection1	ServiceConnection
        //   56	9	2	localServiceConnection2	ServiceConnection
        //   168	4	2	localObject2	Object
        //   173	4	2	localObject3	Object
        // Exception table:
        //   from	to	target	type
        //   15	25	56	finally
        //   57	59	56	finally
        //   61	68	139	java/lang/Exception
        //   78	97	168	finally
        //   169	171	168	finally
        //   104	130	173	finally
        //   174	176	173	finally
      }
    });
    GMTrace.o(18712232984576L, 139417);
  }
  
  public final void vO()
  {
    try
    {
      GMTrace.i(18712367202304L, 139418);
      this.fVf = true;
      GMTrace.o(18712367202304L, 139418);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static final class a
  {
    a fVk;
    ServiceConnection fVl;
    volatile boolean fVm;
    Runnable fVn;
    
    public a()
    {
      GMTrace.i(18692905631744L, 139273);
      GMTrace.o(18692905631744L, 139273);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */