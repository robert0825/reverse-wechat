package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.sdk.platformtools.ab;

public final class k
  extends l
{
  private a roo;
  
  public k(a parama)
  {
    this(parama, (byte)0);
    GMTrace.i(6944693682176L, 51742);
    GMTrace.o(6944693682176L, 51742);
  }
  
  private k(a parama, byte paramByte)
  {
    super(2, null);
    GMTrace.i(20884546912256L, 155602);
    this.roo = parama;
    GMTrace.o(20884546912256L, 155602);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(6944962117632L, 51744);
    if (this.roo != null) {
      this.roo.aoR();
    }
    GMTrace.o(6944962117632L, 51744);
  }
  
  protected final void wY(int paramInt)
  {
    GMTrace.i(6945096335360L, 51745);
    Context localContext = ab.getContext();
    super.wY(paramInt);
    if (paramInt == 5) {
      dW(localContext.getResources().getColor(a.c.white), localContext.getResources().getColor(a.c.kbk));
    }
    GMTrace.o(6945096335360L, 51745);
  }
  
  public static abstract interface a
  {
    public abstract void aoR();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */