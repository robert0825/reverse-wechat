package com.tencent.mm.plugin.clean.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class f
  extends Thread
{
  private boolean isStop;
  private int jSX;
  private int jSY;
  private h jTm;
  private HashSet<String> jTr;
  
  public f(HashSet<String> paramHashSet, h paramh)
  {
    GMTrace.i(20559605792768L, 153181);
    this.jSX = 0;
    this.jSY = 0;
    this.isStop = false;
    this.jTr = paramHashSet;
    this.jTm = paramh;
    GMTrace.o(20559605792768L, 153181);
  }
  
  private int a(File paramFile, PInt paramPInt, PLong paramPLong)
  {
    GMTrace.i(20560276881408L, 153186);
    int i = paramPInt.value;
    if (paramFile != null) {}
    for (Object localObject = paramFile.getAbsolutePath();; localObject = "null")
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.DeleteOtherAccController", "delete [%d] [%s]", new Object[] { Integer.valueOf(i), localObject });
      if (paramPInt.value < 10) {
        break label86;
      }
      if (!this.isStop) {
        break;
      }
      GMTrace.o(20560276881408L, 153186);
      return -1;
    }
    paramPInt.value = 0;
    label86:
    if ((paramFile == null) || (!paramFile.exists()))
    {
      GMTrace.o(20560276881408L, 153186);
      return 0;
    }
    if (paramFile.isDirectory())
    {
      localObject = paramFile.listFiles();
      if (localObject != null)
      {
        i = 0;
        while (i < localObject.length)
        {
          if (a(localObject[i], paramPInt, paramPLong) == -1)
          {
            GMTrace.o(20560276881408L, 153186);
            return -1;
          }
          i += 1;
        }
      }
      FileOp.deleteFile(paramFile.getAbsolutePath());
    }
    for (;;)
    {
      GMTrace.o(20560276881408L, 153186);
      return 1;
      paramPLong.value += paramFile.length();
      FileOp.deleteFile(paramFile.getAbsolutePath());
      paramPInt.value += 1;
    }
  }
  
  private void aoi()
  {
    GMTrace.i(20560008445952L, 153184);
    if (this.isStop)
    {
      GMTrace.o(20560008445952L, 153184);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20562424365056L, 153202);
        if (f.a(f.this) != null) {
          f.a(f.this).bR(f.b(f.this), f.c(f.this));
        }
        GMTrace.o(20562424365056L, 153202);
      }
    });
    GMTrace.o(20560008445952L, 153184);
  }
  
  private static void b(String paramString, ArrayList<String> paramArrayList)
  {
    GMTrace.i(20559874228224L, 153183);
    if (bg.nm(paramString))
    {
      GMTrace.o(20559874228224L, 153183);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeleteOtherAccController", "check paths [%s]", new Object[] { paramString });
    Object localObject = new File(paramString);
    if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
    {
      localObject = ((File)localObject).list();
      if ((localObject != null) && (localObject.length > 0))
      {
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          String str = localObject[i];
          str = paramString + File.separator + str;
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.DeleteOtherAccController", "check add path[%s]", new Object[] { str });
          paramArrayList.add(str);
          i += 1;
        }
      }
    }
    GMTrace.o(20559874228224L, 153183);
  }
  
  private void bd(final long paramLong)
  {
    GMTrace.i(20560142663680L, 153185);
    if (this.isStop)
    {
      GMTrace.o(20560142663680L, 153185);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20560947970048L, 153191);
        if (f.a(f.this) != null) {
          f.a(f.this).be(paramLong);
        }
        GMTrace.o(20560947970048L, 153191);
      }
    });
    GMTrace.o(20560142663680L, 153185);
  }
  
  public final void run()
  {
    GMTrace.i(20559740010496L, 153182);
    if ((this.jTr == null) || (this.jTr.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.DeleteOtherAccController", "delete paths is null.");
      bd(0L);
      GMTrace.o(20559740010496L, 153182);
      return;
    }
    Object localObject1 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = new StringBuilder("mm");
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    localObject2 = g.n(a.ww().getBytes());
    Object localObject3 = this.jTr.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (String)((Iterator)localObject3).next();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeleteOtherAccController", "uinPath[%s] path[%s]", new Object[] { localObject2, localObject4 });
      if (!bg.eW((String)localObject2, (String)localObject4))
      {
        b(com.tencent.mm.kernel.h.xy().fYT + (String)localObject4, (ArrayList)localObject1);
        b(com.tencent.mm.storage.w.ghv + (String)localObject4, localArrayList);
      }
    }
    this.jSX = (((ArrayList)localObject1).size() + localArrayList.size());
    this.jSY = 0;
    localObject2 = new PLong();
    localObject3 = new PLong();
    int j = ((ArrayList)localObject1).size();
    Object localObject4 = new PInt();
    int i = 0;
    while ((!this.isStop) && (i < j))
    {
      ((PInt)localObject4).value = 0;
      String str = (String)((ArrayList)localObject1).get(i);
      i += 1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeleteOtherAccController", "ready to delete index[%d] path[%s] pDelete[%d]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(((PInt)localObject4).value) });
      if (a(new File(str), (PInt)localObject4, (PLong)localObject2) == -1) {
        break;
      }
      this.jSY += 1;
      aoi();
    }
    j = localArrayList.size();
    localObject1 = new PInt();
    i = 0;
    while ((!this.isStop) && (i < j))
    {
      ((PInt)localObject1).value = 0;
      localObject4 = (String)localArrayList.get(i);
      i += 1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeleteOtherAccController", "ready to delete index[%d] path[%s] pDelete[%d]", new Object[] { Integer.valueOf(i), localObject4, Integer.valueOf(((PInt)localObject1).value) });
      if (a(new File((String)localObject4), (PInt)localObject1, (PLong)localObject3) == -1) {
        break;
      }
      this.jSY += 1;
      aoi();
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.DeleteOtherAccController", "delete finish sd[%d] data[%d]", new Object[] { Long.valueOf(((PLong)localObject2).value), Long.valueOf(((PLong)localObject3).value) });
    bd(((PLong)localObject2).value);
    GMTrace.o(20559740010496L, 153182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\clean\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */