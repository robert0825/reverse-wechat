package com.tencent.mm.plugin.sns;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.p;

public class PluginSns
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.plugin.sns.b.b
{
  l oWQ;
  a oWR;
  o oWS;
  com.tencent.mm.plugin.sns.a.a oWT;
  
  public PluginSns()
  {
    GMTrace.i(18566338314240L, 138330);
    this.oWQ = new l();
    this.oWR = new a();
    this.oWS = new o();
    this.oWT = new com.tencent.mm.plugin.sns.a.a();
    GMTrace.o(18566338314240L, 138330);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18566472531968L, 138331);
    h.xz();
    h.a(i.class, this.oWQ);
    h.xz();
    h.a(com.tencent.mm.plugin.sns.b.c.class, this.oWT);
    com.tencent.mm.plugin.sns.a.a locala = this.oWT;
    locala.a(new com.tencent.mm.plugin.sns.a.a.e());
    locala.a(new com.tencent.mm.plugin.sns.a.a.d());
    locala.a(new com.tencent.mm.plugin.sns.a.a.b());
    locala.a(new com.tencent.mm.plugin.sns.a.a.c());
    if (parame.eR(""))
    {
      w.i("MicroMsg.PluginSns", "PluginSns configure");
      pin(new p(ae.class));
      h.xz();
      h.a(com.tencent.mm.plugin.sns.b.a.class, this.oWR);
      h.xz();
      h.a(m.class, this.oWS);
    }
    GMTrace.o(18566472531968L, 138331);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(18566606749696L, 138332);
    com.tencent.mm.bj.c.PU("sns");
    GMTrace.o(18566606749696L, 138332);
  }
  
  public String getAccSnsPath()
  {
    GMTrace.i(18566740967424L, 138333);
    String str = h.xy().fYU + "sns/";
    GMTrace.o(18566740967424L, 138333);
    return str;
  }
  
  public String getAccSnsTmpPath()
  {
    GMTrace.i(18566875185152L, 138334);
    String str = h.xy().fYU + "sns/temp/";
    GMTrace.o(18566875185152L, 138334);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\PluginSns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */