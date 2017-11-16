package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.gmtrace.GMTrace;

public abstract interface z
{
  public abstract void a(String paramString, int paramInt, a parama);
  
  public static enum a
  {
    static
    {
      GMTrace.i(18282199384064L, 136213);
      iNO = new a("COMPLETE", 0);
      iNP = new a("CONFIRM", 1);
      iNQ = new a("CHANGED", 2);
      iNR = new a[] { iNO, iNP, iNQ };
      GMTrace.o(18282199384064L, 136213);
    }
    
    private a()
    {
      GMTrace.i(18282065166336L, 136212);
      GMTrace.o(18282065166336L, 136212);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */