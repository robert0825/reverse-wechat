package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.gmtrace.GMTrace;

public final class j
{
  public int errorCode;
  public String errorInfo;
  
  public j()
  {
    GMTrace.i(20726706864128L, 154426);
    this.errorCode = 0;
    this.errorInfo = "Success";
    GMTrace.o(20726706864128L, 154426);
  }
  
  public j(int paramInt, String paramString)
  {
    GMTrace.i(20726841081856L, 154427);
    this.errorCode = 0;
    this.errorInfo = "Success";
    this.errorCode = paramInt;
    this.errorInfo = paramString;
    GMTrace.o(20726841081856L, 154427);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */