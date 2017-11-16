package com.tencent.mm.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.view.f.a;
import android.support.v7.view.g;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.b.a;
import com.tencent.mm.ui.b.a.a;
import com.tencent.mm.ui.b.b.a;

public final class q
  extends p
  implements b.a
{
  private ActionBar FM;
  public u vMc;
  public com.tencent.mm.ui.b.b vMd;
  
  public q()
  {
    GMTrace.i(1606317768704L, 11968);
    this.vMc = null;
    GMTrace.o(1606317768704L, 11968);
  }
  
  protected final void VC()
  {
    GMTrace.i(1607257292800L, 11975);
    if (this.vMc != null) {
      u.VC();
    }
    GMTrace.o(1607257292800L, 11975);
  }
  
  protected final String aJX()
  {
    GMTrace.i(1606854639616L, 11972);
    if (this.vMc != null)
    {
      String str = this.vMc.aJX();
      GMTrace.o(1606854639616L, 11972);
      return str;
    }
    GMTrace.o(1606854639616L, 11972);
    return null;
  }
  
  public final void aQ()
  {
    GMTrace.i(1607928381440L, 11980);
    this.vMd.aQ();
    GMTrace.o(1607928381440L, 11980);
  }
  
  public final void aoK()
  {
    GMTrace.i(1607123075072L, 11974);
    if (this.vMc != null) {
      this.vMc.aoK();
    }
    GMTrace.o(1607123075072L, 11974);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(1606720421888L, 11971);
    if (this.vMc != null) {
      this.vMc.bH(paramView);
    }
    GMTrace.o(1606720421888L, 11971);
  }
  
  public final boolean bXD()
  {
    GMTrace.i(1607794163712L, 11979);
    GMTrace.o(1607794163712L, 11979);
    return true;
  }
  
  protected final boolean bXl()
  {
    GMTrace.i(1607525728256L, 11977);
    GMTrace.o(1607525728256L, 11977);
    return false;
  }
  
  protected final View bXo()
  {
    GMTrace.i(1606988857344L, 11973);
    if (this.vMc != null)
    {
      View localView = this.vMc.bXo();
      GMTrace.o(1606988857344L, 11973);
      return localView;
    }
    GMTrace.o(1606988857344L, 11973);
    return null;
  }
  
  public final boolean c(Menu paramMenu)
  {
    GMTrace.i(1608062599168L, 11981);
    if (this.vMc != null) {
      this.vMc.onPrepareOptionsMenu(paramMenu);
    }
    GMTrace.o(1608062599168L, 11981);
    return true;
  }
  
  public final ActionBar cO()
  {
    GMTrace.i(1607659945984L, 11978);
    if (this.FM == null) {
      this.FM = this.vMd.bZi();
    }
    ActionBar localActionBar = this.FM;
    GMTrace.o(1607659945984L, 11978);
    return localActionBar;
  }
  
  public final boolean d(Menu paramMenu)
  {
    GMTrace.i(1608196816896L, 11982);
    u localu = this.vMc;
    com.tencent.mm.ui.b.b localb = this.vMd;
    ActionBar localActionBar;
    if (localb.ib == null)
    {
      localActionBar = localb.cO();
      if (localActionBar == null) {
        break label73;
      }
    }
    label73:
    for (localb.ib = new g(localActionBar.getThemedContext());; localb.ib = new g(localb.mActivity))
    {
      localu.onCreateOptionsMenu(paramMenu, localb.ib);
      GMTrace.o(1608196816896L, 11982);
      return true;
    }
  }
  
  protected final String getClassName()
  {
    GMTrace.i(1607391510528L, 11976);
    String str = this.vMc.getClass().getName();
    GMTrace.o(1607391510528L, 11976);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1606586204160L, 11970);
    if (this.vMc != null)
    {
      int i = this.vMc.getLayoutId();
      GMTrace.o(1606586204160L, 11970);
      return i;
    }
    GMTrace.o(1606586204160L, 11970);
    return -1;
  }
  
  public final boolean j(MenuItem paramMenuItem)
  {
    GMTrace.i(1608331034624L, 11983);
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    GMTrace.o(1608331034624L, 11983);
    return bool;
  }
  
  public final ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    GMTrace.i(1606451986432L, 11969);
    Object localObject = this.vMd;
    paramCallback = new f.a(((a)localObject).mActivity, paramCallback);
    if (((a)localObject).Ge != null) {
      ((a)localObject).Ge.finish();
    }
    a.a locala = new a.a((a)localObject, paramCallback);
    ActionBar localActionBar = ((a)localObject).cO();
    if (localActionBar != null) {
      ((a)localObject).Ge = localActionBar.a(locala);
    }
    localObject = ((a)localObject).Ge;
    if (localObject != null)
    {
      paramCallback = paramCallback.b((android.support.v7.view.b)localObject);
      GMTrace.o(1606451986432L, 11969);
      return paramCallback;
    }
    GMTrace.o(1606451986432L, 11969);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */