package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.concurrent.TimeUnit;

public final class g
  extends FrameLayout
  implements View.OnClickListener
{
  private static final long iJB;
  public int iJA;
  private final Runnable iJC;
  private ImageView iJD;
  public ViewPropertyAnimator iJE;
  private ViewPropertyAnimator iJF;
  public TextView iJn;
  private final ae mHandler;
  
  static
  {
    GMTrace.i(17277177036800L, 128725);
    iJB = TimeUnit.SECONDS.toMillis(4L);
    GMTrace.o(17277177036800L, 128725);
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17275969077248L, 128716);
    this.iJA = a.iJI;
    this.iJC = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18246094815232L, 135944);
        g.this.dismiss();
        GMTrace.o(18246094815232L, 135944);
      }
    };
    this.mHandler = new ae(Looper.getMainLooper());
    LayoutInflater.from(paramContext).inflate(o.g.hCY, this);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    paramContext = (ImageView)findViewById(o.f.hBs);
    this.iJD = paramContext;
    paramContext.setOnClickListener(this);
    this.iJn = ((TextView)findViewById(o.f.message));
    setOnClickListener(this);
    GMTrace.o(17275969077248L, 128716);
  }
  
  public final void dismiss()
  {
    GMTrace.i(17276103294976L, 128717);
    if ((getTranslationY() == -getHeight()) || (this.iJF != null))
    {
      GMTrace.o(17276103294976L, 128717);
      return;
    }
    this.iJA = a.iJH;
    this.mHandler.removeCallbacks(this.iJC);
    this.iJF = animate().translationY(-getHeight());
    this.iJF.setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(17274626899968L, 128706);
        g.d(g.this);
        g.this.setVisibility(8);
        g.a(g.this, g.a.iJI);
        GMTrace.o(17274626899968L, 128706);
      }
    });
    this.iJF.start();
    GMTrace.o(17276103294976L, 128717);
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(17633256669184L, 131378);
    super.onAttachedToWindow();
    if (a.iJI == this.iJA) {
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18247168557056L, 135952);
          g.this.setTranslationY(-g.this.getHeight());
          g.e(g.this);
          g.this.setVisibility(8);
          GMTrace.o(18247168557056L, 135952);
        }
      });
    }
    GMTrace.o(17633256669184L, 131378);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(17276237512704L, 128718);
    if (paramView.getId() == o.f.hBs) {
      dismiss();
    }
    GMTrace.o(17276237512704L, 128718);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(17633390886912L, 131379);
    super.onDetachedFromWindow();
    if (a.iJH == this.iJA)
    {
      setTranslationY(-getHeight());
      setVisibility(8);
      this.iJA = a.iJI;
    }
    GMTrace.o(17633390886912L, 131379);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(17632048709632L, 131369);
      iJH = 1;
      iJI = 2;
      iJJ = 3;
      iJK = 4;
      iJL = new int[] { iJH, iJI, iJJ, iJK };
      GMTrace.o(17632048709632L, 131369);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */