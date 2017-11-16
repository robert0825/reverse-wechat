package com.tencent.mm.pluginsdk.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.k;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Random;

public final class m
  extends Drawable
{
  private Context context;
  ValueAnimator iKQ;
  private Paint jrC;
  private Random random;
  private Drawable tuD;
  private int tuE;
  private int tuF;
  private Interpolator tuG;
  private Interpolator tuH;
  private int tuI;
  private int tuJ;
  private int tuK;
  private int tuL;
  private int tuM;
  private int tuN;
  private int tuO;
  private int tuP;
  private int tuQ;
  private int tuR;
  private int tuS;
  float tuT;
  private float tuU;
  private float tuV;
  private float tuW;
  private float tuX;
  boolean tuY;
  private int tuZ;
  private int tva;
  private int tvb;
  int tvc;
  private RectF tvd;
  
  public m(Context paramContext)
  {
    GMTrace.i(1058172567552L, 7884);
    this.tuD = null;
    this.tuE = 0;
    this.tuF = 0;
    this.jrC = new Paint(1);
    this.tuG = new LinearInterpolator();
    this.tuH = new AccelerateDecelerateInterpolator();
    this.random = new Random(System.currentTimeMillis());
    this.tuS = 0;
    this.tuT = 0.0F;
    this.tuU = -90.0F;
    this.tuV = 0.0F;
    this.tuW = 0.0F;
    this.tuX = 5.0F;
    this.tuY = false;
    this.tvc = 2;
    this.iKQ = ValueAnimator.ofFloat(new float[] { 0.0F, 100.0F });
    this.iKQ.setInterpolator(this.tuG);
    this.iKQ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(1173331378176L, 8742);
        m.a(m.this, ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        m.this.invalidateSelf();
        GMTrace.o(1173331378176L, 8742);
      }
    });
    this.tvd = new RectF();
    this.context = paramContext;
    this.tuE = a.c(paramContext, R.e.aPp);
    this.tuF = a.c(paramContext, R.e.aOB);
    this.tuD = paramContext.getResources().getDrawable(R.k.cPw);
    this.tuL = a.W(paramContext, R.f.aTf);
    this.tuM = a.W(paramContext, R.f.aTe);
    this.tuN = a.W(paramContext, R.f.aSY);
    this.tuS = a.W(paramContext, R.f.aTd);
    this.tuJ = a.c(paramContext, R.e.aPi);
    this.tuK = a.W(paramContext, R.f.aTa);
    this.tuQ = a.W(paramContext, R.f.aSZ);
    this.tuR = a.c(paramContext, R.e.aPj);
    this.tuZ = this.tuQ;
    this.tva = this.tuZ;
    this.tvb = a.W(paramContext, R.f.aTc);
    this.tuO = a.W(paramContext, R.f.aTc);
    this.tuP = a.W(paramContext, R.f.aTb);
    this.tuI = a.W(paramContext, R.f.aTg);
    GMTrace.o(1058172567552L, 7884);
  }
  
  private static boolean h(Canvas paramCanvas)
  {
    GMTrace.i(1059246309376L, 7892);
    if ((paramCanvas == null) || (paramCanvas.getWidth() == 0) || (paramCanvas.getHeight() == 0))
    {
      GMTrace.o(1059246309376L, 7892);
      return true;
    }
    GMTrace.o(1059246309376L, 7892);
    return false;
  }
  
  public final void bLd()
  {
    GMTrace.i(1058306785280L, 7885);
    w.d("MicroMsg.VoiceInputDrawable", "readyState %s", new Object[] { Integer.valueOf(this.tvc) });
    this.tvc = 2;
    this.iKQ.cancel();
    this.tuT = 0.0F;
    this.tuU = -90.0F;
    this.tuV = 0.0F;
    this.tuW = 0.0F;
    this.tuX = 5.0F;
    invalidateSelf();
    GMTrace.o(1058306785280L, 7885);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(1058441003008L, 7886);
    int i;
    int j;
    if (((this.tvc == 6) || (this.tvc == 7)) && (!h(paramCanvas)))
    {
      i = paramCanvas.getWidth() >> 1;
      j = paramCanvas.getHeight() >> 1;
      this.jrC.setShader(null);
      this.jrC.setStyle(Paint.Style.FILL);
      this.jrC.setColor(this.tuJ);
      if (this.tvc != 7) {
        break label463;
      }
      if (this.tuY)
      {
        this.tvb -= 4;
        this.tvb = Math.min(Math.max(this.tuO, this.tvb), this.tuP);
        paramCanvas.drawCircle(i, j, this.tvb, this.jrC);
      }
    }
    else
    {
      label143:
      if ((this.tuD != null) && (!h(paramCanvas))) {
        break label483;
      }
      if ((this.tvc == 4) && (paramCanvas != null))
      {
        this.jrC.setColor(this.tuE);
        this.jrC.setStrokeWidth(this.tuI);
        this.jrC.setStyle(Paint.Style.STROKE);
        this.jrC.clearShadowLayer();
        this.jrC.setShader(null);
        this.tvd.left = (paramCanvas.getWidth() / 2 - this.tuQ);
        this.tvd.top = (paramCanvas.getHeight() / 2 - this.tuQ);
        this.tvd.right = (paramCanvas.getWidth() / 2 + this.tuQ);
        this.tvd.bottom = (paramCanvas.getHeight() / 2 + this.tuQ);
        paramCanvas.drawArc(this.tvd, this.tuU, this.tuW, false, this.jrC);
        this.tuU += this.tuV;
        this.tuW += this.tuX;
        if (this.tuW < 360.0F) {
          break label578;
        }
        this.tuX = (-this.tuX);
        this.tuV = 5.0F;
      }
    }
    for (;;)
    {
      if (((this.tvc == 6) || (this.tvc == 7)) && (!h(paramCanvas)))
      {
        this.jrC.setStyle(Paint.Style.FILL);
        this.jrC.setColor(this.tuR);
        paramCanvas.drawCircle(paramCanvas.getWidth() >> 1, paramCanvas.getHeight() >> 1, this.tuS, this.jrC);
      }
      GMTrace.o(1058441003008L, 7886);
      return;
      this.tvb += 4;
      break;
      label463:
      paramCanvas.drawCircle(i, j, this.tuO, this.jrC);
      break label143;
      label483:
      if (this.tvc == 5) {
        this.tuD.setColorFilter(this.tuF, PorterDuff.Mode.SRC_ATOP);
      }
      for (;;)
      {
        i = paramCanvas.getWidth() / 2;
        j = paramCanvas.getHeight() / 2;
        this.tuD.setBounds(i - this.tuS, j - this.tuS, i + this.tuS, j + this.tuS);
        this.tuD.draw(paramCanvas);
        break;
        this.tuD.setColorFilter(this.tuE, PorterDuff.Mode.SRC_ATOP);
      }
      label578:
      if (this.tuW <= 0.0F)
      {
        this.tuX = (-this.tuX);
        this.tuV = 0.0F;
        this.tuU = -90.0F;
        this.tuW = 0.0F;
      }
    }
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(1058977873920L, 7890);
    int i = this.tuS;
    GMTrace.o(1058977873920L, 7890);
    return i * 2;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(1058843656192L, 7889);
    if (this.context == null)
    {
      GMTrace.o(1058843656192L, 7889);
      return 0;
    }
    int i = a.ef(this.context);
    GMTrace.o(1058843656192L, 7889);
    return i;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(1059112091648L, 7891);
    GMTrace.o(1059112091648L, 7891);
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(1058575220736L, 7887);
    GMTrace.o(1058575220736L, 7887);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(1058709438464L, 7888);
    GMTrace.o(1058709438464L, 7888);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */