package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView;
import java.util.ArrayList;
import java.util.List;

public class RadarGrid
  extends ChartGridView
{
  public static final Point pGa;
  private Rect eI;
  private Path mf;
  private int pFV;
  private int pFW;
  private float pFY;
  public c pFZ;
  private int pGg;
  private Point pGh;
  private Spannable[] pGj;
  private List<PointF> pGk;
  
  static
  {
    GMTrace.i(8213185429504L, 61193);
    pGa = new Point(0, 0);
    GMTrace.o(8213185429504L, 61193);
  }
  
  public RadarGrid(Context paramContext, int paramInt1, int paramInt2, float paramFloat, Spannable[] paramArrayOfSpannable, c paramc)
  {
    super(paramContext);
    GMTrace.i(8211843252224L, 61183);
    this.pFV = 4;
    this.pFW = 4;
    this.pFY = 1.0F;
    this.pGg = 80;
    this.pGh = pGa;
    this.mf = new Path();
    this.eI = new Rect();
    this.pFY = paramFloat;
    this.pFV = paramInt1;
    this.pFW = paramInt2;
    this.pFY = paramFloat;
    this.pGj = paramArrayOfSpannable;
    this.pFZ = paramc;
    GMTrace.o(8211843252224L, 61183);
  }
  
  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8211574816768L, 61181);
    this.pFV = 4;
    this.pFW = 4;
    this.pFY = 1.0F;
    this.pGg = 80;
    this.pGh = pGa;
    this.mf = new Path();
    this.eI = new Rect();
    bkv();
    GMTrace.o(8211574816768L, 61181);
  }
  
  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8211709034496L, 61182);
    this.pFV = 4;
    this.pFW = 4;
    this.pFY = 1.0F;
    this.pGg = 80;
    this.pGh = pGa;
    this.mf = new Path();
    this.eI = new Rect();
    bkv();
    GMTrace.o(8211709034496L, 61182);
  }
  
  private List<PointF> ap(float paramFloat)
  {
    GMTrace.i(8212380123136L, 61187);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.pFV)
    {
      PointF localPointF = new PointF();
      localPointF.set((float)(this.pGh.x - this.pGg * paramFloat * Math.sin(i * 2 * 3.141592653589793D / this.pFV)), (float)(this.pGh.y - this.pGg * paramFloat * Math.cos(i * 2 * 3.141592653589793D / this.pFV)));
      localArrayList.add(localPointF);
      i += 1;
    }
    GMTrace.o(8212380123136L, 61187);
    return localArrayList;
  }
  
  private void bkv()
  {
    GMTrace.i(8211977469952L, 61184);
    setMinimumHeight(160);
    setMinimumWidth(160);
    GMTrace.o(8211977469952L, 61184);
  }
  
  private Paint bkw()
  {
    GMTrace.i(8212648558592L, 61189);
    Paint localPaint = new Paint();
    localPaint.setColor(this.pFZ.backgroundColor);
    localPaint.setAntiAlias(true);
    GMTrace.o(8212648558592L, 61189);
    return localPaint;
  }
  
  private Paint bkx()
  {
    GMTrace.i(8212782776320L, 61190);
    Paint localPaint = new Paint();
    c localc = this.pFZ;
    int i;
    if (localc.pFw == -1)
    {
      i = localc.pFx;
      localPaint.setColor(i);
      localPaint.setStyle(Paint.Style.STROKE);
      localc = this.pFZ;
      if (localc.pFA != -1.0F) {
        break label101;
      }
    }
    label101:
    for (float f = localc.pFz;; f = localc.pFA)
    {
      localPaint.setStrokeWidth(f);
      localPaint.setAntiAlias(true);
      GMTrace.o(8212782776320L, 61190);
      return localPaint;
      i = localc.pFw;
      break;
    }
  }
  
  private Paint bky()
  {
    GMTrace.i(8212916994048L, 61191);
    Paint localPaint = new Paint();
    localPaint.setColor(this.pFZ.pFx);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(this.pFZ.pFz);
    localPaint.setAntiAlias(true);
    GMTrace.o(8212916994048L, 61191);
    return localPaint;
  }
  
  protected final int bks()
  {
    GMTrace.i(8212111687680L, 61185);
    int i = this.pGg;
    GMTrace.o(8212111687680L, 61185);
    return i * 2;
  }
  
  protected final int bkt()
  {
    GMTrace.i(8212245905408L, 61186);
    int i = this.pGg;
    GMTrace.o(8212245905408L, 61186);
    return i * 2;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8212514340864L, 61188);
    super.onDraw(paramCanvas);
    int j = getHeight();
    int i = getWidth();
    this.pGg = ((int)(Math.min(j, i) / 2.0F * 0.8D));
    this.pGh.set((int)(i / 2.0F), (int)(j / 2.0F));
    if (this.pFZ.pFL != null)
    {
      i = (int)(i / 2.0F);
      j = (int)(j / 2.0F);
      int k = (int)(this.pGg * 2 + this.pFZ.pFI * 2.0F);
      int m = this.pFZ.pFL.getWidth() * k / this.pFZ.pFL.getHeight();
      if (this.pFZ.pFL != null) {
        paramCanvas.drawBitmap(Bitmap.createScaledBitmap(this.pFZ.pFL, m, k, false), i - (m >>> 1), j - (k >>> 1), null);
      }
    }
    if (this.pFZ.pFs) {
      switch (this.pFZ.pFr)
      {
      }
    }
    Object localObject;
    float f1;
    float f2;
    float f3;
    while (this.pFZ.pFt)
    {
      this.pGk = ap(1.0F);
      i = 0;
      while (i < this.pFV)
      {
        localObject = (PointF)this.pGk.get(i);
        f1 = this.pGh.x;
        f2 = this.pGh.y;
        f3 = ((PointF)localObject).x;
        float f4 = ((PointF)localObject).y;
        localObject = new Paint();
        ((Paint)localObject).setColor(this.pFZ.pFy);
        ((Paint)localObject).setStrokeWidth(this.pFZ.pFz);
        paramCanvas.drawLine(f1, f2, f3, f4, (Paint)localObject);
        i += 1;
      }
      paramCanvas.drawCircle(this.pGh.x, this.pGh.y, this.pGg, bkw());
      continue;
      this.pGk = ap(1.0F);
      i = 0;
      if (i < this.pFV)
      {
        localObject = (PointF)this.pGk.get(i);
        if (i == 0) {
          this.mf.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
        for (;;)
        {
          i += 1;
          break;
          this.mf.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
      }
      this.mf.close();
      if ((this.pFZ.backgroundColor != 0) && (this.pFZ.pFL == null)) {
        paramCanvas.drawPath(this.mf, bkw());
      }
    }
    if (this.pFZ.pFs) {
      switch (this.pFZ.pFr)
      {
      }
    }
    for (;;)
    {
      if ((this.pGj != null) && (this.pFZ.pFv)) {
        if (this.pGj.length != this.pFV)
        {
          throw new RuntimeException("Labels array length not matches longitude lines number.");
          paramCanvas.drawCircle(this.pGh.x, this.pGh.y, this.pGg, bkx());
          i = 1;
          while (i < this.pFW)
          {
            paramCanvas.drawCircle(this.pGh.x, this.pGh.y, this.pGg * (i * 1.0F / this.pFW), bky());
            i += 1;
          }
          paramCanvas.drawPath(this.mf, bkx());
          this.mf.reset();
          i = 1;
          while (i < this.pFW)
          {
            this.pGk = ap(i * 1.0F / this.pFW);
            j = 0;
            if (j < this.pFV)
            {
              localObject = (PointF)this.pGk.get(j);
              if (j == 0) {
                this.mf.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
              for (;;)
              {
                f1 = ((PointF)localObject).x;
                f2 = ((PointF)localObject).y;
                f3 = this.pFZ.pFK;
                localObject = new Paint();
                ((Paint)localObject).setColor(this.pFZ.pFJ);
                ((Paint)localObject).setStyle(Paint.Style.FILL);
                ((Paint)localObject).setAntiAlias(true);
                paramCanvas.drawCircle(f1, f2, f3, (Paint)localObject);
                j += 1;
                break;
                this.mf.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
            }
            this.mf.close();
            paramCanvas.drawPath(this.mf, bky());
            this.mf.reset();
            i += 1;
          }
        }
        else
        {
          i = 0;
          if (i < this.pFV)
          {
            localObject = this.pGj[i];
            if (!localObject.equals(null))
            {
              if ((i != 0) && (i != this.pFV >>> 1)) {
                break label1183;
              }
              f1 = 0.5F;
              label968:
              if (i != 0) {
                break label1209;
              }
              f2 = this.pFZ.pFD;
            }
          }
        }
      }
    }
    for (;;)
    {
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.setColor(this.pFZ.pFB);
      localTextPaint.setTextSize(this.pFZ.pFC);
      localObject = new StaticLayout((CharSequence)localObject, localTextPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 0.0F, 0.0F, false);
      f1 = (float)(this.pGh.x - ((StaticLayout)localObject).getLineWidth(0) * f1 - (this.pGg + this.pFZ.pFD) * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.pFV));
      f2 = (float)(this.pGh.y - ((StaticLayout)localObject).getHeight() / 2 - (this.pGg + this.pFZ.pFD) * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.pFV) - f2);
      paramCanvas.save();
      paramCanvas.translate(f1, f2);
      ((StaticLayout)localObject).draw(paramCanvas);
      paramCanvas.restore();
      i += 1;
      break;
      label1183:
      if ((i > 0) && (i < this.pFV >>> 1))
      {
        f1 = 0.0F;
        break label968;
      }
      f1 = 1.0F;
      break label968;
      label1209:
      if (i == this.pFV >>> 1)
      {
        f2 = -this.pFZ.pFD;
        continue;
        GMTrace.o(8212514340864L, 61188);
      }
      else
      {
        f2 = 0.0F;
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    GMTrace.i(8213051211776L, 61192);
    this.pFZ.backgroundColor = paramInt;
    invalidate();
    GMTrace.o(8213051211776L, 61192);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\chart\view\RadarGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */