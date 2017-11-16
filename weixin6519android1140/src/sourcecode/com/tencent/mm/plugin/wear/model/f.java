package com.tencent.mm.plugin.wear.model;

import com.tencent.gmtrace.GMTrace;

public final class f
{
  public String eDW;
  public String eDs;
  public int id;
  public int rAb;
  a rAc;
  
  public f()
  {
    GMTrace.i(9187203481600L, 68450);
    this.eDs = "";
    this.id = 0;
    this.eDW = "";
    this.rAb = 0;
    GMTrace.o(9187203481600L, 68450);
  }
  
  protected final Object clone()
  {
    GMTrace.i(9187337699328L, 68451);
    f localf = new f();
    localf.id = this.id;
    localf.eDs = this.eDs;
    localf.eDW = this.eDW;
    localf.rAb = this.rAb;
    localf.rAc = this.rAc;
    GMTrace.o(9187337699328L, 68451);
    return localf;
  }
  
  public final String toString()
  {
    GMTrace.i(9187471917056L, 68452);
    String str = "WearNotification [talker=" + this.eDs + ", id=" + this.id + ", md5=" + this.eDW + ", ignoreInWatch=" + this.rAb + ", status=" + this.rAc + "]";
    GMTrace.o(9187471917056L, 68452);
    return str;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(9186800828416L, 68447);
      rAd = new a("INIT", 0);
      rAe = new a("SHOWING", 1);
      rAf = new a("IGNORE", 2);
      rAg = new a("REPLY", 3);
      rAh = new a[] { rAd, rAe, rAf, rAg };
      GMTrace.o(9186800828416L, 68447);
    }
    
    private a()
    {
      GMTrace.i(9186666610688L, 68446);
      GMTrace.o(9186666610688L, 68446);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */