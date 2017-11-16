package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends BaseSmallView
{
  private boolean Jj;
  private Runnable qQA;
  private Runnable qQB;
  private OpenGlRender qQt;
  private OpenGlView qQu;
  private OpenGlRender qQv;
  private OpenGlView qQw;
  private int[] qQx;
  private int qQy;
  private float qQz;
  
  public a(Context paramContext, float paramFloat)
  {
    super(paramContext, null);
    GMTrace.i(5241739149312L, 39054);
    this.qQx = null;
    this.qQy = 0;
    this.qQA = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5241604931584L, 39053);
        a.a(a.this).setVisibility(4);
        GMTrace.o(5241604931584L, 39053);
      }
    };
    this.qQB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5246034116608L, 39086);
        a.a(a.this).setVisibility(0);
        GMTrace.o(5246034116608L, 39086);
      }
    };
    LayoutInflater.from(paramContext).inflate(R.i.cHK, this);
    this.qQz = paramFloat;
    this.qQu = ((OpenGlView)findViewById(R.h.bSl));
    this.qQt = new OpenGlRender(this.qQu, OpenGlRender.qPu);
    this.qQu.a(this.qQt);
    this.qQu.setRenderMode(0);
    this.qQw = ((OpenGlView)findViewById(R.h.bSk));
    this.qQv = new OpenGlRender(this.qQw, OpenGlRender.qPt);
    this.qQw.a(this.qQv);
    this.qQw.setRenderMode(0);
    this.qQw.setZOrderMediaOverlay(true);
    this.qQw.setVisibility(4);
    this.krX.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5246302552064L, 39088);
        a.this.findViewById(R.h.cmB).setVisibility(8);
        GMTrace.o(5246302552064L, 39088);
      }
    }, 3000L);
    this.krX.postDelayed(this.qQB, 2000L);
    this.krX.postDelayed(this.qQA, 5000L);
    GMTrace.o(5241739149312L, 39054);
  }
  
  private void bwh()
  {
    GMTrace.i(5242007584768L, 39056);
    if (!this.Jj)
    {
      this.Jj = true;
      this.qQt.qPa = true;
      this.qQv.qPa = true;
    }
    GMTrace.o(5242007584768L, 39056);
  }
  
  public final void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5242141802496L, 39057);
    bwh();
    if (OpenGlRender.qPE == 1)
    {
      this.qQt.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.qPk + OpenGlRender.qPq);
      GMTrace.o(5242141802496L, 39057);
      return;
    }
    this.qQt.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.qPn + OpenGlRender.qPq);
    GMTrace.o(5242141802496L, 39057);
  }
  
  public final void a(CaptureView paramCaptureView)
  {
    GMTrace.i(5242678673408L, 39061);
    w.j("MicroMsg.Voip.BaseSmallView", "addCaptureView", new Object[0]);
    if (this.qHb != null)
    {
      removeView(this.qHb);
      this.qHb = null;
    }
    if (paramCaptureView != null)
    {
      this.qHb = paramCaptureView;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(1, 1);
      localLayoutParams.leftMargin = 20;
      localLayoutParams.topMargin = 20;
      addView(paramCaptureView, localLayoutParams);
      paramCaptureView.setVisibility(0);
      w.d("MicroMsg.Voip.BaseSmallView", "CaptureView added");
    }
    GMTrace.o(5242678673408L, 39061);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(5242410237952L, 39059);
    if (this.qQw.getVisibility() != 0)
    {
      GMTrace.o(5242410237952L, 39059);
      return;
    }
    bwh();
    if (OpenGlRender.qPE == 1)
    {
      if (this.qQy < paramInt1 * paramInt2) {
        this.qQx = null;
      }
      if (this.qQx == null)
      {
        this.qQy = (paramInt1 * paramInt2);
        this.qQx = new int[this.qQy];
      }
      if ((d.btG().a(paramArrayOfByte, (int)paramLong, paramInt3 & 0x1F, paramInt1, paramInt2, this.qQx, false) < 0) || (this.qQx == null))
      {
        GMTrace.o(5242410237952L, 39059);
        return;
      }
      this.qQv.a(this.qQx, paramInt1, paramInt2, OpenGlRender.qPl + paramInt4 + paramInt5);
      GMTrace.o(5242410237952L, 39059);
      return;
    }
    if (OpenGlRender.qPE == 2) {
      this.qQv.b(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.qPp + paramInt4 + paramInt5);
    }
    GMTrace.o(5242410237952L, 39059);
  }
  
  public final void buu()
  {
    GMTrace.i(5242276020224L, 39058);
    if (this.Jj)
    {
      this.qQv.bwa();
      this.qQt.bwa();
    }
    GMTrace.o(5242276020224L, 39058);
  }
  
  protected final void bvG()
  {
    GMTrace.i(5242812891136L, 39062);
    this.qQw.setVisibility(0);
    this.krX.removeCallbacks(this.qQA);
    this.krX.postDelayed(this.qQA, 3000L);
    GMTrace.o(5242812891136L, 39062);
  }
  
  protected final void bvH()
  {
    GMTrace.i(5242947108864L, 39063);
    this.qQt.bvZ();
    this.qQv.bvZ();
    GMTrace.o(5242947108864L, 39063);
  }
  
  protected final void onAnimationEnd()
  {
    GMTrace.i(5243081326592L, 39064);
    this.qQt.qPa = true;
    this.qQv.qPa = true;
    GMTrace.o(5243081326592L, 39064);
  }
  
  public final void setViewSize(int paramInt1, int paramInt2)
  {
    GMTrace.i(5241873367040L, 39055);
    Object localObject = (RelativeLayout.LayoutParams)this.qQw.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).height = (paramInt2 / 4);
    ((RelativeLayout.LayoutParams)localObject).width = ((int)(this.qQz * ((RelativeLayout.LayoutParams)localObject).height));
    this.qQw.setLayoutParams((ViewGroup.LayoutParams)localObject);
    WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
    localObject = localLayoutParams;
    if (localLayoutParams == null) {
      localObject = new WindowManager.LayoutParams();
    }
    ((WindowManager.LayoutParams)localObject).width = paramInt1;
    ((WindowManager.LayoutParams)localObject).height = paramInt2;
    setLayoutParams((ViewGroup.LayoutParams)localObject);
    GMTrace.o(5241873367040L, 39055);
  }
  
  public final void uninit()
  {
    GMTrace.i(5242544455680L, 39060);
    super.uninit();
    setVisibility(4);
    if (this.Jj)
    {
      this.qQt.bvZ();
      this.qQv.bvZ();
    }
    this.krX.removeCallbacks(this.qQA);
    GMTrace.o(5242544455680L, 39060);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */