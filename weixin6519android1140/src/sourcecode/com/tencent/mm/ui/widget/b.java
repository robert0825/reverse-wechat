package com.tencent.mm.ui.widget;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.tencent.gmtrace.GMTrace;

public final class b
  extends j
  implements GestureDetector.OnGestureListener, View.OnTouchListener
{
  private int hQ;
  private int inf;
  private int ing;
  private int kri;
  private GestureDetector wm;
  private int xnA;
  private int xnB;
  private int xnC;
  private boolean xnD;
  public DragSortListView xnE;
  public int xnF;
  private GestureDetector.OnGestureListener xnG;
  private int xnn;
  boolean xno;
  public boolean xnp;
  public boolean xnq;
  private GestureDetector xnr;
  private int xns;
  private int xnt;
  private int xnu;
  private int[] xnv;
  private int xnw;
  private int xnx;
  private boolean xny;
  public float xnz;
  
  public b(DragSortListView paramDragSortListView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramDragSortListView);
    GMTrace.i(13048781733888L, 97221);
    this.xnn = 0;
    this.xno = true;
    this.xnp = false;
    this.xnq = false;
    this.xns = -1;
    this.xnt = -1;
    this.xnu = -1;
    this.xnv = new int[2];
    this.xny = false;
    this.xnz = 500.0F;
    this.xnG = new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(13048379080704L, 97218);
        int i;
        if ((b.this.xnp) && (b.this.xnq))
        {
          i = b.this.xnE.getWidth() / 5;
          if (paramAnonymousFloat1 <= b.this.xnz) {
            break label97;
          }
          if (b.this.xnF > -i) {
            b.this.xnE.ax(paramAnonymousFloat1);
          }
        }
        for (;;)
        {
          b.this.xnq = false;
          GMTrace.o(13048379080704L, 97218);
          return false;
          label97:
          if ((paramAnonymousFloat1 < -b.this.xnz) && (b.this.xnF < i)) {
            b.this.xnE.ax(paramAnonymousFloat1);
          }
        }
      }
    };
    this.xnE = paramDragSortListView;
    this.wm = new GestureDetector(paramDragSortListView.getContext(), this);
    this.xnr = new GestureDetector(paramDragSortListView.getContext(), this.xnG);
    this.xnr.setIsLongpressEnabled(false);
    this.hQ = ViewConfiguration.get(paramDragSortListView.getContext()).getScaledTouchSlop();
    this.xnA = paramInt1;
    this.xnB = paramInt4;
    this.xnC = paramInt5;
    this.kri = paramInt3;
    this.xnn = paramInt2;
    GMTrace.o(13048781733888L, 97221);
  }
  
  private boolean ab(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = false;
    GMTrace.i(13048915951616L, 97222);
    if ((this.xno) && (!this.xnq)) {}
    for (int i = 12;; i = 0)
    {
      if ((this.xnp) && (this.xnq)) {
        i = i | 0x1 | 0x2;
      }
      for (;;)
      {
        DragSortListView localDragSortListView = this.xnE;
        paramInt1 -= this.xnE.getHeaderViewsCount();
        boolean bool1 = bool2;
        if (localDragSortListView.xox)
        {
          if (localDragSortListView.xoy != null) {
            break label114;
          }
          bool1 = bool2;
        }
        for (;;)
        {
          this.xny = bool1;
          bool1 = this.xny;
          GMTrace.o(13048915951616L, 97222);
          return bool1;
          label114:
          View localView = localDragSortListView.xoy.Ei(paramInt1);
          bool1 = bool2;
          if (localView != null) {
            bool1 = localDragSortListView.a(paramInt1, localView, i, paramInt2, paramInt3);
          }
        }
      }
    }
  }
  
  private int k(MotionEvent paramMotionEvent, int paramInt)
  {
    GMTrace.i(13049318604800L, 97225);
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    i = this.xnE.pointToPosition(i, j);
    j = this.xnE.getHeaderViewsCount();
    int k = this.xnE.getFooterViewsCount();
    int m = this.xnE.getCount();
    if ((i != -1) && (i >= j) && (i < m - k))
    {
      View localView = this.xnE.getChildAt(i - this.xnE.getFirstVisiblePosition());
      k = (int)paramMotionEvent.getRawX();
      j = (int)paramMotionEvent.getRawY();
      if (paramInt == 0) {}
      for (paramMotionEvent = localView; paramMotionEvent != null; paramMotionEvent = localView.findViewById(paramInt))
      {
        paramMotionEvent.getLocationOnScreen(this.xnv);
        if ((k <= this.xnv[0]) || (j <= this.xnv[1]) || (k >= this.xnv[0] + paramMotionEvent.getWidth())) {
          break;
        }
        paramInt = this.xnv[1];
        if (j >= paramMotionEvent.getHeight() + paramInt) {
          break;
        }
        this.xnw = localView.getLeft();
        this.xnx = localView.getTop();
        GMTrace.o(13049318604800L, 97225);
        return i;
      }
    }
    GMTrace.o(13049318604800L, 97225);
    return -1;
  }
  
  public final void e(Point paramPoint)
  {
    GMTrace.i(13049184387072L, 97224);
    if ((this.xnp) && (this.xnq)) {
      this.xnF = paramPoint.x;
    }
    GMTrace.o(13049184387072L, 97224);
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    int i = -1;
    GMTrace.i(13049452822528L, 97226);
    if ((this.xnp) && (this.kri == 0)) {
      this.xnu = k(paramMotionEvent, this.xnB);
    }
    this.xns = k(paramMotionEvent, this.xnA);
    if ((this.xns != -1) && (this.xnn == 0)) {
      ab(this.xns, (int)paramMotionEvent.getX() - this.xnw, (int)paramMotionEvent.getY() - this.xnx);
    }
    this.xnq = false;
    this.xnD = true;
    this.xnF = 0;
    if (this.kri == 1) {
      i = k(paramMotionEvent, this.xnC);
    }
    this.xnt = i;
    GMTrace.o(13049452822528L, 97226);
    return true;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(13049855475712L, 97229);
    GMTrace.o(13049855475712L, 97229);
    return false;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    GMTrace.i(13049721257984L, 97228);
    if ((this.xns != -1) && (this.xnn == 2))
    {
      this.xnE.performHapticFeedback(0);
      ab(this.xns, this.inf - this.xnw, this.ing - this.xnx);
    }
    GMTrace.o(13049721257984L, 97228);
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(13049587040256L, 97227);
    int i = (int)paramMotionEvent1.getX();
    int j = (int)paramMotionEvent1.getY();
    int k = (int)paramMotionEvent2.getX();
    int m = (int)paramMotionEvent2.getY();
    int n = k - this.xnw;
    int i1 = m - this.xnx;
    if ((this.xnD) && (!this.xny) && ((this.xns != -1) || (this.xnt != -1)))
    {
      if (this.xns == -1) {
        break label197;
      }
      if ((this.xnn != 1) || (Math.abs(m - j) <= this.hQ) || (!this.xno)) {
        break label147;
      }
      ab(this.xns, n, i1);
    }
    for (;;)
    {
      GMTrace.o(13049587040256L, 97227);
      return false;
      label147:
      if ((this.xnn != 0) && (Math.abs(k - i) > this.hQ) && (this.xnp))
      {
        this.xnq = true;
        ab(this.xnt, n, i1);
        continue;
        label197:
        if (this.xnt != -1) {
          if ((Math.abs(k - i) > this.hQ) && (this.xnp))
          {
            this.xnq = true;
            ab(this.xnt, n, i1);
          }
          else if (Math.abs(m - j) > this.hQ)
          {
            this.xnD = false;
          }
        }
      }
    }
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent)
  {
    GMTrace.i(13050123911168L, 97231);
    GMTrace.o(13050123911168L, 97231);
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    GMTrace.i(13049989693440L, 97230);
    if ((this.xnp) && (this.kri == 0) && (this.xnu != -1))
    {
      paramMotionEvent = this.xnE;
      int i = this.xnu;
      int j = this.xnE.getHeaderViewsCount();
      paramMotionEvent.xoM = false;
      paramMotionEvent.l(i - j, 0.0F);
    }
    GMTrace.o(13049989693440L, 97230);
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(13049050169344L, 97223);
    if ((!this.xnE.xob) || (this.xnE.xoO))
    {
      GMTrace.o(13049050169344L, 97223);
      return false;
    }
    this.wm.onTouchEvent(paramMotionEvent);
    if ((this.xnp) && (this.xny) && (this.kri == 1)) {
      this.xnr.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
    case 0: 
      for (;;)
      {
        GMTrace.o(13049050169344L, 97223);
        return false;
        this.inf = ((int)paramMotionEvent.getX());
        this.ing = ((int)paramMotionEvent.getY());
      }
    case 1: 
      if ((this.xnp) && (this.xnq)) {
        if (this.xnF < 0) {
          break label213;
        }
      }
      break;
    }
    label213:
    for (int i = this.xnF;; i = -this.xnF)
    {
      if (i > this.xnE.getWidth() / 2) {
        this.xnE.ax(0.0F);
      }
      this.xnq = false;
      this.xny = false;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */