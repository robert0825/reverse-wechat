package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

final class v
  extends u.e
{
  static final Handler iw = new Handler(Looper.getMainLooper());
  private final int[] kC = new int[2];
  private final float[] kD = new float[2];
  int kE = 200;
  u.e.a kF;
  u.e.b kG;
  float kH;
  Interpolator mInterpolator;
  boolean mIsRunning;
  final Runnable mRunnable = new Runnable()
  {
    public final void run()
    {
      v localv = v.this;
      if (localv.mIsRunning)
      {
        float f2 = (float)(SystemClock.uptimeMillis() - localv.mStartTime) / localv.kE;
        float f1 = f2;
        if (localv.mInterpolator != null) {
          f1 = localv.mInterpolator.getInterpolation(f2);
        }
        localv.kH = f1;
        if (localv.kG != null) {
          localv.kG.au();
        }
        if (SystemClock.uptimeMillis() >= localv.mStartTime + localv.kE)
        {
          localv.mIsRunning = false;
          if (localv.kF != null) {
            localv.kF.onAnimationEnd();
          }
        }
      }
      if (localv.mIsRunning) {
        v.iw.postDelayed(localv.mRunnable, 10L);
      }
    }
  };
  long mStartTime;
  
  public final void a(u.e.a parama)
  {
    this.kF = parama;
  }
  
  public final void a(u.e.b paramb)
  {
    this.kG = paramb;
  }
  
  public final int aw()
  {
    return a.a(this.kC[0], this.kC[1], this.kH);
  }
  
  public final float ax()
  {
    return a.b(this.kD[0], this.kD[1], this.kH);
  }
  
  public final void cancel()
  {
    this.mIsRunning = false;
    iw.removeCallbacks(this.mRunnable);
  }
  
  public final void e(float paramFloat1, float paramFloat2)
  {
    this.kD[0] = paramFloat1;
    this.kD[1] = paramFloat2;
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    this.kC[0] = paramInt1;
    this.kC[1] = paramInt2;
  }
  
  public final float getAnimatedFraction()
  {
    return this.kH;
  }
  
  public final long getDuration()
  {
    return this.kE;
  }
  
  public final boolean isRunning()
  {
    return this.mIsRunning;
  }
  
  public final void setDuration(int paramInt)
  {
    this.kE = paramInt;
  }
  
  public final void setInterpolator(Interpolator paramInterpolator)
  {
    this.mInterpolator = paramInterpolator;
  }
  
  public final void start()
  {
    if (this.mIsRunning) {
      return;
    }
    if (this.mInterpolator == null) {
      this.mInterpolator = new AccelerateDecelerateInterpolator();
    }
    this.mStartTime = SystemClock.uptimeMillis();
    this.mIsRunning = true;
    iw.postDelayed(this.mRunnable, 10L);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */