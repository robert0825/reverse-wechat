package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class d
  implements f
{
  private boolean eIE;
  private Random fUA;
  private boolean guN;
  List<String> jdJ;
  public HashSet<String> jdK;
  e jdM;
  boolean jdN;
  private long jdO;
  private long jdP;
  int jdQ;
  e.d jfF;
  public int jfG;
  public Object lock;
  
  public d()
  {
    GMTrace.i(14789451448320L, 110190);
    this.lock = new Object();
    this.fUA = new Random();
    this.eIE = false;
    this.guN = false;
    this.jdJ = new LinkedList();
    this.jdK = new HashSet();
    this.jdN = false;
    this.jfG = 0;
    GMTrace.o(14789451448320L, 110190);
  }
  
  private static String a(Random paramRandom)
  {
    GMTrace.i(14790256754688L, 110196);
    paramRandom = g.n((bg.Pw() + paramRandom.nextDouble()).getBytes());
    GMTrace.o(14790256754688L, 110196);
    return paramRandom;
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(14790390972416L, 110197);
    this.jdP += paramInt1;
    if (this.jdO == 0L) {}
    for (paramInt1 = 0;; paramInt1 = (int)(this.jdP * 100L / this.jdO))
    {
      if (paramInt1 > this.jdQ)
      {
        this.jdQ = paramInt1;
        com.tencent.mm.plugin.backup.bakoldlogic.c.b.setProgress(this.jdQ);
        if ((!this.eIE) && (!this.guN) && (this.jfF != null) && (this.jdQ >= 0) && (this.jdQ <= 100)) {
          this.jfF.kQ(this.jdQ);
        }
      }
      GMTrace.o(14790390972416L, 110197);
      return;
    }
  }
  
  public final void afZ()
  {
    GMTrace.i(14790122536960L, 110195);
    if ((!this.jdN) || (this.guN))
    {
      GMTrace.o(14790122536960L, 110195);
      return;
    }
    synchronized (this.lock)
    {
      if (this.jdK.isEmpty())
      {
        a.agk().agl().jfR = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdl;
        a.agk().agl().jfS = com.tencent.mm.plugin.backup.bakoldlogic.a.c.jdb;
        com.tencent.mm.plugin.backup.f.b.b(5, this.jdM);
        new com.tencent.mm.plugin.backup.bakoldlogic.c.a(5).afx();
        c localc = a.agk().agm();
        localc.jfB += 1;
        if (this.jfF != null)
        {
          this.jfF.aga();
          cancel();
          w.i("MicroMsg.BakPCServer", "send backup finish cmd");
        }
      }
      else
      {
        GMTrace.o(14790122536960L, 110195);
        return;
      }
      w.i("MicroMsg.BakPCServer", "operatorCallback is null");
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(14789854101504L, 110193);
    w.i("MicroMsg.BakPCServer", "cancel");
    this.guN = true;
    com.tencent.mm.plugin.backup.f.b.b(5, this.jdM);
    this.jfF = null;
    this.jdN = false;
    this.jdQ = 0;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      GMTrace.o(14789854101504L, 110193);
      return;
    }
  }
  
  /* Error */
  public final boolean l(String arg1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 231
    //   3: ldc -23
    //   5: invokestatic 47	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 235	com/tencent/mm/pointers/PLong
    //   11: dup
    //   12: invokespecial 236	com/tencent/mm/pointers/PLong:<init>	()V
    //   15: astore 8
    //   17: invokestatic 242	com/tencent/mm/plugin/backup/g/a:afG	()Lcom/tencent/mm/plugin/backup/g/a;
    //   20: invokevirtual 246	com/tencent/mm/plugin/backup/g/a:afH	()Lcom/tencent/mm/plugin/backup/g/c;
    //   23: invokevirtual 252	com/tencent/mm/plugin/backup/g/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
    //   26: aload_1
    //   27: invokeinterface 258 2 0
    //   32: astore 7
    //   34: new 60	java/util/LinkedList
    //   37: dup
    //   38: invokespecial 61	java/util/LinkedList:<init>	()V
    //   41: astore 6
    //   43: new 60	java/util/LinkedList
    //   46: dup
    //   47: invokespecial 61	java/util/LinkedList:<init>	()V
    //   50: astore 9
    //   52: aload 6
    //   54: astore_1
    //   55: aload 7
    //   57: invokeinterface 263 1 0
    //   62: ifeq +532 -> 594
    //   65: aload 6
    //   67: astore_1
    //   68: aload 7
    //   70: invokeinterface 266 1 0
    //   75: ifne +655 -> 730
    //   78: aload_0
    //   79: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   82: astore 6
    //   84: aload 6
    //   86: monitorenter
    //   87: aload_0
    //   88: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   91: invokevirtual 270	java/util/HashSet:size	()I
    //   94: istore 4
    //   96: iload 4
    //   98: bipush 10
    //   100: if_icmple +10 -> 110
    //   103: aload_0
    //   104: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   107: invokevirtual 273	java/lang/Object:wait	()V
    //   110: aload_0
    //   111: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:eIE	Z
    //   114: ifeq +21 -> 135
    //   117: aload_0
    //   118: getfield 58	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:guN	Z
    //   121: istore 5
    //   123: iload 5
    //   125: ifne +10 -> 135
    //   128: aload_0
    //   129: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   132: invokevirtual 273	java/lang/Object:wait	()V
    //   135: aload_0
    //   136: getfield 58	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:guN	Z
    //   139: ifeq +66 -> 205
    //   142: ldc -48
    //   144: ldc_w 275
    //   147: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: aload 6
    //   152: monitorexit
    //   153: aload 7
    //   155: invokeinterface 278 1 0
    //   160: ldc2_w 231
    //   163: ldc -23
    //   165: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   168: iconst_0
    //   169: ireturn
    //   170: astore 10
    //   172: ldc -48
    //   174: aload 10
    //   176: ldc_w 280
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 284	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: goto -51 -> 135
    //   189: astore_1
    //   190: aload 6
    //   192: monitorexit
    //   193: aload_1
    //   194: athrow
    //   195: astore_1
    //   196: aload 7
    //   198: invokeinterface 278 1 0
    //   203: aload_1
    //   204: athrow
    //   205: aload 6
    //   207: monitorexit
    //   208: new 286	com/tencent/mm/storage/au
    //   211: dup
    //   212: invokespecial 287	com/tencent/mm/storage/au:<init>	()V
    //   215: astore 6
    //   217: aload 6
    //   219: aload 7
    //   221: invokevirtual 290	com/tencent/mm/storage/au:b	(Landroid/database/Cursor;)V
    //   224: iload_3
    //   225: ifle +499 -> 724
    //   228: iconst_1
    //   229: istore 5
    //   231: aload 6
    //   233: iconst_0
    //   234: aload_2
    //   235: aload 8
    //   237: aload 9
    //   239: aconst_null
    //   240: iload 5
    //   242: iconst_0
    //   243: lconst_0
    //   244: invokestatic 295	com/tencent/mm/plugin/backup/e/a$a:a	(Lcom/tencent/mm/storage/au;ZLjava/lang/String;Lcom/tencent/mm/pointers/PLong;Ljava/util/LinkedList;Ljava/util/HashMap;ZZJ)Lcom/tencent/mm/protocal/c/ek;
    //   247: astore 6
    //   249: iload_3
    //   250: iconst_1
    //   251: isub
    //   252: istore_3
    //   253: aload 6
    //   255: ifnull +10 -> 265
    //   258: aload_1
    //   259: aload 6
    //   261: invokevirtual 299	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   264: pop
    //   265: aload 9
    //   267: invokevirtual 303	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   270: astore 10
    //   272: aload 10
    //   274: invokeinterface 308 1 0
    //   279: ifeq +153 -> 432
    //   282: aload 10
    //   284: invokeinterface 312 1 0
    //   289: checkcast 314	com/tencent/mm/plugin/backup/h/u
    //   292: astore 11
    //   294: new 129	com/tencent/mm/plugin/backup/bakoldlogic/c/b
    //   297: dup
    //   298: aload 11
    //   300: getfield 318	com/tencent/mm/plugin/backup/h/u:mediaId	Ljava/lang/String;
    //   303: iconst_2
    //   304: aconst_null
    //   305: aload 11
    //   307: getfield 321	com/tencent/mm/plugin/backup/h/u:path	Ljava/lang/String;
    //   310: aload_0
    //   311: invokestatic 156	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:agk	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   314: getfield 327	com/tencent/mm/plugin/backup/a/e:iVs	[B
    //   317: invokespecial 330	com/tencent/mm/plugin/backup/bakoldlogic/c/b:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ad/f;[B)V
    //   320: astore 12
    //   322: aload_0
    //   323: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   326: astore 6
    //   328: aload 6
    //   330: monitorenter
    //   331: aload 12
    //   333: invokevirtual 331	com/tencent/mm/plugin/backup/bakoldlogic/c/b:afx	()Z
    //   336: pop
    //   337: aload_0
    //   338: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   341: aload 11
    //   343: getfield 318	com/tencent/mm/plugin/backup/h/u:mediaId	Ljava/lang/String;
    //   346: invokevirtual 332	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   349: pop
    //   350: ldc -48
    //   352: ldc_w 334
    //   355: iconst_1
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload_0
    //   362: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   365: invokevirtual 270	java/util/HashSet:size	()I
    //   368: invokestatic 340	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   371: aastore
    //   372: invokestatic 343	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   375: aload 6
    //   377: monitorexit
    //   378: goto -106 -> 272
    //   381: astore_1
    //   382: aload 6
    //   384: monitorexit
    //   385: aload_1
    //   386: athrow
    //   387: astore 6
    //   389: ldc -48
    //   391: aload 6
    //   393: ldc_w 280
    //   396: iconst_0
    //   397: anewarray 4	java/lang/Object
    //   400: invokestatic 284	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: ldc -48
    //   405: new 83	java/lang/StringBuilder
    //   408: dup
    //   409: ldc_w 345
    //   412: invokespecial 348	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   415: aload 6
    //   417: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   420: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   423: invokestatic 354	com/tencent/mm/sdk/platformtools/w:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   426: aconst_null
    //   427: astore 6
    //   429: goto -176 -> 253
    //   432: aload 9
    //   434: invokevirtual 357	java/util/LinkedList:clear	()V
    //   437: aload_1
    //   438: astore 6
    //   440: aload 8
    //   442: getfield 360	com/tencent/mm/pointers/PLong:value	J
    //   445: ldc2_w 361
    //   448: lcmp
    //   449: ifle +126 -> 575
    //   452: ldc -48
    //   454: new 83	java/lang/StringBuilder
    //   457: dup
    //   458: ldc_w 364
    //   461: invokespecial 348	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   464: aload 8
    //   466: getfield 360	com/tencent/mm/pointers/PLong:value	J
    //   469: invokevirtual 94	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   472: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   475: invokestatic 367	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   478: aload_0
    //   479: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:fUA	Ljava/util/Random;
    //   482: invokestatic 369	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:a	(Ljava/util/Random;)Ljava/lang/String;
    //   485: astore 6
    //   487: new 129	com/tencent/mm/plugin/backup/bakoldlogic/c/b
    //   490: dup
    //   491: aload 6
    //   493: iconst_1
    //   494: aload_1
    //   495: ldc_w 280
    //   498: aload_0
    //   499: invokestatic 156	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:agk	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   502: getfield 327	com/tencent/mm/plugin/backup/a/e:iVs	[B
    //   505: invokespecial 330	com/tencent/mm/plugin/backup/bakoldlogic/c/b:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ad/f;[B)V
    //   508: astore 10
    //   510: aload_0
    //   511: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   514: astore_1
    //   515: aload_1
    //   516: monitorenter
    //   517: aload 10
    //   519: invokevirtual 331	com/tencent/mm/plugin/backup/bakoldlogic/c/b:afx	()Z
    //   522: pop
    //   523: aload_0
    //   524: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   527: aload 6
    //   529: invokevirtual 332	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   532: pop
    //   533: ldc -48
    //   535: ldc_w 334
    //   538: iconst_1
    //   539: anewarray 4	java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload_0
    //   545: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   548: invokevirtual 270	java/util/HashSet:size	()I
    //   551: invokestatic 340	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   554: aastore
    //   555: invokestatic 343	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   558: aload_1
    //   559: monitorexit
    //   560: new 60	java/util/LinkedList
    //   563: dup
    //   564: invokespecial 61	java/util/LinkedList:<init>	()V
    //   567: astore 6
    //   569: aload 8
    //   571: lconst_0
    //   572: putfield 360	com/tencent/mm/pointers/PLong:value	J
    //   575: aload 7
    //   577: invokeinterface 372 1 0
    //   582: pop
    //   583: aload 6
    //   585: astore_1
    //   586: goto -518 -> 68
    //   589: astore_2
    //   590: aload_1
    //   591: monitorexit
    //   592: aload_2
    //   593: athrow
    //   594: aload 8
    //   596: getfield 360	com/tencent/mm/pointers/PLong:value	J
    //   599: lconst_0
    //   600: lcmp
    //   601: ifle +96 -> 697
    //   604: aload_0
    //   605: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:fUA	Ljava/util/Random;
    //   608: invokestatic 369	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:a	(Ljava/util/Random;)Ljava/lang/String;
    //   611: astore_2
    //   612: new 129	com/tencent/mm/plugin/backup/bakoldlogic/c/b
    //   615: dup
    //   616: aload_2
    //   617: iconst_1
    //   618: aload_1
    //   619: ldc_w 280
    //   622: aload_0
    //   623: invokestatic 156	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a:agk	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a;
    //   626: getfield 327	com/tencent/mm/plugin/backup/a/e:iVs	[B
    //   629: invokespecial 330	com/tencent/mm/plugin/backup/bakoldlogic/c/b:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ad/f;[B)V
    //   632: astore 6
    //   634: aload_0
    //   635: getfield 49	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:lock	Ljava/lang/Object;
    //   638: astore_1
    //   639: aload_1
    //   640: monitorenter
    //   641: aload 6
    //   643: invokevirtual 331	com/tencent/mm/plugin/backup/bakoldlogic/c/b:afx	()Z
    //   646: pop
    //   647: aload_0
    //   648: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   651: aload_2
    //   652: invokevirtual 332	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   655: pop
    //   656: ldc -48
    //   658: ldc_w 334
    //   661: iconst_1
    //   662: anewarray 4	java/lang/Object
    //   665: dup
    //   666: iconst_0
    //   667: aload_0
    //   668: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d:jdK	Ljava/util/HashSet;
    //   671: invokevirtual 270	java/util/HashSet:size	()I
    //   674: invokestatic 340	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   677: aastore
    //   678: invokestatic 343	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   681: aload_1
    //   682: monitorexit
    //   683: aload 8
    //   685: lconst_0
    //   686: putfield 360	com/tencent/mm/pointers/PLong:value	J
    //   689: new 60	java/util/LinkedList
    //   692: dup
    //   693: invokespecial 61	java/util/LinkedList:<init>	()V
    //   696: pop
    //   697: aload 7
    //   699: invokeinterface 278 1 0
    //   704: ldc2_w 231
    //   707: ldc -23
    //   709: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   712: iconst_1
    //   713: ireturn
    //   714: astore_2
    //   715: aload_1
    //   716: monitorexit
    //   717: aload_2
    //   718: athrow
    //   719: astore 10
    //   721: goto -611 -> 110
    //   724: iconst_0
    //   725: istore 5
    //   727: goto -496 -> 231
    //   730: goto -136 -> 594
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	733	0	this	d
    //   0	733	2	paramString2	String
    //   0	733	3	paramInt	int
    //   94	7	4	i	int
    //   121	605	5	bool	boolean
    //   387	29	6	localException	Exception
    //   427	215	6	localObject2	Object
    //   32	666	7	localCursor	android.database.Cursor
    //   15	669	8	localPLong	com.tencent.mm.pointers.PLong
    //   50	383	9	localLinkedList	LinkedList
    //   170	5	10	localInterruptedException1	InterruptedException
    //   270	248	10	localObject3	Object
    //   719	1	10	localInterruptedException2	InterruptedException
    //   292	50	11	localu	com.tencent.mm.plugin.backup.h.u
    //   320	12	12	localb	com.tencent.mm.plugin.backup.bakoldlogic.c.b
    // Exception table:
    //   from	to	target	type
    //   128	135	170	java/lang/InterruptedException
    //   87	96	189	finally
    //   103	110	189	finally
    //   110	123	189	finally
    //   128	135	189	finally
    //   135	153	189	finally
    //   172	186	189	finally
    //   190	193	189	finally
    //   205	208	189	finally
    //   55	65	195	finally
    //   68	87	195	finally
    //   193	195	195	finally
    //   208	224	195	finally
    //   231	249	195	finally
    //   258	265	195	finally
    //   265	272	195	finally
    //   272	331	195	finally
    //   385	387	195	finally
    //   389	426	195	finally
    //   432	437	195	finally
    //   440	517	195	finally
    //   560	575	195	finally
    //   575	583	195	finally
    //   592	594	195	finally
    //   594	641	195	finally
    //   683	697	195	finally
    //   717	719	195	finally
    //   331	378	381	finally
    //   382	385	381	finally
    //   231	249	387	java/lang/Exception
    //   517	560	589	finally
    //   590	592	589	finally
    //   641	683	714	finally
    //   715	717	714	finally
    //   103	110	719	java/lang/InterruptedException
  }
  
  public final void pause()
  {
    GMTrace.i(14789585666048L, 110191);
    w.i("MicroMsg.BakPCServer", "pause");
    this.eIE = true;
    GMTrace.o(14789585666048L, 110191);
  }
  
  public final void resume()
  {
    GMTrace.i(14789719883776L, 110192);
    w.i("MicroMsg.BakPCServer", "resume");
    this.eIE = false;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      GMTrace.o(14789719883776L, 110192);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */