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

public class HorizontalListView
  extends AdapterView<ListAdapter>
{
  protected ListAdapter EP;
  public a tBm;
  private AdapterView.OnItemSelectedListener vZA;
  private AdapterView.OnItemClickListener vZB;
  private boolean vZC;
  private DataSetObserver vZD;
  private GestureDetector.OnGestureListener vZE;
  public boolean vZr;
  private int vZs;
  private int vZt;
  protected int vZu;
  protected int vZv;
  private int vZw;
  private int vZx;
  private GestureDetector vZy;
  private Queue<View> vZz;
  protected Scroller xM;
  
  public HorizontalListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3173175525376L, 23642);
    this.vZr = true;
    this.vZs = -1;
    this.vZt = 0;
    this.vZw = Integer.MAX_VALUE;
    this.vZx = 0;
    this.vZz = new LinkedList();
    this.vZC = false;
    this.vZD = new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(3342021427200L, 24900);
        synchronized (HorizontalListView.this)
        {
          HorizontalListView.a(HorizontalListView.this);
          HorizontalListView.this.invalidate();
          HorizontalListView.this.requestLayout();
          GMTrace.o(3342021427200L, 24900);
          return;
        }
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(3342155644928L, 24901);
        HorizontalListView.b(HorizontalListView.this);
        HorizontalListView.this.invalidate();
        HorizontalListView.this.requestLayout();
        GMTrace.o(3342155644928L, 24901);
      }
    };
    this.vZE = new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDown(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3353698369536L, 24987);
        boolean bool = HorizontalListView.this.bZt();
        GMTrace.o(3353698369536L, 24987);
        return bool;
      }
      
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(3353832587264L, 24988);
        boolean bool = HorizontalListView.this.av(paramAnonymousFloat1);
        GMTrace.o(3353832587264L, 24988);
        return bool;
      }
      
      public final boolean onScroll(MotionEvent arg1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(3353966804992L, 24989);
        synchronized (HorizontalListView.this)
        {
          paramAnonymousMotionEvent2 = HorizontalListView.this;
          paramAnonymousMotionEvent2.vZv += (int)paramAnonymousFloat1;
          HorizontalListView.this.requestLayout();
          GMTrace.o(3353966804992L, 24989);
          return true;
        }
      }
      
      public final boolean onSingleTapConfirmed(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3354101022720L, 24990);
        Rect localRect = new Rect();
        int i = 0;
        for (;;)
        {
          if (i < HorizontalListView.this.getChildCount())
          {
            View localView = HorizontalListView.this.getChildAt(i);
            int j = localView.getLeft();
            int k = localView.getRight();
            localRect.set(j, localView.getTop(), k, localView.getBottom());
            if (!localRect.contains((int)paramAnonymousMotionEvent.getX(), (int)paramAnonymousMotionEvent.getY())) {
              break label225;
            }
            if (HorizontalListView.c(HorizontalListView.this) != null) {
              HorizontalListView.c(HorizontalListView.this).onItemClick(HorizontalListView.this, localView, HorizontalListView.d(HorizontalListView.this) + 1 + i, HorizontalListView.this.EP.getItemId(HorizontalListView.d(HorizontalListView.this) + 1 + i));
            }
            if (HorizontalListView.e(HorizontalListView.this) != null) {
              HorizontalListView.e(HorizontalListView.this).onItemSelected(HorizontalListView.this, localView, HorizontalListView.d(HorizontalListView.this) + 1 + i, HorizontalListView.this.EP.getItemId(HorizontalListView.d(HorizontalListView.this) + 1 + i));
            }
          }
          GMTrace.o(3354101022720L, 24990);
          return true;
          label225:
          i += 1;
        }
      }
    };
    MP();
    GMTrace.o(3173175525376L, 23642);
  }
  
  private void G(View paramView, int paramInt)
  {
    GMTrace.i(3174249267200L, 23650);
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -1);
    }
    addViewInLayout(paramView, paramInt, localLayoutParams1, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    GMTrace.o(3174249267200L, 23650);
  }
  
  private void MP()
  {
    try
    {
      GMTrace.i(3173309743104L, 23643);
      this.vZs = -1;
      this.vZt = 0;
      this.vZx = 0;
      this.vZu = 0;
      this.vZv = 0;
      this.vZw = Integer.MAX_VALUE;
      this.xM = new Scroller(getContext());
      this.vZy = new GestureDetector(getContext(), this.vZE);
      GMTrace.o(3173309743104L, 23643);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void reset()
  {
    try
    {
      GMTrace.i(3173980831744L, 23648);
      MP();
      removeAllViewsInLayout();
      requestLayout();
      GMTrace.o(3173980831744L, 23648);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final boolean av(float paramFloat)
  {
    GMTrace.i(3174651920384L, 23653);
    try
    {
      this.xM.fling(this.vZv, 0, (int)-paramFloat, 0, 0, this.vZw, 0, 0);
      requestLayout();
      GMTrace.o(3174651920384L, 23653);
      return true;
    }
    finally {}
  }
  
  protected final boolean bZt()
  {
    GMTrace.i(3174786138112L, 23654);
    this.xM.forceFinished(true);
    GMTrace.o(3174786138112L, 23654);
    return true;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3174517702656L, 23652);
    if (this.tBm != null) {
      this.tBm.q(paramMotionEvent);
    }
    boolean bool1 = super.dispatchTouchEvent(paramMotionEvent);
    boolean bool2 = this.vZy.onTouchEvent(paramMotionEvent);
    GMTrace.o(3174517702656L, 23652);
    return bool1 | bool2;
  }
  
  public View getSelectedView()
  {
    GMTrace.i(3173712396288L, 23646);
    GMTrace.o(3173712396288L, 23646);
    return null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    try
    {
      GMTrace.i(3174383484928L, 23651);
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.EP == null)
      {
        GMTrace.o(3174383484928L, 23651);
        return;
      }
      if (this.vZC)
      {
        paramInt1 = this.vZu;
        MP();
        removeAllViewsInLayout();
        this.vZv = paramInt1;
        this.vZC = false;
      }
      if (this.xM.computeScrollOffset()) {
        this.vZv = this.xM.getCurrX();
      }
      if (this.vZv <= 0)
      {
        this.vZv = 0;
        this.xM.forceFinished(true);
      }
      if (this.vZv >= this.vZw)
      {
        this.vZv = this.vZw;
        this.xM.forceFinished(true);
      }
      paramInt2 = this.vZu - this.vZv;
      for (View localView1 = getChildAt(0); (localView1 != null) && (localView1.getRight() + paramInt2 <= 0); localView1 = getChildAt(0))
      {
        this.vZx += localView1.getMeasuredWidth();
        this.vZz.offer(localView1);
        removeViewInLayout(localView1);
        this.vZs += 1;
      }
      for (;;)
      {
        localView1 = getChildAt(getChildCount() - 1);
        if ((localView1 == null) || (localView1.getLeft() + paramInt2 < getWidth())) {
          break;
        }
        this.vZz.offer(localView1);
        removeViewInLayout(localView1);
        this.vZt -= 1;
      }
      localView2 = getChildAt(getChildCount() - 1);
    }
    finally {}
    View localView2;
    if (localView2 != null)
    {
      paramInt1 = localView2.getRight();
      break label681;
      label321:
      while ((paramInt1 + paramInt2 < getWidth()) && (this.vZt < this.EP.getCount()))
      {
        localView2 = this.EP.getView(this.vZt, (View)this.vZz.poll(), this);
        G(localView2, -1);
        paramInt1 = localView2.getMeasuredWidth() + paramInt1;
        if (this.vZt == this.EP.getCount() - 1) {
          this.vZw = (this.vZu + paramInt1 - getWidth());
        }
        if (this.vZw < 0) {
          this.vZw = 0;
        }
        this.vZt += 1;
      }
      localView2 = getChildAt(0);
      if (localView2 != null)
      {
        paramInt1 = localView2.getLeft();
        break label684;
      }
    }
    label681:
    label684:
    for (;;)
    {
      if ((paramInt1 + paramInt2 > 0) && (this.vZs >= 0))
      {
        localView2 = this.EP.getView(this.vZs, (View)this.vZz.poll(), this);
        G(localView2, 0);
        paramInt3 = localView2.getMeasuredWidth();
        this.vZs -= 1;
        this.vZx -= localView2.getMeasuredWidth();
        paramInt1 -= paramInt3;
      }
      else
      {
        if (getChildCount() > 0)
        {
          this.vZx += paramInt2;
          paramInt2 = this.vZx;
          paramInt1 = i;
          while (paramInt1 < getChildCount())
          {
            localView2 = getChildAt(paramInt1);
            paramInt3 = localView2.getMeasuredWidth();
            localView2.layout(paramInt2, 0, paramInt2 + paramInt3, localView2.getMeasuredHeight());
            paramInt2 += paramInt3;
            paramInt1 += 1;
          }
        }
        this.vZu = this.vZv;
        if (!this.xM.isFinished()) {
          post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3314775228416L, 24697);
              HorizontalListView.this.requestLayout();
              GMTrace.o(3314775228416L, 24697);
            }
          });
        }
        GMTrace.o(3174383484928L, 23651);
        break;
        paramInt1 = 0;
        break label684;
        paramInt1 = 0;
        break label321;
      }
    }
  }
  
  public final void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(3173846614016L, 23647);
    if (this.EP != null) {
      this.EP.unregisterDataSetObserver(this.vZD);
    }
    this.EP = paramListAdapter;
    this.EP.registerDataSetObserver(this.vZD);
    reset();
    GMTrace.o(3173846614016L, 23647);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(3173578178560L, 23645);
    this.vZB = paramOnItemClickListener;
    GMTrace.o(3173578178560L, 23645);
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    GMTrace.i(3173443960832L, 23644);
    this.vZA = paramOnItemSelectedListener;
    GMTrace.o(3173443960832L, 23644);
  }
  
  public void setSelection(int paramInt)
  {
    GMTrace.i(3174115049472L, 23649);
    GMTrace.o(3174115049472L, 23649);
  }
  
  public static abstract interface a
  {
    public abstract boolean q(MotionEvent paramMotionEvent);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\HorizontalListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */