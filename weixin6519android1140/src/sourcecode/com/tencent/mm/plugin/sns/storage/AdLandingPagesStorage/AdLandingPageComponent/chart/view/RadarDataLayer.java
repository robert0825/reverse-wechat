package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RadarDataLayer
  extends DataLayerView
{
  public static final Point pGa;
  private Path mf;
  private int pFV;
  private float pFY;
  private a pGb;
  private a pGc;
  private b pGd;
  private ValueAnimator pGe;
  private boolean pGf;
  private int pGg;
  private Point pGh;
  
  static
  {
    GMTrace.i(8214527606784L, 61203);
    pGa = new Point(0, 0);
    GMTrace.o(8214527606784L, 61203);
  }
  
  public RadarDataLayer(Context paramContext, float paramFloat, a parama)
  {
    super(paramContext);
    GMTrace.i(8213588082688L, 61196);
    this.pGd = new b();
    this.pGf = true;
    this.pFV = 4;
    this.pGg = 80;
    this.pGh = pGa;
    this.pFY = 1.0F;
    this.mf = new Path();
    this.pFY = paramFloat;
    this.pGd = parama.pFi;
    this.pFV = parama.size();
    this.pGb = parama;
    paramContext = parama.pFj;
    long l = parama.duration;
    if (l > 0L)
    {
      this.pGe = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.pGc = new a();
      this.pGe.setDuration(l);
      this.pGe.setInterpolator(paramContext);
      this.pGe.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(8210635292672L, 61174);
          float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
          paramAnonymousValueAnimator = RadarDataLayer.a(RadarDataLayer.this).entrySet().iterator();
          while (paramAnonymousValueAnimator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)paramAnonymousValueAnimator.next();
            RadarDataLayer.b(RadarDataLayer.this).put(localEntry.getKey(), Float.valueOf(((Float)localEntry.getValue()).floatValue() * f));
            RadarDataLayer.this.invalidate();
          }
          GMTrace.o(8210635292672L, 61174);
        }
      });
    }
    GMTrace.o(8213588082688L, 61196);
  }
  
  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8213319647232L, 61194);
    this.pGd = new b();
    this.pGf = true;
    this.pFV = 4;
    this.pGg = 80;
    this.pGh = pGa;
    this.pFY = 1.0F;
    this.mf = new Path();
    bkv();
    GMTrace.o(8213319647232L, 61194);
  }
  
  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8213453864960L, 61195);
    this.pGd = new b();
    this.pGf = true;
    this.pFV = 4;
    this.pGg = 80;
    this.pGh = pGa;
    this.pFY = 1.0F;
    this.mf = new Path();
    bkv();
    GMTrace.o(8213453864960L, 61195);
  }
  
  private void bkv()
  {
    GMTrace.i(8213722300416L, 61197);
    setMinimumHeight(160);
    setMinimumWidth(160);
    GMTrace.o(8213722300416L, 61197);
  }
  
  protected final int bks()
  {
    GMTrace.i(8213856518144L, 61198);
    int i = this.pGg;
    GMTrace.o(8213856518144L, 61198);
    return i * 2;
  }
  
  protected final int bkt()
  {
    GMTrace.i(8213990735872L, 61199);
    int i = this.pGg;
    GMTrace.o(8213990735872L, 61199);
    return i * 2;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8214124953600L, 61200);
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    this.pGg = ((int)(Math.min(i, j) / 2.0F * 0.8D));
    this.pGh.set((int)(j / 2.0F), (int)(i / 2.0F));
    if (this.pGb == null) {
      throw new RuntimeException("Error: NullPointerException at data.");
    }
    Object localObject1;
    label116:
    Object localObject2;
    label339:
    label351:
    b localb;
    if (this.pGb != null)
    {
      float f1;
      float f2;
      if (this.pGc == null)
      {
        localObject1 = this.pGb.entrySet();
        localObject1 = ((Set)localObject1).iterator();
        i = 0;
        if (!((Iterator)localObject1).hasNext()) {
          break label351;
        }
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        f1 = (float)(this.pGh.x - ((Float)((Map.Entry)localObject2).getValue()).floatValue() / this.pFY * this.pGg * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.pFV));
        f2 = (float)(this.pGh.y - ((Float)((Map.Entry)localObject2).getValue()).floatValue() / this.pFY * this.pGg * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.pFV));
        if (i != 0) {
          break label339;
        }
        this.mf.moveTo(f1, f2);
      }
      for (;;)
      {
        if (this.pGf)
        {
          float f3 = this.pGd.pFq;
          localObject2 = new Paint();
          ((Paint)localObject2).setColor(this.pGd.pFp);
          paramCanvas.drawCircle(f1, f2, f3, (Paint)localObject2);
        }
        i += 1;
        break label116;
        localObject1 = this.pGc.entrySet();
        break;
        this.mf.lineTo(f1, f2);
      }
      this.mf.close();
      localObject1 = this.mf;
      localObject2 = new Paint();
      localb = this.pGd;
      if (localb.pFn != -1) {
        break label513;
      }
    }
    label513:
    for (i = localb.pFl;; i = localb.pFn)
    {
      ((Paint)localObject2).setColor(i);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      ((Paint)localObject2).setAntiAlias(true);
      ((Paint)localObject2).setAlpha(this.pGd.pFo);
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localObject1 = this.mf;
      localObject2 = new Paint();
      ((Paint)localObject2).setColor(this.pGd.pFl);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setStrokeWidth(this.pGd.pFm);
      ((Paint)localObject2).setAntiAlias(true);
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      this.mf.reset();
      GMTrace.o(8214124953600L, 61200);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\chart\view\RadarDataLayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */