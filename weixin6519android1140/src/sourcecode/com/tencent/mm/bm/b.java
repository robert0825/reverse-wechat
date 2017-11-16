package com.tencent.mm.bm;

import com.tencent.gmtrace.GMTrace;
import java.io.UnsupportedEncodingException;

public final class b
{
  public byte[] tJp;
  
  private b()
  {
    GMTrace.i(14027363188736L, 104512);
    GMTrace.o(14027363188736L, 104512);
  }
  
  public b(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0, paramArrayOfByte.length);
    GMTrace.i(14027497406464L, 104513);
    GMTrace.o(14027497406464L, 104513);
  }
  
  public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(14027631624192L, 104514);
    this.tJp = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.tJp, 0, paramInt2);
    GMTrace.o(14027631624192L, 104514);
  }
  
  public static b Qb(String paramString)
  {
    GMTrace.i(14028034277376L, 104517);
    try
    {
      b localb = new b();
      localb.tJp = paramString.getBytes("UTF-8");
      GMTrace.o(14028034277376L, 104517);
      return localb;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported?", paramString);
    }
  }
  
  public static b aX(byte[] paramArrayOfByte)
  {
    GMTrace.i(14027900059648L, 104516);
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      paramArrayOfByte = new b(paramArrayOfByte);
      GMTrace.o(14027900059648L, 104516);
      return paramArrayOfByte;
      paramArrayOfByte = new byte[0];
    }
  }
  
  public static b h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(14027765841920L, 104515);
    paramArrayOfByte = new b(paramArrayOfByte, paramInt1, paramInt2);
    GMTrace.o(14027765841920L, 104515);
    return paramArrayOfByte;
  }
  
  /* Error */
  public final String bNS()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc2_w 79
    //   5: ldc 81
    //   7: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: iload_1
    //   11: aload_0
    //   12: getfield 35	com/tencent/mm/bm/b:tJp	[B
    //   15: arraylength
    //   16: if_icmplt +29 -> 45
    //   19: new 53	java/lang/String
    //   22: dup
    //   23: aload_0
    //   24: getfield 35	com/tencent/mm/bm/b:tJp	[B
    //   27: iconst_0
    //   28: iload_1
    //   29: ldc 51
    //   31: invokespecial 84	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   34: astore_3
    //   35: ldc2_w 79
    //   38: ldc 81
    //   40: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   43: aload_3
    //   44: areturn
    //   45: aload_0
    //   46: getfield 35	com/tencent/mm/bm/b:tJp	[B
    //   49: iload_1
    //   50: baload
    //   51: istore_2
    //   52: iload_2
    //   53: ifeq -34 -> 19
    //   56: iload_1
    //   57: iconst_1
    //   58: iadd
    //   59: istore_1
    //   60: goto -50 -> 10
    //   63: astore_3
    //   64: new 59	java/lang/RuntimeException
    //   67: dup
    //   68: ldc 61
    //   70: invokespecial 87	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	b
    //   1	59	1	i	int
    //   51	2	2	j	int
    //   34	10	3	str	String
    //   63	1	3	localUnsupportedEncodingException	UnsupportedEncodingException
    // Exception table:
    //   from	to	target	type
    //   10	19	63	java/io/UnsupportedEncodingException
    //   19	35	63	java/io/UnsupportedEncodingException
    //   45	52	63	java/io/UnsupportedEncodingException
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(14028302712832L, 104519);
    int i = this.tJp.length;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.tJp, 0, arrayOfByte, 0, i);
    GMTrace.o(14028302712832L, 104519);
    return arrayOfByte;
  }
  
  public final b zL(int paramInt)
  {
    GMTrace.i(14028168495104L, 104518);
    byte[] arrayOfByte = new byte[paramInt];
    if (this.tJp.length >= paramInt) {
      System.arraycopy(this.tJp, 0, arrayOfByte, 0, paramInt - 1);
    }
    for (this.tJp = arrayOfByte;; this.tJp = arrayOfByte)
    {
      GMTrace.o(14028168495104L, 104518);
      return this;
      System.arraycopy(this.tJp, 0, arrayOfByte, 0, this.tJp.length);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bm\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */