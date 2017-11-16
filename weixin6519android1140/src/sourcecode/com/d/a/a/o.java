package com.d.a.a;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class o
{
  private static String aGw;
  private static final SimpleDateFormat aGx = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss", Locale.US);
  private static final SimpleDateFormat aGy = new SimpleDateFormat("yyyMMddHHmmss", Locale.US);
  
  protected static boolean l(String paramString1, String paramString2)
  {
    String str = null;
    if (aGw == null)
    {
      boolean bool1;
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        File localFile = new File(Environment.getExternalStorageDirectory() + "/" + y.aJP);
        boolean bool2 = localFile.exists();
        bool1 = bool2;
        if (!bool2) {
          bool1 = localFile.mkdir();
        }
        if (bool1) {
          str = localFile.toString();
        }
        aGw = str;
      }
      while (!bool1)
      {
        return false;
        aGw = null;
        bool1 = false;
      }
    }
    try
    {
      paramString1 = new FileWriter(aGw + "/" + paramString1 + ".txt", true);
      paramString1.write("\n" + aGx.format(new Date()) + ',' + paramString2);
      paramString1.flush();
      paramString1.close();
      return true;
    }
    catch (Exception paramString1) {}
    return false;
  }
  
  protected static String nM()
  {
    return aGy.format(new Date());
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */