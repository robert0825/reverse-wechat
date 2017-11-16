package com.tencent.mm.ao.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.d;

public final class a
  implements Runnable
{
  private final com.tencent.mm.ao.a.a.b gJX;
  private final com.tencent.mm.ao.a.a.c gKp;
  private final com.tencent.mm.ao.a.c.a gKr;
  private final com.tencent.mm.ao.a.c.b gKs;
  private final com.tencent.mm.ao.a.b gLj;
  private final com.tencent.mm.ao.a.c.c gLk;
  private final String url;
  
  public a(String paramString, com.tencent.mm.ao.a.a.c paramc, com.tencent.mm.ao.a.b paramb, com.tencent.mm.ao.a.c.c paramc1)
  {
    GMTrace.i(13733560582144L, 102323);
    this.url = paramString;
    this.gLj = paramb;
    this.gJX = this.gLj.gJX;
    if (paramc == null)
    {
      this.gKp = this.gJX.gKp;
      this.gLk = paramc1;
      if (this.gKp.gKs == null) {
        break label103;
      }
    }
    label103:
    for (this.gKs = this.gKp.gKs;; this.gKs = this.gJX.gKs)
    {
      this.gKr = this.gJX.gKr;
      GMTrace.o(13733560582144L, 102323);
      return;
      this.gKp = paramc;
      break;
    }
  }
  
  public final void run()
  {
    GMTrace.i(13733694799872L, 102324);
    new com.tencent.mm.ao.a.d.b();
    com.tencent.mm.ao.a.d.b localb = this.gKs.ks(this.url);
    if (localb == null)
    {
      this.gLk.a(false, this.gKp.gLe);
      GMTrace.o(13733694799872L, 102324);
      return;
    }
    if (((d.decodeByteArray(localb.data, 10, 10) != null) || (!this.gKp.gLc)) && (this.gKr.a(this.url, localb.data, this.gKp)))
    {
      if (this.gLk != null)
      {
        this.gLk.a(true, this.gKp.gLe);
        GMTrace.o(13733694799872L, 102324);
      }
    }
    else if (this.gLk != null) {
      this.gLk.a(false, this.gKp.gLe);
    }
    GMTrace.o(13733694799872L, 102324);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */