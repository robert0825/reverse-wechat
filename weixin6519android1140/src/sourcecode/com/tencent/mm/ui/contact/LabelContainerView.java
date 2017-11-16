package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.MMTagPanelScrollView;

public class LabelContainerView
  extends MMTagPanelScrollView
{
  private int vP;
  boolean wSs;
  boolean wSt;
  boolean wSu;
  float wSv;
  float wSw;
  float wSx;
  float wSy;
  public a wSz;
  boolean wb;
  float wg;
  float wh;
  float wi;
  float wj;
  
  public LabelContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1792477757440L, 13355);
    this.wb = true;
    this.wSs = false;
    this.wSt = true;
    this.wSu = false;
    cgx();
    GMTrace.o(1792477757440L, 13355);
  }
  
  public LabelContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1792343539712L, 13354);
    this.wb = true;
    this.wSs = false;
    this.wSt = true;
    this.wSu = false;
    cgx();
    GMTrace.o(1792343539712L, 13354);
  }
  
  private void cgx()
  {
    GMTrace.i(1792746192896L, 13357);
    int i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.vP = (i * i);
    GMTrace.o(1792746192896L, 13357);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1792880410624L, 13358);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(1792880410624L, 13358);
    return bool;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    GMTrace.i(1792611975168L, 13356);
    int n = paramMotionEvent.getAction();
    int i;
    if ((n & 0xFF) == 6)
    {
      i = 1;
      if (i == 0) {
        break label114;
      }
    }
    int m;
    float f2;
    label114:
    for (int j = paramMotionEvent.getActionIndex();; j = -1)
    {
      m = paramMotionEvent.getPointerCount();
      int k = 0;
      float f3;
      for (f2 = 0.0F; k < m; f2 = f3)
      {
        float f4 = f1;
        f3 = f2;
        if (j != k)
        {
          f3 = f2 + paramMotionEvent.getX(k);
          f4 = f1 + paramMotionEvent.getY(k);
        }
        k += 1;
        f1 = f4;
      }
      i = 0;
      break;
    }
    if (i != 0)
    {
      i = m - 1;
      f2 /= i;
      f1 /= i;
      switch (n)
      {
      }
    }
    for (;;)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(1792611975168L, 13356);
      return bool;
      i = m;
      break;
      this.wSt = true;
      this.wSw = f2;
      this.wSv = f2;
      this.wSy = f1;
      this.wSx = f1;
      this.wSu = true;
      continue;
      i = (int)(f2 - this.wSv);
      j = (int)(f1 - this.wSx);
      if (j * j + i * i > this.vP)
      {
        this.wSt = false;
        GMTrace.o(1792611975168L, 13356);
        return true;
        this.wSt = true;
        this.wSu = false;
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    GMTrace.i(1793014628352L, 13359);
    int n = paramMotionEvent.getAction();
    int i;
    if ((n & 0xFF) == 6)
    {
      i = 1;
      if (i == 0) {
        break label114;
      }
    }
    int m;
    float f2;
    label114:
    for (int j = paramMotionEvent.getActionIndex();; j = -1)
    {
      m = paramMotionEvent.getPointerCount();
      int k = 0;
      float f3;
      for (f2 = 0.0F; k < m; f2 = f3)
      {
        float f4 = f1;
        f3 = f2;
        if (j != k)
        {
          f3 = f2 + paramMotionEvent.getX(k);
          f4 = f1 + paramMotionEvent.getY(k);
        }
        k += 1;
        f1 = f4;
      }
      i = 0;
      break;
    }
    if (i != 0)
    {
      i = m - 1;
      f2 /= i;
      f1 /= i;
      switch (n)
      {
      }
    }
    for (;;)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(1793014628352L, 13359);
      return bool;
      i = m;
      break;
      this.wb = true;
      this.wg = f2;
      this.wi = f2;
      this.wh = f1;
      this.wj = f1;
      this.wSs = true;
      continue;
      if (!this.wSs)
      {
        this.wb = true;
        this.wg = f2;
        this.wi = f2;
        this.wh = f1;
        this.wj = f1;
        this.wSs = true;
      }
      if (this.wSz != null) {
        this.wSz.atf();
      }
      i = (int)(f2 - this.wi);
      j = (int)(f1 - this.wj);
      if (j * j + i * i > this.vP)
      {
        this.wb = false;
        continue;
        if (((this.wb) || (!this.wSs)) && (this.wSz != null)) {
          this.wSz.ate();
        }
        this.wb = true;
        this.wSs = false;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void ate();
    
    public abstract void atf();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\LabelContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */