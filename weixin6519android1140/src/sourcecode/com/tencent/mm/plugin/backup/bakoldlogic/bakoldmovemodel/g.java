package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui.BakMoveNewUI;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements com.tencent.mm.ad.e, d, b.c
{
  public long eJe;
  public boolean guN;
  private long iXI;
  private int iXJ;
  public long iXK;
  private int iXL;
  private long iXM;
  private int iXN;
  public boolean iXO;
  public HashSet<String> iXP;
  private int iXQ;
  public boolean iXR;
  public boolean iXS;
  public boolean iXT;
  private long jdV;
  private long jdW;
  public boolean jef;
  public d jeg;
  private k jeo;
  List<String> jep;
  public long jeq;
  public long jer;
  public String jes;
  private com.tencent.mm.plugin.backup.h.d jet;
  private Object lock;
  public long recvSize;
  
  public g()
  {
    GMTrace.i(14740730413056L, 109827);
    this.jep = new LinkedList();
    this.jef = false;
    this.eJe = 0L;
    this.iXI = 0L;
    this.recvSize = 0L;
    this.jeq = 0L;
    this.jer = 0L;
    this.lock = new Object();
    this.guN = false;
    this.jes = "";
    this.iXJ = 0;
    this.iXK = 0L;
    this.iXL = 0;
    this.iXM = 0L;
    this.iXN = 0;
    this.iXO = true;
    this.iXP = new HashSet();
    this.iXR = false;
    this.iXQ = 0;
    this.iXS = true;
    this.iXT = true;
    this.jdV = 0L;
    this.jdW = 0L;
    GMTrace.o(14740730413056L, 109827);
  }
  
  private void agf()
  {
    GMTrace.i(14740998848512L, 109829);
    synchronized (this.lock)
    {
      this.guN = true;
      if (this.jeo != null)
      {
        this.jeo.cancel();
        this.jeo = null;
      }
      this.jep.clear();
      com.tencent.mm.a.e.f(new File(h.aer()));
      GMTrace.o(14740998848512L, 109829);
      return;
    }
  }
  
  private static void b(String paramString, x paramx)
  {
    long l2 = 0L;
    GMTrace.i(14741535719424L, 109833);
    File localFile = new File(paramString + paramx.jie);
    if (localFile.exists()) {}
    for (long l1 = localFile.length();; l1 = 0L)
    {
      com.tencent.mm.a.e.a(paramString, paramx.jie, paramx.jgP.tJp);
      localFile = new File(paramString + paramx.jie);
      if (localFile.exists()) {
        l2 = localFile.length();
      }
      if (l1 == l2)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.MoveRecoverServer", "append failed and try again:%s", new Object[] { paramString + paramx.jie });
        com.tencent.mm.a.e.a(paramString, paramx.jie, paramx.jgP.tJp);
      }
      GMTrace.o(14741535719424L, 109833);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(14741133066240L, 109830);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "onSceneEnd type:%d, [%d, %d]", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    if (paramk.getType() == 1)
    {
      com.tencent.mm.plugin.backup.f.b.b(1, this);
      com.tencent.mm.plugin.report.service.g.ork.a(103L, 9L, 1L, false);
      if (paramInt2 != 0)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.MoveRecoverServer", "auth failed");
        this.jef = false;
        GMTrace.o(14741133066240L, 109830);
        return;
      }
      if ((((com.tencent.mm.plugin.backup.bakoldlogic.b.a)paramk).jbh.jic & com.tencent.mm.plugin.backup.bakoldlogic.a.b.jcW) == 0) {}
      for (boolean bool = false;; bool = true)
      {
        this.iXS = bool;
        this.jef = true;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "auth ok and request bakStart");
        com.tencent.mm.plugin.backup.f.b.a(3, this);
        com.tencent.mm.a.e.f(new File(h.aer()));
        com.tencent.mm.plugin.backup.g.a.afG().afJ();
        paramString = new PLong();
        paramk = new PLong();
        PLong localPLong = new PLong();
        at.AR();
        paramInt1 = com.tencent.mm.a.e.aY(c.xe());
        at.AR();
        paramString.value = (paramInt1 + com.tencent.mm.a.e.aY(c.xf()));
        l = paramString.value;
        at.AR();
        com.tencent.mm.plugin.backup.bakoldlogic.a.d.a(l, paramk, localPLong, c.zo());
        this.jeq = (localPLong.value - paramString.value);
        this.jer = paramk.value;
        new com.tencent.mm.plugin.backup.bakoldlogic.b.b(a.afV().iVm).afx();
        GMTrace.o(14741133066240L, 109830);
        return;
      }
    }
    if (paramk.getType() == 3)
    {
      com.tencent.mm.plugin.backup.f.b.b(3, this);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "receive startrequest response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.MoveRecoverServer", "start request failed, errMsg:" + paramString);
        onError(paramInt1, "start request failed");
        GMTrace.o(14741133066240L, 109830);
        return;
      }
      paramString = (com.tencent.mm.plugin.backup.bakoldlogic.b.b)paramk;
      paramk = (o)paramString.jbK;
      if (!a.afV().iVm.equals(paramk.ID))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.MoveRecoverServer", "start response not the same id");
        onError(paramInt1, "start response not the same id.");
        GMTrace.o(14741133066240L, 109830);
        return;
      }
      this.jep.clear();
      this.eJe = paramString.jbK.jhz;
      this.iXI = paramString.jbK.jhy;
      this.iXQ = paramString.jbK.jhB;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "move recover total:%d, convDataSize:%d, and wait old mobile's pushData", new Object[] { Long.valueOf(paramString.jbK.jhy), Long.valueOf(paramString.jbK.jhz) });
      if ((this.iXT) && (this.iXS))
      {
        paramk = com.tencent.mm.plugin.report.service.g.ork;
        if ((!this.iXR) && (this.iXQ != 1)) {
          break label682;
        }
        paramInt1 = 16;
        paramk.a(103L, paramInt1, 1L, false);
      }
      if ((this.jer < paramString.jbK.jhz) && (this.jeq < paramString.jbK.jhz))
      {
        kF(30050035);
        agh();
        if (this.jer != 0L) {
          break label688;
        }
      }
    }
    label682:
    label688:
    for (long l = paramString.jbK.jhz - this.jeq;; l = paramString.jbK.jhz - this.jer)
    {
      onError(10012, paramString.jbK.jhz + "," + l);
      GMTrace.o(14741133066240L, 109830);
      return;
      paramInt1 = 17;
      break;
    }
  }
  
  /* Error */
  public final void a(boolean paramBoolean, int paramInt1, byte[] arg3, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 392
    //   3: ldc_w 394
    //   6: invokestatic 63	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_3
    //   10: ifnonnull +84 -> 94
    //   13: iconst_0
    //   14: istore 5
    //   16: ldc -58
    //   18: ldc_w 396
    //   21: iconst_4
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: iload_1
    //   28: invokestatic 401	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: iload_2
    //   35: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   38: aastore
    //   39: dup
    //   40: iconst_2
    //   41: iload 4
    //   43: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: dup
    //   48: iconst_3
    //   49: iload 5
    //   51: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: aastore
    //   55: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: iload_1
    //   59: ifeq +10 -> 69
    //   62: aload_0
    //   63: iload_2
    //   64: ldc 86
    //   66: invokevirtual 340	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:onError	(ILjava/lang/String;)V
    //   69: aload_0
    //   70: getfield 70	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jef	Z
    //   73: ifne +28 -> 101
    //   76: ldc -58
    //   78: ldc_w 403
    //   81: invokestatic 406	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: ldc2_w 392
    //   87: ldc_w 394
    //   90: invokestatic 120	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: return
    //   94: aload_3
    //   95: arraylength
    //   96: istore 5
    //   98: goto -82 -> 16
    //   101: iload_2
    //   102: bipush 6
    //   104: if_icmpne +553 -> 657
    //   107: aload_0
    //   108: getfield 100	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXO	Z
    //   111: ifeq +15 -> 126
    //   114: aload_0
    //   115: invokestatic 411	java/lang/System:currentTimeMillis	()J
    //   118: putfield 96	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXM	J
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield 100	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXO	Z
    //   126: aload_0
    //   127: getfield 92	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXK	J
    //   130: lstore 6
    //   132: aload_3
    //   133: ifnonnull +446 -> 579
    //   136: iconst_0
    //   137: istore_2
    //   138: aload_0
    //   139: iload_2
    //   140: i2l
    //   141: lload 6
    //   143: ladd
    //   144: putfield 92	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXK	J
    //   147: new 413	com/tencent/mm/plugin/backup/h/ae
    //   150: dup
    //   151: invokespecial 414	com/tencent/mm/plugin/backup/h/ae:<init>	()V
    //   154: astore 10
    //   156: new 168	com/tencent/mm/plugin/backup/h/x
    //   159: dup
    //   160: invokespecial 415	com/tencent/mm/plugin/backup/h/x:<init>	()V
    //   163: astore 11
    //   165: aload 11
    //   167: aload_3
    //   168: invokevirtual 419	com/tencent/mm/plugin/backup/h/x:aD	([B)Lcom/tencent/mm/bm/a;
    //   171: pop
    //   172: ldc -58
    //   174: ldc_w 421
    //   177: iconst_4
    //   178: anewarray 4	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: aload 11
    //   185: getfield 171	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   188: aastore
    //   189: dup
    //   190: iconst_1
    //   191: aload 11
    //   193: getfield 424	com/tencent/mm/plugin/backup/h/x:jif	I
    //   196: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: aastore
    //   200: dup
    //   201: iconst_2
    //   202: aload 11
    //   204: getfield 427	com/tencent/mm/plugin/backup/h/x:jih	I
    //   207: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: dup
    //   212: iconst_3
    //   213: aload 11
    //   215: getfield 430	com/tencent/mm/plugin/backup/h/x:jii	I
    //   218: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: aastore
    //   222: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: invokestatic 411	java/lang/System:currentTimeMillis	()J
    //   228: lstore 6
    //   230: aload 11
    //   232: getfield 424	com/tencent/mm/plugin/backup/h/x:jif	I
    //   235: iconst_1
    //   236: if_icmpne +83 -> 319
    //   239: aload 11
    //   241: getfield 186	com/tencent/mm/plugin/backup/h/x:jgP	Lcom/tencent/mm/bm/b;
    //   244: ifnull +75 -> 319
    //   247: aload_0
    //   248: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jep	Ljava/util/List;
    //   251: aload 11
    //   253: getfield 171	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   256: invokeinterface 433 2 0
    //   261: pop
    //   262: new 161	java/lang/StringBuilder
    //   265: dup
    //   266: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   269: invokestatic 145	com/tencent/mm/plugin/backup/a/h:aer	()Ljava/lang/String;
    //   272: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: ldc_w 435
    //   278: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload 11
    //   283: getfield 171	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   286: invokestatic 439	com/tencent/mm/plugin/backup/bakoldlogic/a/d:ti	(Ljava/lang/String;)Ljava/lang/String;
    //   289: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: invokevirtual 174	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   295: aload 11
    //   297: invokestatic 441	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:b	(Ljava/lang/String;Lcom/tencent/mm/plugin/backup/h/x;)V
    //   300: aload_0
    //   301: aload_0
    //   302: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   305: aload 11
    //   307: getfield 186	com/tencent/mm/plugin/backup/h/x:jgP	Lcom/tencent/mm/bm/b;
    //   310: getfield 192	com/tencent/mm/bm/b:tJp	[B
    //   313: arraylength
    //   314: i2l
    //   315: ladd
    //   316: putfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   319: aload_0
    //   320: getfield 90	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXJ	I
    //   323: i2l
    //   324: lstore 8
    //   326: aload_0
    //   327: invokestatic 411	java/lang/System:currentTimeMillis	()J
    //   330: lload 6
    //   332: lsub
    //   333: lload 8
    //   335: ladd
    //   336: l2i
    //   337: putfield 90	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXJ	I
    //   340: invokestatic 411	java/lang/System:currentTimeMillis	()J
    //   343: lstore 6
    //   345: aload 11
    //   347: getfield 424	com/tencent/mm/plugin/backup/h/x:jif	I
    //   350: iconst_2
    //   351: if_icmpne +73 -> 424
    //   354: new 161	java/lang/StringBuilder
    //   357: dup
    //   358: invokespecial 162	java/lang/StringBuilder:<init>	()V
    //   361: invokestatic 145	com/tencent/mm/plugin/backup/a/h:aer	()Ljava/lang/String;
    //   364: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: ldc_w 443
    //   370: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload 11
    //   375: getfield 171	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   378: invokestatic 439	com/tencent/mm/plugin/backup/bakoldlogic/a/d:ti	(Ljava/lang/String;)Ljava/lang/String;
    //   381: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: invokevirtual 174	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   387: aload 11
    //   389: invokestatic 441	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:b	(Ljava/lang/String;Lcom/tencent/mm/plugin/backup/h/x;)V
    //   392: aload_0
    //   393: aload_0
    //   394: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   397: aload 11
    //   399: getfield 186	com/tencent/mm/plugin/backup/h/x:jgP	Lcom/tencent/mm/bm/b;
    //   402: getfield 192	com/tencent/mm/bm/b:tJp	[B
    //   405: arraylength
    //   406: i2l
    //   407: ladd
    //   408: putfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   411: aload_0
    //   412: getfield 105	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXP	Ljava/util/HashSet;
    //   415: aload 11
    //   417: getfield 171	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   420: invokevirtual 444	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   423: pop
    //   424: aload_0
    //   425: getfield 94	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXL	I
    //   428: i2l
    //   429: lstore 8
    //   431: aload_0
    //   432: invokestatic 411	java/lang/System:currentTimeMillis	()J
    //   435: lload 6
    //   437: lsub
    //   438: lload 8
    //   440: ladd
    //   441: l2i
    //   442: putfield 94	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXL	I
    //   445: ldc -58
    //   447: ldc_w 446
    //   450: iconst_2
    //   451: anewarray 4	java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: aload_0
    //   457: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   460: invokestatic 375	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   463: aastore
    //   464: dup
    //   465: iconst_1
    //   466: aload_0
    //   467: getfield 72	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:eJe	J
    //   470: invokestatic 375	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   473: aastore
    //   474: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: aload_0
    //   478: getfield 72	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:eJe	J
    //   481: aload_0
    //   482: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   485: lcmp
    //   486: ifge +11 -> 497
    //   489: aload_0
    //   490: aload_0
    //   491: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   494: putfield 72	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:eJe	J
    //   497: aload_0
    //   498: aload_0
    //   499: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   502: aload_0
    //   503: getfield 72	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:eJe	J
    //   506: iconst_0
    //   507: invokevirtual 449	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:b	(JJI)V
    //   510: aload 10
    //   512: aload 11
    //   514: getfield 171	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   517: putfield 450	com/tencent/mm/plugin/backup/h/ae:jie	Ljava/lang/String;
    //   520: aload 10
    //   522: aload 11
    //   524: getfield 424	com/tencent/mm/plugin/backup/h/x:jif	I
    //   527: putfield 451	com/tencent/mm/plugin/backup/h/ae:jif	I
    //   530: aload 10
    //   532: aload 11
    //   534: getfield 427	com/tencent/mm/plugin/backup/h/x:jih	I
    //   537: putfield 452	com/tencent/mm/plugin/backup/h/ae:jih	I
    //   540: aload 10
    //   542: aload 11
    //   544: getfield 430	com/tencent/mm/plugin/backup/h/x:jii	I
    //   547: putfield 453	com/tencent/mm/plugin/backup/h/ae:jii	I
    //   550: aload 10
    //   552: iconst_0
    //   553: putfield 456	com/tencent/mm/plugin/backup/h/ae:jhA	I
    //   556: aload 10
    //   558: invokevirtual 460	com/tencent/mm/plugin/backup/h/ae:toByteArray	()[B
    //   561: bipush 7
    //   563: iload 4
    //   565: invokestatic 464	com/tencent/mm/plugin/backup/f/b:d	([BII)Z
    //   568: pop
    //   569: ldc2_w 392
    //   572: ldc_w 394
    //   575: invokestatic 120	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   578: return
    //   579: aload_3
    //   580: arraylength
    //   581: istore_2
    //   582: goto -444 -> 138
    //   585: astore_3
    //   586: aload 10
    //   588: ldc 86
    //   590: putfield 450	com/tencent/mm/plugin/backup/h/ae:jie	Ljava/lang/String;
    //   593: aload 10
    //   595: iconst_0
    //   596: putfield 451	com/tencent/mm/plugin/backup/h/ae:jif	I
    //   599: aload 10
    //   601: iconst_0
    //   602: putfield 452	com/tencent/mm/plugin/backup/h/ae:jih	I
    //   605: aload 10
    //   607: iconst_0
    //   608: putfield 453	com/tencent/mm/plugin/backup/h/ae:jii	I
    //   611: aload 10
    //   613: iconst_1
    //   614: putfield 456	com/tencent/mm/plugin/backup/h/ae:jhA	I
    //   617: ldc -58
    //   619: aload_3
    //   620: ldc_w 466
    //   623: iconst_0
    //   624: anewarray 4	java/lang/Object
    //   627: invokestatic 470	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   630: goto -74 -> 556
    //   633: astore_3
    //   634: ldc -58
    //   636: aload_3
    //   637: ldc_w 472
    //   640: iconst_0
    //   641: anewarray 4	java/lang/Object
    //   644: invokestatic 470	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   647: ldc2_w 392
    //   650: ldc_w 394
    //   653: invokestatic 120	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   656: return
    //   657: iload_2
    //   658: bipush 8
    //   660: if_icmpne +550 -> 1210
    //   663: aload_0
    //   664: invokestatic 411	java/lang/System:currentTimeMillis	()J
    //   667: aload_0
    //   668: getfield 96	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXM	J
    //   671: lsub
    //   672: l2i
    //   673: putfield 98	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXN	I
    //   676: aload_0
    //   677: new 474	com/tencent/mm/plugin/backup/h/d
    //   680: dup
    //   681: invokespecial 475	com/tencent/mm/plugin/backup/h/d:<init>	()V
    //   684: putfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   687: aload_0
    //   688: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   691: aload_3
    //   692: invokevirtual 478	com/tencent/mm/plugin/backup/h/d:aD	([B)Lcom/tencent/mm/bm/a;
    //   695: pop
    //   696: ldc -58
    //   698: ldc_w 480
    //   701: bipush 9
    //   703: anewarray 4	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: aload_0
    //   709: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   712: getfield 483	com/tencent/mm/plugin/backup/h/d:jgR	I
    //   715: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   718: aastore
    //   719: dup
    //   720: iconst_1
    //   721: aload_0
    //   722: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   725: getfield 486	com/tencent/mm/plugin/backup/h/d:jgS	I
    //   728: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   731: aastore
    //   732: dup
    //   733: iconst_2
    //   734: aload_0
    //   735: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   738: getfield 489	com/tencent/mm/plugin/backup/h/d:jgT	I
    //   741: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   744: aastore
    //   745: dup
    //   746: iconst_3
    //   747: aload_0
    //   748: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   751: getfield 492	com/tencent/mm/plugin/backup/h/d:jgU	I
    //   754: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   757: aastore
    //   758: dup
    //   759: iconst_4
    //   760: aload_0
    //   761: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   764: getfield 495	com/tencent/mm/plugin/backup/h/d:jgV	I
    //   767: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   770: aastore
    //   771: dup
    //   772: iconst_5
    //   773: aload_0
    //   774: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   777: getfield 498	com/tencent/mm/plugin/backup/h/d:jgW	I
    //   780: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   783: aastore
    //   784: dup
    //   785: bipush 6
    //   787: aload_0
    //   788: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   791: getfield 501	com/tencent/mm/plugin/backup/h/d:jgX	I
    //   794: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   797: aastore
    //   798: dup
    //   799: bipush 7
    //   801: aload_0
    //   802: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   805: getfield 504	com/tencent/mm/plugin/backup/h/d:jgY	I
    //   808: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   811: aastore
    //   812: dup
    //   813: bipush 8
    //   815: aload_0
    //   816: getfield 477	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jet	Lcom/tencent/mm/plugin/backup/h/d;
    //   819: getfield 507	com/tencent/mm/plugin/backup/h/d:jgZ	I
    //   822: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   825: aastore
    //   826: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   829: aload_0
    //   830: getfield 117	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jdW	J
    //   833: invokestatic 513	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   836: ldc2_w 514
    //   839: ldiv
    //   840: lstore 8
    //   842: lload 8
    //   844: lstore 6
    //   846: lload 8
    //   848: lconst_0
    //   849: lcmp
    //   850: ifne +6 -> 856
    //   853: lconst_1
    //   854: lstore 6
    //   856: aload_0
    //   857: getfield 72	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:eJe	J
    //   860: lload 6
    //   862: ldiv
    //   863: lstore 6
    //   865: getstatic 237	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   868: astore_3
    //   869: invokestatic 518	com/tencent/mm/plugin/backup/bakoldlogic/a/d:afR	()Z
    //   872: ifne +16 -> 888
    //   875: aload_0
    //   876: getfield 88	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jes	Ljava/lang/String;
    //   879: ldc_w 520
    //   882: invokevirtual 524	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   885: ifeq +228 -> 1113
    //   888: iconst_1
    //   889: istore_1
    //   890: aload_3
    //   891: sipush 11789
    //   894: bipush 6
    //   896: anewarray 4	java/lang/Object
    //   899: dup
    //   900: iconst_0
    //   901: iconst_1
    //   902: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   905: aastore
    //   906: dup
    //   907: iconst_1
    //   908: iload_1
    //   909: invokestatic 401	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   912: aastore
    //   913: dup
    //   914: iconst_2
    //   915: lload 6
    //   917: invokestatic 375	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   920: aastore
    //   921: dup
    //   922: iconst_3
    //   923: aload_0
    //   924: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   927: invokestatic 375	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   930: aastore
    //   931: dup
    //   932: iconst_4
    //   933: aload_0
    //   934: getfield 72	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:eJe	J
    //   937: invokestatic 375	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   940: aastore
    //   941: dup
    //   942: iconst_5
    //   943: iconst_0
    //   944: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   947: aastore
    //   948: invokevirtual 527	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   951: getstatic 237	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   954: ldc2_w 238
    //   957: ldc2_w 528
    //   960: lconst_1
    //   961: iconst_0
    //   962: invokevirtual 244	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   965: getstatic 237	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   968: astore_3
    //   969: aload_0
    //   970: getfield 107	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXR	Z
    //   973: ifne +11 -> 984
    //   976: aload_0
    //   977: getfield 109	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXQ	I
    //   980: iconst_1
    //   981: if_icmpne +137 -> 1118
    //   984: bipush 19
    //   986: istore 4
    //   988: aload_3
    //   989: ldc2_w 238
    //   992: iload 4
    //   994: i2l
    //   995: lconst_1
    //   996: iconst_0
    //   997: invokevirtual 244	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   1000: getstatic 237	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   1003: ldc2_w 238
    //   1006: ldc2_w 530
    //   1009: aload_0
    //   1010: getfield 76	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:recvSize	J
    //   1013: ldc2_w 532
    //   1016: ldiv
    //   1017: iconst_0
    //   1018: invokevirtual 244	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   1021: getstatic 237	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   1024: astore_3
    //   1025: aload_0
    //   1026: getfield 107	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXR	Z
    //   1029: ifne +11 -> 1040
    //   1032: aload_0
    //   1033: getfield 109	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXQ	I
    //   1036: iconst_1
    //   1037: if_icmpne +88 -> 1125
    //   1040: bipush 22
    //   1042: istore 4
    //   1044: aload_3
    //   1045: ldc2_w 238
    //   1048: iload 4
    //   1050: i2l
    //   1051: lload 6
    //   1053: ldc2_w 532
    //   1056: ldiv
    //   1057: iconst_0
    //   1058: invokevirtual 244	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   1061: aload_0
    //   1062: lconst_0
    //   1063: putfield 117	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jdW	J
    //   1066: aload_0
    //   1067: invokevirtual 536	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:aga	()V
    //   1070: aload_0
    //   1071: getfield 82	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:lock	Ljava/lang/Object;
    //   1074: astore_3
    //   1075: aload_3
    //   1076: monitorenter
    //   1077: aload_0
    //   1078: getfield 84	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:guN	Z
    //   1081: ifeq +51 -> 1132
    //   1084: aload_3
    //   1085: monitorexit
    //   1086: ldc2_w 392
    //   1089: ldc_w 394
    //   1092: invokestatic 120	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1095: return
    //   1096: astore_3
    //   1097: ldc -58
    //   1099: aload_3
    //   1100: ldc_w 538
    //   1103: iconst_0
    //   1104: anewarray 4	java/lang/Object
    //   1107: invokestatic 470	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1110: goto -281 -> 829
    //   1113: iconst_0
    //   1114: istore_1
    //   1115: goto -225 -> 890
    //   1118: bipush 18
    //   1120: istore 4
    //   1122: goto -134 -> 988
    //   1125: bipush 21
    //   1127: istore 4
    //   1129: goto -85 -> 1044
    //   1132: aload_0
    //   1133: getfield 127	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jeo	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;
    //   1136: ifnull +10 -> 1146
    //   1139: aload_0
    //   1140: getfield 127	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jeo	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;
    //   1143: invokevirtual 132	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:cancel	()V
    //   1146: ldc -58
    //   1148: ldc_w 540
    //   1151: iconst_1
    //   1152: anewarray 4	java/lang/Object
    //   1155: dup
    //   1156: iconst_0
    //   1157: aload_0
    //   1158: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jep	Ljava/util/List;
    //   1161: invokeinterface 543 1 0
    //   1166: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1169: aastore
    //   1170: invokestatic 226	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1173: aload_0
    //   1174: new 129	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k
    //   1177: dup
    //   1178: aload_0
    //   1179: getfield 68	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jep	Ljava/util/List;
    //   1182: aload_0
    //   1183: getfield 74	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:iXI	J
    //   1186: l2i
    //   1187: invokespecial 546	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:<init>	(Ljava/util/List;I)V
    //   1190: putfield 127	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jeo	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;
    //   1193: aload_0
    //   1194: getfield 127	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jeo	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;
    //   1197: aload_0
    //   1198: putfield 549	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:jdL	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/d;
    //   1201: aload_0
    //   1202: getfield 127	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:jeo	Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k;
    //   1205: invokevirtual 552	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/k:agi	()V
    //   1208: aload_3
    //   1209: monitorexit
    //   1210: iload_2
    //   1211: iconst_5
    //   1212: if_icmpne +19 -> 1231
    //   1215: invokestatic 320	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:afV	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a;
    //   1218: invokevirtual 556	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/a:afY	()Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g;
    //   1221: ldc_w 557
    //   1224: invokevirtual 380	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:kF	(I)V
    //   1227: aload_0
    //   1228: invokespecial 559	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/g:agf	()V
    //   1231: ldc2_w 392
    //   1234: ldc_w 394
    //   1237: invokestatic 120	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1240: return
    //   1241: astore 10
    //   1243: aload_3
    //   1244: monitorexit
    //   1245: aload 10
    //   1247: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1248	0	this	g
    //   0	1248	1	paramBoolean	boolean
    //   0	1248	2	paramInt1	int
    //   0	1248	4	paramInt2	int
    //   14	83	5	i	int
    //   130	922	6	l1	long
    //   324	523	8	l2	long
    //   154	458	10	localae	com.tencent.mm.plugin.backup.h.ae
    //   1241	5	10	localObject	Object
    //   163	380	11	localx	x
    // Exception table:
    //   from	to	target	type
    //   165	319	585	java/lang/Exception
    //   319	424	585	java/lang/Exception
    //   424	497	585	java/lang/Exception
    //   497	556	585	java/lang/Exception
    //   556	569	633	java/lang/Exception
    //   687	829	1096	java/lang/Exception
    //   1077	1086	1241	finally
    //   1132	1146	1241	finally
    //   1146	1210	1241	finally
    //   1243	1245	1241	finally
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(14741267283968L, 109831);
    final Intent localIntent = new Intent(ab.getContext(), BakMoveNewUI.class);
    localIntent.putExtra("need_auth", paramBoolean);
    localIntent.putExtra("WifiName", paramString1);
    localIntent.putExtra("ip", paramString2);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "need_auth:%b, wifiName %s, ip:%s, port:%d", new Object[] { Boolean.valueOf(paramBoolean), paramString1, paramString2, Integer.valueOf(paramInt) });
    localIntent.addFlags(335544320);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14745562251264L, 109863);
        ab.getContext().startActivity(localIntent);
        GMTrace.o(14745562251264L, 109863);
      }
    });
    GMTrace.o(14741267283968L, 109831);
  }
  
  public final void aeg()
  {
    GMTrace.i(14742206808064L, 109838);
    com.tencent.mm.plugin.report.service.g.ork.a(103L, 6L, 1L, false);
    kF(30059999);
    at.AR();
    c.xh().a(w.a.vvW, Boolean.valueOf(true));
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS.");
    if (this.jeg != null) {
      this.jeg.aeg();
    }
    GMTrace.o(14742206808064L, 109838);
  }
  
  public final void aga()
  {
    GMTrace.i(14742072590336L, 109837);
    if (this.jeg != null) {
      this.jeg.aga();
    }
    GMTrace.o(14742072590336L, 109837);
  }
  
  public final void agh()
  {
    GMTrace.i(14740864630784L, 109828);
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = a.afV().iVm;
    try
    {
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      agf();
      GMTrace.o(14740864630784L, 109828);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.MoveRecoverServer", localException, "sendBuf", new Object[0]);
      }
    }
  }
  
  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(14741804154880L, 109835);
    if ((this.jdV != 0L) && (bg.aI(this.jdV) < 100L))
    {
      GMTrace.o(14741804154880L, 109835);
      return;
    }
    this.jdV = bg.Pw();
    if (this.jdW == 0L) {
      this.jdW = bg.Pw();
    }
    if (paramLong1 > paramLong2) {
      paramLong1 = paramLong2;
    }
    for (;;)
    {
      paramInt = (int)((this.jdV - this.jdW) * (paramLong2 - paramLong1) / paramLong1) / 1000;
      if (this.jeg != null) {
        this.jeg.b(paramLong1, paramLong2, paramInt);
      }
      GMTrace.o(14741804154880L, 109835);
      return;
    }
  }
  
  public final void bI(int paramInt1, int paramInt2)
  {
    GMTrace.i(14741938372608L, 109836);
    if (this.jeg != null) {
      this.jeg.bI(paramInt1, paramInt2);
    }
    GMTrace.o(14741938372608L, 109836);
  }
  
  public final void kF(int paramInt)
  {
    int j = 1;
    GMTrace.i(14742341025792L, 109839);
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    if ((this.iXT) && (this.iXS) && (this.jet != null) && (this.jeo != null))
    {
      com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
      k = this.jet.jgR;
      m = this.jet.jgS;
      n = this.jet.jgT;
      i1 = this.jet.jgU;
      i2 = this.jet.jgV;
      i3 = this.jet.jgW;
      i4 = this.jet.jgX;
      i5 = this.jet.jgY;
      i6 = this.jeo.jeA;
      i7 = this.jeo.jez;
      i8 = this.iXP.size();
      i9 = this.iXJ;
      i10 = this.jeo.jeB;
      i11 = this.iXL;
      i12 = this.iXN;
      i13 = (int)(this.iXK / 1024L);
      i14 = this.jet.jgZ;
      if (!this.iXR) {
        break label716;
      }
      i = 1;
      localg.i(13287, new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(paramInt), Integer.valueOf(i14), Integer.valueOf(i) });
      k = this.jet.jgR;
      m = this.jet.jgS;
      n = this.jet.jgT;
      i1 = this.jet.jgU;
      i2 = this.jet.jgV;
      i3 = this.jet.jgW;
      i4 = this.jet.jgX;
      i5 = this.jet.jgY;
      i6 = this.jeo.jeA;
      i7 = this.jeo.jez;
      i8 = this.iXP.size();
      i9 = this.iXJ;
      i10 = this.jeo.jeB;
      i11 = this.iXL;
      i12 = this.iXN;
      i13 = (int)(this.iXK / 1024L);
      i14 = this.jet.jgZ;
      if (!this.iXR) {
        break label724;
      }
    }
    label716:
    label724:
    for (int i = j;; i = this.iXQ)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "NewBakMoveInfoKvstat, Client, ServerSessionCount:%d, ServerMessageCount:%d, ServerFileCount:%d, CalculateSize:%d, ServerDataPushSize:%d, ServerReadDBTotalTime:%d, ServerReadFileTotalTime:%d, ServerCostTotalTime:%d, ClientSessionCount:%d, ClientMessageCount:%d, ClientFileCount:%d, ClientWriteTmpFileTotalTime:%d, ClientWriteDBTotalTime:%d, ClientWriteFileTotalTime:%d, ClientCostTotalTime:%d, ClientDataPushSize:%d, ErrorCode:%d, ServerVersion:%x, m_networkState:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(paramInt), Integer.valueOf(i14), Integer.valueOf(i) });
      GMTrace.o(14742341025792L, 109839);
      return;
      i = this.iXQ;
      break;
    }
  }
  
  public final void onError(int paramInt, String paramString)
  {
    GMTrace.i(14741669937152L, 109834);
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
    if ((com.tencent.mm.plugin.backup.bakoldlogic.a.d.afR()) || (this.jes.endsWith(".1"))) {}
    for (boolean bool = true;; bool = false)
    {
      localg.i(11789, new Object[] { Integer.valueOf(0), Boolean.valueOf(bool), Integer.valueOf(0), Long.valueOf(this.recvSize), Long.valueOf(this.eJe), Integer.valueOf(paramInt) });
      if (this.jeg != null) {
        this.jeg.onError(paramInt, paramString);
      }
      GMTrace.o(14741669937152L, 109834);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */