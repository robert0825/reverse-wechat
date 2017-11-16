package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public class ShuffleView
  extends FrameLayout
{
  public static DisplayMetrics hjd;
  GestureDetector mHA;
  List<View> mHb;
  c mHc;
  ValueAnimator mHd;
  private ValueAnimator mHe;
  ValueAnimator mHf;
  ValueAnimator mHg;
  a mHh;
  b mHi;
  View mHj;
  private View mHk;
  View mHl;
  int mHm;
  View mHn;
  int mHo;
  int mHp;
  private float mHq;
  private float mHr;
  private final float mHs;
  private final float mHt;
  private final float mHu;
  private ArrayList<Float> mHv;
  private ArrayList<Float> mHw;
  private boolean mHx;
  private int mHy;
  private int mHz;
  
  public ShuffleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9769171550208L, 72786);
    this.mHs = 0.23F;
    this.mHt = 0.28F;
    this.mHu = 0.33F;
    this.mHz = 2500;
    this.mHA = new GestureDetector(new GestureDetector.OnGestureListener()
    {
      public final boolean onDown(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9780311621632L, 72869);
        w.d("ShuffleView", "gesture down");
        switch (ShuffleView.l(ShuffleView.this).mHG)
        {
        }
        for (;;)
        {
          GMTrace.o(9780311621632L, 72869);
          return false;
          int j = (int)paramAnonymousMotionEvent.getX();
          int k = (int)paramAnonymousMotionEvent.getY();
          int i = 0;
          while (i < ShuffleView.d(ShuffleView.this))
          {
            paramAnonymousMotionEvent = ShuffleView.a(ShuffleView.this, i);
            if ((paramAnonymousMotionEvent != null) && (paramAnonymousMotionEvent.contains(j, k)))
            {
              paramAnonymousMotionEvent = (View)ShuffleView.e(ShuffleView.this).get(i);
              if ((ShuffleView.h(ShuffleView.this) != paramAnonymousMotionEvent) && (ShuffleView.h(ShuffleView.this) != null)) {
                ShuffleView.m(ShuffleView.this);
              }
              while (ShuffleView.h(ShuffleView.this) != paramAnonymousMotionEvent)
              {
                ShuffleView.b(ShuffleView.this, i);
                GMTrace.o(9780311621632L, 72869);
                return true;
              }
              w.i("ShuffleView", "down on the select card");
              GMTrace.o(9780311621632L, 72869);
              return true;
            }
            i += 1;
          }
        }
      }
      
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(9780982710272L, 72874);
        w.i("ShuffleView", "fling up " + paramAnonymousFloat2);
        if (paramAnonymousFloat2 < -ShuffleView.r(ShuffleView.this))
        {
          switch (ShuffleView.l(ShuffleView.this).mHG)
          {
          }
          for (;;)
          {
            GMTrace.o(9780982710272L, 72874);
            return true;
            if (ShuffleView.h(ShuffleView.this) != null) {
              ShuffleView.m(ShuffleView.this);
            }
            if (ShuffleView.k(ShuffleView.this) != null)
            {
              if (ShuffleView.n(ShuffleView.this) != null) {
                ShuffleView.n(ShuffleView.this).pP(ShuffleView.d(ShuffleView.this));
              }
              ShuffleView.c(ShuffleView.this, ShuffleView.i(ShuffleView.this));
            }
          }
        }
        GMTrace.o(9780982710272L, 72874);
        return false;
      }
      
      public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9780848492544L, 72873);
        GMTrace.o(9780848492544L, 72873);
      }
      
      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(9780714274816L, 72872);
        int j;
        int k;
        if (paramAnonymousMotionEvent2.getActionMasked() == 2)
        {
          j = (int)paramAnonymousMotionEvent2.getX();
          k = (int)paramAnonymousMotionEvent2.getY();
          switch (ShuffleView.l(ShuffleView.this).mHG)
          {
          }
        }
        label209:
        do
        {
          GMTrace.o(9780714274816L, 72872);
          return false;
          if (Math.abs(paramAnonymousFloat2) < ShuffleView.o(ShuffleView.this))
          {
            int i = 0;
            if (i < ShuffleView.d(ShuffleView.this))
            {
              paramAnonymousMotionEvent1 = ShuffleView.a(ShuffleView.this, i);
              if ((paramAnonymousMotionEvent1 != null) && (paramAnonymousMotionEvent1.contains(j, k)))
              {
                paramAnonymousMotionEvent1 = (View)ShuffleView.e(ShuffleView.this).get(i);
                if ((ShuffleView.h(ShuffleView.this) == paramAnonymousMotionEvent1) || (ShuffleView.h(ShuffleView.this) == null)) {
                  break label209;
                }
                ShuffleView.m(ShuffleView.this);
              }
              while (ShuffleView.h(ShuffleView.this) != paramAnonymousMotionEvent1)
              {
                if (ShuffleView.k(ShuffleView.this) != paramAnonymousMotionEvent1)
                {
                  ShuffleView.p(ShuffleView.this);
                  ShuffleView.b(ShuffleView.this, i);
                }
                i += 1;
                break;
              }
              w.i("ShuffleView", "scroll on the select card");
            }
          }
        } while (Math.abs(paramAnonymousFloat1) >= ShuffleView.o(ShuffleView.this));
        w.d("ShuffleView", "scroll distanceY:" + paramAnonymousFloat2);
        paramAnonymousMotionEvent1 = null;
        if (ShuffleView.k(ShuffleView.this) != null)
        {
          paramAnonymousMotionEvent1 = ShuffleView.k(ShuffleView.this);
          if (paramAnonymousMotionEvent1 != null)
          {
            w.i("ShuffleView", "scroll translationY:" + paramAnonymousMotionEvent1.getTranslationY() + "," + paramAnonymousMotionEvent1.getHeight() / 7);
            if ((int)paramAnonymousMotionEvent1.getTranslationY() > -paramAnonymousMotionEvent1.getHeight() / 7) {
              break label521;
            }
            if ((paramAnonymousFloat2 < 0.0F) && (Math.abs(paramAnonymousFloat2) > ShuffleView.o(ShuffleView.this)))
            {
              if ((int)paramAnonymousFloat2 > -paramAnonymousMotionEvent1.getHeight() / 7) {
                break label507;
              }
              paramAnonymousMotionEvent1.setTranslationY(0.0F);
              label387:
              if (paramAnonymousMotionEvent1 == ShuffleView.h(ShuffleView.this))
              {
                ShuffleView.a(ShuffleView.this, ShuffleView.h(ShuffleView.this));
                ShuffleView.d(ShuffleView.this, ShuffleView.f(ShuffleView.this));
                if (ShuffleView.q(ShuffleView.this).isStarted())
                {
                  w.i("ShuffleView", "scroll when select view is animation");
                  ShuffleView.q(ShuffleView.this).cancel();
                }
                ShuffleView.b(ShuffleView.this, null);
                ShuffleView.e(ShuffleView.this, 0);
              }
            }
          }
        }
        for (;;)
        {
          GMTrace.o(9780714274816L, 72872);
          return false;
          if (ShuffleView.h(ShuffleView.this) == null) {
            break;
          }
          paramAnonymousMotionEvent1 = ShuffleView.h(ShuffleView.this);
          break;
          label507:
          paramAnonymousMotionEvent1.setTranslationY(paramAnonymousMotionEvent1.getTranslationY() - paramAnonymousFloat2);
          break label387;
          label521:
          if (paramAnonymousMotionEvent1.getTranslationY() == 0.0F)
          {
            if ((paramAnonymousFloat2 > 0.0F) && (Math.abs(paramAnonymousFloat2) > ShuffleView.o(ShuffleView.this))) {
              if ((int)paramAnonymousFloat2 >= paramAnonymousMotionEvent1.getHeight() / 7) {
                paramAnonymousMotionEvent1.setTranslationY(-paramAnonymousMotionEvent1.getHeight() / 7);
              } else {
                paramAnonymousMotionEvent1.setTranslationY(paramAnonymousMotionEvent1.getTranslationY() - paramAnonymousFloat2);
              }
            }
          }
          else if (paramAnonymousFloat2 < 0.0F)
          {
            if (paramAnonymousMotionEvent1.getTranslationY() - paramAnonymousFloat2 >= 0.0F) {
              paramAnonymousMotionEvent1.setTranslationY(0.0F);
            } else {
              paramAnonymousMotionEvent1.setTranslationY(paramAnonymousMotionEvent1.getTranslationY() - paramAnonymousFloat2);
            }
          }
          else if ((int)(paramAnonymousMotionEvent1.getTranslationY() - paramAnonymousFloat2) <= -paramAnonymousMotionEvent1.getHeight() / 7) {
            paramAnonymousMotionEvent1.setTranslationY(-paramAnonymousMotionEvent1.getHeight() / 7);
          } else {
            paramAnonymousMotionEvent1.setTranslationY(paramAnonymousMotionEvent1.getTranslationY() - paramAnonymousFloat2);
          }
        }
      }
      
      public final void onShowPress(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9780445839360L, 72870);
        GMTrace.o(9780445839360L, 72870);
      }
      
      public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9780580057088L, 72871);
        switch (ShuffleView.l(ShuffleView.this).mHG)
        {
        default: 
          GMTrace.o(9780580057088L, 72871);
          return false;
        }
        if (ShuffleView.h(ShuffleView.this) != null)
        {
          w.d("ShuffleView", "click the select card");
          if (ShuffleView.n(ShuffleView.this) != null) {
            ShuffleView.n(ShuffleView.this).cq(ShuffleView.f(ShuffleView.this), ShuffleView.d(ShuffleView.this));
          }
          ShuffleView.m(ShuffleView.this);
        }
        if (ShuffleView.k(ShuffleView.this) != null)
        {
          if (ShuffleView.n(ShuffleView.this) != null) {
            ShuffleView.n(ShuffleView.this).pP(ShuffleView.d(ShuffleView.this));
          }
          ShuffleView.c(ShuffleView.this, ShuffleView.i(ShuffleView.this));
        }
        GMTrace.o(9780580057088L, 72871);
        return true;
      }
    });
    this.mHc = new c();
    this.mHb = new ArrayList();
    this.mHv = new ArrayList();
    this.mHw = new ArrayList();
    this.mHy = getResources().getDimensionPixelSize(a.d.snq);
    GMTrace.o(9769171550208L, 72786);
  }
  
  private void aLX()
  {
    GMTrace.i(9769305767936L, 72787);
    if (this.mHp > 1)
    {
      w.d("ShuffleView", "card width: %d,height: %d", new Object[] { Integer.valueOf(((View)this.mHb.get(0)).getWidth()), Integer.valueOf(((View)this.mHb.get(0)).getHeight()) });
      if (this.mHc.mHF == 2)
      {
        this.mHq = (((View)this.mHb.get(0)).getWidth() * 1.5F / this.mHp);
        if (this.mHq > ((View)this.mHb.get(0)).getWidth() * 0.23F)
        {
          this.mHq = (((View)this.mHb.get(0)).getWidth() * 0.23F);
          GMTrace.o(9769305767936L, 72787);
        }
      }
      else if (this.mHc.mHF == 1)
      {
        this.mHr = (((View)this.mHb.get(0)).getHeight() * 1.0F / this.mHp);
        GMTrace.o(9769305767936L, 72787);
      }
    }
    else
    {
      this.mHq = 0.0F;
      this.mHr = 0.0F;
    }
    GMTrace.o(9769305767936L, 72787);
  }
  
  private void aLZ()
  {
    GMTrace.i(9769976856576L, 72792);
    if (this.mHl != null)
    {
      w.i("ShuffleView", "selectView != null, cancel select");
      if (this.mHg.isStarted()) {
        this.mHg.cancel();
      }
      this.mHg.removeAllUpdateListeners();
      this.mHg.removeAllListeners();
      switch (this.mHc.mHG)
      {
      }
    }
    for (;;)
    {
      this.mHl = null;
      this.mHm = 0;
      this.mHg.start();
      GMTrace.o(9769976856576L, 72792);
      return;
      if (this.mHm >= 0) {
        this.mHg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            int i = 0;
            GMTrace.i(9776956178432L, 72844);
            float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
            if (f == 0.0F)
            {
              ShuffleView.b(ShuffleView.this).clear();
              ShuffleView.c(ShuffleView.this).clear();
              while (i < ShuffleView.d(ShuffleView.this))
              {
                ShuffleView.b(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationX()));
                ShuffleView.c(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationY()));
                i += 1;
              }
              GMTrace.o(9776956178432L, 72844);
              return;
            }
            i = 0;
            while (i < ShuffleView.d(ShuffleView.this))
            {
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pR(i) * f);
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
              i += 1;
            }
            GMTrace.o(9776956178432L, 72844);
          }
        });
      }
    }
  }
  
  private void aMa()
  {
    GMTrace.i(9770245292032L, 72794);
    if (this.mHn != null)
    {
      w.i("ShuffleView", "touchView != null,cancel touch");
      if (this.mHg.isStarted()) {
        this.mHg.cancel();
      }
      this.mHg.removeAllUpdateListeners();
      this.mHg.removeAllListeners();
      switch (this.mHc.mHG)
      {
      }
    }
    for (;;)
    {
      this.mHn = null;
      this.mHo = -1;
      this.mHg.start();
      GMTrace.o(9770245292032L, 72794);
      return;
      if (this.mHo >= 0) {
        this.mHg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            int i = 0;
            GMTrace.i(9750112632832L, 72644);
            float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
            if (f == 0.0F)
            {
              ShuffleView.b(ShuffleView.this).clear();
              ShuffleView.c(ShuffleView.this).clear();
              while (i < ShuffleView.d(ShuffleView.this))
              {
                ShuffleView.b(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationX()));
                ShuffleView.c(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationY()));
                i += 1;
              }
              GMTrace.o(9750112632832L, 72644);
              return;
            }
            i = 0;
            while (i < ShuffleView.d(ShuffleView.this))
            {
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pR(i) * f);
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
              i += 1;
            }
            GMTrace.o(9750112632832L, 72644);
          }
        });
      }
    }
  }
  
  private Rect pU(int paramInt)
  {
    GMTrace.i(9770513727488L, 72796);
    if ((paramInt >= 0) && (paramInt < this.mHp)) {
      localObject = (View)this.mHb.get(paramInt);
    }
    switch (this.mHc.mHG)
    {
    default: 
      GMTrace.o(9770513727488L, 72796);
      return null;
    }
    if (paramInt == 0)
    {
      paramInt = ((View)localObject).getLeft();
      i = (int)((View)localObject).getTranslationX();
      j = ((View)localObject).getTop();
      k = (int)((View)localObject).getTranslationY();
      m = ((View)localObject).getRight();
      n = (int)((View)localObject).getTranslationX();
      i1 = ((View)localObject).getBottom();
      localObject = new Rect(paramInt + i, j + k, m + n, (int)((View)localObject).getTranslationY() + i1);
      GMTrace.o(9770513727488L, 72796);
      return (Rect)localObject;
    }
    View localView = (View)this.mHb.get(paramInt - 1);
    paramInt = localView.getRight();
    int i = (int)localView.getTranslationX();
    int j = ((View)localObject).getTop();
    int k = (int)((View)localObject).getTranslationY();
    int m = ((View)localObject).getRight();
    int n = (int)((View)localObject).getTranslationX();
    int i1 = ((View)localObject).getBottom();
    Object localObject = new Rect(i + paramInt, j + k, m + n, (int)((View)localObject).getTranslationY() + i1);
    GMTrace.o(9770513727488L, 72796);
    return (Rect)localObject;
  }
  
  final int aLY()
  {
    GMTrace.i(9769842638848L, 72791);
    int i = (int)(Math.random() * this.mHp);
    GMTrace.o(9769842638848L, 72791);
    return i;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9770379509760L, 72795);
    if (this.mHx)
    {
      GMTrace.o(9770379509760L, 72795);
      return true;
    }
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if (this.mHp <= 0)
    {
      GMTrace.o(9770379509760L, 72795);
      return false;
    }
    w.d("ShuffleView", "y:%d,packet largest:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(getHeight() - ((View)this.mHb.get(0)).getHeight() - ((View)this.mHb.get(0)).getHeight() / 7) });
    if (k < getHeight() - ((View)this.mHb.get(0)).getHeight() - ((View)this.mHb.get(0)).getHeight() / 7)
    {
      if ((this.mHl != null) && (paramMotionEvent.getActionMasked() == 0))
      {
        if (this.mHi != null) {
          this.mHi.cq(this.mHm, this.mHp);
        }
        aLZ();
      }
      for (;;)
      {
        GMTrace.o(9770379509760L, 72795);
        return false;
        if ((this.mHn != null) && (this.mHn.getTranslationY() == -this.mHn.getHeight() / 7))
        {
          if (this.mHi != null) {
            this.mHi.pP(this.mHp);
          }
          pT(this.mHo);
        }
        else if (this.mHn != null)
        {
          aMa();
        }
      }
    }
    int i = 0;
    if (i < this.mHp)
    {
      Rect localRect = pU(i);
      if ((localRect == null) || (!localRect.contains(j, k))) {}
    }
    for (i = 1;; i = 0)
    {
      if (i == 0)
      {
        w.d("ShuffleView", "event %d out of cards,%d,%d", new Object[] { Integer.valueOf(paramMotionEvent.getActionMasked()), Integer.valueOf(j), Integer.valueOf(k) });
        if ((this.mHl == null) || (paramMotionEvent.getActionMasked() != 0)) {
          break label443;
        }
        if (this.mHi != null) {
          this.mHi.cq(this.mHm, this.mHp);
        }
        aLZ();
      }
      for (;;)
      {
        if (this.mHp > 1) {
          break label518;
        }
        GMTrace.o(9770379509760L, 72795);
        return false;
        i += 1;
        break;
        label443:
        if ((this.mHn != null) && (this.mHn.getTranslationY() == -this.mHn.getHeight() / 7))
        {
          if (this.mHi != null) {
            this.mHi.pP(this.mHp);
          }
          pT(this.mHo);
        }
        else if (this.mHn != null)
        {
          aMa();
        }
      }
      label518:
      boolean bool = this.mHA.onTouchEvent(paramMotionEvent);
      w.i("ShuffleView", "ret:%s,action:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramMotionEvent.getActionMasked()) });
      if ((!bool) && (paramMotionEvent.getActionMasked() == 1))
      {
        if ((this.mHn == null) || (this.mHn.getTranslationY() != -this.mHn.getHeight() / 7)) {
          break label640;
        }
        if (this.mHi != null) {
          this.mHi.pP(this.mHp);
        }
        pT(this.mHo);
      }
      for (;;)
      {
        GMTrace.o(9770379509760L, 72795);
        return true;
        label640:
        if (this.mHn != null) {
          aMa();
        }
      }
    }
  }
  
  public final float pR(int paramInt)
  {
    GMTrace.i(9769574203392L, 72789);
    if ((this.mHc.mHF == 2) && (this.mHp > 0))
    {
      float f1;
      float f2;
      float f3;
      float f4;
      if (this.mHc.mHG == 3)
      {
        f1 = this.mHp - 1;
        f2 = this.mHq;
        f3 = this.mHq;
        f4 = paramInt;
        GMTrace.o(9769574203392L, 72789);
        return f1 * 0.5F * f2 - f3 * f4;
      }
      if (this.mHc.mHG == 4)
      {
        f1 = this.mHq;
        f2 = paramInt;
        f3 = this.mHp - 1;
        f4 = this.mHq;
        GMTrace.o(9769574203392L, 72789);
        return f1 * f2 - f3 * 0.5F * f4;
      }
    }
    GMTrace.o(9769574203392L, 72789);
    return 0.0F;
  }
  
  public final float pS(int paramInt)
  {
    GMTrace.i(9769708421120L, 72790);
    if (this.mHc.mHF == 1)
    {
      float f1;
      float f2;
      float f3;
      float f4;
      if (this.mHc.mHG == 1)
      {
        f1 = this.mHp - 1;
        f2 = this.mHr;
        f3 = this.mHr;
        f4 = paramInt;
        GMTrace.o(9769708421120L, 72790);
        return f1 * 0.5F * f2 - f3 * f4;
      }
      if (this.mHc.mHG == 2)
      {
        f1 = this.mHr;
        f2 = paramInt;
        f3 = this.mHp - 1;
        f4 = this.mHr;
        GMTrace.o(9769708421120L, 72790);
        return f1 * f2 - f3 * 0.5F * f4;
      }
    }
    GMTrace.o(9769708421120L, 72790);
    return 0.0F;
  }
  
  final void pT(int paramInt)
  {
    GMTrace.i(9770111074304L, 72793);
    if ((paramInt >= 0) && (paramInt < this.mHp))
    {
      w.i("ShuffleView", "select card " + paramInt);
      if (this.mHg.isStarted()) {
        this.mHg.cancel();
      }
      this.mHg.removeAllUpdateListeners();
      this.mHg.removeAllListeners();
      this.mHl = ((View)this.mHb.get(paramInt));
      this.mHm = paramInt;
      this.mHn = null;
      this.mHo = -1;
      switch (this.mHc.mHG)
      {
      }
    }
    for (;;)
    {
      this.mHg.start();
      GMTrace.o(9770111074304L, 72793);
      return;
      if (paramInt > 0)
      {
        int i = this.mHp;
        this.mHg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            int i = 0;
            GMTrace.i(9775614001152L, 72834);
            float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
            if (f == 0.0F)
            {
              ShuffleView.b(ShuffleView.this).clear();
              ShuffleView.c(ShuffleView.this).clear();
              while (i < ShuffleView.d(ShuffleView.this))
              {
                ShuffleView.b(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationX()));
                ShuffleView.c(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationY()));
                i += 1;
              }
              GMTrace.o(9775614001152L, 72834);
              return;
            }
            if (this.mHD > 0)
            {
              i = 0;
              while (i < ShuffleView.f(ShuffleView.this) - 1)
              {
                ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + (ShuffleView.this.pR(i) - (i + 1) * ShuffleView.g(ShuffleView.this)) * f);
                ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
                i += 1;
              }
              ((View)ShuffleView.e(ShuffleView.this).get(ShuffleView.f(ShuffleView.this) - 1)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(ShuffleView.f(ShuffleView.this) - 1)).floatValue() * (1.0F - f) + (ShuffleView.this.pR(ShuffleView.f(ShuffleView.this) - 1) - ShuffleView.g(ShuffleView.this) * this.mHD / 2.0F) * f);
              ((View)ShuffleView.e(ShuffleView.this).get(ShuffleView.f(ShuffleView.this) - 1)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(ShuffleView.f(ShuffleView.this) - 1)).floatValue() * (1.0F - f) + ShuffleView.this.pS(ShuffleView.f(ShuffleView.this) - 1) * f);
            }
            while (this.mHE > 0)
            {
              ShuffleView.h(ShuffleView.this).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(ShuffleView.f(ShuffleView.this))).floatValue() * (1.0F - f) + (ShuffleView.this.pR(ShuffleView.f(ShuffleView.this)) + ShuffleView.g(ShuffleView.this) * this.mHE / 2.0F) * f);
              i = ShuffleView.f(ShuffleView.this) + 1;
              while (i < ShuffleView.d(ShuffleView.this))
              {
                ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + (ShuffleView.this.pR(i) + (ShuffleView.d(ShuffleView.this) - i) * ShuffleView.g(ShuffleView.this)) * f);
                ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
                i += 1;
              }
              i = 0;
              while (i < ShuffleView.f(ShuffleView.this))
              {
                ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pR(i) * f);
                ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
                i += 1;
              }
            }
            i = ShuffleView.f(ShuffleView.this);
            while (i < ShuffleView.d(ShuffleView.this))
            {
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pR(i) * f);
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
              i += 1;
            }
            ShuffleView.h(ShuffleView.this).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(ShuffleView.f(ShuffleView.this))).floatValue() * (1.0F - f) - ShuffleView.h(ShuffleView.this).getHeight() * f / 7.0F);
            GMTrace.o(9775614001152L, 72834);
          }
        });
      }
      else
      {
        this.mHg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            int i = 0;
            GMTrace.i(9776419307520L, 72840);
            float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
            if (f == 0.0F)
            {
              ShuffleView.b(ShuffleView.this).clear();
              ShuffleView.c(ShuffleView.this).clear();
              while (i < ShuffleView.d(ShuffleView.this))
              {
                ShuffleView.b(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationX()));
                ShuffleView.c(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationY()));
                i += 1;
              }
              GMTrace.o(9776419307520L, 72840);
              return;
            }
            ShuffleView.h(ShuffleView.this).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(0)).floatValue() * (1.0F - f) - ShuffleView.h(ShuffleView.this).getHeight() * f / 7.0F);
            i = 1;
            while (i < ShuffleView.d(ShuffleView.this))
            {
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pR(i) * f);
              ((View)ShuffleView.e(ShuffleView.this).get(i)).setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f) + ShuffleView.this.pS(i) * f);
              i += 1;
            }
            GMTrace.o(9776419307520L, 72840);
          }
        });
      }
    }
  }
  
  final void pV(final int paramInt)
  {
    GMTrace.i(9770647945216L, 72797);
    this.mHf.removeAllUpdateListeners();
    this.mHf.removeAllListeners();
    if (this.mHb.size() < this.mHp)
    {
      this.mHp -= 1;
      if (this.mHp == 1) {
        ((View)this.mHb.get(0)).findViewById(a.f.syM).setVisibility(0);
      }
      aLX();
      this.mHf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          int i = 0;
          GMTrace.i(9766218760192L, 72764);
          float f1 = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
          if (f1 == 0.0F)
          {
            ShuffleView.b(ShuffleView.this).clear();
            ShuffleView.c(ShuffleView.this).clear();
            while (i < ShuffleView.d(ShuffleView.this))
            {
              ShuffleView.b(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationX()));
              ShuffleView.c(ShuffleView.this).add(Float.valueOf(((View)ShuffleView.e(ShuffleView.this).get(i)).getTranslationY()));
              i += 1;
            }
            GMTrace.o(9766218760192L, 72764);
            return;
          }
          i = 0;
          if (i < ShuffleView.d(ShuffleView.this))
          {
            View localView = (View)ShuffleView.e(ShuffleView.this).get(i);
            float f2;
            float f3;
            if (ShuffleView.l(ShuffleView.this).mHF == 1)
            {
              f2 = ShuffleView.l(ShuffleView.this).mHI;
              f3 = i + 1;
              localView.setScaleX(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(ShuffleView.this).mHI + (1.0F - f2 * f3));
              f2 = ShuffleView.this.pS(i);
              localView.setTranslationY(((Float)ShuffleView.c(ShuffleView.this).get(i)).floatValue() * (1.0F - f1) + f1 * f2);
            }
            for (;;)
            {
              i += 1;
              break;
              if (ShuffleView.l(ShuffleView.this).mHF == 2)
              {
                f2 = ShuffleView.l(ShuffleView.this).mHJ;
                f3 = i + 1;
                localView.setScaleY(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(ShuffleView.this).mHJ + (1.0F - f2 * f3));
                f2 = ShuffleView.this.pR(i);
                localView.setTranslationX(((Float)ShuffleView.b(ShuffleView.this).get(i)).floatValue() * (1.0F - f1) + f1 * f2);
              }
            }
          }
          GMTrace.o(9766218760192L, 72764);
        }
      });
      this.mHf.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9779506315264L, 72863);
          GMTrace.o(9779506315264L, 72863);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9779372097536L, 72862);
          ShuffleView.a(ShuffleView.this, false);
          ShuffleView.a(ShuffleView.this, null);
          ShuffleView.d(ShuffleView.this, -1);
          GMTrace.o(9779372097536L, 72862);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9779640532992L, 72864);
          GMTrace.o(9779640532992L, 72864);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9779237879808L, 72861);
          ShuffleView.a(ShuffleView.this, true);
          GMTrace.o(9779237879808L, 72861);
        }
      });
      this.mHf.start();
      GMTrace.o(9770647945216L, 72797);
      return;
    }
    this.mHk = ((View)this.mHb.get(this.mHp - 1));
    y(this.mHk, this.mHp - 1);
    addView(this.mHk, 0);
    if (this.mHe != null) {
      switch (this.mHc.mHH)
      {
      }
    }
    for (;;)
    {
      this.mHk.setVisibility(4);
      this.mHf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(9782324887552L, 72884);
          int i = paramInt;
          if (i < ShuffleView.d(ShuffleView.this) - 1)
          {
            View localView = (View)ShuffleView.e(ShuffleView.this).get(i);
            float f1;
            float f2;
            if (ShuffleView.l(ShuffleView.this).mHF == 1)
            {
              f1 = ShuffleView.l(ShuffleView.this).mHI;
              f2 = i + 1;
              localView.setScaleX(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(ShuffleView.this).mHI + (1.0F - f1 * f2));
              if (ShuffleView.l(ShuffleView.this).mHG == 2) {
                localView.setTranslationY(ShuffleView.this.pS(i + 1) - ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.s(ShuffleView.this));
              }
            }
            for (;;)
            {
              i += 1;
              break;
              if (ShuffleView.l(ShuffleView.this).mHG == 1)
              {
                f1 = ShuffleView.this.pS(i + 1);
                localView.setTranslationY(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.s(ShuffleView.this) + f1);
                continue;
                if (ShuffleView.l(ShuffleView.this).mHF == 2)
                {
                  f1 = ShuffleView.l(ShuffleView.this).mHJ;
                  f2 = i + 1;
                  localView.setScaleY(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.l(ShuffleView.this).mHJ + (1.0F - f1 * f2));
                  if (ShuffleView.l(ShuffleView.this).mHG == 3)
                  {
                    f1 = ShuffleView.this.pR(i + 1);
                    localView.setTranslationX(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.t(ShuffleView.this) + f1);
                  }
                  else if (ShuffleView.l(ShuffleView.this).mHG == 4)
                  {
                    localView.setTranslationX(ShuffleView.this.pR(i + 1) - ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue() * ShuffleView.t(ShuffleView.this));
                  }
                }
              }
            }
          }
          GMTrace.o(9782324887552L, 72884);
        }
      });
      this.mHf.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9781922234368L, 72881);
          GMTrace.o(9781922234368L, 72881);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9781788016640L, 72880);
          ShuffleView.a(ShuffleView.this, false);
          ShuffleView.u(ShuffleView.this).setVisibility(0);
          if (ShuffleView.v(ShuffleView.this) != null) {
            ShuffleView.v(ShuffleView.this).start();
          }
          GMTrace.o(9781788016640L, 72880);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9782056452096L, 72882);
          GMTrace.o(9782056452096L, 72882);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(9781653798912L, 72879);
          ShuffleView.a(ShuffleView.this, true);
          GMTrace.o(9781653798912L, 72879);
        }
      });
      break;
      this.mHk.setTranslationY(-hjd.heightPixels);
      continue;
      this.mHk.setTranslationY(hjd.heightPixels);
      continue;
      this.mHk.setTranslationX(-hjd.widthPixels);
      continue;
      this.mHk.setTranslationX(hjd.widthPixels);
    }
  }
  
  final void y(View paramView, int paramInt)
  {
    GMTrace.i(9769439985664L, 72788);
    if (this.mHc.mHF == 1)
    {
      paramView.setScaleX(1.0F - this.mHc.mHI * paramInt);
      paramView.setTranslationY(pS(paramInt));
      GMTrace.o(9769439985664L, 72788);
      return;
    }
    if (this.mHc.mHF == 2)
    {
      paramView.setScaleY(1.0F - this.mHc.mHJ * paramInt);
      paramView.setTranslationX(pR(paramInt));
    }
    GMTrace.o(9769439985664L, 72788);
  }
  
  static abstract interface a
  {
    public abstract void a(ValueAnimator paramValueAnimator, View paramView);
  }
  
  static abstract interface b
  {
    public abstract void cp(int paramInt1, int paramInt2);
    
    public abstract void cq(int paramInt1, int paramInt2);
    
    public abstract void pP(int paramInt);
  }
  
  static final class c
  {
    public int mHF;
    public int mHG;
    public int mHH;
    public float mHI;
    public float mHJ;
    public int mHK;
    public int mHL;
    
    c()
    {
      GMTrace.i(9765279236096L, 72757);
      this.mHF = 1;
      this.mHG = 1;
      this.mHH = 2;
      this.mHI = 0.01F;
      this.mHJ = 0.01F;
      this.mHK = 200;
      this.mHL = 80;
      GMTrace.o(9765279236096L, 72757);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\f2f\ui\ShuffleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */