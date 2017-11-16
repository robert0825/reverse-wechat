package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

final class m
  extends l
{
  private static final int[] Pn = { 16843666, 16843667 };
  private an Po;
  private an Pp;
  
  m(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    Context localContext = this.Pi.getContext();
    h localh = h.ex();
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, Pn, paramInt, 0);
    if (paramAttributeSet.hasValue(0)) {
      this.Po = a(localContext, localh, paramAttributeSet.getResourceId(0, 0));
    }
    if (paramAttributeSet.hasValue(1)) {
      this.Pp = a(localContext, localh, paramAttributeSet.getResourceId(1, 0));
    }
    paramAttributeSet.recycle();
  }
  
  final void eA()
  {
    super.eA();
    if ((this.Po != null) || (this.Pp != null))
    {
      Drawable[] arrayOfDrawable = this.Pi.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.Po);
      a(arrayOfDrawable[2], this.Pp);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */