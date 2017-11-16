package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.b;
import android.support.v4.view.d;
import android.support.v4.view.d.b;
import android.support.v4.view.m.e;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import java.util.ArrayList;

public final class h
  implements b
{
  static String KM;
  static String KN;
  static String KO;
  static String KP;
  private final int Jp;
  private final int Jq;
  final int Jr;
  private CharSequence Js;
  private Intent Jt;
  private char Ju;
  private char Jv;
  private Drawable Jw;
  private int Jx = 0;
  private MenuItem.OnMenuItemClickListener Jy;
  private p KE;
  private Runnable KF;
  int KG = 0;
  private View KH;
  public d KI;
  private m.e KJ;
  private boolean KK = false;
  ContextMenu.ContextMenuInfo KL;
  public f dn;
  private final int mId;
  private CharSequence tX;
  private int tu = 16;
  
  h(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.dn = paramf;
    this.mId = paramInt2;
    this.Jp = paramInt1;
    this.Jq = paramInt3;
    this.Jr = paramInt4;
    this.tX = paramCharSequence;
    this.KG = paramInt5;
  }
  
  private void F(boolean paramBoolean)
  {
    int j = this.tu;
    int k = this.tu;
    if (paramBoolean) {}
    for (int i = 2;; i = 0)
    {
      this.tu = (i | k & 0xFFFFFFFD);
      if (j != this.tu) {
        this.dn.h(false);
      }
      return;
    }
  }
  
  private b aK(View paramView)
  {
    this.KH = paramView;
    this.KI = null;
    if ((paramView != null) && (paramView.getId() == -1) && (this.mId > 0)) {
      paramView.setId(this.mId);
    }
    this.dn.dx();
    return this;
  }
  
  public final void E(boolean paramBoolean)
  {
    int j = this.tu;
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      this.tu = (i | j & 0xFFFFFFFB);
      return;
    }
  }
  
  final boolean G(boolean paramBoolean)
  {
    boolean bool = false;
    int j = this.tu;
    int k = this.tu;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      this.tu = (i | k & 0xFFFFFFF7);
      paramBoolean = bool;
      if (j != this.tu) {
        paramBoolean = true;
      }
      return paramBoolean;
    }
  }
  
  public final void H(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.tu |= 0x20;
      return;
    }
    this.tu &= 0xFFFFFFDF;
  }
  
  public final void I(boolean paramBoolean)
  {
    this.KK = paramBoolean;
    this.dn.h(false);
  }
  
  public final b a(d paramd)
  {
    if (this.KI != null)
    {
      d locald = this.KI;
      locald.vN = null;
      locald.vM = null;
    }
    this.KH = null;
    this.KI = paramd;
    this.dn.h(true);
    if (this.KI != null) {
      this.KI.a(new d.b()
      {
        public final void bI()
        {
          h.this.dn.dw();
        }
      });
    }
    return this;
  }
  
  public final b a(m.e parame)
  {
    this.KJ = parame;
    return this;
  }
  
  final CharSequence a(m.a parama)
  {
    if ((parama != null) && (parama.A())) {
      return getTitleCondensed();
    }
    return getTitle();
  }
  
  public final void b(p paramp)
  {
    this.KE = paramp;
    paramp.setHeaderTitle(getTitle());
  }
  
  public final d bv()
  {
    return this.KI;
  }
  
  public final boolean collapseActionView()
  {
    if ((this.KG & 0x8) == 0) {}
    do
    {
      return false;
      if (this.KH == null) {
        return true;
      }
    } while ((this.KJ != null) && (!this.KJ.onMenuItemActionCollapse(this)));
    return this.dn.h(this);
  }
  
  public final boolean dC()
  {
    if ((this.Jy != null) && (this.Jy.onMenuItemClick(this))) {}
    do
    {
      do
      {
        return true;
      } while (this.dn.b(this.dn.dB(), this));
      if (this.KF != null)
      {
        this.KF.run();
        return true;
      }
      if (this.Jt != null) {
        try
        {
          this.dn.mContext.startActivity(this.Jt);
          return true;
        }
        catch (ActivityNotFoundException localActivityNotFoundException) {}
      }
    } while ((this.KI != null) && (this.KI.onPerformDefaultAction()));
    return false;
  }
  
  final char dD()
  {
    if (this.dn.ds()) {
      return this.Jv;
    }
    return this.Ju;
  }
  
  final boolean dE()
  {
    return (this.dn.dt()) && (dD() != 0);
  }
  
  public final boolean dF()
  {
    return (this.tu & 0x4) != 0;
  }
  
  public final boolean dG()
  {
    return (this.tu & 0x20) == 32;
  }
  
  public final boolean dH()
  {
    return (this.KG & 0x1) == 1;
  }
  
  public final boolean dI()
  {
    return (this.KG & 0x2) == 2;
  }
  
  public final boolean dJ()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((this.KG & 0x8) != 0)
    {
      if ((this.KH == null) && (this.KI != null)) {
        this.KH = this.KI.onCreateActionView(this);
      }
      bool1 = bool2;
      if (this.KH != null) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean expandActionView()
  {
    if (!dJ()) {}
    while ((this.KJ != null) && (!this.KJ.onMenuItemActionExpand(this))) {
      return false;
    }
    return this.dn.g(this);
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView()
  {
    if (this.KH != null) {
      return this.KH;
    }
    if (this.KI != null)
    {
      this.KH = this.KI.onCreateActionView(this);
      return this.KH;
    }
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
    if (this.Jw != null) {
      return this.Jw;
    }
    if (this.Jx != 0)
    {
      Drawable localDrawable = android.support.v7.widget.h.ex().a(this.dn.mContext, this.Jx, false);
      this.Jx = 0;
      this.Jw = localDrawable;
      return localDrawable;
    }
    return null;
  }
  
  public final Intent getIntent()
  {
    return this.Jt;
  }
  
  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return this.mId;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.KL;
  }
  
  public final char getNumericShortcut()
  {
    return this.Ju;
  }
  
  public final int getOrder()
  {
    return this.Jq;
  }
  
  public final SubMenu getSubMenu()
  {
    return this.KE;
  }
  
  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return this.tX;
  }
  
  public final CharSequence getTitleCondensed()
  {
    if (this.Js != null) {}
    for (CharSequence localCharSequence = this.Js;; localCharSequence = this.tX)
    {
      Object localObject = localCharSequence;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = localCharSequence;
        if (localCharSequence != null)
        {
          localObject = localCharSequence;
          if (!(localCharSequence instanceof String)) {
            localObject = localCharSequence.toString();
          }
        }
      }
      return (CharSequence)localObject;
    }
  }
  
  public final boolean hasSubMenu()
  {
    return this.KE != null;
  }
  
  public final boolean isActionViewExpanded()
  {
    return this.KK;
  }
  
  public final boolean isCheckable()
  {
    return (this.tu & 0x1) == 1;
  }
  
  public final boolean isChecked()
  {
    return (this.tu & 0x2) == 2;
  }
  
  public final boolean isEnabled()
  {
    return (this.tu & 0x10) != 0;
  }
  
  public final boolean isVisible()
  {
    if ((this.KI != null) && (this.KI.overridesItemVisibility())) {
      if (((this.tu & 0x8) != 0) || (!this.KI.isVisible())) {}
    }
    while ((this.tu & 0x8) == 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.Jv == paramChar) {
      return this;
    }
    this.Jv = Character.toLowerCase(paramChar);
    this.dn.h(false);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int j = this.tu;
    int k = this.tu;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.tu = (i | k & 0xFFFFFFFE);
      if (j != this.tu) {
        this.dn.h(false);
      }
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    if ((this.tu & 0x4) != 0)
    {
      f localf = this.dn;
      int j = getGroupId();
      int k = localf.dw.size();
      int i = 0;
      if (i < k)
      {
        h localh = (h)localf.dw.get(i);
        if ((localh.getGroupId() == j) && (localh.dF()) && (localh.isCheckable())) {
          if (localh != this) {
            break label100;
          }
        }
        label100:
        for (paramBoolean = true;; paramBoolean = false)
        {
          localh.F(paramBoolean);
          i += 1;
          break;
        }
      }
    }
    else
    {
      F(paramBoolean);
    }
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (this.tu |= 0x10;; this.tu &= 0xFFFFFFEF)
    {
      this.dn.h(false);
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    this.Jw = null;
    this.Jx = paramInt;
    this.dn.h(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    this.Jx = 0;
    this.Jw = paramDrawable;
    this.dn.h(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    this.Jt = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (this.Ju == paramChar) {
      return this;
    }
    this.Ju = paramChar;
    this.dn.h(false);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.Jy = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.Ju = paramChar1;
    this.Jv = Character.toLowerCase(paramChar2);
    this.dn.h(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    switch (paramInt & 0x3)
    {
    default: 
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    this.KG = paramInt;
    this.dn.dx();
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    return setTitle(this.dn.mContext.getString(paramInt));
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.tX = paramCharSequence;
    this.dn.h(false);
    if (this.KE != null) {
      this.KE.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.Js = paramCharSequence;
    this.dn.h(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    if (G(paramBoolean)) {
      this.dn.dw();
    }
    return this;
  }
  
  public final String toString()
  {
    if (this.tX != null) {
      return this.tX.toString();
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */