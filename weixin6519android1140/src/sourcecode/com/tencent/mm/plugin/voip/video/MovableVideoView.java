package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;

public class MovableVideoView
  extends OpenGlView
{
  private float evO;
  private float evP;
  private View.OnClickListener mOnClickListener;
  private int mScreenHeight;
  private int mScreenWidth;
  int mWidth;
  int qOM;
  private int qON;
  private int qOO;
  private long qOP;
  
  public MovableVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(5387365384192L, 40139);
    GMTrace.o(5387365384192L, 40139);
  }
  
  public MovableVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5387499601920L, 40140);
    this.mWidth = 320;
    this.qOM = 240;
    this.qON = 800;
    this.qOO = 480;
    this.mScreenWidth = 0;
    this.mScreenHeight = 0;
    GMTrace.o(5387499601920L, 40140);
  }
  
  public final void dr(int paramInt1, int paramInt2)
  {
    GMTrace.i(5387768037376L, 40142);
    this.mWidth = paramInt1;
    this.qOM = paramInt2;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    if (this.mScreenWidth == 0)
    {
      this.mScreenWidth = localWindowManager.getDefaultDisplay().getWidth();
      this.mScreenHeight = localWindowManager.getDefaultDisplay().getHeight();
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams.topMargin = (a.fromDPToPix(getContext(), 12) + u.fq(getContext()));
    localLayoutParams.leftMargin = (this.mScreenWidth - this.mWidth - localLayoutParams.topMargin + u.fq(getContext()));
    setLayoutParams(localLayoutParams);
    this.qON = (this.mScreenHeight - this.qOM);
    this.qOO = (this.mScreenWidth - this.mWidth);
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    GMTrace.o(5387768037376L, 40142);
  }
  
  public final void ds(int paramInt1, int paramInt2)
  {
    GMTrace.i(5387902255104L, 40143);
    dr(paramInt1, paramInt2);
    GMTrace.o(5387902255104L, 40143);
  }
  
  public final void dt(int paramInt1, int paramInt2)
  {
    GMTrace.i(5388170690560L, 40145);
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams2.leftMargin = localLayoutParams1.leftMargin;
    localLayoutParams2.topMargin = localLayoutParams1.topMargin;
    this.mWidth = paramInt1;
    this.qOM = paramInt2;
    setLayoutParams(localLayoutParams2);
    GMTrace.o(5388170690560L, 40145);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    GMTrace.i(5387633819648L, 40141);
    w.d("MicroMsg.MovableVideoView", "event: " + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(5387633819648L, 40141);
      return true;
      this.evO = paramMotionEvent.getRawX();
      this.evP = paramMotionEvent.getRawY();
      this.qOP = System.currentTimeMillis();
      continue;
      float f1 = paramMotionEvent.getRawX() - this.evO;
      float f2 = paramMotionEvent.getRawY() - this.evP;
      if ((Math.abs(f1) > 1.0F) || (Math.abs(f2) > 1.0F))
      {
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
        int m = (int)(f1 + localLayoutParams.leftMargin);
        int k = (int)(f2 + localLayoutParams.topMargin);
        int i;
        if (m < 0)
        {
          i = 0;
          label177:
          localLayoutParams.leftMargin = i;
          if (k >= 0) {
            break label247;
          }
          i = j;
        }
        for (;;)
        {
          localLayoutParams.topMargin = i;
          setLayoutParams(localLayoutParams);
          this.evO = paramMotionEvent.getRawX();
          this.evP = paramMotionEvent.getRawY();
          break;
          i = m;
          if (m <= this.qOO) {
            break label177;
          }
          i = this.qOO;
          break label177;
          label247:
          if (k > this.qON) {
            i = this.qON;
          } else {
            i = k;
          }
        }
        long l = System.currentTimeMillis();
        if ((this.qOP != 0L) && (l - this.qOP < 300L) && (l - this.qOP >= 0L) && (this.mOnClickListener != null)) {
          this.mOnClickListener.onClick(this);
        }
        g.ork.i(11079, new Object[] { Integer.valueOf(2) });
      }
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5388036472832L, 40144);
    this.mOnClickListener = paramOnClickListener;
    GMTrace.o(5388036472832L, 40144);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\MovableVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */