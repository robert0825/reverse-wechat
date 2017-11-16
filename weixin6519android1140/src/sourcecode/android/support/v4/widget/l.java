package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.view.b.b;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

final class l
  extends Drawable
  implements Animatable
{
  private static final Interpolator BH = new b();
  private static final Interpolator dH = new LinearInterpolator();
  private final int[] BI = { -16777216 };
  final a BJ;
  private View BK;
  private float BL;
  private double BM;
  private double BN;
  boolean BO;
  private float eS;
  private final Drawable.Callback lj = new Drawable.Callback()
  {
    public final void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      l.this.invalidateSelf();
    }
    
    public final void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      l.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }
    
    public final void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      l.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };
  private final ArrayList<Animation> ln = new ArrayList();
  private Animation mAnimation;
  private Resources mResources;
  
  public l(final Context paramContext, View paramView)
  {
    this.BK = paramView;
    this.mResources = paramContext.getResources();
    this.BJ = new a(this.lj);
    paramContext = this.BJ;
    paramContext.BW = this.BI;
    paramContext.ah(0);
    paramContext = this.BJ;
    float f1 = this.mResources.getDisplayMetrics().density;
    this.BM = (f1 * 40.0D);
    this.BN = (f1 * 40.0D);
    float f2 = 2.5F * f1;
    paramContext.lH = f2;
    paramContext.mPaint.setStrokeWidth(f2);
    paramContext.invalidateSelf();
    paramContext.Ce = (8.75D * f1);
    paramContext.ah(0);
    paramContext.Cf = ((int)(10.0F * f1));
    paramContext.Cg = ((int)(f1 * 5.0F));
    f1 = Math.min((int)this.BM, (int)this.BN);
    if ((paramContext.Ce <= 0.0D) || (f1 < 0.0F)) {}
    for (f1 = (float)Math.ceil(paramContext.lH / 2.0F);; f1 = (float)(f1 / 2.0F - paramContext.Ce))
    {
      paramContext.BV = f1;
      paramContext = this.BJ;
      paramView = new Animation()
      {
        public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
        {
          if (l.this.BO)
          {
            l.a(l.this, paramAnonymousFloat, paramContext);
            return;
          }
          float f1 = l.b(paramContext);
          float f2 = paramContext.BZ;
          float f4 = paramContext.BY;
          float f3 = paramContext.Ca;
          l.b(l.this, paramAnonymousFloat, paramContext);
          if (paramAnonymousFloat <= 0.5F)
          {
            float f5 = paramAnonymousFloat / 0.5F;
            f5 = l.cr().getInterpolation(f5);
            paramContext.x(f4 + f5 * (0.8F - f1));
          }
          if (paramAnonymousFloat > 0.5F)
          {
            f4 = (paramAnonymousFloat - 0.5F) / 0.5F;
            f4 = l.cr().getInterpolation(f4);
            paramContext.y((0.8F - f1) * f4 + f2);
          }
          paramContext.setRotation(0.25F * paramAnonymousFloat + f3);
          f1 = l.a(l.this) / 5.0F;
          l.this.setRotation(216.0F * paramAnonymousFloat + 1080.0F * f1);
        }
      };
      paramView.setRepeatCount(-1);
      paramView.setRepeatMode(1);
      paramView.setInterpolator(dH);
      paramView.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation) {}
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          paramContext.ct();
          l.a locala = paramContext;
          locala.ah(locala.cs());
          paramContext.x(paramContext.BU);
          if (l.this.BO)
          {
            l.this.BO = false;
            paramAnonymousAnimation.setDuration(1332L);
            paramContext.v(false);
            return;
          }
          l.a(l.this, (l.a(l.this) + 1.0F) % 5.0F);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          l.a(l.this, 0.0F);
        }
      });
      this.mAnimation = paramView;
      return;
    }
  }
  
  private static float a(a parama)
  {
    return (float)Math.toRadians(parama.lH / (6.283185307179586D * parama.Ce));
  }
  
  private static void a(float paramFloat, a parama)
  {
    if (paramFloat > 0.75F)
    {
      paramFloat = (paramFloat - 0.75F) / 0.25F;
      int i = parama.BW[parama.BX];
      int n = parama.BW[parama.cs()];
      int m = Integer.valueOf(i).intValue();
      i = m >> 24 & 0xFF;
      int j = m >> 16 & 0xFF;
      int k = m >> 8 & 0xFF;
      m &= 0xFF;
      n = Integer.valueOf(n).intValue();
      int i1 = (int)(((n >> 24 & 0xFF) - i) * paramFloat);
      int i2 = (int)(((n >> 16 & 0xFF) - j) * paramFloat);
      int i3 = (int)(((n >> 8 & 0xFF) - k) * paramFloat);
      parama.tf = ((int)(paramFloat * ((n & 0xFF) - m)) + m | i + i1 << 24 | j + i2 << 16 | i3 + k << 8);
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i = paramCanvas.save();
    paramCanvas.rotate(this.eS, localRect.exactCenterX(), localRect.exactCenterY());
    a locala = this.BJ;
    RectF localRectF = locala.BR;
    localRectF.set(localRect);
    localRectF.inset(locala.BV, locala.BV);
    float f1 = 360.0F * (locala.BT + locala.eS);
    float f2 = (locala.BU + locala.eS) * 360.0F - f1;
    locala.mPaint.setColor(locala.tf);
    paramCanvas.drawArc(localRectF, f1, f2, false, locala.mPaint);
    if (locala.Cb)
    {
      if (locala.Cc != null) {
        break label436;
      }
      locala.Cc = new Path();
      locala.Cc.setFillType(Path.FillType.EVEN_ODD);
    }
    for (;;)
    {
      float f3 = (int)locala.BV / 2;
      float f4 = locala.Cd;
      float f5 = (float)(locala.Ce * Math.cos(0.0D) + localRect.exactCenterX());
      float f6 = (float)(locala.Ce * Math.sin(0.0D) + localRect.exactCenterY());
      locala.Cc.moveTo(0.0F, 0.0F);
      locala.Cc.lineTo(locala.Cf * locala.Cd, 0.0F);
      locala.Cc.lineTo(locala.Cf * locala.Cd / 2.0F, locala.Cg * locala.Cd);
      locala.Cc.offset(f5 - f3 * f4, f6);
      locala.Cc.close();
      locala.BS.setColor(locala.tf);
      paramCanvas.rotate(f1 + f2 - 5.0F, localRect.exactCenterX(), localRect.exactCenterY());
      paramCanvas.drawPath(locala.Cc, locala.BS);
      if (locala.Ch < 255)
      {
        locala.Ci.setColor(locala.Cj);
        locala.Ci.setAlpha(255 - locala.Ch);
        paramCanvas.drawCircle(localRect.exactCenterX(), localRect.exactCenterY(), localRect.width() / 2, locala.Ci);
      }
      paramCanvas.restoreToCount(i);
      return;
      label436:
      locala.Cc.reset();
    }
  }
  
  public final int getAlpha()
  {
    return this.BJ.Ch;
  }
  
  public final int getIntrinsicHeight()
  {
    return (int)this.BN;
  }
  
  public final int getIntrinsicWidth()
  {
    return (int)this.BM;
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final boolean isRunning()
  {
    ArrayList localArrayList = this.ln;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Animation localAnimation = (Animation)localArrayList.get(i);
      if ((localAnimation.hasStarted()) && (!localAnimation.hasEnded())) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.BJ.Ch = paramInt;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    a locala = this.BJ;
    locala.mPaint.setColorFilter(paramColorFilter);
    locala.invalidateSelf();
  }
  
  final void setRotation(float paramFloat)
  {
    this.eS = paramFloat;
    invalidateSelf();
  }
  
  public final void start()
  {
    this.mAnimation.reset();
    this.BJ.ct();
    if (this.BJ.BU != this.BJ.BT)
    {
      this.BO = true;
      this.mAnimation.setDuration(666L);
      this.BK.startAnimation(this.mAnimation);
      return;
    }
    this.BJ.ah(0);
    this.BJ.cu();
    this.mAnimation.setDuration(1332L);
    this.BK.startAnimation(this.mAnimation);
  }
  
  public final void stop()
  {
    this.BK.clearAnimation();
    setRotation(0.0F);
    this.BJ.v(false);
    this.BJ.ah(0);
    this.BJ.cu();
  }
  
  public final void u(boolean paramBoolean)
  {
    this.BJ.v(paramBoolean);
  }
  
  public final void v(float paramFloat)
  {
    a locala = this.BJ;
    if (paramFloat != locala.Cd)
    {
      locala.Cd = paramFloat;
      locala.invalidateSelf();
    }
  }
  
  public final void w(float paramFloat)
  {
    this.BJ.x(0.0F);
    this.BJ.y(paramFloat);
  }
  
  private static final class a
  {
    final RectF BR = new RectF();
    final Paint BS = new Paint();
    float BT = 0.0F;
    float BU = 0.0F;
    float BV = 2.5F;
    int[] BW;
    int BX;
    float BY;
    float BZ;
    float Ca;
    boolean Cb;
    Path Cc;
    float Cd;
    double Ce;
    int Cf;
    int Cg;
    int Ch;
    final Paint Ci = new Paint(1);
    int Cj;
    float eS = 0.0F;
    float lH = 5.0F;
    private final Drawable.Callback lj;
    final Paint mPaint = new Paint();
    int tf;
    
    public a(Drawable.Callback paramCallback)
    {
      this.lj = paramCallback;
      this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
      this.mPaint.setAntiAlias(true);
      this.mPaint.setStyle(Paint.Style.STROKE);
      this.BS.setStyle(Paint.Style.FILL);
      this.BS.setAntiAlias(true);
    }
    
    public final void ah(int paramInt)
    {
      this.BX = paramInt;
      this.tf = this.BW[this.BX];
    }
    
    final int cs()
    {
      return (this.BX + 1) % this.BW.length;
    }
    
    public final void ct()
    {
      this.BY = this.BT;
      this.BZ = this.BU;
      this.Ca = this.eS;
    }
    
    public final void cu()
    {
      this.BY = 0.0F;
      this.BZ = 0.0F;
      this.Ca = 0.0F;
      x(0.0F);
      y(0.0F);
      setRotation(0.0F);
    }
    
    final void invalidateSelf()
    {
      this.lj.invalidateDrawable(null);
    }
    
    public final void setRotation(float paramFloat)
    {
      this.eS = paramFloat;
      invalidateSelf();
    }
    
    public final void v(boolean paramBoolean)
    {
      if (this.Cb != paramBoolean)
      {
        this.Cb = paramBoolean;
        invalidateSelf();
      }
    }
    
    public final void x(float paramFloat)
    {
      this.BT = paramFloat;
      invalidateSelf();
    }
    
    public final void y(float paramFloat)
    {
      this.BU = paramFloat;
      invalidateSelf();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\widget\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */