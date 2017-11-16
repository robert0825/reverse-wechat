package com.tencent.smtt.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.o;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;

public class m
{
  private static m xVy;
  private boolean xVx;
  
  public static m cot()
  {
    if (xVy == null) {}
    try
    {
      if (xVy == null) {
        xVy = new m();
      }
      return xVy;
    }
    finally {}
  }
  
  /* Error */
  public final boolean bz(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 22	java/io/File
    //   5: dup
    //   6: aload_1
    //   7: invokevirtual 28	android/content/Context:getFilesDir	()Ljava/io/File;
    //   10: aload_2
    //   11: invokespecial 31	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   14: astore_1
    //   15: aload_1
    //   16: invokevirtual 35	java/io/File:exists	()Z
    //   19: ifeq +18 -> 37
    //   22: aload_1
    //   23: invokevirtual 38	java/io/File:isFile	()Z
    //   26: istore_3
    //   27: iload_3
    //   28: ifeq +9 -> 37
    //   31: iconst_1
    //   32: istore_3
    //   33: aload_0
    //   34: monitorexit
    //   35: iload_3
    //   36: ireturn
    //   37: iconst_0
    //   38: istore_3
    //   39: goto -6 -> 33
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	m
    //   0	47	1	paramContext	Context
    //   0	47	2	paramString	String
    //   26	13	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	27	42	finally
  }
  
  public final void gr(Context paramContext)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.xVx;
        if (bool) {
          return;
        }
        if (!bz(paramContext, "bugly_switch.txt"))
        {
          TbsLog.i("TbsExtensionFunMana", "bugly is forbiden!!");
          continue;
        }
        if (!t.gU(paramContext)) {}
      }
      finally {}
      for (Object localObject1 = t.coJ();; localObject1 = ((File)localObject1).getAbsolutePath())
      {
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          break label130;
        }
        TbsLog.i("TbsExtensionFunMana", "bugly init ,corePath is null");
        break;
        p.cov();
        localObject1 = p.gK(paramContext);
        if (localObject1 == null) {
          TbsLog.i("TbsExtensionFunMana", "getTbsCoreShareDir is null");
        }
        if ((((File)localObject1).listFiles() == null) || (((File)localObject1).listFiles().length <= 0))
        {
          TbsLog.i("TbsExtensionFunMana", "getTbsCoreShareDir is empty!");
          break;
        }
      }
      label130:
      p.cov();
      Object localObject2 = p.gK(paramContext);
      if (localObject2 == null)
      {
        TbsLog.i("TbsExtensionFunMana", "bugly init ,optDir is null");
      }
      else
      {
        File localFile = new File((String)localObject1, "tbs_bugly_dex.jar");
        try
        {
          localObject2 = new DexClassLoader(localFile.getAbsolutePath(), ((File)localObject2).getAbsolutePath(), localFile.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.smtt.tbs.bugly.TBSBuglyManager");
          int i = WebView.getTbsSDKVersion(paramContext);
          int j = WebView.getTbsCoreVersion(paramContext);
          o.a((Class)localObject2, "initBugly", new Class[] { Context.class, String.class, String.class, String.class }, new Object[] { paramContext, localObject1, String.valueOf(i), String.valueOf(j) });
          this.xVx = true;
          TbsLog.i("TbsExtensionFunMana", "initTbsBuglyIfNeed success!");
        }
        catch (Throwable paramContext)
        {
          TbsLog.i("TbsExtensionFunMana", "bugly init ,try init bugly failed(need new core):" + Log.getStackTraceString(paramContext));
        }
      }
    }
  }
  
  public final boolean n(Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    if (paramContext == null) {
      paramBoolean = bool;
    }
    for (;;)
    {
      return paramBoolean;
      try
      {
        paramContext = new File(paramContext.getFilesDir(), paramString);
        if (paramBoolean)
        {
          paramBoolean = paramContext.exists();
          if (paramBoolean) {
            break label135;
          }
          try
          {
            paramBoolean = paramContext.createNewFile();
            if (!paramBoolean) {
              break label135;
            }
            paramBoolean = true;
          }
          catch (IOException paramContext)
          {
            TbsLog.e("TbsExtensionFunMana", "setFunctionEnable,createNewFile fail:" + paramString);
            paramBoolean = bool;
          }
          continue;
        }
      }
      finally {}
      if (paramContext.exists())
      {
        if (paramContext.delete())
        {
          paramBoolean = true;
        }
        else
        {
          TbsLog.e("TbsExtensionFunMana", "setFunctionEnable,file.delete fail:" + paramString);
          paramBoolean = bool;
        }
      }
      else {
        label135:
        paramBoolean = true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */