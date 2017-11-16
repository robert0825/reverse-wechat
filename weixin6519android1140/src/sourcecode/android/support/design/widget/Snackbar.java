package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.a.a;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.design.a.i;
import android.support.v4.view.ai;
import android.support.v4.view.an;
import android.support.v4.view.z;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class Snackbar
{
  public static final Handler iw = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        return false;
      case 0: 
        paramAnonymousMessage = (Snackbar)paramAnonymousMessage.obj;
        if (paramAnonymousMessage.iy.getParent() == null)
        {
          localObject = paramAnonymousMessage.iy.getLayoutParams();
          if ((localObject instanceof CoordinatorLayout.d))
          {
            Snackbar.a locala = new Snackbar.a(paramAnonymousMessage);
            locala.iY = s.l(0.1F);
            locala.iZ = s.l(0.6F);
            locala.iW = 0;
            locala.iT = new Snackbar.3(paramAnonymousMessage);
            ((CoordinatorLayout.d)localObject).a(locala);
          }
          paramAnonymousMessage.ix.addView(paramAnonymousMessage.iy);
        }
        paramAnonymousMessage.iy.iH = new Snackbar.4(paramAnonymousMessage);
        if (z.aj(paramAnonymousMessage.iy)) {
          if (paramAnonymousMessage.aj()) {
            paramAnonymousMessage.ag();
          }
        }
        for (;;)
        {
          return true;
          paramAnonymousMessage.ah();
          continue;
          paramAnonymousMessage.iy.iG = new Snackbar.5(paramAnonymousMessage);
        }
      }
      Object localObject = (Snackbar)paramAnonymousMessage.obj;
      int i = paramAnonymousMessage.arg1;
      if ((((Snackbar)localObject).aj()) && (((Snackbar)localObject).iy.getVisibility() == 0)) {
        if (Build.VERSION.SDK_INT >= 14) {
          z.V(((Snackbar)localObject).iy).r(((Snackbar)localObject).iy.getHeight()).b(a.dI).d(250L).a(new Snackbar.8((Snackbar)localObject, i)).start();
        }
      }
      for (;;)
      {
        return true;
        paramAnonymousMessage = AnimationUtils.loadAnimation(((Snackbar)localObject).iy.getContext(), a.a.Y);
        paramAnonymousMessage.setInterpolator(a.dI);
        paramAnonymousMessage.setDuration(250L);
        paramAnonymousMessage.setAnimationListener(new Snackbar.2((Snackbar)localObject, i));
        ((Snackbar)localObject).iy.startAnimation(paramAnonymousMessage);
        continue;
        ((Snackbar)localObject).ai();
      }
    }
  });
  public final q.a iA;
  final ViewGroup ix;
  public final SnackbarLayout iy;
  private final AccessibilityManager iz;
  
  public final void ag()
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      z.c(this.iy, this.iy.getHeight());
      z.V(this.iy).r(0.0F).b(a.dI).d(250L).a(new an()
      {
        public final void p(View paramAnonymousView)
        {
          paramAnonymousView = Snackbar.this.iy;
          z.d(paramAnonymousView.iD, 0.0F);
          z.V(paramAnonymousView.iD).p(1.0F).d(180L).e(70L).start();
          if (paramAnonymousView.iE.getVisibility() == 0)
          {
            z.d(paramAnonymousView.iE, 0.0F);
            z.V(paramAnonymousView.iE).p(1.0F).d(180L).e(70L).start();
          }
        }
        
        public final void q(View paramAnonymousView)
        {
          Snackbar.this.ah();
        }
      }).start();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.iy.getContext(), a.a.X);
    localAnimation.setInterpolator(a.dI);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        Snackbar.this.ah();
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public final void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    this.iy.startAnimation(localAnimation);
  }
  
  public final void ah()
  {
    q localq = q.am();
    q.a locala = this.iA;
    synchronized (localq.mLock)
    {
      if (localq.d(locala)) {
        localq.b(localq.iJ);
      }
      return;
    }
  }
  
  public final void ai()
  {
    q localq = q.am();
    q.a locala = this.iA;
    synchronized (localq.mLock)
    {
      if (localq.d(locala))
      {
        localq.iJ = null;
        if ((localq.iK != null) && (localq.iK != null))
        {
          localq.iJ = localq.iK;
          localq.iK = null;
          if ((q.a)localq.iJ.iM.get() == null) {
            localq.iJ = null;
          }
        }
      }
      ??? = this.iy.getParent();
      if ((??? instanceof ViewGroup)) {
        ((ViewGroup)???).removeView(this.iy);
      }
      return;
    }
  }
  
  public final boolean aj()
  {
    return !this.iz.isEnabled();
  }
  
  public static class SnackbarLayout
    extends LinearLayout
  {
    TextView iD;
    Button iE;
    private int iF;
    b iG;
    a iH;
    private int ia;
    
    public SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.cl);
      this.ia = paramAttributeSet.getDimensionPixelSize(a.i.cm, -1);
      this.iF = paramAttributeSet.getDimensionPixelSize(a.i.co, -1);
      if (paramAttributeSet.hasValue(a.i.cn)) {
        z.g(this, paramAttributeSet.getDimensionPixelSize(a.i.cn, 0));
      }
      paramAttributeSet.recycle();
      setClickable(true);
      LayoutInflater.from(paramContext).inflate(a.f.aA, this);
      z.O(this);
      z.i(this, 1);
    }
    
    private boolean c(int paramInt1, int paramInt2, int paramInt3)
    {
      boolean bool = false;
      if (paramInt1 != getOrientation())
      {
        setOrientation(paramInt1);
        bool = true;
      }
      TextView localTextView;
      if ((this.iD.getPaddingTop() != paramInt2) || (this.iD.getPaddingBottom() != paramInt3))
      {
        localTextView = this.iD;
        if (!z.ae(localTextView)) {
          break label78;
        }
        z.c(localTextView, z.P(localTextView), paramInt2, z.Q(localTextView), paramInt3);
      }
      for (;;)
      {
        bool = true;
        return bool;
        label78:
        localTextView.setPadding(localTextView.getPaddingLeft(), paramInt2, localTextView.getPaddingRight(), paramInt3);
      }
    }
    
    protected void onAttachedToWindow()
    {
      super.onAttachedToWindow();
    }
    
    protected void onDetachedFromWindow()
    {
      super.onDetachedFromWindow();
      if (this.iH != null) {
        this.iH.ak();
      }
    }
    
    protected void onFinishInflate()
    {
      super.onFinishInflate();
      this.iD = ((TextView)findViewById(a.e.aw));
      this.iE = ((Button)findViewById(a.e.av));
    }
    
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.iG != null) {
        this.iG.al();
      }
    }
    
    protected void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      int i = paramInt1;
      if (this.ia > 0)
      {
        i = paramInt1;
        if (getMeasuredWidth() > this.ia)
        {
          i = View.MeasureSpec.makeMeasureSpec(this.ia, 1073741824);
          super.onMeasure(i, paramInt2);
        }
      }
      int j = getResources().getDimensionPixelSize(a.d.ap);
      int k = getResources().getDimensionPixelSize(a.d.ao);
      if (this.iD.getLayout().getLineCount() > 1)
      {
        paramInt1 = 1;
        if ((paramInt1 == 0) || (this.iF <= 0) || (this.iE.getMeasuredWidth() <= this.iF)) {
          break label142;
        }
        if (!c(1, j, j - k)) {
          break label170;
        }
        paramInt1 = 1;
      }
      for (;;)
      {
        if (paramInt1 != 0) {
          super.onMeasure(i, paramInt2);
        }
        return;
        paramInt1 = 0;
        break;
        label142:
        if (paramInt1 != 0) {}
        for (paramInt1 = j;; paramInt1 = k)
        {
          if (!c(0, paramInt1, paramInt1)) {
            break label170;
          }
          paramInt1 = 1;
          break;
        }
        label170:
        paramInt1 = 0;
      }
    }
    
    static abstract interface a
    {
      public abstract void ak();
    }
    
    static abstract interface b
    {
      public abstract void al();
    }
  }
  
  final class a
    extends s<Snackbar.SnackbarLayout>
  {
    a() {}
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, Snackbar.SnackbarLayout paramSnackbarLayout, MotionEvent paramMotionEvent)
    {
      if (paramCoordinatorLayout.b(paramSnackbarLayout, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        switch (paramMotionEvent.getActionMasked())
        {
        }
      }
      for (;;)
      {
        return super.a(paramCoordinatorLayout, paramSnackbarLayout, paramMotionEvent);
        q.am().a(Snackbar.this.iA);
        continue;
        q.am().b(Snackbar.this.iA);
      }
    }
    
    public final boolean r(View paramView)
    {
      return paramView instanceof Snackbar.SnackbarLayout;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\Snackbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */