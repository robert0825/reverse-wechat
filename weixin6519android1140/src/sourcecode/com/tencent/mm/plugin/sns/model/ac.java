package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.g.d;
import com.tencent.mm.plugin.sns.g.e;
import com.tencent.mm.plugin.sns.g.f;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public final class ac
{
  String fJS;
  private String path;
  private d ptB;
  private List<Integer> ptC;
  private Map<String, Integer> ptD;
  private List<Integer> ptE;
  private Map<Integer, Integer> ptF;
  
  public ac(String paramString)
  {
    GMTrace.i(8093463216128L, 60301);
    this.fJS = "";
    this.ptC = new Vector();
    this.ptD = new HashMap();
    this.ptE = new Vector();
    this.ptF = new HashMap();
    this.path = paramString;
    if (!biG()) {
      this.ptB = new d();
    }
    this.ptC.clear();
    this.ptD.clear();
    GMTrace.o(8093463216128L, 60301);
  }
  
  public static boolean Hq(String paramString)
  {
    GMTrace.i(8093328998400L, 60300);
    if (paramString == null)
    {
      GMTrace.o(8093328998400L, 60300);
      return false;
    }
    if (paramString.startsWith("_AD_TAG_"))
    {
      GMTrace.o(8093328998400L, 60300);
      return true;
    }
    GMTrace.o(8093328998400L, 60300);
    return false;
  }
  
  public static bew a(ber paramber)
  {
    GMTrace.i(8094536957952L, 60309);
    beq localbeq = paramber.uQt;
    paramber = paramber.uQu;
    bew localbew = new bew();
    localbew.nIp = localbeq.nIp;
    localbew.nFd = localbeq.nFd;
    localbew.uBf = localbeq.uQj;
    localbew.tQP = localbeq.tQP;
    localbew.jib = localbeq.jib;
    localbew.tRz = localbeq.uKB;
    localbew.uQm = localbeq.uQm;
    localbew.uQp = localbeq.uQp;
    localbew.uQr = localbeq.uQr;
    localbew.uQG = paramber.uKB;
    localbew.uQo = paramber.uQo;
    localbew.uQl = paramber.uQl;
    GMTrace.o(8094536957952L, 60309);
    return localbew;
  }
  
  private static void a(long paramLong, LinkedList<e> paramLinkedList, String paramString)
  {
    GMTrace.i(8095208046592L, 60314);
    a(paramLong, paramLinkedList, paramString, false);
    GMTrace.o(8095208046592L, 60314);
  }
  
  private static boolean a(long paramLong, LinkedList<e> paramLinkedList, String paramString, boolean paramBoolean)
  {
    GMTrace.i(8095342264320L, 60315);
    Iterator localIterator = paramLinkedList.iterator();
    e locale2;
    do
    {
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        locale2 = (e)localIterator.next();
      } while (locale2.prY.tXT != paramLong);
      locale1 = locale2;
      if (paramBoolean) {
        break;
      }
    } while (!locale2.pzf.equals(paramString));
    for (e locale1 = locale2;; locale1 = null)
    {
      if (locale1 != null)
      {
        paramLinkedList.remove(locale1);
        GMTrace.o(8095342264320L, 60315);
        return true;
      }
      GMTrace.o(8095342264320L, 60315);
      return false;
    }
  }
  
  private static boolean a(LinkedList<bew> paramLinkedList, String paramString, int paramInt)
  {
    GMTrace.i(8094268522496L, 60307);
    if (bg.nm(paramString))
    {
      GMTrace.o(8094268522496L, 60307);
      return true;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bew localbew = (bew)paramLinkedList.next();
      if ((paramString.equals(localbew.nIp)) && (paramInt == localbew.nFd))
      {
        GMTrace.o(8094268522496L, 60307);
        return true;
      }
    }
    GMTrace.o(8094268522496L, 60307);
    return false;
  }
  
  private static boolean aj(LinkedList<e> paramLinkedList)
  {
    GMTrace.i(8093731651584L, 60303);
    while (!paramLinkedList.isEmpty())
    {
      e locale = (e)paramLinkedList.getFirst();
      if (bg.aG(locale.pzg) > 21600L)
      {
        paramLinkedList.removeFirst();
      }
      else
      {
        if (Hq(locale.pzf))
        {
          h.xz();
          h.xx().fYr.a(new j(locale.prY, locale.pzf, locale.pzh), 0);
        }
        for (;;)
        {
          GMTrace.o(8093731651584L, 60303);
          return true;
          h.xz();
          h.xx().fYr.a(new n(locale.prY, locale.pzf), 0);
        }
      }
    }
    GMTrace.o(8093731651584L, 60303);
    return false;
  }
  
  private boolean biF()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(8095744917504L, 60318);
        try
        {
          byte[] arrayOfByte = this.ptB.toByteArray();
          if (FileOp.b(this.path, arrayOfByte, arrayOfByte.length) != 0) {
            continue;
          }
          bool = true;
          GMTrace.o(8095744917504L, 60318);
        }
        catch (IOException localIOException)
        {
          w.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", localIOException, "listToFile failed: " + this.path, new Object[0]);
          FileOp.deleteFile(this.path);
          GMTrace.o(8095744917504L, 60318);
          boolean bool = false;
          continue;
        }
        return bool;
      }
      finally {}
      GMTrace.o(8095744917504L, 60318);
      bool = false;
    }
  }
  
  private boolean biG()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(8095879135232L, 60319);
        arrayOfByte = FileOp.c(this.path, 0, -1);
        if (arrayOfByte != null) {
          continue;
        }
        GMTrace.o(8095879135232L, 60319);
        bool = false;
      }
      finally
      {
        try
        {
          byte[] arrayOfByte;
          this.ptB = ((d)new d().aD(arrayOfByte));
          bool = true;
          GMTrace.o(8095879135232L, 60319);
        }
        catch (IOException localIOException)
        {
          w.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", localIOException, "", new Object[0]);
          FileOp.deleteFile(this.path);
          GMTrace.o(8095879135232L, 60319);
          boolean bool = false;
        }
        localObject = finally;
      }
      return bool;
    }
  }
  
  private void d(long paramLong, int paramInt, String paramString)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(8095073828864L, 60313);
        switch (paramInt)
        {
        case 4: 
        case 6: 
          biF();
          GMTrace.o(8095073828864L, 60313);
          return;
        }
      }
      finally {}
      a(paramLong, this.ptB.pyZ, paramString);
      continue;
      a(paramLong, this.ptB.pza, paramString);
      continue;
      a(paramLong, this.ptB.pyZ, paramString);
      continue;
      a(paramLong, this.ptB.pza, paramString);
      continue;
      a(paramLong, this.ptB.pzb, paramString);
      continue;
      a(paramLong, this.ptB.pzc, paramString);
    }
  }
  
  /* Error */
  public final boolean Hr(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 350
    //   7: ldc_w 352
    //   10: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: getfield 46	com/tencent/mm/plugin/sns/model/ac:ptD	Ljava/util/Map;
    //   17: aload_1
    //   18: invokeinterface 355 2 0
    //   23: ifeq +16 -> 39
    //   26: ldc2_w 350
    //   29: ldc_w 352
    //   32: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: iload_2
    //   38: ireturn
    //   39: aload_0
    //   40: getfield 46	com/tencent/mm/plugin/sns/model/ac:ptD	Ljava/util/Map;
    //   43: aload_1
    //   44: iconst_0
    //   45: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   48: invokeinterface 365 3 0
    //   53: pop
    //   54: iconst_1
    //   55: istore_2
    //   56: ldc2_w 350
    //   59: ldc_w 352
    //   62: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   65: goto -30 -> 35
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	ac
    //   0	73	1	paramString	String
    //   1	55	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	35	68	finally
    //   39	54	68	finally
    //   56	65	68	finally
  }
  
  public final boolean Hs(String paramString)
  {
    try
    {
      GMTrace.i(8096684441600L, 60325);
      this.ptD.remove(paramString);
      GMTrace.o(8096684441600L, 60325);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean a(String paramString, ber paramber)
  {
    GMTrace.i(8094671175680L, 60310);
    boolean bool = a(paramString, paramber, "");
    GMTrace.o(8094671175680L, 60310);
    return bool;
  }
  
  public final boolean a(String paramString1, ber paramber, String paramString2)
  {
    boolean bool2 = true;
    for (;;)
    {
      e locale;
      try
      {
        GMTrace.i(8094805393408L, 60311);
        locale = new e();
        locale.pzf = paramString1;
        locale.prY = paramber;
        locale.pzg = ((int)bg.Pu());
        locale.pzh = paramString2;
        bool1 = bool2;
        switch (paramber.uQt.jib)
        {
        case 4: 
        case 6: 
          if (!biF()) {
            w.e("MicroMsg.SnsAsyncQueueMgr", "error listToFile");
          }
          GMTrace.o(8094805393408L, 60311);
          return bool1;
        }
      }
      finally {}
      this.ptB.pyZ.add(locale);
      boolean bool1 = bool2;
      if (dJ(paramber.tXT))
      {
        bool1 = false;
        continue;
        this.ptB.pza.add(locale);
        bool1 = bool2;
        continue;
        this.ptB.pyZ.add(locale);
        bool1 = bool2;
        if (dJ(paramber.tXT))
        {
          bool1 = false;
          continue;
          this.ptB.pza.add(locale);
          bool1 = bool2;
          continue;
          this.ptB.pzb.add(locale);
          bool1 = bool2;
          continue;
          this.ptB.pzc.add(locale);
          bool1 = bool2;
          continue;
          bool1 = bool2;
        }
      }
    }
  }
  
  public final void biE()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(8093597433856L, 60302);
        if (aj(this.ptB.pyZ))
        {
          GMTrace.o(8093597433856L, 60302);
          return;
        }
        if (aj(this.ptB.pza))
        {
          GMTrace.o(8093597433856L, 60302);
          continue;
        }
        if (!aj(this.ptB.pzb)) {
          break label91;
        }
      }
      finally {}
      GMTrace.o(8093597433856L, 60302);
      continue;
      label91:
      if (aj(this.ptB.pzc))
      {
        GMTrace.o(8093597433856L, 60302);
      }
      else
      {
        f localf;
        long l;
        for (;;)
        {
          if (!this.ptB.pzd.isEmpty())
          {
            localf = (f)this.ptB.pzd.getFirst();
            if (bg.aG(localf.pzg) > 21600L)
            {
              this.ptB.pzd.removeFirst();
            }
            else
            {
              l = localf.pzi;
              h.xz();
              h.xx().fYr.a(new q(l, 1), 0);
              GMTrace.o(8093597433856L, 60302);
              break;
            }
          }
        }
        for (;;)
        {
          if (!this.ptB.pze.isEmpty())
          {
            localf = (f)this.ptB.pze.getFirst();
            if (bg.aG(localf.pzg) > 21600L)
            {
              this.ptB.pze.removeFirst();
            }
            else
            {
              l = localf.pzi;
              h.xz();
              h.xx().fYr.a(new q(l, 5), 0);
              GMTrace.o(8093597433856L, 60302);
              break;
            }
          }
        }
        GMTrace.o(8093597433856L, 60302);
      }
    }
  }
  
  public final int biH()
  {
    try
    {
      GMTrace.i(8096818659328L, 60326);
      int i = this.ptD.size();
      GMTrace.o(8096818659328L, 60326);
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final bfh c(bfh parambfh)
  {
    long l;
    Iterator localIterator;
    Object localObject1;
    Object localObject2;
    try
    {
      GMTrace.i(8094402740224L, 60308);
      if (bg.nm(this.fJS)) {
        this.fJS = com.tencent.mm.y.q.zE();
      }
      if ((this.ptB.pyZ.size() == 0) && (this.ptB.pza.size() == 0))
      {
        GMTrace.o(8094402740224L, 60308);
        return parambfh;
      }
      l = parambfh.tXT;
      localIterator = this.ptB.pyZ.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (e)localIterator.next();
        localObject2 = a(((e)localObject1).prY);
        if ((((e)localObject1).prY.tXT == l) && (!a(parambfh.uQQ, ((bew)localObject2).nIp, ((bew)localObject2).nFd)))
        {
          parambfh.uQQ.add(localObject2);
          parambfh.uQO += 1;
        }
      }
      localIterator = parambfh.uQQ.iterator();
    }
    finally {}
    label186:
    int i;
    while (localIterator.hasNext())
    {
      localObject1 = (bew)localIterator.next();
      if (((bew)localObject1).tRz.equals(this.fJS))
      {
        i = 0;
        localObject2 = this.ptB.pze.iterator();
        label237:
        if (!((Iterator)localObject2).hasNext()) {
          break label405;
        }
        if (((f)((Iterator)localObject2).next()).pzi != l) {
          break label402;
        }
        parambfh.uQQ.remove(localObject1);
        parambfh.uQO -= 1;
        i = 1;
        break label402;
      }
    }
    for (;;)
    {
      localIterator = this.ptB.pza.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (e)localIterator.next();
        if (((e)localObject1).prY.tXT == l)
        {
          localObject1 = a(((e)localObject1).prY);
          if (!a(parambfh.uQT, ((bew)localObject1).nIp, ((bew)localObject1).nFd))
          {
            parambfh.uQT.add(localObject1);
            parambfh.uQR += 1;
          }
        }
      }
      GMTrace.o(8094402740224L, 60308);
      break;
      label402:
      break label237;
      label405:
      if (i == 0) {
        break label186;
      }
    }
  }
  
  public final void c(long paramLong, int paramInt, String paramString)
  {
    GMTrace.i(8094939611136L, 60312);
    ai.bjw();
    d(paramLong, paramInt, paramString);
    GMTrace.o(8094939611136L, 60312);
  }
  
  public final boolean cW(int paramInt1, int paramInt2)
  {
    try
    {
      GMTrace.i(8097221312512L, 60329);
      this.ptF.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
      GMTrace.o(8097221312512L, 60329);
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean dF(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 476
    //   5: ldc_w 478
    //   8: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 61	com/tencent/mm/plugin/sns/model/ac:ptB	Lcom/tencent/mm/plugin/sns/g/d;
    //   15: getfield 409	com/tencent/mm/plugin/sns/g/d:pzd	Ljava/util/LinkedList;
    //   18: invokevirtual 175	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   21: astore 4
    //   23: aload 4
    //   25: invokeinterface 180 1 0
    //   30: ifeq +36 -> 66
    //   33: aload 4
    //   35: invokeinterface 184 1 0
    //   40: checkcast 411	com/tencent/mm/plugin/sns/g/f
    //   43: getfield 415	com/tencent/mm/plugin/sns/g/f:pzi	J
    //   46: lload_1
    //   47: lcmp
    //   48: ifne -25 -> 23
    //   51: iconst_0
    //   52: istore_3
    //   53: ldc2_w 476
    //   56: ldc_w 478
    //   59: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   62: aload_0
    //   63: monitorexit
    //   64: iload_3
    //   65: ireturn
    //   66: iconst_1
    //   67: istore_3
    //   68: ldc2_w 476
    //   71: ldc_w 478
    //   74: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: goto -15 -> 62
    //   80: astore 4
    //   82: aload_0
    //   83: monitorexit
    //   84: aload 4
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	ac
    //   0	87	1	paramLong	long
    //   52	16	3	bool	boolean
    //   21	13	4	localIterator	Iterator
    //   80	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	23	80	finally
    //   23	51	80	finally
    //   53	62	80	finally
    //   68	77	80	finally
  }
  
  public final void dG(long paramLong)
  {
    try
    {
      GMTrace.i(8094000087040L, 60305);
      f localf = new f();
      localf.pzi = paramLong;
      localf.pzg = ((int)bg.Pu());
      this.ptB.pzd.add(localf);
      biF();
      GMTrace.o(8094000087040L, 60305);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void dH(long paramLong)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(8094134304768L, 60306);
        Iterator localIterator = this.ptB.pzd.iterator();
        if (localIterator.hasNext())
        {
          f localf = (f)localIterator.next();
          if (localf.pzi != paramLong) {
            continue;
          }
          if (localf != null) {
            this.ptB.pzd.remove(localf);
          }
          biF();
          GMTrace.o(8094134304768L, 60306);
          return;
        }
      }
      finally {}
      Object localObject2 = null;
    }
  }
  
  /* Error */
  public final boolean dI(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 490
    //   7: ldc_w 492
    //   10: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: new 411	com/tencent/mm/plugin/sns/g/f
    //   16: dup
    //   17: invokespecial 484	com/tencent/mm/plugin/sns/g/f:<init>	()V
    //   20: astore 4
    //   22: aload 4
    //   24: lload_1
    //   25: putfield 415	com/tencent/mm/plugin/sns/g/f:pzi	J
    //   28: aload 4
    //   30: invokestatic 387	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   33: l2i
    //   34: putfield 412	com/tencent/mm/plugin/sns/g/f:pzg	I
    //   37: aload_0
    //   38: getfield 61	com/tencent/mm/plugin/sns/model/ac:ptB	Lcom/tencent/mm/plugin/sns/g/d;
    //   41: getfield 422	com/tencent/mm/plugin/sns/g/d:pze	Ljava/util/LinkedList;
    //   44: aload 4
    //   46: invokevirtual 396	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   49: pop
    //   50: aload_0
    //   51: invokespecial 333	com/tencent/mm/plugin/sns/model/ac:biF	()Z
    //   54: pop
    //   55: lload_1
    //   56: aload_0
    //   57: getfield 61	com/tencent/mm/plugin/sns/model/ac:ptB	Lcom/tencent/mm/plugin/sns/g/d;
    //   60: getfield 337	com/tencent/mm/plugin/sns/g/d:pyZ	Ljava/util/LinkedList;
    //   63: ldc 34
    //   65: iconst_1
    //   66: invokestatic 164	com/tencent/mm/plugin/sns/model/ac:a	(JLjava/util/LinkedList;Ljava/lang/String;Z)Z
    //   69: ifne +16 -> 85
    //   72: ldc2_w 490
    //   75: ldc_w 492
    //   78: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   81: aload_0
    //   82: monitorexit
    //   83: iload_3
    //   84: ireturn
    //   85: iconst_0
    //   86: istore_3
    //   87: ldc2_w 490
    //   90: ldc_w 492
    //   93: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: goto -15 -> 81
    //   99: astore 4
    //   101: aload_0
    //   102: monitorexit
    //   103: aload 4
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	ac
    //   0	106	1	paramLong	long
    //   1	86	3	bool	boolean
    //   20	25	4	localf	f
    //   99	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	81	99	finally
    //   87	96	99	finally
  }
  
  final boolean dJ(long paramLong)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(8095610699776L, 60317);
        Iterator localIterator = this.ptB.pze.iterator();
        if (!localIterator.hasNext()) {
          break label105;
        }
        f localf = (f)localIterator.next();
        if (localf.pzi != paramLong) {
          continue;
        }
        if (localf != null)
        {
          this.ptB.pze.remove(localf);
          bool = true;
          biF();
          GMTrace.o(8095610699776L, 60317);
          return bool;
        }
      }
      finally {}
      boolean bool = false;
      continue;
      label105:
      Object localObject2 = null;
    }
  }
  
  public final boolean isDownloading(String paramString)
  {
    try
    {
      GMTrace.i(8096416006144L, 60323);
      boolean bool = this.ptD.containsKey(paramString);
      GMTrace.o(8096416006144L, 60323);
      return bool;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean un(int paramInt)
  {
    try
    {
      GMTrace.i(8096013352960L, 60320);
      boolean bool = this.ptC.contains(Integer.valueOf(paramInt));
      GMTrace.o(8096013352960L, 60320);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean uo(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 509
    //   5: ldc_w 511
    //   8: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 41	com/tencent/mm/plugin/sns/model/ac:ptC	Ljava/util/List;
    //   15: iload_1
    //   16: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   19: invokeinterface 507 2 0
    //   24: ifeq +18 -> 42
    //   27: iconst_0
    //   28: istore_2
    //   29: ldc2_w 509
    //   32: ldc_w 511
    //   35: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: aload_0
    //   39: monitorexit
    //   40: iload_2
    //   41: ireturn
    //   42: aload_0
    //   43: getfield 41	com/tencent/mm/plugin/sns/model/ac:ptC	Ljava/util/List;
    //   46: iload_1
    //   47: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: invokeinterface 512 2 0
    //   55: pop
    //   56: iconst_1
    //   57: istore_2
    //   58: ldc2_w 509
    //   61: ldc_w 511
    //   64: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: goto -29 -> 38
    //   70: astore_3
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_3
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	ac
    //   0	75	1	paramInt	int
    //   28	30	2	bool	boolean
    //   70	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	70	finally
    //   29	38	70	finally
    //   42	56	70	finally
    //   58	67	70	finally
  }
  
  public final boolean up(int paramInt)
  {
    try
    {
      GMTrace.i(8096281788416L, 60322);
      this.ptC.remove(Integer.valueOf(paramInt));
      GMTrace.o(8096281788416L, 60322);
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean uq(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 519
    //   5: ldc_w 521
    //   8: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 48	com/tencent/mm/plugin/sns/model/ac:ptE	Ljava/util/List;
    //   15: iload_1
    //   16: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   19: invokeinterface 507 2 0
    //   24: ifeq +18 -> 42
    //   27: iconst_0
    //   28: istore_2
    //   29: ldc2_w 519
    //   32: ldc_w 521
    //   35: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: aload_0
    //   39: monitorexit
    //   40: iload_2
    //   41: ireturn
    //   42: aload_0
    //   43: getfield 48	com/tencent/mm/plugin/sns/model/ac:ptE	Ljava/util/List;
    //   46: iload_1
    //   47: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: invokeinterface 512 2 0
    //   55: pop
    //   56: iconst_1
    //   57: istore_2
    //   58: ldc2_w 519
    //   61: ldc_w 521
    //   64: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: goto -29 -> 38
    //   70: astore_3
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_3
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	ac
    //   0	75	1	paramInt	int
    //   28	30	2	bool	boolean
    //   70	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	70	finally
    //   29	38	70	finally
    //   42	56	70	finally
    //   58	67	70	finally
  }
  
  public final boolean ur(int paramInt)
  {
    try
    {
      GMTrace.i(8097087094784L, 60328);
      this.ptE.remove(Integer.valueOf(paramInt));
      this.ptF.remove(Integer.valueOf(paramInt));
      GMTrace.o(8097087094784L, 60328);
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean us(int paramInt)
  {
    try
    {
      GMTrace.i(8097355530240L, 60330);
      this.ptF.remove(Integer.valueOf(paramInt));
      GMTrace.o(8097355530240L, 60330);
      return true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final int ut(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 532
    //   5: ldc_w 534
    //   8: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 50	com/tencent/mm/plugin/sns/model/ac:ptF	Ljava/util/Map;
    //   15: iload_1
    //   16: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   19: invokeinterface 355 2 0
    //   24: ifeq +36 -> 60
    //   27: aload_0
    //   28: getfield 50	com/tencent/mm/plugin/sns/model/ac:ptF	Ljava/util/Map;
    //   31: iload_1
    //   32: invokestatic 361	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: invokeinterface 537 2 0
    //   40: checkcast 357	java/lang/Integer
    //   43: invokevirtual 540	java/lang/Integer:intValue	()I
    //   46: istore_1
    //   47: ldc2_w 532
    //   50: ldc_w 534
    //   53: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   56: aload_0
    //   57: monitorexit
    //   58: iload_1
    //   59: ireturn
    //   60: iconst_m1
    //   61: istore_1
    //   62: ldc2_w 532
    //   65: ldc_w 534
    //   68: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   71: goto -15 -> 56
    //   74: astore_2
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_2
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	ac
    //   0	79	1	paramInt	int
    //   74	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	56	74	finally
    //   62	71	74	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */