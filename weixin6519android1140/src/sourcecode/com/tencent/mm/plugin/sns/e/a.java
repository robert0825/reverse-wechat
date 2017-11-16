package com.tencent.mm.plugin.sns.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  implements b.b
{
  public c ppA;
  
  public a()
  {
    GMTrace.i(8861993926656L, 66027);
    this.ppA = new c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.ppA);
    ae.biY().a(this);
    GMTrace.o(8861993926656L, 66027);
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8862128144384L, 66028);
    w.i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "onThumbFinish mediaId=%s", new Object[] { paramString });
    pp localpp = new pp();
    localpp.eUr.eCx = 2;
    localpp.eUr.mediaId = paramString;
    String str = am.dE(ae.getAccSnsPath(), paramString);
    localpp.eUr.path = (str + i.GM(paramString));
    com.tencent.mm.sdk.b.a.vgX.m(localpp);
    GMTrace.o(8862128144384L, 66028);
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8862262362112L, 66029);
    GMTrace.o(8862262362112L, 66029);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8862530797568L, 66031);
    GMTrace.o(8862530797568L, 66031);
  }
  
  public final void bhV()
  {
    GMTrace.i(8862396579840L, 66030);
    GMTrace.o(8862396579840L, 66030);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */