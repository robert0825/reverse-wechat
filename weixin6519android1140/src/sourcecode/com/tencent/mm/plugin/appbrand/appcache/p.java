package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class p
  implements Closeable
{
  public static final ByteOrder hJk;
  private volatile int afp;
  private final File hJl;
  private volatile FileChannel hJm;
  public volatile boolean hJn;
  private volatile int hJo;
  private volatile int hJp;
  private volatile int hJq;
  private volatile Map<String, a> hJr;
  
  static
  {
    GMTrace.i(10615280107520L, 79090);
    hJk = ByteOrder.BIG_ENDIAN;
    GMTrace.o(10615280107520L, 79090);
  }
  
  public p(File paramFile)
  {
    GMTrace.i(10614743236608L, 79086);
    this.hJm = null;
    this.hJn = true;
    this.afp = -1;
    this.hJo = 0;
    this.hJp = 0;
    this.hJq = -1;
    this.hJr = null;
    this.hJl = paramFile;
    int i;
    if ((this.hJl == null) || (!this.hJl.exists()))
    {
      i = 0;
      if ((i == 0) || (!SJ())) {
        break label122;
      }
    }
    for (;;)
    {
      this.hJn = bool;
      GMTrace.o(10614743236608L, 79086);
      return;
      if (this.hJl.length() <= 14L)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label122:
      bool = false;
    }
  }
  
  p(String paramString)
  {
    this(new File(paramString));
    GMTrace.i(20782138785792L, 154839);
    GMTrace.o(20782138785792L, 154839);
  }
  
  private boolean SJ()
  {
    GMTrace.i(10615145889792L, 79089);
    if (this.hJm == null) {}
    try
    {
      this.hJm = new RandomAccessFile(this.hJl, "r").getChannel();
      if (this.hJm == null)
      {
        GMTrace.o(10615145889792L, 79089);
        return false;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "open(), exp = %s", new Object[] { bg.f(localFileNotFoundException) });
      }
    }
    try
    {
      this.hJm.position(0L);
      Object localObject = ByteBuffer.allocate(14);
      ((ByteBuffer)localObject).order(hJk);
      this.hJm.read((ByteBuffer)localObject);
      if (-66 == ((ByteBuffer)localObject).get(0))
      {
        int i = ((ByteBuffer)localObject).get(13);
        if (-19 == i) {}
      }
      else
      {
        GMTrace.o(10615145889792L, 79089);
        return false;
      }
      localObject = ((ByteBuffer)localObject).array();
      this.afp = a.n((byte[])localObject, 1);
      this.hJo = a.n((byte[])localObject, 5);
      this.hJp = a.n((byte[])localObject, 9);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "parseHeader, exp = %s", new Object[] { bg.f(localIOException) });
      }
    }
    GMTrace.o(10615145889792L, 79089);
    return true;
  }
  
  public final boolean SH()
  {
    GMTrace.i(10615011672064L, 79088);
    if ((!this.hJn) || (this.hJm == null) || (this.hJo <= 4))
    {
      w.e("MicroMsg.AppBrandWxaPkg", "readInfo, valid = %b, (null == mFileChannel) = %b, mBodyInfoLength = %d, skip", new Object[] { Boolean.valueOf(this.hJn), this.hJm, Integer.valueOf(this.hJp) });
      GMTrace.o(10615011672064L, 79088);
      return false;
    }
    if ((this.hJr != null) && (this.hJq >= 0) && (this.hJq == this.hJr.size()))
    {
      GMTrace.o(10615011672064L, 79088);
      return true;
    }
    try
    {
      this.hJm.position(14L);
      Object localObject = ByteBuffer.allocate(this.hJo);
      ((ByteBuffer)localObject).order(hJk);
      this.hJm.read((ByteBuffer)localObject);
      byte[] arrayOfByte = ((ByteBuffer)localObject).array();
      this.hJq = a.n(arrayOfByte, 0);
      android.support.v4.e.a locala = new android.support.v4.e.a();
      localObject = null;
      int j = 4;
      int i = 0;
      while (i < this.hJq)
      {
        int k = a.n(arrayOfByte, j);
        j += 4;
        String str = new String(arrayOfByte, j, k);
        j += k;
        k = a.n(arrayOfByte, j);
        j += 4;
        int m = a.n(arrayOfByte, j);
        j += 4;
        localObject = new a(str, k, m);
        locala.put(str, localObject);
        i += 1;
      }
      this.hJr = locala;
      if ((localObject != null) && (((a)localObject).hJs + ((a)localObject).hJt > this.hJl.length()))
      {
        w.e("MicroMsg.AppBrandWxaPkg", "readInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d)", new Object[] { Integer.valueOf(((a)localObject).hJs), Integer.valueOf(((a)localObject).hJt), Long.valueOf(this.hJl.length()) });
        GMTrace.o(10615011672064L, 79088);
        return false;
      }
      GMTrace.o(10615011672064L, 79088);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandWxaPkg", "readInfo, exp = %s", new Object[] { bg.f(localException) });
      GMTrace.o(10615011672064L, 79088);
    }
    return false;
  }
  
  final List<a> SI()
  {
    GMTrace.i(18188918063104L, 135518);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.hJr.values().iterator();
    while (localIterator.hasNext()) {
      localLinkedList.add((a)localIterator.next());
    }
    GMTrace.o(18188918063104L, 135518);
    return localLinkedList;
  }
  
  public final void close()
  {
    GMTrace.i(10614877454336L, 79087);
    if (this.hJm != null) {
      try
      {
        this.hJm.close();
        this.hJm = null;
        GMTrace.o(10614877454336L, 79087);
        return;
      }
      catch (IOException localIOException) {}
    }
    GMTrace.o(10614877454336L, 79087);
  }
  
  public final InputStream op(String paramString)
  {
    int i = 0;
    GMTrace.i(18188783845376L, 135517);
    if ((this.hJr == null) || (bg.nm(paramString)))
    {
      boolean bool;
      if (this.hJr == null)
      {
        bool = true;
        if (this.hJr != null) {
          break label87;
        }
      }
      for (;;)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "openReadFile, mFileMap null = %b, mFileMap size = %d, fileName = %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), paramString });
        GMTrace.o(18188783845376L, 135517);
        return null;
        bool = false;
        break;
        label87:
        i = this.hJr.size();
      }
    }
    paramString = a.ok(paramString);
    a locala = (a)this.hJr.get(paramString);
    if (locala != null) {
      try
      {
        Object localObject = this.hJm.map(FileChannel.MapMode.READ_ONLY, locala.hJs, locala.hJt);
        ((MappedByteBuffer)localObject).order(hJk);
        ((MappedByteBuffer)localObject).limit(locala.hJt);
        localObject = new com.tencent.mm.plugin.appbrand.i.a((ByteBuffer)localObject);
        GMTrace.o(18188783845376L, 135517);
        return (InputStream)localObject;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.AppBrandWxaPkg", "openReadFile, fileName = %s, fileOffset = %d, fileLength = %d, exp = %s", new Object[] { paramString, Integer.valueOf(locala.hJs), Integer.valueOf(locala.hJt), bg.f(localException) });
        GMTrace.o(18188783845376L, 135517);
        return null;
      }
    }
    GMTrace.o(18188783845376L, 135517);
    return null;
  }
  
  public static final class a
  {
    public final String euR;
    public final int hJs;
    public final int hJt;
    
    public a(String paramString, int paramInt1, int paramInt2)
    {
      GMTrace.i(10612461535232L, 79069);
      this.euR = paramString;
      this.hJs = paramInt1;
      this.hJt = paramInt2;
      GMTrace.o(10612461535232L, 79069);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */