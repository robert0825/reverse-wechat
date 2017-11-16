package com.tencent.mm.b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.d.c;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends b
{
  public int epS;
  private ValueAnimator epT;
  public c epU;
  public float epV;
  public float epW;
  public float epX;
  public float epY;
  public float epZ;
  public Rect eqa;
  public RectF eqb;
  public Matrix eqc;
  public long eqd;
  public Animator.AnimatorListener eqe;
  
  public a(c paramc)
  {
    GMTrace.i(19652293951488L, 146421);
    this.epS = 200;
    this.eqd = 0L;
    this.epU = paramc;
    this.eqc = new Matrix();
    this.eqb = new RectF();
    GMTrace.o(19652293951488L, 146421);
  }
  
  public final void cancel()
  {
    GMTrace.i(19652562386944L, 146423);
    w.d("MicroMsg.CropActionUpAnim", "[cancel]");
    this.eqj = false;
    this.eqi = true;
    if (this.epT != null) {
      this.epT.cancel();
    }
    GMTrace.o(19652562386944L, 146423);
  }
  
  public final void play()
  {
    GMTrace.i(19652428169216L, 146422);
    w.i("MicroMsg.CropActionUpAnim", "[play]");
    if (!this.eqi)
    {
      GMTrace.o(19652428169216L, 146422);
      return;
    }
    this.eqj = false;
    this.eqi = false;
    this.epT = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, this.epS }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, this.epW }), PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, this.epX }), PropertyValuesHolder.ofFloat("background_alpha", new float[] { 0.0F, 255.0F }) });
    this.epT.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      float eqf;
      int eqg;
      
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(19653233475584L, 146428);
        w.i("MicroMsg.CropActionUpAnim", "onAnimationUpdate");
        float f1 = ((Float)paramAnonymousValueAnimator.getAnimatedValue("deltaY")).floatValue();
        float f2 = ((Float)paramAnonymousValueAnimator.getAnimatedValue("deltaX")).floatValue();
        float f3 = ((Float)paramAnonymousValueAnimator.getAnimatedValue("background_alpha")).floatValue();
        if (this.eqg < (int)(a.this.epS / 16.6D))
        {
          a.this.epU.pY().postScale(this.eqf, this.eqf, a.this.eqa.centerX(), a.this.eqa.centerY());
          a.this.eqc.postScale(this.eqf, this.eqf, a.this.eqa.centerX(), a.this.eqa.centerY());
          this.eqg += 1;
        }
        paramAnonymousValueAnimator = a.this.epU.evD;
        com.tencent.mm.t.a.eR((int)f3);
        a.this.epU.pY().postTranslate(f2 - a.this.epZ, f1 - a.this.epY);
        a.this.eqc.postTranslate(f2 - a.this.epZ, f1 - a.this.epY);
        paramAnonymousValueAnimator = new RectF(a.this.eqa);
        a.this.eqc.mapRect(paramAnonymousValueAnimator);
        paramAnonymousValueAnimator.round(a.this.eqa);
        a.this.eqc.reset();
        a.this.epU.pZ();
        a.this.epY = f1;
        a.this.epZ = f2;
        GMTrace.o(19653233475584L, 146428);
      }
    });
    this.epT.addListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        GMTrace.i(19652025516032L, 146419);
        GMTrace.o(19652025516032L, 146419);
      }
      
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(19651891298304L, 146418);
        a.this.eqi = true;
        a.this.eqj = false;
        a.this.eqd = 0L;
        a.this.epY = 0.0F;
        a.this.epZ = 0.0F;
        a.this.epU.qc();
        a.this.epU.qa();
        if (a.this.eqe != null) {
          a.this.eqe.onAnimationEnd(paramAnonymousAnimator);
        }
        GMTrace.o(19651891298304L, 146418);
      }
      
      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        GMTrace.i(19652159733760L, 146420);
        GMTrace.o(19652159733760L, 146420);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(19651757080576L, 146417);
        a.this.epU.evM = true;
        a.this.eqi = false;
        a.this.eqj = true;
        a.this.epY = 0.0F;
        a.this.epZ = 0.0F;
        GMTrace.o(19651757080576L, 146417);
      }
    });
    this.epT.setInterpolator(new LinearInterpolator());
    this.epT.setDuration(this.epS);
    this.epT.setStartDelay(this.eqd);
    this.epT.start();
    GMTrace.o(19652428169216L, 146422);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */