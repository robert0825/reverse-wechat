package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.a;
import java.io.File;
import java.util.Properties;

public final class c
{
  private static int gRd;
  
  static
  {
    GMTrace.i(20382975262720L, 151865);
    gRd = 1;
    GMTrace.o(20382975262720L, 151865);
  }
  
  public static int GL()
  {
    GMTrace.i(20382572609536L, 151862);
    if (gRd <= 1) {
      Ks();
    }
    int i = gRd;
    GMTrace.o(20382572609536L, 151862);
    return i;
  }
  
  public static String Ko()
  {
    GMTrace.i(20382035738624L, 151858);
    Object localObject = new File(a.ghw.replace("/data/user/0", "/data/data"), "fts_browse/res");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = ((File)localObject).getAbsolutePath();
    GMTrace.o(20382035738624L, 151858);
    return (String)localObject;
  }
  
  public static String Kp()
  {
    GMTrace.i(20382169956352L, 151859);
    GMTrace.o(20382169956352L, 151859);
    return "browse/wrd_template.zip";
  }
  
  public static String Kq()
  {
    GMTrace.i(20382304174080L, 151860);
    String str = new File(Ko(), "wrd_template.zip").getAbsolutePath();
    GMTrace.o(20382304174080L, 151860);
    return str;
  }
  
  public static boolean Kr()
  {
    GMTrace.i(20382438391808L, 151861);
    if (GL() > 1)
    {
      GMTrace.o(20382438391808L, 151861);
      return true;
    }
    GMTrace.o(20382438391808L, 151861);
    return false;
  }
  
  public static int Ks()
  {
    GMTrace.i(20382706827264L, 151863);
    int i = Integer.valueOf(e.n(new File(Ko(), "config.conf")).getProperty("version", "1")).intValue();
    gRd = i;
    GMTrace.o(20382706827264L, 151863);
    return i;
  }
  
  public static boolean Kt()
  {
    GMTrace.i(20382841044992L, 151864);
    File localFile2 = new File(Ko());
    if ((!localFile2.exists()) || (!localFile2.isDirectory()))
    {
      GMTrace.o(20382841044992L, 151864);
      return false;
    }
    File localFile1 = new File(localFile2, "app.html");
    localFile2 = new File(localFile2, "config.conf");
    if ((localFile1.exists()) && (localFile2.exists()))
    {
      GMTrace.o(20382841044992L, 151864);
      return true;
    }
    GMTrace.o(20382841044992L, 151864);
    return false;
  }
  
  public static String RQ()
  {
    GMTrace.i(21069096288256L, 156977);
    GMTrace.o(21069096288256L, 156977);
    return "browse/config.conf";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */