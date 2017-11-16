package com.tencent.xweb.util;

import org.xwalk.core.Log;

public class BSpatch
{
  static
  {
    System.loadLibrary("bspatch_utils");
  }
  
  public static int ao(String paramString1, String paramString2, String paramString3)
  {
    Log.i("BSpatch", "doPatch oldFile:" + paramString1 + ",patchFile:" + paramString2 + ",newFile:" + paramString3);
    long l = System.currentTimeMillis();
    e.cst();
    int i = 0;
    String str = paramString3;
    if (paramString1.equals(paramString3))
    {
      str = paramString1 + ".temp";
      i = 1;
    }
    int j = new BSpatch().nativeDoPatch(paramString1, paramString2, str);
    if (j < 0)
    {
      Log.i("BSpatch", "doPatch failed");
      e.csu();
    }
    for (;;)
    {
      return j;
      Log.i("BSpatch", "doPatch successful");
      if (i != 0)
      {
        if (!a.eR(str, paramString1))
        {
          Log.e("BSpatch", "doPatch same path, copy failed");
          return -1;
        }
        a.deleteFile(str);
      }
      e.fD(System.currentTimeMillis() - l);
    }
  }
  
  public native int nativeDoPatch(String paramString1, String paramString2, String paramString3);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\util\BSpatch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */