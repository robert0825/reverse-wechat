package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public class CameraFrontSightView
  extends View
{
  int iJR;
  public int mHeight;
  Paint mPaint;
  public int mWidth;
  boolean ngG;
  boolean ngH;
  boolean ngI;
  boolean ngJ;
  long ngK;
  int ngL;
  int ngM;
  ViewGroup.LayoutParams ngN;
  
  public CameraFrontSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18667806916608L, 139086);
    this.mPaint = new Paint();
    this.ngG = false;
    this.ngH = false;
    this.ngI = false;
    this.ngJ = false;
    this.ngK = 0L;
    GMTrace.o(18667806916608L, 139086);
  }
  
  public CameraFrontSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18667672698880L, 139085);
    this.mPaint = new Paint();
    this.ngG = false;
    this.ngH = false;
    this.ngI = false;
    this.ngJ = false;
    this.ngK = 0L;
    GMTrace.o(18667672698880L, 139085);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(18667941134336L, 139087);
    paramCanvas.translate(this.ngL / 2, this.ngM / 2);
    long l = System.currentTimeMillis() - this.ngK;
    if (l > 200L)
    {
      this.ngG = false;
      this.ngH = true;
    }
    if (l > 800L)
    {
      this.ngH = false;
      this.ngI = true;
    }
    if (l > 1100L)
    {
      this.ngI = false;
      this.ngJ = true;
    }
    if (l > 1300L)
    {
      this.ngJ = false;
      setVisibility(8);
      GMTrace.o(18667941134336L, 139087);
      return;
    }
    float f;
    if (this.ngG)
    {
      f = (float)(200L - l) / 200.0F + 1.0F;
      paramCanvas.scale(f, f, this.ngL / 2, this.ngM / 2);
      this.mPaint.setAlpha((int)((2.0F - f) * 255.0F));
      if (!this.ngH) {
        break label500;
      }
      f = (float)((l - 200L) % 200L) / 200.0F * 2.0F;
      Paint localPaint = this.mPaint;
      if (f <= 1.0F) {
        break label493;
      }
      f -= 1.0F;
      label209:
      localPaint.setAlpha((int)(f * 128.0F + 127.0F));
    }
    for (;;)
    {
      if (this.ngJ)
      {
        f = (float)(l - 1100L) / 200.0F;
        this.mPaint.setAlpha((int)((1.0F - f) * 255.0F));
      }
      paramCanvas.drawLine(0.0F, 0.0F, this.ngL, 0.0F, this.mPaint);
      paramCanvas.drawLine(0.0F, 0.0F, 0.0F, this.ngM, this.mPaint);
      paramCanvas.drawLine(this.ngL, 0.0F, this.ngL, this.ngM, this.mPaint);
      paramCanvas.drawLine(0.0F, this.ngM, this.ngL, this.ngM, this.mPaint);
      paramCanvas.drawLine(0.0F, this.ngM / 2, this.ngL / 10, this.ngM / 2, this.mPaint);
      paramCanvas.drawLine(this.ngL, this.ngM / 2, this.ngL * 9 / 10, this.ngM / 2, this.mPaint);
      paramCanvas.drawLine(this.ngL / 2, 0.0F, this.ngL / 2, this.ngM / 10, this.mPaint);
      paramCanvas.drawLine(this.ngL / 2, this.ngM, this.ngL / 2, this.ngM * 9 / 10, this.mPaint);
      invalidate();
      GMTrace.o(18667941134336L, 139087);
      return;
      paramCanvas.scale(1.0F, 1.0F);
      break;
      label493:
      f = 1.0F - f;
      break label209;
      label500:
      this.mPaint.setAlpha(255);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\CameraFrontSightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */