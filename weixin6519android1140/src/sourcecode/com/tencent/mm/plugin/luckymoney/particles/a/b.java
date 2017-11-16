package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;

public abstract class b
{
  public int alpha;
  public float mKC;
  public float mKE;
  public Float mKG;
  public Float mKI;
  public float mKO;
  public Float mKQ;
  public long mKS;
  public Interpolator mKw;
  public Rect mKx;
  public VelocityTracker mLA;
  public float mLB;
  public float mLC;
  public float mLD;
  public float mLE;
  public boolean mLa;
  private final Matrix mLh;
  private final Paint mLi;
  public long mLj;
  public float mLk;
  public float mLl;
  public float mLm;
  public float mLn;
  public Long mLo;
  public Long mLp;
  public float mLq;
  public float mLr;
  public Long mLs;
  public float mLt;
  public float mLu;
  public float mLv;
  public float mLw;
  public float mLx;
  public boolean mLy;
  public boolean mLz;
  
  public b()
  {
    GMTrace.i(9908892205056L, 73827);
    this.mLh = new Matrix();
    this.mLi = new Paint(1);
    GMTrace.o(9908892205056L, 73827);
  }
  
  public static float a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, Long paramLong1, Float paramFloat)
  {
    GMTrace.i(9909697511424L, 73833);
    if ((paramLong1 == null) || (paramLong < paramLong1.longValue()))
    {
      f1 = (float)paramLong;
      f2 = (float)paramLong;
      f3 = (float)paramLong;
      GMTrace.o(9909697511424L, 73833);
      return f1 * paramFloat2 + paramFloat1 + 0.5F * paramFloat3 * f2 * f3;
    }
    float f1 = (float)paramLong1.longValue();
    float f2 = (float)paramLong1.longValue();
    float f3 = (float)paramLong1.longValue();
    float f4 = (float)(paramLong - paramLong1.longValue());
    float f5 = paramFloat.floatValue();
    GMTrace.o(9909697511424L, 73833);
    return f1 * paramFloat2 + paramFloat1 + 0.5F * paramFloat3 * f2 * f3 + f4 * f5;
  }
  
  private static long a(float paramFloat1, float paramFloat2, float paramFloat3, Long paramLong, Float paramFloat, int paramInt1, int paramInt2)
  {
    GMTrace.i(9909563293696L, 73832);
    double d1;
    long l;
    if (paramFloat3 != 0.0F)
    {
      if (paramFloat3 > 0.0F) {}
      while ((paramLong == null) || (paramLong.longValue() < 0L))
      {
        d1 = Math.sqrt(2.0F * paramFloat3 * paramInt2 - 2.0F * paramFloat3 * paramFloat1 + paramFloat2 * paramFloat2);
        double d2 = (-d1 - paramFloat2) / paramFloat3;
        if (d2 > 0.0D)
        {
          l = d2;
          GMTrace.o(9909563293696L, 73832);
          return l;
          paramInt2 = paramInt1;
        }
        else
        {
          d1 = (d1 - paramFloat2) / paramFloat3;
          if (d1 > 0.0D)
          {
            l = d1;
            GMTrace.o(9909563293696L, 73832);
            return l;
          }
          GMTrace.o(9909563293696L, 73832);
          return Long.MAX_VALUE;
        }
      }
      d1 = (paramInt2 - paramFloat1 - (float)paramLong.longValue() * paramFloat2 - 0.5D * paramFloat3 * paramLong.longValue() * paramLong.longValue() + paramFloat.floatValue() * (float)paramLong.longValue()) / paramFloat.floatValue();
      if (d1 > 0.0D)
      {
        l = d1;
        GMTrace.o(9909563293696L, 73832);
        return l;
      }
      GMTrace.o(9909563293696L, 73832);
      return Long.MAX_VALUE;
    }
    if (paramLong == null) {
      if (paramFloat2 <= 0.0F) {
        break label290;
      }
    }
    for (;;)
    {
      if (paramFloat2 != 0.0F)
      {
        d1 = (paramInt2 - paramFloat1) / paramFloat2;
        if (d1 > 0.0D)
        {
          l = d1;
          GMTrace.o(9909563293696L, 73832);
          return l;
          paramFloat2 = paramFloat.floatValue();
          break;
          label290:
          paramInt2 = paramInt1;
          continue;
        }
        GMTrace.o(9909563293696L, 73832);
        return Long.MAX_VALUE;
      }
    }
    GMTrace.o(9909563293696L, 73832);
    return Long.MAX_VALUE;
  }
  
  private static Long a(Float paramFloat, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(9909429075968L, 73831);
    if (paramFloat != null)
    {
      if (paramFloat2 != 0.0F)
      {
        long l = ((paramFloat.floatValue() - paramFloat1) / paramFloat2);
        if (l > 0L) {}
        for (;;)
        {
          GMTrace.o(9909429075968L, 73831);
          return Long.valueOf(l);
          l = 0L;
        }
      }
      if (paramFloat.floatValue() < paramFloat1)
      {
        GMTrace.o(9909429075968L, 73831);
        return Long.valueOf(0L);
      }
      GMTrace.o(9909429075968L, 73831);
      return null;
    }
    GMTrace.o(9909429075968L, 73831);
    return null;
  }
  
  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    GMTrace.i(9909831729152L, 73834);
    paramCanvas.save();
    paramCanvas.clipRect(this.mKx);
    this.mLh.reset();
    this.mLi.setAlpha(this.alpha);
    a(paramCanvas, this.mLh, this.mLi, paramFloat1, paramFloat2, paramFloat3);
    paramCanvas.restore();
    GMTrace.o(9909831729152L, 73834);
  }
  
  protected abstract void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3);
  
  public final void g(Rect paramRect)
  {
    GMTrace.i(9909026422784L, 73828);
    this.mKx = paramRect;
    this.mLo = a(this.mKG, this.mLm, this.mKC);
    this.mLp = a(this.mKI, this.mLn, this.mKE);
    this.mLs = a(this.mKQ, this.mLr, this.mKO);
    if (this.mLt == 0.0F) {
      if (this.mKS < 0L) {
        break label215;
      }
    }
    label215:
    for (float f = (float)this.mKS;; f = 9.223372E18F)
    {
      this.mLt = f;
      this.mLt = Math.min((float)a(this.mLk, this.mLm, this.mKC, this.mLo, this.mKG, paramRect.left - getWidth(), paramRect.right), this.mLt);
      this.mLt = Math.min((float)a(this.mLl, this.mLn, this.mKE, this.mLp, this.mKI, paramRect.top - getHeight(), paramRect.bottom), this.mLt);
      this.mLi.setAlpha(this.alpha);
      GMTrace.o(9909026422784L, 73828);
      return;
    }
  }
  
  public abstract int getHeight();
  
  public abstract int getWidth();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\particles\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */