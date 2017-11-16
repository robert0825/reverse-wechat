package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  Context iPn;
  int iPp;
  protected c rWp;
  
  public a()
  {
    GMTrace.i(12074226810880L, 89960);
    this.iPp = 0;
    GMTrace.o(12074226810880L, 89960);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(12074092593152L, 89959);
    this.rWp = paramc;
    GMTrace.o(12074092593152L, 89959);
  }
  
  public abstract int adu();
  
  public abstract int adv();
  
  public abstract int adw();
  
  public abstract int adx();
  
  public abstract int getPageCount();
  
  public abstract int getRowCount();
  
  public abstract View kk(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\input\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */