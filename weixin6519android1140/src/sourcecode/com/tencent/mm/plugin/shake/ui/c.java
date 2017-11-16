package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;

final class c
{
  aj euU;
  View view;
  
  public c(View paramView)
  {
    GMTrace.i(6575863365632L, 48994);
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(6546067030016L, 48772);
        c.this.bfP();
        GMTrace.o(6546067030016L, 48772);
        return false;
      }
    }, false);
    this.view = paramView;
    GMTrace.o(6575863365632L, 48994);
  }
  
  public final void bfP()
  {
    GMTrace.i(6575997583360L, 48995);
    if (this.view != null) {
      this.view.setKeepScreenOn(false);
    }
    GMTrace.o(6575997583360L, 48995);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */