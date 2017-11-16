package com.tencent.mm.view.b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.m.a;
import com.tencent.mm.sdk.platformtools.w;

public class a
  extends View
{
  com.tencent.mm.bl.b evi;
  protected Matrix evj;
  private Rect evk;
  Rect fWo;
  public float fWu;
  private float kqN;
  private float kqO;
  float[] values;
  protected float xAA;
  public boolean xAB;
  protected Matrix xAu;
  public Rect xAv;
  public Rect xAw;
  private Runnable xAx;
  public boolean xAy;
  protected float xAz;
  
  public a(Context paramContext, com.tencent.mm.bl.b paramb)
  {
    super(paramContext);
    GMTrace.i(19644509323264L, 146363);
    this.xAy = true;
    this.fWu = 1.0F;
    this.xAB = true;
    this.values = new float[9];
    this.evi = paramb;
    this.evj = new Matrix();
    this.xAu = new Matrix();
    this.evk = new Rect();
    this.xAv = new Rect();
    this.xAw = new Rect();
    this.fWo = new Rect();
    paramContext = paramb.bNP();
    if (paramContext != null)
    {
      this.fWo.set(0, 0, paramContext.getWidth(), paramContext.getHeight());
      this.evk.set(this.fWo);
    }
    if ((!ckM()) && (paramb.bNM().rect != null))
    {
      paramContext = paramb.bNM().rect;
      this.evk.set(0, 0, paramContext.width(), paramContext.height());
      this.evj.postTranslate(0.0F, paramContext.top);
    }
    GMTrace.o(19644509323264L, 146363);
  }
  
  private float a(Matrix paramMatrix, int paramInt)
  {
    GMTrace.i(19646522589184L, 146378);
    paramMatrix.getValues(this.values);
    float f = this.values[paramInt];
    GMTrace.o(19646522589184L, 146378);
    return f;
  }
  
  protected void N(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19645046194176L, 146367);
    GMTrace.o(19645046194176L, 146367);
  }
  
  public final float a(Matrix paramMatrix)
  {
    GMTrace.i(19646925242368L, 146381);
    float f = (float)Math.round(Math.atan2(a(paramMatrix, 1), a(paramMatrix, 0)) * 57.29577951308232D);
    GMTrace.o(19646925242368L, 146381);
    return f;
  }
  
  public final void a(b paramb, float paramFloat, boolean paramBoolean)
  {
    GMTrace.i(19645851500544L, 146373);
    Object localObject = ckP();
    int i = (int)((RectF)localObject).centerX();
    int j = (int)((RectF)localObject).centerY();
    int k = this.xAv.centerX();
    int m = this.xAv.centerY();
    if (paramFloat % 180.0F == 0.0F)
    {
      f = 1.0F * ((RectF)localObject).width() / ((RectF)localObject).height();
      if (f >= 1.0F * this.xAv.width() / this.xAv.height()) {
        break label371;
      }
      this.xAv.width();
      f = this.xAv.height();
      label115:
      if (paramFloat % 180.0F != 0.0F) {
        break label395;
      }
    }
    label371:
    label395:
    for (float f = f * 1.0F / ((RectF)localObject).height();; f = f * 1.0F / ((RectF)localObject).width())
    {
      localObject = new a(f, k - i, m - j, i, j, paramFloat, paramBoolean);
      ((a)localObject).xAG = paramb;
      ((a)localObject).epT = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 166.0F }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, ((a)localObject).xAD }), PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, ((a)localObject).xAE }), PropertyValuesHolder.ofFloat("rotation", new float[] { 0.0F, ((a)localObject).eS }) });
      ((a)localObject).epT.addUpdateListener(new a.a.1((a)localObject));
      ((a)localObject).epT.addListener(new a.a.2((a)localObject));
      ((a)localObject).epT.setInterpolator(new LinearInterpolator());
      ((a)localObject).epT.setDuration(166L);
      ((a)localObject).epT.start();
      GMTrace.o(19645851500544L, 146373);
      return;
      f = 1.0F * ((RectF)localObject).height() / ((RectF)localObject).width();
      break;
      this.xAv.height();
      f = this.xAv.width() / f;
      break label115;
    }
  }
  
  protected final float c(Matrix paramMatrix)
  {
    GMTrace.i(19646656806912L, 146379);
    float f1 = a(paramMatrix, 3);
    float f2 = a(paramMatrix, 0);
    f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    GMTrace.o(19646656806912L, 146379);
    return f1;
  }
  
  protected boolean ckL()
  {
    GMTrace.i(19645180411904L, 146368);
    boolean bool = this.xAB;
    GMTrace.o(19645180411904L, 146368);
    return bool;
  }
  
  public boolean ckM()
  {
    GMTrace.i(19645314629632L, 146369);
    GMTrace.o(19645314629632L, 146369);
    return true;
  }
  
  public Rect ckN()
  {
    GMTrace.i(19645448847360L, 146370);
    Rect localRect = this.evk;
    GMTrace.o(19645448847360L, 146370);
    return localRect;
  }
  
  public final void ckO()
  {
    GMTrace.i(19645717282816L, 146372);
    Object localObject = this.fWo;
    float f2;
    if (a(this.evj) % 180.0F == 0.0F)
    {
      f1 = ((Rect)localObject).width() * 1.0F / ((Rect)localObject).height();
      if (f1 >= this.xAv.width() * 1.0F / this.xAv.height()) {
        break label323;
      }
      f1 = this.xAv.width() / f1;
      f2 = this.xAv.height();
      label91:
      if (a(this.evj) % 180.0F != 0.0F) {
        break label348;
      }
      f2 = f2 * 1.0F / ((Rect)localObject).height();
      label118:
      if (a(this.evj) % 180.0F != 0.0F) {
        break label362;
      }
    }
    label323:
    label348:
    label362:
    for (float f1 = f1 * 1.0F / ((Rect)localObject).height();; f1 = f1 * 1.0F / ((Rect)localObject).width())
    {
      int i = ((Rect)localObject).centerX();
      int j = ((Rect)localObject).centerY();
      this.evj.postScale(f2, f2, i, j);
      localObject = ckP();
      i = (int)((RectF)localObject).centerX();
      j = (int)((RectF)localObject).centerY();
      int k = this.xAv.centerX();
      int m = this.xAv.centerY();
      this.evj.postTranslate(k - i, m - j);
      this.xAu.set(this.evj);
      this.xAz = (c(this.xAu) * 3.0F);
      this.xAA = (c(this.xAu) * 1.0F);
      if (this.xAz < f1) {
        this.xAz = (f1 * 1.2F);
      }
      GMTrace.o(19645717282816L, 146372);
      return;
      f1 = ((Rect)localObject).height() * 1.0F / ((Rect)localObject).width();
      break;
      float f3 = this.xAv.height();
      f2 = this.xAv.width() / f1;
      f1 = f3;
      break label91;
      f2 = f2 * 1.0F / ((Rect)localObject).width();
      break label118;
    }
  }
  
  public final RectF ckP()
  {
    GMTrace.i(19645985718272L, 146374);
    RectF localRectF = new RectF(this.fWo);
    this.evj.mapRect(localRectF);
    GMTrace.o(19645985718272L, 146374);
    return localRectF;
  }
  
  public float ckQ()
  {
    GMTrace.i(19646254153728L, 146376);
    float f = this.xAA;
    GMTrace.o(19646254153728L, 146376);
    return f;
  }
  
  public final float ckR()
  {
    GMTrace.i(19646388371456L, 146377);
    float f = this.xAz;
    GMTrace.o(19646388371456L, 146377);
    return f;
  }
  
  public final float ckS()
  {
    GMTrace.i(19646791024640L, 146380);
    float f = c(this.evj);
    GMTrace.o(19646791024640L, 146380);
    return f;
  }
  
  public final void m(Rect paramRect)
  {
    GMTrace.i(19646119936000L, 146375);
    this.fWo.set(paramRect);
    this.evk.set(paramRect);
    GMTrace.o(19646119936000L, 146375);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19644777758720L, 146365);
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    paramCanvas.setMatrix(this.evj);
    this.evi.onDraw(paramCanvas);
    GMTrace.o(19644777758720L, 146365);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19644643540992L, 146364);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    w.i("changelcai", "[onLayout] %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.xAv.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.xAw.set(this.xAv);
    }
    GMTrace.o(19644643540992L, 146364);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19644911976448L, 146366);
    if (this.evi.bNQ())
    {
      if (paramMotionEvent.getAction() == 0)
      {
        this.kqN = paramMotionEvent.getX();
        this.kqO = paramMotionEvent.getY();
      }
      if (paramMotionEvent.getAction() != 1) {
        break label134;
      }
      removeCallbacks(this.xAx);
      long l = 0L;
      if (!this.xAy) {
        l = 380L;
      }
      Runnable local1 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19644375105536L, 146362);
          if (a.a(a.this))
          {
            a.this.evi.bNL().an(false);
            a.this.evi.bNL().ao(false);
            a.a(a.this, false);
            GMTrace.o(19644375105536L, 146362);
            return;
          }
          a.this.evi.bNL().an(true);
          a.this.evi.bNL().ao(true);
          a.a(a.this, true);
          GMTrace.o(19644375105536L, 146362);
        }
      };
      this.xAx = local1;
      postDelayed(local1, l);
    }
    for (;;)
    {
      if ((!this.evi.E(paramMotionEvent)) && (ckM())) {
        N(paramMotionEvent);
      }
      GMTrace.o(19644911976448L, 146366);
      return true;
      label134:
      if (paramMotionEvent.getAction() == 2)
      {
        if ((Math.abs(paramMotionEvent.getX() - this.kqN) > 5.0F) || (Math.abs(paramMotionEvent.getY() - this.kqO) > 5.0F))
        {
          removeCallbacks(this.xAx);
          if (this.xAy)
          {
            this.evi.bNL().an(false);
            this.evi.bNL().ao(false);
            this.xAy = false;
          }
        }
        this.kqN = paramMotionEvent.getX();
        this.kqO = paramMotionEvent.getY();
      }
    }
  }
  
  public final Matrix pY()
  {
    GMTrace.i(19645583065088L, 146371);
    Matrix localMatrix = this.evj;
    GMTrace.o(19645583065088L, 146371);
    return localMatrix;
  }
  
  final class a
    extends com.tencent.mm.b.b
  {
    public float eS;
    ValueAnimator epT;
    public float eqp;
    public float eqq;
    public float fy;
    float xAD;
    float xAE;
    public boolean xAF;
    public a.b xAG;
    
    public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean)
    {
      GMTrace.i(19641824968704L, 146343);
      this.fy = paramFloat1;
      this.xAD = paramFloat2;
      this.xAE = paramFloat3;
      this.eqp = paramFloat4;
      this.eqq = paramFloat5;
      this.eS = paramFloat6;
      this.xAF = paramBoolean;
      GMTrace.o(19641824968704L, 146343);
    }
    
    public final void ckT()
    {
      GMTrace.i(19641959186432L, 146344);
      Rect localRect = a.this.fWo;
      float f = localRect.width() * 1.0F / localRect.height();
      if (f < a.this.xAv.width() * 1.0F / a.this.xAv.height())
      {
        f = a.this.xAv.width() / f;
        a.this.xAv.height();
        if (a.this.a(a.this.evj) % 180.0F != 0.0F) {
          break label175;
        }
      }
      label175:
      for (f = f * 1.0F / localRect.height();; f = f * 1.0F / localRect.width())
      {
        if (a.this.xAz < f) {
          a.this.xAz = (f * 1.2F);
        }
        GMTrace.o(19641959186432L, 146344);
        return;
        f = a.this.xAv.height();
        a.this.xAv.width();
        break;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void onStart();
    
    public abstract void qf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */