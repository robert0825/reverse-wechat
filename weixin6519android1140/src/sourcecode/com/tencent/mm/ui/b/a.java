package com.tencent.mm.ui.b;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  public ActionBar FM;
  public b Ge;
  public MenuInflater ib;
  public final Activity mActivity;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(3066740867072L, 22849);
    this.Ge = null;
    this.mActivity = paramActivity;
    GMTrace.o(3066740867072L, 22849);
  }
  
  abstract ActionBar bZi();
  
  public final ActionBar cO()
  {
    GMTrace.i(3067009302528L, 22851);
    if (this.FM == null) {
      this.FM = bZi();
    }
    ActionBar localActionBar = this.FM;
    GMTrace.o(3067009302528L, 22851);
    return localActionBar;
  }
  
  public final class a
    implements b.a
  {
    private b.a Gz;
    
    public a(b.a parama)
    {
      GMTrace.i(3065801342976L, 22842);
      this.Gz = parama;
      GMTrace.o(3065801342976L, 22842);
    }
    
    public final void a(b paramb)
    {
      GMTrace.i(3066338213888L, 22846);
      this.Gz.a(paramb);
      a.this.Ge = null;
      GMTrace.o(3066338213888L, 22846);
    }
    
    public final boolean a(b paramb, Menu paramMenu)
    {
      GMTrace.i(3065935560704L, 22843);
      boolean bool = this.Gz.a(paramb, paramMenu);
      GMTrace.o(3065935560704L, 22843);
      return bool;
    }
    
    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      GMTrace.i(3066203996160L, 22845);
      boolean bool = this.Gz.a(paramb, paramMenuItem);
      GMTrace.o(3066203996160L, 22845);
      return bool;
    }
    
    public final boolean b(b paramb, Menu paramMenu)
    {
      GMTrace.i(3066069778432L, 22844);
      boolean bool = this.Gz.b(paramb, paramMenu);
      GMTrace.o(3066069778432L, 22844);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */