package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.sdk.platformtools.w;

public class FaceDetectDecorView
  extends View
{
  public boolean kYM;
  public boolean kYN;
  public boolean kYO;
  public RectF kYP;
  private Paint kYQ;
  
  public FaceDetectDecorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5931618271232L, 44194);
    GMTrace.o(5931618271232L, 44194);
  }
  
  public FaceDetectDecorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5931752488960L, 44195);
    this.kYM = false;
    this.kYN = false;
    this.kYO = false;
    this.kYP = null;
    this.kYQ = null;
    this.kYQ = new Paint();
    this.kYQ.setColor(getResources().getColor(a.b.black));
    this.kYQ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    setLayerType(1, null);
    GMTrace.o(5931752488960L, 44195);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(5931886706688L, 44196);
    super.onDraw(paramCanvas);
    w.i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", new Object[] { Boolean.valueOf(this.kYN), Boolean.valueOf(this.kYM), this.kYP });
    if ((this.kYN != this.kYM) || (this.kYO))
    {
      if (!this.kYN) {
        break label119;
      }
      paramCanvas.drawColor(getResources().getColor(a.b.kPd));
      paramCanvas.drawRect(this.kYP, this.kYQ);
    }
    for (;;)
    {
      this.kYM = this.kYN;
      GMTrace.o(5931886706688L, 44196);
      return;
      label119:
      paramCanvas.drawColor(getResources().getColor(a.b.transparent));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceDetectDecorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */