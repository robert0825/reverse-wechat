package com.tencent.mm.ao;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.j.a.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.report.service.f.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.be;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import junit.framework.Assert;

public class m
{
  public static m gJa;
  ConcurrentHashMap<Long, d> gIY;
  public c gIZ;
  public ConcurrentHashMap<Long, e> gJb;
  private ArrayList<Long> gJc;
  ArrayList<e> gJd;
  
  public m()
  {
    GMTrace.i(3514893860864L, 26188);
    this.gIY = new ConcurrentHashMap();
    this.gJb = new ConcurrentHashMap();
    this.gJc = new ArrayList();
    this.gJd = new ArrayList();
    this.gIZ = new c();
    GMTrace.o(3514893860864L, 26188);
  }
  
  public static m IQ()
  {
    GMTrace.i(3515028078592L, 26189);
    if (gJa == null) {}
    try
    {
      if (gJa == null) {
        gJa = new m();
      }
      m localm = gJa;
      GMTrace.o(3515028078592L, 26189);
      return localm;
    }
    finally {}
  }
  
  private boolean IR()
  {
    GMTrace.i(3515699167232L, 26194);
    if ((this.gJd.size() > 0) && (f.a.bbZ().org <= 2))
    {
      w.i("MicroMsg.SendImgSpeeder", "cpu core is low ,do not use multi mode");
      GMTrace.o(3515699167232L, 26194);
      return false;
    }
    GMTrace.o(3515699167232L, 26194);
    return true;
  }
  
  private static int b(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(3515967602688L, 26196);
    if (q.a(paramString1, paramString2, paramBoolean))
    {
      GMTrace.o(3515967602688L, 26196);
      return 1;
    }
    GMTrace.o(3515967602688L, 26196);
    return 0;
  }
  
  private boolean ki(String paramString)
  {
    GMTrace.i(3515564949504L, 26193);
    Iterator localIterator = this.gJd.iterator();
    while (localIterator.hasNext()) {
      if (((e)localIterator.next()).gJp.equals(paramString))
      {
        GMTrace.o(3515564949504L, 26193);
        return true;
      }
    }
    GMTrace.o(3515564949504L, 26193);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean, int paramInt3)
  {
    GMTrace.i(3515833384960L, 26195);
    if (ki(paramString1))
    {
      GMTrace.o(3515833384960L, 26195);
      return;
    }
    int i = b(paramString1, paramString2, paramBoolean);
    PString localPString = new PString();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    Object localObject2;
    Object localObject1;
    b localb2;
    b localb1;
    String str1;
    if (IR())
    {
      localObject2 = this.gIZ.gy(1);
      localObject1 = this.gIZ.gy(2);
      localb2 = ((b)localObject2).gJl;
      localb1 = ((b)localObject1).gJl;
      localObject1 = ((b)localObject1).gJm;
      str1 = ((b)localObject2).gJm;
    }
    for (;;)
    {
      f localf = n.IZ();
      if (!FileOp.aZ(paramString1))
      {
        w.e("MicroMsg.ImgInfoStorage", "file not exit:%s", new Object[] { paramString1 });
        localObject2 = new e();
        ((e)localObject2).gJp = paramString1;
        ((e)localObject2).gGV = i;
        ((e)localObject2).cfz = paramInt1;
        ((e)localObject2).eLJ = paramInt2;
        ((e)localObject2).gJq = ((String)localObject1);
        ((e)localObject2).gJt = localPString;
        ((e)localObject2).gJv = localPInt2;
        ((e)localObject2).gJu = localPInt1;
        ((e)localObject2).gJr = str1;
        ((e)localObject2).gJx = localb1;
        ((e)localObject2).gJw = localb2;
        if (gJa.IR()) {
          a.a((e)localObject2);
        }
        ((e)localObject2).toUserName = paramString2;
        this.gJd.add(localObject2);
        w.i("MicroMsg.SendImgSpeeder", "summersafecdn img path %s has prebuild, user:%s", new Object[] { paramString1, paramString2 });
        GMTrace.o(3515833384960L, 26195);
        return;
      }
      if (bg.nm((String)localObject1)) {}
      for (localObject2 = f.IL();; localObject2 = localObject1)
      {
        localObject2 = "THUMBNAIL_DIRPATH://th_" + (String)localObject2;
        String str2 = localf.a((String)localObject2, "th_", "", false);
        localPString.value = ((String)localObject2);
        long l = bg.Pw();
        Bitmap localBitmap = localf.a(paramString1, i, paramInt2, localPInt1, localPInt2, false, null, null);
        localObject2 = (String)localf.gHz.get(paramString1);
        if (localObject2 != null) {}
        for (localObject2 = (Bitmap)localf.gHy.get(localObject2);; localObject2 = null)
        {
          Object localObject3;
          if (localObject2 != null)
          {
            localObject3 = localObject2;
            if (!((Bitmap)localObject2).isRecycled()) {}
          }
          else
          {
            localObject3 = localf.a(paramString1, true, com.tencent.mm.br.a.getDensity(ab.getContext()), false, false, true, paramInt3, true, localBitmap);
            localf.gHz.put(paramString1, str2);
          }
          if (localObject3 != null) {
            localf.gHy.m(str2, localObject3);
          }
          w.i("MicroMsg.ImgInfoStorage", "test decode thumb img:%d", new Object[] { Long.valueOf(bg.aI(l)) });
          break;
        }
      }
      str1 = null;
      localObject1 = null;
      localb1 = null;
      localb2 = null;
    }
  }
  
  public final void a(ArrayList<String> paramArrayList, boolean paramBoolean, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    GMTrace.i(3515430731776L, 26192);
    w.i("MicroMsg.SendImgSpeeder", "summersafecdn sendThumbImg fileSize:%d, compressImg[%b], source[%d], user:%s", new Object[] { Integer.valueOf(paramArrayList.size()), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), paramString });
    Object localObject1 = this.gJd.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (e)((Iterator)localObject1).next();
      if ((!paramArrayList.contains(((e)localObject2).gJp)) || ((!bg.nm(((e)localObject2).toUserName)) && (!((e)localObject2).toUserName.equalsIgnoreCase(paramString))) || ((!bg.nm(paramString)) && (!paramString.equalsIgnoreCase(((e)localObject2).toUserName)))) {
        ((Iterator)localObject1).remove();
      } else {
        ((e)localObject2).gGV = b(((e)localObject2).gJp, paramString, paramBoolean);
      }
    }
    localObject1 = new ArrayList();
    if (paramArrayList.size() == 9)
    {
      com.tencent.mm.plugin.report.service.f.tp(18);
      paramArrayList = paramArrayList.iterator();
    }
    for (;;)
    {
      if (!paramArrayList.hasNext()) {
        break label376;
      }
      localObject2 = (String)paramArrayList.next();
      if ((localObject2 == null) || (((String)localObject2).equals("")) || (!com.tencent.mm.a.e.aZ((String)localObject2)))
      {
        w.d("MicroMsg.SendImgSpeeder", " doSendImage : filePath is null or empty");
        continue;
        if (paramArrayList.size() == 1)
        {
          boolean bool = am.isWifi(ab.getContext());
          com.tencent.mm.plugin.report.service.f.tp(25);
          if (!bool) {
            break;
          }
          if (q.a((String)paramArrayList.get(0), paramString, paramBoolean))
          {
            com.tencent.mm.plugin.report.service.f.tp(23);
            break;
          }
          com.tencent.mm.plugin.report.service.f.tp(21);
          break;
        }
        com.tencent.mm.plugin.report.service.f.tp(24);
        break;
      }
      if (o.RH((String)localObject2)) {
        w.i("MicroMsg.SendImgSpeeder", "[cpan] is gif coutinue. did not add filePath:%s filesize:%d", new Object[] { localObject2, Integer.valueOf(com.tencent.mm.a.e.aY((String)localObject2)) });
      } else if (!ki((String)localObject2)) {
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    label376:
    paramArrayList = ((ArrayList)localObject1).iterator();
    while (paramArrayList.hasNext()) {
      a(paramInt1, paramInt2, (String)paramArrayList.next(), paramString, paramBoolean, paramInt3);
    }
    paramArrayList = new ArrayList();
    long l1 = com.tencent.mm.kernel.h.xy().fYV.cE(Thread.currentThread().getId());
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BW("SendImgSpeeder");
    paramInt1 = 1;
    paramInt2 = 0;
    while (paramInt2 < this.gJd.size())
    {
      localObject1 = (e)this.gJd.get(paramInt2);
      if (o.RH(((e)localObject1).gJp))
      {
        w.i("MicroMsg.SendImgSpeeder", "[cpan] is gif coutinue. did not add to msg table");
        paramInt2 += 1;
      }
      else
      {
        localObject2 = new au();
        ((au)localObject2).setType(s.gp(paramString));
        ((au)localObject2).db(paramString);
        ((au)localObject2).dC(1);
        ((au)localObject2).dB(1);
        ((au)localObject2).dc(((e)localObject1).gJt.value);
        ((au)localObject2).dN(((e)localObject1).gJu.value);
        ((au)localObject2).dO(((e)localObject1).gJv.value);
        String str = be.Br();
        if (((str != null) && (!str.equals(((ce)localObject2).fwv))) || ((str == null) && (((ce)localObject2).fwv != null))) {
          ((au)localObject2).dh(str);
        }
        a.a.sa().b((au)localObject2);
        ((au)localObject2).E(bc.gR(((ce)localObject2).field_talker));
        paramArrayList.add(localObject2);
        long l2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P((au)localObject2);
        if (l2 >= 0L) {}
        for (paramBoolean = true;; paramBoolean = false)
        {
          Assert.assertTrue(paramBoolean);
          ((e)localObject1).eDr = l2;
          this.gJb.put(Long.valueOf(((e)localObject1).eDr), localObject1);
          this.gJc.add(Long.valueOf(((e)localObject1).eDr));
          paramInt1 = 0;
          break;
        }
      }
    }
    this.gJd.clear();
    if (l1 > 0L) {
      com.tencent.mm.kernel.h.xy().fYV.aL(l1);
    }
    if (paramInt1 != 0) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BX("SendImgSpeeder");
    }
    GMTrace.o(3515430731776L, 26192);
  }
  
  public final boolean at(long paramLong)
  {
    GMTrace.i(3515162296320L, 26190);
    boolean bool = this.gIY.containsKey(Long.valueOf(paramLong));
    GMTrace.o(3515162296320L, 26190);
    return bool;
  }
  
  public final d au(long paramLong)
  {
    GMTrace.i(3515296514048L, 26191);
    d locald = (d)this.gIY.get(Long.valueOf(paramLong));
    GMTrace.o(3515296514048L, 26191);
    return locald;
  }
  
  public final ArrayList<Integer> kh(String paramString)
  {
    GMTrace.i(17503736561664L, 130413);
    Object localObject1 = this.gJb.values();
    Object localObject2 = ((Collection)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      e locale = (e)((Iterator)localObject2).next();
      PString localPString = new PString();
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      locale.gJs = n.IZ().a(locale.gJp, locale.gGV, locale.cfz, locale.eLJ, localPString, localPInt1, localPInt2, locale.gJq, locale.gJr, locale.eDr, locale.gJw, locale.gJx, locale.gJy);
      au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(locale.eDr);
      if (bg.nm(localau.field_imgPath))
      {
        localau.dc(localPString.value);
        localau.dN(localPInt1.value);
        localau.dO(localPInt2.value);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(locale.eDr, localau);
      }
    }
    if (!bg.nm(paramString))
    {
      localObject1 = ((Collection)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (e)((Iterator)localObject1).next();
        if (!paramString.equals(((e)localObject2).toUserName))
        {
          this.gJb.remove(Long.valueOf(((e)localObject2).eDr));
          this.gJc.remove(Long.valueOf(((e)localObject2).eDr));
          w.e("MicroMsg.SendImgSpeeder", "fatal!! Send user mis-match, want:%s, fact:%s", new Object[] { paramString, ((e)localObject2).toUserName });
        }
      }
    }
    paramString = new ArrayList();
    int i = 0;
    while (i < this.gJc.size())
    {
      paramString.add(Integer.valueOf((int)((e)this.gJb.get(this.gJc.get(i))).gJs));
      i += 1;
    }
    this.gJb.clear();
    this.gJc.clear();
    w.i("MicroMsg.SendImgSpeeder", "syncImgData, id size %d", new Object[] { Integer.valueOf(paramString.size()) });
    GMTrace.o(17503736561664L, 130413);
    return paramString;
  }
  
  public static class a
  {
    static ae epK;
    public ReentrantLock epI;
    public Condition epJ;
    int gGV;
    a gJe;
    
    public a()
    {
      GMTrace.i(3516772909056L, 26202);
      this.epI = new ReentrantLock();
      this.epJ = this.epI.newCondition();
      GMTrace.o(3516772909056L, 26202);
    }
    
    public static a a(final m.e parame)
    {
      GMTrace.i(3516907126784L, 26203);
      try
      {
        if (epK == null)
        {
          localObject = new HandlerThread("big file gen Worker");
          ((HandlerThread)localObject).start();
          epK = new ae(((HandlerThread)localObject).getLooper());
        }
        Object localObject = new a();
        parame.gJy = ((a)localObject);
        a locala = parame.gJy;
        epK.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3512477941760L, 26170);
            long l = System.currentTimeMillis();
            m.a.a locala = new m.a.a();
            locala.gJh = new PString();
            locala.gJi = new PString();
            locala.gJj = new PString();
            locala.gJk = new PString();
            String str = FileOp.ld(parame.gJp);
            locala.gHc = n.IZ().a(parame.gJp, str, parame.gGV, true, locala.gJh, locala.gJi, locala.gJj, locala.gJk, parame.gJr, parame.gJw);
            m.a.this.epI.lock();
            try
            {
              m.a.this.gJe = locala;
              m.a.this.epJ.signal();
              w.i("MicroMsg.SendImgSpeeder", "notify big file gen prepared %s last %d", new Object[] { parame.gJp, Long.valueOf(System.currentTimeMillis() - Long.valueOf(l).longValue()) });
              m.a.this.epI.unlock();
              GMTrace.o(3512477941760L, 26170);
              return;
            }
            finally
            {
              m.a.this.epI.unlock();
            }
          }
        });
        ((a)localObject).gGV = parame.gGV;
        GMTrace.o(3516907126784L, 26203);
        return (a)localObject;
      }
      finally {}
    }
    
    /* Error */
    public final a IS()
    {
      // Byte code:
      //   0: ldc2_w 94
      //   3: sipush 26204
      //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_0
      //   10: getfield 38	com/tencent/mm/ao/m$a:epI	Ljava/util/concurrent/locks/ReentrantLock;
      //   13: invokevirtual 98	java/util/concurrent/locks/ReentrantLock:lock	()V
      //   16: aload_0
      //   17: getfield 100	com/tencent/mm/ao/m$a:gJe	Lcom/tencent/mm/ao/m$a$a;
      //   20: ifnonnull +46 -> 66
      //   23: ldc 102
      //   25: ldc 104
      //   27: invokestatic 109	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   30: aload_0
      //   31: getfield 44	com/tencent/mm/ao/m$a:epJ	Ljava/util/concurrent/locks/Condition;
      //   34: invokeinterface 114 1 0
      //   39: goto -23 -> 16
      //   42: astore_1
      //   43: aload_0
      //   44: getfield 38	com/tencent/mm/ao/m$a:epI	Ljava/util/concurrent/locks/ReentrantLock;
      //   47: invokevirtual 117	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   50: aload_0
      //   51: getfield 100	com/tencent/mm/ao/m$a:gJe	Lcom/tencent/mm/ao/m$a$a;
      //   54: astore_1
      //   55: ldc2_w 94
      //   58: sipush 26204
      //   61: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   64: aload_1
      //   65: areturn
      //   66: aload_0
      //   67: getfield 38	com/tencent/mm/ao/m$a:epI	Ljava/util/concurrent/locks/ReentrantLock;
      //   70: invokevirtual 117	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   73: goto -23 -> 50
      //   76: astore_1
      //   77: aload_0
      //   78: getfield 38	com/tencent/mm/ao/m$a:epI	Ljava/util/concurrent/locks/ReentrantLock;
      //   81: invokevirtual 117	java/util/concurrent/locks/ReentrantLock:unlock	()V
      //   84: aload_1
      //   85: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	86	0	this	a
      //   42	1	1	localException	Exception
      //   54	11	1	locala	a
      //   76	9	1	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   16	39	42	java/lang/Exception
      //   16	39	76	finally
    }
    
    public static final class a
    {
      String gHc;
      PString gJh;
      PString gJi;
      PString gJj;
      PString gJk;
      
      public a()
      {
        GMTrace.i(3534892302336L, 26337);
        GMTrace.o(3534892302336L, 26337);
      }
    }
  }
  
  private static final class b
  {
    b gJl;
    String gJm;
    
    public b()
    {
      GMTrace.i(3516101820416L, 26197);
      GMTrace.o(3516101820416L, 26197);
    }
  }
  
  public static final class c
  {
    public LinkedList<m.b> gJn;
    public LinkedList<m.b> gJo;
    
    public c()
    {
      GMTrace.i(3513820119040L, 26180);
      this.gJn = new LinkedList();
      this.gJo = new LinkedList();
      GMTrace.o(3513820119040L, 26180);
    }
    
    private void IU()
    {
      for (;;)
      {
        int i;
        try
        {
          GMTrace.i(3514625425408L, 26186);
          StringBuilder localStringBuilder = new StringBuilder();
          i = 0;
          if (i < this.gJn.size())
          {
            localStringBuilder.append(((m.b)this.gJn.get(i)).gJm);
            if (i != this.gJn.size() - 1) {
              localStringBuilder.append("-");
            }
          }
          else
          {
            w.d("MicroMsg.SendImgSpeeder", "sync big des to file %s ", new Object[] { localStringBuilder.toString() });
            com.tencent.mm.kernel.h.xy().xh().set(348176, localStringBuilder.toString());
            GMTrace.o(3514625425408L, 26186);
            return;
          }
        }
        finally {}
        i += 1;
      }
    }
    
    private void IV()
    {
      for (;;)
      {
        int i;
        try
        {
          GMTrace.i(3514759643136L, 26187);
          StringBuilder localStringBuilder = new StringBuilder();
          i = 0;
          if (i < this.gJo.size())
          {
            localStringBuilder.append(((m.b)this.gJo.get(i)).gJm);
            if (i != this.gJo.size() - 1) {
              localStringBuilder.append("-");
            }
          }
          else
          {
            w.d("MicroMsg.SendImgSpeeder", "sync thumb des to file %s ", new Object[] { localStringBuilder.toString() });
            com.tencent.mm.kernel.h.xy().xh().set(348177, localStringBuilder.toString());
            GMTrace.o(3514759643136L, 26187);
            return;
          }
        }
        finally {}
        i += 1;
      }
    }
    
    public static m.b kj(String paramString)
    {
      GMTrace.i(3514088554496L, 26182);
      m.b localb = new m.b();
      if (bg.nm(paramString)) {}
      for (localb.gJm = f.IL();; localb.gJm = paramString)
      {
        paramString = n.IZ().a(localb.gJm, "", ".jpg", false);
        if (kl(paramString)) {
          break;
        }
        GMTrace.o(3514088554496L, 26182);
        return null;
      }
      localb.gJl = new b(paramString);
      GMTrace.o(3514088554496L, 26182);
      return localb;
    }
    
    public static m.b kk(String paramString)
    {
      GMTrace.i(3514222772224L, 26183);
      m.b localb = new m.b();
      if (bg.nm(paramString)) {}
      for (localb.gJm = f.IL();; localb.gJm = paramString)
      {
        paramString = n.IZ();
        String str = localb.gJm;
        paramString = paramString.a("THUMBNAIL_DIRPATH://th_" + str, "th_", "", false);
        if (kl(paramString)) {
          break;
        }
        GMTrace.o(3514222772224L, 26183);
        return null;
      }
      localb.gJl = new b(paramString);
      GMTrace.o(3514222772224L, 26183);
      return localb;
    }
    
    private static boolean kl(String paramString)
    {
      GMTrace.i(3514356989952L, 26184);
      if (FileOp.kX(paramString) > 0L)
      {
        w.e("MicroMsg.SendImgSpeeder", "file has exist %s", new Object[] { paramString });
        GMTrace.o(3514356989952L, 26184);
        return false;
      }
      GMTrace.o(3514356989952L, 26184);
      return true;
    }
    
    public final void IT()
    {
      int j = 0;
      try
      {
        GMTrace.i(3513954336768L, 26181);
        int i = this.gJn.size();
        int k;
        m.b localb;
        if (i <= 0)
        {
          k = 5 - i;
          i = 0;
          while (i < k)
          {
            localb = kj(null);
            this.gJn.add(localb);
            i += 1;
          }
          w.i("MicroMsg.SendImgSpeeder", "add big File pool added size %d , all size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(this.gJn.size()) });
          IU();
        }
        i = this.gJo.size();
        if (i <= 0)
        {
          k = 5 - i;
          i = j;
          while (i < k)
          {
            localb = kk(null);
            this.gJo.add(localb);
            i += 1;
          }
          IV();
          w.i("MicroMsg.SendImgSpeeder", "add big thumb pool added size %d , all size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(this.gJo.size()) });
        }
        GMTrace.o(3513954336768L, 26181);
        return;
      }
      finally {}
    }
    
    public final m.b gy(int paramInt)
    {
      m.b localb1 = null;
      for (;;)
      {
        try
        {
          GMTrace.i(3514491207680L, 26185);
          if (paramInt == 1)
          {
            if (this.gJn.size() > 0)
            {
              localb1 = (m.b)this.gJn.remove();
              IU();
              IT();
              GMTrace.o(3514491207680L, 26185);
              return localb1;
            }
            localb1 = kj(null);
            continue;
          }
          if (paramInt == 2) {
            if (this.gJo.size() > 0)
            {
              localb1 = (m.b)this.gJo.remove();
              IV();
            }
            else
            {
              m.b localb2 = kk(null);
            }
          }
        }
        finally {}
      }
    }
  }
  
  public static final class d
  {
    public long eMG;
    public long mK;
    
    public d()
    {
      GMTrace.i(3541871624192L, 26389);
      GMTrace.o(3541871624192L, 26389);
    }
  }
  
  public static final class e
  {
    int cfz;
    long eDr;
    int eLJ;
    int gGV;
    public String gJp;
    String gJq;
    String gJr;
    long gJs;
    PString gJt;
    PInt gJu;
    PInt gJv;
    b gJw;
    b gJx;
    m.a gJy;
    public String toUserName;
    
    public e()
    {
      GMTrace.i(3512612159488L, 26171);
      GMTrace.o(3512612159488L, 26171);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */