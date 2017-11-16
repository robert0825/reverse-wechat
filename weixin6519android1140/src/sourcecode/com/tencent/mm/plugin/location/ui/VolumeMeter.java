package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;

public class VolumeMeter
  extends ImageView
  implements Runnable
{
  private Paint jrC;
  View mBA;
  private int mBB;
  private int mBC;
  public ae mBD;
  float mBE;
  float mBF;
  private float mBG;
  private float mBH;
  private int mBI;
  private int mBJ;
  private float mBK;
  private float mBL;
  private int mBM;
  private float mBN;
  private float mBO;
  private float mBP;
  private float mBQ;
  private float mBR;
  public boolean mBy;
  public boolean mBz;
  private Context mContext;
  
  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9711189491712L, 72354);
    this.mBy = false;
    this.mBz = false;
    this.mBB = -1;
    this.mBC = -1;
    this.mBD = null;
    this.mBI = -6751336;
    this.mBJ = 70;
    this.mBK = 0.5F;
    this.mBL = 0.001F;
    this.mBM = 20;
    this.mBP = 0.0F;
    this.mBQ = 40.0F;
    this.mBR = 30.0F;
    this.mContext = paramContext;
    init();
    GMTrace.o(9711189491712L, 72354);
  }
  
  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9711055273984L, 72353);
    this.mBy = false;
    this.mBz = false;
    this.mBB = -1;
    this.mBC = -1;
    this.mBD = null;
    this.mBI = -6751336;
    this.mBJ = 70;
    this.mBK = 0.5F;
    this.mBL = 0.001F;
    this.mBM = 20;
    this.mBP = 0.0F;
    this.mBQ = 40.0F;
    this.mBR = 30.0F;
    this.mContext = paramContext;
    init();
    GMTrace.o(9711055273984L, 72353);
  }
  
  private void init()
  {
    GMTrace.i(9711323709440L, 72355);
    this.jrC = new Paint();
    GMTrace.o(9711323709440L, 72355);
  }
  
  public final void aLi()
  {
    GMTrace.i(9710786838528L, 72351);
    if (this.mBD == null)
    {
      new ae().postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9645288587264L, 71863);
          VolumeMeter.a(VolumeMeter.this, new ae());
          VolumeMeter.this.aLi();
          GMTrace.o(9645288587264L, 71863);
        }
      }, 100L);
      GMTrace.o(9710786838528L, 72351);
      return;
    }
    this.mBD.post(this);
    GMTrace.o(9710786838528L, 72351);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(9711457927168L, 72356);
    super.onDraw(paramCanvas);
    getWidth();
    getHeight();
    int[] arrayOfInt;
    if (this.mBA != null)
    {
      arrayOfInt = new int[2];
      this.mBA.getLocationInWindow(arrayOfInt);
      if ((arrayOfInt[0] != 0) && (arrayOfInt[1] != 0)) {
        break label81;
      }
    }
    while ((this.mBB < 0) || (this.mBC < 0))
    {
      GMTrace.o(9711457927168L, 72356);
      return;
      label81:
      int i = this.mBA.getWidth();
      int j = this.mBA.getHeight();
      if ((i != 0) && (j != 0))
      {
        int k = BackwardSupportUtil.b.a(this.mContext, 50.0F);
        this.mBB = (arrayOfInt[0] + i / 2);
        this.mBC = (arrayOfInt[1] + j / 2 - k / 2);
        this.mBO = (i / 2);
        this.mBN = (i / 2 * 2.0F);
      }
    }
    this.jrC.setColor(this.mBI);
    this.jrC.setAlpha(this.mBJ);
    float f2 = BackwardSupportUtil.b.a(this.mContext, this.mBP);
    float f1 = f2;
    if (f2 > this.mBN) {
      f1 = this.mBN;
    }
    f2 = f1;
    if (f1 < this.mBO) {
      f2 = this.mBO;
    }
    paramCanvas.drawCircle(this.mBB, this.mBC, f2, this.jrC);
    GMTrace.o(9711457927168L, 72356);
  }
  
  public final void reset()
  {
    GMTrace.i(9711592144896L, 72357);
    this.mBP = 0.0F;
    this.mBE = 0.0F;
    this.mBF = 0.0F;
    this.mBG = 0.0F;
    this.mBH = 0.0F;
    postInvalidate();
    GMTrace.o(9711592144896L, 72357);
  }
  
  public void run()
  {
    GMTrace.i(9710921056256L, 72352);
    float f2;
    float f3;
    float f1;
    if (this.mBy)
    {
      f2 = this.mBG;
      if (this.mBF <= this.mBE) {
        break label153;
      }
      f3 = (this.mBF - this.mBE) / this.mBR;
      if (f3 <= this.mBK) {
        break label134;
      }
      f1 = this.mBK;
      f1 += f2;
    }
    for (;;)
    {
      this.mBG = f1;
      this.mBH = this.mBG;
      this.mBP = ((float)(260.0D * Math.sqrt(this.mBG) - 130.0F * this.mBG) / 1.5F);
      postInvalidate();
      this.mBD.postDelayed(this, this.mBM);
      GMTrace.o(9710921056256L, 72352);
      return;
      label134:
      f1 = f3;
      if (f3 >= this.mBL) {
        break;
      }
      f1 = this.mBL;
      break;
      label153:
      if (this.mBF <= this.mBE)
      {
        f3 = (this.mBE - this.mBF) / this.mBQ;
        if (f3 > this.mBK) {
          f1 = this.mBK;
        }
        for (;;)
        {
          f1 = f2 - f1;
          break;
          f1 = f3;
          if (f3 < this.mBL) {
            f1 = this.mBL;
          }
        }
      }
      f1 = f2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\VolumeMeter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */