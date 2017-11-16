package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;

public abstract class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected boolean oOn;
  long oOo;
  
  public e(long paramLong)
  {
    GMTrace.i(6605391265792L, 49214);
    this.oOn = false;
    this.oOo = 0L;
    this.oOo = paramLong;
    GMTrace.o(6605391265792L, 49214);
  }
  
  public final boolean bfL()
  {
    GMTrace.i(6605525483520L, 49215);
    boolean bool = this.oOn;
    GMTrace.o(6605525483520L, 49215);
    return bool;
  }
  
  public abstract azh bfM();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\d\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */