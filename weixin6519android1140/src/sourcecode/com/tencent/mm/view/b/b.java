package com.tencent.mm.view.b;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.b.d;
import com.tencent.mm.b.d.1;
import com.tencent.mm.b.d.2;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends a
{
  private d xAJ;
  private PointF xAK;
  private float xAL;
  private float xAM;
  private boolean xAN;
  public boolean xAO;
  
  public b(Context paramContext, com.tencent.mm.bl.b paramb)
  {
    super(paramContext, paramb);
    GMTrace.i(19642093404160L, 146345);
    this.xAJ = new d(this);
    this.xAK = new PointF();
    this.xAL = 0.0F;
    this.xAM = 0.0F;
    this.xAN = false;
    this.xAO = false;
    GMTrace.o(19642093404160L, 146345);
  }
  
  private void translate(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(19642630275072L, 146349);
    RectF localRectF = ckP();
    float f2 = paramFloat1 - this.xAK.x;
    float f1 = paramFloat2 - this.xAK.y;
    if (f2 > 0.0F) {
      if (this.xAv.left <= localRectF.left)
      {
        paramFloat1 = f2 * 0.5F;
        if (f1 <= 0.0F) {
          break label277;
        }
        if (this.xAv.top > localRectF.top) {
          break label232;
        }
        paramFloat2 = f1 * 0.5F;
      }
    }
    for (;;)
    {
      pY().postTranslate(paramFloat1, paramFloat2);
      GMTrace.o(19642630275072L, 146349);
      return;
      paramFloat1 = f2;
      if (Math.abs(f2) <= Math.abs(localRectF.left - this.xAv.left)) {
        break;
      }
      paramFloat1 = this.xAv.left - localRectF.left;
      break;
      if (this.xAv.right >= localRectF.right)
      {
        paramFloat1 = f2 * 0.5F;
        break;
      }
      paramFloat1 = f2;
      if (Math.abs(f2) <= Math.abs(this.xAv.right - localRectF.right)) {
        break;
      }
      paramFloat1 = this.xAv.right - localRectF.right;
      break;
      label232:
      paramFloat2 = f1;
      if (Math.abs(f1) > Math.abs(localRectF.top - this.xAv.top))
      {
        paramFloat2 = this.xAv.top - localRectF.top;
        continue;
        label277:
        if (this.xAv.bottom >= localRectF.bottom)
        {
          paramFloat2 = f1 * 0.5F;
        }
        else
        {
          paramFloat2 = f1;
          if (Math.abs(f1) > Math.abs(this.xAv.bottom - localRectF.bottom)) {
            paramFloat2 = this.xAv.bottom - localRectF.bottom;
          }
        }
      }
    }
  }
  
  protected final void N(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19642496057344L, 146348);
    float f4 = paramMotionEvent.getX(paramMotionEvent.getPointerCount() - 1);
    float f5 = paramMotionEvent.getY(paramMotionEvent.getPointerCount() - 1);
    RectF localRectF;
    Rect localRect;
    float f2;
    float f1;
    float f6;
    float f7;
    float f3;
    label324:
    int i;
    label342:
    int j;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
    case 0: 
    case 1: 
      do
      {
        do
        {
          for (;;)
          {
            this.xAK.x = f4;
            this.xAK.y = f5;
            GMTrace.o(19642496057344L, 146348);
            return;
            this.xAK.set(f4, f5);
            this.xAL = 0.0F;
            this.xAM = ckS();
            paramMotionEvent = this.xAJ;
            w.d("MicroMsg.StickRoundAnim", "[cancel]");
            if ((paramMotionEvent.epT != null) && ((paramMotionEvent.epT.isRunning()) || (paramMotionEvent.epT.isStarted()))) {
              paramMotionEvent.epT.cancel();
            }
            this.xAO = false;
          }
          this.xAL = 0.0F;
        } while (!this.xAO);
        paramMotionEvent = this.xAJ;
      } while (!paramMotionEvent.eqi);
      w.d("MicroMsg.StickRoundAnim", "[play] start");
      localRectF = paramMotionEvent.eqo.ckP();
      localRect = paramMotionEvent.eqo.xAv;
      paramMotionEvent.eqp = localRectF.centerX();
      paramMotionEvent.eqq = localRectF.centerY();
      f2 = localRect.centerY() - localRectF.centerY();
      f1 = localRect.centerX() - localRectF.centerX();
      f6 = paramMotionEvent.eqo.ckS();
      f7 = paramMotionEvent.eqo.ckR();
      f3 = paramMotionEvent.eqo.ckQ();
      if (f6 > f7)
      {
        paramMotionEvent.fy = f7;
        paramMotionEvent.eqr = true;
        if (localRect.height() >= localRectF.height()) {
          break label647;
        }
        i = 1;
        if (localRect.width() >= localRectF.width()) {
          break label653;
        }
        j = 1;
        label360:
        if (i != 0) {
          f2 = 0.0F;
        }
        if (j != 0) {
          f1 = 0.0F;
        }
        if ((localRectF.top <= localRect.top) || (i == 0)) {
          break label659;
        }
        f2 = localRect.top - localRectF.top;
      }
      break;
    }
    label407:
    label441:
    label647:
    label653:
    label659:
    label738:
    label1006:
    for (;;)
    {
      if ((localRectF.left > localRect.left) && (j != 0))
      {
        f3 = localRect.left - localRectF.left;
        w.d("MicroMsg.StickRoundAnim", "%s %s ", new Object[] { Float.valueOf(f3), Float.valueOf(f2) });
        if (f6 <= f7) {
          break label738;
        }
      }
      for (paramMotionEvent.eqs = true;; paramMotionEvent.eqs = false)
      {
        paramMotionEvent.epT = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, f2 }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, f3 }), PropertyValuesHolder.ofFloat("scale", new float[] { 0.0F, 80.0F }) });
        paramMotionEvent.epT.addUpdateListener(new d.1(paramMotionEvent, f6));
        paramMotionEvent.epT.addListener(new d.2(paramMotionEvent));
        paramMotionEvent.epT.setInterpolator(new LinearInterpolator());
        paramMotionEvent.epT.setDuration(80L);
        paramMotionEvent.epT.start();
        break;
        if (f6 < f3)
        {
          paramMotionEvent.fy = f3;
          paramMotionEvent.eqr = true;
          break label324;
        }
        paramMotionEvent.eqr = false;
        break label324;
        i = 0;
        break label342;
        j = 0;
        break label360;
        if ((localRectF.bottom >= localRect.bottom) || (i == 0)) {
          break label1006;
        }
        f2 = localRect.bottom - localRectF.bottom;
        break label407;
        f3 = f1;
        if (localRectF.right >= localRect.right) {
          break label441;
        }
        f3 = f1;
        if (j == 0) {
          break label441;
        }
        f3 = localRect.right - localRectF.right;
        break label441;
      }
      this.xAL = 0.0F;
      this.xAM = ckS();
      break;
      this.xAL = 0.0F;
      this.xAN = true;
      break;
      if (this.xAN)
      {
        this.xAN = false;
        GMTrace.o(19642496057344L, 146348);
        return;
      }
      if (paramMotionEvent.getPointerCount() == 2)
      {
        this.xAO = true;
        f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
        f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
        f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
        if (this.xAL == 0.0F)
        {
          this.xAL = f1;
          break;
        }
        f2 = f1 / this.xAL * this.xAM;
        if (this.xAA * 0.5F <= f2)
        {
          f1 = f2;
          if (f2 > this.xAz)
          {
            f1 = this.xAz;
            f1 = (f2 - this.xAz) * 0.2F + f1;
          }
          pY().postScale(f1 / ckS(), f1 / ckS(), f4, f5);
        }
        this.xAJ.eqi = true;
        translate(f4, f5);
        postInvalidate();
        break;
      }
      if ((paramMotionEvent.getPointerCount() != 1) || (!ckL())) {
        break;
      }
      this.xAO = true;
      this.xAJ.eqi = true;
      translate(f4, f5);
      postInvalidate();
      break;
    }
  }
  
  public final boolean ckM()
  {
    GMTrace.i(19642227621888L, 146346);
    GMTrace.o(19642227621888L, 146346);
    return true;
  }
  
  public final float ckQ()
  {
    GMTrace.i(19642764492800L, 146350);
    if (this.evi.bNN().pN() == com.tencent.mm.d.a.evf)
    {
      f1 = this.xAv.width() / ckP().width();
      float f2 = this.xAv.height() / ckP().height();
      if (f1 > f2) {}
      for (;;)
      {
        f2 = ckS();
        GMTrace.o(19642764492800L, 146350);
        return f1 * f2;
        f1 = f2;
      }
    }
    float f1 = super.ckQ();
    GMTrace.o(19642764492800L, 146350);
    return f1;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19642361839616L, 146347);
    paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    paramCanvas.setMatrix(pY());
    paramCanvas.save();
    paramCanvas.clipRect(ckN());
    Bitmap localBitmap = this.evi.bNP();
    if ((localBitmap != null) && (!localBitmap.isRecycled())) {
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
    paramCanvas.restore();
    this.evi.onDraw(paramCanvas);
    GMTrace.o(19642361839616L, 146347);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */