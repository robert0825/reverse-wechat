package com.tencent.mm.plugin.g.a.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;
import com.tencent.mm.sdk.platformtools.w;

public class b
  extends a
{
  public static final String TAG;
  public static String jmH;
  public static String jmI;
  public static String jmJ;
  private final int jmK;
  private final int jmL;
  private final int jmM;
  private final int jmN;
  private final int jmO;
  b jmP;
  a jmQ;
  int jmR;
  
  static
  {
    GMTrace.i(4821906096128L, 35926);
    TAG = b.class.getName();
    jmH = h.jmB;
    jmI = h.jmC;
    jmJ = h.jmD;
    GMTrace.o(4821906096128L, 35926);
  }
  
  public b()
  {
    GMTrace.i(4821369225216L, 35922);
    this.jmK = 1;
    this.jmL = 2;
    this.jmM = 4;
    this.jmN = 8;
    this.jmO = 16;
    this.jmF = null;
    this.jmG = 2;
    this.jlY = 8L;
    this.jmP = null;
    GMTrace.o(4821369225216L, 35922);
  }
  
  static double s(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(4821503442944L, 35923);
    int i = paramArrayOfByte[(paramInt + 1)] << 8 & 0xFF00;
    int j = (i >> 12) - 16;
    int k = i & 0xF00;
    paramInt = (paramArrayOfByte[paramInt] & 0xFF) + (0xFF00 & k);
    double d1 = paramInt;
    double d2 = Math.pow(10.0D, j);
    w.d(TAG, "hbyte=" + i + " hvalue=" + k + " value=" + paramInt + " exp=" + j);
    GMTrace.o(4821503442944L, 35923);
    return d1 * d2;
  }
  
  public final byte[] ahm()
  {
    GMTrace.i(4821637660672L, 35924);
    GMTrace.o(4821637660672L, 35924);
    return null;
  }
  
  private final class a
  {
    public boolean jmS;
    public double jmT;
    public int jmU;
    public int jmV;
    public int jmW;
    public b.c jmX;
    
    public a()
    {
      GMTrace.i(4822577184768L, 35931);
      this.jmS = false;
      this.jmT = 0.0D;
      this.jmU = 0;
      this.jmV = 0;
      this.jmW = 0;
      this.jmX = new b.c();
      GMTrace.o(4822577184768L, 35931);
    }
  }
  
  private final class b
  {
    public boolean jmS;
    public int jmU;
    public int jmV;
    public int jmW;
    public b.c jmX;
    public double jmZ;
    public double jna;
    public double jnb;
    
    public b()
    {
      GMTrace.i(4822442967040L, 35930);
      this.jmS = false;
      this.jmZ = 0.0D;
      this.jna = 0.0D;
      this.jnb = 0.0D;
      this.jmU = 0;
      this.jmV = 0;
      this.jmW = 0;
      this.jmX = new b.c();
      GMTrace.o(4822442967040L, 35930);
    }
  }
  
  public static final class c
  {
    public int jnc;
    public int jnd;
    public int jne;
    public int jnf;
    public int jng;
    public int jnh;
    
    public c()
    {
      GMTrace.i(4823650926592L, 35939);
      this.jnc = 0;
      this.jnd = 0;
      this.jne = 0;
      this.jnf = 0;
      this.jng = 0;
      this.jnh = 0;
      GMTrace.o(4823650926592L, 35939);
    }
    
    public final boolean t(byte[] paramArrayOfByte, int paramInt)
    {
      GMTrace.i(4823785144320L, 35940);
      String str = b.TAG;
      if (paramArrayOfByte == null) {}
      for (int i = 0;; i = paramArrayOfByte.length)
      {
        w.d(str, "data size = %d, offset = %d, lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(7) });
        if ((paramArrayOfByte != null) && (paramInt >= 0) && (paramArrayOfByte.length >= paramInt + 7)) {
          break;
        }
        w.e(b.TAG, "data input error");
        GMTrace.o(4823785144320L, 35940);
        return false;
      }
      this.jnc = ((paramArrayOfByte[paramInt] & 0xFF) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8));
      this.jnd = (paramArrayOfByte[(paramInt + 2)] & 0xFF);
      this.jne = (paramArrayOfByte[(paramInt + 3)] & 0xFF);
      this.jnf = (paramArrayOfByte[(paramInt + 4)] & 0xFF);
      this.jng = (paramArrayOfByte[(paramInt + 5)] & 0xFF);
      this.jnh = (paramArrayOfByte[(paramInt + 6)] & 0xFF);
      w.d(b.TAG, "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", new Object[] { Integer.valueOf(this.jnc), Integer.valueOf(this.jnd), Integer.valueOf(this.jne), Integer.valueOf(this.jnf), Integer.valueOf(this.jng), Integer.valueOf(this.jnh) });
      GMTrace.o(4823785144320L, 35940);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */