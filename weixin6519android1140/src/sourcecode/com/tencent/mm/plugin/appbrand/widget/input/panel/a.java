package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  Context iPn;
  protected c iPo;
  int iPp;
  
  a()
  {
    GMTrace.i(19880195653632L, 148119);
    this.iPp = 0;
    GMTrace.o(19880195653632L, 148119);
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(19880061435904L, 148118);
    this.iPo = paramc;
    GMTrace.o(19880061435904L, 148118);
  }
  
  public abstract int adu();
  
  public abstract int adv();
  
  public abstract int adw();
  
  public abstract int adx();
  
  public abstract int getPageCount();
  
  public abstract int getRowCount();
  
  public abstract View kk(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\panel\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */