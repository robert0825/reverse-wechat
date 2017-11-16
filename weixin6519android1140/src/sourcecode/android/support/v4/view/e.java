package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class e
{
  private final a vO;
  
  public e(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, (byte)0);
  }
  
  private e(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, byte paramByte)
  {
    if (Build.VERSION.SDK_INT > 17)
    {
      this.vO = new c(paramContext, paramOnGestureListener, null);
      return;
    }
    this.vO = new b(paramContext, paramOnGestureListener, null);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.vO.onTouchEvent(paramMotionEvent);
  }
  
  static abstract interface a
  {
    public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);
  }
  
  static final class b
    implements e.a
  {
    private static final int vT = ;
    private static final int vU = ViewConfiguration.getTapTimeout();
    private static final int vV = ViewConfiguration.getDoubleTapTimeout();
    private VelocityTracker ez;
    final Handler mHandler = new a();
    private int vP;
    private int vQ;
    private int vR;
    private int vS;
    public final GestureDetector.OnGestureListener vW;
    public GestureDetector.OnDoubleTapListener vX;
    public boolean vY;
    public boolean vZ;
    boolean wa;
    private boolean wb;
    private boolean wc;
    public MotionEvent wd;
    private MotionEvent we;
    private boolean wf;
    private float wg;
    private float wh;
    private float wi;
    private float wj;
    private boolean wk;
    
    public b(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      this.vW = paramOnGestureListener;
      if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener)) {
        this.vX = ((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
      }
      if (paramContext == null) {
        throw new IllegalArgumentException("Context must not be null");
      }
      if (this.vW == null) {
        throw new IllegalArgumentException("OnGestureListener must not be null");
      }
      this.wk = true;
      paramContext = ViewConfiguration.get(paramContext);
      int i = paramContext.getScaledTouchSlop();
      int j = paramContext.getScaledDoubleTapSlop();
      this.vR = paramContext.getScaledMinimumFlingVelocity();
      this.vS = paramContext.getScaledMaximumFlingVelocity();
      this.vP = (i * i);
      this.vQ = (j * j);
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i1 = paramMotionEvent.getAction();
      if (this.ez == null) {
        this.ez = VelocityTracker.obtain();
      }
      this.ez.addMovement(paramMotionEvent);
      int i;
      if ((i1 & 0xFF) == 6)
      {
        i = 1;
        if (i == 0) {
          break label127;
        }
      }
      int n;
      int m;
      float f1;
      float f2;
      float f4;
      float f3;
      label127:
      for (int k = o.e(paramMotionEvent);; k = -1)
      {
        n = o.f(paramMotionEvent);
        m = 0;
        f1 = 0.0F;
        for (f2 = 0.0F; m < n; f2 = f3)
        {
          f4 = f1;
          f3 = f2;
          if (k != m)
          {
            f3 = f2 + o.d(paramMotionEvent, m);
            f4 = f1 + o.e(paramMotionEvent, m);
          }
          m += 1;
          f1 = f4;
        }
        i = 0;
        break;
      }
      if (i != 0)
      {
        i = n - 1;
        f2 /= i;
        f1 /= i;
      }
      boolean bool2;
      MotionEvent localMotionEvent;
      Object localObject;
      label757:
      int j;
      switch (i1 & 0xFF)
      {
      case 4: 
      default: 
      case 5: 
      case 6: 
      case 0: 
      case 2: 
        do
        {
          do
          {
            return false;
            i = n;
            break;
            this.wg = f2;
            this.wi = f2;
            this.wh = f1;
            this.wj = f1;
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.wf = false;
            this.wb = false;
            this.wc = false;
            this.vZ = false;
          } while (!this.wa);
          this.wa = false;
          return false;
          this.wg = f2;
          this.wi = f2;
          this.wh = f1;
          this.wj = f1;
          this.ez.computeCurrentVelocity(1000, this.vS);
          k = o.e(paramMotionEvent);
          i = o.c(paramMotionEvent, k);
          f1 = y.a(this.ez, i);
          f2 = y.b(this.ez, i);
          i = 0;
          while (i < n)
          {
            if (i != k)
            {
              m = o.c(paramMotionEvent, i);
              f3 = y.a(this.ez, m);
              if (y.b(this.ez, m) * f2 + f3 * f1 < 0.0F)
              {
                this.ez.clear();
                return false;
              }
            }
            i += 1;
          }
          if (this.vX != null)
          {
            bool2 = this.mHandler.hasMessages(3);
            if (bool2) {
              this.mHandler.removeMessages(3);
            }
            if ((this.wd != null) && (this.we != null) && (bool2))
            {
              localMotionEvent = this.wd;
              localObject = this.we;
              if ((this.wc) && (paramMotionEvent.getEventTime() - ((MotionEvent)localObject).getEventTime() <= vV))
              {
                i = (int)localMotionEvent.getX() - (int)paramMotionEvent.getX();
                k = (int)localMotionEvent.getY() - (int)paramMotionEvent.getY();
                if (k * k + i * i < this.vQ)
                {
                  i = 1;
                  if (i == 0) {
                    break label757;
                  }
                  this.wf = true;
                }
              }
            }
          }
          for (boolean bool1 = this.vX.onDoubleTap(this.wd) | false | this.vX.onDoubleTapEvent(paramMotionEvent);; bool1 = false)
          {
            this.wg = f2;
            this.wi = f2;
            this.wh = f1;
            this.wj = f1;
            if (this.wd != null) {
              this.wd.recycle();
            }
            this.wd = MotionEvent.obtain(paramMotionEvent);
            this.wb = true;
            this.wc = true;
            this.vY = true;
            this.wa = false;
            this.vZ = false;
            if (this.wk)
            {
              this.mHandler.removeMessages(2);
              this.mHandler.sendEmptyMessageAtTime(2, this.wd.getDownTime() + vU + vT);
            }
            this.mHandler.sendEmptyMessageAtTime(1, this.wd.getDownTime() + vU);
            return bool1 | this.vW.onDown(paramMotionEvent);
            bool1 = false;
            break;
            this.mHandler.sendEmptyMessageDelayed(3, vV);
          }
        } while (this.wa);
        f3 = this.wg - f2;
        f4 = this.wh - f1;
        if (this.wf) {
          return this.vX.onDoubleTapEvent(paramMotionEvent) | false;
        }
        if (this.wb)
        {
          j = (int)(f2 - this.wi);
          k = (int)(f1 - this.wj);
          j = j * j + k * k;
          if (j <= this.vP) {
            break label1350;
          }
          bool2 = this.vW.onScroll(this.wd, paramMotionEvent, f3, f4);
          this.wg = f2;
          this.wh = f1;
          this.wb = false;
          this.mHandler.removeMessages(3);
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
        }
        break;
      }
      for (;;)
      {
        if (j > this.vP) {
          this.wc = false;
        }
        return bool2;
        if ((Math.abs(f3) < 1.0F) && (Math.abs(f4) < 1.0F)) {
          break;
        }
        bool2 = this.vW.onScroll(this.wd, paramMotionEvent, f3, f4);
        this.wg = f2;
        this.wh = f1;
        return bool2;
        this.vY = false;
        localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        if (this.wf) {
          bool2 = this.vX.onDoubleTapEvent(paramMotionEvent) | false;
        }
        for (;;)
        {
          if (this.we != null) {
            this.we.recycle();
          }
          this.we = localMotionEvent;
          if (this.ez != null)
          {
            this.ez.recycle();
            this.ez = null;
          }
          this.wf = false;
          this.vZ = false;
          this.mHandler.removeMessages(1);
          this.mHandler.removeMessages(2);
          return bool2;
          if (this.wa)
          {
            this.mHandler.removeMessages(3);
            this.wa = false;
            bool2 = false;
          }
          else if (this.wb)
          {
            boolean bool3 = this.vW.onSingleTapUp(paramMotionEvent);
            bool2 = bool3;
            if (this.vZ)
            {
              bool2 = bool3;
              if (this.vX != null)
              {
                this.vX.onSingleTapConfirmed(paramMotionEvent);
                bool2 = bool3;
              }
            }
          }
          else
          {
            localObject = this.ez;
            j = o.c(paramMotionEvent, 0);
            ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.vS);
            f1 = y.b((VelocityTracker)localObject, j);
            f2 = y.a((VelocityTracker)localObject, j);
            if ((Math.abs(f1) > this.vR) || (Math.abs(f2) > this.vR))
            {
              bool2 = this.vW.onFling(this.wd, paramMotionEvent, f2, f1);
              continue;
              this.mHandler.removeMessages(1);
              this.mHandler.removeMessages(2);
              this.mHandler.removeMessages(3);
              this.ez.recycle();
              this.ez = null;
              this.wf = false;
              this.vY = false;
              this.wb = false;
              this.wc = false;
              this.vZ = false;
              if (!this.wa) {
                break;
              }
              this.wa = false;
              return false;
            }
            bool2 = false;
          }
        }
        label1350:
        bool2 = false;
      }
    }
    
    private final class a
      extends Handler
    {
      a() {}
      
      public final void handleMessage(Message paramMessage)
      {
        switch (paramMessage.what)
        {
        default: 
          throw new RuntimeException("Unknown message " + paramMessage);
        case 1: 
          e.b.this.vW.onShowPress(e.b.this.wd);
        }
        do
        {
          return;
          paramMessage = e.b.this;
          paramMessage.mHandler.removeMessages(3);
          paramMessage.vZ = false;
          paramMessage.wa = true;
          paramMessage.vW.onLongPress(paramMessage.wd);
          return;
        } while (e.b.this.vX == null);
        if (!e.b.this.vY)
        {
          e.b.this.vX.onSingleTapConfirmed(e.b.this.wd);
          return;
        }
        e.b.this.vZ = true;
      }
    }
  }
  
  static final class c
    implements e.a
  {
    private final GestureDetector wm;
    
    public c(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      this.wm = new GestureDetector(paramContext, paramOnGestureListener, null);
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      return this.wm.onTouchEvent(paramMotionEvent);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */