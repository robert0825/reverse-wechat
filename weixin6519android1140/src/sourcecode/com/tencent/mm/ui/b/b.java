package com.tencent.mm.ui.b;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.widget.u;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;

public final class b
  extends a
  implements f.a, l.a
{
  public ViewGroup Ep;
  private boolean Gj;
  private f dn;
  public a vXd;
  public boolean vXe;
  private final Runnable vXf;
  
  public b(Activity paramActivity, a parama)
  {
    super(paramActivity);
    GMTrace.i(3064459165696L, 22832);
    this.vXf = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3067680391168L, 22856);
        b localb = b.this;
        Object localObject = localb.mActivity;
        ActionBar localActionBar = localb.cO();
        if (localActionBar != null) {
          localObject = localActionBar.getThemedContext();
        }
        localObject = new f((Context)localObject);
        ((f)localObject).a(localb);
        if (b.this.vXd != null)
        {
          b.this.vXd.d((Menu)localObject);
          b.this.vXd.c((Menu)localObject);
          b.this.e((f)localObject);
        }
        for (;;)
        {
          ((f)localObject).h(true);
          b.this.vXe = false;
          GMTrace.o(3067680391168L, 22856);
          return;
          b.this.e(null);
        }
      }
    };
    this.vXd = parama;
    GMTrace.o(3064459165696L, 22832);
  }
  
  public final void a(f paramf, boolean paramBoolean)
  {
    GMTrace.i(3064996036608L, 22836);
    GMTrace.o(3064996036608L, 22836);
  }
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    GMTrace.i(3064727601152L, 22834);
    if (this.vXd != null)
    {
      boolean bool = this.vXd.j(paramMenuItem);
      GMTrace.o(3064727601152L, 22834);
      return bool;
    }
    GMTrace.o(3064727601152L, 22834);
    return false;
  }
  
  public final void aQ()
  {
    GMTrace.i(3065264472064L, 22838);
    if (!this.vXe)
    {
      this.vXe = true;
      this.vXf.run();
    }
    GMTrace.o(3065264472064L, 22838);
  }
  
  public final void b(f paramf)
  {
    GMTrace.i(3064861818880L, 22835);
    if (this.FM != null)
    {
      u localu = ((d)this.FM).GX;
      if ((localu != null) && (localu.dS()))
      {
        if (!localu.isOverflowMenuShowing())
        {
          if (localu.getVisibility() == 0)
          {
            localu.showOverflowMenu();
            GMTrace.o(3064861818880L, 22835);
          }
        }
        else {
          localu.hideOverflowMenu();
        }
        GMTrace.o(3064861818880L, 22835);
        return;
      }
    }
    paramf.close();
    GMTrace.o(3064861818880L, 22835);
  }
  
  public final ActionBar bZi()
  {
    GMTrace.i(3064593383424L, 22833);
    if (!this.Gj)
    {
      this.Gj = true;
      aQ();
    }
    if (this.FM == null) {
      this.FM = new d(this.mActivity, this.Ep);
    }
    ActionBar localActionBar = this.FM;
    GMTrace.o(3064593383424L, 22833);
    return localActionBar;
  }
  
  public final boolean d(f paramf)
  {
    GMTrace.i(3065130254336L, 22837);
    GMTrace.o(3065130254336L, 22837);
    return false;
  }
  
  public final void e(f paramf)
  {
    GMTrace.i(16088813273088L, 119871);
    if (paramf == this.dn)
    {
      GMTrace.o(16088813273088L, 119871);
      return;
    }
    this.dn = paramf;
    if (this.FM != null) {
      ((d)this.FM).GX.a(paramf, this);
    }
    GMTrace.o(16088813273088L, 119871);
  }
  
  public static abstract interface a
  {
    public abstract boolean c(Menu paramMenu);
    
    public abstract boolean d(Menu paramMenu);
    
    public abstract boolean j(MenuItem paramMenuItem);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */