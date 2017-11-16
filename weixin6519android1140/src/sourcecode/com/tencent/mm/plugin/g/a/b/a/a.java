package com.tencent.mm.plugin.g.a.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Serializable;

public abstract class a
  implements Serializable
{
  private static final String TAG;
  public long jlY;
  public String jmF;
  public int jmG;
  
  static
  {
    GMTrace.i(4823516708864L, 35938);
    TAG = a.class.getName();
    GMTrace.o(4823516708864L, 35938);
  }
  
  public a()
  {
    GMTrace.i(4823114055680L, 35935);
    GMTrace.o(4823114055680L, 35935);
  }
  
  public static a aa(byte[] paramArrayOfByte)
  {
    GMTrace.i(4823248273408L, 35936);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      w.e(TAG, "data input error");
      GMTrace.o(4823248273408L, 35936);
      return null;
    }
    paramArrayOfByte = b.ao(paramArrayOfByte);
    if ((paramArrayOfByte != null) && ((paramArrayOfByte instanceof a)))
    {
      paramArrayOfByte = (a)paramArrayOfByte;
      GMTrace.o(4823248273408L, 35936);
      return paramArrayOfByte;
    }
    w.e(TAG, "bytes2object is not instanceof BaseProfileParser");
    GMTrace.o(4823248273408L, 35936);
    return null;
  }
  
  public abstract byte[] ahm();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\g\a\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */