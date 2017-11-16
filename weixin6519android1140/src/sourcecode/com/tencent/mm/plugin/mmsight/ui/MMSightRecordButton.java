package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.u.a.b;
import com.tencent.mm.plugin.u.a.c;
import com.tencent.mm.plugin.u.a.d;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;

public class MMSightRecordButton
  extends FrameLayout
{
  private static final float ngY;
  private static final int vU;
  private boolean eDU;
  private ae ghS;
  private float jqu;
  private long ngZ;
  private View nha;
  private View nhb;
  View nhc;
  MMSightCircularProgressBar nhd;
  private boolean nhe;
  private boolean nhf;
  private boolean nhg;
  private ViewPropertyAnimator nhh;
  private ViewPropertyAnimator nhi;
  private ViewPropertyAnimator nhj;
  private ViewPropertyAnimator nhk;
  private boolean nhl;
  d nhm;
  b nhn;
  c nho;
  a nhp;
  private Drawable nhq;
  private Drawable nhr;
  private boolean nhs;
  private boolean nht;
  private Runnable nhu;
  private Runnable nhv;
  
  static
  {
    GMTrace.i(7383854088192L, 55014);
    vU = ViewConfiguration.getTapTimeout();
    ngY = ab.getContext().getResources().getDimensionPixelSize(a.b.nkr) / ab.getContext().getResources().getDimensionPixelSize(a.b.nkq);
    GMTrace.o(7383854088192L, 55014);
  }
  
  public MMSightRecordButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7380901298176L, 54992);
    this.ngZ = -1L;
    this.nhe = false;
    this.nhf = false;
    this.nhg = false;
    this.nhl = false;
    this.jqu = -1.0F;
    this.eDU = true;
    this.nhs = false;
    this.nht = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.nhu = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7420898181120L, 55290);
        w.i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.a(MMSightRecordButton.this)), Boolean.valueOf(MMSightRecordButton.b(MMSightRecordButton.this)) });
        if (!MMSightRecordButton.a(MMSightRecordButton.this))
        {
          MMSightRecordButton.c(MMSightRecordButton.this);
          if (MMSightRecordButton.d(MMSightRecordButton.this) != null) {
            MMSightRecordButton.d(MMSightRecordButton.this).aQt();
          }
        }
        GMTrace.o(7420898181120L, 55290);
      }
    };
    this.nhv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7421435052032L, 55294);
        w.i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.e(MMSightRecordButton.this)) });
        if (MMSightRecordButton.e(MMSightRecordButton.this)) {
          MMSightRecordButton.f(MMSightRecordButton.this);
        }
        GMTrace.o(7421435052032L, 55294);
      }
    };
    init();
    GMTrace.o(7380901298176L, 54992);
  }
  
  public MMSightRecordButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7381035515904L, 54993);
    this.ngZ = -1L;
    this.nhe = false;
    this.nhf = false;
    this.nhg = false;
    this.nhl = false;
    this.jqu = -1.0F;
    this.eDU = true;
    this.nhs = false;
    this.nht = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.nhu = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7420898181120L, 55290);
        w.i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.a(MMSightRecordButton.this)), Boolean.valueOf(MMSightRecordButton.b(MMSightRecordButton.this)) });
        if (!MMSightRecordButton.a(MMSightRecordButton.this))
        {
          MMSightRecordButton.c(MMSightRecordButton.this);
          if (MMSightRecordButton.d(MMSightRecordButton.this) != null) {
            MMSightRecordButton.d(MMSightRecordButton.this).aQt();
          }
        }
        GMTrace.o(7420898181120L, 55290);
      }
    };
    this.nhv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7421435052032L, 55294);
        w.i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.e(MMSightRecordButton.this)) });
        if (MMSightRecordButton.e(MMSightRecordButton.this)) {
          MMSightRecordButton.f(MMSightRecordButton.this);
        }
        GMTrace.o(7421435052032L, 55294);
      }
    };
    init();
    GMTrace.o(7381035515904L, 54993);
  }
  
  private void a(final AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    GMTrace.i(7381572386816L, 54997);
    this.nhg = true;
    if (this.nhj != null)
    {
      this.nhj.cancel();
      this.nhj = null;
    }
    this.nhj = this.nha.animate().scaleX(1.0F).scaleY(1.0F);
    this.nhj.setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(7419287568384L, 55278);
        MMSightRecordButton.a(MMSightRecordButton.this, false);
        if (paramAnimatorListenerAdapter != null) {
          paramAnimatorListenerAdapter.onAnimationEnd(paramAnonymousAnimator);
        }
        GMTrace.o(7419287568384L, 55278);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(7419153350656L, 55277);
        MMSightRecordButton.a(MMSightRecordButton.this, true);
        if (paramAnimatorListenerAdapter != null) {
          paramAnimatorListenerAdapter.onAnimationStart(paramAnonymousAnimator);
        }
        GMTrace.o(7419153350656L, 55277);
      }
    }).setDuration(150L).start();
    if (this.nhk != null)
    {
      this.nhk.cancel();
      this.nhk = null;
    }
    this.nhk = this.nhb.animate().scaleX(1.0F).scaleY(1.0F);
    this.nhk.setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(7391236063232L, 55069);
        MMSightRecordButton.a(MMSightRecordButton.this, false);
        if (paramAnimatorListenerAdapter != null) {
          paramAnimatorListenerAdapter.onAnimationEnd(paramAnonymousAnimator);
        }
        GMTrace.o(7391236063232L, 55069);
      }
      
      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
        GMTrace.i(7391101845504L, 55068);
        MMSightRecordButton.a(MMSightRecordButton.this, true);
        if (paramAnimatorListenerAdapter != null) {
          paramAnimatorListenerAdapter.onAnimationStart(paramAnonymousAnimator);
        }
        GMTrace.o(7391101845504L, 55068);
      }
    }).setDuration(150L).start();
    GMTrace.o(7381572386816L, 54997);
  }
  
  private void init()
  {
    GMTrace.i(7381169733632L, 54994);
    w.i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", new Object[] { Integer.valueOf(500), Integer.valueOf(vU) });
    this.nhq = getContext().getResources().getDrawable(a.c.nku);
    this.nhr = getContext().getResources().getDrawable(a.c.nkv);
    v.fb(getContext()).inflate(a.e.nlc, this, true);
    this.nha = findViewById(a.d.nkH);
    this.nhb = findViewById(a.d.nkJ);
    this.nhc = findViewById(a.d.bUv);
    this.nhd = ((MMSightCircularProgressBar)findViewById(a.d.nkx));
    this.nha.setBackgroundDrawable(this.nhq);
    this.nhb.setBackgroundDrawable(this.nhr);
    this.eDU = true;
    GMTrace.o(7381169733632L, 54994);
  }
  
  public final void aQq()
  {
    GMTrace.i(7381438169088L, 54996);
    MMSightCircularProgressBar localMMSightCircularProgressBar = this.nhd;
    localMMSightCircularProgressBar.ngU = null;
    localMMSightCircularProgressBar.ngQ = 0;
    localMMSightCircularProgressBar.ngR = 0;
    localMMSightCircularProgressBar.duration = 0;
    localMMSightCircularProgressBar.isStart = false;
    if (localMMSightCircularProgressBar.ngT != null)
    {
      b localb = localMMSightCircularProgressBar.ngT;
      localb.isStart = false;
      localb.nig = 0L;
      localMMSightCircularProgressBar.ngT = null;
    }
    this.nhd.setVisibility(8);
    GMTrace.o(7381438169088L, 54996);
  }
  
  public final void gc(boolean paramBoolean)
  {
    GMTrace.i(7381303951360L, 54995);
    w.i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.eDU = paramBoolean;
    GMTrace.o(7381303951360L, 54995);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(7381975040000L, 55000);
    if (!this.eDU)
    {
      w.i("MicroMsg.MMSightRecordButton", "onTouchEvent, not enable, ignore");
      GMTrace.o(7381975040000L, 55000);
      return true;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(7381975040000L, 55000);
      return true;
      this.nhl = true;
      this.ngZ = System.currentTimeMillis();
      this.nhe = false;
      this.nhf = false;
      this.jqu = paramMotionEvent.getRawY();
      if (this.nhn != null) {
        this.nhn.aQs();
      }
      this.ghS.postDelayed(this.nhu, 550L);
      this.ghS.postDelayed(this.nhv, 250L);
      this.nht = true;
      this.nhs = true;
      continue;
      w.d("MicroMsg.MMSightRecordButton", "move, x: %s, y: %s, top: %s", new Object[] { Float.valueOf(paramMotionEvent.getRawX()), Float.valueOf(paramMotionEvent.getRawY()), Integer.valueOf(getTop()) });
      float f1 = paramMotionEvent.getRawY();
      if ((f1 < getTop()) && (this.nhf)) {
        if (this.jqu <= 0.0F)
        {
          this.jqu = paramMotionEvent.getRawY();
        }
        else
        {
          float f2 = Math.abs(f1 - this.jqu);
          int i;
          if ((f1 < this.jqu) && (f2 >= 10.0F))
          {
            i = (int)(f2 / 10.0F);
            w.d("MicroMsg.MMSightRecordButton", "onScroll Up, factor: %s, isFirstScrollUp: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.nhs) });
            i = Math.min(i, 3);
            if (this.nho != null)
            {
              paramMotionEvent = this.nho;
              if (this.nhs) {
                i = 1;
              }
              paramMotionEvent.qU(i);
            }
            this.jqu = f1;
            this.nhs = false;
          }
          else if ((f1 > this.jqu) && (f2 >= 10.0F))
          {
            i = (int)(f2 / 10.0F);
            w.d("MicroMsg.MMSightRecordButton", "onScroll Down, factor: %s, isFirstScrollDown: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.nht) });
            i = Math.min(i, 3);
            if (this.nho != null)
            {
              paramMotionEvent = this.nho;
              if (this.nht) {
                i = 1;
              }
              paramMotionEvent.qV(i);
            }
            this.nht = false;
            this.jqu = f1;
            continue;
            this.nhl = false;
            this.ghS.removeCallbacks(this.nhv, Integer.valueOf(vU));
            this.ghS.removeCallbacks(this.nhu);
            if ((this.nhh != null) && (this.nhi != null))
            {
              this.nhh.cancel();
              this.nhi.cancel();
            }
            final long l = System.currentTimeMillis() - this.ngZ;
            w.i("MicroMsg.MMSightRecordButton", "onAction Up/Cancel, isDispatchLongPress: %s, isDispatchSimpleTap: %s, pressDownTime: %s, upTimeDiff: %s", new Object[] { Boolean.valueOf(this.nhf), Boolean.valueOf(this.nhe), Long.valueOf(this.ngZ), Long.valueOf(l) });
            aQq();
            a(new AnimatorListenerAdapter()
            {
              public final void onAnimationEnd(Animator paramAnonymousAnimator)
              {
                GMTrace.i(7405731577856L, 55177);
                if ((MMSightRecordButton.g(MMSightRecordButton.this) > 0L) && (l <= 500L))
                {
                  w.i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.a(MMSightRecordButton.this)), Boolean.valueOf(MMSightRecordButton.b(MMSightRecordButton.this)) });
                  MMSightRecordButton.h(MMSightRecordButton.this);
                  if ((!MMSightRecordButton.b(MMSightRecordButton.this)) && (MMSightRecordButton.i(MMSightRecordButton.this) != null))
                  {
                    MMSightRecordButton.i(MMSightRecordButton.this).aQv();
                    GMTrace.o(7405731577856L, 55177);
                  }
                }
                else if (MMSightRecordButton.b(MMSightRecordButton.this))
                {
                  w.i("MicroMsg.MMSightRecordButton", "on Long Press finish");
                  if (MMSightRecordButton.d(MMSightRecordButton.this) != null)
                  {
                    MMSightRecordButton.d(MMSightRecordButton.this).aQu();
                    GMTrace.o(7405731577856L, 55177);
                  }
                }
                else
                {
                  w.i("MicroMsg.MMSightRecordButton", "error action up");
                  if (MMSightRecordButton.j(MMSightRecordButton.this) != null) {
                    MMSightRecordButton.j(MMSightRecordButton.this).aQr();
                  }
                }
                GMTrace.o(7405731577856L, 55177);
              }
            });
          }
        }
      }
    }
  }
  
  public final void reset()
  {
    GMTrace.i(7381840822272L, 54999);
    setClipChildren(false);
    this.eDU = true;
    this.nha.setScaleX(1.0F);
    this.nha.setScaleY(1.0F);
    this.nhb.setScaleX(1.0F);
    this.nhb.setScaleY(1.0F);
    this.nhc.setVisibility(8);
    aQq();
    GMTrace.o(7381840822272L, 54999);
  }
  
  public void setVisibility(final int paramInt)
  {
    GMTrace.i(7381706604544L, 54998);
    w.i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", new Object[] { Boolean.valueOf(this.nhg) });
    if (this.nhg)
    {
      postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7387746402304L, 55043);
          MMSightRecordButton.a(MMSightRecordButton.this, paramInt);
          GMTrace.o(7387746402304L, 55043);
        }
      }, 150L);
      GMTrace.o(7381706604544L, 54998);
      return;
    }
    super.setVisibility(paramInt);
    GMTrace.o(7381706604544L, 54998);
  }
  
  public static abstract interface a
  {
    public abstract void aQr();
  }
  
  public static abstract interface b
  {
    public abstract void aQs();
    
    public abstract void aQt();
    
    public abstract void aQu();
  }
  
  public static abstract interface c
  {
    public abstract void qU(int paramInt);
    
    public abstract void qV(int paramInt);
  }
  
  public static abstract interface d
  {
    public abstract void aQv();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\MMSightRecordButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */