package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.sdk.platformtools.ae;

class SendDataToDeviceProgressBar
  extends ImageView
{
  private int bottom;
  private ae ghS;
  private int kGZ;
  private int kHa;
  private Runnable kHb;
  private int lZd;
  private int left;
  private Context mContext;
  private Paint mPaint;
  private int right;
  private int top;
  
  public SendDataToDeviceProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(2174595629056L, 16202);
    GMTrace.o(2174595629056L, 16202);
  }
  
  public SendDataToDeviceProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2174729846784L, 16203);
    this.kGZ = 2;
    this.left = -1;
    this.top = -1;
    this.right = -1;
    this.bottom = -1;
    this.kHa = -1;
    this.lZd = 10;
    this.kHb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2252307693568L, 16781);
        SendDataToDeviceProgressBar.this.invalidate();
        GMTrace.o(2252307693568L, 16781);
      }
    };
    setImageResource(R.g.aZc);
    this.mContext = paramContext;
    this.mPaint = new Paint();
    this.mPaint.setAntiAlias(true);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.left = this.mContext.getResources().getDimensionPixelSize(R.f.aSJ);
    this.top = this.left;
    this.kHa = this.mContext.getResources().getDimensionPixelSize(R.f.aSK);
    this.ghS = new ae(Looper.getMainLooper());
    GMTrace.o(2174729846784L, 16203);
  }
  
  public final int getProgress()
  {
    GMTrace.i(2174998282240L, 16205);
    int i = (int)(this.kGZ / 360.0F * 100.0F);
    GMTrace.o(2174998282240L, 16205);
    return i;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2175132499968L, 16206);
    super.onDraw(paramCanvas);
    int i = getWidth() / 2;
    this.mPaint.setColor(this.mContext.getResources().getColor(R.e.aOJ));
    this.mPaint.setStrokeWidth(this.kHa);
    if (this.right == -1) {
      this.right = (i * 2 - this.left);
    }
    if (this.bottom == -1) {
      this.bottom = this.right;
    }
    RectF localRectF = new RectF(this.left, this.top, this.right, this.bottom);
    paramCanvas.drawArc(localRectF, 270.0F, this.kGZ, false, this.mPaint);
    int j = this.kGZ + 270;
    i = j;
    if (j > 360) {
      i = j - 360;
    }
    this.mPaint.setColor(this.mContext.getResources().getColor(R.e.aOI));
    paramCanvas.drawArc(localRectF, i, 360 - this.kGZ, false, this.mPaint);
    GMTrace.o(2175132499968L, 16206);
  }
  
  public final void setProgress(int paramInt)
  {
    GMTrace.i(2174864064512L, 16204);
    int i = paramInt;
    if (paramInt >= 100) {
      i = 100;
    }
    this.kGZ = ((int)(i / 100.0F * 360.0F));
    this.ghS.removeCallbacks(this.kHb);
    this.ghS.postDelayed(this.kHb, 0L);
    GMTrace.o(2174864064512L, 16204);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\SendDataToDeviceProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */