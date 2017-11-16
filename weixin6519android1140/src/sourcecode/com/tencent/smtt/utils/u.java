package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public final class u
{
  private static File xZx = null;
  
  public static long cpv()
  {
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    long l = localStatFs.getBlockSize();
    return localStatFs.getAvailableBlocks() * l;
  }
  
  @TargetApi(9)
  public static boolean hC(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      return false;
      if (xZx == null) {}
      try
      {
        if (paramContext.getApplicationInfo().processName.contains("com.tencent.mm"))
        {
          paramContext = paramContext.getDir("tbs", 0);
          if ((paramContext != null) && (paramContext.isDirectory()))
          {
            paramContext = new File(paramContext, "share");
            if ((paramContext.isDirectory()) || (paramContext.mkdir()))
            {
              xZx = paramContext;
              paramContext.setExecutable(true, false);
              return true;
            }
          }
        }
      }
      catch (Exception paramContext) {}
    }
    return true;
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */