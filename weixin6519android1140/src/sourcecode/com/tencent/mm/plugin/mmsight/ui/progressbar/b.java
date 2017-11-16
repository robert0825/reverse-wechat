package com.tencent.mm.plugin.mmsight.ui.progressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  ValueAnimator iKQ;
  public float njV;
  a njW;
  public a njX;
  public boolean njY;
  public a njZ;
  PointF nka;
  PointF nkb;
  PointF nkc;
  PointF nkd;
  PointF nke;
  PointF nkf;
  float nkg;
  float nkh;
  float nki;
  float nkj;
  Path nkk;
  private Paint nkl;
  
  public b(a parama1, a parama2, a parama)
  {
    GMTrace.i(7401839263744L, 55148);
    this.njV = 0.0F;
    this.njY = false;
    this.nkg = 0.0F;
    this.nkh = 0.0F;
    this.nki = 0.0F;
    this.nkj = 0.0F;
    this.nkl = null;
    this.njW = parama1;
    this.njX = parama2;
    this.njZ = parama;
    this.nkh = (MMSightProgressBar.kKH * 2.0F);
    this.nki = (-MMSightProgressBar.kKH * 0.5F);
    this.nkk = new Path();
    this.nkl = new Paint();
    this.nkl.setAntiAlias(true);
    this.nkl.setStyle(Paint.Style.FILL);
    GMTrace.o(7401839263744L, 55148);
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
    
    public abstract void aQJ();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\progressbar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */