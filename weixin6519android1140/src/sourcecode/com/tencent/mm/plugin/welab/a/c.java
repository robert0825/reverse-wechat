package com.tencent.mm.plugin.welab.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.welab.d.b;
import com.tencent.mm.plugin.welab.ui.WelabMainUI;

public final class c
  implements com.tencent.mm.plugin.welab.a.a.c
{
  public c()
  {
    GMTrace.i(15678509678592L, 116814);
    GMTrace.o(15678509678592L, 116814);
  }
  
  public final boolean bGA()
  {
    GMTrace.i(16266651762688L, 121196);
    if (!bGz())
    {
      GMTrace.o(16266651762688L, 121196);
      return true;
    }
    GMTrace.o(16266651762688L, 121196);
    return false;
  }
  
  public final boolean bGy()
  {
    GMTrace.i(15678778114048L, 116816);
    b.bGI();
    if ((b.bGK()) && (!bGz()))
    {
      GMTrace.o(15678778114048L, 116816);
      return true;
    }
    GMTrace.o(15678778114048L, 116816);
    return false;
  }
  
  public final boolean bGz()
  {
    GMTrace.i(16133239341056L, 120202);
    b.bGI();
    if (!b.bGL())
    {
      b.bGI();
      if (b.bGK())
      {
        GMTrace.o(16133239341056L, 120202);
        return true;
      }
    }
    GMTrace.o(16133239341056L, 120202);
    return false;
  }
  
  public final void u(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(15678643896320L, 116815);
    paramIntent.setClass(paramContext, WelabMainUI.class);
    if ((bGy()) || (bGz())) {}
    for (int i = 1;; i = 0)
    {
      paramIntent.putExtra("para_from_with_red_point", i);
      paramContext.startActivity(paramIntent);
      GMTrace.o(15678643896320L, 116815);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */