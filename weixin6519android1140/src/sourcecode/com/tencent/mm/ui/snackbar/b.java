package com.tencent.mm.ui.snackbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.Queue;

public final class b
{
  public ae mHandler;
  View mParentView;
  public SnackContainer xeD;
  public b xeE;
  c xeF;
  private final View.OnClickListener xeG;
  
  public b(Activity paramActivity, int paramInt)
  {
    GMTrace.i(2863937880064L, 21338);
    this.mHandler = new ae();
    this.xeG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2863401009152L, 21334);
        if ((b.this.xeE != null) && (b.this.xeD.isShowing())) {
          b.this.xeE.aEW();
        }
        b.this.mHandler.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2868501282816L, 21372);
            b.this.xeD.hide();
            GMTrace.o(2868501282816L, 21372);
          }
        }, 100L);
        GMTrace.o(2863401009152L, 21334);
      }
    };
    Object localObject2 = ((ViewGroup)paramActivity.findViewById(16908290)).getChildAt(0);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = paramActivity.findViewById(16908290);
    }
    localObject2 = (LayoutInflater)paramActivity.getSystemService("layout_inflater");
    ((LayoutInflater)localObject2).inflate(a.h.gfP, (ViewGroup)localObject1);
    localObject2 = ((LayoutInflater)localObject2).inflate(a.h.gfQ, (ViewGroup)localObject1, false);
    a((ViewGroup)localObject1, (View)localObject2, paramInt, paramActivity);
    GMTrace.o(2863937880064L, 21338);
  }
  
  public b(Context paramContext, View paramView, int paramInt)
  {
    GMTrace.i(2864072097792L, 21339);
    this.mHandler = new ae();
    this.xeG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2863401009152L, 21334);
        if ((b.this.xeE != null) && (b.this.xeD.isShowing())) {
          b.this.xeE.aEW();
        }
        b.this.mHandler.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2868501282816L, 21372);
            b.this.xeD.hide();
            GMTrace.o(2868501282816L, 21372);
          }
        }, 100L);
        GMTrace.o(2863401009152L, 21334);
      }
    };
    Object localObject = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    ((LayoutInflater)localObject).inflate(a.h.gfP, (ViewGroup)paramView);
    localObject = ((LayoutInflater)localObject).inflate(a.h.gfQ, (ViewGroup)paramView, false);
    a((ViewGroup)paramView, (View)localObject, paramInt, paramContext);
    GMTrace.o(2864072097792L, 21339);
  }
  
  private void a(ViewGroup paramViewGroup, View paramView, int paramInt, Context paramContext)
  {
    GMTrace.i(2864206315520L, 21340);
    this.xeD = ((SnackContainer)paramViewGroup.findViewById(a.g.gdZ));
    if (this.xeD == null) {
      this.xeD = new SnackContainer(paramViewGroup);
    }
    this.mParentView = paramView;
    if (paramInt == 36) {
      this.xeD.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(2869709242368L, 21381);
          if ((a.awP()) && (b.this.xeD.isShowing()))
          {
            a.mw(false);
            b.this.mHandler.postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2865414275072L, 21349);
                b.this.xeD.hide();
                GMTrace.o(2865414275072L, 21349);
              }
            }, 100L);
          }
          GMTrace.o(2869709242368L, 21381);
          return true;
        }
      });
    }
    ((TextView)paramView.findViewById(a.g.gdY)).setOnClickListener(this.xeG);
    boolean bool2 = ad.fe(paramContext);
    paramInt = ad.fd(paramContext);
    w.i("MicroMsg.SnackBar", "snackbar:isNavBarVisibility : %B,navBarHeightd:%d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(paramInt) });
    paramViewGroup = (Activity)paramContext;
    if (d.et(19))
    {
      paramViewGroup = paramViewGroup.getWindow().getAttributes();
      if (paramViewGroup.flags != (paramViewGroup.flags & 0xF7FFFFFF | 0x8000000)) {}
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      w.i("MicroMsg.SnackBar", "snackbar:isNavBarTranslucent : %B", new Object[] { Boolean.valueOf(bool1) });
      if ((bool1) && (bool2))
      {
        paramViewGroup = (LinearLayout)paramView.findViewById(a.g.gdX);
        paramView = (ViewGroup.MarginLayoutParams)paramViewGroup.getLayoutParams();
        paramView.bottomMargin = paramInt;
        paramViewGroup.setLayoutParams(paramView);
      }
      GMTrace.o(2864206315520L, 21340);
      return;
    }
  }
  
  public static final class a
  {
    private Context mContext;
    String mMessage;
    private Parcelable xeA;
    private short xeB;
    b xeK;
    int xeL;
    String xey;
    private int xez;
    private int xj;
    
    public a(Activity paramActivity)
    {
      GMTrace.i(2860582436864L, 21313);
      this.xez = 0;
      this.xeB = 3500;
      this.xj = -1;
      this.xeL = 0;
      this.mContext = paramActivity.getApplicationContext();
      this.xeK = new b(paramActivity, this.xeL);
      GMTrace.o(2860582436864L, 21313);
    }
    
    public a(Context paramContext, View paramView)
    {
      GMTrace.i(2860716654592L, 21314);
      this.xez = 0;
      this.xeB = 3500;
      this.xj = -1;
      this.xeL = 0;
      this.mContext = paramContext;
      this.xeK = new b(paramContext, paramView, this.xeL);
      GMTrace.o(2860716654592L, 21314);
    }
    
    public final a a(Short paramShort)
    {
      GMTrace.i(2860850872320L, 21315);
      this.xeB = paramShort.shortValue();
      GMTrace.o(2860850872320L, 21315);
      return this;
    }
    
    public final b chS()
    {
      GMTrace.i(2861119307776L, 21317);
      Object localObject2 = this.mMessage;
      Object localObject1;
      int j;
      Object localObject3;
      short s;
      if (this.xey != null)
      {
        localObject1 = this.xey.toUpperCase();
        j = this.xez;
        localObject3 = this.xeA;
        s = this.xeB;
        if (this.xj == -1) {
          break label210;
        }
      }
      label210:
      for (int i = this.xj;; i = this.mContext.getResources().getColor(a.d.aPp))
      {
        localObject2 = new Snack((String)localObject2, (String)localObject1, j, (Parcelable)localObject3, s, i);
        Object localObject4 = this.xeK;
        localObject1 = ((b)localObject4).xeD;
        localObject3 = ((b)localObject4).mParentView;
        localObject4 = ((b)localObject4).xeF;
        if ((((View)localObject3).getParent() != null) && (((View)localObject3).getParent() != localObject1)) {
          ((ViewGroup)((View)localObject3).getParent()).removeView((View)localObject3);
        }
        localObject2 = new SnackContainer.a((Snack)localObject2, (View)localObject3, (b.c)localObject4);
        ((SnackContainer)localObject1).xeM.offer(localObject2);
        if (((SnackContainer)localObject1).xeM.size() == 1) {
          ((SnackContainer)localObject1).a((SnackContainer.a)localObject2, false);
        }
        localObject1 = this.xeK;
        GMTrace.o(2861119307776L, 21317);
        return (b)localObject1;
        localObject1 = null;
        break;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void aEW();
  }
  
  public static abstract interface c
  {
    public abstract void aDT();
    
    public abstract void onHide();
    
    public abstract void onShow();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\snackbar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */