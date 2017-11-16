package com.tencent.mm.plugin.appbrand.widget.e;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.b.q;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends e
{
  private b.f[] iRd;
  public double[] iRe;
  private double iRf;
  private boolean iRg;
  private AnimatorSet iRh;
  public g iRi;
  
  public d(b.h paramh, b paramb, long paramLong, b.f[] paramArrayOff, boolean paramBoolean)
  {
    super(paramh, paramLong);
    GMTrace.i(19862210478080L, 147985);
    this.iRd = paramArrayOff;
    this.iRe = new double[1];
    this.iRi = new g();
    paramh = paramb.Ua();
    int i = 0;
    while (i <= 0)
    {
      this.iRe[0] = paramh.a(paramArrayOff[0], paramArrayOff[1]);
      this.iRf += this.iRe[0];
      i += 1;
    }
    paramh = new ArrayList();
    i = 0;
    while (i <= 0)
    {
      paramh.add(kl(0));
      i += 1;
    }
    this.iRo.playSequentially(paramh);
    this.iRg = paramBoolean;
    if (paramBoolean) {
      adE();
    }
    GMTrace.o(19862210478080L, 147985);
  }
  
  private void adE()
  {
    GMTrace.i(15434367631360L, 114995);
    this.iRh = new AnimatorSet();
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    float f1 = 0.0F;
    int k = 0;
    int i = 0;
    float f2;
    long l2;
    long l1;
    if (j < this.iRd.length)
    {
      if (this.iRd[i].equals(this.iRd[j])) {
        break label393;
      }
      Object localObject = this.iRi.c(this.iRd[k]);
      f localf1 = this.iRi.c(this.iRd[i]);
      f localf2 = this.iRi.c(this.iRd[j]);
      float f3 = (float)b(localf1.x - ((f)localObject).x, ((f)localObject).y - localf1.y, localf2.x - localf1.x, localf1.y - localf2.y);
      f2 = f3;
      if (f3 == NaN.0F) {
        f2 = 0.0F;
      }
      if (localArrayList.size() == 0)
      {
        f1 = ((b.h)this.iRn).getRotation();
        f2 = (float)b(0.0D, 1.0D, localf2.x - localf1.x, localf1.y - localf2.y);
        l2 = 0L;
        l1 = 0L;
        label235:
        f2 += f1;
        localObject = ValueAnimator.ofFloat(new float[] { f1, f2 });
        ((ValueAnimator)localObject).setDuration(l1);
        ((ValueAnimator)localObject).setStartDelay(l2);
        ((ValueAnimator)localObject).setInterpolator(new LinearInterpolator());
        ((ValueAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            GMTrace.i(15435709808640L, 115005);
            double d = Double.parseDouble(String.valueOf(paramAnonymousValueAnimator.getAnimatedValue()));
            ((b.h)d.this.iRn).setRotation((float)d);
            GMTrace.o(15435709808640L, 115005);
          }
        });
        localArrayList.add(localObject);
        f1 = f2;
        k = i;
        i = j;
      }
    }
    label393:
    for (;;)
    {
      j += 1;
      break;
      l1 = (Math.abs(f2) * 3.141592653589793D * 2.0D / 180.0D * this.mDuration / this.iRf);
      l2 = bF(k, i) - l1 / 2L;
      break label235;
      this.iRh.playSequentially(localArrayList);
      GMTrace.o(15434367631360L, 114995);
      return;
    }
  }
  
  private static double b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    GMTrace.i(15434501849088L, 114996);
    double d2 = Math.acos((paramDouble1 * paramDouble3 + paramDouble2 * paramDouble4) / (Math.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2) * Math.sqrt(paramDouble3 * paramDouble3 + paramDouble4 * paramDouble4))) * 180.0D / 3.141592653589793D;
    double d1 = d2;
    if (paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3 > 0.0D) {
      d1 = -d2;
    }
    paramDouble1 = (float)d1;
    GMTrace.o(15434501849088L, 114996);
    return paramDouble1;
  }
  
  private long bF(int paramInt1, int paramInt2)
  {
    GMTrace.i(15434636066816L, 114997);
    double d = 0.0D;
    while (paramInt1 < paramInt2)
    {
      d += this.iRe[paramInt1];
      paramInt1 += 1;
    }
    long l = (d * this.mDuration / this.iRf);
    GMTrace.o(15434636066816L, 114997);
    return l;
  }
  
  public final void adF()
  {
    GMTrace.i(15434770284544L, 114998);
    super.adF();
    if ((this.iRg) && (this.iRh != null)) {
      this.iRh.start();
    }
    GMTrace.o(15434770284544L, 114998);
  }
  
  protected final ValueAnimator kl(int paramInt)
  {
    GMTrace.i(15434233413632L, 114994);
    final f localf1 = this.iRi.c(this.iRd[0]);
    final f localf2 = this.iRi.c(this.iRd[1]);
    ValueAnimator localValueAnimator = new ValueAnimator();
    localValueAnimator.setDuration((this.mDuration * this.iRe[0] / this.iRf));
    localValueAnimator.setInterpolator(new LinearInterpolator());
    localValueAnimator.setFloatValues(new float[] { (float)this.iRe[0] });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(15436515115008L, 115011);
        if (localf1.equals(localf2))
        {
          GMTrace.o(15436515115008L, 115011);
          return;
        }
        double d4 = Double.parseDouble(String.valueOf(paramAnonymousValueAnimator.getAnimatedValue()));
        double d1 = localf1.x;
        double d2 = (localf2.x - localf1.x) * d4 / d.this.iRe[this.iRl];
        double d3 = localf1.y;
        d4 = d4 * (localf2.y - localf1.y) / d.this.iRe[this.iRl];
        paramAnonymousValueAnimator = (b.h)d.this.iRn;
        g localg = d.this.iRi;
        f localf = new f(d1 + d2, d3 + d4);
        d1 = localf.x / localg.iRq;
        d2 = Math.toDegrees(Math.atan(Math.exp(-(0.5D - localf.y / localg.iRq) * 2.0D * 3.141592653589793D)) * 2.0D);
        paramAnonymousValueAnimator.b(((c)h.h(c.class)).e(90.0D - d2, (d1 - 0.5D) * 360.0D));
        GMTrace.o(15436515115008L, 115011);
      }
    });
    GMTrace.o(15434233413632L, 114994);
    return localValueAnimator;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */