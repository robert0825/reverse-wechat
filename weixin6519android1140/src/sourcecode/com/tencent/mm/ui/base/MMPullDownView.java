package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;

public class MMPullDownView
  extends FrameLayout
  implements GestureDetector.OnGestureListener
{
  private static int wem;
  private static final int wep;
  public int bgColor;
  public Context context;
  private GestureDetector mHA;
  private int wah;
  private int wbG;
  public g wdN;
  public e wdO;
  public int wdP;
  private int wdQ;
  private boolean wdR;
  private boolean wdS;
  private boolean wdT;
  private boolean wdU;
  public boolean wdV;
  private boolean wdW;
  private boolean wdX;
  private boolean wdY;
  public c wdZ;
  public d wea;
  public View web;
  public View wec;
  private int wed;
  private int wee;
  private int wef;
  private boolean weg;
  public f weh;
  public boolean wei;
  private k wej;
  public boolean wek;
  public a wel;
  private ae wen;
  boolean weo;
  public boolean weq;
  private int wer;
  public int wes;
  public b wet;
  private Scroller xM;
  
  static
  {
    GMTrace.i(3298400665600L, 24575);
    wem = 400;
    wep = Color.parseColor("#00000000");
    GMTrace.o(3298400665600L, 24575);
  }
  
  public MMPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3294642569216L, 24547);
    GMTrace.o(3294642569216L, 24547);
  }
  
  public MMPullDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3294776786944L, 24548);
    this.wbG = 1;
    this.wdR = false;
    this.wdS = false;
    this.wdT = false;
    this.wdU = false;
    this.wdV = true;
    this.wdW = false;
    this.wdX = true;
    this.wdY = true;
    this.wee = 4;
    this.wef = 4;
    this.weg = false;
    this.wei = true;
    this.wek = false;
    this.wen = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3300145496064L, 24588);
        super.handleMessage(paramAnonymousMessage);
        switch (MMPullDownView.a(MMPullDownView.this))
        {
        }
        for (;;)
        {
          w.i("MicroMsg.MMPullDownView", "updateDelayHandler handleMessage loadDataType[%d] loadDataEnd[%b]", new Object[] { Integer.valueOf(MMPullDownView.a(MMPullDownView.this)), Boolean.valueOf(MMPullDownView.this.wdV) });
          GMTrace.o(3300145496064L, 24588);
          return;
          if (MMPullDownView.b(MMPullDownView.this) != null) {
            MMPullDownView.this.wdV = MMPullDownView.b(MMPullDownView.this).apa();
          }
          if ((MMPullDownView.this.wdV) && (MMPullDownView.c(MMPullDownView.this).getVisibility() == 0))
          {
            MMPullDownView.this.scrollTo(0, MMPullDownView.d(MMPullDownView.this));
            continue;
            if (MMPullDownView.e(MMPullDownView.this) != null) {
              MMPullDownView.this.wdV = MMPullDownView.e(MMPullDownView.this).aoX();
            }
            if ((MMPullDownView.this.wdV) && (MMPullDownView.f(MMPullDownView.this).getVisibility() == 0)) {
              MMPullDownView.this.scrollTo(0, MMPullDownView.d(MMPullDownView.this));
            }
          }
        }
      }
    };
    this.weo = false;
    this.weq = false;
    this.bgColor = Color.parseColor("#ffffffff");
    this.wer = Integer.MIN_VALUE;
    this.wes = this.bgColor;
    this.xM = new Scroller(paramContext, new AccelerateInterpolator());
    this.wah = this.wbG;
    this.mHA = new GestureDetector(paramContext, this);
    this.wej = new k(paramContext);
    this.context = paramContext;
    GMTrace.o(3294776786944L, 24548);
  }
  
  private void cad()
  {
    GMTrace.i(20288485982208L, 151161);
    e((ViewGroup)this.web, 0);
    e((ViewGroup)this.wec, 0);
    GMTrace.o(20288485982208L, 151161);
  }
  
  private void cae()
  {
    GMTrace.i(3296521617408L, 24561);
    if (this.weh != null) {
      this.weh.bnm();
    }
    Scroller localScroller;
    int i;
    int j;
    if (getScrollY() - this.wdP < 0)
    {
      if (this.wdX)
      {
        localScroller = this.xM;
        i = getScrollY();
        j = -getScrollY();
        localScroller.startScroll(0, i, 0, this.wdP + j, 200);
        postInvalidate();
      }
    }
    else if (getScrollY() > this.wdQ)
    {
      if (!this.wdY) {
        break label238;
      }
      this.xM.startScroll(0, getScrollY(), 0, this.wdQ - getScrollY(), 200);
    }
    for (;;)
    {
      postInvalidate();
      this.wdT = false;
      GMTrace.o(3296521617408L, 24561);
      return;
      if (this.web.getVisibility() == 4)
      {
        localScroller = this.xM;
        i = getScrollY();
        j = -getScrollY();
        localScroller.startScroll(0, i, 0, this.wdP + j, 200);
      }
      if (this.web.getVisibility() == 0) {
        this.xM.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
      }
      this.wed = 0;
      this.wdU = true;
      this.wdV = false;
      break;
      label238:
      if (this.wec.getVisibility() == 4) {
        this.xM.startScroll(0, getScrollY(), 0, this.wdQ - getScrollY(), 200);
      }
      if (this.wec.getVisibility() == 0)
      {
        localScroller = this.xM;
        i = getScrollY();
        j = this.wdQ;
        int k = getScrollY();
        localScroller.startScroll(0, i, 0, this.wdQ + (j - k), 200);
      }
      this.wed = 1;
      this.wdU = true;
      this.wdV = false;
    }
  }
  
  public static void e(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(20288351764480L, 151160);
    w.i("MicroMsg.MMPullDownView", "fucking u");
    if ((paramViewGroup != null) && (paramViewGroup.getVisibility() == 0))
    {
      if (paramViewGroup.getTag() == null) {
        paramViewGroup.setTag(paramViewGroup.findViewById(a.g.bnQ));
      }
      paramViewGroup = (View)paramViewGroup.getTag();
      if (paramViewGroup != null) {
        paramViewGroup.setVisibility(paramInt);
      }
    }
    GMTrace.o(20288351764480L, 151160);
  }
  
  public void app()
  {
    GMTrace.i(3294911004672L, 24549);
    View localView1 = inflate(this.context, a.h.bKL, null);
    View localView2 = inflate(this.context, a.h.bKL, null);
    addView(localView1, 0, new FrameLayout.LayoutParams(-1, -2));
    addView(localView2, new FrameLayout.LayoutParams(-1, -2));
    GMTrace.o(3294911004672L, 24549);
  }
  
  public void computeScroll()
  {
    GMTrace.i(3295716311040L, 24555);
    if (this.xM.computeScrollOffset())
    {
      scrollTo(this.xM.getCurrX(), this.xM.getCurrY());
      postInvalidate();
    }
    for (;;)
    {
      this.xM.isFinished();
      GMTrace.o(3295716311040L, 24555);
      return;
      if (this.wdU)
      {
        w.i("MicroMsg.MMPullDownView", "computeScroll loadDataBegin true UPDATE_DELAY");
        this.wdU = false;
        this.wen.sendEmptyMessageDelayed(0, wem);
        cad();
      }
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3296118964224L, 24558);
    k localk = this.wej;
    if (localk.xhy != null) {
      localk.xhx.onTouchEvent(paramMotionEvent);
    }
    if (!this.wdV)
    {
      GMTrace.o(3296118964224L, 24558);
      return true;
    }
    if (this.wea == null)
    {
      this.wdR = false;
      if (this.wdZ != null) {
        break label161;
      }
      this.wdS = false;
      label72:
      if (this.wef == 0)
      {
        if (!this.wdX) {
          break label177;
        }
        this.web.setVisibility(4);
      }
      label94:
      if (this.wee == 0)
      {
        if (!this.wdY) {
          break label188;
        }
        this.wec.setVisibility(4);
      }
    }
    boolean bool;
    for (;;)
    {
      if (paramMotionEvent.getAction() != 1) {
        break label199;
      }
      cae();
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(3296118964224L, 24558);
      return bool;
      this.wdR = this.wea.aoY();
      break;
      label161:
      this.wdS = this.wdZ.aoZ();
      break label72;
      label177:
      this.web.setVisibility(0);
      break label94;
      label188:
      this.wec.setVisibility(0);
    }
    label199:
    if (paramMotionEvent.getAction() == 3)
    {
      cae();
      if (this.wek)
      {
        bool = super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(3296118964224L, 24558);
        return bool;
      }
      GMTrace.o(3296118964224L, 24558);
      return false;
    }
    if (this.mHA.onTouchEvent(paramMotionEvent))
    {
      paramMotionEvent.setAction(3);
      this.weo = true;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(3296118964224L, 24558);
      return bool;
    }
    try
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(3296118964224L, 24558);
      return bool;
    }
    catch (Exception paramMotionEvent)
    {
      w.printErrStackTrace("MicroMsg.MMPullDownView", paramMotionEvent, "", new Object[0]);
      GMTrace.o(3296118964224L, 24558);
    }
    return true;
  }
  
  public final void lD(boolean paramBoolean)
  {
    GMTrace.i(3295045222400L, 24550);
    w.i("MicroMsg.MMPullDownView", "setIsTopShowAll showAll[%b], isTopShowAll[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.wdX), bg.bQW() });
    this.wdX = paramBoolean;
    GMTrace.o(3295045222400L, 24550);
  }
  
  public final void lE(boolean paramBoolean)
  {
    GMTrace.i(3295179440128L, 24551);
    w.i("MicroMsg.MMPullDownView", "setIsBottomShowAll showAll[%b], isBottomShowAll[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.wdY), bg.bQW() });
    this.wdY = paramBoolean;
    GMTrace.o(3295179440128L, 24551);
  }
  
  public final void lF(boolean paramBoolean)
  {
    GMTrace.i(3295313657856L, 24552);
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      this.wee = i;
      if (this.wec != null) {
        this.wec.setVisibility(this.wee);
      }
      w.i("MicroMsg.MMPullDownView", "setBottomViewVisible visible[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW() });
      GMTrace.o(3295313657856L, 24552);
      return;
    }
  }
  
  public final void lG(boolean paramBoolean)
  {
    GMTrace.i(3295447875584L, 24553);
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      this.wef = i;
      if (this.web != null) {
        this.web.setVisibility(this.wef);
      }
      w.i("MicroMsg.MMPullDownView", "setTopViewVisible visible[%b], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW() });
      GMTrace.o(3295447875584L, 24553);
      return;
    }
  }
  
  public final void lH(boolean paramBoolean)
  {
    GMTrace.i(3296253181952L, 24559);
    w.i("MicroMsg.MMPullDownView", "forceTopLoadData start[%b] loadDataBegin[%b], loadDataEnd[%b], isTopShowAll[%b], getScrollY[%d], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.wdU), Boolean.valueOf(this.wdV), Boolean.valueOf(this.wdX), Integer.valueOf(getScrollY()), bg.bQW() });
    Scroller localScroller;
    int i;
    int j;
    if (paramBoolean) {
      if (this.wdX)
      {
        localScroller = this.xM;
        i = getScrollY();
        j = -getScrollY();
        localScroller.startScroll(0, i, 0, this.wdP + j, 200);
        postInvalidate();
      }
    }
    for (;;)
    {
      cad();
      GMTrace.o(3296253181952L, 24559);
      return;
      if ((this.web != null) && (this.web.getVisibility() == 4))
      {
        localScroller = this.xM;
        i = getScrollY();
        j = -getScrollY();
        localScroller.startScroll(0, i, 0, this.wdP + j, 200);
      }
      if ((this.web != null) && (this.web.getVisibility() == 0)) {
        this.xM.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
      }
      this.wed = 0;
      this.wdU = true;
      this.wdV = false;
      break;
      if (!this.wdV)
      {
        this.wdV = true;
        this.wdU = false;
        if ((this.web != null) && (this.web.getVisibility() == 0)) {
          scrollTo(0, this.wdP);
        }
      }
    }
  }
  
  public final void lI(boolean paramBoolean)
  {
    GMTrace.i(3296387399680L, 24560);
    w.i("MicroMsg.MMPullDownView", "forceBottomLoadData start[%b] loadDataBegin[%b] loadDataEnd[%b], isBottomShowAll[%b], getScrollY[%d], stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.wdU), Boolean.valueOf(this.wdV), Boolean.valueOf(this.wdY), Integer.valueOf(getScrollY()), bg.bQW() });
    if (paramBoolean)
    {
      if (this.wdY) {
        this.xM.startScroll(0, getScrollY(), 0, this.wdQ - getScrollY(), 200);
      }
      for (;;)
      {
        postInvalidate();
        GMTrace.o(3296387399680L, 24560);
        return;
        if ((this.wec != null) && (this.wec.getVisibility() == 4)) {
          this.xM.startScroll(0, getScrollY(), 0, this.wdQ - getScrollY(), 200);
        }
        if ((this.wec != null) && (this.wec.getVisibility() == 0))
        {
          Scroller localScroller = this.xM;
          int i = getScrollY();
          int j = this.wdQ;
          int k = getScrollY();
          localScroller.startScroll(0, i, 0, this.wdQ + (j - k), 200);
        }
        this.wed = 1;
        this.wdU = true;
        this.wdV = false;
      }
    }
    if (!this.wdV)
    {
      this.wdV = true;
      this.wdU = false;
    }
    if ((this.wec != null) && (this.wec.getVisibility() == 0))
    {
      w.i("MicroMsg.MMPullDownView", "forceBottomLoadData false bottomView VISIBLE scroll to 0");
      scrollTo(0, this.wdP);
    }
    GMTrace.o(3296387399680L, 24560);
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3296655835136L, 24562);
    if (!this.xM.isFinished()) {
      this.xM.abortAnimation();
    }
    GMTrace.o(3296655835136L, 24562);
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3296790052864L, 24563);
    w.v("MicroMsg.MMPullDownView", "on fling, velocityX %f velocityY %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    GMTrace.o(3296790052864L, 24563);
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3295850528768L, 24556);
    if (this.wel != null) {
      this.wel.auY();
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(3295850528768L, 24556);
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3295582093312L, 24554);
    w.d("MicroMsg.MMPullDownView", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (!this.weg)
    {
      app();
      this.weg = true;
    }
    paramInt4 = getChildCount();
    paramInt1 = 0;
    paramInt2 = 0;
    for (;;)
    {
      if (paramInt1 < paramInt4)
      {
        View localView = getChildAt(paramInt1);
        int i = localView.getMeasuredHeight();
        paramInt3 = paramInt2;
        if (localView.getVisibility() != 8) {}
        try
        {
          localView.layout(0, paramInt2, localView.getMeasuredWidth(), paramInt2 + i);
          paramInt3 = paramInt2 + i;
          paramInt1 += 1;
          paramInt2 = paramInt3;
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MMPullDownView", localArrayIndexOutOfBoundsException, "childCount: %d, i:%d, childHeight:%d", new Object[] { Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(i) });
          }
        }
      }
    }
    this.web = getChildAt(0);
    this.wec = getChildAt(getChildCount() - 1);
    this.web.setVisibility(this.wef);
    this.wec.setVisibility(this.wee);
    this.wdP = this.web.getHeight();
    this.wdQ = this.wec.getHeight();
    this.wer = this.wdP;
    if ((!this.wdW) && (this.wdP != 0))
    {
      this.wdW = true;
      scrollTo(0, this.wdP);
    }
    GMTrace.o(3295582093312L, 24554);
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3296924270592L, 24564);
    GMTrace.o(3296924270592L, 24564);
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3297058488320L, 24565);
    if (this.weh != null) {
      this.weh.aq(paramFloat2);
    }
    if (paramFloat2 > 0.0F) {
      this.wdT = true;
    }
    int j;
    int i;
    while ((this.wdS) && ((this.wdT) || (getScrollY() - this.wdP > 0))) {
      if ((!this.wei) && ((this.wec.getVisibility() != 0) || ((this.wdT) && (getScrollY() >= this.wdP * 2))))
      {
        GMTrace.o(3297058488320L, 24565);
        return true;
        this.wdT = false;
      }
      else
      {
        j = (int)(paramFloat2 * 0.5D);
        i = j;
        if (j == 0)
        {
          if (paramFloat2 > 0.0F) {
            i = 1;
          }
        }
        else
        {
          w.v("check", "moveUp:" + i + " distanceY:" + paramFloat2 + " scrollY:" + getScrollY());
          if ((getScrollY() + i >= this.wdP) || (this.wdT)) {
            break label254;
          }
          j = this.wdP - getScrollY();
        }
        for (;;)
        {
          scrollBy(0, j);
          GMTrace.o(3297058488320L, 24565);
          return true;
          i = -1;
          break;
          label254:
          j = i;
          if (!this.wei)
          {
            j = i;
            if (getScrollY() + i >= this.wdP * 2) {
              j = this.wdP * 2 - getScrollY();
            }
          }
        }
      }
    }
    if ((this.wdR) && ((!this.wdT) || (getScrollY() - this.wdP < 0)))
    {
      if ((!this.wei) && ((this.web.getVisibility() != 0) || ((!this.wdT) && (getScrollY() <= 0))))
      {
        GMTrace.o(3297058488320L, 24565);
        return true;
      }
      j = (int)(paramFloat2 * 0.5D);
      i = j;
      if (j == 0)
      {
        if (paramFloat2 > 0.0F) {
          i = 1;
        }
      }
      else
      {
        if (getScrollY() + i <= this.wdP) {
          break label447;
        }
        j = this.wdP - getScrollY();
      }
      for (;;)
      {
        scrollBy(0, j);
        GMTrace.o(3297058488320L, 24565);
        return true;
        i = -1;
        break;
        label447:
        j = i;
        if (!this.wei)
        {
          j = i;
          if (getScrollY() + i < 0) {
            j = -getScrollY();
          }
        }
      }
    }
    GMTrace.o(3297058488320L, 24565);
    return false;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3297461141504L, 24568);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.wet != null) {
      this.wet.auP();
    }
    if (!this.weq)
    {
      GMTrace.o(3297461141504L, 24568);
      return;
    }
    if (this.wer == Integer.MIN_VALUE)
    {
      this.wer = this.wdP;
      w.d("MicroMsg.MMPullDownView", "onScrollChanged static y:" + this.wer);
    }
    if ((paramInt2 <= this.wer) && (this.wes != wep))
    {
      setBackgroundResource(a.f.aXW);
      this.wes = wep;
      w.d("MicroMsg.MMPullDownView", "onScrollChanged full");
      GMTrace.o(3297461141504L, 24568);
      return;
    }
    if ((paramInt2 > this.wer) && (this.wes != this.bgColor))
    {
      w.d("MicroMsg.MMPullDownView", "onScrollChanged white");
      setBackgroundColor(this.bgColor);
      this.wes = this.bgColor;
    }
    GMTrace.o(3297461141504L, 24568);
  }
  
  public void onShowPress(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3297192706048L, 24566);
    GMTrace.o(3297192706048L, 24566);
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3297326923776L, 24567);
    GMTrace.o(3297326923776L, 24567);
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3295984746496L, 24557);
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(3295984746496L, 24557);
      return true;
      if (getScrollY() - this.wdP < 0) {
        this.wdR = true;
      }
      if (getScrollY() > this.wdQ) {
        this.wdS = true;
      }
      cae();
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean auY();
  }
  
  public static abstract interface b
  {
    public abstract void auP();
  }
  
  public static abstract interface c
  {
    public abstract boolean aoZ();
  }
  
  public static abstract interface d
  {
    public abstract boolean aoY();
  }
  
  public static abstract interface e
  {
    public abstract boolean aoX();
  }
  
  public static abstract interface f
  {
    public abstract void aq(float paramFloat);
    
    public abstract void bnm();
  }
  
  public static abstract interface g
  {
    public abstract boolean apa();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMPullDownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */