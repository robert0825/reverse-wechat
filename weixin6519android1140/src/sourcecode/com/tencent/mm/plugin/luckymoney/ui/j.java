package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.ui.MMActivity;

public final class j
{
  MMActivity hyB;
  int mQF;
  int mQG;
  
  public j(MMActivity paramMMActivity)
  {
    GMTrace.i(9802725982208L, 73036);
    this.hyB = paramMMActivity;
    if (aMR())
    {
      paramMMActivity = paramMMActivity.getWindow();
      paramMMActivity.addFlags(Integer.MIN_VALUE);
      this.mQG = paramMMActivity.getStatusBarColor();
    }
    GMTrace.o(9802725982208L, 73036);
  }
  
  static a B(Context paramContext, int paramInt)
  {
    GMTrace.i(9803128635392L, 73039);
    a locala = new a();
    paramContext = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      locala.mQH = paramContext.getDrawable(a.e.snX);
      locala.iSn = -1;
      locala.mQJ = paramContext.getColor(a.c.smt);
    }
    for (locala.mQL = paramContext.getColor(a.c.smg);; locala.mQL = paramContext.getColor(a.c.smp))
    {
      GMTrace.o(9803128635392L, 73039);
      return locala;
      locala.mQH = new ColorDrawable(paramContext.getColor(a.c.smi));
      locala.iSn = paramContext.getColor(a.c.smj);
      locala.mQI = paramContext.getColor(a.c.smn);
      locala.mQJ = paramContext.getColor(a.c.smn);
      locala.mQK = a.e.snY;
    }
  }
  
  private static boolean aMR()
  {
    GMTrace.i(9802860199936L, 73037);
    if (Build.VERSION.SDK_INT >= 21)
    {
      GMTrace.o(9802860199936L, 73037);
      return true;
    }
    GMTrace.o(9802860199936L, 73037);
    return false;
  }
  
  final void qi(int paramInt)
  {
    GMTrace.i(9802994417664L, 73038);
    if (aMR())
    {
      Window localWindow = this.hyB.getWindow();
      localWindow.addFlags(Integer.MIN_VALUE);
      localWindow.setStatusBarColor(paramInt);
    }
    GMTrace.o(9802994417664L, 73038);
  }
  
  public static final class a
  {
    public int iSn;
    public Drawable mQH;
    public int mQI;
    public int mQJ;
    public int mQK;
    public int mQL;
    
    public a()
    {
      GMTrace.i(9881511788544L, 73623);
      GMTrace.o(9881511788544L, 73623);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */