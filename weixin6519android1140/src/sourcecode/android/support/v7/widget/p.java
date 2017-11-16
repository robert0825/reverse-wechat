package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

class p
  implements q
{
  final RectF Pz = new RectF();
  
  private static af d(o paramo)
  {
    return (af)paramo.getBackground();
  }
  
  public final float a(o paramo)
  {
    paramo = d(paramo);
    float f1 = Math.max(paramo.im, paramo.ij + paramo.Vr + paramo.im / 2.0F);
    float f2 = paramo.im;
    return (paramo.Vr + f2) * 2.0F + f1 * 2.0F;
  }
  
  public final void a(o paramo, Context paramContext, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = new af(paramContext.getResources(), paramInt, paramFloat1, paramFloat2, paramFloat3);
    paramContext.iu = paramo.eD();
    paramContext.invalidateSelf();
    paramo.setBackgroundDrawable(paramContext);
    paramContext = new Rect();
    d(paramo).getPadding(paramContext);
    paramo.x((int)Math.ceil(a(paramo)), (int)Math.ceil(b(paramo)));
    paramo.d(paramContext.left, paramContext.top, paramContext.right, paramContext.bottom);
  }
  
  public final float b(o paramo)
  {
    paramo = d(paramo);
    float f1 = Math.max(paramo.im, paramo.ij + paramo.Vr + paramo.im * 1.5F / 2.0F);
    float f2 = paramo.im;
    return (paramo.Vr + f2 * 1.5F) * 2.0F + f1 * 2.0F;
  }
  
  public void eE()
  {
    af.Vs = new af.a()
    {
      public final void a(Canvas paramAnonymousCanvas, RectF paramAnonymousRectF, float paramAnonymousFloat, Paint paramAnonymousPaint)
      {
        float f1 = 2.0F * paramAnonymousFloat;
        float f2 = paramAnonymousRectF.width() - f1 - 1.0F;
        float f3 = paramAnonymousRectF.height();
        if (paramAnonymousFloat >= 1.0F)
        {
          float f4 = paramAnonymousFloat + 0.5F;
          p.this.Pz.set(-f4, -f4, f4, f4);
          int i = paramAnonymousCanvas.save();
          paramAnonymousCanvas.translate(paramAnonymousRectF.left + f4, paramAnonymousRectF.top + f4);
          paramAnonymousCanvas.drawArc(p.this.Pz, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f2, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(p.this.Pz, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f3 - f1 - 1.0F, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(p.this.Pz, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.translate(f2, 0.0F);
          paramAnonymousCanvas.rotate(90.0F);
          paramAnonymousCanvas.drawArc(p.this.Pz, 180.0F, 90.0F, true, paramAnonymousPaint);
          paramAnonymousCanvas.restoreToCount(i);
          paramAnonymousCanvas.drawRect(paramAnonymousRectF.left + f4 - 1.0F, paramAnonymousRectF.top, 1.0F + (paramAnonymousRectF.right - f4), paramAnonymousRectF.top + f4, paramAnonymousPaint);
          paramAnonymousCanvas.drawRect(paramAnonymousRectF.left + f4 - 1.0F, 1.0F + (paramAnonymousRectF.bottom - f4), 1.0F + (paramAnonymousRectF.right - f4), paramAnonymousRectF.bottom, paramAnonymousPaint);
        }
        f1 = paramAnonymousRectF.left;
        f2 = paramAnonymousRectF.top;
        paramAnonymousCanvas.drawRect(f1, Math.max(0.0F, paramAnonymousFloat - 1.0F) + f2, paramAnonymousRectF.right, 1.0F + (paramAnonymousRectF.bottom - paramAnonymousFloat), paramAnonymousPaint);
      }
    };
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */