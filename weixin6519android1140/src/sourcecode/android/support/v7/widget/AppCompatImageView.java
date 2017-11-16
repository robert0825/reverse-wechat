package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView
  extends ImageView
  implements x
{
  private f Od;
  private i hh;
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.q(paramContext), paramAttributeSet, paramInt);
    paramContext = h.ex();
    this.Od = new f(this, paramContext);
    this.Od.a(paramAttributeSet, paramInt);
    this.hh = new i(this, paramContext);
    this.hh.a(paramAttributeSet, paramInt);
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
  
  public void setImageResource(int paramInt)
  {
    this.hh.setImageResource(paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\AppCompatImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */