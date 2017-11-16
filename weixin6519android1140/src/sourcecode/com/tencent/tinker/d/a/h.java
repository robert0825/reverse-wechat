package com.tencent.tinker.d.a;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.ZipException;

public final class h
  extends FilterOutputStream
{
  public static final byte[] yjq = new byte[0];
  private static final byte[] yjr = { -1, -1, -1, -1 };
  private long mK = 0L;
  private boolean yjA;
  private final HashSet<String> yjs = new HashSet();
  private final boolean yjt = false;
  public byte[] yju = yjq;
  private int yjv = 8;
  private ByteArrayOutputStream yjw = new ByteArrayOutputStream();
  private f yjx;
  private byte[] yjy;
  private byte[] yjz;
  
  public h(OutputStream paramOutputStream)
  {
    this(paramOutputStream, (byte)0);
  }
  
  private h(OutputStream paramOutputStream, byte paramByte)
  {
    super(paramOutputStream);
  }
  
  private static long a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((int)(0xFF & paramLong));
    paramOutputStream.write((int)(paramLong >> 8) & 0xFF);
    paramOutputStream.write((int)(paramLong >> 16) & 0xFF);
    paramOutputStream.write((int)(paramLong >> 24) & 0xFF);
    return paramLong;
  }
  
  private static int b(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    return paramInt;
  }
  
  private void cqU()
  {
    if (this.yjw == null) {
      throw new IOException("Stream is closed");
    }
  }
  
  public static void x(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 65535) {
      throw new IllegalArgumentException(paramString + " too long in UTF-8:" + paramArrayOfByte.length + " bytes");
    }
  }
  
  public final void b(f paramf)
  {
    if (this.yjx != null) {
      closeEntry();
    }
    int i = paramf.yjf;
    if (i == -1) {
      i = this.yjv;
    }
    for (;;)
    {
      if (i == 0)
      {
        if (paramf.yje == -1L) {
          paramf.yje = paramf.size;
        }
        while (paramf.yiT == -1L)
        {
          throw new ZipException("STORED entry missing CRC");
          if (paramf.size == -1L) {
            paramf.setSize(paramf.yje);
          }
        }
        if (paramf.size == -1L) {
          throw new ZipException("STORED entry missing size");
        }
        if (paramf.size != paramf.yje) {
          throw new ZipException("STORED entry size/compressed size mismatch");
        }
      }
      cqU();
      paramf.uPE = null;
      paramf.yjh = null;
      paramf.time = 40691;
      paramf.yjg = 18698;
      this.yjy = paramf.name.getBytes(d.UTF_8);
      x("Name", this.yjy);
      this.yjz = yjq;
      if (paramf.uPE != null)
      {
        this.yjz = paramf.uPE.getBytes(d.UTF_8);
        x("Comment", this.yjz);
      }
      paramf.setMethod(i);
      this.yjx = paramf;
      this.yjx.yji = this.mK;
      this.yjs.add(this.yjx.name);
      int j;
      if (i == 0)
      {
        j = 0;
        a(this.out, 67324752L);
        b(this.out, 20);
        b(this.out, j | 0x800);
        b(this.out, i);
        b(this.out, this.yjx.time);
        b(this.out, this.yjx.yjg);
        if (i != 0) {
          break label467;
        }
        a(this.out, this.yjx.yiT);
        a(this.out, this.yjx.size);
        a(this.out, this.yjx.size);
        label386:
        b(this.out, this.yjy.length);
        if (this.yjx.yjh == null) {
          break label497;
        }
        b(this.out, this.yjx.yjh.length);
      }
      for (;;)
      {
        this.out.write(this.yjy);
        if (this.yjx.yjh != null) {
          this.out.write(this.yjx.yjh);
        }
        return;
        j = 8;
        break;
        label467:
        a(this.out, 0L);
        a(this.out, 0L);
        a(this.out, 0L);
        break label386;
        label497:
        b(this.out, 0);
      }
    }
  }
  
  public final void close()
  {
    int i;
    if (this.out != null)
    {
      if (this.out == null) {
        throw new IOException("Stream is closed");
      }
      if (this.yjw != null)
      {
        if (this.yjs.isEmpty()) {
          throw new ZipException("No entries");
        }
        if (this.yjx != null) {
          closeEntry();
        }
        i = this.yjw.size();
        a(this.yjw, 101010256L);
        b(this.yjw, 0);
        b(this.yjw, 0);
        if (!this.yjA) {
          break label209;
        }
        b(this.yjw, 65535);
        b(this.yjw, 65535);
        a(this.yjw, -1L);
        a(this.yjw, -1L);
      }
    }
    for (;;)
    {
      b(this.yjw, this.yju.length);
      if (this.yju.length > 0) {
        this.yjw.write(this.yju);
      }
      this.yjw.writeTo(this.out);
      this.yjw = null;
      this.out.close();
      this.out = null;
      return;
      label209:
      b(this.yjw, this.yjs.size());
      b(this.yjw, this.yjs.size());
      a(this.yjw, i);
      a(this.yjw, this.mK);
    }
  }
  
  public final void closeEntry()
  {
    cqU();
    if (this.yjx == null) {
      return;
    }
    long l = 30L;
    if (this.yjx.yjf != 0)
    {
      l = 46L;
      a(this.out, 134695760L);
      a(this.out, this.yjx.yiT);
      a(this.out, this.yjx.yje);
      a(this.out, this.yjx.size);
    }
    int i;
    if (this.yjx.yjf == 0)
    {
      i = 0;
      a(this.yjw, 33639248L);
      b(this.yjw, 20);
      b(this.yjw, 20);
      b(this.yjw, i | 0x800);
      b(this.yjw, this.yjx.yjf);
      b(this.yjw, this.yjx.time);
      b(this.yjw, this.yjx.yjg);
      a(this.yjw, this.yjx.yiT);
      if (this.yjx.yjf != 8) {
        break label442;
      }
      l += this.yjx.yje;
      label224:
      a(this.yjw, this.yjx.yje);
      a(this.yjw, this.yjx.size);
      l += b(this.yjw, this.yjy.length);
      if (this.yjx.yjh == null) {
        break label455;
      }
      l += b(this.yjw, this.yjx.yjh.length);
    }
    for (;;)
    {
      b(this.yjw, this.yjz.length);
      b(this.yjw, 0);
      b(this.yjw, 0);
      a(this.yjw, 0L);
      a(this.yjw, this.yjx.yji);
      this.yjw.write(this.yjy);
      this.yjy = null;
      if (this.yjx.yjh != null) {
        this.yjw.write(this.yjx.yjh);
      }
      this.mK = (l + this.mK);
      if (this.yjz.length > 0)
      {
        this.yjw.write(this.yjz);
        this.yjz = yjq;
      }
      this.yjx = null;
      return;
      i = 8;
      break;
      label442:
      l += this.yjx.size;
      break label224;
      label455:
      b(this.yjw, 0);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.ae(paramArrayOfByte.length, paramInt1, paramInt2);
    if (this.yjx == null) {
      throw new ZipException("No active entry");
    }
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\d\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */