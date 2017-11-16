package com.tencent.mm.plugin.clean.c;

import android.database.Cursor;
import android.os.Looper;
import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.clean.c.a.a.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements a.a, Runnable
{
  public static final Long jSH;
  public static final Long jSI;
  public static final int jSU;
  private long endTime;
  private com.tencent.mm.sdk.platformtools.ae ghS;
  public boolean isStop;
  public long jSK;
  public long jSL;
  private com.tencent.mm.plugin.clean.c.a.b jSV;
  public g jSW;
  public int jSX;
  public int jSY;
  public ConcurrentHashMap<String, b> jSZ;
  public long jTa;
  public long jTb;
  public HashSet<String> jTc;
  private HashSet<String> jTd;
  public boolean jTe;
  public int[] jTf;
  private long startTime;
  
  static
  {
    GMTrace.i(7044954324992L, 52489);
    jSH = Long.valueOf(604800000L);
    jSI = Long.valueOf(7776000000L);
    at.AR();
    jSU = com.tencent.mm.y.c.zo().length() - 1;
    GMTrace.o(7044954324992L, 52489);
  }
  
  public c(com.tencent.mm.plugin.clean.c.a.b paramb, g paramg)
  {
    GMTrace.i(7041598881792L, 52464);
    this.jSX = 0;
    this.jSY = 0;
    this.startTime = 0L;
    this.endTime = 0L;
    this.ghS = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.jTc = new HashSet();
    this.jTd = new HashSet();
    this.jTe = true;
    this.jTf = new int[10];
    this.jSZ = new ConcurrentHashMap();
    this.jSW = paramg;
    this.jSV = paramb;
    GMTrace.o(7041598881792L, 52464);
  }
  
  public static a a(au paramau, String paramString)
  {
    Object localObject3 = null;
    GMTrace.i(16034186657792L, 119464);
    Object localObject1 = bg.Sx(paramau.field_content);
    if (localObject1 != null) {}
    for (Object localObject2 = f.a.eS((String)localObject1);; localObject2 = null)
    {
      if (localObject2 == null)
      {
        w.e("MicroMsg.CleanController", "content is null");
        GMTrace.o(16034186657792L, 119464);
        return null;
      }
      String str = n.IZ().x(paramau.field_imgPath, true);
      localObject1 = localObject3;
      switch (((f.a)localObject2).type)
      {
      default: 
        localObject1 = localObject3;
      }
      for (;;)
      {
        GMTrace.o(16034186657792L, 119464);
        return (a)localObject1;
        localObject2 = an.afP().Op(((f.a)localObject2).eAE);
        if ((localObject2 == null) || (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).aDI()))
        {
          localObject1 = localObject3;
          if (paramau.field_isSend == 1)
          {
            localObject1 = localObject3;
            if (localObject2 != null)
            {
              localObject1 = localObject3;
              if (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload) {}
            }
          }
        }
        else
        {
          localObject2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
          localObject1 = localObject3;
          if (com.tencent.mm.a.e.aZ((String)localObject2))
          {
            w.v("MicroMsg.CleanController", "image " + (String)localObject2);
            localObject1 = new a(str, (String)localObject2, 1, paramString, paramau.field_msgId, paramau.field_createTime);
            continue;
            localObject2 = an.afP().Op(((f.a)localObject2).eAE);
            if ((localObject2 == null) || (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).aDI()))
            {
              localObject1 = localObject3;
              if (paramau.field_isSend == 1)
              {
                localObject1 = localObject3;
                if (localObject2 != null)
                {
                  localObject1 = localObject3;
                  if (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload) {}
                }
              }
            }
            else
            {
              w.v("MicroMsg.CleanController", "full path " + ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
              localObject1 = localObject3;
              if (com.tencent.mm.a.e.aZ(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath))
              {
                localObject1 = new a(str, ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath, 4, paramString, paramau.field_msgId, paramau.field_createTime);
                continue;
                localObject2 = an.afP().Op(((f.a)localObject2).eAE);
                if ((localObject2 == null) || (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).aDI()))
                {
                  localObject1 = localObject3;
                  if (paramau.field_isSend == 1)
                  {
                    localObject1 = localObject3;
                    if (localObject2 != null)
                    {
                      localObject1 = localObject3;
                      if (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload) {}
                    }
                  }
                }
                else
                {
                  w.v("MicroMsg.CleanController", "full path " + ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                  localObject1 = localObject3;
                  if (com.tencent.mm.a.e.aZ(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath)) {
                    localObject1 = new a(str, ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath, 4, paramString, paramau.field_msgId, paramau.field_createTime);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void anT()
  {
    GMTrace.i(7042001534976L, 52467);
    this.endTime = System.currentTimeMillis();
    w.i("MicroMsg.CleanController", "totalUserTime:%d", new Object[] { Long.valueOf(this.endTime - this.startTime) });
    if ((this.jSW != null) && (!this.isStop))
    {
      final ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.jSZ.values().iterator();
      while (localIterator.hasNext()) {
        localArrayList.add((b)localIterator.next());
      }
      Collections.sort(localArrayList);
      Collections.reverse(localArrayList);
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7040122486784L, 52453);
          c.this.jSW.a(c.this.jTa, c.this.jTb, c.this.jSK, localArrayList, c.this.jSL, c.this.jTc);
          GMTrace.o(7040122486784L, 52453);
        }
      });
    }
    GMTrace.o(7042001534976L, 52467);
  }
  
  public static long anU()
  {
    GMTrace.i(7042135752704L, 52468);
    long l;
    try
    {
      StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.ghx);
      l = localStatFs.getBlockCount();
      int i = localStatFs.getBlockSize();
      l = i * l;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l = 0L;
      }
      GMTrace.o(7042135752704L, 52468);
    }
    if (l <= 0L)
    {
      GMTrace.o(7042135752704L, 52468);
      return 1L;
    }
    return l;
  }
  
  public static long anV()
  {
    GMTrace.i(7042269970432L, 52469);
    long l;
    try
    {
      StatFs localStatFs = new StatFs(com.tencent.mm.compatible.util.e.ghx);
      l = localStatFs.getAvailableBlocks();
      int i = localStatFs.getBlockSize();
      l = i * l;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        l = 0L;
      }
      GMTrace.o(7042269970432L, 52469);
    }
    if (l <= 0L)
    {
      GMTrace.o(7042269970432L, 52469);
      return 1L;
    }
    return l;
  }
  
  private static ArrayList<String> anW()
  {
    GMTrace.i(7042404188160L, 52470);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new LinkedList();
    Object localObject2 = com.tencent.mm.y.s.gmD;
    int j = localObject2.length;
    int i = 0;
    while (i < j)
    {
      ((LinkedList)localObject1).add(localObject2[i]);
      i += 1;
    }
    at.AR();
    localObject1 = com.tencent.mm.y.c.yP().c(com.tencent.mm.y.s.gmw, (List)localObject1, "*");
    if (((Cursor)localObject1).moveToFirst()) {
      do
      {
        localObject2 = new com.tencent.mm.storage.ae();
        ((com.tencent.mm.storage.ae)localObject2).b((Cursor)localObject1);
        if (!bg.nm(((aj)localObject2).field_username))
        {
          at.AR();
          if (!x.At(com.tencent.mm.y.c.yK().TE(((aj)localObject2).field_username).field_verifyFlag)) {
            localArrayList.add(((aj)localObject2).field_username);
          }
        }
      } while ((((Cursor)localObject1).moveToNext()) && (!((Cursor)localObject1).isAfterLast()));
    }
    ((Cursor)localObject1).close();
    GMTrace.o(7042404188160L, 52470);
    return localArrayList;
  }
  
  public static a b(au paramau, String paramString)
  {
    GMTrace.i(16034320875520L, 119465);
    o.Nh();
    String str1 = com.tencent.mm.modelvideo.s.mk(paramau.field_imgPath);
    Object localObject = paramau.field_imgPath;
    if (!bg.nm((String)localObject)) {
      o.Nh().mh((String)localObject);
    }
    o.Nh();
    String str2 = com.tencent.mm.modelvideo.s.ml(paramau.field_imgPath);
    File localFile = new File(str1);
    localObject = null;
    if (localFile.exists()) {
      localObject = new a(str2, str1, 3, paramString, paramau.field_msgId, paramau.field_createTime);
    }
    GMTrace.o(16034320875520L, 119465);
    return (a)localObject;
  }
  
  private static ArrayList<String> vb(String paramString)
  {
    GMTrace.i(7042672623616L, 52472);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new File(paramString);
    if (((File)localObject).isDirectory())
    {
      localObject = ((File)localObject).list();
      int j;
      int i;
      if ((localObject != null) && (localObject.length > 0))
      {
        j = localObject.length;
        i = 0;
      }
      while (i < j)
      {
        String str = localObject[i];
        localArrayList.add(paramString + File.separator + str);
        i += 1;
        continue;
        localArrayList.add(paramString);
      }
    }
    for (;;)
    {
      GMTrace.o(7042672623616L, 52472);
      return localArrayList;
      localArrayList.add(paramString);
    }
  }
  
  public final void a(com.tencent.mm.plugin.clean.c.a.a parama)
  {
    GMTrace.i(15049565405184L, 112128);
    if ((parama instanceof a)) {
      w.d("MicroMsg.CleanController", "AnalyseTask is finish [%d] cost[%s]", new Object[] { Integer.valueOf(parama.hashCode()), parama.MY() });
    }
    for (;;)
    {
      com.tencent.mm.sdk.f.e.L(this);
      this.jSY += 1;
      if ((this.jSW != null) && (!this.isStop)) {
        this.ghS.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7040390922240L, 52455);
            c.this.jSW.bQ(c.this.jSY, c.this.jSX);
            GMTrace.o(7040390922240L, 52455);
          }
        });
      }
      if (this.jSY == this.jSX) {
        anT();
      }
      GMTrace.o(15049565405184L, 112128);
      return;
      w.d("MicroMsg.CleanController", "ScanSpaceTask is finish [%d] cost[%s]", new Object[] { Integer.valueOf(parama.hashCode()), parama.MY() });
    }
  }
  
  /* Error */
  public final void aY(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 514
    //   5: ldc_w 516
    //   8: invokestatic 61	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: lload_1
    //   12: lconst_0
    //   13: lcmp
    //   14: ifge +46 -> 60
    //   17: ldc -85
    //   19: ldc_w 518
    //   22: iconst_1
    //   23: anewarray 4	java/lang/Object
    //   26: dup
    //   27: iconst_0
    //   28: lload_1
    //   29: invokestatic 69	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   32: aastore
    //   33: invokestatic 521	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   36: aload_0
    //   37: aload_0
    //   38: getfield 523	com/tencent/mm/plugin/clean/c/c:jTb	J
    //   41: ldc2_w 524
    //   44: ladd
    //   45: putfield 523	com/tencent/mm/plugin/clean/c/c:jTb	J
    //   48: ldc2_w 514
    //   51: ldc_w 516
    //   54: invokestatic 98	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload_0
    //   61: aload_0
    //   62: getfield 523	com/tencent/mm/plugin/clean/c/c:jTb	J
    //   65: lload_1
    //   66: ladd
    //   67: putfield 523	com/tencent/mm/plugin/clean/c/c:jTb	J
    //   70: ldc2_w 514
    //   73: ldc_w 516
    //   76: invokestatic 98	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   79: goto -22 -> 57
    //   82: astore_3
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_3
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	c
    //   0	87	1	paramLong	long
    //   82	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	82	finally
    //   17	57	82	finally
    //   60	79	82	finally
  }
  
  public final void run()
  {
    GMTrace.i(7041733099520L, 52465);
    w.i("MicroMsg.CleanController", "Start to run clean controller");
    this.startTime = System.currentTimeMillis();
    long l = bg.Pw();
    Object localObject2 = com.tencent.mm.compatible.util.e.ghz;
    w.v("MicroMsg.CleanController", "root path: %s", new Object[] { localObject2 });
    Object localObject1 = new StringBuilder("mm");
    h.xz();
    h.xw();
    Object localObject3 = com.tencent.mm.a.g.n(com.tencent.mm.kernel.a.ww().getBytes());
    localObject1 = new ArrayList();
    Object localObject4 = new File((String)localObject2);
    if (((File)localObject4).isDirectory())
    {
      localObject4 = ((File)localObject4).list();
      if (localObject4 != null)
      {
        j = localObject4.length;
        i = 0;
        if (i < j)
        {
          String str = localObject4[i];
          Object localObject5 = (String)localObject2 + str;
          if (str.length() >= 32)
          {
            w.v("MicroMsg.CleanController", "add subfile list: %s uinPath %s ", new Object[] { str, localObject3 });
            localObject5 = vb((String)localObject5);
            if (((ArrayList)localObject1).size() > 0)
            {
              if (!((String)localObject3).equals(str))
              {
                w.i("MicroMsg.CleanController", "add other acc tmp path %s", new Object[] { str });
                this.jTc.add(str);
              }
              ((ArrayList)localObject1).addAll(0, (Collection)localObject5);
            }
          }
          for (;;)
          {
            i += 1;
            break;
            ((ArrayList)localObject1).addAll((Collection)localObject5);
            continue;
            w.v("MicroMsg.CleanController", "subfile: %s", new Object[] { str });
            if (((ArrayList)localObject1).size() > 0) {
              ((ArrayList)localObject1).add(0, localObject5);
            } else {
              ((ArrayList)localObject1).add(localObject5);
            }
          }
        }
      }
    }
    else
    {
      aY(com.tencent.mm.a.e.aY((String)localObject2));
    }
    int k = -1;
    int j = -1;
    int i = 0;
    while (i < ((ArrayList)localObject1).size())
    {
      localObject2 = (String)((ArrayList)localObject1).get(i);
      if (((String)localObject2).contains("image2")) {
        k = i;
      }
      if (((String)localObject2).contains("voice2")) {
        j = i;
      }
      i += 1;
    }
    if (j != -1) {
      ((ArrayList)localObject1).add(0, (String)((ArrayList)localObject1).remove(j));
    }
    if (k != -1) {
      ((ArrayList)localObject1).add(0, (String)((ArrayList)localObject1).remove(k));
    }
    w.d("MicroMsg.CleanController", "scan is finish [%s]", new Object[] { Long.valueOf(bg.aI(l)) });
    l = bg.Pw();
    localObject2 = anW();
    w.d("MicroMsg.CleanController", "user is finish [%s]", new Object[] { Long.valueOf(bg.aI(l)) });
    this.jSX = (((ArrayList)localObject1).size() + ((ArrayList)localObject2).size());
    if (this.jSX == 0)
    {
      w.i("MicroMsg.CleanController", "Clean Controller totalTaskCount=0");
      anT();
      GMTrace.o(7041733099520L, 52465);
      return;
    }
    w.i("MicroMsg.CleanController", "Clean Controller totalTaskCount=%d", new Object[] { Integer.valueOf(this.jSX) });
    i = 0;
    while ((!this.isStop) && (i < ((ArrayList)localObject1).size()))
    {
      localObject3 = (String)((ArrayList)localObject1).get(i);
      w.d("MicroMsg.CleanController", "while loop index=%d | filePath=%s", new Object[] { Integer.valueOf(i), localObject3 });
      localObject4 = new b((String)localObject3);
      while (!this.jSV.b((com.tencent.mm.plugin.clean.c.a.a)localObject4)) {
        try
        {
          Thread.sleep(2147483647L);
        }
        catch (InterruptedException localInterruptedException2) {}
      }
      w.d("MicroMsg.CleanController", "Start task： filePath＝%s", new Object[] { localObject3 });
      i += 1;
    }
    i = 0;
    while ((!this.isStop) && (i < ((ArrayList)localObject2).size()))
    {
      localObject1 = (String)((ArrayList)localObject2).get(i);
      w.d("MicroMsg.CleanController", "while loop index=%d | username=%s", new Object[] { Integer.valueOf(i), localObject1 });
      localObject3 = new a((String)localObject1);
      while (!this.jSV.b((com.tencent.mm.plugin.clean.c.a.a)localObject3)) {
        try
        {
          Thread.sleep(2147483647L);
        }
        catch (InterruptedException localInterruptedException1) {}
      }
      w.d("MicroMsg.CleanController", "Start task： user＝%s", new Object[] { localObject1 });
      i += 1;
    }
    GMTrace.o(7041733099520L, 52465);
  }
  
  public final boolean vc(String paramString)
  {
    GMTrace.i(20562558582784L, 153203);
    if (bg.nm(paramString))
    {
      GMTrace.o(20562558582784L, 153203);
      return false;
    }
    at.AR();
    if (paramString.startsWith(com.tencent.mm.y.c.zo()))
    {
      GMTrace.o(20562558582784L, 153203);
      return false;
    }
    Iterator localIterator = this.jTc.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((paramString.startsWith(h.xy().fYT)) && (paramString.contains(str)))
      {
        GMTrace.o(20562558582784L, 153203);
        return true;
      }
    }
    GMTrace.o(20562558582784L, 153203);
    return false;
  }
  
  public final class a
    extends com.tencent.mm.plugin.clean.c.a.a
  {
    private String username;
    
    public a(String paramString)
    {
      super();
      GMTrace.i(7047772897280L, 52510);
      this.username = paramString;
      GMTrace.o(7047772897280L, 52510);
    }
    
    private int a(Cursor paramCursor, b paramb)
    {
      GMTrace.i(16285173809152L, 121334);
      int i = 0;
      if (!paramCursor.moveToFirst())
      {
        w.d("MicroMsg.CleanController", "Message count of user:%s is empty", new Object[] { this.username });
        paramCursor.close();
        GMTrace.o(16285173809152L, 121334);
        return 0;
      }
      Object localObject2;
      for (Object localObject1 = null;; localObject1 = localObject2)
      {
        au localau;
        if (!paramCursor.isAfterLast())
        {
          i += 1;
          localau = new au();
          localau.b(paramCursor);
          switch (l.yQ(localau.field_type))
          {
          default: 
            localObject2 = localObject1;
            if (localObject1 != null)
            {
              paramb.jST.add(localObject1);
              long l = paramb.eJe;
              paramb.eJe = (((a)localObject1).size + l);
              localObject2 = null;
            }
            j = i;
            if (paramCursor.moveToNext()) {
              if (!c.this.isStop) {
                continue;
              }
            }
            break;
          }
        }
        for (int j = i;; j = i)
        {
          paramCursor.close();
          GMTrace.o(16285173809152L, 121334);
          return j;
          localObject1 = c.a(localau, this.username);
          break;
          String str2 = this.username;
          String str3 = n.IZ().x(localau.field_imgPath, true);
          if (localau.field_isSend == 1)
          {
            localObject1 = n.IZ().aq((int)localau.field_msgId);
            localObject2 = localObject1;
            if (((d)localObject1).gGR != 0L) {}
          }
          else
          {
            localObject2 = n.IZ().ap(localau.field_msgSvrId);
          }
          Object localObject5 = null;
          Object localObject3 = null;
          if (localau.field_isSend == 1)
          {
            localObject2 = n.IZ().l(((d)localObject2).gGS, "", "");
            localObject1 = localObject3;
            if (!bg.nm((String)localObject2))
            {
              localObject1 = localObject3;
              if (com.tencent.mm.a.e.aZ((String)localObject2))
              {
                w.v("MicroMsg.CleanController", "bigImgPath " + (String)localObject2 + " " + com.tencent.mm.a.e.aY((String)localObject2));
                localObject1 = new a(str3, (String)localObject2, 1, str2, localau.field_msgId, localau.field_createTime);
              }
            }
          }
          do
          {
            break;
            localObject1 = localObject3;
          } while (!((d)localObject2).IH());
          String str4 = n.IZ().l(((d)localObject2).gGS, "", "");
          String str1 = "";
          localObject3 = localObject5;
          Object localObject4 = str1;
          if (((d)localObject2).II())
          {
            if (!((d)localObject2).II()) {
              break label702;
            }
            localObject1 = n.IZ().gr(((d)localObject2).gHb);
            if (localObject1 == null) {
              break label702;
            }
          }
          for (;;)
          {
            localObject3 = localObject5;
            localObject4 = str1;
            if (localObject1 != null)
            {
              localObject3 = localObject5;
              localObject4 = str1;
              if (!localObject1.equals(localObject2))
              {
                localObject1 = n.IZ().l(((d)localObject1).gGS, "", "");
                w.v("MicroMsg.CleanController", "hdPath " + (String)localObject1 + " " + com.tencent.mm.a.e.aY((String)localObject1));
                localObject3 = localObject5;
                localObject4 = localObject1;
                if (com.tencent.mm.a.e.aZ((String)localObject1))
                {
                  localObject3 = new a(str3, (String)localObject1, 1, str2, localau.field_msgId, localau.field_createTime);
                  localObject4 = localObject1;
                }
              }
            }
            localObject1 = localObject3;
            if (!com.tencent.mm.a.e.aZ(str4)) {
              break;
            }
            localObject1 = localObject3;
            if (bg.nm(str4)) {
              break;
            }
            localObject1 = localObject3;
            if (str4.equals(localObject4)) {
              break;
            }
            localObject1 = new a(str3, str4, 1, str2, localau.field_msgId, localau.field_createTime);
            break;
            label702:
            localObject1 = localObject2;
          }
          localObject1 = c.b(localau, this.username);
          break;
        }
      }
    }
    
    public final String MY()
    {
      GMTrace.i(15051041800192L, 112139);
      String str = "username[" + this.username + "]" + super.MY();
      GMTrace.o(15051041800192L, 112139);
      return str;
    }
    
    /* Error */
    public final void execute()
    {
      // Byte code:
      //   0: ldc2_w 240
      //   3: ldc -14
      //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: invokestatic 248	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
      //   11: pop
      //   12: invokestatic 254	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
      //   15: aload_0
      //   16: getfield 29	com/tencent/mm/plugin/clean/c/c$a:username	Ljava/lang/String;
      //   19: invokeinterface 259 2 0
      //   24: istore 4
      //   26: iload 4
      //   28: ifgt +39 -> 67
      //   31: ldc 45
      //   33: ldc_w 261
      //   36: iconst_2
      //   37: anewarray 49	java/lang/Object
      //   40: dup
      //   41: iconst_0
      //   42: aload_0
      //   43: getfield 29	com/tencent/mm/plugin/clean/c/c$a:username	Ljava/lang/String;
      //   46: aastore
      //   47: dup
      //   48: iconst_1
      //   49: iload 4
      //   51: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   54: aastore
      //   55: invokestatic 269	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   58: ldc2_w 240
      //   61: ldc -14
      //   63: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   66: return
      //   67: new 84	com/tencent/mm/plugin/clean/c/b
      //   70: dup
      //   71: invokespecial 270	com/tencent/mm/plugin/clean/c/b:<init>	()V
      //   74: astore 11
      //   76: aload 11
      //   78: aload_0
      //   79: getfield 29	com/tencent/mm/plugin/clean/c/c$a:username	Ljava/lang/String;
      //   82: putfield 271	com/tencent/mm/plugin/clean/c/b:username	Ljava/lang/String;
      //   85: aload 11
      //   87: new 90	java/util/ArrayList
      //   90: dup
      //   91: invokespecial 272	java/util/ArrayList:<init>	()V
      //   94: putfield 88	com/tencent/mm/plugin/clean/c/b:jST	Ljava/util/ArrayList;
      //   97: aload 11
      //   99: lconst_0
      //   100: putfield 98	com/tencent/mm/plugin/clean/c/b:eJe	J
      //   103: aconst_null
      //   104: astore 7
      //   106: iconst_0
      //   107: istore_1
      //   108: aload 7
      //   110: astore 9
      //   112: iload_1
      //   113: istore_3
      //   114: iload_1
      //   115: iload 4
      //   117: if_icmpge +167 -> 284
      //   120: aload 7
      //   122: astore 9
      //   124: iload_1
      //   125: istore_2
      //   126: aload 7
      //   128: astore 10
      //   130: invokestatic 248	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
      //   133: pop
      //   134: aload 7
      //   136: astore 9
      //   138: iload_1
      //   139: istore_2
      //   140: aload 7
      //   142: astore 10
      //   144: invokestatic 254	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
      //   147: aload_0
      //   148: getfield 29	com/tencent/mm/plugin/clean/c/c$a:username	Ljava/lang/String;
      //   151: iload_1
      //   152: bipush 50
      //   154: invokeinterface 275 4 0
      //   159: astore 8
      //   161: aload 8
      //   163: astore 9
      //   165: iload_1
      //   166: istore_3
      //   167: aload 8
      //   169: ifnull +115 -> 284
      //   172: aload 8
      //   174: astore 9
      //   176: iload_1
      //   177: istore_2
      //   178: aload 8
      //   180: astore 10
      //   182: aload_0
      //   183: aload 8
      //   185: aload 11
      //   187: invokespecial 277	com/tencent/mm/plugin/clean/c/c$a:a	(Landroid/database/Cursor;Lcom/tencent/mm/plugin/clean/c/b;)I
      //   190: istore 5
      //   192: aload 8
      //   194: ifnull +40 -> 234
      //   197: aload 8
      //   199: astore 9
      //   201: iload_1
      //   202: istore_2
      //   203: aload 8
      //   205: astore 10
      //   207: aload 8
      //   209: invokeinterface 280 1 0
      //   214: ifne +20 -> 234
      //   217: aload 8
      //   219: astore 9
      //   221: iload_1
      //   222: istore_2
      //   223: aload 8
      //   225: astore 10
      //   227: aload 8
      //   229: invokeinterface 59 1 0
      //   234: aload 8
      //   236: astore 9
      //   238: iload_1
      //   239: istore_3
      //   240: iload 5
      //   242: ifle +42 -> 284
      //   245: iload_1
      //   246: iload 5
      //   248: iadd
      //   249: istore_3
      //   250: aload 8
      //   252: astore 9
      //   254: iload_3
      //   255: istore_2
      //   256: aload 8
      //   258: astore 10
      //   260: aload_0
      //   261: getfield 15	com/tencent/mm/plugin/clean/c/c$a:jTh	Lcom/tencent/mm/plugin/clean/c/c;
      //   264: getfield 110	com/tencent/mm/plugin/clean/c/c:isStop	Z
      //   267: istore 6
      //   269: aload 8
      //   271: astore 7
      //   273: iload_3
      //   274: istore_1
      //   275: iload 6
      //   277: ifeq -169 -> 108
      //   280: aload 8
      //   282: astore 9
      //   284: iload_3
      //   285: istore_1
      //   286: aload 9
      //   288: ifnull +12 -> 300
      //   291: aload 9
      //   293: invokeinterface 59 1 0
      //   298: iload_3
      //   299: istore_1
      //   300: aload 11
      //   302: getfield 88	com/tencent/mm/plugin/clean/c/b:jST	Ljava/util/ArrayList;
      //   305: invokevirtual 283	java/util/ArrayList:size	()I
      //   308: ifle +20 -> 328
      //   311: aload_0
      //   312: getfield 15	com/tencent/mm/plugin/clean/c/c$a:jTh	Lcom/tencent/mm/plugin/clean/c/c;
      //   315: getfield 287	com/tencent/mm/plugin/clean/c/c:jSZ	Ljava/util/concurrent/ConcurrentHashMap;
      //   318: aload_0
      //   319: getfield 29	com/tencent/mm/plugin/clean/c/c$a:username	Ljava/lang/String;
      //   322: aload 11
      //   324: invokevirtual 293	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   327: pop
      //   328: ldc 45
      //   330: ldc_w 295
      //   333: iconst_4
      //   334: anewarray 49	java/lang/Object
      //   337: dup
      //   338: iconst_0
      //   339: aload_0
      //   340: getfield 29	com/tencent/mm/plugin/clean/c/c$a:username	Ljava/lang/String;
      //   343: aastore
      //   344: dup
      //   345: iconst_1
      //   346: iload 4
      //   348: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   351: aastore
      //   352: dup
      //   353: iconst_2
      //   354: iload_1
      //   355: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   358: aastore
      //   359: dup
      //   360: iconst_3
      //   361: aload_0
      //   362: getfield 15	com/tencent/mm/plugin/clean/c/c$a:jTh	Lcom/tencent/mm/plugin/clean/c/c;
      //   365: getfield 110	com/tencent/mm/plugin/clean/c/c:isStop	Z
      //   368: invokestatic 300	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   371: aastore
      //   372: invokestatic 269	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   375: ldc2_w 240
      //   378: ldc -14
      //   380: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   383: return
      //   384: astore 7
      //   386: ldc 45
      //   388: aload 7
      //   390: ldc_w 302
      //   393: iconst_0
      //   394: anewarray 49	java/lang/Object
      //   397: invokestatic 306	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   400: iload_2
      //   401: istore_1
      //   402: aload 9
      //   404: ifnull -104 -> 300
      //   407: aload 9
      //   409: invokeinterface 59 1 0
      //   414: iload_2
      //   415: istore_1
      //   416: goto -116 -> 300
      //   419: astore 7
      //   421: aload 10
      //   423: ifnull +10 -> 433
      //   426: aload 10
      //   428: invokeinterface 59 1 0
      //   433: aload 7
      //   435: athrow
      //   436: astore 7
      //   438: aload 9
      //   440: astore 10
      //   442: goto -21 -> 421
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	445	0	this	a
      //   107	309	1	i	int
      //   125	290	2	j	int
      //   113	186	3	k	int
      //   24	323	4	m	int
      //   190	59	5	n	int
      //   267	9	6	bool	boolean
      //   104	168	7	localObject1	Object
      //   384	5	7	localException	Exception
      //   419	15	7	localObject2	Object
      //   436	1	7	localObject3	Object
      //   159	122	8	localCursor	Cursor
      //   110	329	9	localObject4	Object
      //   128	313	10	localObject5	Object
      //   74	249	11	localb	b
      // Exception table:
      //   from	to	target	type
      //   130	134	384	java/lang/Exception
      //   144	161	384	java/lang/Exception
      //   182	192	384	java/lang/Exception
      //   207	217	384	java/lang/Exception
      //   227	234	384	java/lang/Exception
      //   260	269	384	java/lang/Exception
      //   130	134	419	finally
      //   144	161	419	finally
      //   182	192	419	finally
      //   207	217	419	finally
      //   227	234	419	finally
      //   260	269	419	finally
      //   386	400	436	finally
    }
  }
  
  final class b
    extends com.tencent.mm.plugin.clean.c.a.a
  {
    private String filePath;
    private long fileSize;
    int jTi;
    
    public b(String paramString)
    {
      super();
      GMTrace.i(7040927793152L, 52459);
      this.jTi = 0;
      this.filePath = paramString;
      this.fileSize = 0L;
      GMTrace.o(7040927793152L, 52459);
    }
    
    private void vd(String paramString)
    {
      GMTrace.i(7041196228608L, 52461);
      File localFile = new File(paramString);
      if (localFile.isDirectory())
      {
        String[] arrayOfString = localFile.list();
        if (arrayOfString != null)
        {
          int j = arrayOfString.length;
          int i = 0;
          while (i < j)
          {
            String str = arrayOfString[i];
            vd(paramString + File.separator + str);
            i += 1;
          }
        }
        w.v("MicroMsg.CleanController", "delete file rootFile: %s", new Object[] { paramString });
        localFile.delete();
        GMTrace.o(7041196228608L, 52461);
        return;
      }
      w.v("MicroMsg.CleanController", "delete file rootFile: %s", new Object[] { paramString });
      c.this.jTa += localFile.length();
      localFile.delete();
      GMTrace.o(7041196228608L, 52461);
    }
    
    private static boolean ve(String paramString)
    {
      GMTrace.i(15049162752000L, 112125);
      if ((paramString.length() > c.jSU) && (paramString.substring(c.jSU).indexOf("temp") == 0))
      {
        GMTrace.o(15049162752000L, 112125);
        return true;
      }
      GMTrace.o(15049162752000L, 112125);
      return false;
    }
    
    private void vf(String paramString)
    {
      int i = 0;
      GMTrace.i(7041330446336L, 52462);
      this.jTi += 1;
      if (paramString.endsWith(File.separator + "sns"))
      {
        w.i("MicroMsg.CleanController", "Scan sns folder: rootPath=%s", new Object[] { paramString });
        vg(paramString);
        GMTrace.o(7041330446336L, 52462);
        return;
      }
      if (paramString.endsWith(File.separator + "music"))
      {
        w.i("MicroMsg.CleanController", "Scan music folder: rootPath=%s", new Object[] { paramString });
        vh(paramString);
        GMTrace.o(7041330446336L, 52462);
        return;
      }
      Object localObject = new File(paramString);
      if (((File)localObject).isDirectory())
      {
        localObject = ((File)localObject).list();
        if (localObject != null)
        {
          int j = localObject.length;
          while (i < j)
          {
            String str = localObject[i];
            vf(paramString + "/" + str);
            i += 1;
          }
        }
        GMTrace.o(7041330446336L, 52462);
        return;
      }
      i = com.tencent.mm.a.e.aY(paramString);
      c.this.aY(i);
      long l = this.fileSize;
      this.fileSize = (i + l);
      GMTrace.o(7041330446336L, 52462);
    }
    
    private void vg(String paramString)
    {
      int i = 0;
      GMTrace.i(7041464664064L, 52463);
      Object localObject = new File(paramString);
      if (((File)localObject).isDirectory())
      {
        localObject = ((File)localObject).list();
        if (localObject != null)
        {
          int j = localObject.length;
          while (i < j)
          {
            String str = localObject[i];
            vg(paramString + "/" + str);
            i += 1;
          }
        }
        GMTrace.o(7041464664064L, 52463);
        return;
      }
      if ((System.currentTimeMillis() - ((File)localObject).lastModified() > c.jSH.longValue()) && (c.this.jTe))
      {
        w.v("MicroMsg.CleanController", "Clean 7 days file in sns rootPath=%s", new Object[] { paramString });
        ((File)localObject).delete();
        GMTrace.o(7041464664064L, 52463);
        return;
      }
      i = com.tencent.mm.a.e.aY(paramString);
      c.this.aY(i);
      long l = this.fileSize;
      this.fileSize = (i + l);
      GMTrace.o(7041464664064L, 52463);
    }
    
    private void vh(String paramString)
    {
      int i = 0;
      GMTrace.i(15049296969728L, 112126);
      Object localObject = new File(paramString);
      if (((File)localObject).isDirectory())
      {
        localObject = ((File)localObject).list();
        if (localObject != null)
        {
          int j = localObject.length;
          while (i < j)
          {
            String str = localObject[i];
            vh(paramString + "/" + str);
            i += 1;
          }
        }
        GMTrace.o(15049296969728L, 112126);
        return;
      }
      if ((System.currentTimeMillis() - ((File)localObject).lastModified() > c.jSI.longValue()) && (c.this.jTe))
      {
        w.v("MicroMsg.CleanController", "Clean 90 days file in music rootPath=%s", new Object[] { paramString });
        ((File)localObject).delete();
        GMTrace.o(15049296969728L, 112126);
        return;
      }
      i = com.tencent.mm.a.e.aY(paramString);
      c.this.aY(i);
      long l = this.fileSize;
      this.fileSize = (i + l);
      GMTrace.o(15049296969728L, 112126);
    }
    
    public final String MY()
    {
      GMTrace.i(15049028534272L, 112124);
      String str = "filePath[" + this.filePath + "] scanCount[" + this.jTi + "]" + super.MY();
      GMTrace.o(15049028534272L, 112124);
      return str;
    }
    
    public final void execute()
    {
      GMTrace.i(7041062010880L, 52460);
      Object localObject;
      if ((ve(this.filePath)) && (c.this.jTe))
      {
        w.i("MicroMsg.CleanController", "Delete[%b] temp folder: %s ", new Object[] { Boolean.valueOf(c.this.jTe), this.filePath });
        vd(this.filePath);
        localObject = new File(this.filePath).getParentFile();
        if ((((File)localObject).list() == null) || (((File)localObject).list().length == 0)) {
          ((File)localObject).delete();
        }
        if (!c.this.vc(this.filePath)) {
          break label558;
        }
        c.this.jSL += this.fileSize;
        label135:
        if (!ve(this.filePath)) {
          break label599;
        }
        localObject = c.this.jTf;
        localObject[1] = ((int)(localObject[1] + this.fileSize));
      }
      for (;;)
      {
        if (this.filePath.endsWith(File.separator + "image2"))
        {
          localObject = c.this.jTf;
          localObject[3] = ((int)(localObject[3] + this.fileSize));
        }
        if (this.filePath.endsWith(File.separator + "image"))
        {
          localObject = c.this.jTf;
          localObject[4] = ((int)(localObject[4] + this.fileSize));
        }
        if (this.filePath.endsWith(File.separator + "video"))
        {
          localObject = c.this.jTf;
          localObject[5] = ((int)(localObject[5] + this.fileSize));
        }
        if (this.filePath.endsWith(File.separator + "voice2"))
        {
          localObject = c.this.jTf;
          localObject[6] = ((int)(localObject[6] + this.fileSize));
        }
        if (this.filePath.endsWith(File.separator + "WeiXin"))
        {
          localObject = c.this.jTf;
          localObject[7] = ((int)(localObject[7] + this.fileSize));
        }
        if (this.filePath.endsWith(File.separator + "WeChat"))
        {
          localObject = c.this.jTf;
          localObject[8] = ((int)(localObject[8] + this.fileSize));
        }
        if (this.filePath.endsWith(File.separator + "xlog"))
        {
          localObject = c.this.jTf;
          localObject[9] = ((int)(localObject[9] + this.fileSize));
        }
        GMTrace.o(7041062010880L, 52460);
        return;
        vf(this.filePath);
        break;
        label558:
        localObject = this.filePath;
        at.AR();
        if (!((String)localObject).startsWith(com.tencent.mm.y.c.zo())) {
          break label135;
        }
        c.this.jSK += this.fileSize;
        break label135;
        label599:
        localObject = this.filePath;
        at.AR();
        if (((String)localObject).startsWith(com.tencent.mm.y.c.zo()))
        {
          localObject = c.this.jTf;
          localObject[0] = ((int)(localObject[0] + this.fileSize));
        }
        else
        {
          localObject = c.this.jTf;
          localObject[2] = ((int)(localObject[2] + this.fileSize));
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */