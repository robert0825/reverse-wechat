package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v4.widget.t;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class AppCompatRadioButton
  extends RadioButton
  implements t
{
  private h Oc = h.ex();
  private g Oi = new g(this, this.Oc);
  
  public AppCompatRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.radioButtonStyle);
  }
  
  public AppCompatRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.q(paramContext), paramAttributeSet, paramInt);
    this.Oi.a(paramAttributeSet, paramInt);
  }
  
  public final void b(PorterDuff.Mode paramMode)
  {
    if (this.Oi != null) {
      this.Oi.b(paramMode);
    }
  }
  
  public final void e(ColorStateList paramColorStateList)
  {
    if (this.Oi != null) {
      this.Oi.e(paramColorStateList);
    }
  }
  
  public int getCompoundPaddingLeft()
  {
    int j = super.getCompoundPaddingLeft();
    int i = j;
    if (this.Oi != null) {
      i = this.Oi.aL(j);
    }
    return i;
  }
  
  public void setButtonDrawable(int paramInt)
  {
    if (this.Oc != null) {}
    for (Drawable localDrawable = this.Oc.a(getContext(), paramInt, false);; localDrawable = a.b(getContext(), paramInt))
    {
      setButtonDrawable(localDrawable);
      return;
    }
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    if (this.Oi != null) {
      this.Oi.ev();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\AppCompatRadioButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */