package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aii;
import com.tencent.mm.protocal.c.aij;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private File lBq;
  List<RandomAccessFile> lBr;
  SparseArray<aij> lBs;
  int lBt;
  boolean lbr;
  
  d(File paramFile)
  {
    GMTrace.i(11908870569984L, 88728);
    this.lbr = true;
    if (!paramFile.isDirectory())
    {
      boolean bool = paramFile.mkdirs();
      w.d("MicroMsg.DiskCache", "dir[%s] not exist, try to create it, result[%B]", new Object[] { paramFile.getAbsolutePath(), Boolean.valueOf(bool) });
    }
    this.lBq = paramFile;
    this.lBs = new SparseArray();
    GMTrace.o(11908870569984L, 88728);
  }
  
  static void e(Closeable paramCloseable)
  {
    GMTrace.i(11909407440896L, 88732);
    if (paramCloseable != null) {
      try
      {
        paramCloseable.close();
        GMTrace.o(11909407440896L, 88732);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.DiskCache", "want close %s fail: %s", new Object[] { paramCloseable.getClass().getName(), localException.getMessage() });
        w.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
      }
    }
    GMTrace.o(11909407440896L, 88732);
  }
  
  private static String oi(int paramInt)
  {
    GMTrace.i(11909944311808L, 88736);
    StringBuilder localStringBuilder = new StringBuilder("cache.data");
    if (paramInt == 0) {}
    for (String str = "";; str = "." + paramInt)
    {
      str = str;
      GMTrace.o(11909944311808L, 88736);
      return str;
    }
  }
  
  final void aCT()
  {
    GMTrace.i(11909004787712L, 88729);
    File localFile = new File(this.lBq, "cache.idx");
    Object localObject2 = new aii();
    String str = localFile.getAbsolutePath();
    Object localObject1 = localObject2;
    if (!bg.nm(str)) {}
    try
    {
      ((aii)localObject2).aD(bg.readFromFile(str));
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.DiskCache", "load index file error");
        w.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        og(-1);
        aii localaii1 = new aii();
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        w.e("MicroMsg.DiskCache", "load index file error, OOM, index length %s", new Object[] { Long.valueOf(localFile.length()) });
        w.printErrStackTrace("MicroMsg.DiskCache", localOutOfMemoryError, "", new Object[0]);
        og(-1);
        aii localaii2 = new aii();
      }
      GMTrace.o(11909004787712L, 88729);
    }
    this.lBs.clear();
    localObject1 = ((aii)localObject1).uxK.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (aij)((Iterator)localObject1).next();
      this.lBs.put(((aij)localObject2).key, localObject2);
    }
  }
  
  final void aCU()
  {
    GMTrace.i(11909541658624L, 88733);
    aii localaii = new aii();
    int i = 0;
    while (i < this.lBs.size())
    {
      localObject = (aij)this.lBs.valueAt(i);
      localaii.uxK.add(0, localObject);
      w.v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d] file_suffix[%d]}", new Object[] { Integer.valueOf(((aij)localObject).key), Long.valueOf(((aij)localObject).uxL), Integer.valueOf(((aij)localObject).length), Integer.valueOf(((aij)localObject).uxM) });
      i += 1;
    }
    Object localObject = new File(this.lBq, "cache.idx");
    try
    {
      bg.q(((File)localObject).getAbsolutePath(), localaii.toByteArray());
      GMTrace.o(11909541658624L, 88733);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.DiskCache", "save index data error: %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
      GMTrace.o(11909541658624L, 88733);
    }
  }
  
  final void aCV()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(11909675876352L, 88734);
        if ((this.lBr == null) || (this.lBr.size() <= 0))
        {
          GMTrace.o(11909675876352L, 88734);
          return;
        }
        Iterator localIterator = this.lBr.iterator();
        if (localIterator.hasNext()) {
          e((RandomAccessFile)localIterator.next());
        } else {
          GMTrace.o(11909675876352L, 88734);
        }
      }
      finally {}
    }
  }
  
  public final int aCW()
  {
    i = 0;
    for (;;)
    {
      Iterator localIterator;
      RandomAccessFile localRandomAccessFile;
      int j;
      long l;
      try
      {
        GMTrace.i(11910078529536L, 88737);
        if ((this.lBr == null) || (this.lBr.size() <= 0))
        {
          GMTrace.o(11910078529536L, 88737);
          return i;
        }
      }
      finally {}
      try
      {
        localIterator = this.lBr.iterator();
        i = -1;
        if (!localIterator.hasNext()) {
          break label121;
        }
        localRandomAccessFile = (RandomAccessFile)localIterator.next();
        j = i + 1;
        l = localRandomAccessFile.length();
        i = j;
        if (l >= 2097152L) {
          continue;
        }
        i = j;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.DiskCache", localIOException, "", new Object[0]);
        i = -1;
        continue;
      }
      GMTrace.o(11910078529536L, 88737);
      continue;
      label121:
      i = -1;
    }
  }
  
  public final void aCX()
  {
    GMTrace.i(11910212747264L, 88738);
    ab.getContext().getSharedPreferences(ab.bPU(), 0).edit().putInt("com.tencent.mm.gallery.cache.suffix", this.lBt).commit();
    GMTrace.o(11910212747264L, 88738);
  }
  
  final void of(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        GMTrace.i(11909139005440L, 88730);
        if (paramInt < 0) {}
      }
      finally {}
      try
      {
        if (this.lBr != null) {
          continue;
        }
        this.lBr = new ArrayList();
        paramInt = i;
        if (paramInt < 25)
        {
          localRandomAccessFile = new RandomAccessFile(new File(this.lBq, oi(paramInt)), "rw");
          this.lBr.add(localRandomAccessFile);
          paramInt += 1;
          continue;
        }
        GMTrace.o(11909139005440L, 88730);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.DiskCache", "create data file error: %s", new Object[] { localException.getMessage() });
        w.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
        this.lBr = null;
        GMTrace.o(11909139005440L, 88730);
        continue;
      }
      return;
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(new File(this.lBq, oi(paramInt)), "rw");
      this.lBr.remove(paramInt);
      this.lBr.add(paramInt, localRandomAccessFile);
      GMTrace.o(11909139005440L, 88730);
    }
  }
  
  final void og(int paramInt)
  {
    int j = 0;
    GMTrace.i(11909273223168L, 88731);
    if ((this.lBr == null) || (this.lBr.size() <= 0))
    {
      GMTrace.o(11909273223168L, 88731);
      return;
    }
    if (paramInt < 0)
    {
      new File(this.lBq, "cache.idx").delete();
      this.lBs.clear();
    }
    while (paramInt < 0)
    {
      aCV();
      paramInt = j;
      for (;;)
      {
        if (paramInt < 25)
        {
          new File(this.lBq, oi(25)).delete();
          paramInt += 1;
          continue;
          SparseArray localSparseArray = new SparseArray();
          int i = 0;
          while (i < this.lBs.size())
          {
            aij localaij = (aij)this.lBs.valueAt(i);
            if (localaij.uxM != paramInt) {
              localSparseArray.put(this.lBs.keyAt(i), localaij);
            }
            w.v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d]}", new Object[] { Integer.valueOf(localaij.key), Long.valueOf(localaij.uxL), Integer.valueOf(localaij.length) });
            i += 1;
          }
          this.lBs = localSparseArray;
          aCU();
          break;
        }
      }
      GMTrace.o(11909273223168L, 88731);
      return;
    }
    e((Closeable)this.lBr.get(paramInt));
    new File(this.lBq, oi(paramInt)).delete();
    GMTrace.o(11909273223168L, 88731);
  }
  
  public final Bitmap oh(int paramInt)
  {
    GMTrace.i(11909810094080L, 88735);
    if ((this.lBr == null) || (this.lBr.size() <= 0))
    {
      w.e("MicroMsg.DiskCache", "want to get bitmap, but data file is null");
      GMTrace.o(11909810094080L, 88735);
      return null;
    }
    Object localObject = (aij)this.lBs.get(paramInt);
    if (localObject != null)
    {
      byte[] arrayOfByte = new byte[((aij)localObject).length];
      for (;;)
      {
        try
        {
          w.d("MicroMsg.DiskCache", "read data, beg pos %d, length %d", new Object[] { Long.valueOf(((aij)localObject).uxL), Integer.valueOf(((aij)localObject).length) });
          RandomAccessFile localRandomAccessFile = (RandomAccessFile)this.lBr.get(((aij)localObject).uxM);
          localRandomAccessFile.seek(((aij)localObject).uxL);
          localRandomAccessFile.read(arrayOfByte, 0, ((aij)localObject).length);
          localObject = com.tencent.mm.sdk.platformtools.d.bg(arrayOfByte);
          if (localObject != null)
          {
            w.d("MicroMsg.DiskCache", "get bitmap from disk cache ok, wh[%d, %d]", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
            GMTrace.o(11909810094080L, 88735);
            return (Bitmap)localObject;
          }
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.DiskCache", "read data fail, key[%d]: %s", new Object[] { Integer.valueOf(paramInt), localException.getMessage() });
          w.printErrStackTrace("MicroMsg.DiskCache", localException, "", new Object[0]);
          this.lBs.remove(paramInt);
          GMTrace.o(11909810094080L, 88735);
          return null;
        }
        this.lBs.remove(paramInt);
      }
    }
    GMTrace.o(11909810094080L, 88735);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */