package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v7.a.a.g;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.f;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a
  extends ViewGroup
{
  protected final a Ln = new a();
  protected final Context Lo;
  protected ActionMenuView Lp;
  protected ActionMenuPresenter Lq;
  protected int Lr;
  protected ai Ls;
  private boolean Lt;
  private boolean Lu;
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(android.support.v7.a.a.a.actionBarPopupTheme, paramAttributeSet, true)) && (paramAttributeSet.resourceId != 0))
    {
      this.Lo = new ContextThemeWrapper(paramContext, paramAttributeSet.resourceId);
      return;
    }
    this.Lo = paramContext;
  }
  
  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    }
    for (;;)
    {
      paramInt1 = i;
      if (paramBoolean) {
        paramInt1 = -i;
      }
      return paramInt1;
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
  }
  
  protected static int b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramInt1 - paramInt2;
    }
    return paramInt1 + paramInt2;
  }
  
  protected static int g(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() + 0);
  }
  
  public void ay(int paramInt)
  {
    this.Lr = paramInt;
    requestLayout();
  }
  
  public ai c(int paramInt, long paramLong)
  {
    if (this.Ls != null) {
      this.Ls.cancel();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        z.d(this, 0.0F);
      }
      localai = z.V(this).p(1.0F);
      localai.d(paramLong);
      localai.a(this.Ln.a(localai, paramInt));
      return localai;
    }
    ai localai = z.V(this).p(0.0F);
    localai.d(paramLong);
    localai.a(this.Ln.a(localai, paramInt));
    return localai;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = getContext().obtainStyledAttributes(null, a.k.ActionBar, android.support.v7.a.a.a.actionBarStyle, 0);
    ay(paramConfiguration.getLayoutDimension(a.k.ActionBar_height, 0));
    paramConfiguration.recycle();
    if (this.Lq != null)
    {
      paramConfiguration = this.Lq;
      if (!paramConfiguration.Mx) {
        paramConfiguration.Mw = paramConfiguration.mContext.getResources().getInteger(a.g.abc_max_action_buttons);
      }
      if (paramConfiguration.dn != null) {
        paramConfiguration.dn.h(true);
      }
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 9) {
      this.Lu = false;
    }
    if (!this.Lu)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        this.Lu = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      this.Lu = false;
    }
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      this.Lt = false;
    }
    if (!this.Lt)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        this.Lt = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      this.Lt = false;
    }
    return true;
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      if (this.Ls != null) {
        this.Ls.cancel();
      }
      super.setVisibility(paramInt);
    }
  }
  
  public boolean showOverflowMenu()
  {
    if (this.Lq != null) {
      return this.Lq.showOverflowMenu();
    }
    return false;
  }
  
  protected final class a
    implements am
  {
    private boolean Lv = false;
    int Lw;
    
    protected a() {}
    
    public final a a(ai paramai, int paramInt)
    {
      a.this.Ls = paramai;
      this.Lw = paramInt;
      return this;
    }
    
    public final void as(View paramView)
    {
      this.Lv = true;
    }
    
    public final void p(View paramView)
    {
      a.a(a.this);
      this.Lv = false;
    }
    
    public final void q(View paramView)
    {
      if (this.Lv) {
        return;
      }
      a.this.Ls = null;
      a.a(a.this, this.Lw);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */