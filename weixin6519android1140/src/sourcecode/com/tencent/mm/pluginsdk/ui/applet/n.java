package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c;

public abstract interface n
{
  public abstract boolean Pf(String paramString);
  
  public abstract Object Pg(String paramString);
  
  public abstract c Ph(String paramString);
  
  public abstract String bx(Object paramObject);
  
  public abstract String by(Object paramObject);
  
  public abstract String bz(Object paramObject);
  
  public static final class a
  {
    public static n txR;
    
    static
    {
      GMTrace.i(18726862716928L, 139526);
      txR = null;
      GMTrace.o(18726862716928L, 139526);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */