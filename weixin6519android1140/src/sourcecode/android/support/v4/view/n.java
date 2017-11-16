package android.support.v4.view;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class n
{
  public static MenuItem a(MenuItem paramMenuItem, b paramb)
  {
    return paramMenuItem.setOnActionExpandListener(new a(paramb));
  }
  
  static final class a
    implements MenuItem.OnActionExpandListener
  {
    private n.b wx;
    
    public a(n.b paramb)
    {
      this.wx = paramb;
    }
    
    public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return this.wx.onMenuItemActionCollapse(paramMenuItem);
    }
    
    public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return this.wx.onMenuItemActionExpand(paramMenuItem);
    }
  }
  
  static abstract interface b
  {
    public abstract boolean onMenuItemActionCollapse(MenuItem paramMenuItem);
    
    public abstract boolean onMenuItemActionExpand(MenuItem paramMenuItem);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */