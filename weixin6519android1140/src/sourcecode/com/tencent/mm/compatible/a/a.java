package com.tencent.mm.compatible.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;

public final class a
{
  public static boolean a(int paramInt, a parama)
  {
    GMTrace.i(13823218024448L, 102991);
    if (f.et(paramInt))
    {
      parama.run();
      GMTrace.o(13823218024448L, 102991);
      return true;
    }
    GMTrace.o(13823218024448L, 102991);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void run();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */