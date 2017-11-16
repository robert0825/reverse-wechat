package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public final class f
{
  float hZu;
  public View imN;
  public int imO;
  GestureDetector imP;
  public b imQ;
  int imR;
  float imS;
  int imT;
  int imU;
  public Runnable imV;
  Context mContext;
  
  public f(Context paramContext, View paramView, b paramb)
  {
    GMTrace.i(17348580868096L, 129257);
    this.imO = a.imX;
    this.hZu = 0.0F;
    this.imR = 0;
    this.imS = 0.0F;
    this.imT = -1;
    this.imU = 0;
    this.imV = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17346836037632L, 129244);
        f.this.imQ.Xl();
        GMTrace.o(17346836037632L, 129244);
      }
    };
    this.mContext = paramContext;
    this.imQ = paramb;
    this.imN = paramView;
    this.imP = new GestureDetector(this.mContext, new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17363210600448L, 129366);
        f.this.imN.removeCallbacks(f.this.imV);
        f.this.imQ.Xm();
        GMTrace.o(17363210600448L, 129366);
        return true;
      }
      
      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(17363344818176L, 129367);
        if ((paramAnonymousMotionEvent1 == null) || (paramAnonymousMotionEvent2 == null))
        {
          GMTrace.o(17363344818176L, 129367);
          return true;
        }
        if (f.this.imO == f.a.imX)
        {
          if (Math.abs(paramAnonymousFloat1) <= Math.abs(paramAnonymousFloat2)) {
            break label160;
          }
          f.this.imO = f.a.ina;
        }
        float f;
        for (;;)
        {
          paramAnonymousFloat1 = paramAnonymousMotionEvent2.getX();
          paramAnonymousFloat2 = paramAnonymousMotionEvent1.getX();
          f = paramAnonymousMotionEvent2.getY() - paramAnonymousMotionEvent1.getY();
          paramAnonymousMotionEvent1 = f.this;
          if (paramAnonymousMotionEvent1.imO != f.a.ina) {
            break;
          }
          if (paramAnonymousMotionEvent1.imT == -1)
          {
            paramAnonymousMotionEvent1.imQ.Xn();
            paramAnonymousMotionEvent1.imT = paramAnonymousMotionEvent1.imQ.getCurrentPosition();
          }
          paramAnonymousMotionEvent1.imU = paramAnonymousMotionEvent1.imQ.d(paramAnonymousMotionEvent1.imT, paramAnonymousFloat1 - paramAnonymousFloat2);
          GMTrace.o(17363344818176L, 129367);
          return true;
          label160:
          if (paramAnonymousMotionEvent1.getX() < f.this.imN.getMeasuredWidth() / 2) {
            f.this.imO = f.a.imZ;
          } else {
            f.this.imO = f.a.imY;
          }
        }
        if (paramAnonymousMotionEvent1.imO == f.a.imZ)
        {
          paramAnonymousFloat1 = -1.0F * f / paramAnonymousMotionEvent1.imN.getMeasuredHeight() * 1.2F + paramAnonymousMotionEvent1.hZu;
          if (paramAnonymousFloat1 < 0.0F) {
            paramAnonymousFloat1 = 0.0F;
          }
        }
        label248:
        label325:
        label434:
        label480:
        label520:
        for (;;)
        {
          paramAnonymousMotionEvent2 = paramAnonymousMotionEvent1.mContext;
          if ((paramAnonymousMotionEvent2 instanceof Activity))
          {
            if (paramAnonymousFloat1 >= 0.01F) {
              break label325;
            }
            paramAnonymousFloat2 = 0.01F;
          }
          for (;;)
          {
            paramAnonymousMotionEvent2 = (Activity)paramAnonymousMotionEvent2;
            WindowManager.LayoutParams localLayoutParams = paramAnonymousMotionEvent2.getWindow().getAttributes();
            localLayoutParams.screenBrightness = paramAnonymousFloat2;
            paramAnonymousMotionEvent2.getWindow().setAttributes(localLayoutParams);
            paramAnonymousMotionEvent1.imQ.S(paramAnonymousFloat1);
            break;
            if (paramAnonymousFloat1 <= 1.0F) {
              break label520;
            }
            paramAnonymousFloat1 = 1.0F;
            break label248;
            if (paramAnonymousFloat1 > 1.0F)
            {
              paramAnonymousFloat2 = 1.0F;
              continue;
              if (paramAnonymousMotionEvent1.imO != f.a.imY) {
                break;
              }
              paramAnonymousFloat1 = f * -1.0F;
              paramAnonymousFloat2 = paramAnonymousFloat1 / paramAnonymousMotionEvent1.imN.getMeasuredHeight();
              paramAnonymousMotionEvent2 = (AudioManager)paramAnonymousMotionEvent1.mContext.getSystemService("audio");
              int j = paramAnonymousMotionEvent2.getStreamMaxVolume(3);
              paramAnonymousFloat2 = 1.2F * (paramAnonymousFloat2 * j);
              int k = (int)paramAnonymousFloat2;
              int i = k;
              if (k == 0)
              {
                i = k;
                if (Math.abs(paramAnonymousFloat2) > 0.2F)
                {
                  if (paramAnonymousFloat1 <= 0.0F) {
                    break label480;
                  }
                  i = 1;
                }
              }
              k = i + paramAnonymousMotionEvent1.imR;
              if (k < 0) {
                i = 0;
              }
              for (;;)
              {
                paramAnonymousMotionEvent2.setStreamVolume(3, i, 0);
                paramAnonymousFloat1 = i / j;
                paramAnonymousMotionEvent1.imQ.R(paramAnonymousFloat1);
                break;
                i = k;
                if (paramAnonymousFloat1 >= 0.0F) {
                  break label434;
                }
                i = -1;
                break label434;
                i = k;
                if (k >= j) {
                  i = j;
                }
              }
            }
            paramAnonymousFloat2 = paramAnonymousFloat1;
          }
        }
      }
      
      public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17363076382720L, 129365);
        f.this.imN.postDelayed(f.this.imV, 200L);
        GMTrace.o(17363076382720L, 129365);
        return true;
      }
    });
    this.hZu = g.bL(paramContext);
    GMTrace.o(17348580868096L, 129257);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(17345896513536L, 129237);
      imX = 1;
      imY = 2;
      imZ = 3;
      ina = 4;
      inb = new int[] { imX, imY, imZ, ina };
      GMTrace.o(17345896513536L, 129237);
    }
  }
  
  public static abstract interface b
  {
    public abstract void R(float paramFloat);
    
    public abstract void S(float paramFloat);
    
    public abstract void Xl();
    
    public abstract void Xm();
    
    public abstract void Xn();
    
    public abstract void Xo();
    
    public abstract void Xp();
    
    public abstract int d(int paramInt, float paramFloat);
    
    public abstract void e(int paramInt, float paramFloat);
    
    public abstract int getCurrentPosition();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */