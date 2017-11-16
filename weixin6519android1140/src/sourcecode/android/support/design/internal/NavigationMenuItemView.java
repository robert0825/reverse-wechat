package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.a.b;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.v4.b.a.a;
import android.support.v4.widget.r;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.m.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView
  extends ForegroundLinearLayout
  implements m.a
{
  private static final int[] dd = { 16842912 };
  private final int de;
  final CheckedTextView dg;
  FrameLayout dh;
  h di;
  ColorStateList dj;
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(a.f.aI, this, true);
    this.de = paramContext.getResources().getDimensionPixelSize(a.d.am);
    this.dg = ((CheckedTextView)findViewById(a.e.au));
    this.dg.setDuplicateParentStateEnabled(true);
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final void a(h paramh)
  {
    this.di = paramh;
    int i;
    Object localObject;
    if (paramh.isVisible())
    {
      i = 0;
      setVisibility(i);
      if (getBackground() == null)
      {
        TypedValue localTypedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.b.colorControlHighlight, localTypedValue, true)) {
          break label220;
        }
        localObject = new StateListDrawable();
        ((StateListDrawable)localObject).addState(dd, new ColorDrawable(localTypedValue.data));
        ((StateListDrawable)localObject).addState(EMPTY_STATE_SET, new ColorDrawable(0));
      }
    }
    for (;;)
    {
      setBackgroundDrawable((Drawable)localObject);
      paramh.isCheckable();
      refreshDrawableState();
      boolean bool = paramh.isChecked();
      refreshDrawableState();
      this.dg.setChecked(bool);
      setEnabled(paramh.isEnabled());
      localObject = paramh.getTitle();
      this.dg.setText((CharSequence)localObject);
      setIcon(paramh.getIcon());
      paramh = paramh.getActionView();
      if (this.dh == null) {
        this.dh = ((FrameLayout)((ViewStub)findViewById(a.e.at)).inflate());
      }
      this.dh.removeAllViews();
      if (paramh != null) {
        this.dh.addView(paramh);
      }
      return;
      i = 8;
      break;
      label220:
      localObject = null;
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((this.di != null) && (this.di.isCheckable()) && (this.di.isChecked())) {
      mergeDrawableStates(arrayOfInt, dd);
    }
    return arrayOfInt;
  }
  
  public final void setIcon(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = paramDrawable.getConstantState();
      if (localObject != null) {
        break label54;
      }
    }
    for (;;)
    {
      localObject = a.g(paramDrawable).mutate();
      ((Drawable)localObject).setBounds(0, 0, this.de, this.de);
      a.a((Drawable)localObject, this.dj);
      r.a(this.dg, (Drawable)localObject);
      return;
      label54:
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
    }
  }
  
  public final h z()
  {
    return this.di;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\internal\NavigationMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */