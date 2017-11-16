package com.tencent.mm.plugin.ext.c;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  static enum a
  {
    static
    {
      GMTrace.i(20568598380544L, 153248);
      kNH = new a("PREFIX", 0);
      kNI = new a("SUBDOMAIN", 1);
      kNJ = new a("DOMAIN", 2);
      kNK = new a[] { kNH, kNI, kNJ };
      GMTrace.o(20568598380544L, 153248);
    }
    
    private a()
    {
      GMTrace.i(20568464162816L, 153247);
      GMTrace.o(20568464162816L, 153247);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(20565377155072L, 153224);
      kNL = new b("BLACK", 0);
      kNM = new b("WHITE", 1);
      kNN = new b("NONE", 2);
      kNO = new b[] { kNL, kNM, kNN };
      GMTrace.o(20565377155072L, 153224);
    }
    
    private b()
    {
      GMTrace.i(20565242937344L, 153223);
      GMTrace.o(20565242937344L, 153223);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */