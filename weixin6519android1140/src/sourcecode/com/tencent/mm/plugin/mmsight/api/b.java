package com.tencent.mm.plugin.mmsight.api;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;

public abstract class b
{
  public static a mXe;
  
  static
  {
    GMTrace.i(18677067939840L, 139155);
    mXe = null;
    GMTrace.o(18677067939840L, 139155);
  }
  
  public b()
  {
    GMTrace.i(18676665286656L, 139152);
    GMTrace.o(18676665286656L, 139152);
  }
  
  public abstract com.tencent.mm.plugin.mmsight.model.a.d Rf();
  
  public abstract void a(com.tencent.mm.remoteservice.d paramd, VideoTransPara paramVideoTransPara);
  
  public static abstract interface a
  {
    public abstract b Rg();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\api\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */