package com.tencent.mm.ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;
import java.util.Queue;

public class MMHorList
  extends AdapterView<ListAdapter>
{
  public boolean nsy;
  private int offset;
  public a wcS;
  private int wcT;
  private int wcU;
  public int wcV;
  private int wcW;
  private int wcX;
  private Queue<View> wcY;
  private boolean wcZ;
  private boolean wda;
  protected Scroller wdb;
  private GestureDetector wdc;
  private AdapterView.OnItemSelectedListener wdd;
  private AdapterView.OnItemClickListener wde;
  private ListAdapter wdf;
  private Runnable wdg;
  public boolean wdh;
  public boolean wdi;
  public int wdj;
  private int wdk;
  private boolean wdl;
  private DataSetObserver wdm;
  private GestureDetector.OnGestureListener wdn;
  
  public MMHorList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3322559856640L, 24755);
    this.wcX = 536870912;
    this.wcY = new LinkedList();
    this.wcZ = false;
    this.wda = false;
    this.wdg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3340947685376L, 24892);
        MMHorList.this.requestLayout();
        GMTrace.o(3340947685376L, 24892);
      }
    };
    this.wdh = false;
    this.wdi = false;
    this.wdj = 0;
    this.wdk = 0;
    this.nsy = false;
    this.wdl = false;
    this.wdm = new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(3351819321344L, 24973);
        MMHorList.a(MMHorList.this);
        MMHorList.this.invalidate();
        MMHorList.this.requestLayout();
        GMTrace.o(3351819321344L, 24973);
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(3351953539072L, 24974);
        MMHorList.b(MMHorList.this);
        MMHorList.this.invalidate();
        MMHorList.this.requestLayout();
        GMTrace.o(3351953539072L, 24974);
      }
    };
    this.wdn = new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDown(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3337994895360L, 24870);
        boolean bool = MMHorList.this.bZt();
        GMTrace.o(3337994895360L, 24870);
        return bool;
      }
      
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(3338129113088L, 24871);
        boolean bool = MMHorList.this.av(paramAnonymousFloat1);
        GMTrace.o(3338129113088L, 24871);
        return bool;
      }
      
      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(3338263330816L, 24872);
        MMHorList.a(MMHorList.this, MMHorList.c(MMHorList.this) + (int)paramAnonymousFloat1);
        MMHorList.this.requestLayout();
        GMTrace.o(3338263330816L, 24872);
        return true;
      }
      
      public final boolean onSingleTapConfirmed(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3338397548544L, 24873);
        Rect localRect = new Rect();
        int i = 0;
        for (;;)
        {
          if (i < MMHorList.this.getChildCount())
          {
            View localView = MMHorList.this.getChildAt(i);
            int j = localView.getLeft();
            int k = localView.getRight();
            localRect.set(j, localView.getTop(), k, localView.getBottom());
            if (!localRect.contains((int)paramAnonymousMotionEvent.getX(), (int)paramAnonymousMotionEvent.getY())) {
              break label225;
            }
            if (MMHorList.d(MMHorList.this) != null) {
              MMHorList.d(MMHorList.this).onItemClick(MMHorList.this, localView, MMHorList.e(MMHorList.this) + 1 + i, MMHorList.f(MMHorList.this).getItemId(MMHorList.e(MMHorList.this) + 1 + i));
            }
            if (MMHorList.g(MMHorList.this) != null) {
              MMHorList.g(MMHorList.this).onItemSelected(MMHorList.this, localView, MMHorList.e(MMHorList.this) + 1 + i, MMHorList.f(MMHorList.this).getItemId(MMHorList.e(MMHorList.this) + 1 + i));
            }
          }
          GMTrace.o(3338397548544L, 24873);
          return true;
          label225:
          i += 1;
        }
      }
    };
    init();
    GMTrace.o(3322559856640L, 24755);
  }
  
  public MMHorList(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3322157203456L, 24752);
    this.wcX = 536870912;
    this.wcY = new LinkedList();
    this.wcZ = false;
    this.wda = false;
    this.wdg = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3340947685376L, 24892);
        MMHorList.this.requestLayout();
        GMTrace.o(3340947685376L, 24892);
      }
    };
    this.wdh = false;
    this.wdi = false;
    this.wdj = 0;
    this.wdk = 0;
    this.nsy = false;
    this.wdl = false;
    this.wdm = new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(3351819321344L, 24973);
        MMHorList.a(MMHorList.this);
        MMHorList.this.invalidate();
        MMHorList.this.requestLayout();
        GMTrace.o(3351819321344L, 24973);
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(3351953539072L, 24974);
        MMHorList.b(MMHorList.this);
        MMHorList.this.invalidate();
        MMHorList.this.requestLayout();
        GMTrace.o(3351953539072L, 24974);
      }
    };
    this.wdn = new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDown(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3337994895360L, 24870);
        boolean bool = MMHorList.this.bZt();
        GMTrace.o(3337994895360L, 24870);
        return bool;
      }
      
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(3338129113088L, 24871);
        boolean bool = MMHorList.this.av(paramAnonymousFloat1);
        GMTrace.o(3338129113088L, 24871);
        return bool;
      }
      
      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(3338263330816L, 24872);
        MMHorList.a(MMHorList.this, MMHorList.c(MMHorList.this) + (int)paramAnonymousFloat1);
        MMHorList.this.requestLayout();
        GMTrace.o(3338263330816L, 24872);
        return true;
      }
      
      public final boolean onSingleTapConfirmed(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3338397548544L, 24873);
        Rect localRect = new Rect();
        int i = 0;
        for (;;)
        {
          if (i < MMHorList.this.getChildCount())
          {
            View localView = MMHorList.this.getChildAt(i);
            int j = localView.getLeft();
            int k = localView.getRight();
            localRect.set(j, localView.getTop(), k, localView.getBottom());
            if (!localRect.contains((int)paramAnonymousMotionEvent.getX(), (int)paramAnonymousMotionEvent.getY())) {
              break label225;
            }
            if (MMHorList.d(MMHorList.this) != null) {
              MMHorList.d(MMHorList.this).onItemClick(MMHorList.this, localView, MMHorList.e(MMHorList.this) + 1 + i, MMHorList.f(MMHorList.this).getItemId(MMHorList.e(MMHorList.this) + 1 + i));
            }
            if (MMHorList.g(MMHorList.this) != null) {
              MMHorList.g(MMHorList.this).onItemSelected(MMHorList.this, localView, MMHorList.e(MMHorList.this) + 1 + i, MMHorList.f(MMHorList.this).getItemId(MMHorList.e(MMHorList.this) + 1 + i));
            }
          }
          GMTrace.o(3338397548544L, 24873);
          return true;
          label225:
          i += 1;
        }
      }
    };
    init();
    GMTrace.o(3322157203456L, 24752);
  }
  
  private void G(View paramView, int paramInt)
  {
    GMTrace.i(3323096727552L, 24759);
    this.wda = true;
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -1);
    }
    addViewInLayout(paramView, paramInt, localLayoutParams1, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    GMTrace.o(3323096727552L, 24759);
  }
  
  private int bZW()
  {
    GMTrace.i(3322828292096L, 24757);
    int i = this.wdf.getCount();
    int j = this.wdj;
    GMTrace.o(3322828292096L, 24757);
    return i * j;
  }
  
  private void init()
  {
    GMTrace.i(3322022985728L, 24751);
    this.wdb = new Scroller(getContext());
    this.wcT = -1;
    this.wcU = 0;
    this.offset = 0;
    this.wcV = 0;
    this.wcW = 0;
    this.wcZ = false;
    this.wcX = 536870912;
    this.wdc = new GestureDetector(getContext(), this.wdn);
    GMTrace.o(3322022985728L, 24751);
  }
  
  private void reset()
  {
    GMTrace.i(3324304687104L, 24768);
    init();
    removeAllViewsInLayout();
    requestLayout();
    GMTrace.o(3324304687104L, 24768);
  }
  
  public final void Ca(int paramInt)
  {
    GMTrace.i(3323902033920L, 24765);
    this.wdb.forceFinished(true);
    this.wdb.startScroll(this.wcV, 0, paramInt - this.wcV, 0);
    this.wdl = true;
    requestLayout();
    GMTrace.o(3323902033920L, 24765);
  }
  
  protected final boolean av(float paramFloat)
  {
    GMTrace.i(3324170469376L, 24767);
    this.wdb.fling(this.wcW, 0, (int)-paramFloat, 0, 0, this.wcX, 0, 0);
    requestLayout();
    GMTrace.o(3324170469376L, 24767);
    return true;
  }
  
  protected final boolean bZt()
  {
    GMTrace.i(3323767816192L, 24764);
    this.wdb.forceFinished(true);
    GMTrace.o(3323767816192L, 24764);
    return true;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3323633598464L, 24763);
    boolean bool = this.wdc.onTouchEvent(paramMotionEvent);
    if (paramMotionEvent.getAction() == 0)
    {
      this.nsy = true;
      if (this.wcS != null) {
        this.wcS.bsD();
      }
    }
    while ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1))
    {
      GMTrace.o(3323633598464L, 24763);
      return bool;
    }
    if (this.wdi)
    {
      if (bZW() <= getWidth()) {
        break label201;
      }
      if (this.wcV >= 0) {
        break label153;
      }
      this.wdb.forceFinished(true);
      this.wdb.startScroll(this.wcV, 0, 0 - this.wcV, 0);
      requestLayout();
    }
    for (;;)
    {
      this.nsy = false;
      if (this.wcS == null) {
        break;
      }
      this.wcS.bsE();
      break;
      label153:
      if (this.wcV > this.wcX)
      {
        this.wdb.forceFinished(true);
        this.wdb.startScroll(this.wcV, 0, this.wcX - this.wcV, 0);
        requestLayout();
        continue;
        label201:
        if (this.wcV != this.wdk * -1)
        {
          this.wdb.forceFinished(true);
          this.wdb.startScroll(this.wcV, 0, 0 - this.wcV, 0);
          requestLayout();
        }
      }
    }
  }
  
  public View getSelectedView()
  {
    GMTrace.i(3323230945280L, 24760);
    GMTrace.o(3323230945280L, 24760);
    return null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3322962509824L, 24758);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.wdf == null)
    {
      GMTrace.o(3322962509824L, 24758);
      return;
    }
    this.wda = true;
    if (this.wcZ)
    {
      paramInt1 = this.wcV;
      init();
      removeAllViewsInLayout();
      this.wcW = paramInt1;
      if (this.wdh)
      {
        this.wdk = Math.max(0, (getWidth() - bZW()) / 2);
        this.offset = this.wdk;
      }
      this.wcZ = false;
    }
    if (this.wdb.computeScrollOffset()) {
      this.wcW = this.wdb.getCurrX();
    }
    if (this.wdi) {
      if (bZW() > getWidth())
      {
        if (this.wcW < getWidth() * -1)
        {
          this.wcW = (getWidth() * -1 + 1);
          this.wdb.forceFinished(true);
        }
        if (this.wcW > this.wcX + getWidth())
        {
          this.wcW = (this.wcX + getWidth() - 1);
          this.wdb.forceFinished(true);
        }
      }
    }
    for (;;)
    {
      paramInt2 = this.wcV - this.wcW;
      localView = getChildAt(0);
      while ((localView != null) && (localView.getRight() + paramInt2 <= 0))
      {
        this.offset += localView.getMeasuredWidth();
        this.wcY.offer(localView);
        removeViewInLayout(localView);
        this.wcT += 1;
        localView = getChildAt(0);
        this.wda = true;
      }
      if (this.wcW < getWidth() * -1 + this.wdk)
      {
        this.wcW = (getWidth() * -1 + this.wdk + 1);
        this.wdb.forceFinished(true);
      }
      if (this.wcW > getWidth() - this.wdk)
      {
        this.wcW = (getWidth() - this.wdk - 1);
        this.wdb.forceFinished(true);
        continue;
        if (this.wcW < 0)
        {
          this.wcW = 0;
          this.wdb.forceFinished(true);
        }
        if (this.wcW > this.wcX)
        {
          this.wcW = this.wcX;
          this.wdb.forceFinished(true);
        }
      }
    }
    View localView = getChildAt(getChildCount() - 1);
    while ((localView != null) && (localView.getLeft() + paramInt2 >= getWidth()))
    {
      this.wcY.offer(localView);
      removeViewInLayout(localView);
      this.wcU -= 1;
      localView = getChildAt(getChildCount() - 1);
      this.wda = true;
    }
    localView = getChildAt(getChildCount() - 1);
    if (localView != null) {
      paramInt1 = localView.getRight();
    }
    for (;;)
    {
      if ((paramInt1 + paramInt2 < getWidth()) && (this.wcU < this.wdf.getCount()))
      {
        localView = this.wdf.getView(this.wcU, (View)this.wcY.poll(), this);
        G(localView, -1);
        paramInt1 = localView.getMeasuredWidth() + paramInt1;
        if (this.wcU == this.wdf.getCount() - 1) {
          this.wcX = (this.wcV + paramInt1 - getWidth());
        }
        this.wcU += 1;
      }
      else
      {
        localView = getChildAt(0);
        if (localView != null) {
          paramInt1 = localView.getLeft();
        }
        for (;;)
        {
          if ((paramInt1 + paramInt2 > 0) && (this.wcT >= 0))
          {
            localView = this.wdf.getView(this.wcT, (View)this.wcY.poll(), this);
            G(localView, 0);
            paramInt3 = localView.getMeasuredWidth();
            this.wcT -= 1;
            this.offset -= localView.getMeasuredWidth();
            paramInt1 -= paramInt3;
          }
          else
          {
            if ((getChildCount() > 0) && (this.wda))
            {
              this.offset += paramInt2;
              paramInt2 = this.offset;
              paramInt1 = 0;
              while (paramInt1 < getChildCount())
              {
                localView = getChildAt(paramInt1);
                paramInt3 = localView.getMeasuredWidth();
                localView.layout(paramInt2, 0, paramInt2 + paramInt3, localView.getMeasuredHeight());
                paramInt2 += paramInt3;
                paramInt1 += 1;
              }
            }
            this.wcV = this.wcW;
            if (!this.wdb.isFinished())
            {
              post(this.wdg);
              GMTrace.o(3322962509824L, 24758);
              return;
            }
            if ((this.wcS != null) && (this.wdl))
            {
              this.wcS.aMy();
              this.wdl = false;
            }
            GMTrace.o(3322962509824L, 24758);
            return;
            paramInt1 = 0;
          }
        }
        paramInt1 = 0;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3323499380736L, 24762);
    if ((this.wdf != null) && (this.wdf.getCount() > 0))
    {
      View localView = getChildAt(0);
      if (localView != null)
      {
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), Integer.MIN_VALUE));
        GMTrace.o(3323499380736L, 24762);
        return;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(3323499380736L, 24762);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3324036251648L, 24766);
    GMTrace.o(3324036251648L, 24766);
    return false;
  }
  
  public final void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(3322694074368L, 24756);
    if (this.wdf == null) {
      paramListAdapter.registerDataSetObserver(this.wdm);
    }
    this.wdf = paramListAdapter;
    reset();
    GMTrace.o(3322694074368L, 24756);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(3322425638912L, 24754);
    this.wde = paramOnItemClickListener;
    GMTrace.o(3322425638912L, 24754);
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    GMTrace.i(3322291421184L, 24753);
    this.wdd = paramOnItemSelectedListener;
    GMTrace.o(3322291421184L, 24753);
  }
  
  public void setSelection(int paramInt)
  {
    GMTrace.i(3323365163008L, 24761);
    GMTrace.o(3323365163008L, 24761);
  }
  
  public static abstract interface a
  {
    public abstract void aMy();
    
    public abstract void bsD();
    
    public abstract void bsE();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMHorList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */