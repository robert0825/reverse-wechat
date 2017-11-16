package com.tencent.mm.loader.stub;

import android.content.Context;
import android.os.Environment;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public class a
{
  public static String ghA;
  public static final String ghu;
  public static final String ghv = ghu + "MicroMsg/";
  public static final String ghw;
  public static String ghx;
  public static String ghy;
  public static String ghz;
  
  static
  {
    GMTrace.i(14008975360000L, 104375);
    Object localObject = ab.getContext();
    if (localObject == null) {
      throw new RuntimeException("MMApplicationContext not initialized.");
    }
    ghu = ((Context)localObject).getFilesDir().getParentFile().getAbsolutePath() + "/";
    try
    {
      localObject = new File(ghv);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      ghw = ghu + "files/public/";
      ghx = Environment.getExternalStorageDirectory().getAbsolutePath();
      ghy = "/tencent/MicroMsg/";
      ghz = ghx + ghy;
      ghA = ghz + "crash/";
      GMTrace.o(14008975360000L, 104375);
      return;
    }
    catch (Error localError)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\loader\stub\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */