package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.compatible.f.a;
import com.tencent.mm.compatible.util.d;

public class ScanMaskView
  extends View
{
  private Paint mPaint;
  private final long oxA;
  float oxB;
  float oxC;
  float oxD;
  float oxE;
  private Paint oxF;
  ValueAnimator oxG;
  private Bitmap oxd;
  private Bitmap oxe;
  private Bitmap oxf;
  private Bitmap oxg;
  int oxh;
  int oxi;
  private boolean oxj;
  private Rect oxk;
  private Rect oxl;
  private Rect oxm;
  private Rect oxn;
  private Rect oxo;
  private Rect oxp;
  private Rect oxq;
  private Rect oxr;
  private Rect oxs;
  private Path oxt;
  Rect oxu;
  private PorterDuffXfermode oxv;
  private int oxw;
  private long oxx;
  boolean oxy;
  Rect oxz;
  
  public ScanMaskView(Context paramContext, Rect paramRect)
  {
    super(paramContext);
    GMTrace.i(6120596832256L, 45602);
    this.oxd = null;
    this.oxe = null;
    this.oxf = null;
    this.oxg = null;
    this.oxh = 0;
    this.oxi = 0;
    this.oxj = false;
    this.oxk = new Rect();
    this.oxl = new Rect();
    this.oxm = new Rect();
    this.oxn = new Rect();
    this.oxo = new Rect();
    this.oxp = new Rect();
    this.oxq = new Rect();
    this.oxr = new Rect();
    this.oxs = new Rect();
    this.oxt = new Path();
    this.oxw = R.e.aOO;
    this.oxx = 0L;
    this.oxy = false;
    this.oxA = 200L;
    this.oxB = 0.0F;
    this.oxC = 0.0F;
    this.oxD = 0.0F;
    this.oxE = 0.0F;
    this.oxG = null;
    this.oxu = paramRect;
    getDrawingRect(this.oxk);
    this.mPaint = new Paint();
    this.oxd = a.decodeResource(getResources(), R.g.aZJ);
    this.oxe = a.decodeResource(getResources(), R.g.aZK);
    this.oxf = a.decodeResource(getResources(), R.g.aZL);
    this.oxg = a.decodeResource(getResources(), R.g.aZM);
    this.oxh = this.oxd.getWidth();
    this.oxi = this.oxd.getHeight();
    this.oxF = new Paint();
    this.oxv = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    GMTrace.o(6120596832256L, 45602);
  }
  
  public ScanMaskView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6120462614528L, 45601);
    this.oxd = null;
    this.oxe = null;
    this.oxf = null;
    this.oxg = null;
    this.oxh = 0;
    this.oxi = 0;
    this.oxj = false;
    this.oxk = new Rect();
    this.oxl = new Rect();
    this.oxm = new Rect();
    this.oxn = new Rect();
    this.oxo = new Rect();
    this.oxp = new Rect();
    this.oxq = new Rect();
    this.oxr = new Rect();
    this.oxs = new Rect();
    this.oxt = new Path();
    this.oxw = R.e.aOO;
    this.oxx = 0L;
    this.oxy = false;
    this.oxA = 200L;
    this.oxB = 0.0F;
    this.oxC = 0.0F;
    this.oxD = 0.0F;
    this.oxE = 0.0F;
    this.oxG = null;
    GMTrace.o(6120462614528L, 45601);
  }
  
  public final void bdb()
  {
    GMTrace.i(6120731049984L, 45603);
    this.oxj = true;
    if (this.oxd != null)
    {
      this.oxd.recycle();
      this.oxd = null;
    }
    if (this.oxe != null)
    {
      this.oxe.recycle();
      this.oxe = null;
    }
    if (this.oxf != null)
    {
      this.oxf.recycle();
      this.oxf = null;
    }
    if (this.oxg != null)
    {
      this.oxg.recycle();
      this.oxg = null;
    }
    GMTrace.o(6120731049984L, 45603);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(6120865267712L, 45604);
    if ((this.oxu == null) || (this.oxj))
    {
      GMTrace.o(6120865267712L, 45604);
      return;
    }
    System.currentTimeMillis();
    System.currentTimeMillis();
    int i = paramCanvas.save();
    this.mPaint.reset();
    if (d.eu(18))
    {
      this.oxp.left = 0;
      this.oxp.top = this.oxu.top;
      this.oxp.right = this.oxu.left;
      this.oxp.bottom = this.oxu.bottom;
      this.oxq.left = this.oxu.left;
      this.oxq.top = 0;
      this.oxq.right = this.oxu.right;
      this.oxq.bottom = this.oxu.top;
      this.oxr.left = this.oxu.right;
      this.oxr.top = this.oxu.top;
      this.oxr.right = getWidth();
      this.oxr.bottom = this.oxu.bottom;
      this.oxs.left = this.oxu.left;
      this.oxs.top = this.oxu.bottom;
      this.oxs.right = this.oxu.right;
      this.oxs.bottom = getHeight();
      this.oxl.left = 0;
      this.oxl.top = 0;
      this.oxl.right = this.oxu.left;
      this.oxl.bottom = this.oxu.top;
      this.oxm.left = this.oxu.right;
      this.oxm.top = 0;
      this.oxm.right = getWidth();
      this.oxm.bottom = this.oxu.top;
      this.oxn.left = 0;
      this.oxn.top = this.oxu.bottom;
      this.oxn.right = this.oxu.left;
      this.oxn.bottom = getHeight();
      this.oxo.left = this.oxu.right;
      this.oxo.top = this.oxu.bottom;
      this.oxo.right = getWidth();
      this.oxo.bottom = getHeight();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxp, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxq, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxr, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxs, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxl, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxm, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxn, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.oxo, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
      paramCanvas.restore();
    }
    for (;;)
    {
      System.currentTimeMillis();
      System.currentTimeMillis();
      paramCanvas.restoreToCount(i);
      this.mPaint.reset();
      this.mPaint.setStyle(Paint.Style.STROKE);
      this.mPaint.setStrokeWidth(1.0F);
      this.mPaint.setColor(-3355444);
      this.mPaint.setAntiAlias(true);
      paramCanvas.drawRect(this.oxu, this.mPaint);
      System.currentTimeMillis();
      System.currentTimeMillis();
      paramCanvas.drawBitmap(this.oxd, this.oxu.left, this.oxu.top, this.oxF);
      paramCanvas.drawBitmap(this.oxe, this.oxu.right - this.oxh, this.oxu.top, this.oxF);
      paramCanvas.drawBitmap(this.oxf, this.oxu.left, this.oxu.bottom - this.oxi, this.oxF);
      paramCanvas.drawBitmap(this.oxg, this.oxu.right - this.oxh, this.oxu.bottom - this.oxi, this.oxF);
      System.currentTimeMillis();
      super.onDraw(paramCanvas);
      System.currentTimeMillis();
      GMTrace.o(6120865267712L, 45604);
      return;
      paramCanvas.clipRect(this.oxu, Region.Op.DIFFERENCE);
      paramCanvas.drawColor(getResources().getColor(this.oxw));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\ScanMaskView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */