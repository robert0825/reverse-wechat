package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.mogic.WxViewPager;
import java.lang.ref.WeakReference;

public class MMViewPager
  extends WxViewPager
{
  private int UQ;
  private int UR;
  private float eqf;
  private VelocityTracker ez;
  private ae handler;
  private GestureDetector imP;
  private int jsh;
  private int jsi;
  private boolean lFD;
  private OverScroller lFE;
  private RectF lFG;
  private float lFI;
  private boolean lFJ;
  private boolean lFK;
  private boolean lFL;
  private boolean lFM;
  private MultiTouchImageView lFU;
  private View.OnTouchListener qLG;
  private boolean qdA;
  private boolean qdB;
  private boolean qdC;
  private float qdy;
  private float qdz;
  private k wfN;
  private boolean wfO;
  private boolean wfP;
  private boolean wfQ;
  private boolean wfR;
  private boolean wfS;
  private int wfT;
  private a wfU;
  public e wfV;
  public c wfW;
  public ViewPager.e wfX;
  private float wfY;
  private MotionEvent wfZ;
  private long wga;
  public b wgb;
  private final int wgc;
  private final int wgd;
  
  public MMViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3163109195776L, 23567);
    this.lFD = false;
    this.wfO = false;
    this.wfP = false;
    this.wfQ = false;
    this.wfR = false;
    this.wfS = false;
    this.lFJ = false;
    this.lFK = false;
    this.lFL = false;
    this.lFM = false;
    this.lFG = new RectF();
    this.wfT = 0;
    this.handler = new ae(Looper.getMainLooper());
    this.wfX = null;
    this.wfY = 0.0F;
    this.wga = 0L;
    this.qdy = 0.0F;
    this.qdz = 0.0F;
    this.qdA = false;
    this.qdB = false;
    this.qdC = false;
    this.wgc = 60;
    this.wgd = 500;
    setStaticTransformationsEnabled(true);
    this.wfN = new k(new WeakReference(this));
    this.imP = new GestureDetector(paramContext, new d((byte)0));
    this.lFE = new OverScroller(paramContext, new DecelerateInterpolator(2.0F));
    this.wfT = ((int)(getResources().getDisplayMetrics().density * 3000.0F));
    super.b(new ViewPager.e()
    {
      public final void V(int paramAnonymousInt)
      {
        GMTrace.i(3278939095040L, 24430);
        if (MMViewPager.e(MMViewPager.this) != null) {
          MMViewPager.e(MMViewPager.this).V(paramAnonymousInt);
        }
        GMTrace.o(3278939095040L, 24430);
      }
      
      public final void W(int paramAnonymousInt)
      {
        GMTrace.i(3279207530496L, 24432);
        if (MMViewPager.e(MMViewPager.this) != null) {
          MMViewPager.e(MMViewPager.this).W(paramAnonymousInt);
        }
        if (paramAnonymousInt == 0) {
          MMViewPager.a(MMViewPager.this, 0.0F);
        }
        GMTrace.o(3279207530496L, 24432);
      }
      
      public final void a(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
        GMTrace.i(3279073312768L, 24431);
        if (MMViewPager.e(MMViewPager.this) != null) {
          MMViewPager.e(MMViewPager.this).a(paramAnonymousInt1, paramAnonymousFloat, paramAnonymousInt2);
        }
        MMViewPager.a(MMViewPager.this, paramAnonymousFloat);
        GMTrace.o(3279073312768L, 24431);
      }
    });
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3242163437568L, 24156);
        if (MMViewPager.f(MMViewPager.this) != null) {}
        for (boolean bool1 = MMViewPager.f(MMViewPager.this).onTouch(paramAnonymousView, paramAnonymousMotionEvent);; bool1 = false)
        {
          paramAnonymousView = MMViewPager.g(MMViewPager.this);
          if (paramAnonymousView == null)
          {
            MMViewPager.a(MMViewPager.this, paramAnonymousMotionEvent);
            MMViewPager.b(MMViewPager.this, null);
            MMViewPager.h(MMViewPager.this).onTouchEvent(paramAnonymousMotionEvent);
            if ((MMViewPager.i(MMViewPager.this)) || (MMViewPager.j(MMViewPager.this)))
            {
              GMTrace.o(3242163437568L, 24156);
              return true;
            }
            GMTrace.o(3242163437568L, 24156);
            return bool1;
          }
          MMViewPager.a(MMViewPager.this, paramAnonymousView);
          boolean bool2 = MMViewPager.a(MMViewPager.this, MMViewPager.a(MMViewPager.this), paramAnonymousMotionEvent);
          if (MMViewPager.k(MMViewPager.this) != null) {
            MMViewPager.k(MMViewPager.this).recycle();
          }
          MMViewPager.b(MMViewPager.this, MotionEvent.obtainNoHistory(paramAnonymousMotionEvent));
          MMViewPager.h(MMViewPager.this).onTouchEvent(paramAnonymousMotionEvent);
          MMViewPager.this.computeScroll();
          if ((bool2) || (bool1))
          {
            GMTrace.o(3242163437568L, 24156);
            return true;
          }
          GMTrace.o(3242163437568L, 24156);
          return false;
        }
      }
    });
    GMTrace.o(3163109195776L, 23567);
  }
  
  public MMViewPager(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3162572324864L, 23563);
    this.lFD = false;
    this.wfO = false;
    this.wfP = false;
    this.wfQ = false;
    this.wfR = false;
    this.wfS = false;
    this.lFJ = false;
    this.lFK = false;
    this.lFL = false;
    this.lFM = false;
    this.lFG = new RectF();
    this.wfT = 0;
    this.handler = new ae(Looper.getMainLooper());
    this.wfX = null;
    this.wfY = 0.0F;
    this.wga = 0L;
    this.qdy = 0.0F;
    this.qdz = 0.0F;
    this.qdA = false;
    this.qdB = false;
    this.qdC = false;
    this.wgc = 60;
    this.wgd = 500;
    setStaticTransformationsEnabled(true);
    GMTrace.o(3162572324864L, 23563);
  }
  
  private boolean a(float paramFloat1, float paramFloat2, View paramView, float paramFloat3)
  {
    GMTrace.i(3163646066688L, 23571);
    int i;
    if (this.xH.j(paramView) == cax()) {
      if (this.wfS) {
        if (paramFloat3 > 0.0F)
        {
          if (paramFloat2 >= this.jsh) {
            this.lFU.H(-paramFloat3, 0.0F);
          }
        }
        else {
          i = 0;
        }
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label242;
      }
      GMTrace.o(3163646066688L, 23571);
      return true;
      if ((paramFloat2 <= this.jsh * 0.7F) || (paramFloat2 >= this.jsi)) {
        break;
      }
      this.lFU.H(-(paramFloat3 * 0.3F), 0.0F);
      i = 1;
      continue;
      if (paramFloat3 > 0.0F)
      {
        if (paramFloat2 < this.jsh) {
          this.wfS = true;
        }
        if (paramFloat2 < this.jsh) {
          break label186;
        }
        this.lFU.H(-paramFloat3, 0.0F);
      }
      for (;;)
      {
        if ((this.wfQ) || (this.wfP))
        {
          i = 0;
          break;
          label186:
          if ((paramFloat2 > this.jsh * 0.7F) && (paramFloat2 < this.jsi))
          {
            this.lFU.H(-(paramFloat3 * 0.3F), 0.0F);
            i = 1;
            break;
          }
        }
      }
      this.wfS = false;
      i = 0;
    }
    label242:
    if (this.xH.j(paramView) == caw()) {
      if (this.wfR) {
        if (paramFloat3 < 0.0F)
        {
          if (paramFloat1 <= this.lFG.left) {
            this.lFU.H(-paramFloat3, 0.0F);
          }
        }
        else {
          i = 0;
        }
      }
    }
    for (;;)
    {
      if (i == 0) {
        break label479;
      }
      GMTrace.o(3163646066688L, 23571);
      return true;
      if ((paramFloat1 <= this.lFG.left) || (paramFloat1 >= this.jsh * 0.3F)) {
        break;
      }
      this.lFU.H(-(paramFloat3 * 0.3F), 0.0F);
      i = 1;
      continue;
      if (paramFloat3 < 0.0F)
      {
        if (paramFloat1 > 0.0F) {
          this.wfR = true;
        }
        if (paramFloat1 > this.lFG.left) {
          break label421;
        }
        this.lFU.H(-paramFloat3, 0.0F);
      }
      for (;;)
      {
        if ((this.wfQ) || (this.wfP))
        {
          i = 0;
          break;
          label421:
          if ((paramFloat1 > this.lFG.left) && (paramFloat1 < this.jsh * 0.3F))
          {
            this.lFU.H(-(paramFloat3 * 0.3F), 0.0F);
            i = 1;
            break;
          }
        }
      }
      this.wfR = false;
      i = 0;
    }
    label479:
    GMTrace.o(3163646066688L, 23571);
    return false;
  }
  
  private void aDG()
  {
    GMTrace.i(3162706542592L, 23564);
    this.wfN.removeMessages(1);
    GMTrace.o(3162706542592L, 23564);
  }
  
  private void aDH()
  {
    GMTrace.i(3162840760320L, 23565);
    aDG();
    k localk = this.wfN;
    localk.lGa = 15L;
    localk.sendEmptyMessageDelayed(1, 15L);
    GMTrace.o(3162840760320L, 23565);
  }
  
  private static boolean b(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    GMTrace.i(3163914502144L, 23573);
    if (paramMotionEvent1.getX() - paramMotionEvent2.getX() < 0.0F)
    {
      GMTrace.o(3163914502144L, 23573);
      return true;
    }
    GMTrace.o(3163914502144L, 23573);
    return false;
  }
  
  private boolean cav()
  {
    GMTrace.i(3163511848960L, 23570);
    if (this.wfP)
    {
      GMTrace.o(3163511848960L, 23570);
      return true;
    }
    this.wfQ = true;
    GMTrace.o(3163511848960L, 23570);
    return false;
  }
  
  public final void a(u paramu)
  {
    GMTrace.i(3163780284416L, 23572);
    if ((paramu instanceof v))
    {
      super.a(paramu);
      GMTrace.o(3163780284416L, 23572);
      return;
    }
    throw new IllegalArgumentException("must be MMViewPagerAdapter");
  }
  
  public final void b(ViewPager.e parame)
  {
    GMTrace.i(3162974978048L, 23566);
    this.wfX = parame;
    GMTrace.o(3162974978048L, 23566);
  }
  
  public final int caw()
  {
    GMTrace.i(3164585590784L, 23578);
    int i = ((v)this.xH).caw();
    if (i >= 0)
    {
      GMTrace.o(3164585590784L, 23578);
      return i;
    }
    i = super.caw();
    GMTrace.o(3164585590784L, 23578);
    return i;
  }
  
  public final int cax()
  {
    GMTrace.i(3164719808512L, 23579);
    int i = ((v)this.xH).cax();
    if (i >= 0)
    {
      GMTrace.o(3164719808512L, 23579);
      return i;
    }
    i = super.cax();
    GMTrace.o(3164719808512L, 23579);
    return i;
  }
  
  public void computeScroll()
  {
    int m = 0;
    GMTrace.i(3164048719872L, 23574);
    super.computeScroll();
    if (this.lFU == null)
    {
      GMTrace.o(3164048719872L, 23574);
      return;
    }
    float f3 = this.lFU.getScale();
    float f4 = this.lFU.imageWidth;
    float f1 = this.lFU.getScale() * this.lFU.imageHeight;
    float f5;
    int j;
    int k;
    if (this.lFE.computeScrollOffset())
    {
      i = this.lFE.getCurrX() - this.UQ;
      int n = this.lFE.getCurrY() - this.UR;
      this.UQ = this.lFE.getCurrX();
      this.UR = this.lFE.getCurrY();
      float[] arrayOfFloat = new float[9];
      this.lFU.getImageMatrix().getValues(arrayOfFloat);
      float f2 = arrayOfFloat[2];
      f3 = f3 * f4 + f2;
      f4 = arrayOfFloat[5];
      f5 = f4 + f1;
      j = i;
      if (i < 0)
      {
        j = i;
        if (i < this.lFG.right - Math.round(f3)) {
          j = (int)(this.lFG.right - Math.round(f3));
        }
      }
      i = j;
      if (j > 0)
      {
        i = j;
        if (j > this.lFG.left - Math.round(f2)) {
          i = (int)(this.lFG.left - Math.round(f2));
        }
      }
      k = n;
      if (n < 0)
      {
        k = n;
        if (n < this.lFG.bottom - Math.round(f5)) {
          k = (int)(this.lFG.bottom - Math.round(f5));
        }
      }
      j = k;
      if (k > 0)
      {
        j = k;
        if (k > this.lFG.top - Math.round(f4)) {
          j = (int)(this.lFG.top - Math.round(f4));
        }
      }
      if ((Math.round(f2) < this.lFG.left) && (Math.round(f3) > this.lFG.right)) {
        break label446;
      }
      k = 0;
      if (f1 >= this.jsi) {
        break label494;
      }
    }
    label446:
    label494:
    for (int i = m;; i = j)
    {
      this.lFU.H(k, i);
      postInvalidate();
      GMTrace.o(3164048719872L, 23574);
      return;
      if (Math.round(f4) < this.lFG.top)
      {
        k = i;
        if (Math.round(f5) > this.lFG.bottom) {
          break;
        }
      }
      j = 0;
      k = i;
      break;
    }
  }
  
  public boolean isFocused()
  {
    GMTrace.i(3164451373056L, 23577);
    GMTrace.o(3164451373056L, 23577);
    return true;
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    GMTrace.i(3164182937600L, 23575);
    if (paramBoolean) {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
    }
    GMTrace.o(3164182937600L, 23575);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3163377631232L, 23569);
    super.onMeasure(paramInt1, paramInt2);
    this.jsh = View.MeasureSpec.getSize(paramInt1);
    this.jsi = View.MeasureSpec.getSize(paramInt2);
    this.lFG.set(0.0F, 0.0F, this.jsh, this.jsi);
    GMTrace.o(3163377631232L, 23569);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    GMTrace.i(3164317155328L, 23576);
    if (paramBoolean) {
      super.onWindowFocusChanged(paramBoolean);
    }
    GMTrace.o(3164317155328L, 23576);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(3163243413504L, 23568);
    this.qLG = paramOnTouchListener;
    GMTrace.o(3163243413504L, 23568);
  }
  
  private abstract class a
  {
    protected boolean eqi;
    
    public a()
    {
      GMTrace.i(3181228589056L, 23702);
      this.eqi = false;
      GMTrace.o(3181228589056L, 23702);
    }
    
    public final boolean aDI()
    {
      GMTrace.i(3181362806784L, 23703);
      boolean bool = this.eqi;
      GMTrace.o(3181362806784L, 23703);
      return bool;
    }
    
    public abstract void play();
  }
  
  public static abstract interface b
  {
    public abstract void C(float paramFloat1, float paramFloat2);
    
    public abstract void D(float paramFloat1, float paramFloat2);
  }
  
  public static abstract interface c
  {
    public abstract void ayF();
  }
  
  private final class d
    extends GestureDetector.SimpleOnGestureListener
  {
    private d()
    {
      GMTrace.i(3348866531328L, 24951);
      GMTrace.o(3348866531328L, 24951);
    }
    
    public final boolean onDoubleTap(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3349403402240L, 24955);
      if (MMViewPager.a(MMViewPager.this) == null)
      {
        GMTrace.o(3349403402240L, 24955);
        return false;
      }
      if (MMViewPager.a(MMViewPager.this).getScale() <= MMViewPager.a(MMViewPager.this).oyq) {
        MMViewPager.a(MMViewPager.this).G(g.i(paramMotionEvent, 0), g.j(paramMotionEvent, 0));
      }
      for (;;)
      {
        GMTrace.o(3349403402240L, 24955);
        return true;
        MMViewPager.a(MMViewPager.this).F(g.i(paramMotionEvent, 0), g.j(paramMotionEvent, 0));
      }
    }
    
    public final boolean onDown(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3349134966784L, 24953);
      if (MMViewPager.m(MMViewPager.this) != null) {
        MMViewPager.m(MMViewPager.this).forceFinished(true);
      }
      boolean bool = super.onDown(paramMotionEvent);
      GMTrace.o(3349134966784L, 24953);
      return bool;
    }
    
    public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(3349537619968L, 24956);
      w.d("MicroMsg.MMViewPager", "onFling");
      MultiTouchImageView localMultiTouchImageView = MMViewPager.g(MMViewPager.this);
      float f2;
      float f5;
      float f3;
      float f4;
      float f6;
      if (localMultiTouchImageView != null)
      {
        w.d("MicroMsg.MMViewPager", "onFling MultiTouchImageView");
        localMultiTouchImageView = (MultiTouchImageView)localMultiTouchImageView;
        f2 = localMultiTouchImageView.getScale() * localMultiTouchImageView.imageWidth;
        f5 = localMultiTouchImageView.getScale() * localMultiTouchImageView.imageHeight;
        if ((localMultiTouchImageView.wgN) || (localMultiTouchImageView.wgO) || ((int)f2 > MMViewPager.b(MMViewPager.this)) || ((int)f5 > MMViewPager.d(MMViewPager.this)))
        {
          float[] arrayOfFloat = new float[9];
          localMultiTouchImageView.getImageMatrix().getValues(arrayOfFloat);
          f3 = arrayOfFloat[2];
          f4 = f3 + f2;
          f6 = arrayOfFloat[5];
          w.d("MicroMsg.MMViewPager", "left: %f,right: %f isGestureRight=> %B, vX: %s, vY: %s", new Object[] { Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(MMViewPager.c(paramMotionEvent1, paramMotionEvent2)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
          if ((Math.round(f3) < MMViewPager.p(MMViewPager.this).left) && (Math.round(f4) > MMViewPager.p(MMViewPager.this).right)) {
            break label645;
          }
        }
      }
      label565:
      label600:
      label645:
      for (float f1 = 0.0F;; f1 = paramFloat1)
      {
        if ((Math.round(f6) >= MMViewPager.p(MMViewPager.this).top) || (Math.round(f6 + f5) <= MMViewPager.p(MMViewPager.this).bottom)) {
          paramFloat2 = 0.0F;
        }
        int i = (int)(MMViewPager.p(MMViewPager.this).right - f2);
        int j = (int)(f2 + MMViewPager.p(MMViewPager.this).right);
        int k = (int)(MMViewPager.p(MMViewPager.this).bottom - f5);
        int m = (int)(MMViewPager.p(MMViewPager.this).bottom + f5);
        if (f1 >= 0.0F)
        {
          f2 = f1;
          if (Math.abs(f1) >= MMViewPager.q(MMViewPager.this)) {
            f2 = MMViewPager.q(MMViewPager.this);
          }
          if (paramFloat2 < 0.0F) {
            break label565;
          }
          f1 = paramFloat2;
          if (Math.abs(paramFloat2) >= MMViewPager.q(MMViewPager.this)) {
            f1 = MMViewPager.q(MMViewPager.this);
          }
        }
        for (;;)
        {
          MMViewPager.m(MMViewPager.this).fling(MMViewPager.m(MMViewPager.this).getCurrX(), MMViewPager.m(MMViewPager.this).getCurrY(), (int)f2, (int)f1, i, j, k, m, 0, 0);
          if (((MMViewPager.c(paramMotionEvent1, paramMotionEvent2)) && (f3 >= 0.0F)) || ((!MMViewPager.c(paramMotionEvent1, paramMotionEvent2)) && (f4 <= MMViewPager.b(MMViewPager.this)))) {
            break label600;
          }
          GMTrace.o(3349537619968L, 24956);
          return false;
          if (Math.abs(paramFloat1) >= MMViewPager.q(MMViewPager.this)) {}
          for (f1 = -MMViewPager.q(MMViewPager.this);; f1 = paramFloat1)
          {
            f2 = f1;
            break;
          }
          f1 = paramFloat2;
          if (Math.abs(paramFloat2) >= MMViewPager.q(MMViewPager.this)) {
            f1 = -MMViewPager.q(MMViewPager.this);
          }
        }
        if (MMViewPager.i(MMViewPager.this))
        {
          GMTrace.o(3349537619968L, 24956);
          return false;
        }
        boolean bool = MMViewPager.a(MMViewPager.this, paramMotionEvent1, paramMotionEvent2, paramFloat1);
        GMTrace.o(3349537619968L, 24956);
        return bool;
      }
    }
    
    public final void onLongPress(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3349269184512L, 24954);
      MMViewPager.n(MMViewPager.this);
      if (MMViewPager.o(MMViewPager.this) != null) {
        MMViewPager.o(MMViewPager.this).ayF();
      }
      GMTrace.o(3349269184512L, 24954);
    }
    
    public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3349000749056L, 24952);
      if (MMViewPager.l(MMViewPager.this) != null) {
        MMViewPager.l(MMViewPager.this).alM();
      }
      GMTrace.o(3349000749056L, 24952);
      return true;
    }
  }
  
  public static abstract interface e
  {
    public abstract void aDF();
    
    public abstract void alM();
  }
  
  private final class f
    extends MMViewPager.a
  {
    public float[] lFT;
    
    public f()
    {
      super();
      GMTrace.i(3352490409984L, 24978);
      this.lFT = new float[9];
      GMTrace.o(3352490409984L, 24978);
    }
    
    public final void play()
    {
      GMTrace.i(3352624627712L, 24979);
      MMViewPager.c(MMViewPager.this).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3281623449600L, 24450);
          MMViewPager.a(MMViewPager.this).getImageMatrix().getValues(MMViewPager.f.this.lFT);
          float f1 = MMViewPager.a(MMViewPager.this).getScale();
          float f2 = MMViewPager.a(MMViewPager.this).imageHeight * f1;
          float f3 = MMViewPager.f.this.lFT[5];
          f1 = MMViewPager.d(MMViewPager.this);
          if (f2 < MMViewPager.d(MMViewPager.this)) {
            f1 = MMViewPager.d(MMViewPager.this) / 2.0F + f2 / 2.0F;
          }
          f1 -= f3 + f2;
          if (f1 <= 0.0F) {
            MMViewPager.f.this.eqi = true;
          }
          for (;;)
          {
            MMViewPager.a(MMViewPager.this).H(0.0F, f1);
            GMTrace.o(3281623449600L, 24450);
            return;
            if (Math.abs(f1) <= 5.0F) {
              MMViewPager.f.this.eqi = true;
            } else {
              f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
            }
          }
        }
      });
      GMTrace.o(3352624627712L, 24979);
    }
  }
  
  private final class g
    extends MMViewPager.a
  {
    public float[] lFT;
    
    public g()
    {
      super();
      GMTrace.i(3190355394560L, 23770);
      this.lFT = new float[9];
      GMTrace.o(3190355394560L, 23770);
    }
    
    public final void play()
    {
      GMTrace.i(3190489612288L, 23771);
      MMViewPager.c(MMViewPager.this).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3278670659584L, 24428);
          MMViewPager.a(MMViewPager.this).getImageMatrix().getValues(MMViewPager.g.this.lFT);
          float f4 = MMViewPager.a(MMViewPager.this).getScale() * MMViewPager.a(MMViewPager.this).imageWidth;
          float f7 = MMViewPager.a(MMViewPager.this).getScale() * MMViewPager.a(MMViewPager.this).imageHeight;
          float f6 = MMViewPager.g.this.lFT[2];
          float f9 = MMViewPager.g.this.lFT[5];
          float f5 = MMViewPager.g.this.lFT[2];
          float f8 = MMViewPager.g.this.lFT[5];
          float f1 = MMViewPager.d(MMViewPager.this);
          float f3 = MMViewPager.b(MMViewPager.this);
          float f2;
          if (f7 < MMViewPager.d(MMViewPager.this))
          {
            f2 = MMViewPager.d(MMViewPager.this) / 2.0F;
            float f11 = f7 / 2.0F;
            f1 = MMViewPager.d(MMViewPager.this) / 2.0F;
            float f10 = f7 / 2.0F;
            f2 -= f11;
            f1 += f10;
          }
          for (;;)
          {
            f2 -= f9;
            f1 -= f8 + f7;
            if (f2 < 0.0F) {
              f1 = f2;
            }
            for (;;)
            {
              if (f4 < MMViewPager.b(MMViewPager.this))
              {
                f3 = MMViewPager.b(MMViewPager.this) / 2.0F;
                f8 = f4 / 2.0F;
                f2 = MMViewPager.b(MMViewPager.this) / 2.0F;
                f7 = f4 / 2.0F;
                f3 -= f8;
                f2 += f7;
              }
              for (;;)
              {
                f3 -= f6;
                f2 -= f5 + f4;
                if (f3 < 0.0F) {
                  f2 = f3;
                }
                for (;;)
                {
                  label336:
                  if ((Math.abs(f2) <= 5.0F) && (Math.abs(f1) <= 5.0F)) {
                    MMViewPager.g.this.eqi = true;
                  }
                  for (;;)
                  {
                    MMViewPager.a(MMViewPager.this).H(f2, f1);
                    GMTrace.o(3278670659584L, 24428);
                    return;
                    if (f1 <= 0.0F) {
                      break label546;
                    }
                    break;
                    if (f2 <= 0.0F) {
                      break label534;
                    }
                    break label336;
                    if (f2 >= 0.0F) {}
                    for (f2 = (float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;; f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F)
                    {
                      if (f1 < 0.0F) {
                        break label504;
                      }
                      f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
                      break;
                    }
                    label504:
                    f1 = -(float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
                  }
                  label534:
                  f2 = 0.0F;
                }
                f2 = f3;
                f3 = 0.0F;
              }
              label546:
              f1 = 0.0F;
            }
            f2 = 0.0F;
          }
        }
      });
      GMTrace.o(3190489612288L, 23771);
    }
  }
  
  private final class h
    extends MMViewPager.a
  {
    public float[] lFT;
    
    public h()
    {
      super();
      GMTrace.i(3282294538240L, 24455);
      this.lFT = new float[9];
      GMTrace.o(3282294538240L, 24455);
    }
    
    public final void play()
    {
      GMTrace.i(3282428755968L, 24456);
      MMViewPager.c(MMViewPager.this).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3340679249920L, 24890);
          MMViewPager.a(MMViewPager.this).getImageMatrix().getValues(MMViewPager.h.this.lFT);
          float f2 = MMViewPager.h.this.lFT[2];
          float f1 = MMViewPager.a(MMViewPager.this).getScale() * MMViewPager.a(MMViewPager.this).imageWidth;
          if (f1 < MMViewPager.b(MMViewPager.this)) {}
          for (f1 = MMViewPager.b(MMViewPager.this) / 2.0F - f1 / 2.0F;; f1 = 0.0F)
          {
            f1 -= f2;
            if (f1 >= 0.0F) {
              MMViewPager.h.this.eqi = true;
            }
            for (;;)
            {
              MMViewPager.a(MMViewPager.this).H(f1, 0.0F);
              GMTrace.o(3340679249920L, 24890);
              return;
              if (Math.abs(f1) <= 5.0F) {
                MMViewPager.h.this.eqi = true;
              } else {
                f1 = -(float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
              }
            }
          }
        }
      });
      GMTrace.o(3282428755968L, 24456);
    }
  }
  
  private final class i
    extends MMViewPager.a
  {
    public float[] lFT;
    
    public i()
    {
      super();
      GMTrace.i(3299742842880L, 24585);
      this.lFT = new float[9];
      GMTrace.o(3299742842880L, 24585);
    }
    
    public final void play()
    {
      GMTrace.i(3299877060608L, 24586);
      MMViewPager.c(MMViewPager.this).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3287663247360L, 24495);
          MMViewPager.a(MMViewPager.this).getImageMatrix().getValues(MMViewPager.i.this.lFT);
          float f1 = MMViewPager.a(MMViewPager.this).getScale();
          float f2 = MMViewPager.a(MMViewPager.this).imageWidth * f1;
          float f3 = MMViewPager.i.this.lFT[2];
          f1 = MMViewPager.b(MMViewPager.this);
          if (f2 < MMViewPager.b(MMViewPager.this)) {
            f1 = MMViewPager.b(MMViewPager.this) / 2.0F + f2 / 2.0F;
          }
          f1 -= f3 + f2;
          if (f1 <= 0.0F) {
            MMViewPager.i.this.eqi = true;
          }
          for (;;)
          {
            MMViewPager.a(MMViewPager.this).H(f1, 0.0F);
            GMTrace.o(3287663247360L, 24495);
            return;
            if (Math.abs(f1) <= 5.0F) {
              MMViewPager.i.this.eqi = true;
            } else {
              f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
            }
          }
        }
      });
      GMTrace.o(3299877060608L, 24586);
    }
  }
  
  private final class j
    extends MMViewPager.a
  {
    public float[] lFT;
    
    public j()
    {
      super();
      GMTrace.i(3150358511616L, 23472);
      this.lFT = new float[9];
      GMTrace.o(3150358511616L, 23472);
    }
    
    public final void play()
    {
      GMTrace.i(3150492729344L, 23473);
      MMViewPager.c(MMViewPager.this).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(3315714752512L, 24704);
          MMViewPager.a(MMViewPager.this).getImageMatrix().getValues(MMViewPager.j.this.lFT);
          float f2 = MMViewPager.j.this.lFT[5];
          float f1 = MMViewPager.a(MMViewPager.this).getScale() * MMViewPager.a(MMViewPager.this).imageHeight;
          if (f1 < MMViewPager.d(MMViewPager.this)) {}
          for (f1 = MMViewPager.d(MMViewPager.this) / 2.0F - f1 / 2.0F;; f1 = 0.0F)
          {
            f1 -= f2;
            if (f1 >= 0.0F) {
              MMViewPager.j.this.eqi = true;
            }
            for (;;)
            {
              MMViewPager.a(MMViewPager.this).H(0.0F, f1);
              GMTrace.o(3315714752512L, 24704);
              return;
              if (Math.abs(f1) <= 5.0F) {
                MMViewPager.j.this.eqi = true;
              } else {
                f1 = -(float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
              }
            }
          }
        }
      });
      GMTrace.o(3150492729344L, 23473);
    }
  }
  
  public static final class k
    extends ae
  {
    long lGa;
    WeakReference<MMViewPager> wgk;
    
    public k(WeakReference<MMViewPager> paramWeakReference)
    {
      GMTrace.i(3339068637184L, 24878);
      this.wgk = paramWeakReference;
      GMTrace.o(3339068637184L, 24878);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(3339202854912L, 24879);
      super.handleMessage(paramMessage);
      removeMessages(paramMessage.what);
      if (this.wgk != null)
      {
        MMViewPager localMMViewPager = (MMViewPager)this.wgk.get();
        if ((localMMViewPager != null) && (paramMessage.what == 1))
        {
          if ((MMViewPager.r(localMMViewPager) != null) && (!MMViewPager.r(localMMViewPager).aDI()))
          {
            MMViewPager.r(localMMViewPager).play();
            sendEmptyMessageDelayed(paramMessage.what, this.lGa);
            GMTrace.o(3339202854912L, 24879);
            return;
          }
          MMViewPager.s(localMMViewPager);
        }
      }
      GMTrace.o(3339202854912L, 24879);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */