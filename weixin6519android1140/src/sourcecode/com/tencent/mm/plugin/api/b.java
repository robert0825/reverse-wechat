package com.tencent.mm.plugin.api;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.j;

public final class b
  extends com.tencent.mm.plugin.mmsight.api.b
{
  private com.tencent.mm.plugin.mmsight.model.a.d hwO;
  private VideoTransPara hwP;
  
  public b()
  {
    GMTrace.i(18669820182528L, 139101);
    GMTrace.o(18669820182528L, 139101);
  }
  
  public final com.tencent.mm.plugin.mmsight.model.a.d Rf()
  {
    GMTrace.i(18670088617984L, 139103);
    if (this.hwP != null)
    {
      k.aPI();
      this.hwO = k.c(this.hwP);
    }
    com.tencent.mm.plugin.mmsight.model.a.d locald = this.hwO;
    GMTrace.o(18670088617984L, 139103);
    return locald;
  }
  
  public final void a(com.tencent.mm.remoteservice.d paramd, VideoTransPara paramVideoTransPara)
  {
    GMTrace.i(18669954400256L, 139102);
    if (paramd != null) {
      CaptureMMProxy.createProxy(new CaptureMMProxy(paramd));
    }
    j.b(paramVideoTransPara);
    this.hwP = paramVideoTransPara;
    GMTrace.o(18669954400256L, 139102);
  }
  
  public static final class a
    implements com.tencent.mm.plugin.mmsight.api.b.a
  {
    public a()
    {
      GMTrace.i(18669551747072L, 139099);
      GMTrace.o(18669551747072L, 139099);
    }
    
    public final com.tencent.mm.plugin.mmsight.api.b Rg()
    {
      GMTrace.i(18669685964800L, 139100);
      b localb = new b();
      GMTrace.o(18669685964800L, 139100);
      return localb;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\api\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */