package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;

public final class e
{
  public String appId;
  public int eAu;
  public final String eDA;
  public int eVc;
  public final com.tencent.mm.plugin.appbrand.e hzF;
  public String iyz;
  public volatile long izb;
  public volatile boolean izc;
  public int izd;
  public int ize;
  public long izf;
  public long izg;
  public int scene;
  
  public e(com.tencent.mm.plugin.appbrand.e parame)
  {
    GMTrace.i(18868462419968L, 140581);
    this.izc = false;
    this.hzF = parame;
    this.eDA = parame.hyF.hzG;
    GMTrace.o(18868462419968L, 140581);
  }
  
  public final String toString()
  {
    GMTrace.i(18868596637696L, 140582);
    String str = "kv_14576{, networkType='" + this.iyz + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.eVc + ", appState=" + this.eAu + ", scene=" + this.scene + ", sessionId='" + this.eDA + '\'' + ", is_download_code=" + this.izd + ", is_load_x5=" + this.ize + ", cost_time=" + this.izf + ", event_time=" + this.izg + '}';
    GMTrace.o(18868596637696L, 140582);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */