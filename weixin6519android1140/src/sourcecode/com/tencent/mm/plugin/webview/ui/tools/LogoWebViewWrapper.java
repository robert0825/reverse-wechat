package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;

public class LogoWebViewWrapper
  extends LinearLayout
{
  private Context context;
  private int hQ;
  WebView jPc;
  private int kLU;
  FrameLayout rIk;
  private boolean rIl;
  private int rIm;
  private int rIn;
  private c rIo;
  private int rIp;
  boolean rIq;
  boolean rIr;
  int rIs;
  a rIt;
  b rIu;
  private boolean rIv;
  private boolean rIw;
  private boolean rIx;
  private int rIy;
  
  public LogoWebViewWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12287498780672L, 91549);
    this.rIl = false;
    this.rIp = 0;
    this.rIq = false;
    this.rIr = false;
    this.rIs = 0;
    this.rIv = false;
    this.rIw = false;
    this.rIx = false;
    this.rIy = -1;
    this.context = paramContext;
    init();
    GMTrace.o(12287498780672L, 91549);
  }
  
  @TargetApi(11)
  public LogoWebViewWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12287632998400L, 91550);
    this.rIl = false;
    this.rIp = 0;
    this.rIq = false;
    this.rIr = false;
    this.rIs = 0;
    this.rIv = false;
    this.rIw = false;
    this.rIx = false;
    this.rIy = -1;
    this.context = paramContext;
    init();
    GMTrace.o(12287632998400L, 91550);
  }
  
  private void init()
  {
    GMTrace.i(12287767216128L, 91551);
    setOrientation(1);
    this.hQ = ViewConfiguration.get(this.context).getScaledTouchSlop();
    GMTrace.o(12287767216128L, 91551);
  }
  
  public final void O(int paramInt, long paramLong)
  {
    GMTrace.i(12288706740224L, 91558);
    if (this.rIo != null)
    {
      c localc = this.rIo;
      localc.rID = false;
      localc.rIz.removeCallbacks(localc);
    }
    int i = getScrollY();
    w.i("MicroMsg.LogoWebViewWrapper", "smoothScrollTo oldScrollValue = %s, newScrollValue = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (i != paramInt)
    {
      this.rIo = new c(i, paramInt, paramLong);
      post(this.rIo);
    }
    GMTrace.o(12288706740224L, 91558);
  }
  
  public final FrameLayout bDA()
  {
    GMTrace.i(12287901433856L, 91552);
    int j;
    int i;
    if (this.rIk == null)
    {
      j = getChildCount();
      i = 0;
    }
    for (;;)
    {
      Object localObject;
      if (i < j)
      {
        localObject = getChildAt(i);
        if (((localObject instanceof FrameLayout)) && (((View)localObject).getId() == R.h.bLC)) {
          this.rIk = ((FrameLayout)localObject);
        }
      }
      else
      {
        localObject = this.rIk;
        GMTrace.o(12287901433856L, 91552);
        return (FrameLayout)localObject;
      }
      i += 1;
    }
  }
  
  public final void jw(boolean paramBoolean)
  {
    GMTrace.i(12288035651584L, 91553);
    this.rIq = paramBoolean;
    if (this.rIq)
    {
      this.rIl = false;
      this.rIp = 0;
    }
    GMTrace.o(12288035651584L, 91553);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12288169869312L, 91554);
    if ((this.rIq) && (!this.rIv))
    {
      GMTrace.o(12288169869312L, 91554);
      return false;
    }
    int i = paramMotionEvent.getAction();
    if ((i == 3) || (i == 1))
    {
      this.rIl = false;
      this.rIp = 0;
      this.rIw = false;
      GMTrace.o(12288169869312L, 91554);
      return false;
    }
    if ((i == 2) && (this.rIl))
    {
      GMTrace.o(12288169869312L, 91554);
      return true;
    }
    switch (i)
    {
    }
    for (;;)
    {
      boolean bool = this.rIl;
      GMTrace.o(12288169869312L, 91554);
      return bool;
      if (this.jPc.isOverScrollStart())
      {
        this.rIm = ((int)paramMotionEvent.getY());
        this.kLU = ((int)paramMotionEvent.getY());
        this.rIn = ((int)paramMotionEvent.getX());
        this.rIl = false;
        this.rIp = 0;
        this.rIv = true;
        this.rIw = true;
        continue;
        if (this.jPc.isOverScrollStart())
        {
          if (!this.rIw)
          {
            this.rIm = ((int)paramMotionEvent.getY());
            this.kLU = ((int)paramMotionEvent.getY());
            this.rIn = ((int)paramMotionEvent.getX());
            this.rIl = false;
            this.rIp = 0;
            this.rIv = true;
            this.rIw = true;
            bool = this.rIl;
            GMTrace.o(12288169869312L, 91554);
            return bool;
          }
          i = (int)paramMotionEvent.getY();
          int j = (int)paramMotionEvent.getX();
          int k = i - this.rIm;
          int m = this.rIn;
          if ((Math.abs(k) > this.hQ) && (Math.abs(k) > Math.abs(j - m)) && (k > 0))
          {
            this.rIm = i;
            this.rIn = j;
            if (this.rIp == 1)
            {
              this.rIl = true;
              this.rIw = false;
              w.i("MicroMsg.LogoWebViewWrapper", "Competitor wins in onTouchEvent");
              if (this.rIt != null) {
                this.rIt.bDB();
              }
            }
            else
            {
              this.rIp += 1;
            }
          }
        }
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(12288304087040L, 91555);
    if ((this.rIq) && (!this.rIv))
    {
      GMTrace.o(12288304087040L, 91555);
      return false;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
    {
      GMTrace.o(12288304087040L, 91555);
      return false;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(12288304087040L, 91555);
          return false;
          this.rIv = true;
        } while (!this.jPc.isOverScrollStart());
        this.rIm = ((int)paramMotionEvent.getY());
        this.kLU = ((int)paramMotionEvent.getY());
        this.rIn = ((int)paramMotionEvent.getX());
        this.rIx = true;
        GMTrace.o(12288304087040L, 91555);
        return true;
      } while (!this.rIl);
      if (!this.rIx)
      {
        this.rIm = ((int)paramMotionEvent.getY());
        this.kLU = ((int)paramMotionEvent.getY());
        this.rIn = ((int)paramMotionEvent.getX());
        this.rIx = true;
        GMTrace.o(12288304087040L, 91555);
        return true;
      }
      this.rIm = ((int)paramMotionEvent.getY());
      this.rIn = ((int)paramMotionEvent.getX());
      int j = Math.min(this.kLU - this.rIm, 0) >> 1;
      int k = getHeight();
      if (this.rIy < 0) {
        this.rIy = ((int)TypedValue.applyDimension(1, 60.0F, this.context.getResources().getDisplayMetrics()));
      }
      i = (int)Math.sqrt((this.rIy >> 1) * Math.abs(j)) << 1;
      if (i > Math.abs(j))
      {
        i = j;
        if (Math.abs(j) <= k) {}
      }
      for (i = -k;; i = -i)
      {
        xL(i);
        if (this.rIu != null) {
          this.rIu.O(i, true);
        }
        GMTrace.o(12288304087040L, 91555);
        return true;
      }
      this.rIx = false;
    } while ((!this.rIl) && (!this.rIv));
    this.rIl = false;
    int i = -this.rIs;
    long l1 = Math.abs(getScrollY());
    long l2 = Math.abs(l1 - Math.abs(this.rIs));
    if (l2 >= l1) {}
    for (l1 = 300L;; l1 = ((float)l2 / (float)l1 * 300.0F))
    {
      O(i, l1);
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12127108595712L, 90354);
          LogoWebViewWrapper.a(LogoWebViewWrapper.this);
          GMTrace.o(12127108595712L, 90354);
        }
      });
      GMTrace.o(12288304087040L, 91555);
      return true;
    }
  }
  
  public final void xL(int paramInt)
  {
    GMTrace.i(12288572522496L, 91557);
    int i = getHeight();
    scrollTo(0, Math.min(i, Math.max(-i, paramInt)));
    GMTrace.o(12288572522496L, 91557);
  }
  
  public static abstract interface a
  {
    public abstract void bDB();
  }
  
  public static abstract interface b
  {
    public abstract void O(int paramInt, boolean paramBoolean);
  }
  
  final class c
    implements Runnable
  {
    private final long duration;
    private final Interpolator rIA;
    private final int rIB;
    private final int rIC;
    boolean rID;
    private int rIE;
    private long startTime;
    
    public c(int paramInt1, int paramInt2, long paramLong)
    {
      GMTrace.i(12322395389952L, 91809);
      this.rID = true;
      this.startTime = -1L;
      this.rIE = -1;
      this.rIC = paramInt1;
      this.rIB = paramInt2;
      if (LogoWebViewWrapper.b(LogoWebViewWrapper.this)) {}
      for (this$1 = new AccelerateInterpolator();; this$1 = new DecelerateInterpolator())
      {
        this.rIA = LogoWebViewWrapper.this;
        this.duration = paramLong;
        GMTrace.o(12322395389952L, 91809);
        return;
      }
    }
    
    public final void run()
    {
      GMTrace.i(12322529607680L, 91810);
      if (this.startTime == -1L) {
        this.startTime = System.currentTimeMillis();
      }
      for (;;)
      {
        if ((this.rID) && (this.rIB != this.rIE)) {
          z.a(LogoWebViewWrapper.this, this);
        }
        GMTrace.o(12322529607680L, 91810);
        return;
        long l = 500L;
        if (this.duration > 0L) {
          l = Math.max(Math.min((System.currentTimeMillis() - this.startTime) * 1000L / this.duration, 1000L), 0L);
        }
        float f = this.rIC - this.rIB;
        int i = Math.round(this.rIA.getInterpolation((float)l / 1000.0F) * f);
        this.rIE = (this.rIC - i);
        LogoWebViewWrapper.this.xL(this.rIE);
        if (LogoWebViewWrapper.c(LogoWebViewWrapper.this) != null) {
          LogoWebViewWrapper.c(LogoWebViewWrapper.this).O(this.rIE, false);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\LogoWebViewWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */