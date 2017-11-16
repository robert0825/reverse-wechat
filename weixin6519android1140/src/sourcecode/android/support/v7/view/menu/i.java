package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.support.v4.view.m.e;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
public class i
  extends c<b>
  implements MenuItem
{
  public Method KR;
  
  i(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  a a(ActionProvider paramActionProvider)
  {
    return new a(this.mContext, paramActionProvider);
  }
  
  public boolean collapseActionView()
  {
    return ((b)this.JP).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((b)this.JP).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    android.support.v4.view.d locald = ((b)this.JP).bv();
    if ((locald instanceof a)) {
      return ((a)locald).KS;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView2 = ((b)this.JP).getActionView();
    View localView1 = localView2;
    if ((localView2 instanceof b)) {
      localView1 = (View)((b)localView2).KU;
    }
    return localView1;
  }
  
  public char getAlphabeticShortcut()
  {
    return ((b)this.JP).getAlphabeticShortcut();
  }
  
  public int getGroupId()
  {
    return ((b)this.JP).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((b)this.JP).getIcon();
  }
  
  public Intent getIntent()
  {
    return ((b)this.JP).getIntent();
  }
  
  public int getItemId()
  {
    return ((b)this.JP).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((b)this.JP).getMenuInfo();
  }
  
  public char getNumericShortcut()
  {
    return ((b)this.JP).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((b)this.JP).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((b)this.JP).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((b)this.JP).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((b)this.JP).getTitleCondensed();
  }
  
  public boolean hasSubMenu()
  {
    return ((b)this.JP).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((b)this.JP).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((b)this.JP).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((b)this.JP).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((b)this.JP).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((b)this.JP).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = (b)this.JP;
    if (paramActionProvider != null) {}
    for (paramActionProvider = a(paramActionProvider);; paramActionProvider = null)
    {
      localb.a(paramActionProvider);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((b)this.JP).setActionView(paramInt);
    View localView = ((b)this.JP).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((b)this.JP).setActionView(new b(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new b(paramView);
    }
    ((b)this.JP).setActionView((View)localObject);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((b)this.JP).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((b)this.JP).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((b)this.JP).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((b)this.JP).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((b)this.JP).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((b)this.JP).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((b)this.JP).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((b)this.JP).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    b localb = (b)this.JP;
    if (paramOnActionExpandListener != null) {}
    for (paramOnActionExpandListener = new c(paramOnActionExpandListener);; paramOnActionExpandListener = null)
    {
      localb.a(paramOnActionExpandListener);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)this.JP;
    if (paramOnMenuItemClickListener != null) {}
    for (paramOnMenuItemClickListener = new d(paramOnMenuItemClickListener);; paramOnMenuItemClickListener = null)
    {
      localb.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((b)this.JP).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((b)this.JP).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((b)this.JP).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((b)this.JP).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((b)this.JP).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((b)this.JP).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((b)this.JP).setVisible(paramBoolean);
  }
  
  class a
    extends android.support.v4.view.d
  {
    final ActionProvider KS;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super();
      this.KS = paramActionProvider;
    }
    
    public final boolean hasSubMenu()
    {
      return this.KS.hasSubMenu();
    }
    
    public final View onCreateActionView()
    {
      return this.KS.onCreateActionView();
    }
    
    public final boolean onPerformDefaultAction()
    {
      return this.KS.onPerformDefaultAction();
    }
    
    public final void onPrepareSubMenu(SubMenu paramSubMenu)
    {
      this.KS.onPrepareSubMenu(i.this.a(paramSubMenu));
    }
  }
  
  static final class b
    extends FrameLayout
    implements android.support.v7.view.c
  {
    final CollapsibleActionView KU;
    
    b(View paramView)
    {
      super();
      this.KU = ((CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    public final void onActionViewCollapsed()
    {
      this.KU.onActionViewCollapsed();
    }
    
    public final void onActionViewExpanded()
    {
      this.KU.onActionViewExpanded();
    }
  }
  
  private final class c
    extends d<MenuItem.OnActionExpandListener>
    implements m.e
  {
    c(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      super();
    }
    
    public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.JP).onMenuItemActionCollapse(i.this.f(paramMenuItem));
    }
    
    public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.JP).onMenuItemActionExpand(i.this.f(paramMenuItem));
    }
  }
  
  private final class d
    extends d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener
  {
    d(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      super();
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnMenuItemClickListener)this.JP).onMenuItemClick(i.this.f(paramMenuItem));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */