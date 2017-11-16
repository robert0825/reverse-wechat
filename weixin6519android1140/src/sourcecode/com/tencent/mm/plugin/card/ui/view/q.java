package com.tencent.mm.plugin.card.ui.view;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.pb.common.c.h;

public final class q
  extends g
{
  public String jIS;
  
  public q()
  {
    GMTrace.i(18895171747840L, 140780);
    this.jIS = "";
    GMTrace.o(18895171747840L, 140780);
  }
  
  public final ab amR()
  {
    GMTrace.i(18945100742656L, 141152);
    s locals = new s(this, this.iPC);
    GMTrace.o(18945100742656L, 141152);
    return locals;
  }
  
  public final ab amS()
  {
    GMTrace.i(18945234960384L, 141153);
    p localp = new p(this, this.iPC);
    GMTrace.o(18945234960384L, 141153);
    return localp;
  }
  
  public final ab amT()
  {
    GMTrace.i(18945369178112L, 141154);
    r localr = new r(this, this.iPC);
    GMTrace.o(18945369178112L, 141154);
    return localr;
  }
  
  public final String e(c paramc)
  {
    GMTrace.i(18895440183296L, 140782);
    if (!h.isNullOrEmpty(this.jwZ.ajw().tZs))
    {
      paramc = this.jwZ.ajw().tZs;
      GMTrace.o(18895440183296L, 140782);
      return paramc;
    }
    if ((this.jwZ.ajp()) && (!h.isNullOrEmpty(this.jIS)))
    {
      paramc = this.jIS;
      GMTrace.o(18895440183296L, 140782);
      return paramc;
    }
    paramc = this.jwZ.ajw().code;
    GMTrace.o(18895440183296L, 140782);
    return paramc;
  }
  
  public final boolean h(b paramb)
  {
    GMTrace.i(18895305965568L, 140781);
    if (this.jwZ == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if (paramb == null)
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      GMTrace.o(18895305965568L, 140781);
      return false;
    }
    Object localObject = this.jwZ.ajw().code;
    String str = paramb.ajw().code;
    if ((!h.yp((String)localObject)) && (!h.yp(str)) && (!((String)localObject).equals(str)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    localObject = this.jwZ.ajv().uam;
    paramb = paramb.ajv().uam;
    if (((localObject == null) && (paramb != null)) || ((localObject != null) && (paramb == null)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if ((localObject != null) && (paramb != null) && (((np)localObject).title != null) && (paramb.title != null) && (!((np)localObject).title.equals(paramb.title)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if ((localObject != null) && (paramb != null) && (((np)localObject).jxJ != null) && (paramb.jxJ != null) && (!((np)localObject).jxJ.equals(paramb.jxJ)))
    {
      w.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    if ((this.jwZ.ajp()) && (!h.isNullOrEmpty(this.jIS)))
    {
      w.i("MicroMsg.CardCodeView", "dynamicCode updated！");
      GMTrace.o(18895305965568L, 140781);
      return true;
    }
    GMTrace.o(18895305965568L, 140781);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */