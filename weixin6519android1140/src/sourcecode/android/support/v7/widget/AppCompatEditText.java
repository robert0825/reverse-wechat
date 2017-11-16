package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.EditText;

public class AppCompatEditText
  extends EditText
  implements x
{
  private h Oc = h.ex();
  private f Od = new f(this, this.Oc);
  private l Oe;
  
  public AppCompatEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.editTextStyle);
  }
  
  public AppCompatEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.q(paramContext), paramAttributeSet, paramInt);
    this.Od.a(paramAttributeSet, paramInt);
    this.Oe = l.d(this);
    this.Oe.a(paramAttributeSet, paramInt);
    this.Oe.eA();
  }
  
  public final void a(PorterDuff.Mode paramMode)
  {
    if (this.Od != null) {
      this.Od.a(paramMode);
    }
  }
  
  public final ColorStateList bK()
  {
    if (this.Od != null) {
      return this.Od.bK();
    }
    return null;
  }
  
  public final PorterDuff.Mode bL()
  {
    if (this.Od != null) {
      return this.Od.bL();
    }
    return null;
  }
  
  public final void d(ColorStateList paramColorStateList)
  {
    if (this.Od != null) {
      this.Od.d(paramColorStateList);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Od != null) {
      this.Od.eu();
    }
    if (this.Oe != null) {
      this.Oe.eA();
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.Od != null) {
      this.Od.f(null);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.Od != null) {
      this.Od.aK(paramInt);
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.Oe != null) {
      this.Oe.h(paramContext, paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\AppCompatEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */