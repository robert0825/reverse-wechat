package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Array;
import java.util.Arrays;

public class a
{
  protected View jrF;
  protected boolean nhg;
  protected int nof;
  protected int rPI;
  protected int rPJ;
  protected int rPK;
  protected int rPL;
  protected View rPM;
  protected View rPN;
  protected View rPO;
  protected View rPP;
  protected View rPQ;
  protected View rPR;
  protected View rPS;
  protected float[][] rPT;
  protected int rPU;
  protected a rPV;
  protected ValueAnimator.AnimatorUpdateListener rPW;
  protected ValueAnimator.AnimatorUpdateListener rPX;
  protected ValueAnimator.AnimatorUpdateListener rPY;
  protected ValueAnimator.AnimatorUpdateListener rPZ;
  
  public a(Context paramContext, final View paramView1, View paramView2, View paramView3, View paramView4, View paramView5, View paramView6, View paramView7, final View paramView8)
  {
    GMTrace.i(20424314322944L, 152173);
    this.rPU = b.rQe;
    this.rPW = new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(20425656500224L, 152183);
        float f1 = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        float f2 = a.this.rPT[1][1];
        float f3 = a.this.rPT[1][0];
        float f4 = a.this.rPT[1][0];
        float f5 = a.this.rPT[0][1];
        float f6 = a.this.rPT[0][0];
        float f7 = a.this.rPT[0][0];
        a.this.rPM.setX((f2 - f3) * f1 + f4);
        a.this.rPM.setY((f5 - f6) * f1 + f7);
        if (a.this.bFd()) {
          a.this.rPM.setPadding((int)((a.this.rPL - a.this.rPK) * f1 + a.this.rPK), 0, 0, 0);
        }
        paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)a.this.rPM.getLayoutParams();
        int i = (int)((1.0F - f1) * a.this.rPI);
        paramAnonymousValueAnimator.leftMargin = i;
        paramAnonymousValueAnimator.rightMargin = i;
        int j = (int)a.this.rPT[2][0];
        paramAnonymousValueAnimator.width = ((a.this.rPI - i) * 2 + j);
        a.this.rPM.setLayoutParams(paramAnonymousValueAnimator);
        GMTrace.o(20425656500224L, 152183);
      }
    };
    this.rPX = new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(20427401330688L, 152196);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        a.this.rPM.setAlpha(f);
        a.this.rPM.setX(a.this.rPT[1][1]);
        a.this.rPM.setY(a.this.rPT[0][1]);
        if (a.this.bFd()) {
          a.this.rPM.setPadding(a.this.rPL, 0, 0, 0);
        }
        paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)a.this.rPM.getLayoutParams();
        if (paramAnonymousValueAnimator.leftMargin != 0)
        {
          paramAnonymousValueAnimator.leftMargin = 0;
          paramAnonymousValueAnimator.rightMargin = 0;
          paramAnonymousValueAnimator.width = ((int)a.this.rPT[2][0] + a.this.rPI * 2);
          a.this.rPM.setLayoutParams(paramAnonymousValueAnimator);
        }
        GMTrace.o(20427401330688L, 152196);
      }
    };
    this.rPY = new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(20435857047552L, 152259);
        float f1 = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        float f2 = a.this.rPT[1][0];
        float f3 = a.this.rPT[1][1];
        float f4 = a.this.rPT[1][1];
        float f5 = a.this.rPT[0][0];
        float f6 = a.this.rPT[0][1];
        float f7 = a.this.rPT[0][1];
        a.this.rPM.setX((f2 - f3) * f1 + f4);
        a.this.rPM.setY((f5 - f6) * f1 + f7);
        if (a.this.bFd()) {
          a.this.rPM.setPadding((int)((a.this.rPK - a.this.rPL) * f1 + a.this.rPL), 0, 0, 0);
        }
        paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)a.this.rPM.getLayoutParams();
        int i = (int)(f1 * a.this.rPI);
        paramAnonymousValueAnimator.leftMargin = i;
        paramAnonymousValueAnimator.rightMargin = i;
        int j = (int)a.this.rPT[2][0];
        paramAnonymousValueAnimator.width = ((a.this.rPI - i) * 2 + j);
        a.this.rPM.setLayoutParams(paramAnonymousValueAnimator);
        GMTrace.o(20435857047552L, 152259);
      }
    };
    this.rPZ = new ValueAnimator.AnimatorUpdateListener()
    {
      public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        GMTrace.i(20434783305728L, 152251);
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        if (Math.abs(f - 1.0F) <= 0.001D)
        {
          a.this.rPM.setX(a.this.rPT[1][0]);
          a.this.rPM.setY(a.this.rPT[0][0]);
          if (a.this.bFd()) {
            a.this.rPM.setPadding(0, 0, 0, 0);
          }
          paramAnonymousValueAnimator = (RelativeLayout.LayoutParams)a.this.rPM.getLayoutParams();
          paramAnonymousValueAnimator.leftMargin = a.this.rPI;
          paramAnonymousValueAnimator.rightMargin = a.this.rPI;
          paramAnonymousValueAnimator.width = ((int)a.this.rPT[2][0]);
          a.this.rPM.setLayoutParams(paramAnonymousValueAnimator);
          a.this.rPM.setAlpha(1.0F);
          GMTrace.o(20434783305728L, 152251);
          return;
        }
        a.this.rPM.setAlpha(1.0F - f);
        GMTrace.o(20434783305728L, 152251);
      }
    };
    this.rPI = (com.tencent.mm.br.a.fromDPToPix(paramContext, 48) / 2);
    this.nof = ((int)paramContext.getResources().getDimension(R.f.aSS));
    this.rPT = ((float[][])Array.newInstance(Float.TYPE, new int[] { 3, 2 }));
    this.rPM = paramView1;
    this.rPN = paramView2;
    this.rPO = paramView3;
    this.rPP = paramView4;
    this.rPQ = paramView5;
    this.jrF = paramView6;
    this.rPR = paramView7;
    this.rPS = paramView8;
    this.rPM.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20432904257536L, 152237);
        a.this.rPT[0][0] = paramView1.getY();
        a.this.rPT[0][1] = 0;
        a.this.rPT[1][0] = paramView1.getX();
        a.this.rPT[1][1] = 0;
        a.this.rPT[2][0] = paramView1.getMeasuredWidth();
        a.this.rPT[2][1] = (paramView1.getMeasuredWidth() + a.this.rPI * 2);
        w.i("MicroMsg.FTS.SosAnimatorBaseController", "searchBarData %s", new Object[] { Arrays.toString(a.this.rPT) });
        GMTrace.o(20432904257536L, 152237);
      }
    });
    this.rPS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20435051741184L, 152253);
        a.this.rPJ = paramView8.getMeasuredHeight();
        GMTrace.o(20435051741184L, 152253);
      }
    });
    GMTrace.o(20424314322944L, 152173);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(20425119629312L, 152179);
    this.rPV = parama;
    GMTrace.o(20425119629312L, 152179);
  }
  
  protected void bFb()
  {
    GMTrace.i(20424851193856L, 152177);
    GMTrace.o(20424851193856L, 152177);
  }
  
  protected void bFc()
  {
    GMTrace.i(20424985411584L, 152178);
    GMTrace.o(20424985411584L, 152178);
  }
  
  protected boolean bFd()
  {
    GMTrace.i(20425253847040L, 152180);
    GMTrace.o(20425253847040L, 152180);
    return true;
  }
  
  public final void ye(int paramInt)
  {
    GMTrace.i(20424448540672L, 152174);
    this.rPT[0][0] = paramInt;
    GMTrace.o(20424448540672L, 152174);
  }
  
  public final void yf(int paramInt)
  {
    GMTrace.i(20424582758400L, 152175);
    this.rPU = paramInt;
    GMTrace.o(20424582758400L, 152175);
  }
  
  public void yg(int paramInt)
  {
    GMTrace.i(20424716976128L, 152176);
    if (paramInt == this.rPU)
    {
      GMTrace.o(20424716976128L, 152176);
      return;
    }
    switch (7.rQd[(paramInt - 1)])
    {
    }
    for (;;)
    {
      this.rPU = paramInt;
      GMTrace.o(20424716976128L, 152176);
      return;
      bFb();
      continue;
      bFc();
    }
  }
  
  public static abstract interface a
  {
    public abstract void onAnimationEnd();
    
    public abstract void onAnimationStart();
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(20435588612096L, 152257);
      rQe = 1;
      rQf = 2;
      rQg = new int[] { rQe, rQf };
      GMTrace.o(20435588612096L, 152257);
    }
    
    public static int[] bFe()
    {
      GMTrace.i(20435454394368L, 152256);
      int[] arrayOfInt = (int[])rQg.clone();
      GMTrace.o(20435454394368L, 152256);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\fts\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */