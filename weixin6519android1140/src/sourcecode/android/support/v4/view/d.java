package android.support.v4.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class d
{
  private final Context mContext;
  public a vM;
  public b vN;
  
  public d(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public void a(b paramb)
  {
    if (this.vN != null) {
      new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
    }
    this.vN = paramb;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean isVisible()
  {
    return true;
  }
  
  public abstract View onCreateActionView();
  
  public View onCreateActionView(MenuItem paramMenuItem)
  {
    return onCreateActionView();
  }
  
  public boolean onPerformDefaultAction()
  {
    return false;
  }
  
  public void onPrepareSubMenu(SubMenu paramSubMenu) {}
  
  public boolean overridesItemVisibility()
  {
    return false;
  }
  
  public final void p(boolean paramBoolean)
  {
    if (this.vM != null) {
      this.vM.q(paramBoolean);
    }
  }
  
  public static abstract interface a
  {
    public abstract void q(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void bI();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */