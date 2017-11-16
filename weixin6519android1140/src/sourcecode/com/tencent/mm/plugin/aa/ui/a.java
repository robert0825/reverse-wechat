package com.tencent.mm.plugin.aa.ui;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.d.l;

public final class a
  extends l
{
  private a hqc;
  
  public a(a parama)
  {
    super(2, null);
    GMTrace.i(5643452809216L, 42047);
    this.hqc = parama;
    GMTrace.o(5643452809216L, 42047);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(5643587026944L, 42048);
    if (this.hqc != null) {
      this.hqc.PT();
    }
    GMTrace.o(5643587026944L, 42048);
  }
  
  public static abstract interface a
  {
    public abstract void PT();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */