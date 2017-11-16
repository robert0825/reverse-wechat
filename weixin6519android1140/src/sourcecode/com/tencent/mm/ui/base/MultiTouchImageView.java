package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;

public class MultiTouchImageView
  extends ImageView
{
  public int imageHeight;
  public int imageWidth;
  public int kKD;
  public int kKE;
  protected ae mHandler;
  private boolean ndo;
  public float oyq;
  protected Bitmap pLa;
  public boolean qbc;
  private a qbz;
  protected Matrix wgA;
  protected Matrix wgB;
  private final Matrix wgC;
  private final float[] wgD;
  int wgE;
  int wgF;
  private float wgG;
  private float wgH;
  private float wgI;
  private float wgJ;
  private float wgK;
  private float wgL;
  public boolean wgM;
  public boolean wgN;
  public boolean wgO;
  private float wgP;
  private float wgQ;
  private float wgR;
  float wgS;
  public boolean wgT;
  public Drawable wgU;
  
  public MultiTouchImageView(Context paramContext, int paramInt1, int paramInt2)
  {
    this(paramContext, paramInt1, paramInt2, null);
    GMTrace.i(3154519261184L, 23503);
    GMTrace.o(3154519261184L, 23503);
  }
  
  public MultiTouchImageView(Context paramContext, int paramInt1, int paramInt2, a parama)
  {
    super(paramContext);
    GMTrace.i(3154385043456L, 23502);
    this.wgA = new Matrix();
    this.wgB = new Matrix();
    this.wgC = new Matrix();
    this.wgD = new float[9];
    this.pLa = null;
    this.wgE = -1;
    this.wgF = -1;
    this.wgG = 0.0F;
    this.wgH = 0.0F;
    this.wgI = 0.0F;
    this.ndo = false;
    this.wgJ = 2.0F;
    this.wgK = 0.75F;
    this.wgL = 20.0F;
    this.wgM = false;
    this.wgN = false;
    this.wgO = false;
    this.qbc = true;
    this.mHandler = new ae();
    this.wgR = 1.0F;
    this.wgS = 0.0F;
    this.wgT = false;
    this.imageHeight = paramInt2;
    this.imageWidth = paramInt1;
    this.qbz = parama;
    init();
    GMTrace.o(3154385043456L, 23502);
  }
  
  public MultiTouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, (byte)0);
    GMTrace.i(3154653478912L, 23504);
    GMTrace.o(3154653478912L, 23504);
  }
  
  private MultiTouchImageView(Context paramContext, AttributeSet paramAttributeSet, byte paramByte)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3154787696640L, 23505);
    this.wgA = new Matrix();
    this.wgB = new Matrix();
    this.wgC = new Matrix();
    this.wgD = new float[9];
    this.pLa = null;
    this.wgE = -1;
    this.wgF = -1;
    this.wgG = 0.0F;
    this.wgH = 0.0F;
    this.wgI = 0.0F;
    this.ndo = false;
    this.wgJ = 2.0F;
    this.wgK = 0.75F;
    this.wgL = 20.0F;
    this.wgM = false;
    this.wgN = false;
    this.wgO = false;
    this.qbc = true;
    this.mHandler = new ae();
    this.wgR = 1.0F;
    this.wgS = 0.0F;
    this.wgT = false;
    this.imageHeight = 0;
    this.imageWidth = 0;
    init();
    GMTrace.o(3154787696640L, 23505);
  }
  
  private void N(boolean paramBoolean1, boolean paramBoolean2)
  {
    float f2 = 0.0F;
    GMTrace.i(3156264091648L, 23516);
    if ((this.pLa == null) && (!this.wgT))
    {
      GMTrace.o(3156264091648L, 23516);
      return;
    }
    if ((this.wgU == null) && (this.wgT))
    {
      GMTrace.o(3156264091648L, 23516);
      return;
    }
    Matrix localMatrix = caE();
    RectF localRectF;
    float f1;
    float f3;
    if (this.wgT)
    {
      localRectF = new RectF(0.0F, 0.0F, this.wgU.getIntrinsicWidth(), this.wgU.getIntrinsicHeight());
      localMatrix.mapRect(localRectF);
      f1 = localRectF.height();
      f3 = localRectF.width();
      if (!paramBoolean2) {
        break label312;
      }
      if (f1 >= this.kKE) {
        break label263;
      }
      f1 = (this.kKE - f1) / 2.0F - localRectF.top;
    }
    for (;;)
    {
      label151:
      if (paramBoolean1) {
        if (f3 < this.kKD) {
          f2 = (this.kKD - f3) / 2.0F - localRectF.left;
        }
      }
      for (;;)
      {
        H(f2, f1);
        localMatrix = caE();
        setImageMatrix(localMatrix);
        localMatrix.mapRect(localRectF);
        localRectF.height();
        localRectF.width();
        GMTrace.o(3156264091648L, 23516);
        return;
        localRectF = new RectF(0.0F, 0.0F, this.pLa.getWidth(), this.pLa.getHeight());
        break;
        label263:
        if (localRectF.top > 0.0F)
        {
          f1 = -localRectF.top;
          break label151;
        }
        if (localRectF.bottom >= this.kKE) {
          break label463;
        }
        f1 = this.kKE - localRectF.bottom;
        break label151;
        label312:
        if (localRectF.top > 0.0F)
        {
          f1 = -localRectF.top;
          break label151;
        }
        if (localRectF.bottom >= this.kKE) {
          break label463;
        }
        f1 = this.kKE - localRectF.bottom;
        break label151;
        if (localRectF.left > 0.0F)
        {
          f2 = -localRectF.left;
        }
        else if (localRectF.right < this.kKD)
        {
          f2 = this.kKD - localRectF.right;
          continue;
          if (localRectF.left > 0.0F) {
            f2 = -localRectF.left;
          } else if (localRectF.right < this.kKD) {
            f2 = this.kKD - localRectF.right;
          }
        }
      }
      label463:
      f1 = 0.0F;
    }
  }
  
  private void caD()
  {
    boolean bool2 = true;
    GMTrace.i(3155861438464L, 23513);
    this.wgP = (this.kKD / this.imageWidth);
    this.wgQ = (this.kKE / this.imageHeight);
    this.wgN = d.bh(this.imageWidth, this.imageHeight);
    this.wgO = d.bg(this.imageWidth, this.imageHeight);
    if ((this.wgN) && (this.imageWidth > this.kKD))
    {
      bool1 = true;
      this.wgN = bool1;
      if ((!this.wgO) || (this.imageHeight <= this.kKE)) {
        break label144;
      }
    }
    label144:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.wgO = bool1;
      this.oyq = this.wgP;
      GMTrace.o(3155861438464L, 23513);
      return;
      bool1 = false;
      break;
    }
  }
  
  private Matrix caE()
  {
    GMTrace.i(3156666744832L, 23519);
    this.wgC.set(this.wgA);
    this.wgC.postConcat(this.wgB);
    Matrix localMatrix = this.wgC;
    GMTrace.o(3156666744832L, 23519);
    return localMatrix;
  }
  
  private void g(final float paramFloat1, final float paramFloat2, final float paramFloat3)
  {
    GMTrace.i(3157472051200L, 23525);
    paramFloat1 = (paramFloat1 - getScale()) / 128.0F;
    float f = getScale();
    final long l = System.currentTimeMillis();
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3285649981440L, 24480);
        long l = System.currentTimeMillis();
        float f1 = Math.min(this.wgV, (float)(l - l));
        float f2 = paramFloat1;
        float f3 = paramFloat2;
        MultiTouchImageView.this.f(f2 + f3 * f1, paramFloat3, this.ewi);
        if (f1 < this.wgV) {
          MultiTouchImageView.this.mHandler.post(this);
        }
        GMTrace.o(3285649981440L, 24480);
      }
    });
    GMTrace.o(3157472051200L, 23525);
  }
  
  private void init()
  {
    GMTrace.i(3156398309376L, 23517);
    w.d("dktest", "init screenWidth:" + this.kKD + " screenHeight :" + this.kKE);
    setScaleType(ImageView.ScaleType.MATRIX);
    float f = getContext().getResources().getDisplayMetrics().widthPixels / 720.0F;
    if (f > 1.0F) {
      this.wgR = f;
    }
    caC();
    GMTrace.o(3156398309376L, 23517);
  }
  
  public final void F(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3155593003008L, 23511);
    caD();
    g(this.oyq, paramFloat1, paramFloat2);
    GMTrace.o(3155593003008L, 23511);
  }
  
  public final void G(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3157337833472L, 23524);
    this.wgG = caH();
    g(this.wgG, paramFloat1, paramFloat2);
    GMTrace.o(3157337833472L, 23524);
  }
  
  public final void H(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3157606268928L, 23526);
    this.wgB.postTranslate(paramFloat1, paramFloat2);
    setImageMatrix(caE());
    GMTrace.o(3157606268928L, 23526);
  }
  
  public final void aw(float paramFloat)
  {
    GMTrace.i(3154250825728L, 23501);
    if (Float.compare(paramFloat, 1.0F) < 0)
    {
      w.w("MicroMsg.MultiTouchImageView", "max scale limit is less than 1.0, change nothing, return");
      GMTrace.o(3154250825728L, 23501);
      return;
    }
    this.wgL = paramFloat;
    GMTrace.o(3154250825728L, 23501);
  }
  
  public final void caC()
  {
    GMTrace.i(3155458785280L, 23510);
    this.wgB.reset();
    caD();
    f(this.oyq, 0.0F, 0.0F);
    GMTrace.o(3155458785280L, 23510);
  }
  
  public final void caF()
  {
    boolean bool2 = true;
    GMTrace.i(3156800962560L, 23520);
    boolean bool1;
    if ((!this.qbc) || (!this.wgN))
    {
      bool1 = true;
      if (this.wgO) {
        break label55;
      }
    }
    for (;;)
    {
      N(bool1, bool2);
      GMTrace.o(3156800962560L, 23520);
      return;
      bool1 = false;
      break;
      label55:
      bool2 = false;
    }
  }
  
  public final void caG()
  {
    GMTrace.i(3156935180288L, 23521);
    if ((this.wgM) && (0.0F == this.wgG)) {
      this.wgG = caH();
    }
    GMTrace.o(3156935180288L, 23521);
  }
  
  public final float caH()
  {
    GMTrace.i(3157203615744L, 23523);
    float f1 = this.oyq;
    if (this.wgP * 0.7F > f1) {
      f1 = this.wgP;
    }
    for (;;)
    {
      float f2 = f1;
      if (f1 < 1.0D) {
        f2 = 1.0F;
      }
      f1 = f2;
      if (f2 > this.wgH) {
        f1 = this.wgH;
      }
      GMTrace.o(3157203615744L, 23523);
      return f1;
      if (this.wgQ * 0.7F > f1) {
        f1 = this.wgQ;
      } else {
        f1 = this.oyq * this.wgJ;
      }
    }
  }
  
  public final void eo(int paramInt1, int paramInt2)
  {
    GMTrace.i(3154921914368L, 23506);
    this.imageWidth = paramInt1;
    this.imageHeight = paramInt2;
    GMTrace.o(3154921914368L, 23506);
  }
  
  public final void f(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool2 = false;
    GMTrace.i(3157069398016L, 23522);
    float f2 = getScale();
    float f1;
    if (this.wgM)
    {
      if (0.0F == this.wgG)
      {
        f1 = this.wgL * this.wgR;
        this.wgH = f1;
      }
    }
    else
    {
      if (paramFloat1 <= this.wgH * 2.0F) {
        break label190;
      }
      f1 = this.wgH * 2.0F + (paramFloat1 - this.wgH) * 0.1F;
      label81:
      paramFloat1 = f1 / f2;
      if (!this.wgT)
      {
        setImageMatrix(caE());
        this.wgB.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      }
      if ((this.qbc) && (this.wgN)) {
        break label211;
      }
    }
    label190:
    label211:
    for (boolean bool1 = true;; bool1 = false)
    {
      if (!this.wgO) {
        bool2 = true;
      }
      N(bool1, bool2);
      if (this.qbz == null) {
        break label232;
      }
      if (paramFloat1 <= 1.0F) {
        break label217;
      }
      this.qbz.bpd();
      GMTrace.o(3157069398016L, 23522);
      return;
      f1 = this.wgG;
      break;
      f1 = paramFloat1;
      if (paramFloat1 >= this.wgI) {
        break label81;
      }
      f1 = this.wgI;
      break label81;
    }
    label217:
    if (paramFloat1 < 1.0F) {
      this.qbz.bpc();
    }
    label232:
    GMTrace.o(3157069398016L, 23522);
  }
  
  public final float getScale()
  {
    GMTrace.i(3156532527104L, 23518);
    this.wgB.getValues(this.wgD);
    caD();
    this.wgH = (this.wgL * this.wgR);
    this.wgI = (this.oyq * this.wgK);
    if (this.wgH < 1.0F) {
      this.wgH = 1.0F;
    }
    if (this.wgI > 1.0F) {
      this.wgI = 1.0F;
    }
    float f = this.wgD[0];
    GMTrace.o(3156532527104L, 23518);
    return f;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(3155727220736L, 23512);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2)) {
      this.ndo = false;
    }
    GMTrace.o(3155727220736L, 23512);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3155324567552L, 23509);
    if ((!this.wgT) && (this.pLa != null) && (this.pLa.isRecycled()))
    {
      w.e("MicroMsg.MultiTouchImageView", "this bitmap is recycled! draw nothing!");
      GMTrace.o(3155324567552L, 23509);
      return;
    }
    super.onDraw(paramCanvas);
    GMTrace.o(3155324567552L, 23509);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3155995656192L, 23514);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      if (g.bZs())
      {
        new f();
        paramKeyEvent.startTracking();
      }
      GMTrace.o(3155995656192L, 23514);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3155995656192L, 23514);
    return bool;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    GMTrace.i(3156129873920L, 23515);
    if (paramInt == 4)
    {
      if (g.bZs()) {
        new f();
      }
      for (bool1 = paramKeyEvent.isTracking(); bool1; bool1 = false)
      {
        bool1 = bool2;
        if (g.bZs())
        {
          new f();
          bool1 = paramKeyEvent.isCanceled();
        }
        if ((bool1) || (getScale() <= 1.0F)) {
          break;
        }
        f(1.0F, this.kKD / 2.0F, this.kKE / 2.0F);
        GMTrace.o(3156129873920L, 23515);
        return true;
      }
    }
    boolean bool1 = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(3156129873920L, 23515);
    return bool1;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3155056132096L, 23507);
    super.onMeasure(paramInt1, paramInt2);
    this.kKD = View.MeasureSpec.getSize(paramInt1);
    this.kKE = View.MeasureSpec.getSize(paramInt2);
    if (!this.ndo)
    {
      this.ndo = true;
      init();
    }
    GMTrace.o(3155056132096L, 23507);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(3155190349824L, 23508);
    this.wgT = false;
    this.pLa = paramBitmap;
    this.ndo = false;
    super.setImageBitmap(paramBitmap);
    GMTrace.o(3155190349824L, 23508);
  }
  
  public static abstract interface a
  {
    public abstract void bpc();
    
    public abstract void bpd();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MultiTouchImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */