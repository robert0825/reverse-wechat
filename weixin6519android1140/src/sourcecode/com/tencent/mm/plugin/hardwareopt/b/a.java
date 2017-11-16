package com.tencent.mm.plugin.hardwareopt.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ahg;

public class a
{
  private static volatile a mgM;
  private ahg mgN;
  
  static
  {
    GMTrace.i(18664585691136L, 139062);
    mgM = null;
    GMTrace.o(18664585691136L, 139062);
  }
  
  private a()
  {
    GMTrace.i(18664183037952L, 139059);
    this.mgN = null;
    GMTrace.o(18664183037952L, 139059);
  }
  
  public static a aHg()
  {
    GMTrace.i(18664317255680L, 139060);
    if (mgM == null) {
      try
      {
        if (mgM == null) {
          mgM = new a();
        }
        a locala1 = mgM;
        GMTrace.o(18664317255680L, 139060);
        return locala1;
      }
      finally {}
    }
    a locala2 = mgM;
    GMTrace.o(18664317255680L, 139060);
    return locala2;
  }
  
  public final ahg aHh()
  {
    GMTrace.i(18664451473408L, 139061);
    if (this.mgN == null) {
      this.mgN = new ahg();
    }
    ahg localahg = this.mgN;
    GMTrace.o(18664451473408L, 139061);
    return localahg;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hardwareopt\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */