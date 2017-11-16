package com.tencent.mm.ui.chatting;

import com.tencent.gmtrace.GMTrace;

public abstract interface dx
{
  public abstract void a(a parama);
  
  public abstract void b(a parama);
  
  public abstract void ccH();
  
  public abstract boolean ccI();
  
  public static enum a
  {
    static
    {
      GMTrace.i(2501281579008L, 18636);
      wFR = new a("del", 0);
      wFS = new a("trans", 1);
      wFT = new a("fav", 2);
      wFU = new a[] { wFR, wFS, wFT };
      GMTrace.o(2501281579008L, 18636);
    }
    
    private a()
    {
      GMTrace.i(14965679325184L, 111503);
      GMTrace.o(14965679325184L, 111503);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */