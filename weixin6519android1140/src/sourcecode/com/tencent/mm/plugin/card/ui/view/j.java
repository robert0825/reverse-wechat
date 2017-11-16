package com.tencent.mm.plugin.card.ui.view;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.pb.common.c.h;

public final class j
  extends g
{
  public j()
  {
    GMTrace.i(4994241658880L, 37210);
    GMTrace.o(4994241658880L, 37210);
  }
  
  public final ab amR()
  {
    GMTrace.i(18944698089472L, 141149);
    v localv = new v(this, this.iPC);
    GMTrace.o(18944698089472L, 141149);
    return localv;
  }
  
  public final ab amS()
  {
    GMTrace.i(18944832307200L, 141150);
    f localf = new f(this, this.iPC);
    GMTrace.o(18944832307200L, 141150);
    return localf;
  }
  
  public final ab amT()
  {
    GMTrace.i(18944966524928L, 141151);
    t localt = new t(this, this.iPC);
    GMTrace.o(18944966524928L, 141151);
    return localt;
  }
  
  public final String e(c paramc)
  {
    GMTrace.i(18894366441472L, 140774);
    paramc = this.jwZ.ajw().code;
    GMTrace.o(18894366441472L, 140774);
    return paramc;
  }
  
  public final boolean h(b paramb)
  {
    GMTrace.i(18894232223744L, 140773);
    if (this.jwZ == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      GMTrace.o(18894232223744L, 140773);
      return true;
    }
    if (paramb == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      GMTrace.o(18894232223744L, 140773);
      return false;
    }
    String str = this.jwZ.ajw().code;
    paramb = paramb.ajw().code;
    if ((!h.yp(str)) && (!h.yp(paramb)) && (!str.equals(paramb)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
      GMTrace.o(18894232223744L, 140773);
      return true;
    }
    GMTrace.o(18894232223744L, 140773);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */