package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.view.ap;
import android.support.v4.view.t;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout
  extends FrameLayout
{
  private Drawable dD;
  private Rect dE;
  private Rect dF = new Rect();
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.ch, paramInt, a.h.aS);
    this.dD = paramContext.getDrawable(a.i.ci);
    paramContext.recycle();
    setWillNotDraw(true);
    z.b(this, new t()
    {
      public final ap a(View paramAnonymousView, ap paramAnonymousap)
      {
        if (ScrimInsetsFrameLayout.a(ScrimInsetsFrameLayout.this) == null) {
          ScrimInsetsFrameLayout.a(ScrimInsetsFrameLayout.this, new Rect());
        }
        ScrimInsetsFrameLayout.a(ScrimInsetsFrameLayout.this).set(paramAnonymousap.getSystemWindowInsetLeft(), paramAnonymousap.getSystemWindowInsetTop(), paramAnonymousap.getSystemWindowInsetRight(), paramAnonymousap.getSystemWindowInsetBottom());
        ScrimInsetsFrameLayout.this.a(ScrimInsetsFrameLayout.a(ScrimInsetsFrameLayout.this));
        paramAnonymousView = ScrimInsetsFrameLayout.this;
        if ((ScrimInsetsFrameLayout.a(ScrimInsetsFrameLayout.this).isEmpty()) || (ScrimInsetsFrameLayout.b(ScrimInsetsFrameLayout.this) == null)) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.setWillNotDraw(bool);
          z.F(ScrimInsetsFrameLayout.this);
          return paramAnonymousap.bZ();
        }
      }
    });
  }
  
  public void a(Rect paramRect) {}
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    if ((this.dE != null) && (this.dD != null))
    {
      int k = paramCanvas.save();
      paramCanvas.translate(getScrollX(), getScrollY());
      this.dF.set(0, 0, i, this.dE.top);
      this.dD.setBounds(this.dF);
      this.dD.draw(paramCanvas);
      this.dF.set(0, j - this.dE.bottom, i, j);
      this.dD.setBounds(this.dF);
      this.dD.draw(paramCanvas);
      this.dF.set(0, this.dE.top, this.dE.left, j - this.dE.bottom);
      this.dD.setBounds(this.dF);
      this.dD.draw(paramCanvas);
      this.dF.set(i - this.dE.right, this.dE.top, i, j - this.dE.bottom);
      this.dD.setBounds(this.dF);
      this.dD.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.dD != null) {
      this.dD.setCallback(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.dD != null) {
      this.dD.setCallback(null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\internal\ScrimInsetsFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */