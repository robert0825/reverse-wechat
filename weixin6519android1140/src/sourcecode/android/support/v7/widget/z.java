package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class z
  extends RecyclerView.p
{
  protected final DecelerateInterpolator Dy = new DecelerateInterpolator();
  protected final LinearInterpolator RE = new LinearInterpolator();
  protected PointF RF;
  private final float RG = a(paramContext.getResources().getDisplayMetrics());
  protected int RH = 0;
  protected int RI = 0;
  
  public z(Context paramContext) {}
  
  private static int K(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    paramInt2 = i;
    if (paramInt1 * i <= 0) {
      paramInt2 = 0;
    }
    return paramInt2;
  }
  
  private static int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    switch (paramInt5)
    {
    default: 
      throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    case -1: 
      paramInt1 = paramInt3 - paramInt1;
    }
    do
    {
      do
      {
        return paramInt1;
        return paramInt4 - paramInt2;
        paramInt3 -= paramInt1;
        paramInt1 = paramInt3;
      } while (paramInt3 > 0);
      paramInt2 = paramInt4 - paramInt2;
      paramInt1 = paramInt2;
    } while (paramInt2 < 0);
    return 0;
  }
  
  public float a(DisplayMetrics paramDisplayMetrics)
  {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  protected final void a(int paramInt1, int paramInt2, RecyclerView.p.a parama)
  {
    if (this.Ub.SW.getChildCount() == 0) {
      stop();
    }
    do
    {
      return;
      this.RH = K(this.RH, paramInt1);
      this.RI = K(this.RI, paramInt2);
    } while ((this.RH != 0) || (this.RI != 0));
    PointF localPointF = aW(this.Uw);
    if ((localPointF == null) || ((localPointF.x == 0.0F) && (localPointF.y == 0.0F)))
    {
      parama.UC = this.Uw;
      stop();
      return;
    }
    double d = Math.sqrt(localPointF.x * localPointF.x + localPointF.y * localPointF.y);
    localPointF.x = ((float)(localPointF.x / d));
    localPointF.y = ((float)(localPointF.y / d));
    this.RF = localPointF;
    this.RH = ((int)(localPointF.x * 10000.0F));
    this.RI = ((int)(localPointF.y * 10000.0F));
    paramInt1 = aZ(10000);
    parama.a((int)(this.RH * 1.2F), (int)(this.RI * 1.2F), (int)(paramInt1 * 1.2F), this.RE);
  }
  
  protected final void a(View paramView, RecyclerView.p.a parama)
  {
    int k = 1;
    int m = 0;
    int i;
    RecyclerView.h localh;
    int j;
    if ((this.RF == null) || (this.RF.x == 0.0F))
    {
      i = 0;
      localh = this.SH;
      if ((localh != null) && (localh.eQ())) {
        break label169;
      }
      j = 0;
      label49:
      if ((this.RF != null) && (this.RF.y != 0.0F)) {
        break label235;
      }
      i = 0;
      label70:
      localh = this.SH;
      k = m;
      if (localh != null) {
        if (localh.eR()) {
          break label255;
        }
      }
    }
    label169:
    RecyclerView.LayoutParams localLayoutParams;
    int n;
    for (k = m;; k = e(k - m, localLayoutParams.bottomMargin + n, localh.getPaddingTop(), localh.mHeight - localh.getPaddingBottom(), i))
    {
      i = (int)Math.ceil(aZ((int)Math.sqrt(j * j + k * k)) / 0.3356D);
      if (i > 0) {
        parama.a(-j, -k, i, this.Dy);
      }
      return;
      if (this.RF.x > 0.0F)
      {
        i = 1;
        break;
      }
      i = -1;
      break;
      localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      j = RecyclerView.h.bi(paramView);
      n = localLayoutParams.leftMargin;
      int i1 = RecyclerView.h.bk(paramView);
      j = e(j - n, localLayoutParams.rightMargin + i1, localh.getPaddingLeft(), localh.mWidth - localh.getPaddingRight(), i);
      break label49;
      label235:
      i = k;
      if (this.RF.y > 0.0F) {
        break label70;
      }
      i = -1;
      break label70;
      label255:
      localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      k = RecyclerView.h.bj(paramView);
      m = localLayoutParams.topMargin;
      n = RecyclerView.h.bl(paramView);
    }
  }
  
  public abstract PointF aW(int paramInt);
  
  public int aZ(int paramInt)
  {
    return (int)Math.ceil(Math.abs(paramInt) * this.RG);
  }
  
  protected final void onStop()
  {
    this.RI = 0;
    this.RH = 0;
    this.RF = null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */