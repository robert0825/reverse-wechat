package com.tencent.mm.plugin.card.ui.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.ui.MMActivity;

public final class e
  extends a
{
  public e(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
    GMTrace.i(4945789059072L, 36849);
    GMTrace.o(4945789059072L, 36849);
  }
  
  public final boolean amA()
  {
    GMTrace.i(18897587666944L, 140798);
    if ((this.jwZ.ajv() != null) && (this.jwZ.ajv().uao))
    {
      GMTrace.o(18897587666944L, 140798);
      return true;
    }
    GMTrace.o(18897587666944L, 140798);
    return false;
  }
  
  public final boolean amB()
  {
    GMTrace.i(4946325929984L, 36853);
    if ((super.amB()) || ((this.jwZ.ajr()) && (!this.jJI) && ((ami()) || (amj()))))
    {
      GMTrace.o(4946325929984L, 36853);
      return true;
    }
    GMTrace.o(4946325929984L, 36853);
    return false;
  }
  
  public final boolean amG()
  {
    GMTrace.i(4946594365440L, 36855);
    if ((this.jwZ.ajr()) && (super.amG()) && (!amA()))
    {
      GMTrace.o(4946594365440L, 36855);
      return true;
    }
    GMTrace.o(4946594365440L, 36855);
    return false;
  }
  
  public final boolean amK()
  {
    GMTrace.i(4946460147712L, 36854);
    if ((this.jwZ.ajc()) && (this.jwZ.ajv().uaa != null) && (this.jwZ.ajr()) && (!this.jJI) && (!ami()) && (!amj()))
    {
      GMTrace.o(4946460147712L, 36854);
      return true;
    }
    GMTrace.o(4946460147712L, 36854);
    return false;
  }
  
  public final boolean aml()
  {
    GMTrace.i(4946728583168L, 36856);
    if ((super.aml()) && (this.jwZ.ajr()) && (!this.jJI) && (!ami()) && (!amj()))
    {
      GMTrace.o(4946728583168L, 36856);
      return true;
    }
    GMTrace.o(4946728583168L, 36856);
    return false;
  }
  
  public final boolean amt()
  {
    GMTrace.i(4945923276800L, 36850);
    if ((this.jwZ.ajc()) && (!l.lX(this.jEZ.jtE)) && (this.jwZ.ajr()) && (!this.jJI))
    {
      GMTrace.o(4945923276800L, 36850);
      return false;
    }
    GMTrace.o(4945923276800L, 36850);
    return true;
  }
  
  public final boolean amx()
  {
    GMTrace.i(4946057494528L, 36851);
    if ((this.jwZ.ajc()) && (!l.lX(this.jEZ.jtE)) && (this.jwZ.ajr()) && (!this.jJI))
    {
      GMTrace.o(4946057494528L, 36851);
      return true;
    }
    GMTrace.o(4946057494528L, 36851);
    return false;
  }
  
  public final boolean amy()
  {
    GMTrace.i(4946191712256L, 36852);
    boolean bool = this.jJI;
    GMTrace.o(4946191712256L, 36852);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */