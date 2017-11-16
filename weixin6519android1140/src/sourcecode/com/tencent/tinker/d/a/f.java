package com.tencent.tinker.d.a;

import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.ZipException;

public final class f
  implements Cloneable
{
  public String name;
  long size = -1L;
  int time = -1;
  String uPE;
  long yiT = -1L;
  long yje = -1L;
  int yjf = -1;
  int yjg = -1;
  byte[] yjh;
  long yji = -1L;
  long yjj = -1L;
  
  public f(f paramf)
  {
    this.name = paramf.name;
    this.uPE = paramf.uPE;
    this.time = paramf.time;
    this.size = paramf.size;
    this.yje = paramf.yje;
    this.yiT = paramf.yiT;
    this.yjf = paramf.yjf;
    this.yjg = paramf.yjg;
    this.yjh = paramf.yjh;
    this.yji = paramf.yji;
    this.yjj = paramf.yjj;
  }
  
  public f(f paramf, String paramString)
  {
    this.name = paramString;
    this.uPE = paramf.uPE;
    this.time = paramf.time;
    this.size = paramf.size;
    this.yje = paramf.yje;
    this.yiT = paramf.yiT;
    this.yjf = paramf.yjf;
    this.yjg = paramf.yjg;
    this.yjh = paramf.yjh;
    this.yji = paramf.yji;
    this.yjj = paramf.yjj;
  }
  
  public f(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("name == null");
    }
    byte[] arrayOfByte = paramString.getBytes(Charset.forName("UTF-8"));
    if (arrayOfByte.length > 65535) {
      throw new IllegalArgumentException("Name" + " too long: " + arrayOfByte.length);
    }
    this.name = paramString;
  }
  
  f(byte[] paramArrayOfByte, InputStream paramInputStream, Charset paramCharset)
  {
    e.b(paramInputStream, paramArrayOfByte, 0, 46);
    paramArrayOfByte = c.a(paramArrayOfByte, 46, ByteOrder.LITTLE_ENDIAN);
    int i = paramArrayOfByte.readInt();
    if (i != 33639248L) {
      g.a("unknown", paramInputStream.available(), "unknown", 0L, "Central Directory Entry", i);
    }
    paramArrayOfByte.seek(8);
    i = paramArrayOfByte.readShort() & 0xFFFF;
    if ((i & 0x1) != 0) {
      throw new ZipException("Invalid General Purpose Bit Flag: " + i);
    }
    if ((i & 0x800) != 0) {
      paramCharset = Charset.forName("UTF-8");
    }
    this.yjf = (paramArrayOfByte.readShort() & 0xFFFF);
    this.time = (paramArrayOfByte.readShort() & 0xFFFF);
    this.yjg = (paramArrayOfByte.readShort() & 0xFFFF);
    this.yiT = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    this.yje = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    this.size = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    i = paramArrayOfByte.readShort();
    int j = paramArrayOfByte.readShort() & 0xFFFF;
    int k = paramArrayOfByte.readShort() & 0xFFFF;
    paramArrayOfByte.seek(42);
    this.yji = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    paramArrayOfByte = new byte[i & 0xFFFF];
    e.b(paramInputStream, paramArrayOfByte, 0, paramArrayOfByte.length);
    if (bL(paramArrayOfByte)) {
      throw new ZipException("Filename contains NUL byte: " + Arrays.toString(paramArrayOfByte));
    }
    this.name = new String(paramArrayOfByte, 0, paramArrayOfByte.length, paramCharset);
    if (j > 0)
    {
      this.yjh = new byte[j];
      e.b(paramInputStream, this.yjh, 0, j);
    }
    if (k > 0)
    {
      paramArrayOfByte = new byte[k];
      e.b(paramInputStream, paramArrayOfByte, 0, k);
      this.uPE = new String(paramArrayOfByte, 0, paramArrayOfByte.length, paramCharset);
    }
  }
  
  private static boolean bL(byte[] paramArrayOfByte)
  {
    boolean bool2 = false;
    int j = paramArrayOfByte.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramArrayOfByte[i] == 0) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  /* Error */
  public final Object clone()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 172	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	com/tencent/tinker/d/a/f
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 50	com/tencent/tinker/d/a/f:yjh	[B
    //   12: ifnull +21 -> 33
    //   15: aload_0
    //   16: getfield 50	com/tencent/tinker/d/a/f:yjh	[B
    //   19: invokevirtual 174	[B:clone	()Ljava/lang/Object;
    //   22: checkcast 173	[B
    //   25: astore_1
    //   26: aload_2
    //   27: aload_1
    //   28: putfield 50	com/tencent/tinker/d/a/f:yjh	[B
    //   31: aload_2
    //   32: areturn
    //   33: aconst_null
    //   34: astore_1
    //   35: goto -9 -> 26
    //   38: astore_1
    //   39: new 176	java/lang/AssertionError
    //   42: dup
    //   43: aload_1
    //   44: invokespecial 179	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	f
    //   25	10	1	arrayOfByte	byte[]
    //   38	6	1	localCloneNotSupportedException	CloneNotSupportedException
    //   7	25	2	localf	f
    // Exception table:
    //   from	to	target	type
    //   0	26	38	java/lang/CloneNotSupportedException
    //   26	31	38	java/lang/CloneNotSupportedException
  }
  
  public final int hashCode()
  {
    return this.name.hashCode();
  }
  
  public final void setMethod(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 8)) {
      throw new IllegalArgumentException("Bad method: " + paramInt);
    }
    this.yjf = paramInt;
  }
  
  public final void setSize(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("Bad size: " + paramLong);
    }
    this.size = paramLong;
  }
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("name:" + this.name);
    localStringBuffer.append("\ncomment:" + this.uPE);
    localStringBuffer.append("\ntime:" + this.time);
    localStringBuffer.append("\nsize:" + this.size);
    localStringBuffer.append("\ncompressedSize:" + this.yje);
    localStringBuffer.append("\ncrc:" + this.yiT);
    localStringBuffer.append("\ncompressionMethod:" + this.yjf);
    localStringBuffer.append("\nmodDate:" + this.yjg);
    localStringBuffer.append("\nextra length:" + this.yjh.length);
    localStringBuffer.append("\nlocalHeaderRelOffset:" + this.yji);
    localStringBuffer.append("\ndataOffset:" + this.yjj);
    return localStringBuffer.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\d\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */