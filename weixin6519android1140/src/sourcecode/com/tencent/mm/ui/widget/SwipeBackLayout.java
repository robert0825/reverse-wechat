package com.tencent.mm.ui.widget;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.b.a;
import com.tencent.mm.ui.base.b.b;
import com.tencent.mm.ui.mogic.a;
import com.tencent.mm.ui.mogic.a.a;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.tools.j.a;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SwipeBackLayout
  extends FrameLayout
{
  private float AS;
  public View Hw;
  private Rect fV;
  public boolean mEnable;
  private boolean ou;
  public boolean xpb;
  private float xsD;
  private int xsE;
  private int xsF;
  public a xsG;
  private float xsH;
  public Drawable xsI;
  public boolean xsJ;
  private boolean xsK;
  public boolean xsL;
  public boolean xsM;
  private boolean xsN;
  public a xsO;
  
  public SwipeBackLayout(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1621887025152L, 12084);
    GMTrace.o(1621887025152L, 12084);
  }
  
  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1622021242880L, 12085);
    GMTrace.o(1622021242880L, 12085);
  }
  
  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1622155460608L, 12086);
    this.xsD = 0.3F;
    this.mEnable = true;
    this.fV = new Rect();
    this.xsJ = true;
    this.xsK = false;
    this.xsL = false;
    this.xsM = false;
    this.xpb = false;
    this.xsN = false;
    this.xsO = null;
    this.xsI = getResources().getDrawable(a.f.gcK);
    setFocusable(true);
    setDescendantFocusability(262144);
    init();
    GMTrace.o(1622155460608L, 12086);
  }
  
  public final boolean cjs()
  {
    GMTrace.i(1622558113792L, 12089);
    cjt();
    boolean bool = this.xpb;
    GMTrace.o(1622558113792L, 12089);
    return bool;
  }
  
  public final boolean cjt()
  {
    GMTrace.i(1622826549248L, 12091);
    if (!this.xpb)
    {
      GMTrace.o(1622826549248L, 12091);
      return false;
    }
    if (Float.compare(this.Hw.getLeft(), 0.01F) <= 0)
    {
      this.xpb = false;
      GMTrace.o(1622826549248L, 12091);
      return false;
    }
    GMTrace.o(1622826549248L, 12091);
    return true;
  }
  
  public void computeScroll()
  {
    GMTrace.i(1623497637888L, 12096);
    this.AS = Math.max(0.0F, 1.0F - this.xsH);
    a locala = this.xsG;
    if (locala.DZ == 2)
    {
      boolean bool2 = locala.hN.computeScrollOffset();
      i = locala.hN.getCurrX();
      int j = locala.hN.getCurrY();
      int k = i - locala.En.getLeft();
      int m = j - locala.En.getTop();
      if (k != 0) {
        locala.En.offsetLeftAndRight(k);
      }
      if (m != 0) {
        locala.En.offsetTopAndBottom(m);
      }
      if ((k != 0) || (m != 0)) {
        locala.xer.ey(i, j);
      }
      boolean bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (i == locala.hN.getFinalX())
        {
          bool1 = bool2;
          if (j == locala.hN.getFinalY())
          {
            locala.hN.abortAnimation();
            bool1 = locala.hN.isFinished();
          }
        }
      }
      if (!bool1) {
        locala.Ep.post(locala.Eq);
      }
    }
    if (locala.DZ == 2) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        z.F(this);
      }
      GMTrace.o(1623497637888L, 12096);
      return;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1622960766976L, 12092);
    boolean bool;
    if (!this.mEnable)
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(1622960766976L, 12092);
      return bool;
    }
    if (cjt())
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(1622960766976L, 12092);
      return bool;
    }
    float f1;
    float f2;
    int k;
    int m;
    int n;
    label629:
    label664:
    label673:
    float f3;
    View localView;
    for (;;)
    {
      try
      {
        if (this.xsG.DZ != 1) {
          break;
        }
        locala = this.xsG;
        j = o.d(paramMotionEvent);
        i = o.e(paramMotionEvent);
        if (j == 0) {
          locala.cancel();
        }
        if (locala.ez == null) {
          locala.ez = VelocityTracker.obtain();
        }
        locala.ez.addMovement(paramMotionEvent);
        switch (j)
        {
        }
      }
      catch (NullPointerException paramMotionEvent)
      {
        w.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an NullPointerException", new Object[0]);
        GMTrace.o(1622960766976L, 12092);
        return false;
        i = (int)f1;
        k = (int)f2;
        paramMotionEvent = locala.En;
        if ((paramMotionEvent == null) || (i < paramMotionEvent.getLeft()) || (i >= paramMotionEvent.getRight()) || (k < paramMotionEvent.getTop()) || (k >= paramMotionEvent.getBottom())) {
          continue;
        }
        i = 1;
        if (i == 0) {
          continue;
        }
        locala.o(locala.En, j);
        continue;
      }
      catch (IllegalArgumentException paramMotionEvent)
      {
        w.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an IllegalArgumentException", new Object[0]);
        GMTrace.o(1622960766976L, 12092);
        return false;
        i = 0;
        continue;
        if (locala.DZ != 1) {
          break label664;
        }
        i = o.b(paramMotionEvent, locala.eA);
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        m = (int)(f1 - locala.Ec[locala.eA]);
        n = (int)(f2 - locala.Ed[locala.eA]);
        k = locala.En.getLeft() + m;
        j = locala.En.getTop() + n;
        int i2 = locala.En.getLeft();
        int i1 = locala.En.getTop();
        i = k;
        if (m == 0) {
          continue;
        }
        i = locala.xer.d(locala.En, k);
        locala.En.offsetLeftAndRight(i - i2);
        if (n == 0) {
          break label1452;
        }
        locala.En.offsetTopAndBottom(0 - i1);
        j = 0;
        break label1452;
        locala.xer.ey(i, j);
        locala.i(paramMotionEvent);
        continue;
      }
      catch (ArrayIndexOutOfBoundsException paramMotionEvent)
      {
        w.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an ArrayIndexOutOfBoundsException", new Object[0]);
        GMTrace.o(1622960766976L, 12092);
        return false;
      }
      GMTrace.o(1622960766976L, 12092);
      return true;
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      i = o.c(paramMotionEvent, 0);
      paramMotionEvent = locala.q((int)f1, (int)f2);
      locala.a(f1, f2, i);
      locala.o(paramMotionEvent, i);
      i = locala.Ee[i];
      if ((locala.El & i) != 0)
      {
        continue;
        j = o.c(paramMotionEvent, i);
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        locala.a(f1, f2, j);
        if (locala.DZ == 0)
        {
          locala.o(locala.q((int)f1, (int)f2), j);
        }
        else
        {
          j = o.f(paramMotionEvent);
          i = 0;
          if (i < j)
          {
            k = o.c(paramMotionEvent, i);
            f1 = o.d(paramMotionEvent, i);
            f2 = o.e(paramMotionEvent, i);
            f3 = f1 - locala.Ea[k];
            locala.b(f3, f2 - locala.Eb[k], k);
            if (locala.DZ != 1)
            {
              localView = locala.q((int)f1, (int)f2);
              if ((!locala.l(localView, f3)) || (!locala.o(localView, k))) {
                break label1465;
              }
            }
          }
          locala.i(paramMotionEvent);
          continue;
          m = o.c(paramMotionEvent, i);
          if ((locala.DZ == 1) && (m == locala.eA))
          {
            k = -1;
            n = o.f(paramMotionEvent);
            i = 0;
            label828:
            j = k;
            if (i < n)
            {
              j = o.c(paramMotionEvent, i);
              if (j == locala.eA) {
                break label1474;
              }
              f1 = o.d(paramMotionEvent, i);
              f2 = o.e(paramMotionEvent, i);
              if ((locala.q((int)f1, (int)f2) != locala.En) || (!locala.o(locala.En, j))) {
                break label1474;
              }
              j = locala.eA;
            }
            if (j == -1) {
              locala.cH();
            }
          }
          locala.am(m);
          continue;
          if (locala.DZ == 1) {
            locala.cH();
          }
          locala.cancel();
          continue;
          if (locala.DZ == 1) {
            locala.i(0.0F, 0.0F);
          }
          locala.cancel();
        }
      }
    }
    a locala = this.xsG;
    int j = o.d(paramMotionEvent);
    int i = o.e(paramMotionEvent);
    if (j == 0) {
      locala.cancel();
    }
    if (locala.ez == null) {
      locala.ez = VelocityTracker.obtain();
    }
    locala.ez.addMovement(paramMotionEvent);
    switch (j)
    {
    case 4: 
      label1076:
      if (locala.DZ != 1) {
        break;
      }
    }
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        paramMotionEvent.setAction(3);
        super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(1622960766976L, 12092);
        return true;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        i = o.c(paramMotionEvent, 0);
        locala.a(f1, f2, i);
        localView = locala.q((int)f1, (int)f2);
        if ((localView == locala.En) && (locala.DZ == 2)) {
          locala.o(localView, i);
        }
        if ((locala.Ee[i] & locala.El) == 0) {
          break label1076;
        }
        break label1076;
        j = o.c(paramMotionEvent, i);
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        locala.a(f1, f2, j);
        if ((locala.DZ == 0) || (locala.DZ != 2)) {
          break label1076;
        }
        localView = locala.q((int)f1, (int)f2);
        if (localView != locala.En) {
          break label1076;
        }
        locala.o(localView, j);
        break label1076;
        j = o.f(paramMotionEvent);
        i = 0;
      }
      for (;;)
      {
        if (i < j)
        {
          k = o.c(paramMotionEvent, i);
          f1 = o.d(paramMotionEvent, i);
          f2 = o.e(paramMotionEvent, i);
          f3 = f1 - locala.Ea[k];
          locala.b(f3, f2 - locala.Eb[k], k);
          if (locala.DZ != 1)
          {
            localView = locala.q((int)f1, (int)f2);
            if ((localView == null) || (!locala.l(localView, f3)) || (!locala.o(localView, k))) {
              break label1486;
            }
          }
        }
        locala.i(paramMotionEvent);
        break label1076;
        locala.am(o.c(paramMotionEvent, i));
        break label1076;
        locala.cancel();
        break label1076;
        super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(1622960766976L, 12092);
        return true;
        label1452:
        if (m != 0) {
          break;
        }
        if (n == 0) {
          break label629;
        }
        break;
        label1465:
        i += 1;
        break label673;
        label1474:
        i += 1;
        break label828;
        break label1076;
        label1486:
        i += 1;
      }
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    GMTrace.i(1623363420160L, 12095);
    if (paramView == this.Hw) {}
    for (int i = 1;; i = 0)
    {
      boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      if ((Float.compare(this.AS, 0.0F) > 0) && (i != 0) && (this.xsG.DZ != 0))
      {
        Rect localRect = this.fV;
        paramView.getHitRect(localRect);
        this.xsI.setBounds(localRect.left - this.xsI.getIntrinsicWidth(), localRect.top, localRect.left, localRect.bottom);
        this.xsI.setAlpha((int)(this.AS * 255.0F));
        this.xsI.draw(paramCanvas);
      }
      GMTrace.o(1623363420160L, 12095);
      return bool;
    }
  }
  
  public final void init()
  {
    GMTrace.i(1622289678336L, 12087);
    this.xsG = a.a(this, new b());
    this.xsG.El = 1;
    float f = getResources().getDisplayMetrics().density;
    this.xsG.Ej = (100.0F * f);
    this.xsG.Ei = (f * 300.0F);
    this.xsE = 0;
    this.xsF = 0;
    GMTrace.o(1622289678336L, 12087);
  }
  
  public final void mM(boolean paramBoolean)
  {
    GMTrace.i(1622423896064L, 12088);
    w.i("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", new Object[] { Boolean.valueOf(paramBoolean) });
    this.xsL = paramBoolean;
    GMTrace.o(1622423896064L, 12088);
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(1622692331520L, 12090);
    this.Hw = this;
    GMTrace.o(1622692331520L, 12090);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1623094984704L, 12093);
    this.ou = true;
    if (this.Hw != null) {
      this.Hw.layout(this.xsE, this.xsF, this.xsE + this.Hw.getMeasuredWidth(), this.xsF + this.Hw.getMeasuredHeight());
    }
    this.ou = false;
    GMTrace.o(1623094984704L, 12093);
  }
  
  public void requestLayout()
  {
    GMTrace.i(1623229202432L, 12094);
    if (!this.ou) {
      super.requestLayout();
    }
    GMTrace.o(1623229202432L, 12094);
  }
  
  public static abstract interface a
  {
    public abstract void Zp();
    
    public abstract void Zq();
    
    public abstract void onCancel();
  }
  
  private final class b
    extends a.a
    implements b.a
  {
    int xsP;
    int xsQ;
    int xsR;
    
    public b()
    {
      GMTrace.i(1643093426176L, 12242);
      this.xsP = 0;
      this.xsQ = 0;
      this.xsR = 0;
      GMTrace.o(1643093426176L, 12242);
    }
    
    public final boolean DT(int paramInt)
    {
      GMTrace.i(1643227643904L, 12243);
      a locala = SwipeBackLayout.a(SwipeBackLayout.this);
      if ((locala.Eh & 1 << paramInt) != 0) {}
      for (int i = 1; (i != 0) && ((locala.Ee[paramInt] & 0x1) != 0); i = 0)
      {
        GMTrace.o(1643227643904L, 12243);
        return true;
      }
      GMTrace.o(1643227643904L, 12243);
      return false;
    }
    
    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(1643630297088L, 12246);
      int i = paramView.getWidth();
      this.xsQ = 0;
      this.xsR = 0;
      if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (SwipeBackLayout.e(SwipeBackLayout.this) > SwipeBackLayout.h(SwipeBackLayout.this)))) {}
      int j;
      for (i = i + SwipeBackLayout.d(SwipeBackLayout.this).getIntrinsicWidth() + 10;; i = 0)
      {
        this.xsQ = i;
        w.i("MicroMsg.SwipeBackLayout", "ashutest::onViewReleased, xvel:%f yvel:%f, releaseLeft:%d, releaseTop:%d, translucent %B", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(this.xsQ), Integer.valueOf(this.xsR), Boolean.valueOf(SwipeBackLayout.b(SwipeBackLayout.this)) });
        SwipeBackLayout.b(SwipeBackLayout.this, true);
        if (!SwipeBackLayout.b(SwipeBackLayout.this)) {
          break label249;
        }
        paramView = SwipeBackLayout.a(SwipeBackLayout.this);
        i = this.xsQ;
        j = this.xsR;
        if (paramView.Eo) {
          break;
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      }
      paramView.f(i, j, (int)y.a(paramView.ez, paramView.eA), (int)y.b(paramView.ez, paramView.eA));
      SwipeBackLayout.this.invalidate();
      GMTrace.o(1643630297088L, 12246);
      return;
      label249:
      SwipeBackLayout.c(SwipeBackLayout.this, true);
      GMTrace.o(1643630297088L, 12246);
    }
    
    public final int chQ()
    {
      GMTrace.i(1643361861632L, 12244);
      GMTrace.o(1643361861632L, 12244);
      return 1;
    }
    
    public final int d(View paramView, int paramInt)
    {
      GMTrace.i(1643764514816L, 12247);
      if (SwipeBackLayout.b(SwipeBackLayout.this))
      {
        paramInt = Math.max(this.xsP, paramInt);
        this.xsP = 0;
        paramInt = Math.min(paramView.getWidth(), Math.max(paramInt, 0));
        GMTrace.o(1643764514816L, 12247);
        return paramInt;
      }
      this.xsP = Math.max(this.xsP, paramInt);
      GMTrace.o(1643764514816L, 12247);
      return 0;
    }
    
    public final void ey(int paramInt1, int paramInt2)
    {
      GMTrace.i(1643496079360L, 12245);
      if (!SwipeBackLayout.b(SwipeBackLayout.this))
      {
        GMTrace.o(1643496079360L, 12245);
        return;
      }
      SwipeBackLayout.a(SwipeBackLayout.this, Math.abs(paramInt1 / (SwipeBackLayout.c(SwipeBackLayout.this).getWidth() + SwipeBackLayout.d(SwipeBackLayout.this).getIntrinsicWidth())));
      SwipeBackLayout.a(SwipeBackLayout.this, paramInt1);
      SwipeBackLayout.b(SwipeBackLayout.this, paramInt2);
      SwipeBackLayout.this.invalidate();
      if ((Float.compare(SwipeBackLayout.e(SwipeBackLayout.this), 1.0F) >= 0) && (!SwipeBackLayout.f(SwipeBackLayout.this)))
      {
        SwipeBackLayout.a(SwipeBackLayout.this, true);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1617055186944L, 12048);
            if (SwipeBackLayout.g(SwipeBackLayout.this) != null)
            {
              SwipeBackLayout.g(SwipeBackLayout.this).Zp();
              w.d("MicroMsg.SwipeBackLayout", "ashutest:: on popOut");
            }
            SwipeBackLayout.b(SwipeBackLayout.this, false);
            GMTrace.o(1617055186944L, 12048);
          }
        });
      }
      for (;;)
      {
        if (SwipeBackLayout.a(SwipeBackLayout.this).DZ == 1) {
          k.aA(SwipeBackLayout.e(SwipeBackLayout.this));
        }
        GMTrace.o(1643496079360L, 12245);
        return;
        if (Float.compare(SwipeBackLayout.e(SwipeBackLayout.this), 0.01F) <= 0) {
          SwipeBackLayout.b(SwipeBackLayout.this, false);
        }
      }
    }
    
    public final void j(int paramInt)
    {
      GMTrace.i(1643898732544L, 12248);
      w.i("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(SwipeBackLayout.i(SwipeBackLayout.this)), Boolean.valueOf(SwipeBackLayout.j(SwipeBackLayout.this)) });
      if (1 == paramInt)
      {
        w.i("MicroMsg.SwipeBackLayout", "ashutest:: on drag");
        if ((SwipeBackLayout.this.getContext() instanceof Activity)) {
          ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().setBackgroundResource(a.d.transparent);
        }
        if (SwipeBackLayout.g(SwipeBackLayout.this) != null) {
          SwipeBackLayout.g(SwipeBackLayout.this).Zq();
        }
        SwipeBackLayout.a(SwipeBackLayout.this, false);
        if (SwipeBackLayout.b(SwipeBackLayout.this)) {
          k.aA(0.0F);
        }
      }
      if ((paramInt == 0) && (!SwipeBackLayout.j(SwipeBackLayout.this)))
      {
        w.i("MicroMsg.SwipeBackLayout", "ashutest:: on cancel");
        if (SwipeBackLayout.g(SwipeBackLayout.this) != null) {
          SwipeBackLayout.g(SwipeBackLayout.this).onCancel();
        }
        k.aA(1.0F);
      }
      Activity localActivity;
      boolean bool;
      if ((1 == paramInt) && (SwipeBackLayout.k(SwipeBackLayout.this)) && ((SwipeBackLayout.this.getContext() instanceof Activity)) && (!SwipeBackLayout.b(SwipeBackLayout.this)) && (!SwipeBackLayout.i(SwipeBackLayout.this)))
      {
        w.i("MicroMsg.SwipeBackLayout", "ashutest:: match dragging");
        SwipeBackLayout.d(SwipeBackLayout.this, true);
        localActivity = (Activity)SwipeBackLayout.this.getContext();
        if (d.eu(16)) {
          w.w("MicroMsg.ActivityUtil", "convertActivityToTranslucent::Android Version Error %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        }
      }
      else
      {
        if (2 == paramInt)
        {
          w.i("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", new Object[] { Integer.valueOf(this.xsQ) });
          if (this.xsQ <= 0) {
            break label587;
          }
          bool = true;
          label337:
          k.x(bool, this.xsQ);
        }
        GMTrace.o(1643898732544L, 12248);
        return;
      }
      for (;;)
      {
        int i;
        try
        {
          Class[] arrayOfClass = Activity.class.getDeclaredClasses();
          int j = arrayOfClass.length;
          i = 0;
          Object localObject1 = null;
          if (i < j)
          {
            localObject2 = arrayOfClass[i];
            if (!((Class)localObject2).getSimpleName().contains("TranslucentConversionListener")) {
              break label599;
            }
            localObject1 = localObject2;
            break label599;
          }
          if (this == null) {
            break label593;
          }
          localObject2 = new b.b();
          ((b.b)localObject2).vYg = new WeakReference(this);
          localObject2 = Proxy.newProxyInstance(((Class)localObject1).getClassLoader(), new Class[] { localObject1 }, (InvocationHandler)localObject2);
          if (!d.eu(21)) {
            break label532;
          }
          localObject1 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[] { localObject1 });
          ((Method)localObject1).setAccessible(true);
          ((Method)localObject1).invoke(localActivity, new Object[] { localObject2 });
        }
        catch (Throwable localThrowable)
        {
          w.printErrStackTrace("MicroMsg.ActivityUtil", localThrowable, "call convertActivityToTranslucent Fail: %s", new Object[] { localThrowable.getMessage() });
        }
        break;
        label532:
        Method localMethod = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[] { localThrowable, ActivityOptions.class });
        localMethod.setAccessible(true);
        localMethod.invoke(localActivity, new Object[] { localObject2, null });
        break;
        label587:
        bool = false;
        break label337;
        label593:
        Object localObject2 = null;
        continue;
        label599:
        i += 1;
      }
    }
    
    public final void lv(final boolean paramBoolean)
    {
      GMTrace.i(1644032950272L, 12249);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1613833961472L, 12024);
          w.i("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(SwipeBackLayout.b.this.xsQ) });
          SwipeBackLayout.d(SwipeBackLayout.this, paramBoolean);
          if (paramBoolean) {
            if (SwipeBackLayout.b.this.xsQ > 0)
            {
              k.aA(0.0F);
              SwipeBackLayout.this.mM(paramBoolean);
              if ((paramBoolean) && (SwipeBackLayout.j(SwipeBackLayout.this)))
              {
                if (SwipeBackLayout.b.this.xsQ != 0) {
                  break label192;
                }
                j.a(SwipeBackLayout.c(SwipeBackLayout.this), 200L, 0.0F, new j.a()
                {
                  public final void cil()
                  {
                    GMTrace.i(1615713009664L, 12038);
                    onAnimationEnd();
                    GMTrace.o(1615713009664L, 12038);
                  }
                  
                  public final void onAnimationEnd()
                  {
                    GMTrace.i(1615578791936L, 12037);
                    SwipeBackLayout.b(SwipeBackLayout.this, false);
                    GMTrace.o(1615578791936L, 12037);
                  }
                });
              }
            }
          }
          for (;;)
          {
            SwipeBackLayout.c(SwipeBackLayout.this, false);
            GMTrace.o(1613833961472L, 12024);
            return;
            k.aA(1.0F);
            break;
            SwipeBackLayout.b(SwipeBackLayout.this, false);
            break;
            label192:
            j.a(SwipeBackLayout.c(SwipeBackLayout.this), 200L, SwipeBackLayout.b.this.xsQ, new j.a()
            {
              public final void cil()
              {
                GMTrace.i(1634771927040L, 12180);
                onAnimationEnd();
                GMTrace.o(1634771927040L, 12180);
              }
              
              public final void onAnimationEnd()
              {
                GMTrace.i(1634637709312L, 12179);
                SwipeBackLayout.a(SwipeBackLayout.this, true);
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(1641751248896L, 12232);
                    if (SwipeBackLayout.g(SwipeBackLayout.this) != null)
                    {
                      SwipeBackLayout.g(SwipeBackLayout.this).Zp();
                      w.d("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack");
                    }
                    k.aA(1.0F);
                    SwipeBackLayout.b(SwipeBackLayout.this, false);
                    GMTrace.o(1641751248896L, 12232);
                  }
                });
                GMTrace.o(1634637709312L, 12179);
              }
            });
            k.x(true, SwipeBackLayout.b.this.xsQ);
          }
        }
      });
      GMTrace.o(1644032950272L, 12249);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\SwipeBackLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */