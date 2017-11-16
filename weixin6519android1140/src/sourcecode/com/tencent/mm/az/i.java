package com.tencent.mm.az;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.a;
import java.io.File;
import java.util.Properties;

public final class i
{
  private static int gRd;
  
  static
  {
    GMTrace.i(20383914786816L, 151872);
    gRd = 1;
    GMTrace.o(20383914786816L, 151872);
  }
  
  public static int GL()
  {
    GMTrace.i(20383243698176L, 151867);
    if (gRd <= 1) {
      Ks();
    }
    int i = gRd;
    GMTrace.o(20383243698176L, 151867);
    return i;
  }
  
  public static String Ko()
  {
    GMTrace.i(20383512133632L, 151869);
    Object localObject = new File(a.ghw.replace("/data/user/0", "/data/data"), "fts/res");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = ((File)localObject).getAbsolutePath();
    GMTrace.o(20383512133632L, 151869);
    return (String)localObject;
  }
  
  public static String Kp()
  {
    GMTrace.i(20383646351360L, 151870);
    GMTrace.o(20383646351360L, 151870);
    return "fts_template.zip";
  }
  
  public static String Kq()
  {
    GMTrace.i(20383780569088L, 151871);
    String str = new File(Ko(), "fts_template.zip").getAbsolutePath();
    GMTrace.o(20383780569088L, 151871);
    return str;
  }
  
  public static boolean Kr()
  {
    GMTrace.i(20383109480448L, 151866);
    if (GL() > 1)
    {
      GMTrace.o(20383109480448L, 151866);
      return true;
    }
    GMTrace.o(20383109480448L, 151866);
    return false;
  }
  
  public static int Ks()
  {
    GMTrace.i(20383377915904L, 151868);
    int i = Integer.valueOf(e.n(new File(Ko(), "config.conf")).getProperty("version", "1")).intValue();
    gRd = i;
    GMTrace.o(20383377915904L, 151868);
    return i;
  }
  
  public static String RQ()
  {
    GMTrace.i(21069230505984L, 156978);
    GMTrace.o(21069230505984L, 156978);
    return "config.conf";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\az\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */