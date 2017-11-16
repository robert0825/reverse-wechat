package com.tencent.mm.plugin.webview.wepkg.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.c.b;
import com.tencent.mm.protocal.c.brk;
import com.tencent.mm.protocal.c.uh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  private static int rYf;
  private static ByteOrder rYg;
  private volatile String fLH;
  private File hJl;
  volatile boolean hJn;
  private volatile int rYh;
  private volatile int rYi;
  volatile brk rYj;
  private volatile LinkedList<uh> rYk;
  private volatile String rYl;
  
  static
  {
    GMTrace.i(12390041124864L, 92313);
    rYf = 4;
    rYg = ByteOrder.BIG_ENDIAN;
    GMTrace.o(12390041124864L, 92313);
  }
  
  public e(File paramFile)
  {
    GMTrace.i(12389370036224L, 92308);
    this.hJn = false;
    this.rYi = 0;
    this.rYj = null;
    this.rYk = null;
    this.rYl = "";
    this.fLH = "";
    this.hJl = paramFile;
    if (SJ()) {
      bool = true;
    }
    this.hJn = bool;
    GMTrace.o(12389370036224L, 92308);
  }
  
  private boolean SJ()
  {
    GMTrace.i(12389638471680L, 92310);
    localObject1 = null;
    try
    {
      FileChannel localFileChannel = new RandomAccessFile(this.hJl, "r").getChannel();
      localObject1 = localFileChannel;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.e("MicroMsg.Wepkg.WePkgReader", "openfile failed, " + localException1.getMessage());
      }
      try
      {
        ((FileChannel)localObject1).position(0L);
        ByteBuffer localByteBuffer = ByteBuffer.allocate(rYf);
        localByteBuffer.order(rYg);
        ((FileChannel)localObject1).read(localByteBuffer);
        this.rYh = localByteBuffer.getInt(0);
        boolean bool = a((FileChannel)localObject1);
        b((FileChannel)localObject1);
        GMTrace.o(12389638471680L, 92310);
        return bool;
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.Wepkg.WePkgReader", "parseHeader error, " + localException2.getMessage());
        b((FileChannel)localObject1);
        GMTrace.o(12389638471680L, 92310);
        return false;
      }
      finally
      {
        b((FileChannel)localObject1);
      }
    }
    if (localObject1 == null)
    {
      GMTrace.o(12389638471680L, 92310);
      return false;
    }
  }
  
  private boolean a(FileChannel paramFileChannel)
  {
    GMTrace.i(12389772689408L, 92311);
    if (this.rYh <= 0)
    {
      GMTrace.o(12389772689408L, 92311);
      return false;
    }
    try
    {
      paramFileChannel.position(rYf);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(this.rYh);
      localByteBuffer.order(rYg);
      paramFileChannel.read(localByteBuffer);
      paramFileChannel = localByteBuffer.array();
      if (paramFileChannel != null)
      {
        int i = paramFileChannel.length;
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(12389772689408L, 92311);
        return false;
      }
      this.rYj = new brk();
      this.rYj.aD(paramFileChannel);
      this.rYk = this.rYj.vbg;
      this.rYl = this.rYj.vbh;
      this.fLH = this.rYj.lPj;
      this.rYi = (rYf + this.rYh);
      GMTrace.o(12389772689408L, 92311);
      return true;
    }
    catch (Exception paramFileChannel)
    {
      w.e("MicroMsg.Wepkg.WePkgReader", "dealProtoData error, " + paramFileChannel.getMessage());
      GMTrace.o(12389772689408L, 92311);
    }
    return false;
  }
  
  private static void b(FileChannel paramFileChannel)
  {
    GMTrace.i(12389906907136L, 92312);
    if (paramFileChannel != null) {
      try
      {
        paramFileChannel.close();
        GMTrace.o(12389906907136L, 92312);
        return;
      }
      catch (IOException paramFileChannel) {}
    }
    GMTrace.o(12389906907136L, 92312);
  }
  
  public final k eu(String paramString1, String paramString2)
  {
    GMTrace.i(19383724277760L, 144420);
    if ((bg.cc(this.rYk)) || (this.rYi < rYf) || (bg.nm(paramString1)))
    {
      w.e("MicroMsg.Wepkg.WePkgReader", "mFileIndexList is null");
      GMTrace.o(19383724277760L, 144420);
      return null;
    }
    Iterator localIterator = this.rYk.iterator();
    while (localIterator.hasNext())
    {
      uh localuh = (uh)localIterator.next();
      if (bg.nl(localuh.umC).equals(paramString1))
      {
        Object localObject = localuh.umE;
        if ((!bg.nm((String)localObject)) && ((((String)localObject).startsWith("video/")) || (((String)localObject).startsWith("audio/")))) {}
        for (int i = 1; i != 0; i = 0)
        {
          w.i("MicroMsg.Wepkg.WePkgReader", "filename (%s) is media resource", new Object[] { paramString1 });
          GMTrace.o(19383724277760L, 144420);
          return null;
        }
        if (localuh.jhV <= 5242880L) {
          try
          {
            w.i("MicroMsg.Wepkg.WePkgReader", "rid hit big package. rid:%s", new Object[] { paramString1 });
            localObject = new k(localuh.umE, paramString2, new b(this.hJl, this.rYi + localuh.umD, localuh.jhV));
            GMTrace.o(19383724277760L, 144420);
            return (k)localObject;
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", new Object[] { paramString1, Long.valueOf(localuh.umD), Integer.valueOf(localuh.jhV), localuh.umE, localIOException.getMessage() });
          }
        } else {
          w.i("MicroMsg.Wepkg.WePkgReader", "fileSize(%d) > limitSize(%d), filename = %s, offset = %d, mimeType = %s", new Object[] { Integer.valueOf(localuh.jhV), Long.valueOf(5242880L), paramString1, Long.valueOf(localuh.umD), localuh.umE });
        }
      }
    }
    GMTrace.o(19383724277760L, 144420);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */