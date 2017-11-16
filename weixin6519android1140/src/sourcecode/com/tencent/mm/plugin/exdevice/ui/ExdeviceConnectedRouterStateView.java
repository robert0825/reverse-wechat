package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ae;

public class ExdeviceConnectedRouterStateView
  extends ImageView
{
  private int bottom;
  private ae ghS;
  int kGZ;
  private int kHa;
  private Runnable kHb;
  private int left;
  private Context mContext;
  private Paint mPaint;
  private int right;
  private int state;
  private int top;
  
  public ExdeviceConnectedRouterStateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(11107322298368L, 82756);
    GMTrace.o(11107322298368L, 82756);
  }
  
  public ExdeviceConnectedRouterStateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11107456516096L, 82757);
    this.kGZ = 2;
    this.left = -1;
    this.top = -1;
    this.right = -1;
    this.bottom = -1;
    this.kHa = -1;
    this.kHb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11080612970496L, 82557);
        ExdeviceConnectedRouterStateView.this.invalidate();
        GMTrace.o(11080612970496L, 82557);
      }
    };
    this.mContext = paramContext;
    this.mPaint = new Paint();
    this.mPaint.setAntiAlias(true);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.left = a.fromDPToPix(this.mContext, 2);
    this.top = this.left;
    this.kHa = a.fromDPToPix(this.mContext, 3);
    this.ghS = new ae(Looper.getMainLooper());
    GMTrace.o(11107456516096L, 82757);
  }
  
  private void nf(int paramInt)
  {
    GMTrace.i(11107859169280L, 82760);
    this.ghS.removeCallbacks(this.kHb);
    this.ghS.postDelayed(this.kHb, paramInt);
    GMTrace.o(11107859169280L, 82760);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(11107724951552L, 82759);
    super.onDraw(paramCanvas);
    if (this.state == 1)
    {
      int i = getWidth() / 2;
      this.mPaint.setARGB(255, 103, 209, 79);
      this.mPaint.setStrokeWidth(this.kHa);
      if (this.right == -1) {
        this.right = (i * 2 - this.left);
      }
      if (this.bottom == -1) {
        this.bottom = this.right;
      }
      paramCanvas.drawArc(new RectF(this.left, this.top, this.right, this.bottom), 270.0F, this.kGZ, false, this.mPaint);
      this.kGZ += 5;
      if (this.kGZ > 365) {
        this.kGZ = 0;
      }
      nf(100);
    }
    GMTrace.o(11107724951552L, 82759);
  }
  
  public final void setState(int paramInt)
  {
    GMTrace.i(11107590733824L, 82758);
    this.state = paramInt;
    nf(10);
    GMTrace.o(11107590733824L, 82758);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceConnectedRouterStateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */