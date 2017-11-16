package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.b;
import android.support.v4.view.d;
import android.support.v4.view.m.e;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class a
  implements b
{
  private final int Jp;
  private final int Jq;
  private final int Jr;
  private CharSequence Js;
  private Intent Jt;
  private char Ju;
  private char Jv;
  private Drawable Jw;
  private int Jx = 0;
  private MenuItem.OnMenuItemClickListener Jy;
  private Context mContext;
  private final int mId;
  private CharSequence tX;
  private int tu = 16;
  
  public a(Context paramContext, CharSequence paramCharSequence)
  {
    this.mContext = paramContext;
    this.mId = 16908332;
    this.Jp = 0;
    this.Jq = 0;
    this.Jr = 0;
    this.tX = paramCharSequence;
  }
  
  public final b a(d paramd)
  {
    throw new UnsupportedOperationException();
  }
  
  public final b a(m.e parame)
  {
    return this;
  }
  
  public final d bv()
  {
    return null;
  }
  
  public final boolean collapseActionView()
  {
    return false;
  }
  
  public final boolean expandActionView()
  {
    return false;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }
  
  public final View getActionView()
  {
    return null;
  }
  
  public final char getAlphabeticShortcut()
  {
    return this.Jv;
  }
  
  public final int getGroupId()
  {
    return this.Jp;
  }
  
  public final Drawable getIcon()
  {
    return this.Jw;
  }
  
  public final Intent getIntent()
  {
    return this.Jt;
  }
  
  public final int getItemId()
  {
    return this.mId;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final char getNumericShortcut()
  {
    return this.Ju;
  }
  
  public final int getOrder()
  {
    return this.Jr;
  }
  
  public final SubMenu getSubMenu()
  {
    return null;
  }
  
  public final CharSequence getTitle()
  {
    return this.tX;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.Js != null) {
      return this.Js;
    }
    return this.tX;
  }
  
  public final boolean hasSubMenu()
  {
    return false;
  }
  
  public final boolean isActionViewExpanded()
  {
    return false;
  }
  
  public final boolean isCheckable()
  {
    return (this.tu & 0x1) != 0;
  }
  
  public final boolean isChecked()
  {
    return (this.tu & 0x2) != 0;
  }
  
  public final boolean isEnabled()
  {
    return (this.tu & 0x10) != 0;
  }
  
  public final boolean isVisible()
  {
    return (this.tu & 0x8) == 0;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.Jv = paramChar;
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int j = this.tu;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.tu = (i | j & 0xFFFFFFFE);
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int j = this.tu;
    if (paramBoolean) {}
    for (int i = 2;; i = 0)
    {
      this.tu = (i | j & 0xFFFFFFFD);
      return this;
    }
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int j = this.tu;
    if (paramBoolean) {}
    for (int i = 16;; i = 0)
    {
      this.tu = (i | j & 0xFFFFFFEF);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.Jx = paramInt;
    this.Jw = android.support.v4.content.a.b(this.mContext, paramInt);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.Jw = paramDrawable;
    this.Jx = 0;
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.Jt = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    this.Ju = paramChar;
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.Jy = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.Ju = paramChar1;
    this.Jv = paramChar2;
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final MenuItem setTitle(int paramInt)
  {
    this.tX = this.mContext.getResources().getString(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.tX = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.Js = paramCharSequence;
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    int j = this.tu;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      this.tu = (i | j & 0x8);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */