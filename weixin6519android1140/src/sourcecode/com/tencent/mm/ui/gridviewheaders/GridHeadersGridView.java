package com.tencent.mm.ui.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.ArrayList;
import java.util.List;

public class GridHeadersGridView
  extends GridView
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemSelectedListener
{
  private DataSetObserver AH;
  private AdapterView.OnItemSelectedListener Fu;
  private AdapterView.OnItemClickListener WC;
  protected int XQ;
  private int hQ;
  private ae mHandler;
  private int mNumColumns;
  private AbsListView.OnScrollListener qor;
  protected boolean vZC;
  private int vZj;
  private int vZk;
  private Runnable weN;
  private AdapterView.OnItemLongClickListener wlu;
  public a xdK;
  public b xdL;
  private boolean xdM;
  private final Rect xdN;
  private boolean xdO;
  private boolean xdP;
  private int xdQ;
  private long xdR;
  private int xdS;
  private float xdT;
  private boolean xdU;
  private int xdV;
  public c xdW;
  d xdX;
  private e xdY;
  private View xdZ;
  protected c xea;
  protected int xeb;
  private boolean xec;
  private int xl;
  
  public GridHeadersGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842865);
    GMTrace.i(16748493406208L, 124786);
    GMTrace.o(16748493406208L, 124786);
  }
  
  public GridHeadersGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16748627623936L, 124787);
    this.mHandler = new ae();
    this.xdM = true;
    this.xdN = new Rect();
    this.xdR = -1L;
    this.AH = new DataSetObserver()
    {
      public final void onChanged()
      {
        GMTrace.i(16756949123072L, 124849);
        GridHeadersGridView.a(GridHeadersGridView.this);
        GMTrace.o(16756949123072L, 124849);
      }
      
      public final void onInvalidated()
      {
        GMTrace.i(16757083340800L, 124850);
        GridHeadersGridView.a(GridHeadersGridView.this);
        GMTrace.o(16757083340800L, 124850);
      }
    };
    this.xdV = 1;
    this.xl = 0;
    this.xec = true;
    super.setOnScrollListener(this);
    setVerticalFadingEdgeEnabled(false);
    if (!this.xdU) {
      this.mNumColumns = -1;
    }
    this.hQ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    GMTrace.o(16748627623936L, 124787);
  }
  
  private void DS(int paramInt)
  {
    GMTrace.i(16751848849408L, 124811);
    if ((this.xea == null) || (this.xea.getCount() == 0) || (!this.xdM))
    {
      GMTrace.o(16751848849408L, 124811);
      return;
    }
    if ((c.d)getChildAt(0) == null)
    {
      GMTrace.o(16751848849408L, 124811);
      return;
    }
    int j = paramInt - this.xdV;
    int i = j;
    if (j < 0) {
      i = paramInt;
    }
    int k = this.xdV + paramInt;
    j = k;
    if (k >= this.xea.getCount()) {
      j = paramInt;
    }
    long l;
    Object localObject;
    label207:
    c.d locald;
    if (this.vZk != 0) {
      if (this.vZk < 0)
      {
        this.xea.mj(paramInt);
        if (getChildAt(this.xdV).getTop() <= 0)
        {
          l = this.xea.mj(j);
          i = j;
          if (this.xdR != l)
          {
            this.xdZ = this.xea.a(i, this.xdZ, this);
            chM();
            this.xdR = l;
          }
          int m = getChildCount();
          if (m == 0) {
            break label535;
          }
          localObject = null;
          i = 99999;
          k = 0;
          if (k >= m) {
            break label355;
          }
          locald = (c.d)super.getChildAt(k);
          if (!this.xdO) {
            break label346;
          }
          j = locald.getTop() - getPaddingTop();
          label243:
          if ((j < 0) || (!(locald.getChildAt(0) instanceof c.b)) || (j >= i)) {
            break label544;
          }
          localObject = locald;
          i = j;
        }
      }
    }
    label346:
    label355:
    label535:
    label544:
    for (;;)
    {
      k = this.xdV + k;
      break label207;
      l = this.xea.mj(paramInt);
      i = paramInt;
      break;
      j = getChildAt(0).getTop();
      if ((j > 0) && (j < this.vZk))
      {
        l = this.xea.mj(i);
        break;
      }
      l = this.xea.mj(paramInt);
      i = paramInt;
      break;
      j = locald.getTop();
      break label243;
      i = chL();
      if (localObject != null)
      {
        if ((paramInt == 0) && (super.getChildAt(0).getTop() > 0) && (!this.xdO))
        {
          this.xdS = 0;
          GMTrace.o(16751848849408L, 124811);
          return;
        }
        if (this.xdO)
        {
          this.xdS = Math.min(((View)localObject).getTop(), getPaddingTop() + i);
          if (this.xdS < getPaddingTop()) {}
          for (paramInt = i + getPaddingTop();; paramInt = this.xdS)
          {
            this.xdS = paramInt;
            GMTrace.o(16751848849408L, 124811);
            return;
          }
        }
        this.xdS = Math.min(((View)localObject).getTop(), i);
        if (this.xdS < 0) {}
        for (paramInt = i;; paramInt = this.xdS)
        {
          this.xdS = paramInt;
          GMTrace.o(16751848849408L, 124811);
          return;
        }
      }
      this.xdS = i;
      if (this.xdO) {
        this.xdS += getPaddingTop();
      }
      GMTrace.o(16751848849408L, 124811);
      return;
    }
  }
  
  private int chL()
  {
    GMTrace.i(16751446196224L, 124808);
    if (this.xdZ != null)
    {
      int i = this.xdZ.getMeasuredHeight();
      GMTrace.o(16751446196224L, 124808);
      return i;
    }
    GMTrace.o(16751446196224L, 124808);
    return 0;
  }
  
  private void chM()
  {
    GMTrace.i(16751580413952L, 124809);
    if (this.xdZ == null)
    {
      GMTrace.o(16751580413952L, 124809);
      return;
    }
    int j = View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 1073741824);
    ViewGroup.LayoutParams localLayoutParams = this.xdZ.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height > 0)) {}
    for (int i = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);; i = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.xdZ.measure(j, i);
      this.xdZ.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.xdZ.getMeasuredHeight());
      GMTrace.o(16751580413952L, 124809);
      return;
    }
  }
  
  private void reset()
  {
    GMTrace.i(16751714631680L, 124810);
    this.xdS = 0;
    this.xdZ = null;
    this.xdR = Long.MIN_VALUE;
    GMTrace.o(16751714631680L, 124810);
  }
  
  public final View DR(int paramInt)
  {
    GMTrace.i(16748761841664L, 124788);
    View localView;
    if (paramInt == -2)
    {
      localView = this.xdZ;
      GMTrace.o(16748761841664L, 124788);
      return localView;
    }
    try
    {
      localView = (View)getChildAt(paramInt).getTag();
      GMTrace.o(16748761841664L, 124788);
      return localView;
    }
    catch (Exception localException)
    {
      GMTrace.o(16748761841664L, 124788);
    }
    return null;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(16751983067136L, 124812);
    if (Build.VERSION.SDK_INT < 8) {
      DS(getFirstVisiblePosition());
    }
    if ((this.xdZ != null) && (this.xdM) && (this.xdZ.getVisibility() == 0)) {}
    int m;
    int n;
    ArrayList localArrayList;
    int k;
    for (int i = 1;; i = 0)
    {
      m = chL();
      n = this.xdS - m;
      if ((i != 0) && (this.xec))
      {
        this.xdN.left = getPaddingLeft();
        this.xdN.right = (getWidth() - getPaddingRight());
        this.xdN.top = this.xdS;
        this.xdN.bottom = getHeight();
        paramCanvas.save();
        paramCanvas.clipRect(this.xdN);
      }
      super.dispatchDraw(paramCanvas);
      localArrayList = new ArrayList();
      j = 0;
      k = getFirstVisiblePosition();
      while (k <= getLastVisiblePosition())
      {
        if (getItemIdAtPosition(k) == -1L) {
          localArrayList.add(Integer.valueOf(j));
        }
        k += this.xdV;
        j += this.xdV;
      }
    }
    int j = 0;
    if (j < localArrayList.size())
    {
      c.d locald = (c.d)getChildAt(((Integer)localArrayList.get(j)).intValue());
      for (;;)
      {
        try
        {
          View localView = (View)locald.getTag();
          if ((((c.b)locald.getChildAt(0)).xdG == this.xdR) && (locald.getTop() < 0) && (this.xdM))
          {
            k = 1;
            if ((localView.getVisibility() == 0) && (k == 0))
            {
              localView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824 - getPaddingLeft() - getPaddingRight()), View.MeasureSpec.makeMeasureSpec(0, 0));
              localView.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), locald.getHeight());
              this.xdN.left = getPaddingLeft();
              this.xdN.right = (getWidth() - getPaddingRight());
              this.xdN.bottom = locald.getBottom();
              this.xdN.top = locald.getTop();
              paramCanvas.save();
              paramCanvas.clipRect(this.xdN);
              paramCanvas.translate(getPaddingLeft(), locald.getTop());
              localView.draw(paramCanvas);
              paramCanvas.restore();
            }
            j += 1;
          }
        }
        catch (Exception paramCanvas)
        {
          GMTrace.o(16751983067136L, 124812);
          return;
        }
        k = 0;
      }
    }
    if ((i != 0) && (this.xec))
    {
      paramCanvas.restore();
      if (this.xdZ.getWidth() != getWidth() - getPaddingLeft() - getPaddingRight())
      {
        i = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824 - getPaddingLeft() - getPaddingRight());
        j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.xdZ.measure(i, j);
        this.xdZ.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.xdZ.getHeight());
      }
      this.xdN.left = getPaddingLeft();
      this.xdN.right = (getWidth() - getPaddingRight());
      this.xdN.bottom = (n + m);
      if (!this.xdO) {
        break label754;
      }
    }
    label754:
    for (this.xdN.top = getPaddingTop();; this.xdN.top = 0)
    {
      paramCanvas.save();
      paramCanvas.clipRect(this.xdN);
      paramCanvas.translate(getPaddingLeft(), n);
      paramCanvas.saveLayerAlpha(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), (int)(255.0F * this.xdS / m), 4);
      this.xdZ.draw(paramCanvas);
      paramCanvas.restore();
      paramCanvas.restore();
      GMTrace.o(16751983067136L, 124812);
      return;
      if (i != 0) {
        break;
      }
      GMTrace.o(16751983067136L, 124812);
      return;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(16749969801216L, 124797);
    int i;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label597;
      }
      GMTrace.o(16749969801216L, 124797);
      return false;
      if (this.xdL == null) {
        this.xdL = new b();
      }
      this.mHandler.postDelayed(this.xdK, ViewConfiguration.getTapTimeout());
      i = (int)paramMotionEvent.getY();
      this.xdT = i;
      float f = i;
      int j;
      if ((this.xdZ != null) && (f <= this.xdZ.getBottom())) {
        j = -2;
      }
      for (;;)
      {
        this.xeb = j;
        if ((this.xeb == -1) || (this.xl == 2)) {
          break;
        }
        this.XQ = 0;
        break;
        int k = getFirstVisiblePosition();
        i = 0;
        for (;;)
        {
          if (k > getLastVisiblePosition()) {
            break label254;
          }
          if (getItemIdAtPosition(k) == -1L)
          {
            localObject = getChildAt(i);
            j = ((View)localObject).getBottom();
            int m = ((View)localObject).getTop();
            if (f <= j)
            {
              j = i;
              if (f >= m) {
                break;
              }
            }
          }
          k += this.xdV;
          i += this.xdV;
        }
        label254:
        j = -1;
      }
      if ((this.xeb == -1) || (Math.abs(paramMotionEvent.getY() - this.xdT) <= this.hQ)) {
        break;
      }
      this.XQ = -1;
      Object localObject = DR(this.xeb);
      if (localObject != null) {
        ((View)localObject).setPressed(false);
      }
      if (this.xdK != null) {
        this.mHandler.removeCallbacks(this.xdK);
      }
      this.xeb = -1;
      break;
      if ((this.XQ == -2) || (this.XQ == -1) || (this.xeb == -1)) {
        break;
      }
      final View localView = DR(this.xeb);
      final e locale;
      if ((localView != null) && (!localView.hasFocusable()))
      {
        if (this.XQ != 0) {
          localView.setPressed(false);
        }
        if (this.xdY == null) {
          this.xdY = new e();
        }
        locale = this.xdY;
        locale.xeg = this.xeb;
        locale.chO();
        if ((this.XQ == 0) && (this.XQ == 1)) {
          break label580;
        }
        localae = this.mHandler;
        if (this.XQ == 0) {}
        for (localObject = this.xdL;; localObject = this.xdK)
        {
          localae.removeCallbacks((Runnable)localObject);
          if (this.vZC) {
            break label567;
          }
          this.XQ = 1;
          localView.setPressed(true);
          setPressed(true);
          if (this.weN != null) {
            removeCallbacks(this.weN);
          }
          this.weN = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16754264768512L, 124829);
              GridHeadersGridView.this.XQ = -1;
              localView.setPressed(false);
              GridHeadersGridView.this.setPressed(false);
              if (!GridHeadersGridView.this.vZC) {
                locale.run();
              }
              GMTrace.o(16754264768512L, 124829);
            }
          };
          this.mHandler.postDelayed(this.weN, ViewConfiguration.getPressedStateDuration());
          i = 1;
          break;
        }
        label567:
        this.XQ = -1;
      }
      label580:
      while (this.vZC)
      {
        ae localae;
        this.XQ = -1;
        break;
      }
      locale.run();
      i = 1;
    }
    label597:
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(16749969801216L, 124797);
    return bool;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(16748896059392L, 124789);
    this.WC.onItemClick(paramAdapterView, paramView, this.xea.DQ(paramInt).jP, paramLong);
    GMTrace.o(16748896059392L, 124789);
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(16749030277120L, 124790);
    boolean bool = this.wlu.onItemLongClick(paramAdapterView, paramView, this.xea.DQ(paramInt).jP, paramLong);
    GMTrace.o(16749030277120L, 124790);
    return bool;
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(16749164494848L, 124791);
    this.Fu.onItemSelected(paramAdapterView, paramView, this.xea.DQ(paramInt).jP, paramLong);
    GMTrace.o(16749164494848L, 124791);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    GMTrace.i(16752117284864L, 124813);
    if (this.mNumColumns == -1) {
      if (this.xdQ > 0)
      {
        int k = Math.max(View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight(), 0);
        int j = k / this.xdQ;
        if (j > 0)
        {
          i = j;
          while ((i != 1) && (this.xdQ * i + (i - 1) * this.vZj > k)) {
            i -= 1;
          }
        }
      }
      else
      {
        i = 2;
      }
    }
    for (;;)
    {
      for (this.xdV = i;; this.xdV = this.mNumColumns)
      {
        if (this.xea != null) {
          this.xea.setNumColumns(this.xdV);
        }
        chM();
        super.onMeasure(paramInt1, paramInt2);
        GMTrace.o(16752117284864L, 124813);
        return;
      }
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    GMTrace.i(16749298712576L, 124792);
    this.Fu.onNothingSelected(paramAdapterView);
    GMTrace.o(16749298712576L, 124792);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(16749432930304L, 124793);
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.xdM = paramParcelable.xeh;
    requestLayout();
    GMTrace.o(16749432930304L, 124793);
  }
  
  public Parcelable onSaveInstanceState()
  {
    GMTrace.i(16749567148032L, 124794);
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.xeh = this.xdM;
    GMTrace.o(16749567148032L, 124794);
    return localSavedState;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(16749701365760L, 124795);
    if (this.qor != null) {
      this.qor.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
    if (Build.VERSION.SDK_INT >= 8) {
      DS(paramInt1);
    }
    GMTrace.o(16749701365760L, 124795);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(16749835583488L, 124796);
    if (this.qor != null) {
      this.qor.onScrollStateChanged(paramAbsListView, paramInt);
    }
    this.xl = paramInt;
    GMTrace.o(16749835583488L, 124796);
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(16750104018944L, 124798);
    if ((this.xea != null) && (this.AH != null)) {
      this.xea.unregisterDataSetObserver(this.AH);
    }
    if (!this.xdP) {
      this.xdO = true;
    }
    if ((paramListAdapter instanceof b)) {
      paramListAdapter = (b)paramListAdapter;
    }
    for (;;)
    {
      this.xea = new c(getContext(), this, paramListAdapter);
      this.xea.registerDataSetObserver(this.AH);
      reset();
      super.setAdapter(this.xea);
      GMTrace.o(16750104018944L, 124798);
      return;
      if ((paramListAdapter instanceof e)) {
        paramListAdapter = new f((e)paramListAdapter);
      } else {
        paramListAdapter = new d(paramListAdapter);
      }
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    GMTrace.i(16750238236672L, 124799);
    super.setClipToPadding(paramBoolean);
    this.xdO = paramBoolean;
    this.xdP = true;
    GMTrace.o(16750238236672L, 124799);
  }
  
  public void setColumnWidth(int paramInt)
  {
    GMTrace.i(16750372454400L, 124800);
    super.setColumnWidth(paramInt);
    this.xdQ = paramInt;
    GMTrace.o(16750372454400L, 124800);
  }
  
  public void setHorizontalSpacing(int paramInt)
  {
    GMTrace.i(16750506672128L, 124801);
    super.setHorizontalSpacing(paramInt);
    this.vZj = paramInt;
    GMTrace.o(16750506672128L, 124801);
  }
  
  public void setNumColumns(int paramInt)
  {
    GMTrace.i(16750640889856L, 124802);
    super.setNumColumns(paramInt);
    this.xdU = true;
    this.mNumColumns = paramInt;
    if ((paramInt != -1) && (this.xea != null)) {
      this.xea.setNumColumns(paramInt);
    }
    GMTrace.o(16750640889856L, 124802);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    GMTrace.i(16750775107584L, 124803);
    this.WC = paramOnItemClickListener;
    super.setOnItemClickListener(this);
    GMTrace.o(16750775107584L, 124803);
  }
  
  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    GMTrace.i(16750909325312L, 124804);
    this.wlu = paramOnItemLongClickListener;
    super.setOnItemLongClickListener(this);
    GMTrace.o(16750909325312L, 124804);
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    GMTrace.i(16751043543040L, 124805);
    this.Fu = paramOnItemSelectedListener;
    super.setOnItemSelectedListener(this);
    GMTrace.o(16751043543040L, 124805);
  }
  
  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    GMTrace.i(16751177760768L, 124806);
    this.qor = paramOnScrollListener;
    GMTrace.o(16751177760768L, 124806);
  }
  
  public void setVerticalSpacing(int paramInt)
  {
    GMTrace.i(16751311978496L, 124807);
    super.setVerticalSpacing(paramInt);
    this.vZk = paramInt;
    GMTrace.o(16751311978496L, 124807);
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    boolean xeh;
    
    static
    {
      GMTrace.i(16755606945792L, 124839);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(16755606945792L, 124839);
    }
    
    private SavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(16755070074880L, 124835);
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.xeh = bool;
        GMTrace.o(16755070074880L, 124835);
        return;
      }
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
      GMTrace.i(16754935857152L, 124834);
      GMTrace.o(16754935857152L, 124834);
    }
    
    public String toString()
    {
      GMTrace.i(16755204292608L, 124836);
      String str = "StickyGridHeadersGridView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " areHeadersSticky=" + this.xeh + "}";
      GMTrace.o(16755204292608L, 124836);
      return str;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(16755338510336L, 124837);
      super.writeToParcel(paramParcel, paramInt);
      if (this.xeh) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        GMTrace.o(16755338510336L, 124837);
        return;
      }
    }
  }
  
  private final class a
    extends GridHeadersGridView.f
    implements Runnable
  {
    public a()
    {
      super();
      GMTrace.i(16761646743552L, 124884);
      GMTrace.o(16761646743552L, 124884);
    }
    
    public final void run()
    {
      GMTrace.i(16761780961280L, 124885);
      View localView = GridHeadersGridView.this.DR(GridHeadersGridView.this.xeb);
      boolean bool1;
      if (localView != null)
      {
        GridHeadersGridView.a(GridHeadersGridView.this, GridHeadersGridView.this.xeb);
        if ((!chP()) || (GridHeadersGridView.this.vZC)) {
          break label165;
        }
        GridHeadersGridView localGridHeadersGridView = GridHeadersGridView.this;
        if (localGridHeadersGridView.xdX == null) {
          break label160;
        }
        bool1 = localGridHeadersGridView.xdX.chN();
        bool2 = bool1;
        if (bool1)
        {
          if (localView != null) {
            localView.sendAccessibilityEvent(2);
          }
          localGridHeadersGridView.performHapticFeedback(0);
        }
      }
      label160:
      label165:
      for (boolean bool2 = bool1;; bool2 = false)
      {
        if (bool2)
        {
          GridHeadersGridView.this.XQ = -2;
          GridHeadersGridView.this.setPressed(false);
          localView.setPressed(false);
          GMTrace.o(16761780961280L, 124885);
          return;
        }
        GridHeadersGridView.this.XQ = 2;
        GMTrace.o(16761780961280L, 124885);
        return;
        bool1 = false;
        break;
      }
    }
  }
  
  final class b
    implements Runnable
  {
    b()
    {
      GMTrace.i(16764062662656L, 124902);
      GMTrace.o(16764062662656L, 124902);
    }
    
    public final void run()
    {
      GMTrace.i(16764196880384L, 124903);
      if (GridHeadersGridView.this.XQ == 0)
      {
        GridHeadersGridView.this.XQ = 1;
        View localView = GridHeadersGridView.this.DR(GridHeadersGridView.this.xeb);
        if ((localView != null) && (!localView.hasFocusable()))
        {
          if (!GridHeadersGridView.this.vZC)
          {
            localView.setPressed(true);
            GridHeadersGridView.this.setPressed(true);
            GridHeadersGridView.this.refreshDrawableState();
            int i = ViewConfiguration.getLongPressTimeout();
            if (GridHeadersGridView.this.isLongClickable())
            {
              if (GridHeadersGridView.this.xdK == null) {
                GridHeadersGridView.this.xdK = new GridHeadersGridView.a(GridHeadersGridView.this);
              }
              GridHeadersGridView.this.xdK.chO();
              GridHeadersGridView.d(GridHeadersGridView.this).postDelayed(GridHeadersGridView.this.xdK, i);
              GMTrace.o(16764196880384L, 124903);
              return;
            }
            GridHeadersGridView.this.XQ = 2;
            GMTrace.o(16764196880384L, 124903);
            return;
          }
          GridHeadersGridView.this.XQ = 2;
        }
      }
      GMTrace.o(16764196880384L, 124903);
    }
  }
  
  public static abstract interface c
  {
    public abstract void ci(View paramView);
  }
  
  public static abstract interface d
  {
    public abstract boolean chN();
  }
  
  private final class e
    extends GridHeadersGridView.f
    implements Runnable
  {
    int xeg;
    
    public e()
    {
      super();
      GMTrace.i(16761915179008L, 124886);
      GMTrace.o(16761915179008L, 124886);
    }
    
    public final void run()
    {
      GMTrace.i(16762049396736L, 124887);
      if (GridHeadersGridView.this.vZC)
      {
        GMTrace.o(16762049396736L, 124887);
        return;
      }
      if ((GridHeadersGridView.this.xea != null) && (GridHeadersGridView.this.xea.getCount() > 0) && (this.xeg != -1) && (this.xeg < GridHeadersGridView.this.xea.getCount()) && (chP()))
      {
        View localView = GridHeadersGridView.this.DR(this.xeg);
        if (localView != null)
        {
          GridHeadersGridView localGridHeadersGridView = GridHeadersGridView.this;
          GridHeadersGridView.a(GridHeadersGridView.this, this.xeg);
          if (localGridHeadersGridView.xdW != null)
          {
            localGridHeadersGridView.playSoundEffect(0);
            if (localView != null) {
              localView.sendAccessibilityEvent(1);
            }
            localGridHeadersGridView.xdW.ci(localView);
          }
        }
      }
      GMTrace.o(16762049396736L, 124887);
    }
  }
  
  private class f
  {
    private int weS;
    
    public f()
    {
      GMTrace.i(16748090753024L, 124783);
      GMTrace.o(16748090753024L, 124783);
    }
    
    public final void chO()
    {
      GMTrace.i(16748224970752L, 124784);
      this.weS = GridHeadersGridView.b(GridHeadersGridView.this);
      GMTrace.o(16748224970752L, 124784);
    }
    
    public final boolean chP()
    {
      GMTrace.i(16748359188480L, 124785);
      if ((GridHeadersGridView.this.hasWindowFocus()) && (GridHeadersGridView.c(GridHeadersGridView.this) == this.weS))
      {
        GMTrace.o(16748359188480L, 124785);
        return true;
      }
      GMTrace.o(16748359188480L, 124785);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\gridviewheaders\GridHeadersGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */