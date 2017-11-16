package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import com.tencent.gmtrace.GMTrace;

abstract interface h
{
  public abstract void a(String paramString, a parama);
  
  public static enum a
  {
    static
    {
      GMTrace.i(18261395636224L, 136058);
      iPh = new a("CANCEL", 0);
      iPi = new a("DELETE", 1);
      iPj = new a("SELECT", 2);
      iPk = new a[] { iPh, iPi, iPj };
      GMTrace.o(18261395636224L, 136058);
    }
    
    private a()
    {
      GMTrace.i(18261261418496L, 136057);
      GMTrace.o(18261261418496L, 136057);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */