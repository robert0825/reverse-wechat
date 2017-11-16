package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class e
  extends b
  implements f.a
{
  private b.a HS;
  private WeakReference<View> HT;
  private ActionBarContextView Hv;
  private boolean Iw;
  private f dn;
  private Context mContext;
  private boolean mFinished;
  
  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.Hv = paramActionBarContextView;
    this.HS = parama;
    paramContext = new f(paramActionBarContextView.getContext());
    paramContext.Ko = 1;
    this.dn = paramContext;
    this.dn.a(this);
    this.Iw = paramBoolean;
  }
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    return this.HS.a(this, paramMenuItem);
  }
  
  public final void b(f paramf)
  {
    invalidate();
    this.Hv.showOverflowMenu();
  }
  
  public final void finish()
  {
    if (this.mFinished) {
      return;
    }
    this.mFinished = true;
    this.Hv.sendAccessibilityEvent(32);
    this.HS.a(this);
  }
  
  public final View getCustomView()
  {
    if (this.HT != null) {
      return (View)this.HT.get();
    }
    return null;
  }
  
  public final Menu getMenu()
  {
    return this.dn;
  }
  
  public final MenuInflater getMenuInflater()
  {
    return new g(this.Hv.getContext());
  }
  
  public final CharSequence getSubtitle()
  {
    return this.Hv.tY;
  }
  
  public final CharSequence getTitle()
  {
    return this.Hv.tX;
  }
  
  public final void invalidate()
  {
    this.HS.b(this, this.dn);
  }
  
  public final boolean isTitleOptional()
  {
    return this.Hv.LM;
  }
  
  public final void setCustomView(View paramView)
  {
    this.Hv.setCustomView(paramView);
    if (paramView != null) {}
    for (paramView = new WeakReference(paramView);; paramView = null)
    {
      this.HT = paramView;
      return;
    }
  }
  
  public final void setSubtitle(int paramInt)
  {
    setSubtitle(this.mContext.getString(paramInt));
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.Hv.setSubtitle(paramCharSequence);
  }
  
  public final void setTitle(int paramInt)
  {
    setTitle(this.mContext.getString(paramInt));
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.Hv.setTitle(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.Hv.K(paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */