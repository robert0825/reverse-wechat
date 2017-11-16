package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.e;
import com.tencent.mm.sdk.platformtools.ab;

public class c
{
  boolean iPF;
  public b iPH;
  public AppBrandSmileyPanelBase.a iPI;
  int iPJ;
  int iPK;
  public Context iPn;
  
  public c()
  {
    GMTrace.i(19877511299072L, 148099);
    this.iPF = false;
    GMTrace.o(19877511299072L, 148099);
  }
  
  public static int[] aaW()
  {
    GMTrace.i(19877779734528L, 148101);
    Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    GMTrace.o(19877779734528L, 148101);
    return new int[] { i, j };
  }
  
  public final a adB()
  {
    GMTrace.i(19877645516800L, 148100);
    if (this.iPH == null)
    {
      this.iPH = new b();
      this.iPH.iPn = this.iPn;
      this.iPH.a(this);
    }
    b localb = this.iPH;
    GMTrace.o(19877645516800L, 148100);
    return localb;
  }
  
  public e adm()
  {
    GMTrace.i(19877913952256L, 148102);
    e locale = e.bRA();
    GMTrace.o(19877913952256L, 148102);
    return locale;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\panel\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */