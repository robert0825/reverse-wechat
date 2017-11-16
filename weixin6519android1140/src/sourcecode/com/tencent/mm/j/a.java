package com.tencent.mm.j;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.storage.au;

public abstract interface a
{
  public abstract void b(au paramau);
  
  public abstract String c(au paramau);
  
  public abstract boolean dL(String paramString);
  
  public abstract String q(String paramString, int paramInt);
  
  public static final class a
  {
    private static a fMC;
    
    static
    {
      GMTrace.i(14605438943232L, 108819);
      fMC = null;
      GMTrace.o(14605438943232L, 108819);
    }
    
    public static void a(a parama)
    {
      GMTrace.i(14605170507776L, 108817);
      fMC = parama;
      GMTrace.o(14605170507776L, 108817);
    }
    
    public static a sa()
    {
      GMTrace.i(14605304725504L, 108818);
      a locala = fMC;
      GMTrace.o(14605304725504L, 108818);
      return locala;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */