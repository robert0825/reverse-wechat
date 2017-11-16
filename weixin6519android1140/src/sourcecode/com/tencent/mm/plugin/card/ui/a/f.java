package com.tencent.mm.plugin.card.ui.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;

public final class f
  extends a
{
  public f(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
    GMTrace.i(4947265454080L, 36860);
    GMTrace.o(4947265454080L, 36860);
  }
  
  public final boolean amA()
  {
    GMTrace.i(4947668107264L, 36863);
    GMTrace.o(4947668107264L, 36863);
    return true;
  }
  
  public final boolean amD()
  {
    GMTrace.i(4947802324992L, 36864);
    if ((this.jwZ.ajr()) && (super.amD()))
    {
      GMTrace.o(4947802324992L, 36864);
      return true;
    }
    GMTrace.o(4947802324992L, 36864);
    return false;
  }
  
  public final boolean amy()
  {
    GMTrace.i(4947399671808L, 36861);
    boolean bool = this.jJI;
    GMTrace.o(4947399671808L, 36861);
    return bool;
  }
  
  public final boolean amz()
  {
    GMTrace.i(4947533889536L, 36862);
    if ((this.jwZ.ajr()) && (super.amz()) && ((this.jwZ.ajp()) || (!bg.nm(this.jwZ.ajw().code))))
    {
      GMTrace.o(4947533889536L, 36862);
      return true;
    }
    GMTrace.o(4947533889536L, 36862);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */