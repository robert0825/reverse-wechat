package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.io.InputStream;

public final class e
{
  public static final boolean a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(14019175907328L, 104451);
    int i = 0;
    for (;;)
    {
      if (i >= paramInt)
      {
        GMTrace.o(14019175907328L, 104451);
        return true;
      }
      int j = paramInputStream.read(paramArrayOfByte, i + 0, paramInt - i);
      if (j < 0)
      {
        GMTrace.o(14019175907328L, 104451);
        return false;
      }
      i += j;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */