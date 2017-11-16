package com.tencent.mm.sdk.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.Serializable;

public class b
  extends c
  implements Serializable
{
  public final String name;
  
  public b()
  {
    GMTrace.i(17561987055616L, 130847);
    this.name = getClass().getSimpleName();
    GMTrace.o(17561987055616L, 130847);
  }
  
  public void enter()
  {
    GMTrace.i(17562121273344L, 130848);
    super.enter();
    w.i("LogStateTransitionState", "entering " + this.name);
    GMTrace.o(17562121273344L, 130848);
  }
  
  public void exit()
  {
    GMTrace.i(17562255491072L, 130849);
    super.exit();
    w.i("LogStateTransitionState", "exiting " + this.name);
    GMTrace.o(17562255491072L, 130849);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\sdk\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */