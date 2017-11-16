package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class b
  implements f
{
  boolean eIE;
  private Random fUA;
  boolean guN;
  List<String> jdJ;
  public HashSet<String> jdK;
  d jdL;
  e jdM;
  boolean jdN;
  long jdO;
  long jdP;
  int jdQ;
  int jdR;
  int jdS;
  int jdT;
  long jdU;
  private long jdV;
  private long jdW;
  public Object lock;
  
  public b()
  {
    GMTrace.i(14750528307200L, 109900);
    this.lock = new Object();
    this.fUA = new Random();
    this.eIE = false;
    this.guN = false;
    this.jdJ = new LinkedList();
    this.jdK = new HashSet();
    this.jdN = false;
    this.jdR = 0;
    this.jdS = 0;
    this.jdT = 0;
    this.jdU = 0L;
    this.jdV = 0L;
    this.jdW = 0L;
    GMTrace.o(14750528307200L, 109900);
  }
  
  private static String a(Random paramRandom)
  {
    GMTrace.i(14750930960384L, 109903);
    paramRandom = g.n((bg.Pw() + paramRandom.nextDouble()).getBytes());
    GMTrace.o(14750930960384L, 109903);
    return paramRandom;
  }
  
  public final void a(int paramInt1, int paramInt2, k paramk)
  {
    GMTrace.i(14751065178112L, 109904);
    this.jdP += paramInt1;
    if (this.jdO == 0L) {}
    for (paramInt1 = 0;; paramInt1 = (int)(this.jdP * 100L / this.jdO))
    {
      if (paramInt1 > this.jdQ)
      {
        this.jdQ = paramInt1;
        h.setProgress(this.jdQ);
      }
      if ((this.jdV == 0L) || (bg.aI(this.jdV) >= 100L)) {
        break;
      }
      GMTrace.o(14751065178112L, 109904);
      return;
    }
    this.jdV = bg.Pw();
    if (this.jdW == 0L) {
      this.jdW = bg.Pw();
    }
    if (this.jdP > this.jdO) {
      this.jdP = this.jdO;
    }
    if (this.jdP == 0L) {
      this.jdP = 1L;
    }
    paramInt1 = (int)((this.jdV - this.jdW) * (this.jdO - this.jdP) / this.jdP) / 1000;
    if ((!this.eIE) && (!this.guN) && (this.jdL != null) && (this.jdQ >= 0) && (this.jdQ <= 100)) {
      this.jdL.b(this.jdP, this.jdO, paramInt1);
    }
    GMTrace.o(14751065178112L, 109904);
  }
  
  public final void afZ()
  {
    GMTrace.i(16049084825600L, 119575);
    if ((!this.jdN) || (this.guN))
    {
      GMTrace.o(16049084825600L, 119575);
      return;
    }
    synchronized (this.lock)
    {
      if (this.jdK.isEmpty())
      {
        com.tencent.mm.plugin.backup.f.b.b(6, this.jdM);
        if (this.jdL != null)
        {
          this.jdL.aga();
          cancel();
          w.i("MicroMsg.BakUploadPackerMove", "send backup finish cmd");
        }
      }
      else
      {
        GMTrace.o(16049084825600L, 119575);
        return;
      }
      w.i("MicroMsg.BakUploadPackerMove", "operatorCallback is null");
    }
  }
  
  public final void cancel()
  {
    GMTrace.i(14750662524928L, 109901);
    w.i("MicroMsg.BakUploadPackerMove", "cancel");
    this.guN = true;
    com.tencent.mm.plugin.backup.f.b.b(6, this.jdM);
    this.jdL = null;
    this.jdN = false;
    this.jdQ = 0;
    this.jdT = 0;
    this.jdU = 0L;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      GMTrace.o(14750662524928L, 109901);
      return;
    }
  }
  
  /* Error */
  public final boolean l(String arg1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 210
    //   3: ldc -44
    //   5: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 214	com/tencent/mm/pointers/PLong
    //   11: dup
    //   12: invokespecial 215	com/tencent/mm/pointers/PLong:<init>	()V
    //   15: astore 13
    //   17: invokestatic 220	java/lang/System:currentTimeMillis	()J
    //   20: lstore 5
    //   22: invokestatic 226	com/tencent/mm/plugin/backup/g/a:afG	()Lcom/tencent/mm/plugin/backup/g/a;
    //   25: invokevirtual 230	com/tencent/mm/plugin/backup/g/a:afH	()Lcom/tencent/mm/plugin/backup/g/c;
    //   28: invokevirtual 236	com/tencent/mm/plugin/backup/g/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
    //   31: aload_1
    //   32: invokeinterface 242 2 0
    //   37: astore 12
    //   39: aload_0
    //   40: getfield 79	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdR	I
    //   43: i2l
    //   44: lstore 7
    //   46: aload_0
    //   47: invokestatic 220	java/lang/System:currentTimeMillis	()J
    //   50: lload 5
    //   52: lsub
    //   53: lload 7
    //   55: ladd
    //   56: l2i
    //   57: putfield 79	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdR	I
    //   60: new 67	java/util/LinkedList
    //   63: dup
    //   64: invokespecial 68	java/util/LinkedList:<init>	()V
    //   67: astore 10
    //   69: new 67	java/util/LinkedList
    //   72: dup
    //   73: invokespecial 68	java/util/LinkedList:<init>	()V
    //   76: astore 14
    //   78: aload 10
    //   80: astore_1
    //   81: aload 12
    //   83: invokeinterface 247 1 0
    //   88: ifeq +587 -> 675
    //   91: aload 10
    //   93: astore_1
    //   94: aload 12
    //   96: invokeinterface 250 1 0
    //   101: ifne +735 -> 836
    //   104: aload_0
    //   105: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:lock	Ljava/lang/Object;
    //   108: astore 10
    //   110: aload 10
    //   112: monitorenter
    //   113: aload_0
    //   114: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   117: invokevirtual 254	java/util/HashSet:size	()I
    //   120: istore 4
    //   122: iload 4
    //   124: bipush 8
    //   126: if_icmple +10 -> 136
    //   129: aload_0
    //   130: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:lock	Ljava/lang/Object;
    //   133: invokevirtual 257	java/lang/Object:wait	()V
    //   136: aload_0
    //   137: getfield 63	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:eIE	Z
    //   140: ifeq +21 -> 161
    //   143: aload_0
    //   144: getfield 65	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:guN	Z
    //   147: istore 9
    //   149: iload 9
    //   151: ifne +10 -> 161
    //   154: aload_0
    //   155: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:lock	Ljava/lang/Object;
    //   158: invokevirtual 257	java/lang/Object:wait	()V
    //   161: aload_0
    //   162: getfield 65	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:guN	Z
    //   165: ifeq +66 -> 231
    //   168: ldc -69
    //   170: ldc_w 259
    //   173: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload 10
    //   178: monitorexit
    //   179: aload 12
    //   181: invokeinterface 262 1 0
    //   186: ldc2_w 210
    //   189: ldc -44
    //   191: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   194: iconst_0
    //   195: ireturn
    //   196: astore 11
    //   198: ldc -69
    //   200: aload 11
    //   202: ldc_w 264
    //   205: iconst_0
    //   206: anewarray 4	java/lang/Object
    //   209: invokestatic 268	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: goto -51 -> 161
    //   215: astore_1
    //   216: aload 10
    //   218: monitorexit
    //   219: aload_1
    //   220: athrow
    //   221: astore_1
    //   222: aload 12
    //   224: invokeinterface 262 1 0
    //   229: aload_1
    //   230: athrow
    //   231: aload 10
    //   233: monitorexit
    //   234: new 270	com/tencent/mm/storage/au
    //   237: dup
    //   238: invokespecial 271	com/tencent/mm/storage/au:<init>	()V
    //   241: astore 10
    //   243: aload 10
    //   245: aload 12
    //   247: invokevirtual 274	com/tencent/mm/storage/au:b	(Landroid/database/Cursor;)V
    //   250: invokestatic 220	java/lang/System:currentTimeMillis	()J
    //   253: lstore 5
    //   255: iload_3
    //   256: ifle +566 -> 822
    //   259: iconst_1
    //   260: istore 9
    //   262: aload 10
    //   264: iconst_0
    //   265: aload_2
    //   266: aload 13
    //   268: aload 14
    //   270: aconst_null
    //   271: iload 9
    //   273: iconst_0
    //   274: lconst_0
    //   275: invokestatic 279	com/tencent/mm/plugin/backup/e/a$a:a	(Lcom/tencent/mm/storage/au;ZLjava/lang/String;Lcom/tencent/mm/pointers/PLong;Ljava/util/LinkedList;Ljava/util/HashMap;ZZJ)Lcom/tencent/mm/protocal/c/ek;
    //   278: astore 10
    //   280: aload_0
    //   281: aload_0
    //   282: getfield 81	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdS	I
    //   285: i2l
    //   286: invokestatic 220	java/lang/System:currentTimeMillis	()J
    //   289: lload 5
    //   291: lsub
    //   292: ladd
    //   293: l2i
    //   294: putfield 81	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdS	I
    //   297: iload_3
    //   298: iconst_1
    //   299: isub
    //   300: istore_3
    //   301: aload 10
    //   303: ifnull +10 -> 313
    //   306: aload_1
    //   307: aload 10
    //   309: invokevirtual 283	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   312: pop
    //   313: aload_0
    //   314: aload_0
    //   315: getfield 83	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdT	I
    //   318: aload 14
    //   320: invokevirtual 284	java/util/LinkedList:size	()I
    //   323: iadd
    //   324: putfield 83	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdT	I
    //   327: aload 14
    //   329: invokevirtual 288	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   332: astore 11
    //   334: aload 11
    //   336: invokeinterface 293 1 0
    //   341: ifeq +160 -> 501
    //   344: aload 11
    //   346: invokeinterface 297 1 0
    //   351: checkcast 299	com/tencent/mm/plugin/backup/h/u
    //   354: astore 15
    //   356: new 146	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h
    //   359: dup
    //   360: aload 15
    //   362: getfield 303	com/tencent/mm/plugin/backup/h/u:mediaId	Ljava/lang/String;
    //   365: iconst_2
    //   366: aconst_null
    //   367: aload 15
    //   369: getfield 306	com/tencent/mm/plugin/backup/h/u:path	Ljava/lang/String;
    //   372: aload_0
    //   373: invokespecial 309	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ad/f;)V
    //   376: astore 16
    //   378: aload_0
    //   379: aload_0
    //   380: getfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdU	J
    //   383: aload 16
    //   385: getfield 313	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:jbv	Lcom/tencent/mm/plugin/backup/h/x;
    //   388: getfield 318	com/tencent/mm/plugin/backup/h/x:jig	I
    //   391: i2l
    //   392: ladd
    //   393: putfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdU	J
    //   396: aload_0
    //   397: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:lock	Ljava/lang/Object;
    //   400: astore 10
    //   402: aload 10
    //   404: monitorenter
    //   405: aload 16
    //   407: invokevirtual 321	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:afx	()Z
    //   410: pop
    //   411: aload_0
    //   412: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   415: aload 15
    //   417: getfield 303	com/tencent/mm/plugin/backup/h/u:mediaId	Ljava/lang/String;
    //   420: invokevirtual 322	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   423: pop
    //   424: ldc -69
    //   426: ldc_w 324
    //   429: iconst_1
    //   430: anewarray 4	java/lang/Object
    //   433: dup
    //   434: iconst_0
    //   435: aload_0
    //   436: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   439: invokevirtual 254	java/util/HashSet:size	()I
    //   442: invokestatic 330	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   445: aastore
    //   446: invokestatic 333	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: aload 10
    //   451: monitorexit
    //   452: goto -118 -> 334
    //   455: astore_1
    //   456: aload 10
    //   458: monitorexit
    //   459: aload_1
    //   460: athrow
    //   461: ldc -69
    //   463: aload 11
    //   465: ldc_w 264
    //   468: iconst_0
    //   469: anewarray 4	java/lang/Object
    //   472: invokestatic 268	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   475: ldc -69
    //   477: new 100	java/lang/StringBuilder
    //   480: dup
    //   481: ldc_w 335
    //   484: invokespecial 338	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   487: aload 11
    //   489: invokevirtual 341	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   492: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   495: invokestatic 344	com/tencent/mm/sdk/platformtools/w:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   498: goto -197 -> 301
    //   501: aload 14
    //   503: invokevirtual 347	java/util/LinkedList:clear	()V
    //   506: aload_1
    //   507: astore 10
    //   509: aload 13
    //   511: getfield 350	com/tencent/mm/pointers/PLong:value	J
    //   514: ldc2_w 351
    //   517: lcmp
    //   518: ifle +138 -> 656
    //   521: ldc -69
    //   523: new 100	java/lang/StringBuilder
    //   526: dup
    //   527: ldc_w 354
    //   530: invokespecial 338	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   533: aload 13
    //   535: getfield 350	com/tencent/mm/pointers/PLong:value	J
    //   538: invokevirtual 111	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   541: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   544: invokestatic 357	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   547: aload_0
    //   548: getfield 61	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:fUA	Ljava/util/Random;
    //   551: invokestatic 359	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:a	(Ljava/util/Random;)Ljava/lang/String;
    //   554: astore 10
    //   556: new 146	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h
    //   559: dup
    //   560: aload 10
    //   562: iconst_1
    //   563: aload_1
    //   564: ldc_w 264
    //   567: aload_0
    //   568: invokespecial 309	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ad/f;)V
    //   571: astore 11
    //   573: aload_0
    //   574: aload_0
    //   575: getfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdU	J
    //   578: aload 11
    //   580: getfield 313	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:jbv	Lcom/tencent/mm/plugin/backup/h/x;
    //   583: getfield 318	com/tencent/mm/plugin/backup/h/x:jig	I
    //   586: i2l
    //   587: ladd
    //   588: putfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdU	J
    //   591: aload_0
    //   592: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:lock	Ljava/lang/Object;
    //   595: astore_1
    //   596: aload_1
    //   597: monitorenter
    //   598: aload 11
    //   600: invokevirtual 321	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:afx	()Z
    //   603: pop
    //   604: aload_0
    //   605: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   608: aload 10
    //   610: invokevirtual 322	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   613: pop
    //   614: ldc -69
    //   616: ldc_w 324
    //   619: iconst_1
    //   620: anewarray 4	java/lang/Object
    //   623: dup
    //   624: iconst_0
    //   625: aload_0
    //   626: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   629: invokevirtual 254	java/util/HashSet:size	()I
    //   632: invokestatic 330	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   635: aastore
    //   636: invokestatic 333	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   639: aload_1
    //   640: monitorexit
    //   641: new 67	java/util/LinkedList
    //   644: dup
    //   645: invokespecial 68	java/util/LinkedList:<init>	()V
    //   648: astore 10
    //   650: aload 13
    //   652: lconst_0
    //   653: putfield 350	com/tencent/mm/pointers/PLong:value	J
    //   656: aload 12
    //   658: invokeinterface 362 1 0
    //   663: pop
    //   664: aload 10
    //   666: astore_1
    //   667: goto -573 -> 94
    //   670: astore_2
    //   671: aload_1
    //   672: monitorexit
    //   673: aload_2
    //   674: athrow
    //   675: aload 13
    //   677: getfield 350	com/tencent/mm/pointers/PLong:value	J
    //   680: lconst_0
    //   681: lcmp
    //   682: ifle +108 -> 790
    //   685: aload_0
    //   686: getfield 61	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:fUA	Ljava/util/Random;
    //   689: invokestatic 359	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:a	(Ljava/util/Random;)Ljava/lang/String;
    //   692: astore_2
    //   693: new 146	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h
    //   696: dup
    //   697: aload_2
    //   698: iconst_1
    //   699: aload_1
    //   700: ldc_w 264
    //   703: aload_0
    //   704: invokespecial 309	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:<init>	(Ljava/lang/String;ILjava/util/LinkedList;Ljava/lang/String;Lcom/tencent/mm/ad/f;)V
    //   707: astore 10
    //   709: aload_0
    //   710: aload_0
    //   711: getfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdU	J
    //   714: aload 10
    //   716: getfield 313	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:jbv	Lcom/tencent/mm/plugin/backup/h/x;
    //   719: getfield 318	com/tencent/mm/plugin/backup/h/x:jig	I
    //   722: i2l
    //   723: ladd
    //   724: putfield 85	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdU	J
    //   727: aload_0
    //   728: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:lock	Ljava/lang/Object;
    //   731: astore_1
    //   732: aload_1
    //   733: monitorenter
    //   734: aload 10
    //   736: invokevirtual 321	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h:afx	()Z
    //   739: pop
    //   740: aload_0
    //   741: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   744: aload_2
    //   745: invokevirtual 322	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   748: pop
    //   749: ldc -69
    //   751: ldc_w 324
    //   754: iconst_1
    //   755: anewarray 4	java/lang/Object
    //   758: dup
    //   759: iconst_0
    //   760: aload_0
    //   761: getfield 75	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/b:jdK	Ljava/util/HashSet;
    //   764: invokevirtual 254	java/util/HashSet:size	()I
    //   767: invokestatic 330	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   770: aastore
    //   771: invokestatic 333	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   774: aload_1
    //   775: monitorexit
    //   776: aload 13
    //   778: lconst_0
    //   779: putfield 350	com/tencent/mm/pointers/PLong:value	J
    //   782: new 67	java/util/LinkedList
    //   785: dup
    //   786: invokespecial 68	java/util/LinkedList:<init>	()V
    //   789: pop
    //   790: aload 12
    //   792: invokeinterface 262 1 0
    //   797: ldc2_w 210
    //   800: ldc -44
    //   802: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   805: iconst_1
    //   806: ireturn
    //   807: astore_2
    //   808: aload_1
    //   809: monitorexit
    //   810: aload_2
    //   811: athrow
    //   812: astore 11
    //   814: goto -353 -> 461
    //   817: astore 11
    //   819: goto -683 -> 136
    //   822: iconst_0
    //   823: istore 9
    //   825: goto -563 -> 262
    //   828: astore 11
    //   830: aconst_null
    //   831: astore 10
    //   833: goto -372 -> 461
    //   836: goto -161 -> 675
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	839	0	this	b
    //   0	839	2	paramString2	String
    //   0	839	3	paramInt	int
    //   120	7	4	i	int
    //   20	270	5	l1	long
    //   44	10	7	l2	long
    //   147	677	9	bool	boolean
    //   196	5	11	localInterruptedException1	InterruptedException
    //   332	267	11	localObject2	Object
    //   812	1	11	localException1	Exception
    //   817	1	11	localInterruptedException2	InterruptedException
    //   828	1	11	localException2	Exception
    //   37	754	12	localCursor	android.database.Cursor
    //   15	762	13	localPLong	com.tencent.mm.pointers.PLong
    //   76	426	14	localLinkedList	LinkedList
    //   354	62	15	localu	com.tencent.mm.plugin.backup.h.u
    //   376	30	16	localh	h
    // Exception table:
    //   from	to	target	type
    //   154	161	196	java/lang/InterruptedException
    //   113	122	215	finally
    //   129	136	215	finally
    //   136	149	215	finally
    //   154	161	215	finally
    //   161	179	215	finally
    //   198	212	215	finally
    //   216	219	215	finally
    //   231	234	215	finally
    //   81	91	221	finally
    //   94	113	221	finally
    //   219	221	221	finally
    //   234	250	221	finally
    //   250	255	221	finally
    //   262	280	221	finally
    //   280	297	221	finally
    //   306	313	221	finally
    //   313	334	221	finally
    //   334	405	221	finally
    //   459	461	221	finally
    //   461	498	221	finally
    //   501	506	221	finally
    //   509	598	221	finally
    //   641	656	221	finally
    //   656	664	221	finally
    //   673	675	221	finally
    //   675	734	221	finally
    //   776	790	221	finally
    //   810	812	221	finally
    //   405	452	455	finally
    //   456	459	455	finally
    //   598	641	670	finally
    //   671	673	670	finally
    //   734	776	807	finally
    //   808	810	807	finally
    //   280	297	812	java/lang/Exception
    //   129	136	817	java/lang/InterruptedException
    //   250	255	828	java/lang/Exception
    //   262	280	828	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */