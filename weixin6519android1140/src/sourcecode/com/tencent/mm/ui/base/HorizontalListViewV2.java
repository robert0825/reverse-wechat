package com.tencent.mm.ui.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.z;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HorizontalListViewV2
  extends AdapterView<ListAdapter>
{
  protected ListAdapter EP;
  private Drawable Ra;
  private int Rb;
  private Rect eI;
  private GestureDetector imP;
  private View.OnClickListener mOnClickListener;
  private boolean vZC;
  protected Scroller vZG;
  private final a vZH;
  private List<Queue<View>> vZI;
  private View vZJ;
  private Integer vZK;
  private int vZL;
  private int vZM;
  private int vZN;
  private e vZO;
  private int vZP;
  private boolean vZQ;
  public d vZR;
  private int vZS;
  private i vZT;
  private i vZU;
  private int vZV;
  private boolean vZW;
  private boolean vZX;
  private DataSetObserver vZY;
  private Runnable vZZ;
  protected int vZu;
  protected int vZv;
  private int vZw;
  private int vZx;
  
  public HorizontalListViewV2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3191294918656L, 23777);
    this.vZG = new Scroller(getContext());
    this.vZH = new a((byte)0);
    this.vZI = new ArrayList();
    this.vZC = false;
    this.eI = new Rect();
    this.vZJ = null;
    this.Rb = 0;
    this.Ra = null;
    this.vZK = null;
    this.vZw = Integer.MAX_VALUE;
    this.vZO = null;
    this.vZP = 0;
    this.vZQ = false;
    this.vZR = null;
    this.vZS = HorizontalListViewV2.d.a.wab;
    this.vZW = false;
    this.vZX = false;
    this.vZY = new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(3267396370432L, 24344);
        HorizontalListViewV2.b(HorizontalListViewV2.this);
        HorizontalListViewV2.c(HorizontalListViewV2.this);
        HorizontalListViewV2.d(HorizontalListViewV2.this);
        HorizontalListViewV2.this.invalidate();
        HorizontalListViewV2.this.requestLayout();
        GMTrace.o(3267396370432L, 24344);
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(3267530588160L, 24345);
        HorizontalListViewV2.c(HorizontalListViewV2.this);
        HorizontalListViewV2.d(HorizontalListViewV2.this);
        HorizontalListViewV2.e(HorizontalListViewV2.this);
        HorizontalListViewV2.this.invalidate();
        HorizontalListViewV2.this.requestLayout();
        GMTrace.o(3267530588160L, 24345);
      }
    };
    this.vZZ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3351416668160L, 24970);
        HorizontalListViewV2.this.requestLayout();
        GMTrace.o(3351416668160L, 24970);
      }
    };
    this.vZT = new i(paramContext);
    this.vZU = new i(paramContext);
    this.imP = new GestureDetector(paramContext, this.vZH);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3265785757696L, 24332);
        boolean bool = HorizontalListViewV2.a(HorizontalListViewV2.this).onTouchEvent(paramAnonymousMotionEvent);
        GMTrace.o(3265785757696L, 24332);
        return bool;
      }
    });
    MP();
    setWillNotDraw(false);
    if (Build.VERSION.SDK_INT >= 11) {
      b.a(this.vZG);
    }
    GMTrace.o(3191294918656L, 23777);
  }
  
  private View BD(int paramInt)
  {
    GMTrace.i(3192502878208L, 23786);
    paramInt = this.EP.getItemViewType(paramInt);
    if (BE(paramInt))
    {
      View localView = (View)((Queue)this.vZI.get(paramInt)).poll();
      GMTrace.o(3192502878208L, 23786);
      return localView;
    }
    GMTrace.o(3192502878208L, 23786);
    return null;
  }
  
  private boolean BE(int paramInt)
  {
    GMTrace.i(3192771313664L, 23788);
    if (paramInt < this.vZI.size())
    {
      GMTrace.o(3192771313664L, 23788);
      return true;
    }
    GMTrace.o(3192771313664L, 23788);
    return false;
  }
  
  private boolean BF(int paramInt)
  {
    GMTrace.i(3194113490944L, 23798);
    if (paramInt == this.EP.getCount() - 1)
    {
      GMTrace.o(3194113490944L, 23798);
      return true;
    }
    GMTrace.o(3194113490944L, 23798);
    return false;
  }
  
  private void BH(int paramInt)
  {
    GMTrace.i(3196126756864L, 23813);
    if ((this.vZS != paramInt) && (this.vZR != null)) {
      this.vZR.pQ(paramInt);
    }
    this.vZS = paramInt;
    GMTrace.o(3196126756864L, 23813);
  }
  
  private void G(View paramView, int paramInt)
  {
    GMTrace.i(3192905531392L, 23789);
    addViewInLayout(paramView, paramInt, df(paramView), true);
    ViewGroup.LayoutParams localLayoutParams = df(paramView);
    int i = ViewGroup.getChildMeasureSpec(this.vZV, getPaddingTop() + getPaddingBottom(), localLayoutParams.height);
    if (localLayoutParams.width > 0) {}
    for (paramInt = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);; paramInt = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(paramInt, i);
      GMTrace.o(3192905531392L, 23789);
      return;
    }
  }
  
  private void MP()
  {
    GMTrace.i(3191831789568L, 23781);
    this.vZL = -1;
    this.vZM = -1;
    this.vZx = 0;
    this.vZu = 0;
    this.vZv = 0;
    this.vZw = Integer.MAX_VALUE;
    BH(HorizontalListViewV2.d.a.wab);
    GMTrace.o(3191831789568L, 23781);
  }
  
  private void a(Canvas paramCanvas, Rect paramRect)
  {
    GMTrace.i(3194784579584L, 23803);
    if (this.Ra != null)
    {
      this.Ra.setBounds(paramRect);
      this.Ra.draw(paramCanvas);
    }
    GMTrace.o(3194784579584L, 23803);
  }
  
  private float bZu()
  {
    GMTrace.i(3193576620032L, 23794);
    if (Build.VERSION.SDK_INT >= 14)
    {
      float f = c.b(this.vZG);
      GMTrace.o(3193576620032L, 23794);
      return f;
    }
    GMTrace.o(3193576620032L, 23794);
    return 30.0F;
  }
  
  private View bZv()
  {
    GMTrace.i(3193845055488L, 23796);
    View localView = getChildAt(getChildCount() - 1);
    GMTrace.o(3193845055488L, 23796);
    return localView;
  }
  
  private int bZw()
  {
    GMTrace.i(3194247708672L, 23799);
    int i = getWidth();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    GMTrace.o(3194247708672L, 23799);
    return i - j - k;
  }
  
  private void bZx()
  {
    GMTrace.i(3195589885952L, 23809);
    if (this.vZJ != null)
    {
      this.vZJ.setPressed(false);
      refreshDrawableState();
      this.vZJ = null;
    }
    GMTrace.o(3195589885952L, 23809);
  }
  
  private void bZy()
  {
    GMTrace.i(3195858321408L, 23811);
    if (this.vZT != null) {
      this.vZT.cq();
    }
    if (this.vZU != null) {
      this.vZU.cq();
    }
    GMTrace.o(3195858321408L, 23811);
  }
  
  private static ViewGroup.LayoutParams df(View paramView)
  {
    GMTrace.i(3193039749120L, 23790);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView = localLayoutParams;
    if (localLayoutParams == null) {
      paramView = new ViewGroup.LayoutParams(-2, -1);
    }
    GMTrace.o(3193039749120L, 23790);
    return paramView;
  }
  
  private int ek(int paramInt1, int paramInt2)
  {
    GMTrace.i(3193979273216L, 23797);
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      getChildAt(i).getHitRect(this.eI);
      if (this.eI.contains(paramInt1, paramInt2))
      {
        GMTrace.o(3193979273216L, 23797);
        return i;
      }
      i += 1;
    }
    GMTrace.o(3193979273216L, 23797);
    return -1;
  }
  
  private void g(Boolean paramBoolean)
  {
    GMTrace.i(3191429136384L, 23778);
    if (this.vZX != paramBoolean.booleanValue()) {
      for (Object localObject = this; (((View)localObject).getParent() instanceof View); localObject = (View)((View)localObject).getParent()) {
        if (((((View)localObject).getParent() instanceof ListView)) || ((((View)localObject).getParent() instanceof ScrollView)))
        {
          ((View)localObject).getParent().requestDisallowInterceptTouchEvent(paramBoolean.booleanValue());
          this.vZX = paramBoolean.booleanValue();
          GMTrace.o(3191429136384L, 23778);
          return;
        }
      }
    }
    GMTrace.o(3191429136384L, 23778);
  }
  
  private void h(int paramInt, View paramView)
  {
    GMTrace.i(3192637095936L, 23787);
    paramInt = this.EP.getItemViewType(paramInt);
    if (BE(paramInt)) {
      ((Queue)this.vZI.get(paramInt)).offer(paramView);
    }
    GMTrace.o(3192637095936L, 23787);
  }
  
  private void reset()
  {
    GMTrace.i(3191966007296L, 23782);
    MP();
    removeAllViewsInLayout();
    requestLayout();
    GMTrace.o(3191966007296L, 23782);
  }
  
  public final void BG(int paramInt)
  {
    GMTrace.i(3194381926400L, 23800);
    this.vZG.startScroll(this.vZv, 0, paramInt - this.vZv, 0);
    BH(HorizontalListViewV2.d.a.wad);
    requestLayout();
    GMTrace.o(3194381926400L, 23800);
  }
  
  protected final boolean av(float paramFloat)
  {
    GMTrace.i(3195321450496L, 23807);
    this.vZG.fling(this.vZv, 0, (int)-paramFloat, 0, 0, this.vZw, 0, 0);
    BH(HorizontalListViewV2.d.a.wad);
    requestLayout();
    GMTrace.o(3195321450496L, 23807);
    return true;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(3195053015040L, 23805);
    super.dispatchDraw(paramCanvas);
    GMTrace.o(3195053015040L, 23805);
  }
  
  protected void dispatchSetPressed(boolean paramBoolean)
  {
    GMTrace.i(3195187232768L, 23806);
    GMTrace.o(3195187232768L, 23806);
  }
  
  public int getFirstVisiblePosition()
  {
    GMTrace.i(3194516144128L, 23801);
    int i = this.vZL;
    GMTrace.o(3194516144128L, 23801);
    return i;
  }
  
  public int getLastVisiblePosition()
  {
    GMTrace.i(3194650361856L, 23802);
    int i = this.vZM;
    GMTrace.o(3194650361856L, 23802);
    return i;
  }
  
  protected float getLeftFadingEdgeStrength()
  {
    GMTrace.i(3193308184576L, 23792);
    int i = getHorizontalFadingEdgeLength();
    if (this.vZu == 0)
    {
      GMTrace.o(3193308184576L, 23792);
      return 0.0F;
    }
    if (this.vZu < i)
    {
      float f = this.vZu / i;
      GMTrace.o(3193308184576L, 23792);
      return f;
    }
    GMTrace.o(3193308184576L, 23792);
    return 1.0F;
  }
  
  protected float getRightFadingEdgeStrength()
  {
    GMTrace.i(3193442402304L, 23793);
    int i = getHorizontalFadingEdgeLength();
    if (this.vZu == this.vZw)
    {
      GMTrace.o(3193442402304L, 23793);
      return 0.0F;
    }
    if (this.vZw - this.vZu < i)
    {
      float f = (this.vZw - this.vZu) / i;
      GMTrace.o(3193442402304L, 23793);
      return f;
    }
    GMTrace.o(3193442402304L, 23793);
    return 1.0F;
  }
  
  public View getSelectedView()
  {
    GMTrace.i(3192234442752L, 23784);
    int i = this.vZN;
    if ((i >= this.vZL) && (i <= this.vZM))
    {
      View localView = getChildAt(i - this.vZL);
      GMTrace.o(3192234442752L, 23784);
      return localView;
    }
    GMTrace.o(3192234442752L, 23784);
    return null;
  }
  
  protected final boolean onDown(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3195455668224L, 23808);
    if (!this.vZG.isFinished()) {}
    for (boolean bool = true;; bool = false)
    {
      this.vZW = bool;
      this.vZG.forceFinished(true);
      BH(HorizontalListViewV2.d.a.wab);
      bZx();
      if (!this.vZW)
      {
        int i = ek((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        if (i >= 0)
        {
          this.vZJ = getChildAt(i);
          if (this.vZJ != null)
          {
            this.vZJ.setPressed(true);
            refreshDrawableState();
          }
        }
      }
      GMTrace.o(3195455668224L, 23808);
      return true;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3194918797312L, 23804);
    super.onDraw(paramCanvas);
    int j = getChildCount();
    Rect localRect = this.eI;
    this.eI.top = getPaddingTop();
    this.eI.bottom = (this.eI.top + (getHeight() - getPaddingTop() - getPaddingBottom()));
    int i = 0;
    while (i < j)
    {
      if ((i != j - 1) || (!BF(this.vZM)))
      {
        View localView = getChildAt(i);
        localRect.left = localView.getRight();
        localRect.right = (localView.getRight() + this.Rb);
        if (localRect.left < getPaddingLeft()) {
          localRect.left = getPaddingLeft();
        }
        if (localRect.right > getWidth() - getPaddingRight()) {
          localRect.right = (getWidth() - getPaddingRight());
        }
        a(paramCanvas, localRect);
        if ((i == 0) && (localView.getLeft() > getPaddingLeft()))
        {
          localRect.left = getPaddingLeft();
          localRect.right = localView.getLeft();
          a(paramCanvas, localRect);
        }
      }
      i += 1;
    }
    GMTrace.o(3194918797312L, 23804);
  }
  
  @SuppressLint({"WrongCall"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3193173966848L, 23791);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.EP == null)
    {
      GMTrace.o(3193173966848L, 23791);
      return;
    }
    invalidate();
    if (this.vZC)
    {
      i = this.vZu;
      MP();
      removeAllViewsInLayout();
      this.vZv = i;
      this.vZC = false;
    }
    if (this.vZK != null)
    {
      this.vZv = this.vZK.intValue();
      this.vZK = null;
    }
    if (this.vZG.computeScrollOffset()) {
      this.vZv = this.vZG.getCurrX();
    }
    int k;
    label185:
    int j;
    if (this.vZv < 0)
    {
      this.vZv = 0;
      if (this.vZT.isFinished()) {
        this.vZT.ag((int)bZu());
      }
      this.vZG.forceFinished(true);
      BH(HorizontalListViewV2.d.a.wab);
      k = this.vZu - this.vZv;
      localView = getChildAt(0);
      if ((localView == null) || (localView.getRight() + k > 0)) {
        break label345;
      }
      j = this.vZx;
      if (!BF(this.vZL)) {
        break label330;
      }
    }
    label330:
    for (int i = localView.getMeasuredWidth();; i = this.Rb + localView.getMeasuredWidth())
    {
      this.vZx = (i + j);
      h(this.vZL, localView);
      removeViewInLayout(localView);
      this.vZL += 1;
      localView = getChildAt(0);
      break label185;
      if (this.vZv <= this.vZw) {
        break;
      }
      this.vZv = this.vZw;
      if (this.vZU.isFinished()) {
        this.vZU.ag((int)bZu());
      }
      this.vZG.forceFinished(true);
      BH(HorizontalListViewV2.d.a.wab);
      break;
    }
    for (;;)
    {
      label345:
      localView = bZv();
      if ((localView == null) || (localView.getLeft() + k < getWidth())) {
        break;
      }
      h(this.vZM, localView);
      removeViewInLayout(localView);
      this.vZM -= 1;
    }
    i = 0;
    View localView = bZv();
    if (localView != null) {
      i = localView.getRight();
    }
    if ((i + k + this.Rb < getWidth()) && (this.vZM + 1 < this.EP.getCount()))
    {
      this.vZM += 1;
      if (this.vZL < 0) {
        this.vZL = this.vZM;
      }
      localView = this.EP.getView(this.vZM, BD(this.vZM), this);
      G(localView, -1);
      if (this.vZM == 0) {}
      for (j = 0;; j = this.Rb)
      {
        j = i + (j + localView.getMeasuredWidth());
        i = j;
        if (this.vZO == null) {
          break;
        }
        i = j;
        if (this.EP == null) {
          break;
        }
        i = j;
        if (this.EP.getCount() - (this.vZM + 1) >= this.vZP) {
          break;
        }
        i = j;
        if (this.vZQ) {
          break;
        }
        this.vZQ = true;
        i = j;
        break;
      }
    }
    i = 0;
    localView = getChildAt(0);
    if (localView != null) {
      i = localView.getLeft();
    }
    if ((i + k - this.Rb > 0) && (this.vZL > 0))
    {
      this.vZL -= 1;
      localView = this.EP.getView(this.vZL, BD(this.vZL), this);
      G(localView, 0);
      if (this.vZL == 0)
      {
        j = localView.getMeasuredWidth();
        label713:
        j = i - j;
        m = this.vZx;
        if (j + k != 0) {
          break label772;
        }
      }
      label772:
      for (i = localView.getMeasuredWidth();; i = this.Rb + localView.getMeasuredWidth())
      {
        this.vZx = (m - i);
        i = j;
        break;
        j = this.Rb + localView.getMeasuredWidth();
        break label713;
      }
    }
    int m = getChildCount();
    if (m > 0)
    {
      this.vZx += k;
      j = this.vZx;
      i = 0;
      while (i < m)
      {
        localView = getChildAt(i);
        k = getPaddingLeft() + j;
        int n = getPaddingTop();
        localView.layout(k, n, localView.getMeasuredWidth() + k, localView.getMeasuredHeight() + n);
        j += localView.getMeasuredWidth() + this.Rb;
        i += 1;
      }
    }
    this.vZu = this.vZv;
    if (BF(this.vZM))
    {
      localView = bZv();
      if (localView != null)
      {
        i = this.vZw;
        j = this.vZu;
        this.vZw = (localView.getRight() - getPaddingLeft() + j - bZw());
        if (this.vZw < 0) {
          this.vZw = 0;
        }
        if (this.vZw == i) {}
      }
    }
    for (i = 1; i != 0; i = 0)
    {
      onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      GMTrace.o(3193173966848L, 23791);
      return;
    }
    if (this.vZG.isFinished())
    {
      if (this.vZS == HorizontalListViewV2.d.a.wad)
      {
        BH(HorizontalListViewV2.d.a.wab);
        GMTrace.o(3193173966848L, 23791);
      }
    }
    else {
      z.a(this, this.vZZ);
    }
    GMTrace.o(3193173966848L, 23791);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3193710837760L, 23795);
    super.onMeasure(paramInt1, paramInt2);
    this.vZV = paramInt2;
    GMTrace.o(3193710837760L, 23795);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(3191697571840L, 23780);
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      this.vZK = Integer.valueOf(paramParcelable.getInt("BUNDLE_ID_CURRENT_X"));
      super.onRestoreInstanceState(paramParcelable.getParcelable("BUNDLE_ID_PARENT_STATE"));
    }
    GMTrace.o(3191697571840L, 23780);
  }
  
  public Parcelable onSaveInstanceState()
  {
    GMTrace.i(3191563354112L, 23779);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
    localBundle.putInt("BUNDLE_ID_CURRENT_X", this.vZu);
    GMTrace.o(3191563354112L, 23779);
    return localBundle;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3195724103680L, 23810);
    if (paramMotionEvent.getAction() == 1)
    {
      if ((this.vZG == null) || (this.vZG.isFinished())) {
        BH(HorizontalListViewV2.d.a.wab);
      }
      g(Boolean.valueOf(false));
      bZy();
    }
    for (;;)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3195724103680L, 23810);
      return bool;
      if (paramMotionEvent.getAction() == 3)
      {
        bZx();
        bZy();
        g(Boolean.valueOf(false));
      }
    }
  }
  
  public final void setAdapter(ListAdapter paramListAdapter)
  {
    int i = 0;
    GMTrace.i(3192368660480L, 23785);
    if (this.EP != null) {
      this.EP.unregisterDataSetObserver(this.vZY);
    }
    if (paramListAdapter != null)
    {
      this.vZQ = false;
      this.EP = paramListAdapter;
      this.EP.registerDataSetObserver(this.vZY);
    }
    if (this.EP != null)
    {
      int j = this.EP.getViewTypeCount();
      this.vZI.clear();
      while (i < j)
      {
        this.vZI.add(new LinkedList());
        i += 1;
      }
    }
    reset();
    GMTrace.o(3192368660480L, 23785);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(3195992539136L, 23812);
    this.mOnClickListener = paramOnClickListener;
    GMTrace.o(3195992539136L, 23812);
  }
  
  public void setSelection(int paramInt)
  {
    GMTrace.i(3192100225024L, 23783);
    this.vZN = paramInt;
    GMTrace.o(3192100225024L, 23783);
  }
  
  private final class a
    extends GestureDetector.SimpleOnGestureListener
  {
    private a()
    {
      GMTrace.i(3244579356672L, 24174);
      GMTrace.o(3244579356672L, 24174);
    }
    
    public final boolean onDown(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3244713574400L, 24175);
      boolean bool = HorizontalListViewV2.this.onDown(paramMotionEvent);
      GMTrace.o(3244713574400L, 24175);
      return bool;
    }
    
    public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(3244847792128L, 24176);
      boolean bool = HorizontalListViewV2.this.av(paramFloat1);
      GMTrace.o(3244847792128L, 24176);
      return bool;
    }
    
    public final void onLongPress(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3245250445312L, 24179);
      HorizontalListViewV2.d(HorizontalListViewV2.this);
      int i = HorizontalListViewV2.a(HorizontalListViewV2.this, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((i >= 0) && (!HorizontalListViewV2.f(HorizontalListViewV2.this)))
      {
        paramMotionEvent = HorizontalListViewV2.this.getChildAt(i);
        AdapterView.OnItemLongClickListener localOnItemLongClickListener = HorizontalListViewV2.this.getOnItemLongClickListener();
        if (localOnItemLongClickListener != null)
        {
          i = HorizontalListViewV2.g(HorizontalListViewV2.this) + i;
          if (localOnItemLongClickListener.onItemLongClick(HorizontalListViewV2.this, paramMotionEvent, i, HorizontalListViewV2.this.EP.getItemId(i))) {
            HorizontalListViewV2.this.performHapticFeedback(0);
          }
        }
      }
      GMTrace.o(3245250445312L, 24179);
    }
    
    public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(3244982009856L, 24177);
      HorizontalListViewV2.a(HorizontalListViewV2.this, Boolean.valueOf(true));
      HorizontalListViewV2.a(HorizontalListViewV2.this, HorizontalListViewV2.d.a.wac);
      HorizontalListViewV2.d(HorizontalListViewV2.this);
      paramMotionEvent1 = HorizontalListViewV2.this;
      paramMotionEvent1.vZv += (int)paramFloat1;
      HorizontalListViewV2.b(HorizontalListViewV2.this, Math.round(paramFloat1));
      HorizontalListViewV2.this.requestLayout();
      GMTrace.o(3244982009856L, 24177);
      return true;
    }
    
    public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
    {
      GMTrace.i(3245116227584L, 24178);
      HorizontalListViewV2.d(HorizontalListViewV2.this);
      AdapterView.OnItemClickListener localOnItemClickListener = HorizontalListViewV2.this.getOnItemClickListener();
      int i = HorizontalListViewV2.a(HorizontalListViewV2.this, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((i >= 0) && (!HorizontalListViewV2.f(HorizontalListViewV2.this)))
      {
        paramMotionEvent = HorizontalListViewV2.this.getChildAt(i);
        i = HorizontalListViewV2.g(HorizontalListViewV2.this) + i;
        if (localOnItemClickListener != null)
        {
          localOnItemClickListener.onItemClick(HorizontalListViewV2.this, paramMotionEvent, i, HorizontalListViewV2.this.EP.getItemId(i));
          GMTrace.o(3245116227584L, 24178);
          return true;
        }
      }
      if ((HorizontalListViewV2.h(HorizontalListViewV2.this) != null) && (!HorizontalListViewV2.f(HorizontalListViewV2.this))) {
        HorizontalListViewV2.h(HorizontalListViewV2.this).onClick(HorizontalListViewV2.this);
      }
      GMTrace.o(3245116227584L, 24178);
      return false;
    }
  }
  
  @TargetApi(11)
  private static final class b
  {
    static
    {
      GMTrace.i(3274107256832L, 24394);
      if (Build.VERSION.SDK_INT < 11) {
        throw new RuntimeException("sdk is >= 11!");
      }
      GMTrace.o(3274107256832L, 24394);
    }
    
    public static void a(Scroller paramScroller)
    {
      GMTrace.i(3273973039104L, 24393);
      if (paramScroller != null) {
        paramScroller.setFriction(0.009F);
      }
      GMTrace.o(3273973039104L, 24393);
    }
  }
  
  @TargetApi(14)
  private static final class c
  {
    static
    {
      GMTrace.i(3336921153536L, 24862);
      if (Build.VERSION.SDK_INT < 14) {
        throw new RuntimeException("sdk is >= 14!");
      }
      GMTrace.o(3336921153536L, 24862);
    }
    
    public static float b(Scroller paramScroller)
    {
      GMTrace.i(3336786935808L, 24861);
      float f = paramScroller.getCurrVelocity();
      GMTrace.o(3336786935808L, 24861);
      return f;
    }
  }
  
  public static abstract interface d
  {
    public abstract void pQ(int paramInt);
    
    public static enum a
    {
      static
      {
        GMTrace.i(3188073693184L, 23753);
        wab = 1;
        wac = 2;
        wad = 3;
        wae = new int[] { wab, wac, wad };
        GMTrace.o(3188073693184L, 23753);
      }
    }
  }
  
  public static abstract interface e {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\HorizontalListViewV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */