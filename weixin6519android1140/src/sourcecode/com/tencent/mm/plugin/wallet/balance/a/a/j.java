package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aui;
import com.tencent.mm.protocal.c.avm;
import com.tencent.mm.protocal.c.avx;
import com.tencent.mm.protocal.c.axx;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.c;
import com.tencent.mm.vending.j.d;

public class j
  implements b<i>
{
  protected i qTv;
  public final d qTw;
  public final b qTx;
  public final c qTy;
  public final a qTz;
  
  public j()
  {
    this(new i());
    GMTrace.i(18419369902080L, 137235);
    GMTrace.o(18419369902080L, 137235);
  }
  
  private j(i parami)
  {
    GMTrace.i(18419504119808L, 137236);
    this.qTw = new d();
    this.qTx = new b();
    this.qTy = new c();
    this.qTz = new a();
    this.qTv = parami;
    GMTrace.o(18419504119808L, 137236);
  }
  
  public final class a
    implements e<aui, Integer>
  {
    public a()
    {
      GMTrace.i(18423127998464L, 137263);
      GMTrace.o(18423127998464L, 137263);
    }
    
    public final String PJ()
    {
      GMTrace.i(18423262216192L, 137264);
      GMTrace.o(18423262216192L, 137264);
      return "Vending.UI";
    }
  }
  
  public final class b
    implements e<avx, d<String, String, Integer>>
  {
    public b()
    {
      GMTrace.i(18418698813440L, 137230);
      GMTrace.o(18418698813440L, 137230);
    }
    
    public final String PJ()
    {
      GMTrace.i(18418833031168L, 137231);
      GMTrace.o(18418833031168L, 137231);
      return "Vending.UI";
    }
  }
  
  public final class c
    implements e<axx, d<Integer, String, String>>
  {
    public c()
    {
      GMTrace.i(18421114732544L, 137248);
      GMTrace.o(18421114732544L, 137248);
    }
    
    public final String PJ()
    {
      GMTrace.i(18421248950272L, 137249);
      GMTrace.o(18421248950272L, 137249);
      return "Vending.UI";
    }
  }
  
  public final class d
    implements e<avm, c<String, Integer>>
  {
    public d()
    {
      GMTrace.i(18416953982976L, 137217);
      GMTrace.o(18416953982976L, 137217);
    }
    
    public final String PJ()
    {
      GMTrace.i(18417088200704L, 137218);
      GMTrace.o(18417088200704L, 137218);
      return "Vending.UI";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */