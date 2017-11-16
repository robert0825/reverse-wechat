package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MMSlideDelView
  extends ViewGroup
{
  private VelocityTracker ez;
  private final int hQ;
  public f jpQ;
  public c jpR;
  public d jpT;
  public boolean lmH;
  private int mDH;
  private ae mHandler;
  private boolean rZT;
  long time;
  private boolean weL;
  private b weM;
  private Runnable weN;
  private long weO;
  private boolean weP;
  private a weQ;
  private final Scroller xM;
  private float yd;
  private float ye;
  
  public MMSlideDelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3274778345472L, 24399);
    this.rZT = false;
    this.weL = false;
    this.lmH = true;
    this.weP = false;
    this.weQ = null;
    this.mHandler = new ae();
    this.xM = new Scroller(paramContext, new LinearInterpolator());
    this.hQ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.weO = ViewConfiguration.getLongPressTimeout();
    GMTrace.o(3274778345472L, 24399);
  }
  
  public static d cah()
  {
    GMTrace.i(3274644127744L, 24398);
    d local1 = new d()
    {
      public final void a(MMSlideDelView paramAnonymousMMSlideDelView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3334907887616L, 24847);
        if (paramAnonymousBoolean)
        {
          mqU.add(paramAnonymousMMSlideDelView);
          GMTrace.o(3334907887616L, 24847);
          return;
        }
        mqU.remove(paramAnonymousMMSlideDelView);
        GMTrace.o(3334907887616L, 24847);
      }
      
      public final boolean aJo()
      {
        GMTrace.i(3335042105344L, 24848);
        if (mqU.size() > 0)
        {
          GMTrace.o(3335042105344L, 24848);
          return true;
        }
        GMTrace.o(3335042105344L, 24848);
        return false;
      }
      
      public final void aJp()
      {
        GMTrace.i(3335176323072L, 24849);
        Iterator localIterator = mqU.iterator();
        while (localIterator.hasNext())
        {
          MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
          if (localMMSlideDelView != null) {
            localMMSlideDelView.cal();
          }
        }
        mqU.clear();
        GMTrace.o(3335176323072L, 24849);
      }
      
      public final void aJq()
      {
        GMTrace.i(3335310540800L, 24850);
        Iterator localIterator = mqU.iterator();
        while (localIterator.hasNext())
        {
          MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
          if (localMMSlideDelView != null) {
            localMMSlideDelView.cak();
          }
        }
        mqU.clear();
        GMTrace.o(3335310540800L, 24850);
      }
    };
    GMTrace.o(3274644127744L, 24398);
    return local1;
  }
  
  private void cai()
  {
    GMTrace.i(3275717869568L, 24406);
    if (this.mHandler != null) {
      this.mHandler.removeCallbacks(this.weM);
    }
    GMTrace.o(3275717869568L, 24406);
  }
  
  private void caj()
  {
    GMTrace.i(3275852087296L, 24407);
    setPressed(false);
    if (this.weL)
    {
      cal();
      GMTrace.o(3275852087296L, 24407);
      return;
    }
    VelocityTracker localVelocityTracker = this.ez;
    localVelocityTracker.computeCurrentVelocity(1000);
    int i = (int)localVelocityTracker.getXVelocity();
    int j;
    if (i < 64936)
    {
      i = getScrollX();
      j = getChildAt(1).getWidth();
      this.jpT.a(this, true);
      this.weL = true;
      this.xM.startScroll(i, 0, j - i, 0, 100);
    }
    for (;;)
    {
      invalidate();
      for (;;)
      {
        if (this.ez != null)
        {
          this.ez.recycle();
          this.ez = null;
        }
        this.rZT = false;
        dS(false);
        GMTrace.o(3275852087296L, 24407);
        return;
        if (i <= 600) {
          break;
        }
        cal();
      }
      i = getScrollX();
      j = getChildAt(1).getWidth();
      if (i > j / 2)
      {
        this.jpT.a(this, true);
        this.weL = true;
        this.xM.startScroll(i, 0, j - i, 0, 100);
      }
      else
      {
        this.weL = false;
        this.jpT.a(this, false);
        this.xM.startScroll(i, 0, -i, 0, 100);
      }
    }
  }
  
  private void dS(boolean paramBoolean)
  {
    GMTrace.i(3275986305024L, 24408);
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
    GMTrace.o(3275986305024L, 24408);
  }
  
  private void he()
  {
    GMTrace.i(3275449434112L, 24404);
    if (this.ez != null)
    {
      this.ez.clear();
      this.ez = null;
    }
    GMTrace.o(3275449434112L, 24404);
  }
  
  public void buildDrawingCache()
  {
    GMTrace.i(3276925829120L, 24415);
    GMTrace.o(3276925829120L, 24415);
  }
  
  public void buildDrawingCache(boolean paramBoolean)
  {
    GMTrace.i(3276791611392L, 24414);
    GMTrace.o(3276791611392L, 24414);
  }
  
  public final void cak()
  {
    GMTrace.i(3276120522752L, 24409);
    this.jpT.a(this, false);
    this.weL = false;
    scrollTo(0, 0);
    invalidate();
    GMTrace.o(3276120522752L, 24409);
  }
  
  public final void cal()
  {
    GMTrace.i(3276254740480L, 24410);
    int i = getScrollX();
    this.jpT.a(this, false);
    this.weL = false;
    this.xM.startScroll(i, 0, -i, 0, 100);
    invalidate();
    GMTrace.o(3276254740480L, 24410);
  }
  
  public void computeScroll()
  {
    GMTrace.i(3276388958208L, 24411);
    if (this.xM.computeScrollOffset())
    {
      scrollTo(this.xM.getCurrX(), this.xM.getCurrY());
      postInvalidate();
    }
    GMTrace.o(3276388958208L, 24411);
  }
  
  public Bitmap getDrawingCache()
  {
    GMTrace.i(3276523175936L, 24412);
    GMTrace.o(3276523175936L, 24412);
    return null;
  }
  
  public Bitmap getDrawingCache(boolean paramBoolean)
  {
    GMTrace.i(3276657393664L, 24413);
    GMTrace.o(3276657393664L, 24413);
    return null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3274912563200L, 24400);
    if (getChildCount() < 2)
    {
      GMTrace.o(3274912563200L, 24400);
      return;
    }
    int j = getChildCount();
    paramInt3 = 0;
    paramInt1 = 0;
    while (paramInt1 < j)
    {
      View localView = getChildAt(paramInt1);
      int i = paramInt3;
      if (localView.getVisibility() != 8)
      {
        i = localView.getMeasuredWidth();
        localView.layout(paramInt3, 0, paramInt3 + i, paramInt4 - paramInt2);
        i = paramInt3 + i;
      }
      paramInt1 += 1;
      paramInt3 = i;
    }
    GMTrace.o(3274912563200L, 24400);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3275046780928L, 24401);
    if (getChildCount() < 2)
    {
      GMTrace.o(3275046780928L, 24401);
      return;
    }
    int k = View.MeasureSpec.getSize(paramInt1);
    try
    {
      getChildAt(0).measure(paramInt1, paramInt2);
      int j = Math.max(0, getChildAt(0).getMeasuredHeight());
      ViewGroup.LayoutParams localLayoutParams = getChildAt(1).getLayoutParams();
      View localView = getChildAt(1);
      int i = j;
      if (localView != null)
      {
        i = j;
        if (localView.getVisibility() == 8) {}
      }
      try
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
        i = Math.max(j, localView.getMeasuredHeight());
        setMeasuredDimension(resolveSize(k, paramInt1), resolveSize(i, paramInt2));
        GMTrace.o(3275046780928L, 24401);
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2)
      {
        for (;;) {}
      }
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
    {
      for (;;) {}
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3275315216384L, 24403);
    if (!this.lmH)
    {
      GMTrace.o(3275315216384L, 24403);
      return false;
    }
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if ((this.jpT.aJo()) && (!this.weL))
    {
      w.v("MicroMsg.MMSlideDelView", "onTouchEvent a menu has been shown, skip");
      this.weP = false;
      this.jpT.aJp();
    }
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    if (this.weP)
    {
      GMTrace.o(3275315216384L, 24403);
      return false;
    }
    int j;
    int m;
    switch (i)
    {
    default: 
      if (this.mHandler != null) {
        this.mHandler.removeCallbacks(this.weQ);
      }
    case 0: 
      for (;;)
      {
        GMTrace.o(3275315216384L, 24403);
        return true;
        if ((getContext() instanceof MMActivity)) {
          ((MMActivity)getContext()).aLo();
        }
        this.rZT = false;
        if (!this.xM.isFinished()) {
          this.xM.abortAnimation();
        }
        this.time = System.currentTimeMillis();
        if (this.jpR != null) {
          this.mDH = this.jpR.cf(this);
        }
        if (this.weM == null) {
          this.weM = new b();
        }
        this.mHandler.postDelayed(this.weM, ViewConfiguration.getTapTimeout());
        this.yd = f1;
        this.ye = f2;
        if (this.weQ == null) {
          this.weQ = new a();
        }
        paramMotionEvent = this.weQ;
        paramMotionEvent.weS = paramMotionEvent.weR.getWindowAttachCount();
        this.mHandler.postDelayed(this.weQ, this.weO);
      }
    case 2: 
      j = (int)(this.yd - f1);
      int k = (int)(this.ye - f2);
      m = getScrollX();
      if (!this.rZT)
      {
        if ((j < 0) || (Math.abs(j) < this.hQ / 3)) {
          break label547;
        }
        i = k;
        if (k == 0) {
          i = 1;
        }
        if (Math.abs(j / i) <= 3) {
          break label547;
        }
        i = 1;
        label431:
        if ((i != 0) || (this.weL))
        {
          this.rZT = true;
          dS(true);
        }
      }
      if (this.rZT)
      {
        paramMotionEvent = getChildAt(1);
        if ((paramMotionEvent != null) && (!paramMotionEvent.isShown())) {
          paramMotionEvent.setVisibility(0);
        }
        cai();
        setPressed(false);
        dS(true);
        if (m + j >= 0) {
          break label553;
        }
        i = -m;
      }
      break;
    }
    for (;;)
    {
      if (this.mHandler != null) {
        this.mHandler.removeCallbacks(this.weQ);
      }
      scrollBy(i, 0);
      this.yd = f1;
      this.ye = f2;
      break;
      label547:
      i = 0;
      break label431;
      label553:
      if (m + j > getChildAt(1).getWidth())
      {
        i = getChildAt(1).getWidth() - m;
        continue;
        cai();
        if ((!this.rZT) && ((isPressed()) || (System.currentTimeMillis() - this.time < 200L)) && (this.jpQ != null) && (!this.weL))
        {
          setPressed(true);
          if (this.weN != null) {
            removeCallbacks(this.weN);
          }
          this.weN = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3282160320512L, 24454);
              MMSlideDelView.this.setPressed(false);
              w.v("MicroMsg.MMSlideDelView", "onClick");
              MMSlideDelView.b(MMSlideDelView.this).t(MMSlideDelView.this, MMSlideDelView.a(MMSlideDelView.this));
              MMSlideDelView.this.cak();
              GMTrace.o(3282160320512L, 24454);
            }
          };
          this.mHandler.postDelayed(this.weN, ViewConfiguration.getPressedStateDuration());
        }
        for (;;)
        {
          if (this.rZT) {
            caj();
          }
          he();
          if (this.mHandler == null) {
            break;
          }
          this.mHandler.removeCallbacks(this.weQ);
          break;
          setPressed(false);
        }
        cai();
        setPressed(false);
        if (this.rZT) {
          caj();
        }
        he();
        if (this.mHandler == null) {
          break;
        }
        this.mHandler.removeCallbacks(this.weQ);
        break;
      }
      i = j;
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    GMTrace.i(3275583651840L, 24405);
    w.v("MicroMsg.MMSlideDelView", "window focus change, reset long press status");
    this.weP = false;
    super.onWindowFocusChanged(paramBoolean);
    GMTrace.o(3275583651840L, 24405);
  }
  
  public final void setView(View paramView)
  {
    GMTrace.i(3275180998656L, 24402);
    if (getChildCount() == 2) {
      removeViewAt(0);
    }
    addView(paramView, 0, new ViewGroup.LayoutParams(-1, -2));
    GMTrace.o(3275180998656L, 24402);
  }
  
  private final class a
    extends MMSlideDelView.g
    implements Runnable
  {
    public a()
    {
      super();
      GMTrace.i(3329539178496L, 24807);
      GMTrace.o(3329539178496L, 24807);
    }
    
    public final void run()
    {
      GMTrace.i(3329673396224L, 24808);
      if ((this.weR.hasWindowFocus()) && (MMSlideDelView.c(this.weR) == this.weS)) {}
      for (int i = 1;; i = 0)
      {
        if ((i != 0) && (!MMSlideDelView.d(MMSlideDelView.this)))
        {
          w.i("MicroMsg.MMSlideDelView", "is long press");
          if (MMSlideDelView.this.getParent() != null)
          {
            MMSlideDelView.e(MMSlideDelView.this);
            MMSlideDelView.this.performLongClick();
          }
        }
        GMTrace.o(3329673396224L, 24808);
        return;
      }
    }
  }
  
  final class b
    implements Runnable
  {
    b()
    {
      GMTrace.i(3258940653568L, 24281);
      GMTrace.o(3258940653568L, 24281);
    }
    
    public final void run()
    {
      GMTrace.i(3259074871296L, 24282);
      w.v("MicroMsg.MMSlideDelView", "checkfortap");
      MMSlideDelView.this.setPressed(true);
      GMTrace.o(3259074871296L, 24282);
    }
  }
  
  public static abstract interface c
  {
    public abstract int cf(View paramView);
  }
  
  public static abstract interface d
  {
    public static final Set<MMSlideDelView> mqU;
    
    static
    {
      GMTrace.i(3292092432384L, 24528);
      mqU = new HashSet();
      GMTrace.o(3292092432384L, 24528);
    }
    
    public abstract void a(MMSlideDelView paramMMSlideDelView, boolean paramBoolean);
    
    public abstract boolean aJo();
    
    public abstract void aJp();
    
    public abstract void aJq();
  }
  
  public static abstract interface e
  {
    public abstract void aV(Object paramObject);
  }
  
  public static abstract interface f
  {
    public abstract void t(View paramView, int paramInt);
  }
  
  private class g
  {
    int weS;
    
    public g()
    {
      GMTrace.i(3316117405696L, 24707);
      GMTrace.o(3316117405696L, 24707);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMSlideDelView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */