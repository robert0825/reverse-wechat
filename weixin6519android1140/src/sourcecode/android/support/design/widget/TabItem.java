package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.design.a.i;
import android.support.v7.widget.ap;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem
  extends View
{
  final Drawable jd;
  final int je;
  final CharSequence mText;
  
  public TabItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = ap.a(paramContext, paramAttributeSet, a.i.cp);
    this.mText = paramContext.getText(a.i.ct);
    this.jd = paramContext.getDrawable(a.i.cq);
    this.je = paramContext.getResourceId(a.i.cs, 0);
    paramContext.Yu.recycle();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\TabItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */