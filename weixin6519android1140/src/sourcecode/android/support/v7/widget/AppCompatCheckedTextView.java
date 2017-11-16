package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView
  extends CheckedTextView
{
  private static final int[] JQ = { 16843016 };
  private h Oc;
  private l Oe = l.d(this);
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.q(paramContext), paramAttributeSet, paramInt);
    this.Oe.a(paramAttributeSet, paramInt);
    this.Oe.eA();
    this.Oc = h.ex();
    paramContext = ap.a(getContext(), paramAttributeSet, JQ, paramInt);
    setCheckMarkDrawable(paramContext.getDrawable(0));
    paramContext.Yu.recycle();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Oe != null) {
      this.Oe.eA();
    }
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    if (this.Oc != null)
    {
      setCheckMarkDrawable(this.Oc.a(getContext(), paramInt, false));
      return;
    }
    super.setCheckMarkDrawable(paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.Oe != null) {
      this.Oe.h(paramContext, paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\AppCompatCheckedTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */