package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.m.a.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public class SmileyPanelScrollView
  extends View
{
  private static boolean DEBUG;
  private int STATE_NONE;
  private int Vu;
  private int Vv;
  private Context mContext;
  private int mHeight;
  int mState;
  private int mWidth;
  private int xzA;
  private int xzB;
  private boolean xzC;
  private boolean xzD;
  public int xzE;
  public int xzF;
  public float xzG;
  public boolean xzH;
  private int xzI;
  private a xzJ;
  public b xzm;
  public com.tencent.mm.view.f.a xzn;
  private Drawable xzo;
  private Drawable xzp;
  private Drawable xzq;
  public int xzr;
  public int xzs;
  private int xzt;
  private Paint xzu;
  private int xzv;
  private int xzw;
  private int xzx;
  private int xzy;
  private int xzz;
  
  static
  {
    GMTrace.i(20121921781760L, 149920);
    DEBUG = false;
    GMTrace.o(20121921781760L, 149920);
  }
  
  public SmileyPanelScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20121116475392L, 149914);
    this.xzC = false;
    this.xzD = false;
    this.xzE = -1;
    this.xzF = -1;
    this.xzH = false;
    this.xzI = 1;
    this.STATE_NONE = 0;
    this.mState = this.STATE_NONE;
    this.xzJ = new a();
    init(paramContext);
    GMTrace.o(20121116475392L, 149914);
  }
  
  public SmileyPanelScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20121250693120L, 149915);
    this.xzC = false;
    this.xzD = false;
    this.xzE = -1;
    this.xzF = -1;
    this.xzH = false;
    this.xzI = 1;
    this.STATE_NONE = 0;
    this.mState = this.STATE_NONE;
    this.xzJ = new a();
    init(paramContext);
    GMTrace.o(20121250693120L, 149915);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(20121384910848L, 149916);
    this.mContext = paramContext;
    this.xzp = this.mContext.getResources().getDrawable(a.d.kwa);
    this.xzo = this.mContext.getResources().getDrawable(a.d.kvZ);
    this.xzq = this.mContext.getResources().getDrawable(a.d.kwb);
    this.xzv = com.tencent.mm.br.a.fromDPToPix(this.mContext, 12);
    this.xzw = this.xzo.getIntrinsicHeight();
    this.xzx = this.xzo.getIntrinsicWidth();
    this.xzy = this.xzq.getIntrinsicHeight();
    this.xzA = this.xzp.getIntrinsicHeight();
    this.xzB = this.xzp.getIntrinsicWidth();
    w.d("MicroMsg.SmileyPanelScrollView", "init mDotPadding:%d mDotHeight:%d mDotWidth:%d", new Object[] { Integer.valueOf(this.xzv), Integer.valueOf(this.xzw), Integer.valueOf(this.xzx) });
    this.xzu = new Paint();
    this.xzu.setColor(-65536);
    this.xzu.setAntiAlias(true);
    this.xzu.setTextAlign(Paint.Align.CENTER);
    this.mWidth = getMeasuredWidth();
    this.mHeight = getMeasuredHeight();
    this.xzt = (this.xzz / (this.xzx + this.xzv));
    w.d("MicroMsg.SmileyPanelScrollView", "init mWidth:%d mHeight:%d mTrackWidth:%d mMaxDot:%d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.xzz), Integer.valueOf(this.xzt) });
    GMTrace.o(20121384910848L, 149916);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(20121519128576L, 149917);
    super.draw(paramCanvas);
    a locala = this.xzJ;
    int j;
    if (locala.xzL.mState != locala.xzL.xzI)
    {
      j = 102;
      if (this.xzr <= this.xzt) {
        break label497;
      }
      this.xzC = true;
      k = (this.mHeight - this.xzy) / 2;
      i = (this.mWidth - this.xzz) / 2;
      this.Vu = (i - this.xzB / 2);
      this.Vv = (this.Vu + this.xzz + this.xzB);
      if (DEBUG)
      {
        paramCanvas.drawLine(this.Vu, 0.0F, this.Vu, this.mHeight, this.xzu);
        paramCanvas.drawLine(this.Vv, 0.0F, this.Vv, this.mHeight, this.xzu);
      }
      this.xzq.setBounds(i, k, this.xzz + i, this.xzy + k);
      this.xzq.setAlpha(j);
      this.xzq.draw(paramCanvas);
      k = (this.mHeight - this.xzA) / 2;
      if ((!this.xzD) && (!this.xzH)) {
        break label388;
      }
      i = this.xzz / (this.xzr - 1) * this.xzs + i - this.xzB / 2;
    }
    for (;;)
    {
      this.xzp.setBounds(i, k, this.xzB + i, this.xzA + k);
      this.xzp.draw(paramCanvas);
      if ((this.mState == this.xzI) && (j < 255)) {
        invalidate();
      }
      GMTrace.o(20121519128576L, 149917);
      return;
      long l = SystemClock.uptimeMillis();
      if (l > locala.mStartTime + locala.xzK) {
        i = 255;
      }
      for (;;)
      {
        j = i;
        break;
        j = (int)((l - locala.mStartTime) * 153L / locala.xzK) + 102;
        i = j;
        if (j < 102) {
          i = 102;
        }
      }
      label388:
      if (this.xzF == this.xzE) {
        i = this.xzz / (this.xzr - 1) * this.xzE + i - this.xzB / 2 + (int)(this.xzz / (this.xzr - 1) * this.xzG);
      } else {
        i = this.xzz / (this.xzr - 1) * this.xzE + i - this.xzB / 2 - (int)(this.xzz / (this.xzr - 1) * (1.0F - this.xzG));
      }
    }
    label497:
    this.xzC = false;
    int k = (this.mHeight - this.xzw) / 2;
    int i = (this.mWidth - ((this.xzv + this.xzx) * (this.xzr - 1) + this.xzx)) / 2;
    this.Vu = (i - (this.xzB - this.xzx) / 2);
    this.Vv = (this.Vu + this.xzx * this.xzr + this.xzv * (this.xzr - 1) + (this.xzB - this.xzx));
    if (DEBUG)
    {
      paramCanvas.drawLine(this.Vu, 0.0F, this.Vu, this.mHeight, this.xzu);
      paramCanvas.drawLine(this.Vv, 0.0F, this.Vv, this.mHeight, this.xzu);
    }
    this.xzo.setBounds(i, k, this.xzx + i, this.xzw + k);
    k = (this.mHeight - this.xzA) / 2;
    if ((this.xzD) || (this.xzH)) {
      i -= (this.xzB - this.xzx) / 2;
    }
    for (;;)
    {
      this.xzp.setBounds(i, k, this.xzB + i, this.xzA + k);
      k = 0;
      while (k < this.xzr)
      {
        paramCanvas.save();
        if (k > 0) {
          paramCanvas.translate((this.xzx + this.xzv) * k, 0.0F);
        }
        this.xzo.setAlpha(j);
        this.xzo.draw(paramCanvas);
        paramCanvas.restore();
        k += 1;
      }
      if (this.xzF == this.xzE) {
        i = i - (this.xzB - this.xzx) / 2 + (int)((this.xzx + this.xzv) * this.xzG);
      } else {
        i = i - (this.xzB - this.xzx) / 2 - (int)((this.xzx + this.xzv) * (1.0F - this.xzG));
      }
    }
    if (this.xzE > this.xzr - 1) {
      this.xzE = (this.xzr - 1);
    }
    k = (this.xzx + this.xzv) * this.xzE;
    if (i + k > this.Vv)
    {
      i = 0;
      w.i("MicroMsg.SmileyPanelScrollView", "over right.");
    }
    for (;;)
    {
      paramCanvas.save();
      paramCanvas.translate(i, 0.0F);
      this.xzp.draw(paramCanvas);
      paramCanvas.restore();
      break;
      i = k;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20121653346304L, 149918);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != this.mWidth)
    {
      this.mWidth = getMeasuredWidth();
      this.mHeight = getMeasuredHeight();
      this.xzz = (this.mWidth - (this.xzn.getColumnWidth() - this.xzn.xCr) - com.tencent.mm.br.a.V(this.mContext, a.c.aQO) * 2);
      this.xzt = (this.xzz / (this.xzx + this.xzv));
      w.d("MicroMsg.SmileyPanelScrollView", "onSizeChanged mWidth:%d mHeight:%d mTrackWidth:%d mMaxDot:%d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.xzz), Integer.valueOf(this.xzt) });
      if (this.mHeight == 0)
      {
        w.i("MicroMsg.SmileyPanelScrollView", "user default height");
        this.mHeight = com.tencent.mm.br.a.fromDPToPix(this.mContext, 16);
      }
    }
    GMTrace.o(20121653346304L, 149918);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(20121787564032L, 149919);
    int m = paramMotionEvent.getAction();
    int k = (int)paramMotionEvent.getX();
    if ((k < this.Vu - this.xzv) || (k > this.Vv + this.xzv))
    {
      w.d("MicroMsg.SmileyPanelScrollView", "over x :%d mLeft:%d mRight:%d ", new Object[] { Integer.valueOf(k), Integer.valueOf(this.Vu), Integer.valueOf(this.Vv) });
      if (m == 0)
      {
        boolean bool = super.onTouchEvent(paramMotionEvent);
        GMTrace.o(20121787564032L, 149919);
        return bool;
      }
    }
    for (int j = 1;; j = 0)
    {
      int i;
      if (j == 0)
      {
        i = k;
        if (k < this.Vu) {
          i = this.Vu;
        }
        k = i;
        if (i > this.Vv) {
          k = this.Vv;
        }
        if (this.xzC)
        {
          i = this.xzz / (this.xzr - 1);
          i = (k - this.Vu) / i;
          k = i;
          if (i > this.xzr - 1) {
            k = this.xzr - 1;
          }
          this.xzm.EC(k);
          this.xzE = k;
          this.xzF = k;
        }
      }
      else
      {
        switch (m)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(20121787564032L, 149919);
        return true;
        i = (k - this.Vu + this.xzv) / (this.xzx + this.xzv);
        break;
        if (j == 0)
        {
          this.xzD = true;
          this.xzH = true;
          this.mState = this.xzI;
          this.xzJ.ckI();
          invalidate();
          continue;
          if ((j == 0) && (this.mState != this.xzI))
          {
            this.mState = this.xzI;
            this.xzJ.ckI();
            invalidate();
            continue;
            this.mState = this.STATE_NONE;
            this.xzD = false;
            invalidate();
          }
        }
      }
    }
  }
  
  public final class a
    implements Runnable
  {
    long mStartTime;
    long xzK;
    
    public a()
    {
      GMTrace.i(20119371644928L, 149901);
      GMTrace.o(20119371644928L, 149901);
    }
    
    final void ckI()
    {
      GMTrace.i(20119505862656L, 149902);
      this.xzK = 300L;
      this.mStartTime = SystemClock.uptimeMillis();
      g.ork.i(13361, new Object[] { Integer.valueOf(0) });
      GMTrace.o(20119505862656L, 149902);
    }
    
    public final void run()
    {
      GMTrace.i(20119640080384L, 149903);
      ckI();
      GMTrace.o(20119640080384L, 149903);
    }
  }
  
  public static abstract interface b
  {
    public abstract void EC(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\SmileyPanelScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */