package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.sdk.platformtools.w;

public class TouchInterceptorListView
  extends ListView
{
  private Rect dF;
  private final int hQ;
  private GestureDetector imP;
  private int kgD;
  private ImageView kqU;
  private WindowManager kqV;
  private WindowManager.LayoutParams kqW;
  private int kqX;
  private int kqY;
  private int kqZ;
  private int kra;
  private int krb;
  private int krc;
  private a krd;
  private b kre;
  private c krf;
  private int krg;
  private int krh;
  private int kri;
  private Bitmap krj;
  private int krk;
  private int krl;
  private Drawable krm;
  private int krn;
  private int mHeight;
  
  public TouchInterceptorListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11399916945408L, 84936);
    this.kri = -1;
    this.dF = new Rect();
    this.krn = 0;
    this.hQ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    paramContext = getResources();
    this.kgD = (paramContext.getDimensionPixelSize(R.f.aRS) + 1);
    this.krl = (this.kgD / 2);
    this.krk = (this.kgD * 2);
    this.krn = paramContext.getDimensionPixelOffset(R.f.aRV);
    GMTrace.o(11399916945408L, 84936);
  }
  
  private void asR()
  {
    GMTrace.i(11400588034048L, 84941);
    if (this.kqU != null)
    {
      this.kqU.setVisibility(8);
      ((WindowManager)getContext().getSystemService("window")).removeView(this.kqU);
      this.kqU.setImageDrawable(null);
      this.kqU = null;
    }
    if (this.krj != null)
    {
      w.i("MicroMsg.emoji.TouchInterceptorListView", "bitmap recycle %s", new Object[] { this.krj });
      this.krj.recycle();
      this.krj = null;
    }
    if (this.krm != null) {
      this.krm.setLevel(0);
    }
    GMTrace.o(11400588034048L, 84941);
  }
  
  private int bX(int paramInt1, int paramInt2)
  {
    GMTrace.i(11400185380864L, 84938);
    if (paramInt2 < 0)
    {
      i = bX(paramInt1, this.kgD + paramInt2);
      if (i > 0)
      {
        GMTrace.o(11400185380864L, 84938);
        return i - 1;
      }
    }
    Rect localRect = this.dF;
    int i = getChildCount() - 1;
    while (i >= 0)
    {
      getChildAt(i).getHitRect(localRect);
      if (localRect.contains(paramInt1, paramInt2))
      {
        paramInt1 = getFirstVisiblePosition();
        GMTrace.o(11400185380864L, 84938);
        return i + paramInt1;
      }
      i -= 1;
    }
    GMTrace.o(11400185380864L, 84938);
    return -1;
  }
  
  private void dT(boolean paramBoolean)
  {
    GMTrace.i(11400319598592L, 84939);
    int i = 0;
    for (;;)
    {
      Object localObject1 = getChildAt(i);
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        if (paramBoolean)
        {
          int j = getFirstVisiblePosition();
          int k = getChildAt(0).getTop();
          setAdapter(getAdapter());
          setSelectionFromTop(j, k);
        }
      }
      try
      {
        layoutChildren();
        localObject2 = getChildAt(i);
        localObject1 = localObject2;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;) {}
      }
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        GMTrace.o(11400319598592L, 84939);
        return;
      }
      localObject1 = ((View)localObject2).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = this.kgD;
      ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ((View)localObject2).setVisibility(0);
      i += 1;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11400051163136L, 84937);
    if ((this.krf != null) && (this.imP == null) && (this.kri == 0)) {
      this.imP = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()
      {
        public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          GMTrace.i(11393608712192L, 84889);
          if (TouchInterceptorListView.a(TouchInterceptorListView.this) != null)
          {
            if (paramAnonymousFloat1 > 1000.0F)
            {
              paramAnonymousMotionEvent1 = TouchInterceptorListView.b(TouchInterceptorListView.this);
              TouchInterceptorListView.a(TouchInterceptorListView.this).getDrawingRect(paramAnonymousMotionEvent1);
              if (paramAnonymousMotionEvent2.getX() > paramAnonymousMotionEvent1.right * 2 / 3)
              {
                TouchInterceptorListView.c(TouchInterceptorListView.this);
                TouchInterceptorListView.d(TouchInterceptorListView.this);
              }
            }
            GMTrace.o(11393608712192L, 84889);
            return true;
          }
          GMTrace.o(11393608712192L, 84889);
          return false;
        }
      });
    }
    if ((this.krd != null) || (this.kre != null)) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(11400051163136L, 84937);
      return bool;
      int j = (int)paramMotionEvent.getX();
      int i = (int)paramMotionEvent.getY();
      int k = pointToPosition(j, i);
      if (k != -1)
      {
        Object localObject = (ViewGroup)getChildAt(k - getFirstVisiblePosition());
        this.kqZ = (j - ((ViewGroup)localObject).getLeft());
        this.kra = (i - ((ViewGroup)localObject).getTop());
        this.krb = ((int)paramMotionEvent.getRawX() - j);
        this.krc = ((int)paramMotionEvent.getRawY() - i);
        if (j < this.krn)
        {
          ((ViewGroup)localObject).setDrawingCacheEnabled(true);
          paramMotionEvent = Bitmap.createBitmap(((ViewGroup)localObject).getDrawingCache());
          asR();
          this.kqW = new WindowManager.LayoutParams();
          this.kqW.gravity = 49;
          this.kqW.x = (j - this.kqZ + this.krb);
          this.kqW.y = (i - this.kra + this.krc);
          this.kqW.height = -2;
          this.kqW.width = -2;
          this.kqW.flags = 920;
          this.kqW.format = -3;
          this.kqW.windowAnimations = 0;
          localObject = getContext();
          ImageView localImageView = new ImageView((Context)localObject);
          localImageView.setBackgroundColor(((Context)localObject).getResources().getColor(R.e.white));
          localImageView.setBackgroundResource(R.g.aWo);
          localImageView.setPadding(0, 0, 0, 0);
          localImageView.setImageBitmap(paramMotionEvent);
          this.krj = paramMotionEvent;
          this.kqV = ((WindowManager)((Context)localObject).getSystemService("window"));
          this.kqV.addView(localImageView, this.kqW);
          this.kqU = localImageView;
          this.kqX = k;
          this.kqY = this.kqX;
          this.mHeight = getHeight();
          j = this.hQ;
          this.krg = Math.min(i - j, this.mHeight / 3);
          this.krh = Math.max(j + i, this.mHeight * 2 / 3);
          GMTrace.o(11400051163136L, 84937);
          return false;
        }
        asR();
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = 4;
    int m = 0;
    GMTrace.i(11400453816320L, 84940);
    if (this.imP != null) {
      this.imP.onTouchEvent(paramMotionEvent);
    }
    if (((this.krd != null) || (this.kre != null)) && (this.kqU != null))
    {
      int k = paramMotionEvent.getAction();
      Object localObject;
      switch (k)
      {
      default: 
      case 1: 
      case 3: 
        for (;;)
        {
          GMTrace.o(11400453816320L, 84940);
          return true;
          localObject = this.dF;
          this.kqU.getDrawingRect((Rect)localObject);
          asR();
          if ((this.kri == 1) && (paramMotionEvent.getX() > ((Rect)localObject).right * 3 / 4))
          {
            dT(true);
          }
          else
          {
            if ((this.kre != null) && (this.kqX >= 0)) {
              getCount();
            }
            dT(false);
          }
        }
      }
      int i = (int)paramMotionEvent.getX();
      int i2 = (int)paramMotionEvent.getY();
      if (this.kri == 1)
      {
        float f = 1.0F;
        j = this.kqU.getWidth();
        if (i > j / 2) {
          f = (j - i) / (j / 2);
        }
        this.kqW.alpha = f;
      }
      label276:
      label350:
      int i1;
      label395:
      int i3;
      int i4;
      int i5;
      if ((this.kri == 0) || (this.kri == 2))
      {
        this.kqW.x = (i - this.kqZ + this.krb);
        this.kqW.y = (i2 - this.kra + this.krc);
        this.kqV.updateViewLayout(this.kqU, this.kqW);
        if (this.krm != null)
        {
          j = this.kqU.getWidth();
          if (i2 <= getHeight() * 3 / 4) {
            break label635;
          }
          this.krm.setLevel(2);
        }
        i1 = i2 - this.kra - this.krl;
        j = bX(0, i1);
        if (j < 0) {
          break label672;
        }
        i = j;
        if (j <= this.kqY) {
          i = j + 1;
        }
        if (i < 0) {
          break label683;
        }
        if ((k != 0) && (i == this.kqX)) {
          break label853;
        }
        this.kqX = i;
        w.d("MicroMsg.emoji.TouchInterceptorListView", "doExpansion mDragPos:%d mSrcDragPos:%d", new Object[] { Integer.valueOf(this.kqX), Integer.valueOf(this.kqY) });
        w.d("MicroMsg.emoji.TouchInterceptorListView", "getFirstVisiblePosition:%d", new Object[] { Integer.valueOf(getFirstVisiblePosition()) });
        w.d("MicroMsg.emoji.TouchInterceptorListView", "getHeaderViewsCount:%d", new Object[] { Integer.valueOf(getHeaderViewsCount()) });
        i3 = this.kqX;
        i4 = getFirstVisiblePosition();
        i5 = getHeaderViewsCount();
        paramMotionEvent = getChildAt(this.kqY - getFirstVisiblePosition());
        k = 0;
        label528:
        localObject = getChildAt(k);
        if (localObject == null) {
          break label853;
        }
        i = this.kgD;
        if ((this.kqX >= i5) || (k != i5)) {
          break label704;
        }
        if (!localObject.equals(paramMotionEvent)) {
          break label685;
        }
        w.d("MicroMsg.emoji.TouchInterceptorListView", "1. visibility = View.INVISIBLE");
        i1 = 4;
        j = i;
        i = i1;
      }
      for (;;)
      {
        ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
        localLayoutParams.height = j;
        ((View)localObject).setLayoutParams(localLayoutParams);
        ((View)localObject).setVisibility(i);
        k += 1;
        break label528;
        this.kqW.x = 0;
        break label276;
        label635:
        if ((j > 0) && (i > j / 4))
        {
          this.krm.setLevel(1);
          break label350;
        }
        this.krm.setLevel(0);
        break label350;
        label672:
        i = j;
        if (i1 >= 0) {
          break label395;
        }
        i = 0;
        break label395;
        label683:
        break;
        label685:
        j = this.krk;
        w.d("MicroMsg.emoji.TouchInterceptorListView", "1. height = mItemHeightExpanded");
        i = 0;
        continue;
        label704:
        if (localObject.equals(paramMotionEvent))
        {
          if ((this.kqX == this.kqY) || (getPositionForView((View)localObject) == getCount()))
          {
            j = this.kgD;
            w.d("MicroMsg.emoji.TouchInterceptorListView", "2. visibility = View.INVISIBLE");
            i = 4;
          }
          else
          {
            w.d("MicroMsg.emoji.TouchInterceptorListView", "2. height = 1");
            i = 0;
            j = 1;
          }
        }
        else if (k == i3 - i4)
        {
          if ((this.kqX >= i5) && (this.kqX < getCount()))
          {
            j = this.krk;
            w.d("MicroMsg.emoji.TouchInterceptorListView", "3. height = mItemHeightExpanded;");
            i = 0;
          }
          else
          {
            w.d("MicroMsg.emoji.TouchInterceptorListView", "3. ");
            j = i;
            i = 0;
          }
        }
        else
        {
          w.d("MicroMsg.emoji.TouchInterceptorListView", "4");
          j = i;
          i = 0;
        }
      }
      label853:
      if (i2 >= this.mHeight / 3) {
        this.krg = (this.mHeight / 3);
      }
      if (i2 <= this.mHeight * 2 / 3) {
        this.krh = (this.mHeight * 2 / 3);
      }
      if (i2 > this.krh) {
        if (getLastVisiblePosition() < getCount() - 1)
        {
          i = n;
          if (i2 > (this.mHeight + this.krh) / 2) {
            i = 16;
          }
        }
      }
      for (;;)
      {
        label943:
        if ((i != 0) && (!f.eu(8)))
        {
          smoothScrollBy(i, 30);
          break;
          i = 1;
          continue;
          i = m;
          if (i2 < this.krg) {
            if (i2 >= this.krg / 2) {
              break label1028;
            }
          }
        }
      }
      label1028:
      for (int j = -16;; j = -4)
      {
        if (getFirstVisiblePosition() == 0)
        {
          i = m;
          if (getChildAt(0).getTop() >= getPaddingTop()) {
            break label943;
          }
        }
        i = j;
        break label943;
        break;
      }
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(11400453816320L, 84940);
    return bool;
  }
  
  public static abstract interface a {}
  
  public static abstract interface b {}
  
  public static abstract interface c {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\TouchInterceptorListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */