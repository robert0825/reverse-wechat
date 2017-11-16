package com.tencent.tinker.d.a;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;

public final class g
  implements Closeable
{
  private final String filename;
  public String uPE;
  public final LinkedHashMap<String, f> yjk = new LinkedHashMap();
  private File yjl;
  private RandomAccessFile yjm;
  
  public g(File paramFile)
  {
    this(paramFile, (byte)0);
  }
  
  private g(File paramFile, byte paramByte)
  {
    this.filename = paramFile.getPath();
    this.yjl = null;
    this.yjm = new RandomAccessFile(this.filename, "r");
    cqT();
  }
  
  public g(String paramString)
  {
    this(new File(paramString), (byte)0);
  }
  
  static void a(String paramString1, long paramLong1, String paramString2, long paramLong2, String paramString3, int paramInt)
  {
    String str = Integer.toHexString(paramInt);
    throw new ZipException("file name:" + paramString1 + ", file size" + paramLong1 + ", entry name:" + paramString2 + ", entry localHeaderRelOffset:" + paramLong2 + ", " + paramString3 + " signature not found; was " + str);
  }
  
  private void cqT()
  {
    long l2 = 0L;
    long l1 = this.yjm.length() - 22L;
    if (l1 < 0L) {
      throw new ZipException("File too short to be a zip file: " + this.yjm.length());
    }
    this.yjm.seek(0L);
    if (Integer.reverseBytes(this.yjm.readInt()) != 67324752L) {
      throw new ZipException("Not a zip archive");
    }
    long l3 = l1 - 65536L;
    if (l3 < 0L) {}
    for (;;)
    {
      this.yjm.seek(l1);
      if (Integer.reverseBytes(this.yjm.readInt()) != 101010256L)
      {
        l3 = l1 - 1L;
        l1 = l3;
        if (l3 < l2) {
          throw new ZipException("End Of Central Directory signature not found");
        }
      }
      else
      {
        Object localObject = new byte[18];
        this.yjm.readFully((byte[])localObject);
        localObject = c.a((byte[])localObject, 18, ByteOrder.LITTLE_ENDIAN);
        int i = ((b)localObject).readShort();
        int k = ((b)localObject).readShort();
        int j = ((b)localObject).readShort() & 0xFFFF;
        int m = ((b)localObject).readShort();
        ((b)localObject).cqR();
        l1 = ((b)localObject).readInt() & 0xFFFFFFFF;
        int n = ((b)localObject).readShort() & 0xFFFF;
        if ((j != (m & 0xFFFF)) || ((i & 0xFFFF) != 0) || ((k & 0xFFFF) != 0)) {
          throw new ZipException("Spanned archives not supported");
        }
        if (n > 0)
        {
          localObject = new byte[n];
          this.yjm.readFully((byte[])localObject);
          this.uPE = new String((byte[])localObject, 0, localObject.length, d.UTF_8);
        }
        localObject = new BufferedInputStream(new a(this.yjm, l1), 4096);
        byte[] arrayOfByte = new byte[46];
        i = 0;
        while (i < j)
        {
          f localf = new f(arrayOfByte, (InputStream)localObject, d.UTF_8);
          if (localf.yji >= l1) {
            throw new ZipException("Local file header offset is after central directory");
          }
          String str = localf.name;
          if (this.yjk.put(str, localf) != null) {
            throw new ZipException("Duplicate entry name: " + str);
          }
          i += 1;
        }
        return;
        l2 = l3;
      }
    }
  }
  
  public final f YM(String paramString)
  {
    cqS();
    if (paramString == null) {
      throw new NullPointerException("entryName == null");
    }
    f localf2 = (f)this.yjk.get(paramString);
    f localf1 = localf2;
    if (localf2 == null) {
      localf1 = (f)this.yjk.get(paramString + "/");
    }
    return localf1;
  }
  
  public final InputStream a(f arg1)
  {
    f localf = YM(???.name);
    if (localf == null) {
      return null;
    }
    a locala;
    DataInputStream localDataInputStream;
    synchronized (this.yjm)
    {
      locala = new a(???, localf.yji);
      localDataInputStream = new DataInputStream(locala);
      i = Integer.reverseBytes(localDataInputStream.readInt());
      if (i != 67324752L) {
        a(this.filename, ???.length(), localf.name, localf.yji, "Local File Header", i);
      }
      localDataInputStream.skipBytes(2);
      i = Short.reverseBytes(localDataInputStream.readShort()) & 0xFFFF;
      if ((i & 0x1) != 0) {
        throw new ZipException("Invalid General Purpose Bit Flag: " + i);
      }
    }
    localDataInputStream.skipBytes(18);
    int i = Short.reverseBytes(localDataInputStream.readShort());
    int j = Short.reverseBytes(localDataInputStream.readShort());
    localDataInputStream.close();
    locala.skip((i & 0xFFFF) + (j & 0xFFFF));
    if (((f)localObject).yjf == 0) {
      a.a(locala, a.a(locala) + ((f)localObject).size);
    }
    for (;;)
    {
      return locala;
      a.a(locala, a.a(locala) + ((f)localObject).yje);
    }
  }
  
  public final void close()
  {
    RandomAccessFile localRandomAccessFile = this.yjm;
    if (localRandomAccessFile != null) {}
    try
    {
      this.yjm = null;
      localRandomAccessFile.close();
      if (this.yjl != null)
      {
        this.yjl.delete();
        this.yjl = null;
      }
      return;
    }
    finally {}
  }
  
  public final void cqS()
  {
    if (this.yjm == null) {
      throw new IllegalStateException("Zip file closed");
    }
  }
  
  public static final class a
    extends InputStream
  {
    private long mK;
    private final RandomAccessFile yjo;
    private long yjp;
    
    public a(RandomAccessFile paramRandomAccessFile, long paramLong)
    {
      this(paramRandomAccessFile, paramLong, paramRandomAccessFile.length());
    }
    
    private a(RandomAccessFile paramRandomAccessFile, long paramLong1, long paramLong2)
    {
      this.yjo = paramRandomAccessFile;
      this.mK = paramLong1;
      this.yjp = paramLong2;
    }
    
    public final int available()
    {
      if (this.mK < this.yjp) {
        return 1;
      }
      return 0;
    }
    
    public final int read()
    {
      return e.u(this);
    }
    
    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      synchronized (this.yjo)
      {
        long l = this.yjp - this.mK;
        int i = paramInt2;
        if (paramInt2 > l) {
          i = (int)l;
        }
        this.yjo.seek(this.mK);
        paramInt1 = this.yjo.read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 > 0)
        {
          this.mK += paramInt1;
          return paramInt1;
        }
        return -1;
      }
    }
    
    public final long skip(long paramLong)
    {
      long l = paramLong;
      if (paramLong > this.yjp - this.mK) {
        l = this.yjp - this.mK;
      }
      this.mK += l;
      return l;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\d\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */