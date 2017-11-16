package com.tencent.mm.plugin.gwallet.a;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends Exception
{
  c mgr;
  
  public a(int paramInt, String paramString)
  {
    this(new c(paramInt, paramString));
    GMTrace.i(8971784028160L, 66845);
    GMTrace.o(8971784028160L, 66845);
  }
  
  private a(c paramc)
  {
    this(paramc, null);
    GMTrace.i(8971649810432L, 66844);
    GMTrace.o(8971649810432L, 66844);
  }
  
  private a(c paramc, Exception paramException)
  {
    super(paramc.mMessage, paramException);
    GMTrace.i(8971918245888L, 66846);
    this.mgr = paramc;
    GMTrace.o(8971918245888L, 66846);
  }
  
  public a(String paramString, Exception paramException)
  {
    this(new c(64535, paramString), paramException);
    GMTrace.i(8972052463616L, 66847);
    GMTrace.o(8972052463616L, 66847);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gwallet\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */