package com.tencent.mm.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.StatFs;
import android.preference.PreferenceManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class a
{
  public static int iGk;
  public static final long[] ldL;
  public static final long[] ldM;
  
  static
  {
    GMTrace.i(21068022546432L, 156969);
    iGk = -1;
    ldL = new long[] { 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L };
    ldM = new long[] { 104857600L, 314572800L, 524288000L, 1073741824L, 1073741824L };
    GMTrace.o(21068022546432L, 156969);
  }
  
  public static void i(Context paramContext, long paramLong)
  {
    GMTrace.i(21067888328704L, 156968);
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("db_check_tip_time", paramLong).commit();
    GMTrace.o(21067888328704L, 156968);
  }
  
  public static int vp()
  {
    GMTrace.i(1369557696512L, 10204);
    l2 = 0L;
    l1 = l2;
    try
    {
      StatFs localStatFs = new StatFs(h.getDataDirectory().getPath());
      l1 = l2;
      l3 = localStatFs.getAvailableBlocks();
      l1 = l2;
      l2 = localStatFs.getBlockSize() * l3;
      l1 = l2;
      l3 = localStatFs.getBlockCount() * localStatFs.getBlockSize();
      l1 = l2;
      long l4 = localStatFs.getFreeBlocks();
      l1 = l2;
      i = localStatFs.getBlockSize();
      l1 = i;
      d = l2 / l3;
      l4 *= l1;
      l1 = l3;
      l3 = l2;
      l2 = l4;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.DbChecker", "get db spare space error");
        double d = 0.0D;
        l2 = 0L;
        long l3 = l1;
        l1 = 0L;
        continue;
        if (iGk < 0)
        {
          iGk = ldL.length - 1;
          i = 0;
        }
        for (;;)
        {
          if (i < ldL.length)
          {
            if (l1 < ldL[i]) {
              iGk = i;
            }
          }
          else
          {
            if (l3 >= ldM[iGk]) {
              break label293;
            }
            i = 1;
            break;
          }
          i += 1;
        }
        int i = 0;
      }
    }
    if (l1 > 0L) {
      if (l3 < 52428800L)
      {
        i = 2;
        w.i("MicroMsg.DbChecker", "checkRomSparespace[%d] available:%d all:%d freeSize :%d availPercent %f mobileSizeIndex %d", new Object[] { Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l1), Long.valueOf(l2), Double.valueOf(d), Integer.valueOf(iGk) });
        GMTrace.o(1369557696512L, 10204);
        return i;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\o\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */