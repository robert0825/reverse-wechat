package com.tencent.mm.plugin.g.a.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;

public class e
  extends a
{
  static final String TAG;
  public static final String jnA;
  public static final String jnx;
  public static final String jny;
  public static final String jnz;
  public byte jnB;
  public byte jnC;
  public byte jnD;
  public byte jnE;
  public byte[] jnF;
  public int jnG;
  public byte jnH;
  public byte jnI;
  public byte[] jnJ;
  
  static
  {
    GMTrace.i(4822308749312L, 35929);
    TAG = e.class.getName();
    jnx = h.jmp;
    jny = h.jmq;
    jnz = h.jmr;
    jnA = h.jms;
    GMTrace.o(4822308749312L, 35929);
  }
  
  public e()
  {
    GMTrace.i(4822040313856L, 35927);
    this.jmF = null;
    this.jmG = 8;
    this.jlY = 16L;
    this.jnB = 0;
    this.jnC = 0;
    this.jnD = 0;
    this.jnE = 0;
    this.jnF = new byte[] { 0, 0 };
    this.jnG = -1;
    this.jnH = 0;
    this.jnI = 0;
    this.jnJ = null;
    GMTrace.o(4822040313856L, 35927);
  }
  
  public final byte[] ahm()
  {
    GMTrace.i(4822174531584L, 35928);
    byte[] arrayOfByte;
    if (this.jmF.equalsIgnoreCase(jnx))
    {
      arrayOfByte = new byte[3];
      System.arraycopy(Byte.valueOf(this.jnB), 0, arrayOfByte, 0, 1);
      System.arraycopy(Byte.valueOf(this.jnC), 0, arrayOfByte, 1, 1);
      System.arraycopy(Byte.valueOf(this.jnD), 0, arrayOfByte, 2, 1);
      GMTrace.o(4822174531584L, 35928);
      return arrayOfByte;
    }
    if (this.jmF.equalsIgnoreCase(jny))
    {
      arrayOfByte = new byte[1];
      System.arraycopy(Byte.valueOf(this.jnE), 0, arrayOfByte, 0, 1);
      GMTrace.o(4822174531584L, 35928);
      return arrayOfByte;
    }
    if (this.jmF.equalsIgnoreCase(jnA))
    {
      arrayOfByte = new byte[this.jnG];
      byte b1 = (byte)(this.jnG & 0xFF);
      byte b2 = (byte)(this.jnG >> 8 & 0xFF);
      System.arraycopy(Byte.valueOf(b1), 0, arrayOfByte, 0, 1);
      System.arraycopy(Byte.valueOf(b2), 0, arrayOfByte, 1, 1);
      System.arraycopy(Byte.valueOf(this.jnH), 0, arrayOfByte, 2, 1);
      if (this.jnG > 3) {
        System.arraycopy(this.jnJ, 0, arrayOfByte, 3, this.jnG - 3);
      }
      GMTrace.o(4822174531584L, 35928);
      return arrayOfByte;
    }
    GMTrace.o(4822174531584L, 35928);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */