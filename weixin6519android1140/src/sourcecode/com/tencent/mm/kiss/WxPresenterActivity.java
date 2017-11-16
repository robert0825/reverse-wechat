package com.tencent.mm.kiss;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;

public abstract class WxPresenterActivity
  extends MMActivity
{
  protected c gaw;
  
  public WxPresenterActivity()
  {
    GMTrace.i(453387485184L, 3378);
    this.gaw = new c();
    GMTrace.o(453387485184L, 3378);
  }
  
  public final void a(com.tencent.mm.vending.e.a parama)
  {
    GMTrace.i(454058573824L, 3383);
    this.gaw.a(parama);
    GMTrace.o(454058573824L, 3383);
  }
  
  public final <T extends b<? extends com.tencent.mm.vending.app.a>> T m(Class<? extends b<? extends com.tencent.mm.vending.app.a>> paramClass)
  {
    GMTrace.i(454192791552L, 3384);
    paramClass = this.gaw.a(this, paramClass);
    GMTrace.o(454192791552L, 3384);
    return paramClass;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(453521702912L, 3379);
    super.onCreate(paramBundle);
    this.gaw.B(getIntent(), this);
    GMTrace.o(453521702912L, 3379);
  }
  
  public void onDestroy()
  {
    GMTrace.i(453924356096L, 3382);
    this.gaw.onDestroy();
    super.onDestroy();
    GMTrace.o(453924356096L, 3382);
  }
  
  public void onPause()
  {
    GMTrace.i(453790138368L, 3381);
    this.gaw.Ez(3);
    super.onPause();
    GMTrace.o(453790138368L, 3381);
  }
  
  public void onResume()
  {
    GMTrace.i(453655920640L, 3380);
    super.onResume();
    this.gaw.Ez(2);
    GMTrace.o(453655920640L, 3380);
  }
  
  public final com.tencent.mm.vending.app.a xI()
  {
    GMTrace.i(454327009280L, 3385);
    com.tencent.mm.vending.app.a locala = this.gaw.xI();
    GMTrace.o(454327009280L, 3385);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\kiss\WxPresenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */