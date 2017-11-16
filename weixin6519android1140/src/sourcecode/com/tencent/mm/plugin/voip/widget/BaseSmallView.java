package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public abstract class BaseSmallView
  extends FrameLayout
{
  private WindowManager kqV;
  protected ae krX;
  private View.OnClickListener mOnClickListener;
  private long mStartTime;
  CaptureView qHb;
  protected long qHm;
  private PointF qQm;
  private Point qQn;
  private Point qQo;
  private Point qQp;
  private Point qQq;
  private Runnable qQr;
  
  public BaseSmallView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5244557721600L, 39075);
    this.qQm = new PointF();
    this.qQn = new Point();
    this.qQo = new Point();
    this.qQp = new Point();
    this.qQr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5236504657920L, 39015);
        float f = (float)(System.currentTimeMillis() - BaseSmallView.a(BaseSmallView.this)) * 1.0F / 200.0F;
        if (f <= 1.0F)
        {
          BaseSmallView.this.krX.postDelayed(BaseSmallView.b(BaseSmallView.this), 5L);
          BaseSmallView localBaseSmallView = BaseSmallView.this;
          int i = BaseSmallView.c(BaseSmallView.this).x;
          int j = (int)((BaseSmallView.d(BaseSmallView.this).x * 1.0F - BaseSmallView.c(BaseSmallView.this).x) * f);
          int k = BaseSmallView.c(BaseSmallView.this).y;
          BaseSmallView.a(localBaseSmallView, i + j, (int)(f * (BaseSmallView.d(BaseSmallView.this).y * 1.0F - BaseSmallView.c(BaseSmallView.this).y)) + k);
          GMTrace.o(5236504657920L, 39015);
          return;
        }
        BaseSmallView.a(BaseSmallView.this, BaseSmallView.d(BaseSmallView.this).x, BaseSmallView.d(BaseSmallView.this).y);
        BaseSmallView.this.onAnimationEnd();
        GMTrace.o(5236504657920L, 39015);
      }
    };
    this.kqV = ((WindowManager)paramContext.getSystemService("window"));
    this.krX = new ae();
    this.qQq = new Point(this.kqV.getDefaultDisplay().getWidth(), this.kqV.getDefaultDisplay().getHeight());
    GMTrace.o(5244557721600L, 39075);
  }
  
  private void du(int paramInt1, int paramInt2)
  {
    GMTrace.i(5244826157056L, 39077);
    if (this.kqV != null)
    {
      WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
      localLayoutParams.x = paramInt1;
      localLayoutParams.y = paramInt2;
      w.d("MicroMsg.Voip.BaseSmallView", "updateWindowPosition, x: %d, y: %d", new Object[] { Integer.valueOf(localLayoutParams.x), Integer.valueOf(localLayoutParams.y) });
      try
      {
        this.kqV.updateViewLayout(this, localLayoutParams);
        GMTrace.o(5244826157056L, 39077);
        return;
      }
      catch (Throwable localThrowable)
      {
        w.printErrStackTrace("MicroMsg.Voip.BaseSmallView", localThrowable, "", new Object[0]);
      }
    }
    GMTrace.o(5244826157056L, 39077);
  }
  
  public void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5243349762048L, 39066);
    GMTrace.o(5243349762048L, 39066);
  }
  
  public abstract void a(CaptureView paramCaptureView);
  
  public void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(5243618197504L, 39068);
    GMTrace.o(5243618197504L, 39068);
  }
  
  public void buu()
  {
    GMTrace.i(5243483979776L, 39067);
    GMTrace.o(5243483979776L, 39067);
  }
  
  public abstract void bvG();
  
  public abstract void bvH();
  
  public final void eg(long paramLong)
  {
    GMTrace.i(5245094592512L, 39079);
    this.qHm = paramLong;
    GMTrace.o(5245094592512L, 39079);
  }
  
  public abstract void onAnimationEnd();
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(5244691939328L, 39076);
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        GMTrace.o(5244691939328L, 39076);
        return true;
        this.qQm.x = paramMotionEvent.getRawX();
        this.qQm.y = paramMotionEvent.getRawY();
        paramMotionEvent = (WindowManager.LayoutParams)getLayoutParams();
        this.qQn.x = paramMotionEvent.x;
        this.qQn.y = paramMotionEvent.y;
        continue;
        du((int)Math.max(Math.min(this.qQn.x + paramMotionEvent.getRawX() - this.qQm.x, this.qQq.x), 0.0F), (int)Math.max(Math.min(this.qQn.y + paramMotionEvent.getRawY() - this.qQm.y, this.qQq.y), 0.0F));
      }
    }
    if ((Math.abs(paramMotionEvent.getRawX() - this.qQm.x) < BackwardSupportUtil.b.a(getContext(), 3.0F)) && (Math.abs(paramMotionEvent.getRawY() - this.qQm.y) < BackwardSupportUtil.b.a(getContext(), 3.0F)) && (this.mOnClickListener != null)) {
      this.mOnClickListener.onClick(this);
    }
    bvG();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    this.qQo.x = ((int)Math.max(Math.min(f1 + this.qQn.x - this.qQm.x, this.qQq.x), 0.0F));
    this.qQo.y = ((int)Math.max(Math.min(f2 + this.qQn.y - this.qQm.y, this.qQq.y), 0.0F));
    int i = BackwardSupportUtil.b.a(getContext(), 5.0F);
    if (this.qQo.x + getWidth() / 2 <= this.qQq.x / 2) {}
    for (this.qQp.x = i;; this.qQp.x = (this.qQq.x - getWidth() - i))
    {
      this.qQp.y = this.qQo.y;
      this.mStartTime = System.currentTimeMillis();
      this.krX.postDelayed(this.qQr, 5L);
      bvH();
      break;
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5244960374784L, 39078);
    this.mOnClickListener = paramOnClickListener;
    GMTrace.o(5244960374784L, 39078);
  }
  
  public void setViewSize(int paramInt1, int paramInt2)
  {
    GMTrace.i(5244289286144L, 39073);
    GMTrace.o(5244289286144L, 39073);
  }
  
  public void uninit()
  {
    GMTrace.i(5244423503872L, 39074);
    this.krX.removeCallbacks(this.qQr);
    this.kqV = null;
    if (this.qHb != null)
    {
      removeView(this.qHb);
      this.qHb = null;
      w.d("MicroMsg.Voip.BaseSmallView", "CaptureView removed");
    }
    GMTrace.o(5244423503872L, 39074);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\widget\BaseSmallView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */