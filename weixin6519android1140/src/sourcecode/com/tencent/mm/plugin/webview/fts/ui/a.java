package com.tencent.mm.plugin.webview.fts.ui;

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
import com.tencent.mm.plugin.webview.fts.c.c;

public final class a
{
  float hZu;
  public View imN;
  GestureDetector imP;
  int imR;
  float imS;
  int imT;
  int imU;
  public Runnable imV;
  Context mContext;
  public int rCW;
  public b rCX;
  
  public a(Context paramContext, View paramView, b paramb)
  {
    GMTrace.i(20459613585408L, 152436);
    this.rCW = a.rCZ;
    this.hZu = 0.0F;
    this.imR = 0;
    this.imS = 0.0F;
    this.imT = -1;
    this.imU = 0;
    this.imV = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20479612026880L, 152585);
        a.this.rCX.Xl();
        GMTrace.o(20479612026880L, 152585);
      }
    };
    this.mContext = paramContext;
    this.rCX = paramb;
    this.imN = paramView;
    this.imP = new GestureDetector(this.mContext, new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(20482296381440L, 152605);
        a.this.imN.removeCallbacks(a.this.imV);
        a.this.rCX.Xm();
        GMTrace.o(20482296381440L, 152605);
        return true;
      }
      
      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(20482430599168L, 152606);
        if ((paramAnonymousMotionEvent1 == null) || (paramAnonymousMotionEvent2 == null))
        {
          GMTrace.o(20482430599168L, 152606);
          return true;
        }
        if (a.this.rCW == a.a.rCZ)
        {
          if (Math.abs(paramAnonymousFloat1) <= Math.abs(paramAnonymousFloat2)) {
            break label160;
          }
          a.this.rCW = a.a.rDc;
        }
        float f;
        for (;;)
        {
          paramAnonymousFloat1 = paramAnonymousMotionEvent2.getX();
          paramAnonymousFloat2 = paramAnonymousMotionEvent1.getX();
          f = paramAnonymousMotionEvent2.getY() - paramAnonymousMotionEvent1.getY();
          paramAnonymousMotionEvent1 = a.this;
          if (paramAnonymousMotionEvent1.rCW != a.a.rDc) {
            break;
          }
          if (paramAnonymousMotionEvent1.imT == -1)
          {
            paramAnonymousMotionEvent1.rCX.Xn();
            paramAnonymousMotionEvent1.imT = paramAnonymousMotionEvent1.rCX.getCurrentPosition();
          }
          paramAnonymousMotionEvent1.imU = paramAnonymousMotionEvent1.rCX.d(paramAnonymousMotionEvent1.imT, paramAnonymousFloat1 - paramAnonymousFloat2);
          GMTrace.o(20482430599168L, 152606);
          return true;
          label160:
          if (paramAnonymousMotionEvent1.getX() < a.this.imN.getMeasuredWidth() / 2) {
            a.this.rCW = a.a.rDb;
          } else {
            a.this.rCW = a.a.rDa;
          }
        }
        if (paramAnonymousMotionEvent1.rCW == a.a.rDb)
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
            paramAnonymousMotionEvent1.rCX.S(paramAnonymousFloat1);
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
              if (paramAnonymousMotionEvent1.rCW != a.a.rDa) {
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
                paramAnonymousMotionEvent1.rCX.R(paramAnonymousFloat1);
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
        GMTrace.i(20482162163712L, 152604);
        a.this.imN.postDelayed(a.this.imV, 200L);
        GMTrace.o(20482162163712L, 152604);
        return true;
      }
    });
    this.hZu = c.bL(paramContext);
    GMTrace.o(20459613585408L, 152436);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(20473974882304L, 152543);
      rCZ = 1;
      rDa = 2;
      rDb = 3;
      rDc = 4;
      rDd = new int[] { rCZ, rDa, rDb, rDc };
      GMTrace.o(20473974882304L, 152543);
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
    
    public abstract boolean ctT();
    
    public abstract int d(int paramInt, float paramFloat);
    
    public abstract void e(int paramInt, float paramFloat);
    
    public abstract int getCurrentPosition();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */