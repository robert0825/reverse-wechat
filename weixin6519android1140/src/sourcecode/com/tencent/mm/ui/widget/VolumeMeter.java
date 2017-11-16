package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
  private View mBA;
  private int mBB;
  private int mBC;
  private ae mBD;
  private float mBE;
  private float mBF;
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
  private boolean mBy;
  private boolean mBz;
  private Context mContext;
  
  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1642153902080L, 12235);
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
    GMTrace.o(1642153902080L, 12235);
  }
  
  public VolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1642019684352L, 12234);
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
    GMTrace.o(1642019684352L, 12234);
  }
  
  private void init()
  {
    GMTrace.i(1642288119808L, 12236);
    this.jrC = new Paint();
    GMTrace.o(1642288119808L, 12236);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(1642422337536L, 12237);
    super.onDraw(paramCanvas);
    getWidth();
    getHeight();
    if ((this.mBA == null) || (this.mBA.getVisibility() == 4)) {}
    while ((this.mBB < 0) || (this.mBC < 0))
    {
      GMTrace.o(1642422337536L, 12237);
      return;
      int[] arrayOfInt = new int[2];
      this.mBA.getLocationInWindow(arrayOfInt);
      if ((arrayOfInt[0] != 0) && (arrayOfInt[1] != 0))
      {
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
    GMTrace.o(1642422337536L, 12237);
  }
  
  public void run()
  {
    GMTrace.i(1641885466624L, 12233);
    float f2;
    float f3;
    float f1;
    if (this.mBy)
    {
      f2 = this.mBG;
      if (this.mBF <= this.mBE) {
        break label155;
      }
      f3 = (this.mBF - this.mBE) / this.mBR;
      if (f3 <= this.mBK) {
        break label136;
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
      GMTrace.o(1641885466624L, 12233);
      return;
      label136:
      f1 = f3;
      if (f3 >= this.mBL) {
        break;
      }
      f1 = this.mBL;
      break;
      label155:
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\widget\VolumeMeter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */