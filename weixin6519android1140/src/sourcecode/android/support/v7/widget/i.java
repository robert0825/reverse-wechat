package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class i
{
  private final ImageView OE;
  private final h Oc;
  
  public i(ImageView paramImageView, h paramh)
  {
    this.OE = paramImageView;
    this.Oc = paramh;
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = ap.a(this.OE.getContext(), paramAttributeSet, a.k.AppCompatImageView, paramInt);
    try
    {
      Drawable localDrawable = paramAttributeSet.bG(a.k.AppCompatImageView_android_src);
      if (localDrawable != null) {
        this.OE.setImageDrawable(localDrawable);
      }
      paramInt = paramAttributeSet.getResourceId(a.k.AppCompatImageView_srcCompat, -1);
      if (paramInt != -1)
      {
        localDrawable = this.Oc.a(this.OE.getContext(), paramInt, false);
        if (localDrawable != null) {
          this.OE.setImageDrawable(localDrawable);
        }
      }
      localDrawable = this.OE.getDrawable();
      if (localDrawable != null) {
        w.n(localDrawable);
      }
      return;
    }
    finally
    {
      paramAttributeSet.Yu.recycle();
    }
  }
  
  public final void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.Oc != null) {}
      for (Drawable localDrawable = this.Oc.a(this.OE.getContext(), paramInt, false);; localDrawable = a.b(this.OE.getContext(), paramInt))
      {
        if (localDrawable != null) {
          w.n(localDrawable);
        }
        this.OE.setImageDrawable(localDrawable);
        return;
      }
    }
    this.OE.setImageDrawable(null);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */