package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.an;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.e;
import android.support.v7.a.a.f;
import android.support.v7.a.a.i;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.ImageButton;
import android.widget.TextView;

public final class aq
  implements u
{
  public Window.Callback GY;
  private ActionMenuPresenter Lq;
  private final h Oc;
  private int Zf;
  private View Zg;
  private Drawable Zh;
  private Drawable Zi;
  private boolean Zj;
  private CharSequence Zk;
  public boolean Zl;
  private int Zm = 0;
  private int Zn = 0;
  private Drawable Zo;
  public Toolbar fO;
  private View jQ;
  private Drawable jd;
  public CharSequence tX;
  private CharSequence tY;
  
  public aq(Toolbar paramToolbar)
  {
    this(paramToolbar, true, a.i.abc_action_bar_up_description, a.e.abc_ic_ab_back_mtrl_am_alpha);
  }
  
  private aq(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.fO = paramToolbar;
    this.tX = paramToolbar.YM;
    this.tY = paramToolbar.YN;
    Object localObject1;
    if (this.tX != null)
    {
      paramBoolean = true;
      this.Zj = paramBoolean;
      if (paramToolbar.Yx == null) {
        break label662;
      }
      localObject1 = paramToolbar.Yx.getDrawable();
      label68:
      this.Zi = ((Drawable)localObject1);
      paramToolbar = ap.a(paramToolbar.getContext(), null, a.k.ActionBar, a.a.actionBarStyle);
      localObject1 = paramToolbar.getText(a.k.ActionBar_title);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        this.Zj = true;
        j((CharSequence)localObject1);
      }
      localObject1 = paramToolbar.getText(a.k.ActionBar_subtitle);
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        this.tY = ((CharSequence)localObject1);
        if ((this.Zf & 0x8) != 0) {
          this.fO.setSubtitle((CharSequence)localObject1);
        }
      }
      localObject1 = paramToolbar.getDrawable(a.k.ActionBar_logo);
      if (localObject1 != null) {
        setLogo((Drawable)localObject1);
      }
      localObject1 = paramToolbar.getDrawable(a.k.ActionBar_icon);
      if ((this.Zi == null) && (localObject1 != null)) {
        setIcon((Drawable)localObject1);
      }
      localObject1 = paramToolbar.getDrawable(a.k.ActionBar_homeAsUpIndicator);
      if (localObject1 != null)
      {
        this.Zi = ((Drawable)localObject1);
        ha();
      }
      setDisplayOptions(paramToolbar.getInt(a.k.ActionBar_displayOptions, 0));
      int i = paramToolbar.getResourceId(a.k.ActionBar_customNavigationLayout, 0);
      if (i != 0)
      {
        setCustomView(LayoutInflater.from(this.fO.getContext()).inflate(i, this.fO, false));
        setDisplayOptions(this.Zf | 0x10);
      }
      i = paramToolbar.getLayoutDimension(a.k.ActionBar_height, 0);
      if (i > 0)
      {
        localObject1 = this.fO.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject1).height = i;
        this.fO.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      int j = paramToolbar.getDimensionPixelOffset(a.k.ActionBar_contentInsetStart, -1);
      i = paramToolbar.getDimensionPixelOffset(a.k.ActionBar_contentInsetEnd, -1);
      if ((j >= 0) || (i >= 0))
      {
        localObject1 = this.fO;
        j = Math.max(j, 0);
        i = Math.max(i, 0);
        ((Toolbar)localObject1).YL.ac(j, i);
      }
      i = paramToolbar.getResourceId(a.k.ActionBar_titleTextStyle, 0);
      Context localContext;
      if (i != 0)
      {
        localObject1 = this.fO;
        localContext = this.fO.getContext();
        ((Toolbar)localObject1).YD = i;
        if (((Toolbar)localObject1).Yv != null) {
          ((Toolbar)localObject1).Yv.setTextAppearance(localContext, i);
        }
      }
      i = paramToolbar.getResourceId(a.k.ActionBar_subtitleTextStyle, 0);
      if (i != 0)
      {
        localObject1 = this.fO;
        localContext = this.fO.getContext();
        ((Toolbar)localObject1).YE = i;
        if (((Toolbar)localObject1).Yw != null) {
          ((Toolbar)localObject1).Yw.setTextAppearance(localContext, i);
        }
      }
      i = paramToolbar.getResourceId(a.k.ActionBar_popupTheme, 0);
      if (i != 0) {
        this.fO.setPopupTheme(i);
      }
      paramToolbar.Yu.recycle();
      this.Oc = h.ex();
      if (paramInt1 != this.Zn)
      {
        this.Zn = paramInt1;
        if (TextUtils.isEmpty(this.fO.getNavigationContentDescription()))
        {
          paramInt1 = this.Zn;
          if (paramInt1 != 0) {
            break label668;
          }
        }
      }
    }
    label662:
    label668:
    for (paramToolbar = (Toolbar)localObject2;; paramToolbar = this.fO.getContext().getString(paramInt1))
    {
      this.Zk = paramToolbar;
      gZ();
      this.Zk = this.fO.getNavigationContentDescription();
      paramToolbar = this.Oc.a(this.fO.getContext(), paramInt2, false);
      if (this.Zo != paramToolbar)
      {
        this.Zo = paramToolbar;
        ha();
      }
      this.fO.setNavigationOnClickListener(new View.OnClickListener()
      {
        final a Zp = new a(aq.this.fO.getContext(), aq.this.tX);
        
        public final void onClick(View paramAnonymousView)
        {
          if ((aq.this.GY != null) && (aq.this.Zl)) {
            aq.this.GY.onMenuItemSelected(0, this.Zp);
          }
        }
      });
      return;
      paramBoolean = false;
      break;
      localObject1 = null;
      break label68;
    }
  }
  
  private void gY()
  {
    Drawable localDrawable = null;
    if ((this.Zf & 0x2) != 0)
    {
      if ((this.Zf & 0x1) == 0) {
        break label49;
      }
      if (this.Zh == null) {
        break label41;
      }
      localDrawable = this.Zh;
    }
    for (;;)
    {
      this.fO.setLogo(localDrawable);
      return;
      label41:
      localDrawable = this.jd;
      continue;
      label49:
      localDrawable = this.jd;
    }
  }
  
  private void gZ()
  {
    Toolbar localToolbar;
    int i;
    if ((this.Zf & 0x4) != 0)
    {
      if (!TextUtils.isEmpty(this.Zk)) {
        break label53;
      }
      localToolbar = this.fO;
      i = this.Zn;
      if (i == 0) {
        break label48;
      }
    }
    label48:
    for (CharSequence localCharSequence = localToolbar.getContext().getText(i);; localCharSequence = null)
    {
      localToolbar.setNavigationContentDescription(localCharSequence);
      return;
    }
    label53:
    this.fO.setNavigationContentDescription(this.Zk);
  }
  
  private void ha()
  {
    Toolbar localToolbar;
    if ((this.Zf & 0x4) != 0)
    {
      localToolbar = this.fO;
      if (this.Zi == null) {
        break label32;
      }
    }
    label32:
    for (Drawable localDrawable = this.Zi;; localDrawable = this.Zo)
    {
      localToolbar.setNavigationIcon(localDrawable);
      return;
    }
  }
  
  private void j(CharSequence paramCharSequence)
  {
    this.tX = paramCharSequence;
    if ((this.Zf & 0x8) != 0) {
      this.fO.setTitle(paramCharSequence);
    }
  }
  
  private void setIcon(Drawable paramDrawable)
  {
    this.jd = paramDrawable;
    gY();
  }
  
  public final void N(boolean paramBoolean)
  {
    Toolbar localToolbar = this.fO;
    localToolbar.YY = paramBoolean;
    localToolbar.requestLayout();
  }
  
  public final void a(l.a parama, f.a parama1)
  {
    Toolbar localToolbar = this.fO;
    localToolbar.MS = parama;
    localToolbar.MT = parama1;
    if (localToolbar.Lp != null) {
      localToolbar.Lp.a(parama, parama1);
    }
  }
  
  public final void a(Menu paramMenu, l.a parama)
  {
    if (this.Lq == null)
    {
      this.Lq = new ActionMenuPresenter(this.fO.getContext());
      this.Lq.mId = a.f.action_menu_presenter;
    }
    this.Lq.dm = parama;
    this.fO.a((f)paramMenu, this.Lq);
  }
  
  public final void b(ai paramai)
  {
    if ((this.Zg != null) && (this.Zg.getParent() == this.fO)) {
      this.fO.removeView(this.Zg);
    }
    this.Zg = paramai;
    if ((paramai != null) && (this.Zm == 2))
    {
      this.fO.addView(this.Zg, 0);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)this.Zg.getLayoutParams();
      localLayoutParams.width = -2;
      localLayoutParams.height = -2;
      localLayoutParams.gravity = 8388691;
      paramai.VD = true;
    }
  }
  
  public final void b(Window.Callback paramCallback)
  {
    this.GY = paramCallback;
  }
  
  public final android.support.v4.view.ai c(final int paramInt, long paramLong)
  {
    android.support.v4.view.ai localai = z.V(this.fO);
    if (paramInt == 0) {}
    for (float f = 1.0F;; f = 0.0F) {
      localai.p(f).d(paramLong).a(new an()
      {
        private boolean Lv = false;
        
        public final void as(View paramAnonymousView)
        {
          this.Lv = true;
        }
        
        public final void p(View paramAnonymousView)
        {
          aq.this.fO.setVisibility(0);
        }
        
        public final void q(View paramAnonymousView)
        {
          if (!this.Lv) {
            aq.this.fO.setVisibility(paramInt);
          }
        }
      });
    }
  }
  
  public final void collapseActionView()
  {
    this.fO.collapseActionView();
  }
  
  public final boolean dS()
  {
    Toolbar localToolbar = this.fO;
    return (localToolbar.getVisibility() == 0) && (localToolbar.Lp != null) && (localToolbar.Lp.Ms);
  }
  
  public final boolean dT()
  {
    Object localObject = this.fO;
    if (((Toolbar)localObject).Lp != null)
    {
      localObject = ((Toolbar)localObject).Lp;
      if (((ActionMenuView)localObject).MR != null)
      {
        localObject = ((ActionMenuView)localObject).MR;
        if ((((ActionMenuPresenter)localObject).MG != null) || (((ActionMenuPresenter)localObject).isOverflowMenuShowing()))
        {
          i = 1;
          if (i == 0) {
            break label62;
          }
        }
      }
      label62:
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label67;
        }
        return true;
        i = 0;
        break;
      }
    }
    label67:
    return false;
  }
  
  public final void dU()
  {
    this.Zl = true;
  }
  
  public final void dismissPopupMenus()
  {
    Toolbar localToolbar = this.fO;
    if (localToolbar.Lp != null) {
      localToolbar.Lp.dismissPopupMenus();
    }
  }
  
  public final void e(CharSequence paramCharSequence)
  {
    if (!this.Zj) {
      j(paramCharSequence);
    }
  }
  
  public final ViewGroup eH()
  {
    return this.fO;
  }
  
  public final Context getContext()
  {
    return this.fO.getContext();
  }
  
  public final View getCustomView()
  {
    return this.jQ;
  }
  
  public final int getDisplayOptions()
  {
    return this.Zf;
  }
  
  public final int getHeight()
  {
    return this.fO.getHeight();
  }
  
  public final Menu getMenu()
  {
    return this.fO.getMenu();
  }
  
  public final int getNavigationMode()
  {
    return this.Zm;
  }
  
  public final CharSequence getTitle()
  {
    return this.fO.YM;
  }
  
  public final int getVisibility()
  {
    return this.fO.getVisibility();
  }
  
  public final boolean hasExpandedActionView()
  {
    Toolbar localToolbar = this.fO;
    return (localToolbar.YX != null) && (localToolbar.YX.Zb != null);
  }
  
  public final boolean hideOverflowMenu()
  {
    Object localObject = this.fO;
    if (((Toolbar)localObject).Lp != null)
    {
      localObject = ((Toolbar)localObject).Lp;
      if ((((ActionMenuView)localObject).MR != null) && (((ActionMenuView)localObject).MR.hideOverflowMenu())) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean isOverflowMenuShowing()
  {
    return this.fO.isOverflowMenuShowing();
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.fO.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setCustomView(View paramView)
  {
    if ((this.jQ != null) && ((this.Zf & 0x10) != 0)) {
      this.fO.removeView(this.jQ);
    }
    this.jQ = paramView;
    if ((paramView != null) && ((this.Zf & 0x10) != 0)) {
      this.fO.addView(this.jQ);
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    int i = this.Zf ^ paramInt;
    this.Zf = paramInt;
    if (i != 0)
    {
      if ((i & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0) {
          break label115;
        }
        ha();
        gZ();
      }
      if ((i & 0x3) != 0) {
        gY();
      }
      if ((i & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0) {
          break label126;
        }
        this.fO.setTitle(this.tX);
        this.fO.setSubtitle(this.tY);
      }
    }
    for (;;)
    {
      if (((i & 0x10) != 0) && (this.jQ != null))
      {
        if ((paramInt & 0x10) == 0) {
          break label145;
        }
        this.fO.addView(this.jQ);
      }
      return;
      label115:
      this.fO.setNavigationIcon(null);
      break;
      label126:
      this.fO.setTitle(null);
      this.fO.setSubtitle(null);
    }
    label145:
    this.fO.removeView(this.jQ);
  }
  
  public final void setIcon(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = this.Oc.a(this.fO.getContext(), paramInt, false);; localDrawable = null)
    {
      setIcon(localDrawable);
      return;
    }
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    this.Zh = paramDrawable;
    gY();
  }
  
  public final void setVisibility(int paramInt)
  {
    this.fO.setVisibility(paramInt);
  }
  
  public final boolean showOverflowMenu()
  {
    return this.fO.showOverflowMenu();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */