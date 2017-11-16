package com.tencent.mm.plugin.hp.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.e;
import com.tencent.mm.sdk.b.c;

public final class f
  extends c<e>
{
  private static long aKO;
  
  static
  {
    GMTrace.i(18994224431104L, 141518);
    aKO = 0L;
    GMTrace.o(18994224431104L, 141518);
  }
  
  public f()
  {
    GMTrace.i(18993821777920L, 141515);
    this.vhf = e.class.getName().hashCode();
    GMTrace.o(18993821777920L, 141515);
  }
  
  public static void cB(long paramLong)
  {
    GMTrace.i(18993955995648L, 141516);
    aKO = paramLong;
    GMTrace.o(18993955995648L, 141516);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */