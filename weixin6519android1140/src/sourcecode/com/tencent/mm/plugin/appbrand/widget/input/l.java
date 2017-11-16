package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v4.view.z;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.d.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.WeakHashMap;

@SuppressLint({"ViewConstructor"})
public final class l
  extends FrameLayout
{
  private static final int iMf;
  private View iMg;
  private View iMh;
  int iMi;
  private final int[] iMj;
  a iMk;
  private WeakHashMap<View, a> iMl;
  private Runnable iMm;
  
  static
  {
    GMTrace.i(10092099403776L, 75192);
    iMf = o.f.hBo;
    GMTrace.o(10092099403776L, 75192);
  }
  
  public l(Context paramContext, View paramView)
  {
    super(paramContext);
    GMTrace.i(10090086137856L, 75177);
    this.iMi = -1;
    this.iMj = new int[2];
    this.iMl = new WeakHashMap();
    this.iMm = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15419603681280L, 114885);
        if (l.a(l.this) == null)
        {
          GMTrace.o(15419603681280L, 114885);
          return;
        }
        int i = 0;
        while (i < l.this.getChildCount())
        {
          View localView = l.this.getChildAt(i);
          if ((localView != null) && (localView != l.b(l.this)) && (localView != l.a(l.this))) {
            l.bS(localView);
          }
          i += 1;
        }
        GMTrace.o(15419603681280L, 114885);
      }
    };
    super.setId(iMf);
    this.iMh = paramView;
    super.addView(paramView);
    GMTrace.o(10090086137856L, 75177);
  }
  
  public static l bQ(View paramView)
  {
    GMTrace.i(10089951920128L, 75176);
    paramView = (l)paramView.getRootView().findViewById(iMf);
    GMTrace.o(10089951920128L, 75176);
    return paramView;
  }
  
  public final void addView(View paramView)
  {
    GMTrace.i(10090757226496L, 75182);
    if ((paramView == this.iMh) || (paramView == this.iMg)) {
      super.addView(paramView);
    }
    GMTrace.o(10090757226496L, 75182);
  }
  
  public final void addView(View paramView, int paramInt)
  {
    GMTrace.i(10090891444224L, 75183);
    if ((paramView == this.iMh) || (paramView == this.iMg)) {
      super.addView(paramView, paramInt);
    }
    GMTrace.o(10090891444224L, 75183);
  }
  
  public final void addView(View paramView, int paramInt1, int paramInt2)
  {
    GMTrace.i(10091025661952L, 75184);
    if ((paramView == this.iMh) || (paramView == this.iMg)) {
      super.addView(paramView, paramInt1, paramInt2);
    }
    GMTrace.o(10091025661952L, 75184);
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(10091294097408L, 75186);
    if ((paramView == this.iMh) || (paramView == this.iMg)) {
      super.addView(paramView, paramInt, paramLayoutParams);
    }
    GMTrace.o(10091294097408L, 75186);
  }
  
  public final void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(10091159879680L, 75185);
    if ((paramView == this.iMh) || (paramView == this.iMg)) {
      super.addView(paramView, paramLayoutParams);
    }
    GMTrace.o(10091159879680L, 75185);
  }
  
  protected final boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(10091428315136L, 75187);
    GMTrace.o(10091428315136L, 75187);
    return false;
  }
  
  protected final boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    GMTrace.i(10091562532864L, 75188);
    GMTrace.o(10091562532864L, 75188);
    return false;
  }
  
  public final void bR(View paramView)
  {
    GMTrace.i(10091830968320L, 75190);
    g(paramView, false);
    GMTrace.o(10091830968320L, 75190);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(10090354573312L, 75179);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
    {
      if ((this.iMg != null) && (this.iMg.isShown()))
      {
        this.iMg.setVisibility(8);
        GMTrace.o(10090354573312L, 75179);
        return true;
      }
      Activity localActivity = g.bR(getContext());
      if ((MMActivity.class.isInstance(localActivity)) && (((MMActivity)localActivity).vKB.avJ()))
      {
        GMTrace.o(10090354573312L, 75179);
        return true;
      }
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(10090354573312L, 75179);
    return bool;
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10090488791040L, 75180);
    a locala = (a)this.iMl.get(this.iMg);
    if ((locala != null) && (locala.iMo) && (this.iMg != null) && (this.iMg.isShown()) && (paramMotionEvent.getAction() == 0))
    {
      float f1 = paramMotionEvent.getRawY();
      this.iMg.getLocationOnScreen(this.iMj);
      float f2 = this.iMj[1];
      float f3 = this.iMg.getHeight();
      if ((f1 < f2) || (f1 > f3 + f2))
      {
        this.iMg.setVisibility(8);
        GMTrace.o(10090488791040L, 75180);
        return true;
      }
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(10090488791040L, 75180);
    return bool;
  }
  
  public final void g(View paramView, boolean paramBoolean)
  {
    GMTrace.i(10091696750592L, 75189);
    if (this.iMg != null)
    {
      this.iMg.setVisibility(8);
      this.iMg = null;
    }
    if (this != paramView.getParent())
    {
      if (paramView.getParent() != null) {
        ((ViewGroup)paramView.getParent()).removeView(paramView);
      }
      this.iMg = paramView;
      Object localObject = new FrameLayout.LayoutParams(-1, -2);
      ((FrameLayout.LayoutParams)localObject).gravity = 80;
      super.addView(paramView, (ViewGroup.LayoutParams)localObject);
      localObject = new a();
      ((a)localObject).iMo = paramBoolean;
      this.iMl.put(paramView, localObject);
    }
    GMTrace.o(10091696750592L, 75189);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10091965186048L, 75191);
    int k = 0;
    int j;
    for (int i = 0; k < getChildCount(); i = j)
    {
      View localView = getChildAt(k);
      j = i;
      if (localView != null)
      {
        j = i;
        if (localView != this.iMh)
        {
          a locala = (a)this.iMl.get(localView);
          j = i;
          if (locala != null)
          {
            j = i;
            if (z.aj(this))
            {
              j = i;
              if (i == 0)
              {
                j = i;
                if (locala.iMp != 0)
                {
                  j = i;
                  if (localView.getVisibility() == 0)
                  {
                    this.iMg = localView;
                    j = 1;
                    post(this.iMm);
                  }
                }
              }
            }
            locala.iMp = localView.getVisibility();
          }
        }
      }
      k += 1;
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.iMk != null) {
      this.iMk.bT(this);
    }
    GMTrace.o(10091965186048L, 75191);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10090220355584L, 75178);
    if (this.iMi > 0) {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(this.iMi, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(10090220355584L, 75178);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(10090623008768L, 75181);
    GMTrace.o(10090623008768L, 75181);
  }
  
  private static final class a
  {
    boolean iMo;
    int iMp;
    
    public a()
    {
      GMTrace.i(15430609534976L, 114967);
      this.iMp = 8;
      GMTrace.o(15430609534976L, 114967);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */