package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int Ac = ;
  private boolean Aa;
  private boolean Ab;
  public final View mN;
  private Runnable mRunnable;
  public final a zN = new a();
  private final Interpolator zO = new AccelerateInterpolator();
  private float[] zP = { 0.0F, 0.0F };
  private float[] zQ = { Float.MAX_VALUE, Float.MAX_VALUE };
  private int zR;
  private int zS;
  private float[] zT = { 0.0F, 0.0F };
  private float[] zU = { 0.0F, 0.0F };
  private float[] zV = { Float.MAX_VALUE, Float.MAX_VALUE };
  private boolean zW;
  public boolean zX;
  public boolean zY;
  public boolean zZ;
  
  public a(View paramView)
  {
    this.mN = paramView;
    paramView = Resources.getSystem().getDisplayMetrics();
    int i = (int)(1575.0F * paramView.density + 0.5F);
    int j = (int)(paramView.density * 315.0F + 0.5F);
    float f = i;
    this.zV[0] = (f / 1000.0F);
    this.zV[1] = (f / 1000.0F);
    f = j;
    this.zU[0] = (f / 1000.0F);
    this.zU[1] = (f / 1000.0F);
    this.zR = 1;
    this.zQ[0] = Float.MAX_VALUE;
    this.zQ[1] = Float.MAX_VALUE;
    this.zP[0] = 0.2F;
    this.zP[1] = 0.2F;
    this.zT[0] = 0.001F;
    this.zT[1] = 0.001F;
    this.zS = Ac;
    this.zN.Ad = 500;
    this.zN.Ae = 500;
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = d(this.zP[paramInt] * paramFloat2, 0.0F, this.zQ[paramInt]);
    float f2 = g(paramFloat1, f1);
    paramFloat1 = g(paramFloat2 - paramFloat1, f1) - f2;
    if (paramFloat1 < 0.0F) {
      paramFloat1 = -this.zO.getInterpolation(-paramFloat1);
    }
    for (paramFloat1 = d(paramFloat1, -1.0F, 1.0F);; paramFloat1 = 0.0F)
    {
      if (paramFloat1 != 0.0F) {
        break label102;
      }
      return 0.0F;
      if (paramFloat1 > 0.0F)
      {
        paramFloat1 = this.zO.getInterpolation(paramFloat1);
        break;
      }
    }
    label102:
    f2 = this.zT[paramInt];
    paramFloat2 = this.zU[paramInt];
    f1 = this.zV[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (paramFloat1 > 0.0F) {
      return d(paramFloat1 * paramFloat3, paramFloat2, f1);
    }
    return -d(-paramFloat1 * paramFloat3, paramFloat2, f1);
  }
  
  private void ci()
  {
    if (this.zX)
    {
      this.zZ = false;
      return;
    }
    a locala = this.zN;
    long l = AnimationUtils.currentAnimationTimeMillis();
    int i = (int)(l - locala.mStartTime);
    int j = locala.Ae;
    if (i > j) {
      i = j;
    }
    for (;;)
    {
      locala.Am = i;
      locala.Al = locala.f(l);
      locala.Ak = l;
      return;
      if (i < 0) {
        i = 0;
      }
    }
  }
  
  public static float d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  private float g(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {}
    do
    {
      do
      {
        do
        {
          return 0.0F;
          switch (this.zR)
          {
          default: 
            return 0.0F;
          }
        } while (paramFloat1 >= paramFloat2);
        if (paramFloat1 >= 0.0F) {
          return 1.0F - paramFloat1 / paramFloat2;
        }
      } while ((!this.zZ) || (this.zR != 1));
      return 1.0F;
    } while (paramFloat1 >= 0.0F);
    return paramFloat1 / -paramFloat2;
  }
  
  public abstract void ad(int paramInt);
  
  public abstract boolean ae(int paramInt);
  
  public final boolean aj()
  {
    a locala = this.zN;
    int i = (int)(locala.Ag / Math.abs(locala.Ag));
    int j = (int)(locala.Af / Math.abs(locala.Af));
    if ((i == 0) || (!ae(i)))
    {
      if (j != 0) {}
      return false;
    }
    return true;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!this.Aa) {}
    for (;;)
    {
      return false;
      switch (o.d(paramMotionEvent))
      {
      }
      while ((this.Ab) && (this.zZ))
      {
        return true;
        this.zY = true;
        this.zW = false;
        float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.mN.getWidth());
        float f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.mN.getHeight());
        paramView = this.zN;
        paramView.Af = f1;
        paramView.Ag = f2;
        if ((!this.zZ) && (aj()))
        {
          if (this.mRunnable == null) {
            this.mRunnable = new b();
          }
          this.zZ = true;
          this.zX = true;
          if ((!this.zW) && (this.zS > 0)) {
            z.a(this.mN, this.mRunnable, this.zS);
          }
          for (;;)
          {
            this.zW = true;
            break;
            this.mRunnable.run();
          }
          ci();
        }
      }
    }
  }
  
  public final a s(boolean paramBoolean)
  {
    if ((this.Aa) && (!paramBoolean)) {
      ci();
    }
    this.Aa = paramBoolean;
    return this;
  }
  
  private static final class a
  {
    int Ad;
    int Ae;
    float Af;
    float Ag;
    long Ah = 0L;
    int Ai = 0;
    int Aj = 0;
    long Ak = -1L;
    float Al;
    int Am;
    long mStartTime = Long.MIN_VALUE;
    
    final float f(long paramLong)
    {
      if (paramLong < this.mStartTime) {
        return 0.0F;
      }
      if ((this.Ak < 0L) || (paramLong < this.Ak)) {
        return a.d((float)(paramLong - this.mStartTime) / this.Ad, 0.0F, 1.0F) * 0.5F;
      }
      long l = this.Ak;
      float f1 = this.Al;
      float f2 = this.Al;
      return a.d((float)(paramLong - l) / this.Am, 0.0F, 1.0F) * f2 + (1.0F - f1);
    }
  }
  
  private final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      if (!a.this.zZ) {
        return;
      }
      if (a.this.zX)
      {
        a.this.zX = false;
        locala = a.this.zN;
        locala.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        locala.Ak = -1L;
        locala.Ah = locala.mStartTime;
        locala.Al = 0.5F;
        locala.Ai = 0;
        locala.Aj = 0;
      }
      a.a locala = a.this.zN;
      if ((locala.Ak > 0L) && (AnimationUtils.currentAnimationTimeMillis() > locala.Ak + locala.Am)) {}
      for (int i = 1; (i != 0) || (!a.this.aj()); i = 0)
      {
        a.this.zZ = false;
        return;
      }
      if (a.this.zY)
      {
        a.this.zY = false;
        a locala1 = a.this;
        l1 = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        locala1.mN.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
      if (locala.Ah == 0L) {
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
      }
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f = locala.f(l1);
      f = f * 4.0F + -4.0F * f * f;
      long l2 = l1 - locala.Ah;
      locala.Ah = l1;
      locala.Ai = ((int)((float)l2 * f * locala.Af));
      locala.Aj = ((int)((float)l2 * f * locala.Ag));
      i = locala.Aj;
      a.this.ad(i);
      z.a(a.this.mN, this);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */