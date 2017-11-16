package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class k
  extends j
{
  private static final int[] JQ = { 16843074 };
  private final SeekBar OP;
  
  k(SeekBar paramSeekBar, h paramh)
  {
    super(paramSeekBar, paramh);
    this.OP = paramSeekBar;
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    paramAttributeSet = ap.a(this.OP.getContext(), paramAttributeSet, JQ, paramInt);
    Drawable localDrawable = paramAttributeSet.bG(0);
    if (localDrawable != null) {
      this.OP.setThumb(localDrawable);
    }
    paramAttributeSet.Yu.recycle();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */