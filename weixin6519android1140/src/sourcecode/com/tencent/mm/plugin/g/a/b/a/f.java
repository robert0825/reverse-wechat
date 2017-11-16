package com.tencent.mm.plugin.g.a.b.a;

import android.annotation.TargetApi;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;
import com.tencent.mm.sdk.platformtools.w;

@TargetApi(18)
public class f
  extends a
{
  static final String TAG;
  public static String jnK;
  public static String jnL;
  public int jnM;
  public int jnN;
  public int jnO;
  public long jnP;
  public long jnQ;
  
  static
  {
    GMTrace.i(4822979837952L, 35934);
    TAG = f.class.getName();
    jnK = h.jmn;
    jnL = h.jmo;
    GMTrace.o(4822979837952L, 35934);
  }
  
  public f()
  {
    GMTrace.i(4822711402496L, 35932);
    this.jmF = null;
    this.jmG = 8;
    this.jlY = 1L;
    this.jnM = -1;
    this.jnN = -1;
    this.jnO = -1;
    this.jnP = 0L;
    this.jnQ = 0L;
    GMTrace.o(4822711402496L, 35932);
  }
  
  public final byte[] ahm()
  {
    GMTrace.i(4822845620224L, 35933);
    if (this.jnM < 0)
    {
      w.e(TAG, "stepCount is invalid");
      GMTrace.o(4822845620224L, 35933);
      return null;
    }
    int i = 4;
    if (this.jnN >= 0) {
      i = 7;
    }
    int j = i;
    if (this.jnO >= 0) {
      j = i + 3;
    }
    byte[] arrayOfByte = new byte[j];
    arrayOfByte[0] = 1;
    i = 1;
    j = 0;
    while (j < 3)
    {
      arrayOfByte[i] = ((byte)(this.jnM >> j * 8 & 0xFF));
      j += 1;
      i += 1;
    }
    j = i;
    if (this.jnN >= 0)
    {
      arrayOfByte[0] = ((byte)(arrayOfByte[0] | 0x2));
      int k = 0;
      for (;;)
      {
        j = i;
        if (k >= 3) {
          break;
        }
        arrayOfByte[i] = ((byte)(this.jnN >> k * 8 & 0xFF));
        k += 1;
        i += 1;
      }
    }
    if (this.jnO >= 0)
    {
      arrayOfByte[0] = 4;
      i = 0;
      while (i < 3)
      {
        arrayOfByte[j] = ((byte)(this.jnO >> i * 8 & 0xFF));
        j += 1;
        i += 1;
      }
    }
    GMTrace.o(4822845620224L, 35933);
    return arrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */