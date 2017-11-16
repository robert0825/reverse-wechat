package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.j;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DragSortListView
  extends ListView
{
  private int DZ;
  private int ivM;
  private int ivN;
  private DataSetObserver mObserver;
  private View xnI;
  private Point xnJ;
  private Point xnK;
  private int xnL;
  private boolean xnM;
  private float xnN;
  private float xnO;
  private int xnP;
  private int xnQ;
  private int xnR;
  private boolean xnS;
  private int xnT;
  private int xnU;
  private int xnV;
  private int xnW;
  private int xnX;
  private b xnY;
  public g xnZ;
  private int xoA;
  private float xoB;
  private float xoC;
  private a xoD;
  private boolean xoE;
  private e xoF;
  private boolean xoG;
  private boolean xoH;
  private i xoI;
  private k xoJ;
  private j xoK;
  private f xoL;
  boolean xoM;
  private float xoN;
  boolean xoO;
  private boolean xoP;
  public l xoa;
  boolean xob;
  private int xoc;
  private int xod;
  private int xoe;
  private int xof;
  private View[] xog;
  private d xoh;
  private float xoi;
  private float xoj;
  private int xok;
  private int xol;
  private float xom;
  private float xon;
  private float xoo;
  private float xop;
  private float xoq;
  private c xor;
  private int xos;
  private int xot;
  private int xou;
  private int xov;
  private boolean xow;
  boolean xox;
  h xoy;
  private MotionEvent xoz;
  
  public DragSortListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(13057908539392L, 97289);
    this.xnJ = new Point();
    this.xnK = new Point();
    this.xnM = false;
    this.xnN = 1.0F;
    this.xnO = 1.0F;
    this.xnS = false;
    this.xob = true;
    this.DZ = 0;
    this.xoc = 1;
    this.xof = 0;
    this.xog = new View[1];
    this.xoi = 0.33333334F;
    this.xoj = 0.33333334F;
    this.xoq = 0.5F;
    this.xor = new c()
    {
      public final float ay(float paramAnonymousFloat)
      {
        GMTrace.i(13067035344896L, 97357);
        float f = DragSortListView.a(DragSortListView.this);
        GMTrace.o(13067035344896L, 97357);
        return f * paramAnonymousFloat;
      }
    };
    this.xov = 0;
    this.xow = false;
    this.xox = false;
    this.xoy = null;
    this.xoA = 0;
    this.xoB = 0.25F;
    this.xoC = 0.0F;
    this.xoE = false;
    this.xoG = false;
    this.xoH = false;
    this.xoI = new i();
    this.xoN = 0.0F;
    this.xoO = false;
    this.xoP = false;
    int j = 150;
    int i = 150;
    boolean bool1;
    float f;
    if (paramAttributeSet != null)
    {
      paramContext = getContext().obtainStyledAttributes(paramAttributeSet, a.j.enm, 0, 0);
      this.xoc = Math.max(1, paramContext.getDimensionPixelSize(a.j.xwa, 1));
      this.xoE = paramContext.getBoolean(a.j.xwp, false);
      if (this.xoE) {
        this.xoF = new e();
      }
      this.xnN = paramContext.getFloat(a.j.xwh, this.xnN);
      this.xnO = this.xnN;
      this.xob = paramContext.getBoolean(a.j.xwb, this.xob);
      this.xoB = Math.max(0.0F, Math.min(1.0F, 1.0F - paramContext.getFloat(a.j.xwn, 0.75F)));
      if (this.xoB <= 0.0F) {
        break label669;
      }
      bool1 = true;
      this.xnS = bool1;
      f = paramContext.getFloat(a.j.xwd, this.xoi);
      if (f <= 0.5F) {
        break label675;
      }
      this.xoj = 0.5F;
      label372:
      if (f <= 0.5F) {
        break label683;
      }
    }
    label669:
    label675:
    label683:
    for (this.xoi = 0.5F;; this.xoi = f)
    {
      if (getHeight() != 0) {
        ciZ();
      }
      this.xoq = paramContext.getFloat(a.j.xwj, this.xoq);
      j = paramContext.getInt(a.j.xwk, 150);
      i = paramContext.getInt(a.j.xwf, 150);
      if (paramContext.getBoolean(a.j.xwq, true))
      {
        bool1 = paramContext.getBoolean(a.j.xwl, false);
        int k = paramContext.getInt(a.j.xwm, 1);
        boolean bool2 = paramContext.getBoolean(a.j.xwo, true);
        int m = paramContext.getInt(a.j.xwe, 0);
        int n = paramContext.getResourceId(a.j.xwc, 0);
        int i1 = paramContext.getResourceId(a.j.xwg, 0);
        int i2 = paramContext.getResourceId(a.j.xvZ, 0);
        int i3 = paramContext.getColor(a.j.xwi, -16777216);
        paramAttributeSet = new b(this, n, m, k, i2, i1);
        paramAttributeSet.xnp = bool1;
        paramAttributeSet.xno = bool2;
        paramAttributeSet.xsB = i3;
        this.xoy = paramAttributeSet;
        setOnTouchListener(paramAttributeSet);
      }
      paramContext.recycle();
      this.xoh = new d();
      if (j > 0) {
        this.xoJ = new k(j);
      }
      if (i > 0) {
        this.xoL = new f(i);
      }
      this.xoz = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
      this.mObserver = new DataSetObserver()
      {
        private void cancel()
        {
          GMTrace.i(13072135618560L, 97395);
          if (DragSortListView.b(DragSortListView.this) == 4) {
            DragSortListView.this.ciU();
          }
          GMTrace.o(13072135618560L, 97395);
        }
        
        public final void onChanged()
        {
          GMTrace.i(13072269836288L, 97396);
          cancel();
          GMTrace.o(13072269836288L, 97396);
        }
        
        public final void onInvalidated()
        {
          GMTrace.i(13072404054016L, 97397);
          cancel();
          GMTrace.o(13072404054016L, 97397);
        }
      };
      GMTrace.o(13057908539392L, 97289);
      return;
      bool1 = false;
      break;
      this.xoj = f;
      break label372;
    }
  }
  
  private int Ee(int paramInt)
  {
    GMTrace.i(13058445410304L, 97293);
    View localView = getChildAt(paramInt - getFirstVisiblePosition());
    if (localView != null)
    {
      paramInt = localView.getHeight();
      GMTrace.o(13058445410304L, 97293);
      return paramInt;
    }
    paramInt = eG(paramInt, Eg(paramInt));
    GMTrace.o(13058445410304L, 97293);
    return paramInt;
  }
  
  private void Ef(int paramInt)
  {
    GMTrace.i(13059384934400L, 97300);
    this.DZ = 1;
    if (this.xoa != null) {
      this.xoa.remove(paramInt);
    }
    cjc();
    ciX();
    ciV();
    if (this.xox)
    {
      this.DZ = 3;
      GMTrace.o(13059384934400L, 97300);
      return;
    }
    this.DZ = 0;
    GMTrace.o(13059384934400L, 97300);
  }
  
  private int Eg(int paramInt)
  {
    GMTrace.i(13060995547136L, 97312);
    if (paramInt == this.xnT)
    {
      GMTrace.o(13060995547136L, 97312);
      return 0;
    }
    Object localObject = getChildAt(paramInt - getFirstVisiblePosition());
    if (localObject != null)
    {
      paramInt = b(paramInt, (View)localObject, false);
      GMTrace.o(13060995547136L, 97312);
      return paramInt;
    }
    int i = this.xoI.xpj.get(paramInt, -1);
    if (i != -1)
    {
      GMTrace.o(13060995547136L, 97312);
      return i;
    }
    localObject = getAdapter();
    i = ((ListAdapter)localObject).getItemViewType(paramInt);
    int j = ((ListAdapter)localObject).getViewTypeCount();
    if (j != this.xog.length) {
      this.xog = new View[j];
    }
    if (i >= 0) {
      if (this.xog[i] == null)
      {
        localObject = ((ListAdapter)localObject).getView(paramInt, null, this);
        this.xog[i] = localObject;
        i = b(paramInt, (View)localObject, true);
        localObject = this.xoI;
        j = ((i)localObject).xpj.get(paramInt, -1);
        if (j != i)
        {
          if (j != -1) {
            break label311;
          }
          if (((i)localObject).xpj.size() == ((i)localObject).vlT) {
            ((i)localObject).xpj.delete(((Integer)((i)localObject).xpk.remove(0)).intValue());
          }
        }
      }
    }
    for (;;)
    {
      ((i)localObject).xpj.put(paramInt, i);
      ((i)localObject).xpk.add(Integer.valueOf(paramInt));
      GMTrace.o(13060995547136L, 97312);
      return i;
      localObject = ((ListAdapter)localObject).getView(paramInt, this.xog[i], this);
      break;
      localObject = ((ListAdapter)localObject).getView(paramInt, null, this);
      break;
      label311:
      ((i)localObject).xpk.remove(Integer.valueOf(paramInt));
    }
  }
  
  private void J(MotionEvent paramMotionEvent)
  {
    GMTrace.i(13060190240768L, 97306);
    int i = paramMotionEvent.getAction() & 0xFF;
    if (i != 0)
    {
      this.ivM = this.xos;
      this.ivN = this.xot;
    }
    this.xos = ((int)paramMotionEvent.getX());
    this.xot = ((int)paramMotionEvent.getY());
    if (i == 0)
    {
      this.ivM = this.xos;
      this.ivN = this.xot;
    }
    this.xnW = ((int)paramMotionEvent.getRawX() - this.xos);
    this.xnX = ((int)paramMotionEvent.getRawY() - this.xot);
    GMTrace.o(13060190240768L, 97306);
  }
  
  private void a(int paramInt, Canvas paramCanvas)
  {
    GMTrace.i(13058176974848L, 97291);
    Drawable localDrawable = getDivider();
    int m = getDividerHeight();
    ViewGroup localViewGroup;
    int j;
    int k;
    int i;
    if ((localDrawable != null) && (m != 0))
    {
      localViewGroup = (ViewGroup)getChildAt(paramInt - getFirstVisiblePosition());
      if (localViewGroup != null)
      {
        j = getPaddingLeft();
        k = getWidth() - getPaddingRight();
        i = localViewGroup.getChildAt(0).getHeight();
        if (paramInt <= this.xnT) {
          break label146;
        }
        i += localViewGroup.getTop();
        paramInt = i + m;
      }
    }
    for (;;)
    {
      paramCanvas.save();
      paramCanvas.clipRect(j, i, k, paramInt);
      localDrawable.setBounds(j, i, k, paramInt);
      localDrawable.draw(paramCanvas);
      paramCanvas.restore();
      GMTrace.o(13058176974848L, 97291);
      return;
      label146:
      paramInt = localViewGroup.getBottom() - i;
      i = paramInt - m;
    }
  }
  
  private void a(int paramInt, View paramView, boolean paramBoolean)
  {
    GMTrace.i(13060861329408L, 97311);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int i;
    if ((paramInt != this.xnT) && (paramInt != this.xnQ) && (paramInt != this.xnR))
    {
      i = -2;
      if (i != localLayoutParams.height)
      {
        localLayoutParams.height = i;
        paramView.setLayoutParams(localLayoutParams);
      }
      if ((paramInt == this.xnQ) || (paramInt == this.xnR))
      {
        if (paramInt >= this.xnT) {
          break label174;
        }
        ((c)paramView).tl = 80;
      }
    }
    for (;;)
    {
      int k = paramView.getVisibility();
      int j = 0;
      i = j;
      if (paramInt == this.xnT)
      {
        i = j;
        if (this.xnI != null) {
          i = 4;
        }
      }
      if (i != k) {
        paramView.setVisibility(i);
      }
      GMTrace.o(13060861329408L, 97311);
      return;
      i = eG(paramInt, b(paramInt, paramView, paramBoolean));
      break;
      label174:
      if (paramInt > this.xnT) {
        ((c)paramView).tl = 48;
      }
    }
  }
  
  private int b(int paramInt, View paramView, boolean paramBoolean)
  {
    GMTrace.i(13061129764864L, 97313);
    if (paramInt == this.xnT)
    {
      GMTrace.o(13061129764864L, 97313);
      return 0;
    }
    View localView = paramView;
    if (paramInt >= getHeaderViewsCount()) {
      if (paramInt < getCount() - getFooterViewsCount()) {
        break label88;
      }
    }
    label88:
    for (localView = paramView;; localView = ((ViewGroup)paramView).getChildAt(0))
    {
      paramView = localView.getLayoutParams();
      if ((paramView == null) || (paramView.height <= 0)) {
        break;
      }
      paramInt = paramView.height;
      GMTrace.o(13061129764864L, 97313);
      return paramInt;
    }
    paramInt = localView.getHeight();
    if ((paramInt == 0) || (paramBoolean))
    {
      dF(localView);
      paramInt = localView.getMeasuredHeight();
    }
    GMTrace.o(13061129764864L, 97313);
    return paramInt;
  }
  
  private boolean b(boolean paramBoolean, float paramFloat)
  {
    GMTrace.i(13059787587584L, 97303);
    if (this.xnI != null)
    {
      this.xoh.cjd();
      if (paramBoolean) {
        l(this.xnT - getHeaderViewsCount(), paramFloat);
      }
      for (;;)
      {
        if (this.xoE)
        {
          e locale = this.xoF;
          if (locale.xpe)
          {
            locale.mBuilder.append("</DSLVStates>\n");
            locale.flush();
            locale.xpe = false;
          }
        }
        GMTrace.o(13059787587584L, 97303);
        return true;
        if (this.xoL != null) {
          this.xoL.start();
        } else {
          ciW();
        }
      }
    }
    GMTrace.o(13059787587584L, 97303);
    return false;
  }
  
  private void c(int paramInt, View paramView, boolean paramBoolean)
  {
    GMTrace.i(13062337724416L, 97322);
    this.xoG = true;
    if (this.xoy != null)
    {
      this.xnK.set(this.xos, this.xot);
      this.xoy.e(this.xnJ);
    }
    int i = this.xnJ.x;
    int m = this.xnJ.y;
    int j = getPaddingLeft();
    int k;
    int n;
    int i1;
    label308:
    int i4;
    int i5;
    int i6;
    label437:
    label487:
    int i3;
    int i2;
    label543:
    float f2;
    if (((this.xov & 0x1) == 0) && (i > j))
    {
      this.xnJ.x = j;
      j = getHeaderViewsCount();
      k = getFooterViewsCount();
      n = getFirstVisiblePosition();
      i1 = getLastVisiblePosition();
      i = getPaddingTop();
      if (n < j) {
        i = getChildAt(j - n - 1).getBottom();
      }
      j = i;
      if ((this.xov & 0x8) == 0)
      {
        j = i;
        if (n <= this.xnT) {
          j = Math.max(getChildAt(this.xnT - n).getTop(), i);
        }
      }
      i = getHeight() - getPaddingBottom();
      if (i1 >= getCount() - k - 1) {
        i = getChildAt(getCount() - k - 1 - n).getBottom();
      }
      k = i;
      if ((this.xov & 0x4) == 0)
      {
        k = i;
        if (i1 >= this.xnT) {
          k = Math.min(getChildAt(this.xnT - n).getBottom(), i);
        }
      }
      if (m >= j) {
        break label886;
      }
      this.xnJ.y = j;
      this.xnL = (this.xnJ.y + this.xoe);
      i4 = this.xnQ;
      i5 = this.xnR;
      i = getFirstVisiblePosition();
      j = this.xnQ;
      View localView2 = getChildAt(j - i);
      View localView1 = localView2;
      if (localView2 == null)
      {
        j = i + getChildCount() / 2;
        localView1 = getChildAt(j - i);
      }
      i1 = localView1.getTop();
      k = localView1.getHeight();
      i = eF(j, i1);
      i6 = getDividerHeight();
      if (this.xnL >= i) {
        break label971;
      }
      m = i;
      n = j;
      j = n;
      k = m;
      if (n >= 0)
      {
        n -= 1;
        i = Ee(n);
        if (n != 0) {
          break label915;
        }
        i = i1 - i6 - i;
        k = m;
        j = n;
      }
      n = getHeaderViewsCount();
      i3 = getFooterViewsCount();
      i1 = this.xnQ;
      i2 = this.xnR;
      float f1 = this.xoC;
      if (!this.xnS) {
        break label1176;
      }
      i6 = Math.abs(i - k);
      if (this.xnL >= i) {
        break label1112;
      }
      f2 = this.xoB;
      m = (int)(i6 * (0.5F * f2));
      f2 = m;
      k += m;
      if (this.xnL >= k) {
        break label1127;
      }
      this.xnQ = (j - 1);
      this.xnR = j;
      this.xoC = ((k - this.xnL) * 0.5F / f2);
      label614:
      if (this.xnQ >= n) {
        break label1191;
      }
      this.xnQ = n;
      this.xnR = n;
      j = n;
      label639:
      if ((this.xnQ == i1) && (this.xnR == i2) && (this.xoC == f1)) {
        break label1344;
      }
    }
    label886:
    label915:
    label971:
    label1112:
    label1127:
    label1176:
    label1191:
    label1320:
    label1326:
    label1344:
    for (i = 1;; i = 0)
    {
      if (j != this.xnP) {
        this.xnP = j;
      }
      for (j = 1;; j = i)
      {
        if (j != 0)
        {
          cja();
          k = Eg(paramInt);
          n = paramView.getHeight();
          i1 = eG(paramInt, k);
          if (paramInt == this.xnT) {
            break label1326;
          }
          i = n - k;
        }
        for (k = i1 - k;; k = i1)
        {
          i2 = this.xod;
          m = i2;
          if (this.xnT != this.xnQ)
          {
            m = i2;
            if (this.xnT != this.xnR) {
              m = i2 - this.xoc;
            }
          }
          if (paramInt <= i4)
          {
            if (paramInt <= this.xnQ) {
              break label1320;
            }
            i = m - k + 0;
          }
          for (;;)
          {
            setSelectionFromTop(paramInt, i + paramView.getTop() - getPaddingTop());
            layoutChildren();
            if ((j != 0) || (paramBoolean)) {
              invalidate();
            }
            this.xoG = false;
            GMTrace.o(13062337724416L, 97322);
            return;
            if (((this.xov & 0x2) != 0) || (i >= j)) {
              break;
            }
            this.xnJ.x = j;
            break;
            if (this.xod + m <= k) {
              break label308;
            }
            this.xnJ.y = (k - this.xod);
            break label308;
            i2 = i1 - (i + i6);
            i1 = eF(n, i2);
            j = n;
            k = m;
            i = i1;
            if (this.xnL >= i1) {
              break label487;
            }
            m = i1;
            i = i1;
            i1 = i2;
            break label437;
            int i7 = getCount();
            i2 = i1;
            i1 = k;
            n = i;
            m = j;
            for (;;)
            {
              j = m;
              k = n;
              if (m >= i7) {
                break;
              }
              if (m == i7 - 1)
              {
                i = i2 + i6 + i1;
                j = m;
                k = n;
                break;
              }
              i2 += i6 + i1;
              i3 = Ee(m + 1);
              i1 = eF(m + 1, i2);
              j = m;
              k = n;
              i = i1;
              if (this.xnL < i1) {
                break;
              }
              m += 1;
              n = i1;
              i = i1;
              i1 = i3;
            }
            m = k;
            k = i;
            i = m;
            break label543;
            if (this.xnL >= i - m)
            {
              this.xnQ = j;
              this.xnR = (j + 1);
              this.xoC = (0.5F * ((i - this.xnL) / f2 + 1.0F));
              break label614;
            }
            this.xnQ = j;
            this.xnR = j;
            break label614;
            if (this.xnR < getCount() - i3) {
              break label639;
            }
            j = getCount() - i3 - 1;
            this.xnQ = j;
            this.xnR = j;
            break label639;
            if (paramInt == i5)
            {
              if (paramInt <= this.xnQ) {
                i = i - m + 0;
              } else if (paramInt == this.xnR) {
                i = n - i1 + 0;
              } else {
                i += 0;
              }
            }
            else if (paramInt <= this.xnQ) {
              i = 0 - m;
            } else if (paramInt == this.xnR) {
              i = 0 - k;
            } else {
              i = 0;
            }
          }
          i = n;
        }
      }
    }
  }
  
  private void ciV()
  {
    GMTrace.i(13059116498944L, 97298);
    this.xnT = -1;
    this.xnQ = -1;
    this.xnR = -1;
    this.xnP = -1;
    GMTrace.o(13059116498944L, 97298);
  }
  
  private void ciW()
  {
    GMTrace.i(13059250716672L, 97299);
    this.DZ = 2;
    if ((this.xnZ != null) && (this.xnP >= 0) && (this.xnP < getCount()))
    {
      int i = getHeaderViewsCount();
      this.xnZ.bW(this.xnT - i, this.xnP - i);
    }
    cjc();
    ciX();
    ciV();
    cja();
    if (this.xox)
    {
      this.DZ = 3;
      GMTrace.o(13059250716672L, 97299);
      return;
    }
    this.DZ = 0;
    GMTrace.o(13059250716672L, 97299);
  }
  
  private void ciX()
  {
    int i = 0;
    GMTrace.i(13059519152128L, 97301);
    int j = getFirstVisiblePosition();
    if (this.xnT < j)
    {
      View localView = getChildAt(0);
      if (localView != null) {
        i = localView.getTop();
      }
      setSelectionFromTop(j - 1, i - getPaddingTop());
    }
    GMTrace.o(13059519152128L, 97301);
  }
  
  private void ciY()
  {
    GMTrace.i(13060056023040L, 97305);
    this.xoA = 0;
    this.xox = false;
    if (this.DZ == 3) {
      this.DZ = 0;
    }
    this.xnO = this.xnN;
    this.xoO = false;
    i locali = this.xoI;
    locali.xpj.clear();
    locali.xpk.clear();
    GMTrace.o(13060056023040L, 97305);
  }
  
  private void ciZ()
  {
    GMTrace.i(13060458676224L, 97308);
    int i = getPaddingTop();
    int j = getHeight() - i - getPaddingBottom();
    float f1 = j;
    this.xon = (i + this.xoi * f1);
    float f2 = i;
    this.xom = (f1 * (1.0F - this.xoj) + f2);
    this.xok = ((int)this.xon);
    this.xol = ((int)this.xom);
    this.xoo = (this.xon - i);
    this.xop = (i + j - this.xom);
    GMTrace.o(13060458676224L, 97308);
  }
  
  private void cja()
  {
    GMTrace.i(13060727111680L, 97310);
    int j = getFirstVisiblePosition();
    int k = getLastVisiblePosition();
    int i = Math.max(0, getHeaderViewsCount() - j);
    k = Math.min(k - j, getCount() - 1 - getFooterViewsCount() - j);
    while (i <= k)
    {
      View localView = getChildAt(i);
      if (localView != null) {
        a(j + i, localView, false);
      }
      i += 1;
    }
    GMTrace.o(13060727111680L, 97310);
  }
  
  private void cjb()
  {
    GMTrace.i(13061666635776L, 97317);
    if (this.xnI != null)
    {
      dF(this.xnI);
      this.xod = this.xnI.getMeasuredHeight();
      this.xoe = (this.xod / 2);
    }
    GMTrace.o(13061666635776L, 97317);
  }
  
  private void cjc()
  {
    GMTrace.i(13062471942144L, 97323);
    if (this.xnI != null)
    {
      this.xnI.setVisibility(8);
      if (this.xoy != null) {
        this.xoy.dG(this.xnI);
      }
      this.xnI = null;
      invalidate();
    }
    GMTrace.o(13062471942144L, 97323);
  }
  
  private void dF(View paramView)
  {
    GMTrace.i(13061532418048L, 97316);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    Object localObject = localLayoutParams;
    if (localLayoutParams == null)
    {
      localObject = new AbsListView.LayoutParams(-1, -2);
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    int j = ViewGroup.getChildMeasureSpec(this.xof, getListPaddingLeft() + getListPaddingRight(), ((ViewGroup.LayoutParams)localObject).width);
    if (((ViewGroup.LayoutParams)localObject).height > 0) {}
    for (int i = View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).height, 1073741824);; i = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(j, i);
      GMTrace.o(13061532418048L, 97316);
      return;
    }
  }
  
  private int eF(int paramInt1, int paramInt2)
  {
    GMTrace.i(13058579628032L, 97294);
    int i = getHeaderViewsCount();
    int j = getFooterViewsCount();
    if ((paramInt1 <= i) || (paramInt1 >= getCount() - j))
    {
      GMTrace.o(13058579628032L, 97294);
      return paramInt2;
    }
    j = getDividerHeight();
    int m = this.xod - this.xoc;
    int k = Eg(paramInt1);
    int n = Ee(paramInt1);
    if (this.xnR <= this.xnT) {
      if ((paramInt1 == this.xnR) && (this.xnQ != this.xnR)) {
        if (paramInt1 == this.xnT)
        {
          i = paramInt2 + n - this.xod;
          if (paramInt1 > this.xnT) {
            break label265;
          }
        }
      }
    }
    label265:
    for (paramInt1 = (this.xod - j - Eg(paramInt1 - 1)) / 2 + i;; paramInt1 = (k - j - this.xod) / 2 + i)
    {
      GMTrace.o(13058579628032L, 97294);
      return paramInt1;
      i = n - k + paramInt2 - m;
      break;
      i = paramInt2;
      if (paramInt1 <= this.xnR) {
        break;
      }
      i = paramInt2;
      if (paramInt1 > this.xnT) {
        break;
      }
      i = paramInt2 - m;
      break;
      if ((paramInt1 > this.xnT) && (paramInt1 <= this.xnQ))
      {
        i = paramInt2 + m;
        break;
      }
      i = paramInt2;
      if (paramInt1 != this.xnR) {
        break;
      }
      i = paramInt2;
      if (this.xnQ == this.xnR) {
        break;
      }
      i = paramInt2 + (n - k);
      break;
    }
  }
  
  private int eG(int paramInt1, int paramInt2)
  {
    GMTrace.i(13061263982592L, 97314);
    getDividerHeight();
    int i;
    int j;
    int k;
    if ((this.xnS) && (this.xnQ != this.xnR))
    {
      i = 1;
      j = this.xod - this.xoc;
      k = (int)(this.xoC * j);
      if (paramInt1 != this.xnT) {
        break label141;
      }
      if (this.xnT != this.xnQ) {
        break label111;
      }
      if (i == 0) {
        break label103;
      }
      i = k + this.xoc;
    }
    for (;;)
    {
      GMTrace.o(13061263982592L, 97314);
      return i;
      i = 0;
      break;
      label103:
      i = this.xod;
      continue;
      label111:
      if (this.xnT == this.xnR)
      {
        i = this.xod - k;
      }
      else
      {
        i = this.xoc;
        continue;
        label141:
        if (paramInt1 == this.xnQ)
        {
          if (i != 0) {
            i = paramInt2 + k;
          } else {
            i = paramInt2 + j;
          }
        }
        else
        {
          i = paramInt2;
          if (paramInt1 == this.xnR) {
            i = paramInt2 + j - k;
          }
        }
      }
    }
  }
  
  private void mJ(boolean paramBoolean)
  {
    GMTrace.i(13062203506688L, 97321);
    int i = getFirstVisiblePosition();
    int j = getChildCount() / 2;
    View localView = getChildAt(getChildCount() / 2);
    if (localView == null)
    {
      GMTrace.o(13062203506688L, 97321);
      return;
    }
    c(i + j, localView, true);
    GMTrace.o(13062203506688L, 97321);
  }
  
  public final boolean a(int paramInt1, View paramView, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13062069288960L, 97320);
    if ((this.DZ != 0) || (!this.xox) || (this.xnI != null) || (paramView == null) || (!this.xob))
    {
      GMTrace.o(13062069288960L, 97320);
      return false;
    }
    if (getParent() != null) {
      getParent().requestDisallowInterceptTouchEvent(true);
    }
    paramInt1 = getHeaderViewsCount() + paramInt1;
    this.xnQ = paramInt1;
    this.xnR = paramInt1;
    this.xnT = paramInt1;
    this.xnP = paramInt1;
    this.DZ = 4;
    this.xov = 0;
    this.xov |= paramInt2;
    this.xnI = paramView;
    cjb();
    this.xnU = paramInt3;
    this.xnV = paramInt4;
    this.xou = this.xot;
    this.xnJ.x = (this.xos - this.xnU);
    this.xnJ.y = (this.xot - this.xnV);
    paramView = getChildAt(this.xnT - getFirstVisiblePosition());
    if (paramView != null) {
      paramView.setVisibility(4);
    }
    if (this.xoE)
    {
      paramView = this.xoF;
      paramView.mBuilder.append("<DSLVStates>\n");
      paramView.xpd = 0;
      paramView.xpe = true;
    }
    switch (this.xoA)
    {
    }
    for (;;)
    {
      requestLayout();
      if (this.xoK != null) {
        this.xoK.start();
      }
      GMTrace.o(13062069288960L, 97320);
      return true;
      super.onTouchEvent(this.xoz);
      continue;
      super.onInterceptTouchEvent(this.xoz);
    }
  }
  
  public final boolean ax(float paramFloat)
  {
    GMTrace.i(13059653369856L, 97302);
    this.xoM = true;
    boolean bool = b(true, paramFloat);
    GMTrace.o(13059653369856L, 97302);
    return bool;
  }
  
  public final void ciU()
  {
    GMTrace.i(13058982281216L, 97297);
    if (this.DZ == 4)
    {
      this.xoh.cjd();
      cjc();
      ciV();
      cja();
      if (this.xox)
      {
        this.DZ = 3;
        GMTrace.o(13058982281216L, 97297);
        return;
      }
      this.DZ = 0;
    }
    GMTrace.o(13058982281216L, 97297);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(13058311192576L, 97292);
    super.dispatchDraw(paramCanvas);
    if (this.DZ != 0)
    {
      if (this.xnQ != this.xnT) {
        a(this.xnQ, paramCanvas);
      }
      if ((this.xnR != this.xnQ) && (this.xnR != this.xnT)) {
        a(this.xnR, paramCanvas);
      }
    }
    int k;
    int m;
    int i;
    float f;
    if (this.xnI != null)
    {
      k = this.xnI.getWidth();
      m = this.xnI.getHeight();
      int j = this.xnJ.x;
      int n = getWidth();
      i = j;
      if (j < 0) {
        i = -j;
      }
      if (i >= n) {
        break label234;
      }
      f = (n - i) / n;
    }
    label234:
    for (f *= f;; f = 0.0F)
    {
      i = (int)(f * (255.0F * this.xnO));
      paramCanvas.save();
      paramCanvas.translate(this.xnJ.x, this.xnJ.y);
      paramCanvas.clipRect(0, 0, k, m);
      paramCanvas.saveLayerAlpha(0.0F, 0.0F, k, m, i, 31);
      this.xnI.draw(paramCanvas);
      paramCanvas.restore();
      paramCanvas.restore();
      GMTrace.o(13058311192576L, 97292);
      return;
    }
  }
  
  public final void l(int paramInt, float paramFloat)
  {
    GMTrace.i(13058848063488L, 97296);
    if ((this.DZ == 0) || (this.DZ == 4))
    {
      if (this.DZ == 0)
      {
        this.xnT = (getHeaderViewsCount() + paramInt);
        this.xnQ = this.xnT;
        this.xnR = this.xnT;
        this.xnP = this.xnT;
        View localView = getChildAt(this.xnT - getFirstVisiblePosition());
        if (localView != null) {
          localView.setVisibility(4);
        }
      }
      this.DZ = 1;
      this.xoN = paramFloat;
      if (this.xox) {
        switch (this.xoA)
        {
        }
      }
      while (this.xoJ != null)
      {
        this.xoJ.start();
        GMTrace.o(13058848063488L, 97296);
        return;
        super.onTouchEvent(this.xoz);
        continue;
        super.onInterceptTouchEvent(this.xoz);
      }
      Ef(paramInt);
    }
    GMTrace.o(13058848063488L, 97296);
  }
  
  protected void layoutChildren()
  {
    GMTrace.i(13061935071232L, 97319);
    super.layoutChildren();
    if (this.xnI != null)
    {
      if ((this.xnI.isLayoutRequested()) && (!this.xnM)) {
        cjb();
      }
      this.xnI.layout(0, 0, this.xnI.getMeasuredWidth(), this.xnI.getMeasuredHeight());
      this.xnM = false;
    }
    GMTrace.o(13061935071232L, 97319);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(13058713845760L, 97295);
    super.onDraw(paramCanvas);
    if (this.xoE)
    {
      paramCanvas = this.xoF;
      if (paramCanvas.xpe)
      {
        paramCanvas.mBuilder.append("<DSLVState>\n");
        int j = paramCanvas.xoQ.getChildCount();
        int k = paramCanvas.xoQ.getFirstVisiblePosition();
        paramCanvas.mBuilder.append("    <Positions>");
        int i = 0;
        while (i < j)
        {
          paramCanvas.mBuilder.append(k + i).append(",");
          i += 1;
        }
        paramCanvas.mBuilder.append("</Positions>\n");
        paramCanvas.mBuilder.append("    <Tops>");
        i = 0;
        while (i < j)
        {
          paramCanvas.mBuilder.append(paramCanvas.xoQ.getChildAt(i).getTop()).append(",");
          i += 1;
        }
        paramCanvas.mBuilder.append("</Tops>\n");
        paramCanvas.mBuilder.append("    <Bottoms>");
        i = 0;
        while (i < j)
        {
          paramCanvas.mBuilder.append(paramCanvas.xoQ.getChildAt(i).getBottom()).append(",");
          i += 1;
        }
        paramCanvas.mBuilder.append("</Bottoms>\n");
        paramCanvas.mBuilder.append("    <FirstExpPos>").append(paramCanvas.xoQ.xnQ).append("</FirstExpPos>\n");
        paramCanvas.mBuilder.append("    <FirstExpBlankHeight>").append(paramCanvas.xoQ.Ee(paramCanvas.xoQ.xnQ) - paramCanvas.xoQ.Eg(paramCanvas.xoQ.xnQ)).append("</FirstExpBlankHeight>\n");
        paramCanvas.mBuilder.append("    <SecondExpPos>").append(paramCanvas.xoQ.xnR).append("</SecondExpPos>\n");
        paramCanvas.mBuilder.append("    <SecondExpBlankHeight>").append(paramCanvas.xoQ.Ee(paramCanvas.xoQ.xnR) - paramCanvas.xoQ.Eg(paramCanvas.xoQ.xnR)).append("</SecondExpBlankHeight>\n");
        paramCanvas.mBuilder.append("    <SrcPos>").append(paramCanvas.xoQ.xnT).append("</SrcPos>\n");
        paramCanvas.mBuilder.append("    <SrcHeight>").append(paramCanvas.xoQ.xod + paramCanvas.xoQ.getDividerHeight()).append("</SrcHeight>\n");
        paramCanvas.mBuilder.append("    <ViewHeight>").append(paramCanvas.xoQ.getHeight()).append("</ViewHeight>\n");
        paramCanvas.mBuilder.append("    <LastY>").append(paramCanvas.xoQ.ivN).append("</LastY>\n");
        paramCanvas.mBuilder.append("    <FloatY>").append(paramCanvas.xoQ.xnL).append("</FloatY>\n");
        paramCanvas.mBuilder.append("    <ShuffleEdges>");
        i = 0;
        while (i < j)
        {
          paramCanvas.mBuilder.append(paramCanvas.xoQ.eF(k + i, paramCanvas.xoQ.getChildAt(i).getTop())).append(",");
          i += 1;
        }
        paramCanvas.mBuilder.append("</ShuffleEdges>\n");
        paramCanvas.mBuilder.append("</DSLVState>\n");
        paramCanvas.xpc += 1;
        if (paramCanvas.xpc > 1000)
        {
          paramCanvas.flush();
          paramCanvas.xpc = 0;
        }
      }
    }
    GMTrace.o(13058713845760L, 97295);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(13060324458496L, 97307);
    if (!this.xob)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(13060324458496L, 97307);
      return bool;
    }
    J(paramMotionEvent);
    this.xow = true;
    int i = paramMotionEvent.getAction() & 0xFF;
    if (i == 0)
    {
      if (this.DZ != 0)
      {
        this.xoH = true;
        GMTrace.o(13060324458496L, 97307);
        return true;
      }
      this.xox = true;
    }
    if (this.xnI != null)
    {
      bool = true;
      if ((i == 1) || (i == 3)) {
        this.xox = false;
      }
      GMTrace.o(13060324458496L, 97307);
      return bool;
    }
    if (super.onInterceptTouchEvent(paramMotionEvent)) {
      this.xoO = true;
    }
    for (boolean bool = true;; bool = false) {
      switch (i)
      {
      case 2: 
      default: 
        if (bool) {
          this.xoA = 1;
        }
        break;
      case 1: 
      case 3: 
        ciY();
        break;
        this.xoA = 2;
        break;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(13061800853504L, 97318);
    super.onMeasure(paramInt1, paramInt2);
    if (this.xnI != null)
    {
      if (this.xnI.isLayoutRequested()) {
        cjb();
      }
      this.xnM = true;
    }
    this.xof = paramInt1;
    GMTrace.o(13061800853504L, 97318);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(13060592893952L, 97309);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    ciZ();
    GMTrace.o(13060592893952L, 97309);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(13059921805312L, 97304);
    if (this.xoH)
    {
      this.xoH = false;
      GMTrace.o(13059921805312L, 97304);
      return false;
    }
    if (!this.xob)
    {
      bool1 = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(13059921805312L, 97304);
      return bool1;
    }
    boolean bool1 = this.xow;
    this.xow = false;
    if (!bool1) {
      J(paramMotionEvent);
    }
    boolean bool2;
    if (this.DZ == 4)
    {
      paramMotionEvent.getAction();
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      }
      for (;;)
      {
        bool2 = true;
        GMTrace.o(13059921805312L, 97304);
        return bool2;
        if (this.DZ == 4) {
          ciU();
        }
        ciY();
        continue;
        if (this.DZ == 4)
        {
          this.xoM = false;
          b(false, 0.0F);
        }
        ciY();
        continue;
        int j = (int)paramMotionEvent.getX();
        int i = (int)paramMotionEvent.getY();
        this.xnJ.x = (j - this.xnU);
        this.xnJ.y = (i - this.xnV);
        mJ(true);
        j = Math.min(i, this.xnL + this.xoe);
        int k = Math.max(i, this.xnL - this.xoe);
        paramMotionEvent = this.xoh;
        if (paramMotionEvent.xpb) {}
        for (i = paramMotionEvent.xoZ;; i = -1)
        {
          if ((j <= this.ivN) || (j <= this.xol) || (i == 1)) {
            break label327;
          }
          if (i != -1) {
            this.xoh.cjd();
          }
          this.xoh.Eh(1);
          break;
        }
        label327:
        if ((k < this.ivN) && (k < this.xok) && (i != 0))
        {
          if (i != -1) {
            this.xoh.cjd();
          }
          this.xoh.Eh(0);
        }
        else if ((k >= this.xok) && (j <= this.xol) && (this.xoh.xpb))
        {
          this.xoh.cjd();
        }
      }
    }
    if ((this.DZ == 0) && (super.onTouchEvent(paramMotionEvent))) {}
    for (bool1 = true;; bool1 = false) {
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      case 2: 
      default: 
        bool2 = bool1;
        if (!bool1) {
          break;
        }
        this.xoA = 1;
        bool2 = bool1;
        break;
      case 1: 
      case 3: 
        ciY();
        bool2 = bool1;
        break;
      }
    }
  }
  
  public void requestLayout()
  {
    GMTrace.i(13061398200320L, 97315);
    if (!this.xoG) {
      super.requestLayout();
    }
    GMTrace.o(13061398200320L, 97315);
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    GMTrace.i(13058042757120L, 97290);
    if (paramListAdapter != null)
    {
      this.xoD = new a(paramListAdapter);
      paramListAdapter.registerDataSetObserver(this.mObserver);
      if ((paramListAdapter instanceof g)) {
        this.xnZ = ((g)paramListAdapter);
      }
      if ((paramListAdapter instanceof b)) {
        this.xnY = ((b)paramListAdapter);
      }
      if ((paramListAdapter instanceof l)) {
        this.xoa = ((l)paramListAdapter);
      }
    }
    for (;;)
    {
      super.setAdapter(this.xoD);
      GMTrace.o(13058042757120L, 97290);
      return;
      this.xoD = null;
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private ListAdapter EP;
    
    public a(ListAdapter paramListAdapter)
    {
      GMTrace.i(13056029491200L, 97275);
      this.EP = paramListAdapter;
      this.EP.registerDataSetObserver(new DataSetObserver()
      {
        public final void onChanged()
        {
          GMTrace.i(13052539830272L, 97249);
          DragSortListView.a.this.notifyDataSetChanged();
          GMTrace.o(13052539830272L, 97249);
        }
        
        public final void onInvalidated()
        {
          GMTrace.i(13052674048000L, 97250);
          DragSortListView.a.this.notifyDataSetInvalidated();
          GMTrace.o(13052674048000L, 97250);
        }
      });
      GMTrace.o(13056029491200L, 97275);
    }
    
    public final boolean areAllItemsEnabled()
    {
      GMTrace.i(13056566362112L, 97279);
      boolean bool = this.EP.areAllItemsEnabled();
      GMTrace.o(13056566362112L, 97279);
      return bool;
    }
    
    public final int getCount()
    {
      GMTrace.i(13056432144384L, 97278);
      int i = this.EP.getCount();
      GMTrace.o(13056432144384L, 97278);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(13056297926656L, 97277);
      Object localObject = this.EP.getItem(paramInt);
      GMTrace.o(13056297926656L, 97277);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(13056163708928L, 97276);
      long l = this.EP.getItemId(paramInt);
      GMTrace.o(13056163708928L, 97276);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(13056834797568L, 97281);
      paramInt = this.EP.getItemViewType(paramInt);
      GMTrace.o(13056834797568L, 97281);
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(13057371668480L, 97285);
      if (paramView != null)
      {
        paramViewGroup = (c)paramView;
        View localView1 = paramViewGroup.getChildAt(0);
        View localView2 = this.EP.getView(paramInt, localView1, DragSortListView.this);
        paramView = paramViewGroup;
        if (localView2 != localView1)
        {
          if (localView1 != null) {
            paramViewGroup.removeViewAt(0);
          }
          paramViewGroup.addView(localView2);
          paramView = paramViewGroup;
        }
        DragSortListView.a(DragSortListView.this, DragSortListView.this.getHeaderViewsCount() + paramInt, paramView);
        GMTrace.o(13057371668480L, 97285);
        return paramView;
      }
      paramViewGroup = this.EP.getView(paramInt, null, DragSortListView.this);
      if ((paramViewGroup instanceof Checkable)) {}
      for (paramView = new d(DragSortListView.this.getContext());; paramView = new c(DragSortListView.this.getContext()))
      {
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        paramView.addView(paramViewGroup);
        break;
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(13056969015296L, 97282);
      int i = this.EP.getViewTypeCount();
      GMTrace.o(13056969015296L, 97282);
      return i;
    }
    
    public final boolean hasStableIds()
    {
      GMTrace.i(13057103233024L, 97283);
      boolean bool = this.EP.hasStableIds();
      GMTrace.o(13057103233024L, 97283);
      return bool;
    }
    
    public final boolean isEmpty()
    {
      GMTrace.i(13057237450752L, 97284);
      boolean bool = this.EP.isEmpty();
      GMTrace.o(13057237450752L, 97284);
      return bool;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(13056700579840L, 97280);
      boolean bool = this.EP.isEnabled(paramInt);
      GMTrace.o(13056700579840L, 97280);
      return bool;
    }
  }
  
  public static abstract interface b {}
  
  public static abstract interface c
  {
    public abstract float ay(float paramFloat);
  }
  
  private final class d
    implements Runnable
  {
    private boolean xoT;
    private long xoU;
    private long xoV;
    private int xoW;
    private float xoX;
    private long xoY;
    int xoZ;
    private float xpa;
    boolean xpb;
    
    public d()
    {
      GMTrace.i(13079249158144L, 97448);
      this.xpb = false;
      GMTrace.o(13079249158144L, 97448);
    }
    
    public final void Eh(int paramInt)
    {
      GMTrace.i(13079383375872L, 97449);
      if (!this.xpb)
      {
        this.xoT = false;
        this.xpb = true;
        this.xoY = SystemClock.uptimeMillis();
        this.xoU = this.xoY;
        this.xoZ = paramInt;
        DragSortListView.this.post(this);
      }
      GMTrace.o(13079383375872L, 97449);
    }
    
    public final void cjd()
    {
      GMTrace.i(13079517593600L, 97450);
      DragSortListView.this.removeCallbacks(this);
      this.xpb = false;
      GMTrace.o(13079517593600L, 97450);
    }
    
    public final void run()
    {
      GMTrace.i(13079651811328L, 97451);
      if (this.xoT)
      {
        this.xpb = false;
        GMTrace.o(13079651811328L, 97451);
        return;
      }
      int j = DragSortListView.this.getFirstVisiblePosition();
      int i = DragSortListView.this.getLastVisiblePosition();
      int m = DragSortListView.this.getCount();
      int k = DragSortListView.this.getPaddingTop();
      int n = DragSortListView.this.getHeight() - k - DragSortListView.this.getPaddingBottom();
      int i1 = Math.min(DragSortListView.f(DragSortListView.this), DragSortListView.s(DragSortListView.this) + DragSortListView.d(DragSortListView.this));
      int i2 = Math.max(DragSortListView.f(DragSortListView.this), DragSortListView.s(DragSortListView.this) - DragSortListView.d(DragSortListView.this));
      View localView;
      if (this.xoZ == 0)
      {
        localView = DragSortListView.this.getChildAt(0);
        if (localView == null)
        {
          this.xpb = false;
          GMTrace.o(13079651811328L, 97451);
          return;
        }
        if ((j == 0) && (localView.getTop() == k))
        {
          this.xpb = false;
          GMTrace.o(13079651811328L, 97451);
          return;
        }
        this.xpa = DragSortListView.v(DragSortListView.this).ay((DragSortListView.t(DragSortListView.this) - i2) / DragSortListView.u(DragSortListView.this));
        this.xoV = SystemClock.uptimeMillis();
        this.xoX = ((float)(this.xoV - this.xoU));
        this.xoW = Math.round(this.xpa * this.xoX);
        if (this.xoW < 0) {
          break label517;
        }
        this.xoW = Math.min(n, this.xoW);
        i = j;
      }
      for (;;)
      {
        localView = DragSortListView.this.getChildAt(i - j);
        m = localView.getTop() + this.xoW;
        j = m;
        if (i == 0)
        {
          j = m;
          if (m > k) {
            j = k;
          }
        }
        DragSortListView.a(DragSortListView.this, true);
        DragSortListView.this.setSelectionFromTop(i, j - k);
        DragSortListView.this.layoutChildren();
        DragSortListView.this.invalidate();
        DragSortListView.a(DragSortListView.this, false);
        DragSortListView.c(DragSortListView.this, i, localView);
        this.xoU = this.xoV;
        DragSortListView.this.post(this);
        GMTrace.o(13079651811328L, 97451);
        return;
        localView = DragSortListView.this.getChildAt(i - j);
        if (localView == null)
        {
          this.xpb = false;
          GMTrace.o(13079651811328L, 97451);
          return;
        }
        if ((i == m - 1) && (localView.getBottom() <= n + k))
        {
          this.xpb = false;
          GMTrace.o(13079651811328L, 97451);
          return;
        }
        this.xpa = (-DragSortListView.v(DragSortListView.this).ay((i1 - DragSortListView.w(DragSortListView.this)) / DragSortListView.x(DragSortListView.this)));
        break;
        label517:
        this.xoW = Math.max(-n, this.xoW);
      }
    }
  }
  
  private final class e
  {
    File hJl;
    StringBuilder mBuilder;
    int xpc;
    int xpd;
    boolean xpe;
    
    public e()
    {
      GMTrace.i(13072538271744L, 97398);
      this.mBuilder = new StringBuilder();
      this.xpc = 0;
      this.xpd = 0;
      this.xpe = false;
      this.hJl = new File(Environment.getExternalStorageDirectory(), "dslv_state.txt");
      if (!this.hJl.exists()) {
        try
        {
          this.hJl.createNewFile();
          w.d("mobeta", "file created");
          GMTrace.o(13072538271744L, 97398);
          return;
        }
        catch (IOException this$1)
        {
          w.w("mobeta", "Could not create dslv_state.txt");
          w.d("mobeta", DragSortListView.this.getMessage());
        }
      }
      GMTrace.o(13072538271744L, 97398);
    }
    
    /* Error */
    public final void flush()
    {
      // Byte code:
      //   0: ldc2_w 94
      //   3: ldc 96
      //   5: invokestatic 36	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 47	com/tencent/mm/ui/widget/DragSortListView$e:xpe	Z
      //   12: ifne +12 -> 24
      //   15: ldc2_w 94
      //   18: ldc 96
      //   20: invokestatic 82	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   23: return
      //   24: aconst_null
      //   25: astore_3
      //   26: iconst_1
      //   27: istore_1
      //   28: aload_0
      //   29: getfield 45	com/tencent/mm/ui/widget/DragSortListView$e:xpd	I
      //   32: ifne +5 -> 37
      //   35: iconst_0
      //   36: istore_1
      //   37: new 98	java/io/FileWriter
      //   40: dup
      //   41: aload_0
      //   42: getfield 62	com/tencent/mm/ui/widget/DragSortListView$e:hJl	Ljava/io/File;
      //   45: iload_1
      //   46: invokespecial 101	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
      //   49: astore_2
      //   50: aload_2
      //   51: aload_0
      //   52: getfield 41	com/tencent/mm/ui/widget/DragSortListView$e:mBuilder	Ljava/lang/StringBuilder;
      //   55: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   58: invokevirtual 108	java/io/FileWriter:write	(Ljava/lang/String;)V
      //   61: aload_0
      //   62: getfield 41	com/tencent/mm/ui/widget/DragSortListView$e:mBuilder	Ljava/lang/StringBuilder;
      //   65: iconst_0
      //   66: aload_0
      //   67: getfield 41	com/tencent/mm/ui/widget/DragSortListView$e:mBuilder	Ljava/lang/StringBuilder;
      //   70: invokevirtual 112	java/lang/StringBuilder:length	()I
      //   73: invokevirtual 116	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
      //   76: pop
      //   77: aload_2
      //   78: invokevirtual 118	java/io/FileWriter:flush	()V
      //   81: aload_0
      //   82: aload_0
      //   83: getfield 45	com/tencent/mm/ui/widget/DragSortListView$e:xpd	I
      //   86: iconst_1
      //   87: iadd
      //   88: putfield 45	com/tencent/mm/ui/widget/DragSortListView$e:xpd	I
      //   91: aload_2
      //   92: invokevirtual 121	java/io/FileWriter:close	()V
      //   95: ldc2_w 94
      //   98: ldc 96
      //   100: invokestatic 82	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   103: return
      //   104: astore_2
      //   105: ldc2_w 94
      //   108: ldc 96
      //   110: invokestatic 82	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   113: return
      //   114: astore_2
      //   115: aconst_null
      //   116: astore_2
      //   117: aload_2
      //   118: ifnull +7 -> 125
      //   121: aload_2
      //   122: invokevirtual 121	java/io/FileWriter:close	()V
      //   125: ldc2_w 94
      //   128: ldc 96
      //   130: invokestatic 82	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   133: return
      //   134: astore_2
      //   135: ldc2_w 94
      //   138: ldc 96
      //   140: invokestatic 82	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   143: return
      //   144: astore_2
      //   145: aload_3
      //   146: ifnull +7 -> 153
      //   149: aload_3
      //   150: invokevirtual 121	java/io/FileWriter:close	()V
      //   153: aload_2
      //   154: athrow
      //   155: astore_3
      //   156: goto -3 -> 153
      //   159: astore 4
      //   161: aload_2
      //   162: astore_3
      //   163: aload 4
      //   165: astore_2
      //   166: goto -21 -> 145
      //   169: astore_3
      //   170: goto -53 -> 117
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	173	0	this	e
      //   27	19	1	bool	boolean
      //   49	43	2	localFileWriter	java.io.FileWriter
      //   104	1	2	localIOException1	IOException
      //   114	1	2	localIOException2	IOException
      //   116	6	2	localObject1	Object
      //   134	1	2	localIOException3	IOException
      //   144	18	2	localObject2	Object
      //   165	1	2	localObject3	Object
      //   25	125	3	localObject4	Object
      //   155	1	3	localIOException4	IOException
      //   162	1	3	localObject5	Object
      //   169	1	3	localIOException5	IOException
      //   159	5	4	localObject6	Object
      // Exception table:
      //   from	to	target	type
      //   91	95	104	java/io/IOException
      //   28	35	114	java/io/IOException
      //   37	50	114	java/io/IOException
      //   121	125	134	java/io/IOException
      //   28	35	144	finally
      //   37	50	144	finally
      //   149	153	155	java/io/IOException
      //   50	91	159	finally
      //   50	91	169	java/io/IOException
    }
  }
  
  private final class f
    extends DragSortListView.m
  {
    private int xpf;
    private int xpg;
    private float xph;
    private float xpi;
    
    public f(int paramInt)
    {
      super(0.5F, paramInt);
      GMTrace.i(13080457117696L, 97457);
      GMTrace.o(13080457117696L, 97457);
    }
    
    private int cje()
    {
      GMTrace.i(13080725553152L, 97459);
      int i = DragSortListView.this.getFirstVisiblePosition();
      int j = (DragSortListView.j(DragSortListView.this) + DragSortListView.this.getDividerHeight()) / 2;
      View localView = DragSortListView.this.getChildAt(this.xpf - i);
      i = -1;
      if (localView != null) {
        if (this.xpf == this.xpg) {
          i = localView.getTop();
        }
      }
      for (;;)
      {
        GMTrace.o(13080725553152L, 97459);
        return i;
        if (this.xpf < this.xpg)
        {
          i = localView.getTop() - j;
        }
        else
        {
          i = localView.getBottom() + j - DragSortListView.k(DragSortListView.this);
          continue;
          this.Lv = true;
        }
      }
    }
    
    public final void az(float paramFloat)
    {
      GMTrace.i(13080859770880L, 97460);
      int i = cje();
      int j = DragSortListView.this.getPaddingLeft();
      float f1 = DragSortListView.e(DragSortListView.this).y - i;
      float f2 = DragSortListView.e(DragSortListView.this).x - j;
      paramFloat = 1.0F - paramFloat;
      if ((paramFloat < Math.abs(f1 / this.xph)) || (paramFloat < Math.abs(f2 / this.xpi)))
      {
        DragSortListView.e(DragSortListView.this).y = (i + (int)(this.xph * paramFloat));
        DragSortListView.e(DragSortListView.this).x = (DragSortListView.this.getPaddingLeft() + (int)(this.xpi * paramFloat));
        DragSortListView.g(DragSortListView.this);
      }
      GMTrace.o(13080859770880L, 97460);
    }
    
    public final void onStart()
    {
      GMTrace.i(13080591335424L, 97458);
      this.xpf = DragSortListView.h(DragSortListView.this);
      this.xpg = DragSortListView.i(DragSortListView.this);
      DragSortListView.b(DragSortListView.this, 2);
      this.xph = (DragSortListView.e(DragSortListView.this).y - cje());
      this.xpi = (DragSortListView.e(DragSortListView.this).x - DragSortListView.this.getPaddingLeft());
      GMTrace.o(13080591335424L, 97458);
    }
    
    public final void onStop()
    {
      GMTrace.i(13080993988608L, 97461);
      DragSortListView.l(DragSortListView.this);
      GMTrace.o(13080993988608L, 97461);
    }
  }
  
  public static abstract interface g
  {
    public abstract void bW(int paramInt1, int paramInt2);
  }
  
  public static abstract interface h
  {
    public abstract View Ei(int paramInt);
    
    public abstract void dG(View paramView);
    
    public abstract void e(Point paramPoint);
  }
  
  private final class i
  {
    int vlT;
    SparseIntArray xpj;
    ArrayList<Integer> xpk;
    
    public i()
    {
      GMTrace.i(13057774321664L, 97288);
      this.xpj = new SparseIntArray(3);
      this.xpk = new ArrayList(3);
      this.vlT = 3;
      GMTrace.o(13057774321664L, 97288);
    }
  }
  
  private final class j
    extends DragSortListView.m
  {
    private float xpl;
    private float xpm;
    
    public final void az(float paramFloat)
    {
      GMTrace.i(13071061876736L, 97387);
      if (DragSortListView.b(this.xoQ) != 4)
      {
        this.Lv = true;
        GMTrace.o(13071061876736L, 97387);
        return;
      }
      DragSortListView.a(this.xoQ, (int)(this.xpm * paramFloat + (1.0F - paramFloat) * this.xpl));
      DragSortListView.e(this.xoQ).y = (DragSortListView.f(this.xoQ) - DragSortListView.c(this.xoQ));
      DragSortListView.g(this.xoQ);
      GMTrace.o(13071061876736L, 97387);
    }
    
    public final void onStart()
    {
      GMTrace.i(13070927659008L, 97386);
      this.xpl = DragSortListView.c(this.xoQ);
      this.xpm = DragSortListView.d(this.xoQ);
      GMTrace.o(13070927659008L, 97386);
    }
  }
  
  private final class k
    extends DragSortListView.m
  {
    private int jQO;
    private int xpg;
    private float xpn;
    private float xpo;
    private float xpp;
    private int xpq;
    private int xpr;
    private int xps;
    
    public k(int paramInt)
    {
      super(0.5F, paramInt);
      GMTrace.i(13078041198592L, 97439);
      this.xpq = -1;
      this.xpr = -1;
      GMTrace.o(13078041198592L, 97439);
    }
    
    public final void az(float paramFloat)
    {
      GMTrace.i(13078309634048L, 97441);
      paramFloat = 1.0F - paramFloat;
      int j = DragSortListView.this.getFirstVisiblePosition();
      View localView = DragSortListView.this.getChildAt(this.jQO - j);
      Object localObject;
      int i;
      if (DragSortListView.o(DragSortListView.this))
      {
        float f1 = (float)(SystemClock.uptimeMillis() - this.mStartTime) / 1000.0F;
        if (f1 == 0.0F)
        {
          GMTrace.o(13078309634048L, 97441);
          return;
        }
        float f2 = DragSortListView.p(DragSortListView.this);
        int k = DragSortListView.this.getWidth();
        localObject = DragSortListView.this;
        float f3 = DragSortListView.p(DragSortListView.this);
        if (DragSortListView.p(DragSortListView.this) > 0.0F) {}
        for (i = 1;; i = -1)
        {
          DragSortListView.a((DragSortListView)localObject, i * f1 * k + f3);
          this.xpn += f2 * f1;
          DragSortListView.e(DragSortListView.this).x = ((int)this.xpn);
          if ((this.xpn >= k) || (this.xpn <= -k)) {
            break;
          }
          this.mStartTime = SystemClock.uptimeMillis();
          DragSortListView.g(DragSortListView.this);
          GMTrace.o(13078309634048L, 97441);
          return;
        }
      }
      if (localView != null)
      {
        if (this.xpq == -1)
        {
          this.xpq = DragSortListView.b(DragSortListView.this, this.jQO, localView);
          this.xpo = (localView.getHeight() - this.xpq);
        }
        i = Math.max((int)(this.xpo * paramFloat), 1);
        localObject = localView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = (i + this.xpq);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (this.xps != this.jQO)
      {
        localView = DragSortListView.this.getChildAt(this.xps - j);
        if (localView != null)
        {
          if (this.xpr == -1)
          {
            this.xpr = DragSortListView.b(DragSortListView.this, this.xps, localView);
            this.xpp = (localView.getHeight() - this.xpr);
          }
          i = Math.max((int)(paramFloat * this.xpp), 1);
          localObject = localView.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject).height = (i + this.xpr);
          localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
      }
      GMTrace.o(13078309634048L, 97441);
    }
    
    public final void onStart()
    {
      int i = -1;
      GMTrace.i(13078175416320L, 97440);
      this.xpq = -1;
      this.xpr = -1;
      this.jQO = DragSortListView.m(DragSortListView.this);
      this.xps = DragSortListView.n(DragSortListView.this);
      this.xpg = DragSortListView.i(DragSortListView.this);
      DragSortListView.b(DragSortListView.this, 1);
      this.xpn = DragSortListView.e(DragSortListView.this).x;
      if (DragSortListView.o(DragSortListView.this))
      {
        float f = DragSortListView.this.getWidth() * 2.0F;
        if (DragSortListView.p(DragSortListView.this) == 0.0F)
        {
          DragSortListView localDragSortListView = DragSortListView.this;
          if (this.xpn < 0.0F) {}
          for (;;)
          {
            DragSortListView.a(localDragSortListView, i * f);
            GMTrace.o(13078175416320L, 97440);
            return;
            i = 1;
          }
        }
        f *= 2.0F;
        if ((DragSortListView.p(DragSortListView.this) < 0.0F) && (DragSortListView.p(DragSortListView.this) > -f))
        {
          DragSortListView.a(DragSortListView.this, -f);
          GMTrace.o(13078175416320L, 97440);
          return;
        }
        if ((DragSortListView.p(DragSortListView.this) > 0.0F) && (DragSortListView.p(DragSortListView.this) < f)) {
          DragSortListView.a(DragSortListView.this, f);
        }
        GMTrace.o(13078175416320L, 97440);
        return;
      }
      DragSortListView.q(DragSortListView.this);
      GMTrace.o(13078175416320L, 97440);
    }
    
    public final void onStop()
    {
      GMTrace.i(13078443851776L, 97442);
      DragSortListView.r(DragSortListView.this);
      GMTrace.o(13078443851776L, 97442);
    }
  }
  
  public static abstract interface l
  {
    public abstract void remove(int paramInt);
  }
  
  private class m
    implements Runnable
  {
    boolean Lv;
    private float mAlpha;
    protected long mStartTime;
    private float xpt;
    private float xpu;
    private float xpv;
    private float xpw;
    private float xpx;
    
    public m(float paramFloat, int paramInt)
    {
      GMTrace.i(13070122352640L, 97380);
      this.mAlpha = 0.5F;
      this.xpt = paramInt;
      paramFloat = 1.0F / (this.mAlpha * 2.0F * (1.0F - this.mAlpha));
      this.xpx = paramFloat;
      this.xpu = paramFloat;
      this.xpv = (this.mAlpha / ((this.mAlpha - 1.0F) * 2.0F));
      this.xpw = (1.0F / (1.0F - this.mAlpha));
      GMTrace.o(13070122352640L, 97380);
    }
    
    public void az(float paramFloat)
    {
      GMTrace.i(13070525005824L, 97383);
      GMTrace.o(13070525005824L, 97383);
    }
    
    public void onStart()
    {
      GMTrace.i(13070390788096L, 97382);
      GMTrace.o(13070390788096L, 97382);
    }
    
    public void onStop()
    {
      GMTrace.i(13070659223552L, 97384);
      GMTrace.o(13070659223552L, 97384);
    }
    
    public void run()
    {
      GMTrace.i(13070793441280L, 97385);
      if (this.Lv)
      {
        GMTrace.o(13070793441280L, 97385);
        return;
      }
      float f1 = (float)(SystemClock.uptimeMillis() - this.mStartTime) / this.xpt;
      if (f1 >= 1.0F)
      {
        az(1.0F);
        onStop();
        GMTrace.o(13070793441280L, 97385);
        return;
      }
      if (f1 < this.mAlpha) {
        f1 *= this.xpu * f1;
      }
      for (;;)
      {
        az(f1);
        DragSortListView.this.post(this);
        GMTrace.o(13070793441280L, 97385);
        return;
        if (f1 < 1.0F - this.mAlpha)
        {
          float f2 = this.xpv;
          f1 = f1 * this.xpw + f2;
        }
        else
        {
          f1 = 1.0F - (f1 - 1.0F) * (this.xpx * (f1 - 1.0F));
        }
      }
    }
    
    public final void start()
    {
      GMTrace.i(13070256570368L, 97381);
      this.mStartTime = SystemClock.uptimeMillis();
      this.Lv = false;
      onStart();
      DragSortListView.this.post(this);
      GMTrace.o(13070256570368L, 97381);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\DragSortListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */