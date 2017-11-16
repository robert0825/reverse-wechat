package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.a.a;
import android.support.v4.view.b.e;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class i
  extends Drawable
{
  private static final RectF iJO;
  private static final RectF iJP;
  private int iJQ;
  private int iJR;
  private boolean iJS;
  private int iJT;
  b iJU;
  c iJV;
  int lG;
  ArrayList<Animator> ln;
  private Paint mPaint;
  
  static
  {
    GMTrace.i(10108742402048L, 75316);
    iJO = new RectF(-21.0F, -21.0F, 21.0F, 21.0F);
    iJP = new RectF(-19.0F, -19.0F, 19.0F, 19.0F);
    GMTrace.o(10108742402048L, 75316);
  }
  
  public i()
  {
    GMTrace.i(10107400224768L, 75306);
    this.iJR = 4;
    this.lG = -16777216;
    this.iJS = false;
    this.iJT = 0;
    this.iJU = new b();
    this.iJV = new c();
    this.iJQ = Math.round(ab.getResources().getDisplayMetrics().density * 48.0F);
    this.ln = new ArrayList();
    GMTrace.o(10107400224768L, 75306);
  }
  
  static Animator a(b paramb)
  {
    GMTrace.i(10108473966592L, 75314);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramb, "trimPathStart", new float[] { 0.0F, 0.75F });
    localObjectAnimator1.setDuration(1333L);
    localObjectAnimator1.setInterpolator(e.iJW);
    localObjectAnimator1.setRepeatCount(-1);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramb, "trimPathEnd", new float[] { 0.0F, 0.75F });
    localObjectAnimator2.setDuration(1333L);
    localObjectAnimator2.setInterpolator(d.iJW);
    localObjectAnimator2.setRepeatCount(-1);
    paramb = ObjectAnimator.ofFloat(paramb, "trimPathOffset", new float[] { 0.0F, 0.25F });
    paramb.setDuration(1333L);
    paramb.setInterpolator(a.iJW);
    paramb.setRepeatCount(-1);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, paramb });
    GMTrace.o(10108473966592L, 75314);
    return localAnimatorSet;
  }
  
  static Animator a(c paramc)
  {
    GMTrace.i(10108608184320L, 75315);
    paramc = ObjectAnimator.ofFloat(paramc, "rotation", new float[] { 0.0F, 720.0F });
    paramc.setDuration(6665L);
    paramc.setInterpolator(a.iJW);
    paramc.setRepeatCount(-1);
    GMTrace.o(10108608184320L, 75315);
    return paramc;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(10107937095680L, 75310);
    Object localObject = getBounds();
    if ((((Rect)localObject).width() == 0) || (((Rect)localObject).height() == 0))
    {
      GMTrace.o(10107937095680L, 75310);
      return;
    }
    if (this.mPaint == null)
    {
      this.mPaint = new Paint();
      this.mPaint.setAntiAlias(true);
      this.mPaint.setStyle(Paint.Style.STROKE);
      this.mPaint.setStrokeWidth(this.iJR);
      this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
      this.mPaint.setStrokeJoin(Paint.Join.MITER);
    }
    int i = paramCanvas.save();
    paramCanvas.translate(((Rect)localObject).left, ((Rect)localObject).top);
    int j = ((Rect)localObject).width();
    int k = ((Rect)localObject).height();
    localObject = this.mPaint;
    paramCanvas.scale(j / iJO.width(), k / iJO.height());
    paramCanvas.translate(iJO.width() / 2.0F, iJO.height() / 2.0F);
    if (this.iJS)
    {
      j = paramCanvas.save();
      ((Paint)localObject).setColor(this.iJT);
      paramCanvas.drawArc(iJP, 0.0F, 360.0F, false, (Paint)localObject);
      paramCanvas.restoreToCount(j);
    }
    j = paramCanvas.save();
    ((Paint)localObject).setColor(this.lG);
    paramCanvas.rotate(this.iJV.eS);
    float f1 = this.iJU.lO;
    float f2 = this.iJU.lM;
    float f3 = this.iJU.lN;
    float f4 = this.iJU.lM;
    paramCanvas.drawArc(iJP, -90.0F + (f1 + f2) * 360.0F, 360.0F * (f3 - f4), false, (Paint)localObject);
    paramCanvas.restoreToCount(j);
    paramCanvas.restoreToCount(i);
    GMTrace.o(10107937095680L, 75310);
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(10107802877952L, 75309);
    int i = this.iJQ;
    GMTrace.o(10107802877952L, 75309);
    return i;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(10107668660224L, 75308);
    int i = this.iJQ;
    GMTrace.o(10107668660224L, 75308);
    return i;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(10108339748864L, 75313);
    GMTrace.o(10108339748864L, 75313);
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(10108071313408L, 75311);
    GMTrace.o(10108071313408L, 75311);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(10108205531136L, 75312);
    GMTrace.o(10108205531136L, 75312);
  }
  
  private static final class a
  {
    public static final Interpolator iJW;
    
    static
    {
      GMTrace.i(10045257416704L, 74843);
      iJW = new LinearInterpolator();
      GMTrace.o(10045257416704L, 74843);
    }
  }
  
  private static final class b
  {
    public float lM;
    public float lN;
    public float lO;
    
    public b()
    {
      GMTrace.i(10042036191232L, 74819);
      this.lM = 0.0F;
      this.lN = 0.0F;
      this.lO = 0.0F;
      GMTrace.o(10042036191232L, 74819);
    }
    
    @a
    public final void setTrimPathEnd(float paramFloat)
    {
      GMTrace.i(10042304626688L, 74821);
      this.lN = paramFloat;
      GMTrace.o(10042304626688L, 74821);
    }
    
    @a
    public final void setTrimPathOffset(float paramFloat)
    {
      GMTrace.i(10042438844416L, 74822);
      this.lO = paramFloat;
      GMTrace.o(10042438844416L, 74822);
    }
    
    @a
    public final void setTrimPathStart(float paramFloat)
    {
      GMTrace.i(10042170408960L, 74820);
      this.lM = paramFloat;
      GMTrace.o(10042170408960L, 74820);
    }
  }
  
  private static final class c
  {
    public float eS;
    
    public c()
    {
      GMTrace.i(10030359248896L, 74732);
      GMTrace.o(10030359248896L, 74732);
    }
    
    @a
    public final void setRotation(float paramFloat)
    {
      GMTrace.i(10030493466624L, 74733);
      this.eS = paramFloat;
      GMTrace.o(10030493466624L, 74733);
    }
  }
  
  private static final class d
  {
    public static final Interpolator iJW;
    private static final Path iJX;
    
    static
    {
      GMTrace.i(10046868029440L, 74855);
      Path localPath = new Path();
      iJX = localPath;
      localPath.cubicTo(0.2F, 0.0F, 0.1F, 1.0F, 0.5F, 1.0F);
      iJX.lineTo(1.0F, 1.0F);
      iJW = e.b(iJX);
      GMTrace.o(10046868029440L, 74855);
    }
  }
  
  private static final class e
  {
    public static final Interpolator iJW;
    private static final Path iJY;
    
    static
    {
      GMTrace.i(10138001866752L, 75534);
      Path localPath = new Path();
      iJY = localPath;
      localPath.lineTo(0.5F, 0.0F);
      iJY.cubicTo(0.7F, 0.0F, 0.6F, 1.0F, 1.0F, 1.0F);
      iJW = e.b(iJY);
      GMTrace.o(10138001866752L, 75534);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */