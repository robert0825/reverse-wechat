package com.tencent.mm.plugin.hp.d;

import android.os.Environment;
import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import java.io.File;

public final class c
{
  @Deprecated
  public static boolean cC(long paramLong)
  {
    GMTrace.i(15371553734656L, 114527);
    for (;;)
    {
      try
      {
        StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
        paramLong = localStatFs.getAvailableBlocks();
        int i = localStatFs.getBlockSize();
        paramLong *= i;
        long l2;
        long l1 = paramLong;
      }
      catch (Exception localException1)
      {
        try
        {
          l1 = localStatFs.getBlockCount();
          i = localStatFs.getBlockSize();
          l2 = i;
          l2 *= l1;
          l1 = paramLong;
          paramLong = l2;
          if ((paramLong == 0L) || (l1 <= 83886080L)) {
            break;
          }
          GMTrace.o(15371553734656L, 114527);
          return true;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        localException1 = localException1;
        paramLong = 0L;
      }
      paramLong = 0L;
    }
    GMTrace.o(15371553734656L, 114527);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */