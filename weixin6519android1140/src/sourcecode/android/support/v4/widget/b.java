package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.util.DisplayMetrics;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class b
  extends ImageView
{
  Animation.AnimationListener Ao;
  private int Ap;
  
  public b(Context paramContext)
  {
    super(paramContext);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = (int)(20.0F * f * 2.0F);
    int j = (int)(1.75F * f);
    int k = (int)(0.0F * f);
    this.Ap = ((int)(3.5F * f));
    if (cj())
    {
      paramContext = new ShapeDrawable(new OvalShape());
      z.g(this, f * 4.0F);
    }
    for (;;)
    {
      paramContext.getPaint().setColor(-328966);
      setBackgroundDrawable(paramContext);
      return;
      paramContext = new ShapeDrawable(new a(this.Ap, i));
      z.a(this, 1, paramContext.getPaint());
      paramContext.getPaint().setShadowLayer(this.Ap, k, j, 503316480);
      i = this.Ap;
      setPadding(i, i, i, i);
    }
  }
  
  private static boolean cj()
  {
    return Build.VERSION.SDK_INT >= 21;
  }
  
  public final void onAnimationEnd()
  {
    super.onAnimationEnd();
    if (this.Ao != null) {
      this.Ao.onAnimationEnd(getAnimation());
    }
  }
  
  public final void onAnimationStart()
  {
    super.onAnimationStart();
    if (this.Ao != null) {
      this.Ao.onAnimationStart(getAnimation());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!cj()) {
      setMeasuredDimension(getMeasuredWidth() + this.Ap * 2, getMeasuredHeight() + this.Ap * 2);
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable)) {
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
    }
  }
  
  private final class a
    extends OvalShape
  {
    private RadialGradient Aq;
    private Paint Ar = new Paint();
    private int As;
    
    public a(int paramInt1, int paramInt2)
    {
      b.a(b.this, paramInt1);
      this.As = paramInt2;
      float f1 = this.As / 2;
      float f2 = this.As / 2;
      float f3 = b.a(b.this);
      this$1 = Shader.TileMode.CLAMP;
      this.Aq = new RadialGradient(f1, f2, f3, new int[] { 1023410176, 0 }, null, b.this);
      this.Ar.setShader(this.Aq);
    }
    
    public final void draw(Canvas paramCanvas, Paint paramPaint)
    {
      int i = b.this.getWidth();
      int j = b.this.getHeight();
      paramCanvas.drawCircle(i / 2, j / 2, this.As / 2 + b.a(b.this), this.Ar);
      paramCanvas.drawCircle(i / 2, j / 2, this.As / 2, paramPaint);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */