package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class TbsLinuxToolsJni
{
  private static boolean xVU = false;
  private static boolean xVV = false;
  
  public TbsLinuxToolsJni(Context paramContext)
  {
    for (;;)
    {
      try
      {
        if (xVV) {
          return;
        }
        xVV = true;
      }
      finally {}
      try
      {
        if (!t.gU(paramContext)) {
          break label162;
        }
        localFile1 = new File(t.coJ());
        if (localFile1 != null)
        {
          File localFile2 = localFile1;
          if (!new File(localFile1.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so").exists())
          {
            localFile2 = localFile1;
            if (!t.gU(paramContext))
            {
              p.cov();
              localFile2 = p.gJ(paramContext);
            }
          }
          if (localFile2 != null)
          {
            System.load(localFile2.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
            xVU = true;
          }
        }
        ChmodInner("/checkChmodeExists", "700");
      }
      catch (Throwable paramContext)
      {
        xVU = false;
        continue;
      }
      return;
      label162:
      p.cov();
      File localFile1 = p.gK(paramContext);
    }
  }
  
  private native int ChmodInner(String paramString1, String paramString2);
  
  public final int fz(String paramString1, String paramString2)
  {
    if (!xVU)
    {
      TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
      return -1;
    }
    return ChmodInner(paramString1, paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\TbsLinuxToolsJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */